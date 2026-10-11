package ax.Jd;

import ax.Id.a;
import ax.vd.InterfaceC3312i;
import ax.wd.C3391h;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public abstract class a {
    private static final byte[] a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] b = {-19, -1, -1, -1, -1, -1, -1, SubsamplingScaleImageView.TILE_SIZE_AUTO};
    private static final int[] c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object i = new Object();
    private static d[] j = null;
    private static int[] k = null;

    private static class b {
        int[] a;
        int[] b;
        int[] c;
        int[] d;
        int[] e;

        private b() {
            this.a = ax.Id.b.h();
            this.b = ax.Id.b.h();
            this.c = ax.Id.b.h();
            this.d = ax.Id.b.h();
            this.e = ax.Id.b.h();
        }
    }

    private static class c {
        int[] a;
        int[] b;

        private c() {
            this.a = ax.Id.b.h();
            this.b = ax.Id.b.h();
        }
    }

    private static class d {
        int[] a;
        int[] b;
        int[] c;
        int[] d;

        private d() {
            this.a = ax.Id.b.h();
            this.b = ax.Id.b.h();
            this.c = ax.Id.b.h();
            this.d = ax.Id.b.h();
        }
    }

    private static class e {
        int[] a;
        int[] b;
        int[] c;

        private e() {
            this.a = ax.Id.b.h();
            this.b = ax.Id.b.h();
            this.c = ax.Id.b.h();
        }
    }

    private static d A(b bVar) {
        d dVar = new d();
        ax.Id.b.g(bVar.a, 0, dVar.a, 0);
        ax.Id.b.g(bVar.b, 0, dVar.b, 0);
        ax.Id.b.g(bVar.c, 0, dVar.c, 0);
        ax.Id.b.z(bVar.d, bVar.e, dVar.d);
        return dVar;
    }

    private static d B(c cVar) {
        d dVar = new d();
        ax.Id.b.g(cVar.a, 0, dVar.a, 0);
        ax.Id.b.g(cVar.b, 0, dVar.b, 0);
        G(dVar);
        return dVar;
    }

    private static d C(d dVar) {
        d dVar2 = new d();
        D(dVar, dVar2);
        return dVar2;
    }

    private static void D(d dVar, d dVar2) {
        ax.Id.b.g(dVar.a, 0, dVar2.a, 0);
        ax.Id.b.g(dVar.b, 0, dVar2.b, 0);
        ax.Id.b.g(dVar.c, 0, dVar2.c, 0);
        ax.Id.b.g(dVar.d, 0, dVar2.d, 0);
    }

    private static void E(b bVar) {
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        int[] iArr = bVar.d;
        int[] h5 = ax.Id.b.h();
        int[] h6 = ax.Id.b.h();
        int[] iArr2 = bVar.e;
        ax.Id.b.G(bVar.a, h2);
        ax.Id.b.G(bVar.b, h3);
        ax.Id.b.G(bVar.c, h4);
        ax.Id.b.a(h4, h4, h4);
        ax.Id.b.c(h2, h3, iArr2, h6);
        ax.Id.b.a(bVar.a, bVar.b, iArr);
        ax.Id.b.G(iArr, iArr);
        ax.Id.b.I(iArr2, iArr, iArr);
        ax.Id.b.a(h4, h6, h5);
        ax.Id.b.d(h5);
        ax.Id.b.z(iArr, h5, bVar.a);
        ax.Id.b.z(h6, iArr2, bVar.b);
        ax.Id.b.z(h5, h6, bVar.c);
    }

    private static void F(b bVar) {
        ax.Id.b.C(bVar.c);
        ax.Id.b.g(bVar.a, 0, bVar.d, 0);
        ax.Id.b.g(bVar.b, 0, bVar.e, 0);
    }

    private static void G(d dVar) {
        ax.Id.b.C(dVar.c);
        ax.Id.b.z(dVar.a, dVar.b, dVar.d);
    }

    private static void H(int i2, int i3, e eVar) {
        int i4 = i2 * 240;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = ((i5 ^ i3) - 1) >> 31;
            ax.Id.b.e(i6, k, i4, eVar.a, 0);
            ax.Id.b.e(i6, k, i4 + 10, eVar.b, 0);
            ax.Id.b.e(i6, k, i4 + 20, eVar.c, 0);
            i4 += 30;
        }
    }

    private static d[] I(d dVar, int i2) {
        d dVar2 = new d();
        z(false, dVar, dVar, dVar2);
        d[] dVarArr = new d[i2];
        dVarArr[0] = C(dVar);
        for (int i3 = 1; i3 < i2; i3++) {
            d dVar3 = dVarArr[i3 - 1];
            d dVar4 = new d();
            dVarArr[i3] = dVar4;
            z(false, dVar3, dVar2, dVar4);
        }
        return dVarArr;
    }

    private static void J(b bVar) {
        ax.Id.b.K(bVar.a);
        ax.Id.b.C(bVar.b);
        ax.Id.b.C(bVar.c);
        ax.Id.b.K(bVar.d);
        ax.Id.b.C(bVar.e);
    }

    private static void K(d dVar) {
        ax.Id.b.K(dVar.a);
        ax.Id.b.C(dVar.b);
        ax.Id.b.C(dVar.c);
        ax.Id.b.K(dVar.d);
    }

    public static void L() {
        int i2;
        synchronized (i) {
            try {
                if (k == null) {
                    d dVar = new d();
                    int[] iArr = d;
                    ax.Id.b.g(iArr, 0, dVar.a, 0);
                    int[] iArr2 = e;
                    ax.Id.b.g(iArr2, 0, dVar.b, 0);
                    G(dVar);
                    j = I(dVar, 32);
                    b bVar = new b();
                    ax.Id.b.g(iArr, 0, bVar.a, 0);
                    ax.Id.b.g(iArr2, 0, bVar.b, 0);
                    F(bVar);
                    k = ax.Id.b.i(192);
                    int i3 = 0;
                    for (int i4 = 0; i4 < 8; i4++) {
                        d[] dVarArr = new d[4];
                        d dVar2 = new d();
                        K(dVar2);
                        int i5 = 0;
                        while (true) {
                            i2 = 1;
                            if (i5 >= 4) {
                                break;
                            }
                            z(true, dVar2, A(bVar), dVar2);
                            E(bVar);
                            dVarArr[i5] = A(bVar);
                            if (i4 + i5 != 10) {
                                while (i2 < 8) {
                                    E(bVar);
                                    i2++;
                                }
                            }
                            i5++;
                        }
                        d[] dVarArr2 = new d[8];
                        dVarArr2[0] = dVar2;
                        int i6 = 0;
                        int i7 = 1;
                        while (i6 < 3) {
                            int i8 = i2 << i6;
                            int i9 = 0;
                            while (i9 < i8) {
                                d dVar3 = dVarArr2[i7 - i8];
                                d dVar4 = dVarArr[i6];
                                d dVar5 = new d();
                                dVarArr2[i7] = dVar5;
                                z(false, dVar3, dVar4, dVar5);
                                i9++;
                                i7++;
                            }
                            i6++;
                            i2 = 1;
                        }
                        int[] i10 = ax.Id.b.i(8);
                        int[] h2 = ax.Id.b.h();
                        ax.Id.b.g(dVarArr2[0].c, 0, h2, 0);
                        ax.Id.b.g(h2, 0, i10, 0);
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            if (i12 >= 8) {
                                break;
                            }
                            ax.Id.b.z(h2, dVarArr2[i12].c, h2);
                            ax.Id.b.g(h2, 0, i10, i12 * 10);
                            i11 = i12;
                        }
                        ax.Id.b.a(h2, h2, h2);
                        ax.Id.b.v(h2, h2);
                        int[] h3 = ax.Id.b.h();
                        while (i11 > 0) {
                            int i13 = i11 - 1;
                            ax.Id.b.g(i10, i13 * 10, h3, 0);
                            ax.Id.b.z(h3, h2, h3);
                            ax.Id.b.g(h3, 0, i10, i11 * 10);
                            ax.Id.b.z(h2, dVarArr2[i11].c, h2);
                            i11 = i13;
                        }
                        ax.Id.b.g(h2, 0, i10, 0);
                        for (int i14 = 0; i14 < 8; i14++) {
                            d dVar6 = dVarArr2[i14];
                            int[] h4 = ax.Id.b.h();
                            int[] h5 = ax.Id.b.h();
                            ax.Id.b.g(i10, i14 * 10, h5, 0);
                            ax.Id.b.z(dVar6.a, h5, h4);
                            ax.Id.b.z(dVar6.b, h5, h5);
                            e eVar = new e();
                            ax.Id.b.c(h5, h4, eVar.a, eVar.b);
                            ax.Id.b.z(h4, h5, eVar.c);
                            int[] iArr3 = eVar.c;
                            ax.Id.b.z(iArr3, h, iArr3);
                            ax.Id.b.B(eVar.a);
                            ax.Id.b.B(eVar.b);
                            ax.Id.b.g(eVar.a, 0, k, i3);
                            ax.Id.b.g(eVar.b, 0, k, i3 + 10);
                            ax.Id.b.g(eVar.c, 0, k, i3 + 20);
                            i3 += 30;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void M(byte[] bArr, int i2, byte[] bArr2) {
        System.arraycopy(bArr, i2, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b2 = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b2;
        bArr2[31] = (byte) (b2 | 64);
    }

    private static byte[] N(byte[] bArr) {
        long j2 = j(bArr, 49);
        long j3 = j2 & 4294967295L;
        long j4 = j(bArr, 56);
        long j5 = bArr[63] & 255;
        long i2 = ((i(bArr, 60) << 4) & 4294967295L) + ((j4 & 4294967295L) >> 28);
        long j6 = j4 & 268435455;
        long j7 = (j(bArr, 28) & 4294967295L) - (i2 * (-50998291));
        long i3 = (((i(bArr, 32) << 4) & 4294967295L) - (j5 * (-50998291))) - (i2 * 19280294);
        long j8 = ((j(bArr, 42) & 4294967295L) - (j5 * (-6428113))) - (i2 * 5343);
        long i4 = ((((i(bArr, 39) << 4) & 4294967295L) - (j5 * 127719000)) - (i2 * (-6428113))) - (j6 * 5343);
        long i5 = ((i(bArr, 53) << 4) & 4294967295L) + (j3 >> 28);
        long j9 = j2 & 268435455;
        long j10 = ((((j(bArr, 35) & 4294967295L) - (j5 * 19280294)) - (i2 * 127719000)) - (j6 * (-6428113))) - (i5 * 5343);
        long j11 = ((i3 - (j6 * 127719000)) - (i5 * (-6428113))) - (j9 * 5343);
        long i6 = (((i(bArr, 46) << 4) & 4294967295L) - (j5 * 5343)) + (j8 >> 28);
        long j12 = (j(bArr, 14) & 4294967295L) - (i6 * (-50998291));
        long i7 = (((i(bArr, 18) << 4) & 4294967295L) - (j9 * (-50998291))) - (i6 * 19280294);
        long j13 = (((j(bArr, 21) & 4294967295L) - (i5 * (-50998291))) - (j9 * 19280294)) - (i6 * 127719000);
        long i8 = (((((i(bArr, 25) << 4) & 4294967295L) - (j6 * (-50998291))) - (i5 * 19280294)) - (j9 * 127719000)) - (i6 * (-6428113));
        long j14 = (((j7 - (j6 * 19280294)) - (i5 * 127719000)) - (j9 * (-6428113))) - (i6 * 5343);
        long j15 = (j8 & 268435455) + (i4 >> 28);
        long j16 = i8 - (j15 * 5343);
        long j17 = (i4 & 268435455) + (j10 >> 28);
        long i9 = (((i(bArr, 11) << 4) & 4294967295L) - (j15 * (-50998291))) - (j17 * 19280294);
        long j18 = (j12 - (j15 * 19280294)) - (j17 * 127719000);
        long j19 = (i7 - (j15 * 127719000)) - (j17 * (-6428113));
        long j20 = (j13 - (j15 * (-6428113))) - (j17 * 5343);
        long j21 = (j10 & 268435455) + (j11 >> 28);
        long i10 = ((i(bArr, 4) << 4) & 4294967295L) - (j21 * (-50998291));
        long j22 = ((j(bArr, 7) & 4294967295L) - (j17 * (-50998291))) - (j21 * 19280294);
        long j23 = i9 - (j21 * 127719000);
        long j24 = j18 - (j21 * (-6428113));
        long j25 = j19 - (j21 * 5343);
        long j26 = j14 + (j16 >> 28);
        long j27 = (j11 & 268435455) + (j26 >> 28);
        long j28 = j26 & 268435455;
        long j29 = j28 >>> 27;
        long j30 = j27 + j29;
        long j31 = (j(bArr, 0) & 4294967295L) - (j30 * (-50998291));
        long j32 = (i10 - (j30 * 19280294)) + (j31 >> 28);
        long j33 = (j22 - (j30 * 127719000)) + (j32 >> 28);
        long j34 = (j23 - (j30 * (-6428113))) + (j33 >> 28);
        long j35 = (j24 - (j30 * 5343)) + (j34 >> 28);
        long j36 = j25 + (j35 >> 28);
        long j37 = j20 + (j36 >> 28);
        long j38 = (j16 & 268435455) + (j37 >> 28);
        long j39 = j28 + (j38 >> 28);
        long j40 = (j39 >> 28) - j29;
        long j41 = (j31 & 268435455) + (j40 & (-50998291));
        long j42 = (j32 & 268435455) + (j40 & 19280294) + (j41 >> 28);
        long j43 = (j33 & 268435455) + (j40 & 127719000) + (j42 >> 28);
        long j44 = (j34 & 268435455) + (j40 & (-6428113)) + (j43 >> 28);
        long j45 = (j35 & 268435455) + (j40 & 5343) + (j44 >> 28);
        long j46 = (j36 & 268435455) + (j45 >> 28);
        long j47 = (j37 & 268435455) + (j46 >> 28);
        long j48 = (j38 & 268435455) + (j47 >> 28);
        byte[] bArr2 = new byte[32];
        q((j41 & 268435455) | ((j42 & 268435455) << 28), bArr2, 0);
        q((j43 & 268435455) | ((j44 & 268435455) << 28), bArr2, 7);
        q((j45 & 268435455) | ((j46 & 268435455) << 28), bArr2, 14);
        q((j47 & 268435455) | ((j48 & 268435455) << 28), bArr2, 21);
        p((int) ((j39 & 268435455) + (j48 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void O(byte[] bArr, b bVar) {
        L();
        int[] iArr = new int[8];
        m(bArr, 0, iArr);
        ax.Kd.e.a(8, (~iArr[0]) & 1, iArr, c, iArr);
        ax.Kd.e.i(8, iArr, 1);
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = ax.Kd.b.b(iArr[i2]);
        }
        e eVar = new e();
        J(bVar);
        int i3 = 28;
        while (true) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = iArr[i4] >>> i3;
                int i6 = (i5 >>> 3) & 1;
                H(i4, (i5 ^ (-i6)) & 7, eVar);
                ax.Id.b.j(i6, eVar.a, eVar.b);
                ax.Id.b.f(i6, eVar.c);
                x(eVar, bVar);
            }
            i3 -= 4;
            if (i3 < 0) {
                return;
            } else {
                E(bVar);
            }
        }
    }

    private static void P(byte[] bArr, byte[] bArr2, int i2) {
        b bVar = new b();
        O(bArr, bVar);
        if (r(bVar, bArr2, i2) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void Q(a.C0093a c0093a, byte[] bArr, int i2, int[] iArr, int[] iArr2) {
        if (c0093a == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        M(bArr, i2, bArr2);
        b bVar = new b();
        O(bArr2, bVar);
        if (d(bVar.a, bVar.b, bVar.c) == 0) {
            throw new IllegalStateException();
        }
        ax.Id.b.g(bVar.b, 0, iArr, 0);
        ax.Id.b.g(bVar.c, 0, iArr2, 0);
    }

    private static void R(int[] iArr, int[] iArr2, c cVar, b bVar) {
        L();
        byte[] t = t(iArr, 7);
        byte[] t2 = t(iArr2, 5);
        d[] I = I(B(cVar), 8);
        J(bVar);
        int i2 = 252;
        while (true) {
            byte b2 = t[i2];
            if (b2 != 0) {
                int i3 = b2 >> 31;
                y(i3 != 0, j[(b2 ^ i3) >>> 1], bVar);
            }
            byte b3 = t2[i2];
            if (b3 != 0) {
                int i4 = b3 >> 31;
                y(i4 != 0, I[(b3 ^ i4) >>> 1], bVar);
            }
            i2--;
            if (i2 < 0) {
                return;
            } else {
                E(bVar);
            }
        }
    }

    public static void S(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4, int i5, byte[] bArr4, int i6) {
        v(bArr, i2, bArr2, i3, null, (byte) 0, bArr3, i4, i5, bArr4, i6);
    }

    public static void T(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4, int i4, int i5, byte[] bArr5, int i6) {
        v(bArr, i2, bArr2, i3, bArr3, (byte) 0, bArr4, i4, i5, bArr5, i6);
    }

    public static void U(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4, int i4, byte[] bArr5, int i5) {
        v(bArr, i2, bArr2, i3, bArr3, (byte) 1, bArr4, i4, 64, bArr5, i5);
    }

    public static boolean V(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4, int i5) {
        return w(bArr, i2, bArr2, i3, null, (byte) 0, bArr3, i4, i5);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        m(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        m(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        m(bArr3, 0, iArr3);
        ax.Kd.d.b(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i2 = 0; i2 < 16; i2++) {
            p(iArr[i2], bArr4, i2 * 4);
        }
        return N(bArr4);
    }

    private static boolean b(byte[] bArr, byte b2) {
        if (bArr == null && b2 == 0) {
            return true;
        }
        return bArr != null && bArr.length < 256;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        ax.Id.b.G(iArr, h3);
        ax.Id.b.G(iArr2, h4);
        ax.Id.b.z(h3, h4, h2);
        ax.Id.b.I(h4, h3, h4);
        ax.Id.b.z(h2, f, h2);
        ax.Id.b.b(h2);
        ax.Id.b.I(h2, h4, h2);
        ax.Id.b.B(h2);
        return ax.Id.b.w(h2);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        int[] h5 = ax.Id.b.h();
        ax.Id.b.G(iArr, h3);
        ax.Id.b.G(iArr2, h4);
        ax.Id.b.G(iArr3, h5);
        ax.Id.b.z(h3, h4, h2);
        ax.Id.b.I(h4, h3, h4);
        ax.Id.b.z(h4, h5, h4);
        ax.Id.b.G(h5, h5);
        ax.Id.b.z(h2, f, h2);
        ax.Id.b.a(h2, h5, h2);
        ax.Id.b.I(h2, h4, h2);
        ax.Id.b.B(h2);
        return ax.Id.b.w(h2);
    }

    private static boolean e(byte[] bArr) {
        int[] iArr = new int[8];
        k(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & SubsamplingScaleImageView.TILE_SIZE_AUTO;
        return !ax.Kd.d.a(iArr, b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        m(bArr, 0, iArr);
        return !ax.Kd.d.a(iArr, c);
    }

    private static byte[] g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    private static InterfaceC3312i h() {
        return new C3391h();
    }

    private static int i(byte[] bArr, int i2) {
        return ((bArr[i2 + 2] & 255) << 16) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
    }

    private static int j(byte[] bArr, int i2) {
        return (bArr[i2 + 3] << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private static void k(byte[] bArr, int i2, int[] iArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i3 + i5] = j(bArr, (i5 * 4) + i2);
        }
    }

    private static boolean l(byte[] bArr, int i2, boolean z, c cVar) {
        byte[] g2 = g(bArr, i2, 32);
        if (!e(g2)) {
            return false;
        }
        byte b2 = g2[31];
        int i3 = (b2 & 128) >>> 7;
        g2[31] = (byte) (b2 & Byte.MAX_VALUE);
        ax.Id.b.k(g2, 0, cVar.b);
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        ax.Id.b.G(cVar.b, h2);
        ax.Id.b.z(f, h2, h3);
        ax.Id.b.J(h2);
        ax.Id.b.b(h3);
        if (!ax.Id.b.H(h2, h3, cVar.a)) {
            return false;
        }
        ax.Id.b.B(cVar.a);
        if (i3 == 1 && ax.Id.b.x(cVar.a)) {
            return false;
        }
        int[] iArr = cVar.a;
        if (z ^ (i3 != (iArr[0] & 1))) {
            ax.Id.b.A(iArr, iArr);
        }
        return true;
    }

    private static void m(byte[] bArr, int i2, int[] iArr) {
        k(bArr, i2, iArr, 0, 8);
    }

    private static void n(InterfaceC3312i interfaceC3312i, byte b2, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = a;
            int length = bArr2.length;
            int i2 = length + 2;
            int length2 = bArr.length + i2;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b2;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i2, bArr.length);
            interfaceC3312i.b(bArr3, 0, length2);
        }
    }

    private static void o(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
    }

    private static void p(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    private static void q(long j2, byte[] bArr, int i2) {
        p((int) j2, bArr, i2);
        o((int) (j2 >>> 32), bArr, i2 + 4);
    }

    private static int r(b bVar, byte[] bArr, int i2) {
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        ax.Id.b.u(bVar.c, h3);
        ax.Id.b.z(bVar.a, h3, h2);
        ax.Id.b.z(bVar.b, h3, h3);
        ax.Id.b.B(h2);
        ax.Id.b.B(h3);
        int c2 = c(h2, h3);
        ax.Id.b.p(h3, bArr, i2);
        int i3 = i2 + 31;
        bArr[i3] = (byte) (((h2[0] & 1) << 7) | bArr[i3]);
        return c2;
    }

    public static void s(byte[] bArr, int i2, byte[] bArr2, int i3) {
        InterfaceC3312i h2 = h();
        byte[] bArr3 = new byte[h2.i()];
        h2.b(bArr, i2, 32);
        h2.c(bArr3, 0);
        byte[] bArr4 = new byte[32];
        M(bArr3, 0, bArr4);
        P(bArr4, bArr2, i3);
    }

    private static byte[] t(int[] iArr, int i2) {
        int[] iArr2 = new int[16];
        int i3 = 0;
        int i4 = 8;
        int i5 = 16;
        int i6 = 0;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            int i7 = iArr[i4];
            iArr2[i5 - 1] = (i6 << 16) | (i7 >>> 16);
            i5 -= 2;
            iArr2[i5] = i7;
            i6 = i7;
        }
        byte[] bArr = new byte[253];
        int i8 = 32 - i2;
        int i9 = 0;
        int i10 = 0;
        while (i3 < 16) {
            int i11 = iArr2[i3];
            while (i9 < 16) {
                int i12 = i11 >>> i9;
                if ((i12 & 1) == i10) {
                    i9++;
                } else {
                    int i13 = (i12 | 1) << i8;
                    bArr[(i3 << 4) + i9] = (byte) (i13 >> i8);
                    i9 += i2;
                    i10 = i13 >>> 31;
                }
            }
            i3++;
            i9 -= 16;
        }
        return bArr;
    }

    private static void u(InterfaceC3312i interfaceC3312i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, byte b2, byte[] bArr5, int i3, int i4, byte[] bArr6, int i5) {
        n(interfaceC3312i, b2, bArr4);
        interfaceC3312i.b(bArr, 32, 32);
        interfaceC3312i.b(bArr5, i3, i4);
        interfaceC3312i.c(bArr, 0);
        byte[] N = N(bArr);
        byte[] bArr7 = new byte[32];
        P(N, bArr7, 0);
        n(interfaceC3312i, b2, bArr4);
        interfaceC3312i.b(bArr7, 0, 32);
        interfaceC3312i.b(bArr3, i2, 32);
        interfaceC3312i.b(bArr5, i3, i4);
        interfaceC3312i.c(bArr, 0);
        byte[] a2 = a(N, N(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i5, 32);
        System.arraycopy(a2, 0, bArr6, i5 + 32, 32);
    }

    private static void v(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte b2, byte[] bArr4, int i4, int i5, byte[] bArr5, int i6) {
        if (!b(bArr3, b2)) {
            throw new IllegalArgumentException("ctx");
        }
        InterfaceC3312i h2 = h();
        byte[] bArr6 = new byte[h2.i()];
        h2.b(bArr, i2, 32);
        h2.c(bArr6, 0);
        byte[] bArr7 = new byte[32];
        M(bArr6, 0, bArr7);
        u(h2, bArr6, bArr7, bArr2, i3, bArr3, b2, bArr4, i4, i5, bArr5, i6);
    }

    private static boolean w(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, byte b2, byte[] bArr4, int i4, int i5) {
        if (!b(bArr3, b2)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] g2 = g(bArr, i2, 32);
        byte[] g3 = g(bArr, i2 + 32, 32);
        if (!e(g2)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!f(g3, iArr)) {
            return false;
        }
        c cVar = new c();
        if (!l(bArr2, i3, true, cVar)) {
            return false;
        }
        InterfaceC3312i h2 = h();
        byte[] bArr5 = new byte[h2.i()];
        n(h2, b2, bArr3);
        h2.b(g2, 0, 32);
        h2.b(bArr2, i3, 32);
        h2.b(bArr4, i4, i5);
        h2.c(bArr5, 0);
        int[] iArr2 = new int[8];
        m(N(bArr5), 0, iArr2);
        b bVar = new b();
        R(iArr, iArr2, cVar, bVar);
        byte[] bArr6 = new byte[32];
        return r(bVar, bArr6, 0) != 0 && ax.Nd.a.b(bArr6, g2);
    }

    private static void x(e eVar, b bVar) {
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        int[] iArr = bVar.d;
        int[] h5 = ax.Id.b.h();
        int[] h6 = ax.Id.b.h();
        int[] iArr2 = bVar.e;
        ax.Id.b.c(bVar.b, bVar.a, h3, h2);
        ax.Id.b.z(h2, eVar.b, h2);
        ax.Id.b.z(h3, eVar.a, h3);
        ax.Id.b.z(bVar.d, bVar.e, h4);
        ax.Id.b.z(h4, eVar.c, h4);
        ax.Id.b.c(h3, h2, iArr2, iArr);
        ax.Id.b.c(bVar.c, h4, h6, h5);
        ax.Id.b.d(h6);
        ax.Id.b.z(iArr, h5, bVar.a);
        ax.Id.b.z(h6, iArr2, bVar.b);
        ax.Id.b.z(h5, h6, bVar.c);
    }

    private static void y(boolean z, d dVar, b bVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        int[] h5 = ax.Id.b.h();
        int[] iArr5 = bVar.d;
        int[] h6 = ax.Id.b.h();
        int[] h7 = ax.Id.b.h();
        int[] iArr6 = bVar.e;
        if (z) {
            iArr2 = h4;
            iArr = h5;
            iArr4 = h6;
            iArr3 = h7;
        } else {
            iArr = h4;
            iArr2 = h5;
            iArr3 = h6;
            iArr4 = h7;
        }
        ax.Id.b.c(bVar.b, bVar.a, h3, h2);
        ax.Id.b.c(dVar.b, dVar.a, iArr2, iArr);
        ax.Id.b.z(h2, h4, h2);
        ax.Id.b.z(h3, h5, h3);
        ax.Id.b.z(bVar.d, bVar.e, h4);
        ax.Id.b.z(h4, dVar.d, h4);
        ax.Id.b.z(h4, g, h4);
        ax.Id.b.z(bVar.c, dVar.c, h5);
        ax.Id.b.a(h5, h5, h5);
        ax.Id.b.c(h3, h2, iArr6, iArr5);
        ax.Id.b.c(h5, h4, iArr4, iArr3);
        ax.Id.b.d(iArr4);
        ax.Id.b.z(iArr5, h6, bVar.a);
        ax.Id.b.z(h7, iArr6, bVar.b);
        ax.Id.b.z(h6, h7, bVar.c);
    }

    private static void z(boolean z, d dVar, d dVar2, d dVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h2 = ax.Id.b.h();
        int[] h3 = ax.Id.b.h();
        int[] h4 = ax.Id.b.h();
        int[] h5 = ax.Id.b.h();
        int[] h6 = ax.Id.b.h();
        int[] h7 = ax.Id.b.h();
        int[] h8 = ax.Id.b.h();
        int[] h9 = ax.Id.b.h();
        if (z) {
            iArr2 = h4;
            iArr = h5;
            iArr4 = h7;
            iArr3 = h8;
        } else {
            iArr = h4;
            iArr2 = h5;
            iArr3 = h7;
            iArr4 = h8;
        }
        ax.Id.b.c(dVar.b, dVar.a, h3, h2);
        ax.Id.b.c(dVar2.b, dVar2.a, iArr2, iArr);
        ax.Id.b.z(h2, h4, h2);
        ax.Id.b.z(h3, h5, h3);
        ax.Id.b.z(dVar.d, dVar2.d, h4);
        ax.Id.b.z(h4, g, h4);
        ax.Id.b.z(dVar.c, dVar2.c, h5);
        ax.Id.b.a(h5, h5, h5);
        ax.Id.b.c(h3, h2, h9, h6);
        ax.Id.b.c(h5, h4, iArr4, iArr3);
        ax.Id.b.d(iArr4);
        ax.Id.b.z(h6, h7, dVar3.a);
        ax.Id.b.z(h8, h9, dVar3.b);
        ax.Id.b.z(h7, h8, dVar3.c);
        ax.Id.b.z(h6, h9, dVar3.d);
    }
}
