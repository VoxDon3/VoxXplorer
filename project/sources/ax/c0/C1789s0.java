package ax.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import ax.c0.F0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: ax.c0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789s0 {
    private e a;

    /* renamed from: ax.c0.s0$b */
    public static abstract class b {
        WindowInsets a;
        private final int b;

        public b(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public abstract void b(C1789s0 c1789s0);

        public abstract void c(C1789s0 c1789s0);

        public abstract F0 d(F0 f0, List<C1789s0> list);

        public abstract a e(C1789s0 c1789s0, a aVar);
    }

    /* renamed from: ax.c0.s0$c */
    private static class c extends e {
        private static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator f = new ax.D0.a();
        private static final Interpolator g = new DecelerateInterpolator();

        /* renamed from: ax.c0.s0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {
            final b a;
            private F0 b;

            /* renamed from: ax.c0.s0$c$a$a, reason: collision with other inner class name */
            class C0267a implements ValueAnimator.AnimatorUpdateListener {
                final /* synthetic */ C1789s0 a;
                final /* synthetic */ F0 b;
                final /* synthetic */ F0 c;
                final /* synthetic */ int d;
                final /* synthetic */ View e;

                C0267a(C1789s0 c1789s0, F0 f0, F0 f02, int i, View view) {
                    this.a = c1789s0;
                    this.b = f0;
                    this.c = f02;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.e, c.o(this.b, this.c, this.a.b(), this.d), Collections.singletonList(this.a));
                }
            }

            /* renamed from: ax.c0.s0$c$a$b */
            class b extends AnimatorListenerAdapter {
                final /* synthetic */ C1789s0 a;
                final /* synthetic */ View b;

                b(C1789s0 c1789s0, View view) {
                    this.a = c1789s0;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.e(1.0f);
                    c.i(this.b, this.a);
                }
            }

            /* renamed from: ax.c0.s0$c$a$c, reason: collision with other inner class name */
            class RunnableC0268c implements Runnable {
                final /* synthetic */ C1789s0 c0;
                final /* synthetic */ a d0;
                final /* synthetic */ ValueAnimator e0;
                final /* synthetic */ View q;

                RunnableC0268c(View view, C1789s0 c1789s0, a aVar, ValueAnimator valueAnimator) {
                    this.q = view;
                    this.c0 = c1789s0;
                    this.d0 = aVar;
                    this.e0 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.q, this.c0, this.d0);
                    this.e0.start();
                }
            }

            a(View view, b bVar) {
                this.a = bVar;
                F0 G = C1760d0.G(view);
                this.b = G != null ? new F0.b(G).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = F0.w(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                F0 w = F0.w(windowInsets, view);
                if (this.b == null) {
                    this.b = C1760d0.G(view);
                }
                if (this.b == null) {
                    this.b = w;
                    return c.m(view, windowInsets);
                }
                b n = c.n(view);
                if (n != null && Objects.equals(n.a, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int e = c.e(w, this.b);
                if (e == 0) {
                    return c.m(view, windowInsets);
                }
                F0 f0 = this.b;
                C1789s0 c1789s0 = new C1789s0(e, c.g(e, w, f0), 160L);
                c1789s0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1789s0.a());
                a f = c.f(w, f0, e);
                c.j(view, c1789s0, windowInsets, false);
                duration.addUpdateListener(new C0267a(c1789s0, w, f0, e, view));
                duration.addListener(new b(c1789s0, view));
                L.a(view, new RunnableC0268c(view, c1789s0, f, duration));
                this.b = w;
                return c.m(view, windowInsets);
            }
        }

        c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        static int e(F0 f0, F0 f02) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!f0.f(i2).equals(f02.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        static a f(F0 f0, F0 f02, int i) {
            ax.T.b f2 = f0.f(i);
            ax.T.b f3 = f02.f(i);
            return new a(ax.T.b.b(Math.min(f2.a, f3.a), Math.min(f2.b, f3.b), Math.min(f2.c, f3.c), Math.min(f2.d, f3.d)), ax.T.b.b(Math.max(f2.a, f3.a), Math.max(f2.b, f3.b), Math.max(f2.c, f3.c), Math.max(f2.d, f3.d)));
        }

        static Interpolator g(int i, F0 f0, F0 f02) {
            return (i & 8) != 0 ? f0.f(F0.m.c()).d > f02.f(F0.m.c()).d ? e : f : g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C1789s0 c1789s0) {
            b n = n(view);
            if (n != null) {
                n.b(c1789s0);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), c1789s0);
                }
            }
        }

        static void j(View view, C1789s0 c1789s0, WindowInsets windowInsets, boolean z) {
            b n = n(view);
            if (n != null) {
                n.a = windowInsets;
                if (!z) {
                    n.c(c1789s0);
                    z = n.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), c1789s0, windowInsets, z);
                }
            }
        }

        static void k(View view, F0 f0, List<C1789s0> list) {
            b n = n(view);
            if (n != null) {
                f0 = n.d(f0, list);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), f0, list);
                }
            }
        }

        static void l(View view, C1789s0 c1789s0, a aVar) {
            b n = n(view);
            if (n != null) {
                n.e(c1789s0, aVar);
                if (n.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), c1789s0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(ax.O.e.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(ax.O.e.S);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static F0 o(F0 f0, F0 f02, float f2, int i) {
            F0.b bVar = new F0.b(f0);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.b(i2, f0.f(i2));
                } else {
                    ax.T.b f3 = f0.f(i2);
                    ax.T.b f4 = f02.f(i2);
                    float f5 = 1.0f - f2;
                    bVar.b(i2, F0.n(f3, (int) (((f3.a - f4.a) * f5) + 0.5d), (int) (((f3.b - f4.b) * f5) + 0.5d), (int) (((f3.c - f4.c) * f5) + 0.5d), (int) (((f3.d - f4.d) * f5) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(ax.O.e.L);
            if (bVar == null) {
                view.setTag(ax.O.e.S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h = h(view, bVar);
            view.setTag(ax.O.e.S, h);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h);
            }
        }
    }

    /* renamed from: ax.c0.s0$e */
    private static class e {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;

        e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public C1789s0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C1789s0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1789s0(windowInsetsAnimation);
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void e(float f) {
        this.a.d(f);
    }

    /* renamed from: ax.c0.s0$d */
    private static class d extends e {
        private final WindowInsetsAnimation e;

        /* renamed from: ax.c0.s0$d$a */
        private static class a extends WindowInsetsAnimation.Callback {
            private final b a;
            private List<C1789s0> b;
            private ArrayList<C1789s0> c;
            private final HashMap<WindowInsetsAnimation, C1789s0> d;

            a(b bVar) {
                super(bVar.a());
                this.d = new HashMap<>();
                this.a = bVar;
            }

            private C1789s0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C1789s0 c1789s0 = this.d.get(windowInsetsAnimation);
                if (c1789s0 != null) {
                    return c1789s0;
                }
                C1789s0 f = C1789s0.f(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, f);
                return f;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C1789s0> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<C1789s0> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = D0.a(list.get(size));
                    C1789s0 a2 = a(a);
                    fraction = a.getFraction();
                    a2.e(fraction);
                    this.c.add(a2);
                }
                return this.a.d(F0.v(windowInsets), this.b).u();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            A0.a();
            return C1803z0.a(aVar.a().e(), aVar.b().e());
        }

        public static ax.T.b f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return ax.T.b.d(upperBound);
        }

        public static ax.T.b g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return ax.T.b.d(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // ax.c0.C1789s0.e
        public long a() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // ax.c0.C1789s0.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // ax.c0.C1789s0.e
        public int c() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // ax.c0.C1789s0.e
        public void d(float f) {
            this.e.setFraction(f);
        }

        d(int i, Interpolator interpolator, long j) {
            this(C1801y0.a(i, interpolator, j));
        }
    }

    /* renamed from: ax.c0.s0$a */
    public static final class a {
        private final ax.T.b a;
        private final ax.T.b b;

        public a(ax.T.b bVar, ax.T.b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public ax.T.b a() {
            return this.a;
        }

        public ax.T.b b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }
    }

    private C1789s0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }
}
