package com.google.android.material.sidesheet;

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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.O6.h;
import ax.O6.l;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.d0.M;
import ax.i.C2186b;
import ax.k0.AbstractC2357a;
import ax.k6.C2410k;
import ax.k6.m;
import ax.l0.c;
import ax.l6.C2472a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements ax.H6.b {
    private com.google.android.material.sidesheet.d a;
    private float b;
    private h c;
    private ColorStateList d;
    private l e;
    private final SideSheetBehavior<V>.d f;
    private float g;
    private boolean h;
    private int i;
    private int j;
    private ax.l0.c k;
    private boolean l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private WeakReference<V> r;
    private WeakReference<View> s;
    private int t;
    private VelocityTracker u;
    private ax.H6.h v;
    private int w;
    private final Set<g> x;
    private final c.AbstractC0359c y;
    private static final int z = C2410k.S;
    private static final int A = ax.k6.l.p;

    class a extends c.AbstractC0359c {
        a() {
        }

        @Override // ax.l0.c.AbstractC0359c
        public int a(View view, int i, int i2) {
            return ax.W.a.b(i, SideSheetBehavior.this.a.g(), SideSheetBehavior.this.a.f());
        }

        @Override // ax.l0.c.AbstractC0359c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // ax.l0.c.AbstractC0359c
        public int d(View view) {
            return SideSheetBehavior.this.n + SideSheetBehavior.this.k0();
        }

        @Override // ax.l0.c.AbstractC0359c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public void k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View f0 = SideSheetBehavior.this.f0();
            if (f0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) f0.getLayoutParams()) != null) {
                SideSheetBehavior.this.a.p(marginLayoutParams, view.getLeft(), view.getRight());
                f0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i);
        }

        @Override // ax.l0.c.AbstractC0359c
        public void l(View view, float f, float f2) {
            int W = SideSheetBehavior.this.W(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, W, sideSheetBehavior.K0());
        }

        @Override // ax.l0.c.AbstractC0359c
        public boolean m(View view, int i) {
            return (SideSheetBehavior.this.i == 1 || SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.r.get()).requestLayout();
        }
    }

    class d {
        private int a;
        private boolean b;
        private final Runnable c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(SideSheetBehavior.d.this);
            }
        };

        d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.b = false;
            if (SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.m(true)) {
                dVar.b(dVar.a);
            } else if (SideSheetBehavior.this.i == 2) {
                SideSheetBehavior.this.G0(dVar.a);
            }
        }

        void b(int i) {
            if (SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            ((View) SideSheetBehavior.this.r.get()).postOnAnimation(this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f = new d();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
    }

    private void A0(V v, Runnable runnable) {
        if (v0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void D0(int i) {
        com.google.android.material.sidesheet.d dVar = this.a;
        if (dVar == null || dVar.j() != i) {
            if (i == 0) {
                this.a = new com.google.android.material.sidesheet.b(this);
                if (this.e == null || s0()) {
                    return;
                }
                l.b w = this.e.w();
                w.G(0.0f).y(0.0f);
                O0(w.m());
                return;
            }
            if (i == 1) {
                this.a = new com.google.android.material.sidesheet.a(this);
                if (this.e == null || r0()) {
                    return;
                }
                l.b w2 = this.e.w();
                w2.C(0.0f).u(0.0f);
                O0(w2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
        }
    }

    private void E0(V v, int i) {
        D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v.getLayoutParams()).c, i) == 3 ? 1 : 0);
    }

    private boolean H0() {
        if (this.k != null) {
            return this.h || this.i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i, View view, M.a aVar) {
        sideSheetBehavior.F0(i);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i) {
        V v = sideSheetBehavior.r.get();
        if (v != null) {
            sideSheetBehavior.L0(v, i, false);
        }
    }

    private boolean J0(V v) {
        return (v.isShown() || C1760d0.p(v) != null) && this.h;
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.a.o(marginLayoutParams, C2472a.c(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i, boolean z2) {
        if (!w0(view, i, z2)) {
            G0(i);
        } else {
            G0(2);
            this.f.b(i);
        }
    }

    private void M0() {
        V v;
        WeakReference<V> weakReference = this.r;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C1760d0.f0(v, 262144);
        C1760d0.f0(v, 1048576);
        if (this.i != 5) {
            y0(v, H.a.y, 5);
        }
        if (this.i != 3) {
            y0(v, H.a.w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.r.get();
        View f0 = f0();
        if (f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f0.getLayoutParams()) == null) {
            return;
        }
        this.a.o(marginLayoutParams, (int) ((this.n * v.getScaleX()) + this.q));
        f0.requestLayout();
    }

    private void O0(l lVar) {
        h hVar = this.c;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void P0(View view) {
        int i = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private int U(int i, V v) {
        int i2 = this.i;
        if (i2 == 1 || i2 == 2) {
            return i - this.a.h(v);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.i);
    }

    private float V(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view, float f, float f2) {
        if (u0(f)) {
            return 3;
        }
        if (I0(view, f)) {
            return (this.a.m(f, f2) || this.a.l(view)) ? 5 : 3;
        }
        if (f != 0.0f && e.a(f, f2)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.a.e()) ? 3 : 5;
    }

    private void X() {
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    private M Y(final int i) {
        return new M() { // from class: ax.P6.a
            @Override // ax.d0.M
            public final boolean a(View view, M.a aVar) {
                return SideSheetBehavior.I(SideSheetBehavior.this, i, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.e == null) {
            return;
        }
        h hVar = new h(this.e);
        this.c = hVar;
        hVar.U(context);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            this.c.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i) {
        if (this.x.isEmpty()) {
            return;
        }
        float b2 = this.a.b(i);
        Iterator<g> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(view, b2);
        }
    }

    private void b0(View view) {
        if (C1760d0.p(view) == null) {
            C1760d0.n0(view, view.getResources().getString(z));
        }
    }

    private int c0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View f0 = f0();
        if (f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f0.getLayoutParams()) == null) {
            return null;
        }
        final int c2 = this.a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ax.P6.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(SideSheetBehavior.this, marginLayoutParams, c2, f0, valueAnimator);
            }
        };
    }

    private int h0() {
        com.google.android.material.sidesheet.d dVar = this.a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        V v;
        WeakReference<V> weakReference = this.r;
        if (weakReference == null || (v = weakReference.get()) == null || !(v.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f q0 = q0();
        return q0 != null && ((ViewGroup.MarginLayoutParams) q0).leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f q0 = q0();
        return q0 != null && ((ViewGroup.MarginLayoutParams) q0).rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return H0() && V((float) this.w, motionEvent.getX()) > ((float) this.k.z());
    }

    private boolean u0(float f) {
        return this.a.k(f);
    }

    private boolean v0(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && v.isAttachedToWindow();
    }

    private boolean w0(View view, int i, boolean z2) {
        int l0 = l0(i);
        ax.l0.c p0 = p0();
        if (p0 != null) {
            return z2 ? p0.O(l0, view.getTop()) : p0.Q(view, l0, view.getTop());
        }
        return false;
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.s != null || (i = this.t) == -1 || (findViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.s = new WeakReference<>(findViewById);
    }

    private void y0(V v, H.a aVar, int i) {
        C1760d0.h0(v, aVar, null, Y(i));
    }

    private void z0() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v, cVar.a());
        }
        int i = cVar.d0;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
        this.j = i;
    }

    public void B0(int i) {
        this.t = i;
        X();
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i == -1 || !v.isLaidOut()) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v) {
        return new c(super.C(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z2) {
        this.h = z2;
    }

    public void F0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i);
        } else {
            A0(this.r.get(), new Runnable() { // from class: ax.P6.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(SideSheetBehavior.this, i);
                }
            });
        }
    }

    void G0(int i) {
        V v;
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (i == 3 || i == 5) {
            this.j = i;
        }
        WeakReference<V> weakReference = this.r;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        P0(v);
        Iterator<g> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(v, i);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.k.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.l && t0(motionEvent)) {
            this.k.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.l;
    }

    boolean I0(View view, float f) {
        return this.a.n(view, f);
    }

    public boolean K0() {
        return true;
    }

    @Override // ax.H6.b
    public void a(C2186b c2186b) {
        ax.H6.h hVar = this.v;
        if (hVar == null) {
            return;
        }
        hVar.j(c2186b);
    }

    @Override // ax.H6.b
    public void b(C2186b c2186b) {
        ax.H6.h hVar = this.v;
        if (hVar == null) {
            return;
        }
        hVar.l(c2186b, h0());
        N0();
    }

    @Override // ax.H6.b
    public void c() {
        ax.H6.h hVar = this.v;
        if (hVar == null) {
            return;
        }
        C2186b c2 = hVar.c();
        if (c2 == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.v.h(c2, h0(), new b(), e0());
        }
    }

    @Override // ax.H6.b
    public void d() {
        ax.H6.h hVar = this.v;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    int d0() {
        return this.n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.a.d();
    }

    public float i0() {
        return this.m;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.r = null;
        this.k = null;
        this.v = null;
    }

    int k0() {
        return this.q;
    }

    int l0(int i) {
        if (i == 3) {
            return g0();
        }
        if (i == 5) {
            return this.a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    int m0() {
        return this.p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.r = null;
        this.k = null;
        this.v = null;
    }

    int n0() {
        return this.o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ax.l0.c cVar;
        if (!J0(v)) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.l) {
            this.l = false;
            return false;
        }
        return (this.l || (cVar = this.k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.r == null) {
            this.r = new WeakReference<>(v);
            this.v = new ax.H6.h(v);
            h hVar = this.c;
            if (hVar != null) {
                v.setBackground(hVar);
                h hVar2 = this.c;
                float f = this.g;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                hVar2.f0(f);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    C1760d0.p0(v, colorStateList);
                }
            }
            P0(v);
            M0();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            b0(v);
        }
        E0(v, i);
        if (this.k == null) {
            this.k = ax.l0.c.o(coordinatorLayout, this.y);
        }
        int h = this.a.h(v);
        coordinatorLayout.I(v, i);
        this.o = coordinatorLayout.getWidth();
        this.p = this.a.i(coordinatorLayout);
        this.n = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.q = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        C1760d0.V(v, U(h, v));
        x0(coordinatorLayout);
        for (g gVar : this.x) {
            if (gVar instanceof g) {
                gVar.c(v);
            }
        }
        return true;
    }

    ax.l0.c p0() {
        return this.k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(c0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), c0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    protected static class c extends AbstractC2357a {
        public static final Parcelable.Creator<c> CREATOR = new a();
        final int d0;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d0);
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.d0 = ((SideSheetBehavior) sideSheetBehavior).i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new d();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.P4);
        int i = m.R4;
        if (obtainStyledAttributes.hasValue(i)) {
            this.d = ax.K6.c.a(context, obtainStyledAttributes, i);
        }
        if (obtainStyledAttributes.hasValue(m.U4)) {
            this.e = l.e(context, attributeSet, 0, A).m();
        }
        int i2 = m.T4;
        if (obtainStyledAttributes.hasValue(i2)) {
            B0(obtainStyledAttributes.getResourceId(i2, -1));
        }
        Z(context);
        this.g = obtainStyledAttributes.getDimension(m.Q4, -1.0f);
        C0(obtainStyledAttributes.getBoolean(m.S4, true));
        obtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
