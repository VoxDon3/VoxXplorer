/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.M4.e;
import ax.M4.j;
import ax.T4.i;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class g {
    public static final g d = new g().j(ax.M4.g$c.d0);
    private c a;
    private e b;
    private j c;

    private g() {
    }

    public static g e(e e8) {
        if (e8 != null) {
            return new g().k(ax.M4.g$c.q, e8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static g i(j j8) {
        if (j8 != null) {
            return new g().l(ax.M4.g$c.c0, j8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private g j(c c8) {
        g g8 = new g();
        g8.a = c8;
        return g8;
    }

    private g k(c c8, e e8) {
        g g8 = new g();
        g8.a = c8;
        g8.b = e8;
        return g8;
    }

    private g l(c c8, j j8) {
        g g8 = new g();
        g8.a = c8;
        g8.c = j8;
        return g8;
    }

    public e c() {
        if (this.a == ax.M4.g$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.INDIVIDUAL, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public j d() {
        if (this.a == ax.M4.g$c.c0) {
            return this.c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.TEAM, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof g) {
            object = (g)object;
            Object object2 = this.a;
            if (object2 != ((g)object).a) {
                return false;
            }
            int n8 = ax.M4.g$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3;
                }
                object2 = this.c;
                object = ((g)object).c;
                return object2 == object || ((j)object2).equals(object);
                {
                }
            }
            object2 = this.b;
            object = ((g)object).b;
            return object2 == object || ((e)object2).equals(object);
            {
            }
        }
        return false;
    }

    public boolean f() {
        return this.a == ax.M4.g$c.q;
    }

    public boolean g() {
        return this.a == ax.M4.g$c.c0;
    }

    public c h() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.M4.g$b.b.j(this, false);
    }

    static class b
    extends f<g> {
        public static final b b = new b();

        b() {
        }

        public g s(ax.T4.j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = ax.v4.c.i(j8);
                j8.H();
                bl = true;
            } else {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                object = "individual".equals(object) ? g.e(e.a.b.u(j8, true)) : ("team".equals(object) ? g.i(j.a.b.u(j8, true)) : d);
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(g g8, ax.T4.g g9) throws IOException, ax.T4.f {
            int n8 = ax.M4.g$a.a[g8.h().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g9.s0("other");
                    return;
                }
                g9.o0();
                this.r("team", g9);
                j.a.b.v(g8.c, g9, true);
                g9.m();
                return;
            }
            g9.o0();
            this.r("individual", g9);
            e.a.b.v(g8.b, g9, true);
            g9.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            q = c10 = new c();
            c0 = c9 = new c();
            d0 = c8 = new c();
            e0 = new c[]{c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

