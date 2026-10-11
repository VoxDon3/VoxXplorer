/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import ax.c0.G0;
import ax.c0.H0;
import ax.c0.I0;
import ax.c0.J0;
import ax.c0.K0;
import ax.c0.L0;
import ax.c0.M0;
import ax.c0.N0;
import ax.c0.O0;
import ax.c0.P0;
import ax.c0.Q0;
import ax.c0.R0;
import ax.c0.S;
import ax.c0.S0;
import ax.c0.T0;
import ax.c0.U0;
import ax.c0.V0;
import ax.c0.W0;
import ax.c0.X0;
import ax.c0.Y0;
import ax.c0.Z0;
import ax.c0.a1;
import ax.c0.b1;
import ax.c0.c1;
import ax.c0.d0;
import ax.c0.d1;
import ax.c0.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class F0 {
    public static final F0 b = Build.VERSION.SDK_INT >= 30 ? k.q : l.b;
    private final l a;

    private F0(WindowInsets windowInsets) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            this.a = new k(this, windowInsets);
            return;
        }
        if (n8 >= 29) {
            this.a = new j(this, windowInsets);
            return;
        }
        if (n8 >= 28) {
            this.a = new i(this, windowInsets);
            return;
        }
        this.a = new h(this, windowInsets);
    }

    public F0(F0 object) {
        if (object != null) {
            object = ((F0)object).a;
            int n8 = Build.VERSION.SDK_INT;
            this.a = n8 >= 30 && object instanceof k ? new k(this, (k)object) : (n8 >= 29 && object instanceof j ? new j(this, (j)object) : (n8 >= 28 && object instanceof i ? new i(this, (i)object) : (object instanceof h ? new h(this, (h)object) : (object instanceof g ? new g(this, (g)object) : new l(this)))));
            ((l)object).e(this);
            return;
        }
        this.a = new l(this);
    }

    static ax.T.b n(ax.T.b b8, int n8, int n9, int n10, int n11) {
        int n12 = Math.max(0, b8.a - n8);
        int n13 = Math.max(0, b8.b - n9);
        int n14 = Math.max(0, b8.c - n10);
        int n15 = Math.max(0, b8.d - n11);
        if (n12 == n8 && n13 == n9 && n14 == n10 && n15 == n11) {
            return b8;
        }
        return ax.T.b.b(n12, n13, n14, n15);
    }

    public static F0 v(WindowInsets windowInsets) {
        return F0.w(windowInsets, null);
    }

    public static F0 w(WindowInsets object, View view) {
        object = new F0(ax.b0.g.g(object));
        if (view != null && view.isAttachedToWindow()) {
            ((F0)object).s(d0.G(view));
            ((F0)object).d(view.getRootView());
        }
        return object;
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof F0)) {
            return false;
        }
        object = (F0)object;
        return ax.b0.b.a(this.a, ((F0)object).a);
    }

    public ax.T.b f(int n8) {
        return this.a.g(n8);
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
        l l8 = this.a;
        if (l8 == null) {
            return 0;
        }
        return l8.hashCode();
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

    public F0 m(int n8, int n9, int n10, int n11) {
        return this.a.m(n8, n9, n10, n11);
    }

    public boolean o() {
        return this.a.n();
    }

    @Deprecated
    public F0 p(int n8, int n9, int n10, int n11) {
        return new b(this).d(ax.T.b.b(n8, n9, n10, n11)).a();
    }

    void q(ax.T.b[] bArray) {
        this.a.p(bArray);
    }

    void r(ax.T.b b8) {
        this.a.q(b8);
    }

    void s(F0 f02) {
        this.a.r(f02);
    }

    void t(ax.T.b b8) {
        this.a.s(b8);
    }

    public WindowInsets u() {
        l l8 = this.a;
        if (l8 instanceof g) {
            return ((g)l8).c;
        }
        return null;
    }

    @SuppressLint(value={"SoonBlockedPrivateApi"})
    static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field field;
                a = field = View.class.getDeclaredField("mAttachInfo");
                ((AccessibleObject)field).setAccessible(true);
                Class<?> clazz = Class.forName("android.view.View$AttachInfo");
                b = field = clazz.getDeclaredField("mStableInsets");
                ((AccessibleObject)field).setAccessible(true);
                c = field = clazz.getDeclaredField("mContentInsets");
                ((AccessibleObject)field).setAccessible(true);
                d = true;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get visible insets from AttachInfo ");
                stringBuilder.append(reflectiveOperationException.getMessage());
                Log.w((String)"WindowInsetsCompat", (String)stringBuilder.toString(), (Throwable)reflectiveOperationException);
            }
        }

        public static F0 a(View view) {
            block5: {
                if (d && view.isAttachedToWindow()) {
                    Object object = view.getRootView();
                    Object object2 = a.get(object);
                    if (object2 == null) break block5;
                    object = (Rect)b.get(object2);
                    object2 = (Rect)c.get(object2);
                    if (object == null || object2 == null) break block5;
                    try {
                        b b8 = new b();
                        object = b8.c(ax.T.b.c((Rect)object)).d(ax.T.b.c((Rect)object2)).a();
                        ((F0)object).s((F0)object);
                        ((F0)object).d(view.getRootView());
                        return object;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Failed to get insets from AttachInfo. ");
                        ((StringBuilder)object).append(illegalAccessException.getMessage());
                        Log.w((String)"WindowInsetsCompat", (String)((StringBuilder)object).toString(), (Throwable)illegalAccessException);
                    }
                }
            }
            return null;
        }
    }

    public static final class b {
        private final f a;

        public b() {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 30) {
                this.a = new e();
                return;
            }
            if (n8 >= 29) {
                this.a = new d();
                return;
            }
            this.a = new c();
        }

        public b(F0 f02) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 30) {
                this.a = new e(f02);
                return;
            }
            if (n8 >= 29) {
                this.a = new d(f02);
                return;
            }
            this.a = new c(f02);
        }

        public F0 a() {
            return this.a.b();
        }

        public b b(int n8, ax.T.b b8) {
            this.a.c(n8, b8);
            return this;
        }

        @Deprecated
        public b c(ax.T.b b8) {
            this.a.e(b8);
            return this;
        }

        @Deprecated
        public b d(ax.T.b b8) {
            this.a.g(b8);
            return this;
        }
    }

    private static class c
    extends f {
        private static Field e;
        private static boolean f = false;
        private static Constructor<WindowInsets> g;
        private static boolean h = false;
        private WindowInsets c;
        private ax.T.b d;

        c() {
            this.c = ax.c0.F0$c.i();
        }

        c(F0 f02) {
            super(f02);
            this.c = f02.u();
        }

        private static WindowInsets i() {
            Constructor<WindowInsets> constructor;
            Field field;
            block13: {
                if (!f) {
                    try {
                        e = WindowInsets.class.getDeclaredField("CONSUMED");
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                    }
                    f = true;
                }
                if ((field = e) != null) {
                    field = (WindowInsets)field.get(null);
                    if (field == null) break block13;
                    try {
                        field = new WindowInsets((WindowInsets)field);
                        return field;
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        Log.i((String)"WindowInsetsCompat", (String)"Could not get value from WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                    }
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
                }
                h = true;
            }
            if ((constructor = g) != null) {
                try {
                    field = new Rect();
                    field = constructor.newInstance(field);
                    return field;
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not invoke WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
                }
            }
            return null;
        }

        @Override
        F0 b() {
            this.a();
            F0 f02 = F0.v(this.c);
            f02.q(this.b);
            f02.t(this.d);
            return f02;
        }

        @Override
        void e(ax.T.b b8) {
            this.d = b8;
        }

        @Override
        void g(ax.T.b b8) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(b8.a, b8.b, b8.c, b8.d);
            }
        }
    }

    private static class d
    extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = N0.a();
        }

        d(F0 f02) {
            super(f02);
            f02 = f02.u();
            f02 = f02 != null ? M0.a((WindowInsets)f02) : N0.a();
            this.c = f02;
        }

        @Override
        F0 b() {
            this.a();
            F0 f02 = F0.v(J0.a(this.c));
            f02.q(this.b);
            return f02;
        }

        @Override
        void d(ax.T.b b8) {
            K0.a(this.c, b8.e());
        }

        @Override
        void e(ax.T.b b8) {
            H0.a(this.c, b8.e());
        }

        @Override
        void f(ax.T.b b8) {
            I0.a(this.c, b8.e());
        }

        @Override
        void g(ax.T.b b8) {
            G0.a(this.c, b8.e());
        }

        @Override
        void h(ax.T.b b8) {
            L0.a(this.c, b8.e());
        }
    }

    private static class e
    extends d {
        e() {
        }

        e(F0 f02) {
            super(f02);
        }

        @Override
        void c(int n8, ax.T.b b8) {
            O0.a(this.c, n.a(n8), b8.e());
        }
    }

    private static class f {
        private final F0 a;
        ax.T.b[] b;

        f() {
            this(new F0(null));
        }

        f(F0 f02) {
            this.a = f02;
        }

        protected final void a() {
            Object object = this.b;
            if (object != null) {
                ax.T.b b8 = object[m.d(1)];
                ax.T.b b9 = this.b[m.d(2)];
                object = b9;
                if (b9 == null) {
                    object = this.a.f(2);
                }
                b9 = b8;
                if (b8 == null) {
                    b9 = this.a.f(1);
                }
                this.g(ax.T.b.a(b9, (ax.T.b)object));
                object = this.b[m.d(16)];
                if (object != null) {
                    this.f((ax.T.b)object);
                }
                if ((object = this.b[m.d(32)]) != null) {
                    this.d((ax.T.b)object);
                }
                if ((object = this.b[m.d(64)]) != null) {
                    this.h((ax.T.b)object);
                }
            }
        }

        F0 b() {
            throw null;
        }

        void c(int n8, ax.T.b b8) {
            if (this.b == null) {
                this.b = new ax.T.b[9];
            }
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) continue;
                this.b[m.d((int)i8)] = b8;
            }
        }

        void d(ax.T.b b8) {
        }

        void e(ax.T.b b8) {
            throw null;
        }

        void f(ax.T.b b8) {
        }

        void g(ax.T.b b8) {
            throw null;
        }

        void h(ax.T.b b8) {
        }
    }

    private static class g
    extends l {
        private static boolean h = false;
        private static Method i;
        private static Class<?> j;
        private static Field k;
        private static Field l;
        final WindowInsets c;
        private ax.T.b[] d;
        private ax.T.b e = null;
        private F0 f;
        ax.T.b g;

        g(F0 f02, WindowInsets windowInsets) {
            super(f02);
            this.c = windowInsets;
        }

        g(F0 f02, g g8) {
            this(f02, new WindowInsets(g8.c));
        }

        @SuppressLint(value={"WrongConstant"})
        private ax.T.b t(int n8, boolean bl) {
            ax.T.b b8 = ax.T.b.e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) continue;
                b8 = ax.T.b.a(b8, this.u(i8, bl));
            }
            return b8;
        }

        private ax.T.b v() {
            F0 f02 = this.f;
            if (f02 != null) {
                return f02.g();
            }
            return ax.T.b.e;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private ax.T.b w(View object) {
            ReflectiveOperationException reflectiveOperationException2;
            block5: {
                Method method;
                if (Build.VERSION.SDK_INT >= 30) throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                if (!h) {
                    ax.c0.F0$g.x();
                }
                if ((method = i) == null) return null;
                if (j == null) return null;
                if (k == null) {
                    return null;
                }
                try {
                    object = method.invoke(object, null);
                    if (object == null) {
                        object = new NullPointerException();
                        Log.w((String)"WindowInsetsCompat", (String)"Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)object);
                        return null;
                    }
                }
                catch (ReflectiveOperationException reflectiveOperationException2) {
                    break block5;
                }
                object = l.get(object);
                if ((object = (Rect)k.get(object)) == null) return null;
                return ax.T.b.c((Rect)object);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to get visible insets. (Reflection error). ");
            ((StringBuilder)object).append(reflectiveOperationException2.getMessage());
            Log.e((String)"WindowInsetsCompat", (String)((StringBuilder)object).toString(), (Throwable)reflectiveOperationException2);
            return null;
        }

        @SuppressLint(value={"PrivateApi"})
        private static void x() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> clazz = Class.forName("android.view.View$AttachInfo");
                j = clazz;
                k = clazz.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                ((AccessibleObject)k).setAccessible(true);
                ((AccessibleObject)l).setAccessible(true);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get visible insets. (Reflection error). ");
                stringBuilder.append(reflectiveOperationException.getMessage());
                Log.e((String)"WindowInsetsCompat", (String)stringBuilder.toString(), (Throwable)reflectiveOperationException);
            }
            h = true;
        }

        @Override
        void d(View object) {
            ax.T.b b8 = this.w((View)object);
            object = b8;
            if (b8 == null) {
                object = ax.T.b.e;
            }
            this.q((ax.T.b)object);
        }

        @Override
        void e(F0 f02) {
            f02.s(this.f);
            f02.r(this.g);
        }

        @Override
        public boolean equals(Object object) {
            if (!super.equals(object)) {
                return false;
            }
            object = (g)object;
            return j.Objects.equals((Object)this.g, (Object)((g)object).g);
        }

        @Override
        public ax.T.b g(int n8) {
            return this.t(n8, false);
        }

        @Override
        final ax.T.b k() {
            if (this.e == null) {
                this.e = ax.T.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override
        F0 m(int n8, int n9, int n10, int n11) {
            b b8 = new b(F0.v(this.c));
            b8.d(F0.n(this.k(), n8, n9, n10, n11));
            b8.c(F0.n(this.i(), n8, n9, n10, n11));
            return b8.a();
        }

        @Override
        boolean o() {
            return this.c.isRound();
        }

        @Override
        public void p(ax.T.b[] bArray) {
            this.d = bArray;
        }

        @Override
        void q(ax.T.b b8) {
            this.g = b8;
        }

        @Override
        void r(F0 f02) {
            this.f = f02;
        }

        protected ax.T.b u(int n8, boolean bl) {
            if (n8 != 1) {
                int n9;
                Object object = null;
                ax.T.b b8 = null;
                if (n8 != 2) {
                    if (n8 != 8) {
                        if (n8 != 16) {
                            if (n8 != 32) {
                                if (n8 != 64) {
                                    if (n8 != 128) {
                                        return ax.T.b.e;
                                    }
                                    object = this.f;
                                    object = object != null ? ((F0)object).e() : this.f();
                                    if (object != null) {
                                        return ax.T.b.b(((r)object).b(), ((r)object).d(), ((r)object).c(), ((r)object).a());
                                    }
                                    return ax.T.b.e;
                                }
                                return this.l();
                            }
                            return this.h();
                        }
                        return this.j();
                    }
                    ax.T.b[] bArray = this.d;
                    object = b8;
                    if (bArray != null) {
                        object = bArray[m.d(8)];
                    }
                    if (object != null) {
                        return object;
                    }
                    b8 = this.k();
                    object = this.v();
                    n8 = b8.d;
                    if (n8 > ((ax.T.b)object).d) {
                        return ax.T.b.b(0, 0, 0, n8);
                    }
                    b8 = this.g;
                    if (b8 != null && !b8.equals(ax.T.b.e) && (n8 = this.g.d) > ((ax.T.b)object).d) {
                        return ax.T.b.b(0, 0, 0, n8);
                    }
                    return ax.T.b.e;
                }
                if (bl) {
                    b8 = this.v();
                    object = this.i();
                    return ax.T.b.b(Math.max(b8.a, ((ax.T.b)object).a), 0, Math.max(b8.c, ((ax.T.b)object).c), Math.max(b8.d, ((ax.T.b)object).d));
                }
                b8 = this.k();
                F0 f02 = this.f;
                if (f02 != null) {
                    object = f02.g();
                }
                n8 = n9 = b8.d;
                if (object != null) {
                    n8 = Math.min(n9, ((ax.T.b)object).d);
                }
                return ax.T.b.b(b8.a, 0, b8.c, n8);
            }
            if (bl) {
                return ax.T.b.b(0, Math.max(this.v().b, this.k().b), 0, 0);
            }
            return ax.T.b.b(0, this.k().b, 0, 0);
        }
    }

    private static class h
    extends g {
        private ax.T.b m = null;

        h(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        h(F0 f02, h h8) {
            super(f02, h8);
            this.m = h8.m;
        }

        @Override
        F0 b() {
            return F0.v(this.c.consumeStableInsets());
        }

        @Override
        F0 c() {
            return F0.v(this.c.consumeSystemWindowInsets());
        }

        @Override
        final ax.T.b i() {
            if (this.m == null) {
                this.m = ax.T.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override
        boolean n() {
            return this.c.isConsumed();
        }

        @Override
        public void s(ax.T.b b8) {
            this.m = b8;
        }
    }

    private static class i
    extends h {
        i(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        i(F0 f02, i i8) {
            super(f02, i8);
        }

        @Override
        F0 a() {
            return F0.v(Q0.a(this.c));
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof i)) {
                return false;
            }
            object = (i)object;
            return j.Objects.equals((Object)this.c, (Object)((g)object).c) && j.Objects.equals((Object)this.g, (Object)((g)object).g);
        }

        @Override
        r f() {
            return r.e(P0.a(this.c));
        }

        @Override
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    private static class j
    extends i {
        private ax.T.b n = null;
        private ax.T.b o = null;
        private ax.T.b p = null;

        j(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        j(F0 f02, j j8) {
            super(f02, j8);
        }

        @Override
        ax.T.b h() {
            if (this.o == null) {
                this.o = ax.T.b.d(T0.a(this.c));
            }
            return this.o;
        }

        @Override
        ax.T.b j() {
            if (this.n == null) {
                this.n = ax.T.b.d(U0.a(this.c));
            }
            return this.n;
        }

        @Override
        ax.T.b l() {
            if (this.p == null) {
                this.p = ax.T.b.d(R0.a(this.c));
            }
            return this.p;
        }

        @Override
        F0 m(int n8, int n9, int n10, int n11) {
            return F0.v(S0.a(this.c, n8, n9, n10, n11));
        }

        @Override
        public void s(ax.T.b b8) {
        }
    }

    private static class k
    extends j {
        static final F0 q = F0.v(W0.a());

        k(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        k(F0 f02, k k8) {
            super(f02, k8);
        }

        @Override
        final void d(View view) {
        }

        @Override
        public ax.T.b g(int n8) {
            return ax.T.b.d(V0.a(this.c, n.a(n8)));
        }
    }

    private static class l {
        static final F0 b = new b().a().a().b().c();
        final F0 a;

        l(F0 f02) {
            this.a = f02;
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

        void d(View view) {
        }

        void e(F0 f02) {
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof l)) {
                return false;
            }
            object = (l)object;
            return this.o() == ((l)object).o() && this.n() == ((l)object).n() && ax.b0.b.a(this.k(), ((l)object).k()) && ax.b0.b.a(this.i(), ((l)object).i()) && ax.b0.b.a(this.f(), ((l)object).f());
        }

        r f() {
            return null;
        }

        ax.T.b g(int n8) {
            return ax.T.b.e;
        }

        ax.T.b h() {
            return this.k();
        }

        public int hashCode() {
            return ax.b0.b.b(this.o(), this.n(), this.k(), this.i(), this.f());
        }

        ax.T.b i() {
            return ax.T.b.e;
        }

        ax.T.b j() {
            return this.k();
        }

        ax.T.b k() {
            return ax.T.b.e;
        }

        ax.T.b l() {
            return this.k();
        }

        F0 m(int n8, int n9, int n10, int n11) {
            return b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(ax.T.b[] bArray) {
        }

        void q(ax.T.b b8) {
        }

        void r(F0 f02) {
        }

        public void s(ax.T.b b8) {
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

        static int d(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 4) {
                        if (n8 != 8) {
                            if (n8 != 16) {
                                if (n8 != 32) {
                                    if (n8 != 64) {
                                        if (n8 != 128) {
                                            if (n8 == 256) {
                                                return 8;
                                            }
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                                            stringBuilder.append(n8);
                                            throw new IllegalArgumentException(stringBuilder.toString());
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
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
        /*
         * Enabled aggressive block sorting
         */
        static int a(int n8) {
            int n9 = 0;
            int n10 = 1;
            while (true) {
                int n11;
                block2: {
                    block11: {
                        block3: {
                            block4: {
                                block5: {
                                    block6: {
                                        block7: {
                                            block8: {
                                                block9: {
                                                    block10: {
                                                        if (n10 > 256) {
                                                            return n9;
                                                        }
                                                        n11 = n9;
                                                        if ((n8 & n10) == 0) break block2;
                                                        if (n10 == 1) break block3;
                                                        if (n10 == 2) break block4;
                                                        if (n10 == 4) break block5;
                                                        if (n10 == 8) break block6;
                                                        if (n10 == 16) break block7;
                                                        if (n10 == 32) break block8;
                                                        if (n10 == 64) break block9;
                                                        if (n10 == 128) break block10;
                                                        n11 = n9;
                                                        break block2;
                                                    }
                                                    n11 = d1.a();
                                                    break block11;
                                                }
                                                n11 = c1.a();
                                                break block11;
                                            }
                                            n11 = b1.a();
                                            break block11;
                                        }
                                        n11 = a1.a();
                                        break block11;
                                    }
                                    n11 = S.a();
                                    break block11;
                                }
                                n11 = Z0.a();
                                break block11;
                            }
                            n11 = Y0.a();
                            break block11;
                        }
                        n11 = X0.a();
                    }
                    n11 = n9 | n11;
                }
                n10 <<= 1;
                n9 = n11;
            }
        }
    }
}

