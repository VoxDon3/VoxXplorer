package ax.s7;

import ax.q7.n;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: ax.s7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3054a {
    private static final AbstractC3054a a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final AbstractC3054a b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final AbstractC3054a c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final AbstractC3054a d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final AbstractC3054a e = new b("base16()", "0123456789ABCDEF");

    /* renamed from: ax.s7.a$a, reason: collision with other inner class name */
    static final class C0451a {
        private final String a;
        private final char[] b;
        final int c;
        final int d;
        final int e;
        final int f;
        private final byte[] g;
        private final boolean[] h;
        private final boolean i;

        C0451a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                boolean z = true;
                n.f(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                n.f(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        int c(char c) throws d {
            if (c > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            byte b = this.g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            throw new d("Unrecognized character: " + c);
        }

        char d(int i) {
            return this.b[i];
        }

        boolean e(int i) {
            return this.h[i % this.e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0451a) {
                C0451a c0451a = (C0451a) obj;
                if (this.i == c0451a.i && Arrays.equals(this.b, c0451a.b)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(char c) {
            byte[] bArr = this.g;
            return c < bArr.length && bArr[c] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
        }

        public String toString() {
            return this.a;
        }

        private C0451a(String str, char[] cArr, byte[] bArr, boolean z) {
            this.a = (String) n.n(str);
            this.b = (char[]) n.n(cArr);
            try {
                int e = ax.t7.c.e(cArr.length, RoundingMode.UNNECESSARY);
                this.d = e;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(e);
                int i = 1 << (3 - numberOfTrailingZeros);
                this.e = i;
                this.f = e >> numberOfTrailingZeros;
                this.c = cArr.length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f; i2++) {
                    zArr[ax.t7.c.b(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.h = zArr;
                this.i = z;
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
            }
        }
    }

    /* renamed from: ax.s7.a$b */
    private static final class b extends e {
        final char[] h;

        b(String str, String str2) {
            this(new C0451a(str, str2.toCharArray()));
        }

        @Override // ax.s7.AbstractC3054a.e, ax.s7.AbstractC3054a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            n.n(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f.c(charSequence.charAt(i)) << 4) | this.f.c(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        private b(C0451a c0451a) {
            super(c0451a, null);
            this.h = new char[512];
            n.d(c0451a.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.h[i] = c0451a.d(i >>> 4);
                this.h[i | 256] = c0451a.d(i & 15);
            }
        }
    }

    /* renamed from: ax.s7.a$c */
    private static final class c extends e {
        c(String str, String str2, Character ch) {
            this(new C0451a(str, str2.toCharArray()), ch);
        }

        @Override // ax.s7.AbstractC3054a.e, ax.s7.AbstractC3054a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            n.n(bArr);
            CharSequence g = g(charSequence);
            if (!this.f.e(g.length())) {
                throw new d("Invalid input length " + g.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                int i3 = i + 2;
                int c = (this.f.c(g.charAt(i)) << 18) | (this.f.c(g.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (c >>> 16);
                if (i3 < g.length()) {
                    int i5 = i + 3;
                    int c2 = c | (this.f.c(g.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((c2 >>> 8) & 255);
                    if (i5 < g.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((c2 | this.f.c(g.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        private c(C0451a c0451a, Character ch) {
            super(c0451a, ch);
            n.d(c0451a.b.length == 64);
        }
    }

    /* renamed from: ax.s7.a$d */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* renamed from: ax.s7.a$e */
    private static class e extends AbstractC3054a {
        final C0451a f;
        final Character g;

        e(String str, String str2, Character ch) {
            this(new C0451a(str, str2.toCharArray()), ch);
        }

        @Override // ax.s7.AbstractC3054a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            C0451a c0451a;
            n.n(bArr);
            CharSequence g = g(charSequence);
            if (!this.f.e(g.length())) {
                throw new d("Invalid input length " + g.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    c0451a = this.f;
                    if (i3 >= c0451a.e) {
                        break;
                    }
                    j <<= c0451a.d;
                    if (i + i3 < g.length()) {
                        j |= this.f.c(g.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = c0451a.f;
                int i6 = (i5 * 8) - (i4 * c0451a.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f.e;
            }
            return i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f.equals(eVar.f) && Objects.equals(this.g, eVar.g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.s7.AbstractC3054a
        int f(int i) {
            return (int) (((this.f.d * i) + 7) / 8);
        }

        @Override // ax.s7.AbstractC3054a
        CharSequence g(CharSequence charSequence) {
            n.n(charSequence);
            Character ch = this.g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public int hashCode() {
            return this.f.hashCode() ^ Objects.hashCode(this.g);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f);
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        e(C0451a c0451a, Character ch) {
            this.f = (C0451a) n.n(c0451a);
            n.j(ch == null || !c0451a.f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.g = ch;
        }
    }

    AbstractC3054a() {
    }

    public static AbstractC3054a a() {
        return e;
    }

    private static byte[] e(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    final byte[] c(CharSequence charSequence) throws d {
        CharSequence g = g(charSequence);
        byte[] bArr = new byte[f(g.length())];
        return e(bArr, d(bArr, g));
    }

    abstract int d(byte[] bArr, CharSequence charSequence) throws d;

    abstract int f(int i);

    abstract CharSequence g(CharSequence charSequence);
}
