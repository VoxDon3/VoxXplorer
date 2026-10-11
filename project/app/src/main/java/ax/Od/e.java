/*
 * Decompiled with CFR 0.152.
 */
package ax.Od;

public class e {
    private static final short[] a = new short[128];
    private static final byte[] b;

    static {
        byte[] byArray = new byte[112];
        b = byArray;
        byte[] byArray2 = new byte[128];
        e.a(byArray2, 0, 15, (byte)1);
        e.a(byArray2, 16, 31, (byte)2);
        e.a(byArray2, 32, 63, (byte)3);
        e.a(byArray2, 64, 65, (byte)0);
        e.a(byArray2, 66, 95, (byte)4);
        e.a(byArray2, 96, 96, (byte)5);
        e.a(byArray2, 97, 108, (byte)6);
        e.a(byArray2, 109, 109, (byte)7);
        e.a(byArray2, 110, 111, (byte)6);
        e.a(byArray2, 112, 112, (byte)8);
        e.a(byArray2, 113, 115, (byte)9);
        e.a(byArray2, 116, 116, (byte)10);
        e.a(byArray2, 117, 127, (byte)0);
        e.a(byArray, 0, byArray.length - 1, (byte)-2);
        e.a(byArray, 8, 11, (byte)-1);
        e.a(byArray, 24, 27, (byte)0);
        e.a(byArray, 40, 43, (byte)16);
        e.a(byArray, 58, 59, (byte)0);
        e.a(byArray, 72, 73, (byte)0);
        e.a(byArray, 89, 91, (byte)16);
        e.a(byArray, 104, 104, (byte)16);
        for (int i8 = 0; i8 < 128; ++i8) {
            byte by = byArray2[i8];
            byte by2 = (new byte[]{0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7})[by];
            by = (new byte[]{-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96})[by];
            e.a[i8] = (short)(by | (by2 & i8) << 8);
        }
    }

    private static void a(byte[] byArray, int n8, int n9, byte by) {
        while (n8 <= n9) {
            byArray[n8] = by;
            ++n8;
        }
    }

    public static int b(byte[] byArray, char[] cArray) {
        int n8 = 0;
        int n9 = 0;
        while (n8 < byArray.length) {
            int n10 = n8 + 1;
            if ((n8 = byArray[n8]) >= 0) {
                if (n9 >= cArray.length) {
                    return -1;
                }
                cArray[n9] = (char)n8;
                n8 = n10;
                ++n9;
                continue;
            }
            n8 = a[n8 & 0x7F];
            int n11 = n8 >>> 8;
            byte by = (byte)n8;
            n8 = n10;
            n10 = by;
            while (n10 >= 0) {
                if (n8 >= byArray.length) {
                    return -1;
                }
                by = byArray[n8];
                n11 = n11 << 6 | by & 0x3F;
                n10 = b[n10 + ((by & 0xFF) >>> 4)];
                ++n8;
            }
            if (n10 == -2) {
                return -1;
            }
            if (n11 <= 65535) {
                if (n9 >= cArray.length) {
                    return -1;
                }
                cArray[n9] = (char)n11;
                ++n9;
                continue;
            }
            if (n9 >= cArray.length - 1) {
                return -1;
            }
            cArray[n9] = (char)((n11 >>> 10) + 55232);
            n10 = n9 + 2;
            cArray[n9 + 1] = (char)(n11 & 0x3FF | 0xDC00);
            n9 = n10;
        }
        return n9;
    }
}

