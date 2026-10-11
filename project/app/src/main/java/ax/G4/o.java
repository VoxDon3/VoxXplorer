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

public final class o {
    public static final o c = new o().f(ax.G4.o$c.c0);
    public static final o d = new o().f(ax.G4.o$c.d0);
    private c a;
    private M b;

    private o() {
    }

    public static o d(M m8) {
        if (m8 != null) {
            return new o().g(ax.G4.o$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private o f(c c8) {
        o o8 = new o();
        o8.a = c8;
        return o8;
    }

    private o g(c c8, M m8) {
        o o8 = new o();
        o8.a = c8;
        o8.b = m8;
        return o8;
    }

    public M b() {
        if (this.a == ax.G4.o$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean c() {
        return this.a == ax.G4.o$c.q;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof o) {
            object = (o)object;
            Object object2 = this.a;
            if (object2 != ((o)object).a) {
                return false;
            }
            int n8 = ax.G4.o$a.a[object2.ordinal()];
            if (n8 != 1) {
                return n8 == 2 || n8 == 3;
            }
            object2 = this.b;
            object = ((o)object).b;
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
        return ax.G4.o$b.b.j(this, false);
    }

    static class b
    extends f<o> {
        public static final b b = new b();

        b() {
        }

        public o s(j j8) throws IOException, i {
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
                    object = o.d(M.b.b.s(j8));
                } else {
                    object = "unsupported_file".equals(object) ? c : d;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(o o8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.o$a.a[o8.e().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("unsupported_file");
                return;
            }
            g8.o0();
            this.r("path", g8);
            g8.o("path");
            M.b.b.t(o8.b, g8);
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

