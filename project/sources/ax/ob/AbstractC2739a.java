package ax.ob;

import ax.jb.C2345a;

/* renamed from: ax.ob.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2739a {
    protected static final byte[] b = {78, 84, 76, 77, 83, 83, 80, 0};
    private static final String c = C2345a.c;
    private int a;

    static String b() {
        return c;
    }

    static byte[] c(byte[] bArr, int i) {
        int e = e(bArr, i);
        byte[] bArr2 = new byte[e];
        System.arraycopy(bArr, d(bArr, i + 4), bArr2, 0, e);
        return bArr2;
    }

    static int d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int e(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    static void g(byte[] bArr, int i, int i2, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return;
        }
        i(bArr, i, length);
        i(bArr, i + 2, length);
        h(bArr, i + 4, i2);
        System.arraycopy(bArr2, 0, bArr, i2, length);
    }

    static void h(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    static void i(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
    }

    public int a() {
        return this.a;
    }

    public void f(int i) {
        this.a = i;
    }
}
