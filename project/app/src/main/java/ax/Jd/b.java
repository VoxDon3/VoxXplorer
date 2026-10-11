/*
 * Decompiled with CFR 0.152.
 */
package ax.Jd;

import ax.Id.c;
import ax.Id.d;
import ax.Kd.e;
import ax.Nd.a;
import ax.vd.u;
import ax.wd.i;

public abstract class b {
    private static final byte[] a = new byte[]{83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] b = new int[]{-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] c = new int[]{-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 0x3FFFFFFF};
    private static final int[] d = new int[]{118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] e = new int[]{36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object f = new Object();
    private static b[] g = null;
    private static int[] h = null;

    private static b A(b b8) {
        b b9 = new b();
        ax.Jd.b.B(b8, b9);
        return b9;
    }

    private static void B(b b8, b b9) {
        ax.Id.d.f(b8.a, 0, b9.a, 0);
        ax.Id.d.f(b8.b, 0, b9.b, 0);
        ax.Id.d.f(b8.c, 0, b9.c, 0);
    }

    private static void C(b b8) {
        int[] nArray = ax.Id.d.g();
        int[] nArray2 = ax.Id.d.g();
        int[] nArray3 = ax.Id.d.g();
        int[] nArray4 = ax.Id.d.g();
        int[] nArray5 = ax.Id.d.g();
        int[] nArray6 = ax.Id.d.g();
        ax.Id.d.a(b8.a, b8.b, nArray);
        ax.Id.d.H(nArray, nArray);
        ax.Id.d.H(b8.a, nArray2);
        ax.Id.d.H(b8.b, nArray3);
        ax.Id.d.a(nArray2, nArray3, nArray4);
        ax.Id.d.c(nArray4);
        ax.Id.d.H(b8.c, nArray5);
        ax.Id.d.a(nArray5, nArray5, nArray5);
        ax.Id.d.c(nArray5);
        ax.Id.d.J(nArray4, nArray5, nArray6);
        ax.Id.d.J(nArray, nArray4, nArray);
        ax.Id.d.J(nArray2, nArray3, nArray2);
        ax.Id.d.A(nArray, nArray6, b8.a);
        ax.Id.d.A(nArray4, nArray2, b8.b);
        ax.Id.d.A(nArray4, nArray6, b8.c);
    }

    private static void D(b b8) {
        ax.Id.d.D(b8.c);
    }

    private static void E(int n8, int n9, c c8) {
        n8 *= 512;
        for (int i8 = 0; i8 < 16; ++i8) {
            int n10 = (i8 ^ n9) - 1 >> 31;
            ax.Id.d.d(n10, h, n8, c8.a, 0);
            ax.Id.d.d(n10, h, n8 + 16, c8.b, 0);
            n8 += 32;
        }
    }

    private static b[] F(b b8, int n8) {
        b b9 = ax.Jd.b.A(b8);
        ax.Jd.b.C(b9);
        b[] bArray = new b[n8];
        bArray[0] = ax.Jd.b.A(b8);
        for (int i8 = 1; i8 < n8; ++i8) {
            bArray[i8] = b8 = ax.Jd.b.A(bArray[i8 - 1]);
            ax.Jd.b.z(false, b9, b8);
        }
        return bArray;
    }

    private static void G(b b8) {
        ax.Id.d.L(b8.a);
        ax.Id.d.D(b8.b);
        ax.Id.d.D(b8.c);
    }

    /*
     * Exception decompiling
     */
    public static void H() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 23->84)] java.lang.Throwable
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

    private static void I(byte[] byArray, int n8, byte[] byArray2) {
        System.arraycopy(byArray, n8, byArray2, 0, 56);
        byArray2[0] = (byte)(byArray2[0] & 0xFC);
        byArray2[55] = (byte)(byArray2[55] | 0x80);
        byArray2[56] = 0;
    }

    private static byte[] J(byte[] byArray) {
        long l8 = ax.Jd.b.k(byArray, 0);
        long l9 = ax.Jd.b.j(byArray, 4) << 4;
        long l10 = ax.Jd.b.k(byArray, 7);
        long l11 = ax.Jd.b.j(byArray, 11) << 4;
        long l12 = ax.Jd.b.k(byArray, 14);
        long l13 = ax.Jd.b.j(byArray, 18) << 4;
        long l14 = ax.Jd.b.k(byArray, 21);
        long l15 = ax.Jd.b.j(byArray, 25) << 4;
        long l16 = ax.Jd.b.k(byArray, 28);
        long l17 = ax.Jd.b.j(byArray, 32) << 4;
        long l18 = ax.Jd.b.k(byArray, 35);
        long l19 = ax.Jd.b.j(byArray, 39) << 4;
        long l20 = ax.Jd.b.k(byArray, 42);
        long l21 = ax.Jd.b.j(byArray, 46) << 4;
        long l22 = ax.Jd.b.k(byArray, 49);
        long l23 = ax.Jd.b.j(byArray, 53) << 4;
        long l24 = ax.Jd.b.k(byArray, 56);
        long l25 = ax.Jd.b.j(byArray, 60) << 4;
        long l26 = ax.Jd.b.k(byArray, 63);
        long l27 = ax.Jd.b.j(byArray, 67) << 4;
        long l28 = ax.Jd.b.k(byArray, 70);
        long l29 = ax.Jd.b.j(byArray, 74) << 4;
        long l30 = ax.Jd.b.k(byArray, 77);
        long l31 = ax.Jd.b.j(byArray, 81) << 4;
        long l32 = ax.Jd.b.k(byArray, 84);
        long l33 = ax.Jd.b.j(byArray, 88) << 4;
        long l34 = ax.Jd.b.k(byArray, 91);
        long l35 = ax.Jd.b.j(byArray, 95) << 4;
        long l36 = ax.Jd.b.k(byArray, 98);
        long l37 = ax.Jd.b.j(byArray, 102) << 4;
        long l38 = ax.Jd.b.k(byArray, 105);
        long l39 = ax.Jd.b.j(byArray, 109) << 4;
        long l40 = (long)ax.Jd.b.i(byArray, 112) & 0xFFFFFFFFL;
        l39 = (l39 & 0xFFFFFFFFL) + ((l38 & 0xFFFFFFFFL) >>> 28);
        l37 = (l37 & 0xFFFFFFFFL) + ((l36 & 0xFFFFFFFFL) >>> 28);
        l28 = (l28 & 0xFFFFFFFFL) + l40 * 96434764L + l39 * 227822194L + (l38 &= 0xFFFFFFFL) * 149865618L + l37 * 550336261L;
        l35 = (l35 & 0xFFFFFFFFL) + ((l34 & 0xFFFFFFFFL) >>> 28);
        l25 = (l25 & 0xFFFFFFFFL) + l40 * 30366549L + l39 * 163752818L + l38 * 258169998L + l37 * 96434764L + (l36 &= 0xFFFFFFFL) * 227822194L + l35 * 149865618L + (l34 &= 0xFFFFFFFL) * 550336261L;
        l33 = (l33 & 0xFFFFFFFFL) + ((l32 & 0xFFFFFFFFL) >>> 28);
        l29 = (l29 & 0xFFFFFFFFL) + l40 * 227822194L + l39 * 149865618L + l38 * 550336261L + (l28 >>> 28);
        long l41 = (l30 & 0xFFFFFFFFL) + l40 * 149865618L + l39 * 550336261L + (l29 >>> 28);
        l30 = (l31 & 0xFFFFFFFFL) + l40 * 550336261L + (l41 >>> 28);
        l31 = l41 & 0xFFFFFFFL;
        l32 = (l32 & 0xFFFFFFFL) + (l30 >>> 28);
        l22 = (l22 & 0xFFFFFFFFL) + l38 * 43969588L + l37 * 30366549L + l36 * 163752818L + l35 * 258169998L + l34 * 96434764L + l33 * 227822194L + l32 * 149865618L + (l30 &= 0xFFFFFFFL) * 550336261L;
        l41 = (l26 & 0xFFFFFFFFL) + l40 * 163752818L + l39 * 258169998L + l38 * 96434764L + l37 * 227822194L + l36 * 149865618L + l35 * 550336261L + (l25 >>> 28);
        l27 = (l27 & 0xFFFFFFFFL) + l40 * 258169998L + l39 * 96434764L + l38 * 227822194L + l37 * 149865618L + l36 * 550336261L + (l41 >>> 28);
        l28 = (l28 & 0xFFFFFFFL) + (l27 >>> 28);
        l26 = l27 & 0xFFFFFFFL;
        l27 = (l29 & 0xFFFFFFFL) + (l28 >>> 28);
        l28 &= 0xFFFFFFFL;
        l23 = (l23 & 0xFFFFFFFFL) + l39 * 43969588L + l38 * 30366549L + l37 * 163752818L + l36 * 258169998L + l35 * 96434764L + l34 * 227822194L + l33 * 149865618L + l32 * 550336261L + (l22 >>> 28);
        l39 = (l24 & 0xFFFFFFFFL) + l40 * 43969588L + l39 * 30366549L + l38 * 163752818L + l37 * 258169998L + l36 * 96434764L + l35 * 227822194L + l34 * 149865618L + l33 * 550336261L + (l23 >>> 28);
        l40 = (l25 & 0xFFFFFFFL) + (l39 >>> 28);
        l24 = (l41 & 0xFFFFFFFL) + (l40 >>> 28);
        l39 = (l39 & 0xFFFFFFFL) * 4L + ((l23 & 0xFFFFFFFL) >>> 26) + 1L;
        l8 = (l8 & 0xFFFFFFFFL) + 78101261L * l39;
        l9 = (l9 & 0xFFFFFFFFL) + 43969588L * (l40 &= 0xFFFFFFFL) + 141809365L * l39 + (l8 >>> 28);
        l10 = (l10 & 0xFFFFFFFFL) + l24 * 43969588L + 30366549L * l40 + 175155932L * l39 + (l9 >>> 28);
        l11 = (l11 & 0xFFFFFFFFL) + l26 * 43969588L + l24 * 30366549L + 163752818L * l40 + 64542499L * l39 + (l10 >>> 28);
        l12 = (l12 & 0xFFFFFFFFL) + l28 * 43969588L + l26 * 30366549L + l24 * 163752818L + 258169998L * l40 + 158326419L * l39 + (l11 >>> 28);
        l13 = (l13 & 0xFFFFFFFFL) + l27 * 43969588L + l28 * 30366549L + l26 * 163752818L + l24 * 258169998L + 96434764L * l40 + 191173276L * l39 + (l12 >>> 28);
        l14 = (l14 & 0xFFFFFFFFL) + l31 * 43969588L + l27 * 30366549L + l28 * 163752818L + l26 * 258169998L + l24 * 96434764L + 227822194L * l40 + 104575268L * l39 + (l13 >>> 28);
        l15 = (l15 & 0xFFFFFFFFL) + l30 * 43969588L + l31 * 30366549L + l27 * 163752818L + l28 * 258169998L + l26 * 96434764L + l24 * 227822194L + 149865618L * l40 + l39 * 137584065L + (l14 >>> 28);
        l16 = (l16 & 0xFFFFFFFFL) + l32 * 43969588L + l30 * 30366549L + l31 * 163752818L + l27 * 258169998L + l28 * 96434764L + l26 * 227822194L + l24 * 149865618L + l40 * 550336261L + (l15 >>> 28);
        l17 = (l17 & 0xFFFFFFFFL) + l33 * 43969588L + l32 * 30366549L + l30 * 163752818L + l31 * 258169998L + l27 * 96434764L + l28 * 227822194L + l26 * 149865618L + l24 * 550336261L + (l16 >>> 28);
        l18 = (l18 & 0xFFFFFFFFL) + l34 * 43969588L + l33 * 30366549L + l32 * 163752818L + l30 * 258169998L + l31 * 96434764L + l27 * 227822194L + l28 * 149865618L + l26 * 550336261L + (l17 >>> 28);
        l19 = (l19 & 0xFFFFFFFFL) + l35 * 43969588L + l34 * 30366549L + l33 * 163752818L + l32 * 258169998L + l30 * 96434764L + l31 * 227822194L + l27 * 149865618L + l28 * 550336261L + (l18 >>> 28);
        l20 = (l20 & 0xFFFFFFFFL) + l36 * 43969588L + l35 * 30366549L + l34 * 163752818L + l33 * 258169998L + l32 * 96434764L + l30 * 227822194L + l31 * 149865618L + l27 * 550336261L + (l19 >>> 28);
        l36 = (l21 & 0xFFFFFFFFL) + l37 * 43969588L + l36 * 30366549L + l35 * 163752818L + l34 * 258169998L + l33 * 96434764L + l32 * 227822194L + l30 * 149865618L + l31 * 550336261L + (l20 >>> 28);
        l37 = (l22 & 0xFFFFFFFL) + (l36 >>> 28);
        l21 = (l23 & 0x3FFFFFFL) + (l37 >>> 28);
        l31 = (l21 >>> 26) - 1L;
        l35 = (l8 & 0xFFFFFFFL) - (l31 & 0x4A7BB0DL);
        l34 = (l9 & 0xFFFFFFFL) - (l31 & 0x873D6D5L) + (l35 >> 28);
        l33 = (l10 & 0xFFFFFFFL) - (l31 & 0xA70AADCL) + (l34 >> 28);
        l11 = (l11 & 0xFFFFFFFL) - (l31 & 0x3D8D723L) + (l33 >> 28);
        l12 = (l12 & 0xFFFFFFFL) - (l31 & 0x96FDE93L) + (l11 >> 28);
        l13 = (l13 & 0xFFFFFFFL) - (l31 & 0xB65129CL) + (l12 >> 28);
        l14 = (l14 & 0xFFFFFFFL) - (l31 & 0x63BB124L) + (l13 >> 28);
        l15 = (l15 & 0xFFFFFFFL) - (l31 & 0x8335DC1L) + (l14 >> 28);
        l16 = (l16 & 0xFFFFFFFL) + (l15 >> 28);
        l17 = (l17 & 0xFFFFFFFL) + (l16 >> 28);
        l18 = (l18 & 0xFFFFFFFL) + (l17 >> 28);
        l19 = (l19 & 0xFFFFFFFL) + (l18 >> 28);
        l20 = (l20 & 0xFFFFFFFL) + (l19 >> 28);
        l36 = (l36 & 0xFFFFFFFL) + (l20 >> 28);
        l37 = (l37 & 0xFFFFFFFL) + (l36 >> 28);
        byArray = new byte[57];
        ax.Jd.b.r(l35 & 0xFFFFFFFL | (l34 & 0xFFFFFFFL) << 28, byArray, 0);
        ax.Jd.b.r(l33 & 0xFFFFFFFL | (l11 & 0xFFFFFFFL) << 28, byArray, 7);
        ax.Jd.b.r((l13 & 0xFFFFFFFL) << 28 | l12 & 0xFFFFFFFL, byArray, 14);
        ax.Jd.b.r((l15 & 0xFFFFFFFL) << 28 | l14 & 0xFFFFFFFL, byArray, 21);
        ax.Jd.b.r((l17 & 0xFFFFFFFL) << 28 | l16 & 0xFFFFFFFL, byArray, 28);
        ax.Jd.b.r(l18 & 0xFFFFFFFL | (l19 & 0xFFFFFFFL) << 28, byArray, 35);
        ax.Jd.b.r(l20 & 0xFFFFFFFL | (l36 & 0xFFFFFFFL) << 28, byArray, 42);
        ax.Jd.b.r(l37 & 0xFFFFFFFL | (l21 & 0x3FFFFFFL) + (l37 >> 28) << 28, byArray, 49);
        return byArray;
    }

    private static void K(byte[] object, b b8) {
        ax.Jd.b.H();
        int[] nArray = new int[15];
        ax.Jd.b.n(object, 0, nArray);
        nArray[14] = ax.Kd.e.a(14, ~nArray[0] & 1, nArray, c, nArray) + 4;
        ax.Kd.e.i(15, nArray, 0);
        object = new c();
        ax.Jd.b.G(b8);
        int n8 = 17;
        while (true) {
            int n9 = n8;
            for (int i8 = 0; i8 < 5; ++i8) {
                int n10;
                int n11 = 0;
                for (n10 = 0; n10 < 5; ++n10) {
                    n11 = n11 & ~(1 << n10) ^ nArray[n9 >>> 5] >>> (n9 & 0x1F) << n10;
                    n9 += 18;
                }
                n10 = n11 >>> 4 & 1;
                ax.Jd.b.E(i8, (-n10 ^ n11) & 0xF, (c)object);
                ax.Id.d.e(n10, object.a);
                ax.Jd.b.y((c)object, b8);
            }
            if (--n8 < 0) {
                return;
            }
            ax.Jd.b.C(b8);
        }
    }

    private static void L(byte[] byArray, byte[] byArray2, int n8) {
        b b8 = new b();
        ax.Jd.b.K(byArray, b8);
        if (ax.Jd.b.s(b8, byArray2, n8) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void M(c.a object, byte[] object2, int n8, int[] nArray, int[] nArray2) {
        if (object != null) {
            object = new byte[57];
            ax.Jd.b.I(object2, n8, (byte[])object);
            object2 = new b();
            ax.Jd.b.K((byte[])object, (b)object2);
            if (ax.Jd.b.d(object2.a, object2.b, object2.c) != 0) {
                ax.Id.d.f(object2.a, 0, nArray, 0);
                ax.Id.d.f(object2.b, 0, nArray2, 0);
                return;
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("This method is only for use by X448");
    }

    private static void N(int[] objectArray, int[] objectArray2, b bArray, b b8) {
        ax.Jd.b.H();
        objectArray = ax.Jd.b.u(objectArray, 7);
        objectArray2 = ax.Jd.b.u(objectArray2, 5);
        bArray = ax.Jd.b.F((b)bArray, 8);
        ax.Jd.b.G(b8);
        int n8 = 446;
        while (true) {
            boolean bl;
            int n9;
            int n10 = objectArray[n8];
            boolean bl2 = false;
            if (n10 != 0) {
                n9 = n10 >> 31;
                bl = n9 != 0;
                ax.Jd.b.z(bl, g[(n10 ^ n9) >>> 1], b8);
            }
            if ((n10 = objectArray2[n8]) != 0) {
                n9 = n10 >> 31;
                bl = bl2;
                if (n9 != 0) {
                    bl = true;
                }
                ax.Jd.b.z(bl, bArray[(n10 ^ n9) >>> 1], b8);
            }
            if (--n8 < 0) {
                return;
            }
            ax.Jd.b.C(b8);
        }
    }

    public static void O(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte[] byArray4, int n10, int n11, byte[] byArray5, int n12) {
        ax.Jd.b.w(byArray, n8, byArray2, n9, byArray3, (byte)0, byArray4, n10, n11, byArray5, n12);
    }

    public static void P(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte[] byArray4, int n10, byte[] byArray5, int n11) {
        ax.Jd.b.w(byArray, n8, byArray2, n9, byArray3, (byte)1, byArray4, n10, 64, byArray5, n11);
    }

    public static boolean Q(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte[] byArray4, int n10, int n11) {
        return ax.Jd.b.x(byArray, n8, byArray2, n9, byArray3, (byte)0, byArray4, n10, n11);
    }

    private static byte[] a(byte[] objectArray, byte[] objectArray2, byte[] byArray) {
        int[] nArray = new int[28];
        ax.Jd.b.n(objectArray, 0, nArray);
        objectArray = new int[14];
        ax.Jd.b.n(objectArray2, 0, objectArray);
        objectArray2 = new int[14];
        ax.Jd.b.n(byArray, 0, objectArray2);
        ax.Kd.e.g(14, objectArray, objectArray2, nArray);
        objectArray = new byte[114];
        for (int i8 = 0; i8 < 28; ++i8) {
            ax.Jd.b.q(nArray[i8], objectArray, i8 * 4);
        }
        return ax.Jd.b.J(objectArray);
    }

    private static boolean b(byte[] byArray) {
        return byArray != null && byArray.length < 256;
    }

    private static int c(int[] nArray, int[] nArray2) {
        int[] nArray3 = ax.Id.d.g();
        int[] nArray4 = ax.Id.d.g();
        int[] nArray5 = ax.Id.d.g();
        ax.Id.d.H(nArray, nArray4);
        ax.Id.d.H(nArray2, nArray5);
        ax.Id.d.A(nArray4, nArray5, nArray3);
        ax.Id.d.a(nArray4, nArray5, nArray4);
        ax.Id.d.z(nArray3, 39081, nArray3);
        ax.Id.d.K(nArray3);
        ax.Id.d.a(nArray3, nArray4, nArray3);
        ax.Id.d.C(nArray3);
        return ax.Id.d.x(nArray3);
    }

    private static int d(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = ax.Id.d.g();
        int[] nArray5 = ax.Id.d.g();
        int[] nArray6 = ax.Id.d.g();
        int[] nArray7 = ax.Id.d.g();
        ax.Id.d.H(nArray, nArray5);
        ax.Id.d.H(nArray2, nArray6);
        ax.Id.d.H(nArray3, nArray7);
        ax.Id.d.A(nArray5, nArray6, nArray4);
        ax.Id.d.a(nArray5, nArray6, nArray5);
        ax.Id.d.A(nArray5, nArray7, nArray5);
        ax.Id.d.H(nArray7, nArray7);
        ax.Id.d.z(nArray4, 39081, nArray4);
        ax.Id.d.J(nArray4, nArray7, nArray4);
        ax.Id.d.a(nArray4, nArray5, nArray4);
        ax.Id.d.C(nArray4);
        return ax.Id.d.x(nArray4);
    }

    private static boolean e(byte[] byArray) {
        if ((byArray[56] & 0x7F) != 0) {
            return false;
        }
        int[] nArray = new int[14];
        ax.Jd.b.l(byArray, 0, nArray, 0, 14);
        return ax.Kd.e.d(14, nArray, b) ^ true;
    }

    private static boolean f(byte[] byArray, int[] nArray) {
        if (byArray[56] != 0) {
            return false;
        }
        ax.Jd.b.n(byArray, 0, nArray);
        return ax.Kd.e.d(14, nArray, c) ^ true;
    }

    private static byte[] g(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        return byArray2;
    }

    private static u h() {
        return new i(256);
    }

    private static int i(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF;
    }

    private static int j(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        return (byArray[n8 + 2] & 0xFF) << 16 | (by & 0xFF | (by2 & 0xFF) << 8);
    }

    private static int k(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private static void l(byte[] byArray, int n8, int[] nArray, int n9, int n10) {
        for (int i8 = 0; i8 < n10; ++i8) {
            nArray[n9 + i8] = ax.Jd.b.k(byArray, i8 * 4 + n8);
        }
    }

    private static boolean m(byte[] objectArray, int n8, boolean bl, b b8) {
        objectArray = ax.Jd.b.g(objectArray, n8, 57);
        boolean bl2 = ax.Jd.b.e(objectArray);
        n8 = 0;
        if (!bl2) {
            return false;
        }
        byte by = objectArray[56];
        int n9 = (by & 0x80) >>> 7;
        objectArray[56] = (byte)(by & 0x7F);
        ax.Id.d.j(objectArray, 0, b8.b);
        objectArray = ax.Id.d.g();
        int[] nArray = ax.Id.d.g();
        ax.Id.d.H(b8.b, objectArray);
        ax.Id.d.z(objectArray, 39081, nArray);
        ax.Id.d.B(objectArray, objectArray);
        ax.Id.d.b(objectArray);
        ax.Id.d.b(nArray);
        if (!ax.Id.d.I(objectArray, nArray, b8.a)) {
            return false;
        }
        ax.Id.d.C(b8.a);
        if (n9 == 1 && ax.Id.d.y(b8.a)) {
            return false;
        }
        objectArray = b8.a;
        if (n9 != (objectArray[0] & 1)) {
            n8 = 1;
        }
        if ((bl ^ n8) != 0) {
            ax.Id.d.B(objectArray, objectArray);
        }
        ax.Jd.b.D(b8);
        return true;
    }

    private static void n(byte[] byArray, int n8, int[] nArray) {
        ax.Jd.b.l(byArray, n8, nArray, 0, 14);
    }

    private static void o(u u8, byte by, byte[] byArray) {
        byte[] byArray2 = a;
        int n8 = byArray2.length;
        int n9 = n8 + 2;
        int n10 = byArray.length + n9;
        byte[] byArray3 = new byte[n10];
        System.arraycopy(byArray2, 0, byArray3, 0, n8);
        byArray3[n8] = by;
        byArray3[n8 + 1] = (byte)byArray.length;
        System.arraycopy(byArray, 0, byArray3, n9, byArray.length);
        u8.b(byArray3, 0, n10);
    }

    private static void p(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
    }

    private static void q(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    private static void r(long l8, byte[] byArray, int n8) {
        ax.Jd.b.q((int)l8, byArray, n8);
        ax.Jd.b.p((int)(l8 >>> 32), byArray, n8 + 4);
    }

    private static int s(b b8, byte[] byArray, int n8) {
        int[] nArray = ax.Id.d.g();
        int[] nArray2 = ax.Id.d.g();
        ax.Id.d.v(b8.c, nArray2);
        ax.Id.d.A(b8.a, nArray2, nArray);
        ax.Id.d.A(b8.b, nArray2, nArray2);
        ax.Id.d.C(nArray);
        ax.Id.d.C(nArray2);
        int n9 = ax.Jd.b.c(nArray, nArray2);
        ax.Id.d.p(nArray2, byArray, n8);
        byArray[n8 + 56] = (byte)((nArray[0] & 1) << 7);
        return n9;
    }

    public static void t(byte[] byArray, int n8, byte[] byArray2, int n9) {
        u u8 = ax.Jd.b.h();
        byte[] byArray3 = new byte[114];
        u8.b(byArray, n8, 57);
        u8.e(byArray3, 0, 114);
        byArray = new byte[57];
        ax.Jd.b.I(byArray3, 0, byArray);
        ax.Jd.b.L(byArray, byArray2, n9);
    }

    private static byte[] u(int[] objectArray, int n8) {
        int n9;
        int[] nArray = new int[28];
        int n10 = 0;
        int n11 = 14;
        int n12 = 28;
        int n13 = 0;
        while (--n11 >= 0) {
            n9 = objectArray[n11];
            nArray[n12 - 1] = n13 << 16 | n9 >>> 16;
            nArray[n12 -= 2] = n9;
            n13 = n9;
        }
        objectArray = new byte[447];
        n9 = 32 - n8;
        n12 = 0;
        n11 = 0;
        n13 = n10;
        while (n13 < 28) {
            n10 = nArray[n13];
            while (n12 < 16) {
                int n14 = n10 >>> n12;
                if ((n14 & 1) == n11) {
                    ++n12;
                    continue;
                }
                n11 = (n14 | 1) << n9;
                objectArray[(n13 << 4) + n12] = (byte)(n11 >> n9);
                n12 += n8;
                n11 >>>= 31;
            }
            ++n13;
            n12 -= 16;
        }
        return objectArray;
    }

    private static void v(u object, byte[] byArray, byte[] byArray2, byte[] byArray3, int n8, byte[] byArray4, byte by, byte[] byArray5, int n9, int n10, byte[] byArray6, int n11) {
        ax.Jd.b.o((u)object, by, byArray4);
        object.b(byArray, 57, 57);
        object.b(byArray5, n9, n10);
        object.e(byArray, 0, byArray.length);
        byte[] byArray7 = ax.Jd.b.J(byArray);
        byte[] byArray8 = new byte[57];
        ax.Jd.b.L(byArray7, byArray8, 0);
        ax.Jd.b.o((u)object, by, byArray4);
        object.b(byArray8, 0, 57);
        object.b(byArray3, n8, 57);
        object.b(byArray5, n9, n10);
        object.e(byArray, 0, byArray.length);
        object = ax.Jd.b.a(byArray7, ax.Jd.b.J(byArray), byArray2);
        System.arraycopy(byArray8, 0, byArray6, n11, 57);
        System.arraycopy(object, 0, byArray6, n11 + 57, 57);
    }

    private static void w(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte by, byte[] byArray4, int n10, int n11, byte[] byArray5, int n12) {
        if (ax.Jd.b.b(byArray3)) {
            u u8 = ax.Jd.b.h();
            byte[] byArray6 = new byte[114];
            u8.b(byArray, n8, 57);
            u8.e(byArray6, 0, 114);
            byArray = new byte[57];
            ax.Jd.b.I(byArray6, 0, byArray);
            ax.Jd.b.v(u8, byArray6, byArray, byArray2, n9, byArray3, by, byArray4, n10, n11, byArray5, n12);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean x(byte[] objectArray, int n8, byte[] objectArray2, int n9, byte[] object, byte by, byte[] byArray, int n10, int n11) {
        if (ax.Jd.b.b(object)) {
            byte[] byArray2 = ax.Jd.b.g(objectArray, n8, 57);
            Object object2 = ax.Jd.b.g(objectArray, n8 + 57, 57);
            if (!ax.Jd.b.e(byArray2)) {
                return false;
            }
            objectArray = new int[14];
            if (!ax.Jd.b.f(object2, objectArray)) {
                return false;
            }
            object2 = new b();
            if (!ax.Jd.b.m(objectArray2, n9, true, (b)object2)) {
                return false;
            }
            u u8 = ax.Jd.b.h();
            byte[] byArray3 = new byte[114];
            ax.Jd.b.o(u8, by, object);
            u8.b(byArray2, 0, 57);
            u8.b((byte[])objectArray2, n9, 57);
            u8.b(byArray, n10, n11);
            u8.e(byArray3, 0, 114);
            object = ax.Jd.b.J(byArray3);
            objectArray2 = new int[14];
            ax.Jd.b.n(object, 0, objectArray2);
            object = new b();
            ax.Jd.b.N(objectArray, objectArray2, (b)object2, (b)object);
            objectArray = new byte[57];
            return ax.Jd.b.s((b)object, objectArray, 0) != 0 && ax.Nd.a.b(objectArray, byArray2);
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void y(c c8, b b8) {
        int[] nArray = ax.Id.d.g();
        int[] nArray2 = ax.Id.d.g();
        int[] nArray3 = ax.Id.d.g();
        int[] nArray4 = ax.Id.d.g();
        int[] nArray5 = ax.Id.d.g();
        int[] nArray6 = ax.Id.d.g();
        int[] nArray7 = ax.Id.d.g();
        ax.Id.d.H(b8.c, nArray);
        ax.Id.d.A(c8.a, b8.a, nArray2);
        ax.Id.d.A(c8.b, b8.b, nArray3);
        ax.Id.d.A(nArray2, nArray3, nArray4);
        ax.Id.d.z(nArray4, 39081, nArray4);
        ax.Id.d.a(nArray, nArray4, nArray5);
        ax.Id.d.J(nArray, nArray4, nArray6);
        ax.Id.d.a(c8.a, c8.b, nArray);
        ax.Id.d.a(b8.a, b8.b, nArray4);
        ax.Id.d.A(nArray, nArray4, nArray7);
        ax.Id.d.a(nArray3, nArray2, nArray);
        ax.Id.d.J(nArray3, nArray2, nArray4);
        ax.Id.d.c(nArray);
        ax.Id.d.J(nArray7, nArray, nArray7);
        ax.Id.d.A(nArray7, b8.c, nArray7);
        ax.Id.d.A(nArray4, b8.c, nArray4);
        ax.Id.d.A(nArray5, nArray7, b8.a);
        ax.Id.d.A(nArray4, nArray6, b8.b);
        ax.Id.d.A(nArray5, nArray6, b8.c);
    }

    private static void z(boolean bl, b b8, b b9) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5 = ax.Id.d.g();
        int[] nArray6 = ax.Id.d.g();
        int[] nArray7 = ax.Id.d.g();
        int[] nArray8 = ax.Id.d.g();
        int[] nArray9 = ax.Id.d.g();
        int[] nArray10 = ax.Id.d.g();
        int[] nArray11 = ax.Id.d.g();
        int[] nArray12 = ax.Id.d.g();
        if (bl) {
            ax.Id.d.J(b8.b, b8.a, nArray12);
            nArray4 = nArray6;
            nArray3 = nArray9;
            nArray2 = nArray10;
            nArray = nArray11;
        } else {
            ax.Id.d.a(b8.b, b8.a, nArray12);
            nArray3 = nArray6;
            nArray4 = nArray9;
            nArray = nArray10;
            nArray2 = nArray11;
        }
        ax.Id.d.A(b8.c, b9.c, nArray5);
        ax.Id.d.H(nArray5, nArray6);
        ax.Id.d.A(b8.a, b9.a, nArray7);
        ax.Id.d.A(b8.b, b9.b, nArray8);
        ax.Id.d.A(nArray7, nArray8, nArray9);
        ax.Id.d.z(nArray9, 39081, nArray9);
        ax.Id.d.a(nArray6, nArray9, nArray);
        ax.Id.d.J(nArray6, nArray9, nArray2);
        ax.Id.d.a(b9.a, b9.b, nArray9);
        ax.Id.d.A(nArray12, nArray9, nArray12);
        ax.Id.d.a(nArray8, nArray7, nArray3);
        ax.Id.d.J(nArray8, nArray7, nArray4);
        ax.Id.d.c(nArray3);
        ax.Id.d.J(nArray12, nArray6, nArray12);
        ax.Id.d.A(nArray12, nArray5, nArray12);
        ax.Id.d.A(nArray9, nArray5, nArray9);
        ax.Id.d.A(nArray10, nArray12, b9.a);
        ax.Id.d.A(nArray9, nArray11, b9.b);
        ax.Id.d.A(nArray10, nArray11, b9.c);
    }

    private static class b {
        int[] a = ax.Id.d.g();
        int[] b = ax.Id.d.g();
        int[] c = ax.Id.d.g();

        private b() {
        }
    }

    private static class c {
        int[] a = ax.Id.d.g();
        int[] b = ax.Id.d.g();

        private c() {
        }
    }
}

