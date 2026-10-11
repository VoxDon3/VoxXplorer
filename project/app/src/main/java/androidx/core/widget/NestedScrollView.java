/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import ax.c0.C;
import ax.c0.D;
import ax.c0.E;
import ax.c0.G;
import ax.c0.H;
import ax.c0.d0;
import ax.c0.o;
import ax.c0.p;
import ax.d0.H;
import ax.d0.L;
import java.util.ArrayList;

public class NestedScrollView
extends FrameLayout
implements G,
D {
    private static final float D = (float)(Math.log(0.78) / Math.log(0.9));
    private static final a E = new a();
    private static final int[] F = new int[]{16843130};
    private d A;
    final c B;
    o C;
    private final float a;
    private long b;
    private final Rect c = new Rect();
    private OverScroller d;
    public EdgeEffect e;
    public EdgeEffect f;
    private int g;
    private boolean h = true;
    private boolean i = false;
    private View j = null;
    private boolean k = false;
    private VelocityTracker l;
    private boolean m;
    private boolean n = true;
    private int o;
    private int p;
    private int q;
    private int r = -1;
    private final int[] s = new int[2];
    private final int[] t = new int[2];
    private int u;
    private int v;
    private e w;
    private final H x;
    private final E y;
    private float z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.O.a.c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        c c8;
        this.B = c8 = new c(this);
        this.C = new o(this.getContext(), c8);
        this.e = ax.h0.d.a(context, attributeSet);
        this.f = ax.h0.d.a(context, attributeSet);
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.B();
        context = context.obtainStyledAttributes(attributeSet, F, n8, 0);
        this.setFillViewport(context.getBoolean(0, false));
        context.recycle();
        this.x = new H((ViewGroup)this);
        this.y = new E((View)this);
        this.setNestedScrollingEnabled(true);
        d0.l0((View)this, E);
    }

    private void A() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = VelocityTracker.obtain();
            return;
        }
        velocityTracker.clear();
    }

    private void B() {
        this.d = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)this.getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private void D(int n8, int n9) {
        this.g = n8;
        this.r = n9;
        this.X(2, 0);
    }

    private boolean E(View view) {
        return this.G(view, 0, this.getHeight()) ^ true;
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        return (view = view.getParent()) instanceof ViewGroup && NestedScrollView.F(view, view2);
    }

    private boolean G(View view, int n8, int n9) {
        view.getDrawingRect(this.c);
        this.offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + n8 >= this.getScrollY() && this.c.top - n8 <= this.getScrollY() + n9;
    }

    private void H(int n8, int n9, int[] nArray) {
        int n10 = this.getScrollY();
        this.scrollBy(0, n8);
        n10 = this.getScrollY() - n10;
        if (nArray != null) {
            nArray[1] = nArray[1] + n10;
        }
        this.y.e(0, n10, 0, n8 - n10, null, n9, nArray);
    }

    private void I(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n8) == this.r) {
            n8 = n8 == 0 ? 1 : 0;
            this.g = (int)motionEvent.getY(n8);
            this.r = motionEvent.getPointerId(n8);
            motionEvent = this.l;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    private int M(int n8, float f8) {
        float f9 = f8 / (float)this.getWidth();
        float f10 = (float)n8 / (float)this.getHeight();
        float f11 = ax.h0.d.b(this.e);
        f8 = 0.0f;
        if (f11 != 0.0f) {
            f8 = f10 = -ax.h0.d.d(this.e, -f10, f9);
            if (ax.h0.d.b(this.e) == 0.0f) {
                this.e.onRelease();
                f8 = f10;
            }
        } else if (ax.h0.d.b(this.f) != 0.0f) {
            f8 = f10 = ax.h0.d.d(this.f, f10, 1.0f - f9);
            if (ax.h0.d.b(this.f) == 0.0f) {
                this.f.onRelease();
                f8 = f10;
            }
        }
        n8 = Math.round(f8 * (float)this.getHeight());
        if (n8 != 0) {
            this.invalidate();
        }
        return n8;
    }

    private void N(boolean bl) {
        if (bl) {
            this.X(2, 1);
        } else {
            this.Z(1);
        }
        this.v = this.getScrollY();
        this.postInvalidateOnAnimation();
    }

    private boolean O(int n8, int n9, int n10) {
        View view;
        int n11 = this.getHeight();
        int n12 = this.getScrollY();
        n11 += n12;
        boolean bl = false;
        boolean bl2 = n8 == 33;
        Object object = view = this.u(bl2, n9, n10);
        if (view == null) {
            object = this;
        }
        if (n9 >= n12 && n10 <= n11) {
            bl2 = bl;
        } else {
            n9 = bl2 ? (n9 -= n12) : n10 - n11;
            this.P(n9, 0, 1, true);
            bl2 = true;
        }
        if (object != this.findFocus()) {
            object.requestFocus(n8);
        }
        return bl2;
    }

    private int P(int n8, int n9, int n10, boolean bl) {
        int n11;
        int n12;
        if (n10 == 1) {
            this.X(2, n10);
        }
        boolean bl2 = this.m(0, n8, this.t, this.s, n10);
        int n13 = 0;
        if (bl2) {
            n12 = this.t[1];
            n11 = this.s[1];
            n12 = n8 - n12;
        } else {
            n11 = 0;
            n12 = n8;
        }
        int n14 = this.getScrollY();
        int n15 = this.getScrollRange();
        boolean bl3 = this.g() && !bl;
        n8 = this.J(0, n12, 0, n14, 0, n15, 0, 0, true) && !this.y(n10) ? 1 : 0;
        int n16 = this.getScrollY() - n14;
        Object object = this.t;
        object[1] = 0;
        this.n(0, n16, 0, n12 - n16, this.s, n10, (int[])object);
        n16 = this.s[1];
        if ((n14 += (n12 -= this.t[1])) < 0) {
            if (bl3) {
                ax.h0.d.d(this.e, (float)(-n12) / (float)this.getHeight(), (float)n9 / (float)this.getWidth());
                if (!this.f.isFinished()) {
                    this.f.onRelease();
                }
            }
        } else if (n14 > n15 && bl3) {
            ax.h0.d.d(this.f, (float)n12 / (float)this.getHeight(), 1.0f - (float)n9 / (float)this.getWidth());
            if (!this.e.isFinished()) {
                this.e.onRelease();
            }
        }
        if (!this.e.isFinished() || !this.f.isFinished()) {
            this.postInvalidateOnAnimation();
            n8 = n13;
        }
        if (n8 != 0 && n10 == 0 && (object = (Object)this.l) != null) {
            object.clear();
        }
        if (n10 == 1) {
            this.Z(n10);
            this.e.onRelease();
            this.f.onRelease();
        }
        return n11 + n16;
    }

    private void Q(View view) {
        view.getDrawingRect(this.c);
        this.offsetDescendantRectToMyCoords(view, this.c);
        int n8 = this.k(this.c);
        if (n8 != 0) {
            this.scrollBy(0, n8);
        }
    }

    private boolean R(Rect rect, boolean bl) {
        int n8 = this.k(rect);
        boolean bl2 = n8 != 0;
        if (bl2) {
            if (bl) {
                this.scrollBy(0, n8);
                return bl2;
            }
            this.T(0, n8);
        }
        return bl2;
    }

    private boolean S(EdgeEffect edgeEffect, int n8) {
        if (n8 > 0) {
            return true;
        }
        float f8 = ax.h0.d.b(edgeEffect);
        float f9 = this.getHeight();
        return this.x(-n8) < f8 * f9;
    }

    private void U(int n8, int n9, int n10, boolean bl) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250L) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n11 = view.getHeight();
            int n12 = layoutParams.topMargin;
            int n13 = layoutParams.bottomMargin;
            int n14 = this.getHeight();
            int n15 = this.getPaddingTop();
            int n16 = this.getPaddingBottom();
            n8 = this.getScrollY();
            n9 = Math.max(0, Math.min(n9 + n8, Math.max(0, n11 + n12 + n13 - (n14 - n15 - n16))));
            this.d.startScroll(this.getScrollX(), n8, 0, n9 - n8, n10);
            this.N(bl);
        } else {
            if (!this.d.isFinished()) {
                this.a();
            }
            this.scrollBy(n8, n9);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean bl;
        if (ax.h0.d.b(this.e) != 0.0f) {
            ax.h0.d.d(this.e, 0.0f, motionEvent.getX() / (float)this.getWidth());
            bl = true;
        } else {
            bl = false;
        }
        if (ax.h0.d.b(this.f) != 0.0f) {
            ax.h0.d.d(this.f, 0.0f, 1.0f - motionEvent.getX() / (float)this.getWidth());
            return true;
        }
        return bl;
    }

    private void a() {
        this.d.abortAnimation();
        this.Z(1);
    }

    private boolean g() {
        int n8 = this.getOverScrollMode();
        return n8 == 0 || n8 == 1 && this.getScrollRange() > 0;
        {
        }
    }

    private boolean i() {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int j(int n8, int n9, int n10) {
        if (n9 < n10 && n8 >= 0) {
            if (n9 + n8 > n10) {
                return n10 - n9;
            }
            return n8;
        }
        return 0;
    }

    private void q(int n8) {
        if (n8 != 0) {
            if (this.n) {
                this.T(0, n8);
                return;
            }
            this.scrollBy(0, n8);
        }
    }

    private boolean r(int n8) {
        if (ax.h0.d.b(this.e) != 0.0f) {
            if (this.S(this.e, n8)) {
                this.e.onAbsorb(n8);
                return true;
            }
            this.v(-n8);
            return true;
        }
        if (ax.h0.d.b(this.f) != 0.0f) {
            EdgeEffect edgeEffect = this.f;
            if (this.S(edgeEffect, n8 = -n8)) {
                this.f.onAbsorb(n8);
                return true;
            }
            this.v(n8);
            return true;
        }
        return false;
    }

    private void s() {
        this.r = -1;
        this.k = false;
        this.L();
        this.Z(0);
        this.e.onRelease();
        this.f.onRelease();
    }

    private View u(boolean bl, int n8, int n9) {
        ArrayList arrayList = this.getFocusables(2);
        int n10 = arrayList.size();
        View view = null;
        boolean bl2 = false;
        for (int i8 = 0; i8 < n10; ++i8) {
            boolean bl3;
            View view2;
            block3: {
                View view3;
                block6: {
                    int n11;
                    block7: {
                        boolean bl4;
                        block5: {
                            int n12;
                            block4: {
                                view3 = (View)arrayList.get(i8);
                                n12 = view3.getTop();
                                n11 = view3.getBottom();
                                view2 = view;
                                bl3 = bl2;
                                if (n8 >= n11) break block3;
                                view2 = view;
                                bl3 = bl2;
                                if (n12 >= n9) break block3;
                                bl4 = n8 < n12 && n11 < n9;
                                if (view != null) break block4;
                                view2 = view3;
                                bl3 = bl4;
                                break block3;
                            }
                            n11 = bl && n12 < view.getTop() || !bl && n11 > view.getBottom() ? 1 : 0;
                            if (!bl2) break block5;
                            view2 = view;
                            bl3 = bl2;
                            if (!bl4) break block3;
                            view2 = view;
                            bl3 = bl2;
                            if (n11 == 0) break block3;
                            break block6;
                        }
                        if (!bl4) break block7;
                        view2 = view3;
                        bl3 = true;
                        break block3;
                    }
                    view2 = view;
                    bl3 = bl2;
                    if (n11 == 0) break block3;
                }
                view2 = view3;
                bl3 = bl2;
            }
            view = view2;
            bl2 = bl3;
        }
        return view;
    }

    private float x(int n8) {
        double d8 = Math.log((float)Math.abs(n8) * 0.35f / (this.a * 0.015f));
        float f8 = D;
        double d9 = f8;
        return (float)((double)(this.a * 0.015f) * Math.exp((double)f8 / (d9 - 1.0) * d8));
    }

    private boolean z(int n8, int n9) {
        if (this.getChildCount() > 0) {
            int n10 = this.getScrollY();
            View view = this.getChildAt(0);
            if (n9 >= view.getTop() - n10 && n9 < view.getBottom() - n10 && n8 >= view.getLeft() && n8 < view.getRight()) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    boolean J(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, boolean var9_9) {
        var12_10 = this.getOverScrollMode();
        var11_11 = this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent();
        var10_12 = this.computeVerticalScrollRange() > this.computeVerticalScrollExtent();
        var11_11 = var12_10 == 0 || var12_10 == 1 && var11_11;
        var10_12 = var12_10 == 0 || var12_10 == 1 && var10_12;
        var3_3 += var1_1;
        var1_1 = var11_11 == false ? 0 : var7_7;
        var4_4 += var2_2;
        var2_2 = var10_12 == false ? 0 : var8_8;
        var7_7 = -var1_1;
        var1_1 += var5_5;
        var5_5 = -var2_2;
        var6_6 = var2_2 + var6_6;
        if (var3_3 > var1_1) lbl-1000:
        // 2 sources

        {
            while (true) {
                var9_9 = true;
                var2_2 = var1_1;
                break;
            }
        } else {
            if (var3_3 < var7_7) {
                var1_1 = var7_7;
                ** continue;
            }
            var9_9 = false;
            var2_2 = var3_3;
        }
        if (var4_4 > var6_6) {
            var1_1 = var6_6;
lbl26:
            // 2 sources

            while (true) {
                var13_13 = true;
                break;
            }
        } else {
            if (var4_4 < var5_5) {
                var1_1 = var5_5;
                ** continue;
            }
            var13_13 = false;
            var1_1 = var4_4;
        }
        if (var13_13 && !this.y(1)) {
            this.d.springBack(var2_2, var1_1, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(var2_2, var1_1, var9_9, var13_13);
        return var9_9 || var13_13;
        {
        }
    }

    public boolean K(int n8) {
        Rect rect;
        int n9 = n8 == 130 ? 1 : 0;
        int n10 = this.getHeight();
        if (n9 != 0) {
            this.c.top = this.getScrollY() + n10;
            n9 = this.getChildCount();
            if (n9 > 0) {
                View view = this.getChildAt(n9 - 1);
                rect = (FrameLayout.LayoutParams)view.getLayoutParams();
                n9 = view.getBottom() + rect.bottomMargin + this.getPaddingBottom();
                rect = this.c;
                if (rect.top + n10 > n9) {
                    rect.top = n9 - n10;
                }
            }
        } else {
            this.c.top = this.getScrollY() - n10;
            rect = this.c;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        rect = this.c;
        n9 = rect.top;
        rect.bottom = n10 += n9;
        return this.O(n8, n9, n10);
    }

    public final void T(int n8, int n9) {
        this.U(n8, n9, 250, false);
    }

    void V(int n8, int n9, int n10, boolean bl) {
        this.U(n8 - this.getScrollX(), n9 - this.getScrollY(), n10, bl);
    }

    void W(int n8, int n9, boolean bl) {
        this.V(n8, n9, 250, bl);
    }

    public boolean X(int n8, int n9) {
        return this.y.p(n8, n9);
    }

    public void Z(int n8) {
        this.y.r(n8);
    }

    public void addView(View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int n8) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public void b(View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        this.H(n11, n12, nArray);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        int n8;
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int n9 = this.d.getCurrY();
        int n10 = this.l(n9 - this.v);
        this.v = n9;
        int[] nArray = this.t;
        nArray[1] = 0;
        this.m(0, n10, nArray, null, 1);
        n9 = n10 - this.t[1];
        n10 = this.getScrollRange();
        if (n9 != 0) {
            n8 = this.getScrollY();
            this.J(0, n9, this.getScrollX(), n8, 0, n10, 0, 0, false);
            n8 = this.getScrollY() - n8;
            nArray = this.t;
            nArray[1] = 0;
            this.n(0, n8, 0, n9 -= n8, this.s, 1, nArray);
            n9 -= this.t[1];
        }
        if (n9 != 0) {
            n8 = this.getOverScrollMode();
            if (n8 == 0 || n8 == 1 && n10 > 0) {
                if (n9 < 0) {
                    if (this.e.isFinished()) {
                        this.e.onAbsorb((int)this.d.getCurrVelocity());
                    }
                } else if (this.f.isFinished()) {
                    this.f.onAbsorb((int)this.d.getCurrVelocity());
                }
            }
            this.a();
        }
        if (!this.d.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.Z(1);
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int n8 = this.getChildCount();
        int n9 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (n8 == 0) {
            return n9;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n8 = view.getBottom() + layoutParams.bottomMargin;
        int n10 = this.getScrollY();
        int n11 = Math.max(0, n8 - n9);
        if (n10 < 0) {
            return n8 - n10;
        }
        n9 = n8;
        if (n10 > n11) {
            n9 = n8 + (n10 - n11);
        }
        return n9;
    }

    public boolean d(int n8) {
        View view;
        View view2 = view = this.findFocus();
        if (view == this) {
            view2 = null;
        }
        view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, n8);
        int n9 = this.getMaxScrollAmount();
        if (view != null && this.G(view, n9, this.getHeight())) {
            view.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view, this.c);
            this.P(this.k(this.c), 0, 1, true);
            view.requestFocus(n8);
        } else {
            int n10;
            if (n8 == 33 && this.getScrollY() < n9) {
                n10 = this.getScrollY();
            } else {
                n10 = n9;
                if (n8 == 130) {
                    n10 = n9;
                    if (this.getChildCount() > 0) {
                        View view3 = this.getChildAt(0);
                        view = (FrameLayout.LayoutParams)view3.getLayoutParams();
                        n10 = Math.min(view3.getBottom() + view.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), n9);
                    }
                }
            }
            if (n10 == 0) {
                return false;
            }
            if (n8 != 130) {
                n10 = -n10;
            }
            this.P(n10, 0, 1, true);
        }
        if (view2 != null && view2.isFocused() && this.E(view2)) {
            n8 = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(n8);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.t(keyEvent);
        {
        }
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean bl) {
        return this.y.a(f8, f9, bl);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.y.b(f8, f9);
    }

    public boolean dispatchNestedPreScroll(int n8, int n9, int[] nArray, int[] nArray2) {
        return this.m(n8, n9, nArray, nArray2, 0);
    }

    public boolean dispatchNestedScroll(int n8, int n9, int n10, int n11, int[] nArray) {
        return this.y.f(n8, n9, n10, n11, nArray);
    }

    public void draw(Canvas canvas) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        super.draw(canvas);
        int n15 = this.getScrollY();
        boolean bl = this.e.isFinished();
        int n16 = 0;
        if (!bl) {
            n14 = canvas.save();
            n13 = this.getWidth();
            n12 = this.getHeight();
            n11 = Math.min(0, n15);
            if (androidx.core.widget.NestedScrollView$b.a((ViewGroup)this)) {
                n13 -= this.getPaddingLeft() + this.getPaddingRight();
                n10 = this.getPaddingLeft();
            } else {
                n10 = 0;
            }
            n9 = n12;
            n8 = n11;
            if (androidx.core.widget.NestedScrollView$b.a((ViewGroup)this)) {
                n9 = n12 - (this.getPaddingTop() + this.getPaddingBottom());
                n8 = n11 + this.getPaddingTop();
            }
            canvas.translate((float)n10, (float)n8);
            this.e.setSize(n13, n9);
            if (this.e.draw(canvas)) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n14);
        }
        if (!this.f.isFinished()) {
            n14 = canvas.save();
            n8 = this.getWidth();
            n11 = this.getHeight();
            n12 = Math.max(this.getScrollRange(), n15) + n11;
            n10 = n16;
            n13 = n8;
            if (androidx.core.widget.NestedScrollView$b.a((ViewGroup)this)) {
                n13 = n8 - (this.getPaddingLeft() + this.getPaddingRight());
                n10 = this.getPaddingLeft();
            }
            n9 = n12;
            n8 = n11;
            if (androidx.core.widget.NestedScrollView$b.a((ViewGroup)this)) {
                n8 = n11 - (this.getPaddingTop() + this.getPaddingBottom());
                n9 = n12 - this.getPaddingBottom();
            }
            canvas.translate((float)(n10 - n13), (float)n9);
            canvas.rotate(180.0f, (float)n13, 0.0f);
            this.f.setSize(n13, n8);
            if (this.f.draw(canvas)) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n14);
        }
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        this.H(n11, n12, null);
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        return (n8 & 2) != 0;
    }

    protected float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n8 = this.getVerticalFadingEdgeLength();
        int n9 = this.getHeight();
        int n10 = this.getPaddingBottom();
        n10 = view.getBottom() + layoutParams.bottomMargin - this.getScrollY() - (n9 - n10);
        if (n10 < n8) {
            return (float)n10 / (float)n8;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int)((float)this.getHeight() * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.x.a();
    }

    int getScrollRange() {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            return Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    protected float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        int n8 = this.getVerticalFadingEdgeLength();
        int n9 = this.getScrollY();
        if (n9 < n8) {
            return (float)n9 / (float)n8;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = this.getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.z;
    }

    @Override
    public void h(View view, View view2, int n8, int n9) {
        this.x.c(view, view2, n8, n9);
        this.X(2, n9);
    }

    public boolean hasNestedScrollingParent() {
        return this.y(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.l();
    }

    protected int k(Rect rect) {
        if (this.getChildCount() == 0) {
            return 0;
        }
        int n8 = this.getHeight();
        int n9 = this.getScrollY();
        int n10 = n9 + n8;
        int n11 = this.getVerticalFadingEdgeLength();
        int n12 = n9;
        if (rect.top > 0) {
            n12 = n9 + n11;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n11 = rect.bottom;
        n9 = rect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin ? n10 - n11 : n10;
        if (n11 > n9 && rect.top > n12) {
            n12 = rect.height() > n8 ? rect.top - n12 : rect.bottom - n9;
            return Math.min(n12, view.getBottom() + layoutParams.bottomMargin - n10);
        }
        if (rect.top < n12 && n11 < n9) {
            n12 = rect.height() > n8 ? 0 - (n9 - rect.bottom) : 0 - (n12 - rect.top);
            return Math.max(n12, -this.getScrollY());
        }
        return 0;
    }

    int l(int n8) {
        int n9 = this.getHeight();
        if (n8 > 0 && ax.h0.d.b(this.e) != 0.0f) {
            float f8 = (float)(-n8) * 4.0f / (float)n9;
            int n10 = Math.round((float)(-n9) / 4.0f * ax.h0.d.d(this.e, f8, 0.5f));
            if (n10 != n8) {
                this.e.finish();
            }
            return n8 - n10;
        }
        int n11 = n8;
        if (n8 < 0) {
            n11 = n8;
            if (ax.h0.d.b(this.f) != 0.0f) {
                float f9 = n8;
                float f10 = n9;
                n11 = Math.round(f10 / 4.0f * ax.h0.d.d(this.f, f9 = f9 * 4.0f / f10, 0.5f));
                if (n11 != n8) {
                    this.f.finish();
                }
                n11 = n8 - n11;
            }
        }
        return n11;
    }

    public boolean m(int n8, int n9, int[] nArray, int[] nArray2, int n10) {
        return this.y.d(n8, n9, nArray, nArray2, n10);
    }

    protected void measureChild(View view, int n8, int n9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight()), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
    }

    protected void measureChildWithMargins(View view, int n8, int n9, int n10, int n11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9), (int)marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec((int)(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), (int)0));
    }

    public void n(int n8, int n9, int n10, int n11, int[] nArray, int n12, int[] nArray2) {
        this.y.e(n8, n9, n10, n11, nArray, n12, nArray2);
    }

    @Override
    public void o(View view, int n8) {
        this.x.e(view, n8);
        this.Z(n8);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 8 && !this.k) {
            int n8;
            float f8;
            int n9;
            if (ax.c0.C.e(motionEvent, 2)) {
                n9 = 9;
                f8 = motionEvent.getAxisValue(9);
                n8 = (int)motionEvent.getX();
            } else if (ax.c0.C.e(motionEvent, 0x400000)) {
                f8 = motionEvent.getAxisValue(26);
                n8 = this.getWidth() / 2;
                n9 = 26;
            } else {
                n9 = 0;
                f8 = 0.0f;
                n8 = 0;
            }
            if (f8 != 0.0f) {
                int n10 = (int)(f8 * this.getVerticalScrollFactorCompat());
                boolean bl = ax.c0.C.e(motionEvent, 8194);
                this.P(-n10, n8, 1, bl);
                if (n9 != 0) {
                    this.C.g(motionEvent, n9);
                }
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent object) {
        int n8 = object.getAction();
        boolean bl = true;
        boolean bl2 = true;
        if (n8 == 2 && this.k) {
            return true;
        }
        if ((n8 &= 0xFF) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 6) return this.k;
                        this.I((MotionEvent)object);
                        return this.k;
                    }
                } else {
                    int n9 = this.r;
                    if (n9 == -1) return this.k;
                    n8 = object.findPointerIndex(n9);
                    if (n8 == -1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid pointerId=");
                        ((StringBuilder)object).append(n9);
                        ((StringBuilder)object).append(" in onInterceptTouchEvent");
                        Log.e((String)"NestedScrollView", (String)((StringBuilder)object).toString());
                        return this.k;
                    } else {
                        if (Math.abs((n8 = (int)object.getY(n8)) - this.g) <= this.o || (2 & this.getNestedScrollAxes()) != 0) return this.k;
                        this.k = true;
                        this.g = n8;
                        this.C();
                        this.l.addMovement((MotionEvent)object);
                        this.u = 0;
                        object = this.getParent();
                        if (object == null) return this.k;
                        object.requestDisallowInterceptTouchEvent(true);
                    }
                    return this.k;
                }
            }
            this.k = false;
            this.r = -1;
            this.L();
            if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                this.postInvalidateOnAnimation();
            }
            this.Z(0);
            return this.k;
        }
        n8 = (int)object.getY();
        if (!this.z((int)object.getX(), n8)) {
            boolean bl3 = bl2;
            if (!this.Y((MotionEvent)object)) {
                bl3 = !this.d.isFinished() ? bl2 : false;
            }
            this.k = bl3;
            this.L();
            return this.k;
        } else {
            this.g = n8;
            this.r = object.getPointerId(0);
            this.A();
            this.l.addMovement((MotionEvent)object);
            this.d.computeScrollOffset();
            boolean bl4 = bl;
            if (!this.Y((MotionEvent)object)) {
                bl4 = !this.d.isFinished() ? bl : false;
            }
            this.k = bl4;
            this.X(2, 0);
        }
        return this.k;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        n8 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && NestedScrollView.F(view, (View)this)) {
            this.Q(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                this.scrollTo(this.getScrollX(), this.w.q);
                this.w = null;
            }
            if (this.getChildCount() > 0) {
                view = this.getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                n8 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int n12 = this.getPaddingTop();
            int n13 = this.getPaddingBottom();
            n10 = this.getScrollY();
            n8 = NestedScrollView.j(n10, n11 - n9 - n12 - n13, n8);
            if (n8 != n10) {
                this.scrollTo(this.getScrollX(), n8);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.i = true;
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (this.m && View.MeasureSpec.getMode((int)n9) != 0 && this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n10 = view.getMeasuredHeight();
            if (n10 < (n9 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin)) {
                view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)n9, (int)0x40000000));
            }
        }
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        if (!bl) {
            this.dispatchNestedFling(0.0f, f9, true);
            this.v((int)f9);
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return this.dispatchNestedPreFling(f8, f9);
    }

    public void onNestedPreScroll(View view, int n8, int n9, int[] nArray) {
        this.p(view, n8, n9, nArray, 0);
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.H(n11, 0, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int n8) {
        this.h(view, view2, n8, 0);
    }

    protected void onOverScrolled(int n8, int n9, boolean bl, boolean bl2) {
        super.scrollTo(n8, n9);
    }

    protected boolean onRequestFocusInDescendants(int n8, Rect rect) {
        int n9;
        if (n8 == 2) {
            n9 = 130;
        } else {
            n9 = n8;
            if (n8 == 1) {
                n9 = 33;
            }
        }
        View view = rect == null ? FocusFinder.getInstance().findNextFocus((ViewGroup)this, null, n9) : FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n9);
        if (view == null) {
            return false;
        }
        if (this.E(view)) {
            return false;
        }
        return view.requestFocus(n9, rect);
    }

    protected void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof e)) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (e)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.w = object;
        this.requestLayout();
    }

    protected Parcelable onSaveInstanceState() {
        e e8 = new e(super.onSaveInstanceState());
        e8.q = this.getScrollY();
        return e8;
    }

    protected void onScrollChanged(int n8, int n9, int n10, int n11) {
        super.onScrollChanged(n8, n9, n10, n11);
        d d8 = this.A;
        if (d8 != null) {
            d8.a(this, n8, n9, n10, n11);
        }
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        View view = this.findFocus();
        if (view != null && this != view && this.G(view, 0, n11)) {
            view.getDrawingRect(this.c);
            this.offsetDescendantRectToMyCoords(view, this.c);
            this.q(this.k(this.c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        return this.f(view, view2, n8, 0);
    }

    public void onStopNestedScroll(View view) {
        this.o(view, 0);
    }

    public boolean onTouchEvent(MotionEvent object) {
        this.C();
        int n8 = object.getActionMasked();
        if (n8 == 0) {
            this.u = 0;
        }
        MotionEvent motionEvent = MotionEvent.obtain((MotionEvent)object);
        motionEvent.offsetLocation(0.0f, (float)this.u);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 5) {
                            if (n8 == 6) {
                                this.I((MotionEvent)object);
                                this.g = (int)object.getY(object.findPointerIndex(this.r));
                            }
                        } else {
                            n8 = object.getActionIndex();
                            this.g = (int)object.getY(n8);
                            this.r = object.getPointerId(n8);
                        }
                    } else {
                        if (this.k && this.getChildCount() > 0 && this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                            this.postInvalidateOnAnimation();
                        }
                        this.s();
                    }
                } else {
                    int n9 = object.findPointerIndex(this.r);
                    if (n9 == -1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid pointerId=");
                        ((StringBuilder)object).append(this.r);
                        ((StringBuilder)object).append(" in onTouchEvent");
                        Log.e((String)"NestedScrollView", (String)((StringBuilder)object).toString());
                    } else {
                        int n10;
                        int n11 = (int)object.getY(n9);
                        n8 = this.g - n11;
                        n8 = n10 = n8 - this.M(n8, object.getX(n9));
                        if (!this.k) {
                            n8 = n10;
                            if (Math.abs(n10) > this.o) {
                                ViewParent viewParent = this.getParent();
                                if (viewParent != null) {
                                    viewParent.requestDisallowInterceptTouchEvent(true);
                                }
                                this.k = true;
                                n8 = n10 > 0 ? n10 - this.o : n10 + this.o;
                            }
                        }
                        if (this.k) {
                            n8 = this.P(n8, (int)object.getX(n9), 0, false);
                            this.g = n11 - n8;
                            this.u += n8;
                        }
                    }
                }
            } else {
                object = this.l;
                object.computeCurrentVelocity(1000, (float)this.q);
                n8 = (int)object.getYVelocity(this.r);
                if (Math.abs(n8) >= this.p) {
                    float f8;
                    if (!this.r(n8) && !this.dispatchNestedPreFling(0.0f, f8 = (float)(n8 = -n8))) {
                        this.dispatchNestedFling(0.0f, f8, true);
                        this.v(n8);
                    }
                } else if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    this.postInvalidateOnAnimation();
                }
                this.s();
            }
        } else {
            ViewParent viewParent;
            if (this.getChildCount() == 0) {
                return false;
            }
            if (this.k && (viewParent = this.getParent()) != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                this.a();
            }
            this.D((int)object.getY(), object.getPointerId(0));
        }
        object = this.l;
        if (object != null) {
            object.addMovement(motionEvent);
        }
        motionEvent.recycle();
        return true;
    }

    @Override
    public void p(View view, int n8, int n9, int[] nArray, int n10) {
        this.m(n8, n9, nArray, null, n10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            this.Q(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return this.R(rect, bl);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        if (bl) {
            this.L();
        }
        super.requestDisallowInterceptTouchEvent(bl);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void scrollTo(int n8, int n9) {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n10 = this.getWidth();
            int n11 = this.getPaddingLeft();
            int n12 = this.getPaddingRight();
            int n13 = view.getWidth();
            int n14 = layoutParams.leftMargin;
            int n15 = layoutParams.rightMargin;
            int n16 = this.getHeight();
            int n17 = this.getPaddingTop();
            int n18 = this.getPaddingBottom();
            int n19 = view.getHeight();
            int n20 = layoutParams.topMargin;
            int n21 = layoutParams.bottomMargin;
            n8 = NestedScrollView.j(n8, n10 - n11 - n12, n13 + n14 + n15);
            n9 = NestedScrollView.j(n9, n16 - n17 - n18, n19 + n20 + n21);
            if (n8 != this.getScrollX() || n9 != this.getScrollY()) {
                super.scrollTo(n8, n9);
            }
        }
    }

    public void setFillViewport(boolean bl) {
        if (bl != this.m) {
            this.m = bl;
            this.requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean bl) {
        this.y.m(bl);
    }

    public void setOnScrollChangeListener(d d8) {
        this.A = d8;
    }

    public void setSmoothScrollingEnabled(boolean bl) {
        this.n = bl;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int n8) {
        return this.X(n8, 0);
    }

    public void stopNestedScroll() {
        this.Z(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t(KeyEvent keyEvent) {
        this.c.setEmpty();
        boolean bl = this.i();
        int n8 = 130;
        if (!bl) {
            if (!this.isFocused() || keyEvent.getKeyCode() == 4) return false;
            View view = this.findFocus();
            keyEvent = view;
            if (view == this) {
                keyEvent = null;
            }
            if ((keyEvent = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)keyEvent, 130)) == null || keyEvent == this || !keyEvent.requestFocus(130)) return false;
            return true;
        }
        if (keyEvent.getAction() != 0) return false;
        int n9 = keyEvent.getKeyCode();
        if (n9 != 19) {
            if (n9 != 20) {
                if (n9 != 62) {
                    if (n9 == 92) return this.w(33);
                    if (n9 == 93) return this.w(130);
                    if (n9 != 122) {
                        if (n9 != 123) return false;
                        this.K(130);
                        return false;
                    }
                    this.K(33);
                    return false;
                }
                if (keyEvent.isShiftPressed()) {
                    n8 = 33;
                }
                this.K(n8);
                return false;
            }
            if (!keyEvent.isAltPressed()) return this.d(130);
            return this.w(130);
        }
        if (!keyEvent.isAltPressed()) return this.d(33);
        return this.w(33);
    }

    public void v(int n8) {
        if (this.getChildCount() > 0) {
            this.d.fling(this.getScrollX(), this.getScrollY(), 0, n8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.N(true);
        }
    }

    public boolean w(int n8) {
        int n9 = n8 == 130 ? 1 : 0;
        int n10 = this.getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = n10;
        if (n9 != 0 && (n9 = this.getChildCount()) > 0) {
            rect = this.getChildAt(n9 - 1);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
            this.c.bottom = rect.getBottom() + layoutParams.bottomMargin + this.getPaddingBottom();
            rect = this.c;
            rect.top = rect.bottom - n10;
        }
        rect = this.c;
        return this.O(n8, rect.top, rect.bottom);
    }

    public boolean y(int n8) {
        return this.y.k(n8);
    }

    static class a
    extends ax.c0.a {
        a() {
        }

        @Override
        public void f(View object, AccessibilityEvent accessibilityEvent) {
            super.f((View)object, accessibilityEvent);
            object = (NestedScrollView)object;
            accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
            boolean bl = ((NestedScrollView)object).getScrollRange() > 0;
            accessibilityEvent.setScrollable(bl);
            accessibilityEvent.setScrollX(object.getScrollX());
            accessibilityEvent.setScrollY(object.getScrollY());
            L.a((AccessibilityRecord)accessibilityEvent, object.getScrollX());
            L.b((AccessibilityRecord)accessibilityEvent, ((NestedScrollView)object).getScrollRange());
        }

        @Override
        public void g(View object, ax.d0.H h8) {
            int n8;
            super.g((View)object, h8);
            object = (NestedScrollView)object;
            h8.m0(ScrollView.class.getName());
            if (object.isEnabled() && (n8 = ((NestedScrollView)object).getScrollRange()) > 0) {
                h8.G0(true);
                if (object.getScrollY() > 0) {
                    h8.b(H.a.r);
                    h8.b(H.a.C);
                }
                if (object.getScrollY() < n8) {
                    h8.b(H.a.q);
                    h8.b(H.a.E);
                }
            }
        }

        @Override
        public boolean j(View object, int n8, Bundle bundle) {
            if (super.j((View)object, n8, bundle)) {
                return true;
            }
            if (!(object = (NestedScrollView)object).isEnabled()) {
                return false;
            }
            int n9 = object.getHeight();
            bundle = new Rect();
            int n10 = n9;
            if (object.getMatrix().isIdentity()) {
                n10 = n9;
                if (object.getGlobalVisibleRect((Rect)bundle)) {
                    n10 = bundle.height();
                }
            }
            if (n8 != 4096) {
                if (n8 != 8192 && n8 != 16908344) {
                    if (n8 != 16908346) {
                        return false;
                    }
                } else {
                    n9 = object.getPaddingBottom();
                    n8 = object.getPaddingTop();
                    n8 = Math.max(object.getScrollY() - (n10 - n9 - n8), 0);
                    if (n8 != object.getScrollY()) {
                        ((NestedScrollView)object).W(0, n8, true);
                        return true;
                    }
                    return false;
                }
            }
            n8 = object.getPaddingBottom();
            n9 = object.getPaddingTop();
            n8 = Math.min(object.getScrollY() + (n10 - n8 - n9), ((NestedScrollView)object).getScrollRange());
            if (n8 != object.getScrollY()) {
                ((NestedScrollView)object).W(0, n8, true);
                return true;
            }
            return false;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c
    implements p {
        final NestedScrollView a;

        c(NestedScrollView nestedScrollView) {
            this.a = nestedScrollView;
        }

        @Override
        public boolean a(float f8) {
            if (f8 == 0.0f) {
                return false;
            }
            this.c();
            this.a.v((int)f8);
            return true;
        }

        @Override
        public float b() {
            return -this.a.getVerticalScrollFactorCompat();
        }

        @Override
        public void c() {
            this.a.d.abortAnimation();
        }
    }

    public static interface d {
        public void a(NestedScrollView var1, int var2, int var3, int var4, int var5);
    }

    static class e
    extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>(){

            public e a(Parcel parcel) {
                return new e(parcel);
            }

            public e[] b(int n8) {
                return new e[n8];
            }
        };
        public int q;

        e(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt();
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode((Object)this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.q);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.q);
        }
    }
}

