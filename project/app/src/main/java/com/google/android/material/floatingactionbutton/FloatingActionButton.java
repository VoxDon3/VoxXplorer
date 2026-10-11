/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.E6.a;
import ax.F6.A;
import ax.O6.l;
import ax.O6.o;
import ax.b0.g;
import ax.c0.d0;
import ax.k6.e;
import ax.k6.m;
import ax.l6.h;
import ax.l6.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import java.util.List;

public class FloatingActionButton
extends A
implements a,
o,
CoordinatorLayout.b {
    private static final int p = ax.k6.l.i;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private ColorStateList f;
    private int g;
    private int h;
    private int i;
    private int j;
    boolean k;
    final Rect l;
    private final Rect m;
    private final q n;
    private com.google.android.material.floatingactionbutton.b o;

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.o == null) {
            this.o = new com.google.android.material.floatingactionbutton.b(this, new c(this));
        }
        return this.o;
    }

    private int i(int n8) {
        int n9 = this.h;
        if (n9 != 0) {
            return n9;
        }
        Resources resources = this.getResources();
        if (n8 != -1) {
            if (n8 != 1) {
                return resources.getDimensionPixelSize(ax.k6.e.c);
            }
            return resources.getDimensionPixelSize(ax.k6.e.b);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return this.i(1);
        }
        return this.i(0);
    }

    private void j(Rect rect) {
        this.h(rect);
        int n8 = -this.o.v();
        rect.inset(n8, n8);
    }

    private void o(Rect rect) {
        int n8 = rect.left;
        Rect rect2 = this.l;
        rect.left = n8 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void p() {
        Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            ax.U.a.c(drawable);
            return;
        }
        int n8 = colorStateList.getColorForState(this.getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        colorStateList = mode;
        if (mode == null) {
            colorStateList = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter((ColorFilter)androidx.appcompat.widget.k.e(n8, (PorterDuff.Mode)colorStateList));
    }

    private b.f s(b b8) {
        if (b8 == null) {
            return null;
        }
        return new b.f(){
            final b a;
            final FloatingActionButton b;
            {
                this.b = floatingActionButton;
                this.a = b8;
            }

            @Override
            public void a() {
                this.a.b(this.b);
            }

            @Override
            public void b() {
                this.a.a(this.b);
            }
        };
    }

    @Override
    public boolean a() {
        throw null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (Build.VERSION.SDK_INT == 21) {
            this.getImpl().D();
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        this.getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        this.getImpl().f(animatorListener);
    }

    public void g(k<? extends FloatingActionButton> k8) {
        this.getImpl().g(new d<FloatingActionButton>(this, k8));
    }

    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return this.getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return this.getImpl().s();
    }

    public Drawable getContentBackground() {
        return this.getImpl().m();
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return this.getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public l getShapeAppearanceModel() {
        return ax.b0.g.g(this.getImpl().t());
    }

    public h getShowMotionSpec() {
        return this.getImpl().u();
    }

    public int getSize() {
        return this.g;
    }

    int getSizeDimension() {
        return this.i(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public void h(Rect rect) {
        rect.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        this.o(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public void k(b b8) {
        this.l(b8, true);
    }

    void l(b b8, boolean bl) {
        this.getImpl().w(this.s(b8), bl);
    }

    public boolean m() {
        return this.getImpl().y();
    }

    public boolean n() {
        return this.getImpl().z();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getImpl().A();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getImpl().C();
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = this.getSizeDimension();
        this.i = (n10 - this.j) / 2;
        this.getImpl().Z();
        n8 = Math.min(View.resolveSize((int)n10, (int)n8), View.resolveSize((int)n10, (int)n9));
        Rect rect = this.l;
        this.setMeasuredDimension(rect.left + n8 + rect.right, n8 + rect.top + rect.bottom);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ax.R6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (ax.R6.a)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        parcelable = ax.b0.g.g(parcelable.d0.get("expandableWidgetHelper"));
        throw null;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable parcelable2 = parcelable = super.onSaveInstanceState();
        if (parcelable == null) {
            parcelable2 = new Bundle();
        }
        new ax.R6.a(parcelable2);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j(this.m);
            if (!this.m.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q(b b8) {
        this.r(b8, true);
    }

    void r(b b8, boolean bl) {
        this.getImpl().X(this.s(b8), bl);
    }

    public void setBackgroundColor(int n8) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int n8) {
        Log.i((String)"FloatingActionButton", (String)"Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            this.getImpl().I(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            this.getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f8) {
        this.getImpl().K(f8);
    }

    public void setCompatElevationResource(int n8) {
        this.setCompatElevation(this.getResources().getDimension(n8));
    }

    public void setCompatHoveredFocusedTranslationZ(float f8) {
        this.getImpl().N(f8);
    }

    public void setCompatHoveredFocusedTranslationZResource(int n8) {
        this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(n8));
    }

    public void setCompatPressedTranslationZ(float f8) {
        this.getImpl().Q(f8);
    }

    public void setCompatPressedTranslationZResource(int n8) {
        this.setCompatPressedTranslationZ(this.getResources().getDimension(n8));
    }

    public void setCustomSize(int n8) {
        if (n8 >= 0) {
            if (n8 != this.h) {
                this.h = n8;
                this.requestLayout();
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        this.getImpl().a0(f8);
    }

    public void setEnsureMinTouchTargetSize(boolean bl) {
        if (bl != this.getImpl().o()) {
            this.getImpl().L(bl);
            this.requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int n8) {
        throw null;
    }

    public void setHideMotionSpec(h h8) {
        this.getImpl().M(h8);
    }

    public void setHideMotionSpecResource(int n8) {
        this.setHideMotionSpec(ax.l6.h.c(this.getContext(), n8));
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            this.getImpl().Y();
            if (this.d != null) {
                this.p();
            }
        }
    }

    public void setImageResource(int n8) {
        this.n.i(n8);
        this.p();
    }

    public void setMaxImageSize(int n8) {
        this.j = n8;
        this.getImpl().P(n8);
    }

    public void setRippleColor(int n8) {
        this.setRippleColor(ColorStateList.valueOf((int)n8));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            this.getImpl().R(this.f);
        }
    }

    public void setScaleX(float f8) {
        super.setScaleX(f8);
        this.getImpl().G();
    }

    public void setScaleY(float f8) {
        super.setScaleY(f8);
        this.getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean bl) {
        this.getImpl().S(bl);
    }

    @Override
    public void setShapeAppearanceModel(l l8) {
        this.getImpl().T(l8);
    }

    public void setShowMotionSpec(h h8) {
        this.getImpl().U(h8);
    }

    public void setShowMotionSpecResource(int n8) {
        this.setShowMotionSpec(ax.l6.h.c(this.getContext(), n8));
    }

    public void setSize(int n8) {
        this.h = 0;
        if (n8 != this.g) {
            this.g = n8;
            this.requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        this.setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        this.setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            this.p();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            this.p();
        }
    }

    public void setTranslationX(float f8) {
        super.setTranslationX(f8);
        this.getImpl().H();
    }

    public void setTranslationY(float f8) {
        super.setTranslationY(f8);
        this.getImpl().H();
    }

    public void setTranslationZ(float f8) {
        super.setTranslationZ(f8);
        this.getImpl().H();
    }

    public void setUseCompatPadding(boolean bl) {
        if (this.k != bl) {
            this.k = bl;
            this.getImpl().B();
        }
    }

    @Override
    public void setVisibility(int n8) {
        super.setVisibility(n8);
    }

    protected static class BaseBehavior<T extends FloatingActionButton>
    extends CoordinatorLayout.c<T> {
        private Rect a;
        private b b;
        private boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, ax.k6.m.O1);
            this.c = context.getBoolean(ax.k6.m.P1, true);
            context.recycle();
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f f8 = (CoordinatorLayout.f)floatingActionButton.getLayoutParams();
            if (!this.c) {
                return true;
            }
            if (f8.e() != view.getId()) {
                return true;
            }
            return floatingActionButton.getUserSetVisibility() != 0;
        }

        private static boolean K(View view) {
            if ((view = view.getLayoutParams()) instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f)view).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f f8 = (CoordinatorLayout.f)floatingActionButton.getLayoutParams();
                int n8 = floatingActionButton.getRight();
                int n9 = coordinatorLayout.getWidth();
                int n10 = f8.rightMargin;
                int n11 = 0;
                n8 = n8 >= n9 - n10 ? rect.right : (floatingActionButton.getLeft() <= f8.leftMargin ? -rect.left : 0);
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - f8.bottomMargin) {
                    n11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= f8.topMargin) {
                    n11 = -rect.top;
                }
                if (n11 != 0) {
                    d0.W((View)floatingActionButton, n11);
                }
                if (n8 != 0) {
                    d0.V((View)floatingActionButton, n8);
                }
            }
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (this.J((View)appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ax.F6.c.a(coordinatorLayout, (View)appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.l(this.b, false);
            } else {
                floatingActionButton.r(this.b, false);
            }
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (this.J(view, floatingActionButton)) {
                return false;
            }
            CoordinatorLayout.f f8 = (CoordinatorLayout.f)floatingActionButton.getLayoutParams();
            if (view.getTop() < floatingActionButton.getHeight() / 2 + f8.topMargin) {
                floatingActionButton.l(this.b, false);
            } else {
                floatingActionButton.r(this.b, false);
            }
            return true;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            coordinatorLayout = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + ((Rect)coordinatorLayout).left, floatingActionButton.getTop() + ((Rect)coordinatorLayout).top, floatingActionButton.getRight() - ((Rect)coordinatorLayout).right, floatingActionButton.getBottom() - ((Rect)coordinatorLayout).bottom);
            return true;
        }

        public boolean M(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                this.O(coordinatorLayout, (AppBarLayout)view, floatingActionButton);
            } else if (BaseBehavior.K(view)) {
                this.P(view, floatingActionButton);
            }
            return false;
        }

        public boolean N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int n8) {
            View view;
            List<View> list = coordinatorLayout.r((View)floatingActionButton);
            int n9 = list.size();
            for (int i8 = 0; i8 < n9 && !((view = list.get(i8)) instanceof AppBarLayout ? this.O(coordinatorLayout, (AppBarLayout)view, floatingActionButton) : BaseBehavior.K(view) && this.P(view, floatingActionButton)); ++i8) {
            }
            coordinatorLayout.I((View)floatingActionButton, n8);
            this.L(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override
        public void k(CoordinatorLayout.f f8) {
            if (f8.h == 0) {
                f8.h = 80;
            }
        }
    }

    public static class Behavior
    extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c
    implements ax.N6.b {
        final FloatingActionButton a;

        c(FloatingActionButton floatingActionButton) {
            this.a = floatingActionButton;
        }

        @Override
        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override
        public void b(int n8, int n9, int n10, int n11) {
            this.a.l.set(n8, n9, n10, n11);
            FloatingActionButton floatingActionButton = this.a;
            floatingActionButton.setPadding(n8 + floatingActionButton.i, n9 + this.a.i, n10 + this.a.i, n11 + this.a.i);
        }

        @Override
        public boolean c() {
            return this.a.k;
        }
    }

    class d<T extends FloatingActionButton>
    implements b.e {
        final FloatingActionButton a;

        d(FloatingActionButton floatingActionButton, k<T> k8) {
            this.a = floatingActionButton;
        }

        @Override
        public void a() {
            throw null;
        }

        @Override
        public void b() {
            throw null;
        }

        public boolean equals(Object object) {
            if (!(object instanceof d)) {
                return false;
            }
            ((d)object).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }
}

