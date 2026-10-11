/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.z;
import ax.H6.f;
import ax.O6.l;
import ax.c0.F0;
import ax.c0.d0;
import ax.d0.H;
import ax.d0.M;
import ax.k6.e;
import ax.k6.k;
import ax.k6.m;
import ax.l0.c;
import ax.q6.a;
import com.google.android.material.bottomsheet.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View>
extends CoordinatorLayout.c<V>
implements ax.H6.b {
    private static final int l0 = ax.k6.l.h;
    private boolean A;
    private final i B = new i(this);
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G = 0.5f;
    int H;
    float I = -1.0f;
    boolean J;
    private boolean K;
    private boolean L = true;
    private boolean M = true;
    private boolean N;
    int O = 4;
    int P = 4;
    c Q;
    private boolean R;
    private int S;
    private boolean T;
    private float U = 0.1f;
    private int V;
    int W;
    int X;
    WeakReference<V> Y;
    WeakReference<View> Z;
    private int a = 0;
    WeakReference<View> a0;
    private boolean b = true;
    WeakReference<View> b0;
    private boolean c = false;
    private final ArrayList<g> c0 = new ArrayList();
    private float d;
    private VelocityTracker d0;
    private int e;
    f e0;
    private int f;
    int f0;
    private boolean g;
    private int g0 = -1;
    private int h;
    boolean h0;
    private int i;
    private Map<View, Integer> i0;
    private ax.O6.h j;
    final SparseIntArray j0 = new SparseIntArray();
    private ColorStateList k;
    private final c.c k0 = new c.c(this){
        private long a;
        final BottomSheetBehavior b;
        {
            this.b = bottomSheetBehavior;
        }

        private boolean n(View object) {
            int n8 = object.getTop();
            return n8 > (((BottomSheetBehavior)object).X + ((BottomSheetBehavior)(object = this.b)).s0()) / 2;
        }

        @Override
        public int a(View view, int n8, int n9) {
            return view.getLeft();
        }

        @Override
        public int b(View view, int n8, int n9) {
            return ax.W.a.b(n8, this.b.s0(), this.e(view));
        }

        @Override
        public int e(View view) {
            if (this.b.j0()) {
                return this.b.X;
            }
            return this.b.H;
        }

        @Override
        public void j(int n8) {
            if (n8 == 1 && this.b.L) {
                this.b.a1(1);
            }
        }

        @Override
        public void k(View view, int n8, int n9, int n10, int n11) {
            this.b.o0(n9);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void l(View view, float f8, float f9) {
            BottomSheetBehavior bottomSheetBehavior;
            int n8;
            block6: {
                block5: {
                    int n9;
                    int n10;
                    block11: {
                        block12: {
                            block3: {
                                block10: {
                                    block9: {
                                        int n11;
                                        block7: {
                                            block8: {
                                                block2: {
                                                    int n12;
                                                    block4: {
                                                        n8 = 6;
                                                        if (!(f9 < 0.0f)) break block2;
                                                        if (this.b.b) break block3;
                                                        n12 = view.getTop();
                                                        long l8 = SystemClock.uptimeMillis();
                                                        long l9 = this.a;
                                                        if (!this.b.f1()) break block4;
                                                        bottomSheetBehavior = this.b;
                                                        f8 = n12;
                                                        if (!bottomSheetBehavior.c1(l8 - l9, f8 * 100.0f / (float)bottomSheetBehavior.X)) break block5;
                                                        break block3;
                                                    }
                                                    if (n12 <= this.b.F) break block3;
                                                    break block6;
                                                }
                                                bottomSheetBehavior = this.b;
                                                if (!bottomSheetBehavior.J || !bottomSheetBehavior.e1(view, f9)) break block7;
                                                if (!(Math.abs(f8) < Math.abs(f9) && f9 > (float)this.b.e) && !this.n(view)) break block8;
                                                n8 = 5;
                                                break block6;
                                            }
                                            if (!this.b.b && Math.abs(view.getTop() - this.b.s0()) >= Math.abs(view.getTop() - this.b.F)) break block6;
                                            break block3;
                                        }
                                        if (f9 == 0.0f || Math.abs(f8) > Math.abs(f9)) break block9;
                                        if (!this.b.b && Math.abs((n11 = view.getTop()) - this.b.F) < Math.abs(n11 - this.b.H) && !this.b.f1()) break block6;
                                        break block5;
                                    }
                                    n10 = view.getTop();
                                    if (!this.b.b) break block10;
                                    if (Math.abs(n10 - this.b.E) >= Math.abs(n10 - this.b.H)) break block5;
                                    break block3;
                                }
                                bottomSheetBehavior = this.b;
                                n9 = bottomSheetBehavior.F;
                                if (n10 >= n9) break block11;
                                if (n10 >= Math.abs(n10 - bottomSheetBehavior.H)) break block12;
                            }
                            n8 = 3;
                            break block6;
                        }
                        if (!this.b.f1()) break block6;
                        break block5;
                    }
                    if (Math.abs(n10 - n9) < Math.abs(n10 - this.b.H) && !this.b.f1()) break block6;
                }
                n8 = 4;
            }
            bottomSheetBehavior = this.b;
            bottomSheetBehavior.h1(view, n8, bottomSheetBehavior.g1());
        }

        @Override
        public boolean m(View view, int n8) {
            Object object = this.b;
            int n9 = object.O;
            if (n9 == 1) {
                return false;
            }
            if (object.h0) {
                return false;
            }
            if (n9 == 3 && object.f0 == n8 && (object = (object = object.b0) != null ? (View)object.get() : null) != null && object.canScrollVertically(-1)) {
                return false;
            }
            this.a = SystemClock.uptimeMillis();
            object = this.b.Y;
            return object != null && object.get() == view;
        }
    };
    private int l = -1;
    private int m = -1;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private l z;

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n8;
        this.i = context.getResources().getDimensionPixelSize(ax.k6.e.o0);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, ax.k6.m.b0);
        int n9 = ax.k6.m.f0;
        if (typedArray.hasValue(n9)) {
            this.k = ax.K6.c.a(context, typedArray, n9);
        }
        if (typedArray.hasValue(ax.k6.m.y0)) {
            this.z = ax.O6.l.e(context, attributeSet, ax.k6.c.c, l0).m();
        }
        this.m0(context);
        this.n0();
        this.I = typedArray.getDimension(ax.k6.m.e0, -1.0f);
        n9 = ax.k6.m.c0;
        if (typedArray.hasValue(n9)) {
            this.T0(typedArray.getDimensionPixelSize(n9, -1));
        }
        if (typedArray.hasValue(n9 = ax.k6.m.d0)) {
            this.S0(typedArray.getDimensionPixelSize(n9, -1));
        }
        if ((attributeSet = typedArray.peekValue(n8 = ax.k6.m.m0)) != null && (n9 = attributeSet.data) == -1) {
            this.U0(n9);
        } else {
            this.U0(typedArray.getDimensionPixelSize(n8, -1));
        }
        this.R0(typedArray.getBoolean(ax.k6.m.l0, false));
        this.P0(typedArray.getBoolean(ax.k6.m.q0, false));
        this.O0(typedArray.getBoolean(ax.k6.m.j0, true));
        this.Y0(typedArray.getBoolean(ax.k6.m.p0, false));
        this.L0(typedArray.getBoolean(ax.k6.m.g0, true));
        this.M0(typedArray.getBoolean(ax.k6.m.h0, true));
        this.W0(typedArray.getInt(ax.k6.m.n0, 0));
        this.Q0(typedArray.getFloat(ax.k6.m.k0, 0.5f));
        n9 = ax.k6.m.i0;
        attributeSet = typedArray.peekValue(n9);
        if (attributeSet != null && attributeSet.type == 16) {
            this.N0(attributeSet.data);
        } else {
            this.N0(typedArray.getDimensionPixelOffset(n9, 0));
        }
        this.X0(typedArray.getInt(ax.k6.m.o0, 500));
        this.p = typedArray.getBoolean(ax.k6.m.u0, false);
        this.q = typedArray.getBoolean(ax.k6.m.v0, false);
        this.r = typedArray.getBoolean(ax.k6.m.w0, false);
        this.s = typedArray.getBoolean(ax.k6.m.x0, true);
        this.t = typedArray.getBoolean(ax.k6.m.r0, false);
        this.u = typedArray.getBoolean(ax.k6.m.s0, false);
        this.v = typedArray.getBoolean(ax.k6.m.t0, false);
        this.y = typedArray.getBoolean(ax.k6.m.z0, true);
        typedArray.recycle();
        this.d = ViewConfiguration.get((Context)context).getScaledMaximumFlingVelocity();
    }

    private boolean C0(V v8) {
        ViewParent viewParent = v8.getParent();
        return viewParent != null && viewParent.isLayoutRequested() && v8.isAttachedToWindow();
    }

    private boolean E0(CoordinatorLayout coordinatorLayout, int n8, int n9) {
        Object object = this.a0;
        object = object != null ? (View)object.get() : null;
        return object != null && coordinatorLayout.B((View)object, n8, n9);
    }

    private boolean F0(CoordinatorLayout coordinatorLayout, int n8, int n9) {
        Object object = this.b0;
        object = object != null ? (View)object.get() : null;
        return object != null && coordinatorLayout.B((View)object, n8, n9);
    }

    private void H0(View view, H.a a8, int n8) {
        ax.c0.d0.h0(view, a8, null, this.l0(n8));
    }

    private void I0() {
        this.f0 = -1;
        this.g0 = -1;
        VelocityTracker velocityTracker = this.d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.d0 = null;
        }
    }

    private void J0(h h8) {
        block7: {
            block6: {
                int n8 = this.a;
                if (n8 == 0) break block6;
                if (n8 == -1 || (n8 & 1) == 1) {
                    this.f = h8.e0;
                }
                if (n8 == -1 || (n8 & 2) == 2) {
                    this.b = h8.f0;
                }
                if (n8 == -1 || (n8 & 4) == 4) {
                    this.J = h8.g0;
                }
                if (n8 == -1 || (n8 & 8) == 8) break block7;
            }
            return;
        }
        this.K = h8.h0;
    }

    static /* synthetic */ int K(BottomSheetBehavior bottomSheetBehavior, int n8) {
        bottomSheetBehavior.n = n8;
        return n8;
    }

    private void K0(V v8, Runnable runnable2) {
        if (this.C0(v8)) {
            v8.post(runnable2);
            return;
        }
        runnable2.run();
    }

    static /* synthetic */ int T(BottomSheetBehavior bottomSheetBehavior, int n8) {
        bottomSheetBehavior.x = n8;
        return n8;
    }

    static /* synthetic */ int W(BottomSheetBehavior bottomSheetBehavior, int n8) {
        bottomSheetBehavior.w = n8;
        return n8;
    }

    private int b0(View view, int n8, int n9) {
        return ax.c0.d0.c(view, view.getResources().getString(n8), this.l0(n9));
    }

    private void b1(View view) {
        boolean bl = Build.VERSION.SDK_INT >= 29 && !this.z0() && !this.g;
        if (!(this.p || this.q || this.r || this.t || this.u || this.v || bl)) {
            return;
        }
        ax.F6.z.b(view, new z.c(){
            final boolean a;
            final BottomSheetBehavior b;
            {
                this.b = bottomSheetBehavior;
                this.a = bl;
            }

            @Override
            public F0 a(View view, F0 f02, z.d d8) {
                int n8;
                int n9;
                int n10;
                ax.T.b b8 = f02.f(F0.m.h());
                ax.T.b b9 = f02.f(F0.m.e());
                BottomSheetBehavior.T(this.b, b8.b);
                boolean bl = ax.F6.z.h(view);
                int n11 = view.getPaddingBottom();
                int n12 = view.getPaddingLeft();
                int n13 = view.getPaddingRight();
                if (this.b.p) {
                    BottomSheetBehavior.W(this.b, f02.i());
                    n11 = d8.d + this.b.w;
                }
                if (this.b.q) {
                    n10 = bl ? d8.c : d8.a;
                    n12 = n10 + b8.a;
                }
                if (this.b.r) {
                    n10 = bl ? d8.a : d8.c;
                    n13 = n10 + b8.c;
                }
                d8 = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
                bl = this.b.t;
                int n14 = 1;
                if (bl && (n9 = ((ViewGroup.MarginLayoutParams)d8).leftMargin) != (n10 = b8.a)) {
                    ((ViewGroup.MarginLayoutParams)d8).leftMargin = n10;
                    n9 = 1;
                } else {
                    n9 = 0;
                }
                n10 = n9;
                if (this.b.u) {
                    int n15 = ((ViewGroup.MarginLayoutParams)d8).rightMargin;
                    n8 = b8.c;
                    n10 = n9;
                    if (n15 != n8) {
                        ((ViewGroup.MarginLayoutParams)d8).rightMargin = n8;
                        n10 = 1;
                    }
                }
                if (this.b.v && (n8 = ((ViewGroup.MarginLayoutParams)d8).topMargin) != (n9 = b8.b)) {
                    ((ViewGroup.MarginLayoutParams)d8).topMargin = n9;
                    n10 = n14;
                }
                if (n10 != 0) {
                    view.setLayoutParams((ViewGroup.LayoutParams)d8);
                }
                view.setPadding(n12, view.getPaddingTop(), n13, n11);
                if (this.a) {
                    BottomSheetBehavior.K(this.b, b9.d);
                }
                if (!this.b.p && !this.a) {
                    return f02;
                }
                this.b.m1(false);
                return f02;
            }
        });
    }

    private void d0() {
        int n8 = this.h0();
        if (this.b) {
            this.H = Math.max(this.X - n8, this.E);
            return;
        }
        this.H = this.X - n8;
    }

    private boolean d1() {
        return this.Q != null && (this.L || this.O == 1);
    }

    private float e0(float f8, RoundedCorner roundedCorner) {
        float f9;
        if (roundedCorner != null && (f9 = (float)ax.q6.c.a(roundedCorner)) > 0.0f && f8 > 0.0f) {
            return f9 / f8;
        }
        return 0.0f;
    }

    private void f0() {
        this.F = (int)((float)this.X * (1.0f - this.G));
    }

    private float g0() {
        View view;
        if (this.j != null && (view = this.Y) != null && view.get() != null && Build.VERSION.SDK_INT >= 31) {
            view = (View)this.Y.get();
            if (this.x0() && (view = ax.q6.a.a(view)) != null) {
                return Math.max(this.e0(this.j.N(), ax.q6.b.a((WindowInsets)view, 0)), this.e0(this.j.O(), ax.q6.b.a((WindowInsets)view, 1)));
            }
        }
        return 0.0f;
    }

    private int h0() {
        int n8;
        if (this.g) {
            return Math.min(Math.max(this.h, this.X - this.W * 9 / 16), this.V) + this.w;
        }
        if (!this.o && !this.p && (n8 = this.n) > 0) {
            return Math.max(this.f, n8 + this.i);
        }
        return this.f + this.w;
    }

    private void h1(View view, int n8, boolean bl) {
        int n9 = this.v0(n8);
        c c8 = this.Q;
        if (c8 != null && (bl ? c8.O(view.getLeft(), n9) : c8.Q(view, view.getLeft(), n9))) {
            this.a1(2);
            this.k1(n8, true);
            this.B.c(n8);
            return;
        }
        this.a1(n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float i0(int n8) {
        float f8;
        float f9;
        int n9 = this.H;
        if (n8 <= n9 && n9 != this.s0()) {
            n9 = this.H;
            f9 = n9 - n8;
            f8 = n9 - this.s0();
            return f9 / f8;
        }
        n9 = this.H;
        f9 = n9 - n8;
        f8 = this.X - n9;
        return f9 / f8;
    }

    private void i1() {
        WeakReference<Object> weakReference = this.Y;
        if (weakReference != null) {
            this.j1((View)weakReference.get(), 0);
        }
        if ((weakReference = this.Z) != null) {
            this.j1((View)weakReference.get(), 1);
        }
    }

    private boolean j0() {
        return this.A0() && this.B0();
    }

    private void j1(View view, int n8) {
        int n9;
        block8: {
            block9: {
                block10: {
                    block7: {
                        if (view == null) break block7;
                        this.k0(view, n8);
                        boolean bl = this.b;
                        n9 = 6;
                        if (!bl && this.O != 6) {
                            this.j0.put(n8, this.b0(view, ax.k6.k.a, 6));
                        }
                        if (this.J && this.B0() && this.O != 5) {
                            this.H0(view, H.a.y, 5);
                        }
                        if ((n8 = this.O) == 3) break block8;
                        if (n8 == 4) break block9;
                        if (n8 == 6) break block10;
                    }
                    return;
                }
                this.H0(view, H.a.x, 4);
                this.H0(view, H.a.w, 3);
                return;
            }
            if (this.b) {
                n9 = 3;
            }
            this.H0(view, H.a.w, n9);
            return;
        }
        if (this.b) {
            n9 = 4;
        }
        this.H0(view, H.a.x, n9);
    }

    private void k0(View view, int n8) {
        if (view != null) {
            ax.c0.d0.f0(view, 524288);
            ax.c0.d0.f0(view, 262144);
            ax.c0.d0.f0(view, 0x100000);
            int n9 = this.j0.get(n8, -1);
            if (n9 != -1) {
                ax.c0.d0.f0(view, n9);
                this.j0.delete(n8);
            }
        }
    }

    private void k1(int n8, boolean bl) {
        boolean bl2;
        if (n8 != 2 && this.A != (bl2 = this.y0()) && this.j != null) {
            Object object;
            this.A = bl2;
            float f8 = 1.0f;
            if (bl && (object = this.C) != null) {
                if (object.isRunning()) {
                    this.C.reverse();
                    return;
                }
                float f9 = this.j.C();
                if (bl2) {
                    f8 = this.g0();
                }
                this.C.setFloatValues(new float[]{f9, f8});
                this.C.start();
                return;
            }
            object = this.C;
            if (object != null && object.isRunning()) {
                this.C.cancel();
            }
            object = this.j;
            if (this.A) {
                f8 = this.g0();
            }
            ((ax.O6.h)object).h0(f8);
        }
    }

    private M l0(int n8) {
        return new M(){
            final int a;
            final BottomSheetBehavior b;
            {
                this.b = bottomSheetBehavior;
                this.a = n8;
            }

            @Override
            public boolean a(View view, M.a a8) {
                this.b.Z0(this.a);
                return true;
            }
        };
    }

    private void l1(boolean bl) {
        block7: {
            int n8;
            Object object;
            block8: {
                object = this.Y;
                if (object == null || !((object = ((View)object.get()).getParent()) instanceof CoordinatorLayout)) break block7;
                object = (CoordinatorLayout)object;
                n8 = object.getChildCount();
                if (!bl) break block8;
                if (this.i0 != null) break block7;
                this.i0 = new HashMap<View, Integer>(n8);
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                Map<View, Integer> map;
                View view = object.getChildAt(i8);
                if (view == this.Y.get()) continue;
                if (bl) {
                    this.i0.put(view, view.getImportantForAccessibility());
                    if (!this.c) continue;
                    view.setImportantForAccessibility(4);
                    continue;
                }
                if (!this.c || (map = this.i0) == null || !map.containsKey(view)) continue;
                view.setImportantForAccessibility(this.i0.get(view).intValue());
            }
            if (!bl) {
                this.i0 = null;
                return;
            }
            if (this.c) {
                ((View)this.Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void m0(Context context) {
        ax.O6.h h8;
        if (this.z == null) {
            return;
        }
        this.j = h8 = new ax.O6.h(this.z);
        h8.U(context);
        h8 = this.k;
        if (h8 != null) {
            this.j.g0((ColorStateList)h8);
            return;
        }
        h8 = new TypedValue();
        context.getTheme().resolveAttribute(0x1010031, (TypedValue)h8, true);
        this.j.setTint(((TypedValue)h8).data);
    }

    private void m1(boolean bl) {
        if (this.Y != null) {
            View view;
            this.d0();
            if (this.O == 4 && (view = (View)this.Y.get()) != null) {
                if (bl) {
                    this.Z0(4);
                    return;
                }
                view.requestLayout();
            }
        }
    }

    private void n0() {
        ValueAnimator valueAnimator;
        this.C = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{this.g0(), 1.0f});
        valueAnimator.setDuration(500L);
        this.C.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final BottomSheetBehavior a;
            {
                this.a = bottomSheetBehavior;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                if (this.a.j != null) {
                    this.a.j.h0(f8);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> q0(V object) {
        if ((object = object.getLayoutParams()) instanceof CoordinatorLayout.f) {
            if ((object = ((CoordinatorLayout.f)((Object)object)).f()) instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior)object;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int r0(int n8, int n9, int n10, int n11) {
        n9 = ViewGroup.getChildMeasureSpec((int)n8, (int)n9, (int)n11);
        if (n10 == -1) {
            return n9;
        }
        n8 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (n8 != 0x40000000) {
            if (n9 != 0) {
                n10 = Math.min(n9, n10);
            }
            return View.MeasureSpec.makeMeasureSpec((int)n10, (int)Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.min(n9, n10), (int)0x40000000);
    }

    private int v0(int n8) {
        if (n8 != 3) {
            if (n8 != 4) {
                if (n8 != 5) {
                    if (n8 == 6) {
                        return this.F;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid state to get top offset: ");
                    stringBuilder.append(n8);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return this.X;
            }
            return this.H;
        }
        return this.s0();
    }

    private float w0() {
        VelocityTracker velocityTracker = this.d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.d0.getYVelocity(this.f0);
    }

    private boolean x0() {
        WeakReference<V> weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            weakReference = (WeakReference<V>)new int[2];
            ((View)this.Y.get()).getLocationOnScreen((int[])weakReference);
            if (weakReference[1] == false) {
                return true;
            }
        }
        return false;
    }

    private boolean y0() {
        return this.O == 3 && (this.y || this.x0());
    }

    public boolean A0() {
        return this.J;
    }

    @Override
    public void B(CoordinatorLayout coordinatorLayout, V v8, Parcelable parcelable) {
        parcelable = (h)parcelable;
        super.B(coordinatorLayout, v8, parcelable.a());
        this.J0((h)parcelable);
        int n8 = parcelable.d0;
        if (n8 != 1 && n8 != 2) {
            this.O = n8;
            this.P = n8;
            return;
        }
        this.O = 4;
        this.P = 4;
    }

    public boolean B0() {
        return true;
    }

    @Override
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v8) {
        return new h(super.C(coordinatorLayout, v8), this);
    }

    public boolean D0() {
        return true;
    }

    @Override
    public boolean E(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8, int n9) {
        boolean bl = false;
        this.S = 0;
        this.T = false;
        if ((n8 & 2) != 0) {
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void G(CoordinatorLayout var1_1, V var2_2, View var3_3, int var4_4) {
        block6: {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            block5: {
                                var6_5 = var2_2.getTop();
                                var5_6 = this.s0();
                                var4_4 = 3;
                                if (var6_5 == var5_6) {
                                    this.a1(3);
                                    return;
                                }
                                if (this.D0() && ((var1_1 = this.b0) == null || var3_3 != var1_1.get() || !this.T)) {
                                    return;
                                }
                                if (this.S <= 0) break block5;
                                if (this.b || var2_2.getTop() <= this.F) break block6;
                                ** GOTO lbl37
                            }
                            if (!this.J || !this.e1((View)var2_2, this.w0())) break block7;
                            var4_4 = 5;
                            break block6;
                        }
                        if (this.S != 0) break block8;
                        var5_6 = var2_2.getTop();
                        if (!this.b) break block9;
                        if (Math.abs(var5_6 - this.E) >= Math.abs(var5_6 - this.H)) ** GOTO lbl-1000
                        break block6;
                    }
                    var6_5 = this.F;
                    if (var5_6 >= var6_5) break block10;
                    if (var5_6 < Math.abs(var5_6 - this.H)) break block6;
                    if (!this.f1()) ** GOTO lbl37
                    ** GOTO lbl-1000
                }
                if (Math.abs(var5_6 - var6_5) >= Math.abs(var5_6 - this.H)) ** GOTO lbl-1000
                ** GOTO lbl37
            }
            if (this.b) lbl-1000:
            // 5 sources

            {
                while (true) {
                    var4_4 = 4;
                    break;
                }
            } else {
                if (Math.abs((var4_4 = var2_2.getTop()) - this.F) >= Math.abs(var4_4 - this.H)) ** continue;
lbl37:
                // 4 sources

                var4_4 = 6;
            }
        }
        this.h1((View)var2_2, var4_4, false);
        this.T = false;
    }

    public void G0(g g8) {
        this.c0.remove(g8);
    }

    @Override
    public boolean H(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int n8 = motionEvent.getActionMasked();
        if (this.O == 1 && n8 == 0) {
            return true;
        }
        if (this.d1()) {
            this.Q.F(motionEvent);
        }
        if (n8 == 0) {
            this.I0();
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        if (this.d1() && n8 == 2 && !this.R && Math.abs((float)this.g0 - motionEvent.getY()) > (float)this.Q.z()) {
            this.Q.b((View)v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.R ^ true;
    }

    public void L0(boolean bl) {
        this.L = bl;
    }

    public void M0(boolean bl) {
        this.M = bl;
    }

    public void N0(int n8) {
        if (n8 >= 0) {
            this.D = n8;
            this.k1(this.O, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void O0(boolean bl) {
        if (this.b == bl) {
            return;
        }
        this.b = bl;
        if (this.Y != null) {
            this.d0();
        }
        int n8 = this.b && this.O == 6 ? 3 : this.O;
        this.a1(n8);
        this.k1(this.O, true);
        this.i1();
    }

    public void P0(boolean bl) {
        this.o = bl;
    }

    public void Q0(float f8) {
        if (!(f8 <= 0.0f) && !(f8 >= 1.0f)) {
            this.G = f8;
            if (this.Y != null) {
                this.f0();
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void R0(boolean bl) {
        if (this.J != bl) {
            this.J = bl;
            if (!bl && this.O == 5) {
                this.Z0(4);
            }
            this.i1();
        }
    }

    public void S0(int n8) {
        this.m = n8;
    }

    public void T0(int n8) {
        this.l = n8;
    }

    public void U0(int n8) {
        this.V0(n8, false);
    }

    public final void V0(int n8, boolean bl) {
        block4: {
            block5: {
                block3: {
                    block2: {
                        if (n8 != -1) break block2;
                        if (this.g) break block3;
                        this.g = true;
                        break block4;
                    }
                    if (this.g || this.f != n8) break block5;
                }
                return;
            }
            this.g = false;
            this.f = Math.max(0, n8);
        }
        this.m1(bl);
    }

    public void W0(int n8) {
        this.a = n8;
    }

    public void X0(int n8) {
        this.e = n8;
    }

    public void Y0(boolean bl) {
        this.K = bl;
    }

    public void Z0(int n8) {
        if (n8 != 1 && n8 != 2) {
            if (!this.J && n8 == 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot set state: ");
                stringBuilder.append(n8);
                Log.w((String)"BottomSheetBehavior", (String)stringBuilder.toString());
                return;
            }
            int n9 = n8 == 6 && this.b && this.v0(n8) <= this.E ? 3 : n8;
            View view = this.Y;
            if (view != null && view.get() != null) {
                view = (View)this.Y.get();
                this.K0(view, new Runnable(){
                    final int c0;
                    final BottomSheetBehavior d0;
                    final View q;
                    {
                        this.d0 = bottomSheetBehavior;
                        this.q = view;
                        this.c0 = n8;
                    }

                    @Override
                    public void run() {
                        this.d0.h1(this.q, this.c0, false);
                    }
                });
                return;
            }
            this.a1(n8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("STATE_");
        String string = n8 == 1 ? "DRAGGING" : "SETTLING";
        stringBuilder.append(string);
        stringBuilder.append(" should not be set externally.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public void a(ax.i.b b8) {
        f f8 = this.e0;
        if (f8 == null) {
            return;
        }
        f8.j(b8);
    }

    void a1(int n8) {
        View view;
        block9: {
            block8: {
                if (this.O == n8) break block8;
                this.O = n8;
                if (n8 == 4 || n8 == 3 || n8 == 6 || this.J && n8 == 5) {
                    this.P = n8;
                }
                if ((view = this.Y) != null && (view = (View)view.get()) != null) break block9;
            }
            return;
        }
        int n9 = 0;
        if (n8 == 3) {
            this.l1(true);
        } else if (n8 == 6 || n8 == 5 || n8 == 4) {
            this.l1(false);
        }
        this.k1(n8, true);
        while (n9 < this.c0.size()) {
            this.c0.get(n9).c(view, n8);
            ++n9;
        }
        this.i1();
    }

    @Override
    public void b(ax.i.b b8) {
        f f8 = this.e0;
        if (f8 == null) {
            return;
        }
        f8.l(b8);
    }

    @Override
    public void c() {
        Object object = this.e0;
        if (object == null) {
            return;
        }
        object = ((ax.H6.a)object).c();
        int n8 = 4;
        if (object != null && Build.VERSION.SDK_INT >= 34) {
            if (this.J) {
                this.e0.h((ax.i.b)object, (Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                    final BottomSheetBehavior a;
                    {
                        this.a = bottomSheetBehavior;
                    }

                    public void onAnimationEnd(Animator object) {
                        this.a.a1(5);
                        object = this.a.Y;
                        if (object != null && ((Reference)object).get() != null) {
                            ((View)this.a.Y.get()).requestLayout();
                        }
                    }
                });
                return;
            }
            this.e0.i((ax.i.b)object, null);
            this.Z0(4);
            return;
        }
        if (this.J) {
            n8 = 5;
        }
        this.Z0(n8);
    }

    public void c0(g g8) {
        if (!this.c0.contains(g8)) {
            this.c0.add(g8);
        }
    }

    public boolean c1(long l8, float f8) {
        return false;
    }

    @Override
    public void d() {
        f f8 = this.e0;
        if (f8 == null) {
            return;
        }
        f8.f();
    }

    boolean e1(View view, float f8) {
        if (this.K) {
            return true;
        }
        if (!this.B0()) {
            return false;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        int n8 = this.h0();
        return Math.abs((float)view.getTop() + f8 * this.U - (float)this.H) / (float)n8 > 0.5f;
    }

    public boolean f1() {
        return false;
    }

    public boolean g1() {
        return true;
    }

    @Override
    public void k(CoordinatorLayout.f f8) {
        super.k(f8);
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    @Override
    public void n() {
        super.n();
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    @Override
    public boolean o(CoordinatorLayout coordinatorLayout, V object, MotionEvent motionEvent) {
        if (object.isShown() && this.L) {
            int n8 = motionEvent.getActionMasked();
            if (n8 == 0) {
                this.I0();
            }
            if (this.d0 == null) {
                this.d0 = VelocityTracker.obtain();
            }
            this.d0.addMovement(motionEvent);
            if (n8 != 0) {
                if (n8 == 1 || n8 == 3) {
                    this.h0 = false;
                    this.f0 = -1;
                    if (this.R) {
                        this.R = false;
                        return false;
                    }
                }
            } else {
                int n9;
                int n10 = (int)motionEvent.getX();
                this.g0 = n9 = (int)motionEvent.getY();
                if (this.O != 2 && this.F0(coordinatorLayout, n10, n9)) {
                    this.f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (!this.E0(coordinatorLayout, n10, this.g0)) {
                        this.h0 = true;
                    }
                }
                boolean bl = this.f0 == -1 && !coordinatorLayout.B((View)object, n10, this.g0);
                this.R = bl;
            }
            if (!this.R && (object = this.Q) != null && ((c)object).P(motionEvent)) {
                return true;
            }
            object = this.b0;
            object = object != null ? (View)((Reference)object).get() : null;
            return n8 == 2 && object != null && !this.R && this.O != 1 && !coordinatorLayout.B((View)object, (int)motionEvent.getX(), (int)motionEvent.getY()) && this.Q != null && (n8 = this.g0) != -1 && Math.abs((float)n8 - motionEvent.getY()) > (float)this.Q.z();
        }
        this.R = true;
        return false;
    }

    void o0(int n8) {
        View view = (View)this.Y.get();
        if (view != null && !this.c0.isEmpty()) {
            float f8 = this.i0(n8);
            for (n8 = 0; n8 < this.c0.size(); ++n8) {
                this.c0.get(n8).b(view, f8);
            }
        }
    }

    @Override
    public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        int n9;
        if (coordinatorLayout.getFitsSystemWindows() && !v8.getFitsSystemWindows()) {
            v8.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(ax.k6.e.a);
            this.b1((View)v8);
            ax.c0.d0.C0(v8, new b((View)v8));
            this.Y = new WeakReference<V>(v8);
            this.e0 = new f((View)v8);
            ax.O6.h h8 = this.j;
            if (h8 != null) {
                float f8;
                v8.setBackground((Drawable)h8);
                h8 = this.j;
                float f9 = f8 = this.I;
                if (f8 == -1.0f) {
                    f9 = v8.getElevation();
                }
                h8.f0(f9);
            } else {
                h8 = this.k;
                if (h8 != null) {
                    ax.c0.d0.p0(v8, (ColorStateList)h8);
                }
            }
            this.i1();
            if (v8.getImportantForAccessibility() == 0) {
                v8.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = ax.l0.c.o(coordinatorLayout, this.k0);
        }
        int n10 = v8.getTop();
        coordinatorLayout.I((View)v8, n8);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        this.V = n9 = v8.getHeight();
        n8 = this.X;
        int n11 = this.x;
        if (n8 - n9 < n11) {
            if (this.s) {
                n9 = this.m;
                if (n9 != -1) {
                    n8 = Math.min(n8, n9);
                }
                this.V = n8;
            } else {
                n8 -= n11;
                n9 = this.m;
                if (n9 != -1) {
                    n8 = Math.min(n8, n9);
                }
                this.V = n8;
            }
        }
        n11 = this.X;
        n9 = this.V;
        n8 = 0;
        this.E = Math.max(0, n11 - n9);
        this.f0();
        this.d0();
        n9 = this.O;
        if (n9 == 3) {
            ax.c0.d0.W(v8, this.s0());
        } else if (n9 == 6) {
            ax.c0.d0.W(v8, this.F);
        } else if (this.J && n9 == 5) {
            ax.c0.d0.W(v8, this.X);
        } else if (n9 == 4) {
            ax.c0.d0.W(v8, this.H);
        } else if (n9 == 1 || n9 == 2) {
            ax.c0.d0.W(v8, n10 - v8.getTop());
        }
        this.k1(this.O, false);
        this.b0 = new WeakReference<View>(this.p0((View)v8));
        while (n8 < this.c0.size()) {
            this.c0.get(n8).a((View)v8);
            ++n8;
        }
        return true;
    }

    View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n8 = viewGroup.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                view = this.p0(viewGroup.getChildAt(i8));
                if (view == null) continue;
                return view;
            }
        }
        return null;
    }

    @Override
    public boolean q(CoordinatorLayout coordinatorLayout, V v8, int n8, int n9, int n10, int n11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)v8.getLayoutParams();
        v8.measure(this.r0(n8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9, this.l, marginLayoutParams.width), this.r0(n10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11, this.m, marginLayoutParams.height));
        return true;
    }

    @Override
    public boolean s(CoordinatorLayout coordinatorLayout, V v8, View view, float f8, float f9) {
        WeakReference<View> weakReference;
        return this.D0() && (weakReference = this.b0) != null && view == weakReference.get() && (this.O != 3 && !this.N || super.s(coordinatorLayout, v8, view, f8, f9));
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        int n8 = this.D;
        int n9 = this.s ? 0 : this.x;
        return Math.max(n8, n9);
    }

    ax.O6.h t0() {
        return this.j;
    }

    @Override
    public void u(CoordinatorLayout weakReference, V v8, View view, int n8, int n9, int[] nArray, int n10) {
        block8: {
            block10: {
                block5: {
                    block9: {
                        block6: {
                            block7: {
                                if (n10 == 1) break block5;
                                weakReference = this.b0;
                                weakReference = weakReference != null ? (View)weakReference.get() : null;
                                if (this.D0() && view != weakReference) break block5;
                                n10 = v8.getTop();
                                n8 = n10 - n9;
                                if (n9 <= 0) break block6;
                                if (!this.T && !this.M && view == weakReference && view.canScrollVertically(1)) {
                                    this.N = true;
                                    return;
                                }
                                if (n8 >= this.s0()) break block7;
                                nArray[1] = n8 = n10 - this.s0();
                                ax.c0.d0.W(v8, -n8);
                                this.a1(3);
                                break block8;
                            }
                            if (!this.L) break block5;
                            nArray[1] = n9;
                            ax.c0.d0.W(v8, -n9);
                            this.a1(1);
                            break block8;
                        }
                        if (n9 >= 0) break block8;
                        boolean bl = view.canScrollVertically(-1);
                        if (!this.T && !this.M && view == weakReference && bl) {
                            this.N = true;
                            return;
                        }
                        if (bl) break block8;
                        if (n8 <= this.H || this.j0()) break block9;
                        nArray[1] = n8 = n10 - this.H;
                        ax.c0.d0.W(v8, -n8);
                        this.a1(4);
                        break block8;
                    }
                    if (this.L) break block10;
                }
                return;
            }
            nArray[1] = n9;
            ax.c0.d0.W(v8, -n9);
            this.a1(1);
        }
        this.o0(v8.getTop());
        this.S = n9;
        this.T = true;
        this.N = false;
    }

    public int u0() {
        return this.O;
    }

    @Override
    public void x(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
    }

    public boolean z0() {
        return this.o;
    }

    public static abstract class g {
        void a(View view) {
        }

        public abstract void b(View var1, float var2);

        public abstract void c(View var1, int var2);
    }

    protected static class h
    extends ax.k0.a {
        public static final Parcelable.Creator<h> CREATOR = new Parcelable.ClassLoaderCreator<h>(){

            public h a(Parcel parcel) {
                return new h(parcel, null);
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public h[] c(int n8) {
                return new h[n8];
            }
        };
        final int d0;
        int e0;
        boolean f0;
        boolean g0;
        boolean h0;

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readInt();
            int n8 = parcel.readInt();
            boolean bl = false;
            boolean bl2 = n8 == 1;
            this.f0 = bl2;
            bl2 = parcel.readInt() == 1;
            this.g0 = bl2;
            bl2 = bl;
            if (parcel.readInt() == 1) {
                bl2 = true;
            }
            this.h0 = bl2;
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d0 = bottomSheetBehavior.O;
            this.e0 = ((BottomSheetBehavior)bottomSheetBehavior).f;
            this.f0 = ((BottomSheetBehavior)bottomSheetBehavior).b;
            this.g0 = bottomSheetBehavior.J;
            this.h0 = ((BottomSheetBehavior)bottomSheetBehavior).K;
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0 ? 1 : 0);
            parcel.writeInt(this.g0 ? 1 : 0);
            parcel.writeInt(this.h0 ? 1 : 0);
        }
    }

    private class i {
        private int a;
        private boolean b;
        private final Runnable c;
        final BottomSheetBehavior d;

        private i(BottomSheetBehavior bottomSheetBehavior) {
            this.d = bottomSheetBehavior;
            this.c = new Runnable(this){
                final i q;
                {
                    this.q = i8;
                }

                @Override
                public void run() {
                    com.google.android.material.bottomsheet.BottomSheetBehavior$i.a(this.q, false);
                    Object object = this.q.d.Q;
                    if (object != null && ((c)object).m(true)) {
                        object = this.q;
                        ((i)object).c(((i)object).a);
                        return;
                    }
                    i i8 = this.q;
                    object = i8.d;
                    if (((BottomSheetBehavior)object).O == 2) {
                        ((BottomSheetBehavior)object).a1(i8.a);
                    }
                }
            };
        }

        static /* synthetic */ boolean a(i i8, boolean bl) {
            i8.b = bl;
            return bl;
        }

        void c(int n8) {
            WeakReference weakReference = this.d.Y;
            if (weakReference != null && weakReference.get() != null) {
                this.a = n8;
                if (!this.b) {
                    ((View)this.d.Y.get()).postOnAnimation(this.c);
                    this.b = true;
                }
            }
        }
    }
}

