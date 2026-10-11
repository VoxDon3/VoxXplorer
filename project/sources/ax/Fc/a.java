package ax.Fc;

import ax.Kc.i;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends ax.Ec.a implements o {
    private int c0;
    private int d0;
    private int e0;
    private boolean f0;
    private final d g0;
    private int h0;
    private ax.Kc.b i0;
    private final boolean j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private char x0;
    private C0083a y0;

    /* renamed from: ax.Fc.a$a, reason: collision with other inner class name */
    private static final class C0083a {
        final boolean[] a = new boolean[256];
        final byte[] b = new byte[256];
        final byte[] c = new byte[18002];
        final byte[] d = new byte[18002];
        final int[] e = new int[256];
        final int[][] f;
        final int[][] g;
        final int[][] h;
        final int[] i;
        final int[] j;
        final char[] k;
        final char[][] l;
        final byte[] m;
        int[] n;
        final byte[] o;

        C0083a(int i) {
            Class cls = Integer.TYPE;
            this.f = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.g = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.h = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.i = new int[6];
            this.j = new int[257];
            this.k = new char[256];
            this.l = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
            this.m = new byte[6];
            this.o = new byte[i * 100000];
        }

        int[] a(int i) {
            int[] iArr = this.n;
            if (iArr != null && iArr.length >= i) {
                return iArr;
            }
            int[] iArr2 = new int[i];
            this.n = iArr2;
            return iArr2;
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    private boolean A(boolean z) throws IOException {
        ax.Kc.b bVar = this.i0;
        if (bVar == null) {
            throw new IOException("No InputStream");
        }
        if (!z) {
            bVar.d();
        }
        int W = W(this.i0);
        if (W == -1 && !z) {
            return false;
        }
        int W2 = W(this.i0);
        int W3 = W(this.i0);
        if (W != 66 || W2 != 90 || W3 != 104) {
            throw new IOException(z ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        int W4 = W(this.i0);
        if (W4 < 49 || W4 > 57) {
            throw new IOException("BZip2 block size is invalid");
        }
        this.e0 = W4 - 48;
        this.o0 = 0;
        return true;
    }

    private int A0() throws IOException {
        if (this.t0 >= this.x0) {
            this.s0++;
            this.p0 = 0;
            return s0();
        }
        int i = this.q0;
        this.g0.c(i);
        this.t0++;
        this.k0 = 7;
        return i;
    }

    private int C0() throws IOException {
        if (this.s0 > this.c0) {
            p();
            F();
            return o0();
        }
        this.r0 = this.q0;
        C0083a c0083a = this.y0;
        byte[] bArr = c0083a.o;
        int i = this.w0;
        int i2 = bArr[i] & 255;
        j(i, c0083a.n.length, "su_tPos");
        this.w0 = this.y0.n[this.w0];
        int i3 = this.u0;
        if (i3 == 0) {
            this.u0 = e.a(this.v0) - 1;
            int i4 = this.v0 + 1;
            this.v0 = i4;
            if (i4 == 512) {
                this.v0 = 0;
            }
        } else {
            this.u0 = i3 - 1;
        }
        int i5 = i2 ^ (this.u0 == 1 ? 1 : 0);
        this.q0 = i5;
        this.s0++;
        this.k0 = 3;
        this.g0.c(i5);
        return i5;
    }

    private int D0() throws IOException {
        if (this.q0 != this.r0) {
            this.k0 = 2;
            this.p0 = 1;
            return C0();
        }
        int i = this.p0 + 1;
        this.p0 = i;
        if (i < 4) {
            this.k0 = 2;
            return C0();
        }
        C0083a c0083a = this.y0;
        byte[] bArr = c0083a.o;
        int i2 = this.w0;
        this.x0 = (char) (bArr[i2] & 255);
        j(i2, c0083a.n.length, "su_tPos");
        this.w0 = this.y0.n[this.w0];
        int i3 = this.u0;
        if (i3 == 0) {
            this.u0 = e.a(this.v0) - 1;
            int i4 = this.v0 + 1;
            this.v0 = i4;
            if (i4 == 512) {
                this.v0 = 0;
            }
        } else {
            this.u0 = i3 - 1;
        }
        this.t0 = 0;
        this.k0 = 4;
        if (this.u0 == 1) {
            this.x0 = (char) (this.x0 ^ 1);
        }
        return F0();
    }

    private void F() throws IOException {
        ax.Kc.b bVar = this.i0;
        do {
            char f = f(bVar);
            char f2 = f(bVar);
            char f3 = f(bVar);
            char f4 = f(bVar);
            char f5 = f(bVar);
            char f6 = f(bVar);
            if (f != 23 || f2 != 'r' || f3 != 'E' || f4 != '8' || f5 != 'P' || f6 != 144) {
                if (f != '1' || f2 != 'A' || f3 != 'Y' || f4 != '&' || f5 != 'S' || f6 != 'Y') {
                    this.k0 = 0;
                    throw new IOException("Bad block header");
                }
                this.l0 = e(bVar);
                this.f0 = g(bVar, 1) == 1;
                if (this.y0 == null) {
                    this.y0 = new C0083a(this.e0);
                }
                q();
                this.g0.b();
                this.k0 = 1;
                return;
            }
        } while (!m());
    }

    private int F0() throws IOException {
        if (this.t0 < this.x0) {
            this.g0.c(this.q0);
            this.t0++;
            return this.q0;
        }
        this.k0 = 2;
        this.s0++;
        this.p0 = 0;
        return C0();
    }

    private void H() {
        C0083a c0083a = this.y0;
        boolean[] zArr = c0083a.a;
        byte[] bArr = c0083a.b;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (zArr[i2]) {
                bArr[i] = (byte) i2;
                i++;
            }
        }
        this.h0 = i;
    }

    private int L() throws IOException {
        switch (this.k0) {
            case 0:
                return -1;
            case 1:
                return o0();
            case 2:
                throw new IllegalStateException();
            case 3:
                return D0();
            case 4:
                return F0();
            case 5:
                throw new IllegalStateException();
            case 6:
                return u0();
            case 7:
                return A0();
            default:
                throw new IllegalStateException();
        }
    }

    private int W(ax.Kc.b bVar) throws IOException {
        return (int) bVar.j(8);
    }

    private static boolean d(ax.Kc.b bVar) throws IOException {
        return g(bVar, 1) != 0;
    }

    private void d0() throws IOException {
        ax.Kc.b bVar = this.i0;
        C0083a c0083a = this.y0;
        boolean[] zArr = c0083a.a;
        byte[] bArr = c0083a.m;
        byte[] bArr2 = c0083a.c;
        byte[] bArr3 = c0083a.d;
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            if (d(bVar)) {
                i |= 1 << i2;
            }
        }
        Arrays.fill(zArr, false);
        for (int i3 = 0; i3 < 16; i3++) {
            if (((1 << i3) & i) != 0) {
                int i4 = i3 << 4;
                for (int i5 = 0; i5 < 16; i5++) {
                    if (d(bVar)) {
                        zArr[i4 + i5] = true;
                    }
                }
            }
        }
        H();
        int i6 = this.h0 + 2;
        int g = g(bVar, 3);
        int g2 = g(bVar, 15);
        if (g2 < 0) {
            throw new IOException("Corrupted input, nSelectors value negative");
        }
        j(i6, 259, "alphaSize");
        j(g, 7, "nGroups");
        for (int i7 = 0; i7 < g2; i7++) {
            int i8 = 0;
            while (d(bVar)) {
                i8++;
            }
            if (i7 < 18002) {
                bArr3[i7] = (byte) i8;
            }
        }
        if (g2 > 18002) {
            g2 = 18002;
        }
        int i9 = g;
        while (true) {
            i9--;
            if (i9 < 0) {
                break;
            } else {
                bArr[i9] = (byte) i9;
            }
        }
        for (int i10 = 0; i10 < g2; i10++) {
            int i11 = bArr3[i10] & 255;
            j(i11, 6, "selectorMtf");
            byte b = bArr[i11];
            while (i11 > 0) {
                bArr[i11] = bArr[i11 - 1];
                i11--;
            }
            bArr[0] = b;
            bArr2[i10] = b;
        }
        char[][] cArr = c0083a.l;
        for (int i12 = 0; i12 < g; i12++) {
            int g3 = g(bVar, 5);
            char[] cArr2 = cArr[i12];
            for (int i13 = 0; i13 < i6; i13++) {
                while (d(bVar)) {
                    g3 += d(bVar) ? -1 : 1;
                }
                cArr2[i13] = (char) g3;
            }
        }
        o(i6, g);
    }

    private static int e(ax.Kc.b bVar) throws IOException {
        return g(bVar, 32);
    }

    private static char f(ax.Kc.b bVar) throws IOException {
        return (char) g(bVar, 8);
    }

    private static int g(ax.Kc.b bVar, int i) throws IOException {
        long j = bVar.j(i);
        if (j >= 0) {
            return (int) j;
        }
        throw new IOException("Unexpected end of stream");
    }

    private static void j(int i, int i2, String str) throws IOException {
        if (i < 0) {
            throw new IOException("Corrupted input, " + str + " value negative");
        }
        if (i < i2) {
            return;
        }
        throw new IOException("Corrupted input, " + str + " value too big");
    }

    private boolean m() throws IOException {
        int e = e(this.i0);
        this.m0 = e;
        this.k0 = 0;
        this.y0 = null;
        if (e == this.o0) {
            return (this.j0 && A(false)) ? false : true;
        }
        throw new IOException("BZip2 CRC error");
    }

    private void o(int i, int i2) throws IOException {
        C0083a c0083a = this.y0;
        char[][] cArr = c0083a.l;
        int[] iArr = c0083a.i;
        int[][] iArr2 = c0083a.f;
        int[][] iArr3 = c0083a.g;
        int[][] iArr4 = c0083a.h;
        for (int i3 = 0; i3 < i2; i3++) {
            char[] cArr2 = cArr[i3];
            int i4 = i;
            char c = 0;
            char c2 = ' ';
            while (true) {
                i4--;
                if (i4 >= 0) {
                    char c3 = cArr2[i4];
                    if (c3 > c) {
                        c = c3;
                    }
                    if (c3 < c2) {
                        c2 = c3;
                    }
                }
            }
            v(iArr2[i3], iArr3[i3], iArr4[i3], cArr[i3], c2, c, i);
            iArr[i3] = c2;
        }
    }

    private int o0() throws IOException {
        C0083a c0083a;
        if (this.k0 == 0 || (c0083a = this.y0) == null) {
            return -1;
        }
        int[] iArr = c0083a.j;
        int i = this.c0 + 1;
        int[] a = c0083a.a(i);
        C0083a c0083a2 = this.y0;
        byte[] bArr = c0083a2.o;
        iArr[0] = 0;
        System.arraycopy(c0083a2.e, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.c0;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            j(i7, i, "tt index");
            a[i7] = i5;
        }
        int i8 = this.d0;
        if (i8 < 0 || i8 >= a.length) {
            throw new IOException("Stream corrupted");
        }
        this.w0 = a[i8];
        this.p0 = 0;
        this.s0 = 0;
        this.q0 = 256;
        if (!this.f0) {
            return s0();
        }
        this.u0 = 0;
        this.v0 = 0;
        return C0();
    }

    private void p() throws IOException {
        int a = this.g0.a();
        this.n0 = a;
        int i = this.l0;
        if (i == a) {
            int i2 = this.o0;
            this.o0 = a ^ ((i2 >>> 31) | (i2 << 1));
        } else {
            int i3 = this.m0;
            this.o0 = ((i3 >>> 31) | (i3 << 1)) ^ i;
            throw new IOException("BZip2 CRC error");
        }
    }

    private void q() throws IOException {
        char[] cArr;
        char c;
        ax.Kc.b bVar = this.i0;
        this.d0 = g(bVar, 24);
        d0();
        C0083a c0083a = this.y0;
        byte[] bArr = c0083a.o;
        int[] iArr = c0083a.e;
        byte[] bArr2 = c0083a.c;
        byte[] bArr3 = c0083a.b;
        char[] cArr2 = c0083a.k;
        int[] iArr2 = c0083a.i;
        int[][] iArr3 = c0083a.f;
        int[][] iArr4 = c0083a.g;
        int[][] iArr5 = c0083a.h;
        int i = this.e0 * 100000;
        int i2 = 256;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            cArr2[i2] = (char) i2;
            iArr[i2] = 0;
        }
        int i3 = this.h0 + 1;
        int u = u();
        int i4 = bArr2[0] & 255;
        j(i4, 6, "zt");
        int[] iArr6 = iArr4[i4];
        int[] iArr7 = iArr3[i4];
        int[] iArr8 = iArr5[i4];
        int i5 = iArr2[i4];
        int i6 = u;
        int i7 = -1;
        int i8 = 0;
        int i9 = 49;
        while (i6 != i3) {
            int[] iArr9 = iArr;
            byte[] bArr4 = bArr2;
            String str = "groupNo";
            byte[] bArr5 = bArr3;
            int[] iArr10 = iArr2;
            int[][] iArr11 = iArr3;
            int[][] iArr12 = iArr4;
            if (i6 == 0 || i6 == 1) {
                int i10 = i3;
                int i11 = 1;
                int i12 = -1;
                while (true) {
                    if (i6 != 0) {
                        cArr = cArr2;
                        if (i6 != 1) {
                            break;
                        } else {
                            i12 += i11 << 1;
                        }
                    } else {
                        i12 += i11;
                        cArr = cArr2;
                    }
                    if (i9 == 0) {
                        int i13 = i8 + 1;
                        j(i13, 18002, str);
                        int i14 = bArr4[i13] & 255;
                        j(i14, 6, "zt");
                        iArr6 = iArr12[i14];
                        iArr7 = iArr11[i14];
                        iArr8 = iArr5[i14];
                        i5 = iArr10[i14];
                        i8 = i13;
                        i9 = 49;
                    } else {
                        i9--;
                    }
                    j(i5, 258, "zn");
                    int g = g(bVar, i5);
                    int i15 = i5;
                    while (g > iArr7[i15]) {
                        int i16 = i15 + 1;
                        j(i16, 258, "zn");
                        g = (g << 1) | g(bVar, 1);
                        i15 = i16;
                        str = str;
                    }
                    int i17 = g - iArr6[i15];
                    j(i17, 258, "zvec");
                    i6 = iArr8[i17];
                    i11 <<= 1;
                    cArr2 = cArr;
                    str = str;
                }
                j(i12, this.y0.o.length, "s");
                char c2 = cArr[0];
                j(c2, 256, "yy");
                byte b = bArr5[c2];
                int i18 = b & 255;
                iArr9[i18] = iArr9[i18] + i12 + 1;
                int i19 = i7 + 1;
                int i20 = i19 + i12;
                j(i20, this.y0.o.length, "lastShadow");
                Arrays.fill(bArr, i19, i20 + 1, b);
                if (i20 >= i) {
                    throw new IOException("Block overrun while expanding RLE in MTF, " + i20 + " exceeds " + i);
                }
                i7 = i20;
                iArr = iArr9;
                bArr2 = bArr4;
                bArr3 = bArr5;
                iArr2 = iArr10;
                iArr3 = iArr11;
                iArr4 = iArr12;
                i3 = i10;
                cArr2 = cArr;
            } else {
                i7++;
                if (i7 >= i) {
                    throw new IOException("Block overrun in MTF, " + i7 + " exceeds " + i);
                }
                j(i6, 257, "nextSym");
                int i21 = i6 - 1;
                char c3 = cArr2[i21];
                int i22 = i3;
                j(c3, 256, "yy");
                byte b2 = bArr5[c3];
                int i23 = b2 & 255;
                iArr9[i23] = iArr9[i23] + 1;
                bArr[i7] = b2;
                if (i6 <= 16) {
                    while (i21 > 0) {
                        int i24 = i21 - 1;
                        cArr2[i21] = cArr2[i24];
                        i21 = i24;
                    }
                    c = 0;
                } else {
                    c = 0;
                    System.arraycopy(cArr2, 0, cArr2, 1, i21);
                }
                cArr2[c] = c3;
                if (i9 == 0) {
                    int i25 = i8 + 1;
                    j(i25, 18002, "groupNo");
                    int i26 = bArr4[i25] & 255;
                    j(i26, 6, "zt");
                    int[] iArr13 = iArr12[i26];
                    int[] iArr14 = iArr11[i26];
                    int[] iArr15 = iArr5[i26];
                    i5 = iArr10[i26];
                    i8 = i25;
                    iArr6 = iArr13;
                    iArr7 = iArr14;
                    iArr8 = iArr15;
                    i9 = 49;
                } else {
                    i9--;
                }
                j(i5, 258, "zn");
                int g2 = g(bVar, i5);
                int i27 = i5;
                while (g2 > iArr7[i27]) {
                    i27++;
                    j(i27, 258, "zn");
                    g2 = (g2 << 1) | g(bVar, 1);
                }
                int i28 = g2 - iArr6[i27];
                j(i28, 258, "zvec");
                i6 = iArr8[i28];
                iArr = iArr9;
                bArr2 = bArr4;
                bArr3 = bArr5;
                iArr2 = iArr10;
                iArr3 = iArr11;
                iArr4 = iArr12;
                i3 = i22;
            }
        }
        this.c0 = i7;
    }

    private int s0() throws IOException {
        if (this.s0 > this.c0) {
            this.k0 = 5;
            p();
            F();
            return o0();
        }
        this.r0 = this.q0;
        C0083a c0083a = this.y0;
        byte[] bArr = c0083a.o;
        int i = this.w0;
        int i2 = bArr[i] & 255;
        this.q0 = i2;
        j(i, c0083a.n.length, "su_tPos");
        this.w0 = this.y0.n[this.w0];
        this.s0++;
        this.k0 = 6;
        this.g0.c(i2);
        return i2;
    }

    private int u() throws IOException {
        C0083a c0083a = this.y0;
        int i = c0083a.c[0] & 255;
        j(i, 6, "zt");
        int[] iArr = c0083a.f[i];
        int i2 = c0083a.i[i];
        j(i2, 258, "zn");
        int g = g(this.i0, i2);
        while (g > iArr[i2]) {
            i2++;
            j(i2, 258, "zn");
            g = (g << 1) | g(this.i0, 1);
        }
        int i3 = g - c0083a.g[i][i2];
        j(i3, 258, "zvec");
        return c0083a.h[i][i3];
    }

    private int u0() throws IOException {
        if (this.q0 != this.r0) {
            this.p0 = 1;
            return s0();
        }
        int i = this.p0 + 1;
        this.p0 = i;
        if (i < 4) {
            return s0();
        }
        j(this.w0, this.y0.o.length, "su_tPos");
        C0083a c0083a = this.y0;
        byte[] bArr = c0083a.o;
        int i2 = this.w0;
        this.x0 = (char) (bArr[i2] & 255);
        this.w0 = c0083a.n[i2];
        this.t0 = 0;
        return A0();
    }

    private static void v(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 <= i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (cArr[i7] == i6) {
                    iArr3[i5] = i7;
                    i5++;
                }
            }
        }
        int i8 = 23;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            iArr2[i8] = 0;
            iArr[i8] = 0;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            char c = cArr[i9];
            j(c, 258, "length");
            int i10 = c + 1;
            iArr2[i10] = iArr2[i10] + 1;
        }
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < 23; i12++) {
            i11 += iArr2[i12];
            iArr2[i12] = i11;
        }
        int i13 = iArr2[i];
        int i14 = i;
        while (i14 <= i2) {
            int i15 = i14 + 1;
            int i16 = iArr2[i15];
            int i17 = i4 + (i16 - i13);
            iArr[i14] = i17 - 1;
            i4 = i17 << 1;
            i14 = i15;
            i13 = i16;
        }
        for (int i18 = i + 1; i18 <= i2; i18++) {
            iArr2[i18] = ((iArr[i18 - 1] + 1) << 1) - iArr2[i18];
        }
    }

    @Override // ax.Kc.o
    public long a() {
        return this.i0.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ax.Kc.b bVar = this.i0;
        if (bVar != null) {
            try {
                bVar.close();
            } finally {
                this.y0 = null;
                this.i0 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.i0 == null) {
            throw new IOException("Stream closed");
        }
        int L = L();
        b(L < 0 ? -1 : 1);
        return L;
    }

    public a(InputStream inputStream, boolean z) throws IOException {
        this.g0 = new d();
        this.k0 = 1;
        this.i0 = new ax.Kc.b(inputStream == System.in ? new i(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.j0 = z;
        A(true);
        F();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
        int i3 = i + i2;
        if (i3 <= bArr.length) {
            if (this.i0 == null) {
                throw new IOException("Stream closed");
            }
            if (i2 == 0) {
                return 0;
            }
            int i4 = i;
            while (i4 < i3) {
                int L = L();
                if (L < 0) {
                    break;
                }
                bArr[i4] = (byte) L;
                b(1);
                i4++;
            }
            if (i4 == i) {
                return -1;
            }
            return i4 - i;
        }
        throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
    }
}
