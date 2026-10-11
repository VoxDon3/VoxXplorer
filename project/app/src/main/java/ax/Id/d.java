/*
 * Decompiled with CFR 0.152.
 */
package ax.Id;

import ax.Kd.c;

public abstract class d {
    private static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    public static void A(int[] nArray, int[] nArray2, int[] nArray3) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        int n18 = nArray[10];
        int n19 = nArray[11];
        int n20 = nArray[12];
        int n21 = nArray[13];
        int n22 = nArray[14];
        int n23 = nArray[15];
        int n24 = nArray2[0];
        int n25 = nArray2[1];
        int n26 = nArray2[2];
        int n27 = nArray2[3];
        int n28 = nArray2[4];
        int n29 = nArray2[5];
        int n30 = nArray2[6];
        int n31 = nArray2[7];
        int n32 = nArray2[8];
        int n33 = nArray2[9];
        int n34 = nArray2[10];
        int n35 = nArray2[11];
        int n36 = nArray2[12];
        int n37 = nArray2[13];
        int n38 = nArray2[14];
        int n39 = nArray2[15];
        long l8 = n8;
        long l9 = n24;
        long l10 = l8 * l9;
        long l11 = n15;
        long l12 = n25;
        long l13 = n14;
        long l14 = n26;
        long l15 = n13;
        long l16 = n27;
        long l17 = n12;
        long l18 = n28;
        long l19 = n11;
        long l20 = n29;
        long l21 = n10;
        long l22 = n30;
        long l23 = n9;
        long l24 = n31;
        long l25 = n16;
        long l26 = n32;
        long l27 = n23;
        long l28 = n33;
        long l29 = n22;
        long l30 = n34;
        long l31 = n21;
        long l32 = n35;
        long l33 = n20;
        long l34 = n36;
        long l35 = n19;
        long l36 = n37;
        long l37 = n18;
        long l38 = n38;
        long l39 = n17;
        long l40 = n39;
        long l41 = n8 + n16;
        long l42 = n24 + n32;
        long l43 = n15 + n23;
        long l44 = n25 + n33;
        long l45 = n14 + n22;
        long l46 = n26 + n34;
        long l47 = n13 + n21;
        long l48 = n27 + n35;
        long l49 = n12 + n20;
        long l50 = n28 + n36;
        long l51 = n11 + n19;
        long l52 = n29 + n37;
        long l53 = n10 + n18;
        long l54 = n30 + n38;
        long l55 = n9 + n17;
        long l56 = n31 + n39;
        long l57 = l43 * l44 + l45 * l46 + l47 * l48 + l49 * l50 + l51 * l52 + l53 * l54 + l55 * l56;
        long l58 = l10 + l25 * l26 + l57 - (l11 * l12 + l13 * l14 + l15 * l16 + l17 * l18 + l19 * l20 + l21 * l22 + l23 * l24);
        n29 = (int)l58;
        long l59 = l27 * l28 + l29 * l30 + l31 * l32 + l33 * l34 + l35 * l36 + l37 * l38 + l39 * l40 + l41 * l42 - l10 + l57;
        n25 = (int)l59;
        l10 = l23 * l9 + l8 * l12;
        l57 = l43 * l46 + l45 * l48 + l47 * l50 + l49 * l52 + l51 * l54 + l53 * l56;
        l58 = (l58 >>> 28) + (l10 + (l39 * l26 + l25 * l28) + l57 - (l11 * l14 + l13 * l16 + l15 * l18 + l17 * l20 + l19 * l22 + l21 * l24));
        n31 = (int)l58;
        l10 = (l59 >>> 28) + (l27 * l30 + l29 * l32 + l31 * l34 + l33 * l36 + l35 * l38 + l37 * l40 + (l55 * l42 + l41 * l44) - l10 + l57);
        n24 = (int)l10;
        l59 = l21 * l9 + l23 * l12 + l8 * l14;
        l57 = l43 * l48 + l45 * l50 + l47 * l52 + l49 * l54 + l51 * l56;
        l58 = (l58 >>> 28) + (l59 + (l37 * l26 + l39 * l28 + l25 * l30) + l57 - (l11 * l16 + l13 * l18 + l15 * l20 + l17 * l22 + l19 * l24));
        n8 = (int)l58;
        l10 = (l10 >>> 28) + (l27 * l32 + l29 * l34 + l31 * l36 + l33 * l38 + l35 * l40 + (l53 * l42 + l55 * l44 + l41 * l46) - l59 + l57);
        n12 = (int)l10;
        l59 = l19 * l9 + l21 * l12 + l23 * l14 + l8 * l16;
        l57 = l43 * l50 + l45 * l52 + l47 * l54 + l49 * l56;
        l58 = (l58 >>> 28) + (l59 + (l35 * l26 + l37 * l28 + l39 * l30 + l25 * l32) + l57 - (l11 * l18 + l13 * l20 + l15 * l22 + l17 * l24));
        n16 = (int)l58;
        l57 = (l10 >>> 28) + (l27 * l34 + l29 * l36 + l31 * l38 + l33 * l40 + (l51 * l42 + l53 * l44 + l55 * l46 + l41 * l48) - l59 + l57);
        n35 = (int)l57;
        l10 = l17 * l9 + l19 * l12 + l21 * l14 + l23 * l16 + l8 * l18;
        l59 = l43 * l52 + l45 * l54 + l47 * l56;
        l58 = (l58 >>> 28) + (l10 + (l33 * l26 + l35 * l28 + l37 * l30 + l39 * l32 + l25 * l34) + l59 - (l11 * l20 + l13 * l22 + l15 * l24));
        n23 = (int)l58;
        l10 = (l57 >>> 28) + (l27 * l36 + l29 * l38 + l31 * l40 + (l49 * l42 + l51 * l44 + l53 * l46 + l55 * l48 + l41 * l50) - l10 + l59);
        n26 = (int)l10;
        l57 = l15 * l9 + l17 * l12 + l19 * l14 + l21 * l16 + l23 * l18 + l8 * l20;
        l59 = l43 * l54 + l45 * l56;
        l58 = (l58 >>> 28) + (l57 + (l31 * l26 + l33 * l28 + l35 * l30 + l37 * l32 + l39 * l34 + l25 * l36) + l59 - (l11 * l22 + l13 * l24));
        n14 = (int)l58;
        l10 = (l10 >>> 28) + (l27 * l38 + l29 * l40 + (l47 * l42 + l49 * l44 + l51 * l46 + l53 * l48 + l55 * l50 + l41 * l52) - l57 + l59);
        n22 = (int)l10;
        l59 = l13 * l9 + l15 * l12 + l17 * l14 + l19 * l16 + l21 * l18 + l23 * l20 + l8 * l22;
        l57 = l43 * l56;
        l58 = (l58 >>> 28) + (l59 + (l29 * l26 + l31 * l28 + l33 * l30 + l35 * l32 + l37 * l34 + l39 * l36 + l25 * l38) + l57 - l11 * l24);
        n32 = (int)l58;
        l57 = (l10 >>> 28) + (l27 * l40 + (l45 * l42 + l47 * l44 + l49 * l46 + l51 * l48 + l53 * l50 + l55 * l52 + l41 * l54) - l59 + l57);
        n28 = (int)l57;
        l15 = l9 * l11 + l13 * l12 + l15 * l14 + l17 * l16 + l19 * l18 + l21 * l20 + l23 * l22 + l8 * l24;
        l27 = (l58 >>> 28) + (l15 + (l27 * l26 + l29 * l28 + l31 * l30 + l33 * l32 + l35 * l34 + l37 * l36 + l39 * l38 + l25 * l40));
        n9 = (int)l27;
        l42 = (l57 >>> 28) + (l43 * l42 + l45 * l44 + l47 * l46 + l49 * l48 + l51 * l50 + l53 * l52 + l55 * l54 + l41 * l56 - l15);
        n21 = (int)l42;
        l41 = (l27 >>> 28) + (l42 >>>= 28) + (long)(n25 & 0xFFFFFFF);
        n25 = (int)l41;
        n17 = (int)(l42 += (long)(n29 & 0xFFFFFFF));
        n29 = (int)(l41 >>> 28);
        n36 = (int)(l42 >>> 28);
        nArray3[0] = n17 & 0xFFFFFFF;
        nArray3[1] = (n31 & 0xFFFFFFF) + n36;
        nArray3[2] = n8 & 0xFFFFFFF;
        nArray3[3] = n16 & 0xFFFFFFF;
        nArray3[4] = n23 & 0xFFFFFFF;
        nArray3[5] = n14 & 0xFFFFFFF;
        nArray3[6] = n32 & 0xFFFFFFF;
        nArray3[7] = n9 & 0xFFFFFFF;
        nArray3[8] = n25 & 0xFFFFFFF;
        nArray3[9] = (n24 & 0xFFFFFFF) + n29;
        nArray3[10] = n12 & 0xFFFFFFF;
        nArray3[11] = n35 & 0xFFFFFFF;
        nArray3[12] = n26 & 0xFFFFFFF;
        nArray3[13] = n22 & 0xFFFFFFF;
        nArray3[14] = n28 & 0xFFFFFFF;
        nArray3[15] = n21 & 0xFFFFFFF;
    }

    public static void B(int[] nArray, int[] nArray2) {
        d.J(d.g(), nArray, nArray2);
    }

    public static void C(int[] nArray) {
        d.F(nArray, 1);
        d.F(nArray, -1);
    }

    public static void D(int[] nArray) {
        nArray[0] = 1;
        for (int i8 = 1; i8 < 16; ++i8) {
            nArray[i8] = 0;
        }
    }

    private static void E(int[] nArray, int[] nArray2) {
        int[] nArray3 = d.g();
        d.H(nArray, nArray3);
        d.A(nArray, nArray3, nArray3);
        int[] nArray4 = d.g();
        d.H(nArray3, nArray4);
        d.A(nArray, nArray4, nArray4);
        int[] nArray5 = d.g();
        d.G(nArray4, 3, nArray5);
        d.A(nArray4, nArray5, nArray5);
        nArray3 = d.g();
        d.G(nArray5, 3, nArray3);
        d.A(nArray4, nArray3, nArray3);
        nArray4 = d.g();
        d.G(nArray3, 9, nArray4);
        d.A(nArray3, nArray4, nArray4);
        nArray5 = d.g();
        d.H(nArray4, nArray5);
        d.A(nArray, nArray5, nArray5);
        nArray3 = d.g();
        d.G(nArray5, 18, nArray3);
        d.A(nArray4, nArray3, nArray3);
        nArray5 = d.g();
        d.G(nArray3, 37, nArray5);
        d.A(nArray3, nArray5, nArray5);
        nArray4 = d.g();
        d.G(nArray5, 37, nArray4);
        d.A(nArray3, nArray4, nArray4);
        nArray3 = d.g();
        d.G(nArray4, 111, nArray3);
        d.A(nArray4, nArray3, nArray3);
        nArray4 = d.g();
        d.H(nArray3, nArray4);
        d.A(nArray, nArray4, nArray4);
        nArray = d.g();
        d.G(nArray4, 223, nArray);
        d.A(nArray, nArray3, nArray2);
    }

    private static void F(int[] nArray, int n8) {
        int n9 = nArray[15];
        long l8 = (n9 >>> 28) + n8;
        n8 = 0;
        long l9 = l8;
        while (true) {
            int n10 = 8;
            if (n8 >= 8) break;
            nArray[n8] = (int)(l9 += 0xFFFFFFFFL & (long)nArray[n8]) & 0xFFFFFFF;
            l9 >>= 28;
            ++n8;
        }
        l9 += l8;
        for (n8 = n10; n8 < 15; ++n8) {
            nArray[n8] = (int)(l9 += (long)nArray[n8] & 0xFFFFFFFFL) & 0xFFFFFFF;
            l9 >>= 28;
        }
        nArray[15] = (n9 & 0xFFFFFFF) + (int)l9;
    }

    public static void G(int[] nArray, int n8, int[] nArray2) {
        d.H(nArray, nArray2);
        while (--n8 > 0) {
            d.H(nArray2, nArray2);
        }
    }

    public static void H(int[] nArray, int[] nArray2) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        int n18 = nArray[10];
        int n19 = nArray[11];
        int n20 = nArray[12];
        int n21 = nArray[13];
        int n22 = nArray[14];
        int n23 = nArray[15];
        int n24 = n8 + n16;
        int n25 = n9 + n17;
        int n26 = n10 + n18;
        int n27 = n11 + n19;
        int n28 = n12 + n20;
        int n29 = n13 + n21;
        int n30 = n14 + n22;
        long l8 = n8;
        long l9 = l8 * l8;
        long l10 = n15;
        long l11 = n9 * 2;
        long l12 = n14;
        long l13 = n10 * 2;
        long l14 = n13;
        long l15 = n11 * 2;
        long l16 = n12;
        long l17 = n16;
        long l18 = n23;
        long l19 = n17 * 2;
        long l20 = n22;
        long l21 = n18 * 2;
        long l22 = n21;
        long l23 = n19 * 2;
        long l24 = n20;
        long l25 = n24;
        long l26 = n15 + n23;
        long l27 = (long)(n25 * 2) & 0xFFFFFFFFL;
        long l28 = n30;
        long l29 = (long)(n26 * 2) & 0xFFFFFFFFL;
        l8 = n29;
        long l30 = (long)(n27 * 2) & 0xFFFFFFFFL;
        long l31 = n28;
        long l32 = l26 * l27 + l28 * l29 + l8 * l30 + l31 * l31;
        long l33 = l9 + l17 * l17 + l32 - (l10 * l11 + l12 * l13 + l14 * l15 + l16 * l16);
        n23 = (int)l33;
        long l34 = l18 * l19 + l20 * l21 + l22 * l23 + l24 * l24 + l25 * l25 - l9 + l32;
        n15 = (int)l34;
        long l35 = n9;
        l9 = n8 * 2;
        long l36 = l35 * l9;
        long l37 = n12 * 2;
        long l38 = n17;
        l25 = n16 * 2;
        long l39 = n20 * 2;
        l17 = n25;
        l32 = (long)(n24 * 2) & 0xFFFFFFFFL;
        long l40 = (long)(n28 * 2) & 0xFFFFFFFFL;
        long l41 = l26 * l29 + l28 * l30 + l8 * l40;
        l33 = (l33 >>> 28) + (l36 + l38 * l25 + l41 - (l10 * l13 + l12 * l15 + l14 * l37));
        n25 = (int)l33;
        l34 = (l34 >>> 28) + (l18 * l21 + l20 * l23 + l22 * l39 + l17 * l32 - l36 + l41);
        n16 = (int)l34;
        l36 = n10;
        long l42 = l36 * l9 + l35 * l35;
        l41 = n18;
        l35 = n26;
        long l43 = l26 * l30 + l28 * l40 + l8 * l8;
        long l44 = (l33 >>> 28) + (l42 + (l41 * l25 + l38 * l38) + l43 - (l10 * l15 + l12 * l37 + l14 * l14));
        n26 = (int)l44;
        long l45 = (l34 >>> 28) + (l18 * l23 + l20 * l39 + l22 * l22 + (l35 * l32 + l17 * l17) - l42 + l43);
        n18 = (int)l45;
        l33 = n11;
        long l46 = l33 * l9 + l36 * l11;
        l42 = n13 * 2;
        l38 = n19;
        l34 = n21 * 2;
        l17 = n27;
        l43 = (long)(n29 * 2) & 0xFFFFFFFFL;
        l40 = l40 * l26 + l28 * l43;
        l37 = (l44 >>> 28) + (l46 + (l38 * l25 + l41 * l19) + l40 - (l10 * l37 + l12 * l42));
        n19 = (int)l37;
        l39 = (l45 >>> 28) + (l18 * l39 + l20 * l34 + (l17 * l32 + l35 * l27) - l46 + l40);
        n27 = (int)l39;
        l40 = l16 * l9 + l33 * l11 + l36 * l36;
        l36 = l26 * l43 + l28 * l28;
        l37 = (l37 >>> 28) + (l40 + (l24 * l25 + l38 * l19 + l41 * l41) + l36 - (l10 * l42 + l12 * l12));
        n29 = (int)l37;
        l40 = (l39 >>> 28) + (l34 * l18 + l20 * l20 + (l31 * l32 + l17 * l27 + l35 * l35) - l40 + l36);
        n13 = (int)l40;
        l35 = l14 * l9 + l16 * l11 + l33 * l13;
        l39 = n14 * 2;
        l41 = n22 * 2;
        l36 = ((long)(n30 * 2) & 0xFFFFFFFFL) * l26;
        l39 = (l37 >>> 28) + (l35 + (l22 * l25 + l24 * l19 + l38 * l21) + l36 - l39 * l10);
        n10 = (int)l39;
        l35 = (l40 >>> 28) + (l41 * l18 + (l8 * l32 + l31 * l27 + l17 * l29) - l35 + l36);
        n22 = (int)l35;
        l33 = l12 * l9 + l14 * l11 + l16 * l13 + l33 * l33;
        l37 = l26 * l26;
        l38 = (l39 >>> 28) + (l33 + (l20 * l25 + l22 * l19 + l24 * l21 + l38 * l38) + l37 - l10 * l10);
        n21 = (int)l38;
        l17 = (l35 >>> 28) + (l18 * l18 + (l28 * l32 + l8 * l27 + l31 * l29 + l17 * l17) - l33 + l37);
        n14 = (int)l17;
        l10 = l10 * l9 + l12 * l11 + l14 * l13 + l15 * l16;
        l23 = (l38 >>> 28) + (l10 + (l18 * l25 + l20 * l19 + l22 * l21 + l24 * l23));
        n30 = (int)l23;
        l8 = (l17 >>> 28) + (l26 * l32 + l28 * l27 + l8 * l29 + l31 * l30 - l10);
        n11 = (int)l8;
        l29 = l8 >>> 28;
        l8 = (l23 >>> 28) + l29 + (long)(n15 & 0xFFFFFFF);
        n15 = (int)l8;
        n9 = (int)(l29 += (long)(n23 & 0xFFFFFFF));
        n23 = (int)(l8 >>> 28);
        n20 = (int)(l29 >>> 28);
        nArray2[0] = n9 & 0xFFFFFFF;
        nArray2[1] = (n25 & 0xFFFFFFF) + n20;
        nArray2[2] = n26 & 0xFFFFFFF;
        nArray2[3] = n19 & 0xFFFFFFF;
        nArray2[4] = n29 & 0xFFFFFFF;
        nArray2[5] = n10 & 0xFFFFFFF;
        nArray2[6] = n21 & 0xFFFFFFF;
        nArray2[7] = n30 & 0xFFFFFFF;
        nArray2[8] = n15 & 0xFFFFFFF;
        nArray2[9] = (n16 & 0xFFFFFFF) + n23;
        nArray2[10] = n18 & 0xFFFFFFF;
        nArray2[11] = n27 & 0xFFFFFFF;
        nArray2[12] = n13 & 0xFFFFFFF;
        nArray2[13] = n22 & 0xFFFFFFF;
        nArray2[14] = n14 & 0xFFFFFFF;
        nArray2[15] = n11 & 0xFFFFFFF;
    }

    public static boolean I(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = d.g();
        int[] nArray5 = d.g();
        d.H(nArray, nArray4);
        d.A(nArray4, nArray2, nArray4);
        d.H(nArray4, nArray5);
        d.A(nArray4, nArray, nArray4);
        d.A(nArray5, nArray, nArray5);
        d.A(nArray5, nArray2, nArray5);
        int[] nArray6 = d.g();
        d.E(nArray5, nArray6);
        d.A(nArray6, nArray4, nArray6);
        nArray4 = d.g();
        d.H(nArray6, nArray4);
        d.A(nArray4, nArray2, nArray4);
        d.J(nArray, nArray4, nArray4);
        d.C(nArray4);
        if (d.y(nArray4)) {
            d.f(nArray6, 0, nArray3, 0);
            return true;
        }
        return false;
    }

    public static void J(int[] nArray, int[] nArray2, int[] nArray3) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        int n18 = nArray[10];
        int n19 = nArray[11];
        int n20 = nArray[12];
        int n21 = nArray[13];
        int n22 = nArray[14];
        int n23 = nArray[15];
        int n24 = nArray2[0];
        int n25 = nArray2[1];
        int n26 = nArray2[2];
        int n27 = nArray2[3];
        int n28 = nArray2[4];
        int n29 = nArray2[5];
        int n30 = nArray2[6];
        int n31 = nArray2[7];
        int n32 = nArray2[8];
        int n33 = nArray2[9];
        int n34 = nArray2[10];
        int n35 = nArray2[11];
        int n36 = nArray2[12];
        int n37 = nArray2[13];
        int n38 = nArray2[14];
        int n39 = nArray2[15];
        n25 = n9 + 0x1FFFFFFE - n25;
        n13 = n13 + 0x1FFFFFFE - n29;
        n33 = n17 + 0x1FFFFFFE - n33;
        n37 = n21 + 0x1FFFFFFE - n37;
        n10 = n10 + 0x1FFFFFFE - n26 + (n25 >>> 28);
        n14 = n14 + 0x1FFFFFFE - n30 + (n13 >>> 28);
        n34 = n18 + 0x1FFFFFFE - n34 + (n33 >>> 28);
        n38 = n22 + 0x1FFFFFFE - n38 + (n37 >>> 28);
        n11 = n11 + 0x1FFFFFFE - n27 + (n10 >>> 28);
        n31 = n15 + 0x1FFFFFFE - n31 + (n14 >>> 28);
        n19 = n19 + 0x1FFFFFFE - n35 + (n34 >>> 28);
        n39 = n23 + 0x1FFFFFFE - n39 + (n38 >>> 28);
        n23 = n39 >>> 28;
        n8 = n8 + 0x1FFFFFFE - n24 + n23;
        n12 = n12 + 0x1FFFFFFE - n28 + (n11 >>> 28);
        n32 = n16 + 0x1FFFFFFC - n32 + n23 + (n31 >>> 28);
        n20 = n20 + 0x1FFFFFFE - n36 + (n19 >>> 28);
        nArray3[0] = n8 & 0xFFFFFFF;
        nArray3[1] = (n25 & 0xFFFFFFF) + (n8 >>> 28);
        nArray3[2] = n10 & 0xFFFFFFF;
        nArray3[3] = n11 & 0xFFFFFFF;
        nArray3[4] = n12 & 0xFFFFFFF;
        nArray3[5] = (n13 & 0xFFFFFFF) + (n12 >>> 28);
        nArray3[6] = n14 & 0xFFFFFFF;
        nArray3[7] = n31 & 0xFFFFFFF;
        nArray3[8] = n32 & 0xFFFFFFF;
        nArray3[9] = (n33 & 0xFFFFFFF) + (n32 >>> 28);
        nArray3[10] = n34 & 0xFFFFFFF;
        nArray3[11] = n19 & 0xFFFFFFF;
        nArray3[12] = n20 & 0xFFFFFFF;
        nArray3[13] = (n37 & 0xFFFFFFF) + (n20 >>> 28);
        nArray3[14] = n38 & 0xFFFFFFF;
        nArray3[15] = n39 & 0xFFFFFFF;
    }

    public static void K(int[] nArray) {
        int[] nArray2 = d.g();
        nArray2[0] = 1;
        d.J(nArray, nArray2, nArray);
    }

    public static void L(int[] nArray) {
        for (int i8 = 0; i8 < 16; ++i8) {
            nArray[i8] = 0;
        }
    }

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        for (int i8 = 0; i8 < 16; ++i8) {
            nArray3[i8] = nArray[i8] + nArray2[i8];
        }
    }

    public static void b(int[] nArray) {
        nArray[0] = nArray[0] + 1;
    }

    public static void c(int[] nArray) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        int n18 = nArray[10];
        int n19 = nArray[11];
        int n20 = nArray[12];
        int n21 = nArray[13];
        int n22 = nArray[14];
        int n23 = nArray[15];
        n11 += (n10 += (n9 += n8 >>> 28) >>> 28) >>> 28;
        n15 += (n14 += (n13 += n12 >>> 28) >>> 28) >>> 28;
        n19 += (n18 += (n17 += n16 >>> 28) >>> 28) >>> 28;
        int n24 = (n23 += (n22 += (n21 += n20 >>> 28) >>> 28) >>> 28) >>> 28;
        n8 = (n8 & 0xFFFFFFF) + n24;
        n12 = (n12 & 0xFFFFFFF) + (n11 >>> 28);
        n16 = (n16 & 0xFFFFFFF) + n24 + (n15 >>> 28);
        n20 = (n20 & 0xFFFFFFF) + (n19 >>> 28);
        nArray[0] = n8 & 0xFFFFFFF;
        nArray[1] = (n9 & 0xFFFFFFF) + (n8 >>> 28);
        nArray[2] = n10 & 0xFFFFFFF;
        nArray[3] = n11 & 0xFFFFFFF;
        nArray[4] = n12 & 0xFFFFFFF;
        nArray[5] = (n13 & 0xFFFFFFF) + (n12 >>> 28);
        nArray[6] = n14 & 0xFFFFFFF;
        nArray[7] = n15 & 0xFFFFFFF;
        nArray[8] = n16 & 0xFFFFFFF;
        nArray[9] = (n17 & 0xFFFFFFF) + (n16 >>> 28);
        nArray[10] = n18 & 0xFFFFFFF;
        nArray[11] = n19 & 0xFFFFFFF;
        nArray[12] = n20 & 0xFFFFFFF;
        nArray[13] = (n21 & 0xFFFFFFF) + (n20 >>> 28);
        nArray[14] = n22 & 0xFFFFFFF;
        nArray[15] = n23 & 0xFFFFFFF;
    }

    public static void d(int n8, int[] nArray, int n9, int[] nArray2, int n10) {
        for (int i8 = 0; i8 < 16; ++i8) {
            int n11 = n10 + i8;
            int n12 = nArray2[n11];
            nArray2[n11] = n12 ^ (nArray[n9 + i8] ^ n12) & n8;
        }
    }

    public static void e(int n8, int[] nArray) {
        int[] nArray2 = d.g();
        d.J(nArray2, nArray, nArray2);
        d.d(-n8, nArray2, 0, nArray, 0);
    }

    public static void f(int[] nArray, int n8, int[] nArray2, int n9) {
        for (int i8 = 0; i8 < 16; ++i8) {
            nArray2[n9 + i8] = nArray[n8 + i8];
        }
    }

    public static int[] g() {
        return new int[16];
    }

    public static int[] h(int n8) {
        return new int[n8 * 16];
    }

    public static void i(int n8, int[] nArray, int[] nArray2) {
        for (int i8 = 0; i8 < 16; ++i8) {
            int n9 = nArray[i8];
            int n10 = nArray2[i8];
            int n11 = (n9 ^ n10) & 0 - n8;
            nArray[i8] = n9 ^ n11;
            nArray2[i8] = n10 ^ n11;
        }
    }

    public static void j(byte[] byArray, int n8, int[] nArray) {
        d.o(byArray, n8, nArray, 0);
        d.o(byArray, n8 + 7, nArray, 2);
        d.o(byArray, n8 + 14, nArray, 4);
        d.o(byArray, n8 + 21, nArray, 6);
        d.o(byArray, n8 + 28, nArray, 8);
        d.o(byArray, n8 + 35, nArray, 10);
        d.o(byArray, n8 + 42, nArray, 12);
        d.o(byArray, n8 + 49, nArray, 14);
    }

    public static void k(int[] nArray, int n8, int[] nArray2) {
        d.l(nArray, n8, nArray2, 0);
        d.l(nArray, n8 + 7, nArray2, 8);
    }

    private static void l(int[] nArray, int n8, int[] nArray2, int n9) {
        int n10 = nArray[n8];
        int n11 = nArray[n8 + 1];
        int n12 = nArray[n8 + 2];
        int n13 = nArray[n8 + 3];
        int n14 = nArray[n8 + 4];
        int n15 = nArray[n8 + 5];
        n8 = nArray[n8 + 6];
        nArray2[n9] = n10 & 0xFFFFFFF;
        nArray2[n9 + 1] = (n10 >>> 28 | n11 << 4) & 0xFFFFFFF;
        nArray2[n9 + 2] = (n11 >>> 24 | n12 << 8) & 0xFFFFFFF;
        nArray2[n9 + 3] = (n12 >>> 20 | n13 << 12) & 0xFFFFFFF;
        nArray2[n9 + 4] = (n13 >>> 16 | n14 << 16) & 0xFFFFFFF;
        nArray2[n9 + 5] = (n14 >>> 12 | n15 << 20) & 0xFFFFFFF;
        nArray2[n9 + 6] = 0xFFFFFFF & (n15 >>> 8 | n8 << 24);
        nArray2[n9 + 7] = n8 >>> 4;
    }

    private static int m(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        return (byArray[n8 + 2] & 0xFF) << 16 | (by & 0xFF | (by2 & 0xFF) << 8);
    }

    private static int n(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private static void o(byte[] byArray, int n8, int[] nArray, int n9) {
        int n10 = d.n(byArray, n8);
        n8 = d.m(byArray, n8 + 4);
        nArray[n9] = 0xFFFFFFF & n10;
        nArray[n9 + 1] = n8 << 4 | n10 >>> 28;
    }

    public static void p(int[] nArray, byte[] byArray, int n8) {
        d.u(nArray, 0, byArray, n8);
        d.u(nArray, 2, byArray, n8 + 7);
        d.u(nArray, 4, byArray, n8 + 14);
        d.u(nArray, 6, byArray, n8 + 21);
        d.u(nArray, 8, byArray, n8 + 28);
        d.u(nArray, 10, byArray, n8 + 35);
        d.u(nArray, 12, byArray, n8 + 42);
        d.u(nArray, 14, byArray, n8 + 49);
    }

    public static void q(int[] nArray, int[] nArray2, int n8) {
        d.r(nArray, 0, nArray2, n8);
        d.r(nArray, 8, nArray2, n8 + 7);
    }

    private static void r(int[] nArray, int n8, int[] nArray2, int n9) {
        int n10 = nArray[n8];
        int n11 = nArray[n8 + 1];
        int n12 = nArray[n8 + 2];
        int n13 = nArray[n8 + 3];
        int n14 = nArray[n8 + 4];
        int n15 = nArray[n8 + 5];
        int n16 = nArray[n8 + 6];
        n8 = nArray[n8 + 7];
        nArray2[n9] = n11 << 28 | n10;
        nArray2[n9 + 1] = n11 >>> 4 | n12 << 24;
        nArray2[n9 + 2] = n12 >>> 8 | n13 << 20;
        nArray2[n9 + 3] = n13 >>> 12 | n14 << 16;
        nArray2[n9 + 4] = n14 >>> 16 | n15 << 12;
        nArray2[n9 + 5] = n15 >>> 20 | n16 << 8;
        nArray2[n9 + 6] = n8 << 4 | n16 >>> 24;
    }

    private static void s(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
    }

    private static void t(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    private static void u(int[] nArray, int n8, byte[] byArray, int n9) {
        int n10 = nArray[n8];
        n8 = nArray[n8 + 1];
        d.t(n8 << 28 | n10, byArray, n9);
        d.s(n8 >>> 4, byArray, n9 + 4);
    }

    public static void v(int[] nArray, int[] nArray2) {
        int[] nArray3 = d.g();
        int[] nArray4 = new int[14];
        d.f(nArray, 0, nArray3, 0);
        d.C(nArray3);
        d.q(nArray3, nArray4, 0);
        c.j(a, nArray4, nArray4);
        d.k(nArray4, 0, nArray2);
    }

    public static void w(int[] nArray, int[] nArray2) {
        int[] nArray3 = d.g();
        int[] nArray4 = new int[14];
        d.f(nArray, 0, nArray3, 0);
        d.C(nArray3);
        d.q(nArray3, nArray4, 0);
        c.k(a, nArray4, nArray4);
        d.k(nArray4, 0, nArray2);
    }

    public static int x(int[] nArray) {
        int n8 = 0;
        for (int i8 = 0; i8 < 16; ++i8) {
            n8 |= nArray[i8];
        }
        return (n8 >>> 1 | n8 & 1) - 1 >> 31;
    }

    public static boolean y(int[] nArray) {
        return d.x(nArray) != 0;
    }

    public static void z(int[] nArray, int n8, int[] nArray2) {
        int n9 = nArray[0];
        int n10 = nArray[1];
        int n11 = nArray[2];
        int n12 = nArray[3];
        int n13 = nArray[4];
        int n14 = nArray[5];
        int n15 = nArray[6];
        int n16 = nArray[7];
        int n17 = nArray[8];
        int n18 = nArray[9];
        int n19 = nArray[10];
        int n20 = nArray[11];
        int n21 = nArray[12];
        int n22 = nArray[13];
        int n23 = nArray[14];
        int n24 = nArray[15];
        long l8 = n10;
        long l9 = n8;
        long l10 = l8 * l9;
        n8 = (int)l10;
        l8 = (long)n14 * l9;
        n14 = (int)l8;
        long l11 = (long)n18 * l9;
        n18 = (int)l11;
        long l12 = (long)n22 * l9;
        n22 = (int)l12;
        l10 = (l10 >>> 28) + (long)n11 * l9;
        nArray2[2] = (int)l10 & 0xFFFFFFF;
        l8 = (l8 >>> 28) + (long)n15 * l9;
        nArray2[6] = (int)l8 & 0xFFFFFFF;
        long l13 = (l11 >>> 28) + (long)n19 * l9;
        nArray2[10] = (int)l13 & 0xFFFFFFF;
        l11 = (l12 >>> 28) + (long)n23 * l9;
        nArray2[14] = (int)l11 & 0xFFFFFFF;
        l10 = (l10 >>> 28) + (long)n12 * l9;
        nArray2[3] = (int)l10 & 0xFFFFFFF;
        l8 = (l8 >>> 28) + (long)n16 * l9;
        nArray2[7] = (int)l8 & 0xFFFFFFF;
        l12 = (l13 >>> 28) + (long)n20 * l9;
        nArray2[11] = (int)l12 & 0xFFFFFFF;
        l11 = (l11 >>> 28) + (long)n24 * l9;
        nArray2[15] = (int)l11 & 0xFFFFFFF;
        l10 = (l10 >>> 28) + (long)n13 * l9;
        nArray2[4] = (int)l10 & 0xFFFFFFF;
        l8 = (l8 >>> 28) + (l11 >>>= 28) + (long)n17 * l9;
        nArray2[8] = (int)l8 & 0xFFFFFFF;
        l12 = (l12 >>> 28) + (long)n21 * l9;
        nArray2[12] = (int)l12 & 0xFFFFFFF;
        l9 = l11 + (long)n9 * l9;
        nArray2[0] = (int)l9 & 0xFFFFFFF;
        nArray2[1] = (n8 & 0xFFFFFFF) + (int)(l9 >>> 28);
        nArray2[5] = (n14 & 0xFFFFFFF) + (int)(l10 >>> 28);
        nArray2[9] = (n18 & 0xFFFFFFF) + (int)(l8 >>> 28);
        nArray2[13] = (n22 & 0xFFFFFFF) + (int)(l12 >>> 28);
    }
}

