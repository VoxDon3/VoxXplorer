/*
 * Decompiled with CFR 0.152.
 */
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
import ax.d0.i;
import ax.d0.j;
import ax.k6.c;
import ax.k6.e;
import ax.k6.f;
import ax.k6.l;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar
extends Toolbar {
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

    private void T() {
        AppBarLayout appBarLayout = this.getAppBarLayoutParentIfExists();
        if (appBarLayout != null && this.b0 != null) {
            appBarLayout.c(this.r0);
        }
    }

    private int U(int n8, int n9) {
        if (n8 == 0) {
            return n9;
        }
        return n8;
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

    private void X(View view, int n8, int n9, int n10, int n11) {
        if (this.getLayoutDirection() == 1) {
            view.layout(this.getMeasuredWidth() - n10, n9, this.getMeasuredWidth() - n8, n11);
            return;
        }
        view.layout(n8, n9, n10, n11);
    }

    private void Y() {
        int n8 = this.getMeasuredWidth() / 2 - this.W.getMeasuredWidth() / 2;
        int n9 = this.W.getMeasuredWidth();
        int n10 = this.getMeasuredHeight() / 2 - this.W.getMeasuredHeight() / 2;
        int n11 = this.W.getMeasuredHeight();
        int n12 = this.getLayoutDirection();
        int n13 = 1;
        if (n12 != 1) {
            n13 = 0;
        }
        ActionMenuView actionMenuView = this.V();
        ImageButton imageButton = this.W();
        n12 = this.W.getMeasuredWidth() / 2 - this.U.getMeasuredWidth() / 2;
        int n14 = this.U.getMeasuredWidth();
        int n15 = n12 + n8;
        ActionMenuView actionMenuView2 = n13 != 0 ? actionMenuView : imageButton;
        if (n13 != 0) {
            actionMenuView = imageButton;
        }
        n13 = actionMenuView2 != null ? Math.max(actionMenuView2.getRight() - n15, 0) : 0;
        n14 = n14 + n12 + n8 + n13;
        n12 = actionMenuView != null ? Math.max(n14 - actionMenuView.getLeft(), 0) : 0;
        n15 = n15 + n13 - n12;
        n14 -= n12;
        n15 = Math.max(this.getPaddingLeft() - n15, this.getContentInsetLeft() - n15);
        n14 = Math.max(n14 - (this.getMeasuredWidth() - this.getPaddingRight()), n14 - (this.getMeasuredWidth() - this.getContentInsetRight()));
        n13 = n13 - n12 + Math.max(n15, 0) - Math.max(n14, 0);
        this.W.layout(n8 + n13, n10, n9 + n8 + n13, n11 + n10);
    }

    private void Z(View view) {
        if (view == null) {
            return;
        }
        int n8 = view.getMeasuredWidth();
        int n9 = this.getMeasuredWidth() / 2 - n8 / 2;
        int n10 = view.getMeasuredHeight();
        int n11 = this.getMeasuredHeight() / 2 - n10 / 2;
        this.X(view, n9, n11, n9 + n8, n11 + n10);
    }

    private Drawable a0(Drawable drawable) {
        Object object = drawable;
        if (this.f0) {
            if (drawable == null) {
                object = drawable;
            } else {
                int n8;
                object = this.i0;
                if (object != null) {
                    n8 = (Integer)object;
                } else {
                    n8 = drawable == this.e0 ? c.g : c.f;
                    n8 = ax.z6.a.d((View)this, n8);
                }
                object = ax.U.a.r(drawable.mutate());
                object.setTint(n8);
            }
        }
        return object;
    }

    private void b0(int n8, int n9) {
        View view = this.h0;
        if (view != null) {
            view.measure(n8, n9);
        }
    }

    private void c0() {
        AppBarLayout appBarLayout = this.getAppBarLayoutParentIfExists();
        if (appBarLayout != null) {
            appBarLayout.v(this.r0);
        }
    }

    private void d0() {
        if (this.d0 && this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            Resources resources = this.getResources();
            int n8 = resources.getDimensionPixelSize(e.y);
            int n9 = resources.getDimensionPixelSize(this.getDefaultMarginVerticalResource());
            resources = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
            resources.leftMargin = this.U(resources.leftMargin, n8);
            resources.topMargin = this.U(resources.topMargin, n9);
            resources.rightMargin = this.U(resources.rightMargin, n8);
            resources.bottomMargin = this.U(resources.bottomMargin, n9);
        }
    }

    private void e0() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int n8 = this.getLayoutDirection();
        boolean bl = true;
        int n9 = 0;
        if (n8 != 1) {
            bl = false;
        }
        Object object = x.d(this);
        n8 = object != null && object.isClickable() ? (bl ? this.getWidth() - object.getLeft() : object.getRight()) : 0;
        object = x.a(this);
        if (object != null) {
            n9 = bl ? object.getRight() : this.getWidth() - object.getLeft();
        }
        int n10 = bl ? n9 : n8;
        float f8 = -n10;
        if (!bl) {
            n8 = n9;
        }
        ax.M6.a.a(this, f8, 0.0f, -n8, 0.0f);
    }

    private void f0() {
        if (this.getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d d8 = (AppBarLayout.d)this.getLayoutParams();
            if (this.l0) {
                if (d8.c() == 0) {
                    d8.g(53);
                    return;
                }
            } else if (d8.c() == 53) {
                d8.g(0);
            }
        }
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (!(viewParent instanceof AppBarLayout)) continue;
            return (AppBarLayout)viewParent;
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean bl) {
        ImageButton imageButton = x.d(this);
        if (imageButton == null) {
            return;
        }
        imageButton.setClickable(bl ^ true);
        imageButton.setFocusable(bl ^ true);
        Object object = imageButton.getBackground();
        if (object != null) {
            this.j0 = object;
        }
        object = bl ? null : this.j0;
        imageButton.setBackgroundDrawable(object);
        this.e0();
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (this.c0 && this.h0 == null && !(view instanceof ActionMenuView)) {
            this.h0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, n8, layoutParams);
    }

    public View getCenterView() {
        return this.h0;
    }

    float getCompatElevation() {
        h h8 = this.m0;
        if (h8 != null) {
            return h8.A();
        }
        return this.getElevation();
    }

    public float getCornerSize() {
        return this.m0.N();
    }

    protected int getDefaultMarginVerticalResource() {
        return e.z;
    }

    protected int getDefaultNavigationIconResource() {
        return f.d;
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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.f((View)this, this.m0);
        this.d0();
        this.f0();
        if (this.a0) {
            this.T();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c0();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(this.isEnabled());
        CharSequence charSequence = this.getText();
        boolean bl = TextUtils.isEmpty((CharSequence)charSequence);
        if (Build.VERSION.SDK_INT >= 26) {
            i.a(accessibilityNodeInfo, this.getHint());
            j.a(accessibilityNodeInfo, bl);
        }
        if (bl) {
            charSequence = this.getHint();
        }
        accessibilityNodeInfo.setText(charSequence);
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        View view = this.h0;
        if (view != null) {
            this.Z(view);
        }
        this.e0();
        if (this.U != null && this.n0) {
            this.Y();
        }
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        int n10 = this.o0;
        int n11 = n8;
        if (n10 >= 0) {
            n11 = n8;
            if (n10 < View.MeasureSpec.getSize((int)n8)) {
                n8 = View.MeasureSpec.getMode((int)n8);
                n11 = View.MeasureSpec.makeMeasureSpec((int)this.o0, (int)n8);
            }
        }
        super.onMeasure(n11, n9);
        this.b0(n11, n9);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (a)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.setText(parcelable.d0);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        a a8 = new a(super.onSaveInstanceState());
        CharSequence charSequence = this.getText();
        charSequence = charSequence == null ? null : charSequence.toString();
        a8.d0 = charSequence;
        return a8;
    }

    public void setCenterView(View view) {
        View view2 = this.h0;
        if (view2 != null) {
            this.removeView(view2);
            this.h0 = null;
        }
        if (view != null) {
            this.addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean bl) {
        this.l0 = bl;
        this.f0();
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        h h8 = this.m0;
        if (h8 != null) {
            h8.f0(f8);
        }
    }

    public void setHint(int n8) {
        this.U.setHint(n8);
    }

    public void setHint(CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean bl) {
        this.a0 = bl;
        if (bl) {
            this.T();
            return;
        }
        this.c0();
    }

    public void setMaxWidth(int n8) {
        if (this.o0 != n8) {
            this.o0 = n8;
            this.requestLayout();
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(this.a0(drawable));
    }

    @Override
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.g0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        boolean bl = onClickListener == null;
        this.setNavigationIconDecorative(bl);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean bl) {
        throw null;
    }

    void setPlaceholderText(String string) {
        this.V.setText((CharSequence)string);
    }

    public void setStrokeColor(int n8) {
        if (this.getStrokeColor() != n8) {
            this.m0.o0(ColorStateList.valueOf((int)n8));
        }
    }

    public void setStrokeWidth(float f8) {
        if (this.getStrokeWidth() != f8) {
            this.m0.p0(f8);
        }
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(int n8) {
        this.U.setText(n8);
        this.V.setText(n8);
    }

    public void setText(CharSequence charSequence) {
        this.U.setText(charSequence);
        this.V.setText(charSequence);
    }

    public void setTextCentered(boolean bl) {
        this.n0 = bl;
        TextView textView = this.U;
        if (textView == null) {
            return;
        }
        textView = (FrameLayout.LayoutParams)textView.getLayoutParams();
        if (bl) {
            textView.gravity = 1;
            this.U.setGravity(1);
        } else {
            textView.gravity = 0;
            this.U.setGravity(0);
        }
        this.U.setLayoutParams((ViewGroup.LayoutParams)textView);
        this.V.setLayoutParams((ViewGroup.LayoutParams)textView);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
    }

    @Override
    public void x(int n8) {
        super.x(n8);
        this.k0 = n8;
    }

    public static class ScrollingViewBehavior
    extends AppBarLayout.ScrollingViewBehavior {
        private boolean h = false;

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
                return;
            }
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override
        protected boolean T() {
            return true;
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean bl = super.l(coordinatorLayout, view, view2);
            if (!this.h && view2 instanceof AppBarLayout) {
                this.h = true;
                this.Y((AppBarLayout)view2);
            }
            return bl;
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

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeString(this.d0);
        }
    }
}

