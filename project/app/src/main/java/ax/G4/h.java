/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.G4.S0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class h {
    public static final h d = new h().j(ax.G4.h$c.d0);
    public static final h e = new h().j(ax.G4.h$c.e0);
    public static final h f = new h().j(ax.G4.h$c.f0);
    private c a;
    private M b;
    private S0 c;

    private h() {
    }

    public static h g(M m8) {
        if (m8 != null) {
            return new h().k(ax.G4.h$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static h h(S0 s02) {
        if (s02 != null) {
            return new h().l(ax.G4.h$c.c0, s02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private h j(c c8) {
        h h8 = new h();
        h8.a = c8;
        return h8;
    }

    private h k(c c8, M m8) {
        h h8 = new h();
        h8.a = c8;
        h8.b = m8;
        return h8;
    }

    private h l(c c8, S0 s02) {
        h h8 = new h();
        h8.a = c8;
        h8.c = s02;
        return h8;
    }

    public M c() {
        if (this.a == ax.G4.h$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH_LOOKUP, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public S0 d() {
        if (this.a == ax.G4.h$c.c0) {
            return this.c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH_WRITE, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean e() {
        return this.a == ax.G4.h$c.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof h) {
            object = (h)object;
            Object object2 = this.a;
            if (object2 != ((h)object).a) {
                return false;
            }
            int n8 = ax.G4.h$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3 || n8 == 4 || n8 == 5;
                }
                object2 = this.c;
                object = ((h)object).c;
                return object2 == object || ((S0)object2).equals(object);
                {
                }
            }
            object2 = this.b;
            object = ((h)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public boolean f() {
        return this.a == ax.G4.h$c.c0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return ax.G4.h$b.b.j(this, false);
    }

    static class b
    extends f<h> {
        public static final b b = new b();

        b() {
        }

        public h s(j j8) throws IOException, i {
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
                if ("path_lookup".equals(object)) {
                    ax.v4.c.f("path_lookup", j8);
                    object = h.g(M.b.b.s(j8));
                } else if ("path_write".equals(object)) {
                    ax.v4.c.f("path_write", j8);
                    object = h.h(S0.b.b.s(j8));
                } else {
                    object = "too_many_write_operations".equals(object) ? d : ("too_many_files".equals(object) ? e : f);
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(h h8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.h$a.a[h8.i().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            g8.s0("other");
                            return;
                        }
                        g8.s0("too_many_files");
                        return;
                    }
                    g8.s0("too_many_write_operations");
                    return;
                }
                g8.o0();
                this.r("path_write", g8);
                g8.o("path_write");
                S0.b.b.t(h8.c, g8);
                g8.m();
                return;
            }
            g8.o0();
            this.r("path_lookup", g8);
            g8.o("path_lookup");
            M.b.b.t(h8.b, g8);
            g8.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        private static final c[] g0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            q = c12 = new c();
            c0 = c11 = new c();
            d0 = c10 = new c();
            e0 = c9 = new c();
            f0 = c8 = new c();
            g0 = new c[]{c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])g0.clone();
        }
    }
}

