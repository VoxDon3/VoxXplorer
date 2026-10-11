/*
 * Decompiled with CFR 0.152.
 */
package ax.L4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import java.io.IOException;

public final class f
extends Enum<f> {
    public static final /* enum */ f c0;
    public static final /* enum */ f d0;
    public static final /* enum */ f e0;
    public static final /* enum */ f f0;
    private static final f[] g0;
    public static final /* enum */ f q;

    static {
        f f8;
        f f9;
        f f10;
        f f11;
        f f12;
        q = f12 = new f();
        c0 = f11 = new f();
        d0 = f10 = new f();
        e0 = f9 = new f();
        f0 = f8 = new f();
        g0 = new f[]{f12, f11, f10, f9, f8};
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])g0.clone();
    }

    static class b
    extends ax.v4.f<f> {
        public static final b b = new b();

        b() {
        }

        public f s(j j8) throws IOException, i {
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
                object = "default_public".equals(object) ? q : ("default_team_only".equals(object) ? c0 : ("team_only".equals(object) ? d0 : ("default_no_one".equals(object) ? e0 : f0)));
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(f f8, g g8) throws IOException, ax.T4.f {
            int n8 = a.a[f8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            g8.s0("other");
                            return;
                        }
                        g8.s0("default_no_one");
                        return;
                    }
                    g8.s0("team_only");
                    return;
                }
                g8.s0("default_team_only");
                return;
            }
            g8.s0("default_public");
        }
    }
}

