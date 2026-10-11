/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.CRC32;
import com.jcraft.jsch.jzlib.GZIPHeader;
import com.jcraft.jsch.jzlib.StaticTree;
import com.jcraft.jsch.jzlib.Tree;
import com.jcraft.jsch.jzlib.ZStream;

final class Deflate
implements Cloneable {
    private static final Config[] i1;
    private static final String[] j1;
    int A0;
    int B0;
    int C0;
    int D0;
    int E0;
    int F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    short[] L0;
    short[] M0;
    short[] N0;
    Tree O0 = new Tree();
    Tree P0 = new Tree();
    Tree Q0 = new Tree();
    short[] R0 = new short[16];
    short[] S0 = new short[16];
    int[] T0 = new int[573];
    int U0;
    int V0;
    byte[] W0 = new byte[573];
    byte[] X0;
    int Y0;
    int Z0;
    int a1;
    int b1;
    int c0;
    int c1;
    byte[] d0;
    int d1;
    int e0;
    int e1;
    int f0;
    short f1;
    int g0;
    int g1;
    int h0 = 1;
    GZIPHeader h1 = null;
    byte i0;
    byte j0;
    int k0;
    int l0;
    int m0;
    int n0;
    byte[] o0;
    int p0;
    ZStream q;
    short[] q0;
    short[] r0;
    int s0;
    int t0;
    int u0;
    int v0;
    int w0;
    int x0;
    int y0;
    int z0;

    static {
        Config[] configArray = new Config[10];
        i1 = configArray;
        configArray[0] = new Config(0, 0, 0, 0, 0);
        configArray[1] = new Config(4, 4, 8, 4, 1);
        configArray[2] = new Config(4, 5, 16, 8, 1);
        configArray[3] = new Config(4, 6, 32, 32, 1);
        configArray[4] = new Config(4, 4, 16, 16, 2);
        configArray[5] = new Config(8, 16, 32, 32, 2);
        configArray[6] = new Config(8, 16, 128, 128, 2);
        configArray[7] = new Config(8, 32, 128, 256, 2);
        configArray[8] = new Config(32, 128, 258, 1024, 2);
        configArray[9] = new Config(32, 258, 258, 4096, 2);
        j1 = new String[]{"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    }

    Deflate(ZStream zStream) {
        this.q = zStream;
        this.L0 = new short[1146];
        this.M0 = new short[122];
        this.N0 = new short[78];
    }

    static boolean S(short[] sArray, int n8, int n9, byte[] byArray) {
        short s8 = sArray[n8 * 2];
        short s9 = sArray[n9 * 2];
        return s8 < s9 || s8 == s9 && byArray[n8] <= byArray[n9];
        {
        }
    }

    private int r(int n8, int n9, int n10, int n11, int n12) {
        ZStream zStream = this.q;
        zStream.i = null;
        int n13 = n8;
        if (n8 == -1) {
            n13 = 6;
        }
        if (n10 < 0) {
            n10 = -n10;
            n8 = 0;
        } else if (n10 > 15) {
            n10 -= 16;
            zStream.m = new CRC32();
            n8 = 2;
        } else {
            n8 = 1;
        }
        if (n11 >= 1 && n11 <= 9 && n9 == 8 && n10 >= 9 && n10 <= 15 && n13 >= 0 && n13 <= 9 && n12 >= 0 && n12 <= 2) {
            this.q.j = this;
            this.h0 = n8;
            this.m0 = n10;
            this.l0 = n8 = 1 << n10;
            this.n0 = n8 - 1;
            this.u0 = n10 = n11 + 7;
            this.t0 = n10 = 1 << n10;
            this.v0 = n10 - 1;
            this.w0 = (n11 + 9) / 3;
            this.o0 = new byte[n8 * 2];
            this.q0 = new short[n8];
            this.r0 = new short[n10];
            this.Y0 = n8 = 1 << n11 + 6;
            this.d0 = new byte[n8 * 3];
            this.e0 = n8 * 3;
            this.a1 = n8;
            this.X0 = new byte[n8];
            this.H0 = n13;
            this.I0 = n12;
            this.j0 = (byte)n9;
            return this.s();
        }
        return -2;
    }

    private byte[] x(byte[] byArray) {
        int n8 = byArray.length;
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, 0, byArray2, 0, n8);
        return byArray2;
    }

    private int[] y(int[] nArray) {
        int n8 = nArray.length;
        int[] nArray2 = new int[n8];
        System.arraycopy(nArray, 0, nArray2, 0, n8);
        return nArray2;
    }

    private short[] z(short[] sArray) {
        int n8 = sArray.length;
        short[] sArray2 = new short[n8];
        System.arraycopy(sArray, 0, sArray2, 0, n8);
        return sArray2;
    }

    void B() {
        int n8;
        do {
            Object object;
            int n9;
            int n10;
            int n11;
            if ((n11 = (n10 = this.p0) - (n9 = this.D0) - (n8 = this.B0)) == 0 && n8 == 0 && n9 == 0) {
                n9 = this.l0;
            } else if (n11 == -1) {
                n9 = n11 - 1;
            } else {
                n10 = this.l0;
                n9 = n11;
                if (n8 >= n10 + n10 - 262) {
                    short s8;
                    int n12;
                    object = this.o0;
                    System.arraycopy(object, n10, object, 0, n10);
                    n9 = this.C0;
                    n8 = this.l0;
                    this.C0 = n9 - n8;
                    this.B0 -= n8;
                    this.x0 -= n8;
                    n8 = n10 = this.t0;
                    do {
                        s8 = (n12 = (object = (Object)this.r0)[--n10] & 0xFFFF) >= (n9 = this.l0) ? (short)(n12 - n9) : (short)0;
                        object[n10] = s8;
                        n8 = n12 = n8 - 1;
                    } while (n12 != 0);
                    n10 = n9;
                    n8 = n9;
                    n9 = n10;
                    do {
                        s8 = (n10 = (object = (Object)this.q0)[--n8] & 0xFFFF) >= (n12 = this.l0) ? (short)(n10 - n12) : (short)0;
                        object[n8] = s8;
                        n9 = n10 = n9 - 1;
                    } while (n10 != 0);
                    n9 = n11 + n12;
                }
            }
            object = this.q;
            if (((ZStream)object).c == 0) break;
            n9 = ((ZStream)object).c(this.o0, this.B0 + this.D0, n9);
            this.D0 = n8 = this.D0 + n9;
            if (n8 < 3) continue;
            object = this.o0;
            n11 = this.B0;
            this.s0 = n9 = object[n11] & 0xFF;
            n10 = this.w0;
            this.s0 = (object[n11 + 1] & 0xFF ^ n9 << n10) & this.v0;
        } while (n8 < 262 && this.q.c != 0);
    }

    void C(boolean bl) {
        int n8 = this.x0;
        int n9 = n8 >= 0 ? n8 : -1;
        this.c(n9, this.B0 - n8, bl);
        this.x0 = this.B0;
        this.q.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    GZIPHeader D() {
        synchronized (this) {
            try {
                GZIPHeader gZIPHeader;
                if (this.h1 != null) return this.h1;
                this.h1 = gZIPHeader = new GZIPHeader();
                return this.h1;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    void E() {
        int n8;
        for (n8 = 0; n8 < 286; ++n8) {
            this.L0[n8 * 2] = 0;
        }
        for (n8 = 0; n8 < 30; ++n8) {
            this.M0[n8 * 2] = 0;
        }
        for (n8 = 0; n8 < 19; ++n8) {
            this.N0[n8 * 2] = 0;
        }
        this.L0[512] = 1;
        this.c1 = 0;
        this.b1 = 0;
        this.d1 = 0;
        this.Z0 = 0;
    }

    void F() {
        this.p0 = this.l0 * 2;
        this.r0[this.t0 - 1] = 0;
        for (int i8 = 0; i8 < this.t0 - 1; ++i8) {
            this.r0[i8] = 0;
        }
        Config config = i1[this.H0];
        this.G0 = config.b;
        this.J0 = config.a;
        this.K0 = config.c;
        this.F0 = config.d;
        this.B0 = 0;
        this.x0 = 0;
        this.D0 = 0;
        this.E0 = 2;
        this.y0 = 2;
        this.A0 = 0;
        this.s0 = 0;
    }

    int G(int n8) {
        int n9;
        block10: {
            int n10 = this.F0;
            int n11 = this.B0;
            int n12 = this.E0;
            n9 = this.l0;
            int n13 = n11 > n9 - 262 ? n11 - (n9 - 262) : 0;
            int n14 = this.K0;
            int n15 = this.n0;
            int n16 = n11 + 258;
            byte[] byArray = this.o0;
            n9 = n11 + n12;
            byte by = byArray[n9 - 1];
            int n17 = byArray[n9];
            n9 = n10;
            if (n12 >= this.J0) {
                n9 = n10 >> 2;
            }
            int n18 = this.D0;
            n10 = n11;
            if (n14 > n18) {
                n14 = n18;
            }
            n18 = n8;
            n8 = n11;
            int n19 = n9;
            n11 = n12;
            n12 = n17;
            while (true) {
                if ((byArray = this.o0)[n9 = n18 + n11] != n12 || byArray[n9 - 1] != by || byArray[n18] != byArray[n10] || byArray[n18 + 1] != byArray[n10 + 1]) {
                    n9 = n8;
                } else {
                    block9: {
                        n17 = n10 + 2;
                        n10 = n18 + 2;
                        while (true) {
                            byArray = this.o0;
                            int n20 = n17 + 1;
                            byte by2 = byArray[n20];
                            n9 = n8;
                            n8 = n20;
                            if (by2 != byArray[n10 + 1]) break block9;
                            n8 = n20 = n17 + 2;
                            if (byArray[n20] != byArray[n10 + 2]) break block9;
                            n8 = n20 = n17 + 3;
                            if (byArray[n20] != byArray[n10 + 3]) break block9;
                            n8 = n20 = n17 + 4;
                            if (byArray[n20] != byArray[n10 + 4]) break block9;
                            n8 = n20 = n17 + 5;
                            if (byArray[n20] != byArray[n10 + 5]) break block9;
                            n8 = n20 = n17 + 6;
                            if (byArray[n20] != byArray[n10 + 6]) break block9;
                            n8 = n20 = n17 + 7;
                            if (byArray[n20] != byArray[n10 + 7]) break block9;
                            n8 = byArray[n17 += 8];
                            if (n8 != byArray[n10 += 8] || n17 >= n16) break;
                            n8 = n9;
                        }
                        n8 = n17;
                    }
                    if ((n8 = 258 - n16 - n8) > n11) {
                        this.C0 = n18;
                        if (n8 >= n14) break block10;
                        n11 = n9 + n8;
                        by = byArray[n11 - 1];
                        n12 = byArray[n11];
                        n10 = n9;
                        n11 = n8;
                    } else {
                        n10 = n9;
                    }
                }
                n18 = this.q0[n18 & n15] & 0xFFFF;
                if (n18 <= n13 || --n19 == 0) break;
                n8 = n9;
            }
            n8 = n11;
        }
        n9 = this.D0;
        if (n8 <= n9) {
            return n8;
        }
        return n9;
    }

    void H(short[] sArray, int n8) {
        int n9;
        int n10 = this.T0[n8];
        int n11 = n8 << 1;
        int n12 = n8;
        n8 = n11;
        while (n8 <= (n9 = this.U0)) {
            int[] nArray;
            n11 = n8;
            if (n8 < n9) {
                nArray = this.T0;
                n9 = n8 + 1;
                n11 = n8;
                if (Deflate.S(sArray, nArray[n9], nArray[n8], this.W0)) {
                    n11 = n9;
                }
            }
            if (Deflate.S(sArray, n10, this.T0[n11], this.W0)) break;
            nArray = this.T0;
            nArray[n12] = nArray[n11];
            n8 = n11 << 1;
            n12 = n11;
        }
        this.T0[n12] = n10;
    }

    final void I(int n8) {
        this.J((byte)(n8 >> 8));
        this.J((byte)n8);
    }

    final void J(byte by) {
        byte[] byArray = this.d0;
        int n8 = this.g0;
        this.g0 = n8 + 1;
        byArray[n8] = by;
    }

    final void K(byte[] byArray, int n8, int n9) {
        System.arraycopy(byArray, n8, this.d0, this.g0, n9);
        this.g0 += n9;
    }

    final void L(int n8) {
        this.J((byte)n8);
        this.J((byte)(n8 >>> 8));
    }

    /*
     * Unable to fully structure code
     */
    void M(short[] var1_1, int var2_2) {
        var10_3 = var1_1[1];
        if (var10_3 == 0) {
            var3_4 = 138;
            var4_5 = 3;
        } else {
            var3_4 = 7;
            var4_5 = 4;
        }
        var5_6 = -1;
        var1_1[(var2_2 + 1) * 2 + 1] = -1;
        var9_7 = 0;
        var6_8 = 0;
        var7_9 = var4_5;
        var8_10 = var3_4;
        var3_4 = var10_3;
        while (var9_7 <= var2_2) {
            var10_3 = var1_1[++var9_7 * 2 + 1];
            var4_5 = var6_8 + 1;
            if (var4_5 < var8_10 && var3_4 == var10_3) {
                var6_8 = var8_10;
            } else {
                if (var4_5 < var7_9) {
                    var11_11 = this.N0;
                    var5_6 = var3_4 * 2;
                    var11_11[var5_6] = (short)(var11_11[var5_6] + (short)var4_5);
                } else if (var3_4 != 0) {
                    if (var3_4 != var5_6) {
                        var11_11 = this.N0;
                        var4_5 = var3_4 * 2;
                        var11_11[var4_5] = (short)(var11_11[var4_5] + 1);
                    }
                    var11_11 = this.N0;
                    var11_11[32] = (short)(var11_11[32] + 1);
                } else if (var4_5 <= 10) {
                    var11_11 = this.N0;
                    var11_11[34] = (short)(var11_11[34] + 1);
                } else {
                    var11_11 = this.N0;
                    var11_11[36] = (short)(var11_11[36] + 1);
                }
                if (var10_3 == 0) {
                    var5_6 = 138;
lbl42:
                    // 2 sources

                    while (true) {
                        var4_5 = 3;
lbl44:
                        // 2 sources

                        while (true) {
                            var8_10 = 0;
                            var6_8 = var5_6;
                            var7_9 = var4_5;
                            var5_6 = var3_4;
                            var4_5 = var8_10;
                            ** GOTO lbl57
                            break;
                        }
                        break;
                    }
                } else {
                    if (var3_4 == var10_3) {
                        var5_6 = 6;
                        ** continue;
                    }
                    var5_6 = 7;
                    var4_5 = 4;
                    ** continue;
                }
            }
lbl57:
            // 2 sources

            var3_4 = var10_3;
            var8_10 = var6_8;
            var6_8 = var4_5;
        }
    }

    void N(int n8, int n9, int n10) {
        this.O(n8 - 257, 5);
        int n11 = n9 - 1;
        this.O(n11, 5);
        this.O(n10 - 4, 4);
        for (n9 = 0; n9 < n10; ++n9) {
            this.O(this.N0[Tree.g[n9] * 2 + 1], 3);
        }
        this.Q(this.L0, n8 - 1);
        this.Q(this.M0, n11);
    }

    void O(int n8, int n9) {
        int n10 = this.g1;
        if (n10 > 16 - n9) {
            short s8;
            short s9 = this.f1;
            this.f1 = s8 = (short)((short)(n8 << n10 & 0xFFFF) | s9);
            this.L(s8);
            n10 = this.g1;
            this.f1 = (short)(n8 >>> 16 - n10);
            this.g1 = n10 + (n9 - 16);
            return;
        }
        short s10 = this.f1;
        this.f1 = (short)((short)(n8 << n10 & 0xFFFF) | s10);
        this.g1 = n10 + n9;
    }

    final void P(int n8, short[] sArray) {
        this.O(sArray[n8 *= 2] & 0xFFFF, sArray[n8 + 1] & 0xFFFF);
    }

    /*
     * Unable to fully structure code
     */
    void Q(short[] var1_1, int var2_2) {
        var10_3 = var1_1[1];
        if (var10_3 == 0) {
            var3_4 = 138;
            var5_5 = 3;
        } else {
            var3_4 = 7;
            var5_5 = 4;
        }
        var9_6 = 0;
        var4_7 = 0;
        var6_8 = -1;
        var7_9 = var5_5;
        var8_10 = var3_4;
        var3_4 = var10_3;
        while (var9_6 <= var2_2) {
            var10_3 = var1_1[++var9_6 * 2 + 1];
            var5_5 = var4_7 + 1;
            if (var5_5 < var8_10 && var3_4 == var10_3) {
                var4_7 = var5_5;
                var5_5 = var8_10;
            } else {
                if (var5_5 < var7_9) {
                    do {
                        this.P(var3_4, this.N0);
                        var5_5 = var4_7 = var5_5 - 1;
                    } while (var4_7 != 0);
                } else if (var3_4 != 0) {
                    if (var3_4 != var6_8) {
                        this.P(var3_4, this.N0);
                    } else {
                        var4_7 = var5_5;
                    }
                    this.P(16, this.N0);
                    this.O(var4_7 - 3, 2);
                } else if (var5_5 <= 10) {
                    this.P(17, this.N0);
                    this.O(var4_7 - 2, 3);
                } else {
                    this.P(18, this.N0);
                    this.O(var4_7 - 10, 7);
                }
                if (var10_3 == 0) {
                    var5_5 = 138;
lbl43:
                    // 2 sources

                    while (true) {
                        var4_7 = 3;
lbl45:
                        // 2 sources

                        while (true) {
                            var6_8 = 0;
                            var7_9 = var4_7;
                            var4_7 = var6_8;
                            var6_8 = var3_4;
                            ** GOTO lbl57
                            break;
                        }
                        break;
                    }
                } else {
                    if (var3_4 == var10_3) {
                        var5_5 = 6;
                        ** continue;
                    }
                    var5_5 = 7;
                    var4_7 = 4;
                    ** continue;
                }
            }
lbl57:
            // 2 sources

            var3_4 = var10_3;
            var8_10 = var5_5;
        }
    }

    void R() {
        int n8;
        int n9;
        int n10 = 0;
        int n11 = 0;
        for (n9 = 0; n9 < 7; ++n9) {
            n11 += this.L0[n9 * 2];
        }
        int n12 = 0;
        while (true) {
            n8 = n11;
            if (n9 >= 128) break;
            n12 += this.L0[n9 * 2];
        }
        for (int i8 = ++n9; i8 < 256; ++i8) {
            n8 += this.L0[i8 * 2];
        }
        n11 = n8 > n12 >>> 2 ? n10 : 1;
        this.i0 = (byte)n11;
    }

    void T() {
        Tree tree = this.O0;
        tree.a = this.L0;
        tree.c = StaticTree.h;
        tree = this.P0;
        tree.a = this.M0;
        tree.c = StaticTree.i;
        tree = this.Q0;
        tree.a = this.N0;
        tree.c = StaticTree.j;
        this.f1 = 0;
        this.g1 = 0;
        this.e1 = 8;
        this.E();
    }

    void b() {
        this.O(2, 3);
        short[] sArray = StaticTree.f;
        this.P(256, sArray);
        this.h();
        if (this.e1 + 11 - this.g1 < 9) {
            this.O(2, 3);
            this.P(256, sArray);
            this.h();
        }
        this.e1 = 7;
    }

    void c(int n8, int n9, boolean bl) {
        int n10;
        int n11;
        int n12;
        if (this.H0 > 0) {
            if (this.i0 == 2) {
                this.R();
            }
            this.O0.b(this);
            this.P0.b(this);
            int n13 = this.j();
            int n14 = this.b1 + 10 >>> 3;
            int n15 = this.c1 + 10 >>> 3;
            n12 = n13;
            n11 = n14;
            n10 = n15;
            if (n15 <= n14) {
                n11 = n15;
                n12 = n13;
                n10 = n15;
            }
        } else {
            n11 = n9 + 5;
            n12 = 0;
            n10 = n11;
        }
        if (n9 + 4 <= n11 && n8 != -1) {
            this.d(n8, n9, bl);
        } else if (n10 == n11) {
            this.O(bl + 2, 3);
            this.k(StaticTree.f, StaticTree.g);
        } else {
            this.O(bl + 4, 3);
            this.N(this.O0.b + 1, this.P0.b + 1, n12 + 1);
            this.k(this.L0, this.M0);
        }
        this.E();
        if (bl) {
            this.i();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Deflate deflate = (Deflate)super.clone();
        deflate.d0 = this.x(deflate.d0);
        deflate.X0 = this.x(deflate.X0);
        deflate.o0 = this.x(deflate.o0);
        deflate.q0 = this.z(deflate.q0);
        deflate.r0 = this.z(deflate.r0);
        deflate.L0 = this.z(deflate.L0);
        deflate.M0 = this.z(deflate.M0);
        deflate.N0 = this.z(deflate.N0);
        deflate.R0 = this.z(deflate.R0);
        deflate.S0 = this.z(deflate.S0);
        deflate.T0 = this.y(deflate.T0);
        deflate.W0 = this.x(deflate.W0);
        deflate.O0.a = deflate.L0;
        deflate.P0.a = deflate.M0;
        deflate.Q0.a = deflate.N0;
        GZIPHeader gZIPHeader = deflate.h1;
        if (gZIPHeader != null) {
            deflate.h1 = (GZIPHeader)gZIPHeader.clone();
        }
        return deflate;
    }

    void d(int n8, int n9, boolean bl) {
        this.O(bl ? 1 : 0, 3);
        this.l(n8, n9, true);
    }

    boolean f(int n8, int n9) {
        Object[] objectArray = this.d0;
        int n10 = this.a1;
        int n11 = this.Z0;
        objectArray[n11 * 2 + n10] = (byte)(n8 >>> 8);
        objectArray[n10 + n11 * 2 + 1] = (byte)n8;
        this.X0[n11] = (byte)n9;
        this.Z0 = n11 + 1;
        if (n8 == 0) {
            objectArray = this.L0;
            n8 = n9 * 2;
            objectArray[n8] = (short)(objectArray[n8] + 1);
        } else {
            ++this.d1;
            objectArray = this.L0;
            n9 = (Tree.i[n9] + 257) * 2;
            objectArray[n9] = (short)(objectArray[n9] + 1);
            objectArray = this.M0;
            n8 = Tree.c(n8 - 1) * 2;
            objectArray[n8] = (short)(objectArray[n8] + 1);
        }
        n8 = this.Z0;
        if ((n8 & 0x1FFF) == 0 && this.H0 > 2) {
            n9 = n8 * 8;
            n11 = this.B0;
            n10 = this.x0;
            for (n8 = 0; n8 < 30; ++n8) {
                n9 += this.M0[n8 * 2] * (Tree.e[n8] + 5);
            }
            if (this.d1 < this.Z0 / 2 && n9 >>> 3 < (n11 - n10) / 2) {
                return true;
            }
        }
        return this.Z0 == this.Y0 - 1;
    }

    void h() {
        int n8 = this.g1;
        if (n8 == 16) {
            this.L(this.f1);
            this.f1 = 0;
            this.g1 = 0;
            return;
        }
        if (n8 >= 8) {
            this.J((byte)this.f1);
            this.f1 = (short)(this.f1 >>> 8);
            this.g1 -= 8;
        }
    }

    void i() {
        int n8 = this.g1;
        if (n8 > 8) {
            this.L(this.f1);
        } else if (n8 > 0) {
            this.J((byte)this.f1);
        }
        this.f1 = 0;
        this.g1 = 0;
    }

    int j() {
        int n8;
        this.M(this.L0, this.O0.b);
        this.M(this.M0, this.P0.b);
        this.Q0.b(this);
        for (n8 = 18; n8 >= 3 && this.N0[Tree.g[n8] * 2 + 1] == 0; --n8) {
        }
        this.b1 += (n8 + 1) * 3 + 14;
        return n8;
    }

    void k(short[] sArray, short[] sArray2) {
        if (this.Z0 != 0) {
            int n8;
            int n9 = 0;
            do {
                byte[] byArray = this.d0;
                int n10 = this.a1;
                int n11 = n9 * 2;
                n8 = byArray[n10 + n11];
                n10 = byArray[n10 + n11 + 1] & 0xFF | n8 << 8 & 0xFF00;
                n11 = this.X0[n9] & 0xFF;
                n8 = n9 + 1;
                if (n10 == 0) {
                    this.P(n11, sArray);
                } else {
                    n9 = Tree.i[n11];
                    this.P(n9 + 257, sArray);
                    int n12 = Tree.d[n9];
                    if (n12 != 0) {
                        this.O(n11 - Tree.j[n9], n12);
                    }
                    n11 = n10 - 1;
                    n9 = Tree.c(n11);
                    this.P(n9, sArray2);
                    n10 = Tree.e[n9];
                    if (n10 != 0) {
                        this.O(n11 - Tree.k[n9], n10);
                    }
                }
                n9 = n8;
            } while (n8 < this.Z0);
        }
        this.P(256, sArray);
        this.e1 = sArray[513];
    }

    void l(int n8, int n9, boolean bl) {
        this.i();
        this.e1 = 8;
        if (bl) {
            this.L((short)n9);
            this.L((short)(~n9));
        }
        this.K(this.o0, n8, n9);
    }

    /*
     * Unable to fully structure code
     */
    int m(int var1_1) {
        if (var1_1 <= 4 && var1_1 >= 0) {
            var8_2 = this.q;
            if (!(var8_2.e == null || var8_2.a == null && var8_2.c != 0 || (var2_3 = this.c0) == 666 && var1_1 != 4)) {
                if (var8_2.g == 0) {
                    var8_2.i = Deflate.j1[7];
                    return -5;
                }
                var4_4 = this.k0;
                this.k0 = var1_1;
                if (var2_3 == 42) {
                    if (this.h0 == 2) {
                        this.D().b(this);
                        this.c0 = 113;
                        this.q.m.a();
                    } else {
                        var5_5 = this.m0;
                        var2_3 = var3_6 = (this.H0 - 1 & 255) >> 1;
                        if (var3_6 > 3) {
                            var2_3 = 3;
                        }
                        var2_3 = var3_6 = (var5_5 - 8 << 4) + 8 << 8 | var2_3 << 6;
                        if (this.B0 != 0) {
                            var2_3 = var3_6 | 32;
                        }
                        this.c0 = 113;
                        this.I(var2_3 + (31 - var2_3 % 31));
                        if (this.B0 != 0) {
                            var6_7 = this.q.m.getValue();
                            this.I((int)(var6_7 >>> 16));
                            this.I((int)(var6_7 & 65535L));
                        }
                        this.q.m.a();
                    }
                }
                if (this.g0 != 0) {
                    this.q.a();
                    if (this.q.g == 0) {
                        this.k0 = -1;
                        return 0;
                    }
                } else {
                    var8_2 = this.q;
                    if (var8_2.c == 0 && var1_1 <= var4_4 && var1_1 != 4) {
                        var8_2.i = Deflate.j1[7];
                        return -5;
                    }
                }
                if ((var2_3 = this.c0) == 666) {
                    var8_2 = this.q;
                    if (var8_2.c != 0) {
                        var8_2.i = Deflate.j1[7];
                        return -5;
                    }
                }
                if (this.q.c != 0 || this.D0 != 0 || var1_1 != 0 && var2_3 != 666) {
                    var2_3 = Deflate.i1[this.H0].e;
                    var2_3 = var2_3 != 0 ? (var2_3 != 1 ? (var2_3 != 2 ? -1 : this.v(var1_1)) : this.t(var1_1)) : this.w(var1_1);
                    if (var2_3 == 2 || var2_3 == 3) {
                        this.c0 = 666;
                    }
                    if (var2_3 != 0 && var2_3 != 2) {
                        if (var2_3 == 1) {
                            if (var1_1 == 1) {
                                this.b();
                            } else {
                                this.d(0, 0, false);
                                if (var1_1 == 3) {
                                    for (var2_3 = 0; var2_3 < this.t0; ++var2_3) {
                                        this.r0[var2_3] = 0;
                                    }
                                }
                            }
                            this.q.a();
                            if (this.q.g == 0) {
                                this.k0 = -1;
                                return 0;
                            } else {
                                ** GOTO lbl-1000
                            }
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 5 sources

                {
                    if (var1_1 != 4) {
                        return 0;
                    }
                    var1_1 = this.h0;
                    if (var1_1 <= 0) {
                        return 1;
                    }
                    if (var1_1 == 2) {
                        var6_7 = this.q.m.getValue();
                        this.J((byte)(var6_7 & 255L));
                        this.J((byte)(var6_7 >> 8 & 255L));
                        this.J((byte)(var6_7 >> 16 & 255L));
                        this.J((byte)(var6_7 >> 24 & 255L));
                        this.J((byte)(this.q.d & 255L));
                        this.J((byte)(this.q.d >> 8 & 255L));
                        this.J((byte)(this.q.d >> 16 & 255L));
                        this.J((byte)(255L & this.q.d >> 24));
                        this.D().c(var6_7);
                    } else {
                        var6_7 = this.q.m.getValue();
                        this.I((int)(var6_7 >>> 16));
                        this.I((int)(var6_7 & 65535L));
                    }
                    this.q.a();
                    var1_1 = this.h0;
                    if (var1_1 > 0) {
                        this.h0 = -var1_1;
                    }
                    if (this.g0 != 0) {
                        return 0;
                    }
                    return 1;
                }
                if (this.q.g == 0) {
                    this.k0 = -1;
                }
                return 0;
            }
            var8_2.i = Deflate.j1[4];
        }
        return -2;
    }

    int n() {
        int n8 = this.c0;
        if (n8 != 42 && n8 != 113 && n8 != 666) {
            return -2;
        }
        this.d0 = null;
        this.X0 = null;
        this.r0 = null;
        this.q0 = null;
        this.o0 = null;
        if (n8 == 113) {
            return -3;
        }
        return 0;
    }

    int o(int n8, int n9) {
        return this.r(n8, 8, n9, 8, 0);
    }

    int s() {
        ZStream zStream = this.q;
        zStream.h = 0L;
        zStream.d = 0L;
        zStream.i = null;
        zStream.l = 2;
        this.g0 = 0;
        this.f0 = 0;
        int n8 = this.h0;
        if (n8 < 0) {
            this.h0 = -n8;
        }
        n8 = this.h0 == 0 ? 113 : 42;
        this.c0 = n8;
        zStream.m.a();
        this.k0 = 0;
        this.T();
        this.F();
        return 0;
    }

    int t(int n8) {
        int n9 = 0;
        while (true) {
            short s8;
            Object[] objectArray;
            int n10;
            boolean bl;
            int n11;
            if (this.D0 < 262) {
                this.B();
                n11 = this.D0;
                if (n11 < 262 && n8 == 0) {
                    return 0;
                }
                if (n11 == 0) {
                    bl = n8 == 4;
                    this.C(bl);
                    if (this.q.g == 0) {
                        if (n8 == 4) {
                            return 2;
                        }
                        return 0;
                    }
                    if (n8 == 4) {
                        return 3;
                    }
                    return 1;
                }
            }
            if (this.D0 >= 3) {
                n11 = this.s0;
                n10 = this.w0;
                objectArray = this.o0;
                n9 = this.B0;
                this.s0 = n11 = (n11 << n10 ^ objectArray[n9 + 2] & 0xFF) & this.v0;
                objectArray = this.r0;
                this.q0[this.n0 & n9] = s8 = objectArray[n11];
                objectArray[n11] = (short)n9;
                n9 = s8 & 0xFFFF;
            }
            if ((long)n9 != 0L && (this.B0 - n9 & 0xFFFF) <= this.l0 - 262 && this.I0 != 2) {
                this.y0 = this.G(n9);
            }
            if ((n11 = this.y0) >= 3) {
                bl = this.f(this.B0 - this.C0, n11 - 3);
                n10 = this.D0;
                n11 = this.y0;
                this.D0 = n10 -= n11;
                if (n11 <= this.G0 && n10 >= 3) {
                    this.y0 = n11 - 1;
                    do {
                        n9 = this.B0;
                        this.B0 = n10 = n9 + 1;
                        this.s0 = n11 = (this.s0 << this.w0 ^ this.o0[n9 + 3] & 0xFF) & this.v0;
                        objectArray = this.r0;
                        this.q0[this.n0 & n10] = s8 = objectArray[n11];
                        objectArray[n11] = (short)n10;
                        this.y0 = n11 = this.y0 - 1;
                    } while (n11 != 0);
                    this.B0 = n9 + 2;
                    n11 = s8 & 0xFFFF;
                } else {
                    this.B0 = n11 = this.B0 + n11;
                    this.y0 = 0;
                    objectArray = this.o0;
                    this.s0 = n10 = objectArray[n11] & 0xFF;
                    int n12 = this.w0;
                    this.s0 = (objectArray[n11 + 1] & 0xFF ^ n10 << n12) & this.v0;
                    n11 = n9;
                }
            } else {
                bl = this.f(0, this.o0[this.B0] & 0xFF);
                --this.D0;
                ++this.B0;
                n11 = n9;
            }
            n9 = n11;
            if (!bl) continue;
            this.C(false);
            n9 = n11;
            if (this.q.g == 0) break;
        }
        return 0;
    }

    int v(int n8) {
        int n9 = 0;
        while (true) {
            short s8;
            Object[] objectArray;
            int n10;
            boolean bl;
            int n11;
            if (this.D0 < 262) {
                this.B();
                n11 = this.D0;
                if (n11 < 262 && n8 == 0) {
                    return 0;
                }
                if (n11 == 0) {
                    if (this.A0 != 0) {
                        this.f(0, this.o0[this.B0 - 1] & 0xFF);
                        this.A0 = 0;
                    }
                    bl = n8 == 4;
                    this.C(bl);
                    if (this.q.g == 0) {
                        if (n8 == 4) {
                            return 2;
                        }
                        return 0;
                    }
                    if (n8 == 4) {
                        return 3;
                    }
                    return 1;
                }
            }
            n11 = n9;
            if (this.D0 >= 3) {
                n9 = this.s0;
                n10 = this.w0;
                objectArray = this.o0;
                n11 = this.B0;
                this.s0 = n9 = (n9 << n10 ^ objectArray[n11 + 2] & 0xFF) & this.v0;
                objectArray = this.r0;
                this.q0[this.n0 & n11] = s8 = objectArray[n9];
                objectArray[n9] = (short)n11;
                n11 = s8 & 0xFFFF;
            }
            this.E0 = n9 = this.y0;
            this.z0 = this.C0;
            this.y0 = 2;
            if (n11 != 0 && n9 < this.G0 && (this.B0 - n11 & 0xFFFF) <= this.l0 - 262) {
                if (this.I0 != 2) {
                    this.y0 = this.G(n11);
                }
                if ((n9 = this.y0) <= 5 && (this.I0 == 1 || n9 == 3 && this.B0 - this.C0 > 4096)) {
                    this.y0 = 2;
                }
            }
            if ((n9 = this.E0) >= 3 && this.y0 <= n9) {
                int n12;
                n10 = this.B0;
                int n13 = this.D0;
                bl = this.f(n10 - 1 - this.z0, n9 - 3);
                n9 = this.D0;
                int n14 = this.E0;
                this.D0 = n9 - (n14 - 1);
                this.E0 = n14 - 2;
                n9 = n11;
                do {
                    n14 = this.B0;
                    this.B0 = n12 = n14 + 1;
                    n11 = n9;
                    if (n12 <= n13 + n10 - 3) {
                        this.s0 = n11 = (this.s0 << this.w0 ^ this.o0[n14 + 3] & 0xFF) & this.v0;
                        objectArray = this.r0;
                        this.q0[this.n0 & n12] = s8 = objectArray[n11];
                        objectArray[n11] = (short)n12;
                        n11 = s8 & 0xFFFF;
                    }
                    this.E0 = n12 = this.E0 - 1;
                    n9 = n11;
                } while (n12 != 0);
                this.A0 = 0;
                this.y0 = 2;
                this.B0 = n14 + 2;
                n9 = n11;
                if (!bl) continue;
                this.C(false);
                n9 = n11;
                if (this.q.g != 0) continue;
                return 0;
            }
            if (this.A0 != 0) {
                if (this.f(0, this.o0[this.B0 - 1] & 0xFF)) {
                    this.C(false);
                }
                ++this.B0;
                --this.D0;
                n9 = n11;
                if (this.q.g != 0) continue;
                return 0;
            }
            this.A0 = 1;
            ++this.B0;
            --this.D0;
            n9 = n11;
        }
    }

    int w(int n8) {
        int n9 = this.e0;
        int n10 = 65535;
        if (65535 > n9 - 5) {
            n10 = n9 - 5;
        }
        while (true) {
            int n11;
            if (this.D0 <= 1) {
                this.B();
                n9 = this.D0;
                if (n9 == 0 && n8 == 0) {
                    return 0;
                }
                if (n9 == 0) {
                    boolean bl = n8 == 4;
                    this.C(bl);
                    if (this.q.g == 0) {
                        if (n8 == 4) {
                            return 2;
                        }
                        return 0;
                    }
                    if (n8 == 4) {
                        return 3;
                    }
                    return 1;
                }
            }
            this.B0 = n11 = this.B0 + this.D0;
            this.D0 = 0;
            n9 = this.x0 + n10;
            if (n11 == 0 || n11 >= n9) {
                this.D0 = n11 - n9;
                this.B0 = n9;
                this.C(false);
                if (this.q.g == 0) {
                    return 0;
                }
            }
            if (this.B0 - this.x0 < this.l0 - 262) continue;
            this.C(false);
            if (this.q.g == 0) break;
        }
        return 0;
    }

    static class Config {
        int a;
        int b;
        int c;
        int d;
        int e;

        Config(int n8, int n9, int n10, int n11, int n12) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
        }
    }
}

