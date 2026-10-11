/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.S0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class c {
    private c a;
    private S0 b;

    private c() {
    }

    public static c b(S0 s02) {
        if (s02 != null) {
            return new c().d(c.q, s02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private c d(c c8, S0 s02) {
        c c9 = new c();
        c9.a = c8;
        c9.b = s02;
        return c9;
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
        if (object instanceof c) {
            object = (c)object;
            Object object2 = this.a;
            if (object2 != ((c)object).a) {
                return false;
            }
            if (ax.G4.c$a.a[object2.ordinal()] != 1) {
                return false;
            }
            object2 = this.b;
            object = ((c)object).b;
            return object2 == object || ((S0)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.c$b.b.j(this, false);
    }

    static class b
    extends f<c> {
        public static final b b = new b();

        b() {
        }

        public c s(j j8) throws IOException, i {
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
                    object = c.b(S0.b.b.s(j8));
                    if (!bl) {
                        ax.v4.c.n(j8);
                        ax.v4.c.e(j8);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown tag: ");
                stringBuilder.append((String)object);
                throw new i(j8, stringBuilder.toString());
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(c c8, g object) throws IOException, ax.T4.f {
            if (ax.G4.c$a.a[c8.c().ordinal()] == 1) {
                ((g)object).o0();
                this.r("path", (g)object);
                ((g)object).o("path");
                S0.b.b.t(c8.b, (g)object);
                ((g)object).m();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unrecognized tag: ");
            ((StringBuilder)object).append((Object)c8.c());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    public static final class c
    extends Enum<c> {
        private static final c[] c0;
        public static final /* enum */ c q;

        static {
            c c8;
            q = c8 = new c();
            c0 = new c[]{c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])c0.clone();
        }
    }
}

