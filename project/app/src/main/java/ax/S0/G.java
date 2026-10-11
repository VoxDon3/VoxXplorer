/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.F;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.C;
import ax.u7.b;
import ax.u7.f;
import ax.u7.i;
import ax.u7.j;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class G {
    private static final char[] d = new char[]{'\r', '\n'};
    private static final char[] e = new char[]{'\n'};
    private static final C<Charset> f = C.C(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] a;
    private int b;
    private int c;

    public G() {
        this.a = d0.f;
    }

    public G(int n8) {
        this.a = new byte[n8];
        this.c = n8;
    }

    public G(byte[] byArray) {
        this.a = byArray;
        this.c = byArray.length;
    }

    public G(byte[] byArray, int n8) {
        this.a = byArray;
        this.c = n8;
    }

    private static int c(int n8, int n9, int n10, int n11) {
        byte by = i.a((n8 & 7) << 2 | (n9 & 0x30) >> 4);
        n8 = (byte)n9;
        n9 = (byte)n10;
        return ax.u7.f.i((byte)0, by, i.a((n8 & 0xF) << 4 | (n9 & 0x3C) >> 2), i.a((n9 & 3) << 6 | (byte)n11 & 0x3F));
    }

    private int e(Charset charset) {
        int n8;
        int n9;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            if (!(charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16LE) || charset.equals(StandardCharsets.UTF_16BE))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported charset: ");
                stringBuilder.append(charset);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            n9 = 2;
        } else {
            n9 = 1;
        }
        for (int i8 = this.b; i8 < (n8 = this.c) - (n9 - 1); i8 += n9) {
            byte[] byArray;
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII) || !d0.N0(this.a[i8])) && (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16BE) || (byArray = this.a)[i8] != 0 || !d0.N0(byArray[i8 + 1])) && (!charset.equals(StandardCharsets.UTF_16LE) || (byArray = this.a)[i8 + 1] != 0 || !d0.N0(byArray[i8]))) continue;
            return i8;
        }
        return n8;
    }

    private void e0(Charset charset) {
        if (this.r(charset, d) == '\r') {
            this.r(charset, e);
        }
    }

    private static int h(Charset charset) {
        boolean bl = f.contains(charset);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported charset: ");
        stringBuilder.append(charset);
        ax.S0.a.b(bl, stringBuilder.toString());
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    private static boolean i(byte by) {
        return (by & 0xC0) == 128;
    }

    private char k(ByteOrder object, int n8) {
        if (object == ByteOrder.BIG_ENDIAN) {
            object = this.a;
            int n9 = this.b;
            return ax.u7.b.c((byte)object[n9 + n8], (byte)object[n9 + n8 + 1]);
        }
        object = this.a;
        int n10 = this.b;
        return ax.u7.b.c((byte)object[n10 + n8 + 1], (byte)object[n10 + n8]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int m(Charset object) {
        int n8;
        int n9;
        block10: {
            byte by;
            block9: {
                block11: {
                    boolean bl = f.contains(object);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported charset: ");
                    stringBuilder.append(object);
                    ax.S0.a.b(bl, stringBuilder.toString());
                    if (this.a() < G.h((Charset)object)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("position=");
                        ((StringBuilder)object).append(this.b);
                        ((StringBuilder)object).append(", limit=");
                        ((StringBuilder)object).append(this.c);
                        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
                    }
                    bl = ((Charset)object).equals(StandardCharsets.US_ASCII);
                    n9 = 1;
                    if (bl) {
                        byte by2 = this.a[this.b];
                        if ((by2 & 0x80) != 0) {
                            return 0;
                        }
                        n8 = i.b(by2);
                        return n8 << 8 | n9;
                    }
                    if (!((Charset)object).equals(StandardCharsets.UTF_8)) break block10;
                    by = this.o();
                    if (by == 1) break block11;
                    if (by != 2) {
                        if (by != 3) {
                            if (by != 4) {
                                return 0;
                            }
                            object = this.a;
                            n9 = this.b;
                            n9 = G.c((int)object[n9], (int)object[n9 + 1], (int)object[n9 + 2], (int)object[n9 + 3]);
                            break block9;
                        } else {
                            object = this.a;
                            n9 = this.b;
                            n9 = G.c(0, object[n9] & 0xF, (int)object[n9 + 1], (int)object[n9 + 2]);
                        }
                        break block9;
                    } else {
                        object = this.a;
                        n9 = this.b;
                        n9 = G.c(0, 0, (int)object[n9], (int)object[n9 + 1]);
                    }
                    break block9;
                }
                n9 = i.b(this.a[this.b]);
            }
            n8 = n9;
            n9 = by;
            return n8 << 8 | n9;
        }
        char c8 = this.k((ByteOrder)(object = ((Charset)object).equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN), 0);
        if (Character.isHighSurrogate(c8) && this.a() >= 4) {
            n8 = Character.toCodePoint(c8, this.k((ByteOrder)object, 2));
            n9 = 4;
            return n8 << 8 | n9;
        }
        n8 = c8;
        n9 = 2;
        return n8 << 8 | n9;
    }

    private byte o() {
        byte by = this.a[this.b];
        if ((by & 0x80) == 0) {
            return 1;
        }
        if ((by & 0xE0) == 192 && this.a() >= 2 && G.i(this.a[this.b + 1])) {
            return 2;
        }
        if ((this.a[this.b] & 0xF0) == 224 && this.a() >= 3 && G.i(this.a[this.b + 1]) && G.i(this.a[this.b + 2])) {
            return 3;
        }
        if ((this.a[this.b] & 0xF8) == 240 && this.a() >= 4 && G.i(this.a[this.b + 1]) && G.i(this.a[this.b + 2]) && G.i(this.a[this.b + 3])) {
            return 4;
        }
        return 0;
    }

    private char r(Charset charset, char[] cArray) {
        if (this.a() < G.h(charset)) {
            return '\u0000';
        }
        int n8 = this.m(charset);
        if (n8 == 0) {
            return '\u0000';
        }
        int n9 = j.a(n8 >>> 8);
        if (Character.isSupplementaryCodePoint(n9)) {
            return '\u0000';
        }
        char c8 = ax.u7.b.a(n9);
        if (ax.u7.b.b(cArray, c8)) {
            this.b += ax.u7.f.e(n8 & 0xFF);
            return c8;
        }
        return '\u0000';
    }

    public long A() {
        int n8;
        int n9;
        int n10;
        byte[] byArray = this.a;
        int n11 = this.b;
        this.b = n10 = n11 + 1;
        long l8 = byArray[n11];
        this.b = n9 = n11 + 2;
        long l9 = byArray[n10];
        this.b = n8 = n11 + 3;
        long l10 = byArray[n9];
        this.b = n10 = n11 + 4;
        long l11 = byArray[n8];
        this.b = n9 = n11 + 5;
        long l12 = byArray[n10];
        this.b = n10 = n11 + 6;
        long l13 = byArray[n9];
        this.b = n9 = n11 + 7;
        long l14 = byArray[n10];
        this.b = n11 + 8;
        return ((long)byArray[n9] & 0xFFL) << 56 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16 | (l11 & 0xFFL) << 24 | (l12 & 0xFFL) << 32 | (l13 & 0xFFL) << 40 | (l14 & 0xFFL) << 48);
    }

    public short B() {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byte by = byArray[n9];
        this.b = n9 + 2;
        return (short)((byArray[n8] & 0xFF) << 8 | by & 0xFF);
    }

    public long C() {
        int n8;
        int n9;
        byte[] byArray = this.a;
        int n10 = this.b;
        this.b = n9 = n10 + 1;
        long l8 = byArray[n10];
        this.b = n8 = n10 + 2;
        long l9 = byArray[n9];
        this.b = n9 = n10 + 3;
        long l10 = byArray[n8];
        this.b = n10 + 4;
        return ((long)byArray[n9] & 0xFFL) << 24 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16);
    }

    public int D() {
        int n8 = this.z();
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int E() {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byte by = byArray[n9];
        this.b = n9 + 2;
        return (byArray[n8] & 0xFF) << 8 | by & 0xFF;
    }

    public long F() {
        int n8;
        int n9;
        byte[] byArray = this.a;
        int n10 = this.b;
        this.b = n9 = n10 + 1;
        long l8 = byArray[n10];
        this.b = n8 = n10 + 2;
        long l9 = byArray[n9];
        this.b = n9 = n10 + 3;
        long l10 = byArray[n8];
        this.b = n8 = n10 + 4;
        long l11 = byArray[n9];
        this.b = n9 = n10 + 5;
        long l12 = byArray[n8];
        this.b = n8 = n10 + 6;
        long l13 = byArray[n9];
        this.b = n9 = n10 + 7;
        long l14 = byArray[n8];
        this.b = n10 + 8;
        return (long)byArray[n9] & 0xFFL | ((l8 & 0xFFL) << 56 | (l9 & 0xFFL) << 48 | (l10 & 0xFFL) << 40 | (l11 & 0xFFL) << 32 | (l12 & 0xFFL) << 24 | (l13 & 0xFFL) << 16 | (l14 & 0xFFL) << 8);
    }

    public String G() {
        return this.s('\u0000');
    }

    public String H(int n8) {
        if (n8 == 0) {
            return "";
        }
        int n9 = this.b;
        int n10 = n9 + n8 - 1;
        n10 = n10 < this.c && this.a[n10] == 0 ? n8 - 1 : n8;
        String string = d0.I(this.a, n9, n10);
        this.b += n8;
        return string;
    }

    public short I() {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byte by = byArray[n9];
        this.b = n9 + 2;
        return (short)(byArray[n8] & 0xFF | (by & 0xFF) << 8);
    }

    public String J(int n8) {
        return this.K(n8, StandardCharsets.UTF_8);
    }

    public String K(int n8, Charset object) {
        object = new String(this.a, this.b, n8, (Charset)object);
        this.b += n8;
        return object;
    }

    public int L() {
        return this.M() << 21 | this.M() << 14 | this.M() << 7 | this.M();
    }

    public int M() {
        byte[] byArray = this.a;
        int n8 = this.b;
        this.b = n8 + 1;
        return byArray[n8] & 0xFF;
    }

    public int N() {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byte by = byArray[n9];
        this.b = n9 + 2;
        n8 = byArray[n8];
        this.b = n9 + 4;
        return n8 & 0xFF | (by & 0xFF) << 8;
    }

    public long O() {
        int n8;
        int n9;
        byte[] byArray = this.a;
        int n10 = this.b;
        this.b = n9 = n10 + 1;
        long l8 = byArray[n10];
        this.b = n8 = n10 + 2;
        long l9 = byArray[n9];
        this.b = n9 = n10 + 3;
        long l10 = byArray[n8];
        this.b = n10 + 4;
        return (long)byArray[n9] & 0xFFL | ((l8 & 0xFFL) << 24 | (l9 & 0xFFL) << 16 | (l10 & 0xFFL) << 8);
    }

    public int P() {
        int n8;
        int n9;
        byte[] byArray = this.a;
        int n10 = this.b;
        this.b = n9 = n10 + 1;
        byte by = byArray[n10];
        this.b = n8 = n10 + 2;
        n9 = byArray[n9];
        this.b = n10 + 3;
        return byArray[n8] & 0xFF | ((n9 & 0xFF) << 8 | (by & 0xFF) << 16);
    }

    public int Q() {
        int n8 = this.v();
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int R() {
        return ax.u7.f.e(this.S());
    }

    public long S() {
        long l8 = 0L;
        for (int i8 = 0; i8 < 9; ++i8) {
            if (this.b != this.c) {
                long l9 = this.M();
                l8 |= (0x7FL & l9) << i8 * 7;
                if ((l9 & 0x80L) != 0L) continue;
                return l8;
            }
            throw new IllegalStateException("Attempting to read a byte over the limit.");
        }
        return l8;
    }

    public long T() {
        long l8 = this.F();
        if (l8 >= 0L) {
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(l8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int U() {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byte by = byArray[n9];
        this.b = n9 + 2;
        return byArray[n8] & 0xFF | (by & 0xFF) << 8;
    }

    public long V() {
        int n8;
        int n9;
        int n10;
        long l8;
        block7: {
            l8 = this.a[this.b];
            n10 = 7;
            while (true) {
                n9 = 1;
                if (n10 < 0) break;
                n8 = 1 << n10;
                if (((long)n8 & l8) == 0L) {
                    if (n10 < 6) {
                        l8 &= (long)(n8 - 1);
                        n10 = 7 - n10;
                    } else {
                        if (n10 != 7) break;
                        n10 = 1;
                    }
                    break block7;
                }
                --n10;
            }
            n10 = 0;
        }
        if (n10 != 0) {
            while (n9 < n10) {
                n8 = this.a[this.b + n9];
                if ((n8 & 0xC0) == 128) {
                    l8 = l8 << 6 | (long)(n8 & 0x3F);
                    ++n9;
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid UTF-8 sequence continuation byte: ");
                stringBuilder.append(l8);
                throw new NumberFormatException(stringBuilder.toString());
            }
            this.b += n10;
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 sequence first byte: ");
        stringBuilder.append(l8);
        throw new NumberFormatException(stringBuilder.toString());
    }

    public Charset W() {
        int n8;
        byte[] byArray;
        if (this.a() >= 3 && (byArray = this.a)[n8 = this.b] == -17 && byArray[n8 + 1] == -69 && byArray[n8 + 2] == -65) {
            this.b = n8 + 3;
            return StandardCharsets.UTF_8;
        }
        if (this.a() >= 2) {
            byArray = this.a;
            int n9 = this.b;
            n8 = byArray[n9];
            if (n8 == -2 && byArray[n9 + 1] == -1) {
                this.b = n9 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (n8 == -1 && byArray[n9 + 1] == -2) {
                this.b = n9 + 2;
                return StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public void X(int n8) {
        byte[] byArray = this.b() < n8 ? new byte[n8] : this.a;
        this.Z(byArray, n8);
    }

    public void Y(byte[] byArray) {
        this.Z(byArray, byArray.length);
    }

    public void Z(byte[] byArray, int n8) {
        this.a = byArray;
        this.c = n8;
        this.b = 0;
    }

    public int a() {
        return Math.max(this.c - this.b, 0);
    }

    public void a0(int n8) {
        boolean bl = n8 >= 0 && n8 <= this.a.length;
        ax.S0.a.a(bl);
        this.c = n8;
    }

    public int b() {
        return this.a.length;
    }

    public void b0(int n8) {
        boolean bl = n8 >= 0 && n8 <= this.c;
        ax.S0.a.a(bl);
        this.b = n8;
    }

    public void c0(int n8) {
        this.b0(this.b + n8);
    }

    public void d(int n8) {
        if (n8 > this.b()) {
            this.a = Arrays.copyOf(this.a, n8);
        }
    }

    public void d0() {
        while ((this.M() & 0x80) != 0) {
        }
    }

    public byte[] f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int j() {
        return this.c;
    }

    public int l(Charset charset) {
        int n8 = this.m(charset);
        if (n8 != 0) {
            return ax.u7.f.e(n8 >>> 8);
        }
        return 0x110000;
    }

    public int n() {
        return this.a[this.b] & 0xFF;
    }

    public void p(F f8, int n8) {
        this.q(f8.a, 0, n8);
        f8.p(0);
    }

    public void q(byte[] byArray, int n8, int n9) {
        System.arraycopy(this.a, this.b, byArray, n8, n9);
        this.b += n9;
    }

    public String s(char c8) {
        int n8;
        if (this.a() == 0) {
            return null;
        }
        for (n8 = this.b; n8 < this.c && this.a[n8] != c8; ++n8) {
        }
        Object object = this.a;
        c8 = (char)this.b;
        object = d0.I(object, c8, n8 - c8);
        this.b = n8;
        if (n8 < this.c) {
            this.b = n8 + 1;
        }
        return object;
    }

    public double t() {
        return Double.longBitsToDouble(this.F());
    }

    public float u() {
        return Float.intBitsToFloat(this.v());
    }

    public int v() {
        int n8;
        int n9;
        int n10;
        byte[] byArray = this.a;
        int n11 = this.b;
        this.b = n10 = n11 + 1;
        byte by = byArray[n11];
        this.b = n9 = n11 + 2;
        n10 = byArray[n10];
        this.b = n8 = n11 + 3;
        n9 = byArray[n9];
        this.b = n11 + 4;
        return byArray[n8] & 0xFF | ((n10 & 0xFF) << 16 | (by & 0xFF) << 24 | (n9 & 0xFF) << 8);
    }

    public int w() {
        int n8;
        int n9;
        byte[] byArray = this.a;
        int n10 = this.b;
        this.b = n9 = n10 + 1;
        byte by = byArray[n10];
        this.b = n8 = n10 + 2;
        n9 = byArray[n9];
        this.b = n10 + 3;
        return byArray[n8] & 0xFF | ((n9 & 0xFF) << 8 | (by & 0xFF) << 24 >> 8);
    }

    public String x() {
        return this.y(StandardCharsets.UTF_8);
    }

    public String y(Charset charset) {
        boolean bl = f.contains(charset);
        CharSequence charSequence = new StringBuilder();
        charSequence.append("Unsupported charset: ");
        charSequence.append(charset);
        ax.S0.a.b(bl, charSequence.toString());
        if (this.a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            this.W();
        }
        charSequence = this.K(this.e(charset) - this.b, charset);
        if (this.b == this.c) {
            return charSequence;
        }
        this.e0(charset);
        return charSequence;
    }

    public int z() {
        int n8;
        int n9;
        int n10;
        byte[] byArray = this.a;
        int n11 = this.b;
        this.b = n10 = n11 + 1;
        byte by = byArray[n11];
        this.b = n9 = n11 + 2;
        n10 = byArray[n10];
        this.b = n8 = n11 + 3;
        n9 = byArray[n9];
        this.b = n11 + 4;
        return (byArray[n8] & 0xFF) << 24 | ((n10 & 0xFF) << 8 | by & 0xFF | (n9 & 0xFF) << 16);
    }
}

