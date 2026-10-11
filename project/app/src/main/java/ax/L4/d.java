/*
 * Decompiled with CFR 0.152.
 */
package ax.L4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class d
extends Enum<d> {
    public static final /* enum */ d c0;
    public static final /* enum */ d d0;
    private static final d[] e0;
    public static final /* enum */ d q;

    static {
        d d8;
        d d9;
        d d10;
        q = d10 = new d();
        c0 = d9 = new d();
        d0 = d8 = new d();
        e0 = new d[]{d10, d9, d8};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])e0.clone();
    }

    static class b
    extends f<d> {
        public static final b b = new b();

        b() {
        }

        public d s(j j8) throws IOException, i {
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
                object = "from_team_only".equals(object) ? q : ("from_anyone".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(d d8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[d8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("from_anyone");
                return;
            }
            g8.s0("from_team_only");
        }
    }
}

