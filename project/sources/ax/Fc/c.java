package ax.Fc;

import ax.Fc.b;
import java.util.BitSet;

/* loaded from: classes3.dex */
class c {
    private static final int[] m = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};
    private int a;
    private int b;
    private boolean c;
    private final int[] d = new int[1000];
    private final int[] e = new int[1000];
    private final int[] f = new int[1000];
    private final int[] g = new int[256];
    private final int[] h = new int[256];
    private final boolean[] i = new boolean[256];
    private final int[] j = new int[65537];
    private final char[] k;
    private int[] l;

    c(b.a aVar) {
        this.k = aVar.s;
    }

    private void b(int[] iArr, int[] iArr2, int i, int i2) {
        int[] iArr3 = iArr2;
        char c = 0;
        h(0, i, i2);
        long j = 0;
        int i3 = 1;
        long j2 = 0;
        int i4 = 1;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int[] g = g(i5);
            int i6 = g[c];
            int i7 = g[i3];
            if (i7 - i6 < 10) {
                c(iArr, iArr3, i6, i7);
                i4 = i5;
            } else {
                j2 = ((j2 * 7621) + 1) % 32768;
                long j3 = j2 % 3;
                long j4 = j3 == j ? iArr3[iArr[i6]] : j3 == 1 ? iArr3[iArr[(i6 + i7) >>> i3]] : iArr3[iArr[i7]];
                int i8 = i7;
                int i9 = i8;
                int i10 = i6;
                int i11 = i10;
                while (true) {
                    if (i11 <= i8) {
                        int i12 = iArr3[iArr[i11]] - ((int) j4);
                        if (i12 == 0) {
                            i(iArr, i11, i10);
                            i10++;
                            i11++;
                        } else if (i12 <= 0) {
                            i11++;
                            iArr3 = iArr2;
                        }
                    }
                    while (i11 <= i8) {
                        int i13 = iArr3[iArr[i8]] - ((int) j4);
                        if (i13 == 0) {
                            i(iArr, i8, i9);
                            i9--;
                        } else if (i13 < 0) {
                            break;
                        }
                        i8--;
                        iArr3 = iArr2;
                    }
                    if (i11 > i8) {
                        break;
                    }
                    i(iArr, i11, i8);
                    i11++;
                    i8--;
                    iArr3 = iArr2;
                }
                if (i9 < i10) {
                    iArr3 = iArr2;
                    i4 = i5;
                } else {
                    int f = f(i10 - i6, i11 - i10);
                    j(iArr, i6, i11 - f, f);
                    int i14 = i7 - i9;
                    int i15 = i9 - i8;
                    int f2 = f(i14, i15);
                    j(iArr, i8 + 1, (i7 - f2) + 1, f2);
                    int i16 = ((i11 + i6) - i10) - 1;
                    int i17 = (i7 - i15) + 1;
                    if (i16 - i6 > i7 - i17) {
                        h(i5, i6, i16);
                        h(i4, i17, i7);
                        i4++;
                    } else {
                        h(i5, i17, i7);
                        h(i4, i6, i16);
                        i4++;
                    }
                    iArr3 = iArr2;
                }
                c = 0;
                j = 0;
                i3 = 1;
            }
        }
    }

    private void c(int[] iArr, int[] iArr2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 - i > 3) {
            for (int i3 = i2 - 4; i3 >= i; i3--) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                int i6 = i3 + 4;
                while (i6 <= i2) {
                    int i7 = iArr[i6];
                    if (i5 > iArr2[i7]) {
                        iArr[i6 - 4] = i7;
                        i6 += 4;
                    }
                }
                iArr[i6 - 4] = i4;
            }
        }
        for (int i8 = i2 - 1; i8 >= i; i8--) {
            int i9 = iArr[i8];
            int i10 = iArr2[i9];
            int i11 = i8 + 1;
            while (i11 <= i2) {
                int i12 = iArr[i11];
                if (i10 > iArr2[i12]) {
                    iArr[i11 - 1] = i12;
                    i11++;
                }
            }
            iArr[i11 - 1] = i9;
        }
    }

    private int f(int i, int i2) {
        return i < i2 ? i : i2;
    }

    private int[] g(int i) {
        return new int[]{this.d[i], this.e[i]};
    }

    private void h(int i, int i2, int i3) {
        this.d[i] = i2;
        this.e[i] = i3;
    }

    private void i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    private void j(int[] iArr, int i, int i2, int i3) {
        while (i3 > 0) {
            i(iArr, i, i2);
            i++;
            i2++;
            i3--;
        }
    }

    private int[] k() {
        if (this.l == null) {
            this.l = new int[this.k.length / 2];
        }
        return this.l;
    }

    private void l(b.a aVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        c cVar = this;
        b.a aVar2 = aVar;
        int[] iArr = cVar.d;
        int[] iArr2 = cVar.e;
        int[] iArr3 = cVar.f;
        int[] iArr4 = aVar2.r;
        byte[] bArr = aVar2.q;
        iArr[0] = i;
        iArr2[0] = i2;
        iArr3[0] = i3;
        int i8 = 1;
        while (true) {
            int i9 = i8 - 1;
            if (i9 < 0) {
                return;
            }
            int i10 = i8;
            int i11 = iArr[i9];
            int i12 = iArr2[i9];
            int i13 = iArr3[i9];
            if (i12 - i11 < 20) {
                cVar = this;
                aVar2 = aVar;
                i5 = i4;
            } else if (i13 > 10) {
                i5 = i4;
            } else {
                int i14 = i13 + 1;
                int o = o(bArr[iArr4[i11] + i14], bArr[iArr4[i12] + i14], bArr[iArr4[(i11 + i12) >>> 1] + i14]) & 255;
                int i15 = i11;
                int i16 = i15;
                int i17 = i12;
                int i18 = i17;
                while (true) {
                    if (i16 <= i17) {
                        int i19 = iArr4[i16];
                        int i20 = (bArr[i19 + i14] & 255) - o;
                        if (i20 == 0) {
                            iArr4[i16] = iArr4[i15];
                            iArr4[i15] = i19;
                            i15++;
                            i16++;
                        } else if (i20 < 0) {
                            i16++;
                        }
                    }
                    i6 = i18;
                    while (true) {
                        if (i16 > i17) {
                            i7 = i12;
                            break;
                        }
                        int i21 = iArr4[i17];
                        i7 = i12;
                        int i22 = (bArr[i21 + i14] & 255) - o;
                        if (i22 != 0) {
                            if (i22 <= 0) {
                                break;
                            } else {
                                i17--;
                            }
                        } else {
                            iArr4[i17] = iArr4[i6];
                            iArr4[i6] = i21;
                            i6--;
                            i17--;
                        }
                        i12 = i7;
                    }
                    if (i16 > i17) {
                        break;
                    }
                    int i23 = iArr4[i16];
                    iArr4[i16] = iArr4[i17];
                    iArr4[i17] = i23;
                    i12 = i7;
                    i17--;
                    i16++;
                    i18 = i6;
                }
                if (i6 < i15) {
                    iArr[i9] = i11;
                    iArr2[i9] = i7;
                    iArr3[i9] = i14;
                    i8 = i10;
                } else {
                    int i24 = i15 - i11;
                    int i25 = i16 - i15;
                    if (i24 >= i25) {
                        i24 = i25;
                    }
                    p(iArr4, i11, i16 - i24, i24);
                    int i26 = i7 - i6;
                    int i27 = i6 - i17;
                    if (i26 >= i27) {
                        i26 = i27;
                    }
                    p(iArr4, i16, (i7 - i26) + 1, i26);
                    int i28 = (i16 + i11) - i15;
                    int i29 = i7 - i27;
                    iArr[i9] = i11;
                    iArr2[i9] = i28 - 1;
                    iArr3[i9] = i13;
                    iArr[i10] = i28;
                    iArr2[i10] = i29;
                    iArr3[i10] = i14;
                    int i30 = i10 + 1;
                    iArr[i30] = i29 + 1;
                    iArr2[i30] = i7;
                    iArr3[i30] = i13;
                    i8 = i10 + 2;
                }
                cVar = this;
                aVar2 = aVar;
            }
            if (cVar.m(aVar2, i11, i12, i13, i5)) {
                return;
            }
            i8 = i9;
            cVar = this;
            aVar2 = aVar;
        }
    }

    private boolean m(b.a aVar, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        byte[] bArr;
        int[] iArr;
        int i5;
        int i6;
        int i7 = (i2 - i) + 1;
        if (i7 < 2) {
            return this.c && this.a > this.b;
        }
        int i8 = 0;
        while (m[i8] < i7) {
            i8++;
        }
        int[] iArr2 = aVar.r;
        char[] cArr = this.k;
        byte[] bArr2 = aVar.q;
        int i9 = i4 + 1;
        boolean z3 = this.c;
        int i10 = this.b;
        int i11 = this.a;
        loop1: while (true) {
            i8--;
            if (i8 < 0) {
                z = true;
                z2 = false;
                break;
            }
            int i12 = m[i8];
            int i13 = i + i12;
            int i14 = i13 - 1;
            while (i13 <= i2) {
                int i15 = 3;
                while (i13 <= i2) {
                    i15--;
                    if (i15 < 0) {
                        break;
                    }
                    int i16 = iArr2[i13];
                    int i17 = i16 + i3;
                    int i18 = i13;
                    boolean z4 = false;
                    int i19 = 0;
                    while (true) {
                        if (z4) {
                            iArr2[i18] = i19;
                            i5 = i18 - i12;
                            if (i5 <= i14) {
                                bArr = bArr2;
                                iArr = iArr2;
                                break;
                            }
                            i18 = i5;
                        } else {
                            z4 = true;
                        }
                        int i20 = iArr2[i18 - i12];
                        int i21 = i20 + i3;
                        byte b = bArr2[i21 + 1];
                        bArr = bArr2;
                        byte b2 = bArr[i17 + 1];
                        if (b != b2) {
                            iArr = iArr2;
                            i6 = i20;
                            if ((b & 255) <= (b2 & 255)) {
                                break;
                            }
                            bArr2 = bArr;
                            i19 = i6;
                            iArr2 = iArr;
                        } else {
                            byte b3 = bArr[i21 + 2];
                            byte b4 = bArr[i17 + 2];
                            if (b3 != b4) {
                                iArr = iArr2;
                                i6 = i20;
                                if ((b3 & 255) <= (b4 & 255)) {
                                    break;
                                }
                                bArr2 = bArr;
                                i19 = i6;
                                iArr2 = iArr;
                            } else {
                                byte b5 = bArr[i21 + 3];
                                byte b6 = bArr[i17 + 3];
                                if (b5 != b6) {
                                    iArr = iArr2;
                                    i6 = i20;
                                    if ((b5 & 255) <= (b6 & 255)) {
                                        break;
                                    }
                                    bArr2 = bArr;
                                    i19 = i6;
                                    iArr2 = iArr;
                                } else {
                                    byte b7 = bArr[i21 + 4];
                                    byte b8 = bArr[i17 + 4];
                                    if (b7 != b8) {
                                        iArr = iArr2;
                                        i6 = i20;
                                        if ((b7 & 255) <= (b8 & 255)) {
                                            break;
                                        }
                                        bArr2 = bArr;
                                        i19 = i6;
                                        iArr2 = iArr;
                                    } else {
                                        byte b9 = bArr[i21 + 5];
                                        byte b10 = bArr[i17 + 5];
                                        if (b9 != b10) {
                                            iArr = iArr2;
                                            i6 = i20;
                                            if ((b9 & 255) <= (b10 & 255)) {
                                                break;
                                            }
                                            bArr2 = bArr;
                                            i19 = i6;
                                            iArr2 = iArr;
                                        } else {
                                            int i22 = i21 + 6;
                                            byte b11 = bArr[i22];
                                            int i23 = i17 + 6;
                                            iArr = iArr2;
                                            byte b12 = bArr[i23];
                                            if (b11 != b12) {
                                                i6 = i20;
                                                if ((b11 & 255) <= (b12 & 255)) {
                                                    break;
                                                }
                                                bArr2 = bArr;
                                                i19 = i6;
                                                iArr2 = iArr;
                                            } else {
                                                int i24 = i4;
                                                while (true) {
                                                    if (i24 <= 0) {
                                                        break;
                                                    }
                                                    int i25 = i24 - 4;
                                                    int i26 = i22 + 1;
                                                    byte b13 = bArr[i26];
                                                    int i27 = i23 + 1;
                                                    byte b14 = bArr[i27];
                                                    if (b13 != b14) {
                                                        i6 = i20;
                                                        if ((b13 & 255) <= (b14 & 255)) {
                                                            break;
                                                        }
                                                    } else {
                                                        char c = cArr[i22];
                                                        char c2 = cArr[i23];
                                                        if (c != c2) {
                                                            i6 = i20;
                                                            if (c <= c2) {
                                                                break;
                                                            }
                                                        } else {
                                                            int i28 = i22 + 2;
                                                            byte b15 = bArr[i28];
                                                            int i29 = i23 + 2;
                                                            byte b16 = bArr[i29];
                                                            if (b15 != b16) {
                                                                i6 = i20;
                                                                if ((b15 & 255) <= (b16 & 255)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                char c3 = cArr[i26];
                                                                char c4 = cArr[i27];
                                                                if (c3 != c4) {
                                                                    i6 = i20;
                                                                    if (c3 <= c4) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    int i30 = i22 + 3;
                                                                    byte b17 = bArr[i30];
                                                                    int i31 = i23 + 3;
                                                                    byte b18 = bArr[i31];
                                                                    if (b17 != b18) {
                                                                        i6 = i20;
                                                                        if ((b17 & 255) <= (b18 & 255)) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        char c5 = cArr[i28];
                                                                        char c6 = cArr[i29];
                                                                        if (c5 != c6) {
                                                                            i6 = i20;
                                                                            if (c5 <= c6) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            int i32 = i22 + 4;
                                                                            byte b19 = bArr[i32];
                                                                            i23 += 4;
                                                                            i6 = i20;
                                                                            byte b20 = bArr[i23];
                                                                            if (b19 != b20) {
                                                                                if ((b19 & 255) <= (b20 & 255)) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                char c7 = cArr[i30];
                                                                                char c8 = cArr[i31];
                                                                                if (c7 != c8) {
                                                                                    if (c7 <= c8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    if (i32 >= i9) {
                                                                                        i32 -= i9;
                                                                                    }
                                                                                    if (i23 >= i9) {
                                                                                        i23 -= i9;
                                                                                    }
                                                                                    i11++;
                                                                                    i20 = i6;
                                                                                    i22 = i32;
                                                                                    i24 = i25;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                bArr2 = bArr;
                                                i19 = i6;
                                                iArr2 = iArr;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i18;
                    iArr[i5] = i16;
                    i13++;
                    bArr2 = bArr;
                    iArr2 = iArr;
                }
                byte[] bArr3 = bArr2;
                int[] iArr3 = iArr2;
                z = true;
                z2 = false;
                if (z3 && i13 <= i2 && i11 > i10) {
                    break loop1;
                }
                bArr2 = bArr3;
                iArr2 = iArr3;
            }
        }
        this.a = i11;
        return (!z3 || i11 <= i10) ? z2 : z;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte o(byte r0, byte r1, byte r2) {
        /*
            if (r0 >= r1) goto L8
            if (r1 >= r2) goto L5
            goto La
        L5:
            if (r0 >= r2) goto Le
            goto Ld
        L8:
            if (r1 <= r2) goto Lb
        La:
            return r1
        Lb:
            if (r0 <= r2) goto Le
        Ld:
            return r2
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Fc.c.o(byte, byte, byte):byte");
    }

    private static void p(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            int i5 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i5;
            i2++;
            i++;
        }
    }

    void a(b.a aVar, int i) {
        this.b = i * 30;
        this.a = 0;
        this.c = true;
        if (i + 1 < 10000) {
            d(aVar, i);
        } else {
            n(aVar, i);
            if (this.c && this.a > this.b) {
                d(aVar, i);
            }
        }
        int[] iArr = aVar.r;
        aVar.t = -1;
        for (int i2 = 0; i2 <= i; i2++) {
            if (iArr[i2] == 0) {
                aVar.t = i2;
                return;
            }
        }
    }

    final void d(b.a aVar, int i) {
        byte[] bArr = aVar.q;
        int i2 = i + 1;
        bArr[0] = bArr[i2];
        e(aVar.r, bArr, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            aVar.r[i3] = r2[i3] - 1;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr = aVar.r;
            if (iArr[i4] == -1) {
                iArr[i4] = i;
                return;
            }
        }
    }

    final void e(int[] iArr, byte[] bArr, int i) {
        int i2;
        int[] iArr2 = new int[257];
        int[] k = k();
        for (int i3 = 0; i3 < i; i3++) {
            k[i3] = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i4] & 255;
            iArr2[i5] = iArr2[i5] + 1;
        }
        for (int i6 = 1; i6 < 257; i6++) {
            iArr2[i6] = iArr2[i6] + iArr2[i6 - 1];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = iArr2[i8] - 1;
            iArr2[i8] = i9;
            iArr[i9] = i7;
        }
        BitSet bitSet = new BitSet(i + 64);
        for (int i10 = 0; i10 < 256; i10++) {
            bitSet.set(iArr2[i10]);
        }
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = (i11 * 2) + i;
            bitSet.set(i12);
            bitSet.clear(i12 + 1);
        }
        int i13 = 1;
        do {
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                if (bitSet.get(i15)) {
                    i14 = i15;
                }
                int i16 = iArr[i15] - i13;
                if (i16 < 0) {
                    i16 += i;
                }
                k[i16] = i14;
            }
            int i17 = -1;
            i2 = 0;
            while (true) {
                int nextClearBit = bitSet.nextClearBit(i17 + 1);
                int i18 = nextClearBit - 1;
                if (i18 < i && (i17 = bitSet.nextSetBit(nextClearBit + 1) - 1) < i) {
                    if (i17 > i18) {
                        i2 += (i17 - i18) + 1;
                        b(iArr, k, i18, i17);
                        int i19 = -1;
                        while (i18 <= i17) {
                            int i20 = k[iArr[i18]];
                            if (i19 != i20) {
                                bitSet.set(i18);
                                i19 = i20;
                            }
                            i18++;
                        }
                    }
                }
            }
            i13 *= 2;
            if (i13 > i) {
                return;
            }
        } while (i2 != 0);
    }

    final void n(b.a aVar, int i) {
        int i2;
        int[] iArr;
        int i3;
        int i4;
        b.a aVar2 = aVar;
        int i5 = i;
        int[] iArr2 = this.g;
        int[] iArr3 = this.h;
        boolean[] zArr = this.i;
        int[] iArr4 = this.j;
        byte[] bArr = aVar2.q;
        int[] iArr5 = aVar2.r;
        char[] cArr = this.k;
        int i6 = this.b;
        boolean z = this.c;
        int i7 = 65537;
        while (true) {
            i7--;
            if (i7 < 0) {
                break;
            } else {
                iArr4[i7] = 0;
            }
        }
        for (int i8 = 0; i8 < 20; i8++) {
            bArr[i5 + i8 + 2] = bArr[(i8 % (i5 + 1)) + 1];
        }
        int i9 = i5 + 21;
        while (true) {
            i9--;
            if (i9 < 0) {
                break;
            } else {
                cArr[i9] = 0;
            }
        }
        int i10 = i5 + 1;
        byte b = bArr[i10];
        bArr[0] = b;
        int i11 = 255;
        int i12 = b & 255;
        int i13 = 0;
        while (i13 <= i5) {
            i13++;
            int i14 = bArr[i13] & 255;
            int i15 = (i12 << 8) + i14;
            iArr4[i15] = iArr4[i15] + 1;
            i12 = i14;
        }
        for (int i16 = 1; i16 <= 65536; i16++) {
            iArr4[i16] = iArr4[i16] + iArr4[i16 - 1];
        }
        int i17 = bArr[1] & 255;
        int i18 = 0;
        while (i18 < i5) {
            int i19 = bArr[i18 + 2] & 255;
            int i20 = (i17 << 8) + i19;
            int i21 = iArr4[i20] - 1;
            iArr4[i20] = i21;
            iArr5[i21] = i18;
            i18++;
            i17 = i19;
        }
        int i22 = ((bArr[i10] & 255) << 8) + (bArr[1] & 255);
        int i23 = iArr4[i22] - 1;
        iArr4[i22] = i23;
        iArr5[i23] = i5;
        int i24 = 256;
        while (true) {
            i24--;
            if (i24 < 0) {
                break;
            }
            zArr[i24] = false;
            iArr2[i24] = i24;
        }
        int i25 = 364;
        while (i25 != 1) {
            i25 /= 3;
            int i26 = i25;
            while (i26 <= i11) {
                int i27 = iArr2[i26];
                int i28 = iArr4[(i27 + 1) << 8] - iArr4[i27 << 8];
                int i29 = i25 - 1;
                int i30 = iArr2[i26 - i25];
                int i31 = i26;
                while (true) {
                    i4 = i25;
                    if (iArr4[(i30 + 1) << 8] - iArr4[i30 << 8] > i28) {
                        iArr2[i31] = i30;
                        int i32 = i31 - i4;
                        if (i32 <= i29) {
                            i31 = i32;
                            break;
                        } else {
                            i30 = iArr2[i32 - i4];
                            i31 = i32;
                            i25 = i4;
                        }
                    }
                }
                iArr2[i31] = i27;
                i26++;
                i25 = i4;
                i11 = 255;
            }
        }
        int i33 = 0;
        while (true) {
            if (i33 > 255) {
                return;
            }
            int i34 = iArr2[i33];
            int i35 = 0;
            for (int i36 = 255; i35 <= i36; i36 = 255) {
                int i37 = (i34 << 8) + i35;
                int i38 = iArr4[i37];
                if ((i38 & 2097152) != 2097152) {
                    int i39 = i35;
                    int i40 = i38 & (-2097153);
                    int i41 = (iArr4[i37 + 1] & (-2097153)) - 1;
                    if (i41 > i40) {
                        i3 = 2097152;
                        i2 = i39;
                        iArr = iArr2;
                        l(aVar2, i40, i41, 2, i5);
                        if (z && this.a > i6) {
                            return;
                        }
                    } else {
                        i2 = i39;
                        iArr = iArr2;
                        i3 = 2097152;
                    }
                    iArr4[i37] = i38 | i3;
                } else {
                    i2 = i35;
                    iArr = iArr2;
                }
                i35 = i2 + 1;
                aVar2 = aVar;
                i5 = i;
                iArr2 = iArr;
            }
            int[] iArr6 = iArr2;
            for (int i42 = 0; i42 <= 255; i42++) {
                iArr3[i42] = iArr4[(i42 << 8) + i34] & (-2097153);
            }
            int i43 = i34 << 8;
            int i44 = (i34 + 1) << 8;
            int i45 = iArr4[i44] & (-2097153);
            for (int i46 = iArr4[i43] & (-2097153); i46 < i45; i46++) {
                int i47 = iArr5[i46];
                int i48 = bArr[i47] & 255;
                if (!zArr[i48]) {
                    iArr5[iArr3[i48]] = i47 == 0 ? i : i47 - 1;
                    iArr3[i48] = iArr3[i48] + 1;
                }
            }
            int i49 = 256;
            while (true) {
                i49--;
                if (i49 < 0) {
                    break;
                }
                int i50 = (i49 << 8) + i34;
                iArr4[i50] = iArr4[i50] | 2097152;
            }
            zArr[i34] = true;
            if (i33 < 255) {
                int i51 = iArr4[i43] & (-2097153);
                int i52 = (iArr4[i44] & (-2097153)) - i51;
                int i53 = 0;
                while ((i52 >> i53) > 65534) {
                    i53++;
                }
                for (int i54 = 0; i54 < i52; i54++) {
                    int i55 = iArr5[i51 + i54];
                    char c = (char) (i54 >> i53);
                    cArr[i55] = c;
                    if (i55 < 20) {
                        cArr[i55 + i + 1] = c;
                    }
                }
            }
            i33++;
            aVar2 = aVar;
            i5 = i;
            iArr2 = iArr6;
        }
    }
}
