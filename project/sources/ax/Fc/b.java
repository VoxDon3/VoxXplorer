package ax.Fc;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class b extends ax.Ec.b {
    private final int c0;
    private int d0;
    private int e0;
    private int g0;
    private int h0;
    private int j0;
    private int k0;
    private int l0;
    private final int m0;
    private a n0;
    private c o0;
    private OutputStream p0;
    private int q;
    private volatile boolean q0;
    private final d f0 = new d();
    private int i0 = -1;

    static final class a {
        final boolean[] a = new boolean[256];
        final byte[] b = new byte[256];
        final int[] c = new int[258];
        final byte[] d = new byte[18002];
        final byte[] e = new byte[18002];
        final byte[] f = new byte[256];
        final byte[][] g = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 6, 258);
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

        a(int i) {
            Class cls = Integer.TYPE;
            this.h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.i = new int[6];
            this.j = new short[6];
            this.k = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.l = new byte[6];
            this.m = new boolean[16];
            this.n = new int[260];
            this.o = new int[516];
            this.p = new int[516];
            int i2 = 100000 * i;
            this.q = new byte[i2 + 21];
            this.r = new int[i2];
            this.s = new char[i * 200000];
        }
    }

    public b(OutputStream outputStream, int i) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("blockSize(" + i + ") < 1");
        }
        if (i <= 9) {
            this.c0 = i;
            this.p0 = outputStream;
            this.m0 = (i * 100000) - 20;
            q();
            return;
        }
        throw new IllegalArgumentException("blockSize(" + i + ") > 9");
    }

    private void A() throws IOException {
        byte[][] bArr = this.n0.g;
        int i = this.g0 + 2;
        int i2 = 6;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            byte[] bArr2 = bArr[i2];
            int i3 = i;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    bArr2[i3] = 15;
                }
            }
        }
        int i4 = this.h0;
        int i5 = i4 >= 200 ? i4 < 600 ? 3 : i4 < 1200 ? 4 : i4 < 2400 ? 5 : 6 : 2;
        F(i5, i);
        int H = H(i5, i);
        L(i5, H);
        W(i5, i);
        d0();
        o0(i5, H);
        s0(i5, i);
        u0();
    }

    private void A0(int i) throws IOException {
        int i2 = this.i0;
        if (i2 == -1) {
            this.i0 = i & 255;
            this.j0++;
            return;
        }
        int i3 = i & 255;
        if (i2 != i3) {
            C0();
            this.j0 = 1;
            this.i0 = i3;
            return;
        }
        int i4 = this.j0 + 1;
        this.j0 = i4;
        if (i4 > 254) {
            C0();
            this.i0 = -1;
            this.j0 = 0;
        }
    }

    private void C0() throws IOException {
        int i = this.q;
        if (i >= this.m0) {
            f();
            u();
            C0();
            return;
        }
        int i2 = this.i0;
        a aVar = this.n0;
        aVar.a[i2] = true;
        byte b = (byte) i2;
        int i3 = this.j0;
        this.f0.d(i2, i3);
        if (i3 == 1) {
            aVar.q[i + 2] = b;
            this.q = i + 1;
            return;
        }
        if (i3 == 2) {
            byte[] bArr = aVar.q;
            int i4 = i + 2;
            bArr[i4] = b;
            bArr[i + 3] = b;
            this.q = i4;
            return;
        }
        if (i3 == 3) {
            byte[] bArr2 = aVar.q;
            bArr2[i + 2] = b;
            int i5 = i + 3;
            bArr2[i5] = b;
            bArr2[i + 4] = b;
            this.q = i5;
            return;
        }
        int i6 = i3 - 4;
        aVar.a[i6] = true;
        byte[] bArr3 = aVar.q;
        bArr3[i + 2] = b;
        bArr3[i + 3] = b;
        bArr3[i + 4] = b;
        int i7 = i + 5;
        bArr3[i7] = b;
        bArr3[i + 6] = (byte) i6;
        this.q = i7;
    }

    private void F(int i, int i2) {
        a aVar = this.n0;
        byte[][] bArr = aVar.g;
        int[] iArr = aVar.c;
        int i3 = this.h0;
        int i4 = 0;
        for (int i5 = i; i5 > 0; i5--) {
            int i6 = i3 / i5;
            int i7 = i4 - 1;
            int i8 = i2 - 1;
            int i9 = 0;
            while (i9 < i6 && i7 < i8) {
                i7++;
                i9 += iArr[i7];
            }
            if (i7 > i4 && i5 != i && i5 != 1 && (1 & (i - i5)) != 0) {
                i9 -= iArr[i7];
                i7--;
            }
            byte[] bArr2 = bArr[i5 - 1];
            int i10 = i2;
            while (true) {
                i10--;
                if (i10 >= 0) {
                    if (i10 < i4 || i10 > i7) {
                        bArr2[i10] = 15;
                    } else {
                        bArr2[i10] = 0;
                    }
                }
            }
            i4 = i7 + 1;
            i3 -= i9;
        }
    }

    private int H(int i, int i2) {
        int[][] iArr;
        a aVar = this.n0;
        int[][] iArr2 = aVar.h;
        int[] iArr3 = aVar.i;
        short[] sArr = aVar.j;
        char[] cArr = aVar.s;
        byte[] bArr = aVar.d;
        byte[][] bArr2 = aVar.g;
        byte[] bArr3 = bArr2[0];
        byte[] bArr4 = bArr2[1];
        byte[] bArr5 = bArr2[2];
        byte[] bArr6 = bArr2[3];
        byte[] bArr7 = bArr2[4];
        byte[] bArr8 = bArr2[5];
        int i3 = this.h0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 4; i4 < i6; i6 = 4) {
            int i7 = i;
            while (true) {
                i7--;
                if (i7 < 0) {
                    break;
                }
                iArr3[i7] = 0;
                int[] iArr4 = iArr2[i7];
                int i8 = i2;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        iArr4[i8] = 0;
                    }
                }
            }
            int i9 = 0;
            i5 = 0;
            while (i9 < this.h0) {
                byte[][] bArr9 = bArr2;
                int min = Math.min(i9 + 49, i3 - 1);
                if (i == 6) {
                    int i10 = i9;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    short s4 = 0;
                    short s5 = 0;
                    short s6 = 0;
                    while (i10 <= min) {
                        char c = cArr[i10];
                        s = (short) (s + (bArr3[c] & 255));
                        s2 = (short) (s2 + (bArr4[c] & 255));
                        s3 = (short) (s3 + (bArr5[c] & 255));
                        s4 = (short) (s4 + (bArr6[c] & 255));
                        s5 = (short) (s5 + (bArr7[c] & 255));
                        i10++;
                        s6 = (short) (s6 + (bArr8[c] & 255));
                        iArr2 = iArr2;
                    }
                    iArr = iArr2;
                    sArr[0] = s;
                    sArr[1] = s2;
                    sArr[2] = s3;
                    sArr[3] = s4;
                    sArr[4] = s5;
                    sArr[5] = s6;
                } else {
                    iArr = iArr2;
                    int i11 = i;
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        sArr[i11] = 0;
                    }
                    int i12 = i9;
                    while (i12 <= min) {
                        char c2 = cArr[i12];
                        int i13 = i;
                        while (true) {
                            i13--;
                            if (i13 >= 0) {
                                sArr[i13] = (short) (sArr[i13] + (bArr9[i13][c2] & 255));
                                i12 = i12;
                            }
                        }
                        i12++;
                    }
                }
                short s7 = 999999999;
                int i14 = i;
                int[] iArr5 = iArr3;
                int i15 = -1;
                while (true) {
                    i14--;
                    if (i14 < 0) {
                        break;
                    }
                    short[] sArr2 = sArr;
                    short s8 = sArr2[i14];
                    if (s8 < s7) {
                        s7 = s8;
                        i15 = i14;
                    }
                    sArr = sArr2;
                }
                short[] sArr3 = sArr;
                iArr5[i15] = iArr5[i15] + 1;
                bArr[i5] = (byte) i15;
                i5++;
                int[] iArr6 = iArr[i15];
                while (i9 <= min) {
                    char c3 = cArr[i9];
                    iArr6[c3] = iArr6[c3] + 1;
                    i9++;
                }
                i9 = min + 1;
                bArr2 = bArr9;
                iArr3 = iArr5;
                sArr = sArr3;
                iArr2 = iArr;
            }
            byte[][] bArr10 = bArr2;
            int[][] iArr7 = iArr2;
            int[] iArr8 = iArr3;
            short[] sArr4 = sArr;
            for (int i16 = 0; i16 < i; i16++) {
                p(bArr10[i16], iArr7[i16], this.n0, i2, 20);
            }
            i4++;
            bArr2 = bArr10;
            iArr3 = iArr8;
            sArr = sArr4;
            iArr2 = iArr7;
        }
        return i5;
    }

    private void L(int i, int i2) {
        a aVar = this.n0;
        byte[] bArr = aVar.l;
        while (true) {
            i--;
            if (i < 0) {
                break;
            } else {
                bArr[i] = (byte) i;
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = aVar.d[i3];
            byte b2 = bArr[0];
            int i4 = 0;
            while (b != b2) {
                i4++;
                byte b3 = bArr[i4];
                bArr[i4] = b2;
                b2 = b3;
            }
            bArr[0] = b2;
            aVar.e[i3] = (byte) i4;
        }
    }

    private void W(int i, int i2) {
        a aVar = this.n0;
        int[][] iArr = aVar.k;
        byte[][] bArr = aVar.g;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr2 = bArr[i3];
            int i4 = 32;
            int i5 = i2;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    int i7 = bArr2[i5] & 255;
                    if (i7 > i6) {
                        i6 = i7;
                    }
                    if (i7 < i4) {
                        i4 = i7;
                    }
                }
            }
            o(iArr[i3], bArr[i3], i4, i6, i2);
        }
    }

    private void a() {
        this.o0.a(this.n0, this.q);
    }

    private void b() throws IOException {
        while (this.e0 > 0) {
            this.p0.write(this.d0 >> 24);
            this.d0 <<= 8;
            this.e0 -= 8;
        }
    }

    private void c(int i) throws IOException {
        e(8, (i >> 24) & 255);
        e(8, (i >> 16) & 255);
        e(8, (i >> 8) & 255);
        e(8, i & 255);
    }

    private void d(int i) throws IOException {
        e(8, i);
    }

    private void d0() throws IOException {
        a aVar = this.n0;
        boolean[] zArr = aVar.a;
        boolean[] zArr2 = aVar.m;
        int i = 16;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            zArr2[i] = false;
            int i2 = i * 16;
            int i3 = 16;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    if (zArr[i2 + i3]) {
                        zArr2[i] = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            e(1, zArr2[i4] ? 1 : 0);
        }
        OutputStream outputStream = this.p0;
        int i5 = this.e0;
        int i6 = this.d0;
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                for (int i9 = 0; i9 < 16; i9++) {
                    while (i5 >= 8) {
                        outputStream.write(i6 >> 24);
                        i6 <<= 8;
                        i5 -= 8;
                    }
                    if (zArr[i8 + i9]) {
                        i6 |= 1 << (31 - i5);
                    }
                    i5++;
                }
            }
        }
        this.d0 = i6;
        this.e0 = i5;
    }

    private void e(int i, int i2) throws IOException {
        OutputStream outputStream = this.p0;
        int i3 = this.e0;
        int i4 = this.d0;
        while (i3 >= 8) {
            outputStream.write(i4 >> 24);
            i4 <<= 8;
            i3 -= 8;
        }
        this.d0 = (i2 << ((32 - i3) - i)) | i4;
        this.e0 = i3 + i;
    }

    private void f() throws IOException {
        int a2 = this.f0.a();
        this.k0 = a2;
        int i = this.l0;
        this.l0 = a2 ^ ((i >>> 31) | (i << 1));
        if (this.q == -1) {
            return;
        }
        a();
        d(49);
        d(65);
        d(89);
        d(38);
        d(83);
        d(89);
        c(this.k0);
        e(1, 0);
        v();
    }

    private void g() throws IOException {
        d(23);
        d(114);
        d(69);
        d(56);
        d(80);
        d(144);
        c(this.l0);
        b();
    }

    private void m() {
        int i = this.q;
        a aVar = this.n0;
        boolean[] zArr = aVar.a;
        byte[] bArr = aVar.q;
        int[] iArr = aVar.r;
        char[] cArr = aVar.s;
        int[] iArr2 = aVar.c;
        byte[] bArr2 = aVar.b;
        byte[] bArr3 = aVar.f;
        char c = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (zArr[i3]) {
                bArr2[i3] = (byte) i2;
                i2++;
            }
        }
        this.g0 = i2;
        int i4 = i2 + 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            iArr2[i5] = 0;
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            } else {
                bArr3[i2] = (byte) i2;
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 <= i) {
            byte b = bArr2[bArr[iArr[i6]] & 255];
            byte b2 = bArr3[c];
            int i9 = 0;
            while (b != b2) {
                i9++;
                byte b3 = bArr3[i9];
                bArr3[i9] = b2;
                b2 = b3;
            }
            bArr3[0] = b2;
            if (i9 == 0) {
                i7++;
            } else {
                if (i7 > 0) {
                    int i10 = i7 - 1;
                    while (true) {
                        if ((i10 & 1) == 0) {
                            cArr[i8] = 0;
                            i8++;
                            iArr2[0] = iArr2[0] + 1;
                        } else {
                            cArr[i8] = 1;
                            i8++;
                            iArr2[1] = iArr2[1] + 1;
                        }
                        if (i10 < 2) {
                            break;
                        } else {
                            i10 = (i10 - 2) >> 1;
                        }
                    }
                    i7 = 0;
                }
                int i11 = i9 + 1;
                cArr[i8] = (char) i11;
                i8++;
                iArr2[i11] = iArr2[i11] + 1;
            }
            i6++;
            c = 0;
        }
        if (i7 > 0) {
            int i12 = i7 - 1;
            while (true) {
                if ((i12 & 1) == 0) {
                    cArr[i8] = 0;
                    i8++;
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    cArr[i8] = 1;
                    i8++;
                    iArr2[1] = iArr2[1] + 1;
                }
                if (i12 < 2) {
                    break;
                } else {
                    i12 = (i12 - 2) >> 1;
                }
            }
        }
        cArr[i8] = (char) i4;
        iArr2[i4] = iArr2[i4] + 1;
        this.h0 = i8 + 1;
    }

    private static void o(int[] iArr, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i <= i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                if ((bArr[i5] & 255) == i) {
                    iArr[i5] = i4;
                    i4++;
                }
            }
            i4 <<= 1;
            i++;
        }
    }

    private void o0(int i, int i2) throws IOException {
        e(3, i);
        e(15, i2);
        OutputStream outputStream = this.p0;
        byte[] bArr = this.n0.e;
        int i3 = this.e0;
        int i4 = this.d0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5] & 255;
            for (int i7 = 0; i7 < i6; i7++) {
                while (i3 >= 8) {
                    outputStream.write(i4 >> 24);
                    i4 <<= 8;
                    i3 -= 8;
                }
                i4 |= 1 << (31 - i3);
                i3++;
            }
            while (i3 >= 8) {
                outputStream.write(i4 >> 24);
                i4 <<= 8;
                i3 -= 8;
            }
            i3++;
        }
        this.d0 = i4;
        this.e0 = i3;
    }

    private static void p(byte[] bArr, int[] iArr, a aVar, int i, int i2) {
        int i3;
        int[] iArr2 = aVar.n;
        int[] iArr3 = aVar.o;
        int[] iArr4 = aVar.p;
        int i4 = i;
        while (true) {
            int i5 = i4 - 1;
            i3 = 1;
            if (i5 < 0) {
                break;
            }
            int i6 = iArr[i5];
            if (i6 != 0) {
                i3 = i6;
            }
            iArr3[i4] = i3 << 8;
            i4 = i5;
        }
        boolean z = true;
        while (z) {
            iArr2[0] = 0;
            iArr3[0] = 0;
            iArr4[0] = -2;
            int i7 = 0;
            for (int i8 = 1; i8 <= i; i8++) {
                iArr4[i8] = -1;
                i7++;
                iArr2[i7] = i8;
                int i9 = i7;
                while (true) {
                    int i10 = iArr3[i8];
                    int i11 = i9 >> 1;
                    int i12 = iArr2[i11];
                    if (i10 < iArr3[i12]) {
                        iArr2[i9] = i12;
                        i9 = i11;
                    }
                }
                iArr2[i9] = i8;
            }
            int i13 = i;
            while (i7 > i3) {
                int i14 = iArr2[i3];
                int i15 = iArr2[i7];
                iArr2[i3] = i15;
                int i16 = i7 - 1;
                int i17 = 1;
                while (true) {
                    int i18 = i17 << 1;
                    if (i18 > i16) {
                        break;
                    }
                    if (i18 < i16) {
                        int i19 = i18 + 1;
                        if (iArr3[iArr2[i19]] < iArr3[iArr2[i18]]) {
                            i18 = i19;
                        }
                    }
                    int i20 = iArr3[i15];
                    int i21 = iArr2[i18];
                    if (i20 < iArr3[i21]) {
                        break;
                    }
                    iArr2[i17] = i21;
                    i17 = i18;
                    i3 = 1;
                }
                iArr2[i17] = i15;
                int i22 = iArr2[i3];
                int i23 = iArr2[i16];
                iArr2[i3] = i23;
                int i24 = i7 - 2;
                int i25 = 1;
                while (true) {
                    int i26 = i25 << 1;
                    if (i26 > i24) {
                        break;
                    }
                    if (i26 < i24) {
                        int i27 = i26 + 1;
                        if (iArr3[iArr2[i27]] < iArr3[iArr2[i26]]) {
                            i26 = i27;
                        }
                    }
                    int i28 = iArr3[i23];
                    int i29 = iArr2[i26];
                    if (i28 < iArr3[i29]) {
                        break;
                    }
                    iArr2[i25] = i29;
                    i25 = i26;
                }
                iArr2[i25] = i23;
                i13++;
                iArr4[i22] = i13;
                iArr4[i14] = i13;
                int i30 = iArr3[i14];
                int i31 = iArr3[i22];
                int i32 = (i30 & (-256)) + (i31 & (-256));
                int i33 = i30 & 255;
                int i34 = i31 & 255;
                if (i33 <= i34) {
                    i33 = i34;
                }
                iArr3[i13] = i32 | (i33 + 1);
                iArr4[i13] = -1;
                i7--;
                iArr2[i7] = i13;
                int i35 = iArr3[i13];
                int i36 = i7;
                while (true) {
                    int i37 = i36 >> 1;
                    int i38 = iArr2[i37];
                    if (i35 < iArr3[i38]) {
                        iArr2[i36] = i38;
                        i36 = i37;
                    }
                }
                iArr2[i36] = i13;
                i3 = 1;
            }
            z = false;
            for (int i39 = 1; i39 <= i; i39++) {
                int i40 = i39;
                int i41 = 0;
                while (true) {
                    i40 = iArr4[i40];
                    if (i40 < 0) {
                        break;
                    } else {
                        i41++;
                    }
                }
                bArr[i39 - 1] = (byte) i41;
                if (i41 > i2) {
                    z = true;
                }
            }
            if (z) {
                for (int i42 = 1; i42 < i; i42++) {
                    iArr3[i42] = ((iArr3[i42] >> 9) + 1) << 8;
                }
            }
            i3 = 1;
        }
    }

    private void q() throws IOException {
        d(66);
        d(90);
        this.n0 = new a(this.c0);
        this.o0 = new c(this.n0);
        d(104);
        d(this.c0 + 48);
        this.l0 = 0;
        u();
    }

    private void s0(int i, int i2) throws IOException {
        byte[][] bArr = this.n0.g;
        OutputStream outputStream = this.p0;
        int i3 = this.e0;
        int i4 = this.d0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr2 = bArr[i5];
            int i6 = bArr2[0] & 255;
            while (i3 >= 8) {
                outputStream.write(i4 >> 24);
                i4 <<= 8;
                i3 -= 8;
            }
            i4 |= i6 << (27 - i3);
            i3 += 5;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = bArr2[i7] & 255;
                while (i6 < i8) {
                    while (i3 >= 8) {
                        outputStream.write(i4 >> 24);
                        i4 <<= 8;
                        i3 -= 8;
                    }
                    i4 |= 2 << (30 - i3);
                    i3 += 2;
                    i6++;
                }
                while (i6 > i8) {
                    while (i3 >= 8) {
                        outputStream.write(i4 >> 24);
                        i4 <<= 8;
                        i3 -= 8;
                    }
                    i4 |= 3 << (30 - i3);
                    i3 += 2;
                    i6--;
                }
                while (i3 >= 8) {
                    outputStream.write(i4 >> 24);
                    i4 <<= 8;
                    i3 -= 8;
                }
                i3++;
            }
        }
        this.d0 = i4;
        this.e0 = i3;
    }

    private void u() {
        this.f0.b();
        this.q = -1;
        boolean[] zArr = this.n0.a;
        int i = 256;
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                zArr[i] = false;
            }
        }
    }

    private void u0() throws IOException {
        a aVar = this.n0;
        byte[][] bArr = aVar.g;
        int[][] iArr = aVar.k;
        OutputStream outputStream = this.p0;
        byte[] bArr2 = aVar.d;
        char[] cArr = aVar.s;
        int i = this.h0;
        int i2 = this.e0;
        int i3 = this.d0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int min = Math.min(i4 + 49, i - 1);
            int i6 = bArr2[i5] & 255;
            int[] iArr2 = iArr[i6];
            byte[] bArr3 = bArr[i6];
            while (i4 <= min) {
                char c = cArr[i4];
                while (i2 >= 8) {
                    outputStream.write(i3 >> 24);
                    i3 <<= 8;
                    i2 -= 8;
                }
                int i7 = bArr3[c] & 255;
                i3 |= iArr2[c] << ((32 - i2) - i7);
                i2 += i7;
                i4++;
            }
            i4 = min + 1;
            i5++;
        }
        this.d0 = i3;
        this.e0 = i2;
    }

    private void v() throws IOException {
        e(24, this.n0.t);
        m();
        A();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q0) {
            return;
        }
        OutputStream outputStream = this.p0;
        try {
            j();
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected void finalize() throws Throwable {
        if (!this.q0) {
            System.err.println("Unclosed BZip2CompressorOutputStream detected, will *not* close it");
        }
        super.finalize();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.p0;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public void j() throws IOException {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        try {
            if (this.j0 > 0) {
                C0();
            }
            this.i0 = -1;
            f();
            g();
            this.p0 = null;
            this.o0 = null;
            this.n0 = null;
        } catch (Throwable th) {
            this.p0 = null;
            this.o0 = null;
            this.n0 = null;
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.q0) {
            throw new IOException("Closed");
        }
        A0(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
        int i3 = i + i2;
        if (i3 <= bArr.length) {
            if (this.q0) {
                throw new IOException("Stream closed");
            }
            while (i < i3) {
                A0(bArr[i]);
                i++;
            }
            return;
        }
        throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > buf.length(" + bArr.length + ").");
    }
}
