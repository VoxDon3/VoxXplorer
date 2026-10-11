package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.x;
import ax.O6.h;
import ax.O6.i;
import ax.k0.AbstractC2357a;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.C2405f;
import ax.k6.l;
import ax.z6.C3555a;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    private static final int s0 = l.n;
    private final TextView U;
    private final TextView V;
    private final FrameLayout W;
    private boolean a0;
    private final ColorStateList b0;
    private final boolean c0;
    private final boolean d0;
    private final Drawable e0;
    private final boolean f0;
    private final boolean g0;
    private View h0;
    private Integer i0;
    private Drawable j0;
    private int k0;
    private boolean l0;
    private h m0;
    private boolean n0;
    private int o0;
    private ActionMenuView p0;
    private ImageButton q0;
    private final AppBarLayout.f r0;

    static class a extends AbstractC2357a {
        public static final Parcelable.Creator<a> CREATOR = new C0558a();
        String d0;

        /* renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        class C0558a implements Parcelable.ClassLoaderCreator<a> {
            C0558a() {
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
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void T() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.b0 == null) {
            return;
        }
        appBarLayoutParentIfExists.c(this.r0);
    }

    private int U(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    private ActionMenuView V() {
        if (this.p0 == null) {
            this.p0 = x.a(this);
        }
        return this.p0;
    }

    private ImageButton W() {
        if (this.q0 == null) {
            this.q0 = x.d(this);
        }
        return this.q0;
    }

    private void X(View view, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    private void Y() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.W.getMeasuredWidth() / 2);
        int measuredWidth2 = this.W.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.W.getMeasuredHeight() / 2);
        int measuredHeight2 = this.W.getMeasuredHeight() + measuredHeight;
        boolean z = getLayoutDirection() == 1;
        ActionMenuView V = V();
        ImageButton W = W();
        int measuredWidth3 = (this.W.getMeasuredWidth() / 2) - (this.U.getMeasuredWidth() / 2);
        int measuredWidth4 = this.U.getMeasuredWidth() + measuredWidth3;
        int i = measuredWidth3 + measuredWidth;
        int i2 = measuredWidth4 + measuredWidth;
        ActionMenuView actionMenuView = z ? V : W;
        if (z) {
            V = W;
        }
        int max = actionMenuView != null ? Math.max(actionMenuView.getRight() - i, 0) : 0;
        int i3 = i + max;
        int i4 = i2 + max;
        int max2 = V != null ? Math.max(i4 - V.getLeft(), 0) : 0;
        int i5 = i3 - max2;
        int i6 = i4 - max2;
        int max3 = ((max - max2) + Math.max(Math.max(getPaddingLeft() - i5, getContentInsetLeft() - i5), 0)) - Math.max(Math.max(i6 - (getMeasuredWidth() - getPaddingRight()), i6 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.W.layout(measuredWidth + max3, measuredHeight, measuredWidth2 + max3, measuredHeight2);
    }

    private void Z(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        X(view, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    private Drawable a0(Drawable drawable) {
        int d;
        if (!this.f0 || drawable == null) {
            return drawable;
        }
        Integer num = this.i0;
        if (num != null) {
            d = num.intValue();
        } else {
            d = C3555a.d(this, drawable == this.e0 ? C2402c.g : C2402c.f);
        }
        Drawable r = ax.U.a.r(drawable.mutate());
        r.setTint(d);
        return r;
    }

    private void b0(int i, int i2) {
        View view = this.h0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void c0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.v(this.r0);
        }
    }

    private void d0() {
        if (this.d0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C2404e.y);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = U(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = U(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = U(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = U(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void e0() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton d = x.d(this);
        int width = (d == null || !d.isClickable()) ? 0 : z ? getWidth() - d.getLeft() : d.getRight();
        ActionMenuView a2 = x.a(this);
        int right = a2 != null ? z ? a2.getRight() : getWidth() - a2.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    private void f0() {
        if (getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) getLayoutParams();
            if (this.l0) {
                if (dVar.c() == 0) {
                    dVar.g(53);
                }
            } else if (dVar.c() == 53) {
                dVar.g(0);
            }
        }
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton d = x.d(this);
        if (d == null) {
            return;
        }
        d.setClickable(!z);
        d.setFocusable(!z);
        Drawable background = d.getBackground();
        if (background != null) {
            this.j0 = background;
        }
        d.setBackgroundDrawable(z ? null : this.j0);
        e0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.c0 && this.h0 == null && !(view instanceof ActionMenuView)) {
            this.h0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.h0;
    }

    float getCompatElevation() {
        h hVar = this.m0;
        return hVar != null ? hVar.A() : getElevation();
    }

    public float getCornerSize() {
        return this.m0.N();
    }

    protected int getDefaultMarginVerticalResource() {
        return C2404e.z;
    }

    protected int getDefaultNavigationIconResource() {
        return C2405f.d;
    }

    public CharSequence getHint() {
        return this.U.getHint();
    }

    public int getMaxWidth() {
        return this.o0;
    }

    int getMenuResId() {
        return this.k0;
    }

    TextView getPlaceholderTextView() {
        return this.V;
    }

    public int getStrokeColor() {
        return this.m0.J().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.m0.L();
    }

    public CharSequence getText() {
        return this.U.getText();
    }

    public boolean getTextCentered() {
        return this.n0;
    }

    public TextView getTextView() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f(this, this.m0);
        d0();
        f0();
        if (this.a0) {
            T();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.h0;
        if (view != null) {
            Z(view);
        }
        e0();
        if (this.U == null || !this.n0) {
            return;
        }
        Y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.o0;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.o0, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        b0(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.d0);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.d0 = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.h0;
        if (view2 != null) {
            removeView(view2);
            this.h0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.l0 = z;
        f0();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h hVar = this.m0;
        if (hVar != null) {
            hVar.f0(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.a0 = z;
        if (z) {
            T();
        } else {
            c0();
        }
    }

    public void setMaxWidth(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(a0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.g0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        throw null;
    }

    void setPlaceholderText(String str) {
        this.V.setText(str);
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.m0.o0(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.m0.p0(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.U.setText(charSequence);
        this.V.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.n0 = z;
        TextView textView = this.U;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            this.U.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.U.setGravity(0);
        }
        this.U.setLayoutParams(layoutParams);
        this.V.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i) {
        super.x(i);
        this.k0 = i;
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean h;

        public ScrollingViewBehavior() {
            this.h = false;
        }

        private void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
            } else {
                appBarLayout.setTargetElevation(0.0f);
            }
        }

        @Override // com.google.android.material.appbar.b
        protected boolean T() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean l = super.l(coordinatorLayout, view, view2);
            if (!this.h && (view2 instanceof AppBarLayout)) {
                this.h = true;
                Y((AppBarLayout) view2);
            }
            return l;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = false;
        }
    }

    public void setHint(int i) {
        this.U.setHint(i);
    }

    public void setText(int i) {
        this.U.setText(i);
        this.V.setText(i);
    }
}
