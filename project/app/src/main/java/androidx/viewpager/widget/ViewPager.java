/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.viewpager.widget.a;
import ax.Q.b;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.d0;
import ax.d0.H;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
extends ViewGroup {
    static final int[] h0 = new int[]{16842931};
    private static final Comparator<f> i0 = new Comparator<f>(){

        public int a(f f8, f f9) {
            return f8.b - f9.b;
        }
    };
    private static final Interpolator j0 = new Interpolator(){

        public float getInterpolation(float f8) {
            return (f8 -= 1.0f) * f8 * f8 * f8 * f8 + 1.0f;
        }
    };
    private static final o k0 = new o();
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H = -1;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private EdgeEffect O;
    private EdgeEffect P;
    private boolean Q = true;
    private boolean R = false;
    private boolean S;
    private int T;
    private List<j> U;
    private j V;
    private j W;
    private int a;
    private List<i> a0;
    private final ArrayList<f> b = new ArrayList();
    private k b0;
    private final f c = new f();
    private int c0;
    private final Rect d = new Rect();
    private int d0;
    a e;
    private ArrayList<View> e0;
    int f;
    private final Runnable f0;
    private int g = -1;
    private int g0 = 0;
    private Parcelable h = null;
    private ClassLoader i = null;
    private Scroller j;
    private boolean k;
    private l l;
    private int m;
    private Drawable n;
    private int o;
    private int p;
    private float q = -3.4028235E38f;
    private float r = Float.MAX_VALUE;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x = 1;
    private boolean y;
    private boolean z;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = new Runnable(this){
            final ViewPager q;
            {
                this.q = viewPager;
            }

            @Override
            public void run() {
                this.q.setScrollState(0);
                this.q.E();
            }
        };
        this.v();
    }

    private boolean C(int n8) {
        if (this.b.size() == 0) {
            if (this.Q) {
                return false;
            }
            this.S = false;
            this.y(0, 0.0f, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f f8 = this.t();
        int n9 = this.getClientWidth();
        int n10 = this.m;
        float f9 = n10;
        float f10 = n9;
        f9 /= f10;
        int n11 = f8.b;
        f10 = ((float)n8 / f10 - f8.e) / (f8.d + f9);
        n8 = (int)((float)(n9 + n10) * f10);
        this.S = false;
        this.y(n11, f10, n8);
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean D(float f8) {
        boolean bl;
        int n8;
        float f9 = this.D;
        this.D = f8;
        float f10 = (float)this.getScrollX() + (f9 - f8);
        float f11 = this.getClientWidth();
        f8 = this.q * f11;
        f9 = this.r * f11;
        Object object = this.b;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        object = ((ArrayList)object).get(0);
        Object object2 = this.b;
        object2 = ((ArrayList)object2).get(((ArrayList)object2).size() - 1);
        if (((f)object).b != 0) {
            f8 = ((f)object).e * f11;
            n8 = 0;
        } else {
            n8 = 1;
        }
        if (((f)object2).b != this.e.e() - 1) {
            f9 = ((f)object2).e * f11;
            bl = false;
        } else {
            bl = true;
        }
        if (f10 < f8) {
            if (n8 != 0) {
                this.O.onPull(Math.abs(f8 - f10) / f11);
                bl4 = true;
            }
        } else {
            bl4 = bl3;
            f8 = f10;
            if (f10 > f9) {
                bl4 = bl2;
                if (bl) {
                    this.P.onPull(Math.abs(f10 - f9) / f11);
                    bl4 = true;
                }
                f8 = f9;
            }
        }
        f9 = this.D;
        n8 = (int)f8;
        this.D = f9 + (f8 - (float)n8);
        this.scrollTo(n8, this.getScrollY());
        this.C(n8);
        return bl4;
    }

    private void G(int n8, int n9, int n10, int n11) {
        if (n9 > 0 && !this.b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(this.getCurrentItem() * this.getClientWidth());
                return;
            }
            int n12 = this.getPaddingLeft();
            int n13 = this.getPaddingRight();
            int n14 = this.getPaddingLeft();
            int n15 = this.getPaddingRight();
            this.scrollTo((int)((float)this.getScrollX() / (float)(n9 - n14 - n15 + n11) * (float)(n8 - n12 - n13 + n10)), this.getScrollY());
            return;
        }
        f f8 = this.u(this.f);
        float f9 = f8 != null ? Math.min(f8.e, this.r) : 0.0f;
        n8 = (int)(f9 * (float)(n8 - this.getPaddingLeft() - this.getPaddingRight()));
        if (n8 != this.getScrollX()) {
            this.g(false);
            this.scrollTo(n8, this.getScrollY());
        }
    }

    private void H() {
        int n8 = 0;
        while (n8 < this.getChildCount()) {
            int n9 = n8;
            if (!((g)this.getChildAt((int)n8).getLayoutParams()).a) {
                this.removeViewAt(n8);
                n9 = n8 - 1;
            }
            n8 = n9 + 1;
        }
    }

    private void K(boolean bl) {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(bl);
        }
    }

    private boolean L() {
        this.H = -1;
        this.o();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
        {
        }
    }

    private void M(int n8, boolean bl, int n9, boolean bl2) {
        f f8 = this.u(n8);
        int n10 = f8 != null ? (int)((float)this.getClientWidth() * Math.max(this.q, Math.min(f8.e, this.r))) : 0;
        if (bl) {
            this.S(n10, 0, n9);
            if (bl2) {
                this.k(n8);
            }
            return;
        }
        if (bl2) {
            this.k(n8);
        }
        this.g(false);
        this.scrollTo(n10, 0);
        this.C(n10);
    }

    private void T() {
        if (this.d0 != 0) {
            View view = this.e0;
            if (view == null) {
                this.e0 = new ArrayList();
            } else {
                view.clear();
            }
            int n8 = this.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                view = this.getChildAt(i8);
                this.e0.add(view);
            }
            Collections.sort(this.e0, k0);
        }
    }

    private void e(f f8, int n8, f f9) {
        float f10;
        int n9;
        float f11;
        int n10;
        int n11 = this.e.e();
        int n12 = this.getClientWidth();
        float f12 = n12 > 0 ? (float)this.m / (float)n12 : 0.0f;
        if (f9 != null) {
            n12 = f9.b;
            n10 = f8.b;
            if (n12 < n10) {
                f11 = f9.e + f9.d + f12;
                ++n12;
                n10 = 0;
                while (n12 <= f8.b && n10 < this.b.size()) {
                    f9 = this.b.get(n10);
                    while (true) {
                        n9 = n12;
                        f10 = f11;
                        if (n12 <= f9.b) break;
                        n9 = n12;
                        f10 = f11;
                        if (n10 >= this.b.size() - 1) break;
                        f9 = this.b.get(++n10);
                    }
                    while (n9 < f9.b) {
                        f10 += this.e.h(n9) + f12;
                        ++n9;
                    }
                    f9.e = f10;
                    f11 = f10 + (f9.d + f12);
                    n12 = n9 + 1;
                }
            } else if (n12 > n10) {
                n10 = this.b.size() - 1;
                f11 = f9.e;
                --n12;
                while (n12 >= f8.b && n10 >= 0) {
                    f9 = this.b.get(n10);
                    while (true) {
                        n9 = n12;
                        f10 = f11;
                        if (n12 >= f9.b) break;
                        n9 = n12;
                        f10 = f11;
                        if (n10 <= 0) break;
                        f9 = this.b.get(--n10);
                    }
                    while (n9 > f9.b) {
                        f10 -= this.e.h(n9) + f12;
                        --n9;
                    }
                    f9.e = f11 = f10 - (f9.d + f12);
                    n12 = n9 - 1;
                }
            }
        }
        n9 = this.b.size();
        f11 = f8.e;
        n10 = f8.b;
        n12 = n10 - 1;
        f10 = n10 == 0 ? f11 : -3.4028235E38f;
        this.q = f10;
        f10 = n10 == --n11 ? f8.d + f11 - 1.0f : Float.MAX_VALUE;
        this.r = f10;
        n10 = n8 - 1;
        while (n10 >= 0) {
            int n13;
            f9 = this.b.get(n10);
            while (n12 > (n13 = f9.b)) {
                f11 -= this.e.h(n12) + f12;
                --n12;
            }
            f9.e = f11 -= f9.d + f12;
            if (n13 == 0) {
                this.q = f11;
            }
            --n10;
            --n12;
        }
        f11 = f8.e + f8.d + f12;
        n10 = f8.b + 1;
        n12 = n8 + 1;
        n8 = n10;
        while (n12 < n9) {
            f8 = this.b.get(n12);
            while (n8 < (n10 = f8.b)) {
                f11 += this.e.h(n8) + f12;
                ++n8;
            }
            if (n10 == n11) {
                this.r = f8.d + f11 - 1.0f;
            }
            f8.e = f11;
            f11 += f8.d + f12;
            ++n12;
            ++n8;
        }
        this.R = false;
    }

    private void g(boolean bl) {
        int n8;
        boolean bl2 = this.g0 == 2;
        if (bl2) {
            this.setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                n8 = this.getScrollX();
                int n9 = this.getScrollY();
                int n10 = this.j.getCurrX();
                int n11 = this.j.getCurrY();
                if (n8 != n10 || n9 != n11) {
                    this.scrollTo(n10, n11);
                    if (n10 != n8) {
                        this.C(n10);
                    }
                }
            }
        }
        this.w = false;
        for (n8 = 0; n8 < this.b.size(); ++n8) {
            f f8 = this.b.get(n8);
            if (!f8.c) continue;
            f8.c = false;
            bl2 = true;
        }
        if (bl2) {
            if (bl) {
                ax.c0.d0.d0((View)this, this.f0);
                return;
            }
            this.f0.run();
        }
    }

    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    private int i(int n8, float f8, int n9, int n10) {
        if (Math.abs(n10) > this.L && Math.abs(n9) > this.J) {
            if (n9 <= 0) {
                ++n8;
            }
        } else {
            float f9 = n8 >= this.f ? 0.4f : 0.6f;
            n8 += (int)(f8 + f9);
        }
        n9 = n8;
        if (this.b.size() > 0) {
            f f10 = this.b.get(0);
            Object object = this.b;
            object = ((ArrayList)object).get(((ArrayList)object).size() - 1);
            n9 = Math.max(f10.b, Math.min(n8, ((f)object).b));
        }
        return n9;
    }

    private void j(int n8, float f8, int n9) {
        Object object = this.V;
        if (object != null) {
            object.h(n8, f8, n9);
        }
        if ((object = this.U) != null) {
            int n10 = object.size();
            for (int i8 = 0; i8 < n10; ++i8) {
                object = this.U.get(i8);
                if (object == null) continue;
                object.h(n8, f8, n9);
            }
        }
        if ((object = this.W) != null) {
            object.h(n8, f8, n9);
        }
    }

    private void k(int n8) {
        Object object = this.V;
        if (object != null) {
            object.K(n8);
        }
        if ((object = this.U) != null) {
            int n9 = object.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                object = this.U.get(i8);
                if (object == null) continue;
                object.K(n8);
            }
        }
        if ((object = this.W) != null) {
            object.K(n8);
        }
    }

    private void l(int n8) {
        Object object = this.V;
        if (object != null) {
            object.e(n8);
        }
        if ((object = this.U) != null) {
            int n9 = object.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                object = this.U.get(i8);
                if (object == null) continue;
                object.e(n8);
            }
        }
        if ((object = this.W) != null) {
            object.e(n8);
        }
    }

    private void n(boolean bl) {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = bl ? this.c0 : 0;
            this.getChildAt(i8).setLayerType(n9, null);
        }
    }

    private void o() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private Rect q(Rect rect, View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        for (rect = view.getParent(); rect instanceof ViewGroup && rect != this; rect = rect.getParent()) {
            rect = (ViewGroup)rect;
            rect2.left += rect.getLeft();
            rect2.right += rect.getRight();
            rect2.top += rect.getTop();
            rect2.bottom += rect.getBottom();
        }
        return rect2;
    }

    private void setScrollingCacheEnabled(boolean bl) {
        if (this.v != bl) {
            this.v = bl;
        }
    }

    private f t() {
        int n8 = this.getClientWidth();
        float f8 = 0.0f;
        float f9 = n8 > 0 ? (float)this.getScrollX() / (float)n8 : 0.0f;
        float f10 = n8 > 0 ? (float)this.m / (float)n8 : 0.0f;
        f f11 = null;
        float f12 = 0.0f;
        int n9 = -1;
        n8 = 0;
        boolean bl = true;
        while (n8 < this.b.size()) {
            f f13 = this.b.get(n8);
            int n10 = n8;
            f f14 = f13;
            if (!bl) {
                int n11 = f13.b;
                n10 = n8;
                f14 = f13;
                if (n11 != ++n9) {
                    f14 = this.c;
                    f14.e = f8 + f12 + f10;
                    f14.b = n9;
                    f14.d = this.e.h(n9);
                    n10 = n8 - 1;
                }
            }
            f8 = f14.e;
            f12 = f14.d;
            if (!bl && !(f9 >= f8)) break;
            if (!(f9 < f12 + f8 + f10) && n10 != this.b.size() - 1) {
                n9 = f14.b;
                f12 = f14.d;
                n8 = n10 + 1;
                bl = false;
                f11 = f14;
                continue;
            }
            return f14;
        }
        return f11;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f8, float f9) {
        return f8 < (float)this.B && f9 > 0.0f || f8 > (float)(this.getWidth() - this.B) && f9 < 0.0f;
    }

    private void z(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n8) == this.H) {
            n8 = n8 == 0 ? 1 : 0;
            this.D = motionEvent.getX(n8);
            this.H = motionEvent.getPointerId(n8);
            motionEvent = this.I;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    boolean A() {
        int n8 = this.f;
        if (n8 > 0) {
            this.N(n8 - 1, true);
            return true;
        }
        return false;
    }

    boolean B() {
        a a8 = this.e;
        if (a8 != null && this.f < a8.e() - 1) {
            this.N(this.f + 1, true);
            return true;
        }
        return false;
    }

    void E() {
        this.F(this.f);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void F(int var1_1) {
        block21: {
            block20: {
                block22: {
                    block26: {
                        block17: {
                            var5_2 = this.f;
                            if (var5_2 != var1_1) {
                                var14_3 = this.u(var5_2);
                                this.f = var1_1;
                            } else {
                                var14_3 = null;
                            }
                            if (this.e == null) {
                                this.T();
                                return;
                            }
                            if (this.w) {
                                this.T();
                                return;
                            }
                            if (this.getWindowToken() == null) break block20;
                            this.e.t(this);
                            var1_1 = this.x;
                            var11_4 = Math.max(0, this.f - var1_1);
                            var9_5 = this.e.e();
                            var10_6 = Math.min(var9_5 - 1, this.f + var1_1);
                            if (var9_5 != this.a) break block21;
                            for (var1_1 = 0; var1_1 < this.b.size(); ++var1_1) {
                                var13_8 /* !! */  = this.b.get(var1_1);
                                var5_2 = var13_8 /* !! */ .b;
                                var6_7 = this.f;
                                if (var5_2 < var6_7) continue;
                                if (var5_2 != var6_7) break;
                                break block17;
                            }
                            var13_8 /* !! */  = null;
                        }
                        var15_11 = var13_8 /* !! */ ;
                        if (var13_8 /* !! */  == null) {
                            var15_11 = var13_8 /* !! */ ;
                            if (var9_5 > 0) {
                                var15_11 = this.a(this.f, var1_1);
                            }
                        }
                        if (var15_11 == null) break block22;
                        var5_2 = var1_1 - 1;
                        var13_8 /* !! */  = var5_2 >= 0 ? this.b.get(var5_2) : null;
                        var12_12 = this.getClientWidth();
                        var4_13 = var12_12 <= 0 ? 0.0f : 2.0f - var15_11.d + (float)this.getPaddingLeft() / (float)var12_12;
                        var3_15 = 0.0f;
                        var16_16 /* !! */  = var13_8 /* !! */ ;
                        for (var8_14 = this.f - 1; var8_14 >= 0; --var8_14) {
                            block18: {
                                block25: {
                                    block23: {
                                        block24: {
                                            if (!(var3_15 >= var4_13) || var8_14 >= var11_4) break block23;
                                            if (var16_16 /* !! */  == null) break;
                                            var6_7 = var1_1;
                                            var7_18 = var5_2;
                                            var13_8 /* !! */  = var16_16 /* !! */ ;
                                            var2_17 = var3_15;
                                            if (var8_14 != var16_16 /* !! */ .b) break block18;
                                            var6_7 = var1_1--;
                                            var7_18 = var5_2;
                                            var13_8 /* !! */  = var16_16 /* !! */ ;
                                            var2_17 = var3_15;
                                            if (var16_16 /* !! */ .c) break block18;
                                            this.b.remove(var5_2);
                                            this.e.b(this, var8_14, var16_16 /* !! */ .a);
                                            var6_7 = var1_1;
                                            var7_18 = --var5_2;
                                            var2_17 = var3_15;
                                            if (var5_2 < 0) break block24;
                                            var13_8 /* !! */  = this.b.get(var5_2);
                                            var2_17 = var3_15;
                                            ** GOTO lbl69
                                        }
lbl65:
                                        // 3 sources

                                        while (true) {
                                            var13_8 /* !! */  = null;
                                            var5_2 = var7_18;
                                            var1_1 = var6_7;
lbl69:
                                            // 4 sources

                                            while (true) {
                                                var6_7 = var1_1;
                                                var7_18 = var5_2;
                                                break block18;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    if (var16_16 /* !! */  == null || var8_14 != var16_16 /* !! */ .b) break block25;
                                    var6_7 = var1_1;
                                    var7_18 = --var5_2;
                                    var2_17 = var3_15 += var16_16 /* !! */ .d;
                                    if (var5_2 < 0) ** GOTO lbl65
                                    var13_8 /* !! */  = this.b.get(var5_2);
                                    var2_17 = var3_15;
                                    ** GOTO lbl69
                                }
                                var6_7 = ++var1_1;
                                var7_18 = var5_2;
                                var2_17 = var3_15 += this.a((int)var8_14, (int)(var5_2 + 1)).d;
                                if (var5_2 < 0) ** continue;
                                var13_8 /* !! */  = this.b.get(var5_2);
                                var2_17 = var3_15;
                                ** continue;
                            }
                            var1_1 = var6_7;
                            var5_2 = var7_18;
                            var16_16 /* !! */  = var13_8 /* !! */ ;
                            var3_15 = var2_17;
                        }
                        var3_15 = var15_11.d;
                        var6_7 = var1_1 + 1;
                        if (!(var3_15 < 2.0f)) break block26;
                        var13_8 /* !! */  = var6_7 < this.b.size() ? this.b.get(var6_7) : null;
                        var4_13 = var12_12 <= 0 ? 0.0f : (float)this.getPaddingRight() / (float)var12_12 + 2.0f;
                        var5_2 = this.f;
                        var16_16 /* !! */  = var13_8 /* !! */ ;
                        while ((var7_18 = var5_2 + 1) < var9_5) {
                            block19: {
                                block29: {
                                    block27: {
                                        block28: {
                                            if (!(var3_15 >= var4_13) || var7_18 <= var10_6) break block27;
                                            if (var16_16 /* !! */  == null) break;
                                            var2_17 = var3_15;
                                            var5_2 = var6_7;
                                            var13_8 /* !! */  = var16_16 /* !! */ ;
                                            if (var7_18 != var16_16 /* !! */ .b) break block19;
                                            var2_17 = var3_15;
                                            var5_2 = var6_7;
                                            var13_8 /* !! */  = var16_16 /* !! */ ;
                                            if (var16_16 /* !! */ .c) break block19;
                                            this.b.remove(var6_7);
                                            this.e.b(this, var7_18, var16_16 /* !! */ .a);
                                            var2_17 = var3_15;
                                            var5_2 = var6_7;
                                            if (var6_7 >= this.b.size()) break block28;
                                            var13_8 /* !! */  = this.b.get(var6_7);
                                            var2_17 = var3_15;
                                            var5_2 = var6_7;
                                            break block19;
                                        }
lbl125:
                                        // 3 sources

                                        while (true) {
                                            var13_8 /* !! */  = null;
                                            break block19;
                                            break;
                                        }
                                    }
                                    if (var16_16 /* !! */  == null || var7_18 != var16_16 /* !! */ .b) break block29;
                                    var2_17 = var3_15 += var16_16 /* !! */ .d;
                                    var5_2 = ++var6_7;
                                    if (var6_7 >= this.b.size()) ** GOTO lbl125
                                    var13_8 /* !! */  = this.b.get(var6_7);
                                    var2_17 = var3_15;
                                    var5_2 = var6_7;
                                    break block19;
                                }
                                var13_8 /* !! */  = this.a(var7_18, var6_7);
                                var2_17 = var3_15 += var13_8 /* !! */ .d;
                                var5_2 = ++var6_7;
                                if (var6_7 >= this.b.size()) ** continue;
                                var13_8 /* !! */  = this.b.get(var6_7);
                                var5_2 = var6_7;
                                var2_17 = var3_15;
                            }
                            var3_15 = var2_17;
                            var6_7 = var5_2;
                            var16_16 /* !! */  = var13_8 /* !! */ ;
                            var5_2 = var7_18;
                        }
                    }
                    this.e(var15_11, var1_1, (f)var14_3);
                    this.e.q(this, this.f, var15_11.a);
                }
                this.e.d(this);
                var5_2 = this.getChildCount();
                for (var1_1 = 0; var1_1 < var5_2; ++var1_1) {
                    var14_3 = this.getChildAt(var1_1);
                    var13_8 /* !! */  = (g)var14_3.getLayoutParams();
                    var13_8 /* !! */ .f = var1_1;
                    if (var13_8 /* !! */ .a || var13_8 /* !! */ .c != 0.0f || (var14_3 = this.s((View)var14_3)) == null) continue;
                    var13_8 /* !! */ .c = var14_3.d;
                    var13_8 /* !! */ .e = var14_3.b;
                }
                this.T();
                if (this.hasFocus() && ((var13_8 /* !! */  = (var13_8 /* !! */  = this.findFocus()) != null ? this.r((View)var13_8 /* !! */ ) : null) == null || var13_8 /* !! */ .b != this.f)) {
                    for (var1_1 = 0; !(var1_1 >= this.getChildCount() || (var13_8 /* !! */  = this.s((View)(var14_3 = this.getChildAt(var1_1)))) != null && var13_8 /* !! */ .b == this.f && var14_3.requestFocus(2)); ++var1_1) {
                    }
                }
            }
            return;
        }
        try {
            var13_9 = this.getResources().getResourceName(this.getId());
        }
        catch (Resources.NotFoundException var13_10) {
            var13_9 = Integer.toHexString(this.getId());
        }
        var14_3 = new StringBuilder();
        var14_3.append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        var14_3.append(this.a);
        var14_3.append(", found: ");
        var14_3.append(var9_5);
        var14_3.append(" Pager id: ");
        var14_3.append(var13_9);
        var14_3.append(" Pager class: ");
        var14_3.append(this.getClass());
        var14_3.append(" Problematic adapter: ");
        var14_3.append(this.e.getClass());
        throw new IllegalStateException(var14_3.toString());
    }

    public void I(i i8) {
        List<i> list = this.a0;
        if (list != null) {
            list.remove(i8);
        }
    }

    public void J(j j8) {
        List<j> list = this.U;
        if (list != null) {
            list.remove(j8);
        }
    }

    public void N(int n8, boolean bl) {
        this.w = false;
        this.O(n8, bl, false);
    }

    void O(int n8, boolean bl, boolean bl2) {
        this.P(n8, bl, bl2, 0);
    }

    void P(int n8, boolean bl, boolean bl2, int n9) {
        a a8 = this.e;
        boolean bl3 = false;
        if (a8 != null && a8.e() > 0) {
            int n10;
            if (!bl2 && this.f == n8 && this.b.size() != 0) {
                this.setScrollingCacheEnabled(false);
                return;
            }
            if (n8 < 0) {
                n10 = 0;
            } else {
                n10 = n8;
                if (n8 >= this.e.e()) {
                    n10 = this.e.e() - 1;
                }
            }
            n8 = this.x;
            int n11 = this.f;
            if (n10 > n11 + n8 || n10 < n11 - n8) {
                for (n8 = 0; n8 < this.b.size(); ++n8) {
                    this.b.get((int)n8).c = true;
                }
            }
            bl2 = bl3;
            if (this.f != n10) {
                bl2 = true;
            }
            if (this.Q) {
                this.f = n10;
                if (bl2) {
                    this.k(n10);
                }
                this.requestLayout();
                return;
            }
            this.F(n10);
            this.M(n10, bl, n9, bl2);
            return;
        }
        this.setScrollingCacheEnabled(false);
    }

    public void Q(boolean bl, k k8) {
        this.R(bl, k8, 2);
    }

    public void R(boolean bl, k k8, int n8) {
        int n9 = 1;
        boolean bl2 = k8 != null;
        boolean bl3 = this.b0 != null;
        boolean bl4 = bl2 != bl3;
        this.b0 = k8;
        this.setChildrenDrawingOrderEnabled(bl2);
        if (bl2) {
            if (bl) {
                n9 = 2;
            }
            this.d0 = n9;
            this.c0 = n8;
        } else {
            this.d0 = 0;
        }
        if (bl4) {
            this.E();
        }
    }

    void S(int n8, int n9, int n10) {
        int n11;
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            n11 = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            this.setScrollingCacheEnabled(false);
        } else {
            n11 = this.getScrollX();
        }
        int n12 = this.getScrollY();
        int n13 = n8 - n11;
        if (n13 == 0 && (n9 -= n12) == 0) {
            this.g(false);
            this.E();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        n8 = this.getClientWidth();
        int n14 = n8 / 2;
        float f8 = Math.abs(n13);
        float f9 = n8;
        float f10 = Math.min(1.0f, f8 * 1.0f / f9);
        f8 = n14;
        f10 = this.m(f10);
        n8 = Math.abs(n10);
        if (n8 > 0) {
            n8 = Math.round(Math.abs((f8 + f10 * f8) / (float)n8) * 1000.0f) * 4;
        } else {
            f8 = this.e.h(this.f);
            n8 = (int)(((float)Math.abs(n13) / (f9 * f8 + (float)this.m) + 1.0f) * 100.0f);
        }
        n8 = Math.min(n8, 600);
        this.k = false;
        this.j.startScroll(n11, n12, n13, n9, n8);
        ax.c0.d0.c0((View)this);
    }

    f a(int n8, int n9) {
        f f8 = new f();
        f8.b = n8;
        f8.a = this.e.j(this, n8);
        f8.d = this.e.h(n8);
        if (n9 >= 0 && n9 < this.b.size()) {
            this.b.add(n9, f8);
            return f8;
        }
        this.b.add(f8);
        return f8;
    }

    public void addFocusables(ArrayList<View> arrayList, int n8, int n9) {
        int n10 = arrayList.size();
        int n11 = this.getDescendantFocusability();
        if (n11 != 393216) {
            for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
                f f8;
                View view = this.getChildAt(i8);
                if (view.getVisibility() != 0 || (f8 = this.s(view)) == null || f8.b != this.f) continue;
                view.addFocusables(arrayList, n8, n9);
            }
        }
        if (n11 == 262144 && n10 != arrayList.size() || !this.isFocusable() || (n9 & 1) == 1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        arrayList.add((View)this);
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            f f8;
            View view = this.getChildAt(i8);
            if (view.getVisibility() != 0 || (f8 = this.s(view)) == null || f8.b != this.f) continue;
            view.addTouchables(arrayList);
        }
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        boolean bl;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = this.generateLayoutParams(layoutParams);
        }
        layoutParams = (g)layoutParams2;
        layoutParams.a = bl = layoutParams.a | ViewPager.w(view);
        if (this.u) {
            if (!bl) {
                layoutParams.d = true;
                this.addViewInLayout(view, n8, layoutParams2);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, n8, layoutParams2);
    }

    public void b(i i8) {
        if (this.a0 == null) {
            this.a0 = new ArrayList<i>();
        }
        this.a0.add(i8);
    }

    public void c(j j8) {
        if (this.U == null) {
            this.U = new ArrayList<j>();
        }
        this.U.add(j8);
    }

    public boolean canScrollHorizontally(int n8) {
        if (this.e == null) {
            return false;
        }
        int n9 = this.getClientWidth();
        int n10 = this.getScrollX();
        if (n8 < 0) {
            return n10 > (int)((float)n9 * this.q);
        }
        return n8 > 0 && n10 < (int)((float)n9 * this.r);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.k = true;
        if (!this.j.isFinished() && this.j.computeScrollOffset()) {
            int n8 = this.getScrollX();
            int n9 = this.getScrollY();
            int n10 = this.j.getCurrX();
            int n11 = this.j.getCurrY();
            if (n8 != n10 || n9 != n11) {
                this.scrollTo(n10, n11);
                if (!this.C(n10)) {
                    this.j.abortAnimation();
                    this.scrollTo(0, n11);
                }
            }
            ax.c0.d0.c0((View)this);
            return;
        }
        this.g(true);
    }

    /*
     * Unable to fully structure code
     */
    public boolean d(int var1_1) {
        block13: {
            block14: {
                block11: {
                    block12: {
                        block10: {
                            var6_2 = this.findFocus();
                            if (var6_2 == this) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var5_3 = null;
                                    break block10;
                                    break;
                                }
                            }
                            var5_3 = var6_2;
                            if (var6_2 != null) {
                                var5_3 = var6_2.getParent();
                                while (var5_3 instanceof ViewGroup) {
                                    if (var5_3 == this) {
                                        var5_3 = var6_2;
                                        break block10;
                                    }
                                    var5_3 = var5_3.getParent();
                                }
                                var7_4 = new StringBuilder();
                                var7_4.append(var6_2.getClass().getSimpleName());
                                var5_3 = var6_2.getParent();
                                while (var5_3 instanceof ViewGroup) {
                                    var7_4.append(" => ");
                                    var7_4.append(var5_3.getClass().getSimpleName());
                                    var5_3 = var5_3.getParent();
                                }
                                var5_3 = new StringBuilder();
                                var5_3.append("arrowScroll tried to find focus based on non-child current focused view ");
                                var5_3.append(var7_4.toString());
                                Log.e((String)"ViewPager", (String)var5_3.toString());
                                ** continue;
                            }
                        }
                        var6_2 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)var5_3, var1_1);
                        if (var6_2 == null || var6_2 == var5_3) break block11;
                        if (var1_1 != 17) break block12;
                        var3_5 = this.q((Rect)this.d, (View)var6_2).left;
                        var2_7 = this.q((Rect)this.d, (View)var5_3).left;
                        var4_9 = var5_3 != null && var3_5 >= var2_7 ? this.A() : var6_2.requestFocus();
                        break block13;
                    }
                    if (var1_1 != 66) ** GOTO lbl-1000
                    var2_8 = this.q((Rect)this.d, (View)var6_2).left;
                    var3_6 = this.q((Rect)this.d, (View)var5_3).left;
                    var4_9 = var5_3 != null && var2_8 <= var3_6 ? this.B() : var6_2.requestFocus();
                    break block13;
                }
                if (var1_1 != 17 && var1_1 != 1) {
                    ** if (var1_1 == 66 || var1_1 == 2) goto lbl-1000
                }
                break block14;
lbl-1000:
                // 2 sources

                {
                    var4_9 = false;
                    ** GOTO lbl58
                }
lbl-1000:
                // 1 sources

                {
                    var4_9 = this.B();
                }
                break block13;
            }
            var4_9 = this.A();
        }
        if (var4_9) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection((int)var1_1));
        }
        return var4_9;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.p(keyEvent);
        {
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            f f8;
            View view = this.getChildAt(i8);
            if (view.getVisibility() != 0 || (f8 = this.s(view)) == null || f8.b != this.f || !view.dispatchPopulateAccessibilityEvent(accessibilityEvent)) continue;
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a a8;
        super.draw(canvas);
        int n8 = this.getOverScrollMode();
        boolean bl = false;
        boolean bl2 = false;
        if (n8 != 0 && (n8 != 1 || (a8 = this.e) == null || a8.e() <= 1)) {
            this.O.finish();
            this.P.finish();
        } else {
            int n9;
            int n10;
            if (!this.O.isFinished()) {
                n10 = canvas.save();
                n9 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                n8 = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n9 + this.getPaddingTop()), this.q * (float)n8);
                this.O.setSize(n9, n8);
                bl2 = this.O.draw(canvas);
                canvas.restoreToCount(n10);
            }
            bl = bl2;
            if (!this.P.isFinished()) {
                n9 = canvas.save();
                int n11 = this.getWidth();
                n8 = this.getHeight();
                n10 = this.getPaddingTop();
                int n12 = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.r + 1.0f) * (float)n11);
                this.P.setSize(n8 - n10 - n12, n11);
                bl = bl2 | this.P.draw(canvas);
                canvas.restoreToCount(n9);
            }
        }
        if (bl) {
            ax.c0.d0.c0((View)this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(this.getDrawableState());
        }
    }

    protected boolean f(View view, boolean bl, int n8, int n9, int n10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n11 = view.getScrollX();
            int n12 = view.getScrollY();
            for (int i8 = viewGroup.getChildCount() - 1; i8 >= 0; --i8) {
                int n13;
                int n14 = n9 + n11;
                View view2 = viewGroup.getChildAt(i8);
                if (n14 < view2.getLeft() || n14 >= view2.getRight() || (n13 = n10 + n12) < view2.getTop() || n13 >= view2.getBottom() || !this.f(view2, true, n8, n14 - view2.getLeft(), n13 - view2.getTop())) continue;
                return true;
            }
        }
        return bl && view.canScrollHorizontally(-n8);
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this.generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    protected int getChildDrawingOrder(int n8, int n9) {
        int n10 = n9;
        if (this.d0 == 2) {
            n10 = n8 - 1 - n9;
        }
        return ((g)this.e0.get((int)n10).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    void h() {
        int n8;
        this.a = n8 = this.e.e();
        int n9 = this.b.size() < this.x * 2 + 1 && this.b.size() < n8 ? 1 : 0;
        int n10 = this.f;
        int n11 = 0;
        int n12 = 0;
        while (n11 < this.b.size()) {
            int n13;
            int n14;
            int n15;
            block12: {
                block14: {
                    int n16;
                    f f8;
                    block13: {
                        block11: {
                            f8 = this.b.get(n11);
                            n16 = this.e.f(f8.a);
                            if (n16 != -1) break block11;
                            n15 = n10;
                            n14 = n11;
                            n13 = n12;
                            break block12;
                        }
                        if (n16 != -2) break block13;
                        this.b.remove(n11);
                        n15 = n11 - 1;
                        n9 = n12;
                        if (n12 == 0) {
                            this.e.t(this);
                            n9 = 1;
                        }
                        this.e.b(this, f8.b, f8.a);
                        n13 = this.f;
                        n11 = n15;
                        n12 = n9;
                        if (n13 == f8.b) {
                            n10 = Math.max(0, Math.min(n13, n8 - 1));
                            n12 = n9;
                            n11 = n15;
                        }
                        break block14;
                    }
                    int n17 = f8.b;
                    n15 = n10;
                    n14 = n11;
                    n13 = n12;
                    if (n17 == n16) break block12;
                    if (n17 == this.f) {
                        n10 = n16;
                    }
                    f8.b = n16;
                }
                n9 = 1;
                n15 = n10;
                n14 = n11;
                n13 = n12;
            }
            n11 = n14 + 1;
            n10 = n15;
            n12 = n13;
        }
        if (n12 != 0) {
            this.e.d(this);
        }
        Collections.sort(this.b, i0);
        if (n9 != 0) {
            n11 = this.getChildCount();
            for (n12 = 0; n12 < n11; ++n12) {
                g g8 = (g)this.getChildAt(n12).getLayoutParams();
                if (g8.a) continue;
                g8.c = 0.0f;
            }
            this.O(n10, false, true);
            this.requestLayout();
        }
    }

    float m(float f8) {
        return (float)Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.f0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.m > 0 && this.n != null && this.b.size() > 0 && this.e != null) {
            int n8 = this.getScrollX();
            int n9 = this.getWidth();
            float f8 = this.m;
            float f9 = n9;
            float f10 = f8 / f9;
            Object object = this.b;
            int n10 = 0;
            object = ((ArrayList)object).get(0);
            f8 = ((f)object).e;
            int n11 = this.b.size();
            int n12 = this.b.get((int)(n11 - 1)).b;
            for (int i8 = ((f)object).b; i8 < n12; ++i8) {
                float f11;
                float f12;
                int n13;
                while (i8 > (n13 = ((f)object).b) && n10 < n11) {
                    object = this.b;
                    object = ((ArrayList)object).get(++n10);
                }
                if (i8 == n13) {
                    f8 = ((f)object).e;
                    f12 = ((f)object).d;
                    f11 = (f8 + f12) * f9;
                    f8 = f8 + f12 + f10;
                } else {
                    f12 = this.e.h(i8);
                    f11 = (f8 + f12) * f9;
                    f8 += f12 + f10;
                }
                if ((float)this.m + f11 > (float)n8) {
                    this.n.setBounds(Math.round(f11), this.o, Math.round((float)this.m + f11), this.p);
                    this.n.draw(canvas);
                }
                if (f11 > (float)(n8 + n9)) break;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getAction() & 0xFF;
        if (n8 != 3 && n8 != 1) {
            if (n8 != 0) {
                if (this.y) {
                    return true;
                }
                if (this.z) {
                    return false;
                }
            }
            if (n8 != 0) {
                if (n8 != 2) {
                    if (n8 == 6) {
                        this.z(motionEvent);
                    }
                } else {
                    n8 = this.H;
                    if (n8 != -1) {
                        n8 = motionEvent.findPointerIndex(n8);
                        float f8 = motionEvent.getX(n8);
                        float f9 = f8 - this.D;
                        float f10 = Math.abs(f9);
                        float f11 = motionEvent.getY(n8);
                        float f12 = Math.abs(f11 - this.G);
                        float f13 = f9 - 0.0f;
                        float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        if (f14 != false && !this.x(this.D, f9) && this.f((View)this, false, (int)f9, (int)f8, (int)f11)) {
                            this.D = f8;
                            this.E = f11;
                            this.z = true;
                            return false;
                        }
                        n8 = this.C;
                        if (f10 > (float)n8 && f10 * 0.5f > f12) {
                            this.y = true;
                            this.K(true);
                            this.setScrollState(1);
                            f10 = this.F;
                            f9 = this.C;
                            f9 = f14 > 0 ? f10 + f9 : f10 - f9;
                            this.D = f9;
                            this.E = f11;
                            this.setScrollingCacheEnabled(true);
                        } else if (f12 > (float)n8) {
                            this.z = true;
                        }
                        if (this.y && this.D(f8)) {
                            ax.c0.d0.c0((View)this);
                        }
                    }
                }
            } else {
                float f15;
                this.F = f15 = motionEvent.getX();
                this.D = f15;
                this.G = f15 = motionEvent.getY();
                this.E = f15;
                this.H = motionEvent.getPointerId(0);
                this.z = false;
                this.k = true;
                this.j.computeScrollOffset();
                if (this.g0 == 2 && Math.abs(this.j.getFinalX() - this.j.getCurrX()) > this.M) {
                    this.j.abortAnimation();
                    this.w = false;
                    this.E();
                    this.y = true;
                    this.K(true);
                    this.setScrollState(1);
                } else {
                    this.g(false);
                    this.y = false;
                }
            }
            if (this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            this.I.addMovement(motionEvent);
            return this.y;
        }
        this.L();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        g g8;
        int n12;
        View view;
        int n13;
        int n14 = this.getChildCount();
        int n15 = n10 - n8;
        int n16 = n11 - n9;
        n9 = this.getPaddingLeft();
        n8 = this.getPaddingTop();
        n11 = this.getPaddingRight();
        n10 = this.getPaddingBottom();
        int n17 = this.getScrollX();
        int n18 = 0;
        for (n13 = 0; n13 < n14; ++n13) {
            int n19;
            int n20;
            int n21;
            int n22;
            block9: {
                block8: {
                    block15: {
                        block13: {
                            block14: {
                                block10: {
                                    block11: {
                                        block12: {
                                            view = this.getChildAt(n13);
                                            n22 = n9;
                                            n21 = n8;
                                            n20 = n11;
                                            n19 = n10;
                                            n12 = n18;
                                            if (view.getVisibility() == 8) break block9;
                                            g8 = (g)view.getLayoutParams();
                                            n22 = n9;
                                            n21 = n8;
                                            n20 = n11;
                                            n19 = n10;
                                            n12 = n18;
                                            if (!g8.a) break block9;
                                            n19 = g8.b;
                                            n12 = n19 & 7;
                                            n20 = n19 & 0x70;
                                            if (n12 == 1) break block10;
                                            if (n12 == 3) break block11;
                                            if (n12 == 5) break block12;
                                            n12 = n9;
                                            n19 = n9;
                                            n9 = n12;
                                            break block13;
                                        }
                                        n12 = n15 - n11 - view.getMeasuredWidth();
                                        n11 += view.getMeasuredWidth();
                                        break block14;
                                    }
                                    n12 = view.getMeasuredWidth() + n9;
                                    n19 = n9;
                                    n9 = n12;
                                    break block13;
                                }
                                n12 = Math.max((n15 - view.getMeasuredWidth()) / 2, n9);
                            }
                            n19 = n12;
                        }
                        if (n20 == 16) break block15;
                        if (n20 != 48) {
                            if (n20 != 80) {
                                n20 = n8;
                                n12 = n8;
                                n8 = n20;
                                break block8;
                            } else {
                                n12 = n16 - n10 - view.getMeasuredHeight();
                                n10 += view.getMeasuredHeight();
                            }
                            break block8;
                        } else {
                            n20 = view.getMeasuredHeight() + n8;
                            n12 = n8;
                            n8 = n20;
                        }
                        break block8;
                    }
                    n12 = Math.max((n16 - view.getMeasuredHeight()) / 2, n8);
                }
                view.layout(n19 += n17, n12, view.getMeasuredWidth() + n19, n12 + view.getMeasuredHeight());
                n12 = n18 + 1;
                n19 = n10;
                n20 = n11;
                n21 = n8;
                n22 = n9;
            }
            n9 = n22;
            n8 = n21;
            n11 = n20;
            n10 = n19;
            n18 = n12;
        }
        for (n12 = 0; n12 < n14; ++n12) {
            f f8;
            view = this.getChildAt(n12);
            if (view.getVisibility() == 8) continue;
            g8 = (g)view.getLayoutParams();
            if (g8.a || (f8 = this.s(view)) == null) continue;
            float f9 = n15 - n9 - n11;
            n13 = (int)(f8.e * f9) + n9;
            if (g8.d) {
                g8.d = false;
                view.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(f9 * g8.c)), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n16 - n8 - n10), (int)0x40000000));
            }
            view.layout(n13, n8, view.getMeasuredWidth() + n13, view.getMeasuredHeight() + n8);
        }
        this.o = n8;
        this.p = n16 - n10;
        this.T = n18;
        if (this.Q) {
            this.M(this.f, false, 0, false);
        }
        this.Q = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void onMeasure(int var1_1, int var2_2) {
        var11_3 = 0;
        this.setMeasuredDimension(View.getDefaultSize((int)0, (int)var1_1), View.getDefaultSize((int)0, (int)var2_2));
        var1_1 = this.getMeasuredWidth();
        this.B = Math.min(var1_1 / 10, this.A);
        var1_1 = var1_1 - this.getPaddingLeft() - this.getPaddingRight();
        var2_2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        var12_4 = this.getChildCount();
        var5_5 = 0;
        while (true) {
            block14: {
                var8_10 = 1;
                var10_12 = 0x40000000;
                if (var5_5 >= var12_4) break;
                var13_13 /* !! */  = this.getChildAt(var5_5);
                var3_6 = var1_1;
                var4_7 = var2_2;
                if (var13_13 /* !! */ .getVisibility() == 8) break block14;
                var14_14 = (g)var13_13 /* !! */ .getLayoutParams();
                var3_6 = var1_1;
                var4_7 = var2_2;
                if (var14_14 == null) break block14;
                var3_6 = var1_1;
                var4_7 = var2_2;
                if (!var14_14.a) break block14;
                var4_7 = var14_14.b;
                var3_6 = var4_7 & 7;
                var7_9 = (var4_7 &= 112) == 48 || var4_7 == 80;
                var6_8 = var8_10;
                if (var3_6 != 3) {
                    var6_8 = var3_6 == 5 ? var8_10 : 0;
                }
                var8_10 = -2147483648;
                if (var7_9) {
                    var4_7 = 0x40000000;
                    while (true) {
                        var3_6 = -2147483648;
                        break;
                    }
                } else {
                    var4_7 = var8_10;
                    if (var6_8 == 0) ** continue;
                    var3_6 = 0x40000000;
                    var4_7 = var8_10;
                }
                var8_10 = var14_14.width;
                if (var8_10 == -2) ** GOTO lbl50
                if (var8_10 != -1) {
                    var4_7 = var8_10;
lbl44:
                    // 2 sources

                    while (true) {
                        var8_10 = 0x40000000;
                        var9_11 = var4_7;
                        break;
                    }
                } else {
                    var4_7 = var1_1;
                    ** continue;
lbl50:
                    // 1 sources

                    var9_11 = var1_1;
                    var8_10 = var4_7;
                }
                var4_7 = var14_14.height;
                if (var4_7 != -2) {
                    var3_6 = var4_7 != -1 ? var4_7 : var2_2;
                } else {
                    var4_7 = var2_2;
                    var10_12 = var3_6;
                    var3_6 = var4_7;
                }
                var13_13 /* !! */ .measure(View.MeasureSpec.makeMeasureSpec((int)var9_11, (int)var8_10), View.MeasureSpec.makeMeasureSpec((int)var3_6, (int)var10_12));
                if (var7_9) {
                    var4_7 = var2_2 - var13_13 /* !! */ .getMeasuredHeight();
                    var3_6 = var1_1;
                } else {
                    var3_6 = var1_1;
                    var4_7 = var2_2;
                    if (var6_8 != 0) {
                        var3_6 = var1_1 - var13_13 /* !! */ .getMeasuredWidth();
                        var4_7 = var2_2;
                    }
                }
            }
            ++var5_5;
            var1_1 = var3_6;
            var2_2 = var4_7;
        }
        this.s = View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)0x40000000);
        this.t = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)0x40000000);
        this.u = true;
        this.E();
        this.u = false;
        var3_6 = this.getChildCount();
        for (var2_2 = var11_3; var2_2 < var3_6; ++var2_2) {
            var14_14 = this.getChildAt(var2_2);
            if (var14_14.getVisibility() == 8 || (var13_13 /* !! */  = (g)var14_14.getLayoutParams()) != null && var13_13 /* !! */ .a) continue;
            var14_14.measure(View.MeasureSpec.makeMeasureSpec((int)((int)((float)var1_1 * var13_13 /* !! */ .c)), (int)0x40000000), this.t);
        }
    }

    protected boolean onRequestFocusInDescendants(int n8, Rect rect) {
        int n9;
        int n10;
        int n11 = this.getChildCount();
        if ((n8 & 2) != 0) {
            n10 = 0;
            n9 = 1;
        } else {
            n10 = n11 - 1;
            n11 = -1;
            n9 = -1;
        }
        while (n10 != n11) {
            f f8;
            View view = this.getChildAt(n10);
            if (view.getVisibility() == 0 && (f8 = this.s(view)) != null && f8.b == this.f && view.requestFocus(n8, rect)) {
                return true;
            }
            n10 += n9;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof m)) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        m m8 = (m)object;
        super.onRestoreInstanceState(m8.a());
        object = this.e;
        if (object != null) {
            ((a)object).n(m8.e0, m8.f0);
            this.O(m8.d0, false, true);
            return;
        }
        this.g = m8.d0;
        this.h = m8.e0;
        this.i = m8.f0;
    }

    public Parcelable onSaveInstanceState() {
        m m8 = new m(super.onSaveInstanceState());
        m8.d0 = this.f;
        a a8 = this.e;
        if (a8 != null) {
            m8.e0 = a8.o();
        }
        return m8;
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        if (n8 != n10) {
            n9 = this.m;
            this.G(n8, n10, n9, n9);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block16: {
            block20: {
                block17: {
                    block18: {
                        block19: {
                            if (this.N) {
                                return true;
                            }
                            var6_2 = var1_1.getAction();
                            var9_3 = false;
                            if (var6_2 == 0 && var1_1.getEdgeFlags() != 0) {
                                return false;
                            }
                            var10_4 = this.e;
                            if (var10_4 == null || var10_4.e() == 0) break block16;
                            if (this.I == null) {
                                this.I = VelocityTracker.obtain();
                            }
                            this.I.addMovement(var1_1);
                            var6_2 = var1_1.getAction() & 255;
                            if (var6_2 == 0) break block17;
                            if (var6_2 == 1) break block18;
                            if (var6_2 == 2) break block19;
                            if (var6_2 != 3) {
                                if (var6_2 != 5) {
                                    if (var6_2 == 6) {
                                        this.z(var1_1);
                                        this.D = var1_1.getX(var1_1.findPointerIndex(this.H));
                                    }
                                } else {
                                    var6_2 = var1_1.getActionIndex();
                                    this.D = var1_1.getX(var6_2);
                                    this.H = var1_1.getPointerId(var6_2);
                                }
                            } else if (this.y) {
                                this.M(this.f, true, 0, false);
                                var9_3 = this.L();
                            }
                            break block20;
                        }
                        if (this.y) ** GOTO lbl52
                        var6_2 = var1_1.findPointerIndex(this.H);
                        if (var6_2 == -1) {
                            var9_3 = this.L();
                        } else {
                            var2_5 = var1_1.getX(var6_2);
                            var5_8 = Math.abs(var2_5 - this.D);
                            var3_9 = var1_1.getY(var6_2);
                            var4_11 = Math.abs(var3_9 - this.E);
                            if (var5_8 > (float)this.C && var5_8 > var4_11) {
                                this.y = true;
                                this.K(true);
                                var4_11 = this.F;
                                var2_5 = var2_5 - var4_11 > 0.0f ? var4_11 + (float)this.C : var4_11 - (float)this.C;
                                this.D = var2_5;
                                this.E = var3_9;
                                this.setScrollState(1);
                                this.setScrollingCacheEnabled(true);
                                var10_4 = this.getParent();
                                if (var10_4 != null) {
                                    var10_4.requestDisallowInterceptTouchEvent(true);
                                }
                            }
lbl52:
                            // 6 sources

                            if (this.y) {
                                var9_3 = this.D(var1_1.getX(var1_1.findPointerIndex(this.H)));
                            }
                        }
                        break block20;
                    }
                    if (this.y) {
                        var10_4 = this.I;
                        var10_4.computeCurrentVelocity(1000, (float)this.K);
                        var8_12 = (int)var10_4.getXVelocity(this.H);
                        this.w = true;
                        var7_13 = this.getClientWidth();
                        var6_2 = this.getScrollX();
                        var10_4 = this.t();
                        var3_10 = this.m;
                        var2_6 = var7_13;
                        this.P(this.i(var10_4.b, ((float)var6_2 / var2_6 - var10_4.e) / (var10_4.d + (var3_10 /= var2_6)), var8_12, (int)(var1_1.getX(var1_1.findPointerIndex(this.H)) - this.F)), true, true, var8_12);
                        var9_3 = this.L();
                    }
                    break block20;
                }
                this.j.abortAnimation();
                this.w = false;
                this.E();
                this.F = var2_7 = var1_1.getX();
                this.D = var2_7;
                this.G = var2_7 = var1_1.getY();
                this.E = var2_7;
                this.H = var1_1.getPointerId(0);
            }
            if (var9_3) {
                ax.c0.d0.c0((View)this);
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) return false;
        int n8 = keyEvent.getKeyCode();
        if (n8 != 21) {
            if (n8 != 22) {
                if (n8 != 61) return false;
                if (keyEvent.hasNoModifiers()) {
                    return this.d(2);
                }
                if (!keyEvent.hasModifiers(1)) return false;
                return this.d(1);
            }
            if (!keyEvent.hasModifiers(2)) return this.d(66);
            return this.B();
        }
        if (!keyEvent.hasModifiers(2)) return this.d(17);
        return this.A();
    }

    f r(View view) {
        ViewParent viewParent;
        while ((viewParent = view.getParent()) != this) {
            if (viewParent != null && viewParent instanceof View) {
                view = (View)viewParent;
                continue;
            }
            return null;
        }
        return this.s(view);
    }

    public void removeView(View view) {
        if (this.u) {
            this.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    f s(View view) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            f f8 = this.b.get(i8);
            if (!this.e.k(view, f8.a)) continue;
            return f8;
        }
        return null;
    }

    public void setAdapter(a a8) {
        int n8;
        Object object = this.e;
        int n9 = 0;
        if (object != null) {
            ((a)object).r(null);
            this.e.t(this);
            for (n8 = 0; n8 < this.b.size(); ++n8) {
                object = this.b.get(n8);
                this.e.b(this, ((f)object).b, ((f)object).a);
            }
            this.e.d(this);
            this.b.clear();
            this.H();
            this.f = 0;
            this.scrollTo(0, 0);
        }
        a a9 = this.e;
        this.e = a8;
        this.a = 0;
        if (a8 != null) {
            if (this.l == null) {
                this.l = new l(this);
            }
            this.e.r(this.l);
            this.w = false;
            boolean bl = this.Q;
            this.Q = true;
            this.a = this.e.e();
            if (this.g >= 0) {
                this.e.n(this.h, this.i);
                this.O(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (!bl) {
                this.E();
            } else {
                this.requestLayout();
            }
        }
        if ((object = this.a0) != null && !object.isEmpty()) {
            int n10 = this.a0.size();
            for (n8 = n9; n8 < n10; ++n8) {
                this.a0.get(n8).a(this, a9, a8);
            }
        }
    }

    public void setCurrentItem(int n8) {
        this.w = false;
        this.O(n8, this.Q ^ true, false);
    }

    public void setOffscreenPageLimit(int n8) {
        int n9 = n8;
        if (n8 < 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested offscreen page limit ");
            stringBuilder.append(n8);
            stringBuilder.append(" too small; defaulting to ");
            stringBuilder.append(1);
            Log.w((String)"ViewPager", (String)stringBuilder.toString());
            n9 = 1;
        }
        if (n9 != this.x) {
            this.x = n9;
            this.E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j j8) {
        this.V = j8;
    }

    public void setPageMargin(int n8) {
        int n9 = this.m;
        this.m = n8;
        int n10 = this.getWidth();
        this.G(n10, n10, n8, n9);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int n8) {
        this.setPageMarginDrawable(ax.Q.b.e(this.getContext(), n8));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            this.refreshDrawableState();
        }
        boolean bl = drawable == null;
        this.setWillNotDraw(bl);
        this.invalidate();
    }

    void setScrollState(int n8) {
        if (this.g0 == n8) {
            return;
        }
        this.g0 = n8;
        if (this.b0 != null) {
            boolean bl = n8 != 0;
            this.n(bl);
        }
        this.l(n8);
    }

    f u(int n8) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            f f8 = this.b.get(i8);
            if (f8.b != n8) continue;
            return f8;
        }
        return null;
    }

    void v() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        Context context = this.getContext();
        this.j = new Scroller(context, j0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int)(400.0f * f8);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int)(25.0f * f8);
        this.M = (int)(2.0f * f8);
        this.A = (int)(f8 * 16.0f);
        ax.c0.d0.l0((View)this, new h(this));
        if (ax.c0.d0.z((View)this) == 0) {
            ax.c0.d0.s0((View)this, 1);
        }
        ax.c0.d0.v0((View)this, new I(this){
            private final Rect a;
            final ViewPager b;
            {
                this.b = viewPager;
                this.a = new Rect();
            }

            @Override
            public F0 a(View object, F0 f02) {
                if ((f02 = ax.c0.d0.X((View)object, f02)).o()) {
                    return f02;
                }
                Rect rect = this.a;
                rect.left = f02.j();
                rect.top = f02.l();
                rect.right = f02.k();
                rect.bottom = f02.i();
                int n8 = this.b.getChildCount();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object = ax.c0.d0.i(this.b.getChildAt(i8), f02);
                    rect.left = Math.min(((F0)object).j(), rect.left);
                    rect.top = Math.min(((F0)object).l(), rect.top);
                    rect.right = Math.min(((F0)object).k(), rect.right);
                    rect.bottom = Math.min(((F0)object).i(), rect.bottom);
                }
                return f02.p(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
        {
        }
    }

    protected void y(int n8, float f8, int n9) {
        Object object;
        int n10 = this.T;
        int n11 = 0;
        if (n10 > 0) {
            int n12 = this.getScrollX();
            n10 = this.getPaddingLeft();
            int n13 = this.getPaddingRight();
            int n14 = this.getWidth();
            int n15 = this.getChildCount();
            for (int i8 = 0; i8 < n15; ++i8) {
                View view = this.getChildAt(i8);
                object = (g)view.getLayoutParams();
                if (!object.a) continue;
                int n16 = object.b & 7;
                if (n16 != 1) {
                    int n17;
                    if (n16 != 3) {
                        if (n16 != 5) {
                            n17 = n10;
                            n16 = n10;
                            n10 = n17;
                        } else {
                            n16 = n14 - n13 - view.getMeasuredWidth();
                            n13 += view.getMeasuredWidth();
                        }
                    } else {
                        n17 = view.getWidth() + n10;
                        n16 = n10;
                        n10 = n17;
                    }
                } else {
                    n16 = Math.max((n14 - view.getMeasuredWidth()) / 2, n10);
                }
                n16 = n16 + n12 - view.getLeft();
                if (n16 == 0) continue;
                view.offsetLeftAndRight(n16);
            }
        }
        this.j(n8, f8, n9);
        if (this.b0 != null) {
            n9 = this.getScrollX();
            n10 = this.getChildCount();
            for (n8 = n11; n8 < n10; ++n8) {
                object = this.getChildAt(n8);
                if (((g)object.getLayoutParams()).a) continue;
                f8 = (float)(object.getLeft() - n9) / (float)this.getClientWidth();
                this.b0.a((View)object, f8);
            }
        }
        this.S = true;
    }

    @Inherited
    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.TYPE})
    public static @interface e {
    }

    static class f {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        f() {
        }
    }

    public static class g
    extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, h0);
            this.b = context.getInteger(0, 48);
            context.recycle();
        }
    }

    class h
    extends ax.c0.a {
        final ViewPager d;

        h(ViewPager viewPager) {
            this.d = viewPager;
        }

        private boolean n() {
            a a8 = this.d.e;
            return a8 != null && a8.e() > 1;
        }

        @Override
        public void f(View object, AccessibilityEvent accessibilityEvent) {
            super.f((View)object, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)ViewPager.class.getName());
            accessibilityEvent.setScrollable(this.n());
            if (accessibilityEvent.getEventType() == 4096 && (object = this.d.e) != null) {
                accessibilityEvent.setItemCount(((a)object).e());
                accessibilityEvent.setFromIndex(this.d.f);
                accessibilityEvent.setToIndex(this.d.f);
            }
        }

        @Override
        public void g(View view, H h8) {
            super.g(view, h8);
            h8.m0(ViewPager.class.getName());
            h8.G0(this.n());
            if (this.d.canScrollHorizontally(1)) {
                h8.a(4096);
            }
            if (this.d.canScrollHorizontally(-1)) {
                h8.a(8192);
            }
        }

        @Override
        public boolean j(View object, int n8, Bundle bundle) {
            if (super.j((View)object, n8, bundle)) {
                return true;
            }
            if (n8 != 4096) {
                if (n8 != 8192) {
                    return false;
                }
                if (this.d.canScrollHorizontally(-1)) {
                    object = this.d;
                    ((ViewPager)((Object)object)).setCurrentItem(((ViewPager)((Object)object)).f - 1);
                    return true;
                }
                return false;
            }
            if (this.d.canScrollHorizontally(1)) {
                object = this.d;
                ((ViewPager)((Object)object)).setCurrentItem(((ViewPager)((Object)object)).f + 1);
                return true;
            }
            return false;
        }
    }

    public static interface i {
        public void a(ViewPager var1, a var2, a var3);
    }

    public static interface j {
        public void K(int var1);

        public void e(int var1);

        public void h(int var1, float var2, int var3);
    }

    public static interface k {
        public void a(View var1, float var2);
    }

    private class l
    extends DataSetObserver {
        final ViewPager a;

        l(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void onChanged() {
            this.a.h();
        }

        public void onInvalidated() {
            this.a.h();
        }
    }

    public static class m
    extends ax.k0.a {
        public static final Parcelable.Creator<m> CREATOR = new Parcelable.ClassLoaderCreator<m>(){

            public m a(Parcel parcel) {
                return new m(parcel, null);
            }

            public m b(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            public m[] c(int n8) {
                return new m[n8];
            }
        };
        int d0;
        Parcelable e0;
        ClassLoader f0;

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ClassLoader classLoader2 = classLoader;
            if (classLoader == null) {
                classLoader2 = this.getClass().getClassLoader();
            }
            this.d0 = parcel.readInt();
            this.e0 = parcel.readParcelable(classLoader2);
            this.f0 = classLoader2;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.d0);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
            parcel.writeParcelable(this.e0, n8);
        }
    }

    public static class n
    implements j {
        @Override
        public void h(int n8, float f8, int n9) {
        }
    }

    static class o
    implements Comparator<View> {
        o() {
        }

        public int a(View object, View object2) {
            object = (g)object.getLayoutParams();
            object2 = (g)object2.getLayoutParams();
            boolean bl = object.a;
            if (bl != object2.a) {
                if (bl) {
                    return 1;
                }
                return -1;
            }
            return object.e - object2.e;
        }
    }
}

