/*
 * Decompiled with CFR 0.152.
 */
package ax.N4;

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
    private static final a[] e0;
    public static final /* enum */ a q;

    static {
        a a8;
        a a9;
        a a10;
        q = a10 = new a();
        c0 = a9 = new a();
        d0 = a8 = new a();
        e0 = new a[]{a10, a9, a8};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])e0.clone();
    }

    public static class b
    extends f<a> {
        public static final b b = new b();

        public a s(j j8) throws IOException, i {
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
                                if (!"basic".equals(object)) break block7;
                                object = q;
                                break block8;
                            }
                            if (!"pro".equals(object)) break block9;
                            object = c0;
                            break block8;
                        }
                        if (!"business".equals(object)) break block10;
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

        public void t(a a8, g object) throws IOException, ax.T4.f {
            int n8 = a.a[a8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        ((g)object).s0("business");
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)a8);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                ((g)object).s0("pro");
                return;
            }
            ((g)object).s0("basic");
        }
    }
}

