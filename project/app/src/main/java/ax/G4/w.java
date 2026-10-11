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

public final class w
extends Enum<w> {
    public static final /* enum */ w c0;
    public static final /* enum */ w d0;
    private static final w[] e0;
    public static final /* enum */ w q;

    static {
        w w8;
        w w9;
        w w10;
        q = w10 = new w();
        c0 = w9 = new w();
        d0 = w8 = new w();
        e0 = new w[]{w10, w9, w8};
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    public static w[] values() {
        return (w[])e0.clone();
    }

    static class b
    extends f<w> {
        public static final b b = new b();

        b() {
        }

        public w s(j j8) throws IOException, i {
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
                object = "active".equals(object) ? q : ("deleted".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(w w8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[w8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("deleted");
                return;
            }
            g8.s0("active");
        }
    }
}

