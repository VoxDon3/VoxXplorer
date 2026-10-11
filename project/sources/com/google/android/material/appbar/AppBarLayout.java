package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
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
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.c0.D;
import ax.c0.F0;
import ax.d0.H;
import ax.k0.AbstractC2357a;
import ax.k6.C2402c;
import ax.k6.l;
import ax.k6.m;
import ax.l6.C2472a;
import ax.o.C2653a;
import ax.z6.C3555a;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int B = l.g;
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

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {
        private int k;
        private int l;
        private ValueAnimator m;
        private c n;
        private WeakReference<View> o;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C1753a {
            final /* synthetic */ AppBarLayout d;
            final /* synthetic */ CoordinatorLayout e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.d = appBarLayout;
                this.e = coordinatorLayout;
            }

            @Override // ax.c0.C1753a
            public void g(View view, H h) {
                View j0;
                super.g(view, h);
                h.m0(ScrollView.class.getName());
                if (this.d.getTotalScrollRange() == 0 || (j0 = BaseBehavior.this.j0(this.e)) == null || !BaseBehavior.this.f0(this.d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.d.getTotalScrollRange())) {
                    h.b(H.a.q);
                    h.G0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!j0.canScrollVertically(-1)) {
                        h.b(H.a.r);
                        h.G0(true);
                    } else if ((-this.d.getDownNestedPreScrollRange()) != 0) {
                        h.b(H.a.r);
                        h.G0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ax.c0.C1753a
            public boolean j(View view, int i, Bundle bundle) {
                if (i == 4096) {
                    this.d.setExpanded(false);
                    return true;
                }
                if (i != 8192) {
                    return super.j(view, i, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View j0 = BaseBehavior.this.j0(this.e);
                    if (!j0.canScrollVertically(-1)) {
                        this.d.setExpanded(true);
                        return true;
                    }
                    int i2 = -this.d.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        BaseBehavior.this.u(this.e, this.d, j0, 0, i2, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int Q = Q() - topInset;
            int i0 = i0(t, Q);
            if (i0 >= 0) {
                View childAt = t.getChildAt(i0);
                d dVar = (d) childAt.getLayoutParams();
                int c2 = dVar.c();
                if ((c2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (i0 == 0 && t.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        i -= t.getTopInset();
                    }
                    if (e0(c2, 2)) {
                        i2 += childAt.getMinimumHeight();
                    } else if (e0(c2, 5)) {
                        int minimumHeight = childAt.getMinimumHeight() + i2;
                        if (Q < minimumHeight) {
                            i = minimumHeight;
                        } else {
                            i2 = minimumHeight;
                        }
                    }
                    if (e0(c2, 32)) {
                        i += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t, ax.W.a.b(b0(Q, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            Drawable foreground;
            Drawable foreground2;
            View h0 = h0(t, i);
            boolean z2 = false;
            if (h0 != null) {
                int c2 = ((d) h0.getLayoutParams()).c();
                if ((c2 & 1) != 0) {
                    int minimumHeight = h0.getMinimumHeight();
                    if (i2 <= 0 || (c2 & 12) == 0 ? !((c2 & 2) == 0 || (-i) < (h0.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (h0.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.p()) {
                z2 = t.D(g0(coordinatorLayout));
            }
            boolean A = t.A(z2);
            if (z || (A && z0(coordinatorLayout, t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    foreground = t.getForeground();
                    if (foreground != null) {
                        foreground2 = t.getForeground();
                        foreground2.jumpToCurrentState();
                    }
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t) {
            if (C1760d0.N(coordinatorLayout)) {
                return;
            }
            C1760d0.l0(coordinatorLayout, new b(t, coordinatorLayout));
        }

        private void Z(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(Q() - i);
            float abs2 = Math.abs(f);
            a0(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int Q = Q();
            if (Q == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(C2472a.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(Q, i);
            this.m.start();
        }

        private int b0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.l() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean e0(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((d) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof D) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (e0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator d = dVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c2 = dVar.c();
                    if ((c2 & 1) != 0) {
                        i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((c2 & 2) != 0) {
                            i2 -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.s(t);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f = ((CoordinatorLayout.f) s.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.a
        int Q() {
            return I() + this.k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t) {
            WeakReference<View> weakReference = this.o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(T t) {
            return (-t.getDownNestedScrollRange()) + t.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, T t) {
            A0(coordinatorLayout, t);
            if (t.p()) {
                t.A(t.D(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean p = super.p(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            c cVar = this.n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            Z(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            T(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            Z(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (cVar.d0) {
                T(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (cVar.e0) {
                T(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(cVar.f0);
                T(coordinatorLayout, t, (-childAt.getBottom()) + (this.n.h0 ? childAt.getMinimumHeight() + t.getTopInset() : Math.round(childAt.getHeight() * this.n.g0)));
            }
            t.w();
            this.n = null;
            K(ax.W.a.b(I(), -t.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t, I(), 0, true);
            t.u(I());
            Y(coordinatorLayout, t);
            return p;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L27
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
                r5 = r13
            Lf:
                r4 = r10
                goto L19
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                r5 = 0
                goto Lf
            L19:
                if (r4 == r5) goto L27
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.S(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L28
            L27:
                r2 = r8
            L28:
                boolean r7 = r2.p()
                if (r7 == 0) goto L35
                boolean r7 = r2.D(r9)
                r2.A(r7)
            L35:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            int i6;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
                iArr[1] = S(coordinatorLayout2, t2, i6, -t.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
            }
            if (i6 == 0) {
                Y(coordinatorLayout2, t2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, t, this.n.a());
            } else {
                super.B(coordinatorLayout, t, parcelable);
                this.n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable C = super.C(coordinatorLayout, t);
            c x0 = x0(C, t);
            return x0 == null ? C : x0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.p() || t.r() || d0(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                A0(coordinatorLayout, t);
                if (t.p()) {
                    t.A(t.D(view));
                }
            }
            this.o = new WeakReference<>(view);
        }

        void w0(c cVar, boolean z) {
            if (this.n == null || z) {
                this.n = cVar;
            }
        }

        c x0(Parcelable parcelable, T t) {
            int I = I();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2357a.c0;
                    }
                    c cVar = new c(parcelable);
                    boolean z = I == 0;
                    cVar.e0 = z;
                    cVar.d0 = !z && (-I) >= t.getTotalScrollRange();
                    cVar.f0 = i;
                    cVar.h0 = bottom == childAt.getMinimumHeight() + t.getTopInset();
                    cVar.g0 = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            int Q = Q();
            int i4 = 0;
            if (i2 == 0 || Q < i2 || Q > i3) {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                this.k = 0;
            } else {
                int b2 = ax.W.a.b(i, i2, i3);
                if (Q != b2) {
                    int m0 = t.j() ? m0(t, b2) : b2;
                    boolean K = K(m0);
                    int i5 = Q - b2;
                    this.k = b2 - m0;
                    if (K) {
                        while (i4 < t.getChildCount()) {
                            d dVar = (d) t.getChildAt(i4).getLayoutParams();
                            b b3 = dVar.b();
                            if (b3 != null && (dVar.c() & 1) != 0) {
                                b3.a(t, t.getChildAt(i4), I());
                            }
                            i4++;
                        }
                    }
                    if (!K && t.j()) {
                        coordinatorLayout.j(t);
                    }
                    t.u(I());
                    coordinatorLayout2 = coordinatorLayout;
                    t2 = t;
                    B0(coordinatorLayout2, t2, b2, b2 < Q ? -1 : 1, false);
                    i4 = i5;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t2 = t;
                }
            }
            Y(coordinatorLayout2, t2);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends AbstractC2357a {
            public static final Parcelable.Creator<c> CREATOR = new a();
            boolean d0;
            boolean e0;
            int f0;
            float g0;
            boolean h0;

            class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
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
                this.d0 = parcel.readByte() != 0;
                this.e0 = parcel.readByte() != 0;
                this.f0 = parcel.readInt();
                this.g0 = parcel.readFloat();
                this.h0 = parcel.readByte() != 0;
            }

            @Override // ax.k0.AbstractC2357a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.d0 ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f0);
                parcel.writeFloat(this.g0);
                parcel.writeByte(this.h0 ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean K(int i) {
            return super.K(i);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.p(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.q(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.u(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.G(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                C1760d0.W(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).k) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.A(appBarLayout.D(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout L = L(coordinatorLayout.r(view));
            if (L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    L.x(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.b
        float N(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int V = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + V > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (V / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1760d0.l0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.p(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.q(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.z4);
            S(obtainStyledAttributes.getDimensionPixelSize(m.A4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f);
    }

    public static class c extends b {
        private final Rect a = new Rect();
        private final Rect b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f) {
            b(this.a, appBarLayout, view);
            float abs = this.a.top - Math.abs(f);
            if (abs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float a = 1.0f - ax.W.a.a(Math.abs(abs / this.a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.a.height() * 0.3f) * (1.0f - (a * a)));
            view.setTranslationY(height);
            view.getDrawingRect(this.b);
            this.b.offset(0, (int) (-height));
            if (height >= this.b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.b);
        }
    }

    @Deprecated
    public interface e {
        void a(float f, int i);
    }

    public static abstract class f {
        public abstract void a(float f, int i, float f2);
    }

    private boolean C() {
        return this.x != null && getTopInset() > 0;
    }

    private boolean E() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void F(float f2, float f3) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.p = ofFloat;
        ofFloat.setDuration(this.t);
        this.p.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    private void G() {
        setWillNotDraw(!C());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h hVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.f0(floatValue);
        Drawable drawable = appBarLayout.x;
        if (drawable instanceof h) {
            ((h) drawable).f0(floatValue);
        }
        Iterator<e> it = appBarLayout.r.iterator();
        while (it.hasNext()) {
            it.next().a(floatValue, hVar.E());
        }
        Iterator<f> it2 = appBarLayout.s.iterator();
        while (it2.hasNext()) {
            it2.next().a(floatValue, hVar.E(), floatValue / appBarLayout.z);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, h hVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int k = C3555a.k(appBarLayout.w, colorStateList.getDefaultColor(), floatValue);
        hVar.g0(ColorStateList.valueOf(k));
        if (appBarLayout.x != null && (num2 = appBarLayout.y) != null && num2.equals(num)) {
            appBarLayout.x.setTint(k);
        }
        if (!appBarLayout.r.isEmpty()) {
            for (e eVar : appBarLayout.r) {
                if (hVar.B() != null) {
                    eVar.a(0.0f, k);
                }
            }
        }
        if (appBarLayout.s.isEmpty()) {
            return;
        }
        Iterator<f> it = appBarLayout.s.iterator();
        while (it.hasNext()) {
            it.next().a(0.0f, k, floatValue);
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
            return Integer.valueOf(((h) drawable).E());
        }
        ColorStateList f2 = ax.C6.f.f(drawable);
        if (f2 != null) {
            return Integer.valueOf(f2.getDefaultColor());
        }
        return null;
    }

    private View f(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void m(final h hVar, final ColorStateList colorStateList) {
        final Integer f2 = C3555a.f(getContext(), C2402c.i);
        this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: ax.m6.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(AppBarLayout.this, colorStateList, hVar, f2, valueAnimator);
            }
        };
    }

    private void n(Context context, final h hVar) {
        hVar.U(context);
        this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: ax.m6.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(AppBarLayout.this, hVar, valueAnimator);
            }
        };
    }

    private void o() {
        Behavior behavior = this.A;
        BaseBehavior.c x0 = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.x0(AbstractC2357a.c0, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (x0 != null) {
            this.A.w0(x0, false);
        }
    }

    private boolean q() {
        return getBackground() instanceof h;
    }

    private h s(Drawable drawable) {
        if (drawable instanceof h) {
            return (h) drawable;
        }
        ColorStateList f2 = ax.C6.f.f(drawable);
        if (f2 == null) {
            return null;
        }
        h hVar = new h();
        hVar.g0(f2);
        return hVar;
    }

    private Drawable t(Context context, Drawable drawable) {
        h s = s(drawable);
        if (s == null || s.B() == null) {
            return drawable;
        }
        this.w = s.B().getDefaultColor();
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            m(s, colorStateList);
            return s;
        }
        n(context, s);
        return s;
    }

    private void y(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    private boolean z(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    boolean A(boolean z) {
        return B(z, !this.i);
    }

    boolean B(boolean z, boolean z2) {
        if (!z2 || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!q()) {
            return true;
        }
        if (this.m != null) {
            F(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        F(z ? 0.0f : this.z, z ? this.z : 0.0f);
        return true;
    }

    boolean D(View view) {
        View f2 = f(view);
        if (f2 != null) {
            view = f2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public void c(f fVar) {
        this.s.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (C()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.x.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i4 = dVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
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
        F0 f0 = this.g;
        if (f0 != null) {
            return f0.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = dVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean j() {
        return this.e;
    }

    boolean l() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = C2402c.b0;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.k) ? C2402c.c0 : -C2402c.c0;
        int i3 = C2402c.X;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.k) ? C2402c.W : -C2402c.W;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && E()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1760d0.W(getChildAt(childCount), topInset);
            }
        }
        o();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i5).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l && !k()) {
            z2 = false;
        }
        z(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && E()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = ax.W.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.l;
    }

    public boolean r() {
        return this.k;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(t(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        i.d(this, f2);
    }

    public void setExpanded(boolean z) {
        x(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.n = -1;
        if (view == null) {
            d();
        } else {
            this.o = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        d();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    void setPendingAction(int i) {
        this.f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.x = drawable != null ? drawable.mutate() : null;
            this.y = e();
            Drawable drawable3 = this.x;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                ax.U.a.m(this.x, getLayoutDirection());
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
            }
            G();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C2653a.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        com.google.android.material.appbar.e.a(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    void u(int i) {
        this.a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<a> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.h.get(i2);
                if (aVar != null) {
                    aVar.a(this, i);
                }
            }
        }
    }

    public boolean v(f fVar) {
        return this.s.remove(fVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    void w() {
        this.f = 0;
    }

    public void x(boolean z, boolean z2) {
        y(z, z2, true);
    }

    public static class d extends LinearLayout.LayoutParams {
        int a;
        private b b;
        Interpolator c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.c);
            this.a = obtainStyledAttributes.getInt(m.e, 0);
            f(obtainStyledAttributes.getInt(m.d, 0));
            int i = m.f;
            if (obtainStyledAttributes.hasValue(i)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private b a(int i) {
            if (i != 1) {
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
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void f(int i) {
            this.b = a(i);
        }

        public void g(int i) {
            this.a = i;
        }

        public d(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
