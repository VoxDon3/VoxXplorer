/*
 * Decompiled with CFR 0.152.
 */
package ax.K4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    public static final /* enum */ a e0;
    private static final a[] f0;
    public static final /* enum */ a q;

    static {
        a a8;
        a a9;
        a a10;
        a a11;
        q = a11 = new a();
        c0 = a10 = new a();
        d0 = a9 = new a();
        e0 = a8 = new a();
        f0 = new a[]{a11, a10, a9, a8};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])f0.clone();
    }

    public static class b
    extends f<a> {
        public static final b b = new b();

        public a s(j j8) throws IOException, i {
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
                object = "off".equals(object) ? q : ("alert_only".equals(object) ? c0 : ("stop_sync".equals(object) ? d0 : e0));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(a a8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[a8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        g8.s0("other");
                        return;
                    }
                    g8.s0("stop_sync");
                    return;
                }
                g8.s0("alert_only");
                return;
            }
            g8.s0("off");
        }
    }
}

