/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.b;
import java.util.Arrays;

final class i {
    private static final char[] a = i.b();
    private static final byte[] b = i.a();

    private static byte[] a() {
        byte[] byArray = new byte[128];
        Arrays.fill(byArray, (byte)-1);
        for (int i8 = 0; i8 < 16; ++i8) {
            byArray["0123456789abcdef".charAt((int)i8)] = (byte)i8;
        }
        return byArray;
    }

    private static char[] b() {
        char[] cArray = new char[512];
        for (int i8 = 0; i8 < 256; ++i8) {
            cArray[i8] = "0123456789abcdef".charAt(i8 >>> 4);
            cArray[i8 | 0x100] = "0123456789abcdef".charAt(i8 & 0xF);
        }
        return cArray;
    }

    private static void c(byte by, char[] cArray, int n8) {
        by = (byte)(by & 0xFF);
        char[] cArray2 = a;
        cArray[n8] = cArray2[by];
        cArray[n8 + 1] = cArray2[by | 0x100];
    }

    static void d(long l8, char[] cArray, int n8) {
        i.c((byte)(l8 >> 56 & 0xFFL), cArray, n8);
        i.c((byte)(l8 >> 48 & 0xFFL), cArray, n8 + 2);
        i.c((byte)(l8 >> 40 & 0xFFL), cArray, n8 + 4);
        i.c((byte)(l8 >> 32 & 0xFFL), cArray, n8 + 6);
        i.c((byte)(l8 >> 24 & 0xFFL), cArray, n8 + 8);
        i.c((byte)(l8 >> 16 & 0xFFL), cArray, n8 + 10);
        i.c((byte)(l8 >> 8 & 0xFFL), cArray, n8 + 12);
        i.c((byte)(l8 & 0xFFL), cArray, n8 + 14);
    }

    static void e(long l8, byte[] byArray, int n8) {
        boolean bl = byArray.length >= n8 + 8;
        ax.cb.b.a(bl, "array too small");
        byArray[n8 + 7] = (byte)(l8 & 0xFFL);
        byArray[n8 + 6] = (byte)(l8 >> 8 & 0xFFL);
        byArray[n8 + 5] = (byte)(l8 >> 16 & 0xFFL);
        byArray[n8 + 4] = (byte)(l8 >> 24 & 0xFFL);
        byArray[n8 + 3] = (byte)(l8 >> 32 & 0xFFL);
        byArray[n8 + 2] = (byte)(l8 >> 40 & 0xFFL);
        byArray[n8 + 1] = (byte)(l8 >> 48 & 0xFFL);
        byArray[n8] = (byte)(l8 >> 56 & 0xFFL);
    }
}

