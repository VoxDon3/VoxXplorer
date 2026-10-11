package com.jcraft.jsch.jzlib;

import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class Deflate implements Cloneable {
    private static final Config[] i1 = {new Config(0, 0, 0, 0, 0), new Config(4, 4, 8, 4, 1), new Config(4, 5, 16, 8, 1), new Config(4, 6, 32, 32, 1), new Config(4, 4, 16, 16, 2), new Config(8, 16, 32, 32, 2), new Config(8, 16, 128, 128, 2), new Config(8, 32, 128, 256, 2), new Config(32, 128, 258, 1024, 2), new Config(32, 258, 258, 4096, 2)};
    private static final String[] j1 = {"need dictionary", "stream end", HttpUrl.FRAGMENT_ENCODE_SET, "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", HttpUrl.FRAGMENT_ENCODE_SET};
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
    int U0;
    int V0;
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
    int h0 = 1;
    Tree O0 = new Tree();
    Tree P0 = new Tree();
    Tree Q0 = new Tree();
    short[] R0 = new short[16];
    short[] S0 = new short[16];
    int[] T0 = new int[573];
    byte[] W0 = new byte[573];
    GZIPHeader h1 = null;
    short[] L0 = new short[1146];
    short[] M0 = new short[122];
    short[] N0 = new short[78];

    static class Config {
        int a;
        int b;
        int c;
        int d;
        int e;

        Config(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    Deflate(ZStream zStream) {
        this.q = zStream;
    }

    static boolean S(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * 2];
        short s2 = sArr[i2 * 2];
        if (s >= s2) {
            return s == s2 && bArr[i] <= bArr[i2];
        }
        return true;
    }

    private int r(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ZStream zStream = this.q;
        zStream.i = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            i3 = -i3;
            i6 = 0;
        } else if (i3 > 15) {
            i3 -= 16;
            zStream.m = new CRC32();
            i6 = 2;
        } else {
            i6 = 1;
        }
        if (i4 < 1 || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > 2) {
            return -2;
        }
        this.q.j = this;
        this.h0 = i6;
        this.m0 = i3;
        int i7 = 1 << i3;
        this.l0 = i7;
        this.n0 = i7 - 1;
        int i8 = i4 + 7;
        this.u0 = i8;
        int i9 = 1 << i8;
        this.t0 = i9;
        this.v0 = i9 - 1;
        this.w0 = (i4 + 9) / 3;
        this.o0 = new byte[i7 * 2];
        this.q0 = new short[i7];
        this.r0 = new short[i9];
        int i10 = 1 << (i4 + 6);
        this.Y0 = i10;
        this.d0 = new byte[i10 * 3];
        this.e0 = i10 * 3;
        this.a1 = i10;
        this.X0 = new byte[i10];
        this.H0 = i;
        this.I0 = i5;
        this.j0 = (byte) i2;
        return s();
    }

    private byte[] x(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private int[] y(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private short[] z(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }

    void B() {
        int i;
        int i2;
        do {
            int i3 = this.p0;
            int i4 = this.D0;
            int i5 = this.B0;
            int i6 = (i3 - i4) - i5;
            if (i6 == 0 && i5 == 0 && i4 == 0) {
                i6 = this.l0;
            } else if (i6 == -1) {
                i6--;
            } else {
                int i7 = this.l0;
                if (i5 >= (i7 + i7) - 262) {
                    byte[] bArr = this.o0;
                    System.arraycopy(bArr, i7, bArr, 0, i7);
                    int i8 = this.C0;
                    int i9 = this.l0;
                    this.C0 = i8 - i9;
                    this.B0 -= i9;
                    this.x0 -= i9;
                    int i10 = this.t0;
                    int i11 = i10;
                    do {
                        short[] sArr = this.r0;
                        i10--;
                        int i12 = sArr[i10] & 65535;
                        i = this.l0;
                        sArr[i10] = i12 >= i ? (short) (i12 - i) : (short) 0;
                        i11--;
                    } while (i11 != 0);
                    int i13 = i;
                    do {
                        short[] sArr2 = this.q0;
                        i--;
                        int i14 = sArr2[i] & 65535;
                        i2 = this.l0;
                        sArr2[i] = i14 >= i2 ? (short) (i14 - i2) : (short) 0;
                        i13--;
                    } while (i13 != 0);
                    i6 += i2;
                }
            }
            ZStream zStream = this.q;
            if (zStream.c == 0) {
                return;
            }
            int c = this.D0 + zStream.c(this.o0, this.B0 + this.D0, i6);
            this.D0 = c;
            if (c >= 3) {
                byte[] bArr2 = this.o0;
                int i15 = this.B0;
                int i16 = bArr2[i15] & 255;
                this.s0 = i16;
                this.s0 = ((bArr2[i15 + 1] & 255) ^ (i16 << this.w0)) & this.v0;
            }
            if (c >= 262) {
                return;
            }
        } while (this.q.c != 0);
    }

    void C(boolean z) {
        int i = this.x0;
        c(i >= 0 ? i : -1, this.B0 - i, z);
        this.x0 = this.B0;
        this.q.a();
    }

    synchronized GZIPHeader D() {
        try {
            if (this.h1 == null) {
                this.h1 = new GZIPHeader();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h1;
    }

    void E() {
        for (int i = 0; i < 286; i++) {
            this.L0[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.M0[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.N0[i3 * 2] = 0;
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
        for (int i = 0; i < this.t0 - 1; i++) {
            this.r0[i] = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r14 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int G(int r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.Deflate.G(int):int");
    }

    void H(short[] sArr, int i) {
        int i2 = this.T0[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.U0;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.T0;
                int i5 = i3 + 1;
                if (S(sArr, iArr[i5], iArr[i3], this.W0)) {
                    i3 = i5;
                }
            }
            if (S(sArr, i2, this.T0[i3], this.W0)) {
                break;
            }
            int[] iArr2 = this.T0;
            iArr2[i] = iArr2[i3];
            int i6 = i3;
            i3 <<= 1;
            i = i6;
        }
        this.T0[i] = i2;
    }

    final void I(int i) {
        J((byte) (i >> 8));
        J((byte) i);
    }

    final void J(byte b) {
        byte[] bArr = this.d0;
        int i = this.g0;
        this.g0 = i + 1;
        bArr[i] = b;
    }

    final void K(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.d0, this.g0, i2);
        this.g0 += i2;
    }

    final void L(int i) {
        J((byte) i);
        J((byte) (i >>> 8));
    }

    void M(short[] sArr, int i) {
        int i2;
        int i3;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        short s2 = -1;
        sArr[((i + 1) * 2) + 1] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.N0;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + ((short) i5));
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.N0;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.N0;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.N0;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.N0;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    s2 = s;
                    i2 = 138;
                } else if (s == s3) {
                    i2 = 6;
                    s2 = s;
                } else {
                    s2 = s;
                    i2 = 7;
                    i3 = 4;
                    i5 = 0;
                }
                i3 = 3;
                i5 = 0;
            }
            s = s3;
        }
    }

    void N(int i, int i2, int i3) {
        O(i - 257, 5);
        int i4 = i2 - 1;
        O(i4, 5);
        O(i3 - 4, 4);
        for (int i5 = 0; i5 < i3; i5++) {
            O(this.N0[(Tree.g[i5] * 2) + 1], 3);
        }
        Q(this.L0, i - 1);
        Q(this.M0, i4);
    }

    void O(int i, int i2) {
        int i3 = this.g1;
        if (i3 <= 16 - i2) {
            this.f1 = (short) (((short) ((i << i3) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) | this.f1);
            this.g1 = i3 + i2;
            return;
        }
        short s = (short) (((short) ((i << i3) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) | this.f1);
        this.f1 = s;
        L(s);
        int i4 = this.g1;
        this.f1 = (short) (i >>> (16 - i4));
        this.g1 = i4 + (i2 - 16);
    }

    final void P(int i, short[] sArr) {
        int i2 = i * 2;
        O(sArr[i2] & 65535, sArr[i2 + 1] & 65535);
    }

    void Q(short[] sArr, int i) {
        int i2;
        int i3;
        int i4 = 1;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        int i5 = 0;
        int i6 = 0;
        short s2 = -1;
        while (i5 <= i) {
            i5++;
            short s3 = sArr[(i5 * 2) + i4];
            int i7 = i6 + 1;
            if (i7 >= i2 || s != s3) {
                if (i7 < i3) {
                    do {
                        P(s, this.N0);
                        i7--;
                    } while (i7 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        P(s, this.N0);
                    } else {
                        i6 = i7;
                    }
                    P(16, this.N0);
                    O(i6 - 3, 2);
                } else if (i7 <= 10) {
                    P(17, this.N0);
                    O(i6 - 2, 3);
                } else {
                    P(18, this.N0);
                    O(i6 - 10, 7);
                }
                if (s3 == 0) {
                    s2 = s;
                    i2 = 138;
                } else if (s == s3) {
                    s2 = s;
                    i2 = 6;
                } else {
                    s2 = s;
                    i2 = 7;
                    i3 = 4;
                    i6 = 0;
                }
                i3 = 3;
                i6 = 0;
            } else {
                i6 = i7;
            }
            s = s3;
            i4 = 1;
        }
    }

    void R() {
        int i = 0;
        int i2 = 0;
        while (i < 7) {
            i2 += this.L0[i * 2];
            i++;
        }
        int i3 = 0;
        while (i < 128) {
            i3 += this.L0[i * 2];
            i++;
        }
        while (i < 256) {
            i2 += this.L0[i * 2];
            i++;
        }
        this.i0 = (byte) (i2 <= (i3 >>> 2) ? 1 : 0);
    }

    void T() {
        Tree tree = this.O0;
        tree.a = this.L0;
        tree.c = StaticTree.h;
        Tree tree2 = this.P0;
        tree2.a = this.M0;
        tree2.c = StaticTree.i;
        Tree tree3 = this.Q0;
        tree3.a = this.N0;
        tree3.c = StaticTree.j;
        this.f1 = (short) 0;
        this.g1 = 0;
        this.e1 = 8;
        E();
    }

    void b() {
        O(2, 3);
        short[] sArr = StaticTree.f;
        P(256, sArr);
        h();
        if ((this.e1 + 11) - this.g1 < 9) {
            O(2, 3);
            P(256, sArr);
            h();
        }
        this.e1 = 7;
    }

    void c(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (this.H0 > 0) {
            if (this.i0 == 2) {
                R();
            }
            this.O0.b(this);
            this.P0.b(this);
            i4 = j();
            i3 = (this.b1 + 10) >>> 3;
            i5 = (this.c1 + 10) >>> 3;
            if (i5 <= i3) {
                i3 = i5;
            }
        } else {
            i3 = i2 + 5;
            i4 = 0;
            i5 = i3;
        }
        if (i2 + 4 <= i3 && i != -1) {
            d(i, i2, z);
        } else if (i5 == i3) {
            O((z ? 1 : 0) + 2, 3);
            k(StaticTree.f, StaticTree.g);
        } else {
            O((z ? 1 : 0) + 4, 3);
            N(this.O0.b + 1, this.P0.b + 1, i4 + 1);
            k(this.L0, this.M0);
        }
        E();
        if (z) {
            i();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Deflate deflate = (Deflate) super.clone();
        deflate.d0 = x(deflate.d0);
        deflate.X0 = x(deflate.X0);
        deflate.o0 = x(deflate.o0);
        deflate.q0 = z(deflate.q0);
        deflate.r0 = z(deflate.r0);
        deflate.L0 = z(deflate.L0);
        deflate.M0 = z(deflate.M0);
        deflate.N0 = z(deflate.N0);
        deflate.R0 = z(deflate.R0);
        deflate.S0 = z(deflate.S0);
        deflate.T0 = y(deflate.T0);
        deflate.W0 = x(deflate.W0);
        deflate.O0.a = deflate.L0;
        deflate.P0.a = deflate.M0;
        deflate.Q0.a = deflate.N0;
        GZIPHeader gZIPHeader = deflate.h1;
        if (gZIPHeader != null) {
            deflate.h1 = (GZIPHeader) gZIPHeader.clone();
        }
        return deflate;
    }

    void d(int i, int i2, boolean z) {
        O(z ? 1 : 0, 3);
        l(i, i2, true);
    }

    boolean f(int i, int i2) {
        byte[] bArr = this.d0;
        int i3 = this.a1;
        int i4 = this.Z0;
        bArr[(i4 * 2) + i3] = (byte) (i >>> 8);
        bArr[i3 + (i4 * 2) + 1] = (byte) i;
        this.X0[i4] = (byte) i2;
        this.Z0 = i4 + 1;
        if (i == 0) {
            short[] sArr = this.L0;
            int i5 = i2 * 2;
            sArr[i5] = (short) (sArr[i5] + 1);
        } else {
            this.d1++;
            short[] sArr2 = this.L0;
            int i6 = (Tree.i[i2] + 257) * 2;
            sArr2[i6] = (short) (sArr2[i6] + 1);
            short[] sArr3 = this.M0;
            int c = Tree.c(i - 1) * 2;
            sArr3[c] = (short) (sArr3[c] + 1);
        }
        int i7 = this.Z0;
        if ((i7 & 8191) == 0 && this.H0 > 2) {
            int i8 = i7 * 8;
            int i9 = this.B0 - this.x0;
            for (int i10 = 0; i10 < 30; i10++) {
                i8 += this.M0[i10 * 2] * (Tree.e[i10] + 5);
            }
            int i11 = i8 >>> 3;
            if (this.d1 < this.Z0 / 2 && i11 < i9 / 2) {
                return true;
            }
        }
        return this.Z0 == this.Y0 - 1;
    }

    void h() {
        int i = this.g1;
        if (i == 16) {
            L(this.f1);
            this.f1 = (short) 0;
            this.g1 = 0;
        } else if (i >= 8) {
            J((byte) this.f1);
            this.f1 = (short) (this.f1 >>> 8);
            this.g1 -= 8;
        }
    }

    void i() {
        int i = this.g1;
        if (i > 8) {
            L(this.f1);
        } else if (i > 0) {
            J((byte) this.f1);
        }
        this.f1 = (short) 0;
        this.g1 = 0;
    }

    int j() {
        M(this.L0, this.O0.b);
        M(this.M0, this.P0.b);
        this.Q0.b(this);
        int i = 18;
        while (i >= 3 && this.N0[(Tree.g[i] * 2) + 1] == 0) {
            i--;
        }
        this.b1 += ((i + 1) * 3) + 14;
        return i;
    }

    void k(short[] sArr, short[] sArr2) {
        if (this.Z0 != 0) {
            int i = 0;
            do {
                byte[] bArr = this.d0;
                int i2 = this.a1;
                int i3 = i * 2;
                int i4 = (bArr[i2 + i3 + 1] & 255) | ((bArr[i2 + i3] << 8) & 65280);
                int i5 = this.X0[i] & 255;
                i++;
                if (i4 == 0) {
                    P(i5, sArr);
                } else {
                    byte b = Tree.i[i5];
                    P(b + 257, sArr);
                    int i6 = Tree.d[b];
                    if (i6 != 0) {
                        O(i5 - Tree.j[b], i6);
                    }
                    int i7 = i4 - 1;
                    int c = Tree.c(i7);
                    P(c, sArr2);
                    int i8 = Tree.e[c];
                    if (i8 != 0) {
                        O(i7 - Tree.k[c], i8);
                    }
                }
            } while (i < this.Z0);
        }
        P(256, sArr);
        this.e1 = sArr[513];
    }

    void l(int i, int i2, boolean z) {
        i();
        this.e1 = 8;
        if (z) {
            L((short) i2);
            L((short) (~i2));
        }
        K(this.o0, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int m(int r19) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.jzlib.Deflate.m(int):int");
    }

    int n() {
        int i = this.c0;
        if (i != 42 && i != 113 && i != 666) {
            return -2;
        }
        this.d0 = null;
        this.X0 = null;
        this.r0 = null;
        this.q0 = null;
        this.o0 = null;
        return i == 113 ? -3 : 0;
    }

    int o(int i, int i2) {
        return r(i, 8, i2, 8, 0);
    }

    int s() {
        ZStream zStream = this.q;
        zStream.h = 0L;
        zStream.d = 0L;
        zStream.i = null;
        zStream.l = 2;
        this.g0 = 0;
        this.f0 = 0;
        int i = this.h0;
        if (i < 0) {
            this.h0 = -i;
        }
        this.c0 = this.h0 == 0 ? 113 : 42;
        zStream.m.a();
        this.k0 = 0;
        T();
        F();
        return 0;
    }

    int t(int i) {
        boolean f;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            if (this.D0 < 262) {
                B();
                int i6 = this.D0;
                if (i6 < 262 && i == 0) {
                    return 0;
                }
                if (i6 == 0) {
                    C(i == 4);
                    return this.q.g == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            if (this.D0 >= 3) {
                int i7 = this.s0 << this.w0;
                byte[] bArr = this.o0;
                int i8 = this.B0;
                int i9 = (i7 ^ (bArr[i8 + 2] & 255)) & this.v0;
                this.s0 = i9;
                short[] sArr = this.r0;
                short s = sArr[i9];
                this.q0[this.n0 & i8] = s;
                sArr[i9] = (short) i8;
                i5 = s & 65535;
            }
            if (i5 != 0 && ((this.B0 - i5) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) <= this.l0 - 262 && this.I0 != 2) {
                this.y0 = G(i5);
            }
            int i10 = this.y0;
            if (i10 >= 3) {
                f = f(this.B0 - this.C0, i10 - 3);
                int i11 = this.D0;
                int i12 = this.y0;
                int i13 = i11 - i12;
                this.D0 = i13;
                if (i12 > this.G0 || i13 < 3) {
                    int i14 = this.B0 + i12;
                    this.B0 = i14;
                    this.y0 = 0;
                    byte[] bArr2 = this.o0;
                    int i15 = bArr2[i14] & 255;
                    this.s0 = i15;
                    this.s0 = ((bArr2[i14 + 1] & 255) ^ (i15 << this.w0)) & this.v0;
                } else {
                    this.y0 = i12 - 1;
                    do {
                        i2 = this.B0;
                        int i16 = i2 + 1;
                        this.B0 = i16;
                        int i17 = ((this.s0 << this.w0) ^ (this.o0[i2 + 3] & 255)) & this.v0;
                        this.s0 = i17;
                        short[] sArr2 = this.r0;
                        short s2 = sArr2[i17];
                        i3 = s2 & 65535;
                        this.q0[this.n0 & i16] = s2;
                        sArr2[i17] = (short) i16;
                        i4 = this.y0 - 1;
                        this.y0 = i4;
                    } while (i4 != 0);
                    this.B0 = i2 + 2;
                    i5 = i3;
                }
            } else {
                f = f(0, this.o0[this.B0] & 255);
                this.D0--;
                this.B0++;
            }
            if (f) {
                C(false);
                if (this.q.g == 0) {
                    return 0;
                }
            }
        }
    }

    int v(int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            if (this.D0 < 262) {
                B();
                int i5 = this.D0;
                if (i5 < 262 && i == 0) {
                    return 0;
                }
                if (i5 == 0) {
                    if (this.A0 != 0) {
                        f(0, this.o0[this.B0 - 1] & 255);
                        this.A0 = 0;
                    }
                    C(i == 4);
                    return this.q.g == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            if (this.D0 >= 3) {
                int i6 = this.s0 << this.w0;
                byte[] bArr = this.o0;
                int i7 = this.B0;
                int i8 = (i6 ^ (bArr[i7 + 2] & 255)) & this.v0;
                this.s0 = i8;
                short[] sArr = this.r0;
                short s = sArr[i8];
                this.q0[this.n0 & i7] = s;
                sArr[i8] = (short) i7;
                i4 = s & 65535;
            }
            int i9 = this.y0;
            this.E0 = i9;
            this.z0 = this.C0;
            this.y0 = 2;
            if (i4 != 0 && i9 < this.G0 && ((this.B0 - i4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) <= this.l0 - 262) {
                if (this.I0 != 2) {
                    this.y0 = G(i4);
                }
                int i10 = this.y0;
                if (i10 <= 5 && (this.I0 == 1 || (i10 == 3 && this.B0 - this.C0 > 4096))) {
                    this.y0 = 2;
                }
            }
            int i11 = this.E0;
            if (i11 >= 3 && this.y0 <= i11) {
                int i12 = this.B0;
                int i13 = (this.D0 + i12) - 3;
                boolean f = f((i12 - 1) - this.z0, i11 - 3);
                int i14 = this.D0;
                int i15 = this.E0;
                this.D0 = i14 - (i15 - 1);
                this.E0 = i15 - 2;
                do {
                    i2 = this.B0;
                    int i16 = i2 + 1;
                    this.B0 = i16;
                    if (i16 <= i13) {
                        int i17 = ((this.s0 << this.w0) ^ (this.o0[i2 + 3] & 255)) & this.v0;
                        this.s0 = i17;
                        short[] sArr2 = this.r0;
                        short s2 = sArr2[i17];
                        this.q0[this.n0 & i16] = s2;
                        sArr2[i17] = (short) i16;
                        i4 = s2 & 65535;
                    }
                    i3 = this.E0 - 1;
                    this.E0 = i3;
                } while (i3 != 0);
                this.A0 = 0;
                this.y0 = 2;
                this.B0 = i2 + 2;
                if (f) {
                    C(false);
                    if (this.q.g == 0) {
                        return 0;
                    }
                } else {
                    continue;
                }
            } else if (this.A0 != 0) {
                if (f(0, this.o0[this.B0 - 1] & 255)) {
                    C(false);
                }
                this.B0++;
                this.D0--;
                if (this.q.g == 0) {
                    return 0;
                }
            } else {
                this.A0 = 1;
                this.B0++;
                this.D0--;
            }
        }
    }

    int w(int i) {
        int i2 = this.e0;
        int i3 = i2 - 5;
        int i4 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (65535 > i3) {
            i4 = i2 - 5;
        }
        while (true) {
            if (this.D0 <= 1) {
                B();
                int i5 = this.D0;
                if (i5 == 0 && i == 0) {
                    return 0;
                }
                if (i5 == 0) {
                    C(i == 4);
                    return this.q.g == 0 ? i == 4 ? 2 : 0 : i == 4 ? 3 : 1;
                }
            }
            int i6 = this.B0 + this.D0;
            this.B0 = i6;
            this.D0 = 0;
            int i7 = this.x0 + i4;
            if (i6 == 0 || i6 >= i7) {
                this.D0 = i6 - i7;
                this.B0 = i7;
                C(false);
                if (this.q.g == 0) {
                    return 0;
                }
            }
            if (this.B0 - this.x0 >= this.l0 - 262) {
                C(false);
                if (this.q.g == 0) {
                    return 0;
                }
            }
        }
    }
}
