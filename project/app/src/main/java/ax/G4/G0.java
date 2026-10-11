/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.H0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class G0 {
    public static final G0 c = new G0().f(ax.G4.G0$c.q);
    public static final G0 d = new G0().f(ax.G4.G0$c.d0);
    public static final G0 e = new G0().f(ax.G4.G0$c.e0);
    public static final G0 f = new G0().f(ax.G4.G0$c.f0);
    public static final G0 g = new G0().f(ax.G4.G0$c.g0);
    public static final G0 h = new G0().f(ax.G4.G0$c.h0);
    public static final G0 i = new G0().f(ax.G4.G0$c.i0);
    public static final G0 j = new G0().f(ax.G4.G0$c.j0);
    private c a;
    private H0 b;

    private G0() {
    }

    public static G0 c(H0 h02) {
        if (h02 != null) {
            return new G0().g(ax.G4.G0$c.c0, h02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private G0 f(c c8) {
        G0 g02 = new G0();
        g02.a = c8;
        return g02;
    }

    private G0 g(c c8, H0 h02) {
        G0 g02 = new G0();
        g02.a = c8;
        g02.b = h02;
        return g02;
    }

    public H0 b() {
        if (this.a == ax.G4.G0$c.c0) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.INCORRECT_OFFSET, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean d() {
        return this.a == ax.G4.G0$c.c0;
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
        if (object instanceof G0) {
            object = (G0)object;
            Object object2 = this.a;
            if (object2 != ((G0)object).a) {
                return false;
            }
            switch (ax.G4.G0$a.a[object2.ordinal()]) {
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
                    object2 = this.b;
                    object = ((G0)object).b;
                    if (object2 == object || ((H0)object2).equals(object)) break;
                    return false;
                }
                case 1: 
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.G0$b.b.j(this, false);
    }

    static class b
    extends f<G0> {
        public static final b b = new b();

        b() {
        }

        public G0 s(j j8) throws IOException, i {
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
                object = "not_found".equals(object) ? c : ("incorrect_offset".equals(object) ? G0.c(H0.a.b.u(j8, true)) : ("closed".equals(object) ? d : ("not_closed".equals(object) ? e : ("too_large".equals(object) ? f : ("concurrent_session_invalid_offset".equals(object) ? g : ("concurrent_session_invalid_data_size".equals(object) ? h : ("payload_too_large".equals(object) ? i : j)))))));
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(G0 g02, g g8) throws IOException, ax.T4.f {
            switch (ax.G4.G0$a.a[g02.e().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 8: {
                    g8.s0("payload_too_large");
                    return;
                }
                case 7: {
                    g8.s0("concurrent_session_invalid_data_size");
                    return;
                }
                case 6: {
                    g8.s0("concurrent_session_invalid_offset");
                    return;
                }
                case 5: {
                    g8.s0("too_large");
                    return;
                }
                case 4: {
                    g8.s0("not_closed");
                    return;
                }
                case 3: {
                    g8.s0("closed");
                    return;
                }
                case 2: {
                    g8.o0();
                    this.r("incorrect_offset", g8);
                    H0.a.b.v(g02.b, g8, true);
                    g8.m();
                    return;
                }
                case 1: 
            }
            g8.s0("not_found");
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

