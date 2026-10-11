package ax.c0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import ax.b0.C1441b;
import ax.b0.C1446g;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class F0 {
    public static final F0 b;
    private final l a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static F0 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            F0 a2 = new b().c(ax.T.b.c(rect)).d(ax.T.b.c(rect2)).a();
                            a2.s(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // ax.c0.F0.f
        void c(int i, ax.T.b bVar) {
            this.c.setInsets(n.a(i), bVar.e());
        }

        e(F0 f0) {
            super(f0);
        }
    }

    private static class f {
        private final F0 a;
        ax.T.b[] b;

        f() {
            this(new F0((F0) null));
        }

        protected final void a() {
            ax.T.b[] bVarArr = this.b;
            if (bVarArr != null) {
                ax.T.b bVar = bVarArr[m.d(1)];
                ax.T.b bVar2 = this.b[m.d(2)];
                if (bVar2 == null) {
                    bVar2 = this.a.f(2);
                }
                if (bVar == null) {
                    bVar = this.a.f(1);
                }
                g(ax.T.b.a(bVar, bVar2));
                ax.T.b bVar3 = this.b[m.d(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                ax.T.b bVar4 = this.b[m.d(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                ax.T.b bVar5 = this.b[m.d(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        F0 b() {
            throw null;
        }

        void c(int i, ax.T.b bVar) {
            if (this.b == null) {
                this.b = new ax.T.b[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.d(i2)] = bVar;
                }
            }
        }

        void e(ax.T.b bVar) {
            throw null;
        }

        void g(ax.T.b bVar) {
            throw null;
        }

        f(F0 f0) {
            this.a = f0;
        }

        void d(ax.T.b bVar) {
        }

        void f(ax.T.b bVar) {
        }

        void h(ax.T.b bVar) {
        }
    }

    private static class i extends h {
        i(F0 f0, WindowInsets windowInsets) {
            super(f0, windowInsets);
        }

        @Override // ax.c0.F0.l
        F0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.c.consumeDisplayCutout();
            return F0.v(consumeDisplayCutout);
        }

        @Override // ax.c0.F0.g, ax.c0.F0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.g, iVar.g);
        }

        @Override // ax.c0.F0.l
        r f() {
            DisplayCutout displayCutout;
            displayCutout = this.c.getDisplayCutout();
            return r.e(displayCutout);
        }

        @Override // ax.c0.F0.l
        public int hashCode() {
            return this.c.hashCode();
        }

        i(F0 f0, i iVar) {
            super(f0, iVar);
        }
    }

    private static class k extends j {
        static final F0 q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            q = F0.v(windowInsets);
        }

        k(F0 f0, WindowInsets windowInsets) {
            super(f0, windowInsets);
        }

        @Override // ax.c0.F0.g, ax.c0.F0.l
        public ax.T.b g(int i) {
            Insets insets;
            insets = this.c.getInsets(n.a(i));
            return ax.T.b.d(insets);
        }

        k(F0 f0, k kVar) {
            super(f0, kVar);
        }

        @Override // ax.c0.F0.g, ax.c0.F0.l
        final void d(View view) {
        }
    }

    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class n {
        static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.b;
        }
    }

    private F0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new i(this, windowInsets);
        } else {
            this.a = new h(this, windowInsets);
        }
    }

    static ax.T.b n(ax.T.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.b - i3);
        int max3 = Math.max(0, bVar.c - i4);
        int max4 = Math.max(0, bVar.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : ax.T.b.b(max, max2, max3, max4);
    }

    public static F0 v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static F0 w(WindowInsets windowInsets, View view) {
        F0 f0 = new F0((WindowInsets) C1446g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            f0.s(C1760d0.G(view));
            f0.d(view.getRootView());
        }
        return f0;
    }

    @Deprecated
    public F0 a() {
        return this.a.a();
    }

    @Deprecated
    public F0 b() {
        return this.a.b();
    }

    @Deprecated
    public F0 c() {
        return this.a.c();
    }

    void d(View view) {
        this.a.d(view);
    }

    public r e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F0) {
            return C1441b.a(this.a, ((F0) obj).a);
        }
        return false;
    }

    public ax.T.b f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public ax.T.b g() {
        return this.a.i();
    }

    @Deprecated
    public ax.T.b h() {
        return this.a.j();
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().d;
    }

    @Deprecated
    public int j() {
        return this.a.k().a;
    }

    @Deprecated
    public int k() {
        return this.a.k().c;
    }

    @Deprecated
    public int l() {
        return this.a.k().b;
    }

    public F0 m(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean o() {
        return this.a.n();
    }

    @Deprecated
    public F0 p(int i2, int i3, int i4, int i5) {
        return new b(this).d(ax.T.b.b(i2, i3, i4, i5)).a();
    }

    void q(ax.T.b[] bVarArr) {
        this.a.p(bVarArr);
    }

    void r(ax.T.b bVar) {
        this.a.q(bVar);
    }

    void s(F0 f0) {
        this.a.r(f0);
    }

    void t(ax.T.b bVar) {
        this.a.s(bVar);
    }

    public WindowInsets u() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }

    private static class c extends f {
        private static Field e = null;
        private static boolean f = false;
        private static Constructor<WindowInsets> g = null;
        private static boolean h = false;
        private WindowInsets c;
        private ax.T.b d;

        c() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // ax.c0.F0.f
        F0 b() {
            a();
            F0 v = F0.v(this.c);
            v.q(this.b);
            v.t(this.d);
            return v;
        }

        @Override // ax.c0.F0.f
        void e(ax.T.b bVar) {
            this.d = bVar;
        }

        @Override // ax.c0.F0.f
        void g(ax.T.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.d);
            }
        }

        c(F0 f0) {
            super(f0);
            this.c = f0.u();
        }
    }

    private static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = N0.a();
        }

        @Override // ax.c0.F0.f
        F0 b() {
            WindowInsets build;
            a();
            build = this.c.build();
            F0 v = F0.v(build);
            v.q(this.b);
            return v;
        }

        @Override // ax.c0.F0.f
        void d(ax.T.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // ax.c0.F0.f
        void e(ax.T.b bVar) {
            this.c.setStableInsets(bVar.e());
        }

        @Override // ax.c0.F0.f
        void f(ax.T.b bVar) {
            this.c.setSystemGestureInsets(bVar.e());
        }

        @Override // ax.c0.F0.f
        void g(ax.T.b bVar) {
            this.c.setSystemWindowInsets(bVar.e());
        }

        @Override // ax.c0.F0.f
        void h(ax.T.b bVar) {
            this.c.setTappableElementInsets(bVar.e());
        }

        d(F0 f0) {
            super(f0);
            WindowInsets.Builder a;
            WindowInsets u = f0.u();
            if (u != null) {
                a = M0.a(u);
            } else {
                a = N0.a();
            }
            this.c = a;
        }
    }

    private static class h extends g {
        private ax.T.b m;

        h(F0 f0, WindowInsets windowInsets) {
            super(f0, windowInsets);
            this.m = null;
        }

        @Override // ax.c0.F0.l
        F0 b() {
            return F0.v(this.c.consumeStableInsets());
        }

        @Override // ax.c0.F0.l
        F0 c() {
            return F0.v(this.c.consumeSystemWindowInsets());
        }

        @Override // ax.c0.F0.l
        final ax.T.b i() {
            if (this.m == null) {
                this.m = ax.T.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // ax.c0.F0.l
        boolean n() {
            return this.c.isConsumed();
        }

        @Override // ax.c0.F0.l
        public void s(ax.T.b bVar) {
            this.m = bVar;
        }

        h(F0 f0, h hVar) {
            super(f0, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    private static class g extends l {
        private static boolean h = false;
        private static Method i;
        private static Class<?> j;
        private static Field k;
        private static Field l;
        final WindowInsets c;
        private ax.T.b[] d;
        private ax.T.b e;
        private F0 f;
        ax.T.b g;

        g(F0 f0, WindowInsets windowInsets) {
            super(f0);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private ax.T.b t(int i2, boolean z) {
            ax.T.b bVar = ax.T.b.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = ax.T.b.a(bVar, u(i3, z));
                }
            }
            return bVar;
        }

        private ax.T.b v() {
            F0 f0 = this.f;
            return f0 != null ? f0.g() : ax.T.b.e;
        }

        private ax.T.b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                x();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect != null) {
                        return ax.T.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @Override // ax.c0.F0.l
        void d(View view) {
            ax.T.b w = w(view);
            if (w == null) {
                w = ax.T.b.e;
            }
            q(w);
        }

        @Override // ax.c0.F0.l
        void e(F0 f0) {
            f0.s(this.f);
            f0.r(this.g);
        }

        @Override // ax.c0.F0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((g) obj).g);
            }
            return false;
        }

        @Override // ax.c0.F0.l
        public ax.T.b g(int i2) {
            return t(i2, false);
        }

        @Override // ax.c0.F0.l
        final ax.T.b k() {
            if (this.e == null) {
                this.e = ax.T.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // ax.c0.F0.l
        F0 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(F0.v(this.c));
            bVar.d(F0.n(k(), i2, i3, i4, i5));
            bVar.c(F0.n(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // ax.c0.F0.l
        boolean o() {
            return this.c.isRound();
        }

        @Override // ax.c0.F0.l
        public void p(ax.T.b[] bVarArr) {
            this.d = bVarArr;
        }

        @Override // ax.c0.F0.l
        void q(ax.T.b bVar) {
            this.g = bVar;
        }

        @Override // ax.c0.F0.l
        void r(F0 f0) {
            this.f = f0;
        }

        protected ax.T.b u(int i2, boolean z) {
            ax.T.b g;
            int i3;
            if (i2 == 1) {
                return z ? ax.T.b.b(0, Math.max(v().b, k().b), 0, 0) : ax.T.b.b(0, k().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    ax.T.b v = v();
                    ax.T.b i4 = i();
                    return ax.T.b.b(Math.max(v.a, i4.a), 0, Math.max(v.c, i4.c), Math.max(v.d, i4.d));
                }
                ax.T.b k2 = k();
                F0 f0 = this.f;
                g = f0 != null ? f0.g() : null;
                int i5 = k2.d;
                if (g != null) {
                    i5 = Math.min(i5, g.d);
                }
                return ax.T.b.b(k2.a, 0, k2.c, i5);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return j();
                }
                if (i2 == 32) {
                    return h();
                }
                if (i2 == 64) {
                    return l();
                }
                if (i2 != 128) {
                    return ax.T.b.e;
                }
                F0 f02 = this.f;
                r e = f02 != null ? f02.e() : f();
                return e != null ? ax.T.b.b(e.b(), e.d(), e.c(), e.a()) : ax.T.b.e;
            }
            ax.T.b[] bVarArr = this.d;
            g = bVarArr != null ? bVarArr[m.d(8)] : null;
            if (g != null) {
                return g;
            }
            ax.T.b k3 = k();
            ax.T.b v2 = v();
            int i6 = k3.d;
            if (i6 > v2.d) {
                return ax.T.b.b(0, 0, 0, i6);
            }
            ax.T.b bVar = this.g;
            return (bVar == null || bVar.equals(ax.T.b.e) || (i3 = this.g.d) <= v2.d) ? ax.T.b.e : ax.T.b.b(0, 0, 0, i3);
        }

        g(F0 f0, g gVar) {
            this(f0, new WindowInsets(gVar.c));
        }
    }

    private static class j extends i {
        private ax.T.b n;
        private ax.T.b o;
        private ax.T.b p;

        j(F0 f0, WindowInsets windowInsets) {
            super(f0, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // ax.c0.F0.l
        ax.T.b h() {
            Insets mandatorySystemGestureInsets;
            if (this.o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.o = ax.T.b.d(mandatorySystemGestureInsets);
            }
            return this.o;
        }

        @Override // ax.c0.F0.l
        ax.T.b j() {
            Insets systemGestureInsets;
            if (this.n == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.n = ax.T.b.d(systemGestureInsets);
            }
            return this.n;
        }

        @Override // ax.c0.F0.l
        ax.T.b l() {
            Insets tappableElementInsets;
            if (this.p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.p = ax.T.b.d(tappableElementInsets);
            }
            return this.p;
        }

        @Override // ax.c0.F0.g, ax.c0.F0.l
        F0 m(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.c.inset(i, i2, i3, i4);
            return F0.v(inset);
        }

        j(F0 f0, j jVar) {
            super(f0, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // ax.c0.F0.h, ax.c0.F0.l
        public void s(ax.T.b bVar) {
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public F0 a() {
            return this.a.b();
        }

        public b b(int i, ax.T.b bVar) {
            this.a.c(i, bVar);
            return this;
        }

        @Deprecated
        public b c(ax.T.b bVar) {
            this.a.e(bVar);
            return this;
        }

        @Deprecated
        public b d(ax.T.b bVar) {
            this.a.g(bVar);
            return this;
        }

        public b(F0 f0) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(f0);
            } else if (i >= 29) {
                this.a = new d(f0);
            } else {
                this.a = new c(f0);
            }
        }
    }

    public F0(F0 f0) {
        if (f0 != null) {
            l lVar = f0.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.a = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.a = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.a = new g(this, (g) lVar);
            } else {
                this.a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }

    private static class l {
        static final F0 b = new b().a().a().b().c();
        final F0 a;

        l(F0 f0) {
            this.a = f0;
        }

        F0 a() {
            return this.a;
        }

        F0 b() {
            return this.a;
        }

        F0 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && C1441b.a(k(), lVar.k()) && C1441b.a(i(), lVar.i()) && C1441b.a(f(), lVar.f());
        }

        r f() {
            return null;
        }

        ax.T.b g(int i) {
            return ax.T.b.e;
        }

        ax.T.b h() {
            return k();
        }

        public int hashCode() {
            return C1441b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        ax.T.b i() {
            return ax.T.b.e;
        }

        ax.T.b j() {
            return k();
        }

        ax.T.b k() {
            return ax.T.b.e;
        }

        ax.T.b l() {
            return k();
        }

        F0 m(int i, int i2, int i3, int i4) {
            return b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(View view) {
        }

        void e(F0 f0) {
        }

        public void p(ax.T.b[] bVarArr) {
        }

        void q(ax.T.b bVar) {
        }

        void r(F0 f0) {
        }

        public void s(ax.T.b bVar) {
        }
    }
}
