/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.b;
import ax.G4.P0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class v0 {
    public static final v0 d = new v0().h(ax.G4.v0$c.d0);
    public static final v0 e = new v0().h(ax.G4.v0$c.e0);
    public static final v0 f = new v0().h(ax.G4.v0$c.f0);
    private c a;
    private P0 b;
    private ax.E4.b c;

    private v0() {
    }

    public static v0 e(P0 p02) {
        if (p02 != null) {
            return new v0().i(ax.G4.v0$c.q, p02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static v0 f(ax.E4.b b8) {
        if (b8 != null) {
            return new v0().j(ax.G4.v0$c.c0, b8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private v0 h(c c8) {
        v0 v02 = new v0();
        v02.a = c8;
        return v02;
    }

    private v0 i(c c8, P0 p02) {
        v0 v02 = new v0();
        v02.a = c8;
        v02.b = p02;
        return v02;
    }

    private v0 j(c c8, ax.E4.b b8) {
        v0 v02 = new v0();
        v02.a = c8;
        v02.c = b8;
        return v02;
    }

    public P0 c() {
        if (this.a == ax.G4.v0$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean d() {
        return this.a == ax.G4.v0$c.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof v0) {
            object = (v0)object;
            Object object2 = this.a;
            if (object2 != ((v0)object).a) {
                return false;
            }
            int n8 = ax.G4.v0$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3 || n8 == 4 || n8 == 5;
                }
                object2 = this.c;
                object = ((v0)object).c;
                return object2 == object || ((ax.E4.b)object2).equals(object);
                {
                }
            }
            object2 = this.b;
            object = ((v0)object).b;
            return object2 == object || ((P0)object2).equals(object);
            {
            }
        }
        return false;
    }

    public c g() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.v0$b.b.j(this, false);
    }

    static class b
    extends f<v0> {
        public static final b b = new b();

        b() {
        }

        public v0 s(j j8) throws IOException, i {
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
                    object = v0.e(P0.a.b.u(j8, true));
                } else if ("properties_error".equals(object)) {
                    ax.v4.c.f("properties_error", j8);
                    object = v0.f(b.b.b.s(j8));
                } else {
                    object = "payload_too_large".equals(object) ? d : ("content_hash_mismatch".equals(object) ? e : f);
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(v0 v02, g g8) throws IOException, ax.T4.f {
            int n8 = ax.G4.v0$a.a[v02.g().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            g8.s0("other");
                            return;
                        }
                        g8.s0("content_hash_mismatch");
                        return;
                    }
                    g8.s0("payload_too_large");
                    return;
                }
                g8.o0();
                this.r("properties_error", g8);
                g8.o("properties_error");
                b.b.b.t(v02.c, g8);
                g8.m();
                return;
            }
            g8.o0();
            this.r("path", g8);
            P0.a.b.v(v02.b, g8, true);
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

