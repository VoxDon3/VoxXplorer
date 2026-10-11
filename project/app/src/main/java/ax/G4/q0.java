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

public final class q0
extends Enum<q0> {
    public static final /* enum */ q0 c0;
    private static final q0[] d0;
    public static final /* enum */ q0 q;

    static {
        q0 q02;
        q0 q03;
        q = q03 = new q0();
        c0 = q02 = new q0();
        d0 = new q0[]{q03, q02};
    }

    public static q0 valueOf(String string) {
        return Enum.valueOf(q0.class, string);
    }

    public static q0[] values() {
        return (q0[])d0.clone();
    }

    static class b
    extends f<q0> {
        public static final b b = new b();

        b() {
        }

        public q0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block9: {
                    boolean bl;
                    block8: {
                        block7: {
                            if (j8.j() == m.r0) {
                                object = c.i(j8);
                                j8.H();
                                bl = true;
                            } else {
                                c.h(j8);
                                object = ax.v4.a.q(j8);
                                bl = false;
                            }
                            if (object == null) break block6;
                            if (!"jpeg".equals(object)) break block7;
                            object = q;
                            break block8;
                        }
                        if (!"png".equals(object)) break block9;
                        object = c0;
                    }
                    if (!bl) {
                        c.n(j8);
                        c.e(j8);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown tag: ");
                stringBuilder.append((String)object);
                throw new i(j8, stringBuilder.toString());
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(q0 q02, g object) throws IOException, ax.T4.f {
            int n8 = a.a[q02.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    ((g)object).s0("png");
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Unrecognized tag: ");
                ((StringBuilder)object).append((Object)q02);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            ((g)object).s0("jpeg");
        }
    }
}

