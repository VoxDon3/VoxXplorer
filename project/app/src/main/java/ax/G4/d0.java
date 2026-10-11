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

public final class d0
extends Enum<d0> {
    public static final /* enum */ d0 c0;
    public static final /* enum */ d0 d0;
    public static final /* enum */ d0 e0;
    public static final /* enum */ d0 f0;
    private static final d0[] g0;
    public static final /* enum */ d0 q;

    static {
        d0 d02;
        d0 d03;
        d0 d04;
        d0 d05;
        d0 d06;
        q = d06 = new d0();
        c0 = d05 = new d0();
        d0 = d04 = new d0();
        e0 = d03 = new d0();
        f0 = d02 = new d0();
        g0 = new d0[]{d06, d05, d04, d03, d02};
    }

    public static d0 valueOf(String string) {
        return Enum.valueOf(d0.class, string);
    }

    public static d0[] values() {
        return (d0[])g0.clone();
    }

    static class b
    extends f<d0> {
        public static final b b = new b();

        b() {
        }

        public d0 s(j j8) throws IOException, i {
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
                object = "filename".equals(object) ? q : ("file_content".equals(object) ? c0 : ("filename_and_content".equals(object) ? d0 : ("image_content".equals(object) ? e0 : f0)));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(d0 d02, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[d02.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            g8.s0("other");
                            return;
                        }
                        g8.s0("image_content");
                        return;
                    }
                    g8.s0("filename_and_content");
                    return;
                }
                g8.s0("file_content");
                return;
            }
            g8.s0("filename");
        }
    }
}

