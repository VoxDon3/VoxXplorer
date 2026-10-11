package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.z;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.d0.M;
import ax.i.C2186b;
import ax.k0.AbstractC2357a;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.C2410k;
import ax.k6.l;
import ax.k6.m;
import ax.l0.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements ax.H6.b {
    private static final int l0 = l.h;
    private boolean A;
    private final BottomSheetBehavior<V>.i B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    int O;
    int P;
    ax.l0.c Q;
    private boolean R;
    private int S;
    private boolean T;
    private float U;
    private int V;
    int W;
    int X;
    WeakReference<V> Y;
    WeakReference<View> Z;
    private int a;
    WeakReference<View> a0;
    private boolean b;
    WeakReference<View> b0;
    private boolean c;
    private final ArrayList<g> c0;
    private float d;
    private VelocityTracker d0;
    private int e;
    ax.H6.f e0;
    private int f;
    int f0;
    private boolean g;
    private int g0;
    private int h;
    boolean h0;
    private int i;
    private Map<View, Integer> i0;
    private ax.O6.h j;
    final SparseIntArray j0;
    private ColorStateList k;
    private final c.AbstractC0359c k0;
    private int l;
    private int m;
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
    private ax.O6.l z;

    class a implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ View q;

        a(View view, int i) {
            this.q = view;
            this.c0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.h1(this.q, this.c0, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.a1(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.Y.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.h0(floatValue);
            }
        }
    }

    class d implements z.c {
        final /* synthetic */ boolean a;

        d(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // ax.F6.z.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.c0.F0 a(android.view.View r11, ax.c0.F0 r12, ax.F6.z.d r13) {
            /*
                r10 = this;
                int r0 = ax.c0.F0.m.h()
                ax.T.b r0 = r12.f(r0)
                int r1 = ax.c0.F0.m.e()
                ax.T.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.b
                com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2, r3)
                boolean r2 = ax.F6.z.h(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.W(r3, r6)
                int r3 = r13.d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.X(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.c
                goto L50
            L4e:
                int r4 = r13.a
            L50:
                int r6 = r0.a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Y(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.a
                goto L62
            L60:
                int r13 = r13.c
            L62:
                int r2 = r0.c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.Z(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.a0(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = 1
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.J(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.d
                com.google.android.material.bottomsheet.BottomSheetBehavior.K(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.L(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, ax.c0.F0, ax.F6.z$d):ax.c0.F0");
        }
    }

    class e extends c.AbstractC0359c {
        private long a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.X + bottomSheetBehavior.s0()) / 2;
        }

        @Override // ax.l0.c.AbstractC0359c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // ax.l0.c.AbstractC0359c
        public int b(View view, int i, int i2) {
            return ax.W.a.b(i, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // ax.l0.c.AbstractC0359c
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.X : BottomSheetBehavior.this.H;
        }

        @Override // ax.l0.c.AbstractC0359c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.a1(1);
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.o0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            if (r7.b.c1(r3, (r9 * 100.0f) / r10.X) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r9 > r7.b.F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.b.s0()) < java.lang.Math.abs(r8.getTop() - r7.b.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        
            if (r7.b.f1() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
        
            if (java.lang.Math.abs(r9 - r7.b.E) < java.lang.Math.abs(r9 - r7.b.H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        
            if (r7.b.f1() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
        
            if (r7.b.f1() == false) goto L63;
         */
        @Override // ax.l0.c.AbstractC0359c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // ax.l0.c.AbstractC0359c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.O;
            if (i2 == 1 || bottomSheetBehavior.h0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f0 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.b0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = SystemClock.uptimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements M {
        final /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        @Override // ax.d0.M
        public boolean a(View view, M.a aVar) {
            BottomSheetBehavior.this.Z0(this.a);
            return true;
        }
    }

    public static abstract class g {
        void a(View view) {
        }

        public abstract void b(View view, float f);

        public abstract void c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.c0 = new ArrayList<>();
        this.g0 = -1;
        this.j0 = new SparseIntArray();
        this.k0 = new e();
    }

    private boolean C0(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && v.isAttachedToWindow();
    }

    private boolean E0(CoordinatorLayout coordinatorLayout, int i2, int i3) {
        WeakReference<View> weakReference = this.a0;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i2, i3);
    }

    private boolean F0(CoordinatorLayout coordinatorLayout, int i2, int i3) {
        WeakReference<View> weakReference = this.b0;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i2, i3);
    }

    private void H0(View view, H.a aVar, int i2) {
        C1760d0.h0(view, aVar, null, l0(i2));
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

    private void J0(h hVar) {
        int i2 = this.a;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f = hVar.e0;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.b = hVar.f0;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.J = hVar.g0;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.K = hVar.h0;
        }
    }

    private void K0(V v, Runnable runnable) {
        if (C0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int b0(View view, int i2, int i3) {
        return C1760d0.c(view, view.getResources().getString(i2), l0(i3));
    }

    private void b1(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || z0() || this.g) ? false : true;
        if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
            z.b(view, new d(z));
        }
    }

    private void d0() {
        int h0 = h0();
        if (this.b) {
            this.H = Math.max(this.X - h0, this.E);
        } else {
            this.H = this.X - h0;
        }
    }

    private boolean d1() {
        if (this.Q != null) {
            return this.L || this.O == 1;
        }
        return false;
    }

    private float e0(float f2, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f3 = radius;
            if (f3 > 0.0f && f2 > 0.0f) {
                return f3 / f2;
            }
        }
        return 0.0f;
    }

    private void f0() {
        this.F = (int) (this.X * (1.0f - this.G));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0 = r0.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float g0() {
        /*
            r4 = this;
            ax.O6.h r0 = r4.j
            if (r0 == 0) goto L4b
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.Y
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L4b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L4b
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.Y
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r4.x0()
            if (r1 == 0) goto L4b
            android.view.WindowInsets r0 = ax.q6.C2871a.a(r0)
            if (r0 == 0) goto L4b
            ax.O6.h r1 = r4.j
            float r1 = r1.N()
            r2 = 0
            android.view.RoundedCorner r2 = ax.q6.C2872b.a(r0, r2)
            float r1 = r4.e0(r1, r2)
            ax.O6.h r2 = r4.j
            float r2 = r2.O()
            r3 = 1
            android.view.RoundedCorner r0 = ax.q6.C2872b.a(r0, r3)
            float r0 = r4.e0(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
        L4b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g0():float");
    }

    private int h0() {
        int i2;
        return this.g ? Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V) + this.w : (this.o || this.p || (i2 = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i2 + this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(View view, int i2, boolean z) {
        int v0 = v0(i2);
        ax.l0.c cVar = this.Q;
        if (cVar == null || (!z ? cVar.Q(view, view.getLeft(), v0) : cVar.O(view.getLeft(), v0))) {
            a1(i2);
            return;
        }
        a1(2);
        k1(i2, true);
        this.B.c(i2);
    }

    private float i0(int i2) {
        float f2;
        float f3;
        int i3 = this.H;
        if (i2 > i3 || i3 == s0()) {
            int i4 = this.H;
            f2 = i4 - i2;
            f3 = this.X - i4;
        } else {
            int i5 = this.H;
            f2 = i5 - i2;
            f3 = i5 - s0();
        }
        return f2 / f3;
    }

    private void i1() {
        WeakReference<V> weakReference = this.Y;
        if (weakReference != null) {
            j1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.Z;
        if (weakReference2 != null) {
            j1(weakReference2.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return A0() && B0();
    }

    private void j1(View view, int i2) {
        if (view == null) {
            return;
        }
        k0(view, i2);
        if (!this.b && this.O != 6) {
            this.j0.put(i2, b0(view, C2410k.a, 6));
        }
        if (this.J && B0() && this.O != 5) {
            H0(view, H.a.y, 5);
        }
        int i3 = this.O;
        if (i3 == 3) {
            H0(view, H.a.x, this.b ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            H0(view, H.a.w, this.b ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            H0(view, H.a.x, 4);
            H0(view, H.a.w, 3);
        }
    }

    private void k0(View view, int i2) {
        if (view == null) {
            return;
        }
        C1760d0.f0(view, 524288);
        C1760d0.f0(view, 262144);
        C1760d0.f0(view, 1048576);
        int i3 = this.j0.get(i2, -1);
        if (i3 != -1) {
            C1760d0.f0(view, i3);
            this.j0.delete(i2);
        }
    }

    private void k1(int i2, boolean z) {
        boolean y0;
        ValueAnimator valueAnimator;
        if (i2 == 2 || this.A == (y0 = y0()) || this.j == null) {
            return;
        }
        this.A = y0;
        if (!z || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.j.h0(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.j.C(), y0 ? g0() : 1.0f);
            this.C.start();
        }
    }

    private M l0(int i2) {
        return new f(i2);
    }

    private void l1(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.i0 != null) {
                    return;
                } else {
                    this.i0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.Y.get()) {
                    if (z) {
                        this.i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.c && (map = this.i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.i0.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.i0 = null;
            } else if (this.c) {
                this.Y.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void m0(Context context) {
        if (this.z == null) {
            return;
        }
        ax.O6.h hVar = new ax.O6.h(this.z);
        this.j = hVar;
        hVar.U(context);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            this.j.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.j.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(boolean z) {
        V v;
        if (this.Y != null) {
            d0();
            if (this.O != 4 || (v = this.Y.get()) == null) {
                return;
            }
            if (z) {
                Z0(4);
            } else {
                v.requestLayout();
            }
        }
    }

    private void n0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    public static <V extends View> BottomSheetBehavior<V> q0(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c f2 = ((CoordinatorLayout.f) layoutParams).f();
        if (f2 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f2;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int r0(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    private int v0(int i2) {
        if (i2 == 3) {
            return s0();
        }
        if (i2 == 4) {
            return this.H;
        }
        if (i2 == 5) {
            return this.X;
        }
        if (i2 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
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
            int[] iArr = new int[2];
            this.Y.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean y0() {
        if (this.O == 3) {
            return this.y || x0();
        }
        return false;
    }

    public boolean A0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v, hVar.a());
        J0(hVar);
        int i2 = hVar.d0;
        if (i2 == 1 || i2 == 2) {
            this.O = 4;
            this.P = 4;
        } else {
            this.O = i2;
            this.P = i2;
        }
    }

    public boolean B0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v) {
        return new h(super.C(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.S = 0;
        this.T = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (f1() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.s0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.a1(r0)
            return
        Lf:
            boolean r3 = r2.D0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.T
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.S
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.w0()
            boolean r3 = r2.e1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.S
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.f1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.h1(r4, r0, r3)
            r2.T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void G0(g gVar) {
        this.c0.remove(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.O == 1 && actionMasked == 0) {
            return true;
        }
        if (d1()) {
            this.Q.F(motionEvent);
        }
        if (actionMasked == 0) {
            I0();
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        if (d1() && actionMasked == 2 && !this.R && Math.abs(this.g0 - motionEvent.getY()) > this.Q.z()) {
            this.Q.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.R;
    }

    public void L0(boolean z) {
        this.L = z;
    }

    public void M0(boolean z) {
        this.M = z;
    }

    public void N0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i2;
        k1(this.O, true);
    }

    public void O0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.Y != null) {
            d0();
        }
        a1((this.b && this.O == 6) ? 3 : this.O);
        k1(this.O, true);
        i1();
    }

    public void P0(boolean z) {
        this.o = z;
    }

    public void Q0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f2;
        if (this.Y != null) {
            f0();
        }
    }

    public void R0(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.O == 5) {
                Z0(4);
            }
            i1();
        }
    }

    public void S0(int i2) {
        this.m = i2;
    }

    public void T0(int i2) {
        this.l = i2;
    }

    public void U0(int i2) {
        V0(i2, false);
    }

    public final void V0(int i2, boolean z) {
        if (i2 == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i2) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i2);
        }
        m1(z);
    }

    public void W0(int i2) {
        this.a = i2;
    }

    public void X0(int i2) {
        this.e = i2;
    }

    public void Y0(boolean z) {
        this.K = z;
    }

    public void Z0(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.b && v0(i2) <= this.E) ? 3 : i2;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            a1(i2);
        } else {
            V v = this.Y.get();
            K0(v, new a(v, i3));
        }
    }

    @Override // ax.H6.b
    public void a(C2186b c2186b) {
        ax.H6.f fVar = this.e0;
        if (fVar == null) {
            return;
        }
        fVar.j(c2186b);
    }

    void a1(int i2) {
        V v;
        if (this.O == i2) {
            return;
        }
        this.O = i2;
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.J && i2 == 5)) {
            this.P = i2;
        }
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            l1(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            l1(false);
        }
        k1(i2, true);
        for (int i3 = 0; i3 < this.c0.size(); i3++) {
            this.c0.get(i3).c(v, i2);
        }
        i1();
    }

    @Override // ax.H6.b
    public void b(C2186b c2186b) {
        ax.H6.f fVar = this.e0;
        if (fVar == null) {
            return;
        }
        fVar.l(c2186b);
    }

    @Override // ax.H6.b
    public void c() {
        ax.H6.f fVar = this.e0;
        if (fVar == null) {
            return;
        }
        C2186b c2 = fVar.c();
        if (c2 == null || Build.VERSION.SDK_INT < 34) {
            Z0(this.J ? 5 : 4);
        } else if (this.J) {
            this.e0.h(c2, new b());
        } else {
            this.e0.i(c2, null);
            Z0(4);
        }
    }

    public void c0(g gVar) {
        if (this.c0.contains(gVar)) {
            return;
        }
        this.c0.add(gVar);
    }

    public boolean c1(long j, float f2) {
        return false;
    }

    @Override // ax.H6.b
    public void d() {
        ax.H6.f fVar = this.e0;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    boolean e1(View view, float f2) {
        if (this.K) {
            return true;
        }
        if (B0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f2 * this.U)) - ((float) this.H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public boolean f1() {
        return false;
    }

    public boolean g1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i2;
        ax.l0.c cVar;
        if (!v.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            I0();
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.g0 = y;
            if (this.O != 2 && F0(coordinatorLayout, x, y)) {
                this.f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!E0(coordinatorLayout, x, this.g0)) {
                    this.h0 = true;
                }
            }
            this.R = this.f0 == -1 && !coordinatorLayout.B(v, x, this.g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.h0 = false;
            this.f0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (!this.R && (cVar = this.Q) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference = this.b0;
        View view = weakReference != null ? weakReference.get() : null;
        return (actionMasked != 2 || view == null || this.R || this.O == 1 || coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Q == null || (i2 = this.g0) == -1 || Math.abs(((float) i2) - motionEvent.getY()) <= ((float) this.Q.z())) ? false : true;
    }

    void o0(int i2) {
        V v = this.Y.get();
        if (v == null || this.c0.isEmpty()) {
            return;
        }
        float i0 = i0(i2);
        for (int i3 = 0; i3 < this.c0.size(); i3++) {
            this.c0.get(i3).b(v, i0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, int i2) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(C2404e.a);
            b1(v);
            C1760d0.C0(v, new com.google.android.material.bottomsheet.b(v));
            this.Y = new WeakReference<>(v);
            this.e0 = new ax.H6.f(v);
            ax.O6.h hVar = this.j;
            if (hVar != null) {
                v.setBackground(hVar);
                ax.O6.h hVar2 = this.j;
                float f2 = this.I;
                if (f2 == -1.0f) {
                    f2 = v.getElevation();
                }
                hVar2.f0(f2);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    C1760d0.p0(v, colorStateList);
                }
            }
            i1();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = ax.l0.c.o(coordinatorLayout, this.k0);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i2);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.V = height;
        int i3 = this.X;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            if (this.s) {
                int i6 = this.m;
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.V = i3;
            } else {
                int i7 = i3 - i5;
                int i8 = this.m;
                if (i8 != -1) {
                    i7 = Math.min(i7, i8);
                }
                this.V = i7;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        f0();
        d0();
        int i9 = this.O;
        if (i9 == 3) {
            C1760d0.W(v, s0());
        } else if (i9 == 6) {
            C1760d0.W(v, this.F);
        } else if (this.J && i9 == 5) {
            C1760d0.W(v, this.X);
        } else if (i9 == 4) {
            C1760d0.W(v, this.H);
        } else if (i9 == 1 || i9 == 2) {
            C1760d0.W(v, top - v.getTop());
        }
        k1(this.O, false);
        this.b0 = new WeakReference<>(p0(v));
        for (int i10 = 0; i10 < this.c0.size(); i10++) {
            this.c0.get(i10).a(v);
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
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View p0 = p0(viewGroup.getChildAt(i2));
                if (p0 != null) {
                    return p0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(r0(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.l, marginLayoutParams.width), r0(i4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference;
        return D0() && (weakReference = this.b0) != null && view == weakReference.get() && (!(this.O == 3 || this.N) || super.s(coordinatorLayout, v, view, f2, f3));
    }

    public int s0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    ax.O6.h t0() {
        return this.j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.b0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!D0() || view == view2) {
            int top = v.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (!this.T && !this.M && view == view2 && view.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i5 < s0()) {
                    int s0 = top - s0();
                    iArr[1] = s0;
                    C1760d0.W(v, -s0);
                    a1(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i3;
                    C1760d0.W(v, -i3);
                    a1(1);
                }
            } else if (i3 < 0) {
                boolean canScrollVertically = view.canScrollVertically(-1);
                if (!this.T && !this.M && view == view2 && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    if (i5 > this.H && !j0()) {
                        int i6 = top - this.H;
                        iArr[1] = i6;
                        C1760d0.W(v, -i6);
                        a1(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i3;
                        C1760d0.W(v, -i3);
                        a1(1);
                    }
                }
            }
            o0(v.getTop());
            this.S = i3;
            this.T = true;
            this.N = false;
        }
    }

    public int u0() {
        return this.O;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public boolean z0() {
        return this.o;
    }

    private class i {
        private int a;
        private boolean b;
        private final Runnable c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b = false;
                ax.l0.c cVar = BottomSheetBehavior.this.Q;
                if (cVar != null && cVar.m(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.O == 2) {
                    bottomSheetBehavior.a1(iVar2.a);
                }
            }
        }

        private i() {
            this.c = new a();
        }

        void c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            BottomSheetBehavior.this.Y.get().postOnAnimation(this.c);
            this.b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class h extends AbstractC2357a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        final int d0;
        int e0;
        boolean f0;
        boolean g0;
        boolean h0;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt() == 1;
            this.g0 = parcel.readInt() == 1;
            this.h0 = parcel.readInt() == 1;
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0 ? 1 : 0);
            parcel.writeInt(this.g0 ? 1 : 0);
            parcel.writeInt(this.h0 ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d0 = bottomSheetBehavior.O;
            this.e0 = ((BottomSheetBehavior) bottomSheetBehavior).f;
            this.f0 = ((BottomSheetBehavior) bottomSheetBehavior).b;
            this.g0 = bottomSheetBehavior.J;
            this.h0 = ((BottomSheetBehavior) bottomSheetBehavior).K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.c0 = new ArrayList<>();
        this.g0 = -1;
        this.j0 = new SparseIntArray();
        this.k0 = new e();
        this.i = context.getResources().getDimensionPixelSize(C2404e.o0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.b0);
        int i3 = m.f0;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.k = ax.K6.c.a(context, obtainStyledAttributes, i3);
        }
        if (obtainStyledAttributes.hasValue(m.y0)) {
            this.z = ax.O6.l.e(context, attributeSet, C2402c.c, l0).m();
        }
        m0(context);
        n0();
        this.I = obtainStyledAttributes.getDimension(m.e0, -1.0f);
        int i4 = m.c0;
        if (obtainStyledAttributes.hasValue(i4)) {
            T0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = m.d0;
        if (obtainStyledAttributes.hasValue(i5)) {
            S0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = m.m0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i6);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            U0(i2);
        } else {
            U0(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        R0(obtainStyledAttributes.getBoolean(m.l0, false));
        P0(obtainStyledAttributes.getBoolean(m.q0, false));
        O0(obtainStyledAttributes.getBoolean(m.j0, true));
        Y0(obtainStyledAttributes.getBoolean(m.p0, false));
        L0(obtainStyledAttributes.getBoolean(m.g0, true));
        M0(obtainStyledAttributes.getBoolean(m.h0, true));
        W0(obtainStyledAttributes.getInt(m.n0, 0));
        Q0(obtainStyledAttributes.getFloat(m.k0, 0.5f));
        int i7 = m.i0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i7);
        if (peekValue2 != null && peekValue2.type == 16) {
            N0(peekValue2.data);
        } else {
            N0(obtainStyledAttributes.getDimensionPixelOffset(i7, 0));
        }
        X0(obtainStyledAttributes.getInt(m.o0, 500));
        this.p = obtainStyledAttributes.getBoolean(m.u0, false);
        this.q = obtainStyledAttributes.getBoolean(m.v0, false);
        this.r = obtainStyledAttributes.getBoolean(m.w0, false);
        this.s = obtainStyledAttributes.getBoolean(m.x0, true);
        this.t = obtainStyledAttributes.getBoolean(m.r0, false);
        this.u = obtainStyledAttributes.getBoolean(m.s0, false);
        this.v = obtainStyledAttributes.getBoolean(m.t0, false);
        this.y = obtainStyledAttributes.getBoolean(m.z0, true);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
