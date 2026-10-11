/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
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
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.e;
import ax.F6.x;
import ax.H6.g;
import ax.O6.i;
import ax.k6.f;
import ax.k6.l;
import ax.p.d;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SearchView
extends FrameLayout
implements CoordinatorLayout.b,
ax.H6.b {
    private static final int x = ax.k6.l.o;
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

    private boolean f() {
        return ((Object)((Object)this.v)).equals((Object)com.google.android.material.search.SearchView$c.c0) || ((Object)((Object)this.v)).equals((Object)com.google.android.material.search.SearchView$c.q);
        {
        }
    }

    private Window getActivityWindow() {
        Activity activity = ax.F6.b.a(this.getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.n;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return this.getResources().getDimension(ax.k6.e.A);
    }

    private int getStatusBarHeight() {
        int n8 = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (n8 > 0) {
            return this.getResources().getDimensionPixelSize(n8);
        }
        return 0;
    }

    private void h(c c8, boolean bl) {
        if (!((Object)((Object)this.v)).equals((Object)c8)) {
            if (bl) {
                this.k(c8);
            }
            c c9 = this.v;
            this.v = c8;
            Object object = new LinkedHashSet<b>(this.m).iterator();
            while (object.hasNext()) {
                ((b)object.next()).a(this, c9, c8);
            }
            this.j(c8);
            object = this.n;
            if (object != null && c8 == com.google.android.material.search.SearchView$c.c0) {
                object.sendAccessibilityEvent(8);
            }
        }
    }

    @SuppressLint(value={"InlinedApi"})
    private void i(ViewGroup viewGroup, boolean bl) {
        for (int i8 = 0; i8 < viewGroup.getChildCount(); ++i8) {
            View view = viewGroup.getChildAt(i8);
            if (view == this) continue;
            if (view.findViewById(this.a.getId()) != null) {
                this.i((ViewGroup)view, bl);
                continue;
            }
            if (!bl) {
                Map<View, Integer> map = this.w;
                if (map == null || !map.containsKey(view)) continue;
                view.setImportantForAccessibility(this.w.get(view).intValue());
                continue;
            }
            this.w.put(view, view.getImportantForAccessibility());
            view.setImportantForAccessibility(4);
        }
    }

    private void j(c c8) {
        if (this.n != null && this.k) {
            if (((Object)((Object)c8)).equals((Object)com.google.android.material.search.SearchView$c.e0)) {
                this.j.b();
                return;
            }
            if (((Object)((Object)c8)).equals((Object)com.google.android.material.search.SearchView$c.c0)) {
                this.j.d();
            }
        }
    }

    private void k(c c8) {
        if (c8 == com.google.android.material.search.SearchView$c.e0) {
            this.setModalForAccessibility(true);
            return;
        }
        if (c8 == com.google.android.material.search.SearchView$c.c0) {
            this.setModalForAccessibility(false);
        }
    }

    private void l() {
        Object object = ax.F6.x.d(this.e);
        if (object != null) {
            boolean bl = this.a.getVisibility() == 0;
            if ((object = ax.U.a.q(object.getDrawable())) instanceof d) {
                ((d)((Object)object)).b((float)bl);
            }
            if (object instanceof e) {
                ((e)((Object)object)).a((float)bl);
            }
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean bl) {
        View view = this.c;
        int n8 = bl ? 0 : 8;
        view.setVisibility(n8);
    }

    private void setUpBackgroundViewElevationOverlay(float f8) {
        ax.D6.a a8 = this.l;
        if (a8 != null && this.b != null) {
            int n8 = a8.c(this.s, f8);
            this.b.setBackgroundColor(n8);
        }
    }

    private void setUpHeaderLayout(int n8) {
        if (n8 != -1) {
            this.e(LayoutInflater.from((Context)this.getContext()).inflate(n8, (ViewGroup)this.d, false));
        }
    }

    private void setUpStatusBarSpacer(int n8) {
        if (this.c.getLayoutParams().height != n8) {
            this.c.getLayoutParams().height = n8;
            this.c.requestLayout();
        }
    }

    @Override
    public void a(ax.i.b object) {
        if (!this.f() && (object = this.n) != null) {
            if (object != null) {
                ((SearchBar)object).setPlaceholderText(this.g.getText().toString());
            }
            throw null;
        }
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (this.i) {
            this.h.addView(view, n8, layoutParams);
            return;
        }
        super.addView(view, n8, layoutParams);
    }

    @Override
    public void b(ax.i.b b8) {
        if (!this.f() && this.n != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override
    public void c() {
        if (this.f()) {
            return;
        }
        throw null;
    }

    @Override
    public void d() {
        if (!this.f() && this.n != null && Build.VERSION.SDK_INT >= 34) {
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

    @Override
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.v;
    }

    protected int getDefaultNavigationIconResource() {
        return ax.k6.f.b;
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

    @SuppressLint(value={"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.o;
    }

    @SuppressLint(value={"KotlinPropertyAccess"})
    public Editable getText() {
        return this.g.getText();
    }

    public Toolbar getToolbar() {
        return this.e;
    }

    public void m() {
        Window window = this.getActivityWindow();
        if (window != null) {
            this.o = window.getAttributes().softInputMode;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.e((View)this);
        c c8 = this.getCurrentTransitionState();
        this.k(c8);
        this.j(c8);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setModalForAccessibility(false);
        this.j.d();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.m();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (a)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.setText(parcelable.d0);
        boolean bl = parcelable.e0 == 0;
        this.setVisible(bl);
    }

    protected Parcelable onSaveInstanceState() {
        a a8 = new a(super.onSaveInstanceState());
        Object object = this.getText();
        object = object == null ? null : object.toString();
        a8.d0 = object;
        a8.e0 = this.a.getVisibility();
        return a8;
    }

    public void setAnimatedNavigationIcon(boolean bl) {
        this.p = bl;
    }

    public void setAutoShowKeyboard(boolean bl) {
        this.r = bl;
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        this.setUpBackgroundViewElevationOverlay(f8);
    }

    public void setHint(int n8) {
        this.g.setHint(n8);
    }

    public void setHint(CharSequence charSequence) {
        this.g.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean bl) {
        this.q = bl;
    }

    public void setModalForAccessibility(boolean bl) {
        ViewGroup viewGroup = (ViewGroup)this.getRootView();
        if (bl) {
            this.w = new HashMap<View, Integer>(viewGroup.getChildCount());
        }
        this.i(viewGroup, bl);
        if (!bl) {
            this.w = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h h8) {
        this.e.setOnMenuItemClickListener(h8);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f.setText(charSequence);
        TextView textView = this.f;
        int n8 = TextUtils.isEmpty((CharSequence)charSequence) ? 8 : 0;
        textView.setVisibility(n8);
    }

    public void setStatusBarSpacerEnabled(boolean bl) {
        this.u = true;
        this.setStatusBarSpacerEnabledInternal(bl);
    }

    public void setText(int n8) {
        this.g.setText(n8);
    }

    @SuppressLint(value={"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean bl) {
        this.e.setTouchscreenBlocksFocus(bl);
    }

    void setTransitionState(c c8) {
        this.h(c8, true);
    }

    public void setUseWindowInsetsController(boolean bl) {
        this.t = bl;
    }

    public void setVisible(boolean bl) {
        int n8 = this.a.getVisibility();
        boolean bl2 = true;
        boolean bl3 = n8 == 0;
        Object object = this.a;
        n8 = bl ? 0 : 8;
        object.setVisibility(n8);
        this.l();
        object = bl ? com.google.android.material.search.SearchView$c.e0 : com.google.android.material.search.SearchView$c.c0;
        bl = bl3 != bl ? bl2 : false;
        this.h((c)((Object)object), bl);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.n = searchBar;
        throw null;
    }

    public static class Behavior
    extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean I(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (!searchView.g() && view instanceof SearchBar) {
                searchView.setupWithSearchBar((SearchBar)view);
            }
            return false;
        }
    }

    static class a
    extends ax.k0.a {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.ClassLoaderCreator<a>(){

            public a a(Parcel parcel) {
                return new a(parcel);
            }

            public a b(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public a[] c(int n8) {
                return new a[n8];
            }
        };
        String d0;
        int e0;

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readString();
            this.e0 = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeString(this.d0);
            parcel.writeInt(this.e0);
        }
    }

    public static interface b {
        public void a(SearchView var1, c var2, c var3);
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = new c();
            f0 = com.google.android.material.search.SearchView$c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0, e0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }
}

