package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import ax.b0.C1446g;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.c0.C1768h0;
import ax.d0.C1867b;
import ax.d0.H;
import ax.h2.C2143a;
import ax.h2.C2144b;
import ax.h2.C2146d;
import ax.j0.C2301a;
import ax.k0.AbstractC2357a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ax.c0.D {
    static boolean D0 = false;
    static boolean E0 = false;
    private static final int[] F0 = {R.attr.nestedScrollingEnabled};
    private static final float G0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean H0;
    static final boolean I0;
    static final boolean J0;
    static final boolean K0;
    private static final boolean L0;
    private static final boolean M0;
    private static final Class<?>[] N0;
    static final Interpolator O0;
    static final C P0;
    private boolean A;
    private int A0;
    private int B;
    private int B0;
    boolean C;
    private final w.b C0;
    private final AccessibilityManager D;
    private List<r> E;
    boolean F;
    boolean G;
    private int H;
    private int I;
    private l J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    m O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private final float a;
    private s a0;
    private final y b;
    private final int b0;
    final w c;
    private final int c0;
    z d;
    private float d0;
    a e;
    private float e0;
    b f;
    private boolean f0;
    final androidx.recyclerview.widget.w g;
    final E g0;
    boolean h;
    androidx.recyclerview.widget.h h0;
    final Runnable i;
    h.b i0;
    final Rect j;
    final B j0;
    private final Rect k;
    private u k0;
    final RectF l;
    private List<u> l0;
    h m;
    boolean m0;
    p n;
    boolean n0;
    x o;
    private m.b o0;
    final List<x> p;
    boolean p0;
    final ArrayList<o> q;
    androidx.recyclerview.widget.q q0;
    private final ArrayList<t> r;
    private k r0;
    private t s;
    private final int[] s0;
    boolean t;
    private ax.c0.E t0;
    boolean u;
    private final int[] u0;
    boolean v;
    private final int[] v0;
    boolean w;
    final int[] w0;
    private int x;
    final List<F> x0;
    boolean y;
    private Runnable y0;
    boolean z;
    private boolean z0;

    public static abstract class A {
        private RecyclerView b;
        private p c;
        private boolean d;
        private boolean e;
        private View f;
        private boolean h;
        private int a = -1;
        private final a g = new a(0, 0);

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.G0(i);
                    this.f = false;
                } else {
                    if (!this.f) {
                        this.g = 0;
                        return;
                    }
                    e();
                    recyclerView.g0.e(this.a, this.b, this.c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        public interface b {
            PointF c(int i);
        }

        public PointF a(int i) {
            Object e = e();
            if (e instanceof b) {
                return ((b) e).c(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.n.I(i);
        }

        public int c() {
            return this.b.n.P();
        }

        public int d(View view) {
            return this.b.l0(view);
        }

        public p e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        protected void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.v1((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.j0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.j0, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.g0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f = view;
                if (RecyclerView.E0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i, int i2, B b2, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, B b2, a aVar);

        public void p(int i) {
            this.a = i;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.g0.f();
            if (this.h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = pVar;
            int i = this.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.j0.a = i;
            this.e = true;
            this.d = true;
            this.f = b(f());
            m();
            this.b.g0.d();
            this.h = true;
        }

        protected final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.j0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.k1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class B {
        private SparseArray<Object> b;
        int m;
        long n;
        int o;
        int p;
        int q;
        int a = -1;
        int c = 0;
        int d = 0;
        int e = 1;
        int f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;

        void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        void f(h hVar) {
            this.e = 1;
            this.f = hVar.l();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static class C extends l {
        C() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    class E implements Runnable {
        private int c0;
        OverScroller d0;
        Interpolator e0;
        private boolean f0;
        private boolean g0;
        private int q;

        E() {
            Interpolator interpolator = RecyclerView.O0;
            this.e0 = interpolator;
            this.f0 = false;
            this.g0 = false;
            this.d0 = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            C1760d0.d0(RecyclerView.this, this);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.c0 = 0;
            this.q = 0;
            Interpolator interpolator = this.e0;
            Interpolator interpolator2 = RecyclerView.O0;
            if (interpolator != interpolator2) {
                this.e0 = interpolator2;
                this.d0 = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.d0.fling(0, 0, i, i2, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO);
            d();
        }

        void d() {
            if (this.f0) {
                this.g0 = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.O0;
            }
            if (this.e0 != interpolator) {
                this.e0 = interpolator;
                this.d0 = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.c0 = 0;
            this.q = 0;
            RecyclerView.this.setScrollState(2);
            this.d0.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.d0.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.d0.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.n == null) {
                f();
                return;
            }
            this.g0 = false;
            this.f0 = true;
            recyclerView.A();
            OverScroller overScroller = this.d0;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.q;
                int i4 = currY - this.c0;
                this.q = currX;
                this.c0 = currY;
                int x = RecyclerView.this.x(i3);
                int z = RecyclerView.this.z(i4);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.w0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x, z, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.w0;
                    x -= iArr2[0];
                    z -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x, z);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.m != null) {
                    int[] iArr3 = recyclerView3.w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.v1(x, z, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.w0;
                    int i5 = iArr4[0];
                    int i6 = iArr4[1];
                    x -= i5;
                    z -= i6;
                    A a = recyclerView4.n.g;
                    if (a != null && !a.g() && a.h()) {
                        int b = RecyclerView.this.j0.b();
                        if (b == 0) {
                            a.r();
                        } else if (a.f() >= b) {
                            a.p(b - 1);
                            a.j(i5, i6);
                        } else {
                            a.j(i5, i6);
                        }
                    }
                    i2 = i6;
                    i = i5;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i7 = x;
                int i8 = z;
                if (!RecyclerView.this.q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.w0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i, i2, i7, i8, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.w0;
                int i9 = i7 - iArr6[0];
                int i10 = i8 - iArr6[1];
                if (i != 0 || i2 != 0) {
                    recyclerView6.O(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
                A a2 = RecyclerView.this.n.g;
                if ((a2 == null || !a2.g()) && z2) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i11, currVelocity);
                    }
                    if (RecyclerView.K0) {
                        RecyclerView.this.i0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.h hVar = recyclerView7.h0;
                    if (hVar != null) {
                        hVar.f(recyclerView7, i, i2);
                    }
                }
            }
            A a3 = RecyclerView.this.n.g;
            if (a3 != null && a3.g()) {
                a3.j(0, 0);
            }
            this.f0 = false;
            if (this.g0) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.K1(1);
            }
        }
    }

    public static abstract class F {
        private static final List<Object> t = Collections.EMPTY_LIST;
        public final View a;
        WeakReference<RecyclerView> b;
        int j;
        RecyclerView r;
        h<? extends F> s;
        int c = -1;
        int d = -1;
        long e = -1;
        int f = -1;
        int g = -1;
        F h = null;
        F i = null;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        w n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;

        public F(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        private void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.j & 2) != 0;
        }

        void B(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((q) this.a.getLayoutParams()).c = true;
            }
        }

        void C(RecyclerView recyclerView) {
            int i = this.q;
            if (i != -1) {
                this.p = i;
            } else {
                this.p = C1760d0.z(this.a);
            }
            recyclerView.y1(this, 4);
        }

        void D(RecyclerView recyclerView) {
            recyclerView.y1(this, this.p);
            this.p = 0;
        }

        void E() {
            if (RecyclerView.D0 && y()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.u(this);
        }

        void F() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        void G(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void H(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                if (RecyclerView.D0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
            if (RecyclerView.E0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        void I(w wVar, boolean z) {
            this.n = wVar;
            this.o = z;
        }

        boolean J() {
            return (this.j & 16) != 0;
        }

        boolean K() {
            return (this.j & 128) != 0;
        }

        void L() {
            this.n.O(this);
        }

        boolean M() {
            return (this.j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        void b(int i) {
            this.j = i | this.j;
        }

        void c() {
            this.d = -1;
            this.g = -1;
        }

        void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        void e() {
            this.j &= -33;
        }

        void f() {
            this.j &= -257;
        }

        boolean h() {
            return (this.j & 16) == 0 && C1760d0.O(this.a);
        }

        void i(int i, int i2, boolean z) {
            b(8);
            B(i2, z);
            this.c = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.i0(this);
        }

        public final int k() {
            RecyclerView recyclerView;
            h adapter;
            int i0;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (i0 = this.r.i0(this)) == -1) {
                return -1;
            }
            return adapter.k(this.s, this, i0);
        }

        public final long l() {
            return this.e;
        }

        public final int m() {
            return this.f;
        }

        public final int n() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final int o() {
            return this.d;
        }

        List<Object> p() {
            if ((this.j & 1024) != 0) {
                return t;
            }
            List<Object> list = this.k;
            return (list == null || list.size() == 0) ? t : this.l;
        }

        boolean q(int i) {
            return (i & this.j) != 0;
        }

        boolean r() {
            return (this.j & 512) != 0 || u();
        }

        boolean s() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        boolean t() {
            return (this.j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (x()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb.append(" invalid");
            }
            if (!t()) {
                sb.append(" unbound");
            }
            if (A()) {
                sb.append(" update");
            }
            if (w()) {
                sb.append(" removed");
            }
            if (K()) {
                sb.append(" ignored");
            }
            if (y()) {
                sb.append(" tmpDetached");
            }
            if (!v()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (r()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.j & 4) != 0;
        }

        public final boolean v() {
            return (this.j & 16) == 0 && !C1760d0.O(this.a);
        }

        boolean w() {
            return (this.j & 8) != 0;
        }

        boolean x() {
            return this.n != null;
        }

        boolean y() {
            return (this.j & 256) != 0;
        }

        boolean z() {
            return (this.j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC0646a implements Runnable {
        RunnableC0646a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.z) {
                recyclerView2.y = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC0647b implements Runnable {
        RunnableC0647b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.O;
            if (mVar != null) {
                mVar.v();
            }
            RecyclerView.this.p0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC0648c implements Interpolator {
        InterpolatorC0648c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C0649d implements w.b {
        C0649d() {
        }

        @Override // androidx.recyclerview.widget.w.b
        public void a(F f) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.n.r1(f.a, recyclerView.c);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void b(F f, m.c cVar, m.c cVar2) {
            RecyclerView.this.o(f, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void c(F f, m.c cVar, m.c cVar2) {
            RecyclerView.this.c.O(f);
            RecyclerView.this.q(f, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void d(F f, m.c cVar, m.c cVar2) {
            f.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.F) {
                if (recyclerView.O.b(f, f, cVar, cVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.O.d(f, cVar, cVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C0650e implements b.InterfaceC0038b {
        C0650e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void b(View view) {
            F n0 = RecyclerView.n0(view);
            if (n0 != null) {
                n0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void d() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a = a(i);
                RecyclerView.this.F(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public F f(View view) {
            return RecyclerView.n0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void g(int i) {
            View a = a(i);
            if (a != null) {
                F n0 = RecyclerView.n0(a);
                if (n0 != null) {
                    if (n0.y() && !n0.K()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + n0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.E0) {
                        Log.d("RecyclerView", "tmpDetach " + n0);
                    }
                    n0.b(256);
                }
            } else if (RecyclerView.D0) {
                throw new IllegalArgumentException("No view at offset " + i + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void h(View view) {
            F n0 = RecyclerView.n0(view);
            if (n0 != null) {
                n0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            F n0 = RecyclerView.n0(view);
            if (n0 != null) {
                if (!n0.y() && !n0.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + n0 + RecyclerView.this.V());
                }
                if (RecyclerView.E0) {
                    Log.d("RecyclerView", "reAttach " + n0);
                }
                n0.f();
            } else if (RecyclerView.D0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    class C0651f implements a.InterfaceC0037a {
        C0651f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void a(int i, int i2) {
            RecyclerView.this.O0(i, i2);
            RecyclerView.this.m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.N1(i, i2, obj);
            RecyclerView.this.n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public F e(int i) {
            F g0 = RecyclerView.this.g0(i, true);
            if (g0 == null) {
                return null;
            }
            if (!RecyclerView.this.f.n(g0.a)) {
                return g0;
            }
            if (RecyclerView.E0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void f(int i, int i2) {
            RecyclerView.this.P0(i, i2, false);
            RecyclerView.this.m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void g(int i, int i2) {
            RecyclerView.this.N0(i, i2);
            RecyclerView.this.m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void h(int i, int i2) {
            RecyclerView.this.P0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m0 = true;
            recyclerView.j0.d += i2;
        }

        void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.n.W0(recyclerView, bVar.b, bVar.d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.n.Z0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.n.b1(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.n.Y0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    static /* synthetic */ class g {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends F> {
        private final i a = new i();
        private boolean b = false;
        private a c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(RecyclerView recyclerView) {
        }

        public abstract void B(VH vh, int i);

        public void C(VH vh, int i, List<Object> list) {
            B(vh, i);
        }

        public abstract VH D(ViewGroup viewGroup, int i);

        public void E(RecyclerView recyclerView) {
        }

        public boolean F(VH vh) {
            return false;
        }

        public void G(VH vh) {
        }

        public void H(VH vh) {
        }

        public void I(VH vh) {
        }

        public void J(j jVar) {
            this.a.registerObserver(jVar);
        }

        public void K(boolean z) {
            if (p()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void L(a aVar) {
            this.c = aVar;
            this.a.h();
        }

        public void M(j jVar) {
            this.a.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(VH vh, int i) {
            boolean z = vh.s == null;
            if (z) {
                vh.c = i;
                if (q()) {
                    vh.e = m(i);
                }
                vh.G(1, 519);
                ax.Y.u.a("RV OnBindView");
            }
            vh.s = this;
            if (RecyclerView.D0) {
                if (vh.a.getParent() == null && C1760d0.Q(vh.a) != vh.y()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.y() + ", attached to window: " + C1760d0.Q(vh.a) + ", holder: " + vh);
                }
                if (vh.a.getParent() == null && C1760d0.Q(vh.a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            C(vh, i, vh.p());
            if (z) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).c = true;
                }
                ax.Y.u.b();
            }
        }

        boolean i() {
            int i = g.a[this.c.ordinal()];
            return i != 1 && (i != 2 || l() > 0);
        }

        public final VH j(ViewGroup viewGroup, int i) {
            try {
                ax.Y.u.a("RV CreateView");
                VH D = D(viewGroup, i);
                if (D.a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                D.f = i;
                return D;
            } finally {
                ax.Y.u.b();
            }
        }

        public int k(h<? extends F> hVar, F f, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int l();

        public long m(int i) {
            return -1L;
        }

        public int n(int i) {
            return 0;
        }

        public final a o() {
            return this.c;
        }

        public final boolean p() {
            return this.a.a();
        }

        public final boolean q() {
            return this.b;
        }

        public final void r() {
            this.a.b();
        }

        public final void s(int i) {
            this.a.d(i, 1);
        }

        public final void t(int i, Object obj) {
            this.a.e(i, 1, obj);
        }

        public final void u(int i) {
            this.a.f(i, 1);
        }

        public final void v(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void w(int i, int i2, Object obj) {
            this.a.e(i, i2, obj);
        }

        public final void x(int i, int i2) {
            this.a.f(i, i2);
        }

        public final void y(int i, int i2) {
            this.a.g(i, i2);
        }

        public final void z(int i) {
            this.a.g(i, 1);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, null);
        }

        public void e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }

        public void g() {
        }
    }

    public interface k {
        int a(int i, int i2);
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i) {
            throw null;
        }
    }

    public static abstract class m {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(F f);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(F f) {
                return b(f, 0);
            }

            public c b(F f, int i) {
                View view = f.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        static int e(F f) {
            int i = f.j;
            int i2 = i & 14;
            if (f.u()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int o = f.o();
                int j = f.j();
                if (o != -1 && j != -1 && o != j) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public abstract boolean a(F f, c cVar, c cVar2);

        public abstract boolean b(F f, F f2, c cVar, c cVar2);

        public abstract boolean c(F f, c cVar, c cVar2);

        public abstract boolean d(F f, c cVar, c cVar2);

        public abstract boolean f(F f);

        public boolean g(F f, List<Object> list) {
            return f(f);
        }

        public final void h(F f) {
            s(f);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(f);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(F f);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p = p();
            if (aVar != null) {
                if (!p) {
                    aVar.a();
                    return p;
                }
                this.b.add(aVar);
            }
            return p;
        }

        public c r() {
            return new c();
        }

        public void s(F f) {
        }

        public c t(B b2, F f) {
            return r().a(f);
        }

        public c u(B b2, F f, int i, List<Object> list) {
            return r().a(f);
        }

        public abstract void v();

        void w(b bVar) {
            this.a = bVar;
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(F f) {
            f.H(true);
            if (f.h != null && f.i == null) {
                f.h = null;
            }
            f.i = null;
            if (f.J() || RecyclerView.this.j1(f.a) || !f.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f.a, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, B b) {
            f(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, B b) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, B b) {
            j(canvas, recyclerView);
        }
    }

    public interface r {
        void a(View view);

        void d(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i, int i2);
    }

    public interface t {
        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class v {
        SparseArray<a> a = new SparseArray<>();
        int b = 0;
        Set<h<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {
            final ArrayList<F> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        private a i(int i) {
            a aVar = this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        void a() {
            this.b++;
        }

        void b(h<?> hVar) {
            this.c.add(hVar);
        }

        public void c() {
            for (int i = 0; i < this.a.size(); i++) {
                a valueAt = this.a.valueAt(i);
                ArrayList<F> arrayList = valueAt.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    F f = arrayList.get(i2);
                    i2++;
                    C2301a.a(f.a);
                }
                valueAt.a.clear();
            }
        }

        void d() {
            this.b--;
        }

        void e(h<?> hVar, boolean z) {
            this.c.remove(hVar);
            if (this.c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.a.size(); i++) {
                SparseArray<a> sparseArray = this.a;
                ArrayList<F> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C2301a.a(arrayList.get(i2).a);
                }
            }
        }

        void f(int i, long j) {
            a i2 = i(i);
            i2.d = l(i2.d, j);
        }

        void g(int i, long j) {
            a i2 = i(i);
            i2.c = l(i2.c, j);
        }

        public F h(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<F> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).s()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z) {
            if (hVar != null) {
                d();
            }
            if (!z && this.b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(F f) {
            int m = f.m();
            ArrayList<F> arrayList = i(m).a;
            if (this.a.get(m).b <= arrayList.size()) {
                C2301a.a(f.a);
            } else {
                if (RecyclerView.D0 && arrayList.contains(f)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f.E();
                arrayList.add(f);
            }
        }

        long l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        boolean m(int i, long j, long j2) {
            long j3 = i(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        boolean n(int i, long j, long j2) {
            long j3 = i(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class w {
        final ArrayList<F> a;
        ArrayList<F> b;
        final ArrayList<F> c;
        private final List<F> d;
        private int e;
        int f;
        v g;

        public w() {
            ArrayList<F> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = DesugarCollections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z) {
            v vVar = this.g;
            if (vVar != null) {
                vVar.e(hVar, z);
            }
        }

        private boolean M(F f, int i, int i2, long j) {
            f.s = null;
            f.r = RecyclerView.this;
            int m = f.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.g.m(m, nanoTime, j)) {
                return false;
            }
            if (f.y()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f.a, recyclerView.getChildCount(), f.a.getLayoutParams());
                z = true;
            }
            RecyclerView.this.m.h(f, i);
            if (z) {
                RecyclerView.this.detachViewFromParent(f.a);
            }
            this.g.f(f.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f);
            if (RecyclerView.this.j0.e()) {
                f.g = i2;
            }
            return true;
        }

        private void b(F f) {
            if (RecyclerView.this.D0()) {
                View view = f.a;
                if (C1760d0.z(view) == 0) {
                    C1760d0.s0(view, 1);
                }
                androidx.recyclerview.widget.q qVar = RecyclerView.this.q0;
                if (qVar == null) {
                    return;
                }
                C1753a n = qVar.n();
                if (n instanceof q.a) {
                    ((q.a) n).o(view);
                }
                C1760d0.l0(view, n);
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(F f) {
            View view = f.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.g.b(RecyclerView.this.m);
            }
        }

        void A() {
            for (int i = 0; i < this.c.size(); i++) {
                C2301a.a(this.c.get(i).a);
            }
            B(RecyclerView.this.m);
        }

        void D(View view) {
            F n0 = RecyclerView.n0(view);
            n0.n = null;
            n0.o = false;
            n0.e();
            H(n0);
        }

        void E() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.c.clear();
            if (RecyclerView.K0) {
                RecyclerView.this.i0.b();
            }
        }

        void F(int i) {
            if (RecyclerView.E0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            F f = this.c.get(i);
            if (RecyclerView.E0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f);
            }
            a(f, true);
            this.c.remove(i);
        }

        public void G(View view) {
            F n0 = RecyclerView.n0(view);
            if (n0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (n0.x()) {
                n0.L();
            } else if (n0.M()) {
                n0.e();
            }
            H(n0);
            if (RecyclerView.this.O == null || n0.v()) {
                return;
            }
            RecyclerView.this.O.j(n0);
        }

        void H(F f) {
            boolean z;
            boolean z2 = true;
            if (f.x() || f.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f.x());
                sb.append(" isAttached:");
                sb.append(f.a.getParent() != null);
                sb.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb.toString());
            }
            if (f.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f + RecyclerView.this.V());
            }
            if (f.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean h = f.h();
            h hVar = RecyclerView.this.m;
            boolean z3 = hVar != null && h && hVar.F(f);
            if (RecyclerView.D0 && this.c.contains(f)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f + RecyclerView.this.V());
            }
            if (z3 || f.v()) {
                if (this.f <= 0 || f.q(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.K0 && size > 0 && !RecyclerView.this.i0.d(f.c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.i0.d(this.c.get(i).c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.c.add(size, f);
                    z = true;
                }
                if (!z) {
                    a(f, true);
                    r1 = z;
                    RecyclerView.this.g.q(f);
                    if (r1 && !z2 && h) {
                        C2301a.a(f.a);
                        f.s = null;
                        f.r = null;
                        return;
                    }
                    return;
                }
                r1 = z;
            } else if (RecyclerView.E0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
            }
            z2 = false;
            RecyclerView.this.g.q(f);
            if (r1) {
            }
        }

        void I(View view) {
            F n0 = RecyclerView.n0(view);
            if (!n0.q(12) && n0.z() && !RecyclerView.this.s(n0)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                n0.I(this, true);
                this.b.add(n0);
                return;
            }
            if (!n0.u() || n0.w() || RecyclerView.this.m.q()) {
                n0.I(this, false);
                this.a.add(n0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.m);
            v vVar2 = this.g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
            u();
        }

        void K(D d) {
        }

        public void L(int i) {
            this.e = i;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.F N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        void O(F f) {
            if (f.o) {
                this.b.remove(f);
            } else {
                this.a.remove(f);
            }
            f.n = null;
            f.o = false;
            f.e();
        }

        void P() {
            p pVar = RecyclerView.this.n;
            this.f = this.e + (pVar != null ? pVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                F(size);
            }
        }

        boolean Q(F f) {
            if (f.w()) {
                if (!RecyclerView.D0 || RecyclerView.this.j0.e()) {
                    return RecyclerView.this.j0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i = f.c;
            if (i >= 0 && i < RecyclerView.this.m.l()) {
                if (RecyclerView.this.j0.e() || RecyclerView.this.m.n(f.c) == f.m()) {
                    return !RecyclerView.this.m.q() || f.l() == RecyclerView.this.m.m(f.c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f + RecyclerView.this.V());
        }

        void R(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                F f = this.c.get(size);
                if (f != null && (i3 = f.c) >= i && i3 < i4) {
                    f.b(2);
                    F(size);
                }
            }
        }

        void a(F f, boolean z) {
            RecyclerView.u(f);
            View view = f.a;
            androidx.recyclerview.widget.q qVar = RecyclerView.this.q0;
            if (qVar != null) {
                C1753a n = qVar.n();
                C1760d0.l0(view, n instanceof q.a ? ((q.a) n).n(view) : null);
            }
            if (z) {
                g(f);
            }
            f.s = null;
            f.r = null;
            i().k(f);
        }

        public void c() {
            this.a.clear();
            E();
        }

        void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).c();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.a.get(i2).c();
            }
            ArrayList<F> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.b.get(i3).c();
                }
            }
        }

        void e() {
            this.a.clear();
            ArrayList<F> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.j0.b()) {
                return !RecyclerView.this.j0.e() ? i : RecyclerView.this.e.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.j0.b() + RecyclerView.this.V());
        }

        void g(F f) {
            x xVar = RecyclerView.this.o;
            if (xVar != null) {
                xVar.a(f);
            }
            int size = RecyclerView.this.p.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.p.get(i).a(f);
            }
            h hVar = RecyclerView.this.m;
            if (hVar != null) {
                hVar.I(f);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.j0 != null) {
                recyclerView.g.q(f);
            }
            if (RecyclerView.E0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f);
            }
        }

        F h(int i) {
            int size;
            int m;
            ArrayList<F> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    F f = this.b.get(i2);
                    if (!f.M() && f.n() == i) {
                        f.b(32);
                        return f;
                    }
                }
                if (RecyclerView.this.m.q() && (m = RecyclerView.this.e.m(i)) > 0 && m < RecyclerView.this.m.l()) {
                    long m2 = RecyclerView.this.m.m(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        F f2 = this.b.get(i3);
                        if (!f2.M() && f2.l() == m2) {
                            f2.b(32);
                            return f2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.g == null) {
                this.g = new v();
                u();
            }
            return this.g;
        }

        int j() {
            return this.a.size();
        }

        public List<F> k() {
            return this.d;
        }

        F l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                F f = this.a.get(size);
                if (f.l() == j && !f.M()) {
                    if (i == f.m()) {
                        f.b(32);
                        if (f.w() && !RecyclerView.this.j0.e()) {
                            f.G(2, 14);
                        }
                        return f;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(f.a, false);
                        D(f.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f2 = this.c.get(size2);
                if (f2.l() == j && !f2.s()) {
                    if (i == f2.m()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return f2;
                    }
                    if (!z) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        F m(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                F f = this.a.get(i2);
                if (!f.M() && f.n() == i && !f.u() && (RecyclerView.this.j0.h || !f.w())) {
                    f.b(32);
                    return f;
                }
            }
            if (!z && (e = RecyclerView.this.f.e(i)) != null) {
                F n0 = RecyclerView.n0(e);
                RecyclerView.this.f.s(e);
                int m = RecyclerView.this.f.m(e);
                if (m != -1) {
                    RecyclerView.this.f.d(m);
                    I(e);
                    n0.b(8224);
                    return n0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + n0 + RecyclerView.this.V());
            }
            int size2 = this.c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                F f2 = this.c.get(i3);
                if (!f2.u() && f2.n() == i && !f2.s()) {
                    if (!z) {
                        this.c.remove(i3);
                    }
                    if (RecyclerView.E0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + f2);
                    }
                    return f2;
                }
            }
            return null;
        }

        View n(int i) {
            return this.a.get(i).a;
        }

        public View o(int i) {
            return p(i, false);
        }

        View p(int i, boolean z) {
            return N(i, z, Long.MAX_VALUE).a;
        }

        void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) this.c.get(i).a.getLayoutParams();
                if (qVar != null) {
                    qVar.c = true;
                }
            }
        }

        void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                F f = this.c.get(i);
                if (f != null) {
                    f.b(6);
                    f.a(null);
                }
            }
            h hVar = RecyclerView.this.m;
            if (hVar == null || !hVar.q()) {
                E();
            }
        }

        void v(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                F f = this.c.get(i3);
                if (f != null && f.c >= i) {
                    if (RecyclerView.E0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i3 + " holder " + f + " now at position " + (f.c + i2));
                    }
                    f.B(i2, false);
                }
            }
        }

        void w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                F f = this.c.get(i7);
                if (f != null && (i6 = f.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        f.B(i2 - i, false);
                    } else {
                        f.B(i3, false);
                    }
                    if (RecyclerView.E0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i7 + " holder " + f);
                    }
                }
            }
        }

        void x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                F f = this.c.get(size);
                if (f != null) {
                    int i4 = f.c;
                    if (i4 >= i3) {
                        if (RecyclerView.E0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f + " now at position " + (f.c - i2));
                        }
                        f.B(-i2, z);
                    } else if (i4 >= i) {
                        f.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
        void a(F f);
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j0.g = true;
            recyclerView.b1(true);
            if (RecyclerView.this.e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.e.r(i, i2, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i, int i2) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.e.s(i, i2)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i, int i2, int i3) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.e.t(i, i2, i3)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i, int i2) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.e.u(i, i2)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.d == null || (hVar = recyclerView.m) == null || !hVar.i()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            if (RecyclerView.J0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.u && recyclerView.t) {
                    C1760d0.d0(recyclerView, recyclerView.i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.C = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        H0 = false;
        I0 = i2 >= 23;
        J0 = true;
        K0 = true;
        L0 = false;
        M0 = false;
        Class<?> cls = Integer.TYPE;
        N0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        O0 = new InterpolatorC0648c();
        P0 = new C();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2143a.a);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String r0 = r0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(r0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(N0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + r0, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + r0, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + r0, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + r0, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r0, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r0, e7);
            }
        }
    }

    private boolean D(int i2, int i3) {
        b0(this.s0);
        int[] iArr = this.s0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private boolean F0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.j.set(0, 0, view.getWidth(), view.getHeight());
        this.k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.j);
        offsetDescendantRectToMyCoords(view2, this.k);
        char c = 65535;
        int i4 = this.n.e0() == 1 ? -1 : 1;
        Rect rect = this.j;
        int i5 = rect.left;
        Rect rect2 = this.k;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c = 0;
            }
        }
        if (i2 == 1) {
            return c < 0 || (c == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return c > 0 || (c == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + V());
    }

    private void G() {
        int i2 = this.B;
        this.B = 0;
        if (i2 == 0 || !D0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C1867b.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void I() {
        this.j0.a(1);
        W(this.j0);
        this.j0.j = false;
        G1();
        this.g.f();
        S0();
        a1();
        s1();
        B b = this.j0;
        b.i = b.k && this.n0;
        this.n0 = false;
        this.m0 = false;
        b.h = b.l;
        b.f = this.m.l();
        b0(this.s0);
        if (this.j0.k) {
            int g2 = this.f.g();
            for (int i2 = 0; i2 < g2; i2++) {
                F n0 = n0(this.f.f(i2));
                if (!n0.K() && (!n0.u() || this.m.q())) {
                    this.g.e(n0, this.O.u(this.j0, n0, m.e(n0), n0.p()));
                    if (this.j0.i && n0.z() && !n0.w() && !n0.K() && !n0.u()) {
                        this.g.c(j0(n0), n0);
                    }
                }
            }
        }
        if (this.j0.l) {
            t1();
            B b2 = this.j0;
            boolean z2 = b2.g;
            b2.g = false;
            this.n.c1(this.c, b2);
            this.j0.g = z2;
            for (int i3 = 0; i3 < this.f.g(); i3++) {
                F n02 = n0(this.f.f(i3));
                if (!n02.K() && !this.g.i(n02)) {
                    int e = m.e(n02);
                    boolean q2 = n02.q(8192);
                    if (!q2) {
                        e |= 4096;
                    }
                    m.c u2 = this.O.u(this.j0, n02, e, n02.p());
                    if (q2) {
                        d1(n02, u2);
                    } else {
                        this.g.a(n02, u2);
                    }
                }
            }
            v();
        } else {
            v();
        }
        T0();
        J1(false);
        this.j0.e = 2;
    }

    private boolean I1(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || ax.h0.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z2 = false;
        } else {
            ax.h0.d.d(this.K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z2 = true;
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && ax.h0.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            ax.h0.d.d(this.M, 0.0f, motionEvent.getY() / getHeight());
            z2 = true;
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && ax.h0.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            ax.h0.d.d(this.L, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 == null || ax.h0.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z2;
        }
        ax.h0.d.d(this.N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void J() {
        G1();
        S0();
        this.j0.a(6);
        this.e.j();
        this.j0.f = this.m.l();
        this.j0.d = 0;
        if (this.d != null && this.m.i()) {
            Parcelable parcelable = this.d.d0;
            if (parcelable != null) {
                this.n.h1(parcelable);
            }
            this.d = null;
        }
        B b = this.j0;
        b.h = false;
        this.n.c1(this.c, b);
        B b2 = this.j0;
        b2.g = false;
        b2.k = b2.k && this.O != null;
        b2.e = 4;
        T0();
        J1(false);
    }

    private void K() {
        RecyclerView recyclerView;
        this.j0.a(4);
        G1();
        S0();
        B b = this.j0;
        b.e = 1;
        if (b.k) {
            for (int g2 = this.f.g() - 1; g2 >= 0; g2--) {
                F n0 = n0(this.f.f(g2));
                if (!n0.K()) {
                    long j0 = j0(n0);
                    m.c t2 = this.O.t(this.j0, n0);
                    F g3 = this.g.g(j0);
                    if (g3 == null || g3.K()) {
                        this.g.d(n0, t2);
                    } else {
                        boolean h2 = this.g.h(g3);
                        boolean h3 = this.g.h(n0);
                        if (h2 && g3 == n0) {
                            this.g.d(n0, t2);
                        } else {
                            m.c n2 = this.g.n(g3);
                            this.g.d(n0, t2);
                            m.c m2 = this.g.m(n0);
                            if (n2 == null) {
                                u0(j0, n0, g3);
                            } else {
                                p(g3, n0, n2, m2, h2, h3);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.g.o(recyclerView.C0);
        } else {
            recyclerView = this;
        }
        recyclerView.n.q1(recyclerView.c);
        B b2 = recyclerView.j0;
        b2.c = b2.f;
        recyclerView.F = false;
        recyclerView.G = false;
        b2.k = false;
        b2.l = false;
        recyclerView.n.h = false;
        ArrayList<F> arrayList = recyclerView.c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.n;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            recyclerView.c.P();
        }
        recyclerView.n.d1(recyclerView.j0);
        T0();
        J1(false);
        recyclerView.g.f();
        int[] iArr = recyclerView.s0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        e1();
        q1();
    }

    private void K0(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        int[] iArr = this.w0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean q2 = pVar.q();
        boolean r2 = this.n.r();
        int i5 = r2 ? (q2 ? 1 : 0) | 2 : q2 ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int g1 = i2 - g1(i2, height);
        int h1 = i3 - h1(i3, width);
        H1(i5, i4);
        if (L(q2 ? g1 : 0, r2 ? h1 : 0, this.w0, this.u0, i4)) {
            int[] iArr2 = this.w0;
            g1 -= iArr2[0];
            h1 -= iArr2[1];
        }
        u1(q2 ? g1 : 0, r2 ? h1 : 0, motionEvent, i4);
        androidx.recyclerview.widget.h hVar = this.h0;
        if (hVar != null && (g1 != 0 || h1 != 0)) {
            hVar.f(this, g1, h1);
        }
        K1(i4);
    }

    private void M1() {
        this.g0.f();
        p pVar = this.n;
        if (pVar != null) {
            pVar.P1();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.s;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        tVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.s = null;
        }
        return true;
    }

    private void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.V = y2;
            this.T = y2;
        }
    }

    private boolean Z0() {
        return this.O != null && this.n.Q1();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.r.get(i2);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.s = tVar;
                return true;
            }
        }
        return false;
    }

    private void a1() {
        boolean z2;
        if (this.F) {
            this.e.y();
            if (this.G) {
                this.n.X0(this);
            }
        }
        if (Z0()) {
            this.e.w();
        } else {
            this.e.j();
        }
        boolean z3 = this.m0 || this.n0;
        this.j0.k = this.w && this.O != null && ((z2 = this.F) || z3 || this.n.h) && (!z2 || this.m.q());
        B b = this.j0;
        b.l = b.k && z3 && !this.F && Z0();
    }

    private void b0(int[] iArr) {
        int g2 = this.f.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            F n0 = n0(this.f.f(i4));
            if (!n0.K()) {
                int n2 = n0.n();
                if (n2 < i2) {
                    i2 = n2;
                }
                if (n2 > i3) {
                    i3 = n2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView c0 = c0(viewGroup.getChildAt(i2));
            if (c0 != null) {
                return c0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.S()
            android.widget.EdgeEffect r3 = r6.K
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            ax.h0.d.d(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.T()
            android.widget.EdgeEffect r3 = r6.M
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            ax.h0.d.d(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.U()
            android.widget.EdgeEffect r9 = r6.L
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            ax.h0.d.d(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.R()
            android.widget.EdgeEffect r9 = r6.N
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            ax.h0.d.d(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7e
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            ax.c0.C1760d0.c0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c1(float, float, float, float):void");
    }

    private View d0() {
        F e0;
        B b = this.j0;
        int i2 = b.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = b.b();
        for (int i3 = i2; i3 < b2; i3++) {
            F e02 = e0(i3);
            if (e02 == null) {
                break;
            }
            if (e02.a.hasFocusable()) {
                return e02.a;
            }
        }
        int min = Math.min(b2, i2);
        do {
            min--;
            if (min < 0 || (e0 = e0(min)) == null) {
                return null;
            }
        } while (!e0.a.hasFocusable());
        return e0.a;
    }

    private void e1() {
        View findViewById;
        if (!this.f0 || this.m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!M0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f.n(focusedChild)) {
                    return;
                }
            } else if (this.f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        F f0 = (this.j0.n == -1 || !this.m.q()) ? null : f0(this.j0.n);
        if (f0 != null && !this.f.n(f0.a) && f0.a.hasFocusable()) {
            view = f0.a;
        } else if (this.f.g() > 0) {
            view = d0();
        }
        if (view != null) {
            int i2 = this.j0.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void f1() {
        boolean z2;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.K.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.N.isFinished();
        }
        if (z2) {
            C1760d0.c0(this);
        }
    }

    private int g1(int i2, float f) {
        float height = f / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.K;
        float f2 = 0.0f;
        if (edgeEffect == null || ax.h0.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && ax.h0.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.M.onRelease();
                } else {
                    float d = ax.h0.d.d(this.M, width, height);
                    if (ax.h0.d.b(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f2 = d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                float f3 = -ax.h0.d.d(this.K, -width, 1.0f - height);
                if (ax.h0.d.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private ax.c0.E getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new ax.c0.E(this);
        }
        return this.t0;
    }

    private int h1(int i2, float f) {
        float width = f / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.L;
        float f2 = 0.0f;
        if (edgeEffect == null || ax.h0.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.N;
            if (edgeEffect2 != null && ax.h0.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.N.onRelease();
                } else {
                    float d = ax.h0.d.d(this.N, height, 1.0f - width);
                    if (ax.h0.d.b(this.N) == 0.0f) {
                        this.N.onRelease();
                    }
                    f2 = d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                float f3 = -ax.h0.d.d(this.L, -height, width);
                if (ax.h0.d.b(this.L) == 0.0f) {
                    this.L.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private void i(F f) {
        View view = f.a;
        boolean z2 = view.getParent() == this;
        this.c.O(m0(view));
        if (f.y()) {
            this.f.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.f.k(view);
        } else {
            this.f.b(view, true);
        }
    }

    static F n0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).a;
    }

    private void p(F f, F f2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        f.H(false);
        if (z2) {
            i(f);
        }
        if (f != f2) {
            if (z3) {
                i(f2);
            }
            f.h = f2;
            i(f);
            this.c.O(f);
            f2.H(false);
            f2.i = f;
        }
        if (this.O.b(f, f2, cVar, cVar2)) {
            Y0();
        }
    }

    static void p0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void p1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.c) {
                Rect rect = qVar.b;
                Rect rect2 = this.j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        }
        this.n.x1(this, view, this.j, !this.w, view2 == null);
    }

    private int q0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private void q1() {
        B b = this.j0;
        b.n = -1L;
        b.m = -1;
        b.o = -1;
    }

    private String r0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void r1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        K1(0);
        f1();
    }

    private void s1() {
        View focusedChild = (this.f0 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        F Z = focusedChild != null ? Z(focusedChild) : null;
        if (Z == null) {
            q1();
            return;
        }
        this.j0.n = this.m.q() ? Z.l() : -1L;
        this.j0.m = this.F ? -1 : Z.w() ? Z.d : Z.j();
        this.j0.o = q0(Z.a);
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        D0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        E0 = z2;
    }

    private void t() {
        r1();
        setScrollState(0);
    }

    private float t0(int i2) {
        double log = Math.log((Math.abs(i2) * 0.35f) / (this.a * 0.015f));
        float f = G0;
        return (float) (this.a * 0.015f * Math.exp((f / (f - 1.0d)) * log));
    }

    static void u(F f) {
        WeakReference<RecyclerView> weakReference = f.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f.a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f.b = null;
        }
    }

    private void u0(long j2, F f, F f2) {
        int g2 = this.f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            F n0 = n0(this.f.f(i2));
            if (n0 != f && j0(n0) == j2) {
                h hVar = this.m;
                if (hVar == null || !hVar.q()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + n0 + " \n View Holder 2:" + f + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + n0 + " \n View Holder 2:" + f + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f2 + " cannot be found but it is necessary for " + f + V());
    }

    private boolean w0() {
        int g2 = this.f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            F n0 = n0(this.f.f(i2));
            if (n0 != null && !n0.K() && n0.z()) {
                return true;
            }
        }
        return false;
    }

    private void x1(h<?> hVar, boolean z2, boolean z3) {
        h hVar2 = this.m;
        if (hVar2 != null) {
            hVar2.M(this.b);
            this.m.E(this);
        }
        if (!z2 || z3) {
            i1();
        }
        this.e.y();
        h<?> hVar3 = this.m;
        this.m = hVar;
        if (hVar != null) {
            hVar.J(this.b);
            hVar.A(this);
        }
        p pVar = this.n;
        if (pVar != null) {
            pVar.J0(hVar3, this.m);
        }
        this.c.y(hVar3, this.m, z2);
        this.j0.g = true;
    }

    private int y(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && ax.h0.d.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i3) / 4.0f) * ax.h0.d.d(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        }
        if (i2 >= 0 || edgeEffect2 == null || ax.h0.d.b(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f = i3;
        int round2 = Math.round((f / 4.0f) * ax.h0.d.d(edgeEffect2, (i2 * 4.0f) / f, 0.5f));
        if (round2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - round2;
    }

    @SuppressLint({"InlinedApi"})
    private void y0() {
        if (C1760d0.A(this) == 0) {
            C1760d0.u0(this, 8);
        }
    }

    private void z0() {
        this.f = new b(new C0650e());
    }

    private boolean z1(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        return t0(-i2) < ax.h0.d.b(edgeEffect) * ((float) i3);
    }

    void A() {
        if (!this.w || this.F) {
            ax.Y.u.a("RV FullInvalidate");
            H();
            ax.Y.u.b();
            return;
        }
        if (this.e.p()) {
            if (!this.e.o(4) || this.e.o(11)) {
                if (this.e.p()) {
                    ax.Y.u.a("RV FullInvalidate");
                    H();
                    ax.Y.u.b();
                    return;
                }
                return;
            }
            ax.Y.u.a("RV PartialInvalidate");
            G1();
            S0();
            this.e.w();
            if (!this.y) {
                if (w0()) {
                    H();
                } else {
                    this.e.i();
                }
            }
            J1(true);
            T0();
            ax.Y.u.b();
        }
    }

    void A0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2144b.a), resources.getDimensionPixelSize(C2144b.c), resources.getDimensionPixelOffset(C2144b.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    boolean A1(AccessibilityEvent accessibilityEvent) {
        if (!E0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C1867b.a(accessibilityEvent) : 0;
        this.B |= a != 0 ? a : 0;
        return true;
    }

    void B0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void B1(int i2, int i3) {
        C1(i2, i3, null);
    }

    void C(int i2, int i3) {
        setMeasuredDimension(p.t(i2, getPaddingLeft() + getPaddingRight(), C1760d0.D(this)), p.t(i3, getPaddingTop() + getPaddingBottom(), C1760d0.C(this)));
    }

    public void C0() {
        if (this.q.size() == 0) {
            return;
        }
        p pVar = this.n;
        if (pVar != null) {
            pVar.m("Cannot invalidate item decorations during a scroll or layout");
        }
        H0();
        requestLayout();
    }

    public void C1(int i2, int i3, Interpolator interpolator) {
        D1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    boolean D0() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void D1(int i2, int i3, Interpolator interpolator, int i4) {
        E1(i2, i3, interpolator, i4, false);
    }

    void E(View view) {
        F n0 = n0(view);
        Q0(view);
        h hVar = this.m;
        if (hVar != null && n0 != null) {
            hVar.G(n0);
        }
        List<r> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).d(view);
            }
        }
    }

    public boolean E0() {
        return this.H > 0;
    }

    void E1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        if (!pVar.q()) {
            i2 = 0;
        }
        if (!this.n.r()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            H1(i5, 1);
        }
        this.g0.e(i2, i3, i4, interpolator);
    }

    void F(View view) {
        F n0 = n0(view);
        R0(view);
        h hVar = this.m;
        if (hVar != null && n0 != null) {
            hVar.H(n0);
        }
        List<r> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).a(view);
            }
        }
    }

    public void F1(int i2) {
        if (this.z) {
            return;
        }
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.N1(this, this.j0, i2);
        }
    }

    void G0(int i2) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.C1(i2);
        awakenScrollBars();
    }

    void G1() {
        int i2 = this.x + 1;
        this.x = i2;
        if (i2 != 1 || this.z) {
            return;
        }
        this.y = false;
    }

    void H() {
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.j0.j = false;
        boolean z2 = this.z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = false;
        if (this.j0.e == 1) {
            I();
            this.n.E1(this);
            J();
        } else if (this.e.q() || z2 || this.n.t0() != getWidth() || this.n.c0() != getHeight()) {
            this.n.E1(this);
            J();
        } else {
            this.n.E1(this);
        }
        K();
    }

    void H0() {
        int j2 = this.f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((q) this.f.i(i2).getLayoutParams()).c = true;
        }
        this.c.s();
    }

    public boolean H1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    void I0() {
        int j2 = this.f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            F n0 = n0(this.f.i(i2));
            if (n0 != null && !n0.K()) {
                n0.b(6);
            }
        }
        H0();
        this.c.t();
    }

    public void J0(int i2, int i3) {
        K0(i2, i3, null, 1);
    }

    void J1(boolean z2) {
        if (this.x < 1) {
            if (D0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.x = 1;
        }
        if (!z2 && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (z2 && this.y && !this.z && this.n != null && this.m != null) {
                H();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        this.x--;
    }

    public void K1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public boolean L(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void L0(int i2) {
        int g2 = this.f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void L1() {
        setScrollState(0);
        M1();
    }

    public final void M(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void M0(int i2) {
        int g2 = this.f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f.f(i3).offsetTopAndBottom(i2);
        }
    }

    void N(int i2) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.j1(i2);
        }
        W0(i2);
        u uVar = this.k0;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l0.get(size).a(this, i2);
            }
        }
    }

    void N0(int i2, int i3) {
        int j2 = this.f.j();
        for (int i4 = 0; i4 < j2; i4++) {
            F n0 = n0(this.f.i(i4));
            if (n0 != null && !n0.K() && n0.c >= i2) {
                if (E0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i4 + " holder " + n0 + " now at position " + (n0.c + i3));
                }
                n0.B(i3, false);
                this.j0.g = true;
            }
        }
        this.c.v(i2, i3);
        requestLayout();
    }

    void N1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.f.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.f.i(i6);
            F n0 = n0(i7);
            if (n0 != null && !n0.K() && (i4 = n0.c) >= i2 && i4 < i5) {
                n0.b(2);
                n0.a(obj);
                ((q) i7.getLayoutParams()).c = true;
            }
        }
        this.c.R(i2, i3);
    }

    void O(int i2, int i3) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        X0(i2, i3);
        u uVar = this.k0;
        if (uVar != null) {
            uVar.b(this, i2, i3);
        }
        List<u> list = this.l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l0.get(size).b(this, i2, i3);
            }
        }
        this.I--;
    }

    void O0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.f.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            F n0 = n0(this.f.i(i8));
            if (n0 != null && (i7 = n0.c) >= i5 && i7 <= i4) {
                if (E0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i8 + " holder " + n0);
                }
                if (n0.c == i2) {
                    n0.B(i3 - i2, false);
                } else {
                    n0.B(i6, false);
                }
                this.j0.g = true;
            }
        }
        this.c.w(i2, i3);
        requestLayout();
    }

    void P() {
        int i2;
        for (int size = this.x0.size() - 1; size >= 0; size--) {
            F f = this.x0.get(size);
            if (f.a.getParent() == this && !f.K() && (i2 = f.q) != -1) {
                C1760d0.s0(f.a, i2);
                f.q = -1;
            }
        }
        this.x0.clear();
    }

    void P0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.f.j();
        for (int i5 = 0; i5 < j2; i5++) {
            F n0 = n0(this.f.i(i5));
            if (n0 != null && !n0.K()) {
                int i6 = n0.c;
                if (i6 >= i4) {
                    if (E0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + n0 + " now at position " + (n0.c - i3));
                    }
                    n0.B(-i3, z2);
                    this.j0.g = true;
                } else if (i6 >= i2) {
                    if (E0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + n0 + " now REMOVED");
                    }
                    n0.i(i2 - 1, -i3, z2);
                    this.j0.g = true;
                }
            }
        }
        this.c.x(i2, i3, z2);
        requestLayout();
    }

    public void Q0(View view) {
    }

    void R() {
        if (this.N != null) {
            return;
        }
        EdgeEffect a = this.J.a(this, 3);
        this.N = a;
        if (this.h) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void R0(View view) {
    }

    void S() {
        if (this.K != null) {
            return;
        }
        EdgeEffect a = this.J.a(this, 0);
        this.K = a;
        if (this.h) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void S0() {
        this.H++;
    }

    void T() {
        if (this.M != null) {
            return;
        }
        EdgeEffect a = this.J.a(this, 2);
        this.M = a;
        if (this.h) {
            a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0() {
        U0(true);
    }

    void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect a = this.J.a(this, 1);
        this.L = a;
        if (this.h) {
            a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void U0(boolean z2) {
        int i2 = this.H - 1;
        this.H = i2;
        if (i2 < 1) {
            if (D0 && i2 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.H = 0;
            if (z2) {
                G();
                P();
            }
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    final void W(B b) {
        if (getScrollState() != 2) {
            b.p = 0;
            b.q = 0;
        } else {
            OverScroller overScroller = this.g0.d0;
            b.p = overScroller.getFinalX() - overScroller.getCurrX();
            b.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0(int i2) {
    }

    public View X(float f, float f2) {
        for (int g2 = this.f.g() - 1; g2 >= 0; g2--) {
            View f3 = this.f.f(g2);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= f3.getLeft() + translationX && f <= f3.getRight() + translationX && f2 >= f3.getTop() + translationY && f2 <= f3.getBottom() + translationY) {
                return f3;
            }
        }
        return null;
    }

    public void X0(int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View Y(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(android.view.View):android.view.View");
    }

    void Y0() {
        if (this.p0 || !this.t) {
            return;
        }
        C1760d0.d0(this, this.y0);
        this.p0 = true;
    }

    public F Z(View view) {
        View Y = Y(view);
        if (Y == null) {
            return null;
        }
        return m0(Y);
    }

    void a(int i2, int i3) {
        if (i2 < 0) {
            S();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            T();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            R();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        C1760d0.c0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.n;
        if (pVar == null || !pVar.K0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    void b1(boolean z2) {
        this.G = z2 | this.G;
        this.F = true;
        I0();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.n.s((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.n;
        if (pVar != null && pVar.q()) {
            return this.n.w(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.n;
        if (pVar != null && pVar.q()) {
            return this.n.x(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.n;
        if (pVar != null && pVar.q()) {
            return this.n.y(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.n;
        if (pVar != null && pVar.r()) {
            return this.n.z(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.n;
        if (pVar != null && pVar.r()) {
            return this.n.A(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.n;
        if (pVar != null && pVar.r()) {
            return this.n.B(this.j0);
        }
        return 0;
    }

    void d1(F f, m.c cVar) {
        f.G(0, 8192);
        if (this.j0.i && f.z() && !f.w() && !f.K()) {
            this.g.c(j0(f), f);
        }
        this.g.e(f, cVar);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().a(f, f2, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.q.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).k(canvas, this, this.j0);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.O == null || this.q.size() <= 0 || !this.O.p()) ? z2 : true) {
            C1760d0.c0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public F e0(int i2) {
        F f = null;
        if (this.F) {
            return null;
        }
        int j2 = this.f.j();
        for (int i3 = 0; i3 < j2; i3++) {
            F n0 = n0(this.f.i(i3));
            if (n0 != null && !n0.w() && i0(n0) == i2) {
                if (!this.f.n(n0.a)) {
                    return n0;
                }
                f = n0;
            }
        }
        return f;
    }

    public F f0(long j2) {
        h hVar = this.m;
        F f = null;
        if (hVar != null && hVar.q()) {
            int j3 = this.f.j();
            for (int i2 = 0; i2 < j3; i2++) {
                F n0 = n0(this.f.i(i2));
                if (n0 != null && !n0.w() && n0.l() == j2) {
                    if (!this.f.n(n0.a)) {
                        return n0;
                    }
                    f = n0;
                }
            }
        }
        return f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View V0 = this.n.V0(view, i2);
        if (V0 != null) {
            return V0;
        }
        boolean z3 = (this.m == null || this.n == null || E0() || this.z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.n.r()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (L0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.n.q()) {
                int i4 = (this.n.e0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (L0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                G1();
                this.n.O0(view, i2, this.c, this.j0);
                J1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                G1();
                view2 = this.n.O0(view, i2, this.c, this.j0);
                J1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return F0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        p1(view2, null);
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.F g0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$F r3 = n0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.w()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.n()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f
            android.view.View r4 = r3.a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, boolean):androidx.recyclerview.widget.RecyclerView$F");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.J();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.K(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.n;
        return pVar != null ? pVar.M() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        k kVar = this.r0;
        return kVar == null ? super.getChildDrawingOrder(i2, i3) : kVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public androidx.recyclerview.widget.q getCompatAccessibilityDelegate() {
        return this.q0;
    }

    public l getEdgeEffectFactory() {
        return this.J;
    }

    public m getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public p getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.c0;
    }

    public int getMinFlingVelocity() {
        return this.b0;
    }

    long getNanoTime() {
        if (K0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f0;
    }

    public v getRecycledViewPool() {
        return this.c.i();
    }

    public int getScrollState() {
        return this.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h0(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int):boolean");
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    int i0(F f) {
        if (f.q(524) || !f.t()) {
            return -1;
        }
        return this.e.e(f.c);
    }

    void i1() {
        m mVar = this.O;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.n;
        if (pVar != null) {
            pVar.p1(this.c);
            this.n.q1(this.c);
        }
        this.c.c();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    long j0(F f) {
        return this.m.q() ? f.l() : f.c;
    }

    boolean j1(View view) {
        G1();
        boolean r2 = this.f.r(view);
        if (r2) {
            F n0 = n0(view);
            this.c.O(n0);
            this.c.H(n0);
            if (E0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        J1(!r2);
        return r2;
    }

    public void k(o oVar, int i2) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.q.add(oVar);
        } else {
            this.q.add(i2, oVar);
        }
        H0();
        requestLayout();
    }

    public int k0(View view) {
        F n0 = n0(view);
        if (n0 != null) {
            return n0.j();
        }
        return -1;
    }

    public void k1(o oVar) {
        p pVar = this.n;
        if (pVar != null) {
            pVar.m("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(oVar);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H0();
        requestLayout();
    }

    public void l(r rVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(rVar);
    }

    public int l0(View view) {
        F n0 = n0(view);
        if (n0 != null) {
            return n0.n();
        }
        return -1;
    }

    public void l1(r rVar) {
        List<r> list = this.E;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void m(t tVar) {
        this.r.add(tVar);
    }

    public F m0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return n0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void m1(t tVar) {
        this.r.remove(tVar);
        if (this.s == tVar) {
            this.s = null;
        }
    }

    public void n(u uVar) {
        if (this.l0 == null) {
            this.l0 = new ArrayList();
        }
        this.l0.add(uVar);
    }

    public void n1(u uVar) {
        List<u> list = this.l0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    void o(F f, m.c cVar, m.c cVar2) {
        f.H(false);
        if (this.O.a(f, cVar, cVar2)) {
            Y0();
        }
    }

    public void o0(View view, Rect rect) {
        p0(view, rect);
    }

    void o1() {
        F f;
        int g2 = this.f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.f.f(i2);
            F m0 = m0(f2);
            if (m0 != null && (f = m0.i) != null) {
                View view = f.a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.H = r0
            r1 = 1
            r5.t = r1
            boolean r2 = r5.w
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.w = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.n
            if (r1 == 0) goto L23
            r1.F(r5)
        L23:
            r5.p0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.K0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.h> r0 = androidx.recyclerview.widget.h.f0
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.h r1 = (androidx.recyclerview.widget.h) r1
            r5.h0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.h r1 = new androidx.recyclerview.widget.h
            r1.<init>()
            r5.h0 = r1
            android.view.Display r1 = ax.c0.C1760d0.u(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.h r2 = r5.h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.d0 = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.h r0 = r5.h0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.h hVar;
        super.onDetachedFromWindow();
        m mVar = this.O;
        if (mVar != null) {
            mVar.k();
        }
        L1();
        this.t = false;
        p pVar = this.n;
        if (pVar != null) {
            pVar.G(this, this.c);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.g.j();
        this.c.A();
        C2301a.b(this);
        if (!K0 || (hVar = this.h0) == null) {
            return;
        }
        hVar.j(this);
        this.h0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).i(canvas, this, this.j0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.z
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L7a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.n
            boolean r0 = r0.r()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.n
            boolean r3 = r3.q()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.n
            boolean r3 = r3.r()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.n
            boolean r3 = r3.q()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L7a
        L6c:
            float r2 = r5.d0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.e0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.K0(r2, r0, r6, r3)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.z) {
            return false;
        }
        this.s = null;
        if (a0(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.n;
        if (pVar == null) {
            return false;
        }
        boolean q2 = pVar.q();
        boolean r2 = this.n.r();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.U = x2;
            this.S = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.V = y2;
            this.T = y2;
            if (I1(motionEvent) || this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                K1(1);
            }
            int[] iArr = this.v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = q2;
            if (r2) {
                i2 = (q2 ? 1 : 0) | 2;
            }
            H1(i2, 0);
        } else if (actionMasked == 1) {
            this.R.clear();
            K1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i3 = x3 - this.S;
                int i4 = y3 - this.T;
                if (q2 == 0 || Math.abs(i3) <= this.W) {
                    z2 = false;
                } else {
                    this.U = x3;
                    z2 = true;
                }
                if (r2 && Math.abs(i4) > this.W) {
                    this.V = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x4;
            this.S = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y4;
            this.T = y4;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ax.Y.u.a("RV OnLayout");
        H();
        ax.Y.u.b();
        this.w = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        p pVar = this.n;
        if (pVar == null) {
            C(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.x0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.e1(this.c, this.j0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.z0 = z2;
            if (z2 || this.m == null) {
                return;
            }
            if (this.j0.e == 1) {
                I();
            }
            this.n.F1(i2, i3);
            this.j0.j = true;
            J();
            this.n.I1(i2, i3);
            if (this.n.L1()) {
                this.n.F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.j0.j = true;
                J();
                this.n.I1(i2, i3);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.u) {
            this.n.e1(this.c, this.j0, i2, i3);
            return;
        }
        if (this.C) {
            G1();
            S0();
            a1();
            T0();
            B b = this.j0;
            if (b.l) {
                b.h = true;
            } else {
                this.e.j();
                this.j0.h = false;
            }
            this.C = false;
            J1(false);
        } else if (this.j0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.m;
        if (hVar != null) {
            this.j0.f = hVar.l();
        } else {
            this.j0.f = 0;
        }
        G1();
        this.n.e1(this.c, this.j0, i2, i3);
        J1(false);
        this.j0.h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.d = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.d;
        if (zVar2 != null) {
            zVar.b(zVar2);
            return zVar;
        }
        p pVar = this.n;
        if (pVar != null) {
            zVar.d0 = pVar.i1();
            return zVar;
        }
        zVar.d0 = null;
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void q(F f, m.c cVar, m.c cVar2) {
        i(f);
        f.H(false);
        if (this.O.c(f, cVar, cVar2)) {
            Y0();
        }
    }

    void r(String str) {
        if (E0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(HttpUrl.FRAGMENT_ENCODE_SET + V()));
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        F n0 = n0(view);
        if (n0 != null) {
            if (n0.y()) {
                n0.f();
            } else if (!n0.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + n0 + V());
            }
        } else if (D0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.n.g1(this, this.j0, view, view2) && view2 != null) {
            p1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.w1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.x != 0 || this.z) {
            this.y = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(F f) {
        m mVar = this.O;
        return mVar == null || mVar.g(f, f.p());
    }

    Rect s0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.c) {
            return qVar.b;
        }
        if (this.j0.e() && (qVar.b() || qVar.d())) {
            return qVar.b;
        }
        Rect rect = qVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.j.set(0, 0, 0, 0);
            this.q.get(i2).g(this.j, view, this, this.j0);
            int i3 = rect.left;
            Rect rect2 = this.j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.c = false;
        return rect;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        boolean q2 = pVar.q();
        boolean r2 = this.n.r();
        if (q2 || r2) {
            if (!q2) {
                i2 = 0;
            }
            if (!r2) {
                i3 = 0;
            }
            u1(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.q qVar) {
        this.q0 = qVar;
        C1760d0.l0(this, qVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        x1(hVar, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.r0) {
            return;
        }
        this.r0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            B0();
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        C1446g.g(lVar);
        this.J = lVar;
        B0();
    }

    public void setHasFixedSize(boolean z2) {
        this.u = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.O;
        if (mVar2 != null) {
            mVar2.k();
            this.O.w(null);
        }
        this.O = mVar;
        if (mVar != null) {
            mVar.w(this.o0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.c.L(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.n) {
            return;
        }
        L1();
        if (this.n != null) {
            m mVar = this.O;
            if (mVar != null) {
                mVar.k();
            }
            this.n.p1(this.c);
            this.n.q1(this.c);
            this.c.c();
            if (this.t) {
                this.n.G(this, this.c);
            }
            this.n.J1(null);
            this.n = null;
        } else {
            this.c.c();
        }
        this.f.o();
        this.n = pVar;
        if (pVar != null) {
            if (pVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.b.V());
            }
            pVar.J1(this);
            if (this.t) {
                this.n.F(this);
            }
        }
        this.c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.a0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.k0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f0 = z2;
    }

    public void setRecycledViewPool(v vVar) {
        this.c.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.o = xVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.P) {
            return;
        }
        if (E0) {
            Log.d("RecyclerView", "setting scroll state to " + i2 + " from " + this.P, new Exception());
        }
        this.P = i2;
        if (i2 != 2) {
            M1();
        }
        N(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d) {
        this.c.K(d);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.z) {
            r("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.z = true;
                this.A = true;
                L1();
                return;
            }
            this.z = false;
            if (this.y && this.n != null && this.m != null) {
                requestLayout();
            }
            this.y = false;
        }
    }

    void t1() {
        int j2 = this.f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            F n0 = n0(this.f.i(i2));
            if (D0 && n0.c == -1 && !n0.w()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!n0.K()) {
                n0.F();
            }
        }
    }

    boolean u1(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        A();
        if (this.m != null) {
            int[] iArr = this.w0;
            iArr[0] = 0;
            iArr[1] = 0;
            v1(i2, i3, iArr);
            int[] iArr2 = this.w0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i7 = i2 - i9;
            i8 = i3 - i10;
            i6 = i10;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.w0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i5, i6, i7, i8, this.u0, i4, iArr3);
        int[] iArr4 = this.w0;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z2 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.U;
        int[] iArr5 = this.u0;
        int i16 = iArr5[0];
        this.U = i15 - i16;
        int i17 = this.V;
        int i18 = iArr5[1];
        this.V = i17 - i18;
        int[] iArr6 = this.v0;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !ax.c0.C.e(motionEvent, 8194)) {
                c1(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            w(i2, i3);
        }
        if (i5 != 0 || i6 != 0) {
            O(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i6 == 0) ? false : true;
    }

    void v() {
        int j2 = this.f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            F n0 = n0(this.f.i(i2));
            if (!n0.K()) {
                n0.c();
            }
        }
        this.c.d();
    }

    public boolean v0() {
        return !this.w || this.F || this.e.p();
    }

    void v1(int i2, int i3, int[] iArr) {
        G1();
        S0();
        ax.Y.u.a("RV Scroll");
        W(this.j0);
        int B1 = i2 != 0 ? this.n.B1(i2, this.c, this.j0) : 0;
        int D1 = i3 != 0 ? this.n.D1(i3, this.c, this.j0) : 0;
        ax.Y.u.b();
        o1();
        T0();
        J1(false);
        if (iArr != null) {
            iArr[0] = B1;
            iArr[1] = D1;
        }
    }

    void w(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.K.onRelease();
            z2 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.N.onRelease();
            z2 |= this.N.isFinished();
        }
        if (z2) {
            C1760d0.c0(this);
        }
    }

    public void w1(int i2) {
        if (this.z) {
            return;
        }
        L1();
        p pVar = this.n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.C1(i2);
            awakenScrollBars();
        }
    }

    int x(int i2) {
        return y(i2, this.K, this.M, getWidth());
    }

    void x0() {
        this.e = new a(new C0651f());
    }

    boolean y1(F f, int i2) {
        if (!E0()) {
            C1760d0.s0(f.a, i2);
            return true;
        }
        f.q = i2;
        this.x0.add(f);
        return false;
    }

    int z(int i2) {
        return y(i2, this.L, this.N, getHeight());
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new y();
        this.c = new w();
        this.g = new androidx.recyclerview.widget.w();
        this.i = new RunnableC0646a();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = P0;
        this.O = new e();
        this.P = 0;
        this.Q = -1;
        this.d0 = Float.MIN_VALUE;
        this.e0 = Float.MIN_VALUE;
        this.f0 = true;
        this.g0 = new E();
        this.i0 = K0 ? new h.b() : null;
        this.j0 = new B();
        this.m0 = false;
        this.n0 = false;
        this.o0 = new n();
        this.p0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new RunnableC0647b();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new C0649d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.d0 = C1768h0.f(viewConfiguration, context);
        this.e0 = C1768h0.j(viewConfiguration, context);
        this.b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.w(this.o0);
        x0();
        z0();
        y0();
        if (C1760d0.z(this) == 0) {
            C1760d0.s0(this, 1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.q(this));
        int[] iArr = C2146d.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C1760d0.j0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(C2146d.j);
        if (obtainStyledAttributes.getInt(C2146d.d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(C2146d.c, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C2146d.e, false);
        this.v = z2;
        if (z2) {
            A0((StateListDrawable) obtainStyledAttributes.getDrawable(C2146d.h), obtainStyledAttributes.getDrawable(C2146d.i), (StateListDrawable) obtainStyledAttributes.getDrawable(C2146d.f), obtainStyledAttributes.getDrawable(C2146d.g));
        }
        obtainStyledAttributes.recycle();
        B(context, string, attributeSet, i2, 0);
        int[] iArr2 = F0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C1760d0.j0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        C2301a.d(this, true);
    }

    public static class z extends AbstractC2357a {
        public static final Parcelable.Creator<z> CREATOR = new a();
        Parcelable d0;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i) {
                return new z[i];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.d0 = zVar.d0;
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.d0, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {
        F a;
        final Rect b;
        boolean c;
        boolean d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.n();
        }

        public boolean b() {
            return this.a.z();
        }

        public boolean c() {
            return this.a.w();
        }

        public boolean d() {
            return this.a.u();
        }

        public q(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.n;
        if (pVar != null) {
            return pVar.L(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public static abstract class p {
        androidx.recyclerview.widget.b a;
        RecyclerView b;
        private final v.b c;
        private final v.b d;
        androidx.recyclerview.widget.v e;
        androidx.recyclerview.widget.v f;
        A g;
        boolean h;
        boolean i;
        boolean j;
        private boolean k;
        private boolean l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements v.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i) {
                return p.this.O(i);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.W(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.j0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.t0() - p.this.k0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.Z(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements v.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i) {
                return p.this.O(i);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.a0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.l0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.c0() - p.this.i0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.U(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public p() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.v(aVar);
            this.f = new androidx.recyclerview.widget.v(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        private void A1(w wVar, int i, View view) {
            F n0 = RecyclerView.n0(view);
            if (n0.K()) {
                if (RecyclerView.E0) {
                    Log.d("RecyclerView", "ignoring view " + n0);
                    return;
                }
                return;
            }
            if (n0.u() && !n0.w() && !this.b.m.q()) {
                v1(i);
                wVar.H(n0);
            } else {
                D(i);
                wVar.I(view);
                this.b.g.k(n0);
            }
        }

        private static boolean B0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void E(int i, View view) {
            this.a.d(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int Q(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1e
                if (r7 < 0) goto L13
            L10:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L13:
                if (r7 != r1) goto L1b
                if (r5 == r2) goto L23
                if (r5 == 0) goto L1b
                if (r5 == r3) goto L23
            L1b:
                r5 = 0
                r7 = 0
                goto L31
            L1e:
                if (r7 < 0) goto L21
                goto L10
            L21:
                if (r7 != r1) goto L25
            L23:
                r7 = r4
                goto L31
            L25:
                if (r7 != r0) goto L1b
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2c
                goto L2e
            L2c:
                r5 = 0
                goto L23
            L2e:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L23
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.Q(int, int, int, int, boolean):int");
        }

        private int[] R(View view, Rect rect) {
            int j0 = j0();
            int l0 = l0();
            int t0 = t0() - k0();
            int c0 = c0() - i0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - j0;
            int min = Math.min(0, i);
            int i2 = top - l0;
            int min2 = Math.min(0, i2);
            int i3 = width - t0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - c0);
            if (e0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            return new int[]{max, min2};
        }

        private void l(View view, int i, boolean z) {
            F n0 = RecyclerView.n0(view);
            if (z || n0.w()) {
                this.b.g.b(n0);
            } else {
                this.b.g.p(n0);
            }
            q qVar = (q) view.getLayoutParams();
            if (n0.M() || n0.x()) {
                if (n0.x()) {
                    n0.L();
                } else {
                    n0.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.V());
                }
                if (m != i) {
                    this.b.n.G0(m, i);
                }
            } else {
                this.a.a(view, i, false);
                qVar.c = true;
                A a2 = this.g;
                if (a2 != null && a2.h()) {
                    this.g.k(view);
                }
            }
            if (qVar.d) {
                if (RecyclerView.E0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + qVar.a);
                }
                n0.a.invalidate();
                qVar.d = false;
            }
        }

        public static d n0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2146d.a, i, i2);
            dVar.a = obtainStyledAttributes.getInt(C2146d.b, 1);
            dVar.b = obtainStyledAttributes.getInt(C2146d.l, 1);
            dVar.c = obtainStyledAttributes.getBoolean(C2146d.k, false);
            dVar.d = obtainStyledAttributes.getBoolean(C2146d.m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int t(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private boolean y0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int j0 = j0();
            int l0 = l0();
            int t0 = t0() - k0();
            int c0 = c0() - i0();
            Rect rect = this.b.j;
            V(focusedChild, rect);
            return rect.left - i < t0 && rect.right - i > j0 && rect.top - i2 < c0 && rect.bottom - i2 > l0;
        }

        public int A(B b2) {
            return 0;
        }

        public boolean A0(w wVar, B b2) {
            return false;
        }

        public int B(B b2) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int B1(int i, w wVar, B b2) {
            return 0;
        }

        public void C(w wVar) {
            for (int P = P() - 1; P >= 0; P--) {
                A1(wVar, P, O(P));
            }
        }

        public boolean C0() {
            A a2 = this.g;
            return a2 != null && a2.h();
        }

        public void C1(int i) {
            if (RecyclerView.E0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void D(int i) {
            E(i, O(i));
        }

        public boolean D0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        @SuppressLint({"UnknownNullness"})
        public int D1(int i, w wVar, B b2) {
            return 0;
        }

        public void E0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void E1(RecyclerView recyclerView) {
            F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void F(RecyclerView recyclerView) {
            this.i = true;
            L0(recyclerView);
        }

        public void F0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect s0 = this.b.s0(view);
            int i3 = i + s0.left + s0.right;
            int i4 = i2 + s0.top + s0.bottom;
            int Q = Q(t0(), u0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, q());
            int Q2 = Q(c0(), d0(), l0() + i0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, r());
            if (K1(view, Q, Q2, qVar)) {
                view.measure(Q, Q2);
            }
        }

        void F1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.I0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.I0) {
                return;
            }
            this.r = 0;
        }

        void G(RecyclerView recyclerView, w wVar) {
            this.i = false;
            N0(recyclerView, wVar);
        }

        public void G0(int i, int i2) {
            View O = O(i);
            if (O != null) {
                D(i);
                n(O, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
            }
        }

        public void G1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public View H(View view) {
            View Y;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (Y = recyclerView.Y(view)) == null || this.a.n(Y)) {
                return null;
            }
            return Y;
        }

        public void H0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.L0(i);
            }
        }

        public void H1(Rect rect, int i, int i2) {
            G1(t(i, rect.width() + j0() + k0(), h0()), t(i2, rect.height() + l0() + i0(), g0()));
        }

        public View I(int i) {
            int P = P();
            for (int i2 = 0; i2 < P; i2++) {
                View O = O(i2);
                F n0 = RecyclerView.n0(O);
                if (n0 != null && n0.n() == i && !n0.K() && (this.b.j0.e() || !n0.w())) {
                    return O;
                }
            }
            return null;
        }

        public void I0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.M0(i);
            }
        }

        void I1(int i, int i2) {
            int P = P();
            if (P == 0) {
                this.b.C(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            for (int i7 = 0; i7 < P; i7++) {
                View O = O(i7);
                Rect rect = this.b.j;
                V(O, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.b.j.set(i5, i6, i3, i4);
            H1(this.b.j, i, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q J();

        public void J0(h hVar, h hVar2) {
        }

        void J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.f;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public q K(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean K0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        boolean K1(View view, int i, int i2, q qVar) {
            return (!view.isLayoutRequested() && this.k && B0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && B0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public q L(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void L0(RecyclerView recyclerView) {
        }

        boolean L1() {
            return false;
        }

        public int M() {
            return -1;
        }

        @Deprecated
        public void M0(RecyclerView recyclerView) {
        }

        boolean M1(View view, int i, int i2, q qVar) {
            return (this.k && B0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && B0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int N(View view) {
            return ((q) view.getLayoutParams()).b.bottom;
        }

        @SuppressLint({"UnknownNullness"})
        public void N0(RecyclerView recyclerView, w wVar) {
            M0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void N1(RecyclerView recyclerView, B b2, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View O(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public View O0(View view, int i, w wVar, B b2) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void O1(A a2) {
            A a3 = this.g;
            if (a3 != null && a2 != a3 && a3.h()) {
                this.g.r();
            }
            this.g = a2;
            a2.q(this.b, this);
        }

        public int P() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void P0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            Q0(recyclerView.c, recyclerView.j0, accessibilityEvent);
        }

        void P1() {
            A a2 = this.g;
            if (a2 != null) {
                a2.r();
            }
        }

        public void Q0(w wVar, B b2, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.b.m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.l());
            }
        }

        public boolean Q1() {
            return false;
        }

        public void R0(w wVar, B b2, H h) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                h.a(8192);
                h.G0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                h.a(4096);
                h.G0(true);
            }
            h.o0(H.e.a(p0(wVar, b2), T(wVar, b2), A0(wVar, b2), q0(wVar, b2)));
        }

        public boolean S() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.h;
        }

        void S0(H h) {
            RecyclerView recyclerView = this.b;
            R0(recyclerView.c, recyclerView.j0, h);
        }

        public int T(w wVar, B b2) {
            return -1;
        }

        void T0(View view, H h) {
            F n0 = RecyclerView.n0(view);
            if (n0 == null || n0.w() || this.a.n(n0.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            U0(recyclerView.c, recyclerView.j0, view, h);
        }

        public int U(View view) {
            return view.getBottom() + N(view);
        }

        public void V(View view, Rect rect) {
            RecyclerView.p0(view, rect);
        }

        public View V0(View view, int i) {
            return null;
        }

        public int W(View view) {
            return view.getLeft() - f0(view);
        }

        public void W0(RecyclerView recyclerView, int i, int i2) {
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void X0(RecyclerView recyclerView) {
        }

        public int Y(View view) {
            Rect rect = ((q) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int Z(View view) {
            return view.getRight() + o0(view);
        }

        public void Z0(RecyclerView recyclerView, int i, int i2) {
        }

        public int a0(View view) {
            return view.getTop() - r0(view);
        }

        public void a1(RecyclerView recyclerView, int i, int i2) {
        }

        public View b0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
            a1(recyclerView, i, i2);
        }

        public int c0() {
            return this.r;
        }

        @SuppressLint({"UnknownNullness"})
        public void c1(w wVar, B b2) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d0() {
            return this.p;
        }

        @SuppressLint({"UnknownNullness"})
        public void d1(B b2) {
        }

        public int e0() {
            return C1760d0.B(this.b);
        }

        public void e1(w wVar, B b2, int i, int i2) {
            this.b.C(i, i2);
        }

        public int f() {
            RecyclerView recyclerView = this.b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.l();
            }
            return 0;
        }

        public int f0(View view) {
            return ((q) view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean f1(RecyclerView recyclerView, View view, View view2) {
            return C0() || recyclerView.E0();
        }

        public int g0() {
            return C1760d0.C(this.b);
        }

        public boolean g1(RecyclerView recyclerView, B b2, View view, View view2) {
            return f1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view) {
            i(view, -1);
        }

        public int h0() {
            return C1760d0.D(this.b);
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view, int i) {
            l(view, i, true);
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void j(View view) {
            k(view, -1);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void j1(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void k(View view, int i) {
            l(view, i, false);
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void k1(A a2) {
            if (this.g == a2) {
                this.g = null;
            }
        }

        public int l0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean l1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return m1(recyclerView.c, recyclerView.j0, i, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void m(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean m1(w wVar, B b2, int i, Bundle bundle) {
            int l0;
            int j0;
            int i2;
            int i3;
            if (this.b == null) {
                return false;
            }
            int c0 = c0();
            int t0 = t0();
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                c0 = rect.height();
                t0 = rect.width();
            }
            if (i == 4096) {
                l0 = this.b.canScrollVertically(1) ? (c0 - l0()) - i0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    j0 = (t0 - j0()) - k0();
                    i2 = l0;
                    i3 = j0;
                }
                i2 = l0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                l0 = this.b.canScrollVertically(-1) ? -((c0 - l0()) - i0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    j0 = -((t0 - j0()) - k0());
                    i2 = l0;
                    i3 = j0;
                }
                i2 = l0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.E1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void n(View view, int i) {
            o(view, i, (q) view.getLayoutParams());
        }

        boolean n1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return o1(recyclerView.c, recyclerView.j0, view, i, bundle);
        }

        public void o(View view, int i, q qVar) {
            F n0 = RecyclerView.n0(view);
            if (n0.w()) {
                this.b.g.b(n0);
            } else {
                this.b.g.p(n0);
            }
            this.a.c(view, i, qVar, n0.w());
        }

        public int o0(View view) {
            return ((q) view.getLayoutParams()).b.right;
        }

        public boolean o1(w wVar, B b2, View view, int i, Bundle bundle) {
            return false;
        }

        public void p(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.s0(view));
            }
        }

        public int p0(w wVar, B b2) {
            return -1;
        }

        public void p1(w wVar) {
            for (int P = P() - 1; P >= 0; P--) {
                if (!RecyclerView.n0(O(P)).K()) {
                    s1(P, wVar);
                }
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(w wVar, B b2) {
            return 0;
        }

        void q1(w wVar) {
            int j = wVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = wVar.n(i);
                F n0 = RecyclerView.n0(n);
                if (!n0.K()) {
                    n0.H(false);
                    if (n0.y()) {
                        this.b.removeDetachedView(n, false);
                    }
                    m mVar = this.b.O;
                    if (mVar != null) {
                        mVar.j(n0);
                    }
                    n0.H(true);
                    wVar.D(n);
                }
            }
            wVar.e();
            if (j > 0) {
                this.b.invalidate();
            }
        }

        public boolean r() {
            return false;
        }

        public int r0(View view) {
            return ((q) view.getLayoutParams()).b.top;
        }

        public void r1(View view, w wVar) {
            u1(view);
            wVar.G(view);
        }

        public boolean s(q qVar) {
            return qVar != null;
        }

        public void s0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void s1(int i, w wVar) {
            View O = O(i);
            v1(i);
            wVar.G(O);
        }

        public int t0() {
            return this.q;
        }

        public boolean t1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i, int i2, B b2, c cVar) {
        }

        public int u0() {
            return this.o;
        }

        @SuppressLint({"UnknownNullness"})
        public void u1(View view) {
            this.a.p(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void v(int i, c cVar) {
        }

        boolean v0() {
            int P = P();
            for (int i = 0; i < P; i++) {
                ViewGroup.LayoutParams layoutParams = O(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void v1(int i) {
            if (O(i) != null) {
                this.a.q(i);
            }
        }

        public int w(B b2) {
            return 0;
        }

        public boolean w0() {
            return this.i;
        }

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return x1(recyclerView, view, rect, z, false);
        }

        public int x(B b2) {
            return 0;
        }

        public boolean x0() {
            return this.j;
        }

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] R = R(view, rect);
            int i = R[0];
            int i2 = R[1];
            if ((z2 && !y0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.B1(i, i2);
            }
            return true;
        }

        public int y(B b2) {
            return 0;
        }

        public void y1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int z(B b2) {
            return 0;
        }

        public final boolean z0() {
            return this.l;
        }

        public void z1() {
            this.h = true;
        }

        public void U0(w wVar, B b2, View view, H h) {
        }
    }
}
