/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import ax.c0.A0;
import ax.c0.B0;
import ax.c0.C0;
import ax.c0.D0;
import ax.c0.E0;
import ax.c0.F0;
import ax.c0.L;
import ax.c0.d0;
import ax.c0.t0;
import ax.c0.u0;
import ax.c0.v0;
import ax.c0.w0;
import ax.c0.x0;
import ax.c0.y0;
import ax.c0.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class s0 {
    private e a;

    public s0(int n8, Interpolator interpolator, long l8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(n8, interpolator, l8);
            return;
        }
        this.a = new c(n8, interpolator, l8);
    }

    private s0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }

    static void d(View view, b b8) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, b8);
            return;
        }
        c.p(view, b8);
    }

    static s0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new s0(windowInsetsAnimation);
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

    public void e(float f8) {
        this.a.d(f8);
    }

    public static final class a {
        private final ax.T.b a;
        private final ax.T.b b;

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }

        public a(ax.T.b b8, ax.T.b b9) {
            this.a = b8;
            this.b = b9;
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
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bounds{lower=");
            stringBuilder.append(this.a);
            stringBuilder.append(" upper=");
            stringBuilder.append(this.b);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public static abstract class b {
        WindowInsets a;
        private final int b;

        public b(int n8) {
            this.b = n8;
        }

        public final int a() {
            return this.b;
        }

        public abstract void b(s0 var1);

        public abstract void c(s0 var1);

        public abstract F0 d(F0 var1, List<s0> var2);

        public abstract a e(s0 var1, a var2);
    }

    private static class c
    extends e {
        private static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator f = new ax.D0.a();
        private static final Interpolator g = new DecelerateInterpolator();

        c(int n8, Interpolator interpolator, long l8) {
            super(n8, interpolator, l8);
        }

        @SuppressLint(value={"WrongConstant"})
        static int e(F0 f02, F0 f03) {
            int n8 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                int n9 = n8;
                if (!f02.f(i8).equals(f03.f(i8))) {
                    n9 = n8 | i8;
                }
                n8 = n9;
            }
            return n8;
        }

        static ax.c0.s0$a f(F0 object, F0 object2, int n8) {
            object = ((F0)object).f(n8);
            object2 = ((F0)object2).f(n8);
            return new ax.c0.s0$a(ax.T.b.b(Math.min(((ax.T.b)object).a, ((ax.T.b)object2).a), Math.min(((ax.T.b)object).b, ((ax.T.b)object2).b), Math.min(((ax.T.b)object).c, ((ax.T.b)object2).c), Math.min(((ax.T.b)object).d, ((ax.T.b)object2).d)), ax.T.b.b(Math.max(((ax.T.b)object).a, ((ax.T.b)object2).a), Math.max(((ax.T.b)object).b, ((ax.T.b)object2).b), Math.max(((ax.T.b)object).c, ((ax.T.b)object2).c), Math.max(((ax.T.b)object).d, ((ax.T.b)object2).d)));
        }

        static Interpolator g(int n8, F0 f02, F0 f03) {
            if ((n8 & 8) != 0) {
                if (f02.f((int)F0.m.c()).d > f03.f((int)F0.m.c()).d) {
                    return e;
                }
                return f;
            }
            return g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b b8) {
            return new a(view, b8);
        }

        static void i(View view, s0 s02) {
            block6: {
                block5: {
                    b b8 = c.n(view);
                    if (b8 == null) break block5;
                    b8.b(s02);
                    if (b8.a() == 0) break block6;
                }
                if (view instanceof ViewGroup) {
                    view = (ViewGroup)view;
                    for (int i8 = 0; i8 < view.getChildCount(); ++i8) {
                        c.i(view.getChildAt(i8), s02);
                    }
                }
            }
        }

        static void j(View view, s0 s02, WindowInsets windowInsets, boolean bl) {
            b b8 = c.n(view);
            int n8 = 0;
            boolean bl2 = bl;
            if (b8 != null) {
                b8.a = windowInsets;
                bl2 = bl;
                if (!bl) {
                    b8.c(s02);
                    bl2 = b8.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                while (n8 < view.getChildCount()) {
                    c.j(view.getChildAt(n8), s02, windowInsets, bl2);
                    ++n8;
                }
            }
        }

        static void k(View view, F0 f02, List<s0> list) {
            block6: {
                F0 f03;
                block5: {
                    b b8 = c.n(view);
                    f03 = f02;
                    if (b8 == null) break block5;
                    f03 = b8.d(f02, list);
                    if (b8.a() == 0) break block6;
                }
                if (view instanceof ViewGroup) {
                    view = (ViewGroup)view;
                    for (int i8 = 0; i8 < view.getChildCount(); ++i8) {
                        c.k(view.getChildAt(i8), f03, list);
                    }
                }
            }
        }

        static void l(View view, s0 s02, ax.c0.s0$a a8) {
            block6: {
                block5: {
                    b b8 = c.n(view);
                    if (b8 == null) break block5;
                    b8.e(s02, a8);
                    if (b8.a() == 0) break block6;
                }
                if (view instanceof ViewGroup) {
                    view = (ViewGroup)view;
                    for (int i8 = 0; i8 < view.getChildCount(); ++i8) {
                        c.l(view.getChildAt(i8), s02, a8);
                    }
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            if (view.getTag(ax.O.e.L) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        static b n(View object) {
            if ((object = object.getTag(ax.O.e.S)) instanceof a) {
                return ((a)object).a;
            }
            return null;
        }

        @SuppressLint(value={"WrongConstant"})
        static F0 o(F0 f02, F0 f03, float f8, int n8) {
            F0.b b8 = new F0.b(f02);
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) {
                    b8.b(i8, f02.f(i8));
                    continue;
                }
                ax.T.b b9 = f02.f(i8);
                ax.T.b b10 = f03.f(i8);
                float f9 = b9.a - b10.a;
                float f10 = 1.0f - f8;
                b8.b(i8, F0.n(b9, (int)((double)(f9 * f10) + 0.5), (int)((double)((float)(b9.b - b10.b) * f10) + 0.5), (int)((double)((float)(b9.c - b10.c) * f10) + 0.5), (int)((double)((float)(b9.d - b10.d) * f10) + 0.5)));
            }
            return b8.a();
        }

        static void p(View view, b b8) {
            Object object = view.getTag(ax.O.e.L);
            if (b8 == null) {
                view.setTag(ax.O.e.S, null);
                if (object == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
            } else {
                b8 = c.h(view, b8);
                view.setTag(ax.O.e.S, (Object)b8);
                if (object == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)b8);
                }
            }
        }

        private static class a
        implements View.OnApplyWindowInsetsListener {
            final b a;
            private F0 b;

            a(View object, b b8) {
                this.a = b8;
                object = d0.G(object);
                object = object != null ? new F0.b((F0)object).a() : null;
                this.b = object;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = F0.w(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                F0 f02 = F0.w(windowInsets, view);
                if (this.b == null) {
                    this.b = d0.G(view);
                }
                if (this.b == null) {
                    this.b = f02;
                    return c.m(view, windowInsets);
                }
                Object object = c.n(view);
                if (object != null && j.Objects.equals((Object)((b)object).a, (Object)windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int n8 = c.e(f02, this.b);
                if (n8 == 0) {
                    return c.m(view, windowInsets);
                }
                object = this.b;
                s0 s02 = new s0(n8, c.g(n8, f02, (F0)object), 160L);
                s02.e(0.0f);
                ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f}).setDuration(s02.a());
                ax.c0.s0$a a8 = c.f(f02, (F0)object, n8);
                c.j(view, s02, windowInsets, false);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(){
                    final s0 a;
                    final F0 b;
                    final F0 c;
                    final int d;
                    final View e;
                    final a f;
                    {
                        this.f = a8;
                        this.a = s02;
                        this.b = f02;
                        this.c = f03;
                        this.d = n8;
                        this.e = view;
                    }

                    public void onAnimationUpdate(ValueAnimator object) {
                        this.a.e(object.getAnimatedFraction());
                        object = c.o(this.b, this.c, this.a.b(), this.d);
                        List<s0> list = Collections.singletonList(this.a);
                        c.k(this.e, (F0)object, list);
                    }
                });
                valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, s02, view){
                    final s0 a;
                    final View b;
                    final a c;
                    {
                        this.c = a8;
                        this.a = s02;
                        this.b = view;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.a.e(1.0f);
                        c.i(this.b, this.a);
                    }
                });
                L.a(view, new Runnable(){
                    final s0 c0;
                    final ax.c0.s0$a d0;
                    final ValueAnimator e0;
                    final a f0;
                    final View q;
                    {
                        this.f0 = a8;
                        this.q = view;
                        this.c0 = s02;
                        this.d0 = a9;
                        this.e0 = valueAnimator;
                    }

                    @Override
                    public void run() {
                        c.l(this.q, this.c0, this.d0);
                        this.e0.start();
                    }
                });
                this.b = f02;
                return c.m(view, windowInsets);
            }
        }
    }

    private static class d
    extends e {
        private final WindowInsetsAnimation e;

        d(int n8, Interpolator interpolator, long l8) {
            this(y0.a(n8, interpolator, l8));
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(ax.c0.s0$a a8) {
            A0.a();
            return z0.a(a8.a().e(), a8.b().e());
        }

        public static ax.T.b f(WindowInsetsAnimation.Bounds bounds) {
            return ax.T.b.d(B0.a(bounds));
        }

        public static ax.T.b g(WindowInsetsAnimation.Bounds bounds) {
            return ax.T.b.d(C0.a(bounds));
        }

        public static void h(View view, b object) {
            object = object != null ? new a((b)object) : null;
            x0.a(view, (WindowInsetsAnimation.Callback)object);
        }

        @Override
        public long a() {
            return t0.a(this.e);
        }

        @Override
        public float b() {
            return w0.a(this.e);
        }

        @Override
        public int c() {
            return u0.a(this.e);
        }

        @Override
        public void d(float f8) {
            v0.a(this.e, f8);
        }

        private static class a
        extends WindowInsetsAnimation.Callback {
            private final b a;
            private List<s0> b;
            private ArrayList<s0> c;
            private final HashMap<WindowInsetsAnimation, s0> d = new HashMap();

            a(b b8) {
                super(b8.a());
                this.a = b8;
            }

            private s0 a(WindowInsetsAnimation windowInsetsAnimation) {
                s0 s02;
                s0 s03 = s02 = this.d.get(windowInsetsAnimation);
                if (s02 == null) {
                    s03 = s0.f(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, s03);
                }
                return s03;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(this.a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(this.a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<s0> arrayList = this.c;
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                    this.c = arrayList;
                    this.b = java.util.DesugarCollections.unmodifiableList(arrayList);
                } else {
                    arrayList.clear();
                }
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    WindowInsetsAnimation windowInsetsAnimation = D0.a(list.get(i8));
                    arrayList = this.a(windowInsetsAnimation);
                    ((s0)((Object)arrayList)).e(E0.a(windowInsetsAnimation));
                    this.c.add((s0)((Object)arrayList));
                }
                return this.a.d(F0.v(windowInsets), this.b).u();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.e(this.a(windowInsetsAnimation), ax.c0.s0$a.d(bounds)).c();
            }
        }
    }

    private static class e {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;

        e(int n8, Interpolator interpolator, long l8) {
            this.a = n8;
            this.c = interpolator;
            this.d = l8;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.b);
            }
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f8) {
            this.b = f8;
        }
    }
}

