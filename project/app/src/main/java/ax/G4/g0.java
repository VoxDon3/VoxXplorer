/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class g0
extends Enum<g0> {
    public static final /* enum */ g0 c0;
    public static final /* enum */ g0 d0;
    private static final g0[] e0;
    public static final /* enum */ g0 q;

    static {
        g0 g02;
        g0 g03;
        g0 g04;
        q = g04 = new g0();
        c0 = g03 = new g0();
        d0 = g02 = new g0();
        e0 = new g0[]{g04, g03, g02};
    }

    public static g0 valueOf(String string) {
        return Enum.valueOf(g0.class, string);
    }

    public static g0[] values() {
        return (g0[])e0.clone();
    }

    static class b
    extends f<g0> {
        public static final b b = new b();

        b() {
        }

        public g0 s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = c.i(j8);
                j8.H();
                bl = true;
            } else {
                c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                object = "relevance".equals(object) ? q : ("last_modified_time".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(g0 g02, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[g02.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("last_modified_time");
                return;
            }
            g8.s0("relevance");
        }
    }
}

