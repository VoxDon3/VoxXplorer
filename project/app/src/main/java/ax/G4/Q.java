/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.P;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class Q {
    public static final Q c = new Q().f(ax.G4.Q$c.c0);
    private c a;
    private P b;

    private Q() {
    }

    public static Q d(P p8) {
        if (p8 != null) {
            return new Q().g(ax.G4.Q$c.q, p8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private Q f(c c8) {
        Q q8 = new Q();
        q8.a = c8;
        return q8;
    }

    private Q g(c c8, P p8) {
        Q q8 = new Q();
        q8.a = c8;
        q8.b = p8;
        return q8;
    }

    public P b() {
        if (this.a == ax.G4.Q$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.METADATA, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean c() {
        return this.a == ax.G4.Q$c.q;
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
        if (object instanceof Q) {
            Object object2 = (Q)object;
            object = this.a;
            if (object != ((Q)object2).a) {
                return false;
            }
            int n8 = ax.G4.Q$a.a[((Enum)object).ordinal()];
            if (n8 != 1) {
                return n8 == 2;
            }
            object = this.b;
            object2 = ((Q)object2).b;
            return object == object2 || ((P)object).equals(object2);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.Q$b.b.j(this, false);
    }

    static class b
    extends f<Q> {
        public static final b b = new b();

        b() {
        }

        public Q s(j j8) throws IOException, i {
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
                if ("metadata".equals(object)) {
                    ax.v4.c.f("metadata", j8);
                    object = Q.d((P)P.a.b.a(j8));
                } else {
                    object = c;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(Q q8, g g8) throws IOException, ax.T4.f {
            if (ax.G4.Q$a.a[q8.e().ordinal()] != 1) {
                g8.s0("other");
                return;
            }
            g8.o0();
            this.r("metadata", g8);
            g8.o("metadata");
            P.a.b.k(q8.b, g8);
            g8.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            q = c9 = new c();
            c0 = c8 = new c();
            d0 = new c[]{c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }
}

