/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.R0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class S0 {
    public static final S0 d = new S0().j(ax.G4.S0$c.d0);
    public static final S0 e = new S0().j(ax.G4.S0$c.e0);
    public static final S0 f = new S0().j(ax.G4.S0$c.f0);
    public static final S0 g = new S0().j(ax.G4.S0$c.g0);
    public static final S0 h = new S0().j(ax.G4.S0$c.h0);
    public static final S0 i = new S0().j(ax.G4.S0$c.i0);
    public static final S0 j = new S0().j(ax.G4.S0$c.j0);
    private c a;
    private String b;
    private R0 c;

    private S0() {
    }

    public static S0 c(R0 r02) {
        if (r02 != null) {
            return new S0().k(ax.G4.S0$c.c0, r02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static S0 g() {
        return S0.h(null);
    }

    public static S0 h(String string) {
        return new S0().l(ax.G4.S0$c.q, string);
    }

    private S0 j(c c8) {
        S0 s02 = new S0();
        s02.a = c8;
        return s02;
    }

    private S0 k(c c8, R0 r02) {
        S0 s02 = new S0();
        s02.a = c8;
        s02.c = r02;
        return s02;
    }

    private S0 l(c c8, String string) {
        S0 s02 = new S0();
        s02.a = c8;
        s02.b = string;
        return s02;
    }

    public boolean d() {
        return this.a == ax.G4.S0$c.f0;
    }

    public boolean e() {
        return this.a == ax.G4.S0$c.e0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof S0) {
            object = (S0)object;
            Object object2 = this.a;
            if (object2 != ((S0)object).a) {
                return false;
            }
            switch (ax.G4.S0$a.a[((Enum)object2).ordinal()]) {
                default: {
                    return false;
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: {
                    return true;
                }
                case 2: {
                    object2 = this.c;
                    object = ((S0)object).c;
                    return object2 == object || object2.equals(object);
                    {
                    }
                }
                case 1: 
            }
            object2 = this.b;
            object = ((S0)object).b;
            return object2 == object || object2 != null && ((String)object2).equals(object);
            {
            }
        }
        return false;
    }

    public boolean f() {
        return this.a == ax.G4.S0$c.d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return ax.G4.S0$b.b.j(this, false);
    }

    static class b
    extends f<S0> {
        public static final b b = new b();

        b() {
        }

        public S0 s(j j8) throws IOException, i {
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
                if ("malformed_path".equals(object)) {
                    if (j8.j() != m.m0) {
                        ax.v4.c.f("malformed_path", j8);
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                    } else {
                        object = null;
                    }
                    object = object == null ? S0.g() : S0.h((String)object);
                } else if ("conflict".equals(object)) {
                    ax.v4.c.f("conflict", j8);
                    object = S0.c(R0.b.b.s(j8));
                } else {
                    object = "no_write_permission".equals(object) ? d : ("insufficient_space".equals(object) ? e : ("disallowed_name".equals(object) ? f : ("team_folder".equals(object) ? g : ("operation_suppressed".equals(object) ? h : ("too_many_write_operations".equals(object) ? i : j)))));
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(S0 s02, g g8) throws IOException, ax.T4.f {
            switch (ax.G4.S0$a.a[s02.i().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 8: {
                    g8.s0("too_many_write_operations");
                    return;
                }
                case 7: {
                    g8.s0("operation_suppressed");
                    return;
                }
                case 6: {
                    g8.s0("team_folder");
                    return;
                }
                case 5: {
                    g8.s0("disallowed_name");
                    return;
                }
                case 4: {
                    g8.s0("insufficient_space");
                    return;
                }
                case 3: {
                    g8.s0("no_write_permission");
                    return;
                }
                case 2: {
                    g8.o0();
                    this.r("conflict", g8);
                    g8.o("conflict");
                    R0.b.b.t(s02.c, g8);
                    g8.m();
                    return;
                }
                case 1: 
            }
            g8.o0();
            this.r("malformed_path", g8);
            g8.o("malformed_path");
            ax.v4.d.d(ax.v4.d.f()).k(s02.b, g8);
            g8.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        public static final /* enum */ c g0;
        public static final /* enum */ c h0;
        public static final /* enum */ c i0;
        public static final /* enum */ c j0;
        private static final c[] k0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            c c14;
            c c15;
            c c16;
            q = c16 = new c();
            c0 = c15 = new c();
            d0 = c14 = new c();
            e0 = c13 = new c();
            f0 = c12 = new c();
            g0 = c11 = new c();
            h0 = c10 = new c();
            i0 = c9 = new c();
            j0 = c8 = new c();
            k0 = new c[]{c16, c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])k0.clone();
        }
    }
}

