package ax.Nd;

/* loaded from: classes3.dex */
public abstract class h {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long b(byte[] bArr, int i) {
        return (a(bArr, i + 4) & 4294967295L) | ((a(bArr, i) & 4294967295L) << 32);
    }

    public static void c(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i2 + i4] = b(bArr, i);
            i += 8;
        }
    }

    public static void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static byte[] e(int i) {
        byte[] bArr = new byte[4];
        d(i, bArr, 0);
        return bArr;
    }

    public static void f(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void g(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            f(i2, bArr, i);
            i += 4;
        }
    }

    public static int h(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void i(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = h(bArr, i);
            i += 4;
        }
    }

    public static void j(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = h(bArr, i);
            i += 4;
        }
    }

    public static int[] k(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = h(bArr, i);
            i += 4;
        }
        return iArr;
    }

    public static long l(byte[] bArr, int i) {
        return ((h(bArr, i + 4) & 4294967295L) << 32) | (4294967295L & h(bArr, i));
    }

    public static void m(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = l(bArr, i);
            i += 8;
        }
    }

    public static void n(long j, byte[] bArr, int i) {
        d((int) (j >>> 32), bArr, i);
        d((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void o(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            n(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void p(long j, byte[] bArr, int i) {
        f((int) (4294967295L & j), bArr, i);
        f((int) (j >>> 32), bArr, i + 4);
    }

    public static void q(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            p(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void r(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            p(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] s(long j) {
        byte[] bArr = new byte[8];
        p(j, bArr, 0);
        return bArr;
    }
}
