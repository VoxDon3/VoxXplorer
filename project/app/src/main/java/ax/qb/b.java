/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

import java.io.IOException;

public class b {
    public static double a(byte[] byArray, int n8) {
        return Double.longBitsToDouble(b.g(byArray, n8));
    }

    public static float b(byte[] byArray, int n8) {
        return Float.intBitsToFloat(b.e(byArray, n8));
    }

    public static short c(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (short)(byArray[n8 + 1] & 0xFF | (by & 0xFF) << 8);
    }

    public static short d(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (short)((byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF);
    }

    public static int e(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    public static int f(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    public static long g(byte[] byArray, int n8) {
        long l8 = b.e(byArray, n8);
        return (long)b.e(byArray, n8 + 4) & 0xFFFFFFFFL | (l8 & 0xFFFFFFFFL) << 32;
    }

    public static String h(byte[] byArray, int n8, int n9) throws IOException {
        char[] cArray = new char[n9 - n8];
        int n10 = 0;
        while (n8 < n9) {
            block9: {
                block10: {
                    block11: {
                        block7: {
                            char c8;
                            byte by;
                            int n11;
                            block8: {
                                block6: {
                                    n11 = n8 + 1;
                                    by = byArray[n8];
                                    int n12 = by & 0xFF;
                                    if (n12 == 0) break;
                                    if (n12 >= 128) break block6;
                                    cArray[n10] = (char)n12;
                                    n8 = n11;
                                    break block7;
                                }
                                if ((by & 0xE0) != 192) break block8;
                                if (n9 - n11 < 2) break;
                                cArray[n10] = c8 = (char)((by & 0x1F) << 6);
                                n8 += 2;
                                n11 = byArray[n11];
                                cArray[n10] = c8 = (char)(c8 | n11 & 0x3F);
                                if ((n11 & 0xC0) != 128 || c8 < '\u0080') {
                                    throw new IOException("Invalid UTF-8 sequence");
                                }
                                break block7;
                            }
                            if ((by & 0xF0) != 224) break block9;
                            if (n9 - n11 < 3) break;
                            cArray[n10] = c8 = (char)((by & 0xF) << 12);
                            if (((n11 = byArray[n11]) & 0xC0) != 128) break block10;
                            cArray[n10] = c8 = (char)((n11 & 0x3F) << 6 | c8);
                            n11 = n8 + 3;
                            n8 = byArray[n8 + 2];
                            cArray[n10] = c8 = (char)(c8 | n8 & 0x3F);
                            if ((n8 & 0xC0) != 128 || c8 < '\u0800') break block11;
                            n8 = n11;
                        }
                        ++n10;
                        continue;
                    }
                    throw new IOException("Invalid UTF-8 sequence");
                }
                throw new IOException("Invalid UTF-8 sequence");
            }
            throw new IOException("Unsupported UTF-8 sequence");
        }
        return new String(cArray, 0, n10);
    }

    public static int i(double d8, byte[] byArray, int n8) {
        return b.o(Double.doubleToLongBits(d8), byArray, n8);
    }

    public static int j(float f8, byte[] byArray, int n8) {
        return b.m(Float.floatToIntBits(f8), byArray, n8);
    }

    public static int k(short s8, byte[] byArray, int n8) {
        byArray[n8] = (byte)(s8 >> 8 & 0xFF);
        byArray[n8 + 1] = (byte)(s8 & 0xFF);
        return 2;
    }

    public static int l(short s8, byte[] byArray, int n8) {
        byArray[n8] = (byte)(s8 & 0xFF);
        byArray[n8 + 1] = (byte)(s8 >> 8 & 0xFF);
        return 2;
    }

    public static int m(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)(n8 >> 24 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 >> 16 & 0xFF);
        byArray[n9 + 2] = (byte)(n8 >> 8 & 0xFF);
        byArray[n9 + 3] = (byte)(n8 & 0xFF);
        return 4;
    }

    public static int n(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)(n8 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 >> 8 & 0xFF);
        byArray[n9 + 2] = (byte)(n8 >> 16 & 0xFF);
        byArray[n9 + 3] = (byte)(n8 >> 24 & 0xFF);
        return 4;
    }

    public static int o(long l8, byte[] byArray, int n8) {
        b.m((int)(l8 & 0xFFFFFFFFL), byArray, n8 + 4);
        b.m((int)(l8 >> 32 & 0xFFFFFFFFL), byArray, n8);
        return 8;
    }

    public static int p(long l8, byte[] byArray, int n8) {
        b.n((int)(l8 & 0xFFFFFFFFL), byArray, n8);
        b.n((int)(l8 >> 32 & 0xFFFFFFFFL), byArray, n8 + 4);
        return 8;
    }

    public static int q(String string, byte[] byArray, int n8, int n9) throws IOException {
        int n10 = string.length();
        int n11 = n8;
        for (int i8 = 0; n11 < n9 && i8 < n10; ++i8) {
            int n12;
            char c8 = string.charAt(i8);
            if (c8 >= '\u0001' && c8 <= '\u007f') {
                byArray[n11] = (byte)c8;
                ++n11;
                continue;
            }
            if (c8 > '\u07ff') {
                if (n9 - n11 < 3) break;
                byArray[n11] = (byte)(c8 >> 12 & 0xF | 0xE0);
                byArray[n11 + 1] = (byte)(c8 >> 6 & 0x3F | 0x80);
                n12 = n11 + 3;
                byArray[n11 + 2] = (byte)(c8 & 0x3F | 0x80);
                n11 = n12;
                continue;
            }
            if (n9 - n11 < 2) break;
            byArray[n11] = (byte)(c8 >> 6 & 0x1F | 0xC0);
            n12 = n11 + 2;
            byArray[n11 + 1] = (byte)(c8 & 0x3F | 0x80);
            n11 = n12;
        }
        return n11 - n8;
    }
}

