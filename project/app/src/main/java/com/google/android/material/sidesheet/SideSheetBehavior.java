/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.sidesheet;

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
import ax.c0.d0;
import ax.d0.H;
import ax.d0.M;
import ax.k6.k;
import ax.k6.m;
import ax.l0.c;
import com.google.android.material.sidesheet.a;
import com.google.android.material.sidesheet.b;
import com.google.android.material.sidesheet.e;
import com.google.android.material.sidesheet.f;
import com.google.android.material.sidesheet.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SideSheetBehavior<V extends View>
extends CoordinatorLayout.c<V>
implements ax.H6.b {
    private static final int A;
    private static final int z;
    private com.google.android.material.sidesheet.d a;
    private float b;
    private h c;
    private ColorStateList d;
    private l e;
    private final d f = new d(this);
    private float g;
    private boolean h = true;
    private int i = 5;
    private int j = 5;
    private ax.l0.c k;
    private boolean l;
    private float m = 0.1f;
    private int n;
    private int o;
    private int p;
    private int q;
    private WeakReference<V> r;
    private WeakReference<View> s;
    private int t = -1;
    private VelocityTracker u;
    private ax.H6.h v;
    private int w;
    private final Set<g> x = new LinkedHashSet<g>();
    private final c.c y = new c.c(this){
        final SideSheetBehavior a;
        {
            this.a = sideSheetBehavior;
        }

        @Override
        public int a(View view, int n8, int n9) {
            return ax.W.a.b(n8, this.a.a.g(), this.a.a.f());
        }

        @Override
        public int b(View view, int n8, int n9) {
            return view.getTop();
        }

        @Override
        public int d(View view) {
            return this.a.n + this.a.k0();
        }

        @Override
        public void j(int n8) {
            if (n8 == 1 && this.a.h) {
                this.a.G0(1);
            }
        }

        @Override
        public void k(View view, int n8, int n9, int n10, int n11) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View view2 = this.a.f0();
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams)view2.getLayoutParams()) != null) {
                this.a.a.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
            }
            this.a.a0(view, n8);
        }

        @Override
        public void l(View view, float f8, float f9) {
            int n8 = this.a.W(view, f8, f9);
            SideSheetBehavior sideSheetBehavior = this.a;
            sideSheetBehavior.L0(view, n8, sideSheetBehavior.K0());
        }

        @Override
        public boolean m(View view, int n8) {
            if (this.a.i == 1) {
                return false;
            }
            return this.a.r != null && this.a.r.get() == view;
        }
    };

    static {
        z = ax.k6.k.S;
        A = ax.k6.l.p;
    }

    public SideSheetBehavior() {
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, ax.k6.m.P4);
        int n8 = ax.k6.m.R4;
        if (typedArray.hasValue(n8)) {
            this.d = ax.K6.c.a(context, typedArray, n8);
        }
        if (typedArray.hasValue(ax.k6.m.U4)) {
            this.e = ax.O6.l.e(context, attributeSet, 0, A).m();
        }
        if (typedArray.hasValue(n8 = ax.k6.m.T4)) {
            this.B0(typedArray.getResourceId(n8, -1));
        }
        this.Z(context);
        this.g = typedArray.getDimension(ax.k6.m.Q4, -1.0f);
        this.C0(typedArray.getBoolean(ax.k6.m.S4, true));
        typedArray.recycle();
        this.b = ViewConfiguration.get((Context)context).getScaledMaximumFlingVelocity();
    }

    private void A0(V v8, Runnable runnable2) {
        if (this.v0(v8)) {
            v8.post(runnable2);
            return;
        }
        runnable2.run();
    }

    private void D0(int n8) {
        Object object;
        block8: {
            block6: {
                block7: {
                    object = this.a;
                    if (object != null && ((com.google.android.material.sidesheet.d)object).j() == n8) break block6;
                    if (n8 != 0) break block7;
                    this.a = new b(this);
                    if (this.e != null && !this.s0()) {
                        object = this.e.w();
                        ((l.b)object).G(0.0f).y(0.0f);
                        this.O0(((l.b)object).m());
                        return;
                    }
                    break block6;
                }
                if (n8 != 1) break block8;
                this.a = new a(this);
                if (this.e != null && !this.r0()) {
                    object = this.e.w();
                    ((l.b)object).C(0.0f).u(0.0f);
                    this.O0(((l.b)object).m());
                }
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid sheet edge position value: ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(". Must be ");
        ((StringBuilder)object).append(0);
        ((StringBuilder)object).append(" or ");
        ((StringBuilder)object).append(1);
        ((StringBuilder)object).append(".");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private void E0(V v8, int n8) {
        n8 = Gravity.getAbsoluteGravity((int)((CoordinatorLayout.f)v8.getLayoutParams()).c, (int)n8) == 3 ? 1 : 0;
        this.D0(n8);
    }

    private boolean H0() {
        return this.k != null && (this.h || this.i == 1);
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int n8, View view, M.a a8) {
        sideSheetBehavior.F0(n8);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int n8) {
        View view = (View)sideSheetBehavior.r.get();
        if (view != null) {
            sideSheetBehavior.L0(view, n8, false);
        }
    }

    private boolean J0(V v8) {
        return (v8.isShown() || d0.p(v8) != null) && this.h;
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int n8, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.a.o(marginLayoutParams, ax.l6.a.c(n8, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void L0(View view, int n8, boolean bl) {
        if (this.w0(view, n8, bl)) {
            this.G0(2);
            this.f.b(n8);
            return;
        }
        this.G0(n8);
    }

    private void M0() {
        View view = this.r;
        if (view != null && (view = (View)view.get()) != null) {
            d0.f0(view, 262144);
            d0.f0(view, 0x100000);
            if (this.i != 5) {
                this.y0(view, H.a.y, 5);
            }
            if (this.i != 3) {
                this.y0(view, H.a.w, 3);
            }
        }
    }

    private void N0() {
        View view = this.r;
        if (view != null && view.get() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View view2 = (View)this.r.get();
            view = this.f0();
            if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams()) != null) {
                int n8 = (int)((float)this.n * view2.getScaleX() + (float)this.q);
                this.a.o(marginLayoutParams, n8);
                view.requestLayout();
            }
        }
    }

    private void O0(l l8) {
        h h8 = this.c;
        if (h8 != null) {
            h8.setShapeAppearanceModel(l8);
        }
    }

    private void P0(View view) {
        int n8 = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != n8) {
            view.setVisibility(n8);
        }
    }

    private int U(int n8, V object) {
        int n9 = this.i;
        if (n9 != 1 && n9 != 2) {
            if (n9 != 3) {
                if (n9 == 5) {
                    return this.a.e();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected value: ");
                ((StringBuilder)object).append(this.i);
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            return 0;
        }
        return n8 - this.a.h(object);
    }

    private float V(float f8, float f9) {
        return Math.abs(f8 - f9);
    }

    private int W(View view, float f8, float f9) {
        if (this.u0(f8)) {
            return 3;
        }
        if (this.I0(view, f8)) {
            if (!this.a.m(f8, f9) && !this.a.l(view)) {
                return 3;
            }
            return 5;
        }
        if (f8 != 0.0f && com.google.android.material.sidesheet.e.a(f8, f9)) {
            return 5;
        }
        int n8 = view.getLeft();
        if (Math.abs(n8 - this.g0()) < Math.abs(n8 - this.a.e())) {
            return 3;
        }
        return 5;
    }

    private void X() {
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    private M Y(int n8) {
        return new ax.P6.a(this, n8);
    }

    private void Z(Context context) {
        h h8;
        if (this.e == null) {
            return;
        }
        this.c = h8 = new h(this.e);
        h8.U(context);
        h8 = this.d;
        if (h8 != null) {
            this.c.g0((ColorStateList)h8);
            return;
        }
        h8 = new TypedValue();
        context.getTheme().resolveAttribute(0x1010031, (TypedValue)h8, true);
        this.c.setTint(((TypedValue)h8).data);
    }

    private void a0(View view, int n8) {
        if (!this.x.isEmpty()) {
            float f8 = this.a.b(n8);
            Iterator<g> iterator = this.x.iterator();
            while (iterator.hasNext()) {
                ((com.google.android.material.sidesheet.c)iterator.next()).b(view, f8);
            }
        }
    }

    private void b0(View view) {
        if (d0.p(view) == null) {
            d0.n0(view, view.getResources().getString(z));
        }
    }

    private int c0(int n8, int n9, int n10, int n11) {
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

    private ValueAnimator.AnimatorUpdateListener e0() {
        View view = this.f0();
        if (view == null) {
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        if (marginLayoutParams == null) {
            return null;
        }
        return new ax.P6.c(this, marginLayoutParams, this.a.c(marginLayoutParams), view);
    }

    private int h0() {
        com.google.android.material.sidesheet.d d8 = this.a;
        if (d8 != null) {
            if (d8.j() == 0) {
                return 5;
            }
            return 3;
        }
        return 5;
    }

    private CoordinatorLayout.f q0() {
        View view = this.r;
        if (view != null && (view = (View)view.get()) != null && view.getLayoutParams() instanceof CoordinatorLayout.f) {
            return (CoordinatorLayout.f)view.getLayoutParams();
        }
        return null;
    }

    private boolean r0() {
        CoordinatorLayout.f f8 = this.q0();
        return f8 != null && f8.leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f f8 = this.q0();
        return f8 != null && f8.rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        if (!this.H0()) {
            return false;
        }
        return this.V(this.w, motionEvent.getX()) > (float)this.k.z();
    }

    private boolean u0(float f8) {
        return this.a.k(f8);
    }

    private boolean v0(V v8) {
        ViewParent viewParent = v8.getParent();
        return viewParent != null && viewParent.isLayoutRequested() && v8.isAttachedToWindow();
    }

    private boolean w0(View view, int n8, boolean bl) {
        n8 = this.l0(n8);
        ax.l0.c c8 = this.p0();
        return c8 != null && (bl ? c8.O(n8, view.getTop()) : c8.Q(view, n8, view.getTop()));
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int n8;
        if (this.s == null && (n8 = this.t) != -1 && (coordinatorLayout = coordinatorLayout.findViewById(n8)) != null) {
            this.s = new WeakReference<CoordinatorLayout>(coordinatorLayout);
        }
    }

    private void y0(V v8, H.a a8, int n8) {
        d0.h0(v8, a8, null, this.Y(n8));
    }

    private void z0() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    @Override
    public void B(CoordinatorLayout coordinatorLayout, V v8, Parcelable parcelable) {
        int n8;
        block5: {
            block4: {
                int n9;
                if ((parcelable = (c)parcelable).a() != null) {
                    super.B(coordinatorLayout, v8, parcelable.a());
                }
                if ((n9 = parcelable.d0) == 1) break block4;
                n8 = n9;
                if (n9 != 2) break block5;
            }
            n8 = 5;
        }
        this.i = n8;
        this.j = n8;
    }

    public void B0(int n8) {
        this.t = n8;
        this.X();
        View view = this.r;
        if (view != null) {
            view = (View)view.get();
            if (n8 != -1 && view.isLaidOut()) {
                view.requestLayout();
            }
        }
    }

    @Override
    public Parcelable C(CoordinatorLayout coordinatorLayout, V v8) {
        return new c(super.C(coordinatorLayout, v8), this);
    }

    public void C0(boolean bl) {
        this.h = bl;
    }

    public void F0(int n8) {
        if (n8 != 1 && n8 != 2) {
            WeakReference<V> weakReference = this.r;
            if (weakReference != null && weakReference.get() != null) {
                this.A0((View)this.r.get(), new ax.P6.b(this, n8));
                return;
            }
            this.G0(n8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("STATE_");
        String string = n8 == 1 ? "DRAGGING" : "SETTLING";
        stringBuilder.append(string);
        stringBuilder.append(" should not be set externally.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    void G0(int n8) {
        View view;
        block6: {
            block5: {
                if (this.i == n8) break block5;
                this.i = n8;
                if (n8 == 3 || n8 == 5) {
                    this.j = n8;
                }
                if ((view = this.r) != null && (view = (View)view.get()) != null) break block6;
            }
            return;
        }
        this.P0(view);
        Iterator<g> iterator = this.x.iterator();
        while (iterator.hasNext()) {
            ((com.google.android.material.sidesheet.c)iterator.next()).a(view, n8);
        }
        this.M0();
    }

    @Override
    public boolean H(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int n8 = motionEvent.getActionMasked();
        if (this.i == 1 && n8 == 0) {
            return true;
        }
        if (this.H0()) {
            this.k.F(motionEvent);
        }
        if (n8 == 0) {
            this.z0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (this.H0() && n8 == 2 && !this.l && this.t0(motionEvent)) {
            this.k.b((View)v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.l ^ true;
    }

    boolean I0(View view, float f8) {
        return this.a.n(view, f8);
    }

    public boolean K0() {
        return true;
    }

    @Override
    public void a(ax.i.b b8) {
        ax.H6.h h8 = this.v;
        if (h8 == null) {
            return;
        }
        h8.j(b8);
    }

    @Override
    public void b(ax.i.b b8) {
        ax.H6.h h8 = this.v;
        if (h8 == null) {
            return;
        }
        h8.l(b8, this.h0());
        this.N0();
    }

    @Override
    public void c() {
        Object object = this.v;
        if (object == null) {
            return;
        }
        if ((object = ((ax.H6.a)object).c()) != null && Build.VERSION.SDK_INT >= 34) {
            this.v.h((ax.i.b)object, this.h0(), (Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final SideSheetBehavior a;
                {
                    this.a = sideSheetBehavior;
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.G0(5);
                    if (this.a.r != null && this.a.r.get() != null) {
                        ((View)this.a.r.get()).requestLayout();
                    }
                }
            }, this.e0());
            return;
        }
        this.F0(5);
    }

    @Override
    public void d() {
        ax.H6.h h8 = this.v;
        if (h8 == null) {
            return;
        }
        h8.f();
    }

    int d0() {
        return this.n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            return (View)weakReference.get();
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

    @Override
    public void k(CoordinatorLayout.f f8) {
        super.k(f8);
        this.r = null;
        this.k = null;
        this.v = null;
    }

    int k0() {
        return this.q;
    }

    int l0(int n8) {
        if (n8 != 3) {
            if (n8 == 5) {
                return this.a.e();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid state to get outer edge offset: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return this.g0();
    }

    int m0() {
        return this.p;
    }

    @Override
    public void n() {
        super.n();
        this.r = null;
        this.k = null;
        this.v = null;
    }

    int n0() {
        return this.o;
    }

    @Override
    public boolean o(CoordinatorLayout object, V v8, MotionEvent motionEvent) {
        if (!this.J0(v8)) {
            this.l = true;
            return false;
        }
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.z0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (n8 != 0) {
            if ((n8 == 1 || n8 == 3) && this.l) {
                this.l = false;
                return false;
            }
        } else {
            this.w = (int)motionEvent.getX();
        }
        return !this.l && (object = this.k) != null && ((ax.l0.c)object).P(motionEvent);
    }

    int o0() {
        return 500;
    }

    @Override
    public boolean p(CoordinatorLayout object, V v8, int n8) {
        if (object.getFitsSystemWindows() && !v8.getFitsSystemWindows()) {
            v8.setFitsSystemWindows(true);
        }
        if (this.r == null) {
            this.r = new WeakReference<V>(v8);
            this.v = new ax.H6.h((View)v8);
            h object22 = this.c;
            if (object22 != null) {
                float f8;
                v8.setBackground((Drawable)object22);
                h h8 = this.c;
                float f9 = f8 = this.g;
                if (f8 == -1.0f) {
                    f9 = v8.getElevation();
                }
                h8.f0(f9);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    d0.p0(v8, colorStateList);
                }
            }
            this.P0((View)v8);
            this.M0();
            if (v8.getImportantForAccessibility() == 0) {
                v8.setImportantForAccessibility(1);
            }
            this.b0((View)v8);
        }
        this.E0(v8, n8);
        if (this.k == null) {
            this.k = ax.l0.c.o((ViewGroup)object, this.y);
        }
        int n9 = this.a.h(v8);
        ((CoordinatorLayout)((Object)object)).I((View)v8, n8);
        this.o = object.getWidth();
        this.p = this.a.i((CoordinatorLayout)((Object)object));
        this.n = v8.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)v8.getLayoutParams();
        n8 = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        this.q = n8;
        d0.V(v8, this.U(n9, v8));
        this.x0((CoordinatorLayout)((Object)object));
        for (com.google.android.material.sidesheet.c c8 : this.x) {
            if (!(c8 instanceof g)) continue;
            ((g)c8).c((View)v8);
        }
        return true;
    }

    ax.l0.c p0() {
        return this.k;
    }

    @Override
    public boolean q(CoordinatorLayout coordinatorLayout, V v8, int n8, int n9, int n10, int n11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)v8.getLayoutParams();
        v8.measure(this.c0(n8, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9, -1, marginLayoutParams.width), this.c0(n10, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11, -1, marginLayoutParams.height));
        return true;
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
        final int d0;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
        }

        public c(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.d0 = ((SideSheetBehavior)sideSheetBehavior).i;
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
        }
    }

    class d {
        private int a;
        private boolean b;
        private final Runnable c;
        final SideSheetBehavior d;

        d(SideSheetBehavior sideSheetBehavior) {
            this.d = sideSheetBehavior;
            this.c = new f(this);
        }

        public static /* synthetic */ void a(d d8) {
            d8.b = false;
            if (d8.d.k != null && d8.d.k.m(true)) {
                d8.b(d8.a);
                return;
            }
            if (d8.d.i == 2) {
                d8.d.G0(d8.a);
            }
        }

        void b(int n8) {
            if (this.d.r != null && this.d.r.get() != null) {
                this.a = n8;
                if (!this.b) {
                    ((View)this.d.r.get()).postOnAnimation(this.c);
                    this.b = true;
                }
            }
        }
    }
}

