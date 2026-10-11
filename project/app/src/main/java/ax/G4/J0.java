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

public final class J0
extends Enum<J0> {
    public static final /* enum */ J0 c0;
    public static final /* enum */ J0 d0;
    public static final /* enum */ J0 e0;
    public static final /* enum */ J0 f0;
    private static final J0[] g0;
    public static final /* enum */ J0 q;

    static {
        J0 j02;
        J0 j03;
        J0 j04;
        J0 j05;
        J0 j06;
        q = j06 = new J0();
        c0 = j05 = new J0();
        d0 = j04 = new J0();
        e0 = j03 = new J0();
        f0 = j02 = new J0();
        g0 = new J0[]{j06, j05, j04, j03, j02};
    }

    public static J0 valueOf(String string) {
        return Enum.valueOf(J0.class, string);
    }

    public static J0[] values() {
        return (J0[])g0.clone();
    }

    static class b
    extends f<J0> {
        public static final b b = new b();

        b() {
        }

        public J0 s(j j8) throws IOException, i {
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
                object = "concurrent_session_data_not_allowed".equals(object) ? q : ("concurrent_session_close_not_allowed".equals(object) ? c0 : ("payload_too_large".equals(object) ? d0 : ("content_hash_mismatch".equals(object) ? e0 : f0)));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(J0 j02, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[j02.ordinal()];
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
                g8.s0("concurrent_session_close_not_allowed");
                return;
            }
            g8.s0("concurrent_session_data_not_allowed");
        }
    }
}

