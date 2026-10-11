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

public final class s0
extends Enum<s0> {
    public static final /* enum */ s0 c0;
    public static final /* enum */ s0 d0;
    public static final /* enum */ s0 e0;
    public static final /* enum */ s0 f0;
    public static final /* enum */ s0 g0;
    public static final /* enum */ s0 h0;
    public static final /* enum */ s0 i0;
    public static final /* enum */ s0 j0;
    private static final s0[] k0;
    public static final /* enum */ s0 q;

    static {
        s0 s02;
        s0 s03;
        s0 s04;
        s0 s05;
        s0 s06;
        s0 s07;
        s0 s08;
        s0 s09;
        s0 s010;
        q = s010 = new s0();
        c0 = s09 = new s0();
        d0 = s08 = new s0();
        e0 = s07 = new s0();
        f0 = s06 = new s0();
        g0 = s05 = new s0();
        h0 = s04 = new s0();
        i0 = s03 = new s0();
        j0 = s02 = new s0();
        k0 = new s0[]{s010, s09, s08, s07, s06, s05, s04, s03, s02};
    }

    public static s0 valueOf(String string) {
        return Enum.valueOf(s0.class, string);
    }

    public static s0[] values() {
        return (s0[])k0.clone();
    }

    static class b
    extends f<s0> {
        public static final b b = new b();

        b() {
        }

        public s0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block16: {
                    boolean bl;
                    block8: {
                        block15: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            block10: {
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
                                                        if (!"w32h32".equals(object)) break block7;
                                                        object = q;
                                                        break block8;
                                                    }
                                                    if (!"w64h64".equals(object)) break block9;
                                                    object = c0;
                                                    break block8;
                                                }
                                                if (!"w128h128".equals(object)) break block10;
                                                object = d0;
                                                break block8;
                                            }
                                            if (!"w256h256".equals(object)) break block11;
                                            object = e0;
                                            break block8;
                                        }
                                        if (!"w480h320".equals(object)) break block12;
                                        object = f0;
                                        break block8;
                                    }
                                    if (!"w640h480".equals(object)) break block13;
                                    object = g0;
                                    break block8;
                                }
                                if (!"w960h640".equals(object)) break block14;
                                object = h0;
                                break block8;
                            }
                            if (!"w1024h768".equals(object)) break block15;
                            object = i0;
                            break block8;
                        }
                        if (!"w2048h1536".equals(object)) break block16;
                        object = j0;
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

        public void t(s0 s02, g object) throws IOException, ax.T4.f {
            switch (a.a[s02.ordinal()]) {
                default: {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)s02);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 9: {
                    ((g)object).s0("w2048h1536");
                    return;
                }
                case 8: {
                    ((g)object).s0("w1024h768");
                    return;
                }
                case 7: {
                    ((g)object).s0("w960h640");
                    return;
                }
                case 6: {
                    ((g)object).s0("w640h480");
                    return;
                }
                case 5: {
                    ((g)object).s0("w480h320");
                    return;
                }
                case 4: {
                    ((g)object).s0("w256h256");
                    return;
                }
                case 3: {
                    ((g)object).s0("w128h128");
                    return;
                }
                case 2: {
                    ((g)object).s0("w64h64");
                    return;
                }
                case 1: 
            }
            ((g)object).s0("w32h32");
        }
    }
}

