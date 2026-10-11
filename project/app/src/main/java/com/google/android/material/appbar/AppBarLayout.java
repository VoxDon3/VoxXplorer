/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.O6.h;
import ax.O6.i;
import ax.c0.D;
import ax.c0.F0;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.l;
import ax.k6.m;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;

public class AppBarLayout
extends LinearLayout
implements CoordinatorLayout.b {
    private static final int B = ax.k6.l.g;
    private Behavior A;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private F0 g;
    private List<a> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private ColorStateList m;
    private int n;
    private WeakReference<View> o;
    private ValueAnimator p;
    private ValueAnimator.AnimatorUpdateListener q;
    private final List<e> r;
    private final LinkedHashSet<f> s;
    private final long t;
    private final TimeInterpolator u;
    private int[] v;
    private int w;
    private Drawable x;
    private Integer y;
    private final float z;

    private boolean C() {
        return this.x != null && this.getTopInset() > 0;
    }

    private boolean E() {
        View view;
        return this.getChildCount() > 0 && (view = this.getChildAt(0)).getVisibility() != 8 && !view.getFitsSystemWindows();
    }

    private void F(float f8, float f9) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.p = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{f8, f9});
        valueAnimator.setDuration(this.t);
        this.p.setInterpolator(this.u);
        valueAnimator = this.q;
        if (valueAnimator != null) {
            this.p.addUpdateListener((ValueAnimator.AnimatorUpdateListener)valueAnimator);
        }
        this.p.start();
    }

    private void G() {
        this.setWillNotDraw(this.C() ^ true);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h h8, ValueAnimator object) {
        appBarLayout.getClass();
        float f8 = ((Float)object.getAnimatedValue()).floatValue();
        h8.f0(f8);
        object = appBarLayout.x;
        if (object instanceof h) {
            ((h)object).f0(f8);
        }
        object = appBarLayout.r.iterator();
        while (object.hasNext()) {
            ((e)object.next()).a(f8, h8.E());
        }
        object = ((AbstractCollection)appBarLayout.s).iterator();
        while (object.hasNext()) {
            ((f)object.next()).a(f8, h8.E(), f8 / appBarLayout.z);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void b(AppBarLayout object, ColorStateList object2, h h8, Integer object32, ValueAnimator valueAnimator) {
        Float var4_6;
        object.getClass();
        float f8 = ((Float)var4_6.getAnimatedValue()).floatValue();
        int n8 = ax.z6.a.k(((AppBarLayout)((Object)object)).w, object2.getDefaultColor(), f8);
        h8.g0(ColorStateList.valueOf((int)n8));
        if (((AppBarLayout)((Object)object)).x != null && (object2 = ((AppBarLayout)((Object)object)).y) != null && ((Integer)object2).equals(object32)) {
            ((AppBarLayout)((Object)object)).x.setTint(n8);
        }
        if (!((AppBarLayout)((Object)object)).r.isEmpty()) {
            for (e e8 : ((AppBarLayout)((Object)object)).r) {
                if (h8.B() == null) continue;
                e8.a(0.0f, n8);
            }
        }
        if (!((AbstractCollection)((AppBarLayout)((Object)object)).s).isEmpty()) {
            object = ((AbstractCollection)((AppBarLayout)((Object)object)).s).iterator();
            while (object.hasNext()) {
                ((f)object.next()).a(0.0f, n8, f8);
            }
        }
    }

    private void d() {
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    private Integer e() {
        Drawable drawable = this.x;
        if (drawable instanceof h) {
            return ((h)drawable).E();
        }
        if ((drawable = ax.C6.f.f(drawable)) != null) {
            return drawable.getDefaultColor();
        }
        return null;
    }

    private View f(View object) {
        int n8;
        if (this.o == null && (n8 = this.n) != -1) {
            object = object != null ? object.findViewById(n8) : null;
            Object object2 = object;
            if (object == null) {
                object2 = object;
                if (this.getParent() instanceof ViewGroup) {
                    object2 = ((ViewGroup)this.getParent()).findViewById(this.n);
                }
            }
            if (object2 != null) {
                this.o = new WeakReference<Object>(object2);
            }
        }
        if ((object = this.o) != null) {
            return (View)((Reference)object).get();
        }
        return null;
    }

    private boolean k() {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!((d)this.getChildAt(i8).getLayoutParams()).e()) continue;
            return true;
        }
        return false;
    }

    private void m(h h8, ColorStateList colorStateList) {
        this.q = new ax.m6.a(this, colorStateList, h8, ax.z6.a.f(this.getContext(), ax.k6.c.i));
    }

    private void n(Context context, h h8) {
        h8.U(context);
        this.q = new ax.m6.b(this, h8);
    }

    private void o() {
        Object object = this.A;
        object = object != null && this.b != -1 && this.f == 0 ? ((BaseBehavior)object).x0(ax.k0.a.c0, this) : null;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (object != null) {
            this.A.w0((BaseBehavior.c)object, false);
        }
    }

    private boolean q() {
        return this.getBackground() instanceof h;
    }

    private h s(Drawable drawable) {
        if (drawable instanceof h) {
            return (h)drawable;
        }
        ColorStateList colorStateList = ax.C6.f.f(drawable);
        if (colorStateList == null) {
            return null;
        }
        drawable = new h();
        drawable.g0(colorStateList);
        return drawable;
    }

    private Drawable t(Context context, Drawable drawable) {
        h h8 = this.s(drawable);
        if (h8 != null && h8.B() != null) {
            this.w = h8.B().getDefaultColor();
            drawable = this.m;
            if (drawable != null) {
                this.m(h8, (ColorStateList)drawable);
                return h8;
            }
            this.n(context, h8);
            return h8;
        }
        return drawable;
    }

    private void y(boolean bl, boolean bl2, boolean bl3) {
        int n8 = bl ? 1 : 2;
        int n9 = 0;
        int n10 = bl2 ? 4 : 0;
        if (bl3) {
            n9 = 8;
        }
        this.f = n8 | n10 | n9;
        this.requestLayout();
    }

    private boolean z(boolean bl) {
        if (this.j != bl) {
            this.j = bl;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }

    boolean A(boolean bl) {
        return this.B(bl, this.i ^ true);
    }

    boolean B(boolean bl, boolean bl2) {
        if (bl2 && this.k != bl) {
            this.k = bl;
            this.refreshDrawableState();
            if (this.q()) {
                ColorStateList colorStateList = this.m;
                float f8 = 0.0f;
                float f9 = 0.0f;
                if (colorStateList != null) {
                    float f10 = bl ? 0.0f : 1.0f;
                    if (bl) {
                        f9 = 1.0f;
                    }
                    this.F(f10, f9);
                } else if (this.l) {
                    float f11 = bl ? 0.0f : this.z;
                    f9 = f8;
                    if (bl) {
                        f9 = this.z;
                    }
                    this.F(f11, f9);
                }
            }
            return true;
        }
        return false;
    }

    boolean D(View view) {
        View view2 = this.f(view);
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void c(f f8) {
        ((AbstractCollection)this.s).add(f8);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C()) {
            int n8 = canvas.save();
            canvas.translate(0.0f, (float)(-this.a));
            this.x.draw(canvas);
            canvas.restoreToCount(n8);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(nArray)) {
            this.invalidateDrawable(drawable);
        }
    }

    protected d g() {
        return new d(-1, -2);
    }

    @Override
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior;
        this.A = behavior = new Behavior();
        return behavior;
    }

    /*
     * Unable to fully structure code
     */
    int getDownNestedPreScrollRange() {
        var1_1 = this.c;
        if (var1_1 != -1) {
            return var1_1;
        }
        var3_3 = 0;
        for (var2_2 = this.getChildCount() - 1; var2_2 >= 0; --var2_2) {
            var7_7 = this.getChildAt(var2_2);
            if (var7_7.getVisibility() == 8) {
                var1_1 = var3_3;
            } else {
                var6_6 = (d)var7_7.getLayoutParams();
                var5_5 = var7_7.getMeasuredHeight();
                var1_1 = var6_6.a;
                if ((var1_1 & 5) == 5) {
                    var4_4 = var6_6.topMargin + var6_6.bottomMargin;
                    if ((var1_1 & 8) != 0) {
                        var1_1 = var7_7.getMinimumHeight();
lbl17:
                        // 2 sources

                        while (true) {
                            var1_1 = var4_4 + var1_1;
                            break;
                        }
                    } else {
                        if ((var1_1 & 2) != 0) {
                            var1_1 = var5_5 - var7_7.getMinimumHeight();
                            ** continue;
                        }
                        var1_1 = var4_4 + var5_5;
                    }
                    var4_4 = var1_1;
                    if (var2_2 == 0) {
                        var4_4 = var1_1;
                        if (var7_7.getFitsSystemWindows()) {
                            var4_4 = Math.min(var1_1, var5_5 - this.getTopInset());
                        }
                    }
                    var1_1 = var3_3 + var4_4;
                } else {
                    var1_1 = var3_3;
                    if (var3_3 > 0) break;
                }
            }
            var3_3 = var1_1;
        }
        this.c = var1_1 = Math.max(0, var3_3);
        return var1_1;
    }

    int getDownNestedScrollRange() {
        int n8;
        int n9 = this.d;
        if (n9 != -1) {
            return n9;
        }
        int n10 = this.getChildCount();
        int n11 = 0;
        n9 = 0;
        while (true) {
            n8 = n9;
            if (n11 >= n10) break;
            View view = this.getChildAt(n11);
            if (view.getVisibility() != 8) {
                d d8 = (d)view.getLayoutParams();
                int n12 = view.getMeasuredHeight();
                int n13 = d8.topMargin;
                int n14 = d8.bottomMargin;
                int n15 = d8.a;
                n8 = n9;
                if ((n15 & 1) == 0) break;
                n9 = n8 = n9 + (n12 + (n13 + n14));
                if ((n15 & 2) != 0) {
                    n8 -= view.getMinimumHeight();
                    break;
                }
            }
            ++n11;
        }
        this.d = n9 = Math.max(0, n8);
        return n9;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public h getMaterialShapeBackground() {
        Drawable drawable = this.getBackground();
        if (drawable instanceof h) {
            return (h)drawable;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int n8 = this.getTopInset();
        int n9 = this.getMinimumHeight();
        if (n9 != 0) {
            int n10 = n9 * 2 + n8;
            if (n10 < this.getHeight()) {
                return n10;
            }
            return n9 + n8;
        }
        n9 = this.getChildCount();
        n9 = n9 >= 1 ? this.getChildAt(n9 - 1).getMinimumHeight() : 0;
        if (n9 != 0) {
            int n11 = n9 * 2 + n8;
            if (n11 < this.getHeight()) {
                return n11;
            }
            return n9 + n8;
        }
        return this.getHeight() / 3;
    }

    int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        F0 f02 = this.g;
        if (f02 != null) {
            return f02.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int n8;
        int n9 = this.b;
        if (n9 != -1) {
            return n9;
        }
        int n10 = this.getChildCount();
        int n11 = 0;
        n9 = 0;
        while (true) {
            n8 = n9;
            if (n11 >= n10) break;
            View view = this.getChildAt(n11);
            if (view.getVisibility() == 8) {
                n8 = n9;
            } else {
                d d8 = (d)view.getLayoutParams();
                int n12 = view.getMeasuredHeight();
                int n13 = d8.a;
                n8 = n9;
                if ((n13 & 1) == 0) break;
                n9 = n8 = n9 + (n12 + d8.topMargin + d8.bottomMargin);
                if (n11 == 0) {
                    n9 = n8;
                    if (view.getFitsSystemWindows()) {
                        n9 = n8 - this.getTopInset();
                    }
                }
                n8 = n9;
                if ((n13 & 2) != 0) {
                    n8 = n9 - view.getMinimumHeight();
                    break;
                }
            }
            ++n11;
            n9 = n8;
        }
        this.b = n9 = Math.max(0, n8);
        return n9;
    }

    int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    public d h(AttributeSet attributeSet) {
        return new d(this.getContext(), attributeSet);
    }

    protected d i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new d(layoutParams);
    }

    boolean j() {
        return this.e;
    }

    boolean l() {
        return this.getTotalScrollRange() != 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.e((View)this);
    }

    protected int[] onCreateDrawableState(int n8) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] nArray = this.v;
        int[] nArray2 = super.onCreateDrawableState(n8 + nArray.length);
        boolean bl = this.j;
        n8 = ax.k6.c.b0;
        if (!bl) {
            n8 = -n8;
        }
        nArray[0] = n8;
        n8 = bl && this.k ? ax.k6.c.c0 : -ax.k6.c.c0;
        nArray[1] = n8;
        n8 = ax.k6.c.X;
        if (!bl) {
            n8 = -n8;
        }
        nArray[2] = n8;
        n8 = bl && this.k ? ax.k6.c.W : -ax.k6.c.W;
        nArray[3] = n8;
        return View.mergeDrawableStates((int[])nArray2, (int[])nArray);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d();
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        Drawable drawable;
        super.onLayout(bl, n8, n9, n10, n11);
        bl = this.getFitsSystemWindows();
        boolean bl2 = true;
        if (bl && this.E()) {
            n9 = this.getTopInset();
            for (n8 = this.getChildCount() - 1; n8 >= 0; --n8) {
                d0.W(this.getChildAt(n8), n9);
            }
        }
        this.o();
        this.e = false;
        n9 = this.getChildCount();
        for (n8 = 0; n8 < n9; ++n8) {
            if (((d)this.getChildAt(n8).getLayoutParams()).d() == null) continue;
            this.e = true;
            break;
        }
        if ((drawable = this.x) != null) {
            drawable.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if (!this.i) {
            bl = bl2;
            if (!this.l) {
                bl = this.k() ? bl2 : false;
            }
            this.z(bl);
        }
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        int n10 = View.MeasureSpec.getMode((int)n9);
        if (n10 != 0x40000000 && this.getFitsSystemWindows() && this.E()) {
            n8 = this.getMeasuredHeight();
            if (n10 != Integer.MIN_VALUE) {
                if (n10 == 0) {
                    n8 += this.getTopInset();
                }
            } else {
                n8 = ax.W.a.b(this.getMeasuredHeight() + this.getTopInset(), 0, View.MeasureSpec.getSize((int)n9));
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), n8);
        }
        this.o();
    }

    public boolean p() {
        return this.l;
    }

    public boolean r() {
        return this.k;
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(this.t(this.getContext(), drawable));
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        ax.O6.i.d((View)this, f8);
    }

    public void setExpanded(boolean bl) {
        this.x(bl, this.isLaidOut());
    }

    public void setLiftOnScroll(boolean bl) {
        this.l = bl;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            this.setBackground(this.getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.n = -1;
        if (view == null) {
            this.d();
            return;
        }
        this.o = new WeakReference<View>(view);
    }

    public void setLiftOnScrollTargetViewId(int n8) {
        this.n = n8;
        this.d();
    }

    public void setLiftableOverrideEnabled(boolean bl) {
        this.i = bl;
    }

    public void setOrientation(int n8) {
        if (n8 == 1) {
            super.setOrientation(n8);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    void setPendingAction(int n8) {
        this.f = n8;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.x = drawable3;
            this.y = this.e();
            drawable = this.x;
            if (drawable != null) {
                if (drawable.isStateful()) {
                    this.x.setState(this.getDrawableState());
                }
                ax.U.a.m(this.x, this.getLayoutDirection());
                drawable = this.x;
                boolean bl = this.getVisibility() == 0;
                drawable.setVisible(bl, false);
                this.x.setCallback((Drawable.Callback)this);
            }
            this.G();
            this.postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int n8) {
        this.setStatusBarForeground((Drawable)new ColorDrawable(n8));
    }

    public void setStatusBarForegroundResource(int n8) {
        this.setStatusBarForeground(ax.o.a.b(this.getContext(), n8));
    }

    @Deprecated
    public void setTargetElevation(float f8) {
        com.google.android.material.appbar.e.a((View)this, f8);
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        boolean bl = n8 == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(bl, false);
        }
    }

    void u(int n8) {
        Object object;
        this.a = n8;
        if (!this.willNotDraw()) {
            this.postInvalidateOnAnimation();
        }
        if ((object = this.h) != null) {
            int n9 = object.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                object = this.h.get(i8);
                if (object == null) continue;
                object.a(this, n8);
            }
        }
    }

    public boolean v(f f8) {
        return ((AbstractCollection)this.s).remove(f8);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
        {
        }
    }

    void w() {
        this.f = 0;
    }

    public void x(boolean bl, boolean bl2) {
        this.y(bl, bl2, true);
    }

    protected static class BaseBehavior<T extends AppBarLayout>
    extends com.google.android.material.appbar.a<T> {
        private int k;
        private int l;
        private ValueAnimator m;
        private c n;
        private WeakReference<View> o;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void A0(CoordinatorLayout coordinatorLayout, T t8) {
            View view;
            d d8;
            int n8;
            int n9 = ((AppBarLayout)t8).getTopInset() + t8.getPaddingTop();
            int n10 = this.Q() - n9;
            int n11 = this.i0(t8, n10);
            if (n11 >= 0 && ((n8 = (d8 = (d)(view = t8.getChildAt(n11)).getLayoutParams()).c()) & 0x11) == 17) {
                int n12 = -view.getTop();
                int n13 = -view.getBottom();
                int n14 = n12;
                if (n11 == 0) {
                    n14 = n12;
                    if (t8.getFitsSystemWindows()) {
                        n14 = n12;
                        if (view.getFitsSystemWindows()) {
                            n14 = n12 - ((AppBarLayout)t8).getTopInset();
                        }
                    }
                }
                if (BaseBehavior.e0(n8, 2)) {
                    n12 = n13 + view.getMinimumHeight();
                    n11 = n14;
                } else {
                    n11 = n14;
                    n12 = n13;
                    if (BaseBehavior.e0(n8, 5)) {
                        n12 = view.getMinimumHeight() + n13;
                        if (n10 < n12) {
                            n11 = n12;
                            n12 = n13;
                        } else {
                            n11 = n14;
                        }
                    }
                }
                n13 = n11;
                n14 = n12;
                if (BaseBehavior.e0(n8, 32)) {
                    n13 = n11 + d8.topMargin;
                    n14 = n12 - d8.bottomMargin;
                }
                this.Z(coordinatorLayout, t8, ax.W.a.b(this.b0(n10, n14, n13) + n9, -((AppBarLayout)t8).getTotalScrollRange(), 0), 0.0f);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private void B0(CoordinatorLayout coordinatorLayout, T t8, int n8, int n9, boolean bl) {
            boolean bl2;
            block8: {
                block10: {
                    int n10;
                    int n11;
                    boolean bl3;
                    View view;
                    block9: {
                        view = BaseBehavior.h0(t8, n8);
                        bl2 = bl3 = false;
                        if (view == null) break block8;
                        n11 = ((d)view.getLayoutParams()).c();
                        bl2 = bl3;
                        if ((n11 & 1) == 0) break block8;
                        n10 = view.getMinimumHeight();
                        if (n9 <= 0 || (n11 & 0xC) == 0) break block9;
                        bl2 = bl3;
                        if (-n8 < view.getBottom() - n10 - ((AppBarLayout)t8).getTopInset()) break block8;
                        break block10;
                    }
                    bl2 = bl3;
                    if ((n11 & 2) == 0) break block8;
                    bl2 = bl3;
                    if (-n8 < view.getBottom() - n10 - ((AppBarLayout)t8).getTopInset()) break block8;
                }
                bl2 = true;
            }
            if (((AppBarLayout)t8).p()) {
                bl2 = ((AppBarLayout)t8).D(this.g0(coordinatorLayout));
            }
            bl2 = ((AppBarLayout)t8).A(bl2);
            if (bl || bl2 && this.z0(coordinatorLayout, t8)) {
                if (t8.getBackground() != null) {
                    t8.getBackground().jumpToCurrentState();
                }
                if (Build.VERSION.SDK_INT >= 23 && ax.m6.c.a(t8) != null) {
                    ax.m6.c.a(t8).jumpToCurrentState();
                }
                if (t8.getStateListAnimator() != null) {
                    t8.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t8) {
            if (!d0.N((View)coordinatorLayout)) {
                d0.l0((View)coordinatorLayout, new ax.c0.a(this, (AppBarLayout)t8, coordinatorLayout){
                    final AppBarLayout d;
                    final CoordinatorLayout e;
                    final BaseBehavior f;
                    {
                        this.f = baseBehavior;
                        this.d = appBarLayout;
                        this.e = coordinatorLayout;
                    }

                    @Override
                    public void g(View view, H h8) {
                        super.g(view, h8);
                        h8.m0(ScrollView.class.getName());
                        if (this.d.getTotalScrollRange() != 0 && (view = this.f.j0(this.e)) != null && this.f.f0(this.d)) {
                            if (this.f.Q() != -this.d.getTotalScrollRange()) {
                                h8.b(H.a.q);
                                h8.G0(true);
                            }
                            if (this.f.Q() != 0) {
                                if (view.canScrollVertically(-1)) {
                                    if (-this.d.getDownNestedPreScrollRange() != 0) {
                                        h8.b(H.a.r);
                                        h8.G0(true);
                                        return;
                                    }
                                } else {
                                    h8.b(H.a.r);
                                    h8.G0(true);
                                }
                            }
                        }
                    }

                    @Override
                    public boolean j(View view, int n8, Bundle bundle) {
                        if (n8 == 4096) {
                            this.d.setExpanded(false);
                            return true;
                        }
                        if (n8 == 8192) {
                            if (this.f.Q() != 0) {
                                view = this.f.j0(this.e);
                                if (view.canScrollVertically(-1)) {
                                    n8 = -this.d.getDownNestedPreScrollRange();
                                    if (n8 != 0) {
                                        this.f.q0(this.e, this.d, view, 0, n8, new int[]{0, 0}, 1);
                                        return true;
                                    }
                                } else {
                                    this.d.setExpanded(true);
                                    return true;
                                }
                            }
                            return false;
                        }
                        return super.j(view, n8, bundle);
                    }
                });
            }
        }

        private void Z(CoordinatorLayout coordinatorLayout, T t8, int n8, float f8) {
            int n9 = Math.abs(this.Q() - n8);
            n9 = (f8 = Math.abs(f8)) > 0.0f ? Math.round((float)n9 / f8 * 1000.0f) * 3 : (int)(((float)n9 / (float)t8.getHeight() + 1.0f) * 150.0f);
            this.a0(coordinatorLayout, t8, n8, n9);
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t8, int n8, int n9) {
            int n10 = this.Q();
            if (n10 == n8) {
                coordinatorLayout = this.m;
                if (coordinatorLayout != null && coordinatorLayout.isRunning()) {
                    this.m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator == null) {
                this.m = valueAnimator = new ValueAnimator();
                valueAnimator.setInterpolator(ax.l6.a.e);
                this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
                    final CoordinatorLayout a;
                    final AppBarLayout b;
                    final BaseBehavior c;
                    {
                        this.c = baseBehavior;
                        this.a = coordinatorLayout;
                        this.b = appBarLayout;
                    }

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.c.T(this.a, this.b, (Integer)valueAnimator.getAnimatedValue());
                    }
                });
            } else {
                valueAnimator.cancel();
            }
            this.m.setDuration((long)Math.min(n9, 600));
            this.m.setIntValues(new int[]{n10, n8});
            this.m.start();
        }

        private int b0(int n8, int n9, int n10) {
            if (n8 < (n9 + n10) / 2) {
                return n9;
            }
            return n10;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, T t8, View view) {
            return ((AppBarLayout)t8).l() && coordinatorLayout.getHeight() - view.getHeight() <= t8.getHeight();
        }

        private static boolean e0(int n8, int n9) {
            return (n8 & n9) == n9;
        }

        private boolean f0(AppBarLayout appBarLayout) {
            int n8 = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (((d)appBarLayout.getChildAt((int)i8).getLayoutParams()).a == 0) continue;
                return true;
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int n8 = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = coordinatorLayout.getChildAt(i8);
                if (!(view instanceof D || view instanceof AbsListView || view instanceof ScrollView)) {
                    continue;
                }
                return view;
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int n8) {
            int n9 = Math.abs(n8);
            int n10 = appBarLayout.getChildCount();
            for (n8 = 0; n8 < n10; ++n8) {
                View view = appBarLayout.getChildAt(n8);
                if (n9 < view.getTop() || n9 > view.getBottom()) continue;
                return view;
            }
            return null;
        }

        private int i0(T t8, int n8) {
            int n9 = t8.getChildCount();
            for (int i8 = 0; i8 < n9; ++i8) {
                Object object = t8.getChildAt(i8);
                int n10 = object.getTop();
                int n11 = object.getBottom();
                object = (d)object.getLayoutParams();
                int n12 = n10;
                int n13 = n11;
                if (BaseBehavior.e0(((d)((Object)object)).c(), 32)) {
                    n12 = n10 - ((LinearLayout.LayoutParams)object).topMargin;
                    n13 = n11 + ((LinearLayout.LayoutParams)object).bottomMargin;
                }
                if (n12 > (n11 = -n8) || n13 < n11) continue;
                return i8;
            }
            return -1;
        }

        private View j0(CoordinatorLayout coordinatorLayout) {
            int n8 = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = coordinatorLayout.getChildAt(i8);
                if (!(((CoordinatorLayout.f)view.getLayoutParams()).f() instanceof ScrollingViewBehavior)) continue;
                return view;
            }
            return null;
        }

        private int m0(T t8, int n8) {
            int n9 = Math.abs(n8);
            int n10 = t8.getChildCount();
            int n11 = 0;
            for (int i8 = 0; i8 < n10; ++i8) {
                View view = t8.getChildAt(i8);
                d d8 = (d)view.getLayoutParams();
                Interpolator interpolator = d8.d();
                if (n9 < view.getTop() || n9 > view.getBottom()) continue;
                if (interpolator == null) break;
                n10 = d8.c();
                i8 = n11;
                if ((n10 & 1) != 0) {
                    i8 = n11 = view.getHeight() + d8.topMargin + d8.bottomMargin;
                    if ((n10 & 2) != 0) {
                        i8 = n11 - view.getMinimumHeight();
                    }
                }
                n11 = i8;
                if (view.getFitsSystemWindows()) {
                    n11 = i8 - ((AppBarLayout)t8).getTopInset();
                }
                if (n11 <= 0) break;
                i8 = view.getTop();
                float f8 = n11;
                i8 = Math.round(f8 * interpolator.getInterpolation((float)(n9 - i8) / f8));
                return Integer.signum(n8) * (view.getTop() + i8);
            }
            return n8;
        }

        private boolean z0(CoordinatorLayout object, T object2) {
            object2 = ((CoordinatorLayout)object).s((View)object2);
            int n8 = object2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = ((CoordinatorLayout.f)((View)object2.get(i8)).getLayoutParams()).f();
                if (!(object instanceof ScrollingViewBehavior)) continue;
                return ((ScrollingViewBehavior)object).O() != 0;
            }
            return false;
        }

        @Override
        int Q() {
            return this.I() + this.k;
        }

        boolean c0(T object) {
            object = this.o;
            if (object != null) {
                return (object = (View)((Reference)object).get()) != null && object.isShown() && !object.canScrollVertically(-1);
            }
            return true;
        }

        int k0(T t8) {
            return -((AppBarLayout)t8).getDownNestedScrollRange() + ((AppBarLayout)t8).getTopInset();
        }

        int l0(T t8) {
            return ((AppBarLayout)t8).getTotalScrollRange();
        }

        void n0(CoordinatorLayout coordinatorLayout, T t8) {
            this.A0(coordinatorLayout, t8);
            if (((AppBarLayout)t8).p()) {
                ((AppBarLayout)t8).A(((AppBarLayout)t8).D(this.g0(coordinatorLayout)));
            }
        }

        public boolean o0(CoordinatorLayout coordinatorLayout, T t8, int n8) {
            boolean bl = super.p(coordinatorLayout, t8, n8);
            int n9 = ((AppBarLayout)t8).getPendingAction();
            c c8 = this.n;
            if (c8 != null && (n9 & 8) == 0) {
                if (c8.d0) {
                    this.T(coordinatorLayout, t8, -((AppBarLayout)t8).getTotalScrollRange());
                } else if (c8.e0) {
                    this.T(coordinatorLayout, t8, 0);
                } else {
                    c8 = t8.getChildAt(c8.f0);
                    n9 = -c8.getBottom();
                    n8 = this.n.h0 ? c8.getMinimumHeight() + ((AppBarLayout)t8).getTopInset() : Math.round((float)c8.getHeight() * this.n.g0);
                    this.T(coordinatorLayout, t8, n9 + n8);
                }
            } else if (n9 != 0) {
                n8 = (n9 & 4) != 0 ? 1 : 0;
                if ((n9 & 2) != 0) {
                    n9 = -((AppBarLayout)t8).getUpNestedPreScrollRange();
                    if (n8 != 0) {
                        this.Z(coordinatorLayout, t8, n9, 0.0f);
                    } else {
                        this.T(coordinatorLayout, t8, n9);
                    }
                } else if ((n9 & 1) != 0) {
                    if (n8 != 0) {
                        this.Z(coordinatorLayout, t8, 0, 0.0f);
                    } else {
                        this.T(coordinatorLayout, t8, 0);
                    }
                }
            }
            ((AppBarLayout)t8).w();
            this.n = null;
            this.K(ax.W.a.b(this.I(), -((AppBarLayout)t8).getTotalScrollRange(), 0));
            this.B0(coordinatorLayout, t8, this.I(), 0, true);
            ((AppBarLayout)t8).u(this.I());
            this.Y(coordinatorLayout, t8);
            return bl;
        }

        public boolean p0(CoordinatorLayout coordinatorLayout, T t8, int n8, int n9, int n10, int n11) {
            if (((CoordinatorLayout.f)t8.getLayoutParams()).height == -2) {
                coordinatorLayout.J((View)t8, n8, n9, View.MeasureSpec.makeMeasureSpec((int)0, (int)0), n11);
                return true;
            }
            return super.q(coordinatorLayout, t8, n8, n9, n10, n11);
        }

        public void q0(CoordinatorLayout coordinatorLayout, T t8, View view, int n8, int n9, int[] nArray, int n10) {
            if (n9 != 0) {
                if (n9 < 0) {
                    n8 = -((AppBarLayout)t8).getTotalScrollRange();
                    n10 = ((AppBarLayout)t8).getDownNestedPreScrollRange() + n8;
                } else {
                    n8 = -((AppBarLayout)t8).getUpNestedPreScrollRange();
                    n10 = 0;
                }
                if (n8 != n10) {
                    nArray[1] = this.S(coordinatorLayout, t8, n9, n8, n10);
                }
            }
            if (((AppBarLayout)t8).p()) {
                ((AppBarLayout)t8).A(((AppBarLayout)t8).D(view));
            }
        }

        public void r0(CoordinatorLayout coordinatorLayout, T t8, View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
            if (n11 < 0) {
                nArray[1] = this.S(coordinatorLayout, t8, n11, -((AppBarLayout)t8).getDownNestedScrollRange(), 0);
            }
            if (n11 == 0) {
                this.Y(coordinatorLayout, t8);
            }
        }

        public void s0(CoordinatorLayout coordinatorLayout, T t8, Parcelable parcelable) {
            if (parcelable instanceof c) {
                this.w0((c)parcelable, true);
                super.B(coordinatorLayout, t8, this.n.a());
                return;
            }
            super.B(coordinatorLayout, t8, parcelable);
            this.n = null;
        }

        public Parcelable t0(CoordinatorLayout coordinatorLayout, T object) {
            if ((object = this.x0((Parcelable)(coordinatorLayout = super.C(coordinatorLayout, object)), object)) == null) {
                return coordinatorLayout;
            }
            return object;
        }

        public boolean u0(CoordinatorLayout coordinatorLayout, T t8, View view, View view2, int n8, int n9) {
            boolean bl = (n8 & 2) != 0 && (((AppBarLayout)t8).p() || ((AppBarLayout)t8).r() || this.d0(coordinatorLayout, t8, view));
            if (bl && (coordinatorLayout = this.m) != null) {
                coordinatorLayout.cancel();
            }
            this.o = null;
            this.l = n9;
            return bl;
        }

        public void v0(CoordinatorLayout coordinatorLayout, T t8, View view, int n8) {
            if (this.l == 0 || n8 == 1) {
                this.A0(coordinatorLayout, t8);
                if (((AppBarLayout)t8).p()) {
                    ((AppBarLayout)t8).A(((AppBarLayout)t8).D(view));
                }
            }
            this.o = new WeakReference<View>(view);
        }

        void w0(c c8, boolean bl) {
            if (this.n != null && !bl) {
                return;
            }
            this.n = c8;
        }

        c x0(Parcelable parcelable, T t8) {
            int n8 = this.I();
            int n9 = t8.getChildCount();
            boolean bl = false;
            for (int i8 = 0; i8 < n9; ++i8) {
                View view = t8.getChildAt(i8);
                int n10 = view.getBottom() + n8;
                if (view.getTop() + n8 > 0 || n10 < 0) continue;
                Parcelable parcelable2 = parcelable;
                if (parcelable == null) {
                    parcelable2 = ax.k0.a.c0;
                }
                parcelable = new c(parcelable2);
                boolean bl2 = n8 == 0;
                parcelable.e0 = bl2;
                bl2 = !bl2 && -n8 >= ((AppBarLayout)t8).getTotalScrollRange();
                parcelable.d0 = bl2;
                parcelable.f0 = i8;
                bl2 = bl;
                if (n10 == view.getMinimumHeight() + ((AppBarLayout)t8).getTopInset()) {
                    bl2 = true;
                }
                parcelable.h0 = bl2;
                parcelable.g0 = (float)n10 / (float)view.getHeight();
                return parcelable;
            }
            return null;
        }

        int y0(CoordinatorLayout coordinatorLayout, T t8, int n8, int n9, int n10) {
            int n11 = this.Q();
            int n12 = 0;
            int n13 = 0;
            if (n9 != 0 && n11 >= n9 && n11 <= n10) {
                if (n11 != (n9 = ax.W.a.b(n8, n9, n10))) {
                    n8 = ((AppBarLayout)t8).j() ? this.m0(t8, n9) : n9;
                    boolean bl = this.K(n8);
                    this.k = n9 - n8;
                    if (bl) {
                        for (n8 = n13; n8 < t8.getChildCount(); ++n8) {
                            d d8 = (d)t8.getChildAt(n8).getLayoutParams();
                            b b8 = d8.b();
                            if (b8 == null || (d8.c() & 1) == 0) continue;
                            b8.a((AppBarLayout)t8, t8.getChildAt(n8), this.I());
                        }
                    }
                    if (!bl && ((AppBarLayout)t8).j()) {
                        coordinatorLayout.j((View)t8);
                    }
                    ((AppBarLayout)t8).u(this.I());
                    n8 = n9 < n11 ? -1 : 1;
                    this.B0(coordinatorLayout, t8, n9, n8, false);
                    n8 = n11 - n9;
                } else {
                    n8 = n12;
                }
            } else {
                this.k = 0;
                n8 = n12;
            }
            this.Y(coordinatorLayout, t8);
            return n8;
        }

        protected static class c
        extends ax.k0.a {
            public static final Parcelable.Creator<c> CREATOR = new Parcelable.ClassLoaderCreator<c>(){

                public c a(Parcel parcel) {
                    return new c(parcel, null);
                }

                public c b(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                public c[] c(int n8) {
                    return new c[n8];
                }
            };
            boolean d0;
            boolean e0;
            int f0;
            float g0;
            boolean h0;

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                byte by = parcel.readByte();
                boolean bl = false;
                boolean bl2 = by != 0;
                this.d0 = bl2;
                bl2 = parcel.readByte() != 0;
                this.e0 = bl2;
                this.f0 = parcel.readInt();
                this.g0 = parcel.readFloat();
                bl2 = bl;
                if (parcel.readByte() != 0) {
                    bl2 = true;
                }
                this.h0 = bl2;
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override
            public void writeToParcel(Parcel parcel, int n8) {
                super.writeToParcel(parcel, n8);
                parcel.writeByte((byte)(this.d0 ? 1 : 0));
                parcel.writeByte((byte)(this.e0 ? 1 : 0));
                parcel.writeInt(this.f0);
                parcel.writeFloat(this.g0);
                parcel.writeByte((byte)(this.h0 ? 1 : 0));
            }
        }
    }

    public static class Behavior
    extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior
    extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, ax.k6.m.z4);
            this.S(context.getDimensionPixelSize(ax.k6.m.A4, 0));
            context.recycle();
        }

        private static int V(AppBarLayout object) {
            if ((object = ((CoordinatorLayout.f)object.getLayoutParams()).f()) instanceof BaseBehavior) {
                return ((BaseBehavior)object).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c c8 = ((CoordinatorLayout.f)view2.getLayoutParams()).f();
            if (c8 instanceof BaseBehavior) {
                c8 = (BaseBehavior)c8;
                d0.W(view, view2.getBottom() - view.getTop() + ((BaseBehavior)c8).k + this.Q() - this.M(view2));
            }
        }

        private void X(View view, View object) {
            if (object instanceof AppBarLayout && ((AppBarLayout)(object = (AppBarLayout)object)).p()) {
                ((AppBarLayout)object).A(((AppBarLayout)object).D(view));
            }
        }

        @Override
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean bl) {
            AppBarLayout appBarLayout = this.U(coordinatorLayout.r(view));
            if (appBarLayout != null) {
                rect = new Rect(rect);
                rect.offset(view.getLeft(), view.getTop());
                view = this.d;
                view.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!view.contains(rect)) {
                    appBarLayout.x(false, bl ^ true);
                    return true;
                }
            }
            return false;
        }

        @Override
        float N(View object) {
            if (object instanceof AppBarLayout) {
                object = (AppBarLayout)object;
                int n8 = ((AppBarLayout)object).getTotalScrollRange();
                int n9 = ((AppBarLayout)object).getDownNestedPreScrollRange();
                int n10 = ScrollingViewBehavior.V((AppBarLayout)object);
                if (n9 != 0 && n8 + n10 <= n9) {
                    return 0.0f;
                }
                if ((n8 -= n9) != 0) {
                    return (float)n10 / (float)n8 + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override
        int P(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout)view).getTotalScrollRange();
            }
            return super.P(view);
        }

        AppBarLayout U(List<View> list) {
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = list.get(i8);
                if (!(view instanceof AppBarLayout)) continue;
                return (AppBarLayout)view;
            }
            return null;
        }

        @Override
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            this.W(view, view2);
            this.X(view, view2);
            return false;
        }

        @Override
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                d0.l0((View)coordinatorLayout, null);
            }
        }
    }

    public static interface a<T extends AppBarLayout> {
        public void a(T var1, int var2);
    }

    public static abstract class b {
        public abstract void a(AppBarLayout var1, View var2, float var3);
    }

    public static class c
    extends b {
        private final Rect a = new Rect();
        private final Rect b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override
        public void a(AppBarLayout appBarLayout, View view, float f8) {
            com.google.android.material.appbar.AppBarLayout$c.b(this.a, appBarLayout, view);
            float f9 = (float)this.a.top - Math.abs(f8);
            if (f9 <= 0.0f) {
                f8 = ax.W.a.a(Math.abs(f9 / (float)this.a.height()), 0.0f, 1.0f);
                f9 = -f9;
                f8 = 1.0f - f8;
                f8 = f9 - (float)this.a.height() * 0.3f * (1.0f - f8 * f8);
                view.setTranslationY(f8);
                view.getDrawingRect(this.b);
                this.b.offset(0, (int)(-f8));
                if (f8 >= (float)this.b.height()) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                view.setClipBounds(this.b);
                return;
            }
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }

    public static class d
    extends LinearLayout.LayoutParams {
        int a = 1;
        private b b;
        Interpolator c;

        public d(int n8, int n9) {
            super(n8, n9);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            attributeSet = context.obtainStyledAttributes(attributeSet, ax.k6.m.c);
            this.a = attributeSet.getInt(ax.k6.m.e, 0);
            this.f(attributeSet.getInt(ax.k6.m.d, 0));
            int n8 = ax.k6.m.f;
            if (attributeSet.hasValue(n8)) {
                this.c = AnimationUtils.loadInterpolator((Context)context, (int)attributeSet.getResourceId(n8, 0));
            }
            attributeSet.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        private b a(int n8) {
            if (n8 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        boolean e() {
            int n8 = this.a;
            return (n8 & 1) == 1 && (n8 & 0xA) != 0;
        }

        public void f(int n8) {
            this.b = this.a(n8);
        }

        public void g(int n8) {
            this.a = n8;
        }
    }

    @Deprecated
    public static interface e {
        public void a(float var1, int var2);
    }

    public static abstract class f {
        public abstract void a(float var1, int var2, float var3);
    }
}

