/*
 * Decompiled with CFR 0.152.
 */
package ax.Fc;

import ax.Fc.c;
import ax.Fc.d;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;

public class b
extends ax.Ec.b {
    private final int c0;
    private int d0;
    private int e0;
    private final d f0 = new d();
    private int g0;
    private int h0;
    private int i0 = -1;
    private int j0;
    private int k0;
    private int l0;
    private final int m0;
    private a n0;
    private c o0;
    private OutputStream p0;
    private int q;
    private volatile boolean q0;

    public b(OutputStream object, int n8) throws IOException {
        if (n8 >= 1) {
            if (n8 <= 9) {
                this.c0 = n8;
                this.p0 = object;
                this.m0 = n8 * 100000 - 20;
                this.q();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("blockSize(");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(") > 9");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("blockSize(");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(") < 1");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private void A() throws IOException {
        int n8;
        byte[][] byArray = this.n0.g;
        int n9 = this.g0;
        int n10 = 2;
        int n11 = n9 + 2;
        n9 = 6;
        block0: while ((n8 = n9 - 1) >= 0) {
            byte[] byArray2 = byArray[n8];
            n9 = n11;
            while (true) {
                int n12 = n9 - 1;
                n9 = n8;
                if (n12 < 0) continue block0;
                byArray2[n12] = 15;
                n9 = n12;
            }
        }
        n9 = this.h0;
        n9 = n9 < 200 ? n10 : (n9 < 600 ? 3 : (n9 < 1200 ? 4 : (n9 < 2400 ? 5 : 6)));
        this.F(n9, n11);
        n10 = this.H(n9, n11);
        this.L(n9, n10);
        this.W(n9, n11);
        this.d0();
        this.o0(n9, n10);
        this.s0(n9, n11);
        this.u0();
    }

    private void A0(int n8) throws IOException {
        int n9 = this.i0;
        if (n9 != -1) {
            if (n9 == (n8 &= 0xFF)) {
                this.j0 = n8 = this.j0 + 1;
                if (n8 > 254) {
                    this.C0();
                    this.i0 = -1;
                    this.j0 = 0;
                }
                return;
            }
            this.C0();
            this.j0 = 1;
            this.i0 = n8;
            return;
        }
        this.i0 = n8 & 0xFF;
        ++this.j0;
    }

    private void C0() throws IOException {
        int n8 = this.q;
        if (n8 < this.m0) {
            int n9 = this.i0;
            Object object = this.n0;
            ((a)object).a[n9] = true;
            byte by = (byte)n9;
            int n10 = this.j0;
            this.f0.d(n9, n10);
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        n9 = n10 - 4;
                        ((a)object).a[n9] = true;
                        object = ((a)object).q;
                        object[n8 + 2] = by;
                        object[n8 + 3] = by;
                        object[n8 + 4] = by;
                        n10 = n8 + 5;
                        object[n10] = by;
                        object[n8 + 6] = (byte)n9;
                        this.q = n10;
                        return;
                    }
                    object = ((a)object).q;
                    object[n8 + 2] = by;
                    n9 = n8 + 3;
                    object[n9] = by;
                    object[n8 + 4] = by;
                    this.q = n9;
                    return;
                }
                object = ((a)object).q;
                n9 = n8 + 2;
                object[n9] = by;
                object[n8 + 3] = by;
                this.q = n9;
                return;
            }
            ((a)object).q[n8 + 2] = by;
            this.q = n8 + 1;
            return;
        }
        this.f();
        this.u();
        this.C0();
    }

    private void F(int n8, int n9) {
        Object object = this.n0;
        byte[][] byArray = ((a)object).g;
        int[] nArray = ((a)object).c;
        int n10 = this.h0;
        int n11 = 0;
        for (int i8 = n8; i8 > 0; --i8) {
            int n12;
            int n13 = n10 / i8;
            int n14 = n11 - 1;
            for (n12 = 0; n12 < n13 && n14 < n9 - 1; n12 += nArray[++n14]) {
            }
            int n15 = n14;
            n13 = n12;
            if (n14 > n11) {
                n15 = n14;
                n13 = n12;
                if (i8 != n8) {
                    n15 = n14;
                    n13 = n12;
                    if (i8 != 1) {
                        n15 = n14;
                        n13 = n12;
                        if ((1 & n8 - i8) != 0) {
                            n13 = n12 - nArray[n14];
                            n15 = n14 - 1;
                        }
                    }
                }
            }
            object = byArray[i8 - 1];
            n12 = n9;
            while (--n12 >= 0) {
                if (n12 >= n11 && n12 <= n15) {
                    object[n12] = false;
                    continue;
                }
                object[n12] = 15;
            }
            n11 = n15 + 1;
            n10 -= n13;
        }
    }

    private int H(int n8, int n9) {
        Object object = this.n0;
        Object object2 = ((a)object).h;
        int[] nArray = ((a)object).i;
        short[] sArray = ((a)object).j;
        char[] cArray = ((a)object).s;
        byte[] byArray = ((a)object).d;
        object = ((a)object).g;
        Object object3 = object[0];
        Object object4 = object[1];
        Object object5 = object[2];
        Object object6 = object[3];
        Object object7 = object[4];
        Object object8 = object[5];
        int n10 = this.h0;
        int n11 = 0;
        for (int i8 = 0; i8 < 4; ++i8) {
            int n12;
            Object object9;
            int n13 = n8;
            block1: while ((n11 = n13 - 1) >= 0) {
                nArray[n11] = 0;
                object9 = object2[n11];
                n13 = n9;
                while (true) {
                    n12 = n13 - 1;
                    n13 = n11;
                    if (n12 < 0) continue block1;
                    object9[n12] = 0;
                    n13 = n12;
                }
            }
            n13 = 0;
            n11 = 0;
            while (n13 < this.h0) {
                short s8;
                int n14;
                int n15 = Math.min(n13 + 49, n10 - 1);
                if (n8 == 6) {
                    short s9 = 0;
                    short s10 = 0;
                    short s11 = 0;
                    short s12 = 0;
                    short s13 = 0;
                    short s14 = 0;
                    for (n12 = n13; n12 <= n15; ++n12) {
                        n14 = cArray[n12];
                        s9 = (short)(s9 + (object3[n14] & 0xFF));
                        s10 = (short)(s10 + (object4[n14] & 0xFF));
                        s11 = (short)(s11 + (object5[n14] & 0xFF));
                        s12 = (short)(s12 + (object6[n14] & 0xFF));
                        s13 = (short)(s13 + (object7[n14] & 0xFF));
                        s14 = (short)(s14 + (object8[n14] & 0xFF));
                    }
                    sArray[0] = s9;
                    sArray[1] = s10;
                    sArray[2] = s11;
                    sArray[3] = s12;
                    sArray[4] = s13;
                    sArray[5] = s14;
                } else {
                    object9 = object2;
                    n12 = n8;
                    while (--n12 >= 0) {
                        sArray[n12] = 0;
                    }
                    n12 = n13;
                    while (true) {
                        object2 = object9;
                        if (n12 > n15) break;
                        s8 = cArray[n12];
                        n14 = n8;
                        while (--n14 >= 0) {
                            sArray[n14] = (short)(sArray[n14] + (object[n14][s8] & 0xFF));
                        }
                        ++n12;
                    }
                }
                s8 = 999999999;
                n14 = n8;
                n12 = -1;
                while (--n14 >= 0) {
                    short s15 = sArray[n14];
                    short s16 = s8;
                    if (s15 < s8) {
                        s16 = s15;
                        n12 = n14;
                    }
                    s8 = s16;
                }
                nArray[n12] = nArray[n12] + 1;
                byArray[n11] = (byte)n12;
                ++n11;
                object9 = object2[n12];
                while (n13 <= n15) {
                    n12 = cArray[n13];
                    object9[n12] = object9[n12] + 1;
                    ++n13;
                }
                n13 = n15 + 1;
            }
            for (n13 = 0; n13 < n8; ++n13) {
                b.p((byte[])object[n13], object2[n13], this.n0, n9, 20);
            }
        }
        return n11;
    }

    private void L(int n8, int n9) {
        a a8 = this.n0;
        byte[] byArray = a8.l;
        while (--n8 >= 0) {
            byArray[n8] = (byte)n8;
        }
        for (n8 = 0; n8 < n9; ++n8) {
            byte by = a8.d[n8];
            byte by2 = byArray[0];
            int n10 = 0;
            while (by != by2) {
                byte by3 = byArray[++n10];
                byArray[n10] = by2;
                by2 = by3;
            }
            byArray[0] = by2;
            a8.e[n8] = (byte)n10;
        }
    }

    private void W(int n8, int n9) {
        Object object = this.n0;
        int[][] nArray = ((a)object).k;
        byte[][] byArray = ((a)object).g;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10;
            object = byArray[i8];
            int n11 = 32;
            int n12 = n9;
            int n13 = 0;
            while ((n10 = n12 - 1) >= 0) {
                int n14 = object[n10] & 0xFF;
                int n15 = n13;
                if (n14 > n13) {
                    n15 = n14;
                }
                n12 = n10;
                n13 = n15;
                if (n14 >= n11) continue;
                n11 = n14;
                n12 = n10;
                n13 = n15;
            }
            b.o(nArray[i8], byArray[i8], n11, n13, n9);
        }
    }

    private void a() {
        this.o0.a(this.n0, this.q);
    }

    private void b() throws IOException {
        while (this.e0 > 0) {
            int n8 = this.d0;
            this.p0.write(n8 >> 24);
            this.d0 <<= 8;
            this.e0 -= 8;
        }
    }

    private void c(int n8) throws IOException {
        this.e(8, n8 >> 24 & 0xFF);
        this.e(8, n8 >> 16 & 0xFF);
        this.e(8, n8 >> 8 & 0xFF);
        this.e(8, n8 & 0xFF);
    }

    private void d(int n8) throws IOException {
        this.e(8, n8);
    }

    private void d0() throws IOException {
        int n8;
        int n9;
        Object object = this.n0;
        boolean[] blArray = ((a)object).a;
        object = ((a)object).m;
        int n10 = 16;
        block0: while ((n9 = n10 - 1) >= 0) {
            object[n9] = false;
            n10 = 16;
            do {
                n8 = n10 - 1;
                n10 = n9;
                if (n8 < 0) continue block0;
                n10 = n8;
            } while (!blArray[n9 * 16 + n8]);
            object[n9] = true;
            n10 = n9;
        }
        for (n10 = 0; n10 < 16; ++n10) {
            this.e(1, (int)object[n10]);
        }
        OutputStream outputStream = this.p0;
        n10 = this.e0;
        n9 = this.d0;
        for (int i8 = 0; i8 < 16; ++i8) {
            n8 = n10;
            int n11 = n9;
            if (object[i8] != false) {
                int n12 = 0;
                while (true) {
                    n8 = n10;
                    n11 = n9;
                    if (n12 >= 16) break;
                    n8 = n9;
                    while (n10 >= 8) {
                        outputStream.write(n8 >> 24);
                        n8 <<= 8;
                        n10 -= 8;
                    }
                    n9 = n8;
                    if (blArray[i8 * 16 + n12]) {
                        n9 = n8 | 1 << 31 - n10;
                    }
                    ++n10;
                    ++n12;
                }
            }
            n10 = n8;
            n9 = n11;
        }
        this.d0 = n9;
        this.e0 = n10;
    }

    private void e(int n8, int n9) throws IOException {
        int n10;
        OutputStream outputStream = this.p0;
        int n11 = this.d0;
        for (n10 = this.e0; n10 >= 8; n10 -= 8) {
            outputStream.write(n11 >> 24);
            n11 <<= 8;
        }
        this.d0 = n9 << 32 - n10 - n8 | n11;
        this.e0 = n10 + n8;
    }

    private void f() throws IOException {
        int n8;
        this.k0 = n8 = this.f0.a();
        int n9 = this.l0;
        this.l0 = n8 ^ (n9 >>> 31 | n9 << 1);
        if (this.q == -1) {
            return;
        }
        this.a();
        this.d(49);
        this.d(65);
        this.d(89);
        this.d(38);
        this.d(83);
        this.d(89);
        this.c(this.k0);
        this.e(1, 0);
        this.v();
    }

    private void g() throws IOException {
        this.d(23);
        this.d(114);
        this.d(69);
        this.d(56);
        this.d(80);
        this.d(144);
        this.c(this.l0);
        this.b();
    }

    private void m() {
        int n8;
        int n9;
        int n10;
        int n11 = this.q;
        Object object = this.n0;
        boolean[] blArray = ((a)object).a;
        byte[] byArray = ((a)object).q;
        int[] nArray = ((a)object).r;
        char[] cArray = ((a)object).s;
        int[] nArray2 = ((a)object).c;
        byte[] byArray2 = ((a)object).b;
        object = ((a)object).f;
        int n12 = 0;
        for (n10 = 0; n10 < 256; ++n10) {
            n9 = n12;
            if (blArray[n10]) {
                byArray2[n10] = (byte)n12;
                n9 = n12 + 1;
            }
            n12 = n9;
        }
        this.g0 = n12;
        n9 = n8 = n12 + 1;
        while (true) {
            n10 = n12;
            if (n9 < 0) break;
            nArray2[n9] = 0;
            --n9;
        }
        while (--n10 >= 0) {
            object[n10] = (byte)n10;
        }
        n9 = 0;
        n12 = 0;
        for (int i8 = 0; i8 <= n11; ++i8) {
            n10 = byArray2[byArray[nArray[i8]] & 0xFF];
            Object object2 = object[0];
            int n13 = 0;
            while (n10 != object2) {
                Object object3 = object[++n13];
                object[n13] = object2;
                object2 = object3;
            }
            object[0] = object2;
            if (n13 == 0) {
                ++n9;
                continue;
            }
            n10 = n9;
            int n14 = n12;
            if (n9 > 0) {
                --n9;
                while (true) {
                    if ((n9 & 1) == 0) {
                        cArray[n12] = '\u0000';
                        ++n12;
                        nArray2[0] = nArray2[0] + 1;
                    } else {
                        cArray[n12] = '\u0001';
                        ++n12;
                        nArray2[1] = nArray2[1] + 1;
                    }
                    if (n9 < 2) {
                        n10 = 0;
                        n14 = n12;
                        break;
                    }
                    n9 = n9 - 2 >> 1;
                }
            }
            n9 = n13 + 1;
            cArray[n14] = (char)n9;
            n12 = n14 + 1;
            nArray2[n9] = nArray2[n9] + 1;
            n9 = n10;
        }
        n10 = n12;
        if (n9 > 0) {
            --n9;
            while (true) {
                if ((n9 & 1) == 0) {
                    cArray[n12] = '\u0000';
                    ++n12;
                    nArray2[0] = nArray2[0] + 1;
                } else {
                    cArray[n12] = '\u0001';
                    ++n12;
                    nArray2[1] = nArray2[1] + 1;
                }
                if (n9 < 2) {
                    n10 = n12;
                    break;
                }
                n9 = n9 - 2 >> 1;
            }
        }
        cArray[n10] = (char)n8;
        nArray2[n8] = nArray2[n8] + 1;
        this.h0 = n10 + 1;
    }

    private static void o(int[] nArray, byte[] byArray, int n8, int n9, int n10) {
        int n11 = 0;
        int n12 = n8;
        n8 = n11;
        while (n12 <= n9) {
            for (n11 = 0; n11 < n10; ++n11) {
                int n13 = n8;
                if ((byArray[n11] & 0xFF) == n12) {
                    nArray[n11] = n8;
                    n13 = n8 + 1;
                }
                n8 = n13;
            }
            n8 <<= 1;
            ++n12;
        }
    }

    private void o0(int n8, int n9) throws IOException {
        this.e(3, n8);
        this.e(15, n9);
        OutputStream outputStream = this.p0;
        byte[] byArray = this.n0.e;
        n8 = this.e0;
        int n10 = this.d0;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11;
            int n12;
            byte by = byArray[i8];
            int n13 = 0;
            while (true) {
                n12 = n10;
                if (n13 >= (by & 0xFF)) break;
                while (n8 >= 8) {
                    outputStream.write(n10 >> 24);
                    n10 <<= 8;
                    n8 -= 8;
                }
                n10 |= 1 << 31 - n8;
                ++n13;
            }
            for (n11 = ++n8; n11 >= 8; n11 -= 8) {
                outputStream.write(n12 >> 24);
                n12 <<= 8;
            }
            n8 = n11 + 1;
            n10 = n12;
        }
        this.d0 = n10;
        this.e0 = n8;
    }

    private static void p(byte[] byArray, int[] nArray, a object, int n8, int n9) {
        Object object2;
        int n10;
        int n11;
        int[] nArray2 = ((a)object).n;
        int[] nArray3 = ((a)object).o;
        object = ((a)object).p;
        int n12 = n8;
        while (true) {
            n11 = n12 - 1;
            n10 = 1;
            if (n11 < 0) break;
            object2 = nArray[n11];
            if (object2 != 0) {
                n10 = object2;
            }
            nArray3[n12] = n10 << 8;
            n12 = n11;
        }
        n12 = 1;
        while (n12 != 0) {
            int n13;
            int n14;
            nArray2[0] = 0;
            nArray3[0] = 0;
            object[0] = -2;
            n10 = 1;
            n12 = 0;
            while (n10 <= n8) {
                object[n10] = -1;
                nArray2[++n12] = n10;
                n11 = n12;
                while ((n14 = nArray3[n10]) < nArray3[n13 = nArray2[object2 = n11 >> 1]]) {
                    nArray2[n11] = n13;
                    n11 = object2;
                }
                nArray2[n11] = n10++;
            }
            n11 = n8;
            n10 = n12;
            block4: while (n10 > 1) {
                int n15;
                int n16 = nArray2[1];
                nArray2[1] = n15 = nArray2[n10];
                int n17 = n10 - 1;
                object2 = 1;
                while (true) {
                    block23: {
                        block22: {
                            if ((n13 = object2 << 1) > n17) break block22;
                            n12 = n13;
                            if (n13 < n17) {
                                n14 = n13 + 1;
                                n12 = n13;
                                if (nArray3[nArray2[n14]] < nArray3[nArray2[n13]]) {
                                    n12 = n14;
                                }
                            }
                            if ((n14 = nArray3[n15]) >= nArray3[n13 = nArray2[n12]]) break block23;
                        }
                        nArray2[object2] = n15;
                        n15 = nArray2[1];
                        nArray2[1] = n17 = nArray2[n17];
                        int n18 = n10 - 2;
                        object2 = 1;
                        while (true) {
                            block25: {
                                block24: {
                                    if ((n14 = object2 << 1) > n18) break block24;
                                    if (n14 < n18) {
                                        n13 = n14 + 1;
                                        n12 = n14;
                                        if (nArray3[nArray2[n13]] < nArray3[nArray2[n14]]) {
                                            n12 = n13;
                                        }
                                    } else {
                                        n12 = n14;
                                    }
                                    if ((n13 = nArray3[n17]) >= nArray3[n14 = nArray2[n12]]) break block25;
                                }
                                nArray2[object2] = n17;
                                object[n15] = ++n11;
                                object[n16] = n11;
                                n14 = nArray3[n16];
                                n12 = n14 & 0xFF;
                                n13 = nArray3[n15];
                                object2 = n13 & 0xFF;
                                if (n12 <= object2) {
                                    n12 = object2;
                                }
                                nArray3[n11] = (n14 & 0xFFFFFF00) + (n13 & 0xFFFFFF00) | n12 + 1;
                                object[n11] = -1;
                                nArray2[--n10] = n11;
                                n14 = nArray3[n11];
                                n12 = n10;
                                while (n14 < nArray3[n13 = nArray2[object2 = n12 >> 1]]) {
                                    nArray2[n12] = n13;
                                    n12 = object2;
                                }
                                nArray2[n12] = n11;
                                continue block4;
                            }
                            nArray2[object2] = n14;
                            object2 = n12;
                        }
                    }
                    nArray2[object2] = n13;
                    object2 = n12;
                }
            }
            n12 = 0;
            for (n10 = 1; n10 <= n8; ++n10) {
                object2 = n10;
                n11 = 0;
                while ((object2 = (Object)object[object2]) >= 0) {
                    ++n11;
                }
                byArray[n10 - 1] = (byte)n11;
                if (n11 <= n9) continue;
                n12 = 1;
            }
            if (n12 == 0) continue;
            for (n10 = 1; n10 < n8; ++n10) {
                nArray3[n10] = (nArray3[n10] >> 9) + 1 << 8;
            }
        }
    }

    private void q() throws IOException {
        this.d(66);
        this.d(90);
        this.n0 = new a(this.c0);
        this.o0 = new c(this.n0);
        this.d(104);
        this.d(this.c0 + 48);
        this.l0 = 0;
        this.u();
    }

    private void s0(int n8, int n9) throws IOException {
        byte[][] byArray = this.n0.g;
        OutputStream outputStream = this.p0;
        int n10 = this.e0;
        int n11 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            byte[] byArray2 = byArray[i8];
            int n12 = byArray2[0] & 0xFF;
            while (n10 >= 8) {
                outputStream.write(n11 >> 24);
                n11 <<= 8;
                n10 -= 8;
            }
            n11 |= n12 << 27 - n10;
            n10 += 5;
            for (int i9 = 0; i9 < n9; ++i9) {
                int n13;
                int n14 = byArray2[i9] & 0xFF;
                int n15 = n12;
                int n16 = n11;
                while (true) {
                    n11 = n10;
                    n13 = n16;
                    n12 = ++n15;
                    if (n15 >= n14) break;
                    while (n10 >= 8) {
                        outputStream.write(n16 >> 24);
                        n16 <<= 8;
                        n10 -= 8;
                    }
                    n16 |= 2 << 30 - n10;
                    n10 += 2;
                }
                while (true) {
                    n16 = n13;
                    if (n12 <= n14) break;
                    while (n11 >= 8) {
                        outputStream.write(n13 >> 24);
                        n13 <<= 8;
                        n11 -= 8;
                    }
                    n13 |= 3 << 30 - n11;
                    n11 += 2;
                    --n12;
                }
                for (n10 = n11; n10 >= 8; n10 -= 8) {
                    outputStream.write(n16 >> 24);
                    n16 <<= 8;
                }
                ++n10;
                n11 = n16;
            }
        }
        this.d0 = n11;
        this.e0 = n10;
    }

    private void u() {
        this.f0.b();
        this.q = -1;
        boolean[] blArray = this.n0.a;
        int n8 = 256;
        while (--n8 >= 0) {
            blArray[n8] = false;
        }
    }

    private void u0() throws IOException {
        Object object = this.n0;
        byte[][] byArray = ((a)object).g;
        int[][] nArray = ((a)object).k;
        OutputStream outputStream = this.p0;
        byte[] byArray2 = ((a)object).d;
        object = ((a)object).s;
        int n8 = this.h0;
        Object object2 = this.e0;
        int n9 = this.d0;
        int n10 = 0;
        int n11 = 0;
        while (n10 < n8) {
            int n12 = Math.min(n10 + 49, n8 - 1);
            int n13 = byArray2[n11] & 0xFF;
            int[] nArray2 = nArray[n13];
            byte[] byArray3 = byArray[n13];
            n13 = n10;
            n10 = object2;
            while (n13 <= n12) {
                object2 = object[n13];
                while (n10 >= 8) {
                    outputStream.write(n9 >> 24);
                    n9 <<= 8;
                    n10 -= 8;
                }
                int n14 = byArray3[object2] & 0xFF;
                n9 |= nArray2[object2] << 32 - n10 - n14;
                n10 += n14;
                ++n13;
            }
            n13 = n12 + 1;
            ++n11;
            object2 = n10;
            n10 = n13;
        }
        this.d0 = n9;
        this.e0 = object2;
    }

    private void v() throws IOException {
        this.e(24, this.n0.t);
        this.m();
        this.A();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void close() throws IOException {
        if (this.q0) return;
        OutputStream outputStream = this.p0;
        try {
            this.j();
            if (outputStream == null) return;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                if (outputStream == null) throw throwable2;
                try {
                    outputStream.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
        outputStream.close();
    }

    protected void finalize() throws Throwable {
        if (!this.q0) {
            System.err.println("Unclosed BZip2CompressorOutputStream detected, will *not* close it");
        }
        super.finalize();
    }

    @Override
    public void flush() throws IOException {
        OutputStream outputStream = this.p0;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() throws IOException {
        Throwable throwable2;
        block4: {
            block3: {
                if (this.q0) {
                    return;
                }
                this.q0 = true;
                try {
                    if (this.j0 <= 0) break block3;
                    this.C0();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.i0 = -1;
            this.f();
            this.g();
            this.p0 = null;
            this.o0 = null;
            this.n0 = null;
            return;
        }
        this.p0 = null;
        this.o0 = null;
        this.n0 = null;
        throw throwable2;
    }

    @Override
    public void write(int n8) throws IOException {
        if (!this.q0) {
            this.A0(n8);
            return;
        }
        throw new IOException("Closed");
    }

    @Override
    public void write(byte[] object, int n8, int n9) throws IOException {
        if (n8 >= 0) {
            if (n9 >= 0) {
                int n10 = n8 + n9;
                if (n10 <= ((byte[])object).length) {
                    if (!this.q0) {
                        while (n8 < n10) {
                            this.A0((int)object[n8]);
                            ++n8;
                        }
                        return;
                    }
                    throw new IOException("Stream closed");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offs(");
                stringBuilder.append(n8);
                stringBuilder.append(") + len(");
                stringBuilder.append(n9);
                stringBuilder.append(") > buf.length(");
                stringBuilder.append(((Object)object).length);
                stringBuilder.append(").");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("len(");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(") < 0.");
            throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("offs(");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(") < 0.");
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    static final class a {
        final boolean[] a = new boolean[256];
        final byte[] b = new byte[256];
        final int[] c = new int[258];
        final byte[] d = new byte[18002];
        final byte[] e = new byte[18002];
        final byte[] f = new byte[256];
        final byte[][] g = new byte[6][258];
        final int[][] h;
        final int[] i;
        final short[] j;
        final int[][] k;
        final byte[] l;
        final boolean[] m;
        final int[] n;
        final int[] o;
        final int[] p;
        final byte[] q;
        final int[] r;
        final char[] s;
        int t;

        a(int n8) {
            Class<Integer> clazz = Integer.TYPE;
            this.h = (int[][])Array.newInstance(clazz, 6, 258);
            this.i = new int[6];
            this.j = new short[6];
            this.k = (int[][])Array.newInstance(clazz, 6, 258);
            this.l = new byte[6];
            this.m = new boolean[16];
            this.n = new int[260];
            this.o = new int[516];
            this.p = new int[516];
            int n9 = 100000 * n8;
            this.q = new byte[n9 + 21];
            this.r = new int[n9];
            this.s = new char[n8 * 200000];
        }
    }
}

