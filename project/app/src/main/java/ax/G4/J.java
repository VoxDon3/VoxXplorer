/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.f;
import ax.G4.M;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class J {
    public static final J d = new J().h(ax.G4.J$c.d0);
    private c a;
    private M b;
    private ax.E4.f c;

    private J() {
    }

    public static J e(M m8) {
        if (m8 != null) {
            return new J().i(ax.G4.J$c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static J g(ax.E4.f f8) {
        if (f8 != null) {
            return new J().j(ax.G4.J$c.c0, f8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private J h(c c8) {
        J j8 = new J();
        j8.a = c8;
        return j8;
    }

    private J i(c c8, M m8) {
        J j8 = new J();
        j8.a = c8;
        j8.b = m8;
        return j8;
    }

    private J j(c c8, ax.E4.f f8) {
        J j8 = new J();
        j8.a = c8;
        j8.c = f8;
        return j8;
    }

    public M c() {
        if (this.a == ax.G4.J$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean d() {
        return this.a == ax.G4.J$c.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof J) {
            object = (J)object;
            Object object2 = this.a;
            if (object2 != ((J)object).a) {
                return false;
            }
            int n8 = ax.G4.J$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3;
                }
                object2 = this.c;
                object = ((J)object).c;
                return object2 == object || ((ax.E4.f)object2).equals(object);
                {
                }
            }
            object2 = this.b;
            object = ((J)object).b;
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
        return ax.G4.J$b.b.j(this, false);
    }

    static class b
    extends f<J> {
        public static final b b = new b();

        b() {
        }

        public J s(j j8) throws IOException, i {
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
                    object = J.e(M.b.b.s(j8));
                } else if ("template_error".equals(object)) {
                    ax.v4.c.f("template_error", j8);
                    object = J.g(f.b.b.s(j8));
                } else {
                    object = d;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(J j8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.J$a.a[j8.f().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.o0();
                this.r("template_error", g8);
                g8.o("template_error");
                f.b.b.t(j8.c, g8);
                g8.m();
                return;
            }
            g8.o0();
            this.r("path", g8);
            g8.o("path");
            M.b.b.t(j8.b, g8);
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

