/*
 * Decompiled with CFR 0.152.
 */
package ax.m;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class j {
    public static final int A = 2;
    public static final int A0 = 1;
    public static final int A1 = 4;
    public static final int A2 = 13;
    public static final int A3 = 0;
    public static final int B = 3;
    public static final int B0 = 86;
    public static final int B1 = 5;
    public static final int[] B2;
    public static final int B3 = 1;
    public static final int C = 4;
    public static final int C0 = 116;
    public static final int C1 = 6;
    public static final int C2 = 0;
    public static final int C3 = 2;
    public static final int D = 5;
    public static final int D0 = 117;
    public static final int D1 = 7;
    public static final int D2 = 1;
    public static final int[] D3;
    public static final int[] E;
    public static final int E0 = 118;
    public static final int E1 = 8;
    public static final int E2 = 2;
    public static final int E3 = 0;
    public static final int[] F;
    public static final int F0 = 119;
    public static final int F1 = 9;
    public static final int F2 = 3;
    public static final int F3 = 1;
    public static final int G = 0;
    public static final int G0 = 120;
    public static final int G1 = 10;
    public static final int G2 = 4;
    public static final int G3 = 2;
    public static final int H = 1;
    public static final int H0 = 121;
    public static final int H1 = 11;
    public static final int H2 = 5;
    public static final int I = 2;
    public static final int I0 = 122;
    public static final int I1 = 12;
    public static final int I2 = 6;
    public static final int J = 3;
    public static final int J0 = 123;
    public static final int J1 = 13;
    public static final int J2 = 7;
    public static final int K = 4;
    public static final int K0 = 124;
    public static final int K1 = 14;
    public static final int K2 = 8;
    public static final int L = 5;
    public static final int L0 = 125;
    public static final int L1 = 15;
    public static final int L2 = 9;
    public static final int M = 6;
    public static final int M0 = 126;
    public static final int M1 = 16;
    public static final int M2 = 10;
    public static final int N = 7;
    public static final int[] N0;
    public static final int N1 = 17;
    public static final int N2 = 11;
    public static final int[] O;
    public static final int O0 = 0;
    public static final int O1 = 18;
    public static final int O2 = 12;
    public static final int[] P;
    public static final int[] P0;
    public static final int P1 = 19;
    public static final int P2 = 13;
    public static final int Q = 1;
    public static final int Q0 = 0;
    public static final int Q1 = 20;
    public static final int Q2 = 14;
    public static final int R = 2;
    public static final int R0 = 1;
    public static final int R1 = 21;
    public static final int R2 = 15;
    public static final int S = 3;
    public static final int S0 = 2;
    public static final int S1 = 22;
    public static final int[] S2;
    public static final int[] T;
    public static final int T0 = 3;
    public static final int[] T1;
    public static final int T2 = 0;
    public static final int U = 0;
    public static final int[] U0;
    public static final int U1 = 1;
    public static final int U2 = 2;
    public static final int V = 1;
    public static final int V0 = 0;
    public static final int V1 = 5;
    public static final int V2 = 3;
    public static final int W = 2;
    public static final int W0 = 1;
    public static final int W1 = 7;
    public static final int W2 = 4;
    public static final int X = 3;
    public static final int X0 = 2;
    public static final int X1 = 8;
    public static final int X2 = 5;
    public static final int[] Y;
    public static final int Y0 = 3;
    public static final int[] Y1;
    public static final int Y2 = 6;
    public static final int Z = 0;
    public static final int[] Z0;
    public static final int Z1 = 0;
    public static final int Z2 = 7;
    public static final int[] a;
    public static final int a0 = 1;
    public static final int[] a1;
    public static final int a2 = 2;
    public static final int a3 = 8;
    public static final int b = 0;
    public static final int b0 = 2;
    public static final int b1 = 0;
    public static final int[] b2;
    public static final int b3 = 9;
    public static final int c = 1;
    public static final int c0 = 3;
    public static final int c1 = 1;
    public static final int[] c2;
    public static final int c3 = 10;
    public static final int d = 2;
    public static final int d0 = 4;
    public static final int d1 = 2;
    public static final int d2 = 0;
    public static final int d3 = 11;
    public static final int e = 3;
    public static final int e0 = 5;
    public static final int e1 = 3;
    public static final int e2 = 1;
    public static final int e3 = 12;
    public static final int f = 7;
    public static final int f0 = 6;
    public static final int f1 = 4;
    public static final int[] f2;
    public static final int f3 = 13;
    public static final int g = 9;
    public static final int[] g0;
    public static final int g1 = 5;
    public static final int[] g2;
    public static final int g3 = 14;
    public static final int h = 10;
    public static final int h0 = 1;
    public static final int h1 = 6;
    public static final int h2 = 0;
    public static final int h3 = 15;
    public static final int i = 12;
    public static final int i0 = 2;
    public static final int i1 = 7;
    public static final int i2 = 1;
    public static final int i3 = 16;
    public static final int j = 13;
    public static final int j0 = 3;
    public static final int j1 = 8;
    public static final int j2 = 2;
    public static final int j3 = 17;
    public static final int k = 14;
    public static final int k0 = 4;
    public static final int[] k1;
    public static final int k2 = 3;
    public static final int k3 = 18;
    public static final int l = 15;
    public static final int l0 = 5;
    public static final int[] l1;
    public static final int l2 = 4;
    public static final int l3 = 19;
    public static final int m = 17;
    public static final int m0 = 6;
    public static final int m1 = 0;
    public static final int[] m2;
    public static final int m3 = 20;
    public static final int n = 20;
    public static final int n0 = 7;
    public static final int n1 = 1;
    public static final int n2 = 0;
    public static final int n3 = 21;
    public static final int o = 22;
    public static final int o0 = 8;
    public static final int[] o1;
    public static final int o2 = 1;
    public static final int o3 = 22;
    public static final int p = 25;
    public static final int p0 = 9;
    public static final int p1 = 0;
    public static final int p2 = 2;
    public static final int p3 = 23;
    public static final int q = 26;
    public static final int q0 = 10;
    public static final int q1 = 1;
    public static final int q2 = 3;
    public static final int q3 = 24;
    public static final int r = 27;
    public static final int r0 = 11;
    public static final int r1 = 2;
    public static final int r2 = 4;
    public static final int r3 = 25;
    public static final int s = 28;
    public static final int s0 = 12;
    public static final int s1 = 3;
    public static final int s2 = 5;
    public static final int s3 = 26;
    public static final int[] t;
    public static final int t0 = 13;
    public static final int t1 = 4;
    public static final int t2 = 6;
    public static final int t3 = 27;
    public static final int u = 0;
    public static final int u0 = 14;
    public static final int u1 = 5;
    public static final int u2 = 7;
    public static final int u3 = 28;
    public static final int[] v;
    public static final int v0 = 15;
    public static final int[] v1;
    public static final int v2 = 8;
    public static final int v3 = 29;
    public static final int w = 0;
    public static final int w0 = 18;
    public static final int w1 = 0;
    public static final int w2 = 9;
    public static final int[] w3;
    public static final int[] x;
    public static final int x0 = 19;
    public static final int x1 = 1;
    public static final int x2 = 10;
    public static final int x3 = 0;
    public static final int[] y;
    public static final int[] y0;
    public static final int y1 = 2;
    public static final int y2 = 11;
    public static final int y3 = 4;
    public static final int z = 0;
    public static final int z0 = 0;
    public static final int z1 = 3;
    public static final int z2 = 12;
    public static final int[] z3;

    static {
        a = new int[]{2130968663, 2130968670, 2130968671, 2130968948, 2130968949, 2130968950, 2130968951, 2130968952, 2130968953, 2130968996, 2130969027, 2130969028, 2130969066, 2130969219, 2130969227, 2130969236, 2130969237, 2130969244, 2130969268, 2130969297, 2130969435, 2130969585, 2130969649, 2130969669, 2130969670, 2130969848, 2130969853, 2130970021, 2130970036};
        t = new int[]{16842931};
        v = new int[]{16843071};
        x = new int[0];
        y = new int[]{2130968663, 2130968670, 2130968837, 2130969219, 2130969853, 2130970036};
        E = new int[]{2130969101, 2130969276};
        F = new int[]{16842994, 2130968747, 2130968750, 2130969423, 2130969424, 2130969581, 2130969767, 2130969787};
        O = new int[0];
        P = new int[]{0x1010119, 2130969814, 2130970018, 2130970019};
        T = new int[]{16843074, 2130970008, 2130970009, 2130970010};
        Y = new int[]{16842804, 16843117, 16843118, 16843119, 0x1010170, 16843666, 16843667};
        g0 = new int[]{16842804, 2130968654, 2130968655, 2130968656, 2130968657, 2130968658, 2130969044, 2130969045, 2130969046, 2130969047, 2130969049, 2130969050, 2130969051, 2130969052, 2130969073, 2130969154, 2130969193, 2130969202, 2130969330, 2130969416, 2130969907, 2130969978};
        y0 = ax.m.j.$d2j$hex$9342a283$decode_I("57000101ae0001010200047f0300047f0400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f1000047f1100047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2800047f2e00047f2f00047f3000047f3100047f4c00047f8f00047fa300047fa400047fa500047fa600047fa700047fb100047fb200047fcf00047fda00047f1601047f1701047f1801047f1c01047f1d01047f1e01047f1f01047f3901047f3b01047f5101047f8401047fba01047fbf01047fc001047fc601047fcb01047fe101047fe201047fe601047fe701047fe901047f9402047fab02047f4b03047f4c03047f4d03047f4e03047f5103047f5203047f5303047f5403047f5503047f5603047f5703047f5803047f5903047f1304047f1404047f1504047f3004047f3204047f4e04047f5004047f5104047f5204047f7904047f7e04047f8004047f8104047fc604047fc704047f0d05047f5605047f5805047f5905047f5a05047f5c05047f5d05047f5e05047f5f05047f6e05047f6f05047fb705047fb805047fba05047fbb05047ff205047f0806047f0906047f0a06047f0b06047f0c06047f0d06047f0e06047f0f06047f1006047f1106047f");
        N0 = new int[]{2130968630};
        P0 = new int[]{0x1010108, 2130968780, 2130968781, 2130968782};
        U0 = new int[]{0x1010107, 2130968744, 2130968755, 2130968756};
        Z0 = new int[]{2130968645, 2130968646, 2130968694, 2130968853, 2130969048, 2130969211, 2130969797, 2130969989};
        a1 = new int[]{16842927, 16842948, 16843046, 16843047, 16843048, 2130969028, 2130969033, 2130969512, 2130969761};
        k1 = new int[]{16842931, 16842996, 16842997, 0x1010181};
        l1 = new int[]{16843436, 16843437};
        o1 = new int[]{0x101000E, 0x10100D0, 16843156, 16843230, 16843231, 0x10101E0};
        v1 = new int[]{0x1010002, 0x101000E, 0x10100D0, 0x1010106, 16843156, 16843230, 16843231, 0x10101E1, 16843234, 16843235, 16843236, 16843237, 16843375, 2130968591, 2130968611, 2130968613, 2130968632, 2130968947, 2130969252, 2130969253, 2130969594, 2130969759, 2130970045};
        T1 = new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 0x1010130, 0x1010131, 2130969665, 2130969841};
        Y1 = new int[]{16843126, 16843465, 2130969607};
        b2 = new int[]{2130969825};
        c2 = new int[]{2130969609, 2130969616};
        f2 = new int[]{16842804, 16842970, 0x101011F, 16843087, 0x1010150, 0x1010220, 16843364, 2130968636, 2130968637, 2130968653, 2130968662, 2130968672, 2130968830, 2130968920, 2130969007, 2130969213, 2130969217, 2130969226, 2130969254, 2130969332, 2130969674, 2130969675, 2130969718, 2130969719, 2130969720, 2130969847, 2130969859, 2130970090, 2130970104};
        g2 = new int[]{16842930, 16843126, 16843131, 16843362, 2130969649};
        m2 = new int[]{16843044, 16843045, 16843074, 2130969766, 2130969807, 2130969865, 2130969866, 2130969870, 2130970000, 2130970001, 2130970002, 2130970051, 2130970073, 2130970074};
        B2 = new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 0x1010161, 16843106, 16843107, 16843108, 16843692, 16844165, 2130969193, 2130969202, 2130969907, 2130969978};
        S2 = new int[]{16842927, 0x1010140, 2130968745, 2130968838, 2130968839, 2130968948, 2130968949, 2130968950, 2130968951, 2130968952, 2130968953, 2130969435, 2130969437, 2130969503, 2130969513, 2130969582, 2130969583, 2130969649, 2130969848, 2130969851, 2130969852, 2130970021, 2130970025, 2130970026, 2130970027, 2130970028, 2130970029, 2130970030, 2130970033, 2130970034};
        w3 = new int[]{0x1010000, 16842970, 2130969611, 2130969614, 2130969988};
        z3 = new int[]{16842964, 2130968672, 2130968673};
        D3 = new int[]{0x10100D0, 16842994, 16842995};
    }

    private static long[] $d2j$hex$9342a283$decode_J(String src) {
        byte[] d8 = ax.m.j.$d2j$hex$9342a283$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$9342a283$decode_I(String src) {
        byte[] d8 = ax.m.j.$d2j$hex$9342a283$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$9342a283$decode_S(String src) {
        byte[] d8 = ax.m.j.$d2j$hex$9342a283$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$9342a283$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

