/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

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
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import ax.c0.d0;
import ax.c0.h0;
import ax.d0.H;
import ax.h2.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

public class RecyclerView
extends ViewGroup
implements ax.c0.D {
    static boolean D0 = false;
    static boolean E0 = false;
    private static final int[] F0 = new int[]{16843830};
    private static final float G0 = (float)(Math.log(0.78) / Math.log(0.9));
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
    boolean F = false;
    boolean G = false;
    private int H = 0;
    private int I = 0;
    private l J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    m O;
    private int P = 0;
    private int Q = -1;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private final float a;
    private s a0;
    private final y b = new y(this);
    private final int b0;
    final w c = new w(this);
    private final int c0;
    z d;
    private float d0;
    a e;
    private float e0;
    b f;
    private boolean f0 = true;
    final androidx.recyclerview.widget.w g = new androidx.recyclerview.widget.w();
    final E g0;
    boolean h;
    androidx.recyclerview.widget.h h0;
    final Runnable i = new Runnable(this){
        final RecyclerView q;
        {
            this.q = recyclerView;
        }

        @Override
        public void run() {
            RecyclerView recyclerView = this.q;
            if (recyclerView.w && !recyclerView.isLayoutRequested()) {
                recyclerView = this.q;
                if (!recyclerView.t) {
                    recyclerView.requestLayout();
                    return;
                }
                if (recyclerView.z) {
                    recyclerView.y = true;
                    return;
                }
                recyclerView.A();
            }
        }
    };
    h.b i0;
    final Rect j = new Rect();
    final B j0;
    private final Rect k = new Rect();
    private u k0;
    final RectF l = new RectF();
    private List<u> l0;
    h m;
    boolean m0;
    p n;
    boolean n0;
    x o;
    private m.b o0;
    final List<x> p = new ArrayList<x>();
    boolean p0;
    final ArrayList<o> q = new ArrayList();
    androidx.recyclerview.widget.q q0;
    private final ArrayList<t> r = new ArrayList();
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
    private int x = 0;
    final List<F> x0;
    boolean y;
    private Runnable y0;
    boolean z;
    private boolean z0;

    static {
        int n8 = Build.VERSION.SDK_INT;
        H0 = false;
        boolean bl = n8 >= 23;
        I0 = bl;
        J0 = true;
        K0 = true;
        L0 = false;
        M0 = false;
        Class<Integer> clazz = Integer.TYPE;
        N0 = new Class[]{Context.class, AttributeSet.class, clazz, clazz};
        O0 = new Interpolator(){

            public float getInterpolation(float f8) {
                return (f8 -= 1.0f) * f8 * f8 * f8 * f8 + 1.0f;
            }
        };
        P0 = new C();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.h2.a.a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.J = P0;
        this.O = new e();
        this.d0 = Float.MIN_VALUE;
        this.e0 = Float.MIN_VALUE;
        this.g0 = new E(this);
        Object object = K0 ? new h.b() : null;
        this.i0 = object;
        this.j0 = new B();
        this.m0 = false;
        this.n0 = false;
        this.o0 = new n(this);
        this.p0 = false;
        this.s0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList<F>();
        this.y0 = new Runnable(this){
            final RecyclerView q;
            {
                this.q = recyclerView;
            }

            @Override
            public void run() {
                m m8 = this.q.O;
                if (m8 != null) {
                    m8.v();
                }
                this.q.p0 = false;
            }
        };
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new w.b(this){
            final RecyclerView a;
            {
                this.a = recyclerView;
            }

            @Override
            public void a(F f8) {
                RecyclerView recyclerView = this.a;
                recyclerView.n.r1(f8.a, recyclerView.c);
            }

            @Override
            public void b(F f8, m.c c8, m.c c9) {
                this.a.o(f8, c8, c9);
            }

            @Override
            public void c(F f8, m.c c8, m.c c9) {
                this.a.c.O(f8);
                this.a.q(f8, c8, c9);
            }

            @Override
            public void d(F f8, m.c c8, m.c c9) {
                f8.H(false);
                RecyclerView recyclerView = this.a;
                if (recyclerView.F) {
                    if (recyclerView.O.b(f8, f8, c8, c9)) {
                        this.a.Y0();
                        return;
                    }
                } else if (recyclerView.O.d(f8, c8, c9)) {
                    this.a.Y0();
                }
            }
        };
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        object = ViewConfiguration.get((Context)context);
        this.W = object.getScaledTouchSlop();
        this.d0 = ax.c0.h0.f((ViewConfiguration)object, context);
        this.e0 = ax.c0.h0.j((ViewConfiguration)object, context);
        this.b0 = object.getScaledMinimumFlingVelocity();
        this.c0 = object.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        boolean bl = this.getOverScrollMode() == 2;
        this.setWillNotDraw(bl);
        this.O.w(this.o0);
        this.x0();
        this.z0();
        this.y0();
        if (ax.c0.d0.z((View)this) == 0) {
            ax.c0.d0.s0((View)this, 1);
        }
        this.D = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new androidx.recyclerview.widget.q(this));
        Object object2 = ax.h2.d.a;
        object = context.obtainStyledAttributes(attributeSet, object2, n8, 0);
        ax.c0.d0.j0((View)this, context, object2, attributeSet, (TypedArray)object, n8, 0);
        object2 = object.getString(ax.h2.d.j);
        if (object.getInt(ax.h2.d.d, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.h = object.getBoolean(ax.h2.d.c, true);
        this.v = bl = object.getBoolean(ax.h2.d.e, false);
        if (bl) {
            this.A0((StateListDrawable)object.getDrawable(ax.h2.d.h), object.getDrawable(ax.h2.d.i), (StateListDrawable)object.getDrawable(ax.h2.d.f), object.getDrawable(ax.h2.d.g));
        }
        object.recycle();
        this.B(context, (String)object2, attributeSet, n8, 0);
        object = F0;
        object2 = context.obtainStyledAttributes(attributeSet, (int[])object, n8, 0);
        ax.c0.d0.j0((View)this, context, (int[])object, attributeSet, (TypedArray)object2, n8, 0);
        bl = object2.getBoolean(0, true);
        object2.recycle();
        this.setNestedScrollingEnabled(bl);
        ax.j0.a.d((View)this, true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void B(Context object, String object2, AttributeSet attributeSet, int n8, int n9) {
        ClassNotFoundException classNotFoundException2;
        String string;
        block18: {
            InvocationTargetException invocationTargetException2;
            block17: {
                InstantiationException instantiationException2;
                block16: {
                    IllegalAccessException illegalAccessException2;
                    block15: {
                        ClassCastException classCastException2;
                        block14: {
                            block13: {
                                Object[] objectArray;
                                if (object2 == null) return;
                                if (((String)(object2 = ((String)object2).trim())).isEmpty()) return;
                                string = this.r0((Context)object, (String)object2);
                                try {
                                    object2 = this.isInEditMode() ? this.getClass().getClassLoader() : object.getClassLoader();
                                    Class<p> clazz = Class.forName(string, false, (ClassLoader)object2).asSubclass(p.class);
                                    try {
                                        object2 = clazz.getConstructor(N0);
                                        objectArray = new Object[4];
                                    }
                                    catch (NoSuchMethodException noSuchMethodException) {
                                        object = null;
                                        try {
                                            object2 = clazz.getConstructor(null);
                                            break block13;
                                        }
                                        catch (NoSuchMethodException noSuchMethodException2) {
                                            noSuchMethodException2.initCause(noSuchMethodException);
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append(attributeSet.getPositionDescription());
                                            stringBuilder.append(": Error creating LayoutManager ");
                                            stringBuilder.append(string);
                                            object2 = new IllegalStateException(stringBuilder.toString(), noSuchMethodException2);
                                            throw object2;
                                        }
                                    }
                                }
                                catch (ClassCastException classCastException2) {
                                    break block14;
                                }
                                catch (IllegalAccessException illegalAccessException2) {
                                    break block15;
                                }
                                catch (InstantiationException instantiationException2) {
                                    break block16;
                                }
                                catch (InvocationTargetException invocationTargetException2) {
                                    break block17;
                                }
                                catch (ClassNotFoundException classNotFoundException2) {
                                    break block18;
                                }
                                objectArray[0] = object;
                                objectArray[1] = attributeSet;
                                {
                                    objectArray[2] = n8;
                                    objectArray[3] = n9;
                                    object = objectArray;
                                }
                            }
                            ((AccessibleObject)object2).setAccessible(true);
                            this.setLayoutManager((p)((Constructor)object2).newInstance((Object[])object));
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(attributeSet.getPositionDescription());
                        ((StringBuilder)object).append(": Class is not a LayoutManager ");
                        ((StringBuilder)object).append(string);
                        throw new IllegalStateException(((StringBuilder)object).toString(), classCastException2);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(attributeSet.getPositionDescription());
                    ((StringBuilder)object).append(": Cannot access non-public constructor ");
                    ((StringBuilder)object).append(string);
                    throw new IllegalStateException(((StringBuilder)object).toString(), illegalAccessException2);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(attributeSet.getPositionDescription());
                ((StringBuilder)object).append(": Could not instantiate the LayoutManager: ");
                ((StringBuilder)object).append(string);
                throw new IllegalStateException(((StringBuilder)object).toString(), instantiationException2);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(attributeSet.getPositionDescription());
            ((StringBuilder)object).append(": Could not instantiate the LayoutManager: ");
            ((StringBuilder)object).append(string);
            throw new IllegalStateException(((StringBuilder)object).toString(), invocationTargetException2);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(attributeSet.getPositionDescription());
        ((StringBuilder)object2).append(": Unable to find LayoutManager ");
        ((StringBuilder)object2).append(string);
        throw new IllegalStateException(((StringBuilder)object2).toString(), classNotFoundException2);
    }

    private boolean D(int n8, int n9) {
        this.b0(this.s0);
        int[] nArray = this.s0;
        return nArray[0] != n8 || nArray[1] != n9;
        {
        }
    }

    private boolean F0(View object, View view, int n8) {
        if (view != null && view != this && view != object) {
            int n9;
            int n10;
            if (this.Y(view) == null) {
                return false;
            }
            if (object == null) {
                return true;
            }
            if (this.Y((View)object) == null) {
                return true;
            }
            this.j.set(0, 0, object.getWidth(), object.getHeight());
            this.k.set(0, 0, view.getWidth(), view.getHeight());
            this.offsetDescendantRectToMyCoords((View)object, this.j);
            this.offsetDescendantRectToMyCoords(view, this.k);
            int n11 = this.n.e0();
            int n12 = -1;
            int n13 = n11 == 1 ? -1 : 1;
            object = this.j;
            int n14 = ((Rect)object).left;
            view = this.k;
            n11 = view.left;
            n11 = (n14 < n11 || ((Rect)object).right <= n11) && ((Rect)object).right < view.right ? 1 : (((n10 = ((Rect)object).right) > (n9 = view.right) || n14 >= n9) && n14 > n11 ? -1 : 0);
            n14 = ((Rect)object).top;
            int n15 = view.top;
            if ((n14 < n15 || ((Rect)object).bottom <= n15) && ((Rect)object).bottom < view.bottom) {
                n12 = 1;
            } else {
                n10 = ((Rect)object).bottom;
                n9 = view.bottom;
                if (n10 <= n9 && n14 < n9 || n14 <= n15) {
                    n12 = 0;
                }
            }
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 17) {
                        if (n8 != 33) {
                            if (n8 != 66) {
                                if (n8 == 130) {
                                    return n12 > 0;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Invalid direction: ");
                                ((StringBuilder)object).append(n8);
                                ((StringBuilder)object).append(this.V());
                                throw new IllegalArgumentException(((StringBuilder)object).toString());
                            }
                            return n11 > 0;
                        }
                        return n12 < 0;
                    }
                    return n11 < 0;
                }
                return n12 > 0 || n12 == 0 && n11 * n13 > 0;
                {
                }
            }
            return n12 < 0 || n12 == 0 && n11 * n13 < 0;
            {
            }
        }
        return false;
    }

    private void G() {
        int n8 = this.B;
        this.B = 0;
        if (n8 != 0 && this.D0()) {
            AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
            accessibilityEvent.setEventType(2048);
            ax.d0.b.b(accessibilityEvent, n8);
            this.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    private void I() {
        m.c c8;
        int n8;
        int n9;
        Object object = this.j0;
        boolean bl = true;
        ((B)object).a(1);
        this.W(this.j0);
        this.j0.j = false;
        this.G1();
        this.g.f();
        this.S0();
        this.a1();
        this.s1();
        object = this.j0;
        if (!((B)object).k || !this.n0) {
            bl = false;
        }
        ((B)object).i = bl;
        this.n0 = false;
        this.m0 = false;
        ((B)object).h = ((B)object).l;
        ((B)object).f = this.m.l();
        this.b0(this.s0);
        if (this.j0.k) {
            n9 = this.f.g();
            for (n8 = 0; n8 < n9; ++n8) {
                object = RecyclerView.n0(this.f.f(n8));
                if (((F)object).K() || ((F)object).u() && !this.m.q()) continue;
                c8 = this.O.u(this.j0, (F)object, androidx.recyclerview.widget.RecyclerView$m.e((F)object), ((F)object).p());
                this.g.e((F)object, c8);
                if (!this.j0.i || !((F)object).z() || ((F)object).w() || ((F)object).K() || ((F)object).u()) continue;
                long l8 = this.j0((F)object);
                this.g.c(l8, (F)object);
            }
        }
        if (this.j0.l) {
            this.t1();
            object = this.j0;
            bl = ((B)object).g;
            ((B)object).g = false;
            this.n.c1(this.c, (B)object);
            this.j0.g = bl;
            for (n8 = 0; n8 < this.f.g(); ++n8) {
                object = RecyclerView.n0(this.f.f(n8));
                if (((F)object).K() || this.g.i((F)object)) continue;
                int n10 = androidx.recyclerview.widget.RecyclerView$m.e((F)object);
                bl = ((F)object).q(8192);
                n9 = n10;
                if (!bl) {
                    n9 = n10 | 0x1000;
                }
                c8 = this.O.u(this.j0, (F)object, n9, ((F)object).p());
                if (bl) {
                    this.d1((F)object, c8);
                    continue;
                }
                this.g.a((F)object, c8);
            }
            this.v();
        } else {
            this.v();
        }
        this.T0();
        this.J1(false);
        this.j0.e = 2;
    }

    private boolean I1(MotionEvent motionEvent) {
        boolean bl;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null && ax.h0.d.b(edgeEffect) != 0.0f && !this.canScrollHorizontally(-1)) {
            ax.h0.d.d(this.K, 0.0f, 1.0f - motionEvent.getY() / (float)this.getHeight());
            bl = true;
        } else {
            bl = false;
        }
        edgeEffect = this.M;
        boolean bl2 = bl;
        if (edgeEffect != null) {
            bl2 = bl;
            if (ax.h0.d.b(edgeEffect) != 0.0f) {
                bl2 = bl;
                if (!this.canScrollHorizontally(1)) {
                    ax.h0.d.d(this.M, 0.0f, motionEvent.getY() / (float)this.getHeight());
                    bl2 = true;
                }
            }
        }
        edgeEffect = this.L;
        bl = bl2;
        if (edgeEffect != null) {
            bl = bl2;
            if (ax.h0.d.b(edgeEffect) != 0.0f) {
                bl = bl2;
                if (!this.canScrollVertically(-1)) {
                    ax.h0.d.d(this.L, 0.0f, motionEvent.getX() / (float)this.getWidth());
                    bl = true;
                }
            }
        }
        if ((edgeEffect = this.N) != null && ax.h0.d.b(edgeEffect) != 0.0f && !this.canScrollVertically(1)) {
            ax.h0.d.d(this.N, 0.0f, 1.0f - motionEvent.getX() / (float)this.getWidth());
            return true;
        }
        return bl;
    }

    private void J() {
        B b8;
        this.G1();
        this.S0();
        this.j0.a(6);
        this.e.j();
        this.j0.f = this.m.l();
        this.j0.d = 0;
        if (this.d != null && this.m.i()) {
            b8 = this.d.d0;
            if (b8 != null) {
                this.n.h1((Parcelable)b8);
            }
            this.d = null;
        }
        b8 = this.j0;
        b8.h = false;
        this.n.c1(this.c, b8);
        b8 = this.j0;
        b8.g = false;
        boolean bl = b8.k && this.O != null;
        b8.k = bl;
        b8.e = 4;
        this.T0();
        this.J1(false);
    }

    private void K() {
        this.j0.a(4);
        this.G1();
        this.S0();
        Object object = this.j0;
        ((B)object).e = 1;
        if (((B)object).k) {
            for (int i8 = this.f.g() - 1; i8 >= 0; --i8) {
                object = RecyclerView.n0(this.f.f(i8));
                if (((F)object).K()) continue;
                long l8 = this.j0((F)object);
                m.c c8 = this.O.t(this.j0, (F)object);
                F f8 = this.g.g(l8);
                if (f8 != null && !f8.K()) {
                    boolean bl = this.g.h(f8);
                    boolean bl2 = this.g.h((F)object);
                    if (bl && f8 == object) {
                        this.g.d((F)object, c8);
                        continue;
                    }
                    m.c c9 = this.g.n(f8);
                    this.g.d((F)object, c8);
                    c8 = this.g.m((F)object);
                    if (c9 == null) {
                        this.u0(l8, (F)object, f8);
                        continue;
                    }
                    this.p(f8, (F)object, c9, c8, bl, bl2);
                    continue;
                }
                this.g.d((F)object, c8);
            }
            this.g.o(this.C0);
        }
        this.n.q1(this.c);
        object = this.j0;
        ((B)object).c = ((B)object).f;
        this.F = false;
        this.G = false;
        ((B)object).k = false;
        ((B)object).l = false;
        this.n.h = false;
        object = this.c.b;
        if (object != null) {
            ((ArrayList)object).clear();
        }
        object = this.n;
        if (((p)object).n) {
            ((p)object).m = 0;
            ((p)object).n = false;
            this.c.P();
        }
        this.n.d1(this.j0);
        this.T0();
        this.J1(false);
        this.g.f();
        object = this.s0;
        if (this.D((int)object[0], (int)object[1])) {
            this.O(0, 0);
        }
        this.e1();
        this.q1();
    }

    private void K0(int n8, int n9, MotionEvent object, int n10) {
        Object object2 = this.n;
        if (object2 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.z) {
            return;
        }
        int[] nArray = this.w0;
        int n11 = 0;
        nArray[0] = 0;
        nArray[1] = 0;
        int n12 = ((p)object2).q();
        boolean bl = this.n.r();
        int n13 = bl ? n12 | 2 : n12;
        float f8 = object == null ? (float)this.getHeight() / 2.0f : object.getY();
        float f9 = object == null ? (float)this.getWidth() / 2.0f : object.getX();
        int n14 = n8 - this.g1(n8, f8);
        int n15 = n9 - this.h1(n9, f9);
        this.H1(n13, n10);
        n13 = n12 != 0 ? n14 : 0;
        int n16 = bl ? n15 : 0;
        n9 = n14;
        n8 = n15;
        if (this.L(n13, n16, this.w0, this.u0, n10)) {
            object2 = this.w0;
            n9 = n14 - object2[0];
            n8 = n15 - object2[1];
        }
        n14 = n12 != 0 ? n9 : 0;
        n15 = n11;
        if (bl) {
            n15 = n8;
        }
        this.u1(n14, n15, (MotionEvent)object, n10);
        object = this.h0;
        if (object != null && (n9 != 0 || n8 != 0)) {
            ((androidx.recyclerview.widget.h)object).f(this, n9, n8);
        }
        this.K1(n10);
    }

    private void M1() {
        this.g0.f();
        p p8 = this.n;
        if (p8 != null) {
            p8.P1();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        t t8 = this.s;
        if (t8 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return this.a0(motionEvent);
        }
        t8.b(this, motionEvent);
        int n8 = motionEvent.getAction();
        if (n8 == 3 || n8 == 1) {
            this.s = null;
        }
        return true;
    }

    private void V0(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n8) == this.Q) {
            int n9;
            n8 = n8 == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(n8);
            this.U = n9 = (int)(motionEvent.getX(n8) + 0.5f);
            this.S = n9;
            this.V = n8 = (int)(motionEvent.getY(n8) + 0.5f);
            this.T = n8;
        }
    }

    private boolean Z0() {
        return this.O != null && this.n.Q1();
    }

    private boolean a0(MotionEvent motionEvent) {
        int n8 = motionEvent.getAction();
        int n9 = this.r.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            t t8 = this.r.get(i8);
            if (!t8.c(this, motionEvent) || n8 == 3) continue;
            this.s = t8;
            return true;
        }
        return false;
    }

    private void a1() {
        if (this.F) {
            this.e.y();
            if (this.G) {
                this.n.X0(this);
            }
        }
        if (this.Z0()) {
            this.e.w();
        } else {
            this.e.j();
        }
        boolean bl = this.m0;
        boolean bl2 = true;
        boolean bl3 = bl || this.n0;
        B b8 = this.j0;
        bl = !(!this.w || this.O == null || !(bl = this.F) && !bl3 && !this.n.h || bl && !this.m.q());
        b8.k = bl;
        b8 = this.j0;
        bl = b8.k && bl3 && !this.F && this.Z0() ? bl2 : false;
        b8.l = bl;
    }

    private void b0(int[] nArray) {
        int n8 = this.f.g();
        if (n8 == 0) {
            nArray[0] = -1;
            nArray[1] = -1;
            return;
        }
        int n9 = Integer.MAX_VALUE;
        int n10 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11;
            F f8 = RecyclerView.n0(this.f.f(i8));
            if (f8.K()) {
                n11 = n10;
            } else {
                int n12 = f8.n();
                int n13 = n9;
                if (n12 < n9) {
                    n13 = n12;
                }
                n9 = n13;
                n11 = n10;
                if (n12 > n10) {
                    n11 = n12;
                    n9 = n13;
                }
            }
            n10 = n11;
        }
        nArray[0] = n9;
        nArray[1] = n10;
    }

    static RecyclerView c0(View object) {
        if (!(object instanceof ViewGroup)) {
            return null;
        }
        if (object instanceof RecyclerView) {
            return (RecyclerView)object;
        }
        ViewGroup viewGroup = (ViewGroup)object;
        int n8 = viewGroup.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            object = RecyclerView.c0(viewGroup.getChildAt(i8));
            if (object == null) continue;
            return object;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private void c1(float var1_1, float var2_2, float var3_3, float var4_4) {
        var6_5 = true;
        if (var2_2 < 0.0f) {
            this.S();
            ax.h0.d.d(this.K, -var2_2 / (float)this.getWidth(), 1.0f - var3_3 / (float)this.getHeight());
lbl6:
            // 2 sources

            while (true) {
                var5_6 = true;
                break;
            }
        } else {
            if (var2_2 > 0.0f) {
                this.T();
                ax.h0.d.d(this.M, var2_2 / (float)this.getWidth(), var3_3 / (float)this.getHeight());
                ** continue;
            }
            var5_6 = false;
        }
        if (var4_4 < 0.0f) {
            this.U();
            ax.h0.d.d(this.L, -var4_4 / (float)this.getHeight(), var1_1 / (float)this.getWidth());
            var5_6 = var6_5;
        } else if (var4_4 > 0.0f) {
            this.R();
            ax.h0.d.d(this.N, var4_4 / (float)this.getHeight(), 1.0f - var1_1 / (float)this.getWidth());
            var5_6 = var6_5;
        }
        if (!var5_6 && var2_2 == 0.0f && var4_4 == 0.0f) {
            return;
        }
        ax.c0.d0.c0((View)this);
    }

    private View d0() {
        Object object = this.j0;
        int n8 = ((B)object).m;
        if (n8 == -1) {
            n8 = 0;
        }
        int n9 = ((B)object).b();
        for (int i8 = n8; i8 < n9 && (object = this.e0(i8)) != null; ++i8) {
            if (!((F)object).a.hasFocusable()) continue;
            return ((F)object).a;
        }
        for (n8 = Math.min(n9, n8) - 1; n8 >= 0; --n8) {
            object = this.e0(n8);
            if (object == null) {
                return null;
            }
            if (!((F)object).a.hasFocusable()) continue;
            return ((F)object).a;
        }
        return null;
    }

    private void e1() {
        block12: {
            Object object;
            block13: {
                block14: {
                    if (!this.f0 || this.m == null || !this.hasFocus() || this.getDescendantFocusability() == 393216 || this.getDescendantFocusability() == 131072 && this.isFocused()) break block12;
                    if (this.isFocused()) break block13;
                    object = this.getFocusedChild();
                    if (!M0 || object.getParent() != null && object.hasFocus()) break block14;
                    if (this.f.g() == 0) {
                        this.requestFocus();
                        return;
                    }
                    break block13;
                }
                if (!this.f.n((View)object)) break block12;
            }
            long l8 = this.j0.n;
            Object object2 = null;
            object = l8 != -1L && this.m.q() ? this.f0(this.j0.n) : null;
            if (object != null && !this.f.n(object.a) && object.a.hasFocusable()) {
                object = object.a;
            } else {
                object = object2;
                if (this.f.g() > 0) {
                    object = this.d0();
                }
            }
            if (object != null) {
                int n8 = this.j0.o;
                object2 = object;
                if ((long)n8 != -1L) {
                    View view = object.findViewById(n8);
                    object2 = object;
                    if (view != null) {
                        object2 = object;
                        if (view.isFocusable()) {
                            object2 = view;
                        }
                    }
                }
                object2.requestFocus();
            }
        }
    }

    private void f1() {
        boolean bl;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl = this.K.isFinished();
        } else {
            bl = false;
        }
        edgeEffect = this.L;
        boolean bl2 = bl;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl2 = bl | this.L.isFinished();
        }
        edgeEffect = this.M;
        bl = bl2;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl = bl2 | this.M.isFinished();
        }
        edgeEffect = this.N;
        bl2 = bl;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl2 = bl | this.N.isFinished();
        }
        if (bl2) {
            ax.c0.d0.c0((View)this);
        }
    }

    private int g1(int n8, float f8) {
        float f9 = f8 / (float)this.getHeight();
        float f10 = (float)n8 / (float)this.getWidth();
        EdgeEffect edgeEffect = this.K;
        float f11 = 0.0f;
        float f12 = 0.0f;
        f8 = 0.0f;
        if (edgeEffect != null && ax.h0.d.b(edgeEffect) != 0.0f) {
            if (this.canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                f8 = -ax.h0.d.d(this.K, -f10, 1.0f - f9);
                if (ax.h0.d.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
            }
            this.invalidate();
        } else {
            edgeEffect = this.M;
            f8 = f12;
            if (edgeEffect != null) {
                f8 = f12;
                if (ax.h0.d.b(edgeEffect) != 0.0f) {
                    if (this.canScrollHorizontally(1)) {
                        this.M.onRelease();
                        f8 = f11;
                    } else {
                        f8 = ax.h0.d.d(this.M, f10, f9);
                        if (ax.h0.d.b(this.M) == 0.0f) {
                            this.M.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(f8 * (float)this.getWidth());
    }

    private ax.c0.E getScrollingChildHelper() {
        if (this.t0 == null) {
            this.t0 = new ax.c0.E((View)this);
        }
        return this.t0;
    }

    private int h1(int n8, float f8) {
        float f9 = f8 / (float)this.getWidth();
        float f10 = (float)n8 / (float)this.getHeight();
        EdgeEffect edgeEffect = this.L;
        float f11 = 0.0f;
        float f12 = 0.0f;
        f8 = 0.0f;
        if (edgeEffect != null && ax.h0.d.b(edgeEffect) != 0.0f) {
            if (this.canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                f8 = -ax.h0.d.d(this.L, -f10, f9);
                if (ax.h0.d.b(this.L) == 0.0f) {
                    this.L.onRelease();
                }
            }
            this.invalidate();
        } else {
            edgeEffect = this.N;
            f8 = f12;
            if (edgeEffect != null) {
                f8 = f12;
                if (ax.h0.d.b(edgeEffect) != 0.0f) {
                    if (this.canScrollVertically(1)) {
                        this.N.onRelease();
                        f8 = f11;
                    } else {
                        f8 = ax.h0.d.d(this.N, f10, 1.0f - f9);
                        if (ax.h0.d.b(this.N) == 0.0f) {
                            this.N.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(f8 * (float)this.getHeight());
    }

    private void i(F f8) {
        View view = f8.a;
        boolean bl = view.getParent() == this;
        this.c.O(this.m0(view));
        if (f8.y()) {
            this.f.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!bl) {
            this.f.b(view, true);
            return;
        }
        this.f.k(view);
    }

    static F n0(View view) {
        if (view == null) {
            return null;
        }
        return ((q)view.getLayoutParams()).a;
    }

    private void p(F f8, F f9, m.c c8, m.c c9, boolean bl, boolean bl2) {
        f8.H(false);
        if (bl) {
            this.i(f8);
        }
        if (f8 != f9) {
            if (bl2) {
                this.i(f9);
            }
            f8.h = f9;
            this.i(f8);
            this.c.O(f8);
            f9.H(false);
            f9.i = f8;
        }
        if (this.O.b(f8, f9, c8, c9)) {
            this.Y0();
        }
    }

    static void p0(View view, Rect rect) {
        q q8 = (q)view.getLayoutParams();
        Rect rect2 = q8.b;
        rect.set(view.getLeft() - rect2.left - q8.leftMargin, view.getTop() - rect2.top - q8.topMargin, view.getRight() + rect2.right + q8.rightMargin, view.getBottom() + rect2.bottom + q8.bottomMargin);
    }

    private void p1(View view, View view2) {
        Rect rect;
        Object object = view2 != null ? view2 : view;
        this.j.set(0, 0, object.getWidth(), object.getHeight());
        object = object.getLayoutParams();
        if (object instanceof q) {
            object = (q)((Object)object);
            if (!((q)((Object)object)).c) {
                object = ((q)((Object)object)).b;
                rect = this.j;
                rect.left -= ((Rect)object).left;
                rect.right += ((Rect)object).right;
                rect.top -= ((Rect)object).top;
                rect.bottom += ((Rect)object).bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.j);
            this.offsetRectIntoDescendantCoords(view, this.j);
        }
        object = this.n;
        rect = this.j;
        boolean bl = this.w;
        boolean bl2 = view2 == null;
        ((p)object).x1(this, view, rect, bl ^ true, bl2);
    }

    private int q0(View view) {
        int n8 = view.getId();
        while (!view.isFocused() && view instanceof ViewGroup && view.hasFocus()) {
            View view2;
            view = view2 = ((ViewGroup)view).getFocusedChild();
            if (view2.getId() == -1) continue;
            n8 = view2.getId();
            view = view2;
        }
        return n8;
    }

    private void q1() {
        B b8 = this.j0;
        b8.n = -1L;
        b8.m = -1;
        b8.o = -1;
    }

    private String r0(Context object, String string) {
        if (string.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.getPackageName());
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        if (string.contains(".")) {
            return string;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(RecyclerView.class.getPackage().getName());
        ((StringBuilder)object).append('.');
        ((StringBuilder)object).append(string);
        return ((StringBuilder)object).toString();
    }

    private void r1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        this.K1(0);
        this.f1();
    }

    private void s1() {
        boolean bl = this.f0;
        Object object = null;
        Object object2 = bl && this.hasFocus() && this.m != null ? this.getFocusedChild() : null;
        if ((object2 = object2 == null ? object : this.Z((View)object2)) == null) {
            this.q1();
            return;
        }
        object = this.j0;
        long l8 = this.m.q() ? ((F)object2).l() : -1L;
        ((B)object).n = l8;
        object = this.j0;
        int n8 = this.F ? -1 : (((F)object2).w() ? ((F)object2).d : ((F)object2).j());
        ((B)object).m = n8;
        this.j0.o = this.q0(((F)object2).a);
    }

    public static void setDebugAssertionsEnabled(boolean bl) {
        D0 = bl;
    }

    public static void setVerboseLoggingEnabled(boolean bl) {
        E0 = bl;
    }

    private void t() {
        this.r1();
        this.setScrollState(0);
    }

    private float t0(int n8) {
        double d8 = Math.log((float)Math.abs(n8) * 0.35f / (this.a * 0.015f));
        float f8 = G0;
        double d9 = f8;
        return (float)((double)(this.a * 0.015f) * Math.exp((double)f8 / (d9 - 1.0) * d8));
    }

    static void u(F f8) {
        block3: {
            View view = f8.b;
            if (view != null) {
                view = (View)view.get();
                while (view != null) {
                    if (view != f8.a) {
                        if ((view = view.getParent()) instanceof View) continue;
                        view = null;
                        continue;
                    }
                    break block3;
                }
                f8.b = null;
            }
        }
    }

    private void u0(long l8, F f8, F object) {
        Object object2;
        int n8 = this.f.g();
        for (int i8 = 0; i8 < n8; ++i8) {
            object2 = RecyclerView.n0(this.f.f(i8));
            if (object2 == f8 || this.j0((F)object2) != l8) continue;
            object = this.m;
            if (object != null && ((h)object).q()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(" \n View Holder 2:");
                ((StringBuilder)object).append(f8);
                ((StringBuilder)object).append(this.V());
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(" \n View Holder 2:");
            ((StringBuilder)object).append(f8);
            ((StringBuilder)object).append(this.V());
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" cannot be found but it is necessary for ");
        ((StringBuilder)object2).append(f8);
        ((StringBuilder)object2).append(this.V());
        Log.e((String)"RecyclerView", (String)((StringBuilder)object2).toString());
    }

    private boolean w0() {
        int n8 = this.f.g();
        for (int i8 = 0; i8 < n8; ++i8) {
            F f8 = RecyclerView.n0(this.f.f(i8));
            if (f8 == null || f8.K() || !f8.z()) continue;
            return true;
        }
        return false;
    }

    private void x1(h<?> object, boolean bl, boolean bl2) {
        h h8 = this.m;
        if (h8 != null) {
            h8.M(this.b);
            this.m.E(this);
        }
        if (!bl || bl2) {
            this.i1();
        }
        this.e.y();
        h8 = this.m;
        this.m = object;
        if (object != null) {
            ((h)object).J(this.b);
            ((h)object).A(this);
        }
        if ((object = this.n) != null) {
            ((p)object).J0(h8, this.m);
        }
        this.c.y(h8, this.m, bl);
        this.j0.g = true;
    }

    private int y(int n8, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int n9) {
        if (n8 > 0 && edgeEffect != null && ax.h0.d.b(edgeEffect) != 0.0f) {
            float f8 = (float)(-n8) * 4.0f / (float)n9;
            if ((n9 = Math.round((float)(-n9) / 4.0f * ax.h0.d.d(edgeEffect, f8, 0.5f))) != n8) {
                edgeEffect.finish();
            }
            return n8 - n9;
        }
        int n10 = n8;
        if (n8 < 0) {
            n10 = n8;
            if (edgeEffect2 != null) {
                n10 = n8;
                if (ax.h0.d.b(edgeEffect2) != 0.0f) {
                    float f9 = n8;
                    float f10 = n9;
                    if ((n9 = Math.round(f10 / 4.0f * ax.h0.d.d(edgeEffect2, f9 = f9 * 4.0f / f10, 0.5f))) != n8) {
                        edgeEffect2.finish();
                    }
                    n10 = n8 - n9;
                }
            }
        }
        return n10;
    }

    @SuppressLint(value={"InlinedApi"})
    private void y0() {
        if (ax.c0.d0.A((View)this) == 0) {
            ax.c0.d0.u0((View)this, 8);
        }
    }

    private void z0() {
        this.f = new b(new b.b(this){
            final RecyclerView a;
            {
                this.a = recyclerView;
            }

            @Override
            public View a(int n8) {
                return this.a.getChildAt(n8);
            }

            @Override
            public void b(View object) {
                if ((object = RecyclerView.n0((View)object)) != null) {
                    ((F)object).C(this.a);
                }
            }

            @Override
            public int c() {
                return this.a.getChildCount();
            }

            @Override
            public void d() {
                int n8 = this.c();
                for (int i8 = 0; i8 < n8; ++i8) {
                    View view = this.a(i8);
                    this.a.F(view);
                    view.clearAnimation();
                }
                this.a.removeAllViews();
            }

            @Override
            public int e(View view) {
                return this.a.indexOfChild(view);
            }

            @Override
            public F f(View view) {
                return RecyclerView.n0(view);
            }

            @Override
            public void g(int n8) {
                Object object;
                block9: {
                    block8: {
                        block7: {
                            object = this.a(n8);
                            if (object == null) break block7;
                            if ((object = RecyclerView.n0((View)object)) != null) {
                                if (((F)object).y() && !((F)object).K()) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("called detach on an already detached child ");
                                    stringBuilder.append(object);
                                    stringBuilder.append(this.a.V());
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                if (E0) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("tmpDetach ");
                                    stringBuilder.append(object);
                                    Log.d((String)"RecyclerView", (String)stringBuilder.toString());
                                }
                                ((F)object).b(256);
                            }
                            break block8;
                        }
                        if (D0) break block9;
                    }
                    this.a.detachViewFromParent(n8);
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("No view at offset ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(this.a.V());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }

            @Override
            public void h(View object) {
                if ((object = RecyclerView.n0((View)object)) != null) {
                    ((F)object).D(this.a);
                }
            }

            @Override
            public void i(View view, int n8) {
                this.a.addView(view, n8);
                this.a.E(view);
            }

            @Override
            public void j(int n8) {
                View view = this.a.getChildAt(n8);
                if (view != null) {
                    this.a.F(view);
                    view.clearAnimation();
                }
                this.a.removeViewAt(n8);
            }

            @Override
            public void k(View object, int n8, ViewGroup.LayoutParams object2) {
                block7: {
                    block6: {
                        block5: {
                            F f8 = RecyclerView.n0((View)object);
                            if (f8 == null) break block5;
                            if (!f8.y() && !f8.K()) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Called attach on a child which is not detached: ");
                                ((StringBuilder)object).append(f8);
                                ((StringBuilder)object).append(this.a.V());
                                throw new IllegalArgumentException(((StringBuilder)object).toString());
                            }
                            if (E0) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("reAttach ");
                                stringBuilder.append(f8);
                                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
                            }
                            f8.f();
                            break block6;
                        }
                        if (D0) break block7;
                    }
                    this.a.attachViewToParent((View)object, n8, (ViewGroup.LayoutParams)object2);
                    return;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("No ViewHolder found for child: ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(", index: ");
                ((StringBuilder)object2).append(n8);
                ((StringBuilder)object2).append(this.a.V());
                throw new IllegalArgumentException(((StringBuilder)object2).toString());
            }
        });
    }

    private boolean z1(EdgeEffect edgeEffect, int n8, int n9) {
        if (n8 > 0) {
            return true;
        }
        float f8 = ax.h0.d.b(edgeEffect);
        float f9 = n9;
        return this.t0(-n8) < f8 * f9;
    }

    void A() {
        if (this.w && !this.F) {
            if (this.e.p()) {
                if (this.e.o(4) && !this.e.o(11)) {
                    ax.Y.u.a("RV PartialInvalidate");
                    this.G1();
                    this.S0();
                    this.e.w();
                    if (!this.y) {
                        if (this.w0()) {
                            this.H();
                        } else {
                            this.e.i();
                        }
                    }
                    this.J1(true);
                    this.T0();
                    ax.Y.u.b();
                    return;
                }
                if (this.e.p()) {
                    ax.Y.u.a("RV FullInvalidate");
                    this.H();
                    ax.Y.u.b();
                }
            }
            return;
        }
        ax.Y.u.a("RV FullInvalidate");
        this.H();
        ax.Y.u.b();
    }

    void A0(StateListDrawable object, Drawable drawable, StateListDrawable stateListDrawable, Drawable drawable2) {
        if (object != null && drawable != null && stateListDrawable != null && drawable2 != null) {
            Resources resources = this.getContext().getResources();
            new androidx.recyclerview.widget.g(this, (StateListDrawable)object, drawable, stateListDrawable, drawable2, resources.getDimensionPixelSize(ax.h2.b.a), resources.getDimensionPixelSize(ax.h2.b.c), resources.getDimensionPixelOffset(ax.h2.b.b));
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Trying to set fast scroller without both required drawables.");
        ((StringBuilder)object).append(this.V());
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    boolean A1(AccessibilityEvent accessibilityEvent) {
        boolean bl = this.E0();
        int n8 = 0;
        if (bl) {
            int n9 = accessibilityEvent != null ? ax.d0.b.a(accessibilityEvent) : 0;
            if (n9 == 0) {
                n9 = n8;
            }
            this.B |= n9;
            return true;
        }
        return false;
    }

    void B0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void B1(int n8, int n9) {
        this.C1(n8, n9, null);
    }

    void C(int n8, int n9) {
        this.setMeasuredDimension(androidx.recyclerview.widget.RecyclerView$p.t(n8, this.getPaddingLeft() + this.getPaddingRight(), ax.c0.d0.D((View)this)), androidx.recyclerview.widget.RecyclerView$p.t(n9, this.getPaddingTop() + this.getPaddingBottom(), ax.c0.d0.C((View)this)));
    }

    public void C0() {
        if (this.q.size() == 0) {
            return;
        }
        p p8 = this.n;
        if (p8 != null) {
            p8.m("Cannot invalidate item decorations during a scroll or layout");
        }
        this.H0();
        this.requestLayout();
    }

    public void C1(int n8, int n9, Interpolator interpolator) {
        this.D1(n8, n9, interpolator, Integer.MIN_VALUE);
    }

    boolean D0() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void D1(int n8, int n9, Interpolator interpolator, int n10) {
        this.E1(n8, n9, interpolator, n10, false);
    }

    void E(View view) {
        F f8 = RecyclerView.n0(view);
        this.Q0(view);
        Object object = this.m;
        if (object != null && f8 != null) {
            ((h)object).G(f8);
        }
        if ((object = this.E) != null) {
            for (int i8 = object.size() - 1; i8 >= 0; --i8) {
                this.E.get(i8).d(view);
            }
        }
    }

    public boolean E0() {
        return this.H > 0;
    }

    void E1(int n8, int n9, Interpolator interpolator, int n10, boolean bl) {
        int n11;
        int n12;
        block11: {
            block10: {
                p p8 = this.n;
                if (p8 == null) {
                    Log.e((String)"RecyclerView", (String)"Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                }
                if (this.z) break block10;
                boolean bl2 = p8.q();
                n12 = 0;
                n11 = n8;
                if (!bl2) {
                    n11 = 0;
                }
                if (!this.n.r()) {
                    n9 = 0;
                }
                if (n11 != 0 || n9 != 0) break block11;
            }
            return;
        }
        if (n10 != Integer.MIN_VALUE && n10 <= 0) {
            this.scrollBy(n11, n9);
            return;
        }
        if (bl) {
            n8 = n12;
            if (n11 != 0) {
                n8 = 1;
            }
            n12 = n8;
            if (n9 != 0) {
                n12 = n8 | 2;
            }
            this.H1(n12, 1);
        }
        this.g0.e(n11, n9, n10, interpolator);
    }

    void F(View view) {
        F f8 = RecyclerView.n0(view);
        this.R0(view);
        Object object = this.m;
        if (object != null && f8 != null) {
            ((h)object).H(f8);
        }
        if ((object = this.E) != null) {
            for (int i8 = object.size() - 1; i8 >= 0; --i8) {
                this.E.get(i8).a(view);
            }
        }
    }

    public void F1(int n8) {
        if (this.z) {
            return;
        }
        p p8 = this.n;
        if (p8 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        p8.N1(this, this.j0, n8);
    }

    void G0(int n8) {
        if (this.n == null) {
            return;
        }
        this.setScrollState(2);
        this.n.C1(n8);
        this.awakenScrollBars();
    }

    void G1() {
        int n8;
        this.x = n8 = this.x + 1;
        if (n8 == 1 && !this.z) {
            this.y = false;
        }
    }

    void H() {
        if (this.m == null) {
            Log.w((String)"RecyclerView", (String)"No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e((String)"RecyclerView", (String)"No layout manager attached; skipping layout");
            return;
        }
        this.j0.j = false;
        boolean bl = this.z0 && (this.A0 != this.getWidth() || this.B0 != this.getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = false;
        if (this.j0.e == 1) {
            this.I();
            this.n.E1(this);
            this.J();
        } else if (!this.e.q() && !bl && this.n.t0() == this.getWidth() && this.n.c0() == this.getHeight()) {
            this.n.E1(this);
        } else {
            this.n.E1(this);
            this.J();
        }
        this.K();
    }

    void H0() {
        int n8 = this.f.j();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((q)this.f.i((int)i8).getLayoutParams()).c = true;
        }
        this.c.s();
    }

    public boolean H1(int n8, int n9) {
        return this.getScrollingChildHelper().p(n8, n9);
    }

    void I0() {
        int n8 = this.f.j();
        for (int i8 = 0; i8 < n8; ++i8) {
            F f8 = RecyclerView.n0(this.f.i(i8));
            if (f8 == null || f8.K()) continue;
            f8.b(6);
        }
        this.H0();
        this.c.t();
    }

    public void J0(int n8, int n9) {
        this.K0(n8, n9, null, 1);
    }

    void J1(boolean bl) {
        if (this.x < 1) {
            if (!D0) {
                this.x = 1;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.");
                stringBuilder.append(this.V());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        if (!bl && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (bl && this.y && !this.z && this.n != null && this.m != null) {
                this.H();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        --this.x;
    }

    public void K1(int n8) {
        this.getScrollingChildHelper().r(n8);
    }

    public boolean L(int n8, int n9, int[] nArray, int[] nArray2, int n10) {
        return this.getScrollingChildHelper().d(n8, n9, nArray, nArray2, n10);
    }

    public void L0(int n8) {
        int n9 = this.f.g();
        for (int i8 = 0; i8 < n9; ++i8) {
            this.f.f(i8).offsetLeftAndRight(n8);
        }
    }

    public void L1() {
        this.setScrollState(0);
        this.M1();
    }

    public final void M(int n8, int n9, int n10, int n11, int[] nArray, int n12, int[] nArray2) {
        this.getScrollingChildHelper().e(n8, n9, n10, n11, nArray, n12, nArray2);
    }

    public void M0(int n8) {
        int n9 = this.f.g();
        for (int i8 = 0; i8 < n9; ++i8) {
            this.f.f(i8).offsetTopAndBottom(n8);
        }
    }

    void N(int n8) {
        Object object = this.n;
        if (object != null) {
            ((p)object).j1(n8);
        }
        this.W0(n8);
        object = this.k0;
        if (object != null) {
            ((u)object).a(this, n8);
        }
        if ((object = this.l0) != null) {
            for (int i8 = object.size() - 1; i8 >= 0; --i8) {
                this.l0.get(i8).a(this, n8);
            }
        }
    }

    void N0(int n8, int n9) {
        int n10 = this.f.j();
        for (int i8 = 0; i8 < n10; ++i8) {
            F f8 = RecyclerView.n0(this.f.i(i8));
            if (f8 == null || f8.K() || f8.c < n8) continue;
            if (E0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offsetPositionRecordsForInsert attached child ");
                stringBuilder.append(i8);
                stringBuilder.append(" holder ");
                stringBuilder.append(f8);
                stringBuilder.append(" now at position ");
                stringBuilder.append(f8.c + n9);
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
            f8.B(n9, false);
            this.j0.g = true;
        }
        this.c.v(n8, n9);
        this.requestLayout();
    }

    void N1(int n8, int n9, Object object) {
        int n10 = this.f.j();
        for (int i8 = 0; i8 < n10; ++i8) {
            int n11;
            View view = this.f.i(i8);
            F f8 = RecyclerView.n0(view);
            if (f8 == null || f8.K() || (n11 = f8.c) < n8 || n11 >= n8 + n9) continue;
            f8.b(2);
            f8.a(object);
            ((q)view.getLayoutParams()).c = true;
        }
        this.c.R(n8, n9);
    }

    void O(int n8, int n9) {
        ++this.I;
        int n10 = this.getScrollX();
        int n11 = this.getScrollY();
        this.onScrollChanged(n10, n11, n10 - n8, n11 - n9);
        this.X0(n8, n9);
        Object object = this.k0;
        if (object != null) {
            ((u)object).b(this, n8, n9);
        }
        if ((object = this.l0) != null) {
            for (n10 = object.size() - 1; n10 >= 0; --n10) {
                this.l0.get(n10).b(this, n8, n9);
            }
        }
        --this.I;
    }

    void O0(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13 = this.f.j();
        if (n8 < n9) {
            n12 = -1;
            n11 = n8;
            n10 = n9;
        } else {
            n10 = n8;
            n11 = n9;
            n12 = 1;
        }
        for (int i8 = 0; i8 < n13; ++i8) {
            int n14;
            F f8 = RecyclerView.n0(this.f.i(i8));
            if (f8 == null || (n14 = f8.c) < n11 || n14 > n10) continue;
            if (E0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offsetPositionRecordsForMove attached child ");
                stringBuilder.append(i8);
                stringBuilder.append(" holder ");
                stringBuilder.append(f8);
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
            if (f8.c == n8) {
                f8.B(n9 - n8, false);
            } else {
                f8.B(n12, false);
            }
            this.j0.g = true;
        }
        this.c.w(n8, n9);
        this.requestLayout();
    }

    void P() {
        for (int i8 = this.x0.size() - 1; i8 >= 0; --i8) {
            int n8;
            F f8 = this.x0.get(i8);
            if (f8.a.getParent() != this || f8.K() || (n8 = f8.q) == -1) continue;
            ax.c0.d0.s0(f8.a, n8);
            f8.q = -1;
        }
        this.x0.clear();
    }

    void P0(int n8, int n9, boolean bl) {
        int n10 = this.f.j();
        for (int i8 = 0; i8 < n10; ++i8) {
            StringBuilder stringBuilder;
            F f8 = RecyclerView.n0(this.f.i(i8));
            if (f8 == null || f8.K()) continue;
            int n11 = f8.c;
            if (n11 >= n8 + n9) {
                if (E0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("offsetPositionRecordsForRemove attached child ");
                    stringBuilder.append(i8);
                    stringBuilder.append(" holder ");
                    stringBuilder.append(f8);
                    stringBuilder.append(" now at position ");
                    stringBuilder.append(f8.c - n9);
                    Log.d((String)"RecyclerView", (String)stringBuilder.toString());
                }
                f8.B(-n9, bl);
                this.j0.g = true;
                continue;
            }
            if (n11 < n8) continue;
            if (E0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("offsetPositionRecordsForRemove attached child ");
                stringBuilder.append(i8);
                stringBuilder.append(" holder ");
                stringBuilder.append(f8);
                stringBuilder.append(" now REMOVED");
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
            f8.i(n8 - 1, -n9, bl);
            this.j0.g = true;
        }
        this.c.x(n8, n9, bl);
        this.requestLayout();
    }

    public void Q0(View view) {
    }

    void R() {
        EdgeEffect edgeEffect;
        if (this.N != null) {
            return;
        }
        this.N = edgeEffect = this.J.a(this, 3);
        if (this.h) {
            edgeEffect.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void R0(View view) {
    }

    void S() {
        EdgeEffect edgeEffect;
        if (this.K != null) {
            return;
        }
        this.K = edgeEffect = this.J.a(this, 0);
        if (this.h) {
            edgeEffect.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    void S0() {
        ++this.H;
    }

    void T() {
        EdgeEffect edgeEffect;
        if (this.M != null) {
            return;
        }
        this.M = edgeEffect = this.J.a(this, 2);
        if (this.h) {
            edgeEffect.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    void T0() {
        this.U0(true);
    }

    void U() {
        EdgeEffect edgeEffect;
        if (this.L != null) {
            return;
        }
        this.L = edgeEffect = this.J.a(this, 1);
        if (this.h) {
            edgeEffect.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    void U0(boolean bl) {
        int n8;
        this.H = n8 = this.H - 1;
        if (n8 < 1) {
            if (D0 && n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("layout or scroll counter cannot go below zero.Some calls are not matching");
                stringBuilder.append(this.V());
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.H = 0;
            if (bl) {
                this.G();
                this.P();
            }
        }
    }

    String V() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.m);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.n);
        stringBuilder.append(", context:");
        stringBuilder.append(this.getContext());
        return stringBuilder.toString();
    }

    final void W(B b8) {
        if (this.getScrollState() == 2) {
            OverScroller overScroller = this.g0.d0;
            b8.p = overScroller.getFinalX() - overScroller.getCurrX();
            b8.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b8.p = 0;
        b8.q = 0;
    }

    public void W0(int n8) {
    }

    public View X(float f8, float f9) {
        for (int i8 = this.f.g() - 1; i8 >= 0; --i8) {
            View view = this.f.f(i8);
            float f10 = view.getTranslationX();
            float f11 = view.getTranslationY();
            if (!(f8 >= (float)view.getLeft() + f10) || !(f8 <= (float)view.getRight() + f10) || !(f9 >= (float)view.getTop() + f11) || !(f9 <= (float)view.getBottom() + f11)) continue;
            return view;
        }
        return null;
    }

    public void X0(int n8, int n9) {
    }

    public View Y(View view) {
        ViewParent viewParent = view.getParent();
        View view2 = view;
        view = viewParent;
        while (view != null && view != this && view instanceof View) {
            view2 = view;
            view = view2.getParent();
        }
        if (view == this) {
            return view2;
        }
        return null;
    }

    void Y0() {
        if (!this.p0 && this.t) {
            ax.c0.d0.d0((View)this, this.y0);
            this.p0 = true;
        }
    }

    public F Z(View view) {
        if ((view = this.Y(view)) == null) {
            return null;
        }
        return this.m0(view);
    }

    void a(int n8, int n9) {
        if (n8 < 0) {
            this.S();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-n8);
            }
        } else if (n8 > 0) {
            this.T();
            if (this.M.isFinished()) {
                this.M.onAbsorb(n8);
            }
        }
        if (n9 < 0) {
            this.U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-n9);
            }
        } else if (n9 > 0) {
            this.R();
            if (this.N.isFinished()) {
                this.N.onAbsorb(n9);
            }
        }
        if (n8 == 0 && n9 == 0) {
            return;
        }
        ax.c0.d0.c0((View)this);
    }

    public void addFocusables(ArrayList<View> arrayList, int n8, int n9) {
        p p8 = this.n;
        if (p8 != null && p8.K0(this, arrayList, n8, n9)) {
            return;
        }
        super.addFocusables(arrayList, n8, n9);
    }

    void b1(boolean bl) {
        this.G = bl | this.G;
        this.F = true;
        this.I0();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q && this.n.s((q)layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.q()) {
            return this.n.w(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.q()) {
            return this.n.x(this.j0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.q()) {
            return this.n.y(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.r()) {
            return this.n.z(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.r()) {
            return this.n.A(this.j0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        p p8 = this.n;
        if (p8 == null) {
            return 0;
        }
        if (p8.r()) {
            return this.n.B(this.j0);
        }
        return 0;
    }

    void d1(F f8, m.c c8) {
        f8.G(0, 8192);
        if (this.j0.i && f8.z() && !f8.w() && !f8.K()) {
            long l8 = this.j0(f8);
            this.g.c(l8, f8);
        }
        this.g.e(f8, c8);
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean bl) {
        return this.getScrollingChildHelper().a(f8, f9, bl);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.getScrollingChildHelper().b(f8, f9);
    }

    public boolean dispatchNestedPreScroll(int n8, int n9, int[] nArray, int[] nArray2) {
        return this.getScrollingChildHelper().c(n8, n9, nArray, nArray2);
    }

    public boolean dispatchNestedScroll(int n8, int n9, int n10, int n11, int[] nArray) {
        return this.getScrollingChildHelper().f(n8, n9, n10, n11, nArray);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        int n8;
        int n9;
        super.draw(canvas);
        int n10 = this.q.size();
        int n11 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            this.q.get(n9).k(canvas, this, this.j0);
        }
        EdgeEffect edgeEffect = this.K;
        int n12 = 1;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            n8 = canvas.save();
            n9 = this.h ? this.getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + n9), 0.0f);
            edgeEffect = this.K;
            n10 = edgeEffect != null && edgeEffect.draw(canvas) ? 1 : 0;
            canvas.restoreToCount(n8);
        } else {
            n10 = 0;
        }
        edgeEffect = this.L;
        n9 = n10;
        if (edgeEffect != null) {
            n9 = n10;
            if (!edgeEffect.isFinished()) {
                n8 = canvas.save();
                if (this.h) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                n9 = (edgeEffect = this.L) != null && edgeEffect.draw(canvas) ? 1 : 0;
                n9 = n10 | n9;
                canvas.restoreToCount(n8);
            }
        }
        edgeEffect = this.M;
        n10 = n9;
        if (edgeEffect != null) {
            n10 = n9;
            if (!edgeEffect.isFinished()) {
                n8 = canvas.save();
                int n13 = this.getWidth();
                n10 = this.h ? this.getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate((float)n10, (float)(-n13));
                edgeEffect = this.M;
                n10 = edgeEffect != null && edgeEffect.draw(canvas) ? 1 : 0;
                n10 = n9 | n10;
                canvas.restoreToCount(n8);
            }
        }
        edgeEffect = this.N;
        n9 = n10;
        if (edgeEffect != null) {
            n9 = n10;
            if (!edgeEffect.isFinished()) {
                n8 = canvas.save();
                canvas.rotate(180.0f);
                if (this.h) {
                    canvas.translate((float)(-this.getWidth() + this.getPaddingRight()), (float)(-this.getHeight() + this.getPaddingBottom()));
                } else {
                    canvas.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
                }
                edgeEffect = this.N;
                n9 = n11;
                if (edgeEffect != null) {
                    n9 = n11;
                    if (edgeEffect.draw(canvas)) {
                        n9 = 1;
                    }
                }
                n9 = n10 | n9;
                canvas.restoreToCount(n8);
            }
        }
        if (n9 == 0 && this.O != null && this.q.size() > 0 && this.O.p()) {
            n9 = n12;
        }
        if (n9 != 0) {
            ax.c0.d0.c0((View)this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l8) {
        return super.drawChild(canvas, view, l8);
    }

    public F e0(int n8) {
        boolean bl = this.F;
        F f8 = null;
        if (bl) {
            return null;
        }
        int n9 = this.f.j();
        for (int i8 = 0; i8 < n9; ++i8) {
            F f9 = RecyclerView.n0(this.f.i(i8));
            F f10 = f8;
            if (f9 != null) {
                f10 = f8;
                if (!f9.w()) {
                    f10 = f8;
                    if (this.i0(f9) == n8) {
                        if (this.f.n(f9.a)) {
                            f10 = f9;
                        } else {
                            return f9;
                        }
                    }
                }
            }
            f8 = f10;
        }
        return f8;
    }

    public F f0(long l8) {
        h h8 = this.m;
        F f8 = null;
        F f9 = null;
        F f10 = f8;
        if (h8 != null) {
            if (!h8.q()) {
                f10 = f8;
            } else {
                int n8 = this.f.j();
                int n9 = 0;
                while (true) {
                    f10 = f9;
                    if (n9 >= n8) break;
                    f8 = RecyclerView.n0(this.f.i(n9));
                    f10 = f9;
                    if (f8 != null) {
                        f10 = f9;
                        if (!f8.w()) {
                            f10 = f9;
                            if (f8.l() == l8) {
                                if (this.f.n(f8.a)) {
                                    f10 = f8;
                                } else {
                                    return f8;
                                }
                            }
                        }
                    }
                    ++n9;
                    f9 = f10;
                }
            }
        }
        return f10;
    }

    public View focusSearch(View view, int n8) {
        Object object = this.n.V0(view, n8);
        if (object != null) {
            return object;
        }
        object = this.m;
        int n9 = 1;
        int n10 = object != null && this.n != null && !this.E0() && !this.z ? 1 : 0;
        object = FocusFinder.getInstance();
        if (n10 != 0 && (n8 == 2 || n8 == 1)) {
            int n11;
            int n12;
            if (this.n.r()) {
                n12 = n8 == 2 ? 130 : 33;
                n11 = object.findNextFocus((ViewGroup)this, view, n12) == null ? 1 : 0;
                n10 = n11;
                if (L0) {
                    n8 = n12;
                    n10 = n11;
                }
            } else {
                n10 = 0;
            }
            n11 = n10;
            n12 = n8;
            if (n10 == 0) {
                n11 = n10;
                n12 = n8;
                if (this.n.q()) {
                    n10 = this.n.e0() == 1 ? 1 : 0;
                    n12 = n8 == 2 ? 1 : 0;
                    n10 = (n10 ^ n12) != 0 ? 66 : 17;
                    n12 = object.findNextFocus((ViewGroup)this, view, n10) == null ? n9 : 0;
                    if (L0) {
                        n8 = n10;
                    }
                    n11 = n12;
                    n12 = n8;
                }
            }
            if (n11 != 0) {
                this.A();
                if (this.Y(view) == null) {
                    return null;
                }
                this.G1();
                this.n.O0(view, n12, this.c, this.j0);
                this.J1(false);
            }
            object = object.findNextFocus((ViewGroup)this, view, n12);
            n8 = n12;
        } else if ((object = object.findNextFocus((ViewGroup)this, view, n8)) == null && n10 != 0) {
            this.A();
            if (this.Y(view) == null) {
                return null;
            }
            this.G1();
            object = this.n.O0(view, n8, this.c, this.j0);
            this.J1(false);
        }
        if (object != null && !object.hasFocusable()) {
            if (this.getFocusedChild() == null) {
                return super.focusSearch(view, n8);
            }
            this.p1((View)object, null);
            return view;
        }
        if (this.F0(view, (View)object, n8)) {
            return object;
        }
        return super.focusSearch(view, n8);
    }

    /*
     * Unable to fully structure code
     */
    F g0(int var1_1, boolean var2_2) {
        var4_3 = this.f.j();
        var6_4 = null;
        for (var3_5 = 0; var3_5 < var4_3; ++var3_5) {
            block5: {
                block6: {
                    var7_7 = RecyclerView.n0(this.f.i(var3_5));
                    var5_6 = var6_4;
                    if (var7_7 == null) break block5;
                    var5_6 = var6_4;
                    if (var7_7.w()) break block5;
                    if (!var2_2) break block6;
                    if (var7_7.c == var1_1) ** GOTO lbl-1000
                    var5_6 = var6_4;
                    break block5;
                }
                if (var7_7.n() != var1_1) {
                    var5_6 = var6_4;
                } else if (this.f.n(var7_7.a)) {
                    var5_6 = var7_7;
                } else {
                    return var7_7;
                }
            }
            var6_4 = var5_6;
        }
        return var6_4;
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object object = this.n;
        if (object != null) {
            return ((p)object).J();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("RecyclerView has no LayoutManager");
        ((StringBuilder)object).append(this.V());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet object) {
        p p8 = this.n;
        if (p8 != null) {
            return p8.K(this.getContext(), (AttributeSet)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("RecyclerView has no LayoutManager");
        ((StringBuilder)object).append(this.V());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        p p8 = this.n;
        if (p8 != null) {
            return p8.L((ViewGroup.LayoutParams)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("RecyclerView has no LayoutManager");
        ((StringBuilder)object).append(this.V());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.m;
    }

    public int getBaseline() {
        p p8 = this.n;
        if (p8 != null) {
            return p8.M();
        }
        return super.getBaseline();
    }

    protected int getChildDrawingOrder(int n8, int n9) {
        k k8 = this.r0;
        if (k8 == null) {
            return super.getChildDrawingOrder(n8, n9);
        }
        return k8.a(n8, n9);
    }

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

    /*
     * Enabled aggressive block sorting
     */
    public boolean h0(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        boolean bl;
        int n14;
        Object object;
        block36: {
            block35: {
                block34: {
                    block30: {
                        block32: {
                            block33: {
                                block31: {
                                    block29: {
                                        block25: {
                                            block27: {
                                                block28: {
                                                    block26: {
                                                        block24: {
                                                            block23: {
                                                                block22: {
                                                                    block21: {
                                                                        object = this.n;
                                                                        if (object == null) {
                                                                            Log.e((String)"RecyclerView", (String)"Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                                                            return false;
                                                                        }
                                                                        if (this.z) {
                                                                            return false;
                                                                        }
                                                                        n14 = ((p)object).q();
                                                                        bl = this.n.r();
                                                                        if (n14 == 0) break block21;
                                                                        n13 = n8;
                                                                        if (Math.abs(n8) >= this.b0) break block22;
                                                                    }
                                                                    n13 = 0;
                                                                }
                                                                if (!bl) break block23;
                                                                n8 = n9;
                                                                if (Math.abs(n9) >= this.b0) break block24;
                                                            }
                                                            n8 = 0;
                                                        }
                                                        if (n13 == 0 && n8 == 0) {
                                                            return false;
                                                        }
                                                        if (n13 == 0) break block25;
                                                        object = this.K;
                                                        if (object == null || ax.h0.d.b((EdgeEffect)object) == 0.0f) break block26;
                                                        object = this.K;
                                                        n12 = -n13;
                                                        n9 = n13;
                                                        if (!this.z1((EdgeEffect)object, n12, this.getWidth())) break block27;
                                                        this.K.onAbsorb(n12);
                                                        break block28;
                                                    }
                                                    object = this.M;
                                                    if (object == null || ax.h0.d.b((EdgeEffect)object) == 0.0f) break block25;
                                                    n9 = n13;
                                                    if (!this.z1(this.M, n13, this.getWidth())) break block27;
                                                    this.M.onAbsorb(n13);
                                                }
                                                n9 = 0;
                                            }
                                            n12 = 0;
                                            break block29;
                                        }
                                        n9 = 0;
                                        n12 = n13;
                                    }
                                    if (n8 == 0) break block30;
                                    object = this.L;
                                    if (object == null || ax.h0.d.b((EdgeEffect)object) == 0.0f) break block31;
                                    object = this.L;
                                    n11 = -n8;
                                    n13 = n8;
                                    if (!this.z1((EdgeEffect)object, n11, this.getHeight())) break block32;
                                    this.L.onAbsorb(n11);
                                    break block33;
                                }
                                object = this.N;
                                if (object == null || ax.h0.d.b((EdgeEffect)object) == 0.0f) break block30;
                                n13 = n8;
                                if (!this.z1(this.N, n8, this.getHeight())) break block32;
                                this.N.onAbsorb(n8);
                            }
                            n13 = 0;
                        }
                        n11 = 0;
                        n8 = n13;
                        break block34;
                    }
                    n11 = n8;
                    n8 = 0;
                }
                if (n9 != 0) break block35;
                n10 = n9;
                n13 = n8;
                if (n8 == 0) break block36;
            }
            n13 = this.c0;
            n10 = Math.max(-n13, Math.min(n9, n13));
            n9 = this.c0;
            n13 = Math.max(-n9, Math.min(n8, n9));
            this.g0.b(n10, n13);
        }
        if (n12 == 0 && n11 == 0) {
            if (n10 != 0) return true;
            if (n13 == 0) return false;
            return true;
        }
        float f8 = n12;
        float f9 = n11;
        if (this.dispatchNestedPreFling(f8, f9)) return false;
        boolean bl2 = n14 != 0 || bl;
        this.dispatchNestedFling(f8, f9, bl2);
        object = this.a0;
        if (object != null && ((s)object).a(n12, n11)) {
            return true;
        }
        if (!bl2) return false;
        n8 = n14;
        if (bl) {
            n8 = n14 | 2;
        }
        this.H1(n8, 1);
        n8 = this.c0;
        n8 = Math.max(-n8, Math.min(n12, n8));
        n9 = this.c0;
        n9 = Math.max(-n9, Math.min(n11, n9));
        this.g0.b(n8, n9);
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().j();
    }

    int i0(F f8) {
        if (!f8.q(524) && f8.t()) {
            return this.e.e(f8.c);
        }
        return -1;
    }

    void i1() {
        Object object = this.O;
        if (object != null) {
            ((m)object).k();
        }
        if ((object = this.n) != null) {
            ((p)object).p1(this.c);
            this.n.q1(this.c);
        }
        this.c.c();
    }

    public boolean isAttachedToWindow() {
        return this.t;
    }

    public final boolean isLayoutSuppressed() {
        return this.z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().l();
    }

    public void j(o o8) {
        this.k(o8, -1);
    }

    long j0(F f8) {
        if (this.m.q()) {
            return f8.l();
        }
        return f8.c;
    }

    boolean j1(View view) {
        this.G1();
        boolean bl = this.f.r(view);
        if (bl) {
            Object object = RecyclerView.n0(view);
            this.c.O((F)object);
            this.c.H((F)object);
            if (E0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("after removing animated view: ");
                ((StringBuilder)object).append(view);
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(this);
                Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
            }
        }
        this.J1(bl ^ true);
        return bl;
    }

    public void k(o o8, int n8) {
        p p8 = this.n;
        if (p8 != null) {
            p8.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if (n8 < 0) {
            this.q.add(o8);
        } else {
            this.q.add(n8, o8);
        }
        this.H0();
        this.requestLayout();
    }

    public int k0(View object) {
        if ((object = RecyclerView.n0((View)object)) != null) {
            return ((F)object).j();
        }
        return -1;
    }

    public void k1(o o8) {
        p p8 = this.n;
        if (p8 != null) {
            p8.m("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(o8);
        if (this.q.isEmpty()) {
            boolean bl = this.getOverScrollMode() == 2;
            this.setWillNotDraw(bl);
        }
        this.H0();
        this.requestLayout();
    }

    public void l(r r8) {
        if (this.E == null) {
            this.E = new ArrayList<r>();
        }
        this.E.add(r8);
    }

    public int l0(View object) {
        if ((object = RecyclerView.n0((View)object)) != null) {
            return ((F)object).n();
        }
        return -1;
    }

    public void l1(r r8) {
        List<r> list = this.E;
        if (list == null) {
            return;
        }
        list.remove(r8);
    }

    public void m(t t8) {
        this.r.add(t8);
    }

    public F m0(View view) {
        Object object = view.getParent();
        if (object != null && object != this) {
            object = new StringBuilder();
            ((StringBuilder)object).append("View ");
            ((StringBuilder)object).append(view);
            ((StringBuilder)object).append(" is not a direct child of ");
            ((StringBuilder)object).append(this);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return RecyclerView.n0(view);
    }

    public void m1(t t8) {
        this.r.remove(t8);
        if (this.s == t8) {
            this.s = null;
        }
    }

    public void n(u u8) {
        if (this.l0 == null) {
            this.l0 = new ArrayList<u>();
        }
        this.l0.add(u8);
    }

    public void n1(u u8) {
        List<u> list = this.l0;
        if (list != null) {
            list.remove(u8);
        }
    }

    void o(F f8, m.c c8, m.c c9) {
        f8.H(false);
        if (this.O.a(f8, c8, c9)) {
            this.Y0();
        }
    }

    public void o0(View view, Rect rect) {
        RecyclerView.p0(view, rect);
    }

    void o1() {
        int n8 = this.f.g();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.f.f(i8);
            F f8 = this.m0(view);
            if (f8 == null || (f8 = f8.i) == null) continue;
            f8 = f8.a;
            int n9 = view.getLeft();
            int n10 = view.getTop();
            if (n9 == f8.getLeft() && n10 == f8.getTop()) continue;
            f8.layout(n9, n10, f8.getWidth() + n9, f8.getHeight() + n10);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = 0;
        boolean bl = true;
        this.t = true;
        if (!this.w || this.isLayoutRequested()) {
            bl = false;
        }
        this.w = bl;
        this.c.z();
        Object object = this.n;
        if (object != null) {
            ((p)object).F(this);
        }
        this.p0 = false;
        if (K0) {
            androidx.recyclerview.widget.h h8;
            object = androidx.recyclerview.widget.h.f0;
            this.h0 = h8 = (androidx.recyclerview.widget.h)((ThreadLocal)object).get();
            if (h8 == null) {
                float f8;
                this.h0 = new androidx.recyclerview.widget.h();
                h8 = ax.c0.d0.u((View)this);
                if (this.isInEditMode() || h8 == null || !((f8 = h8.getRefreshRate()) >= 30.0f)) {
                    f8 = 60.0f;
                }
                h8 = this.h0;
                h8.d0 = (long)(1.0E9f / f8);
                ((ThreadLocal)object).set(h8);
            }
            this.h0.a(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.O;
        if (object != null) {
            ((m)object).k();
        }
        this.L1();
        this.t = false;
        object = this.n;
        if (object != null) {
            ((p)object).G(this, this.c);
        }
        this.x0.clear();
        this.removeCallbacks(this.y0);
        this.g.j();
        this.c.A();
        ax.j0.a.b(this);
        if (K0 && (object = this.h0) != null) {
            ((androidx.recyclerview.widget.h)object).j(this);
            this.h0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n8 = this.q.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.q.get(i8).i(canvas, this, this.j0);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean onGenericMotionEvent(MotionEvent var1_1) {
        block7: {
            block6: {
                block10: {
                    block8: {
                        block9: {
                            if (this.n == null) {
                                return false;
                            }
                            if (this.z) {
                                return false;
                            }
                            if (var1_1.getAction() != 8) break block7;
                            if ((var1_1.getSource() & 2) == 0) break block8;
                            var2_2 = this.n.r() != false ? -var1_1.getAxisValue(9) : 0.0f;
                            var3_3 = var2_2;
                            if (!this.n.q()) break block9;
                            var3_3 = var1_1.getAxisValue(10);
                            break block6;
                        }
lbl13:
                        // 3 sources

                        while (true) {
                            var4_4 = 0.0f;
                            var2_2 = var3_3;
                            var3_3 = var4_4;
                            break block6;
                            break;
                        }
                    }
                    if ((var1_1.getSource() & 0x400000) == 0) ** GOTO lbl-1000
                    var3_3 = var1_1.getAxisValue(26);
                    if (!this.n.r()) break block10;
                    var3_3 = -var3_3;
                    ** GOTO lbl13
                }
                if (this.n.q()) {
                    var2_2 = 0.0f;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0.0f;
                    ** continue;
                }
            }
            if (var2_2 != 0.0f || var3_3 != 0.0f) {
                this.K0((int)(var3_3 * this.d0), (int)(var2_2 * this.e0), var1_1, 1);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent object) {
        if (this.z) {
            return false;
        }
        this.s = null;
        if (this.a0((MotionEvent)object)) {
            this.t();
            return true;
        }
        p p8 = this.n;
        if (p8 == null) {
            return false;
        }
        int n8 = p8.q();
        boolean bl = this.n.r();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(object);
        int n9 = object.getActionMasked();
        int n10 = object.getActionIndex();
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 5) {
                            if (n9 == 6) {
                                this.V0((MotionEvent)object);
                            }
                        } else {
                            this.Q = object.getPointerId(n10);
                            this.U = n8 = (int)(object.getX(n10) + 0.5f);
                            this.S = n8;
                            this.V = n10 = (int)(object.getY(n10) + 0.5f);
                            this.T = n10;
                        }
                    } else {
                        this.t();
                    }
                } else {
                    n9 = object.findPointerIndex(this.Q);
                    if (n9 < 0) {
                        object = new StringBuilder();
                        object.append("Error processing scroll; pointer index for id ");
                        object.append(this.Q);
                        object.append(" not found. Did any MotionEvents get skipped?");
                        Log.e((String)"RecyclerView", (String)object.toString());
                        return false;
                    }
                    n10 = (int)(object.getX(n9) + 0.5f);
                    int n11 = (int)(object.getY(n9) + 0.5f);
                    if (this.P != 1) {
                        int n12 = this.S;
                        n9 = this.T;
                        if (n8 != 0 && Math.abs(n10 - n12) > this.W) {
                            this.U = n10;
                            n10 = 1;
                        } else {
                            n10 = 0;
                        }
                        n8 = n10;
                        if (bl) {
                            n8 = n10;
                            if (Math.abs(n11 - n9) > this.W) {
                                this.V = n11;
                                n8 = 1;
                            }
                        }
                        if (n8 != 0) {
                            this.setScrollState(1);
                        }
                    }
                }
            } else {
                this.R.clear();
                this.K1(0);
            }
        } else {
            if (this.A) {
                this.A = false;
            }
            this.Q = object.getPointerId(0);
            this.U = n10 = (int)(object.getX() + 0.5f);
            this.S = n10;
            this.V = n10 = (int)(object.getY() + 0.5f);
            this.T = n10;
            if (this.I1((MotionEvent)object) || this.P == 2) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.setScrollState(1);
                this.K1(1);
            }
            object = this.v0;
            object[1] = (MotionEvent)false;
            object[0] = (MotionEvent)false;
            n10 = n8;
            if (bl) {
                n10 = n8 | 2;
            }
            this.H1(n10, 0);
        }
        return this.P == 1;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        ax.Y.u.a("RV OnLayout");
        this.H();
        ax.Y.u.b();
        this.w = true;
    }

    protected void onMeasure(int n8, int n9) {
        Object object = this.n;
        if (object == null) {
            this.C(n8, n9);
            return;
        }
        boolean bl = ((p)object).x0();
        boolean bl2 = false;
        if (bl) {
            int n10 = View.MeasureSpec.getMode((int)n8);
            int n11 = View.MeasureSpec.getMode((int)n9);
            this.n.e1(this.c, this.j0, n8, n9);
            bl = bl2;
            if (n10 == 0x40000000) {
                bl = bl2;
                if (n11 == 0x40000000) {
                    bl = true;
                }
            }
            this.z0 = bl;
            if (!bl && this.m != null) {
                if (this.j0.e == 1) {
                    this.I();
                }
                this.n.F1(n8, n9);
                this.j0.j = true;
                this.J();
                this.n.I1(n8, n9);
                if (this.n.L1()) {
                    this.n.F1(View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000));
                    this.j0.j = true;
                    this.J();
                    this.n.I1(n8, n9);
                }
                this.A0 = this.getMeasuredWidth();
                this.B0 = this.getMeasuredHeight();
            }
            return;
        }
        if (this.u) {
            this.n.e1(this.c, this.j0, n8, n9);
            return;
        }
        if (this.C) {
            this.G1();
            this.S0();
            this.a1();
            this.T0();
            object = this.j0;
            if (((B)object).l) {
                ((B)object).h = true;
            } else {
                this.e.j();
                this.j0.h = false;
            }
            this.C = false;
            this.J1(false);
        } else if (this.j0.l) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        object = this.m;
        this.j0.f = object != null ? ((h)object).l() : 0;
        this.G1();
        this.n.e1(this.c, this.j0, n8, n9);
        this.J1(false);
        this.j0.h = false;
    }

    protected boolean onRequestFocusInDescendants(int n8, Rect rect) {
        if (this.E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(n8, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (z)parcelable;
        this.d = parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.requestLayout();
    }

    protected Parcelable onSaveInstanceState() {
        z z8 = new z(super.onSaveInstanceState());
        Object object = this.d;
        if (object != null) {
            z8.b((z)object);
            return z8;
        }
        object = this.n;
        if (object != null) {
            z8.d0 = ((p)object).i1();
            return z8;
        }
        z8.d0 = null;
        return z8;
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        if (n8 == n10 && n9 == n11) {
            return;
        }
        this.B0();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block21: {
            block27: {
                block25: {
                    block22: {
                        block23: {
                            block26: {
                                block24: {
                                    if (this.z || this.A) break block21;
                                    if (this.Q((MotionEvent)var1_1)) {
                                        this.t();
                                        return true;
                                    }
                                    var14_2 = this.n;
                                    if (var14_2 == null) {
                                        return false;
                                    }
                                    var10_3 = var14_2.q();
                                    var13_4 = this.n.r();
                                    if (this.R == null) {
                                        this.R = VelocityTracker.obtain();
                                    }
                                    var5_5 = var1_1.getActionMasked();
                                    var4_6 = var1_1.getActionIndex();
                                    if (var5_5 == 0) {
                                        var14_2 = this.v0;
                                        var14_2[1] = false;
                                        var14_2[0] = false;
                                    }
                                    var14_2 = MotionEvent.obtain((MotionEvent)var1_1);
                                    var15_7 = this.v0;
                                    var14_2.offsetLocation((float)var15_7[0], (float)var15_7[1]);
                                    if (var5_5 == 0) break block22;
                                    if (var5_5 == 1) break block23;
                                    if (var5_5 == 2) break block24;
                                    if (var5_5 != 3) {
                                        if (var5_5 != 5) {
                                            if (var5_5 == 6) {
                                                this.V0((MotionEvent)var1_1);
                                            }
                                        } else {
                                            this.Q = var1_1.getPointerId(var4_6);
                                            this.U = var5_5 = (int)(var1_1.getX(var4_6) + 0.5f);
                                            this.S = var5_5;
                                            this.V = var4_6 = (int)(var1_1.getY(var4_6) + 0.5f);
                                            this.T = var4_6;
                                        }
                                    } else {
                                        this.t();
                                    }
                                    break block25;
                                }
                                var4_6 = var1_1.findPointerIndex(this.Q);
                                if (var4_6 < 0) {
                                    var1_1 = new StringBuilder();
                                    var1_1.append("Error processing scroll; pointer index for id ");
                                    var1_1.append(this.Q);
                                    var1_1.append(" not found. Did any MotionEvents get skipped?");
                                    Log.e((String)"RecyclerView", (String)var1_1.toString());
                                    return false;
                                }
                                var11_8 = (int)(var1_1.getX(var4_6) + 0.5f);
                                var12_9 = (int)(var1_1.getY(var4_6) + 0.5f);
                                var4_6 = this.U - var11_8;
                                var7_10 = this.V - var12_9;
                                var9_11 = var4_6;
                                var5_5 = var7_10;
                                if (this.P == 1) break block26;
                                var6_12 = var4_6;
                                if (var10_3 == 0) ** GOTO lbl-1000
                                var4_6 = var4_6 > 0 ? Math.max(0, var4_6 - this.W) : Math.min(0, var4_6 + this.W);
                                var6_12 = var4_6;
                                if (var4_6 != 0) {
                                    var5_5 = 1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var5_5 = 0;
                                    var4_6 = var6_12;
                                }
                                var6_12 = var7_10;
                                var8_13 = var5_5;
                                if (var13_4) {
                                    var7_10 = var7_10 > 0 ? Math.max(0, var7_10 - this.W) : Math.min(0, var7_10 + this.W);
                                    var6_12 = var7_10;
                                    var8_13 = var5_5;
                                    if (var7_10 != 0) {
                                        var8_13 = 1;
                                        var6_12 = var7_10;
                                    }
                                }
                                var9_11 = var4_6;
                                var5_5 = var6_12;
                                if (var8_13 != 0) {
                                    this.setScrollState(1);
                                    var5_5 = var6_12;
                                    var9_11 = var4_6;
                                }
                            }
                            if (this.P == 1) {
                                var15_7 = this.w0;
                                var15_7[0] = 0;
                                var15_7[1] = 0;
                                var7_10 = var9_11 - this.g1(var9_11, var1_1.getY());
                                var6_12 = var5_5 - this.h1(var5_5, var1_1.getX());
                                var8_13 = var10_3 != 0 ? var7_10 : 0;
                                var9_11 = var13_4 != false ? var6_12 : 0;
                                var5_5 = var7_10;
                                var4_6 = var6_12;
                                if (this.L(var8_13, var9_11, this.w0, this.u0, 0)) {
                                    var15_7 = this.w0;
                                    var5_5 = var7_10 - var15_7[0];
                                    var4_6 = var6_12 - var15_7[1];
                                    var16_14 = this.v0;
                                    var6_12 = var16_14[0];
                                    var15_7 = this.u0;
                                    var16_14[0] = var6_12 + var15_7[0];
                                    var16_14[1] = var16_14[1] + var15_7[1];
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                var15_7 = this.u0;
                                this.U = var11_8 - var15_7[0];
                                this.V = var12_9 - var15_7[1];
                                var6_12 = var10_3 != 0 ? var5_5 : 0;
                                if (this.u1(var6_12, var7_10 = var13_4 != false ? var4_6 : 0, (MotionEvent)var1_1, 0)) {
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                if ((var1_1 = this.h0) != null && (var5_5 != 0 || var4_6 != 0)) {
                                    var1_1.f(this, var5_5, var4_6);
                                }
                            }
                            break block25;
                        }
                        this.R.addMovement((MotionEvent)var14_2);
                        this.R.computeCurrentVelocity(1000, (float)this.c0);
                        var2_15 = var10_3 != 0 ? -this.R.getXVelocity(this.Q) : 0.0f;
                        var3_16 = var13_4 != false ? -this.R.getYVelocity(this.Q) : 0.0f;
                        if (var2_15 == 0.0f && var3_16 == 0.0f || !this.h0((int)var2_15, (int)var3_16)) {
                            this.setScrollState(0);
                        }
                        this.r1();
                        break block27;
                    }
                    this.Q = var1_1.getPointerId(0);
                    this.U = var4_6 = (int)(var1_1.getX() + 0.5f);
                    this.S = var4_6;
                    this.V = var4_6 = (int)(var1_1.getY() + 0.5f);
                    this.T = var4_6;
                    var4_6 = var10_3;
                    if (var13_4) {
                        var4_6 = var10_3 | 2;
                    }
                    this.H1(var4_6, 0);
                }
                this.R.addMovement((MotionEvent)var14_2);
            }
            var14_2.recycle();
            return true;
        }
        return false;
    }

    void q(F f8, m.c c8, m.c c9) {
        this.i(f8);
        f8.H(false);
        if (this.O.c(f8, c8, c9)) {
            this.Y0();
        }
    }

    void r(String charSequence) {
        if (this.E0()) {
            if (charSequence == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                ((StringBuilder)charSequence).append(this.V());
                throw new IllegalStateException(((StringBuilder)charSequence).toString());
            }
            throw new IllegalStateException((String)charSequence);
        }
        if (this.I > 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(this.V());
            Log.w((String)"RecyclerView", (String)"Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", (Throwable)new IllegalStateException(((StringBuilder)charSequence).toString()));
        }
    }

    protected void removeDetachedView(View object, boolean bl) {
        Object object2;
        block9: {
            block8: {
                block7: {
                    object2 = RecyclerView.n0((View)object);
                    if (object2 == null) break block7;
                    if (((F)object2).y()) {
                        ((F)object2).f();
                    } else if (!((F)object2).K()) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                        ((StringBuilder)object).append(object2);
                        ((StringBuilder)object).append(this.V());
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    break block8;
                }
                if (D0) break block9;
            }
            object.clearAnimation();
            this.F((View)object);
            super.removeDetachedView((View)object, bl);
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("No ViewHolder found for child: ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(this.V());
        throw new IllegalArgumentException(((StringBuilder)object2).toString());
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.n.g1(this, this.j0, view, view2) && view2 != null) {
            this.p1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl) {
        return this.n.w1(this, view, rect, bl);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        int n8 = this.r.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.r.get(i8).e(bl);
        }
        super.requestDisallowInterceptTouchEvent(bl);
    }

    public void requestLayout() {
        if (this.x == 0 && !this.z) {
            super.requestLayout();
            return;
        }
        this.y = true;
    }

    boolean s(F f8) {
        m m8 = this.O;
        return m8 == null || m8.g(f8, f8.p());
        {
        }
    }

    Rect s0(View view) {
        q q8 = (q)view.getLayoutParams();
        if (!q8.c) {
            return q8.b;
        }
        if (this.j0.e() && (q8.b() || q8.d())) {
            return q8.b;
        }
        Rect rect = q8.b;
        rect.set(0, 0, 0, 0);
        int n8 = this.q.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.j.set(0, 0, 0, 0);
            this.q.get(i8).g(this.j, view, this, this.j0);
            int n9 = rect.left;
            Rect rect2 = this.j;
            rect.left = n9 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        q8.c = false;
        return rect;
    }

    public void scrollBy(int n8, int n9) {
        boolean bl;
        boolean bl2;
        block7: {
            block6: {
                p p8 = this.n;
                if (p8 == null) {
                    Log.e((String)"RecyclerView", (String)"Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                }
                if (this.z) break block6;
                bl2 = p8.q();
                bl = this.n.r();
                if (bl2 || bl) break block7;
            }
            return;
        }
        if (!bl2) {
            n8 = 0;
        }
        if (!bl) {
            n9 = 0;
        }
        this.u1(n8, n9, null, 0);
    }

    public void scrollTo(int n8, int n9) {
        Log.w((String)"RecyclerView", (String)"RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.A1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.q q8) {
        this.q0 = q8;
        ax.c0.d0.l0((View)this, q8);
    }

    public void setAdapter(h h8) {
        this.setLayoutFrozen(false);
        this.x1(h8, false, true);
        this.b1(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(k k8) {
        if (k8 == this.r0) {
            return;
        }
        this.r0 = k8;
        boolean bl = k8 != null;
        this.setChildrenDrawingOrderEnabled(bl);
    }

    public void setClipToPadding(boolean bl) {
        if (bl != this.h) {
            this.B0();
        }
        this.h = bl;
        super.setClipToPadding(bl);
        if (this.w) {
            this.requestLayout();
        }
    }

    public void setEdgeEffectFactory(l l8) {
        ax.b0.g.g(l8);
        this.J = l8;
        this.B0();
    }

    public void setHasFixedSize(boolean bl) {
        this.u = bl;
    }

    public void setItemAnimator(m m8) {
        m m9 = this.O;
        if (m9 != null) {
            m9.k();
            this.O.w(null);
        }
        this.O = m8;
        if (m8 != null) {
            m8.w(this.o0);
        }
    }

    public void setItemViewCacheSize(int n8) {
        this.c.L(n8);
    }

    @Deprecated
    public void setLayoutFrozen(boolean bl) {
        this.suppressLayout(bl);
    }

    public void setLayoutManager(p p8) {
        Object object;
        if (p8 == this.n) {
            return;
        }
        this.L1();
        if (this.n != null) {
            object = this.O;
            if (object != null) {
                ((m)object).k();
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
        this.n = p8;
        if (p8 != null) {
            if (p8.b == null) {
                p8.J1(this);
                if (this.t) {
                    this.n.F(this);
                }
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("LayoutManager ");
                ((StringBuilder)object).append(p8);
                ((StringBuilder)object).append(" is already attached to a RecyclerView:");
                ((StringBuilder)object).append(p8.b.V());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
        this.c.P();
        this.requestLayout();
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean bl) {
        this.getScrollingChildHelper().m(bl);
    }

    public void setOnFlingListener(s s8) {
        this.a0 = s8;
    }

    @Deprecated
    public void setOnScrollListener(u u8) {
        this.k0 = u8;
    }

    public void setPreserveFocusAfterLayout(boolean bl) {
        this.f0 = bl;
    }

    public void setRecycledViewPool(v v8) {
        this.c.J(v8);
    }

    @Deprecated
    public void setRecyclerListener(x x8) {
        this.o = x8;
    }

    void setScrollState(int n8) {
        if (n8 == this.P) {
            return;
        }
        if (E0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setting scroll state to ");
            stringBuilder.append(n8);
            stringBuilder.append(" from ");
            stringBuilder.append(this.P);
            Log.d((String)"RecyclerView", (String)stringBuilder.toString(), (Throwable)new Exception());
        }
        this.P = n8;
        if (n8 != 2) {
            this.M1();
        }
        this.N(n8);
    }

    public void setScrollingTouchSlop(int n8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)this.getContext());
        if (n8 != 0) {
            if (n8 != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
                stringBuilder.append(n8);
                stringBuilder.append("; using default value");
                Log.w((String)"RecyclerView", (String)stringBuilder.toString());
            } else {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d8) {
        this.c.K(d8);
    }

    public boolean startNestedScroll(int n8) {
        return this.getScrollingChildHelper().o(n8);
    }

    public void stopNestedScroll() {
        this.getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean bl) {
        if (bl != this.z) {
            this.r("Do not suppressLayout in layout or scroll");
            if (!bl) {
                this.z = false;
                if (this.y && this.n != null && this.m != null) {
                    this.requestLayout();
                }
                this.y = false;
                return;
            }
            long l8 = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0));
            this.z = true;
            this.A = true;
            this.L1();
        }
    }

    void t1() {
        int n8 = this.f.j();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = RecyclerView.n0(this.f.i(i8));
            if (D0 && ((F)object).c == -1 && !((F)object).w()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("view holder cannot have position -1 unless it is removed");
                ((StringBuilder)object).append(this.V());
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            if (((F)object).K()) continue;
            ((F)object).F();
        }
    }

    boolean u1(int n8, int n9, MotionEvent motionEvent, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        int[] nArray;
        this.A();
        if (this.m != null) {
            nArray = this.w0;
            nArray[0] = 0;
            nArray[1] = 0;
            this.v1(n8, n9, nArray);
            nArray = this.w0;
            n14 = nArray[0];
            n13 = nArray[1];
            n12 = n8 - n14;
            n11 = n9 - n13;
        } else {
            n14 = 0;
            n13 = 0;
            n12 = 0;
            n11 = 0;
        }
        if (!this.q.isEmpty()) {
            this.invalidate();
        }
        nArray = this.w0;
        nArray[0] = 0;
        nArray[1] = 0;
        this.M(n14, n13, n12, n11, this.u0, n10, nArray);
        nArray = this.w0;
        int n15 = nArray[0];
        int n16 = nArray[1];
        n10 = n15 == 0 && n16 == 0 ? 0 : 1;
        int n17 = this.U;
        nArray = this.u0;
        int n18 = nArray[0];
        this.U = n17 - n18;
        int n19 = this.V;
        n17 = nArray[1];
        this.V = n19 - n17;
        nArray = this.v0;
        nArray[0] = nArray[0] + n18;
        nArray[1] = nArray[1] + n17;
        if (this.getOverScrollMode() != 2) {
            if (motionEvent != null && !ax.c0.C.e(motionEvent, 8194)) {
                this.c1(motionEvent.getX(), n12 - n15, motionEvent.getY(), n11 - n16);
            }
            this.w(n8, n9);
        }
        if (n14 != 0 || n13 != 0) {
            this.O(n14, n13);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        return n10 != 0 || n14 != 0 || n13 != 0;
        {
        }
    }

    void v() {
        int n8 = this.f.j();
        for (int i8 = 0; i8 < n8; ++i8) {
            F f8 = RecyclerView.n0(this.f.i(i8));
            if (f8.K()) continue;
            f8.c();
        }
        this.c.d();
    }

    public boolean v0() {
        return !this.w || this.F || this.e.p();
        {
        }
    }

    void v1(int n8, int n9, int[] nArray) {
        this.G1();
        this.S0();
        ax.Y.u.a("RV Scroll");
        this.W(this.j0);
        n8 = n8 != 0 ? this.n.B1(n8, this.c, this.j0) : 0;
        n9 = n9 != 0 ? this.n.D1(n9, this.c, this.j0) : 0;
        ax.Y.u.b();
        this.o1();
        this.T0();
        this.J1(false);
        if (nArray != null) {
            nArray[0] = n8;
            nArray[1] = n9;
        }
    }

    void w(int n8, int n9) {
        boolean bl;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null && !edgeEffect.isFinished() && n8 > 0) {
            this.K.onRelease();
            bl = this.K.isFinished();
        } else {
            bl = false;
        }
        edgeEffect = this.M;
        boolean bl2 = bl;
        if (edgeEffect != null) {
            bl2 = bl;
            if (!edgeEffect.isFinished()) {
                bl2 = bl;
                if (n8 < 0) {
                    this.M.onRelease();
                    bl2 = bl | this.M.isFinished();
                }
            }
        }
        edgeEffect = this.L;
        bl = bl2;
        if (edgeEffect != null) {
            bl = bl2;
            if (!edgeEffect.isFinished()) {
                bl = bl2;
                if (n9 > 0) {
                    this.L.onRelease();
                    bl = bl2 | this.L.isFinished();
                }
            }
        }
        edgeEffect = this.N;
        bl2 = bl;
        if (edgeEffect != null) {
            bl2 = bl;
            if (!edgeEffect.isFinished()) {
                bl2 = bl;
                if (n9 < 0) {
                    this.N.onRelease();
                    bl2 = bl | this.N.isFinished();
                }
            }
        }
        if (bl2) {
            ax.c0.d0.c0((View)this);
        }
    }

    public void w1(int n8) {
        if (this.z) {
            return;
        }
        this.L1();
        p p8 = this.n;
        if (p8 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        p8.C1(n8);
        this.awakenScrollBars();
    }

    int x(int n8) {
        return this.y(n8, this.K, this.M, this.getWidth());
    }

    void x0() {
        this.e = new a(new a.a(this){
            final RecyclerView a;
            {
                this.a = recyclerView;
            }

            @Override
            public void a(int n8, int n9) {
                this.a.O0(n8, n9);
                this.a.m0 = true;
            }

            @Override
            public void b(a.b b8) {
                this.i(b8);
            }

            @Override
            public void c(int n8, int n9, Object object) {
                this.a.N1(n8, n9, object);
                this.a.n0 = true;
            }

            @Override
            public void d(a.b b8) {
                this.i(b8);
            }

            @Override
            public F e(int n8) {
                F f8 = this.a.g0(n8, true);
                if (f8 == null) {
                    return null;
                }
                if (this.a.f.n(f8.a)) {
                    if (E0) {
                        Log.d((String)"RecyclerView", (String)"assuming view holder cannot be find because it is hidden");
                    }
                    return null;
                }
                return f8;
            }

            @Override
            public void f(int n8, int n9) {
                this.a.P0(n8, n9, false);
                this.a.m0 = true;
            }

            @Override
            public void g(int n8, int n9) {
                this.a.N0(n8, n9);
                this.a.m0 = true;
            }

            @Override
            public void h(int n8, int n9) {
                this.a.P0(n8, n9, true);
                Object object = this.a;
                ((RecyclerView)object).m0 = true;
                object = ((RecyclerView)object).j0;
                ((B)object).d += n9;
            }

            void i(a.b b8) {
                int n8 = b8.a;
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 4) {
                            if (n8 != 8) {
                                return;
                            }
                            RecyclerView recyclerView = this.a;
                            recyclerView.n.Y0(recyclerView, b8.b, b8.d, 1);
                            return;
                        }
                        RecyclerView recyclerView = this.a;
                        recyclerView.n.b1(recyclerView, b8.b, b8.d, b8.c);
                        return;
                    }
                    RecyclerView recyclerView = this.a;
                    recyclerView.n.Z0(recyclerView, b8.b, b8.d);
                    return;
                }
                RecyclerView recyclerView = this.a;
                recyclerView.n.W0(recyclerView, b8.b, b8.d);
            }
        });
    }

    boolean y1(F f8, int n8) {
        if (this.E0()) {
            f8.q = n8;
            this.x0.add(f8);
            return false;
        }
        ax.c0.d0.s0(f8.a, n8);
        return true;
    }

    int z(int n8) {
        return this.y(n8, this.L, this.N, this.getHeight());
    }

    public static abstract class A {
        private int a = -1;
        private RecyclerView b;
        private p c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public PointF a(int n8) {
            Object object = this.e();
            if (object instanceof b) {
                return ((b)object).c(n8);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            ((StringBuilder)object).append(b.class.getCanonicalName());
            Log.w((String)"RecyclerView", (String)((StringBuilder)object).toString());
            return null;
        }

        public View b(int n8) {
            return this.b.n.I(n8);
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
            float f8 = pointF.x;
            float f9 = pointF.y;
            f8 = (float)Math.sqrt(f8 * f8 + f9 * f9);
            pointF.x /= f8;
            pointF.y /= f8;
        }

        void j(int n8, int n9) {
            float f8;
            View view;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                this.r();
            }
            if (this.d && this.f == null && this.c != null && (view = this.a(this.a)) != null && ((f8 = view.x) != 0.0f || view.y != 0.0f)) {
                recyclerView.v1((int)Math.signum(f8), (int)Math.signum(view.y), null);
            }
            this.d = false;
            view = this.f;
            if (view != null) {
                if (this.d(view) == this.a) {
                    this.o(this.f, recyclerView.j0, this.g);
                    this.g.c(recyclerView);
                    this.r();
                } else {
                    Log.e((String)"RecyclerView", (String)"Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                this.l(n8, n9, recyclerView.j0, this.g);
                boolean bl = this.g.a();
                this.g.c(recyclerView);
                if (bl && this.e) {
                    this.d = true;
                    recyclerView.g0.d();
                }
            }
        }

        protected void k(View view) {
            if (this.d(view) == this.f()) {
                this.f = view;
                if (E0) {
                    Log.d((String)"RecyclerView", (String)"smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int var1, int var2, B var3, a var4);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View var1, B var2, a var3);

        public void p(int n8) {
            this.a = n8;
        }

        void q(RecyclerView recyclerView, p p8) {
            recyclerView.g0.f();
            if (this.h) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("An instance of ");
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(" was started more than once. Each instance of");
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w((String)"RecyclerView", (String)stringBuilder.toString());
            }
            this.b = recyclerView;
            this.c = p8;
            int n8 = this.a;
            if (n8 != -1) {
                recyclerView.j0.a = n8;
                this.e = true;
                this.d = true;
                this.f = this.b(this.f());
                this.m();
                this.b.g0.d();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        protected final void r() {
            if (!this.e) {
                return;
            }
            this.e = false;
            this.n();
            this.b.j0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.k1(this);
            this.c = null;
            this.b = null;
        }

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d = -1;
            private Interpolator e;
            private boolean f = false;
            private int g = 0;

            public a(int n8, int n9) {
                this(n8, n9, Integer.MIN_VALUE, null);
            }

            public a(int n8, int n9, int n10, Interpolator interpolator) {
                this.a = n8;
                this.b = n9;
                this.c = n10;
                this.e = interpolator;
            }

            private void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            boolean a() {
                return this.d >= 0;
            }

            public void b(int n8) {
                this.d = n8;
            }

            void c(RecyclerView recyclerView) {
                int n8 = this.d;
                if (n8 >= 0) {
                    this.d = -1;
                    recyclerView.G0(n8);
                    this.f = false;
                    return;
                }
                if (this.f) {
                    this.e();
                    recyclerView.g0.e(this.a, this.b, this.c, this.e);
                    this.g = n8 = this.g + 1;
                    if (n8 > 10) {
                        Log.e((String)"RecyclerView", (String)"Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                this.g = 0;
            }

            public void d(int n8, int n9, int n10, Interpolator interpolator) {
                this.a = n8;
                this.b = n9;
                this.c = n10;
                this.e = interpolator;
                this.f = true;
            }
        }

        public static interface b {
            public PointF c(int var1);
        }
    }

    public static class B {
        int a = -1;
        private SparseArray<Object> b;
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
        int m;
        long n;
        int o;
        int p;
        int q;

        void a(int n8) {
            if ((this.e & n8) != 0) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Layout state should be one of ");
            stringBuilder.append(Integer.toBinaryString(n8));
            stringBuilder.append(" but it is ");
            stringBuilder.append(Integer.toBinaryString(this.e));
            throw new IllegalStateException(stringBuilder.toString());
        }

        public int b() {
            if (this.h) {
                return this.c - this.d;
            }
            return this.f;
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

        void f(h h8) {
            this.e = 1;
            this.f = h8.l();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State{mTargetPosition=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mData=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mItemCount=");
            stringBuilder.append(this.f);
            stringBuilder.append(", mIsMeasuring=");
            stringBuilder.append(this.j);
            stringBuilder.append(", mPreviousLayoutItemCount=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            stringBuilder.append(this.d);
            stringBuilder.append(", mStructureChanged=");
            stringBuilder.append(this.g);
            stringBuilder.append(", mInPreLayout=");
            stringBuilder.append(this.h);
            stringBuilder.append(", mRunSimpleAnimations=");
            stringBuilder.append(this.k);
            stringBuilder.append(", mRunPredictiveAnimations=");
            stringBuilder.append(this.l);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static class C
    extends l {
        C() {
        }

        @Override
        protected EdgeEffect a(RecyclerView recyclerView, int n8) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    class E
    implements Runnable {
        private int c0;
        OverScroller d0;
        Interpolator e0;
        private boolean f0;
        private boolean g0;
        final RecyclerView h0;
        private int q;

        E(RecyclerView recyclerView) {
            Interpolator interpolator;
            this.h0 = recyclerView;
            this.e0 = interpolator = O0;
            this.f0 = false;
            this.g0 = false;
            this.d0 = new OverScroller(recyclerView.getContext(), interpolator);
        }

        private int a(int n8, int n9) {
            int n10;
            int n11 = Math.abs(n8);
            n9 = n11 > (n10 = Math.abs(n9)) ? 1 : 0;
            RecyclerView recyclerView = this.h0;
            n8 = n9 != 0 ? recyclerView.getWidth() : recyclerView.getHeight();
            n9 = n9 != 0 ? n11 : n10;
            return Math.min((int)(((float)n9 / (float)n8 + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            this.h0.removeCallbacks(this);
            ax.c0.d0.d0((View)this.h0, this);
        }

        public void b(int n8, int n9) {
            this.h0.setScrollState(2);
            this.c0 = 0;
            this.q = 0;
            Interpolator interpolator = this.e0;
            Interpolator interpolator2 = O0;
            if (interpolator != interpolator2) {
                this.e0 = interpolator2;
                this.d0 = new OverScroller(this.h0.getContext(), interpolator2);
            }
            this.d0.fling(0, 0, n8, n9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            this.d();
        }

        void d() {
            if (this.f0) {
                this.g0 = true;
                return;
            }
            this.c();
        }

        public void e(int n8, int n9, int n10, Interpolator interpolator) {
            int n11 = n10;
            if (n10 == Integer.MIN_VALUE) {
                n11 = this.a(n8, n9);
            }
            Interpolator interpolator2 = interpolator;
            if (interpolator == null) {
                interpolator2 = O0;
            }
            if (this.e0 != interpolator2) {
                this.e0 = interpolator2;
                this.d0 = new OverScroller(this.h0.getContext(), interpolator2);
            }
            this.c0 = 0;
            this.q = 0;
            this.h0.setScrollState(2);
            this.d0.startScroll(0, 0, n8, n9, n11);
            if (Build.VERSION.SDK_INT < 23) {
                this.d0.computeScrollOffset();
            }
            this.d();
        }

        public void f() {
            this.h0.removeCallbacks(this);
            this.d0.abortAnimation();
        }

        @Override
        public void run() {
            Object object = this.h0;
            if (((RecyclerView)object).n == null) {
                this.f();
                return;
            }
            this.g0 = false;
            this.f0 = true;
            ((RecyclerView)object).A();
            object = this.d0;
            if (object.computeScrollOffset()) {
                int n8;
                int n9;
                int n10 = object.getCurrX();
                int n11 = object.getCurrY();
                int n12 = this.q;
                int n13 = this.c0;
                this.q = n10;
                this.c0 = n11;
                n10 = this.h0.x(n10 - n12);
                n12 = this.h0.z(n11 - n13);
                Object object2 = this.h0;
                Object object3 = ((RecyclerView)object2).w0;
                object3[0] = 0;
                object3[1] = 0;
                n11 = n10;
                n13 = n12;
                if (((RecyclerView)object2).L(n10, n12, (int[])object3, null, 1)) {
                    object2 = this.h0.w0;
                    n11 = n10 - object2[0];
                    n13 = n12 - object2[1];
                }
                if (this.h0.getOverScrollMode() != 2) {
                    this.h0.w(n11, n13);
                }
                object3 = this.h0;
                if (((RecyclerView)object3).m != null) {
                    object2 = ((RecyclerView)object3).w0;
                    object2[0] = false;
                    object2[1] = false;
                    ((RecyclerView)object3).v1(n11, n13, (int[])object2);
                    object2 = this.h0;
                    object3 = ((RecyclerView)object2).w0;
                    n9 = object3[0];
                    n8 = object3[1];
                    n12 = n11 - n9;
                    n10 = n13 - n8;
                    object2 = ((RecyclerView)object2).n.g;
                    if (object2 != null && !((A)object2).g() && ((A)object2).h()) {
                        n13 = this.h0.j0.b();
                        if (n13 == 0) {
                            ((A)object2).r();
                        } else if (((A)object2).f() >= n13) {
                            ((A)object2).p(n13 - 1);
                            ((A)object2).j(n9, n8);
                        } else {
                            ((A)object2).j(n9, n8);
                        }
                    }
                    n11 = n8;
                    n13 = n9;
                } else {
                    n8 = 0;
                    n9 = 0;
                    n12 = n11;
                    n10 = n13;
                    n13 = n8;
                    n11 = n9;
                }
                if (!this.h0.q.isEmpty()) {
                    this.h0.invalidate();
                }
                object2 = this.h0;
                object3 = ((RecyclerView)object2).w0;
                object3[0] = 0;
                object3[1] = 0;
                ((RecyclerView)object2).M(n13, n11, n12, n10, null, 1, (int[])object3);
                object3 = this.h0;
                object2 = ((RecyclerView)object3).w0;
                n8 = n12 - object2[0];
                n9 = n10 - object2[1];
                if (n13 != 0 || n11 != 0) {
                    ((RecyclerView)object3).O(n13, n11);
                }
                if (!this.h0.awakenScrollBars()) {
                    this.h0.invalidate();
                }
                n10 = object.getCurrX() == object.getFinalX() ? 1 : 0;
                n12 = object.getCurrY() == object.getFinalY() ? 1 : 0;
                n10 = !object.isFinished() && (n10 == 0 && n8 == 0 || n12 == 0 && n9 == 0) ? 0 : 1;
                object2 = this.h0.n.g;
                if (!(object2 != null && ((A)object2).g() || n10 == 0)) {
                    if (this.h0.getOverScrollMode() != 2) {
                        n11 = (int)object.getCurrVelocity();
                        n13 = n8 < 0 ? -n11 : (n8 > 0 ? n11 : 0);
                        if (n9 < 0) {
                            n11 = -n11;
                        } else if (n9 <= 0) {
                            n11 = 0;
                        }
                        this.h0.a(n13, n11);
                    }
                    if (K0) {
                        this.h0.i0.b();
                    }
                } else {
                    this.d();
                    object = this.h0;
                    object2 = ((RecyclerView)object).h0;
                    if (object2 != null) {
                        ((androidx.recyclerview.widget.h)object2).f((RecyclerView)object, n13, n11);
                    }
                }
            }
            if ((object = this.h0.n.g) != null && ((A)object).g()) {
                ((A)object).j(0, 0);
            }
            this.f0 = false;
            if (this.g0) {
                this.c();
                return;
            }
            this.h0.setScrollState(0);
            this.h0.K1(1);
        }
    }

    public static abstract class F {
        private static final List<Object> t = Collections.EMPTY_LIST;
        public final View a;
        WeakReference<RecyclerView> b;
        int c = -1;
        int d = -1;
        long e = -1L;
        int f = -1;
        int g = -1;
        F h = null;
        F i = null;
        int j;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        w n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;
        RecyclerView r;
        h<? extends F> s;

        public F(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.k == null) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                this.k = arrayList;
                this.l = java.util.DesugarCollections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.j & 2) != 0;
        }

        void B(int n8, boolean bl) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (bl) {
                this.g += n8;
            }
            this.c += n8;
            if (this.a.getLayoutParams() != null) {
                ((q)this.a.getLayoutParams()).c = true;
            }
        }

        void C(RecyclerView recyclerView) {
            int n8 = this.q;
            this.p = n8 != -1 ? n8 : ax.c0.d0.z(this.a);
            recyclerView.y1(this, 4);
        }

        void D(RecyclerView recyclerView) {
            recyclerView.y1(this, this.p);
            this.p = 0;
        }

        void E() {
            if (D0 && this.y()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempting to reset temp-detached ViewHolder: ");
                stringBuilder.append(this);
                stringBuilder.append(". ViewHolders should be fully detached before resetting.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            this.d();
            this.p = 0;
            this.q = -1;
            RecyclerView.u(this);
        }

        void F() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        void G(int n8, int n9) {
            this.j = n8 & n9 | this.j & ~n9;
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void H(boolean bl) {
            StringBuilder stringBuilder;
            int n8 = this.m;
            n8 = bl ? --n8 : ++n8;
            this.m = n8;
            if (n8 < 0) {
                this.m = 0;
                if (D0) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    stringBuilder2.append(this);
                    throw new RuntimeException(stringBuilder2.toString());
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                stringBuilder.append(this);
                Log.e((String)"View", (String)stringBuilder.toString());
            } else if (!bl && n8 == 1) {
                this.j |= 0x10;
            } else if (bl && n8 == 0) {
                this.j &= 0xFFFFFFEF;
            }
            if (E0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("setIsRecyclable val:");
                stringBuilder.append(bl);
                stringBuilder.append(":");
                stringBuilder.append(this);
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
        }

        void I(w w8, boolean bl) {
            this.n = w8;
            this.o = bl;
        }

        boolean J() {
            return (this.j & 0x10) != 0;
        }

        boolean K() {
            return (this.j & 0x80) != 0;
        }

        void L() {
            this.n.O(this);
        }

        boolean M() {
            return (this.j & 0x20) != 0;
        }

        void a(Object object) {
            if (object == null) {
                this.b(1024);
                return;
            }
            if ((0x400 & this.j) == 0) {
                this.g();
                this.k.add(object);
            }
        }

        void b(int n8) {
            this.j = n8 | this.j;
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
            this.j &= 0xFFFFFBFF;
        }

        void e() {
            this.j &= 0xFFFFFFDF;
        }

        void f() {
            this.j &= 0xFFFFFEFF;
        }

        boolean h() {
            return (this.j & 0x10) == 0 && ax.c0.d0.O(this.a);
        }

        void i(int n8, int n9, boolean bl) {
            this.b(8);
            this.B(n9, bl);
            this.c = n8;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.i0(this);
        }

        public final int k() {
            if (this.s == null) {
                return -1;
            }
            Object object = this.r;
            if (object == null) {
                return -1;
            }
            if ((object = ((RecyclerView)object).getAdapter()) == null) {
                return -1;
            }
            int n8 = this.r.i0(this);
            if (n8 == -1) {
                return -1;
            }
            return ((h)object).k(this.s, this, n8);
        }

        public final long l() {
            return this.e;
        }

        public final int m() {
            return this.f;
        }

        public final int n() {
            int n8;
            int n9 = n8 = this.g;
            if (n8 == -1) {
                n9 = this.c;
            }
            return n9;
        }

        public final int o() {
            return this.d;
        }

        List<Object> p() {
            if ((this.j & 0x400) == 0) {
                List<Object> list = this.k;
                if (list != null && list.size() != 0) {
                    return this.l;
                }
                return t;
            }
            return t;
        }

        boolean q(int n8) {
            return (n8 & this.j) != 0;
        }

        boolean r() {
            return (this.j & 0x200) != 0 || this.u();
            {
            }
        }

        boolean s() {
            return this.a.getParent() != null && this.a.getParent() != this.r;
        }

        boolean t() {
            return (this.j & 1) != 0;
        }

        public String toString() {
            CharSequence charSequence = this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(this.hashCode()));
            stringBuilder.append(" position=");
            stringBuilder.append(this.c);
            stringBuilder.append(" id=");
            stringBuilder.append(this.e);
            stringBuilder.append(", oldPos=");
            stringBuilder.append(this.d);
            stringBuilder.append(", pLpos:");
            stringBuilder.append(this.g);
            stringBuilder = new StringBuilder(stringBuilder.toString());
            if (this.x()) {
                stringBuilder.append(" scrap ");
                charSequence = this.o ? "[changeScrap]" : "[attachedScrap]";
                stringBuilder.append((String)charSequence);
            }
            if (this.u()) {
                stringBuilder.append(" invalid");
            }
            if (!this.t()) {
                stringBuilder.append(" unbound");
            }
            if (this.A()) {
                stringBuilder.append(" update");
            }
            if (this.w()) {
                stringBuilder.append(" removed");
            }
            if (this.K()) {
                stringBuilder.append(" ignored");
            }
            if (this.y()) {
                stringBuilder.append(" tmpDetached");
            }
            if (!this.v()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(" not recyclable(");
                ((StringBuilder)charSequence).append(this.m);
                ((StringBuilder)charSequence).append(")");
                stringBuilder.append(((StringBuilder)charSequence).toString());
            }
            if (this.r()) {
                stringBuilder.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                stringBuilder.append(" no parent");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        boolean u() {
            return (this.j & 4) != 0;
        }

        public final boolean v() {
            return (this.j & 0x10) == 0 && !ax.c0.d0.O(this.a);
        }

        boolean w() {
            return (this.j & 8) != 0;
        }

        boolean x() {
            return this.n != null;
        }

        boolean y() {
            return (this.j & 0x100) != 0;
        }

        boolean z() {
            return (this.j & 2) != 0;
        }
    }

    public static abstract class h<VH extends F> {
        private final i a = new i();
        private boolean b = false;
        private a c = a.q;

        public void A(RecyclerView recyclerView) {
        }

        public abstract void B(VH var1, int var2);

        public void C(VH VH, int n8, List<Object> list) {
            this.B(VH, n8);
        }

        public abstract VH D(ViewGroup var1, int var2);

        public void E(RecyclerView recyclerView) {
        }

        public boolean F(VH VH) {
            return false;
        }

        public void G(VH VH) {
        }

        public void H(VH VH) {
        }

        public void I(VH VH) {
        }

        public void J(j j8) {
            this.a.registerObserver(j8);
        }

        public void K(boolean bl) {
            if (!this.p()) {
                this.b = bl;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void L(a a8) {
            this.c = a8;
            this.a.h();
        }

        public void M(j j8) {
            this.a.unregisterObserver(j8);
        }

        public final void h(VH object, int n8) {
            boolean bl = ((F)object).s == null;
            if (bl) {
                ((F)object).c = n8;
                if (this.q()) {
                    ((F)object).e = this.m(n8);
                }
                ((F)object).G(1, 519);
                ax.Y.u.a("RV OnBindView");
            }
            ((F)object).s = this;
            if (D0) {
                if (((F)object).a.getParent() == null && ax.c0.d0.Q(((F)object).a) != ((F)object).y()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                    stringBuilder.append(((F)object).y());
                    stringBuilder.append(", attached to window: ");
                    stringBuilder.append(ax.c0.d0.Q(((F)object).a));
                    stringBuilder.append(", holder: ");
                    stringBuilder.append(object);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (((F)object).a.getParent() == null && ax.c0.d0.Q(((F)object).a)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Attempting to bind attached holder with no parent (AKA temp detached): ");
                    stringBuilder.append(object);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.C(object, n8, ((F)object).p());
            if (bl) {
                ((F)object).d();
                object = ((F)object).a.getLayoutParams();
                if (object instanceof q) {
                    ((q)((Object)object)).c = true;
                }
                ax.Y.u.b();
            }
        }

        boolean i() {
            int n8 = androidx.recyclerview.widget.RecyclerView$g.a[this.c.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return true;
                }
                if (this.l() > 0) {
                    return true;
                }
            }
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final VH j(ViewGroup object, int n8) {
            Throwable throwable2;
            block3: {
                try {
                    ax.Y.u.a("RV CreateView");
                    object = this.D((ViewGroup)object, n8);
                    if (object.a.getParent() != null) break block3;
                    object.f = n8;
                }
                catch (Throwable throwable2) {}
                ax.Y.u.b();
                return (VH)object;
            }
            object = new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            throw object;
            ax.Y.u.b();
            throw throwable2;
        }

        public int k(h<? extends F> h8, F f8, int n8) {
            if (h8 == this) {
                return n8;
            }
            return -1;
        }

        public abstract int l();

        public long m(int n8) {
            return -1L;
        }

        public int n(int n8) {
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

        public final void s(int n8) {
            this.a.d(n8, 1);
        }

        public final void t(int n8, Object object) {
            this.a.e(n8, 1, object);
        }

        public final void u(int n8) {
            this.a.f(n8, 1);
        }

        public final void v(int n8, int n9) {
            this.a.c(n8, n9);
        }

        public final void w(int n8, int n9, Object object) {
            this.a.e(n8, n9, object);
        }

        public final void x(int n8, int n9) {
            this.a.f(n8, n9);
        }

        public final void y(int n8, int n9) {
            this.a.g(n8, n9);
        }

        public final void z(int n8) {
            this.a.g(n8, 1);
        }

        public static final class a
        extends Enum<a> {
            public static final /* enum */ a c0;
            public static final /* enum */ a d0;
            private static final a[] e0;
            public static final /* enum */ a q;

            static {
                a a8;
                a a9;
                a a10;
                q = a10 = new a();
                c0 = a9 = new a();
                d0 = a8 = new a();
                e0 = new a[]{a10, a9, a8};
            }

            public static a valueOf(String string) {
                return Enum.valueOf(a.class, string);
            }

            public static a[] values() {
                return (a[])e0.clone();
            }
        }
    }

    static class i
    extends Observable<j> {
        i() {
        }

        public boolean a() {
            return this.mObservers.isEmpty() ^ true;
        }

        public void b() {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).a();
            }
        }

        public void c(int n8, int n9) {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).e(n8, n9, 1);
            }
        }

        public void d(int n8, int n9) {
            this.e(n8, n9, null);
        }

        public void e(int n8, int n9, Object object) {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).c(n8, n9, object);
            }
        }

        public void f(int n8, int n9) {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).d(n8, n9);
            }
        }

        public void g(int n8, int n9) {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).f(n8, n9);
            }
        }

        public void h() {
            for (int i8 = this.mObservers.size() - 1; i8 >= 0; --i8) {
                ((j)this.mObservers.get(i8)).g();
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int n8, int n9) {
        }

        public void c(int n8, int n9, Object object) {
            this.b(n8, n9);
        }

        public void d(int n8, int n9) {
        }

        public void e(int n8, int n9, int n10) {
        }

        public void f(int n8, int n9) {
        }

        public void g() {
        }
    }

    public static interface k {
        public int a(int var1, int var2);
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int n8) {
            throw null;
        }
    }

    public static abstract class m {
        private b a = null;
        private ArrayList<a> b = new ArrayList();
        private long c = 120L;
        private long d = 120L;
        private long e = 250L;
        private long f = 250L;

        static int e(F f8) {
            int n8 = f8.j;
            int n9 = n8 & 0xE;
            if (f8.u()) {
                return 4;
            }
            if ((n8 & 4) == 0) {
                n8 = f8.o();
                int n10 = f8.j();
                if (n8 != -1 && n10 != -1 && n8 != n10) {
                    return n9 | 0x800;
                }
            }
            return n9;
        }

        public abstract boolean a(F var1, c var2, c var3);

        public abstract boolean b(F var1, F var2, c var3, c var4);

        public abstract boolean c(F var1, c var2, c var3);

        public abstract boolean d(F var1, c var2, c var3);

        public abstract boolean f(F var1);

        public boolean g(F f8, List<Object> list) {
            return this.f(f8);
        }

        public final void h(F f8) {
            this.s(f8);
            b b8 = this.a;
            if (b8 != null) {
                b8.a(f8);
            }
        }

        public final void i() {
            int n8 = this.b.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.b.get(i8).a();
            }
            this.b.clear();
        }

        public abstract void j(F var1);

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

        public final boolean q(a a8) {
            boolean bl = this.p();
            if (a8 != null) {
                if (!bl) {
                    a8.a();
                    return bl;
                }
                this.b.add(a8);
            }
            return bl;
        }

        public c r() {
            return new c();
        }

        public void s(F f8) {
        }

        public c t(B b8, F f8) {
            return this.r().a(f8);
        }

        public c u(B b8, F f8, int n8, List<Object> list) {
            return this.r().a(f8);
        }

        public abstract void v();

        void w(b b8) {
            this.a = b8;
        }

        public static interface a {
            public void a();
        }

        static interface b {
            public void a(F var1);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(F f8) {
                return this.b(f8, 0);
            }

            public c b(F f8, int n8) {
                f8 = f8.a;
                this.a = f8.getLeft();
                this.b = f8.getTop();
                this.c = f8.getRight();
                this.d = f8.getBottom();
                return this;
            }
        }
    }

    private class n
    implements m.b {
        final RecyclerView a;

        n(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override
        public void a(F f8) {
            f8.H(true);
            if (f8.h != null && f8.i == null) {
                f8.h = null;
            }
            f8.i = null;
            if (!f8.J() && !this.a.j1(f8.a) && f8.y()) {
                this.a.removeDetachedView(f8.a, false);
            }
        }
    }

    public static abstract class o {
        @Deprecated
        public void f(Rect rect, int n8, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(Rect rect, View view, RecyclerView recyclerView, B b8) {
            this.f(rect, ((q)view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, B b8) {
            this.h(canvas, recyclerView);
        }

        @Deprecated
        public void j(Canvas canvas, RecyclerView recyclerView) {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, B b8) {
            this.j(canvas, recyclerView);
        }
    }

    public static abstract class p {
        b a;
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

        public p() {
            v.b b8;
            v.b b9;
            this.c = b9 = new v.b(this){
                final p a;
                {
                    this.a = p8;
                }

                @Override
                public View a(int n8) {
                    return this.a.O(n8);
                }

                @Override
                public int b(View view) {
                    q q8 = (q)view.getLayoutParams();
                    return this.a.W(view) - q8.leftMargin;
                }

                @Override
                public int c() {
                    return this.a.j0();
                }

                @Override
                public int d() {
                    return this.a.t0() - this.a.k0();
                }

                @Override
                public int e(View view) {
                    q q8 = (q)view.getLayoutParams();
                    return this.a.Z(view) + q8.rightMargin;
                }
            };
            this.d = b8 = new v.b(this){
                final p a;
                {
                    this.a = p8;
                }

                @Override
                public View a(int n8) {
                    return this.a.O(n8);
                }

                @Override
                public int b(View view) {
                    q q8 = (q)view.getLayoutParams();
                    return this.a.a0(view) - q8.topMargin;
                }

                @Override
                public int c() {
                    return this.a.l0();
                }

                @Override
                public int d() {
                    return this.a.c0() - this.a.i0();
                }

                @Override
                public int e(View view) {
                    q q8 = (q)view.getLayoutParams();
                    return this.a.U(view) + q8.bottomMargin;
                }
            };
            this.e = new androidx.recyclerview.widget.v(b9);
            this.f = new androidx.recyclerview.widget.v(b8);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        private void A1(w object, int n8, View view) {
            F f8 = RecyclerView.n0(view);
            if (f8.K()) {
                if (E0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("ignoring view ");
                    ((StringBuilder)object).append(f8);
                    Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
                }
                return;
            }
            if (f8.u() && !f8.w() && !this.b.m.q()) {
                this.v1(n8);
                ((w)object).H(f8);
                return;
            }
            this.D(n8);
            ((w)object).I(view);
            this.b.g.k(f8);
        }

        private static boolean B0(int n8, int n9, int n10) {
            int n11 = View.MeasureSpec.getMode((int)n9);
            n9 = View.MeasureSpec.getSize((int)n9);
            if (n10 > 0 && n8 != n10) {
                return false;
            }
            if (n11 != Integer.MIN_VALUE) {
                if (n11 != 0) {
                    if (n11 != 0x40000000) {
                        return false;
                    }
                    return n9 == n8;
                }
                return true;
            }
            return n9 >= n8;
        }

        private void E(int n8, View view) {
            this.a.d(n8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public static int Q(int n8, int n9, int n10, int n11, boolean bl) {
            block9: {
                block12: {
                    block8: {
                        block11: {
                            block10: {
                                block7: {
                                    block6: {
                                        n10 = Math.max(0, n8 - n10);
                                        if (!bl) break block6;
                                        if (n11 >= 0) break block7;
                                        if (n11 != -1) break block8;
                                        n8 = n9;
                                        if (n9 == Integer.MIN_VALUE) break block9;
                                        if (n9 == 0) break block8;
                                        n8 = n9;
                                        if (n9 == 0x40000000) break block9;
                                        break block8;
                                    }
                                    if (n11 < 0) break block10;
                                }
                                n8 = 0x40000000;
                                return View.MeasureSpec.makeMeasureSpec((int)n11, (int)n8);
                            }
                            if (n11 != -1) break block11;
                            n8 = n9;
                            break block9;
                        }
                        if (n11 == -2) break block12;
                    }
                    n8 = 0;
                    n11 = 0;
                    return View.MeasureSpec.makeMeasureSpec((int)n11, (int)n8);
                }
                n8 = n9 != Integer.MIN_VALUE && n9 != 0x40000000 ? 0 : Integer.MIN_VALUE;
            }
            n11 = n10;
            return View.MeasureSpec.makeMeasureSpec((int)n11, (int)n8);
        }

        private int[] R(View view, Rect rect) {
            int n8 = this.j0();
            int n9 = this.l0();
            int n10 = this.t0();
            int n11 = this.k0();
            int n12 = this.c0();
            int n13 = this.i0();
            int n14 = view.getLeft() + rect.left - view.getScrollX();
            int n15 = view.getTop() + rect.top - view.getScrollY();
            int n16 = rect.width();
            int n17 = rect.height();
            int n18 = n14 - n8;
            n8 = Math.min(0, n18);
            int n19 = n15 - n9;
            n9 = Math.min(0, n19);
            n11 = n16 + n14 - (n10 - n11);
            n10 = Math.max(0, n11);
            n17 = Math.max(0, n17 + n15 - (n12 - n13));
            if (this.e0() == 1) {
                n8 = n10 != 0 ? n10 : Math.max(n8, n11);
            } else if (n8 == 0) {
                n8 = Math.min(n18, n10);
            }
            if (n9 == 0) {
                n9 = Math.min(n19, n17);
            }
            return new int[]{n8, n9};
        }

        /*
         * Enabled aggressive block sorting
         */
        private void l(View object, int n8, boolean bl) {
            q q8;
            Object object2;
            block13: {
                block12: {
                    object2 = RecyclerView.n0((View)object);
                    if (!bl && !((F)object2).w()) {
                        this.b.g.p((F)object2);
                    } else {
                        this.b.g.b((F)object2);
                    }
                    q8 = (q)object.getLayoutParams();
                    if (((F)object2).M() || ((F)object2).x()) break block12;
                    if (object.getParent() == this.b) {
                        int n9 = this.a.m((View)object);
                        int n10 = n8;
                        if (n8 == -1) {
                            n10 = this.a.g();
                        }
                        if (n9 == -1) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            ((StringBuilder)object2).append(this.b.indexOfChild((View)object));
                            ((StringBuilder)object2).append(this.b.V());
                            throw new IllegalStateException(((StringBuilder)object2).toString());
                        }
                        if (n9 != n10) {
                            this.b.n.G0(n9, n10);
                        }
                        break block13;
                    } else {
                        this.a.a((View)object, n8, false);
                        q8.c = true;
                        A a8 = this.g;
                        if (a8 != null && a8.h()) {
                            this.g.k((View)object);
                        }
                    }
                    break block13;
                }
                if (((F)object2).x()) {
                    ((F)object2).L();
                } else {
                    ((F)object2).e();
                }
                this.a.c((View)object, n8, object.getLayoutParams(), false);
            }
            if (q8.d) {
                if (E0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("consuming pending invalidate on child ");
                    ((StringBuilder)object).append(q8.a);
                    Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
                }
                ((F)object2).a.invalidate();
                q8.d = false;
            }
        }

        public static d n0(Context context, AttributeSet attributeSet, int n8, int n9) {
            d d8 = new d();
            context = context.obtainStyledAttributes(attributeSet, ax.h2.d.a, n8, n9);
            d8.a = context.getInt(ax.h2.d.b, 1);
            d8.b = context.getInt(ax.h2.d.l, 1);
            d8.c = context.getBoolean(ax.h2.d.k, false);
            d8.d = context.getBoolean(ax.h2.d.m, false);
            context.recycle();
            return d8;
        }

        public static int t(int n8, int n9, int n10) {
            int n11 = View.MeasureSpec.getMode((int)n8);
            n8 = View.MeasureSpec.getSize((int)n8);
            if (n11 != Integer.MIN_VALUE) {
                if (n11 != 0x40000000) {
                    n8 = Math.max(n9, n10);
                }
                return n8;
            }
            return Math.min(n8, Math.max(n9, n10));
        }

        private boolean y0(RecyclerView recyclerView, int n8, int n9) {
            if ((recyclerView = recyclerView.getFocusedChild()) == null) {
                return false;
            }
            int n10 = this.j0();
            int n11 = this.l0();
            int n12 = this.t0();
            int n13 = this.k0();
            int n14 = this.c0();
            int n15 = this.i0();
            Rect rect = this.b.j;
            this.V((View)recyclerView, rect);
            return rect.left - n8 < n12 - n13 && rect.right - n8 > n10 && rect.top - n9 < n14 - n15 && rect.bottom - n9 > n11;
            {
            }
        }

        public int A(B b8) {
            return 0;
        }

        public boolean A0(w w8, B b8) {
            return false;
        }

        public int B(B b8) {
            return 0;
        }

        @SuppressLint(value={"UnknownNullness"})
        public int B1(int n8, w w8, B b8) {
            return 0;
        }

        public void C(w w8) {
            for (int i8 = this.P() - 1; i8 >= 0; --i8) {
                this.A1(w8, i8, this.O(i8));
            }
        }

        public boolean C0() {
            A a8 = this.g;
            return a8 != null && a8.h();
        }

        public void C1(int n8) {
            if (E0) {
                Log.e((String)"RecyclerView", (String)"You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void D(int n8) {
            this.E(n8, this.O(n8));
        }

        public boolean D0(View view, boolean bl, boolean bl2) {
            bl2 = this.e.b(view, 24579) && this.f.b(view, 24579);
            if (bl) {
                return bl2;
            }
            return bl2 ^ true;
        }

        @SuppressLint(value={"UnknownNullness"})
        public int D1(int n8, w w8, B b8) {
            return 0;
        }

        public void E0(View view, int n8, int n9, int n10, int n11) {
            q q8 = (q)view.getLayoutParams();
            Rect rect = q8.b;
            view.layout(n8 + rect.left + q8.leftMargin, n9 + rect.top + q8.topMargin, n10 - rect.right - q8.rightMargin, n11 - rect.bottom - q8.bottomMargin);
        }

        void E1(RecyclerView recyclerView) {
            this.F1(View.MeasureSpec.makeMeasureSpec((int)recyclerView.getWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)recyclerView.getHeight(), (int)0x40000000));
        }

        void F(RecyclerView recyclerView) {
            this.i = true;
            this.L0(recyclerView);
        }

        public void F0(View view, int n8, int n9) {
            q q8 = (q)view.getLayoutParams();
            Rect rect = this.b.s0(view);
            int n10 = rect.left;
            int n11 = rect.right;
            int n12 = rect.top;
            int n13 = rect.bottom;
            n8 = androidx.recyclerview.widget.RecyclerView$p.Q(this.t0(), this.u0(), this.j0() + this.k0() + q8.leftMargin + q8.rightMargin + (n8 + (n10 + n11)), q8.width, this.q());
            if (this.K1(view, n8, n9 = androidx.recyclerview.widget.RecyclerView$p.Q(this.c0(), this.d0(), this.l0() + this.i0() + q8.topMargin + q8.bottomMargin + (n9 + (n12 + n13)), q8.height, this.r()), q8)) {
                view.measure(n8, n9);
            }
        }

        void F1(int n8, int n9) {
            this.q = View.MeasureSpec.getSize((int)n8);
            this.o = n8 = View.MeasureSpec.getMode((int)n8);
            if (n8 == 0 && !I0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize((int)n9);
            this.p = n8 = View.MeasureSpec.getMode((int)n9);
            if (n8 == 0 && !I0) {
                this.r = 0;
            }
        }

        void G(RecyclerView recyclerView, w w8) {
            this.i = false;
            this.N0(recyclerView, w8);
        }

        public void G0(int n8, int n9) {
            Object object = this.O(n8);
            if (object != null) {
                this.D(n8);
                this.n((View)object, n9);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot move a child from non-existing index:");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(this.b.toString());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        public void G1(int n8, int n9) {
            this.b.setMeasuredDimension(n8, n9);
        }

        public View H(View view) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return null;
            }
            if ((view = recyclerView.Y(view)) == null) {
                return null;
            }
            if (this.a.n(view)) {
                return null;
            }
            return view;
        }

        public void H0(int n8) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.L0(n8);
            }
        }

        public void H1(Rect rect, int n8, int n9) {
            int n10 = rect.width();
            int n11 = this.j0();
            int n12 = this.k0();
            int n13 = rect.height();
            int n14 = this.l0();
            int n15 = this.i0();
            this.G1(androidx.recyclerview.widget.RecyclerView$p.t(n8, n10 + n11 + n12, this.h0()), androidx.recyclerview.widget.RecyclerView$p.t(n9, n13 + n14 + n15, this.g0()));
        }

        public View I(int n8) {
            int n9 = this.P();
            for (int i8 = 0; i8 < n9; ++i8) {
                View view = this.O(i8);
                F f8 = RecyclerView.n0(view);
                if (f8 == null || f8.n() != n8 || f8.K() || !this.b.j0.e() && f8.w()) continue;
                return view;
            }
            return null;
        }

        public void I0(int n8) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.M0(n8);
            }
        }

        void I1(int n8, int n9) {
            int n10 = this.P();
            if (n10 == 0) {
                this.b.C(n8, n9);
                return;
            }
            int n11 = Integer.MIN_VALUE;
            int n12 = Integer.MIN_VALUE;
            int n13 = Integer.MAX_VALUE;
            int n14 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < n10; ++i8) {
                View view = this.O(i8);
                Rect rect = this.b.j;
                this.V(view, rect);
                int n15 = rect.left;
                int n16 = n13;
                if (n15 < n13) {
                    n16 = n15;
                }
                n15 = rect.right;
                n13 = n11;
                if (n15 > n11) {
                    n13 = n15;
                }
                n11 = rect.top;
                n15 = n14;
                if (n11 < n14) {
                    n15 = n11;
                }
                n11 = rect.bottom;
                n14 = n12;
                if (n11 > n12) {
                    n14 = n11;
                }
                n11 = n13;
                n12 = n14;
                n13 = n16;
                n14 = n15;
            }
            this.b.j.set(n13, n14, n11, n12);
            this.H1(this.b.j, n8, n9);
        }

        @SuppressLint(value={"UnknownNullness"})
        public abstract q J();

        public void J0(h h8, h h9) {
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
            this.o = 0x40000000;
            this.p = 0x40000000;
        }

        @SuppressLint(value={"UnknownNullness"})
        public q K(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean K0(RecyclerView recyclerView, ArrayList<View> arrayList, int n8, int n9) {
            return false;
        }

        boolean K1(View view, int n8, int n9, q q8) {
            return view.isLayoutRequested() || !this.k || !androidx.recyclerview.widget.RecyclerView$p.B0(view.getWidth(), n8, q8.width) || !androidx.recyclerview.widget.RecyclerView$p.B0(view.getHeight(), n9, q8.height);
            {
            }
        }

        @SuppressLint(value={"UnknownNullness"})
        public q L(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q)layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams)layoutParams);
            }
            return new q(layoutParams);
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

        boolean M1(View view, int n8, int n9, q q8) {
            return !this.k || !androidx.recyclerview.widget.RecyclerView$p.B0(view.getMeasuredWidth(), n8, q8.width) || !androidx.recyclerview.widget.RecyclerView$p.B0(view.getMeasuredHeight(), n9, q8.height);
            {
            }
        }

        public int N(View view) {
            return ((q)view.getLayoutParams()).b.bottom;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void N0(RecyclerView recyclerView, w w8) {
            this.M0(recyclerView);
        }

        @SuppressLint(value={"UnknownNullness"})
        public void N1(RecyclerView recyclerView, B b8, int n8) {
            Log.e((String)"RecyclerView", (String)"You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View O(int n8) {
            b b8 = this.a;
            if (b8 != null) {
                return b8.f(n8);
            }
            return null;
        }

        public View O0(View view, int n8, w w8, B b8) {
            return null;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void O1(A a8) {
            A a9 = this.g;
            if (a9 != null && a8 != a9 && a9.h()) {
                this.g.r();
            }
            this.g = a8;
            a8.q(this.b, this);
        }

        public int P() {
            b b8 = this.a;
            if (b8 != null) {
                return b8.g();
            }
            return 0;
        }

        public void P0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            this.Q0(recyclerView.c, recyclerView.j0, accessibilityEvent);
        }

        void P1() {
            A a8 = this.g;
            if (a8 != null) {
                a8.r();
            }
        }

        public void Q0(w object, B b8, AccessibilityEvent accessibilityEvent) {
            object = this.b;
            if (object != null && accessibilityEvent != null) {
                boolean bl;
                boolean bl2 = bl = true;
                if (!object.canScrollVertically(1)) {
                    bl2 = bl;
                    if (!this.b.canScrollVertically(-1)) {
                        bl2 = bl;
                        if (!this.b.canScrollHorizontally(-1)) {
                            bl2 = this.b.canScrollHorizontally(1) ? bl : false;
                        }
                    }
                }
                accessibilityEvent.setScrollable(bl2);
                object = this.b.m;
                if (object != null) {
                    accessibilityEvent.setItemCount(((h)object).l());
                }
            }
        }

        public boolean Q1() {
            return false;
        }

        public void R0(w w8, B b8, H h8) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                h8.a(8192);
                h8.G0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                h8.a(4096);
                h8.G0(true);
            }
            h8.o0(H.e.a(this.p0(w8, b8), this.T(w8, b8), this.A0(w8, b8), this.q0(w8, b8)));
        }

        public boolean S() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.h;
        }

        void S0(H h8) {
            RecyclerView recyclerView = this.b;
            this.R0(recyclerView.c, recyclerView.j0, h8);
        }

        public int T(w w8, B b8) {
            return -1;
        }

        void T0(View view, H h8) {
            Object object = RecyclerView.n0(view);
            if (object != null && !((F)object).w() && !this.a.n(((F)object).a)) {
                object = this.b;
                this.U0(((RecyclerView)object).c, ((RecyclerView)object).j0, view, h8);
            }
        }

        public int U(View view) {
            return view.getBottom() + this.N(view);
        }

        public void U0(w w8, B b8, View view, H h8) {
        }

        public void V(View view, Rect rect) {
            RecyclerView.p0(view, rect);
        }

        public View V0(View view, int n8) {
            return null;
        }

        public int W(View view) {
            return view.getLeft() - this.f0(view);
        }

        public void W0(RecyclerView recyclerView, int n8, int n9) {
        }

        public int X(View view) {
            Rect rect = ((q)view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void X0(RecyclerView recyclerView) {
        }

        public int Y(View view) {
            Rect rect = ((q)view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void Y0(RecyclerView recyclerView, int n8, int n9, int n10) {
        }

        public int Z(View view) {
            return view.getRight() + this.o0(view);
        }

        public void Z0(RecyclerView recyclerView, int n8, int n9) {
        }

        public int a0(View view) {
            return view.getTop() - this.r0(view);
        }

        public void a1(RecyclerView recyclerView, int n8, int n9) {
        }

        public View b0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return null;
            }
            if ((recyclerView = recyclerView.getFocusedChild()) != null && !this.a.n((View)recyclerView)) {
                return recyclerView;
            }
            return null;
        }

        public void b1(RecyclerView recyclerView, int n8, int n9, Object object) {
            this.a1(recyclerView, n8, n9);
        }

        public int c0() {
            return this.r;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void c1(w w8, B b8) {
            Log.e((String)"RecyclerView", (String)"You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d0() {
            return this.p;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void d1(B b8) {
        }

        public int e0() {
            return ax.c0.d0.B((View)this.b);
        }

        public void e1(w w8, B b8, int n8, int n9) {
            this.b.C(n8, n9);
        }

        public int f() {
            Object object = this.b;
            object = object != null ? ((RecyclerView)object).getAdapter() : null;
            if (object != null) {
                return ((h)object).l();
            }
            return 0;
        }

        public int f0(View view) {
            return ((q)view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean f1(RecyclerView recyclerView, View view, View view2) {
            return this.C0() || recyclerView.E0();
            {
            }
        }

        public int g0() {
            return ax.c0.d0.C((View)this.b);
        }

        public boolean g1(RecyclerView recyclerView, B b8, View view, View view2) {
            return this.f1(recyclerView, view, view2);
        }

        @SuppressLint(value={"UnknownNullness"})
        public void h(View view) {
            this.i(view, -1);
        }

        public int h0() {
            return ax.c0.d0.D((View)this.b);
        }

        @SuppressLint(value={"UnknownNullness"})
        public void h1(Parcelable parcelable) {
        }

        @SuppressLint(value={"UnknownNullness"})
        public void i(View view, int n8) {
            this.l(view, n8, true);
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

        @SuppressLint(value={"UnknownNullness"})
        public void j(View view) {
            this.k(view, -1);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void j1(int n8) {
        }

        @SuppressLint(value={"UnknownNullness"})
        public void k(View view, int n8) {
            this.l(view, n8, false);
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void k1(A a8) {
            if (this.g == a8) {
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

        boolean l1(int n8, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return this.m1(recyclerView.c, recyclerView.j0, n8, bundle);
        }

        @SuppressLint(value={"UnknownNullness"})
        public void m(String string) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.r(string);
            }
        }

        public int m0(View view) {
            return ((q)view.getLayoutParams()).a();
        }

        /*
         * Unable to fully structure code
         */
        public boolean m1(w var1_1, B var2_2, int var3_3, Bundle var4_4) {
            block9: {
                if (this.b == null) {
                    return false;
                }
                var8_5 = this.c0();
                var7_6 = this.t0();
                var1_1 = new Rect();
                var5_7 = var8_5;
                var6_8 = var7_6;
                if (this.b.getMatrix().isIdentity()) {
                    var5_7 = var8_5;
                    var6_8 = var7_6;
                    if (this.b.getGlobalVisibleRect((Rect)var1_1)) {
                        var5_7 = var1_1.height();
                        var6_8 = var1_1.width();
                    }
                }
                if (var3_3 == 4096) ** GOTO lbl31
                if (var3_3 != 8192) {
                    var3_3 = 0;
                    var5_7 = 0;
                } else {
                    var3_3 = this.b.canScrollVertically(-1) != false ? -(var5_7 - this.l0() - this.i0()) : 0;
                    var5_7 = var3_3;
                    if (this.b.canScrollHorizontally(-1)) {
                        var5_7 = -(var6_8 - this.j0() - this.k0());
lbl23:
                        // 2 sources

                        while (true) {
                            var6_8 = var3_3;
                            var3_3 = var5_7;
                            var5_7 = var6_8;
                            break block9;
                            break;
                        }
                    }
                    while (true) {
                        var3_3 = 0;
                        break block9;
                        break;
                    }
lbl31:
                    // 1 sources

                    var3_3 = this.b.canScrollVertically(1) != false ? var5_7 - this.l0() - this.i0() : 0;
                    var5_7 = var3_3;
                    if (!this.b.canScrollHorizontally(1)) ** continue;
                    var5_7 = var6_8 - this.j0() - this.k0();
                    ** continue;
                }
            }
            if (var5_7 == 0 && var3_3 == 0) {
                return false;
            }
            this.b.E1(var3_3, var5_7, null, -2147483648, true);
            return true;
        }

        public void n(View view, int n8) {
            this.o(view, n8, (q)view.getLayoutParams());
        }

        boolean n1(View view, int n8, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return this.o1(recyclerView.c, recyclerView.j0, view, n8, bundle);
        }

        public void o(View view, int n8, q q8) {
            F f8 = RecyclerView.n0(view);
            if (f8.w()) {
                this.b.g.b(f8);
            } else {
                this.b.g.p(f8);
            }
            this.a.c(view, n8, (ViewGroup.LayoutParams)q8, f8.w());
        }

        public int o0(View view) {
            return ((q)view.getLayoutParams()).b.right;
        }

        public boolean o1(w w8, B b8, View view, int n8, Bundle bundle) {
            return false;
        }

        public void p(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
                return;
            }
            rect.set(recyclerView.s0(view));
        }

        public int p0(w w8, B b8) {
            return -1;
        }

        public void p1(w w8) {
            for (int i8 = this.P() - 1; i8 >= 0; --i8) {
                if (RecyclerView.n0(this.O(i8)).K()) continue;
                this.s1(i8, w8);
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(w w8, B b8) {
            return 0;
        }

        void q1(w w8) {
            int n8 = w8.j();
            for (int i8 = n8 - 1; i8 >= 0; --i8) {
                m m8;
                View view = w8.n(i8);
                F f8 = RecyclerView.n0(view);
                if (f8.K()) continue;
                f8.H(false);
                if (f8.y()) {
                    this.b.removeDetachedView(view, false);
                }
                if ((m8 = this.b.O) != null) {
                    m8.j(f8);
                }
                f8.H(true);
                w8.D(view);
            }
            w8.e();
            if (n8 > 0) {
                this.b.invalidate();
            }
        }

        public boolean r() {
            return false;
        }

        public int r0(View view) {
            return ((q)view.getLayoutParams()).b.top;
        }

        public void r1(View view, w w8) {
            this.u1(view);
            w8.G(view);
        }

        public boolean s(q q8) {
            return q8 != null;
        }

        public void s0(View view, boolean bl, Rect rect) {
            Matrix matrix;
            Rect rect2;
            if (bl) {
                rect2 = ((q)view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                rect2 = this.b.l;
                rect2.set(rect);
                matrix.mapRect((RectF)rect2);
                rect.set((int)Math.floor(rect2.left), (int)Math.floor(rect2.top), (int)Math.ceil(rect2.right), (int)Math.ceil(rect2.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void s1(int n8, w w8) {
            View view = this.O(n8);
            this.v1(n8);
            w8.G(view);
        }

        public int t0() {
            return this.q;
        }

        public boolean t1(Runnable runnable2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable2);
            }
            return false;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void u(int n8, int n9, B b8, c c8) {
        }

        public int u0() {
            return this.o;
        }

        @SuppressLint(value={"UnknownNullness"})
        public void u1(View view) {
            this.a.p(view);
        }

        @SuppressLint(value={"UnknownNullness"})
        public void v(int n8, c c8) {
        }

        boolean v0() {
            int n8 = this.P();
            for (int i8 = 0; i8 < n8; ++i8) {
                ViewGroup.LayoutParams layoutParams = this.O(i8).getLayoutParams();
                if (layoutParams.width >= 0 || layoutParams.height >= 0) continue;
                return true;
            }
            return false;
        }

        public void v1(int n8) {
            if (this.O(n8) != null) {
                this.a.q(n8);
            }
        }

        public int w(B b8) {
            return 0;
        }

        public boolean w0() {
            return this.i;
        }

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean bl) {
            return this.x1(recyclerView, view, rect, bl, false);
        }

        public int x(B b8) {
            return 0;
        }

        public boolean x0() {
            return this.j;
        }

        public boolean x1(RecyclerView recyclerView, View object, Rect rect, boolean bl, boolean bl2) {
            object = this.R((View)object, rect);
            View view = object[0];
            View view2 = object[1];
            if (bl2 && !this.y0(recyclerView, (int)view, (int)view2) || view == false && view2 == false) {
                return false;
            }
            if (bl) {
                recyclerView.scrollBy((int)view, (int)view2);
            } else {
                recyclerView.B1((int)view, (int)view2);
            }
            return true;
        }

        public int y(B b8) {
            return 0;
        }

        public void y1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int z(B b8) {
            return 0;
        }

        public final boolean z0() {
            return this.l;
        }

        public void z1() {
            this.h = true;
        }

        public static interface c {
            public void a(int var1, int var2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }
    }

    public static class q
    extends ViewGroup.MarginLayoutParams {
        F a;
        final Rect b = new Rect();
        boolean c = true;
        boolean d = false;

        public q(int n8, int n9) {
            super(n8, n9);
        }

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public q(q q8) {
            super((ViewGroup.LayoutParams)q8);
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
    }

    public static interface r {
        public void a(View var1);

        public void d(View var1);
    }

    public static abstract class s {
        public abstract boolean a(int var1, int var2);
    }

    public static interface t {
        public void b(RecyclerView var1, MotionEvent var2);

        public boolean c(RecyclerView var1, MotionEvent var2);

        public void e(boolean var1);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int n8) {
        }

        public void b(RecyclerView recyclerView, int n8, int n9) {
        }
    }

    public static class v {
        SparseArray<a> a = new SparseArray();
        int b = 0;
        Set<h<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        private a i(int n8) {
            a a8;
            a a9 = a8 = (a)this.a.get(n8);
            if (a8 == null) {
                a9 = new a();
                this.a.put(n8, (Object)a9);
            }
            return a9;
        }

        void a() {
            ++this.b;
        }

        void b(h<?> h8) {
            this.c.add(h8);
        }

        public void c() {
            for (int i8 = 0; i8 < this.a.size(); ++i8) {
                a a8 = (a)this.a.valueAt(i8);
                ArrayList<F> arrayList = a8.a;
                int n8 = arrayList.size();
                for (int i9 = 0; i9 < n8; ++i9) {
                    F f8 = arrayList.get(i9);
                    ax.j0.a.a(f8.a);
                }
                a8.a.clear();
            }
        }

        void d() {
            --this.b;
        }

        void e(h<?> object, boolean bl) {
            this.c.remove(object);
            if (this.c.size() == 0 && !bl) {
                for (int i8 = 0; i8 < this.a.size(); ++i8) {
                    object = this.a;
                    object = ((a)object.get((int)object.keyAt((int)i8))).a;
                    for (int i9 = 0; i9 < ((ArrayList)object).size(); ++i9) {
                        ax.j0.a.a(((F)((ArrayList)object).get((int)i9)).a);
                    }
                }
            }
        }

        void f(int n8, long l8) {
            a a8 = this.i(n8);
            a8.d = this.l(a8.d, l8);
        }

        void g(int n8, long l8) {
            a a8 = this.i(n8);
            a8.c = this.l(a8.c, l8);
        }

        public F h(int n8) {
            Object object = (a)this.a.get(n8);
            if (object != null && !((a)object).a.isEmpty()) {
                object = ((a)object).a;
                for (n8 = ((ArrayList)object).size() - 1; n8 >= 0; --n8) {
                    if (((F)((ArrayList)object).get(n8)).s()) continue;
                    return (F)((ArrayList)object).remove(n8);
                }
            }
            return null;
        }

        void j(h<?> h8, h<?> h9, boolean bl) {
            if (h8 != null) {
                this.d();
            }
            if (!bl && this.b == 0) {
                this.c();
            }
            if (h9 != null) {
                this.a();
            }
        }

        public void k(F f8) {
            int n8 = f8.m();
            ArrayList<F> arrayList = this.i((int)n8).a;
            if (((a)this.a.get((int)n8)).b <= arrayList.size()) {
                ax.j0.a.a(f8.a);
                return;
            }
            if (D0 && arrayList.contains(f8)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            f8.E();
            arrayList.add(f8);
        }

        long l(long l8, long l9) {
            if (l8 == 0L) {
                return l9;
            }
            return l8 / 4L * 3L + l9 / 4L;
        }

        boolean m(int n8, long l8, long l9) {
            long l10 = this.i((int)n8).d;
            return l10 == 0L || l8 + l10 < l9;
            {
            }
        }

        boolean n(int n8, long l8, long l9) {
            long l10 = this.i((int)n8).c;
            return l10 == 0L || l8 + l10 < l9;
            {
            }
        }

        static class a {
            final ArrayList<F> a = new ArrayList();
            int b = 5;
            long c = 0L;
            long d = 0L;

            a() {
            }
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
        final RecyclerView h;

        public w(RecyclerView object) {
            this.h = object;
            this.a = object = new ArrayList();
            this.b = null;
            this.c = new ArrayList();
            this.d = java.util.DesugarCollections.unmodifiableList((List)object);
            this.e = 2;
            this.f = 2;
        }

        private void B(h<?> h8) {
            this.C(h8, false);
        }

        private void C(h<?> h8, boolean bl) {
            v v8 = this.g;
            if (v8 != null) {
                v8.e(h8, bl);
            }
        }

        private boolean M(F f8, int n8, int n9, long l8) {
            f8.s = null;
            f8.r = this.h;
            int n10 = f8.m();
            long l9 = this.h.getNanoTime();
            boolean bl = false;
            if (l8 != Long.MAX_VALUE && !this.g.m(n10, l9, l8)) {
                return false;
            }
            if (f8.y()) {
                RecyclerView recyclerView = this.h;
                recyclerView.attachViewToParent(f8.a, recyclerView.getChildCount(), f8.a.getLayoutParams());
                bl = true;
            }
            this.h.m.h(f8, n8);
            if (bl) {
                this.h.detachViewFromParent(f8.a);
            }
            l8 = this.h.getNanoTime();
            this.g.f(f8.m(), l8 - l9);
            this.b(f8);
            if (this.h.j0.e()) {
                f8.g = n9;
            }
            return true;
        }

        private void b(F f8) {
            if (this.h.D0()) {
                ax.c0.a a8;
                f8 = f8.a;
                if (ax.c0.d0.z((View)f8) == 0) {
                    ax.c0.d0.s0((View)f8, 1);
                }
                if ((a8 = this.h.q0) != null) {
                    if ((a8 = a8.n()) instanceof q.a) {
                        ((q.a)a8).o((View)f8);
                    }
                    ax.c0.d0.l0((View)f8, a8);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean bl) {
            int n8;
            for (n8 = viewGroup.getChildCount() - 1; n8 >= 0; --n8) {
                View view = viewGroup.getChildAt(n8);
                if (!(view instanceof ViewGroup)) continue;
                this.q((ViewGroup)view, true);
            }
            if (!bl) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            n8 = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(n8);
        }

        private void r(F f8) {
            f8 = f8.a;
            if (f8 instanceof ViewGroup) {
                this.q((ViewGroup)f8, false);
            }
        }

        private void u() {
            if (this.g != null) {
                RecyclerView recyclerView = this.h;
                if (recyclerView.m != null && recyclerView.isAttachedToWindow()) {
                    this.g.b(this.h.m);
                }
            }
        }

        void A() {
            for (int i8 = 0; i8 < this.c.size(); ++i8) {
                ax.j0.a.a(this.c.get((int)i8).a);
            }
            this.B(this.h.m);
        }

        void D(View object) {
            object = RecyclerView.n0((View)object);
            ((F)object).n = null;
            ((F)object).o = false;
            ((F)object).e();
            this.H((F)object);
        }

        void E() {
            for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
                this.F(i8);
            }
            this.c.clear();
            if (K0) {
                this.h.i0.b();
            }
        }

        void F(int n8) {
            Object object;
            if (E0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Recycling cached view at index ");
                ((StringBuilder)object).append(n8);
                Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
            }
            object = this.c.get(n8);
            if (E0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CachedViewHolder to be recycled: ");
                stringBuilder.append(object);
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
            this.a((F)object, true);
            this.c.remove(n8);
        }

        public void G(View view) {
            F f8 = RecyclerView.n0(view);
            if (f8.y()) {
                this.h.removeDetachedView(view, false);
            }
            if (f8.x()) {
                f8.L();
            } else if (f8.M()) {
                f8.e();
            }
            this.H(f8);
            if (this.h.O != null && !f8.v()) {
                this.h.O.j(f8);
            }
        }

        /*
         * Unable to fully structure code
         */
        void H(F var1_1) {
            var6_2 = var1_1.x();
            var5_3 = false;
            var3_4 = 0;
            var4_5 = 1;
            if (!var6_2 && var1_1.a.getParent() == null) {
                if (!var1_1.y()) {
                    if (!var1_1.K()) {
                        var5_3 = var1_1.h();
                        var7_6 = this.h.m;
                        var2_9 = var7_6 != null && var5_3 != false && var7_6.F(var1_1) != false ? 1 : 0;
                        if (RecyclerView.D0 && this.c.contains(var1_1)) {
                            var7_6 = new StringBuilder();
                            var7_6.append("cached view received recycle internal? ");
                            var7_6.append(var1_1);
                            var7_6.append(this.h.V());
                            throw new IllegalArgumentException(var7_6.toString());
                        }
                        if (var2_9 == 0 && !var1_1.v()) {
                            var2_9 = var3_4;
                            if (RecyclerView.E0) {
                                var7_6 = new StringBuilder();
                                var7_6.append("trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists");
                                var7_6.append(this.h.V());
                                Log.d((String)"RecyclerView", (String)var7_6.toString());
                                var2_9 = var3_4;
                            }
                            while (true) {
                                var3_4 = 0;
                                break;
                            }
                        } else {
                            if (this.f > 0 && !var1_1.q(526)) {
                                var2_9 = var3_4 = this.c.size();
                                if (var3_4 >= this.f) {
                                    var2_9 = var3_4;
                                    if (var3_4 > 0) {
                                        this.F(0);
                                        var2_9 = var3_4 - 1;
                                    }
                                }
                                var3_4 = var2_9;
                                if (RecyclerView.K0) {
                                    var3_4 = var2_9;
                                    if (var2_9 > 0) {
                                        var3_4 = var2_9--;
                                        if (!this.h.i0.d(var1_1.c)) {
                                            while (var2_9 >= 0 && this.h.i0.d(var3_4 = this.c.get((int)var2_9).c)) {
                                                --var2_9;
                                            }
                                            var3_4 = var2_9 + 1;
                                        }
                                    }
                                }
                                this.c.add(var3_4, (F)var1_1);
                                var2_9 = 1;
                            } else {
                                var2_9 = 0;
                            }
                            if (var2_9 != 0) ** continue;
                            this.a((F)var1_1, true);
                            var3_4 = var4_5;
                        }
                        this.h.g.q((F)var1_1);
                        if (var2_9 == 0 && var3_4 == 0 && var5_3) {
                            ax.j0.a.a(var1_1.a);
                            var1_1.s = null;
                            var1_1.r = null;
                        }
                        return;
                    }
                    var1_1 = new StringBuilder();
                    var1_1.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                    var1_1.append(this.h.V());
                    throw new IllegalArgumentException(var1_1.toString());
                }
                var7_7 = new StringBuilder();
                var7_7.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                var7_7.append(var1_1);
                var7_7.append(this.h.V());
                throw new IllegalArgumentException(var7_7.toString());
            }
            var7_8 = new StringBuilder();
            var7_8.append("Scrapped or attached views may not be recycled. isScrap:");
            var7_8.append(var1_1.x());
            var7_8.append(" isAttached:");
            if (var1_1.a.getParent() != null) {
                var5_3 = true;
            }
            var7_8.append(var5_3);
            var7_8.append(this.h.V());
            throw new IllegalArgumentException(var7_8.toString());
        }

        void I(View object) {
            if (!((F)(object = RecyclerView.n0((View)object))).q(12) && ((F)object).z() && !this.h.s((F)object)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                ((F)object).I(this, true);
                this.b.add((F)object);
                return;
            }
            if (((F)object).u() && !((F)object).w() && !this.h.m.q()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                ((StringBuilder)object).append(this.h.V());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            ((F)object).I(this, false);
            this.a.add((F)object);
        }

        void J(v v8) {
            this.B(this.h.m);
            v v9 = this.g;
            if (v9 != null) {
                v9.d();
            }
            this.g = v8;
            if (v8 != null && this.h.getAdapter() != null) {
                this.g.a();
            }
            this.u();
        }

        void K(D d8) {
        }

        public void L(int n8) {
            this.e = n8;
            this.P();
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        F N(int var1_1, boolean var2_2, long var3_3) {
            block30: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                if (var1_1 < 0 || var1_1 >= this.h.j0.b()) break block30;
                                var10_4 = this.h.j0.e();
                                var9_5 = true;
                                if (!var10_4) break block31;
                                var16_8 = var15_6 /* !! */  = this.h(var1_1);
                                if (var15_6 /* !! */  == null) break block32;
                                var6_9 = 1;
                                var16_8 = var15_6 /* !! */ ;
                                break block33;
                            }
                            var16_8 = null;
                        }
                        var6_9 = 0;
                    }
                    var15_6 /* !! */  = var16_8;
                    var5_10 = var6_9;
                    if (var16_8 == null) {
                        var15_6 /* !! */  = var16_8 = this.m(var1_1, var2_2);
                        var5_10 = var6_9;
                        if (var16_8 != null) {
                            if (!this.Q((F)var16_8)) {
                                if (!var2_2) {
                                    var16_8.b(4);
                                    if (var16_8.x()) {
                                        this.h.removeDetachedView(var16_8.a, false);
                                        var16_8.L();
                                    } else if (var16_8.M()) {
                                        var16_8.e();
                                    }
                                    this.H((F)var16_8);
                                }
                                var15_6 /* !! */  = null;
                                var5_10 = var6_9;
                            } else {
                                var5_10 = 1;
                                var15_6 /* !! */  = var16_8;
                            }
                        }
                    }
                    var16_8 = var15_6 /* !! */ ;
                    var7_11 = var5_10;
                    if (var15_6 /* !! */  == null) {
                        var7_11 = this.h.e.m(var1_1);
                        if (var7_11 >= 0 && var7_11 < this.h.m.l()) {
                            var8_12 = this.h.m.n(var7_11);
                            var16_8 = var15_6 /* !! */ ;
                            var6_9 = var5_10;
                            if (this.h.m.q()) {
                                var16_8 = var15_6 /* !! */  = this.l(this.h.m.m(var7_11), var8_12, var2_2);
                                var6_9 = var5_10;
                                if (var15_6 /* !! */  != null) {
                                    var15_6 /* !! */ .c = var7_11;
                                    var6_9 = 1;
                                    var16_8 = var15_6 /* !! */ ;
                                }
                            }
                            var15_6 /* !! */  = var16_8;
                            if (var16_8 == null) {
                                if (RecyclerView.E0) {
                                    var15_6 /* !! */  = new StringBuilder();
                                    var15_6 /* !! */ .append("tryGetViewHolderForPositionByDeadline(");
                                    var15_6 /* !! */ .append(var1_1);
                                    var15_6 /* !! */ .append(") fetching from shared pool");
                                    Log.d((String)"RecyclerView", (String)var15_6 /* !! */ .toString());
                                }
                                var15_6 /* !! */  = var16_8 = this.i().h(var8_12);
                                if (var16_8 != null) {
                                    var16_8.E();
                                    var15_6 /* !! */  = var16_8;
                                    if (RecyclerView.H0) {
                                        this.r((F)var16_8);
                                        var15_6 /* !! */  = var16_8;
                                    }
                                }
                            }
                            var16_8 = var15_6 /* !! */ ;
                            var7_11 = var6_9;
                            if (var15_6 /* !! */  == null) {
                                var11_13 = this.h.getNanoTime();
                                if (var3_3 != 0x7FFFFFFFFFFFFFFFL && !this.g.n(var8_12, var11_13, var3_3)) {
                                    return null;
                                }
                                var15_6 /* !! */  = this.h;
                                var15_6 /* !! */  = var15_6 /* !! */ .m.j((ViewGroup)var15_6 /* !! */ , var8_12);
                                if (RecyclerView.K0 && (var16_8 = RecyclerView.c0(var15_6 /* !! */ .a)) != null) {
                                    var15_6 /* !! */ .b = new WeakReference<Object>(var16_8);
                                }
                                var13_14 = this.h.getNanoTime();
                                this.g.g(var8_12, var13_14 - var11_13);
                                var16_8 = var15_6 /* !! */ ;
                                var7_11 = var6_9;
                                if (RecyclerView.E0) {
                                    Log.d((String)"RecyclerView", (String)"tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                    var7_11 = var6_9;
                                    var16_8 = var15_6 /* !! */ ;
                                }
                            }
                        } else {
                            var15_6 /* !! */  = new StringBuilder();
                            var15_6 /* !! */ .append("Inconsistency detected. Invalid item position ");
                            var15_6 /* !! */ .append(var1_1);
                            var15_6 /* !! */ .append("(offset:");
                            var15_6 /* !! */ .append(var7_11);
                            var15_6 /* !! */ .append(").state:");
                            var15_6 /* !! */ .append(this.h.j0.b());
                            var15_6 /* !! */ .append(this.h.V());
                            throw new IndexOutOfBoundsException(var15_6 /* !! */ .toString());
                        }
                    }
                    if (var7_11 != 0 && !this.h.j0.e() && var16_8.q(8192)) {
                        var16_8.G(0, 8192);
                        if (this.h.j0.k) {
                            var5_10 = androidx.recyclerview.widget.RecyclerView$m.e((F)var16_8);
                            var15_6 /* !! */  = this.h;
                            var15_6 /* !! */  = var15_6 /* !! */ .O.u(var15_6 /* !! */ .j0, (F)var16_8, var5_10 | 4096, var16_8.p());
                            this.h.d1((F)var16_8, (m.c)var15_6 /* !! */ );
                        }
                    }
                    if (!this.h.j0.e() || !var16_8.t()) break block34;
                    var16_8.g = var1_1;
                    ** GOTO lbl-1000
                }
                if (var16_8.t() && !var16_8.A() && !var16_8.u()) lbl-1000:
                // 2 sources

                {
                    var2_2 = false;
                } else {
                    if (RecyclerView.D0 && var16_8.w()) {
                        var15_6 /* !! */  = new StringBuilder();
                        var15_6 /* !! */ .append("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        var15_6 /* !! */ .append(var16_8);
                        var15_6 /* !! */ .append(this.h.V());
                        throw new IllegalStateException(var15_6 /* !! */ .toString());
                    }
                    var2_2 = this.M((F)var16_8, this.h.e.m(var1_1), var1_1, var3_3);
                }
                var15_6 /* !! */  = var16_8.a.getLayoutParams();
                if (var15_6 /* !! */  == null) {
                    var15_6 /* !! */  = (q)this.h.generateDefaultLayoutParams();
                    var16_8.a.setLayoutParams((ViewGroup.LayoutParams)var15_6 /* !! */ );
                } else if (!this.h.checkLayoutParams((ViewGroup.LayoutParams)var15_6 /* !! */ )) {
                    var15_6 /* !! */  = (q)this.h.generateLayoutParams((ViewGroup.LayoutParams)var15_6 /* !! */ );
                    var16_8.a.setLayoutParams((ViewGroup.LayoutParams)var15_6 /* !! */ );
                } else {
                    var15_6 /* !! */  = (q)var15_6 /* !! */ ;
                }
                var15_6 /* !! */ .a = var16_8;
                var2_2 = var7_11 != 0 && var2_2 != false ? var9_5 : false;
                var15_6 /* !! */ .d = var2_2;
                return var16_8;
            }
            var15_7 = new StringBuilder();
            var15_7.append("Invalid item position ");
            var15_7.append(var1_1);
            var15_7.append("(");
            var15_7.append(var1_1);
            var15_7.append("). Item count:");
            var15_7.append(this.h.j0.b());
            var15_7.append(this.h.V());
            throw new IndexOutOfBoundsException(var15_7.toString());
        }

        void O(F f8) {
            if (f8.o) {
                this.b.remove(f8);
            } else {
                this.a.remove(f8);
            }
            f8.n = null;
            f8.o = false;
            f8.e();
        }

        void P() {
            p p8 = this.h.n;
            int n8 = p8 != null ? p8.m : 0;
            this.f = this.e + n8;
            for (n8 = this.c.size() - 1; n8 >= 0 && this.c.size() > this.f; --n8) {
                this.F(n8);
            }
        }

        boolean Q(F object) {
            if (((F)object).w()) {
                if (D0 && !this.h.j0.e()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("should not receive a removed view unless it is pre layout");
                    ((StringBuilder)object).append(this.h.V());
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
                return this.h.j0.e();
            }
            int n8 = ((F)object).c;
            if (n8 >= 0 && n8 < this.h.m.l()) {
                if (!this.h.j0.e() && this.h.m.n(((F)object).c) != ((F)object).m()) {
                    return false;
                }
                if (this.h.m.q()) {
                    return ((F)object).l() == this.h.m.m(((F)object).c);
                }
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
            stringBuilder.append(object);
            stringBuilder.append(this.h.V());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        void R(int n8, int n9) {
            for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
                int n10;
                F f8 = this.c.get(i8);
                if (f8 == null || (n10 = f8.c) < n8 || n10 >= n9 + n8) continue;
                f8.b(2);
                this.F(i8);
            }
        }

        void a(F f8, boolean bl) {
            RecyclerView.u(f8);
            View view = f8.a;
            ax.c0.a a8 = this.h.q0;
            if (a8 != null) {
                a8 = (a8 = a8.n()) instanceof q.a ? ((q.a)a8).n(view) : null;
                ax.c0.d0.l0(view, a8);
            }
            if (bl) {
                this.g(f8);
            }
            f8.s = null;
            f8.r = null;
            this.i().k(f8);
        }

        public void c() {
            this.a.clear();
            this.E();
        }

        void d() {
            int n8;
            int n9 = this.c.size();
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                this.c.get(n8).c();
            }
            n9 = this.a.size();
            for (n8 = 0; n8 < n9; ++n8) {
                this.a.get(n8).c();
            }
            ArrayList<F> arrayList = this.b;
            if (arrayList != null) {
                n9 = arrayList.size();
                for (n8 = n10; n8 < n9; ++n8) {
                    this.b.get(n8).c();
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

        public int f(int n8) {
            if (n8 >= 0 && n8 < this.h.j0.b()) {
                if (!this.h.j0.e()) {
                    return n8;
                }
                return this.h.e.m(n8);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid position ");
            stringBuilder.append(n8);
            stringBuilder.append(". State item count is ");
            stringBuilder.append(this.h.j0.b());
            stringBuilder.append(this.h.V());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        void g(F f8) {
            Object object = this.h.o;
            if (object != null) {
                object.a(f8);
            }
            int n8 = this.h.p.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.h.p.get(i8).a(f8);
            }
            object = this.h.m;
            if (object != null) {
                ((h)object).I(f8);
            }
            object = this.h;
            if (((RecyclerView)object).j0 != null) {
                ((RecyclerView)object).g.q(f8);
            }
            if (E0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("dispatchViewRecycled: ");
                ((StringBuilder)object).append(f8);
                Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
            }
        }

        F h(int n8) {
            int n9;
            Object object = this.b;
            if (object != null && (n9 = ((ArrayList)object).size()) != 0) {
                int n10 = 0;
                for (int i8 = 0; i8 < n9; ++i8) {
                    object = this.b.get(i8);
                    if (((F)object).M() || ((F)object).n() != n8) continue;
                    ((F)object).b(32);
                    return object;
                }
                if (this.h.m.q() && (n8 = this.h.e.m(n8)) > 0 && n8 < this.h.m.l()) {
                    long l8 = this.h.m.m(n8);
                    for (n8 = n10; n8 < n9; ++n8) {
                        object = this.b.get(n8);
                        if (((F)object).M() || ((F)object).l() != l8) continue;
                        ((F)object).b(32);
                        return object;
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.g == null) {
                this.g = new v();
                this.u();
            }
            return this.g;
        }

        int j() {
            return this.a.size();
        }

        public List<F> k() {
            return this.d;
        }

        F l(long l8, int n8, boolean bl) {
            F f8;
            int n9;
            for (n9 = this.a.size() - 1; n9 >= 0; --n9) {
                f8 = this.a.get(n9);
                if (f8.l() != l8 || f8.M()) continue;
                if (n8 == f8.m()) {
                    f8.b(32);
                    if (f8.w() && !this.h.j0.e()) {
                        f8.G(2, 14);
                    }
                    return f8;
                }
                if (bl) continue;
                this.a.remove(n9);
                this.h.removeDetachedView(f8.a, false);
                this.D(f8.a);
            }
            for (n9 = this.c.size() - 1; n9 >= 0; --n9) {
                f8 = this.c.get(n9);
                if (f8.l() != l8 || f8.s()) continue;
                if (n8 == f8.m()) {
                    if (!bl) {
                        this.c.remove(n9);
                    }
                    return f8;
                }
                if (bl) continue;
                this.F(n9);
                return null;
            }
            return null;
        }

        F m(int n8, boolean bl) {
            Object object;
            F f8;
            int n9;
            int n10 = this.a.size();
            int n11 = 0;
            for (n9 = 0; n9 < n10; ++n9) {
                f8 = this.a.get(n9);
                if (f8.M() || f8.n() != n8 || f8.u() || !this.h.j0.h && f8.w()) continue;
                f8.b(32);
                return f8;
            }
            if (!bl && (object = this.h.f.e(n8)) != null) {
                f8 = RecyclerView.n0((View)object);
                this.h.f.s((View)object);
                n8 = this.h.f.m((View)object);
                if (n8 != -1) {
                    this.h.f.d(n8);
                    this.I((View)object);
                    f8.b(8224);
                    return f8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("layout index should not be -1 after unhiding a view:");
                ((StringBuilder)object).append(f8);
                ((StringBuilder)object).append(this.h.V());
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            n10 = this.c.size();
            for (n9 = n11; n9 < n10; ++n9) {
                f8 = this.c.get(n9);
                if (f8.u() || f8.n() != n8 || f8.s()) continue;
                if (!bl) {
                    this.c.remove(n9);
                }
                if (E0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("getScrapOrHiddenOrCachedHolderForPosition(");
                    ((StringBuilder)object).append(n8);
                    ((StringBuilder)object).append(") found match in cache: ");
                    ((StringBuilder)object).append(f8);
                    Log.d((String)"RecyclerView", (String)((StringBuilder)object).toString());
                }
                return f8;
            }
            return null;
        }

        View n(int n8) {
            return this.a.get((int)n8).a;
        }

        public View o(int n8) {
            return this.p(n8, false);
        }

        View p(int n8, boolean bl) {
            return this.N((int)n8, (boolean)bl, (long)Long.MAX_VALUE).a;
        }

        void s() {
            int n8 = this.c.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                q q8 = (q)this.c.get((int)i8).a.getLayoutParams();
                if (q8 == null) continue;
                q8.c = true;
            }
        }

        void t() {
            Object object;
            int n8 = this.c.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = this.c.get(i8);
                if (object == null) continue;
                ((F)object).b(6);
                ((F)object).a(null);
            }
            object = this.h.m;
            if (object != null && ((h)object).q()) {
                return;
            }
            this.E();
        }

        void v(int n8, int n9) {
            int n10 = this.c.size();
            for (int i8 = 0; i8 < n10; ++i8) {
                F f8 = this.c.get(i8);
                if (f8 == null || f8.c < n8) continue;
                if (E0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("offsetPositionRecordsForInsert cached ");
                    stringBuilder.append(i8);
                    stringBuilder.append(" holder ");
                    stringBuilder.append(f8);
                    stringBuilder.append(" now at position ");
                    stringBuilder.append(f8.c + n9);
                    Log.d((String)"RecyclerView", (String)stringBuilder.toString());
                }
                f8.B(n9, false);
            }
        }

        void w(int n8, int n9) {
            int n10;
            int n11;
            int n12;
            if (n8 < n9) {
                n12 = -1;
                n11 = n8;
                n10 = n9;
            } else {
                n12 = 1;
                n10 = n8;
                n11 = n9;
            }
            int n13 = this.c.size();
            for (int i8 = 0; i8 < n13; ++i8) {
                int n14;
                F f8 = this.c.get(i8);
                if (f8 == null || (n14 = f8.c) < n11 || n14 > n10) continue;
                if (n14 == n8) {
                    f8.B(n9 - n8, false);
                } else {
                    f8.B(n12, false);
                }
                if (!E0) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offsetPositionRecordsForMove cached child ");
                stringBuilder.append(i8);
                stringBuilder.append(" holder ");
                stringBuilder.append(f8);
                Log.d((String)"RecyclerView", (String)stringBuilder.toString());
            }
        }

        void x(int n8, int n9, boolean bl) {
            for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
                F f8 = this.c.get(i8);
                if (f8 == null) continue;
                int n10 = f8.c;
                if (n10 >= n8 + n9) {
                    if (E0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("offsetPositionRecordsForRemove cached ");
                        stringBuilder.append(i8);
                        stringBuilder.append(" holder ");
                        stringBuilder.append(f8);
                        stringBuilder.append(" now at position ");
                        stringBuilder.append(f8.c - n9);
                        Log.d((String)"RecyclerView", (String)stringBuilder.toString());
                    }
                    f8.B(-n9, bl);
                    continue;
                }
                if (n10 < n8) continue;
                f8.b(8);
                this.F(i8);
            }
        }

        void y(h<?> h8, h<?> h9, boolean bl) {
            this.c();
            this.C(h8, true);
            this.i().j(h8, h9, bl);
            this.u();
        }

        void z() {
            this.u();
        }
    }

    public static interface x {
        public void a(F var1);
    }

    private class y
    extends j {
        final RecyclerView a;

        y(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override
        public void a() {
            this.a.r(null);
            RecyclerView recyclerView = this.a;
            recyclerView.j0.g = true;
            recyclerView.b1(true);
            if (!this.a.e.p()) {
                this.a.requestLayout();
            }
        }

        @Override
        public void c(int n8, int n9, Object object) {
            this.a.r(null);
            if (this.a.e.r(n8, n9, object)) {
                this.h();
            }
        }

        @Override
        public void d(int n8, int n9) {
            this.a.r(null);
            if (this.a.e.s(n8, n9)) {
                this.h();
            }
        }

        @Override
        public void e(int n8, int n9, int n10) {
            this.a.r(null);
            if (this.a.e.t(n8, n9, n10)) {
                this.h();
            }
        }

        @Override
        public void f(int n8, int n9) {
            this.a.r(null);
            if (this.a.e.u(n8, n9)) {
                this.h();
            }
        }

        @Override
        public void g() {
            Object object = this.a;
            if (((RecyclerView)object).d != null && (object = ((RecyclerView)object).m) != null && ((h)object).i()) {
                this.a.requestLayout();
            }
        }

        void h() {
            RecyclerView recyclerView;
            if (J0) {
                recyclerView = this.a;
                if (recyclerView.u && recyclerView.t) {
                    ax.c0.d0.d0((View)recyclerView, recyclerView.i);
                    return;
                }
            }
            recyclerView = this.a;
            recyclerView.C = true;
            recyclerView.requestLayout();
        }
    }

    public static class z
    extends ax.k0.a {
        public static final Parcelable.Creator<z> CREATOR = new Parcelable.ClassLoaderCreator<z>(){

            public z a(Parcel parcel) {
                return new z(parcel, null);
            }

            public z b(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            public z[] c(int n8) {
                return new z[n8];
            }
        };
        Parcelable d0;

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = p.class.getClassLoader();
            }
            this.d0 = parcel.readParcelable(classLoader);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }

        void b(z z8) {
            this.d0 = z8.d0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeParcelable(this.d0, 0);
        }
    }
}

