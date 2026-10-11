/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class a0 {
    public static final a0 d = new a0().g(ax.G4.a0$c.d0);
    public static final a0 e = new a0().g(ax.G4.a0$c.e0);
    private c a;
    private M b;
    private String c;

    private a0() {
    }

    public static a0 c() {
        return a0.d(null);
    }

    public static a0 d(String string) {
        return new a0().h(ax.G4.a0$c.c0, string);
    }

    public static a0 e(M m8) {
        if (m8 != null) {
            return new a0().i(ax.G4.a0$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private a0 g(c c8) {
        a0 a02 = new a0();
        a02.a = c8;
        return a02;
    }

    private a0 h(c c8, String string) {
        a0 a02 = new a0();
        a02.a = c8;
        a02.c = string;
        return a02;
    }

    private a0 i(c c8, M m8) {
        a0 a02 = new a0();
        a02.a = c8;
        a02.b = m8;
        return a02;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof a0) {
            object = (a0)object;
            Object object2 = this.a;
            if (object2 != ((a0)object).a) {
                return false;
            }
            int n8 = ax.G4.a0$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3 || n8 == 4;
                }
                object2 = this.c;
                object = ((a0)object).c;
                return object2 == object || object2 != null && ((String)object2).equals(object);
                {
                }
            }
            object2 = this.b;
            object = ((a0)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public c f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.a0$b.b.j(this, false);
    }

    static class b
    extends f<a0> {
        public static final b b = new b();

        b() {
        }

        public a0 s(j j8) throws IOException, i {
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
                if ("path".equals(object)) {
                    ax.v4.c.f("path", j8);
                    object = a0.e(M.b.b.s(j8));
                } else if ("invalid_argument".equals(object)) {
                    if (j8.j() != m.m0) {
                        ax.v4.c.f("invalid_argument", j8);
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                    } else {
                        object = null;
                    }
                    object = object == null ? a0.c() : a0.d((String)object);
                } else {
                    object = "internal_error".equals(object) ? d : e;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(a0 a02, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.a0$a.a[a02.f().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        g8.s0("other");
                        return;
                    }
                    g8.s0("internal_error");
                    return;
                }
                g8.o0();
                this.r("invalid_argument", g8);
                g8.o("invalid_argument");
                ax.v4.d.d(ax.v4.d.f()).k(a02.c, g8);
                g8.m();
                return;
            }
            g8.o0();
            this.r("path", g8);
            g8.o("path");
            M.b.b.t(a02.b, g8);
            g8.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            q = c11 = new c();
            c0 = c10 = new c();
            d0 = c9 = new c();
            e0 = c8 = new c();
            f0 = new c[]{c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }
}

