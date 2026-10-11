package ax.Kd;

/* loaded from: classes3.dex */
public abstract class d {
    public static boolean a(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = iArr[i] & 4294967295L;
            int i2 = i;
            long j11 = (j10 * j) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j11 >>> 32) + (j10 * j2) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j12;
            long j13 = (j12 >>> 32) + (j10 * j3) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j10 * j4) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j5) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 4] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j6) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 5] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j7) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (j10 * j8) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 7] = (int) j18;
            long j19 = j9 + (j18 >>> 32) + (iArr3[r4] & 4294967295L);
            iArr3[i2 + 8] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }
}
