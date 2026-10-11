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

public final class R0
extends Enum<R0> {
    public static final /* enum */ R0 c0;
    public static final /* enum */ R0 d0;
    public static final /* enum */ R0 e0;
    private static final R0[] f0;
    public static final /* enum */ R0 q;

    static {
        R0 r02;
        R0 r03;
        R0 r04;
        R0 r05;
        q = r05 = new R0();
        c0 = r04 = new R0();
        d0 = r03 = new R0();
        e0 = r02 = new R0();
        f0 = new R0[]{r05, r04, r03, r02};
    }

    public static R0 valueOf(String string) {
        return Enum.valueOf(R0.class, string);
    }

    public static R0[] values() {
        return (R0[])f0.clone();
    }

    static class b
    extends f<R0> {
        public static final b b = new b();

        b() {
        }

        public R0 s(j j8) throws IOException, i {
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
                object = "file".equals(object) ? q : ("folder".equals(object) ? c0 : ("file_ancestor".equals(object) ? d0 : e0));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(R0 r02, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[r02.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        g8.s0("other");
                        return;
                    }
                    g8.s0("file_ancestor");
                    return;
                }
                g8.s0("folder");
                return;
            }
            g8.s0("file");
        }
    }
}

