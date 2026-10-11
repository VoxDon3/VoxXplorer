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

public final class r0
extends Enum<r0> {
    public static final /* enum */ r0 c0;
    public static final /* enum */ r0 d0;
    private static final r0[] e0;
    public static final /* enum */ r0 q;

    static {
        r0 r02;
        r0 r03;
        r0 r04;
        q = r04 = new r0();
        c0 = r03 = new r0();
        d0 = r02 = new r0();
        e0 = new r0[]{r04, r03, r02};
    }

    public static r0 valueOf(String string) {
        return Enum.valueOf(r0.class, string);
    }

    public static r0[] values() {
        return (r0[])e0.clone();
    }

    static class b
    extends f<r0> {
        public static final b b = new b();

        b() {
        }

        public r0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block10: {
                    boolean bl;
                    block8: {
                        block9: {
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
                                if (!"strict".equals(object)) break block7;
                                object = q;
                                break block8;
                            }
                            if (!"bestfit".equals(object)) break block9;
                            object = c0;
                            break block8;
                        }
                        if (!"fitone_bestfit".equals(object)) break block10;
                        object = d0;
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

        public void t(r0 r02, g object) throws IOException, ax.T4.f {
            int n8 = a.a[r02.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        ((g)object).s0("fitone_bestfit");
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)r02);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                ((g)object).s0("bestfit");
                return;
            }
            ((g)object).s0("strict");
        }
    }
}

