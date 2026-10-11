package ax.db;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class i {
    private static final char[] a = b();
    private static final byte[] b = a();

    private static byte[] a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 16; i++) {
            bArr["0123456789abcdef".charAt(i)] = (byte) i;
        }
        return bArr;
    }

    private static char[] b() {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        return cArr;
    }

    private static void c(byte b2, char[] cArr, int i) {
        int i2 = b2 & 255;
        char[] cArr2 = a;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    static void d(long j, char[] cArr, int i) {
        c((byte) ((j >> 56) & 255), cArr, i);
        c((byte) ((j >> 48) & 255), cArr, i + 2);
        c((byte) ((j >> 40) & 255), cArr, i + 4);
        c((byte) ((j >> 32) & 255), cArr, i + 6);
        c((byte) ((j >> 24) & 255), cArr, i + 8);
        c((byte) ((j >> 16) & 255), cArr, i + 10);
        c((byte) ((j >> 8) & 255), cArr, i + 12);
        c((byte) (j & 255), cArr, i + 14);
    }

    static void e(long j, byte[] bArr, int i) {
        ax.cb.b.a(bArr.length >= i + 8, "array too small");
        bArr[i + 7] = (byte) (j & 255);
        bArr[i + 6] = (byte) ((j >> 8) & 255);
        bArr[i + 5] = (byte) ((j >> 16) & 255);
        bArr[i + 4] = (byte) ((j >> 24) & 255);
        bArr[i + 3] = (byte) ((j >> 32) & 255);
        bArr[i + 2] = (byte) ((j >> 40) & 255);
        bArr[i + 1] = (byte) ((j >> 48) & 255);
        bArr[i] = (byte) ((j >> 56) & 255);
    }
}
