/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

public abstract class a {
    private static final a a;
    private static final a b;
    private static final a c;
    private static final a d;
    private static final a e;

    static {
        Character c8 = Character.valueOf('=');
        a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", c8);
        b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", c8);
        c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", c8);
        d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", c8);
        e = new b("base16()", "0123456789ABCDEF");
    }

    a() {
    }

    public static a a() {
        return e;
    }

    private static byte[] e(byte[] byArray, int n8) {
        if (n8 == byArray.length) {
            return byArray;
        }
        byte[] byArray2 = new byte[n8];
        System.arraycopy(byArray, 0, byArray2, 0, n8);
        return byArray2;
    }

    public final byte[] b(CharSequence object) {
        try {
            object = this.c((CharSequence)object);
            return object;
        }
        catch (d d8) {
            throw new IllegalArgumentException(d8);
        }
    }

    final byte[] c(CharSequence object) throws d {
        CharSequence charSequence = this.g((CharSequence)object);
        object = new byte[this.f(charSequence.length())];
        return ax.s7.a.e((byte[])object, this.d((byte[])object, charSequence));
    }

    abstract int d(byte[] var1, CharSequence var2) throws d;

    abstract int f(int var1);

    abstract CharSequence g(CharSequence var1);

    static final class a {
        private final String a;
        private final char[] b;
        final int c;
        final int d;
        final int e;
        final int f;
        private final byte[] g;
        private final boolean[] h;
        private final boolean i;

        a(String string, char[] cArray) {
            this(string, cArray, ax.s7.a$a.b(cArray), false);
        }

        private a(String object, char[] cArray, byte[] object2, boolean bl) {
            int n8;
            int n9;
            this.a = n.n(object);
            this.b = n.n(cArray);
            try {
                this.d = n9 = ax.t7.c.e(cArray.length, RoundingMode.UNNECESSARY);
            }
            catch (ArithmeticException arithmeticException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Illegal alphabet length ");
                ((StringBuilder)object2).append(cArray.length);
                throw new IllegalArgumentException(((StringBuilder)object2).toString(), arithmeticException);
            }
            int n10 = Integer.numberOfTrailingZeros(n9);
            this.e = n8 = 1 << 3 - n10;
            this.f = n9 >> n10;
            this.c = cArray.length - 1;
            this.g = (byte[])object2;
            object = new boolean[n8];
            for (n8 = 0; n8 < this.f; ++n8) {
                object[ax.t7.c.b((int)(n8 * 8), (int)this.d, (RoundingMode)RoundingMode.CEILING)] = true;
            }
            this.h = (boolean[])object;
            this.i = bl;
            return;
        }

        private static byte[] b(char[] cArray) {
            byte[] byArray = new byte[128];
            Arrays.fill(byArray, (byte)-1);
            for (int i8 = 0; i8 < cArray.length; ++i8) {
                char c8 = cArray[i8];
                boolean bl = true;
                boolean bl2 = c8 < '\u0080';
                n.f(bl2, "Non-ASCII character: %s", c8);
                bl2 = byArray[c8] == -1 ? bl : false;
                n.f(bl2, "Duplicate character: %s", c8);
                byArray[c8] = (byte)i8;
            }
            return byArray;
        }

        int c(char c8) throws d {
            if (c8 <= '\u007f') {
                byte by = this.g[c8];
                if (by == -1) {
                    if (c8 > ' ' && c8 != '\u007f') {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unrecognized character: ");
                        stringBuilder.append(c8);
                        throw new d(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unrecognized character: 0x");
                    stringBuilder.append(Integer.toHexString(c8));
                    throw new d(stringBuilder.toString());
                }
                return by;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unrecognized character: 0x");
            stringBuilder.append(Integer.toHexString(c8));
            throw new d(stringBuilder.toString());
        }

        char d(int n8) {
            return this.b[n8];
        }

        boolean e(int n8) {
            return this.h[n8 % this.e];
        }

        public boolean equals(Object object) {
            if (object instanceof a) {
                object = (a)object;
                if (this.i == ((a)object).i && Arrays.equals(this.b, ((a)object).b)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(char c8) {
            byte[] byArray = this.g;
            return c8 < byArray.length && byArray[c8] != -1;
        }

        public int hashCode() {
            int n8 = Arrays.hashCode(this.b);
            int n9 = this.i ? 1231 : 1237;
            return n8 + n9;
        }

        public String toString() {
            return this.a;
        }
    }

    private static final class b
    extends e {
        final char[] h = new char[512];

        private b(a a8) {
            super(a8, null);
            int n8 = a8.b.length;
            boolean bl = n8 == 16;
            n.d(bl);
            for (int i8 = 0; i8 < 256; ++i8) {
                this.h[i8] = a8.d(i8 >>> 4);
                this.h[i8 | 0x100] = a8.d(i8 & 0xF);
            }
        }

        b(String string, String string2) {
            this(new a(string, string2.toCharArray()));
        }

        @Override
        int d(byte[] object, CharSequence charSequence) throws d {
            n.n(object);
            if (charSequence.length() % 2 != 1) {
                int n8 = 0;
                int n9 = 0;
                while (n8 < charSequence.length()) {
                    object[n9] = (byte)(this.f.c(charSequence.charAt(n8)) << 4 | this.f.c(charSequence.charAt(n8 + 1)));
                    n8 += 2;
                    ++n9;
                }
                return n9;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid input length ");
            ((StringBuilder)object).append(charSequence.length());
            throw new d(((StringBuilder)object).toString());
        }
    }

    private static final class c
    extends e {
        private c(a a8, Character c8) {
            super(a8, c8);
            boolean bl = a8.b.length == 64;
            n.d(bl);
        }

        c(String string, String string2, Character c8) {
            this(new a(string, string2.toCharArray()), c8);
        }

        @Override
        int d(byte[] object, CharSequence charSequence) throws d {
            n.n(object);
            charSequence = this.g(charSequence);
            if (this.f.e(charSequence.length())) {
                int n8 = 0;
                int n9 = 0;
                while (n8 < charSequence.length()) {
                    int n10 = this.f.c(charSequence.charAt(n8));
                    a a8 = this.f;
                    int n11 = n8 + 2;
                    int n12 = n10 << 18 | a8.c(charSequence.charAt(n8 + 1)) << 12;
                    int n13 = n9 + 1;
                    object[n9] = (byte)(n12 >>> 16);
                    if (n11 < charSequence.length()) {
                        a8 = this.f;
                        n10 = n8 + 3;
                        n12 |= a8.c(charSequence.charAt(n11)) << 6;
                        n11 = n9 + 2;
                        object[n13] = (byte)(n12 >>> 8 & 0xFF);
                        if (n10 < charSequence.length()) {
                            a8 = this.f;
                            n8 += 4;
                            n10 = a8.c(charSequence.charAt(n10));
                            n9 += 3;
                            object[n11] = (byte)((n12 | n10) & 0xFF);
                            continue;
                        }
                        n9 = n11;
                        n8 = n10;
                        continue;
                    }
                    n9 = n13;
                    n8 = n11;
                }
                return n9;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid input length ");
            ((StringBuilder)object).append(charSequence.length());
            throw new d(((StringBuilder)object).toString());
        }
    }

    public static final class d
    extends IOException {
        d(String string) {
            super(string);
        }
    }

    private static class e
    extends a {
        final a f;
        final Character g;

        e(a a8, Character c8) {
            this.f = n.n(a8);
            boolean bl = c8 == null || !a8.f(c8.charValue());
            n.j(bl, "Padding character %s was already in alphabet", c8);
            this.g = c8;
        }

        e(String string, String string2, Character c8) {
            this(new a(string, string2.toCharArray()), c8);
        }

        @Override
        int d(byte[] object, CharSequence charSequence) throws d {
            n.n(object);
            charSequence = this.g(charSequence);
            if (this.f.e(charSequence.length())) {
                int n8 = 0;
                for (int i8 = 0; i8 < charSequence.length(); i8 += this.f.e) {
                    int n9;
                    a a8;
                    long l8 = 0L;
                    int n10 = 0;
                    int n11 = 0;
                    while (true) {
                        long l9;
                        a8 = this.f;
                        if (n10 >= a8.e) break;
                        l8 = l9 = l8 << a8.d;
                        n9 = n11;
                        if (i8 + n10 < charSequence.length()) {
                            l8 = l9 | (long)this.f.c(charSequence.charAt(n11 + i8));
                            n9 = n11 + 1;
                        }
                        ++n10;
                        n11 = n9;
                    }
                    n10 = a8.f;
                    int n12 = a8.d;
                    n9 = (n10 - 1) * 8;
                    while (n9 >= n10 * 8 - n11 * n12) {
                        object[n8] = (byte)(l8 >>> n9 & 0xFFL);
                        n9 -= 8;
                        ++n8;
                    }
                }
                return n8;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid input length ");
            ((StringBuilder)object).append(charSequence.length());
            throw new d(((StringBuilder)object).toString());
        }

        public boolean equals(Object object) {
            if (object instanceof e) {
                object = (e)object;
                if (this.f.equals(((e)object).f) && j.Objects.equals((Object)this.g, (Object)((e)object).g)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        int f(int n8) {
            return (int)(((long)this.f.d * (long)n8 + 7L) / 8L);
        }

        @Override
        CharSequence g(CharSequence charSequence) {
            int n8;
            n.n(charSequence);
            Character c8 = this.g;
            if (c8 == null) {
                return charSequence;
            }
            char c9 = c8.charValue();
            for (n8 = charSequence.length() - 1; n8 >= 0 && charSequence.charAt(n8) == c9; --n8) {
            }
            return charSequence.subSequence(0, n8 + 1);
        }

        public int hashCode() {
            return this.f.hashCode() ^ j.Objects.hashCode((Object)this.g);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
            stringBuilder.append(this.f);
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    stringBuilder.append(".omitPadding()");
                } else {
                    stringBuilder.append(".withPadChar('");
                    stringBuilder.append(this.g);
                    stringBuilder.append("')");
                }
            }
            return stringBuilder.toString();
        }
    }
}

