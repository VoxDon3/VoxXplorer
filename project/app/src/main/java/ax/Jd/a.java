/*
 * Decompiled with CFR 0.152.
 */
package ax.Jd;

import ax.Id.a;
import ax.vd.i;
import ax.wd.h;

public abstract class a {
    private static final byte[] a = new byte[]{83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] b = new int[]{-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] c = new int[]{1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 0x10000000};
    private static final int[] d = new int[]{52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] e = new int[]{40265304, 0x1999999, 0x666666, 0x3333333, 0xCCCCCC, 0x2666666, 0x1999999, 0x666666, 0x3333333, 0xCCCCCC};
    private static final int[] f = new int[]{56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] g = new int[]{45281625, 27714825, 18181821, 0xD4141D, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] h = new int[]{23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object i = new Object();
    private static d[] j = null;
    private static int[] k = null;

    private static d A(b b8) {
        d d8 = new d();
        ax.Id.b.g(b8.a, 0, d8.a, 0);
        ax.Id.b.g(b8.b, 0, d8.b, 0);
        ax.Id.b.g(b8.c, 0, d8.c, 0);
        ax.Id.b.z(b8.d, b8.e, d8.d);
        return d8;
    }

    private static d B(c c8) {
        d d8 = new d();
        ax.Id.b.g(c8.a, 0, d8.a, 0);
        ax.Id.b.g(c8.b, 0, d8.b, 0);
        ax.Jd.a.G(d8);
        return d8;
    }

    private static d C(d d8) {
        d d9 = new d();
        ax.Jd.a.D(d8, d9);
        return d9;
    }

    private static void D(d d8, d d9) {
        ax.Id.b.g(d8.a, 0, d9.a, 0);
        ax.Id.b.g(d8.b, 0, d9.b, 0);
        ax.Id.b.g(d8.c, 0, d9.c, 0);
        ax.Id.b.g(d8.d, 0, d9.d, 0);
    }

    private static void E(b b8) {
        int[] nArray = ax.Id.b.h();
        int[] nArray2 = ax.Id.b.h();
        int[] nArray3 = ax.Id.b.h();
        int[] nArray4 = b8.d;
        int[] nArray5 = ax.Id.b.h();
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = b8.e;
        ax.Id.b.G(b8.a, nArray);
        ax.Id.b.G(b8.b, nArray2);
        ax.Id.b.G(b8.c, nArray3);
        ax.Id.b.a(nArray3, nArray3, nArray3);
        ax.Id.b.c(nArray, nArray2, nArray7, nArray6);
        ax.Id.b.a(b8.a, b8.b, nArray4);
        ax.Id.b.G(nArray4, nArray4);
        ax.Id.b.I(nArray7, nArray4, nArray4);
        ax.Id.b.a(nArray3, nArray6, nArray5);
        ax.Id.b.d(nArray5);
        ax.Id.b.z(nArray4, nArray5, b8.a);
        ax.Id.b.z(nArray6, nArray7, b8.b);
        ax.Id.b.z(nArray5, nArray6, b8.c);
    }

    private static void F(b b8) {
        ax.Id.b.C(b8.c);
        ax.Id.b.g(b8.a, 0, b8.d, 0);
        ax.Id.b.g(b8.b, 0, b8.e, 0);
    }

    private static void G(d d8) {
        ax.Id.b.C(d8.c);
        ax.Id.b.z(d8.a, d8.b, d8.d);
    }

    private static void H(int n8, int n9, e e8) {
        int n10 = n8 * 240;
        for (n8 = 0; n8 < 8; ++n8) {
            int n11 = (n8 ^ n9) - 1 >> 31;
            ax.Id.b.e(n11, k, n10, e8.a, 0);
            ax.Id.b.e(n11, k, n10 + 10, e8.b, 0);
            ax.Id.b.e(n11, k, n10 + 20, e8.c, 0);
            n10 += 30;
        }
    }

    private static d[] I(d d8, int n8) {
        d d9 = new d();
        ax.Jd.a.z(false, d8, d8, d9);
        d[] dArray = new d[n8];
        dArray[0] = ax.Jd.a.C(d8);
        for (int i8 = 1; i8 < n8; ++i8) {
            d d10;
            d8 = dArray[i8 - 1];
            dArray[i8] = d10 = new d();
            ax.Jd.a.z(false, d8, d9, d10);
        }
        return dArray;
    }

    private static void J(b b8) {
        ax.Id.b.K(b8.a);
        ax.Id.b.C(b8.b);
        ax.Id.b.C(b8.c);
        ax.Id.b.K(b8.d);
        ax.Id.b.C(b8.e);
    }

    private static void K(d d8) {
        ax.Id.b.K(d8.a);
        ax.Id.b.C(d8.b);
        ax.Id.b.C(d8.c);
        ax.Id.b.K(d8.d);
    }

    /*
     * Exception decompiling
     */
    public static void L() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 23->132)] java.lang.Throwable
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

    private static void M(byte[] byArray, int n8, byte[] byArray2) {
        byte by;
        System.arraycopy(byArray, n8, byArray2, 0, 32);
        byArray2[0] = (byte)(byArray2[0] & 0xF8);
        byArray2[31] = by = (byte)(byArray2[31] & 0x7F);
        byArray2[31] = (byte)(by | 0x40);
    }

    private static byte[] N(byte[] byArray) {
        long l8 = ax.Jd.a.j(byArray, 0);
        long l9 = ax.Jd.a.i(byArray, 4) << 4;
        long l10 = ax.Jd.a.j(byArray, 7);
        long l11 = ax.Jd.a.i(byArray, 11) << 4;
        long l12 = ax.Jd.a.j(byArray, 14);
        long l13 = ax.Jd.a.i(byArray, 18) << 4;
        long l14 = ax.Jd.a.j(byArray, 21);
        long l15 = ax.Jd.a.i(byArray, 25) << 4;
        long l16 = ax.Jd.a.j(byArray, 28);
        long l17 = ax.Jd.a.i(byArray, 32) << 4;
        long l18 = ax.Jd.a.j(byArray, 35);
        long l19 = ax.Jd.a.i(byArray, 39) << 4;
        long l20 = ax.Jd.a.j(byArray, 42);
        long l21 = ax.Jd.a.i(byArray, 46) << 4;
        long l22 = ax.Jd.a.j(byArray, 49);
        long l23 = ax.Jd.a.i(byArray, 53) << 4;
        long l24 = ax.Jd.a.j(byArray, 56);
        long l25 = ax.Jd.a.i(byArray, 60) << 4;
        long l26 = (long)byArray[63] & 0xFFL;
        l25 = (l25 & 0xFFFFFFFFL) + ((l24 & 0xFFFFFFFFL) >> 28);
        l20 = (l20 & 0xFFFFFFFFL) - l26 * -6428113L - l25 * 5343L;
        l19 = (l19 & 0xFFFFFFFFL) - l26 * 127719000L - l25 * -6428113L - (l24 &= 0xFFFFFFFL) * 5343L;
        l23 = (l23 & 0xFFFFFFFFL) + ((l22 & 0xFFFFFFFFL) >> 28);
        l18 = (l18 & 0xFFFFFFFFL) - l26 * 19280294L - l25 * 127719000L - l24 * -6428113L - l23 * 5343L;
        l17 = (l17 & 0xFFFFFFFFL) - l26 * -50998291L - l25 * 19280294L - l24 * 127719000L - l23 * -6428113L - (l22 &= 0xFFFFFFFL) * 5343L;
        l26 = (l21 & 0xFFFFFFFFL) - l26 * 5343L + (l20 >> 28);
        l21 = (l20 & 0xFFFFFFFL) + (l19 >> 28);
        l15 = (l15 & 0xFFFFFFFFL) - l24 * -50998291L - l23 * 19280294L - l22 * 127719000L - l26 * -6428113L - l21 * 5343L;
        l19 = (l19 & 0xFFFFFFFL) + (l18 >> 28);
        l18 = (l18 & 0xFFFFFFFL) + (l17 >> 28);
        l24 = (l16 & 0xFFFFFFFFL) - l25 * -50998291L - l24 * 19280294L - l23 * 127719000L - l22 * -6428113L - l26 * 5343L + (l15 >> 28);
        l25 = l24 & 0xFFFFFFFL;
        l16 = l25 >>> 27;
        l24 = (l17 & 0xFFFFFFFL) + (l24 >> 28) + l16;
        l8 = (l8 & 0xFFFFFFFFL) - l24 * -50998291L;
        l9 = (l9 & 0xFFFFFFFFL) - l18 * -50998291L - l24 * 19280294L + (l8 >> 28);
        l10 = (l10 & 0xFFFFFFFFL) - l19 * -50998291L - l18 * 19280294L - l24 * 127719000L + (l9 >> 28);
        l11 = (l11 & 0xFFFFFFFFL) - l21 * -50998291L - l19 * 19280294L - l18 * 127719000L - l24 * -6428113L + (l10 >> 28);
        l12 = (l12 & 0xFFFFFFFFL) - l26 * -50998291L - l21 * 19280294L - l19 * 127719000L - l18 * -6428113L - l24 * 5343L + (l11 >> 28);
        l13 = (l13 & 0xFFFFFFFFL) - l22 * -50998291L - l26 * 19280294L - l21 * 127719000L - l19 * -6428113L - l18 * 5343L + (l12 >> 28);
        l23 = (l14 & 0xFFFFFFFFL) - l23 * -50998291L - l22 * 19280294L - l26 * 127719000L - l21 * -6428113L - l19 * 5343L + (l13 >> 28);
        l14 = (l15 & 0xFFFFFFFL) + (l23 >> 28);
        l22 = l25 + (l14 >> 28);
        l16 = (l22 >> 28) - l16;
        l8 = (l8 & 0xFFFFFFFL) + (l16 & 0xFFFFFFFFFCF5D3EDL);
        l9 = (l9 & 0xFFFFFFFL) + (l16 & 0x12631A6L) + (l8 >> 28);
        l10 = (l10 & 0xFFFFFFFL) + (l16 & 0x79CD658L) + (l9 >> 28);
        l11 = (l11 & 0xFFFFFFFL) + (l16 & 0xFFFFFFFFFF9DEA2FL) + (l10 >> 28);
        l12 = (l12 & 0xFFFFFFFL) + (l16 & 0x14DFL) + (l11 >> 28);
        l13 = (l13 & 0xFFFFFFFL) + (l12 >> 28);
        l23 = (l23 & 0xFFFFFFFL) + (l13 >> 28);
        l14 = (l14 & 0xFFFFFFFL) + (l23 >> 28);
        byArray = new byte[32];
        ax.Jd.a.q(l8 & 0xFFFFFFFL | (l9 & 0xFFFFFFFL) << 28, byArray, 0);
        ax.Jd.a.q(l10 & 0xFFFFFFFL | (l11 & 0xFFFFFFFL) << 28, byArray, 7);
        ax.Jd.a.q(l12 & 0xFFFFFFFL | (l13 & 0xFFFFFFFL) << 28, byArray, 14);
        ax.Jd.a.q(l23 & 0xFFFFFFFL | (l14 & 0xFFFFFFFL) << 28, byArray, 21);
        ax.Jd.a.p((int)((l22 & 0xFFFFFFFL) + (l14 >> 28)), byArray, 28);
        return byArray;
    }

    private static void O(byte[] object, b b8) {
        int n8;
        ax.Jd.a.L();
        int[] nArray = new int[8];
        ax.Jd.a.m(object, 0, nArray);
        ax.Kd.e.a(8, ~nArray[0] & 1, nArray, c, nArray);
        ax.Kd.e.i(8, nArray, 1);
        for (n8 = 0; n8 < 8; ++n8) {
            nArray[n8] = ax.Kd.b.b(nArray[n8]);
        }
        object = new e();
        ax.Jd.a.J(b8);
        n8 = 28;
        while (true) {
            for (int i8 = 0; i8 < 8; ++i8) {
                int n9 = nArray[i8] >>> n8;
                int n10 = n9 >>> 3 & 1;
                ax.Jd.a.H(i8, (n9 ^ -n10) & 7, (e)object);
                ax.Id.b.j(n10, object.a, object.b);
                ax.Id.b.f(n10, object.c);
                ax.Jd.a.x((e)object, b8);
            }
            if ((n8 -= 4) < 0) {
                return;
            }
            ax.Jd.a.E(b8);
        }
    }

    private static void P(byte[] byArray, byte[] byArray2, int n8) {
        b b8 = new b();
        ax.Jd.a.O(byArray, b8);
        if (ax.Jd.a.r(b8, byArray2, n8) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void Q(a.a object, byte[] object2, int n8, int[] nArray, int[] nArray2) {
        if (object != null) {
            object = new byte[32];
            ax.Jd.a.M(object2, n8, (byte[])object);
            object2 = new b();
            ax.Jd.a.O((byte[])object, (b)object2);
            if (ax.Jd.a.d(object2.a, object2.b, object2.c) != 0) {
                ax.Id.b.g(object2.b, 0, nArray, 0);
                ax.Id.b.g(object2.c, 0, nArray2, 0);
                return;
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("This method is only for use by X25519");
    }

    private static void R(int[] objectArray, int[] objectArray2, c dArray, b b8) {
        ax.Jd.a.L();
        objectArray = ax.Jd.a.t(objectArray, 7);
        objectArray2 = ax.Jd.a.t(objectArray2, 5);
        dArray = ax.Jd.a.I(ax.Jd.a.B((c)dArray), 8);
        ax.Jd.a.J(b8);
        int n8 = 252;
        while (true) {
            boolean bl;
            int n9;
            int n10 = objectArray[n8];
            boolean bl2 = false;
            if (n10 != 0) {
                n9 = n10 >> 31;
                bl = n9 != 0;
                ax.Jd.a.y(bl, j[(n10 ^ n9) >>> 1], b8);
            }
            if ((n10 = objectArray2[n8]) != 0) {
                n9 = n10 >> 31;
                bl = bl2;
                if (n9 != 0) {
                    bl = true;
                }
                ax.Jd.a.y(bl, dArray[(n10 ^ n9) >>> 1], b8);
            }
            if (--n8 < 0) {
                return;
            }
            ax.Jd.a.E(b8);
        }
    }

    public static void S(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, int n10, int n11, byte[] byArray4, int n12) {
        ax.Jd.a.v(byArray, n8, byArray2, n9, null, (byte)0, byArray3, n10, n11, byArray4, n12);
    }

    public static void T(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte[] byArray4, int n10, int n11, byte[] byArray5, int n12) {
        ax.Jd.a.v(byArray, n8, byArray2, n9, byArray3, (byte)0, byArray4, n10, n11, byArray5, n12);
    }

    public static void U(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte[] byArray4, int n10, byte[] byArray5, int n11) {
        ax.Jd.a.v(byArray, n8, byArray2, n9, byArray3, (byte)1, byArray4, n10, 64, byArray5, n11);
    }

    public static boolean V(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, int n10, int n11) {
        return ax.Jd.a.w(byArray, n8, byArray2, n9, null, (byte)0, byArray3, n10, n11);
    }

    private static byte[] a(byte[] objectArray, byte[] objectArray2, byte[] byArray) {
        int[] nArray = new int[16];
        ax.Jd.a.m(objectArray, 0, nArray);
        objectArray = new int[8];
        ax.Jd.a.m(objectArray2, 0, objectArray);
        objectArray2 = new int[8];
        ax.Jd.a.m(byArray, 0, objectArray2);
        ax.Kd.d.b(objectArray, objectArray2, nArray);
        objectArray = new byte[64];
        for (int i8 = 0; i8 < 16; ++i8) {
            ax.Jd.a.p(nArray[i8], objectArray, i8 * 4);
        }
        return ax.Jd.a.N(objectArray);
    }

    private static boolean b(byte[] byArray, byte by) {
        return byArray == null && by == 0 || byArray != null && byArray.length < 256;
    }

    private static int c(int[] nArray, int[] nArray2) {
        int[] nArray3 = ax.Id.b.h();
        int[] nArray4 = ax.Id.b.h();
        int[] nArray5 = ax.Id.b.h();
        ax.Id.b.G(nArray, nArray4);
        ax.Id.b.G(nArray2, nArray5);
        ax.Id.b.z(nArray4, nArray5, nArray3);
        ax.Id.b.I(nArray5, nArray4, nArray5);
        ax.Id.b.z(nArray3, f, nArray3);
        ax.Id.b.b(nArray3);
        ax.Id.b.I(nArray3, nArray5, nArray3);
        ax.Id.b.B(nArray3);
        return ax.Id.b.w(nArray3);
    }

    private static int d(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = ax.Id.b.h();
        int[] nArray5 = ax.Id.b.h();
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = ax.Id.b.h();
        ax.Id.b.G(nArray, nArray5);
        ax.Id.b.G(nArray2, nArray6);
        ax.Id.b.G(nArray3, nArray7);
        ax.Id.b.z(nArray5, nArray6, nArray4);
        ax.Id.b.I(nArray6, nArray5, nArray6);
        ax.Id.b.z(nArray6, nArray7, nArray6);
        ax.Id.b.G(nArray7, nArray7);
        ax.Id.b.z(nArray4, f, nArray4);
        ax.Id.b.a(nArray4, nArray7, nArray4);
        ax.Id.b.I(nArray4, nArray6, nArray4);
        ax.Id.b.B(nArray4);
        return ax.Id.b.w(nArray4);
    }

    private static boolean e(byte[] byArray) {
        int[] nArray = new int[8];
        ax.Jd.a.k(byArray, 0, nArray, 0, 8);
        nArray[7] = nArray[7] & Integer.MAX_VALUE;
        return ax.Kd.d.a(nArray, b) ^ true;
    }

    private static boolean f(byte[] byArray, int[] nArray) {
        ax.Jd.a.m(byArray, 0, nArray);
        return ax.Kd.d.a(nArray, c) ^ true;
    }

    private static byte[] g(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        return byArray2;
    }

    private static i h() {
        return new h();
    }

    private static int i(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        return (byArray[n8 + 2] & 0xFF) << 16 | (by & 0xFF | (by2 & 0xFF) << 8);
    }

    private static int j(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private static void k(byte[] byArray, int n8, int[] nArray, int n9, int n10) {
        for (int i8 = 0; i8 < n10; ++i8) {
            nArray[n9 + i8] = ax.Jd.a.j(byArray, i8 * 4 + n8);
        }
    }

    private static boolean l(byte[] objectArray, int n8, boolean bl, c c8) {
        objectArray = ax.Jd.a.g(objectArray, n8, 32);
        boolean bl2 = ax.Jd.a.e(objectArray);
        n8 = 0;
        if (!bl2) {
            return false;
        }
        byte by = objectArray[31];
        int n9 = (by & 0x80) >>> 7;
        objectArray[31] = (byte)(by & 0x7F);
        ax.Id.b.k(objectArray, 0, c8.b);
        objectArray = ax.Id.b.h();
        int[] nArray = ax.Id.b.h();
        ax.Id.b.G(c8.b, objectArray);
        ax.Id.b.z(f, objectArray, nArray);
        ax.Id.b.J(objectArray);
        ax.Id.b.b(nArray);
        if (!ax.Id.b.H(objectArray, nArray, c8.a)) {
            return false;
        }
        ax.Id.b.B(c8.a);
        if (n9 == 1 && ax.Id.b.x(c8.a)) {
            return false;
        }
        objectArray = c8.a;
        if (n9 != (objectArray[0] & 1)) {
            n8 = 1;
        }
        if ((bl ^ n8) != 0) {
            ax.Id.b.A(objectArray, objectArray);
        }
        return true;
    }

    private static void m(byte[] byArray, int n8, int[] nArray) {
        ax.Jd.a.k(byArray, n8, nArray, 0, 8);
    }

    private static void n(i i8, byte by, byte[] byArray) {
        if (byArray != null) {
            byte[] byArray2 = a;
            int n8 = byArray2.length;
            int n9 = n8 + 2;
            int n10 = byArray.length + n9;
            byte[] byArray3 = new byte[n10];
            System.arraycopy(byArray2, 0, byArray3, 0, n8);
            byArray3[n8] = by;
            byArray3[n8 + 1] = (byte)byArray.length;
            System.arraycopy(byArray, 0, byArray3, n9, byArray.length);
            i8.b(byArray3, 0, n10);
        }
    }

    private static void o(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
    }

    private static void p(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    private static void q(long l8, byte[] byArray, int n8) {
        ax.Jd.a.p((int)l8, byArray, n8);
        ax.Jd.a.o((int)(l8 >>> 32), byArray, n8 + 4);
    }

    private static int r(b b8, byte[] byArray, int n8) {
        int[] nArray = ax.Id.b.h();
        int[] nArray2 = ax.Id.b.h();
        ax.Id.b.u(b8.c, nArray2);
        ax.Id.b.z(b8.a, nArray2, nArray);
        ax.Id.b.z(b8.b, nArray2, nArray2);
        ax.Id.b.B(nArray);
        ax.Id.b.B(nArray2);
        int n9 = ax.Jd.a.c(nArray, nArray2);
        ax.Id.b.p(nArray2, byArray, n8);
        int n10 = n8 + 31;
        n8 = byArray[n10];
        byArray[n10] = (byte)((nArray[0] & 1) << 7 | n8);
        return n9;
    }

    public static void s(byte[] byArray, int n8, byte[] byArray2, int n9) {
        i i8 = ax.Jd.a.h();
        byte[] byArray3 = new byte[i8.i()];
        i8.b(byArray, n8, 32);
        i8.c(byArray3, 0);
        byArray = new byte[32];
        ax.Jd.a.M(byArray3, 0, byArray);
        ax.Jd.a.P(byArray, byArray2, n9);
    }

    private static byte[] t(int[] objectArray, int n8) {
        int n9;
        int[] nArray = new int[16];
        int n10 = 0;
        int n11 = 8;
        int n12 = 16;
        int n13 = 0;
        while (--n11 >= 0) {
            n9 = objectArray[n11];
            nArray[n12 - 1] = n13 << 16 | n9 >>> 16;
            nArray[n12 -= 2] = n9;
            n13 = n9;
        }
        objectArray = new byte[253];
        n9 = 32 - n8;
        n13 = 0;
        n11 = 0;
        n12 = n10;
        while (n12 < 16) {
            n10 = nArray[n12];
            while (n13 < 16) {
                int n14 = n10 >>> n13;
                if ((n14 & 1) == n11) {
                    ++n13;
                    continue;
                }
                n11 = (n14 | 1) << n9;
                objectArray[(n12 << 4) + n13] = (byte)(n11 >> n9);
                n13 += n8;
                n11 >>>= 31;
            }
            ++n12;
            n13 -= 16;
        }
        return objectArray;
    }

    private static void u(i object, byte[] byArray, byte[] byArray2, byte[] byArray3, int n8, byte[] byArray4, byte by, byte[] byArray5, int n9, int n10, byte[] byArray6, int n11) {
        ax.Jd.a.n((i)object, by, byArray4);
        object.b(byArray, 32, 32);
        object.b(byArray5, n9, n10);
        object.c(byArray, 0);
        byte[] byArray7 = ax.Jd.a.N(byArray);
        byte[] byArray8 = new byte[32];
        ax.Jd.a.P(byArray7, byArray8, 0);
        ax.Jd.a.n((i)object, by, byArray4);
        object.b(byArray8, 0, 32);
        object.b(byArray3, n8, 32);
        object.b(byArray5, n9, n10);
        object.c(byArray, 0);
        object = ax.Jd.a.a(byArray7, ax.Jd.a.N(byArray), byArray2);
        System.arraycopy(byArray8, 0, byArray6, n11, 32);
        System.arraycopy(object, 0, byArray6, n11 + 32, 32);
    }

    private static void v(byte[] byArray, int n8, byte[] byArray2, int n9, byte[] byArray3, byte by, byte[] byArray4, int n10, int n11, byte[] byArray5, int n12) {
        if (ax.Jd.a.b(byArray3, by)) {
            i i8 = ax.Jd.a.h();
            byte[] byArray6 = new byte[i8.i()];
            i8.b(byArray, n8, 32);
            i8.c(byArray6, 0);
            byArray = new byte[32];
            ax.Jd.a.M(byArray6, 0, byArray);
            ax.Jd.a.u(i8, byArray6, byArray, byArray2, n9, byArray3, by, byArray4, n10, n11, byArray5, n12);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean w(byte[] objectArray, int n8, byte[] objectArray2, int n9, byte[] object, byte by, byte[] byArray, int n10, int n11) {
        if (ax.Jd.a.b(object, by)) {
            byte[] byArray2 = ax.Jd.a.g(objectArray, n8, 32);
            Object object2 = ax.Jd.a.g(objectArray, n8 + 32, 32);
            if (!ax.Jd.a.e(byArray2)) {
                return false;
            }
            objectArray = new int[8];
            if (!ax.Jd.a.f(object2, objectArray)) {
                return false;
            }
            object2 = new c();
            if (!ax.Jd.a.l(objectArray2, n9, true, (c)object2)) {
                return false;
            }
            i i8 = ax.Jd.a.h();
            byte[] byArray3 = new byte[i8.i()];
            ax.Jd.a.n(i8, by, object);
            i8.b(byArray2, 0, 32);
            i8.b((byte[])objectArray2, n9, 32);
            i8.b(byArray, n10, n11);
            i8.c(byArray3, 0);
            object = ax.Jd.a.N(byArray3);
            objectArray2 = new int[8];
            ax.Jd.a.m(object, 0, objectArray2);
            object = new b();
            ax.Jd.a.R(objectArray, objectArray2, (c)object2, (b)object);
            objectArray = new byte[32];
            return ax.Jd.a.r((b)object, objectArray, 0) != 0 && ax.Nd.a.b(objectArray, byArray2);
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void x(e e8, b b8) {
        int[] nArray = ax.Id.b.h();
        int[] nArray2 = ax.Id.b.h();
        int[] nArray3 = ax.Id.b.h();
        int[] nArray4 = b8.d;
        int[] nArray5 = ax.Id.b.h();
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = b8.e;
        ax.Id.b.c(b8.b, b8.a, nArray2, nArray);
        ax.Id.b.z(nArray, e8.b, nArray);
        ax.Id.b.z(nArray2, e8.a, nArray2);
        ax.Id.b.z(b8.d, b8.e, nArray3);
        ax.Id.b.z(nArray3, e8.c, nArray3);
        ax.Id.b.c(nArray2, nArray, nArray7, nArray4);
        ax.Id.b.c(b8.c, nArray3, nArray6, nArray5);
        ax.Id.b.d(nArray6);
        ax.Id.b.z(nArray4, nArray5, b8.a);
        ax.Id.b.z(nArray6, nArray7, b8.b);
        ax.Id.b.z(nArray5, nArray6, b8.c);
    }

    private static void y(boolean bl, d d8, b b8) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5 = ax.Id.b.h();
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = ax.Id.b.h();
        int[] nArray8 = ax.Id.b.h();
        int[] nArray9 = b8.d;
        int[] nArray10 = ax.Id.b.h();
        int[] nArray11 = ax.Id.b.h();
        int[] nArray12 = b8.e;
        if (bl) {
            nArray4 = nArray7;
            nArray3 = nArray8;
            nArray2 = nArray10;
            nArray = nArray11;
        } else {
            nArray3 = nArray7;
            nArray4 = nArray8;
            nArray = nArray10;
            nArray2 = nArray11;
        }
        ax.Id.b.c(b8.b, b8.a, nArray6, nArray5);
        ax.Id.b.c(d8.b, d8.a, nArray4, nArray3);
        ax.Id.b.z(nArray5, nArray7, nArray5);
        ax.Id.b.z(nArray6, nArray8, nArray6);
        ax.Id.b.z(b8.d, b8.e, nArray7);
        ax.Id.b.z(nArray7, d8.d, nArray7);
        ax.Id.b.z(nArray7, g, nArray7);
        ax.Id.b.z(b8.c, d8.c, nArray8);
        ax.Id.b.a(nArray8, nArray8, nArray8);
        ax.Id.b.c(nArray6, nArray5, nArray12, nArray9);
        ax.Id.b.c(nArray8, nArray7, nArray2, nArray);
        ax.Id.b.d(nArray2);
        ax.Id.b.z(nArray9, nArray10, b8.a);
        ax.Id.b.z(nArray11, nArray12, b8.b);
        ax.Id.b.z(nArray10, nArray11, b8.c);
    }

    private static void z(boolean bl, d d8, d d9, d d10) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5 = ax.Id.b.h();
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = ax.Id.b.h();
        int[] nArray8 = ax.Id.b.h();
        int[] nArray9 = ax.Id.b.h();
        int[] nArray10 = ax.Id.b.h();
        int[] nArray11 = ax.Id.b.h();
        int[] nArray12 = ax.Id.b.h();
        if (bl) {
            int[] nArray13;
            nArray4 = nArray7;
            nArray3 = nArray8;
            nArray2 = nArray10;
            nArray = nArray13 = nArray11;
        } else {
            nArray3 = nArray7;
            int[] nArray14 = nArray8;
            nArray = nArray10;
            nArray2 = nArray11;
            nArray4 = nArray14;
        }
        ax.Id.b.c(d8.b, d8.a, nArray6, nArray5);
        ax.Id.b.c(d9.b, d9.a, nArray4, nArray3);
        ax.Id.b.z(nArray5, nArray7, nArray5);
        ax.Id.b.z(nArray6, nArray8, nArray6);
        ax.Id.b.z(d8.d, d9.d, nArray7);
        ax.Id.b.z(nArray7, g, nArray7);
        ax.Id.b.z(d8.c, d9.c, nArray8);
        ax.Id.b.a(nArray8, nArray8, nArray8);
        ax.Id.b.c(nArray6, nArray5, nArray12, nArray9);
        ax.Id.b.c(nArray8, nArray7, nArray2, nArray);
        ax.Id.b.d(nArray2);
        ax.Id.b.z(nArray9, nArray10, d10.a);
        ax.Id.b.z(nArray11, nArray12, d10.b);
        ax.Id.b.z(nArray10, nArray11, d10.c);
        ax.Id.b.z(nArray9, nArray12, d10.d);
    }

    private static class b {
        int[] a = ax.Id.b.h();
        int[] b = ax.Id.b.h();
        int[] c = ax.Id.b.h();
        int[] d = ax.Id.b.h();
        int[] e = ax.Id.b.h();

        private b() {
        }
    }

    private static class c {
        int[] a = ax.Id.b.h();
        int[] b = ax.Id.b.h();

        private c() {
        }
    }

    private static class d {
        int[] a = ax.Id.b.h();
        int[] b = ax.Id.b.h();
        int[] c = ax.Id.b.h();
        int[] d = ax.Id.b.h();

        private d() {
        }
    }

    private static class e {
        int[] a = ax.Id.b.h();
        int[] b = ax.Id.b.h();
        int[] c = ax.Id.b.h();

        private e() {
        }
    }
}

