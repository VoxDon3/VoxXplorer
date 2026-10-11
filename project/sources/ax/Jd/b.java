package ax.Jd;

import ax.Id.c;
import ax.Id.d;
import ax.Kd.e;
import ax.vd.u;
import ax.wd.C3392i;

/* loaded from: classes3.dex */
public abstract class b {
    private static final byte[] a = {83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object f = new Object();
    private static C0101b[] g = null;
    private static int[] h = null;

    /* renamed from: ax.Jd.b$b, reason: collision with other inner class name */
    private static class C0101b {
        int[] a;
        int[] b;
        int[] c;

        private C0101b() {
            this.a = d.g();
            this.b = d.g();
            this.c = d.g();
        }
    }

    private static class c {
        int[] a;
        int[] b;

        private c() {
            this.a = d.g();
            this.b = d.g();
        }
    }

    private static C0101b A(C0101b c0101b) {
        C0101b c0101b2 = new C0101b();
        B(c0101b, c0101b2);
        return c0101b2;
    }

    private static void B(C0101b c0101b, C0101b c0101b2) {
        d.f(c0101b.a, 0, c0101b2.a, 0);
        d.f(c0101b.b, 0, c0101b2.b, 0);
        d.f(c0101b.c, 0, c0101b2.c, 0);
    }

    private static void C(C0101b c0101b) {
        int[] g2 = d.g();
        int[] g3 = d.g();
        int[] g4 = d.g();
        int[] g5 = d.g();
        int[] g6 = d.g();
        int[] g7 = d.g();
        d.a(c0101b.a, c0101b.b, g2);
        d.H(g2, g2);
        d.H(c0101b.a, g3);
        d.H(c0101b.b, g4);
        d.a(g3, g4, g5);
        d.c(g5);
        d.H(c0101b.c, g6);
        d.a(g6, g6, g6);
        d.c(g6);
        d.J(g5, g6, g7);
        d.J(g2, g5, g2);
        d.J(g3, g4, g3);
        d.A(g2, g7, c0101b.a);
        d.A(g5, g3, c0101b.b);
        d.A(g5, g7, c0101b.c);
    }

    private static void D(C0101b c0101b) {
        d.D(c0101b.c);
    }

    private static void E(int i, int i2, c cVar) {
        int i3 = i * 512;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            d.d(i5, h, i3, cVar.a, 0);
            d.d(i5, h, i3 + 16, cVar.b, 0);
            i3 += 32;
        }
    }

    private static C0101b[] F(C0101b c0101b, int i) {
        C0101b A = A(c0101b);
        C(A);
        C0101b[] c0101bArr = new C0101b[i];
        c0101bArr[0] = A(c0101b);
        for (int i2 = 1; i2 < i; i2++) {
            C0101b A2 = A(c0101bArr[i2 - 1]);
            c0101bArr[i2] = A2;
            z(false, A, A2);
        }
        return c0101bArr;
    }

    private static void G(C0101b c0101b) {
        d.L(c0101b.a);
        d.D(c0101b.b);
        d.D(c0101b.c);
    }

    public static void H() {
        synchronized (f) {
            try {
                if (h == null) {
                    C0101b c0101b = new C0101b();
                    d.f(d, 0, c0101b.a, 0);
                    d.f(e, 0, c0101b.b, 0);
                    D(c0101b);
                    g = F(c0101b, 32);
                    h = d.h(160);
                    int i = 0;
                    for (int i2 = 0; i2 < 5; i2++) {
                        C0101b[] c0101bArr = new C0101b[5];
                        C0101b c0101b2 = new C0101b();
                        G(c0101b2);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 5) {
                                break;
                            }
                            z(true, c0101b, c0101b2);
                            C(c0101b);
                            c0101bArr[i3] = A(c0101b);
                            if (i2 + i3 != 8) {
                                for (int i4 = 1; i4 < 18; i4++) {
                                    C(c0101b);
                                }
                            }
                            i3++;
                        }
                        C0101b[] c0101bArr2 = new C0101b[16];
                        c0101bArr2[0] = c0101b2;
                        int i5 = 1;
                        for (int i6 = 0; i6 < 4; i6++) {
                            int i7 = 1 << i6;
                            int i8 = 0;
                            while (i8 < i7) {
                                C0101b A = A(c0101bArr2[i5 - i7]);
                                c0101bArr2[i5] = A;
                                z(false, c0101bArr[i6], A);
                                i8++;
                                i5++;
                            }
                        }
                        int[] h2 = d.h(16);
                        int[] g2 = d.g();
                        d.f(c0101bArr2[0].c, 0, g2, 0);
                        d.f(g2, 0, h2, 0);
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            if (i10 >= 16) {
                                break;
                            }
                            d.A(g2, c0101bArr2[i10].c, g2);
                            d.f(g2, 0, h2, i10 * 16);
                            i9 = i10;
                        }
                        d.w(g2, g2);
                        int[] g3 = d.g();
                        while (i9 > 0) {
                            int i11 = i9 - 1;
                            d.f(h2, i11 * 16, g3, 0);
                            d.A(g3, g2, g3);
                            d.f(g3, 0, h2, i9 * 16);
                            d.A(g2, c0101bArr2[i9].c, g2);
                            i9 = i11;
                        }
                        d.f(g2, 0, h2, 0);
                        for (int i12 = 0; i12 < 16; i12++) {
                            C0101b c0101b3 = c0101bArr2[i12];
                            d.f(h2, i12 * 16, c0101b3.c, 0);
                            int[] iArr = c0101b3.a;
                            d.A(iArr, c0101b3.c, iArr);
                            int[] iArr2 = c0101b3.b;
                            d.A(iArr2, c0101b3.c, iArr2);
                            d.f(c0101b3.a, 0, h, i);
                            d.f(c0101b3.b, 0, h, i + 16);
                            i += 32;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void I(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] J(byte[] bArr) {
        long k = k(bArr, 84);
        long j = k & 4294967295L;
        long k2 = k(bArr, 91);
        long j2 = k2 & 4294967295L;
        long k3 = k(bArr, 98);
        long j3 = k3 & 4294967295L;
        long k4 = k(bArr, 105);
        long j4 = k4 & 4294967295L;
        long i = i(bArr, 112) & 4294967295L;
        long j5 = ((j(bArr, 109) << 4) & 4294967295L) + (j4 >>> 28);
        long j6 = k4 & 268435455;
        long j7 = ((j(bArr, 74) << 4) & 4294967295L) + (i * 227822194) + (j5 * 149865618);
        long k5 = (k(bArr, 77) & 4294967295L) + (i * 149865618) + (j5 * 550336261);
        long j8 = ((j(bArr, 53) << 4) & 4294967295L) + (j5 * 43969588) + (j6 * 30366549);
        long k6 = (k(bArr, 56) & 4294967295L) + (i * 43969588) + (j5 * 30366549) + (j6 * 163752818);
        long j9 = ((j(bArr, 60) << 4) & 4294967295L) + (i * 30366549) + (j5 * 163752818) + (j6 * 258169998);
        long k7 = (k(bArr, 63) & 4294967295L) + (i * 163752818) + (j5 * 258169998) + (j6 * 96434764);
        long j10 = ((j(bArr, 67) << 4) & 4294967295L) + (i * 258169998) + (j5 * 96434764) + (j6 * 227822194);
        long k8 = (k(bArr, 70) & 4294967295L) + (i * 96434764) + (j5 * 227822194) + (j6 * 149865618);
        long j11 = ((j(bArr, 102) << 4) & 4294967295L) + (j3 >>> 28);
        long j12 = k3 & 268435455;
        long j13 = j10 + (j11 * 149865618);
        long j14 = k8 + (j11 * 550336261);
        long j15 = ((j(bArr, 46) << 4) & 4294967295L) + (j11 * 43969588) + (j12 * 30366549);
        long k9 = (k(bArr, 49) & 4294967295L) + (j6 * 43969588) + (j11 * 30366549) + (j12 * 163752818);
        long j16 = j8 + (j11 * 163752818) + (j12 * 258169998);
        long j17 = k6 + (j11 * 258169998) + (j12 * 96434764);
        long j18 = j9 + (j11 * 96434764) + (j12 * 227822194);
        long j19 = k7 + (j11 * 227822194) + (j12 * 149865618);
        long j20 = ((j(bArr, 95) << 4) & 4294967295L) + (j2 >>> 28);
        long j21 = k2 & 268435455;
        long j22 = j19 + (j20 * 550336261);
        long j23 = ((j(bArr, 39) << 4) & 4294967295L) + (j20 * 43969588) + (j21 * 30366549);
        long k10 = (k(bArr, 42) & 4294967295L) + (j12 * 43969588) + (j20 * 30366549) + (j21 * 163752818);
        long j24 = j15 + (j20 * 163752818) + (j21 * 258169998);
        long j25 = k9 + (j20 * 258169998) + (j21 * 96434764);
        long j26 = j16 + (j20 * 96434764) + (j21 * 227822194);
        long j27 = j17 + (j20 * 227822194) + (j21 * 149865618);
        long j28 = j18 + (j20 * 149865618) + (j21 * 550336261);
        long j29 = ((j(bArr, 88) << 4) & 4294967295L) + (j >>> 28);
        long j30 = j7 + (j6 * 550336261) + (j14 >>> 28);
        long j31 = k5 + (j30 >>> 28);
        long j32 = ((j(bArr, 81) << 4) & 4294967295L) + (i * 550336261) + (j31 >>> 28);
        long j33 = j31 & 268435455;
        long j34 = (k & 268435455) + (j32 >>> 28);
        long j35 = j32 & 268435455;
        long j36 = j24 + (j29 * 96434764) + (j34 * 227822194) + (j35 * 149865618);
        long j37 = j25 + (j29 * 227822194) + (j34 * 149865618) + (j35 * 550336261);
        long j38 = ((j(bArr, 25) << 4) & 4294967295L) + (j35 * 43969588) + (j33 * 30366549);
        long k11 = (k(bArr, 28) & 4294967295L) + (j34 * 43969588) + (j35 * 30366549) + (j33 * 163752818);
        long j39 = ((j(bArr, 32) << 4) & 4294967295L) + (j29 * 43969588) + (j34 * 30366549) + (j35 * 163752818) + (j33 * 258169998);
        long k12 = (k(bArr, 35) & 4294967295L) + (j21 * 43969588) + (j29 * 30366549) + (j34 * 163752818) + (j35 * 258169998) + (j33 * 96434764);
        long j40 = j23 + (j29 * 163752818) + (j34 * 258169998) + (j35 * 96434764) + (j33 * 227822194);
        long j41 = k10 + (j29 * 258169998) + (j34 * 96434764) + (j35 * 227822194) + (j33 * 149865618);
        long j42 = j22 + (j28 >>> 28);
        long j43 = j28 & 268435455;
        long j44 = j13 + (j12 * 550336261) + (j42 >>> 28);
        long j45 = j42 & 268435455;
        long j46 = (j14 & 268435455) + (j44 >>> 28);
        long j47 = j44 & 268435455;
        long j48 = (j30 & 268435455) + (j46 >>> 28);
        long j49 = j46 & 268435455;
        long j50 = j26 + (j29 * 149865618) + (j34 * 550336261) + (j37 >>> 28);
        long j51 = j27 + (j29 * 550336261) + (j50 >>> 28);
        long j52 = j43 + (j51 >>> 28);
        long j53 = j45 + (j52 >>> 28);
        long j54 = j52 & 268435455;
        long j55 = ((j51 & 268435455) * 4) + ((j50 & 268435455) >>> 26) + 1;
        long k13 = (k(bArr, 0) & 4294967295L) + (78101261 * j55);
        long k14 = (k(bArr, 7) & 4294967295L) + (j53 * 43969588) + (30366549 * j54) + (175155932 * j55);
        long j56 = ((j(bArr, 11) << 4) & 4294967295L) + (j47 * 43969588) + (j53 * 30366549) + (163752818 * j54) + (64542499 * j55);
        long k15 = (k(bArr, 14) & 4294967295L) + (j49 * 43969588) + (j47 * 30366549) + (j53 * 163752818) + (258169998 * j54) + (158326419 * j55);
        long j57 = ((j(bArr, 18) << 4) & 4294967295L) + (j48 * 43969588) + (j49 * 30366549) + (j47 * 163752818) + (j53 * 258169998) + (96434764 * j54) + (191173276 * j55);
        long k16 = (k(bArr, 21) & 4294967295L) + (j33 * 43969588) + (j48 * 30366549) + (j49 * 163752818) + (j47 * 258169998) + (j53 * 96434764) + (227822194 * j54) + (104575268 * j55);
        long j58 = j38 + (j48 * 163752818) + (j49 * 258169998) + (j47 * 96434764) + (j53 * 227822194) + (149865618 * j54) + (j55 * 137584065);
        long j59 = ((j(bArr, 4) << 4) & 4294967295L) + (43969588 * j54) + (141809365 * j55) + (k13 >>> 28);
        long j60 = k13 & 268435455;
        long j61 = k14 + (j59 >>> 28);
        long j62 = j56 + (j61 >>> 28);
        long j63 = k15 + (j62 >>> 28);
        long j64 = j57 + (j63 >>> 28);
        long j65 = k16 + (j64 >>> 28);
        long j66 = j58 + (j65 >>> 28);
        long j67 = k11 + (j48 * 258169998) + (j49 * 96434764) + (j47 * 227822194) + (j53 * 149865618) + (j54 * 550336261) + (j66 >>> 28);
        long j68 = j39 + (j48 * 96434764) + (j49 * 227822194) + (j47 * 149865618) + (j53 * 550336261) + (j67 >>> 28);
        long j69 = k12 + (j48 * 227822194) + (j49 * 149865618) + (j47 * 550336261) + (j68 >>> 28);
        long j70 = j40 + (j48 * 149865618) + (j49 * 550336261) + (j69 >>> 28);
        long j71 = j69 & 268435455;
        long j72 = j41 + (j48 * 550336261) + (j70 >>> 28);
        long j73 = j70 & 268435455;
        long j74 = j36 + (j33 * 550336261) + (j72 >>> 28);
        long j75 = j72 & 268435455;
        long j76 = (j37 & 268435455) + (j74 >>> 28);
        long j77 = (j50 & 67108863) + (j76 >>> 28);
        long j78 = (j77 >>> 26) - 1;
        long j79 = j60 - (j78 & 78101261);
        long j80 = (j61 & 268435455) - (j78 & 175155932);
        long j81 = (j62 & 268435455) - (j78 & 64542499);
        long j82 = (j63 & 268435455) - (j78 & 158326419);
        long j83 = (j64 & 268435455) - (j78 & 191173276);
        long j84 = (j65 & 268435455) - (j78 & 104575268);
        long j85 = (j66 & 268435455) - (j78 & 137584065);
        long j86 = ((j59 & 268435455) - (j78 & 141809365)) + (j79 >> 28);
        long j87 = j79 & 268435455;
        long j88 = j80 + (j86 >> 28);
        long j89 = j81 + (j88 >> 28);
        long j90 = j88 & 268435455;
        long j91 = j82 + (j89 >> 28);
        long j92 = j83 + (j91 >> 28);
        long j93 = j84 + (j92 >> 28);
        long j94 = j85 + (j93 >> 28);
        long j95 = (j67 & 268435455) + (j94 >> 28);
        long j96 = j94 & 268435455;
        long j97 = (j68 & 268435455) + (j95 >> 28);
        long j98 = j71 + (j97 >> 28);
        long j99 = j73 + (j98 >> 28);
        long j100 = j75 + (j99 >> 28);
        long j101 = (j74 & 268435455) + (j100 >> 28);
        long j102 = (j76 & 268435455) + (j101 >> 28);
        byte[] bArr2 = new byte[57];
        r(j87 | ((j86 & 268435455) << 28), bArr2, 0);
        r(j90 | ((j89 & 268435455) << 28), bArr2, 7);
        r(((j92 & 268435455) << 28) | (j91 & 268435455), bArr2, 14);
        r((j96 << 28) | (j93 & 268435455), bArr2, 21);
        r(((j97 & 268435455) << 28) | (j95 & 268435455), bArr2, 28);
        r((j98 & 268435455) | ((j99 & 268435455) << 28), bArr2, 35);
        r((j100 & 268435455) | ((j101 & 268435455) << 28), bArr2, 42);
        r((j102 & 268435455) | (((j77 & 67108863) + (j102 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    private static void K(byte[] bArr, C0101b c0101b) {
        H();
        int[] iArr = new int[15];
        n(bArr, 0, iArr);
        iArr[14] = e.a(14, (~iArr[0]) & 1, iArr, c, iArr) + 4;
        e.i(15, iArr, 0);
        c cVar = new c();
        G(c0101b);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & (~(1 << i5))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                E(i3, ((-i6) ^ i4) & 15, cVar);
                d.e(i6, cVar.a);
                y(cVar, c0101b);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                C(c0101b);
            }
        }
    }

    private static void L(byte[] bArr, byte[] bArr2, int i) {
        C0101b c0101b = new C0101b();
        K(bArr, c0101b);
        if (s(c0101b, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void M(c.a aVar, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (aVar == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        I(bArr, i, bArr2);
        C0101b c0101b = new C0101b();
        K(bArr2, c0101b);
        if (d(c0101b.a, c0101b.b, c0101b.c) == 0) {
            throw new IllegalStateException();
        }
        d.f(c0101b.a, 0, iArr, 0);
        d.f(c0101b.b, 0, iArr2, 0);
    }

    private static void N(int[] iArr, int[] iArr2, C0101b c0101b, C0101b c0101b2) {
        H();
        byte[] u = u(iArr, 7);
        byte[] u2 = u(iArr2, 5);
        C0101b[] F = F(c0101b, 8);
        G(c0101b2);
        int i = 446;
        while (true) {
            byte b2 = u[i];
            if (b2 != 0) {
                int i2 = b2 >> 31;
                z(i2 != 0, g[(b2 ^ i2) >>> 1], c0101b2);
            }
            byte b3 = u2[i];
            if (b3 != 0) {
                int i3 = b3 >> 31;
                z(i3 != 0, F[(b3 ^ i3) >>> 1], c0101b2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                C(c0101b2);
            }
        }
    }

    public static void O(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        w(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void P(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        w(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static boolean Q(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return x(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        n(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        n(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        n(bArr3, 0, iArr3);
        e.g(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            q(iArr[i], bArr4, i * 4);
        }
        return J(bArr4);
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] g2 = d.g();
        int[] g3 = d.g();
        int[] g4 = d.g();
        d.H(iArr, g3);
        d.H(iArr2, g4);
        d.A(g3, g4, g2);
        d.a(g3, g4, g3);
        d.z(g2, 39081, g2);
        d.K(g2);
        d.a(g2, g3, g2);
        d.C(g2);
        return d.x(g2);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g2 = d.g();
        int[] g3 = d.g();
        int[] g4 = d.g();
        int[] g5 = d.g();
        d.H(iArr, g3);
        d.H(iArr2, g4);
        d.H(iArr3, g5);
        d.A(g3, g4, g2);
        d.a(g3, g4, g3);
        d.A(g3, g5, g3);
        d.H(g5, g5);
        d.z(g2, 39081, g2);
        d.J(g2, g5, g2);
        d.a(g2, g3, g2);
        d.C(g2);
        return d.x(g2);
    }

    private static boolean e(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        l(bArr, 0, new int[14], 0, 14);
        return !e.d(14, r2, b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        n(bArr, 0, iArr);
        return !e.d(14, iArr, c);
    }

    private static byte[] g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    private static u h() {
        return new C3392i(256);
    }

    private static int i(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static int j(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int k(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void l(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = k(bArr, (i4 * 4) + i);
        }
    }

    private static boolean m(byte[] bArr, int i, boolean z, C0101b c0101b) {
        byte[] g2 = g(bArr, i, 57);
        if (!e(g2)) {
            return false;
        }
        byte b2 = g2[56];
        int i2 = (b2 & 128) >>> 7;
        g2[56] = (byte) (b2 & Byte.MAX_VALUE);
        d.j(g2, 0, c0101b.b);
        int[] g3 = d.g();
        int[] g4 = d.g();
        d.H(c0101b.b, g3);
        d.z(g3, 39081, g4);
        d.B(g3, g3);
        d.b(g3);
        d.b(g4);
        if (!d.I(g3, g4, c0101b.a)) {
            return false;
        }
        d.C(c0101b.a);
        if (i2 == 1 && d.y(c0101b.a)) {
            return false;
        }
        int[] iArr = c0101b.a;
        if (z ^ (i2 != (iArr[0] & 1))) {
            d.B(iArr, iArr);
        }
        D(c0101b);
        return true;
    }

    private static void n(byte[] bArr, int i, int[] iArr) {
        l(bArr, i, iArr, 0, 14);
    }

    private static void o(u uVar, byte b2, byte[] bArr) {
        byte[] bArr2 = a;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b2;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        uVar.b(bArr3, 0, length2);
    }

    private static void p(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void q(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void r(long j, byte[] bArr, int i) {
        q((int) j, bArr, i);
        p((int) (j >>> 32), bArr, i + 4);
    }

    private static int s(C0101b c0101b, byte[] bArr, int i) {
        int[] g2 = d.g();
        int[] g3 = d.g();
        d.v(c0101b.c, g3);
        d.A(c0101b.a, g3, g2);
        d.A(c0101b.b, g3, g3);
        d.C(g2);
        d.C(g3);
        int c2 = c(g2, g3);
        d.p(g3, bArr, i);
        bArr[i + 56] = (byte) ((g2[0] & 1) << 7);
        return c2;
    }

    public static void t(byte[] bArr, int i, byte[] bArr2, int i2) {
        u h2 = h();
        byte[] bArr3 = new byte[114];
        h2.b(bArr, i, 57);
        h2.e(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        I(bArr3, 0, bArr4);
        L(bArr4, bArr2, i2);
    }

    private static byte[] u(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 0;
        int i3 = 14;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[447];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i2 < 28) {
            int i10 = iArr2[i2];
            while (i8 < 16) {
                int i11 = i10 >>> i8;
                if ((i11 & 1) == i9) {
                    i8++;
                } else {
                    int i12 = (i11 | 1) << i7;
                    bArr[(i2 << 4) + i8] = (byte) (i12 >> i7);
                    i8 += i;
                    i9 = i12 >>> 31;
                }
            }
            i2++;
            i8 -= 16;
        }
        return bArr;
    }

    private static void v(u uVar, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b2, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        o(uVar, b2, bArr4);
        uVar.b(bArr, 57, 57);
        uVar.b(bArr5, i2, i3);
        uVar.e(bArr, 0, bArr.length);
        byte[] J = J(bArr);
        byte[] bArr7 = new byte[57];
        L(J, bArr7, 0);
        o(uVar, b2, bArr4);
        uVar.b(bArr7, 0, 57);
        uVar.b(bArr3, i, 57);
        uVar.b(bArr5, i2, i3);
        uVar.e(bArr, 0, bArr.length);
        byte[] a2 = a(J, J(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(a2, 0, bArr6, i4 + 57, 57);
    }

    private static void w(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b2, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (!b(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        u h2 = h();
        byte[] bArr6 = new byte[114];
        h2.b(bArr, i, 57);
        h2.e(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        I(bArr6, 0, bArr7);
        v(h2, bArr6, bArr7, bArr2, i2, bArr3, b2, bArr4, i3, i4, bArr5, i5);
    }

    private static boolean x(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b2, byte[] bArr4, int i3, int i4) {
        if (!b(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] g2 = g(bArr, i, 57);
        byte[] g3 = g(bArr, i + 57, 57);
        if (!e(g2)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!f(g3, iArr)) {
            return false;
        }
        C0101b c0101b = new C0101b();
        if (!m(bArr2, i2, true, c0101b)) {
            return false;
        }
        u h2 = h();
        byte[] bArr5 = new byte[114];
        o(h2, b2, bArr3);
        h2.b(g2, 0, 57);
        h2.b(bArr2, i2, 57);
        h2.b(bArr4, i3, i4);
        h2.e(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        n(J(bArr5), 0, iArr2);
        C0101b c0101b2 = new C0101b();
        N(iArr, iArr2, c0101b, c0101b2);
        byte[] bArr6 = new byte[57];
        return s(c0101b2, bArr6, 0) != 0 && ax.Nd.a.b(bArr6, g2);
    }

    private static void y(c cVar, C0101b c0101b) {
        int[] g2 = d.g();
        int[] g3 = d.g();
        int[] g4 = d.g();
        int[] g5 = d.g();
        int[] g6 = d.g();
        int[] g7 = d.g();
        int[] g8 = d.g();
        d.H(c0101b.c, g2);
        d.A(cVar.a, c0101b.a, g3);
        d.A(cVar.b, c0101b.b, g4);
        d.A(g3, g4, g5);
        d.z(g5, 39081, g5);
        d.a(g2, g5, g6);
        d.J(g2, g5, g7);
        d.a(cVar.a, cVar.b, g2);
        d.a(c0101b.a, c0101b.b, g5);
        d.A(g2, g5, g8);
        d.a(g4, g3, g2);
        d.J(g4, g3, g5);
        d.c(g2);
        d.J(g8, g2, g8);
        d.A(g8, c0101b.c, g8);
        d.A(g5, c0101b.c, g5);
        d.A(g6, g8, c0101b.a);
        d.A(g5, g7, c0101b.b);
        d.A(g6, g7, c0101b.c);
    }

    private static void z(boolean z, C0101b c0101b, C0101b c0101b2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] g2 = d.g();
        int[] g3 = d.g();
        int[] g4 = d.g();
        int[] g5 = d.g();
        int[] g6 = d.g();
        int[] g7 = d.g();
        int[] g8 = d.g();
        int[] g9 = d.g();
        if (z) {
            d.J(c0101b.b, c0101b.a, g9);
            iArr2 = g3;
            iArr = g6;
            iArr4 = g7;
            iArr3 = g8;
        } else {
            d.a(c0101b.b, c0101b.a, g9);
            iArr = g3;
            iArr2 = g6;
            iArr3 = g7;
            iArr4 = g8;
        }
        d.A(c0101b.c, c0101b2.c, g2);
        d.H(g2, g3);
        d.A(c0101b.a, c0101b2.a, g4);
        d.A(c0101b.b, c0101b2.b, g5);
        d.A(g4, g5, g6);
        d.z(g6, 39081, g6);
        d.a(g3, g6, iArr3);
        d.J(g3, g6, iArr4);
        d.a(c0101b2.a, c0101b2.b, g6);
        d.A(g9, g6, g9);
        d.a(g5, g4, iArr);
        d.J(g5, g4, iArr2);
        d.c(iArr);
        d.J(g9, g3, g9);
        d.A(g9, g2, g9);
        d.A(g6, g2, g6);
        d.A(g7, g9, c0101b2.a);
        d.A(g6, g8, c0101b2.b);
        d.A(g7, g8, c0101b2.c);
    }
}
