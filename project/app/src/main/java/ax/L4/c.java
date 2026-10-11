/*
 * Decompiled with CFR 0.152.
 */
package ax.L4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;

public final class c
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
                object = "members".equals(object) ? q : ("anyone".equals(object) ? c0 : d0);
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(c c8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[c8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("anyone");
                return;
            }
            g8.s0("members");
        }
    }
}

