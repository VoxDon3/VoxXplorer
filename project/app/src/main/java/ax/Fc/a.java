/*
 * Decompiled with CFR 0.152.
 */
package ax.Fc;

import ax.Fc.d;
import ax.Fc.e;
import ax.Kc.b;
import ax.Kc.i;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.Arrays;

public class a
extends ax.Ec.a
implements o {
    private int c0;
    private int d0;
    private int e0;
    private boolean f0;
    private final d g0 = new d();
    private int h0;
    private b i0;
    private final boolean j0;
    private int k0 = 1;
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
    private a y0;

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl) throws IOException {
        InputStream inputStream2 = inputStream;
        if (inputStream == System.in) {
            inputStream2 = new i(inputStream);
        }
        this.i0 = new b(inputStream2, ByteOrder.BIG_ENDIAN);
        this.j0 = bl;
        this.A(true);
        this.F();
    }

    private boolean A(boolean bl) throws IOException {
        Object object = this.i0;
        if (object != null) {
            int n8;
            if (!bl) {
                ((b)object).d();
            }
            if ((n8 = this.W(this.i0)) == -1 && !bl) {
                return false;
            }
            int n9 = this.W(this.i0);
            int n10 = this.W(this.i0);
            if (n8 == 66 && n9 == 90 && n10 == 104) {
                n9 = this.W(this.i0);
                if (n9 >= 49 && n9 <= 57) {
                    this.e0 = n9 - 48;
                    this.o0 = 0;
                    return true;
                }
                throw new IOException("BZip2 block size is invalid");
            }
            object = bl ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream";
            throw new IOException((String)object);
        }
        throw new IOException("No InputStream");
    }

    private int A0() throws IOException {
        if (this.t0 < this.x0) {
            int n8 = this.q0;
            this.g0.c(n8);
            ++this.t0;
            this.k0 = 7;
            return n8;
        }
        ++this.s0;
        this.p0 = 0;
        return this.s0();
    }

    private int C0() throws IOException {
        if (this.s0 <= this.c0) {
            this.r0 = this.q0;
            a a8 = this.y0;
            byte[] byArray = a8.o;
            int n8 = this.w0;
            byte by = byArray[n8];
            a.j(n8, a8.n.length, "su_tPos");
            this.w0 = this.y0.n[this.w0];
            int n9 = this.u0;
            n8 = 0;
            if (n9 == 0) {
                this.u0 = e.a(this.v0) - 1;
                this.v0 = n9 = this.v0 + 1;
                if (n9 == 512) {
                    this.v0 = 0;
                }
            } else {
                this.u0 = n9 - 1;
            }
            if (this.u0 == 1) {
                n8 = 1;
            }
            this.q0 = n8 = by & 0xFF ^ n8;
            ++this.s0;
            this.k0 = 3;
            this.g0.c(n8);
            return n8;
        }
        this.p();
        this.F();
        return this.o0();
    }

    private int D0() throws IOException {
        int n8;
        if (this.q0 != this.r0) {
            this.k0 = 2;
            this.p0 = 1;
            return this.C0();
        }
        this.p0 = n8 = this.p0 + 1;
        if (n8 < 4) {
            this.k0 = 2;
            return this.C0();
        }
        a a8 = this.y0;
        byte[] byArray = a8.o;
        n8 = this.w0;
        this.x0 = (char)(byArray[n8] & 0xFF);
        a.j(n8, a8.n.length, "su_tPos");
        this.w0 = this.y0.n[this.w0];
        n8 = this.u0;
        if (n8 == 0) {
            this.u0 = e.a(this.v0) - 1;
            this.v0 = n8 = this.v0 + 1;
            if (n8 == 512) {
                this.v0 = 0;
            }
        } else {
            this.u0 = n8 - 1;
        }
        this.t0 = 0;
        this.k0 = 4;
        if (this.u0 == 1) {
            this.x0 = (char)(this.x0 ^ '\u0001');
        }
        return this.F0();
    }

    private void F() throws IOException {
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        b b8;
        block4: {
            b8 = this.i0;
            do {
                c13 = a.f(b8);
                c12 = a.f(b8);
                c11 = a.f(b8);
                c10 = a.f(b8);
                c9 = a.f(b8);
                c8 = a.f(b8);
                if (c13 != '\u0017' || c12 != 'r' || c11 != 'E' || c10 != '8' || c9 != 'P' || c8 != '\u0090') break block4;
            } while (!this.m());
            return;
        }
        boolean bl = false;
        if (c13 == '1' && c12 == 'A' && c11 == 'Y' && c10 == '&' && c9 == 'S' && c8 == 'Y') {
            this.l0 = a.e(b8);
            if (a.g(b8, 1) == 1) {
                bl = true;
            }
            this.f0 = bl;
            if (this.y0 == null) {
                this.y0 = new a(this.e0);
            }
            this.q();
            this.g0.b();
            this.k0 = 1;
            return;
        }
        this.k0 = 0;
        throw new IOException("Bad block header");
    }

    private int F0() throws IOException {
        if (this.t0 < this.x0) {
            this.g0.c(this.q0);
            ++this.t0;
            return this.q0;
        }
        this.k0 = 2;
        ++this.s0;
        this.p0 = 0;
        return this.C0();
    }

    private void H() {
        Object object = this.y0;
        boolean[] blArray = ((a)object).a;
        object = ((a)object).b;
        int n8 = 0;
        for (int i8 = 0; i8 < 256; ++i8) {
            int n9 = n8;
            if (blArray[i8]) {
                object[n8] = (byte)i8;
                n9 = n8 + 1;
            }
            n8 = n9;
        }
        this.h0 = n8;
    }

    private int L() throws IOException {
        switch (this.k0) {
            default: {
                throw new IllegalStateException();
            }
            case 7: {
                return this.A0();
            }
            case 6: {
                return this.u0();
            }
            case 5: {
                throw new IllegalStateException();
            }
            case 4: {
                return this.F0();
            }
            case 3: {
                return this.D0();
            }
            case 2: {
                throw new IllegalStateException();
            }
            case 1: {
                return this.o0();
            }
            case 0: 
        }
        return -1;
    }

    private int W(b b8) throws IOException {
        return (int)b8.j(8);
    }

    private static boolean d(b b8) throws IOException {
        return a.g(b8, 1) != 0;
    }

    private void d0() throws IOException {
        int n8;
        int n9;
        b b8 = this.i0;
        Object object = this.y0;
        Object object2 = object.a;
        byte[] byArray = object.m;
        byte[] byArray2 = object.c;
        byte[] byArray3 = object.d;
        int n10 = 0;
        for (n9 = 0; n9 < 16; ++n9) {
            n8 = n10;
            if (a.d(b8)) {
                n8 = n10 | 1 << n9;
            }
            n10 = n8;
        }
        Arrays.fill(object2, false);
        for (n8 = 0; n8 < 16; ++n8) {
            if ((1 << n8 & n10) == 0) continue;
            for (n9 = 0; n9 < 16; ++n9) {
                if (!a.d(b8)) continue;
                object2[(n8 << 4) + n9] = true;
            }
        }
        this.H();
        int n11 = this.h0 + 2;
        int n12 = a.g(b8, 3);
        n9 = a.g(b8, 15);
        if (n9 >= 0) {
            a.j(n11, 259, "alphaSize");
            a.j(n12, 7, "nGroups");
            for (n10 = 0; n10 < n9; ++n10) {
                n8 = 0;
                while (a.d(b8)) {
                    ++n8;
                }
                if (n10 >= 18002) continue;
                byArray3[n10] = (byte)n8;
            }
            n10 = n9;
            if (n9 > 18002) {
                n10 = 18002;
            }
            n8 = n12;
            while (--n8 >= 0) {
                byArray[n8] = (byte)n8;
            }
            for (n8 = 0; n8 < n10; ++n8) {
                a.j(n9, 6, "selectorMtf");
                byte by = byArray[n9];
                for (n9 = byArray3[n8] & 0xFF; n9 > 0; --n9) {
                    byArray[n9] = byArray[n9 - 1];
                }
                byArray[0] = by;
                byArray2[n8] = by;
            }
            object2 = object.l;
            for (n10 = 0; n10 < n12; ++n10) {
                n9 = a.g(b8, 5);
                object = object2[n10];
                for (n8 = 0; n8 < n11; ++n8) {
                    while (a.d(b8)) {
                        int n13 = a.d(b8) ? -1 : 1;
                        n9 += n13;
                    }
                    object[n8] = (a)((char)n9);
                }
            }
            this.o(n11, n12);
            return;
        }
        throw new IOException("Corrupted input, nSelectors value negative");
    }

    private static int e(b b8) throws IOException {
        return a.g(b8, 32);
    }

    private static char f(b b8) throws IOException {
        return (char)a.g(b8, 8);
    }

    private static int g(b b8, int n8) throws IOException {
        long l8 = b8.j(n8);
        if (l8 >= 0L) {
            return (int)l8;
        }
        throw new IOException("Unexpected end of stream");
    }

    private static void j(int n8, int n9, String string) throws IOException {
        if (n8 >= 0) {
            if (n8 < n9) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Corrupted input, ");
            stringBuilder.append(string);
            stringBuilder.append(" value too big");
            throw new IOException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Corrupted input, ");
        stringBuilder.append(string);
        stringBuilder.append(" value negative");
        throw new IOException(stringBuilder.toString());
    }

    private boolean m() throws IOException {
        int n8;
        this.m0 = n8 = a.e(this.i0);
        this.k0 = 0;
        this.y0 = null;
        if (n8 == this.o0) {
            return !this.j0 || !this.A(false);
            {
            }
        }
        throw new IOException("BZip2 CRC error");
    }

    private void o(int n8, int n9) throws IOException {
        Object object = this.y0;
        char[][] cArray = ((a)object).l;
        int[] nArray = ((a)object).i;
        int[][] nArray2 = ((a)object).f;
        int[][] nArray3 = ((a)object).g;
        int[][] nArray4 = ((a)object).h;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10;
            object = cArray[i8];
            int n11 = n8;
            int n12 = 0;
            Object object2 = 32;
            while ((n10 = n11 - 1) >= 0) {
                Object object3 = object[n10];
                Object object4 = n12;
                if (object3 > n12) {
                    object4 = object3;
                }
                n11 = n10;
                n12 = object4;
                if (object3 >= object2) continue;
                object2 = object3;
                n11 = n10;
                n12 = object4;
            }
            a.v(nArray2[i8], nArray3[i8], nArray4[i8], cArray[i8], object2, n12, n8);
            nArray[i8] = object2;
        }
    }

    private int o0() throws IOException {
        Object object;
        if (this.k0 != 0 && (object = this.y0) != null) {
            int n8;
            int[] nArray = ((a)object).j;
            int n9 = this.c0;
            int n10 = n9 + 1;
            object = ((a)object).a(n10);
            a a8 = this.y0;
            byte[] byArray = a8.o;
            nArray[0] = 0;
            System.arraycopy(a8.e, 0, nArray, 1, 256);
            n9 = nArray[0];
            for (n8 = 1; n8 <= 256; ++n8) {
                nArray[n8] = n9 += nArray[n8];
            }
            n8 = this.c0;
            for (n9 = 0; n9 <= n8; ++n9) {
                int n11 = byArray[n9] & 0xFF;
                int n12 = nArray[n11];
                nArray[n11] = n12 + 1;
                a.j(n12, n10, "tt index");
                object[n12] = n9;
            }
            n9 = this.d0;
            if (n9 >= 0 && n9 < ((Object)object).length) {
                this.w0 = (int)object[n9];
                this.p0 = 0;
                this.s0 = 0;
                this.q0 = 256;
                if (this.f0) {
                    this.u0 = 0;
                    this.v0 = 0;
                    return this.C0();
                }
                return this.s0();
            }
            throw new IOException("Stream corrupted");
        }
        return -1;
    }

    private void p() throws IOException {
        int n8;
        this.n0 = n8 = this.g0.a();
        int n9 = this.l0;
        if (n9 == n8) {
            n9 = this.o0;
            this.o0 = n8 ^ (n9 >>> 31 | n9 << 1);
            return;
        }
        n8 = this.m0;
        this.o0 = (n8 >>> 31 | n8 << 1) ^ n9;
        throw new IOException("BZip2 CRC error");
    }

    private void q() throws IOException {
        b b8 = this.i0;
        this.d0 = a.g(b8, 24);
        this.d0();
        Object object = this.y0;
        byte[] byArray = ((a)object).o;
        int[] nArray = ((a)object).e;
        byte[] byArray2 = ((a)object).c;
        byte[] byArray3 = ((a)object).b;
        char[] cArray = ((a)object).k;
        int[] nArray2 = ((a)object).i;
        int[][] nArray3 = ((a)object).f;
        Object object2 = ((a)object).g;
        int[][] nArray4 = ((a)object).h;
        int n8 = this.e0 * 100000;
        int n9 = 256;
        while (--n9 >= 0) {
            cArray[n9] = (char)n9;
            nArray[n9] = 0;
        }
        n9 = this.h0 + 1;
        Object object3 = this.u();
        int n10 = byArray2[0] & 0xFF;
        a.j(n10, 6, "zt");
        Object object4 = object2[n10];
        int[] nArray5 = nArray3[n10];
        object = nArray4[n10];
        int n11 = nArray2[n10];
        n10 = -1;
        int n12 = 0;
        int n13 = 49;
        while (object3 != n9) {
            int n14;
            byte by;
            int n15;
            String string = "groupNo";
            if (object3 != 0 && object3 != 1) {
                n15 = n10 + 1;
                if (n15 < n8) {
                    a.j(object3, 257, "nextSym");
                    n10 = object3 - 1;
                    char c8 = cArray[n10];
                    a.j(c8, 256, "yy");
                    by = byArray3[c8];
                    n14 = by & 0xFF;
                    nArray[n14] = nArray[n14] + 1;
                    byArray[n15] = by;
                    if (object3 <= 16) {
                        while (n10 > 0) {
                            object3 = n10 - 1;
                            cArray[n10] = cArray[object3];
                            n10 = object3;
                        }
                    } else {
                        System.arraycopy(cArray, 0, cArray, 1, n10);
                    }
                    cArray[0] = c8;
                    if (n13 == 0) {
                        a.j(++n12, 18002, "groupNo");
                        n10 = byArray2[n12] & 0xFF;
                        a.j(n10, 6, "zt");
                        object4 = object2[n10];
                        nArray5 = nArray3[n10];
                        object = nArray4[n10];
                        n11 = nArray2[n10];
                        n13 = 49;
                    } else {
                        --n13;
                    }
                    a.j(n11, 258, "zn");
                    object3 = a.g(b8, n11);
                    n10 = n11;
                    while (object3 > nArray5[n10]) {
                        a.j(++n10, 258, "zn");
                        object3 = object3 << 1 | a.g(b8, 1);
                    }
                    n10 = object3 - object4[n10];
                    a.j(n10, 258, "zvec");
                    object3 = object[n10];
                    n10 = n15;
                    continue;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Block overrun in MTF, ");
                ((StringBuilder)object2).append(n15);
                ((StringBuilder)object2).append(" exceeds ");
                ((StringBuilder)object2).append(n8);
                throw new IOException(((StringBuilder)object2).toString());
            }
            int n16 = 1;
            Object object5 = -1;
            int n17 = n13;
            n15 = n12;
            Object object6 = object;
            n14 = n11;
            n11 = object5;
            object5 = object3;
            n13 = n16;
            object = string;
            while (true) {
                if (object5 == 0) {
                    n11 += n13;
                } else {
                    if (object5 != 1) break;
                    n11 += n13 << 1;
                }
                if (n17 == 0) {
                    a.j(++n15, 18002, (String)object);
                    n12 = byArray2[n15] & 0xFF;
                    a.j(n12, 6, "zt");
                    object4 = object2[n12];
                    nArray5 = nArray3[n12];
                    object6 = nArray4[n12];
                    object3 = nArray2[n12];
                    n12 = 49;
                } else {
                    n12 = n17 - 1;
                    object3 = n14;
                }
                a.j(object3, 258, "zn");
                n14 = a.g(b8, object3);
                n17 = object3;
                while (n14 > nArray5[n17]) {
                    a.j(++n17, 258, "zn");
                    n14 = n14 << 1 | a.g(b8, 1);
                }
                a.j(n14 -= object4[n17], 258, "zvec");
                object5 = object6[n14];
                n13 <<= 1;
                n14 = object3;
                n17 = n12;
            }
            a.j(n11, this.y0.o.length, "s");
            n12 = cArray[0];
            a.j(n12, 256, "yy");
            by = byArray3[n12];
            n12 = by & 0xFF;
            nArray[n12] = nArray[n12] + (n11 + 1);
            n12 = n10 + 1;
            n10 = n12 + n11;
            a.j(n10, this.y0.o.length, "lastShadow");
            Arrays.fill(byArray, n12, n10 + 1, by);
            if (n10 < n8) {
                object3 = object5;
                n11 = n14;
                object = object6;
                n12 = n15;
                n13 = n17;
                continue;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Block overrun while expanding RLE in MTF, ");
            ((StringBuilder)object2).append(n10);
            ((StringBuilder)object2).append(" exceeds ");
            ((StringBuilder)object2).append(n8);
            throw new IOException(((StringBuilder)object2).toString());
        }
        this.c0 = n10;
    }

    private int s0() throws IOException {
        if (this.s0 <= this.c0) {
            int n8;
            this.r0 = this.q0;
            a a8 = this.y0;
            byte[] byArray = a8.o;
            int n9 = this.w0;
            this.q0 = n8 = byArray[n9] & 0xFF;
            a.j(n9, a8.n.length, "su_tPos");
            this.w0 = this.y0.n[this.w0];
            ++this.s0;
            this.k0 = 6;
            this.g0.c(n8);
            return n8;
        }
        this.k0 = 5;
        this.p();
        this.F();
        return this.o0();
    }

    private int u() throws IOException {
        a a8 = this.y0;
        int n8 = a8.c[0] & 0xFF;
        a.j(n8, 6, "zt");
        int[] nArray = a8.f[n8];
        int n9 = a8.i[n8];
        a.j(n9, 258, "zn");
        int n10 = a.g(this.i0, n9);
        while (n10 > nArray[n9]) {
            a.j(++n9, 258, "zn");
            n10 = n10 << 1 | a.g(this.i0, 1);
        }
        a.j(n10 -= a8.g[n8][n9], 258, "zvec");
        return a8.h[n8][n10];
    }

    private int u0() throws IOException {
        int n8;
        if (this.q0 != this.r0) {
            this.p0 = 1;
            return this.s0();
        }
        this.p0 = n8 = this.p0 + 1;
        if (n8 >= 4) {
            a.j(this.w0, this.y0.o.length, "su_tPos");
            a a8 = this.y0;
            byte[] byArray = a8.o;
            n8 = this.w0;
            this.x0 = (char)(byArray[n8] & 0xFF);
            this.w0 = a8.n[n8];
            this.t0 = 0;
            return this.A0();
        }
        return this.s0();
    }

    private static void v(int[] nArray, int[] nArray2, int[] nArray3, char[] cArray, int n8, int n9, int n10) throws IOException {
        int n11;
        int n12;
        int n13;
        int n14 = 0;
        int n15 = 0;
        for (n13 = n8; n13 <= n9; ++n13) {
            for (n12 = 0; n12 < n10; ++n12) {
                n11 = n15;
                if (cArray[n12] == n13) {
                    nArray3[n15] = n12;
                    n11 = n15 + 1;
                }
                n15 = n11;
            }
        }
        n13 = 23;
        while (--n13 > 0) {
            nArray2[n13] = 0;
            nArray[n13] = 0;
        }
        for (n13 = 0; n13 < n10; ++n13) {
            n12 = cArray[n13];
            a.j(n12, 258, "length");
            nArray2[++n12] = nArray2[n12] + 1;
        }
        n13 = nArray2[0];
        for (n10 = 1; n10 < 23; ++n10) {
            nArray2[n10] = n13 += nArray2[n10];
        }
        n13 = nArray2[n8];
        n10 = n8;
        n12 = n14;
        while (n10 <= n9) {
            n11 = n10 + 1;
            n15 = nArray2[n11];
            n13 = n12 + (n15 - n13);
            nArray[n10] = n13 - 1;
            n12 = n13 << 1;
            n10 = n11;
            n13 = n15;
        }
        ++n8;
        while (n8 <= n9) {
            nArray2[n8] = (nArray[n8 - 1] + 1 << 1) - nArray2[n8];
            ++n8;
        }
    }

    @Override
    public long a() {
        return this.i0.f();
    }

    @Override
    public void close() throws IOException {
        b b8 = this.i0;
        if (b8 != null) {
            try {
                b8.close();
                return;
            }
            finally {
                this.y0 = null;
                this.i0 = null;
            }
        }
    }

    @Override
    public int read() throws IOException {
        if (this.i0 != null) {
            int n8 = this.L();
            int n9 = n8 < 0 ? -1 : 1;
            this.b(n9);
            return n8;
        }
        throw new IOException("Stream closed");
    }

    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        if (n8 >= 0) {
            if (n9 >= 0) {
                int n10 = n8 + n9;
                if (n10 <= ((byte[])object).length) {
                    if (this.i0 != null) {
                        int n11;
                        if (n9 == 0) {
                            return 0;
                        }
                        for (n9 = n8; n9 < n10 && (n11 = this.L()) >= 0; ++n9) {
                            object[n9] = (byte)n11;
                            this.b(1);
                        }
                        if (n9 == n8) {
                            return -1;
                        }
                        return n9 - n8;
                    }
                    throw new IOException("Stream closed");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offs(");
                stringBuilder.append(n8);
                stringBuilder.append(") + len(");
                stringBuilder.append(n9);
                stringBuilder.append(") > dest.length(");
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

    private static final class a {
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

        a(int n8) {
            Class<Integer> clazz = Integer.TYPE;
            this.f = (int[][])Array.newInstance(clazz, 6, 258);
            this.g = (int[][])Array.newInstance(clazz, 6, 258);
            this.h = (int[][])Array.newInstance(clazz, 6, 258);
            this.i = new int[6];
            this.j = new int[257];
            this.k = new char[256];
            this.l = new char[6][258];
            this.m = new byte[6];
            this.o = new byte[n8 * 100000];
        }

        int[] a(int n8) {
            int[] nArray = this.n;
            if (nArray != null && nArray.length >= n8) {
                return nArray;
            }
            this.n = nArray = new int[n8];
            return nArray;
        }
    }
}

