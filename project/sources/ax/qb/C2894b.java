package ax.qb;

import java.io.IOException;

/* renamed from: ax.qb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2894b {
    public static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(g(bArr, i));
    }

    public static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(e(bArr, i));
    }

    public static short c(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public static short d(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int f(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long g(byte[] bArr, int i) {
        return (e(bArr, i + 4) & 4294967295L) | ((e(bArr, i) & 4294967295L) << 32);
    }

    public static String h(byte[] bArr, int i, int i2) throws IOException {
        char[] cArr = new char[i2 - i];
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            byte b = bArr[i];
            int i5 = b & 255;
            if (i5 == 0) {
                break;
            }
            if (i5 < 128) {
                cArr[i3] = (char) i5;
                i = i4;
            } else if ((b & 224) == 192) {
                if (i2 - i4 < 2) {
                    break;
                }
                char c = (char) ((b & 31) << 6);
                cArr[i3] = c;
                i += 2;
                byte b2 = bArr[i4];
                char c2 = (char) (c | (b2 & 63));
                cArr[i3] = c2;
                if ((b2 & 192) != 128 || c2 < 128) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
            } else {
                if ((b & 240) != 224) {
                    throw new IOException("Unsupported UTF-8 sequence");
                }
                if (i2 - i4 < 3) {
                    break;
                }
                char c3 = (char) ((b & 15) << 12);
                cArr[i3] = c3;
                int i6 = i + 2;
                byte b3 = bArr[i4];
                if ((b3 & 192) != 128) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
                char c4 = (char) (((b3 & 63) << 6) | c3);
                cArr[i3] = c4;
                i += 3;
                byte b4 = bArr[i6];
                char c5 = (char) (c4 | (b4 & 63));
                cArr[i3] = c5;
                if ((b4 & 192) != 128 || c5 < 2048) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
            }
            i3++;
        }
        return new String(cArr, 0, i3);
    }

    public static int i(double d, byte[] bArr, int i) {
        return o(Double.doubleToLongBits(d), bArr, i);
    }

    public static int j(float f, byte[] bArr, int i) {
        return m(Float.floatToIntBits(f), bArr, i);
    }

    public static int k(short s, byte[] bArr, int i) {
        bArr[i] = (byte) ((s >> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        return 2;
    }

    public static int l(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
        return 2;
    }

    public static int m(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        return 4;
    }

    public static int n(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        return 4;
    }

    public static int o(long j, byte[] bArr, int i) {
        m((int) (j & 4294967295L), bArr, i + 4);
        m((int) ((j >> 32) & 4294967295L), bArr, i);
        return 8;
    }

    public static int p(long j, byte[] bArr, int i) {
        n((int) (j & 4294967295L), bArr, i);
        n((int) ((j >> 32) & 4294967295L), bArr, i + 4);
        return 8;
    }

    public static int q(String str, byte[] bArr, int i, int i2) throws IOException {
        int length = str.length();
        int i3 = i;
        for (int i4 = 0; i3 < i2 && i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt >= 1 && charAt <= 127) {
                bArr[i3] = (byte) charAt;
                i3++;
            } else if (charAt > 2047) {
                if (i2 - i3 < 3) {
                    break;
                }
                bArr[i3] = (byte) (((charAt >> '\f') & 15) | 224);
                int i5 = i3 + 2;
                bArr[i3 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                i3 += 3;
                bArr[i5] = (byte) ((charAt & '?') | 128);
            } else {
                if (i2 - i3 < 2) {
                    break;
                }
                int i6 = i3 + 1;
                bArr[i3] = (byte) (((charAt >> 6) & 31) | 192);
                i3 += 2;
                bArr[i6] = (byte) ((charAt & '?') | 128);
            }
        }
        return i3 - i;
    }
}
