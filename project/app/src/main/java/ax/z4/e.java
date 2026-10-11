/*
 * Decompiled with CFR 0.152.
 */
package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class e
extends Enum<e> {
    public static final /* enum */ e c0;
    public static final /* enum */ e d0;
    private static final e[] e0;
    public static final /* enum */ e q;

    static {
        e e8;
        e e9;
        e e10;
        q = e10 = new e();
        c0 = e9 = new e();
        d0 = e8 = new e();
        e0 = new e[]{e10, e9, e8};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])e0.clone();
    }

    public static class b
    extends f<e> {
        public static final b b = new b();

        public e s(j j8) throws IOException, i {
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
                object = "paper_disabled".equals(object) ? q : ("not_paper_user".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(e e8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[e8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("not_paper_user");
                return;
            }
            g8.s0("paper_disabled");
        }
    }
}

