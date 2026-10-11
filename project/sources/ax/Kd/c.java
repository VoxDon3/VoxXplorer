package ax.Kd;

/* loaded from: classes3.dex */
public abstract class c {
    private static int a(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + iArr[i4] + iArr2[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 + iArr[i2] + iArr2[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    private static void b(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + ((iArr[i5] ^ i2) - i2);
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        iArr[i3] = i4 + ((iArr[i3] ^ i2) - i2);
    }

    private static void c(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i4 = iArr[i3] >> 31;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i5 + (((iArr[i6] + (iArr2[i6] & i4)) ^ i2) - i2);
            iArr[i6] = 1073741823 & i7;
            i5 = i7 >> 30;
        }
        int i8 = i5 + (((iArr[i3] + (i4 & iArr2[i3])) ^ i2) - i2);
        iArr[i3] = i8;
        int i9 = i8 >> 31;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = i10 + iArr[i11] + (iArr2[i11] & i9);
            iArr[i11] = i12 & 1073741823;
            i10 = i12 >> 30;
        }
        iArr[i3] = i10 + iArr[i3] + (i9 & iArr2[i3]);
    }

    private static void d(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            while (i4 < Math.min(32, i)) {
                j |= iArr[i2] << i4;
                i4 += 30;
                i2++;
            }
            iArr2[i3] = (int) j;
            j >>>= 32;
            i4 -= 32;
            i -= 32;
            i3++;
        }
    }

    private static int e(int i, int i2, int i3, int[] iArr) {
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        for (int i8 = 0; i8 < 30; i8++) {
            int i9 = i >> 31;
            int i10 = -(i3 & 1);
            int i11 = i3 + (((i2 ^ i9) - i9) & i10);
            i6 += ((i4 ^ i9) - i9) & i10;
            i7 += ((i5 ^ i9) - i9) & i10;
            int i12 = i9 & i10;
            i = (i ^ i12) - (i12 + 1);
            i2 += i11 & i12;
            i3 = i11 >> 1;
            i4 = (i4 + (i6 & i12)) << 1;
            i5 = (i5 + (i12 & i7)) << 1;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
        iArr[3] = i7;
        return i;
    }

    private static int f(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = 30;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (true) {
            int b = ax.Nd.d.b(((-1) << i5) | i3);
            int i10 = i3 >> b;
            i6 <<= b;
            i7 <<= b;
            i -= b;
            i5 -= b;
            if (i5 <= 0) {
                iArr[0] = i6;
                iArr[1] = i7;
                iArr[2] = i8;
                iArr[3] = i9;
                return i;
            }
            if (i < 0) {
                i = -i;
                int i11 = -i2;
                int i12 = -i6;
                int i13 = -i7;
                int i14 = i + 1;
                if (i14 > i5) {
                    i14 = i5;
                }
                i4 = ((-1) >>> (32 - i14)) & 63 & (i10 * i11 * ((i10 * i10) - 2));
                i10 = i11;
                i2 = i10;
                int i15 = i8;
                i8 = i12;
                i6 = i15;
                int i16 = i9;
                i9 = i13;
                i7 = i16;
            } else {
                int i17 = i + 1;
                if (i17 > i5) {
                    i17 = i5;
                }
                i4 = ((-1) >>> (32 - i17)) & 15 & ((-((((i2 + 1) & 4) << 1) + i2)) * i10);
            }
            i3 = i10 + (i2 * i4);
            i8 += i6 * i4;
            i9 += i4 * i7;
        }
    }

    private static void g(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= (iArr[i2] & 4294967295L) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    private static int h(int i) {
        return ((i * 49) + (i < 46 ? 80 : 47)) / 17;
    }

    public static int i(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static int j(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a = (length << 5) - ax.Nd.d.a(iArr[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        iArr6[0] = 1;
        g(a, iArr2, 0, iArr8, 0);
        g(a, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int i2 = i(iArr9[0]);
        int h = h(a);
        int i3 = -1;
        for (int i4 = 0; i4 < h; i4 += 30) {
            i3 = e(i3, iArr7[0], iArr8[0], iArr4);
            m(i, iArr5, iArr6, iArr4, i2, iArr9);
            n(i, iArr7, iArr8, iArr4);
        }
        int i5 = iArr7[i - 1] >> 31;
        b(i, i5, iArr7);
        c(i, i5, iArr5, iArr9);
        d(a, iArr5, 0, iArr3, 0);
        return e.b(i, iArr7, 1) & e.c(i, iArr8);
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    public static boolean k(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int a = (length << 5) - ax.Nd.d.a(iArr[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        ?? r11 = 0;
        iArr6[0] = 1;
        g(a, iArr2, 0, iArr8, 0);
        g(a, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int i2 = i - 1;
        int a2 = (-1) - (ax.Nd.d.a(iArr8[i2] | 1) - (((i * 30) + 2) - a));
        int i3 = i(iArr9[0]);
        int h = h(a);
        int i4 = i;
        int i5 = 0;
        while (!e.f(i4, iArr8)) {
            if (i5 >= h) {
                return r11;
            }
            i5 += 30;
            int f = f(a2, iArr7[r11], iArr8[0], iArr4);
            int i6 = i3;
            m(i, iArr5, iArr6, iArr4, i6, iArr9);
            n(i4, iArr7, iArr8, iArr4);
            int i7 = i4 - 1;
            int i8 = iArr7[i7];
            int i9 = iArr8[i7];
            int i10 = i4 - 2;
            if (((i10 >> 31) | (i8 ^ (i8 >> 31)) | (i9 ^ (i9 >> 31))) == 0) {
                iArr7[i10] = iArr7[i10] | (i8 << 30);
                iArr8[i10] = (i9 << 30) | iArr8[i10];
                i4--;
            }
            i3 = i6;
            r11 = 0;
            a2 = f;
        }
        int i11 = iArr7[i4 - 1] >> 31;
        int i12 = iArr5[i2] >> 31;
        if (i12 < 0) {
            i12 = a(i, iArr5, iArr9);
        }
        if (i11 < 0) {
            i12 = l(i, iArr5);
            l(i4, iArr7);
        }
        if (!e.e(i4, iArr7)) {
            return false;
        }
        if (i12 < 0) {
            a(i, iArr5, iArr9);
        }
        d(a, iArr5, 0, iArr3, 0);
        return true;
    }

    private static int l(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    private static void m(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j * j2) + (j3 * j4);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j2 * j6) + (j7 * j4);
        int i14 = i11 - (((((int) j5) * i2) + i11) & 1073741823);
        long j9 = i13;
        long j10 = i14;
        long j11 = j5 + (j9 * j10);
        long j12 = i12 - (((((int) j8) * i2) + i12) & 1073741823);
        long j13 = (j8 + (j9 * j12)) >> 30;
        long j14 = j11 >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            long j15 = j12;
            long j16 = j6;
            long j17 = iArr[i15];
            long j18 = iArr2[i15];
            long j19 = (j * j17) + (j3 * j18);
            long j20 = i16;
            long j21 = j14 + j19 + (j20 * j10);
            long j22 = j13 + (j16 * j17) + (j7 * j18) + (j20 * j15);
            int i17 = i15 - 1;
            iArr[i17] = ((int) j21) & 1073741823;
            j14 = j21 >> 30;
            iArr2[i17] = ((int) j22) & 1073741823;
            j13 = j22 >> 30;
            i15++;
            i3 = i;
            j12 = j15;
            j6 = j16;
        }
        iArr[i8] = (int) j14;
        iArr2[i8] = (int) j13;
    }

    private static void n(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = i3;
        long j2 = iArr[0];
        long j3 = i4;
        long j4 = iArr2[0];
        long j5 = i5;
        long j6 = i6;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        int i7 = 1;
        while (i7 < i2) {
            long j9 = iArr[i7];
            long j10 = j * j9;
            long j11 = iArr2[i7];
            long j12 = j7 + j10 + (j3 * j11);
            long j13 = j8 + (j5 * j9) + (j11 * j6);
            int i8 = i7 - 1;
            iArr[i8] = ((int) j12) & 1073741823;
            j7 = j12 >> 30;
            iArr2[i8] = ((int) j13) & 1073741823;
            j8 = j13 >> 30;
            i7++;
            i2 = i;
        }
        int i9 = i - 1;
        iArr[i9] = (int) j7;
        iArr2[i9] = (int) j8;
    }
}
