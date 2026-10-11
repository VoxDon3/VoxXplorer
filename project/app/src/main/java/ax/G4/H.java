/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class H {
    public static final H c = new H().d(ax.G4.H$c.c0);
    public static final H d = new H().d(ax.G4.H$c.d0);
    private c a;
    private M b;

    private H() {
    }

    public static H b(M m8) {
        if (m8 != null) {
            return new H().e(ax.G4.H$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private H d(c c8) {
        H h8 = new H();
        h8.a = c8;
        return h8;
    }

    private H e(c c8, M m8) {
        H h8 = new H();
        h8.a = c8;
        h8.b = m8;
        return h8;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof H) {
            object = (H)object;
            Object object2 = this.a;
            if (object2 != ((H)object).a) {
                return false;
            }
            int n8 = ax.G4.H$a.a[object2.ordinal()];
            if (n8 != 1) {
                return n8 == 2 || n8 == 3;
            }
            object2 = this.b;
            object = ((H)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.H$b.b.j(this, false);
    }

    static class b
    extends f<H> {
        public static final b b = new b();

        b() {
        }

        public H s(j j8) throws IOException, i {
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
                    object = H.b(M.b.b.s(j8));
                } else {
                    object = "reset".equals(object) ? c : d;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(H h8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.H$a.a[h8.c().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("reset");
                return;
            }
            g8.o0();
            this.r("path", g8);
            g8.o("path");
            M.b.b.t(h8.b, g8);
            g8.m();
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

