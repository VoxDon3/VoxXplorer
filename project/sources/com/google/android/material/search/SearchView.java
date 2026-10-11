package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.C0692b;
import ax.F6.e;
import ax.F6.x;
import ax.H6.g;
import ax.O6.i;
import ax.i.C2186b;
import ax.k0.AbstractC2357a;
import ax.k6.C2404e;
import ax.k6.C2405f;
import ax.k6.l;
import ax.p.C2748d;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, ax.H6.b {
    private static final int x = l.o;
    final ClippableRoundedCornerLayout a;
    final View b;
    final View c;
    final FrameLayout d;
    final MaterialToolbar e;
    final TextView f;
    final EditText g;
    final TouchObserverFrameLayout h;
    private final boolean i;
    private final ax.H6.c j;
    private final boolean k;
    private final ax.D6.a l;
    private final Set<b> m;
    private SearchBar n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final int s;
    private boolean t;
    private boolean u;
    private c v;
    private Map<View, Integer> w;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class a extends AbstractC2357a {
        public static final Parcelable.Creator<a> CREATOR = new C0559a();
        String d0;
        int e0;

        /* renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        class C0559a implements Parcelable.ClassLoaderCreator<a> {
            C0559a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d0);
            parcel.writeInt(this.e0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readString();
            this.e0 = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(SearchView searchView, c cVar, c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private boolean f() {
        return this.v.equals(c.HIDDEN) || this.v.equals(c.HIDING);
    }

    private Window getActivityWindow() {
        Activity a2 = C0692b.a(getContext());
        if (a2 == null) {
            return null;
        }
        return a2.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.n;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C2404e.A);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void h(c cVar, boolean z) {
        if (this.v.equals(cVar)) {
            return;
        }
        if (z) {
            k(cVar);
        }
        c cVar2 = this.v;
        this.v = cVar;
        Iterator it = new LinkedHashSet(this.m).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        j(cVar);
        SearchBar searchBar = this.n;
        if (searchBar == null || cVar != c.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    @SuppressLint({"InlinedApi"})
    private void i(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.a.getId()) != null) {
                    i((ViewGroup) childAt, z);
                } else if (z) {
                    this.w.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map<View, Integer> map = this.w;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.w.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void j(c cVar) {
        if (this.n == null || !this.k) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.j.b();
        } else if (cVar.equals(c.HIDDEN)) {
            this.j.d();
        }
    }

    private void k(c cVar) {
        if (cVar == c.SHOWN) {
            setModalForAccessibility(true);
        } else if (cVar == c.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void l() {
        ImageButton d = x.d(this.e);
        if (d == null) {
            return;
        }
        int i = this.a.getVisibility() == 0 ? 1 : 0;
        Drawable q = ax.U.a.q(d.getDrawable());
        if (q instanceof C2748d) {
            ((C2748d) q).b(i);
        }
        if (q instanceof e) {
            ((e) q).a(i);
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ax.D6.a aVar = this.l;
        if (aVar == null || this.b == null) {
            return;
        }
        this.b.setBackgroundColor(aVar.c(this.s, f));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            e(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.d, false));
        }
    }

    private void setUpStatusBarSpacer(int i) {
        if (this.c.getLayoutParams().height != i) {
            this.c.getLayoutParams().height = i;
            this.c.requestLayout();
        }
    }

    @Override // ax.H6.b
    public void a(C2186b c2186b) {
        SearchBar searchBar;
        if (f() || (searchBar = this.n) == null) {
            return;
        }
        if (searchBar != null) {
            searchBar.setPlaceholderText(this.g.getText().toString());
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.i) {
            this.h.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // ax.H6.b
    public void b(C2186b c2186b) {
        if (!f() && this.n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // ax.H6.b
    public void c() {
        if (!f()) {
            throw null;
        }
    }

    @Override // ax.H6.b
    public void d() {
        if (!f() && this.n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    public void e(View view) {
        this.d.addView(view);
        this.d.setVisibility(0);
    }

    public boolean g() {
        return this.n != null;
    }

    g getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.v;
    }

    protected int getDefaultNavigationIconResource() {
        return C2405f.b;
    }

    public EditText getEditText() {
        return this.g;
    }

    public CharSequence getHint() {
        return this.g.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f;
    }

    public CharSequence getSearchPrefixText() {
        return this.f.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.o;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.g.getText();
    }

    public Toolbar getToolbar() {
        return this.e;
    }

    public void m() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.o = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
        c currentTransitionState = getCurrentTransitionState();
        k(currentTransitionState);
        j(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.j.d();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.d0);
        setVisible(aVar.e0 == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.d0 = text == null ? null : text.toString();
        aVar.e0 = this.a.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.p = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.r = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.q = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.w = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z);
        if (z) {
            return;
        }
        this.w = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.e.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f.setText(charSequence);
        this.f.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.u = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.e.setTouchscreenBlocksFocus(z);
    }

    void setTransitionState(c cVar) {
        h(cVar, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.t = z;
    }

    public void setVisible(boolean z) {
        boolean z2 = this.a.getVisibility() == 0;
        this.a.setVisibility(z ? 0 : 8);
        l();
        h(z ? c.SHOWN : c.HIDDEN, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.n = searchBar;
        throw null;
    }

    public void setHint(int i) {
        this.g.setHint(i);
    }

    public void setText(int i) {
        this.g.setText(i);
    }
}
