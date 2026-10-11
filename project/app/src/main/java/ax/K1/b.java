/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import android.util.Pair;
import ax.K1.d;
import ax.K1.r;
import ax.K1.t;
import ax.K1.u;
import ax.K1.w;
import ax.P0.C;
import ax.P0.D;
import ax.P0.E;
import ax.P0.j;
import ax.P0.o;
import ax.P0.v;
import ax.S0.d0;
import ax.T0.e;
import ax.T0.h;
import ax.q1.F;
import ax.q1.G;
import ax.q1.L;
import ax.q1.X;
import ax.r7.z;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class b {
    private static final byte[] a = d0.x0("OpusHead");

    private static u A(ax.S0.G g8, int n8, int n9, String string) {
        int n10 = n8 + 8;
        while (true) {
            byte[] byArray = null;
            if (n10 - n8 >= n9) break;
            g8.b0(n10);
            int n11 = g8.v();
            if (g8.v() == 1952804451) {
                n8 = b.q(g8.v());
                g8.c0(1);
                if (n8 == 0) {
                    g8.c0(1);
                    n9 = 0;
                    n8 = 0;
                } else {
                    n9 = g8.M();
                    n8 = n9 & 0xF;
                    n9 = (n9 & 0xF0) >> 4;
                }
                boolean bl = g8.M() == 1;
                n10 = g8.M();
                byte[] byArray2 = new byte[16];
                g8.q(byArray2, 0, 16);
                byte[] byArray3 = byArray;
                if (bl) {
                    byArray3 = byArray;
                    if (n10 == 0) {
                        n11 = g8.M();
                        byArray3 = new byte[n11];
                        g8.q(byArray3, 0, n11);
                    }
                }
                return new u(bl, string, n10, byArray2, n9, n8, byArray3);
            }
            n10 += n11;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static w B(t object, e.b object2, F object3) throws E {
        boolean bl;
        int var34_43;
        long l8;
        long l9;
        long l10;
        Object object4;
        Object object5;
        int n8;
        int n9;
        int n10;
        int n11;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        boolean bl2;
        long l11;
        int n12;
        Object object11;
        Object object12;
        block56: {
            block57: {
                block54: {
                    block55: {
                        object12 = ((e.b)object2).e(1937011578);
                        if (object12 != null) {
                            object11 = new i((e.c)object12, ((t)object).g);
                        } else {
                            object12 = ((e.b)object2).e(1937013298);
                            if (object12 == null) {
                                throw E.a("Track has no sample table size information", null);
                            }
                            object11 = new j((e.c)object12);
                        }
                        n12 = object11.b();
                        if (n12 == 0) {
                            return new w((t)object, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        }
                        object12 = object;
                        if (((t)object).b == 2) {
                            l11 = ((t)object).f;
                            object12 = object;
                            if (l11 > 0L) {
                                float f8 = (float)n12 / ((float)l11 / 1000000.0f);
                                object12 = ((t)object).a(((t)object).g.b().f0(f8).P());
                            }
                        }
                        if ((object = ((e.b)object2).e(1937007471)) == null) {
                            object = ax.S0.a.e(((e.b)object2).e(1668232756));
                            bl2 = true;
                        } else {
                            bl2 = false;
                        }
                        object10 = ((e.c)object).b;
                        object9 = ax.S0.a.e(((e.b)object2).e((int)1937011555)).b;
                        object8 = ax.S0.a.e(((e.b)object2).e((int)0x73747473)).b;
                        object = ((e.b)object2).e(0x73747373);
                        object = object != null ? ((e.c)object).b : null;
                        object2 = ((e.b)object2).e(1668576371);
                        object7 = object2 != null ? ((e.c)object2).b : null;
                        object6 = new b((ax.S0.G)object9, (ax.S0.G)object10, bl2);
                        ((ax.S0.G)object8).b0(12);
                        n11 = ((ax.S0.G)object8).Q() - 1;
                        n10 = ((ax.S0.G)object8).Q();
                        n9 = ((ax.S0.G)object8).Q();
                        if (object7 != null) {
                            ((ax.S0.G)object7).b0(12);
                            n8 = ((ax.S0.G)object7).Q();
                        } else {
                            n8 = 0;
                        }
                        if (object == null) break block54;
                        ((ax.S0.G)object).b0(12);
                        object5 = ((ax.S0.G)object).Q();
                        if (object5 <= 0) break block55;
                        object4 = ((ax.S0.G)object).Q() - 1;
                        break block56;
                    }
                    object = null;
                    break block57;
                }
                object5 = 0;
            }
            object4 = -1;
        }
        int n13 = object11.a();
        object2 = ((t)object12).g.o;
        int n14 = n13 != -1 && ("audio/raw".equals(object2) || "audio/g711-mlaw".equals(object2) || "audio/g711-alaw".equals(object2)) && n11 == 0 && n8 == 0 && object5 == 0 ? 1 : 0;
        if (n14 != 0) {
            object5 = ((b)object6).a;
            object = new long[object5];
            object2 = new int[object5];
            while (((b)object6).a()) {
                object5 = ((b)object6).b;
                object[object5] = ((b)object6).d;
                object2[object5] = ((b)object6).c;
            }
            object10 = ax.K1.d.a(n13, (long[])object, (int[])object2, n9);
            object = ((d.b)object10).a;
            object11 = ((d.b)object10).b;
            object5 = ((d.b)object10).c;
            object7 = ((d.b)object10).d;
            object2 = ((d.b)object10).e;
            l11 = ((d.b)object10).f;
            l10 = ((d.b)object10).g;
        } else {
            int n15;
            int n16;
            int n17;
            int n18;
            block53: {
                int n19;
                block52: {
                    int var9_23;
                    object2 = new long[n12];
                    int[] nArray = new int[n12];
                    object10 = new long[n12];
                    object9 = new int[n12];
                    l9 = 0L;
                    l10 = 0L;
                    int n20 = object4;
                    int n21 = 0;
                    n19 = 0;
                    int n22 = 0;
                    boolean bl3 = false;
                    object4 = n10;
                    l11 = l10;
                    n14 = n11;
                    n18 = object5;
                    boolean bl4 = false;
                    int n23 = n22;
                    object5 = n8;
                    int n24 = n21;
                    n8 = n12;
                    while (var9_23 < n8) {
                        boolean bl5;
                        bl2 = true;
                        n12 = object4;
                        object4 = n14;
                        while (true) {
                            bl5 = bl2;
                            if (n17 != false) break;
                            bl5 = bl2 = ((b)object6).a();
                            if (!bl2) break;
                            l10 = ((b)object6).d;
                            n17 = ((b)object6).c;
                        }
                        n14 = n12;
                        if (!bl5) {
                            ax.S0.u.h("BoxParsers", "Unexpected end of chunk data");
                            object2 = Arrays.copyOf((long[])object2, (int)var9_23);
                            object = Arrays.copyOf(nArray, (int)var9_23);
                            object10 = Arrays.copyOf((long[])object10, (int)var9_23);
                            object11 = Arrays.copyOf((int[])object9, (int)var9_23);
                            n8 = var9_23;
                            break block52;
                        }
                        n22 = n19;
                        n21 = object5;
                        n12 = n16;
                        if (object7 != null) {
                            while (n16 == 0 && object5 > 0) {
                                n16 = ((ax.S0.G)object7).Q();
                                n19 = ((ax.S0.G)object7).v();
                                --object5;
                            }
                            n12 = n16 - true;
                            n21 = object5;
                            n22 = n19;
                        }
                        object2[var9_23] = l10;
                        nArray[var9_23] = n16 = object11.c();
                        l11 += (long)n16;
                        object5 = n15;
                        if (n16 > n15) {
                            object5 = n16;
                        }
                        object10[var9_23] = l9 + (long)n22;
                        n15 = object == null ? 1 : 0;
                        object9[var9_23] = n15;
                        n15 = n20;
                        n16 = n18;
                        if (var9_23 == n20) {
                            object9[var9_23] = true;
                            n19 = n18 - 1;
                            n15 = n20;
                            n16 = n19;
                            if (n19 > 0) {
                                n15 = ((ax.S0.G)ax.S0.a.e(object)).Q() - 1;
                                n16 = n19;
                            }
                        }
                        l9 += (long)n9;
                        n19 = n14 - 1;
                        if (n19 == 0 && object4 > 0) {
                            n19 = ((ax.S0.G)object8).Q();
                            n9 = ((ax.S0.G)object8).v();
                            n14 = object4 - 1;
                            object4 = n19;
                        } else {
                            n14 = object4;
                            object4 = n19;
                        }
                        l8 = nArray[var9_23];
                        --n17;
                        ++var9_23;
                        l10 += l8;
                        n20 = n15;
                        n15 = object5;
                        n18 = n16;
                        n19 = n22;
                        object5 = n21;
                        n16 = n12;
                    }
                    int n25 = n14;
                    object = nArray;
                    n14 = object4;
                    object4 = n25;
                    object11 = object9;
                }
                l10 = n19;
                if (object7 != null) {
                    while (object5 > 0) {
                        if (((ax.S0.G)object7).Q() != 0) {
                            object5 = 0;
                            break block53;
                        }
                        ((ax.S0.G)object7).v();
                        --object5;
                    }
                }
                object5 = 1;
            }
            if (n18 != 0 || n14 != 0 || n17 != 0 || object4 != 0 || n16 != 0 || object5 == 0) {
                object9 = new StringBuilder();
                ((StringBuilder)object9).append("Inconsistent stbl box for track ");
                ((StringBuilder)object9).append(((t)object12).a);
                ((StringBuilder)object9).append(": remainingSynchronizationSamples ");
                ((StringBuilder)object9).append(n18);
                ((StringBuilder)object9).append(", remainingSamplesAtTimestampDelta ");
                ((StringBuilder)object9).append(n14);
                ((StringBuilder)object9).append(", remainingSamplesInChunk ");
                ((StringBuilder)object9).append(n17);
                ((StringBuilder)object9).append(", remainingTimestampDeltaChanges ");
                ((StringBuilder)object9).append((int)object4);
                ((StringBuilder)object9).append(", remainingSamplesAtTimestampOffset ");
                ((StringBuilder)object9).append(n16);
                object7 = object5 == 0 ? ", ctts invalid" : "";
                ((StringBuilder)object9).append((String)object7);
                ax.S0.u.h("BoxParsers", ((StringBuilder)object9).toString());
            }
            l9 += l10;
            l10 = l11;
            object5 = n15;
            object9 = object2;
            l11 = l9;
            object2 = object11;
            object7 = object10;
            object11 = object;
            object = object9;
            n12 = n8;
        }
        l9 = ((t)object12).f;
        object10 = object12;
        if (l9 > 0L) {
            l10 = d0.r1(l10 * 8L, 1000000L, l9, RoundingMode.HALF_DOWN);
            object10 = object12;
            if (l10 > 0L) {
                object10 = object12;
                if (l10 < Integer.MAX_VALUE) {
                    object10 = ((t)object12).a(((t)object12).g.b().S((int)l10).P());
                }
            }
        }
        l10 = d0.p1(l11, 1000000L, ((t)object10).c);
        object12 = ((t)object10).i;
        if (object12 == null) {
            d0.q1((long[])object7, 1000000L, ((t)object10).c);
            return new w((t)object10, (long[])object, (int[])object11, (int)object5, (long[])object7, (int[])object2, l10);
        }
        if (((Object)object12).length == 1 && ((t)object10).b == 1 && ((Object)object7).length >= 2 && b.b((long[])object7, l11, l9 = ax.S0.a.e(((t)object10).j)[0], l10 = l9 + d0.p1(((t)object10).i[0], ((t)object10).c, ((t)object10).d))) {
            l9 = d0.p1(l9 - object7[0], ((t)object10).g.H, ((t)object10).c);
            l10 = d0.p1(l11 - l10, ((t)object10).g.H, ((t)object10).c);
            if ((l9 != 0L || l10 != 0L) && l9 <= Integer.MAX_VALUE && l10 <= Integer.MAX_VALUE) {
                ((F)object3).a = (int)l9;
                ((F)object3).b = (int)l10;
                d0.q1((long[])object7, 1000000L, ((t)object10).c);
                return new w((t)object10, (long[])object, (int[])object11, (int)object5, (long[])object7, (int[])object2, d0.p1(((t)object10).i[0], 1000000L, ((t)object10).d));
            }
        }
        if (((Object)(object3 = (Object)((t)object10).i)).length == 1 && object3[0] == 0L) {
            l10 = ax.S0.a.e(((t)object10).j)[0];
            n8 = 0;
            while (true) {
                if (n8 >= ((Object)object7).length) {
                    return new w((t)object10, (long[])object, (int[])object11, (int)object5, (long[])object7, (int[])object2, d0.p1(l11 - l10, 1000000L, ((t)object10).c));
                }
                object7[n8] = d0.p1((long)(object7[n8] - l10), 1000000L, ((t)object10).c);
                ++n8;
            }
        }
        bl2 = ((t)object10).b == 1;
        object8 = new int[((Object)object3).length];
        object12 = new int[((Object)object3).length];
        object9 = ax.S0.a.e(((t)object10).j);
        n8 = 0;
        object4 = 0;
        boolean bl6 = false;
        object3 = object11;
        object11 = object12;
        for (n14 = 0; n14 < ((Object)(object12 = (Object)((t)object10).i)).length; ++n14) {
            Object object13;
            Object object14;
            l11 = (long)object9[n14];
            if (l11 == -1L) continue;
            l10 = d0.p1((long)object12[n14], ((t)object10).c, ((t)object10).d);
            object8[n14] = d0.h((long[])object7, l11, true, true);
            object11[n14] = d0.d((long[])object7, l11 += l10, bl2, false);
            Object object15 = object8[n14];
            while ((object14 = object8[n14]) >= 0 && (object2[object14] & 1) == 0) {
                object8[n14] = object14 - true;
            }
            if (object14 < 0) {
                object8[n14] = object15;
                while ((object14 = object8[n14]) < object11[n14] && (object2[object14] & 1) == 0) {
                    object8[n14] = object14 + true;
                }
            }
            if (((t)object10).b == 2 && object8[n14] != object11[n14]) {
                while ((object14 = object11[n14]) < ((Object)object7).length - 1 && object7[object14 + true] <= l11) {
                    object11[n14] = object14 + true;
                }
            }
            object15 = object11[n14];
            Object object16 = object8[n14];
            object14 = object4 + (object15 - object16);
            object4 = object13 != object16 ? 1 : 0;
            n8 |= object4;
            object13 = object15;
            object4 = object14;
        }
        int n26 = 0;
        n14 = object4 != n12 ? 1 : 0;
        int n27 = n8 | n14;
        object12 = n27 != 0 ? (Object)new long[object4] : object;
        object9 = n27 != 0 ? (Object)new int[object4] : object3;
        if (n27 != 0) {
            object5 = 0;
        }
        if (n27 != 0) {
            int[] nArray = new int[object4];
        } else {
            Object object17 = object2;
        }
        object6 = new long[object4];
        l11 = 0L;
        boolean bl7 = false;
        n14 = 0;
        object4 = n27;
        for (n8 = n26; n8 < ((t)object10).i.length; l11 += ((t)object10).i[n8], ++n8) {
            Object object18;
            l8 = ((t)object10).j[n8];
            reference var8_20 = object8[n8];
            Object object19 = object11[n8];
            if (object4 != 0) {
                object18 = object19 - var8_20;
                System.arraycopy(object, (int)var8_20, object12, n14, (int)object18);
                System.arraycopy(object3, (int)var8_20, object9, n14, (int)object18);
                System.arraycopy(object2, (int)var8_20, var34_43, n14, (int)object18);
            }
            while (var8_20 < object19) {
                l10 = d0.p1(l11, 1000000L, ((t)object10).d);
                l9 = d0.p1((long)(object7[var8_20] - l8), 1000000L, ((t)object10).c);
                if (l9 < 0L) {
                    bl = true;
                }
                object6[n14] = l10 + l9;
                object18 = object5;
                if (object4 != 0) {
                    object18 = object5;
                    if (object9[n14] > object5) {
                        object18 = object3[var8_20];
                    }
                }
                ++n14;
                ++var8_20;
                object5 = object18;
            }
        }
        l11 = d0.p1(l11, 1000000L, ((t)object10).d);
        object = object10;
        if (bl) {
            object = ((t)object10).a(((t)object10).g.b().g0(true).P());
        }
        return new w((t)object, (long[])object12, (int[])object9, (int)object5, (long[])object6, (int[])var34_43, l11);
    }

    private static d C(ax.S0.G g8, int n8, int n9) throws E {
        g8.b0(n8 + 8);
        int n10 = g8.g();
        while (n10 - n8 < n9) {
            g8.b0(n10);
            int n11 = g8.v();
            boolean bl = false;
            boolean bl2 = n11 > 0;
            ax.q1.u.a(bl2, "childAtomSize must be positive");
            if (g8.v() == 1937011305) {
                g8.c0(4);
                n8 = g8.M();
                bl2 = (n8 & 1) == 1;
                boolean bl3 = (n8 & 2) == 2;
                if ((n8 & 8) == 8) {
                    bl = true;
                }
                return new d(new g(bl2, bl3, bl));
            }
            n10 += n11;
        }
        return null;
    }

    private static h D(ax.S0.G g8, k k8, String string, o o8, boolean bl) throws E {
        g8.b0(12);
        int n8 = g8.v();
        h h8 = new h(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            h h9;
            int n9 = g8.g();
            int n10 = g8.v();
            boolean bl2 = n10 > 0;
            ax.q1.u.a(bl2, "childAtomSize must be positive");
            int n11 = g8.v();
            if (n11 != 1635148593 && n11 != 1635148595 && n11 != 1701733238 && n11 != 1831958048 && n11 != 1836070006 && n11 != 1752589105 && n11 != 1751479857 && n11 != 1932670515 && n11 != 1211250227 && n11 != 1748121139 && n11 != 1987063864 && n11 != 1987063865 && n11 != 1635135537 && n11 != 1685479798 && n11 != 1685479729 && n11 != 1685481573 && n11 != 1685481521 && n11 != 1634760241) {
                if (n11 != 1836069985 && n11 != 1701733217 && n11 != 1633889587 && n11 != 1700998451 && n11 != 1633889588 && n11 != 1835823201 && n11 != 1685353315 && n11 != 1685353317 && n11 != 1685353320 && n11 != 1685353324 && n11 != 1685353336 && n11 != 1935764850 && n11 != 1935767394 && n11 != 1819304813 && n11 != 1936684916 && n11 != 1953984371 && n11 != 778924082 && n11 != 778924083 && n11 != 1835557169 && n11 != 1835560241 && n11 != 1634492771 && n11 != 1634492791 && n11 != 1970037111 && n11 != 1332770163 && n11 != 1716281667 && n11 != 1767992678 && n11 != 1768973165 && n11 != 1718641517) {
                    if (n11 != 1414810956 && n11 != 1954034535 && n11 != 0x77767474 && n11 != 1937010800 && n11 != 1664495672 && n11 != 1836070003) {
                        if (n11 == 1835365492) {
                            b.v(g8, n11, n9, k8.a, h8);
                            h9 = h8;
                        } else {
                            h9 = h8;
                            if (n11 == 1667329389) {
                                h8.b = new v.b().i0(k8.a).y0("application/x-camera-motion").P();
                                h9 = h8;
                            }
                        }
                    } else {
                        b.E(g8, n11, n9, n10, k8, string, h8);
                        h9 = h8;
                    }
                } else {
                    b.i(g8, n11, n9, n10, k8.a, string, bl, o8, h8, i8);
                    h9 = h8;
                }
            } else {
                b.L(g8, n11, n9, n10, k8.a, string, k8.d, o8, h8, i8);
                h9 = h8;
            }
            g8.b0(n9 + n10);
            h8 = h9;
        }
        return h8;
    }

    private static void E(ax.S0.G object, int n8, int n9, int n10, k k8, String string, h h8) {
        block7: {
            block9: {
                long l8;
                Object object2;
                block2: {
                    block8: {
                        block6: {
                            block5: {
                                String string2;
                                block4: {
                                    block3: {
                                        block1: {
                                            ((ax.S0.G)object).b0(n9 + 16);
                                            string2 = "application/ttml+xml";
                                            object2 = null;
                                            l8 = Long.MAX_VALUE;
                                            if (n8 != 1414810956) break block1;
                                            object = string2;
                                            break block2;
                                        }
                                        if (n8 != 1954034535) break block3;
                                        n8 = n10 - 16;
                                        object2 = new byte[n8];
                                        ((ax.S0.G)object).q((byte[])object2, 0, n8);
                                        object2 = z.A(object2);
                                        object = "application/x-quicktime-tx3g";
                                        break block2;
                                    }
                                    if (n8 != 0x77767474) break block4;
                                    object = "application/x-mp4-vtt";
                                    break block2;
                                }
                                if (n8 != 1937010800) break block5;
                                l8 = 0L;
                                object = string2;
                                break block2;
                            }
                            if (n8 != 1664495672) break block6;
                            h8.d = 1;
                            object = "application/x-mp4-cea-608";
                            break block2;
                        }
                        if (n8 != 1836070003) break block7;
                        n8 = ((ax.S0.G)object).g();
                        ((ax.S0.G)object).c0(4);
                        if (((ax.S0.G)object).v() != 1702061171) break block8;
                        if (((c)(object = b.n((ax.S0.G)object, n8))).b == null || ((c)object).b.length != 64) break block9;
                        object2 = z.A(d0.x0(b.d(((c)object).b, k8.e, k8.f)));
                        object = "application/vobsub";
                        break block2;
                    }
                    object = null;
                }
                if (object != null) {
                    h8.b = new v.b().i0(k8.a).y0((String)object).n0(string).C0(l8).k0((List<byte[]>)object2).P();
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static k F(ax.S0.G g8) {
        long l8;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        block4: {
            long l9;
            n12 = 8;
            g8.b0(8);
            n11 = b.q(g8.v());
            n10 = n11 == 0 ? 8 : 16;
            g8.c0(n10);
            n9 = g8.v();
            g8.c0(4);
            n8 = g8.g();
            n10 = n12;
            if (n11 == 0) {
                n10 = 4;
            }
            n12 = 0;
            while (true) {
                l9 = -9223372036854775807L;
                if (n12 >= n10) break;
                if (g8.f()[n8 + n12] != -1) {
                    l8 = n11 == 0 ? g8.O() : g8.T();
                    if (l8 == 0L) {
                        l8 = l9;
                    }
                    break block4;
                }
                ++n12;
            }
            g8.c0(n10);
            l8 = l9;
        }
        g8.c0(10);
        n12 = g8.U();
        g8.c0(4);
        n10 = g8.v();
        n11 = g8.v();
        g8.c0(4);
        int n13 = g8.v();
        n8 = g8.v();
        n10 = n10 == 0 && n11 == 65536 && (n13 == -65536 || n13 == 65536) && n8 == 0 ? 90 : (n10 == 0 && n11 == -65536 && (n13 == 65536 || n13 == -65536) && n8 == 0 ? 270 : ((n10 == -65536 || n10 == 65536) && n11 == 0 && n13 == 0 && n8 == -65536 ? 180 : 0));
        g8.c0(16);
        n11 = g8.I();
        g8.c0(2);
        return new k(n9, l8, n12, n10, n11, g8.I());
    }

    public static t G(e.b object, e.c object2, long l8, o object3, boolean bl, boolean bl2) throws E {
        Object object4 = ax.S0.a.e(((e.b)object).d(1835297121));
        int n8 = b.f(b.r(ax.S0.a.e(((e.b)object4).e((int)1751411826)).b));
        if (n8 == -1) {
            return null;
        }
        k k8 = b.F(ax.S0.a.e(((e.b)object).e((int)1953196132)).b);
        long l9 = -9223372036854775807L;
        if (l8 == -9223372036854775807L) {
            l8 = k8.b;
        }
        long l10 = b.w((ax.S0.G)((e.c)object2).b).c;
        l8 = l8 == -9223372036854775807L ? l9 : d0.p1(l8, 1000000L, l10);
        object2 = ax.S0.a.e(ax.S0.a.e(((e.b)object4).d(1835626086)).d(1937007212));
        object4 = b.t(ax.S0.a.e(((e.b)object4).e((int)1835296868)).b);
        object2 = ((e.b)object2).e(1937011556);
        if (object2 != null) {
            h h8 = b.D(((e.c)object2).b, k8, ((e)object4).c, (o)object3, bl2);
            if (!bl && (object = ((e.b)object).d(1701082227)) != null && (object2 = b.m((e.b)object)) != null) {
                object = (long[])((Pair)object2).first;
                object2 = (long[])((Pair)object2).second;
            } else {
                object = null;
                object2 = null;
            }
            if (h8.b == null) {
                return null;
            }
            if (k8.c != 0) {
                ax.T0.d d8 = new ax.T0.d(k8.c);
                v.b b8 = h8.b.b();
                object3 = h8.b.l;
                object3 = object3 != null ? ((C)object3).a(d8) : new C(d8);
                object3 = b8.r0((C)object3).P();
            } else {
                object3 = h8.b;
            }
            return new t(k8.a, n8, ((e)object4).a, l10, l8, ((e)object4).b, (v)object3, h8.d, h8.a, h8.c, (long[])object, (long[])object2);
        }
        throw E.a("Malformed sample table (stbl) missing sample description (stsd)", null);
    }

    public static List<w> H(e.b b8, F f8, long l8, o o8, boolean bl, boolean bl2, ax.q7.f<t, t> f9) throws E {
        ArrayList<w> arrayList = new ArrayList<w>();
        for (int i8 = 0; i8 < b8.d.size(); ++i8) {
            t t8;
            e.b b9 = b8.d.get(i8);
            if (b9.a != 1953653099 || (t8 = f9.apply(b.G(b9, ax.S0.a.e(b8.e(1836476516)), l8, o8, bl, bl2))) == null) continue;
            arrayList.add(b.B(t8, ax.S0.a.e(ax.S0.a.e(ax.S0.a.e(b9.d(1835297121)).d(1835626086)).d(1937007212)), f8));
        }
        return arrayList;
    }

    public static C I(e.c object) {
        ax.S0.G g8 = ((e.c)object).b;
        g8.b0(8);
        Object object2 = new C(new C.a[0]);
        while (g8.a() >= 8) {
            int n8 = g8.g();
            int n9 = g8.v();
            int n10 = g8.v();
            if (n10 == 1835365473) {
                g8.b0(n8);
                object = ((C)object2).b(b.J(g8, n8 + n9));
            } else if (n10 == 1936553057) {
                g8.b0(n8);
                object = ((C)object2).b(r.b(g8, n8 + n9));
            } else {
                object = object2;
                if (n10 == -1451722374) {
                    object = ((C)object2).b(b.M(g8));
                }
            }
            g8.b0(n8 + n9);
            object2 = object;
        }
        return object2;
    }

    private static C J(ax.S0.G g8, int n8) {
        g8.c0(8);
        b.g(g8);
        while (g8.g() < n8) {
            int n9 = g8.g();
            int n10 = g8.v();
            if (g8.v() == 1768715124) {
                g8.b0(n9);
                return b.s(g8, n9 + n10);
            }
            g8.b0(n9 + n10);
        }
        return null;
    }

    static l K(ax.S0.G g8, int n8, int n9) throws E {
        g8.b0(n8 + 8);
        int n10 = g8.g();
        d d8 = null;
        while (n10 - n8 < n9) {
            g8.b0(n10);
            int n11 = g8.v();
            boolean bl = n11 > 0;
            ax.q1.u.a(bl, "childAtomSize must be positive");
            if (g8.v() == 1702454643) {
                d8 = b.C(g8, n10, n11);
            }
            n10 += n11;
        }
        if (d8 == null) {
            return null;
        }
        return new l(d8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void L(ax.S0.G object, int n8, int n9, int n10, int n11, String object2, int n12, o object3, h h8, int n13) throws E {
        String var52_96;
        a var48_110;
        List<byte[]> var7_9;
        String var47_71;
        ((ax.S0.G)object).b0(n9 + 16);
        ((ax.S0.G)object).c0(16);
        int n14 = ((ax.S0.G)object).U();
        int n15 = ((ax.S0.G)object).U();
        ((ax.S0.G)object).c0(50);
        int n16 = ((ax.S0.G)object).g();
        Object object4 = object3;
        int n17 = n8;
        if (n8 == 1701733238) {
            Pair<Integer, u> pair = b.z((ax.S0.G)object, n9, n10);
            object4 = object3;
            if (pair != null) {
                n8 = (Integer)pair.first;
                object4 = object3 == null ? null : ((o)object3).c(((u)pair.second).b);
                var8_43.a[n26] = (u)pair.second;
            }
            ((ax.S0.G)object).b0(n16);
            n17 = n8;
        }
        String string = "video/3gpp";
        if (n17 == 1831958048) {
            String string2 = "video/mpeg";
        } else if (n17 == 1211250227) {
            String string3 = "video/3gpp";
        } else {
            Object var47_69 = null;
        }
        float f8 = 1.0f;
        int n18 = 8;
        int n19 = 8;
        Object object5 = null;
        Object var7_8 = null;
        Object var52_95 = null;
        byte[] byArray = null;
        n8 = -1;
        int n20 = -1;
        int n21 = -1;
        int n22 = -1;
        int n23 = -1;
        int n24 = -1;
        int n25 = -1;
        int n26 = -1;
        Object var48_109 = null;
        c c8 = null;
        Object var46_51 = null;
        boolean bl = false;
        int n27 = n17;
        Object object6 = object4;
        while (n16 - n9 < n10) {
            Object var46_64;
            Object var7_40;
            int n28;
            int n29;
            block40: {
                Object var46_52;
                block65: {
                    Object var7_37;
                    int n30;
                    block45: {
                        block63: {
                            block64: {
                                int n31;
                                int n32;
                                block62: {
                                    block61: {
                                        block58: {
                                            Object var7_27;
                                            block52: {
                                                Object var47_87;
                                                block54: {
                                                    byte[] byArray2;
                                                    block38: {
                                                        block59: {
                                                            block60: {
                                                                block57: {
                                                                    block56: {
                                                                        block55: {
                                                                            block53: {
                                                                                boolean bl2;
                                                                                block51: {
                                                                                    block50: {
                                                                                        block49: {
                                                                                            block48: {
                                                                                                block47: {
                                                                                                    block46: {
                                                                                                        Object var7_19;
                                                                                                        Object var47_78;
                                                                                                        block44: {
                                                                                                            block43: {
                                                                                                                block42: {
                                                                                                                    Object var7_16;
                                                                                                                    Object var8_43;
                                                                                                                    block41: {
                                                                                                                        block39: {
                                                                                                                            ((ax.S0.G)object).b0(n16);
                                                                                                                            n30 = ((ax.S0.G)object).g();
                                                                                                                            n29 = ((ax.S0.G)object).v();
                                                                                                                            if (n29 == 0 && ((ax.S0.G)object).g() - n9 == n10) break;
                                                                                                                            bl2 = n29 > 0;
                                                                                                                            ax.q1.u.a(bl2, "childAtomSize must be positive");
                                                                                                                            n32 = ((ax.S0.G)object).v();
                                                                                                                            if (n32 != 1635148611) break block39;
                                                                                                                            bl2 = var47_71 == null;
                                                                                                                            ax.q1.u.a(bl2, null);
                                                                                                                            ((ax.S0.G)object).b0(n30 + 8);
                                                                                                                            ax.q1.d d8 = ax.q1.d.b((ax.S0.G)object);
                                                                                                                            List<byte[]> list = d8.a;
                                                                                                                            var8_43.c = d8.b;
                                                                                                                            if (!bl) {
                                                                                                                                f8 = d8.k;
                                                                                                                            }
                                                                                                                            object4 = d8.l;
                                                                                                                            n20 = d8.j;
                                                                                                                            n17 = d8.g;
                                                                                                                            n24 = d8.h;
                                                                                                                            n26 = d8.i;
                                                                                                                            n18 = d8.e;
                                                                                                                            n19 = d8.f;
                                                                                                                            void var7_11 = var46_52;
                                                                                                                            String string4 = "video/avc";
                                                                                                                            List<byte[]> list2 = list;
                                                                                                                            z<byte[]> z8 = object4;
                                                                                                                            n25 = n8;
                                                                                                                            n8 = n17;
                                                                                                                            break block40;
                                                                                                                        }
                                                                                                                        if (n32 != 1752589123) break block41;
                                                                                                                        bl2 = var47_71 == null;
                                                                                                                        ax.q1.u.a(bl2, null);
                                                                                                                        ((ax.S0.G)object).b0(n30 + 8);
                                                                                                                        G g8 = G.a((ax.S0.G)object);
                                                                                                                        List<byte[]> list = g8.a;
                                                                                                                        var8_43.c = g8.b;
                                                                                                                        if (!bl) {
                                                                                                                            f8 = g8.n;
                                                                                                                        }
                                                                                                                        n20 = g8.o;
                                                                                                                        n21 = g8.c;
                                                                                                                        String string5 = g8.p;
                                                                                                                        n26 = g8.m;
                                                                                                                        n25 = n8;
                                                                                                                        if (n26 != -1) {
                                                                                                                            n25 = n26;
                                                                                                                        }
                                                                                                                        n22 = g8.f;
                                                                                                                        n23 = g8.g;
                                                                                                                        n8 = g8.j;
                                                                                                                        n24 = g8.k;
                                                                                                                        n26 = g8.l;
                                                                                                                        n18 = g8.h;
                                                                                                                        n19 = g8.i;
                                                                                                                        h.k k8 = g8.q;
                                                                                                                        String string6 = "video/hevc";
                                                                                                                        break block40;
                                                                                                                    }
                                                                                                                    if (n32 != 1818785347) break block42;
                                                                                                                    ax.q1.u.a("video/hevc".equals(var47_71), "lhvC must follow hvcC atom");
                                                                                                                    bl2 = var46_52 != null && var46_52.b.size() >= 2;
                                                                                                                    ax.q1.u.a(bl2, "must have at least two layers");
                                                                                                                    ((ax.S0.G)object).b0(n30 + 8);
                                                                                                                    G g9 = G.c((ax.S0.G)object, (h.k)ax.S0.a.e(var46_52));
                                                                                                                    bl2 = var8_43.c == g9.b;
                                                                                                                    ax.q1.u.a(bl2, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                                                                                    n17 = g9.j;
                                                                                                                    if (n17 != -1) {
                                                                                                                        bl2 = n24 == n17;
                                                                                                                        ax.q1.u.a(bl2, "colorSpace must be the same for both views");
                                                                                                                    }
                                                                                                                    if ((n17 = g9.k) != -1) {
                                                                                                                        bl2 = n25 == n17;
                                                                                                                        ax.q1.u.a(bl2, "colorRange must be the same for both views");
                                                                                                                    }
                                                                                                                    if ((n17 = g9.l) != -1) {
                                                                                                                        bl2 = n26 == n17;
                                                                                                                        ax.q1.u.a(bl2, "colorTransfer must be the same for both views");
                                                                                                                    }
                                                                                                                    bl2 = n18 == g9.h;
                                                                                                                    ax.q1.u.a(bl2, "bitdepthLuma must be the same for both views");
                                                                                                                    bl2 = n19 == g9.i;
                                                                                                                    ax.q1.u.a(bl2, "bitdepthChroma must be the same for both views");
                                                                                                                    if (var7_9 != null) {
                                                                                                                        z<byte[]> z9 = z.r().j(var7_9).j(g9.a).k();
                                                                                                                    } else {
                                                                                                                        ax.q1.u.a(false, "initializationData must be already set from hvcC atom");
                                                                                                                    }
                                                                                                                    String string7 = g9.p;
                                                                                                                    String string8 = "video/mv-hevc";
                                                                                                                    n17 = n24;
                                                                                                                    n17 = n26;
                                                                                                                    object4 = var7_16;
                                                                                                                    break block43;
                                                                                                                }
                                                                                                                n28 = n24;
                                                                                                                n17 = n25;
                                                                                                                if (n32 != 1986361461) break block44;
                                                                                                                object4 = b.K((ax.S0.G)object, n30, n29);
                                                                                                                if (object4 != null && ((l)object4).a != null) {
                                                                                                                    if (var46_52 != null && var46_52.b.size() >= 2) {
                                                                                                                        ax.q1.u.a(((l)object4).b(), "both eye views must be marked as available");
                                                                                                                        ax.q1.u.a(((l)object4).a.a.c ^ true, "for MV-HEVC, eye_views_reversed must be set to false");
                                                                                                                    } else if (n8 == -1) {
                                                                                                                        n8 = ((l)object4).a.a.c ? 5 : 4;
                                                                                                                    }
                                                                                                                }
                                                                                                                n17 = n26;
                                                                                                                object4 = var7_9;
                                                                                                            }
                                                                                                            n17 = n25;
                                                                                                            void var7_17 = var46_52;
                                                                                                            z<byte[]> z10 = object4;
                                                                                                            n25 = n8;
                                                                                                            n8 = n24;
                                                                                                            n24 = n17;
                                                                                                            break block40;
                                                                                                        }
                                                                                                        if (n32 == 1685480259 || n32 == 1685485123 || n32 == 1685485379) break block45;
                                                                                                        if (n32 != 1987076931) break block46;
                                                                                                        bl2 = var47_71 == null;
                                                                                                        ax.q1.u.a(bl2, null);
                                                                                                        if (n27 == 1987063864) {
                                                                                                            String string9 = "video/x-vnd.on2.vp8";
                                                                                                        } else {
                                                                                                            String string10 = "video/x-vnd.on2.vp9";
                                                                                                        }
                                                                                                        ((ax.S0.G)object).b0(n30 + 12);
                                                                                                        byte by = (byte)((ax.S0.G)object).M();
                                                                                                        byte by2 = (byte)((ax.S0.G)object).M();
                                                                                                        n26 = ((ax.S0.G)object).M();
                                                                                                        n18 = n26 >> 4;
                                                                                                        byte by3 = (byte)(n26 >> 1 & 7);
                                                                                                        if (var47_78.equals("video/x-vnd.on2.vp9")) {
                                                                                                            z<byte[]> z11 = ax.S0.i.k(by, by2, (byte)n18, by3);
                                                                                                        }
                                                                                                        n26 = (n26 & 1) != 0 ? 1 : 0;
                                                                                                        n19 = ((ax.S0.G)object).M();
                                                                                                        n25 = ((ax.S0.G)object).M();
                                                                                                        n17 = ax.P0.j.k(n19);
                                                                                                        n26 = n26 != 0 ? 1 : 2;
                                                                                                        n28 = ax.P0.j.l(n25);
                                                                                                        n24 = n26;
                                                                                                        object4 = var46_52;
                                                                                                        void var46_57 = var7_19;
                                                                                                        n19 = n18;
                                                                                                        Serializable serializable = object4;
                                                                                                        n25 = n8;
                                                                                                        n26 = n28;
                                                                                                        n8 = n17;
                                                                                                        break block40;
                                                                                                    }
                                                                                                    if (n32 != 1635135811) break block47;
                                                                                                    n26 = n29 - 8;
                                                                                                    byte[] byArray3 = new byte[n26];
                                                                                                    ((ax.S0.G)object).q(byArray3, 0, n26);
                                                                                                    object4 = z.A(byArray3);
                                                                                                    ((ax.S0.G)object).b0(n30 + 8);
                                                                                                    ax.P0.j j8 = b.j((ax.S0.G)object);
                                                                                                    n18 = j8.e;
                                                                                                    n19 = j8.f;
                                                                                                    n28 = j8.a;
                                                                                                    n24 = j8.b;
                                                                                                    n26 = j8.c;
                                                                                                    String string11 = "video/av01";
                                                                                                    break block48;
                                                                                                }
                                                                                                if (n32 != 1668050025) break block49;
                                                                                                object4 = object5;
                                                                                                if (object5 == null) {
                                                                                                    object4 = b.a();
                                                                                                }
                                                                                                ((ByteBuffer)object4).position(21);
                                                                                                ((ByteBuffer)object4).putShort(((ax.S0.G)object).I());
                                                                                                ((ByteBuffer)object4).putShort(((ax.S0.G)object).I());
                                                                                                object5 = object4;
                                                                                                object4 = var7_9;
                                                                                                n24 = n17;
                                                                                            }
                                                                                            void var7_24 = var46_52;
                                                                                            z<byte[]> z12 = object4;
                                                                                            n25 = n8;
                                                                                            n8 = n28;
                                                                                            break block40;
                                                                                        }
                                                                                        if (n32 != 1835295606) break block50;
                                                                                        object4 = object5;
                                                                                        if (object5 == null) {
                                                                                            object4 = b.a();
                                                                                        }
                                                                                        short s8 = ((ax.S0.G)object).I();
                                                                                        short s9 = ((ax.S0.G)object).I();
                                                                                        short s10 = ((ax.S0.G)object).I();
                                                                                        short s11 = ((ax.S0.G)object).I();
                                                                                        short s12 = ((ax.S0.G)object).I();
                                                                                        short s13 = ((ax.S0.G)object).I();
                                                                                        short s14 = ((ax.S0.G)object).I();
                                                                                        short s15 = ((ax.S0.G)object).I();
                                                                                        long l8 = ((ax.S0.G)object).O();
                                                                                        long l9 = ((ax.S0.G)object).O();
                                                                                        ((ByteBuffer)object4).position(1);
                                                                                        ((ByteBuffer)object4).putShort(s12);
                                                                                        ((ByteBuffer)object4).putShort(s13);
                                                                                        ((ByteBuffer)object4).putShort(s8);
                                                                                        ((ByteBuffer)object4).putShort(s9);
                                                                                        ((ByteBuffer)object4).putShort(s10);
                                                                                        ((ByteBuffer)object4).putShort(s11);
                                                                                        ((ByteBuffer)object4).putShort(s14);
                                                                                        ((ByteBuffer)object4).putShort(s15);
                                                                                        ((ByteBuffer)object4).putShort((short)(l8 / 10000L));
                                                                                        ((ByteBuffer)object4).putShort((short)(l9 / 10000L));
                                                                                        object5 = object4;
                                                                                        object4 = var7_9;
                                                                                        void var7_25 = var46_52;
                                                                                        Serializable serializable = object4;
                                                                                        n25 = n8;
                                                                                        n8 = n28;
                                                                                        n24 = n17;
                                                                                        break block40;
                                                                                    }
                                                                                    n25 = n8;
                                                                                    n31 = n19;
                                                                                    if (n32 != 1681012275) break block51;
                                                                                    bl2 = var47_71 == null;
                                                                                    ax.q1.u.a(bl2, null);
                                                                                    object4 = var7_9;
                                                                                    String string12 = string;
                                                                                    break block52;
                                                                                }
                                                                                if (n32 != 1702061171) break block53;
                                                                                bl2 = var47_71 == null;
                                                                                ax.q1.u.a(bl2, null);
                                                                                c8 = b.n((ax.S0.G)object, n30);
                                                                                object4 = c8.a;
                                                                                byte[] byArray4 = c8.b;
                                                                                if (byArray4 != null) {
                                                                                    z<byte[]> z13 = z.A(byArray4);
                                                                                } else {
                                                                                    void var47_85 = var7_9;
                                                                                }
                                                                                z<byte[]> z14 = object4;
                                                                                n8 = n25;
                                                                                break block54;
                                                                            }
                                                                            if (n32 != 1651798644) break block55;
                                                                            object4 = b.k((ax.S0.G)object, n30);
                                                                            n8 = n25;
                                                                            byArray2 = byArray;
                                                                            break block38;
                                                                        }
                                                                        if (n32 != 1885434736) break block56;
                                                                        f8 = b.x((ax.S0.G)object, n30);
                                                                        object4 = var7_9;
                                                                        void var7_33 = var46_52;
                                                                        bl = true;
                                                                        z<byte[]> z15 = object4;
                                                                        n19 = n31;
                                                                        n8 = n28;
                                                                        n24 = n17;
                                                                        break block40;
                                                                    }
                                                                    if (n32 != 1937126244) break block57;
                                                                    byArray2 = b.y((ax.S0.G)object, n30, n29);
                                                                    object4 = var48_110;
                                                                    n8 = n25;
                                                                    break block38;
                                                                }
                                                                if (n32 != 1936995172) break block58;
                                                                n19 = ((ax.S0.G)object).M();
                                                                ((ax.S0.G)object).c0(3);
                                                                byArray2 = byArray;
                                                                object4 = var48_110;
                                                                n8 = n25;
                                                                if (n19 != 0) break block38;
                                                                n8 = ((ax.S0.G)object).M();
                                                                if (n8 == 0) break block59;
                                                                if (n8 == 1) break block60;
                                                                if (n8 != 2) {
                                                                    if (n8 != 3) {
                                                                        byArray2 = byArray;
                                                                        object4 = var48_110;
                                                                        n8 = n25;
                                                                        break block38;
                                                                    } else {
                                                                        n8 = 3;
                                                                        byArray2 = byArray;
                                                                        object4 = var48_110;
                                                                    }
                                                                    break block38;
                                                                } else {
                                                                    n8 = 2;
                                                                    byArray2 = byArray;
                                                                    object4 = var48_110;
                                                                }
                                                                break block38;
                                                            }
                                                            n8 = 1;
                                                            byArray2 = byArray;
                                                            object4 = var48_110;
                                                            break block38;
                                                        }
                                                        n8 = 0;
                                                        byArray2 = byArray;
                                                        object4 = var48_110;
                                                    }
                                                    void var48_111 = var7_9;
                                                    void var7_32 = var47_71;
                                                    void var47_88 = var48_111;
                                                    byArray = byArray2;
                                                    z<byte[]> z16 = object4;
                                                }
                                                object4 = var47_87;
                                                n25 = n8;
                                            }
                                            n24 = n17;
                                            n8 = n28;
                                            n19 = n31;
                                            void var47_81 = var7_27;
                                            break block61;
                                        }
                                        if (n32 != 1634760259) break block62;
                                        n8 = n29 - 12;
                                        byte[] byArray5 = new byte[n8];
                                        ((ax.S0.G)object).b0(n30 + 12);
                                        ((ax.S0.G)object).q(byArray5, 0, n8);
                                        object4 = z.A(byArray5);
                                        ax.P0.j j9 = b.h(new ax.S0.G(byArray5));
                                        n18 = j9.e;
                                        n19 = j9.f;
                                        n8 = j9.a;
                                        n24 = j9.b;
                                        n26 = j9.c;
                                        String string13 = "video/apv";
                                    }
                                    void var7_29 = var46_52;
                                    z<byte[]> z17 = object4;
                                    break block40;
                                }
                                if (n32 != 1668246642 || n28 != -1 || n26 != -1) break block63;
                                n28 = ((ax.S0.G)object).v();
                                if (n28 != 1852009592 && n28 != 1852009571) break block64;
                                n24 = ((ax.S0.G)object).U();
                                n19 = ((ax.S0.G)object).U();
                                n8 = 2;
                                ((ax.S0.G)object).c0(2);
                                n26 = n29 == 19 && (((ax.S0.G)object).M() & 0x80) != 0 ? 1 : 0;
                                n24 = ax.P0.j.k(n24);
                                if (n26 != 0) {
                                    n8 = 1;
                                }
                                n26 = ax.P0.j.l(n19);
                                object4 = var7_9;
                                n17 = n8;
                                void var7_36 = var46_52;
                                Serializable serializable = object4;
                                n19 = n31;
                                n8 = n24;
                                n24 = n17;
                                break block40;
                            }
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("Unsupported color type: ");
                            ((StringBuilder)object4).append(ax.T0.e.a(n28));
                            ax.S0.u.h("BoxParsers", ((StringBuilder)object4).toString());
                        }
                        object4 = var7_9;
                        break block65;
                    }
                    n25 = n29 - 8;
                    object4 = new byte[n25];
                    ((ax.S0.G)object).q((byte[])object4, 0, n25);
                    if (var7_9 != null) {
                        z<Object> z18 = z.r().j(var7_9).h((z<byte[]>)object4).k();
                    } else {
                        ax.q1.u.a(false, "initializationData must already be set from hvcC or avcC atom");
                    }
                    ((ax.S0.G)object).b0(n30 + 8);
                    object4 = ax.T0.a.a((ax.S0.G)object);
                    if (object4 != null) {
                        String string14 = ((ax.T0.a)object4).c;
                        String string15 = "video/dolby-vision";
                    }
                    object4 = var7_37;
                }
                void var7_38 = var46_52;
                z<byte[]> z19 = object4;
                n25 = n8;
                n8 = n24;
                n24 = n17;
            }
            n16 += n29;
            object4 = var7_40;
            n28 = n8;
            n17 = n24;
            void var7_41 = var46_64;
            n8 = n25;
            n24 = n28;
            n25 = n17;
            z<byte[]> z20 = object4;
        }
        if (var47_71 == null) {
            return;
        }
        object2 = new v.b().i0(n11).y0((String)var47_71).U((String)var52_96).F0(n14).h0(n15).b0(n22).a0(n23).u0(f8).x0(n12).v0(byArray).B0(n8).k0((List<byte[]>)var7_9).p0(n20).q0(n21).c0((o)object6).n0((String)object2);
        j.b b8 = new j.b().d(n24).c(n25).e(n26);
        object = object5 != null ? (Object)((ByteBuffer)object5).array() : null;
        object = ((v.b)object2).V(b8.f((byte[])object).g(n18).b(n19).a());
        if (var48_110 != null) {
            ((v.b)object).S(ax.u7.f.n(((a)var48_110).a)).t0(ax.u7.f.n(((a)var48_110).b));
        } else if (c8 != null) {
            ((v.b)object).S(ax.u7.f.n(c8.c)).t0(ax.u7.f.n(c8.d));
        }
        var8_43.b = ((v.b)object).P();
    }

    private static C M(ax.S0.G object) {
        int n8 = ((ax.S0.G)object).I();
        ((ax.S0.G)object).c0(2);
        object = ((ax.S0.G)object).J(n8);
        n8 = Math.max(((String)object).lastIndexOf(43), ((String)object).lastIndexOf(45));
        try {
            float f8 = Float.parseFloat(((String)object).substring(0, n8));
            float f9 = Float.parseFloat(((String)object).substring(n8, ((String)object).length() - 1));
            object = new ax.T0.f(f8, f9);
            object = new C(new C.a[]{object});
            return object;
        }
        catch (IndexOutOfBoundsException | NumberFormatException runtimeException) {
            return null;
        }
    }

    private static int N(int n8) {
        int n9 = n8 >> 16 & 0xFF;
        int n10 = (n8 >> 8 & 0xFF) - 128;
        int n11 = n10 * 14075 / 10000;
        int n12 = (n8 & 0xFF) - 128;
        n8 = n12 * 3455 / 10000;
        n10 = n10 * 7169 / 10000;
        n12 = n12 * 17790 / 10000;
        n11 = d0.p(n11 + n9, 0, 255);
        n8 = d0.p(n9 - n8 - n10, 0, 255);
        return d0.p(n9 + n12, 0, 255) | (n11 << 16 | n8 << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] lArray, long l8, long l9, long l10) {
        int n8 = lArray.length - 1;
        int n9 = d0.p(4, 0, n8);
        n8 = d0.p(lArray.length - 4, 0, n8);
        return lArray[0] <= l9 && l9 < lArray[n9] && lArray[n8] < l10 && l10 <= l8;
    }

    private static int c(ax.S0.G g8, int n8, int n9, int n10) throws E {
        int n11 = g8.g();
        boolean bl = n11 >= n9;
        ax.q1.u.a(bl, null);
        while (n11 - n9 < n10) {
            g8.b0(n11);
            int n12 = g8.v();
            bl = n12 > 0;
            ax.q1.u.a(bl, "childAtomSize must be positive");
            if (g8.v() == n8) {
                return n11;
            }
            n11 += n12;
        }
        return -1;
    }

    private static String d(byte[] object, int n8, int n9) {
        boolean bl = ((byte[])object).length == 64;
        ax.S0.a.g(bl);
        ArrayList<String> arrayList = new ArrayList<String>(16);
        for (int i8 = 0; i8 < ((byte[])object).length - 3; i8 += 4) {
            arrayList.add(String.format("%06x", b.N(ax.u7.f.i((byte)object[i8], (byte)object[i8 + 1], (byte)object[i8 + 2], (byte)object[i8 + 3]))));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("size: ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append("x");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append("\npalette: ");
        ((StringBuilder)object).append(ax.q7.g.g(", ").d(arrayList));
        ((StringBuilder)object).append("\n");
        return ((StringBuilder)object).toString();
    }

    private static String e(int n8) {
        char c8 = (char)((n8 >> 10 & 0x1F) + 96);
        char c9 = (char)((n8 >> 5 & 0x1F) + 96);
        char c10 = (char)((n8 & 0x1F) + 96);
        char[] cArray = new char[3];
        cArray[0] = c8;
        cArray[1] = c9;
        cArray[2] = c10;
        for (n8 = 0; n8 < 3; ++n8) {
            char c11 = cArray[n8];
            if (c11 >= 'a' && c11 <= 'z') {
                continue;
            }
            return null;
        }
        return new String(cArray);
    }

    private static int f(int n8) {
        if (n8 == 1936684398) {
            return 1;
        }
        if (n8 == 1986618469) {
            return 2;
        }
        if (n8 != 1952807028 && n8 != 1935832172 && n8 != 1937072756 && n8 != 1668047728 && n8 != 1937072752) {
            if (n8 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    public static void g(ax.S0.G g8) {
        int n8 = g8.g();
        g8.c0(4);
        int n9 = n8;
        if (g8.v() != 1751411826) {
            n9 = n8 + 4;
        }
        g8.b0(n9);
    }

    private static ax.P0.j h(ax.S0.G object) {
        j.b b8 = new j.b();
        ax.S0.F f8 = new ax.S0.F(((ax.S0.G)object).f());
        f8.p(((ax.S0.G)object).g() * 8);
        f8.s(1);
        int n8 = f8.h(8);
        for (int i8 = 0; i8 < n8; ++i8) {
            f8.s(1);
            int n9 = f8.h(8);
            for (int i9 = 0; i9 < n9; ++i9) {
                f8.r(6);
                boolean bl = f8.g();
                f8.q();
                f8.s(11);
                f8.r(4);
                int n10 = f8.h(4) + 8;
                b8.g(n10);
                b8.b(n10);
                f8.s(1);
                if (!bl) continue;
                n10 = f8.h(8);
                int n11 = f8.h(8);
                f8.s(1);
                bl = f8.g();
                object = b8.d(ax.P0.j.k(n10));
                n10 = bl ? 1 : 2;
                ((j.b)object).c(n10).e(ax.P0.j.l(n11));
            }
        }
        return b8.a();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void i(ax.S0.G var0, int var1_1, int var2_2, int var3_3, int var4_4, String var5_5, boolean var6_6, o var7_7, h var8_8, int var9_9) throws E {
        block61: {
            block67: {
                block60: {
                    block64: {
                        block62: {
                            block66: {
                                block65: {
                                    block63: {
                                        var10_10 = var1_1;
                                        var0.b0(var2_2 + 16);
                                        if (var6_6) {
                                            var1_1 = var0.U();
                                            var0.c0(6);
                                        } else {
                                            var0.c0(8);
                                            var1_1 = 0;
                                        }
                                        if (var1_1 == 0 || var1_1 == 1) break block60;
                                        if (var1_1 != 2) break block61;
                                        var0.c0(16);
                                        var13_11 = (int)Math.round(var0.t());
                                        var12_12 = var0.Q();
                                        var0.c0(4);
                                        var14_13 = var0.Q();
                                        var11_14 = var0.Q();
                                        var1_1 = (var11_14 & 1) != 0 ? 1 : 0;
                                        var11_14 = (var11_14 & 2) != 0 ? 1 : 0;
                                        if (var1_1 != 0) break block62;
                                        if (var14_13 != 8) break block63;
                                        var1_1 = 3;
                                        break block64;
                                    }
                                    if (var14_13 != 16) break block65;
                                    var1_1 = var11_14 != 0 ? 0x10000000 : 2;
                                    break block64;
                                }
                                if (var14_13 != 24) break block66;
                                var1_1 = var11_14 != 0 ? 0x50000000 : 21;
                                break block64;
                            }
                            if (var14_13 != 32) ** GOTO lbl-1000
                            var1_1 = var11_14 != 0 ? 0x60000000 : 22;
                            break block64;
                        }
                        if (var14_13 == 32) {
                            var1_1 = 4;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = -1;
                        }
                    }
                    var0.c0(8);
                    var14_13 = 0;
                    var11_14 = var13_11;
                    var13_11 = var14_13;
                    break block67;
                }
                var12_12 = var0.U();
                var0.c0(6);
                var11_14 = var0.N();
                var0.b0(var0.g() - 4);
                var13_11 = var0.v();
                if (var1_1 == 1) {
                    var0.c0(16);
                }
                var1_1 = -1;
            }
            if (var10_10 == 1767992678) {
                var11_14 = -1;
                var12_12 = -1;
            } else if (var10_10 == 1935764850) {
                var11_14 = 8000;
lbl62:
                // 2 sources

                while (true) {
                    var12_12 = 1;
                    break;
                }
            } else if (var10_10 == 1935767394) {
                var11_14 = 16000;
                ** continue;
            }
            var14_13 = var0.g();
            var16_15 = var10_10;
            var27_16 = var7_7;
            if (var10_10 == 1701733217) {
                var21_17 = b.z((ax.S0.G)var0, var2_2, var3_3);
                var20_18 = var7_7;
                if (var21_17 != null) {
                    var10_10 = (Integer)var21_17.first;
                    var20_18 = var7_7 == null ? null : var7_7.c(((u)var21_17.second).b);
                    var8_8.a[var9_9] = (u)var21_17.second;
                }
                var0.b0(var14_13);
                var27_16 = var20_18;
                var16_15 = var10_10;
            }
            var28_19 = "audio/mhm1";
            if (var16_15 == 1633889587) {
                var7_7 = "audio/ac3";
            } else if (var16_15 == 1700998451) {
                var7_7 = "audio/eac3";
            } else if (var16_15 == 1633889588) {
                var7_7 = "audio/ac4";
            } else if (var16_15 == 1685353315) {
                var7_7 = "audio/vnd.dts";
            } else if (var16_15 != 1685353320 && var16_15 != 1685353324) {
                if (var16_15 == 1685353317) {
                    var7_7 = "audio/vnd.dts.hd;profile=lbr";
                } else if (var16_15 == 1685353336) {
                    var7_7 = "audio/vnd.dts.uhd;profile=p2";
                } else if (var16_15 == 1935764850) {
                    var7_7 = "audio/3gpp";
                } else if (var16_15 == 1935767394) {
                    var7_7 = "audio/amr-wb";
                } else if (var16_15 == 1936684916) {
                    while (true) {
                        var7_7 = "audio/raw";
                        var1_1 = 2;
                        break;
                    }
                } else if (var16_15 == 1953984371) {
                    var7_7 = "audio/raw";
                    var1_1 = 0x10000000;
                } else if (var16_15 == 1819304813) {
                    if (var1_1 == -1) ** continue;
                    var7_7 = "audio/raw";
                } else {
                    var7_7 = var16_15 != 778924082 && var16_15 != 778924083 ? (var16_15 == 1835557169 ? "audio/mha1" : (var16_15 == 1835560241 ? "audio/mhm1" : (var16_15 == 1634492771 ? "audio/alac" : (var16_15 == 1634492791 ? "audio/g711-alaw" : (var16_15 == 1970037111 ? "audio/g711-mlaw" : (var16_15 == 1332770163 ? "audio/opus" : (var16_15 == 1716281667 ? "audio/flac" : (var16_15 == 1835823201 ? "audio/true-hd" : (var16_15 == 1767992678 ? "audio/iamf" : null))))))))) : "audio/mpeg";
                }
            } else {
                var7_7 = "audio/vnd.dts.hd";
            }
            var22_20 = null;
            var20_18 = null;
            var24_21 = null;
            var21_17 = null;
            var10_10 = var1_1;
            var23_22 /* !! */  = var7_7;
            var9_9 = var12_12;
            var1_1 = var11_14;
            var11_14 = var14_13;
            while (var11_14 - var2_2 < var3_3) {
                block59: {
                    block70: {
                        block73: {
                            block78: {
                                block79: {
                                    block76: {
                                        block77: {
                                            block75: {
                                                block74: {
                                                    block72: {
                                                        block71: {
                                                            block68: {
                                                                block69: {
                                                                    var0.b0(var11_14);
                                                                    var18_25 = var0.v();
                                                                    var19_26 = var18_25 > 0;
                                                                    ax.q1.u.a(var19_26, "childAtomSize must be positive");
                                                                    var12_12 = var0.v();
                                                                    if (var12_12 == 1835557187) {
                                                                        var0.b0(var11_14 + 8);
                                                                        var0.c0(1);
                                                                        var12_12 = var0.M();
                                                                        var0.c0(1);
                                                                        var7_7 = j.Objects.equals((Object)var23_22 /* !! */ , (Object)var28_19) ? String.format("mhm1.%02X", new Object[]{var12_12}) : String.format("mha1.%02X", new Object[]{var12_12});
                                                                        var12_12 = var0.U();
                                                                        var26_28 = var7_7;
                                                                        var7_7 = (Object)new byte[var12_12];
                                                                        var0.q((byte[])var7_7, 0, var12_12);
                                                                        if (var22_20 == null) {
                                                                            var7_7 = z.A(var7_7);
                                                                            var25_27 /* !! */  = var21_17;
                                                                        } else {
                                                                            var7_7 = z.B(var7_7, (byte[])var22_20.get(0));
                                                                            var25_27 /* !! */  = var21_17;
                                                                        }
lbl154:
                                                                        // 8 sources

                                                                        while (true) {
                                                                            var20_18 = var26_28;
                                                                            var21_17 = var25_27 /* !! */ ;
lbl157:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                var22_20 = var7_7;
                                                                                var7_7 = var20_18;
                                                                                break block59;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var12_12 != 1835557200) break block68;
                                                                    var0.b0(var11_14 + 8);
                                                                    var12_12 = var0.M();
                                                                    var7_7 = var22_20;
                                                                    var25_27 /* !! */  = var21_17;
                                                                    var26_28 = var20_18;
                                                                    if (var12_12 <= 0) ** GOTO lbl154
                                                                    var7_7 = (Object)new byte[var12_12];
                                                                    var0.q((byte[])var7_7, 0, var12_12);
                                                                    if (var22_20 != null) break block69;
                                                                    var7_7 = z.A(var7_7);
                                                                    var25_27 /* !! */  = var21_17;
                                                                    var26_28 = var20_18;
                                                                    ** GOTO lbl154
                                                                }
                                                                var7_7 = z.B((byte[])var22_20.get(0), var7_7);
                                                                var25_27 /* !! */  = var21_17;
                                                                var26_28 = var20_18;
                                                                ** GOTO lbl154
                                                            }
                                                            if (var12_12 == 1702061171 || var6_6 && var12_12 == 2002876005) break block70;
                                                            if (var12_12 != 1651798644) break block71;
                                                            var25_27 /* !! */  = b.k((ax.S0.G)var0, var11_14);
                                                            var7_7 = var22_20;
                                                            var26_28 = var20_18;
                                                            ** GOTO lbl154
                                                        }
                                                        if (var12_12 != 1684103987) break block72;
                                                        var0.b0(var11_14 + 8);
                                                        var8_8.b = ax.q1.b.d((ax.S0.G)var0, Integer.toString(var4_4), var5_5, var27_16);
                                                        break block73;
                                                    }
                                                    if (var12_12 != 1684366131) break block74;
                                                    var0.b0(var11_14 + 8);
                                                    var8_8.b = ax.q1.b.h((ax.S0.G)var0, Integer.toString(var4_4), var5_5, var27_16);
                                                    break block73;
                                                }
                                                if (var12_12 != 1684103988) break block75;
                                                var0.b0(var11_14 + 8);
                                                var8_8.b = ax.q1.c.e((ax.S0.G)var0, Integer.toString(var4_4), var5_5, var27_16);
                                                break block73;
                                            }
                                            if (var12_12 != 1684892784) break block76;
                                            if (var13_11 <= 0) break block77;
                                            var1_1 = var13_11;
                                            var9_9 = 2;
                                            var7_7 = var22_20;
                                            ** GOTO lbl157
                                        }
                                        var0 = new StringBuilder();
                                        var0.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        var0.append(var13_11);
                                        throw E.a(var0.toString(), null);
                                    }
                                    if (var12_12 == 1684305011 || var12_12 == 1969517683) break block78;
                                    if (var12_12 != 1682927731) break block79;
                                    var12_12 = var18_25 - 8;
                                    var22_20 = (z<byte[]>)b.a;
                                    var7_7 = (Object)Arrays.copyOf((byte[])var22_20, ((Object)var22_20).length + var12_12);
                                    var0.b0(var11_14 + 8);
                                    var0.q((byte[])var7_7, ((Object)var22_20).length, var12_12);
                                    var7_7 = L.a((byte[])var7_7);
                                    var25_27 /* !! */  = var21_17;
                                    var26_28 = var20_18;
                                    ** GOTO lbl154
                                }
                                if (var12_12 == 1684425825) {
                                    var7_7 = (Object)new byte[var18_25 - 8];
                                    var7_7[0] = 102;
                                    var7_7[1] = (z<Object>)76;
                                    var7_7[2] = (z<Object>)97;
                                    var7_7[3] = (z<byte[]>)67;
                                    var0.b0(var11_14 + 12);
                                    var0.q((byte[])var7_7, 4, var18_25 - 12);
                                    var7_7 = z.A(var7_7);
                                    var25_27 /* !! */  = var21_17;
                                    var26_28 = var20_18;
                                    ** continue;
                                }
                                if (var12_12 == 1634492771) {
                                    var1_1 = var18_25 - 12;
                                    var22_20 = (z<byte[]>)new byte[var1_1];
                                    var0.b0(var11_14 + 12);
                                    var0.q((byte[])var22_20, 0, var1_1);
                                    var7_7 = ax.S0.i.z((byte[])var22_20);
                                    var15_23 = (Integer)var7_7.first;
                                    var14_13 = (Integer)var7_7.second;
                                    var7_7 = z.A(var22_20);
                                    var12_12 = var10_10;
lbl251:
                                    // 5 sources

                                    while (true) {
                                        var22_20 = var7_7;
                                        var7_7 = var20_18;
                                        var1_1 = var15_23;
                                        var9_9 = var14_13;
                                        var10_10 = var12_12;
                                        break block59;
                                        break;
                                    }
                                }
                                if (var12_12 == 1767990114) {
                                    var0.b0(var11_14 + 9);
                                    var12_12 = var0.R();
                                    var7_7 = (Object)new byte[var12_12];
                                    var0.q((byte[])var7_7, 0, var12_12);
                                    var20_18 = ax.S0.i.i(var7_7);
                                    var7_7 = z.A(var7_7);
                                    ** continue;
                                }
                                if (var12_12 != 1885564227) break block73;
                                var0.b0(var11_14 + 12);
                                var7_7 = (var0.M() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                var12_12 = var0.M();
                                if (var16_15 == 1768973165) {
                                    var10_10 = d0.k0(var12_12, var7_7);
                                } else if (var16_15 == 1718641517 && var12_12 == 32 && var7_7.equals((Object)ByteOrder.LITTLE_ENDIAN)) {
                                    var10_10 = 4;
                                }
                                var12_12 = var10_10;
                                if (var10_10 != -1) {
                                    var23_22 /* !! */  = "audio/raw";
                                }
                                var7_7 = var22_20;
                                var15_23 = var1_1;
                                var14_13 = var9_9;
                                ** GOTO lbl251
                            }
                            var8_8.b = new v.b().i0(var4_4).y0((String)var23_22 /* !! */ ).T(var9_9).z0(var1_1).c0(var27_16).n0(var5_5).P();
                        }
                        var7_7 = var20_18;
                        break block59;
                    }
                    var17_24 = var12_12 == 1702061171 ? var11_14 : b.c((ax.S0.G)var0, 1702061171, var11_14, var18_25);
                    var7_7 = var22_20;
                    var15_23 = var1_1;
                    var14_13 = var9_9;
                    var12_12 = var10_10;
                    if (var17_24 == -1) ** GOTO lbl251
                    var26_28 = b.n((ax.S0.G)var0, var17_24);
                    var25_27 /* !! */  = c.a((c)var26_28);
                    var29_29 = c.d((c)var26_28);
                    var7_7 = var22_20;
                    var15_23 = var1_1;
                    var14_13 = var9_9;
                    var23_22 /* !! */  = var25_27 /* !! */ ;
                    var24_21 = var26_28;
                    var12_12 = var10_10;
                    if (var29_29 == null) ** GOTO lbl251
                    if ("audio/vorbis".equals(var25_27 /* !! */ )) {
                        var7_7 = X.e(var29_29);
                        var15_23 = var1_1;
                        var14_13 = var9_9;
                        var23_22 /* !! */  = var25_27 /* !! */ ;
                        var24_21 = var26_28;
                        var12_12 = var10_10;
                        ** continue;
                    }
                    if ("audio/mp4a-latm".equals(var25_27 /* !! */ )) {
                        var7_7 = ax.q1.a.e(var29_29);
                        var1_1 = var7_7.a;
                        var9_9 = var7_7.b;
                        var7_7 = var7_7.c;
                    } else {
                        var7_7 = var20_18;
                    }
                    var22_20 = z.A(var29_29);
                    var24_21 = var26_28;
                    var23_22 /* !! */  = var25_27 /* !! */ ;
                }
                var11_14 += var18_25;
                var20_18 = var7_7;
            }
            if (var8_8.b == null && var23_22 /* !! */  != null) {
                var0 = new v.b().i0(var4_4).y0((String)var23_22 /* !! */ ).U((String)var20_18).T(var9_9).z0(var1_1).s0(var10_10).k0(var22_20).c0(var27_16).n0(var5_5);
                if (var24_21 != null) {
                    var0.S(ax.u7.f.n(c.c(var24_21))).t0(ax.u7.f.n(c.b(var24_21)));
                } else if (var21_17 != null) {
                    var0.S(ax.u7.f.n(ax.K1.b$a.b(var21_17))).t0(ax.u7.f.n(ax.K1.b$a.a(var21_17)));
                }
                var8_8.b = var0.P();
            }
        }
    }

    private static ax.P0.j j(ax.S0.G object) {
        j.b b8 = new j.b();
        ax.S0.F f8 = new ax.S0.F(((ax.S0.G)object).f());
        f8.p(((ax.S0.G)object).g() * 8);
        int n8 = 1;
        f8.s(1);
        int n9 = f8.h(3);
        f8.r(6);
        boolean bl = f8.g();
        boolean bl2 = f8.g();
        int n10 = 10;
        if (n9 == 2 && bl) {
            n9 = bl2 ? 12 : 10;
            b8.g(n9);
            if (bl2) {
                n10 = 12;
            }
            b8.b(n10);
        } else if (n9 <= 2) {
            n9 = bl ? 10 : 8;
            b8.g(n9);
            if (!bl) {
                n10 = 8;
            }
            b8.b(n10);
        }
        f8.r(13);
        f8.q();
        n10 = f8.h(4);
        if (n10 != 1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unsupported obu_type: ");
            ((StringBuilder)object).append(n10);
            ax.S0.u.f("BoxParsers", ((StringBuilder)object).toString());
            return b8.a();
        }
        if (f8.g()) {
            ax.S0.u.f("BoxParsers", "Unsupported obu_extension_flag");
            return b8.a();
        }
        bl = f8.g();
        f8.q();
        if (bl && f8.h(8) > 127) {
            ax.S0.u.f("BoxParsers", "Excessive obu_size");
            return b8.a();
        }
        int n11 = f8.h(3);
        f8.q();
        if (f8.g()) {
            ax.S0.u.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return b8.a();
        }
        if (f8.g()) {
            ax.S0.u.f("BoxParsers", "Unsupported timing_info_present_flag");
            return b8.a();
        }
        if (f8.g()) {
            ax.S0.u.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return b8.a();
        }
        int n12 = f8.h(5);
        n9 = 0;
        for (n10 = 0; n10 <= n12; ++n10) {
            f8.r(12);
            if (f8.h(5) <= 7) continue;
            f8.q();
        }
        n12 = f8.h(4);
        n10 = f8.h(4);
        f8.r(n12 + 1);
        f8.r(n10 + 1);
        if (f8.g()) {
            f8.r(7);
        }
        f8.r(7);
        bl = f8.g();
        if (bl) {
            f8.r(2);
        }
        if ((n10 = f8.g() ? 2 : f8.h(1)) > 0 && !f8.g()) {
            f8.r(1);
        }
        if (bl) {
            f8.r(3);
        }
        f8.r(3);
        bl = f8.g();
        if (n11 == 2 && bl) {
            f8.q();
        }
        n10 = n9;
        if (n11 != 1) {
            n10 = n9;
            if (f8.g()) {
                n10 = 1;
            }
        }
        if (f8.g()) {
            n11 = f8.h(8);
            n9 = f8.h(8);
            n12 = f8.h(8);
            n10 = n10 == 0 && n11 == 1 && n9 == 13 && n12 == 0 ? 1 : f8.h(1);
            object = b8.d(ax.P0.j.k(n11));
            n10 = n10 == 1 ? n8 : 2;
            ((j.b)object).c(n10).e(ax.P0.j.l(n9));
        }
        return b8.a();
    }

    private static a k(ax.S0.G g8, int n8) {
        g8.b0(n8 + 8);
        g8.c0(4);
        long l8 = g8.O();
        return new a(g8.O(), l8);
    }

    static Pair<Integer, u> l(ax.S0.G object, int n8, int n9) throws E {
        int n10 = n8 + 8;
        boolean bl = false;
        String string = null;
        Integer n11 = null;
        int n12 = -1;
        int n13 = 0;
        while (n10 - n8 < n9) {
            String string2;
            Integer n14;
            ((ax.S0.G)object).b0(n10);
            int n15 = ((ax.S0.G)object).v();
            int n16 = ((ax.S0.G)object).v();
            if (n16 == 1718775137) {
                n14 = ((ax.S0.G)object).v();
                string2 = string;
            } else if (n16 == 1935894637) {
                ((ax.S0.G)object).c0(4);
                string2 = ((ax.S0.G)object).J(4);
                n14 = n11;
            } else {
                string2 = string;
                n14 = n11;
                if (n16 == 1935894633) {
                    n12 = n10;
                    n13 = n15;
                    n14 = n11;
                    string2 = string;
                }
            }
            n10 += n15;
            string = string2;
            n11 = n14;
        }
        if (!("cenc".equals(string) || "cbc1".equals(string) || "cens".equals(string) || "cbcs".equals(string))) {
            return null;
        }
        boolean bl2 = n11 != null;
        ax.q1.u.a(bl2, "frma atom is mandatory");
        bl2 = n12 != -1;
        ax.q1.u.a(bl2, "schi atom is mandatory");
        object = b.A((ax.S0.G)object, n12, n13, string);
        bl2 = bl;
        if (object != null) {
            bl2 = true;
        }
        ax.q1.u.a(bl2, "tenc atom is mandatory");
        return Pair.create((Object)n11, (Object)((u)d0.i(object)));
    }

    private static Pair<long[], long[]> m(e.b object) {
        if ((object = ((e.b)object).e(1701606260)) == null) {
            return null;
        }
        ax.S0.G g8 = ((e.c)object).b;
        g8.b0(8);
        int n8 = b.q(g8.v());
        int n9 = g8.Q();
        long[] lArray = new long[n9];
        object = new long[n9];
        for (int i8 = 0; i8 < n9; ++i8) {
            long l8 = n8 == 1 ? g8.T() : g8.O();
            lArray[i8] = l8;
            l8 = n8 == 1 ? g8.F() : (long)g8.v();
            object[i8] = l8;
            if (g8.I() == 1) {
                g8.c0(2);
                continue;
            }
            throw new IllegalArgumentException("Unsupported media rate.");
        }
        return Pair.create((Object)lArray, (Object)object);
    }

    private static c n(ax.S0.G g8, int n8) {
        g8.b0(n8 + 12);
        g8.c0(1);
        b.o(g8);
        g8.c0(2);
        n8 = g8.M();
        if ((n8 & 0x80) != 0) {
            g8.c0(2);
        }
        if ((n8 & 0x40) != 0) {
            g8.c0(g8.M());
        }
        if ((n8 & 0x20) != 0) {
            g8.c0(2);
        }
        g8.c0(1);
        b.o(g8);
        String string = D.h(g8.M());
        if (!("audio/mpeg".equals(string) || "audio/vnd.dts".equals(string) || "audio/vnd.dts.hd".equals(string))) {
            g8.c0(4);
            long l8 = g8.O();
            long l9 = g8.O();
            g8.c0(1);
            n8 = b.o(g8);
            byte[] byArray = new byte[n8];
            g8.q(byArray, 0, n8);
            long l10 = -1L;
            if (l9 <= 0L) {
                l9 = -1L;
            }
            if (l8 > 0L) {
                l10 = l8;
            }
            return new c(string, byArray, l9, l10);
        }
        return new c(string, null, -1L, -1L);
    }

    private static int o(ax.S0.G g8) {
        int n8 = g8.M();
        int n9 = n8 & 0x7F;
        while ((n8 & 0x80) == 128) {
            n8 = g8.M();
            n9 = n9 << 7 | n8 & 0x7F;
        }
        return n9;
    }

    public static int p(int n8) {
        return n8 & 0xFFFFFF;
    }

    public static int q(int n8) {
        return n8 >> 24 & 0xFF;
    }

    private static int r(ax.S0.G g8) {
        g8.b0(16);
        return g8.v();
    }

    private static C s(ax.S0.G g8, int n8) {
        g8.c0(8);
        ArrayList<C.a> arrayList = new ArrayList<C.a>();
        while (g8.g() < n8) {
            C.a a8 = ax.K1.j.d(g8);
            if (a8 == null) continue;
            arrayList.add(a8);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C(arrayList);
    }

    private static e t(ax.S0.G g8) {
        long l8;
        long l9;
        block3: {
            long l10;
            int n8 = 8;
            g8.b0(8);
            int n9 = b.q(g8.v());
            int n10 = n9 == 0 ? 8 : 16;
            g8.c0(n10);
            l9 = g8.O();
            int n11 = g8.g();
            n10 = n8;
            if (n9 == 0) {
                n10 = 4;
            }
            n8 = 0;
            while (true) {
                l10 = -9223372036854775807L;
                if (n8 >= n10) break;
                if (g8.f()[n11 + n8] != -1) {
                    l8 = n9 == 0 ? g8.O() : g8.T();
                    l8 = l8 == 0L ? l10 : d0.p1(l8, 1000000L, l9);
                    break block3;
                }
                ++n8;
            }
            g8.c0(n10);
            l8 = l10;
        }
        return new e(l9, l8, b.e(g8.U()));
    }

    public static C u(e.b stringArray) {
        ArrayList<Object> arrayList = stringArray.e(1751411826);
        Object object = stringArray.e(1801812339);
        Object object2 = stringArray.e(1768715124);
        if (arrayList != null && object != null && object2 != null && b.r(((e.c)((Object)arrayList)).b) == 1835299937) {
            int n8;
            int n9;
            arrayList = ((e.c)object).b;
            ((ax.S0.G)((Object)arrayList)).b0(12);
            int n10 = ((ax.S0.G)((Object)arrayList)).v();
            stringArray = new String[n10];
            for (n9 = 0; n9 < n10; ++n9) {
                n8 = ((ax.S0.G)((Object)arrayList)).v();
                ((ax.S0.G)((Object)arrayList)).c0(4);
                stringArray[n9] = ((ax.S0.G)((Object)arrayList)).J(n8 - 8);
            }
            object2 = ((e.c)object2).b;
            ((ax.S0.G)object2).b0(8);
            arrayList = new ArrayList<Object>();
            while (((ax.S0.G)object2).a() > 8) {
                n8 = ((ax.S0.G)object2).g();
                n9 = ((ax.S0.G)object2).v();
                int n11 = ((ax.S0.G)object2).v() - 1;
                if (n11 >= 0 && n11 < n10) {
                    object = ax.K1.j.i((ax.S0.G)object2, n8 + n9, stringArray[n11]);
                    if (object != null) {
                        arrayList.add(object);
                    }
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Skipped metadata with unknown key index: ");
                    ((StringBuilder)object).append(n11);
                    ax.S0.u.h("BoxParsers", ((StringBuilder)object).toString());
                }
                ((ax.S0.G)object2).b0(n8 + n9);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C(arrayList);
        }
        return null;
    }

    private static void v(ax.S0.G object, int n8, int n9, int n10, h h8) {
        ((ax.S0.G)object).b0(n9 + 16);
        if (n8 == 1835365492) {
            ((ax.S0.G)object).G();
            object = ((ax.S0.G)object).G();
            if (object != null) {
                h8.b = new v.b().i0(n10).y0((String)object).P();
            }
        }
    }

    public static ax.T0.g w(ax.S0.G g8) {
        long l8;
        long l9;
        g8.b0(8);
        if (b.q(g8.v()) == 0) {
            l9 = g8.O();
            l8 = g8.O();
        } else {
            l9 = g8.F();
            l8 = g8.F();
        }
        return new ax.T0.g(l9, l8, g8.O());
    }

    private static float x(ax.S0.G g8, int n8) {
        g8.b0(n8 + 8);
        int n9 = g8.Q();
        n8 = g8.Q();
        return (float)n9 / (float)n8;
    }

    private static byte[] y(ax.S0.G g8, int n8, int n9) {
        int n10 = n8 + 8;
        while (n10 - n8 < n9) {
            g8.b0(n10);
            int n11 = g8.v();
            if (g8.v() == 1886547818) {
                return Arrays.copyOfRange(g8.f(), n10, n11 + n10);
            }
            n10 += n11;
        }
        return null;
    }

    private static Pair<Integer, u> z(ax.S0.G g8, int n8, int n9) throws E {
        int n10 = g8.g();
        while (n10 - n8 < n9) {
            Pair<Integer, u> pair;
            g8.b0(n10);
            int n11 = g8.v();
            boolean bl = n11 > 0;
            ax.q1.u.a(bl, "childAtomSize must be positive");
            if (g8.v() == 1936289382 && (pair = b.l(g8, n10, n11)) != null) {
                return pair;
            }
            n10 += n11;
        }
        return null;
    }

    private static final class a {
        private final long a;
        private final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }

    private static final class b {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final ax.S0.G f;
        private final ax.S0.G g;
        private int h;
        private int i;

        public b(ax.S0.G g8, ax.S0.G g9, boolean bl) throws E {
            this.g = g8;
            this.f = g9;
            this.e = bl;
            g9.b0(12);
            this.a = g9.Q();
            g8.b0(12);
            this.i = g8.Q();
            int n8 = g8.v();
            bl = true;
            if (n8 != 1) {
                bl = false;
            }
            ax.q1.u.a(bl, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int n8;
            this.b = n8 = this.b + 1;
            if (n8 == this.a) {
                return false;
            }
            long l8 = this.e ? this.f.T() : this.f.O();
            this.d = l8;
            if (this.b == this.h) {
                this.c = this.g.Q();
                this.g.c0(4);
                this.i = n8 = this.i - 1;
                n8 = n8 > 0 ? this.g.Q() - 1 : -1;
                this.h = n8;
            }
            return true;
        }
    }

    private static final class c {
        private final String a;
        private final byte[] b;
        private final long c;
        private final long d;

        public c(String string, byte[] byArray, long l8, long l9) {
            this.a = string;
            this.b = byArray;
            this.c = l8;
            this.d = l9;
        }
    }

    private static final class d {
        private final g a;

        public d(g g8) {
            this.a = g8;
        }
    }

    private static final class e {
        private final long a;
        private final long b;
        private final String c;

        public e(long l8, long l9, String string) {
            this.a = l8;
            this.b = l9;
            this.c = string;
        }
    }

    private static interface f {
        public int a();

        public int b();

        public int c();
    }

    private static final class g {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        public g(boolean bl, boolean bl2, boolean bl3) {
            this.a = bl;
            this.b = bl2;
            this.c = bl3;
        }
    }

    private static final class h {
        public final u[] a;
        public v b;
        public int c;
        public int d;

        public h(int n8) {
            this.a = new u[n8];
            this.d = 0;
        }
    }

    static final class i
    implements f {
        private final int a;
        private final int b;
        private final ax.S0.G c;

        public i(e.c object, v object2) {
            int n8;
            int n9;
            block4: {
                int n10;
                block5: {
                    this.c = object = ((e.c)object).b;
                    ((ax.S0.G)object).b0(12);
                    n8 = n9 = ((ax.S0.G)object).Q();
                    if (!"audio/raw".equals(((v)object2).o)) break block4;
                    n10 = d0.m0(((v)object2).I, ((v)object2).G);
                    if (n9 == 0) break block5;
                    n8 = n9;
                    if (n9 % n10 == 0) break block4;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Audio sample size mismatch. stsd sample size: ");
                ((StringBuilder)object2).append(n10);
                ((StringBuilder)object2).append(", stsz sample size: ");
                ((StringBuilder)object2).append(n9);
                ax.S0.u.h("BoxParsers", ((StringBuilder)object2).toString());
                n8 = n10;
            }
            n9 = n8;
            if (n8 == 0) {
                n9 = -1;
            }
            this.a = n9;
            this.b = ((ax.S0.G)object).Q();
        }

        @Override
        public int a() {
            return this.a;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public int c() {
            int n8;
            int n9 = n8 = this.a;
            if (n8 == -1) {
                n9 = this.c.Q();
            }
            return n9;
        }
    }

    static final class j
    implements f {
        private final ax.S0.G a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public j(e.c object) {
            this.a = object = ((e.c)object).b;
            ((ax.S0.G)object).b0(12);
            this.c = ((ax.S0.G)object).Q() & 0xFF;
            this.b = ((ax.S0.G)object).Q();
        }

        @Override
        public int a() {
            return -1;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public int c() {
            int n8 = this.c;
            if (n8 == 8) {
                return this.a.M();
            }
            if (n8 == 16) {
                return this.a.U();
            }
            n8 = this.d;
            this.d = n8 + 1;
            if (n8 % 2 == 0) {
                this.e = n8 = this.a.M();
                return (n8 & 0xF0) >> 4;
            }
            return this.e & 0xF;
        }
    }

    private static final class k {
        private final int a;
        private final long b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;

        public k(int n8, long l8, int n9, int n10, int n11, int n12) {
            this.a = n8;
            this.b = l8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
        }
    }

    static final class l {
        private final d a;

        public l(d d8) {
            this.a = d8;
        }

        public boolean b() {
            d d8 = this.a;
            return d8 != null && d8.a.a && this.a.a.b;
        }
    }
}

