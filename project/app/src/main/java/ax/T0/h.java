/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.P0.D;
import ax.P0.v;
import ax.S0.u;
import ax.r7.z;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public final class h {
    public static final byte[] a = new byte[]{0, 0, 0, 1};
    public static final float[] b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static l A(byte[] byArray, int n8, int n9) {
        return h.B(byArray, n8 + 1, n9);
    }

    public static l B(byte[] object, int n8, int n9) {
        object = new ax.T0.j((byte[])object, n8, n9);
        n9 = ((ax.T0.j)object).i();
        n8 = ((ax.T0.j)object).i();
        ((ax.T0.j)object).l();
        return new l(n9, n8, ((ax.T0.j)object).e());
    }

    public static m C(byte[] byArray, int n8, int n9) {
        return h.D(byArray, n8 + 1, n9);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static m D(byte[] object, int n8, int n9) {
        boolean bl;
        float f8;
        boolean bl2;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl3;
        int n18;
        int n19;
        boolean bl4;
        int n20;
        int n21;
        int n22;
        int n23;
        int n24;
        block28: {
            block27: {
                block26: {
                    block24: {
                        float f9;
                        block25: {
                            object = new ax.T0.j((byte[])object, n8, n9);
                            n24 = ((ax.T0.j)object).f(8);
                            n23 = ((ax.T0.j)object).f(8);
                            n22 = ((ax.T0.j)object).f(8);
                            n21 = ((ax.T0.j)object).i();
                            if (n24 != 100 && n24 != 110 && n24 != 122 && n24 != 244 && n24 != 44 && n24 != 83 && n24 != 86 && n24 != 118 && n24 != 128 && n24 != 138) {
                                n20 = 0;
                                n9 = 1;
                                bl4 = false;
                                n19 = 0;
                            } else {
                                n18 = ((ax.T0.j)object).i();
                                bl3 = n18 == 3 ? ((ax.T0.j)object).e() : false;
                                n19 = ((ax.T0.j)object).i();
                                n20 = ((ax.T0.j)object).i();
                                ((ax.T0.j)object).l();
                                if (((ax.T0.j)object).e()) {
                                    n8 = n18 != 3 ? 8 : 12;
                                    for (n9 = 0; n9 < n8; ++n9) {
                                        if (!((ax.T0.j)object).e()) continue;
                                        n17 = n9 < 6 ? 16 : 64;
                                        h.J((ax.T0.j)object, n17);
                                    }
                                }
                                bl4 = bl3;
                                n9 = n18;
                            }
                            n16 = ((ax.T0.j)object).i();
                            n15 = ((ax.T0.j)object).i();
                            if (n15 == 0) {
                                n14 = ((ax.T0.j)object).i() + 4;
                                bl3 = false;
                            } else {
                                if (n15 == 1) {
                                    bl3 = ((ax.T0.j)object).e();
                                    ((ax.T0.j)object).h();
                                    ((ax.T0.j)object).h();
                                    long l8 = ((ax.T0.j)object).i();
                                    n8 = 0;
                                    while ((long)n8 < l8) {
                                        ((ax.T0.j)object).i();
                                        ++n8;
                                    }
                                } else {
                                    bl3 = false;
                                }
                                n14 = 0;
                            }
                            n13 = ((ax.T0.j)object).i();
                            ((ax.T0.j)object).l();
                            n17 = ((ax.T0.j)object).i();
                            n8 = ((ax.T0.j)object).i();
                            n12 = ((ax.T0.j)object).e();
                            if (n12 == 0) {
                                ((ax.T0.j)object).l();
                            }
                            ((ax.T0.j)object).l();
                            n18 = (n17 + 1) * 16;
                            n17 = (2 - n12) * (n8 + 1) * 16;
                            n11 = n18;
                            n10 = n17;
                            if (((ax.T0.j)object).e()) {
                                n11 = ((ax.T0.j)object).i();
                                int n25 = ((ax.T0.j)object).i();
                                int n26 = ((ax.T0.j)object).i();
                                int n27 = ((ax.T0.j)object).i();
                                if (n9 == 0) {
                                    n8 = 2 - n12;
                                    n9 = 1;
                                } else {
                                    n8 = n9 == 3 ? 1 : 2;
                                    n9 = n9 == 1 ? 2 : 1;
                                    n10 = n9 * (2 - n12);
                                    n9 = n8;
                                    n8 = n10;
                                }
                                n11 = n18 - (n11 + n25) * n9;
                                n10 = n17 - (n26 + n27) * n8;
                            }
                            n8 = (n24 == 44 || n24 == 86 || n24 == 100 || n24 == 110 || n24 == 122 || n24 == 244) && (n23 & 0x10) != 0 ? 0 : 16;
                            bl2 = ((ax.T0.j)object).e();
                            f9 = 1.0f;
                            if (!bl2) {
                                f8 = 1.0f;
                                n18 = -1;
                                n9 = -1;
                                n17 = -1;
                                return new m(n24, n23, n22, n21, n13, n11, n10, f8, n19, n20, bl4, n12 != 0, n16 + 4, n15, n14, bl3, n18, n9, n17, n8);
                            }
                            f8 = f9;
                            if (!((ax.T0.j)object).e()) break block24;
                            n9 = ((ax.T0.j)object).f(8);
                            if (n9 != 255) break block25;
                            n9 = ((ax.T0.j)object).f(16);
                            n17 = ((ax.T0.j)object).f(16);
                            f8 = f9;
                            if (n9 != 0) {
                                f8 = f9;
                                if (n17 != 0) {
                                    f8 = (float)n9 / (float)n17;
                                }
                            }
                            break block24;
                        }
                        float[] fArray = b;
                        if (n9 < fArray.length) {
                            f8 = fArray[n9];
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                            stringBuilder.append(n9);
                            u.h("NalUnitUtil", stringBuilder.toString());
                            f8 = f9;
                        }
                    }
                    if (((ax.T0.j)object).e()) {
                        ((ax.T0.j)object).l();
                    }
                    if (!((ax.T0.j)object).e()) break block26;
                    ((ax.T0.j)object).m(3);
                    n9 = ((ax.T0.j)object).e() ? 1 : 2;
                    if (!((ax.T0.j)object).e()) break block27;
                    n18 = ((ax.T0.j)object).f(8);
                    n17 = ((ax.T0.j)object).f(8);
                    ((ax.T0.j)object).m(8);
                    n18 = ax.P0.j.k(n18);
                    n17 = ax.P0.j.l(n17);
                    break block28;
                }
                n9 = -1;
            }
            n17 = -1;
            n18 = -1;
        }
        if (((ax.T0.j)object).e()) {
            ((ax.T0.j)object).i();
            ((ax.T0.j)object).i();
        }
        if (((ax.T0.j)object).e()) {
            ((ax.T0.j)object).m(65);
        }
        if (bl2 = ((ax.T0.j)object).e()) {
            h.I((ax.T0.j)object);
        }
        if (bl = ((ax.T0.j)object).e()) {
            h.I((ax.T0.j)object);
        }
        if (bl2 || bl) {
            ((ax.T0.j)object).l();
        }
        ((ax.T0.j)object).l();
        if (!((ax.T0.j)object).e()) return new m(n24, n23, n22, n21, n13, n11, n10, f8, n19, n20, bl4, n12 != 0, n16 + 4, n15, n14, bl3, n18, n9, n17, n8);
        ((ax.T0.j)object).l();
        ((ax.T0.j)object).i();
        ((ax.T0.j)object).i();
        ((ax.T0.j)object).i();
        ((ax.T0.j)object).i();
        n8 = ((ax.T0.j)object).i();
        ((ax.T0.j)object).i();
        return new m(n24, n23, n22, n21, n13, n11, n10, f8, n19, n20, bl4, n12 != 0, n16 + 4, n15, n14, bl3, n18, n9, n17, n8);
    }

    private static void E(ax.T0.j j8, int n8, int[] nArray, int[] nArray2, boolean[][] blArray) {
        for (int i8 = 1; i8 < n8; ++i8) {
            boolean bl = j8.e();
            for (int i9 = 0; i9 < nArray[i8]; ++i9) {
                boolean bl2 = i9 > 0 && bl ? j8.e() : i9 == 0;
                if (!bl2) continue;
                for (int i10 = 0; i10 < nArray2[i8]; ++i10) {
                    if (!blArray[i8][i10]) continue;
                    j8.i();
                }
                j8.i();
                j8.i();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void F(ax.T0.j j8, boolean bl, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        block13: {
            block12: {
                block10: {
                    block11: {
                        if (!bl) break block10;
                        n12 = j8.e();
                        n11 = j8.e();
                        if (n12 != 0) break block11;
                        n10 = n11;
                        n9 = n12;
                        if (n11 == 0) break block12;
                    }
                    if (bl = j8.e()) {
                        j8.m(19);
                    }
                    j8.m(8);
                    if (bl) {
                        j8.m(4);
                    }
                    j8.m(15);
                    n10 = n11;
                    n9 = n12;
                    break block13;
                }
                n9 = 0;
                n10 = 0;
            }
            bl = false;
        }
        n12 = 0;
        while (n12 <= n8) {
            boolean bl2;
            boolean bl3 = bl2 = j8.e();
            if (!bl2) {
                bl3 = j8.e();
            }
            if (bl3) {
                j8.i();
                bl3 = false;
            } else {
                bl3 = j8.e();
            }
            n11 = !bl3 ? j8.i() : 0;
            for (int i8 = 0; i8 < n9 + n10; ++i8) {
                for (int i9 = 0; i9 <= n11; ++i9) {
                    j8.i();
                    j8.i();
                    if (bl) {
                        j8.i();
                        j8.i();
                    }
                    j8.l();
                }
            }
            ++n12;
        }
        return;
    }

    private static void G(ax.T0.j j8) {
        for (int i8 = 0; i8 < 4; ++i8) {
            int n8;
            for (int i9 = 0; i9 < 6; i9 += n8) {
                boolean bl = j8.e();
                int n9 = 1;
                if (!bl) {
                    j8.i();
                } else {
                    int n10 = Math.min(64, 1 << (i8 << 1) + 4);
                    if (i8 > 1) {
                        j8.h();
                    }
                    for (n8 = 0; n8 < n10; ++n8) {
                        j8.h();
                    }
                }
                n8 = n9;
                if (i8 != 3) continue;
                n8 = 3;
            }
        }
    }

    private static void H(ax.T0.j j8) {
        int n8 = j8.i();
        int[] nArray = new int[]{};
        int[] nArray2 = new int[]{};
        int n9 = -1;
        int n10 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11;
            int n12;
            int n13;
            if (i8 != 0 && j8.e()) {
                int n14;
                int n15 = n9 + n10;
                int n16 = (1 - j8.e() * 2) * (j8.i() + 1);
                n13 = n15 + 1;
                boolean[] blArray = new boolean[n13];
                for (n12 = 0; n12 <= n15; ++n12) {
                    blArray[n12] = !j8.e() ? j8.e() : true;
                }
                int[] nArray3 = new int[n13];
                int[] nArray4 = new int[n13];
                n12 = 0;
                for (n13 = n10 - 1; n13 >= 0; --n13) {
                    n14 = nArray2[n13] + n16;
                    n11 = n12;
                    if (n14 < 0) {
                        n11 = n12;
                        if (blArray[n9 + n13]) {
                            nArray3[n12] = n14;
                            n11 = n12 + 1;
                        }
                    }
                    n12 = n11;
                }
                n13 = n12;
                if (n16 < 0) {
                    n13 = n12;
                    if (blArray[n15]) {
                        nArray3[n12] = n16;
                        n13 = n12 + 1;
                    }
                }
                n11 = 0;
                n12 = n13;
                for (n13 = n11; n13 < n9; ++n13) {
                    n14 = nArray[n13] + n16;
                    n11 = n12;
                    if (n14 < 0) {
                        n11 = n12;
                        if (blArray[n13]) {
                            nArray3[n12] = n14;
                            n11 = n12 + 1;
                        }
                    }
                    n12 = n11;
                }
                nArray3 = Arrays.copyOf(nArray3, n12);
                n13 = 0;
                for (n14 = n9 - 1; n14 >= 0; --n14) {
                    int n17 = nArray[n14] + n16;
                    n11 = n13;
                    if (n17 > 0) {
                        n11 = n13;
                        if (blArray[n14]) {
                            nArray4[n13] = n17;
                            n11 = n13 + 1;
                        }
                    }
                    n13 = n11;
                }
                n11 = n13;
                if (n16 > 0) {
                    n11 = n13;
                    if (blArray[n15]) {
                        nArray4[n13] = n16;
                        n11 = n13 + 1;
                    }
                }
                n13 = n11;
                for (n14 = 0; n14 < n10; ++n14) {
                    n15 = nArray2[n14] + n16;
                    n11 = n13;
                    if (n15 > 0) {
                        n11 = n13;
                        if (blArray[n9 + n14]) {
                            nArray4[n13] = n15;
                            n11 = n13 + 1;
                        }
                    }
                    n13 = n11;
                }
                nArray2 = Arrays.copyOf(nArray4, n13);
                nArray = nArray3;
                n11 = n13;
                n13 = n12;
                n12 = n11;
            } else {
                n10 = j8.i();
                n11 = j8.i();
                nArray = new int[n10];
                for (n12 = 0; n12 < n10; ++n12) {
                    n13 = n12 > 0 ? nArray[n12 - 1] : 0;
                    nArray[n12] = n13 - (j8.i() + 1);
                    j8.l();
                }
                nArray2 = new int[n11];
                for (n12 = 0; n12 < n11; ++n12) {
                    n13 = n12 > 0 ? nArray2[n12 - 1] : 0;
                    nArray2[n12] = n13 + (j8.i() + 1);
                    j8.l();
                }
                n13 = n10;
                n12 = n11;
            }
            n9 = n13;
            n10 = n12;
        }
    }

    private static void I(ax.T0.j j8) {
        int n8 = j8.i();
        j8.m(8);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            j8.i();
            j8.i();
            j8.l();
        }
        j8.m(20);
    }

    private static void J(ax.T0.j j8, int n8) {
        int n9 = 8;
        int n10 = 8;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11 = n9;
            if (n9 != 0) {
                n11 = (j8.h() + n10 + 256) % 256;
            }
            if (n11 != 0) {
                n10 = n11;
            }
            n9 = n11;
        }
    }

    private static void K(ax.T0.j j8, int n8, boolean[][] blArray) {
        int n9;
        int n10 = j8.i() + 2;
        boolean bl = j8.e();
        int n11 = 1;
        if (bl) {
            j8.m(n10);
        } else {
            for (n9 = 1; n9 < n8; ++n9) {
                for (int i8 = 0; i8 < n9; ++i8) {
                    if (!blArray[n9][i8]) continue;
                    j8.m(n10);
                }
            }
        }
        n9 = j8.i();
        for (n8 = n11; n8 <= n9; ++n8) {
            j8.m(8);
        }
    }

    /*
     * Exception decompiling
     */
    public static int L(byte[] var0, int var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 66->73)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int a(int n8, int n9, int n10, int n11) {
        int n12 = 1;
        if (n9 == 1) {
            n12 = 2;
        }
        return n8 - n12 * (n10 + n11);
    }

    private static int b(int n8, int n9, int n10, int n11) {
        int n12;
        int n13 = n12 = 2;
        if (n9 != 1) {
            n13 = n9 == 2 ? n12 : 1;
        }
        return n8 - n13 * (n10 + n11);
    }

    public static void c(boolean[] blArray) {
        blArray[0] = false;
        blArray[1] = false;
        blArray[2] = false;
    }

    private static String d(ax.T0.j object) {
        ((ax.T0.j)object).m(4);
        int n8 = ((ax.T0.j)object).f(3);
        ((ax.T0.j)object).l();
        object = h.q((ax.T0.j)object, true, n8, null);
        return ax.S0.i.h(((c)object).a, ((c)object).b, ((c)object).c, ((c)object).d, ((c)object).e, ((c)object).f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int e(byte[] byArray, int n8, int n9, boolean[] blArray) {
        int n10 = n9 - n8;
        boolean bl = false;
        boolean bl2 = n10 >= 0;
        ax.S0.a.g(bl2);
        if (n10 == 0) {
            return n9;
        }
        if (blArray[0]) {
            h.c(blArray);
            return n8 - 3;
        }
        if (n10 > 1 && blArray[1] && byArray[n8] == 1) {
            h.c(blArray);
            return n8 - 2;
        }
        if (n10 > 2 && blArray[2] && byArray[n8] == 0 && byArray[n8 + 1] == 1) {
            h.c(blArray);
            return n8 - 1;
        }
        int n11 = n9 - 1;
        n8 += 2;
        while (n8 < n11) {
            byte by = byArray[n8];
            if ((by & 0xFE) == 0) {
                int n12 = n8 - 2;
                if (byArray[n12] == 0 && byArray[n8 - 1] == 0 && by == 1) {
                    h.c(blArray);
                    return n12;
                }
                n8 -= 2;
            }
            n8 += 3;
        }
        bl2 = n10 > 2 ? byArray[n9 - 3] == 0 && byArray[n9 - 2] == 0 && byArray[n11] == 1 : (n10 == 2 ? blArray[2] && byArray[n9 - 2] == 0 && byArray[n11] == 1 : blArray[1] && byArray[n11] == 1);
        blArray[0] = bl2;
        bl2 = n10 > 1 ? byArray[n9 - 2] == 0 && byArray[n11] == 0 : blArray[2] && byArray[n11] == 0;
        blArray[1] = bl2;
        bl2 = bl;
        if (byArray[n11] == 0) {
            bl2 = true;
        }
        blArray[2] = bl2;
        return n9;
    }

    private static z<Integer> f(byte[] byArray) {
        boolean[] blArray = new boolean[3];
        z.a<Integer> a8 = z.r();
        for (int i8 = 0; i8 < byArray.length; i8 += 3) {
            if ((i8 = h.e(byArray, i8, byArray.length, blArray)) == byArray.length) continue;
            a8.h(i8);
        }
        return a8.k();
    }

    private static int g(byte[] byArray, int n8, int n9) {
        while (n8 < n9 - 2) {
            if (byArray[n8] == 0 && byArray[n8 + 1] == 0 && byArray[n8 + 2] == 3) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static String h(List<byte[]> list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            byte[] byArray = list.get(i8);
            int n8 = byArray.length;
            if (n8 <= 3) continue;
            z<Integer> z8 = h.f(byArray);
            for (int i9 = 0; i9 < z8.size(); ++i9) {
                if ((Integer)z8.get(i9) + 3 >= n8) continue;
                ax.T0.j j8 = new ax.T0.j(byArray, (Integer)z8.get(i9) + 3, n8);
                b b8 = h.p(j8);
                if (b8.a != 33 || b8.b != 0) continue;
                return h.d(j8);
            }
        }
        return null;
    }

    public static int i(byte[] byArray, int n8) {
        return (byArray[n8 + 3] & 0x7E) >> 1;
    }

    public static int j(byte[] byArray, int n8) {
        return byArray[n8 + 3] & 0x1F;
    }

    public static boolean k(byte[] byArray, int n8, int n9, v v8) {
        if (j.Objects.equals((Object)v8.o, (Object)"video/avc")) {
            return h.l(byArray[n8]);
        }
        if (j.Objects.equals((Object)v8.o, (Object)"video/hevc")) {
            return h.m(byArray, n8, n9, v8);
        }
        return true;
    }

    public static boolean l(byte by) {
        if ((by & 0x60) >> 5 != 0) {
            return true;
        }
        if ((by = (byte)(by & 0x1F)) == 1) {
            return false;
        }
        if (by == 9) {
            return false;
        }
        return by != 14;
    }

    private static boolean m(byte[] object, int n8, int n9, v v8) {
        object = h.p(new ax.T0.j((byte[])object, n8, n9 + n8));
        n8 = object.a;
        if (n8 == 35) {
            return false;
        }
        return n8 > 14 || n8 % 2 != 0 || object.c != v8.F - 1;
    }

    public static boolean n(v v8, byte by) {
        return (j.Objects.equals((Object)v8.o, (Object)"video/avc") || D.b(v8.k, "video/avc")) && (by & 0x1F) == 6 || (j.Objects.equals((Object)v8.o, (Object)"video/hevc") || D.b(v8.k, "video/hevc")) && (by & 0x7E) >> 1 == 39;
        {
        }
    }

    public static int o(v v8) {
        if (j.Objects.equals((Object)v8.o, (Object)"video/avc")) {
            return 1;
        }
        if (!j.Objects.equals((Object)v8.o, (Object)"video/hevc") && !D.b(v8.k, "video/hevc")) {
            return 0;
        }
        return 2;
    }

    private static b p(ax.T0.j j8) {
        j8.l();
        return new b(j8.f(6), j8.f(6), j8.f(3) - 1);
    }

    /*
     * Unable to fully structure code
     */
    private static c q(ax.T0.j var0, boolean var1_1, int var2_2, c var3_3) {
        var11_4 = new int[6];
        var9_5 = 0;
        if (var1_1) {
            var8_6 = var0.f(2);
            var1_1 = var0.e();
            var7_7 = var0.f(5);
            var4_9 = 0;
            for (var6_8 = 0; var6_8 < 32; ++var6_8) {
                var5_10 = var4_9;
                if (var0.e()) {
                    var5_10 = var4_9 | 1 << var6_8;
                }
                var4_9 = var5_10;
            }
            for (var5_10 = 0; var5_10 < 6; ++var5_10) {
                var11_4[var5_10] = var0.f(8);
            }
            var5_10 = var8_6;
            var6_8 = var7_7;
            var3_3 = var11_4;
lbl20:
            // 2 sources

            while (true) {
                var7_7 = var6_8;
                var6_8 = var5_10;
                var8_6 = var4_9;
                break;
            }
        } else {
            if (var3_3 != null) {
                var5_10 = var3_3.a;
                var1_1 = var3_3.b;
                var6_8 = var3_3.c;
                var4_9 = var3_3.d;
                var3_3 = var3_3.e;
                ** continue;
            }
            var6_8 = 0;
            var1_1 = false;
            var7_7 = 0;
            var8_6 = 0;
            var3_3 = var11_4;
        }
        var10_11 = var0.f(8);
        var4_9 = 0;
        while (var9_5 < var2_2) {
            var5_10 = var4_9;
            if (var0.e()) {
                var5_10 = var4_9 + 88;
            }
            var4_9 = var5_10;
            if (var0.e()) {
                var4_9 = var5_10 + 8;
            }
            ++var9_5;
        }
        var0.m(var4_9);
        if (var2_2 > 0) {
            var0.m((8 - var2_2) * 2);
        }
        return new c(var6_8, var1_1, var7_7, var8_6, (int[])var3_3, var10_11);
    }

    private static e r(ax.T0.j j8) {
        int n8;
        int n9;
        int n10;
        int n11 = j8.f(16);
        int n12 = j8.f(16);
        if (j8.e()) {
            n10 = j8.f(2);
            if (n10 == 3) {
                j8.l();
            }
            n9 = j8.f(4);
            n8 = j8.f(4);
        } else {
            n10 = 0;
            n9 = 0;
            n8 = 0;
        }
        int n13 = n12;
        int n14 = n11;
        if (j8.e()) {
            int n15 = j8.i();
            n14 = j8.i();
            int n16 = j8.i();
            n13 = j8.i();
            n14 = h.b(n11, n10, n15, n14);
            n13 = h.a(n12, n10, n16, n13);
        }
        return new e(n10, n9, n8, n14, n13);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static f s(ax.T0.j j8, int n8) {
        int n9;
        int n10 = j8.i();
        int n11 = n10 + 1;
        z.a<e> a8 = z.s(n11);
        int[] nArray = new int[n8];
        for (n9 = 0; n9 < n11; ++n9) {
            a8.h(h.r(j8));
        }
        int n12 = 1;
        int n13 = 1;
        n9 = n12;
        if (n11 > 1) {
            n9 = n12;
            if (j8.e()) {
                n12 = ax.t7.a.d(n11, RoundingMode.CEILING);
                n9 = n13;
                while (n9 < n8) {
                    nArray[n9] = j8.f(n12);
                    ++n9;
                }
                return new f(a8.k(), nArray);
            }
        }
        while (n9 < n8) {
            nArray[n9] = Math.min(n9, n10);
            ++n9;
        }
        return new f(a8.k(), nArray);
    }

    public static g t(byte[] object, int n8, int n9) {
        int n10 = n8 + 2;
        n8 = n9 - 1;
        while ((n9 = object[n8]) == 0 && n8 > n10) {
            --n8;
        }
        if (n9 != 0 && n8 > n10) {
            object = new ax.T0.j((byte[])object, n10, n8 + 1);
            while (((ax.T0.j)object).c(16)) {
                n9 = ((ax.T0.j)object).f(8);
                n8 = 0;
                while (n9 == 255) {
                    n8 += 255;
                    n9 = ((ax.T0.j)object).f(8);
                }
                n10 = ((ax.T0.j)object).f(8);
                int n11 = 0;
                while (n10 == 255) {
                    n11 += 255;
                    n10 = ((ax.T0.j)object).f(8);
                }
                if ((n10 = n11 + n10) == 0 || !((ax.T0.j)object).c(n10)) break;
                if (n8 + n9 == 176) {
                    int n12 = ((ax.T0.j)object).i();
                    boolean bl = ((ax.T0.j)object).e();
                    n8 = bl ? ((ax.T0.j)object).i() : 0;
                    int n13 = ((ax.T0.j)object).i();
                    int n14 = -1;
                    int n15 = -1;
                    int n16 = -1;
                    int n17 = -1;
                    n11 = -1;
                    n10 = -1;
                    for (n9 = 0; n9 <= n13; ++n9) {
                        n17 = ((ax.T0.j)object).i();
                        n15 = ((ax.T0.j)object).i();
                        n16 = ((ax.T0.j)object).f(6);
                        if (n16 == 63) {
                            return null;
                        }
                        n14 = n16 == 0 ? Math.max(0, n12 - 30) : Math.max(0, n16 + n12 - 31);
                        int n18 = ((ax.T0.j)object).f(n14);
                        if (bl) {
                            n11 = ((ax.T0.j)object).f(6);
                            if (n11 == 63) {
                                return null;
                            }
                            n10 = n11 == 0 ? Math.max(0, n8 - 30) : Math.max(0, n11 + n8 - 31);
                            n10 = ((ax.T0.j)object).f(n10);
                        }
                        if (((ax.T0.j)object).e()) {
                            ((ax.T0.j)object).m(10);
                        }
                        n14 = n17;
                        n17 = n18;
                    }
                    return new g(n12, n8, n13 + 1, n14, n15, n16, n17, n11, n10);
                }
                ((ax.T0.j)object).m(n10 * 8);
            }
        }
        return null;
    }

    public static h u(byte[] byArray, int n8, int n9, k k8) {
        return h.v(byArray, n8 + 2, n9, h.p(new ax.T0.j(byArray, n8, n9)), k8);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static h v(byte[] var0, int var1_1, int var2_2, b var3_3, k var4_4) {
        block39: {
            block34: {
                block31: {
                    block37: {
                        block38: {
                            block36: {
                                block35: {
                                    block33: {
                                        block32: {
                                            var22_5 = new ax.T0.j(var0 /* !! */ , var1_1, var2_2);
                                            var22_5.m(4);
                                            var17_6 = var22_5.f(3);
                                            var13_7 = var3_3.b != 0 && var17_6 == 7 ? 1 : 0;
                                            if (var4_4 != null && !var4_4.b.isEmpty()) {
                                                var1_1 = Math.min(var3_3.b, var4_4.b.size() - 1);
                                                var7_8 = ((a)var4_4.b.get((int)var1_1)).a;
                                            } else {
                                                var7_8 = 0;
                                            }
                                            var21_9 = null;
                                            if (var13_7 == 0) {
                                                var22_5.l();
                                                var0 /* !! */  = (byte[])h.q(var22_5, true, var17_6, null);
                                            } else {
                                                var0 /* !! */  = var21_9;
                                                if (var4_4 != null) {
                                                    var23_10 = var4_4.c;
                                                    var1_1 = var23_10.b[var7_8];
                                                    var0 /* !! */  = var21_9;
                                                    if (var23_10.a.size() > var1_1) {
                                                        var0 /* !! */  = (byte[])((c)var4_4.c.a.get(var1_1));
                                                    }
                                                }
                                            }
                                            var18_11 = var22_5.i();
                                            if (var13_7 == 0) break block32;
                                            var1_1 = var22_5.e() != false ? var22_5.f(8) : -1;
                                            if (var4_4 == null || (var21_9 = var4_4.d) == null) ** GOTO lbl-1000
                                            var2_2 = var1_1;
                                            if (var1_1 == -1) {
                                                var2_2 = var21_9.b[var7_8];
                                            }
                                            if (var2_2 != -1 && var21_9.a.size() > var2_2) {
                                                var21_9 = (e)var4_4.d.a.get(var2_2);
                                                var11_12 = var21_9.a;
                                                var12_13 = var21_9.d;
                                                var1_1 = var21_9.e;
                                                var8_14 = var21_9.b;
                                                var10_15 = var21_9.c;
                                                var2_2 = var1_1;
                                                var9_16 = var12_13;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var2_2 = 0;
                                                var1_1 = 0;
                                                var8_14 = 0;
                                                var9_16 = 0;
                                                var10_15 = 0;
                                                var11_12 = 0;
                                                var12_13 = 0;
                                            }
                                            break block33;
                                        }
                                        var11_12 = var22_5.i();
                                        if (var11_12 == 3) {
                                            var22_5.l();
                                        }
                                        var6_17 = var22_5.i();
                                        var8_14 = var22_5.i();
                                        if (var22_5.e()) {
                                            var10_15 = var22_5.i();
                                            var1_1 = var22_5.i();
                                            var2_2 = var22_5.i();
                                            var9_16 = var22_5.i();
                                            var1_1 = h.b(var6_17, var11_12, var10_15, var1_1);
                                            var2_2 = h.a(var8_14, var11_12, var2_2, var9_16);
                                        } else {
                                            var2_2 = var8_14;
                                            var1_1 = var6_17;
                                        }
                                        var9_16 = var22_5.i();
                                        var10_15 = var22_5.i();
                                        var14_18 = var8_14;
                                        var8_14 = var9_16;
                                        var12_13 = var1_1;
                                        var9_16 = var6_17;
                                        var1_1 = var2_2;
                                        var2_2 = var14_18;
                                    }
                                    var19_19 = var22_5.i();
                                    if (var13_7 == 0) {
                                        var6_17 = var22_5.e() != false ? 0 : var17_6;
                                        var14_18 = -1;
                                        var16_20 = var6_17;
                                        var6_17 = var14_18;
                                        while (true) {
                                            var14_18 = var6_17;
                                            var15_21 = var2_2;
                                            if (var16_20 <= var17_6) {
                                                var22_5.i();
                                                var6_17 = Math.max(var22_5.i(), var6_17);
                                                var22_5.i();
                                                ++var16_20;
                                                continue;
                                            }
                                            break;
                                        }
                                    } else {
                                        var14_18 = -1;
                                        var15_21 = var2_2;
                                    }
                                    var22_5.i();
                                    var22_5.i();
                                    var22_5.i();
                                    var22_5.i();
                                    var22_5.i();
                                    var22_5.i();
                                    if (var22_5.e()) {
                                        var20_22 = var13_7 != 0 ? var22_5.e() : false;
                                        if (var20_22) {
                                            var22_5.m(6);
                                        } else if (var22_5.e()) {
                                            h.G(var22_5);
                                        }
                                    }
                                    var22_5.m(2);
                                    if (var22_5.e()) {
                                        var22_5.m(8);
                                        var22_5.i();
                                        var22_5.i();
                                        var22_5.l();
                                    }
                                    h.H(var22_5);
                                    if (var22_5.e()) {
                                        var6_17 = var22_5.i();
                                        for (var2_2 = 0; var2_2 < var6_17; ++var2_2) {
                                            var22_5.m(var19_19 + 5);
                                        }
                                    }
                                    var22_5.m(2);
                                    if (!var22_5.e()) break block34;
                                    if (!var22_5.e()) ** GOTO lbl146
                                    var2_2 = var22_5.f(8);
                                    if (var2_2 != 255) break block35;
                                    var2_2 = var22_5.f(16);
                                    var6_17 = var22_5.f(16);
                                    if (var2_2 == 0 || var6_17 == 0) ** GOTO lbl146
                                    var5_23 = (float)var2_2 / (float)var6_17;
                                    break block36;
                                }
                                var21_9 = h.b;
                                if (var2_2 < ((Object)var21_9).length) {
                                    var5_23 = (float)var21_9[var2_2];
                                } else {
                                    var21_9 = new StringBuilder();
                                    var21_9.append("Unexpected aspect_ratio_idc value: ");
                                    var21_9.append(var2_2);
                                    u.h("NalUnitUtil", var21_9.toString());
lbl146:
                                    // 3 sources

                                    var5_23 = 1.0f;
                                }
                            }
                            if (var22_5.e()) {
                                var22_5.l();
                            }
                            if (!var22_5.e()) break block37;
                            var22_5.m(3);
                            var2_2 = var22_5.e() != false ? 1 : 2;
                            var6_17 = var2_2;
                            if (!var22_5.e()) break block38;
                            var6_17 = var22_5.f(8);
                            var7_8 = var22_5.f(8);
                            var22_5.m(8);
                            var6_17 = ax.P0.j.k(var6_17);
                            var7_8 = ax.P0.j.l(var7_8);
                            break block31;
                        }
lbl162:
                        // 2 sources

                        while (true) {
                            var13_7 = -1;
                            var7_8 = -1;
                            var2_2 = var6_17;
                            var6_17 = var13_7;
                            break block31;
                            break;
                        }
                    }
                    if (var4_4 == null || (var21_9 = var4_4.e) == null) ** GOTO lbl-1000
                    var2_2 = var21_9.b[var7_8];
                    if (var21_9.a.size() > var2_2) {
                        var4_4 = (i)var4_4.e.a.get(var2_2);
                        var6_17 = var4_4.a;
                        var2_2 = var4_4.b;
                        var7_8 = var4_4.c;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_17 = -1;
                        ** continue;
                    }
                }
                if (var22_5.e()) {
                    var22_5.i();
                    var22_5.i();
                }
                var22_5.l();
                var13_7 = var1_1;
                if (var22_5.e()) {
                    var13_7 = var1_1 * 2;
                }
                var1_1 = var13_7;
                break block39;
            }
            var5_23 = 1.0f;
            var6_17 = -1;
            var2_2 = -1;
            var7_8 = -1;
        }
        return new h(var3_3, var17_6, (c)var0 /* !! */ , var11_12, var8_14, var10_15, var18_11, var12_13, var1_1, var9_16, var15_21, var5_23, var14_18, var6_17, var2_2, var7_8);
    }

    private static i w(ax.T0.j j8) {
        j8.m(3);
        int n8 = j8.e() ? 1 : 2;
        int n9 = ax.P0.j.k(j8.f(8));
        int n10 = ax.P0.j.l(j8.f(8));
        j8.m(8);
        return new i(n9, n8, n10);
    }

    private static j x(ax.T0.j j8, int n8, int n9, int[] object) {
        int n10;
        boolean bl = !j8.e() ? j8.e() : true;
        if (bl) {
            j8.l();
        }
        boolean bl2 = j8.e();
        boolean bl3 = j8.e();
        int n11 = 0;
        if (bl2 || bl3) {
            for (n10 = 0; n10 < n9; ++n10) {
                for (int i8 = 0; i8 < object[n10]; ++i8) {
                    bl = bl2 ? j8.e() : false;
                    boolean bl4 = bl3 ? j8.e() : false;
                    if (bl) {
                        j8.m(32);
                    }
                    if (!bl4) continue;
                    j8.m(18);
                }
            }
        }
        n9 = (bl = j8.e()) ? j8.f(4) + 1 : n8;
        object = z.s(n9);
        int[] nArray = new int[n8];
        for (n10 = 0; n10 < n9; ++n10) {
            ((z.a)object).h(h.w(j8));
        }
        if (bl && n9 > 1) {
            for (n9 = n11; n9 < n8; ++n9) {
                nArray[n9] = j8.f(4);
            }
        }
        return new j(((z.a)object).k(), nArray);
    }

    public static k y(byte[] object, int n8, int n9) {
        object = new ax.T0.j((byte[])object, n8, n9);
        return h.z((ax.T0.j)object, h.p((ax.T0.j)object));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static k z(ax.T0.j var0, b var1_1) {
        block77: {
            block78: {
                block79: {
                    block75: {
                        var0.m(4);
                        var16_2 = var0.e();
                        var15_3 = var0.e();
                        var11_4 = var0.f(6);
                        var9_5 = var11_4 + 1;
                        var7_6 /* !! */  = var0.f(3);
                        var0.m(17);
                        var27_7 = h.q((ax.T0.j)var0, true, var7_6 /* !! */ , null);
                        for (var2_8 = var0.e() != false ? 0 : var7_6 /* !! */ ; var2_8 <= var7_6 /* !! */ ; ++var2_8) {
                            var0.i();
                            var0.i();
                            var0.i();
                        }
                        var12_9 = var0.f(6);
                        var10_10 = var0.i() + 1;
                        var25_11 = new d(z.A(var27_7), new int[1]);
                        var2_8 = var9_5 >= 2 && var10_10 >= 2 ? 1 : 0;
                        var3_12 = var16_2 != false && var15_3 != false ? 1 : 0;
                        var8_13 = var12_9 + 1;
                        var4_14 /* !! */  = var8_13 >= var9_5 ? 1 : 0;
                        if (var2_8 == 0 || var3_12 == 0 || var4_14 /* !! */  == 0) break block77;
                        var20_15 = Integer.TYPE;
                        var26_16 = (int[][])Array.newInstance(var20_15, new int[]{var10_10, var8_13});
                        var24_17 = new int[var10_10];
                        var23_18 /* !! */  = new int[var10_10];
                        var26_16[0][0] = 0;
                        var24_17[0] = 1;
                        var23_18 /* !! */ [0] = 0;
                        for (var2_8 = 1; var2_8 < var10_10; ++var2_8) {
                            var3_12 = 0;
                            for (var5_19 = 0; var5_19 <= var12_9; ++var5_19) {
                                var4_14 /* !! */  = var3_12;
                                if (var0.e()) {
                                    var26_16[var2_8][var3_12] = var5_19;
                                    var23_18 /* !! */ [var2_8] = var5_19;
                                    var4_14 /* !! */  = var3_12 + 1;
                                }
                                var24_17[var2_8] = var4_14 /* !! */ ;
                                var3_12 = var4_14 /* !! */ ;
                            }
                        }
                        if (var0.e()) {
                            var0.m(64);
                            if (var0.e()) {
                                var0.i();
                            }
                            var3_12 = var0.i();
                            var2_8 = 0;
                            while (true) {
                                var15_3 = false;
                                if (var2_8 >= var3_12) break;
                                var0.i();
                                if (var2_8 == 0 || var0.e()) {
                                    var15_3 = true;
                                }
                                h.F((ax.T0.j)var0, var15_3, var7_6 /* !! */ );
                                ++var2_8;
                            }
                        }
                        if (!var0.e()) {
                            return new k(var1_1, null, var25_11, null, null);
                        }
                        var0.b();
                        var22_20 = h.q((ax.T0.j)var0, false, var7_6 /* !! */ , (c)var27_7);
                        var6_21 = var0.e();
                        var19_22 /* !! */  = new boolean[16];
                        var2_8 = 0;
                        for (var4_14 /* !! */  = 0; var4_14 /* !! */  < 16; ++var4_14 /* !! */ ) {
                            var19_22 /* !! */ [var4_14 /* !! */ ] = var15_3 = var0.e();
                            var3_12 = var2_8;
                            if (var15_3) {
                                var3_12 = var2_8 + 1;
                            }
                            var2_8 = var3_12;
                        }
                        if (var2_8 == 0 || !var19_22 /* !! */ [1]) break block78;
                        var18_23 /* !! */  = new int[var2_8];
                        for (var3_12 = 0; var3_12 < var2_8 - var6_21; ++var3_12) {
                            var18_23 /* !! */ [var3_12] = var0.f(3);
                        }
                        var17_24 = new int[var2_8 + 1];
                        if (var6_21 != 0) {
                            for (var3_12 = 1; var3_12 < var2_8; ++var3_12) {
                                for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var3_12; ++var4_14 /* !! */ ) {
                                    var17_24[var3_12] = var17_24[var3_12] + (var18_23 /* !! */ [var4_14 /* !! */ ] + 1);
                                }
                            }
                            var17_24[var2_8] = 6;
                        }
                        var20_15 = (int[][])Array.newInstance(var20_15, new int[]{var9_5, var2_8});
                        var21_25 /* !! */  = new int[var9_5];
                        var21_25 /* !! */ [0] = 0;
                        var15_3 = var0.e();
                        for (var3_12 = 1; var3_12 < var9_5; ++var3_12) {
                            var21_25 /* !! */ [var3_12] = var15_3 != false ? var0.f(6) : var3_12;
                            if (var6_21 == 0) {
                                for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var2_8; ++var4_14 /* !! */ ) {
                                    var20_15[var3_12][var4_14 /* !! */ ] = var0.f(var18_23 /* !! */ [var4_14 /* !! */ ] + 1);
                                }
                                continue;
                            }
                            var4_14 /* !! */  = 0;
                            while (var4_14 /* !! */  < var2_8) {
                                var28_27 = var20_15[var3_12];
                                var13_26 = var21_25 /* !! */ [var3_12];
                                var5_19 = var4_14 /* !! */  + 1;
                                var28_27[var4_14 /* !! */ ] = (z.a<E>)((var13_26 & (1 << var17_24[var5_19]) - 1) >> var17_24[var4_14 /* !! */ ]);
                                var4_14 /* !! */  = var5_19;
                            }
                        }
                        var18_23 /* !! */  = new int[var8_13];
                        var2_8 = 1;
                        for (var3_12 = 0; var3_12 < var9_5; ++var3_12) {
                            block74: {
                                var18_23 /* !! */ [var21_25 /* !! */ [var3_12]] = -1;
                                var4_14 /* !! */  = 0;
                                for (var5_19 = 0; var5_19 < 16; ++var5_19) {
                                    var6_21 = var4_14 /* !! */ ;
                                    if (var19_22 /* !! */ [var5_19]) {
                                        if (var5_19 == 1) {
                                            var18_23 /* !! */ [var21_25 /* !! */ [var3_12]] = (int)var20_15[var3_12][var4_14 /* !! */ ];
                                        }
                                        var6_21 = var4_14 /* !! */  + 1;
                                    }
                                    var4_14 /* !! */  = var6_21;
                                }
                                var4_14 /* !! */  = var2_8;
                                if (var3_12 > 0) {
                                    for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var3_12; ++var4_14 /* !! */ ) {
                                        if (var18_23 /* !! */ [var21_25 /* !! */ [var3_12]] != var18_23 /* !! */ [var21_25 /* !! */ [var4_14 /* !! */ ]]) continue;
                                        var4_14 /* !! */  = var2_8;
                                        break block74;
                                    }
                                    var4_14 /* !! */  = var2_8 + 1;
                                }
                            }
                            var2_8 = var4_14 /* !! */ ;
                        }
                        var4_14 /* !! */  = var0.f(4);
                        if (var2_8 < 2 || var4_14 /* !! */  == 0) break block79;
                        var20_15 = new int[var2_8];
                        for (var3_12 = 0; var3_12 < var2_8; ++var3_12) {
                            var20_15[var3_12] = var0.f(var4_14 /* !! */ );
                        }
                        var19_22 /* !! */  = (boolean[])new int[var8_13];
                        for (var3_12 = 0; var3_12 < var9_5; ++var3_12) {
                            var19_22 /* !! */ [Math.min((int)var21_25 /* !! */ [var3_12], (int)var12_9)] = var3_12;
                        }
                        var28_27 = z.r();
                        var17_24 = var23_18 /* !! */ ;
                        for (var3_12 = 0; var3_12 <= var12_9; ++var3_12) {
                            var4_14 /* !! */  = Math.min(var18_23 /* !! */ [var3_12], var2_8 - 1);
                            var4_14 /* !! */  = var4_14 /* !! */  >= 0 ? (int)var20_15[var4_14 /* !! */ ] : -1;
                            var28_27.h(new a(var19_22 /* !! */ [var3_12], var4_14 /* !! */ ));
                        }
                        var28_27 = var28_27.k();
                        if (((a)var28_27.get((int)0)).b == -1) {
                            return new k(var1_1, null, var25_11, null, null);
                        }
                        for (var2_8 = 1; var2_8 <= var12_9; ++var2_8) {
                            if (((a)var28_27.get((int)var2_8)).b == -1) {
                                continue;
                            }
                            break block75;
                        }
                        var2_8 = -1;
                    }
                    if (var2_8 == -1) {
                        return new k(var1_1, null, var25_11, null, null);
                    }
                    var29_28 = Boolean.TYPE;
                    var20_15 = (boolean[][])Array.newInstance(var29_28, new int[]{var9_5, var9_5});
                    var18_23 /* !! */  = (int[])((boolean[][])Array.newInstance(var29_28, new int[]{var9_5, var9_5}));
                    for (var3_12 = 1; var3_12 < var9_5; ++var3_12) {
                        for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var3_12; ++var4_14 /* !! */ ) {
                            var19_22 /* !! */  = (boolean[])var20_15[var3_12];
                            var23_18 /* !! */  = (int[])var18_23 /* !! */ [var3_12];
                            var15_3 = var0.e();
                            var23_18 /* !! */ [var4_14 /* !! */ ] = (int)var15_3;
                            var19_22 /* !! */ [var4_14 /* !! */ ] = var15_3;
                        }
                    }
                    var19_22 /* !! */  = (boolean[])var21_25 /* !! */ ;
                    for (var3_12 = 1; var3_12 < var9_5; ++var3_12) {
                        block21: for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var11_4; ++var4_14 /* !! */ ) {
                            for (var5_19 = 0; var5_19 < var3_12; ++var5_19) {
                                var21_25 /* !! */  = (int[])var18_23 /* !! */ [var3_12];
                                if (var21_25 /* !! */ [var5_19] == 0 || var18_23 /* !! */ [var5_19][var4_14 /* !! */ ] == false) continue;
                                var21_25 /* !! */ [var4_14 /* !! */ ] = 1;
                                continue block21;
                            }
                        }
                    }
                    var30_29 = new int[var8_13];
                    for (var3_12 = 0; var3_12 < var9_5; ++var3_12) {
                        var5_19 = 0;
                        for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var3_12; ++var4_14 /* !! */ ) {
                            var5_19 += var20_15[var3_12][var4_14 /* !! */ ];
                        }
                        var30_29[var19_22 /* !! */ [var3_12]] = var5_19;
                    }
                    var5_19 = 0;
                    for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var9_5; ++var4_14 /* !! */ ) {
                        var3_12 = var5_19;
                        if (var30_29[var19_22 /* !! */ [var4_14 /* !! */ ]] == 0) {
                            var3_12 = var5_19 + 1;
                        }
                        var5_19 = var3_12;
                    }
                    if (var5_19 > 1) {
                        return new k(var1_1, null, var25_11, null, null);
                    }
                    var21_25 /* !! */  = new int[var9_5];
                    var31_30 = new int[var10_10];
                    if (var0.e()) {
                        for (var3_12 = 0; var3_12 < var9_5; ++var3_12) {
                            var21_25 /* !! */ [var3_12] = var0.f(3);
                        }
                    } else {
                        Arrays.fill(var21_25 /* !! */ , 0, var9_5, var7_6 /* !! */ );
                    }
                    for (var3_12 = 0; var3_12 < var10_10; ++var3_12) {
                        var4_14 /* !! */  = 0;
                        for (var5_19 = 0; var5_19 < var24_17[var3_12]; ++var5_19) {
                            var4_14 /* !! */  = Math.max(var4_14 /* !! */ , var21_25 /* !! */ [((a)var28_27.get((int)var26_16[var3_12][var5_19])).a]);
                        }
                        var31_30[var3_12] = var4_14 /* !! */  + 1;
                    }
                    if (var0.e()) {
                        var3_12 = 0;
                        while (var3_12 < var11_4) {
                            for (var5_19 = var4_14 /* !! */  = var3_12 + 1; var5_19 < var9_5; ++var5_19) {
                                if (var20_15[var5_19][var3_12] == false) continue;
                                var0.m(3);
                            }
                            var3_12 = var4_14 /* !! */ ;
                        }
                    }
                    var0.l();
                    var6_21 = var0.i() + 1;
                    var23_18 /* !! */  = (int[])z.r();
                    var23_18 /* !! */ .h(var27_7);
                    if (var6_21 > 1) {
                        var23_18 /* !! */ .h(var22_20);
                        var21_25 /* !! */  = (int[])var22_20;
                        for (var3_12 = 2; var3_12 < var6_21; ++var3_12) {
                            var21_25 /* !! */  = (int[])h.q((ax.T0.j)var0, var0.e(), var7_6 /* !! */ , (c)var21_25 /* !! */ );
                            var23_18 /* !! */ .h(var21_25 /* !! */ );
                        }
                    }
                    var21_25 /* !! */  = (int[])var23_18 /* !! */ .k();
                    var11_4 = var0.i() + var10_10;
                    if (var11_4 > var10_10) {
                        return new k(var1_1, null, var25_11, null, null);
                    }
                    var12_9 = var0.f(2);
                    var23_18 /* !! */  = (int[])((boolean[][])Array.newInstance(var29_28, new int[]{var11_4, var8_13}));
                    var22_20 = new int[var11_4];
                    var27_7 = new int[var11_4];
                    for (var3_12 = 0; var3_12 < var10_10; ++var3_12) {
                        var22_20[var3_12] = false;
                        var27_7[var3_12] = var17_24[var3_12];
                        if (var12_9 == 0) {
                            Arrays.fill((boolean[])var23_18 /* !! */ [var3_12], 0, var24_17[var3_12], true);
                            var22_20[var3_12] = var24_17[var3_12];
                            continue;
                        }
                        if (var12_9 == 1) {
                            var5_19 = var17_24[var3_12];
                            for (var4_14 /* !! */  = 0; var4_14 /* !! */  < var24_17[var3_12]; ++var4_14 /* !! */ ) {
                                var32_31 = var23_18 /* !! */ [var3_12];
                                var15_3 = var26_16[var3_12][var4_14 /* !! */ ] == var5_19;
                                var32_31[var4_14 /* !! */ ] = var15_3;
                            }
                            var22_20[var3_12] = true;
                            continue;
                        }
                        var23_18 /* !! */ [0][0] = true;
                        var22_20[0] = true;
                    }
                    var17_24 = new int[var8_13];
                    var29_28 = (boolean[][])Array.newInstance(var29_28, new int[]{var11_4, var8_13});
                    var5_19 = 0;
                    var4_14 /* !! */  = var2_8;
                    var2_8 = var6_21;
                    for (var3_12 = 1; var3_12 < var11_4; ++var3_12) {
                        block76: {
                            block80: {
                                if (var12_9 == 2) {
                                    for (var6_21 = 0; var6_21 < var24_17[var3_12]; ++var6_21) {
                                        var23_18 /* !! */ [var3_12][var6_21] = var0.e();
                                        var7_6 /* !! */  = (int)var22_20[var3_12];
                                        var8_13 = var23_18 /* !! */ [var3_12][var6_21];
                                        var22_20[var3_12] = var7_6 /* !! */  + var8_13;
                                        if (var8_13 == 0) continue;
                                        var27_7[var3_12] = var26_16[var3_12][var6_21];
                                    }
                                }
                                if (var5_19 != 0) break block80;
                                var6_21 = var5_19;
                                if (var26_16[var3_12][0] != 0) break block76;
                                var6_21 = var5_19;
                                if (var23_18 /* !! */ [var3_12][0] != false) {
                                    var7_6 /* !! */  = 1;
                                    while (true) {
                                        var6_21 = var5_19;
                                        if (var7_6 /* !! */  < var24_17[var3_12]) {
                                            var6_21 = var5_19;
                                            if (var26_16[var3_12][var7_6 /* !! */ ] == var4_14 /* !! */ ) {
                                                var6_21 = var5_19;
                                                if (var23_18 /* !! */ [var3_12][var4_14 /* !! */ ] != false) {
                                                    var6_21 = var3_12;
                                                }
                                            }
                                            ++var7_6 /* !! */ ;
                                            var5_19 = var6_21;
                                            continue;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                        break;
                                    }
                                }
                                break block76;
lbl-1000:
                                // 2 sources

                                {
                                    break block76;
                                }
                            }
                            var6_21 = var5_19;
                        }
                        for (var5_19 = 0; var5_19 < var24_17[var3_12]; ++var5_19) {
                            if (var2_8 <= 1) continue;
                            var29_28[var3_12][var5_19] = var23_18 /* !! */ [var3_12][var5_19];
                            var13_26 = ax.t7.a.d(var2_8, RoundingMode.CEILING);
                            if (var29_28[var3_12][var5_19] == false) {
                                var7_6 /* !! */  = ((a)var28_27.get((int)var26_16[var3_12][var5_19])).a;
                                for (var8_13 = 0; var8_13 < var5_19; ++var8_13) {
                                    var14_32 = ((a)var28_27.get((int)var26_16[var3_12][var8_13])).a;
                                    if (var18_23 /* !! */ [var7_6 /* !! */ ][var14_32] == false) continue;
                                    var29_28[var3_12][var5_19] = true;
                                    break;
                                }
                            }
                            if (var29_28[var3_12][var5_19] == false) continue;
                            if (var6_21 > 0 && var3_12 == var6_21) {
                                var17_24[var5_19] = var0.f(var13_26);
                                continue;
                            }
                            var0.m(var13_26);
                        }
                        if (var22_20[var3_12] == true && var30_29[var27_7[var3_12]] > 0) {
                            var0.l();
                        }
                        var5_19 = var6_21;
                    }
                    if (var5_19 == 0) {
                        return new k(var1_1, null, var25_11, null, null);
                    }
                    var18_23 /* !! */  = (int[])h.s((ax.T0.j)var0, var9_5);
                    var0.m(2);
                    for (var2_8 = 1; var2_8 < var9_5; ++var2_8) {
                        if (var30_29[var19_22 /* !! */ [var2_8]] != 0) continue;
                        var0.l();
                    }
                    h.E((ax.T0.j)var0, var11_4, var31_30, var24_17, (boolean[][])var29_28);
                    h.K((ax.T0.j)var0, var9_5, (boolean[][])var20_15);
                    if (var0.e()) {
                        var0.b();
                        var0 = h.x((ax.T0.j)var0, var9_5, var10_10, var31_30);
                    } else {
                        var0 = null;
                    }
                    return new k(var1_1, (List<a>)var28_27, new d((List<c>)var21_25 /* !! */ , var17_24), (f)var18_23 /* !! */ , (j)var0);
                }
                return new k(var1_1, null, var25_11, null, null);
            }
            return new k(var1_1, null, var25_11, null, null);
        }
        return new k(var1_1, null, var25_11, null, null);
    }

    public static final class a {
        public final int a;
        public final int b;

        public a(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int n8, boolean bl, int n9, int n10, int[] nArray, int n11) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
            this.d = n10;
            this.e = nArray;
            this.f = n11;
        }
    }

    public static final class d {
        public final z<c> a;
        public final int[] b;

        public d(List<c> list, int[] nArray) {
            this.a = z.u(list);
            this.b = nArray;
        }
    }

    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int n8, int n9, int n10, int n11, int n12) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
        }
    }

    public static final class f {
        public final z<e> a;
        public final int[] b;

        public f(List<e> list, int[] nArray) {
            this.a = z.u(list);
            this.b = nArray;
        }
    }

    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        public g(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = n15;
            this.i = n16;
        }
    }

    public static final class h {
        public final b a;
        public final int b;
        public final c c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final float l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;

        public h(b b8, int n8, c c8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, float f8, int n17, int n18, int n19, int n20) {
            this.a = b8;
            this.b = n8;
            this.c = c8;
            this.d = n9;
            this.e = n10;
            this.f = n11;
            this.g = n12;
            this.h = n13;
            this.i = n14;
            this.l = f8;
            this.m = n17;
            this.n = n18;
            this.o = n19;
            this.p = n20;
            this.j = n15;
            this.k = n16;
        }
    }

    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }
    }

    public static final class j {
        public final z<i> a;
        public final int[] b;

        public j(List<i> list, int[] nArray) {
            this.a = z.u(list);
            this.b = nArray;
        }
    }

    public static final class k {
        public final b a;
        public final z<a> b;
        public final d c;
        public final f d;
        public final j e;

        public k(b z8, List<a> list, d d8, f f8, j j8) {
            this.a = z8;
            z8 = list != null ? z.u(list) : z.z();
            this.b = z8;
            this.c = d8;
            this.d = f8;
            this.e = j8;
        }
    }

    public static final class l {
        public final int a;
        public final int b;
        public final boolean c;

        public l(int n8, int n9, boolean bl) {
            this.a = n8;
            this.b = n9;
            this.c = bl;
        }
    }

    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;

        public m(int n8, int n9, int n10, int n11, int n12, int n13, int n14, float f8, int n15, int n16, boolean bl, boolean bl2, int n17, int n18, int n19, boolean bl3, int n20, int n21, int n22, int n23) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = f8;
            this.i = n15;
            this.j = n16;
            this.k = bl;
            this.l = bl2;
            this.m = n17;
            this.n = n18;
            this.o = n19;
            this.p = bl3;
            this.q = n20;
            this.r = n21;
            this.s = n22;
            this.t = n23;
        }
    }
}

