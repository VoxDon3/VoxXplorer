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

public final class N0
extends Enum<N0> {
    public static final /* enum */ N0 c0;
    public static final /* enum */ N0 d0;
    private static final N0[] e0;
    public static final /* enum */ N0 q;

    static {
        N0 n02;
        N0 n03;
        N0 n04;
        q = n04 = new N0();
        c0 = n03 = new N0();
        d0 = n02 = new N0();
        e0 = new N0[]{n04, n03, n02};
    }

    public static N0 valueOf(String string) {
        return Enum.valueOf(N0.class, string);
    }

    public static N0[] values() {
        return (N0[])e0.clone();
    }

    static class b
    extends f<N0> {
        public static final b b = new b();

        b() {
        }

        public N0 s(j j8) throws IOException, i {
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
                object = "sequential".equals(object) ? q : ("concurrent".equals(object) ? c0 : d0);
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(N0 n02, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[n02.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("concurrent");
                return;
            }
            g8.s0("sequential");
        }
    }
}

