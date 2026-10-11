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

public final class b
extends Enum<b> {
    public static final /* enum */ b c0;
    public static final /* enum */ b d0;
    private static final b[] e0;
    public static final /* enum */ b q;

    static {
        b b8;
        b b9;
        b b10;
        q = b10 = new b();
        c0 = b9 = new b();
        d0 = b8 = new b();
        e0 = new b[]{b10, b9, b8};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])e0.clone();
    }

    public static class b
    extends f<b> {
        public static final b b = new b();

        public b s(j j8) throws IOException, i {
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
                object = "disabled".equals(object) ? q : ("enabled".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(b b8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[b8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("enabled");
                return;
            }
            g8.s0("disabled");
        }
    }
}

