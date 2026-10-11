package ax.Kd;

/* loaded from: classes3.dex */
public abstract class e {
    public static int a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (-(i2 & 1)) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = j2 + (iArr[i3] & 4294967295L) + (iArr2[i3] & j);
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int b(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i4 = 1; i4 < i; i4++) {
            i3 |= iArr[i4];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static int c(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3];
        }
        return (((i2 >>> 1) | (i2 & 1)) - 1) >> 31;
    }

    public static boolean d(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static boolean e(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int g(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i;
            int[] iArr4 = iArr3;
            long h = j + (h(i3, iArr[i2], r4, 0, iArr4, i2) & 4294967295L) + (iArr4[r10] & 4294967295L);
            iArr4[i2 + i3] = (int) h;
            j = h >>> 32;
            i2++;
            i = i3;
            iArr2 = iArr2;
            iArr3 = iArr4;
        }
        return (int) j;
    }

    public static int h(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j = i2 & 4294967295L;
        long j2 = 0;
        int i5 = 0;
        do {
            long j3 = j2 + ((iArr[i3 + i5] & 4294967295L) * j) + (iArr2[r8] & 4294967295L);
            iArr2[i4 + i5] = (int) j3;
            j2 = j3 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j2;
    }

    public static int i(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }
}
