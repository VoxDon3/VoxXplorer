/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

class i {
    public static double a(double d8, double d9, double d10) {
        return d8 * d9 + d10;
    }

    protected static boolean b(char c8) {
        return (char)(c8 - 48) < '\n';
    }

    public static boolean c(CharSequence charSequence, int n8) {
        boolean bl = true;
        for (int i8 = 0; i8 < 8; ++i8) {
            bl &= i.b(charSequence.charAt(i8 + n8));
        }
        return bl;
    }

    public static boolean d(CharSequence charSequence, int n8) {
        boolean bl = true;
        for (int i8 = 0; i8 < 8; ++i8) {
            boolean bl2 = '0' == charSequence.charAt(i8 + n8);
            bl &= bl2;
        }
        return bl;
    }

    public static int e(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    public static int f(CharSequence charSequence, int n8) {
        long l8 = charSequence.charAt(n8);
        long l9 = charSequence.charAt(n8 + 1);
        long l10 = charSequence.charAt(n8 + 2);
        long l11 = charSequence.charAt(n8 + 3);
        long l12 = charSequence.charAt(n8 + 4);
        long l13 = charSequence.charAt(n8 + 5);
        long l14 = charSequence.charAt(n8 + 6);
        return i.g(l8 | l9 << 16 | l10 << 32 | l11 << 48, (long)charSequence.charAt(n8 + 7) << 48 | (l12 | l13 << 16 | l14 << 32));
    }

    public static int g(long l8, long l9) {
        long l10 = l8 - 0x30003000300030L;
        long l11 = l9 - 0x30003000300030L;
        if (((l8 + 0x46004600460046L | l10 | (l9 + 0x46004600460046L | l11)) & 0xFF80FF80FF80FF80L) != 0L) {
            return -1;
        }
        return (int)(l11 * 281475406208040961L >>> 48) + (int)(l10 * 281475406208040961L >>> 48) * 10000;
    }

    public static long h(CharSequence charSequence, int n8) {
        long l8 = charSequence.charAt(n8);
        long l9 = charSequence.charAt(n8 + 1);
        long l10 = charSequence.charAt(n8 + 2);
        long l11 = charSequence.charAt(n8 + 3);
        long l12 = charSequence.charAt(n8 + 4);
        long l13 = charSequence.charAt(n8 + 5);
        long l14 = charSequence.charAt(n8 + 6);
        return i.i(l8 << 48 | l9 << 32 | l10 << 16 | l11, (long)charSequence.charAt(n8 + 7) | (l12 << 48 | l13 << 32 | l14 << 16));
    }

    public static long i(long l8, long l9) {
        return i.l(l8) << 16 | i.l(l9);
    }

    public static int j(CharSequence charSequence, int n8) {
        long l8 = charSequence.charAt(n8);
        long l9 = charSequence.charAt(n8 + 1);
        long l10 = charSequence.charAt(n8 + 2);
        return i.k((long)charSequence.charAt(n8 + 3) << 48 | (l8 | l9 << 16 | l10 << 32));
    }

    public static int k(long l8) {
        long l9 = l8 - 0x30003000300030L;
        if (((l8 + 0x46004600460046L | l9) & 0xFF80FF80FF80FF80L) != 0L) {
            return -1;
        }
        return (int)(l9 * 281475406208040961L >>> 48);
    }

    public static long l(long l8) {
        long l9 = l8 + 9207186978729525190L & 0x8000800080008000L;
        long l10 = l8 - 0x30003000300030L;
        if (l9 != (l8 + 0x7F9F7F9F7F9F7F9FL & 0x8000800080008000L & (0x7FFF7FFF7FFF7FFFL ^ l10) + 0x37003700370037L)) {
            return -1L;
        }
        l8 = (l9 >>> 15) * 65535L;
        l8 = (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l10 | l10 - (l8 & 0x27002700270027L);
        l8 |= l8 >>> 12;
        return (l8 | l8 >>> 24) & 0xFFFFL;
    }

    public static int m(CharSequence charSequence, int n8, int n9) {
        int n10 = 0;
        boolean bl = true;
        while (n8 < n9) {
            char c8 = charSequence.charAt(n8);
            bl &= i.b(c8);
            n10 = n10 * 10 + c8 - 48;
            ++n8;
        }
        if (bl) {
            return n10;
        }
        return -1;
    }

    public static void n(byte[] byArray, int n8, int n9) {
        byArray[n8] = (byte)(n9 >>> 24);
        byArray[n8 + 1] = (byte)(n9 >>> 16);
        byArray[n8 + 2] = (byte)(n9 >>> 8);
        byArray[n8 + 3] = (byte)n9;
    }
}

