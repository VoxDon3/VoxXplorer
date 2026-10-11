/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.s0;

final class t0 {
    private static final b a;

    static {
        b b8 = e.e() && !ax.r0.d.c() ? new e() : new c();
        a = b8;
    }

    static String e(byte[] byArray, int n8, int n9) throws B {
        return a.a(byArray, n8, n9);
    }

    static int f(CharSequence charSequence, byte[] byArray, int n8, int n9) {
        return a.b(charSequence, byArray, n8, n9);
    }

    static int g(CharSequence charSequence) {
        int n8;
        int n9;
        block3: {
            int n10;
            n9 = charSequence.length();
            for (n10 = 0; n10 < n9 && charSequence.charAt(n10) < '\u0080'; ++n10) {
            }
            int n11 = n9;
            while (true) {
                n8 = n11;
                if (n10 >= n9) break block3;
                n8 = charSequence.charAt(n10);
                if (n8 >= 2048) break;
                n11 += 127 - n8 >>> 31;
                ++n10;
            }
            n8 = n11 + t0.h(charSequence, n10);
        }
        if (n8 >= n9) {
            return n8;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("UTF-8 length does not fit in int: ");
        ((StringBuilder)charSequence).append((long)n8 + 0x100000000L);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    private static int h(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        int n10 = 0;
        while (n8 < n9) {
            int n11;
            char c8 = charSequence.charAt(n8);
            if (c8 < '\u0800') {
                n10 += 127 - c8 >>> 31;
                n11 = n8;
            } else {
                int n12;
                n10 = n12 = n10 + 2;
                n11 = n8;
                if ('\ud800' <= c8) {
                    n10 = n12;
                    n11 = n8;
                    if (c8 <= '\udfff') {
                        if (Character.codePointAt(charSequence, n8) >= 65536) {
                            n11 = n8 + 1;
                            n10 = n12;
                        } else {
                            throw new d(n8, n9);
                        }
                    }
                }
            }
            n8 = n11 + 1;
        }
        return n10;
    }

    private static int i(int n8) {
        int n9 = n8;
        if (n8 > -12) {
            n9 = -1;
        }
        return n9;
    }

    private static int j(int n8, int n9) {
        if (n8 <= -12 && n9 <= -65) {
            return n8 ^ n9 << 8;
        }
        return -1;
    }

    private static int k(int n8, int n9, int n10) {
        if (n8 <= -12 && n9 <= -65 && n10 <= -65) {
            return n8 ^ n9 << 8 ^ n10 << 16;
        }
        return -1;
    }

    private static int l(byte[] byArray, int n8, int n9) {
        byte by = byArray[n8 - 1];
        if ((n9 -= n8) != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    return t0.k(by, byArray[n8], byArray[n8 + 1]);
                }
                throw new AssertionError();
            }
            return t0.j(by, byArray[n8]);
        }
        return t0.i(by);
    }

    public static boolean m(byte[] byArray) {
        return a.c(byArray, 0, byArray.length);
    }

    public static boolean n(byte[] byArray, int n8, int n9) {
        return a.c(byArray, n8, n9);
    }

    private static class a {
        private static void h(byte by, byte by2, byte by3, byte by4, char[] cArray, int n8) throws B {
            if (!(ax.r0.t0$a.m(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || ax.r0.t0$a.m(by3) || ax.r0.t0$a.m(by4))) {
                by = (byte)((by & 7) << 18 | ax.r0.t0$a.r(by2) << 12 | ax.r0.t0$a.r(by3) << 6 | ax.r0.t0$a.r(by4));
                cArray[n8] = ax.r0.t0$a.l(by);
                cArray[n8 + 1] = ax.r0.t0$a.q(by);
                return;
            }
            throw B.c();
        }

        private static void i(byte by, char[] cArray, int n8) {
            cArray[n8] = (char)by;
        }

        private static void j(byte by, byte by2, byte by3, char[] cArray, int n8) throws B {
            if (!(ax.r0.t0$a.m(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || ax.r0.t0$a.m(by3))) {
                cArray[n8] = (char)((by & 0xF) << 12 | ax.r0.t0$a.r(by2) << 6 | ax.r0.t0$a.r(by3));
                return;
            }
            throw B.c();
        }

        private static void k(byte by, byte by2, char[] cArray, int n8) throws B {
            if (by >= -62 && !ax.r0.t0$a.m(by2)) {
                cArray[n8] = (char)((by & 0x1F) << 6 | ax.r0.t0$a.r(by2));
                return;
            }
            throw B.c();
        }

        private static char l(int n8) {
            return (char)((n8 >>> 10) + 55232);
        }

        private static boolean m(byte by) {
            return by > -65;
        }

        private static boolean n(byte by) {
            return by >= 0;
        }

        private static boolean o(byte by) {
            return by < -16;
        }

        private static boolean p(byte by) {
            return by < -32;
        }

        private static char q(int n8) {
            return (char)((n8 & 0x3FF) + 56320);
        }

        private static int r(byte by) {
            return by & 0x3F;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] var1, int var2, int var3) throws B;

        abstract int b(CharSequence var1, byte[] var2, int var3, int var4);

        final boolean c(byte[] byArray, int n8, int n9) {
            return this.d(0, byArray, n8, n9) == 0;
        }

        abstract int d(int var1, byte[] var2, int var3, int var4);
    }

    static final class c
    extends b {
        c() {
        }

        private static int e(byte[] byArray, int n8, int n9) {
            while (n8 < n9 && byArray[n8] >= 0) {
                ++n8;
            }
            if (n8 >= n9) {
                return 0;
            }
            return c.f(byArray, n8, n9);
        }

        private static int f(byte[] byArray, int n8, int n9) {
            int n10;
            while ((n10 = n8) < n9) {
                int n11 = n10 + 1;
                n8 = byArray[n10];
                if (n8 < 0) {
                    if (n8 < -32) {
                        if (n11 >= n9) {
                            return n8;
                        }
                        if (n8 >= -62) {
                            n8 = n10 + 2;
                            if (byArray[n11] <= -65) continue;
                        }
                        return -1;
                    }
                    if (n8 < -16) {
                        if (n11 >= n9 - 1) {
                            return t0.l(byArray, n11, n9);
                        }
                        if (!((n11 = byArray[n11]) > -65 || n8 == -32 && n11 < -96 || n8 == -19 && n11 >= -96)) {
                            n8 = n10 + 3;
                            if (byArray[n10 + 2] <= -65) continue;
                        }
                        return -1;
                    }
                    if (n11 >= n9 - 2) {
                        return t0.l(byArray, n11, n9);
                    }
                    if ((n11 = byArray[n11]) <= -65 && (n8 << 28) + (n11 + 112) >> 30 == 0 && byArray[n10 + 2] <= -65) {
                        n8 = n10 + 4;
                        if (byArray[n10 + 3] <= -65) continue;
                    }
                    return -1;
                }
                n8 = n11;
            }
            return 0;
        }

        @Override
        String a(byte[] byArray, int n8, int n9) throws B {
            if ((n8 | n9 | byArray.length - n8 - n9) >= 0) {
                byte by;
                int n10 = n8 + n9;
                char[] cArray = new char[n9];
                n9 = 0;
                while (n8 < n10 && ax.r0.t0$a.n(by = byArray[n8])) {
                    ++n8;
                    ax.r0.t0$a.i(by, cArray, n9);
                    ++n9;
                }
                while (n8 < n10) {
                    byte by2;
                    int n11 = n8 + 1;
                    by = byArray[n8];
                    if (ax.r0.t0$a.n(by)) {
                        int n12 = n9 + 1;
                        ax.r0.t0$a.i(by, cArray, n9);
                        n8 = n11;
                        n9 = n12;
                        while (n8 < n10 && ax.r0.t0$a.n(by = byArray[n8])) {
                            ++n8;
                            ax.r0.t0$a.i(by, cArray, n9);
                            ++n9;
                        }
                        continue;
                    }
                    if (ax.r0.t0$a.p(by)) {
                        if (n11 < n10) {
                            n8 += 2;
                            ax.r0.t0$a.k(by, byArray[n11], cArray, n9);
                            ++n9;
                            continue;
                        }
                        throw B.c();
                    }
                    if (ax.r0.t0$a.o(by)) {
                        if (n11 < n10 - 1) {
                            by2 = byArray[n11];
                            n11 = n8 + 3;
                            ax.r0.t0$a.j(by, by2, byArray[n8 + 2], cArray, n9);
                            ++n9;
                            n8 = n11;
                            continue;
                        }
                        throw B.c();
                    }
                    if (n11 < n10 - 2) {
                        by2 = byArray[n11];
                        byte by3 = byArray[n8 + 2];
                        n11 = n8 + 4;
                        ax.r0.t0$a.h(by, by2, by3, byArray[n8 + 3], cArray, n9);
                        n9 += 2;
                        n8 = n11;
                        continue;
                    }
                    throw B.c();
                }
                return new String(cArray, 0, n9);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", byArray.length, n8, n9));
        }

        @Override
        int b(CharSequence charSequence, byte[] byArray, int n8, int n9) {
            int n10;
            int n11;
            int n12 = charSequence.length();
            int n13 = n9 + n8;
            for (n9 = 0; n9 < n12 && (n11 = n9 + n8) < n13 && (n10 = charSequence.charAt(n9)) < 128; ++n9) {
                byArray[n11] = (byte)n10;
            }
            if (n9 == n12) {
                return n8 + n12;
            }
            n8 += n9;
            while (n9 < n12) {
                char c8;
                block11: {
                    block12: {
                        block13: {
                            block8: {
                                block10: {
                                    block9: {
                                        block7: {
                                            c8 = charSequence.charAt(n9);
                                            if (c8 >= '\u0080' || n8 >= n13) break block7;
                                            byArray[n8] = (byte)c8;
                                            ++n8;
                                            break block8;
                                        }
                                        if (c8 >= '\u0800' || n8 > n13 - 2) break block9;
                                        byArray[n8] = (byte)(c8 >>> 6 | 0x3C0);
                                        n10 = n8 + 2;
                                        byArray[n8 + 1] = (byte)(c8 & 0x3F | 0x80);
                                        n8 = n10;
                                        break block8;
                                    }
                                    if (c8 >= '\ud800' && '\udfff' >= c8 || n8 > n13 - 3) break block10;
                                    byArray[n8] = (byte)(c8 >>> 12 | 0x1E0);
                                    byArray[n8 + 1] = (byte)(c8 >>> 6 & 0x3F | 0x80);
                                    n10 = n8 + 3;
                                    byArray[n8 + 2] = (byte)(c8 & 0x3F | 0x80);
                                    n8 = n10;
                                    break block8;
                                }
                                if (n8 > n13 - 4) break block11;
                                n10 = n9 + 1;
                                if (n10 == charSequence.length()) break block12;
                                char c9 = charSequence.charAt(n10);
                                if (!Character.isSurrogatePair(c8, c9)) break block13;
                                n9 = Character.toCodePoint(c8, c9);
                                byArray[n8] = (byte)(n9 >>> 18 | 0xF0);
                                byArray[n8 + 1] = (byte)(n9 >>> 12 & 0x3F | 0x80);
                                byArray[n8 + 2] = (byte)(n9 >>> 6 & 0x3F | 0x80);
                                n11 = n8 + 4;
                                byArray[n8 + 3] = (byte)(n9 & 0x3F | 0x80);
                                n9 = n10;
                                n8 = n11;
                            }
                            ++n9;
                            continue;
                        }
                        n9 = n10;
                    }
                    throw new d(n9 - 1, n12);
                }
                if (!('\ud800' > c8 || c8 > '\udfff' || (n10 = n9 + 1) != charSequence.length() && Character.isSurrogatePair(c8, charSequence.charAt(n10)))) {
                    throw new d(n9, n12);
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Failed writing ");
                ((StringBuilder)charSequence).append(c8);
                ((StringBuilder)charSequence).append(" at index ");
                ((StringBuilder)charSequence).append(n8);
                throw new ArrayIndexOutOfBoundsException(((StringBuilder)charSequence).toString());
            }
            return n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        int d(int n8, byte[] byArray, int n9, int n10) {
            int n11;
            byte by;
            int n12;
            block17: {
                block18: {
                    block16: {
                        block15: {
                            n12 = n9;
                            if (n8 == 0) return c.e(byArray, n12, n10);
                            if (n9 >= n10) {
                                return n8;
                            }
                            by = (byte)n8;
                            if (by >= -32) break block15;
                            if (by < -62) return -1;
                            n8 = n9 + 1;
                            if (byArray[n9] > -65) {
                                return -1;
                            }
                            break block16;
                        }
                        if (by >= -16) break block17;
                        byte by2 = (byte)(~(n8 >> 8));
                        n8 = by2;
                        n12 = n9;
                        if (by2 == 0) {
                            n12 = n9 + 1;
                            n8 = byArray[n9];
                            if (n12 >= n10) {
                                return t0.j(by, n8);
                            }
                        }
                        if (n8 > -65) return -1;
                        if (by == -32) {
                            if (n8 < -96) return -1;
                        }
                        if (by == -19) {
                            if (n8 >= -96) return -1;
                        }
                        n8 = n12 + 1;
                        if (byArray[n12] > -65) break block18;
                    }
                    n12 = n8;
                    return c.e(byArray, n12, n10);
                }
                return -1;
            }
            n12 = (byte)(~(n8 >> 8));
            if (n12 == 0) {
                n8 = n9 + 1;
                n12 = byArray[n9];
                if (n8 >= n10) {
                    return t0.j(by, n12);
                }
                n9 = 0;
            } else {
                n11 = n8 >> 16;
                n8 = n9;
                n9 = n11;
            }
            n11 = n8;
            int n13 = n9;
            if (n9 == 0) {
                n11 = n8 + 1;
                n13 = byArray[n8];
                if (n11 >= n10) {
                    return t0.k(by, n12, n13);
                }
            }
            if (n12 > -65) return -1;
            if ((by << 28) + (n12 + 112) >> 30 != 0) return -1;
            if (n13 > -65) return -1;
            n12 = n11 + 1;
            if (byArray[n11] <= -65) return c.e(byArray, n12, n10);
            return -1;
        }
    }

    static class d
    extends IllegalArgumentException {
        d(int n8, int n9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(n8);
            stringBuilder.append(" of ");
            stringBuilder.append(n9);
            super(stringBuilder.toString());
        }
    }

    static final class e
    extends b {
        e() {
        }

        static boolean e() {
            return s0.C() && s0.D();
        }

        private static int f(byte[] byArray, long l8, int n8) {
            int n9 = e.g(byArray, l8, n8);
            n8 -= n9;
            l8 += (long)n9;
            while (true) {
                long l9;
                int n10 = 0;
                n9 = n8;
                n8 = n10;
                while (true) {
                    l9 = l8;
                    if (n9 <= 0) break;
                    l9 = l8 + 1L;
                    n8 = s0.s(byArray, l8);
                    if (n8 < 0) break;
                    --n9;
                    l8 = l9;
                }
                if (n9 == 0) {
                    return 0;
                }
                n10 = n9 - 1;
                if (n8 < -32) {
                    if (n10 == 0) {
                        return n8;
                    }
                    n9 -= 2;
                    if (n8 >= -62 && s0.s(byArray, l9) <= -65) {
                        l8 = 1L + l9;
                        n8 = n9;
                        continue;
                    }
                    return -1;
                }
                if (n8 < -16) {
                    if (n10 < 2) {
                        return e.h(byArray, n8, l9, n10);
                    }
                    n9 -= 3;
                    n10 = s0.s(byArray, l9);
                    if (!(n10 > -65 || n8 == -32 && n10 < -96 || n8 == -19 && n10 >= -96)) {
                        l8 = l9 + 2L;
                        n8 = n9;
                        if (s0.s(byArray, 1L + l9) <= -65) continue;
                    }
                    return -1;
                }
                if (n10 < 3) {
                    return e.h(byArray, n8, l9, n10);
                }
                n9 -= 4;
                n10 = s0.s(byArray, l9);
                if (n10 > -65 || (n8 << 28) + (n10 + 112) >> 30 != 0 || s0.s(byArray, 1L + l9) > -65) break;
                l8 = l9 + 3L;
                n8 = n9;
                if (s0.s(byArray, 2L + l9) > -65) break;
            }
            return -1;
        }

        private static int g(byte[] byArray, long l8, int n8) {
            int n9 = 0;
            if (n8 < 16) {
                return 0;
            }
            while (n9 < n8) {
                if (s0.s(byArray, l8) < 0) {
                    return n9;
                }
                ++n9;
                l8 = 1L + l8;
            }
            return n8;
        }

        private static int h(byte[] byArray, int n8, long l8, int n9) {
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 == 2) {
                        return t0.k(n8, s0.s(byArray, l8), s0.s(byArray, l8 + 1L));
                    }
                    throw new AssertionError();
                }
                return t0.j(n8, s0.s(byArray, l8));
            }
            return t0.i(n8);
        }

        @Override
        String a(byte[] byArray, int n8, int n9) throws B {
            if ((n8 | n9 | byArray.length - n8 - n9) >= 0) {
                byte by;
                int n10 = n8 + n9;
                char[] cArray = new char[n9];
                n9 = 0;
                while (n8 < n10 && ax.r0.t0$a.n(by = s0.s(byArray, n8))) {
                    ++n8;
                    ax.r0.t0$a.i(by, cArray, n9);
                    ++n9;
                }
                while (n8 < n10) {
                    byte by2;
                    int n11 = n8 + 1;
                    by = s0.s(byArray, n8);
                    if (ax.r0.t0$a.n(by)) {
                        int n12 = n9 + 1;
                        ax.r0.t0$a.i(by, cArray, n9);
                        n8 = n11;
                        n9 = n12;
                        while (n8 < n10 && ax.r0.t0$a.n(by = s0.s(byArray, n8))) {
                            ++n8;
                            ax.r0.t0$a.i(by, cArray, n9);
                            ++n9;
                        }
                        continue;
                    }
                    if (ax.r0.t0$a.p(by)) {
                        if (n11 < n10) {
                            n8 += 2;
                            ax.r0.t0$a.k(by, s0.s(byArray, n11), cArray, n9);
                            ++n9;
                            continue;
                        }
                        throw B.c();
                    }
                    if (ax.r0.t0$a.o(by)) {
                        if (n11 < n10 - 1) {
                            by2 = s0.s(byArray, n11);
                            n11 = n8 + 3;
                            ax.r0.t0$a.j(by, by2, s0.s(byArray, n8 + 2), cArray, n9);
                            ++n9;
                            n8 = n11;
                            continue;
                        }
                        throw B.c();
                    }
                    if (n11 < n10 - 2) {
                        byte by3 = s0.s(byArray, n11);
                        by2 = s0.s(byArray, n8 + 2);
                        n11 = n8 + 4;
                        ax.r0.t0$a.h(by, by3, by2, s0.s(byArray, n8 + 3), cArray, n9);
                        n9 += 2;
                        n8 = n11;
                        continue;
                    }
                    throw B.c();
                }
                return new String(cArray, 0, n9);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", byArray.length, n8, n9));
        }

        @Override
        int b(CharSequence charSequence, byte[] object, int n8, int n9) {
            int n10;
            block7: {
                long l8;
                long l9 = n8;
                long l10 = (long)n9 + l9;
                n10 = charSequence.length();
                if (n10 > n9 || ((byte[])object).length - n9 < n8) break block7;
                n9 = 0;
                while (true) {
                    l8 = 1L;
                    if (n9 >= n10 || (n8 = (int)charSequence.charAt(n9)) >= 128) break;
                    s0.H((byte[])object, l9, (byte)n8);
                    ++n9;
                    l9 = 1L + l9;
                }
                long l11 = l9;
                if (n9 == n10) {
                    return (int)l9;
                }
                for (n8 = n9; n8 < n10; ++n8) {
                    char c8;
                    block12: {
                        block13: {
                            block14: {
                                block9: {
                                    block11: {
                                        block10: {
                                            block8: {
                                                c8 = charSequence.charAt(n8);
                                                if (c8 >= '\u0080' || l11 >= l10) break block8;
                                                s0.H((byte[])object, l11, (byte)c8);
                                                l9 = l11 + l8;
                                                break block9;
                                            }
                                            if (c8 >= '\u0800' || l11 > l10 - 2L) break block10;
                                            s0.H((byte[])object, l11, (byte)(c8 >>> 6 | 0x3C0));
                                            l9 = l11 + 2L;
                                            s0.H((byte[])object, l11 + l8, (byte)(c8 & 0x3F | 0x80));
                                            break block9;
                                        }
                                        if (c8 >= '\ud800' && '\udfff' >= c8) break block11;
                                        if (l11 > l10 - 3L) break block11;
                                        s0.H((byte[])object, l11, (byte)(c8 >>> 12 | 0x1E0));
                                        s0.H((byte[])object, l11 + l8, (byte)(c8 >>> 6 & 0x3F | 0x80));
                                        l9 = l11 + 3L;
                                        s0.H((byte[])object, l11 + 2L, (byte)(c8 & 0x3F | 0x80));
                                        break block9;
                                    }
                                    if (l11 > l10 - 4L) break block12;
                                    n9 = n8 + 1;
                                    if (n9 == n10) break block13;
                                    char c9 = charSequence.charAt(n9);
                                    if (!Character.isSurrogatePair(c8, c9)) break block14;
                                    n8 = Character.toCodePoint(c8, c9);
                                    s0.H((byte[])object, l11, (byte)(n8 >>> 18 | 0xF0));
                                    s0.H((byte[])object, l11 + l8, (byte)(n8 >>> 12 & 0x3F | 0x80));
                                    s0.H((byte[])object, l11 + 2L, (byte)(n8 >>> 6 & 0x3F | 0x80));
                                    l9 = l11 + 4L;
                                    s0.H((byte[])object, l11 + 3L, (byte)(n8 & 0x3F | 0x80));
                                    n8 = n9;
                                }
                                l11 = l9;
                                continue;
                            }
                            n8 = n9;
                        }
                        throw new d(n8 - 1, n10);
                    }
                    if (!('\ud800' > c8 || c8 > '\udfff' || (n9 = n8 + 1) != n10 && Character.isSurrogatePair(c8, charSequence.charAt(n9)))) {
                        throw new d(n8, n10);
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Failed writing ");
                    ((StringBuilder)charSequence).append(c8);
                    ((StringBuilder)charSequence).append(" at index ");
                    ((StringBuilder)charSequence).append(l11);
                    throw new ArrayIndexOutOfBoundsException(((StringBuilder)charSequence).toString());
                }
                return (int)l11;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed writing ");
            ((StringBuilder)object).append(charSequence.charAt(n10 - 1));
            ((StringBuilder)object).append(" at index ");
            ((StringBuilder)object).append(n8 + n9);
            throw new ArrayIndexOutOfBoundsException(((StringBuilder)object).toString());
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        int d(int n8, byte[] byArray, int n9, int n10) {
            block20: {
                long l8;
                long l9;
                long l10;
                block19: {
                    byte by;
                    int n11;
                    block18: {
                        n11 = 0;
                        if ((n9 | n10 | byArray.length - n10) < 0) {
                            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", byArray.length, n9, n10));
                        }
                        l10 = n9;
                        l9 = n10;
                        l8 = l10;
                        if (n8 == 0) return e.f(byArray, l8, (int)(l9 - l8));
                        if (l10 >= l9) {
                            return n8;
                        }
                        by = (byte)n8;
                        if (by < -32) {
                            if (by < -62) return -1;
                            if (s0.s(byArray, l10) > -65) {
                                return -1;
                            }
                            l8 = 1L + l10;
                            return e.f(byArray, l8, (int)(l9 - l8));
                        }
                        if (by >= -16) break block18;
                        n9 = (byte)(~(n8 >> 8));
                        l8 = l10;
                        n8 = n9;
                        if (n9 == 0) {
                            l8 = l10 + 1L;
                            n8 = s0.s(byArray, l10);
                            if (l8 >= l9) {
                                return t0.j(by, n8);
                            }
                        }
                        if (n8 > -65) return -1;
                        if (by == -32) {
                            if (n8 < -96) return -1;
                        }
                        if (by == -19) {
                            if (n8 >= -96) return -1;
                        }
                        l10 = l8 + 1L;
                        if (s0.s(byArray, l8) > -65) {
                            return -1;
                        }
                        break block19;
                    }
                    n9 = (byte)(~(n8 >> 8));
                    if (n9 == 0) {
                        l8 = l10 + 1L;
                        n9 = s0.s(byArray, l10);
                        if (l8 >= l9) {
                            return t0.j(by, n9);
                        }
                        l10 = l8;
                        n8 = n11;
                    } else {
                        n8 = (byte)(n8 >> 16);
                    }
                    n10 = n8;
                    l8 = l10;
                    if (n8 == 0) {
                        l8 = l10 + 1L;
                        n10 = s0.s(byArray, l10);
                        if (l8 >= l9) {
                            return t0.k(by, n9, n10);
                        }
                    }
                    if (n9 > -65) return -1;
                    if ((by << 28) + (n9 + 112) >> 30 != 0) return -1;
                    if (n10 > -65) return -1;
                    l10 = l8 + 1L;
                    if (s0.s(byArray, l8) > -65) break block20;
                }
                l8 = l10;
                return e.f(byArray, l8, (int)(l9 - l8));
            }
            return -1;
        }
    }
}

