package ax.S0;

import ax.r7.AbstractC2964C;
import ax.u7.C3214b;
import ax.u7.C3218f;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class G {
    private static final char[] d = {'\r', '\n'};
    private static final char[] e = {'\n'};
    private static final AbstractC2964C<Charset> f = AbstractC2964C.C(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] a;
    private int b;
    private int c;

    public G() {
        this.a = d0.f;
    }

    private static int c(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return C3218f.i((byte) 0, ax.u7.i.a(((i & 7) << 2) | ((i2 & 48) >> 4)), ax.u7.i.a(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), ax.u7.i.a(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    private int e(Charset charset) {
        int i;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && d0.N0(this.a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && d0.N0(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && d0.N0(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        return i2;
    }

    private void e0(Charset charset) {
        if (r(charset, d) == '\r') {
            r(charset, e);
        }
    }

    private static int h(Charset charset) {
        C0968a.b(f.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean i(byte b) {
        return (b & 192) == 128;
    }

    private char k(ByteOrder byteOrder, int i) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i2 = this.b;
            return C3214b.c(bArr[i2 + i], bArr[i2 + i + 1]);
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        return C3214b.c(bArr2[i3 + i + 1], bArr2[i3 + i]);
    }

    private int m(Charset charset) {
        int i;
        int b;
        C0968a.b(f.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        byte b2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b3 = this.a[this.b];
            if ((b3 & 128) != 0) {
                return 0;
            }
            i = ax.u7.i.b(b3);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte o = o();
            if (o == 1) {
                b = ax.u7.i.b(this.a[this.b]);
            } else if (o == 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b = c(0, 0, bArr[i2], bArr[i2 + 1]);
            } else if (o == 3) {
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b = c(0, bArr2[i3] & 15, bArr2[i3 + 1], bArr2[i3 + 2]);
            } else {
                if (o != 4) {
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i4 = this.b;
                b = c(bArr3[i4], bArr3[i4 + 1], bArr3[i4 + 2], bArr3[i4 + 3]);
            }
            b2 = o;
            i = b;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char k = k(byteOrder, 0);
            if (!Character.isHighSurrogate(k) || a() < 4) {
                i = k;
                b2 = 2;
            } else {
                i = Character.toCodePoint(k, k(byteOrder, 2));
                b2 = 4;
            }
        }
        return (i << 8) | b2;
    }

    private byte o() {
        byte b = this.a[this.b];
        if ((b & 128) == 0) {
            return (byte) 1;
        }
        if ((b & 224) == 192 && a() >= 2 && i(this.a[this.b + 1])) {
            return (byte) 2;
        }
        if ((this.a[this.b] & 240) == 224 && a() >= 3 && i(this.a[this.b + 1]) && i(this.a[this.b + 2])) {
            return (byte) 3;
        }
        return ((this.a[this.b] & 248) == 240 && a() >= 4 && i(this.a[this.b + 1]) && i(this.a[this.b + 2]) && i(this.a[this.b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char r(Charset charset, char[] cArr) {
        int m;
        if (a() < h(charset) || (m = m(charset)) == 0) {
            return (char) 0;
        }
        int a = ax.u7.j.a(m >>> 8);
        if (Character.isSupplementaryCodePoint(a)) {
            return (char) 0;
        }
        char a2 = C3214b.a(a);
        if (!C3214b.b(cArr, a2)) {
            return (char) 0;
        }
        this.b += C3218f.e(m & 255);
        return a2;
    }

    public long A() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public short B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long C() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8);
        this.b = i + 3;
        long j2 = j | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r2] & 255) << 24) | j2;
    }

    public int D() {
        int z = z();
        if (z >= 0) {
            return z;
        }
        throw new IllegalStateException("Top bit not zero: " + z);
    }

    public int E() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long F() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.b = i + 3;
        long j2 = j | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j3 = j2 | ((bArr[r2] & 255) << 32);
        this.b = i + 5;
        long j4 = j3 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j5 = j4 | ((bArr[r2] & 255) << 16);
        this.b = i + 7;
        long j6 = j5 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r2] & 255) | j6;
    }

    public String G() {
        return s((char) 0);
    }

    public String H(int i) {
        if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String I = d0.I(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return I;
    }

    public short I() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String J(int i) {
        return K(i, StandardCharsets.UTF_8);
    }

    public String K(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int L() {
        return (M() << 21) | (M() << 14) | (M() << 7) | M();
    }

    public int M() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int N() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public long O() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.b = i + 3;
        long j2 = j | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r2] & 255) | j2;
    }

    public int P() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int Q() {
        int v = v();
        if (v >= 0) {
            return v;
        }
        throw new IllegalStateException("Top bit not zero: " + v);
    }

    public int R() {
        return C3218f.e(S());
    }

    public long S() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long M = M();
            j |= (127 & M) << (i * 7);
            if ((M & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public long T() {
        long F = F();
        if (F >= 0) {
            return F;
        }
        throw new IllegalStateException("Top bit not zero: " + F);
    }

    public int U() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long V() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public Charset W() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void X(int i) {
        Z(b() < i ? new byte[i] : this.a, i);
    }

    public void Y(byte[] bArr) {
        Z(bArr, bArr.length);
    }

    public void Z(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public int a() {
        return Math.max(this.c - this.b, 0);
    }

    public void a0(int i) {
        C0968a.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public int b() {
        return this.a.length;
    }

    public void b0(int i) {
        C0968a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void c0(int i) {
        b0(this.b + i);
    }

    public void d(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public void d0() {
        while ((M() & 128) != 0) {
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
        if (m(charset) != 0) {
            return C3218f.e(r3 >>> 8);
        }
        return 1114112;
    }

    public int n() {
        return this.a[this.b] & 255;
    }

    public void p(F f2, int i) {
        q(f2.a, 0, i);
        f2.p(0);
    }

    public void q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public String s(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != c) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String I = d0.I(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return I;
    }

    public double t() {
        return Double.longBitsToDouble(F());
    }

    public float u() {
        return Float.intBitsToFloat(v());
    }

    public int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public String x() {
        return y(StandardCharsets.UTF_8);
    }

    public String y(Charset charset) {
        C0968a.b(f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            W();
        }
        String K = K(e(charset) - this.b, charset);
        if (this.b == this.c) {
            return K;
        }
        e0(charset);
        return K;
    }

    public int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public G(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public G(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public G(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
