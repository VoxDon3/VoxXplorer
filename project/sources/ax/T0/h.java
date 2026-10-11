package ax.T0;

import ax.P0.C0901j;
import ax.P0.C0912v;
import ax.P0.D;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.r7.AbstractC2991z;
import ax.t7.C3104a;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class h {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    public static final class d {
        public final AbstractC2991z<c> a;
        public final int[] b;

        public d(List<c> list, int[] iArr) {
            this.a = AbstractC2991z.u(list);
            this.b = iArr;
        }
    }

    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class f {
        public final AbstractC2991z<e> a;
        public final int[] b;

        public f(List<e> list, int[] iArr) {
            this.a = AbstractC2991z.u(list);
            this.b = iArr;
        }
    }

    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        public g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }
    }

    /* renamed from: ax.T0.h$h, reason: collision with other inner class name */
    public static final class C0193h {
        public final b a;
        public final int b;
        public final c c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final float l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;

        public C0193h(b bVar, int i, c cVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11, int i12, int i13) {
            this.a = bVar;
            this.b = i;
            this.c = cVar;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = i7;
            this.l = f;
            this.m = i10;
            this.n = i11;
            this.o = i12;
            this.p = i13;
            this.j = i8;
            this.k = i9;
        }
    }

    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static final class j {
        public final AbstractC2991z<i> a;
        public final int[] b;

        public j(List<i> list, int[] iArr) {
            this.a = AbstractC2991z.u(list);
            this.b = iArr;
        }
    }

    public static final class k {
        public final b a;
        public final AbstractC2991z<a> b;
        public final d c;
        public final f d;
        public final j e;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.a = bVar;
            this.b = list != null ? AbstractC2991z.u(list) : AbstractC2991z.z();
            this.c = dVar;
            this.d = fVar;
            this.e = jVar;
        }
    }

    public static final class l {
        public final int a;
        public final int b;
        public final boolean c;

        public l(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;

        public m(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = f;
            this.i = i8;
            this.j = i9;
            this.k = z;
            this.l = z2;
            this.m = i10;
            this.n = i11;
            this.o = i12;
            this.p = z3;
            this.q = i13;
            this.r = i14;
            this.s = i15;
            this.t = i16;
        }
    }

    public static l A(byte[] bArr, int i2, int i3) {
        return B(bArr, i2 + 1, i3);
    }

    public static l B(byte[] bArr, int i2, int i3) {
        ax.T0.j jVar = new ax.T0.j(bArr, i2, i3);
        int i4 = jVar.i();
        int i5 = jVar.i();
        jVar.l();
        return new l(i4, i5, jVar.e());
    }

    public static m C(byte[] bArr, int i2, int i3) {
        return D(bArr, i2 + 1, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.T0.h.m D(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T0.h.D(byte[], int, int):ax.T0.h$m");
    }

    private static void E(ax.T0.j jVar, int i2, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i3 = 1; i3 < i2; i3++) {
            boolean e2 = jVar.e();
            int i4 = 0;
            while (i4 < iArr[i3]) {
                if ((i4 <= 0 || !e2) ? i4 == 0 : jVar.e()) {
                    for (int i5 = 0; i5 < iArr2[i3]; i5++) {
                        if (zArr[i3][i5]) {
                            jVar.i();
                        }
                    }
                    jVar.i();
                    jVar.i();
                }
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void F(ax.T0.j r8, boolean r9, int r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L2e
            boolean r9 = r8.e()
            boolean r1 = r8.e()
            if (r9 != 0) goto L12
            if (r1 == 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L31
        L12:
            boolean r2 = r8.e()
            if (r2 == 0) goto L1d
            r3 = 19
            r8.m(r3)
        L1d:
            r3 = 8
            r8.m(r3)
            if (r2 == 0) goto L28
            r3 = 4
            r8.m(r3)
        L28:
            r3 = 15
            r8.m(r3)
            goto L31
        L2e:
            r9 = 0
            r1 = 0
            goto L10
        L31:
            r3 = 0
        L32:
            if (r3 > r10) goto L73
            boolean r4 = r8.e()
            if (r4 != 0) goto L3e
            boolean r4 = r8.e()
        L3e:
            if (r4 == 0) goto L45
            r8.i()
            r4 = 0
            goto L49
        L45:
            boolean r4 = r8.e()
        L49:
            if (r4 != 0) goto L50
            int r4 = r8.i()
            goto L51
        L50:
            r4 = 0
        L51:
            int r5 = r9 + r1
            r6 = 0
        L54:
            if (r6 >= r5) goto L70
            r7 = 0
        L57:
            if (r7 > r4) goto L6d
            r8.i()
            r8.i()
            if (r2 == 0) goto L67
            r8.i()
            r8.i()
        L67:
            r8.l()
            int r7 = r7 + 1
            goto L57
        L6d:
            int r6 = r6 + 1
            goto L54
        L70:
            int r3 = r3 + 1
            goto L32
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T0.h.F(ax.T0.j, boolean, int):void");
    }

    private static void G(ax.T0.j jVar) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (jVar.e()) {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        jVar.h();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        jVar.h();
                    }
                } else {
                    jVar.i();
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private static void H(ax.T0.j jVar) {
        int i2 = jVar.i();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 == 0 || !jVar.e()) {
                int i6 = jVar.i();
                int i7 = jVar.i();
                int[] iArr3 = new int[i6];
                int i8 = 0;
                while (i8 < i6) {
                    iArr3[i8] = (i8 > 0 ? iArr3[i8 - 1] : 0) - (jVar.i() + 1);
                    jVar.l();
                    i8++;
                }
                int[] iArr4 = new int[i7];
                int i9 = 0;
                while (i9 < i7) {
                    iArr4[i9] = (i9 > 0 ? iArr4[i9 - 1] : 0) + jVar.i() + 1;
                    jVar.l();
                    i9++;
                }
                i3 = i6;
                iArr = iArr3;
                i4 = i7;
                iArr2 = iArr4;
            } else {
                int i10 = i3 + i4;
                int i11 = (1 - ((jVar.e() ? 1 : 0) * 2)) * (jVar.i() + 1);
                int i12 = i10 + 1;
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 <= i10; i13++) {
                    if (jVar.e()) {
                        zArr[i13] = true;
                    } else {
                        zArr[i13] = jVar.e();
                    }
                }
                int[] iArr5 = new int[i12];
                int[] iArr6 = new int[i12];
                int i14 = 0;
                for (int i15 = i4 - 1; i15 >= 0; i15--) {
                    int i16 = iArr2[i15] + i11;
                    if (i16 < 0 && zArr[i3 + i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (i11 < 0 && zArr[i10]) {
                    iArr5[i14] = i11;
                    i14++;
                }
                for (int i17 = 0; i17 < i3; i17++) {
                    int i18 = iArr[i17] + i11;
                    if (i18 < 0 && zArr[i17]) {
                        iArr5[i14] = i18;
                        i14++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i14);
                int i19 = 0;
                for (int i20 = i3 - 1; i20 >= 0; i20--) {
                    int i21 = iArr[i20] + i11;
                    if (i21 > 0 && zArr[i20]) {
                        iArr6[i19] = i21;
                        i19++;
                    }
                }
                if (i11 > 0 && zArr[i10]) {
                    iArr6[i19] = i11;
                    i19++;
                }
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = iArr2[i22] + i11;
                    if (i23 > 0 && zArr[i3 + i22]) {
                        iArr6[i19] = i23;
                        i19++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i19);
                iArr = copyOf;
                i3 = i14;
                i4 = i19;
            }
        }
    }

    private static void I(ax.T0.j jVar) {
        int i2 = jVar.i() + 1;
        jVar.m(8);
        for (int i3 = 0; i3 < i2; i3++) {
            jVar.i();
            jVar.i();
            jVar.l();
        }
        jVar.m(20);
    }

    private static void J(ax.T0.j jVar, int i2) {
        int i3 = 8;
        int i4 = 8;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i3 != 0) {
                i3 = ((jVar.h() + i4) + 256) % 256;
            }
            if (i3 != 0) {
                i4 = i3;
            }
        }
    }

    private static void K(ax.T0.j jVar, int i2, boolean[][] zArr) {
        int i3 = jVar.i() + 2;
        if (jVar.e()) {
            jVar.m(i3);
        } else {
            for (int i4 = 1; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (zArr[i4][i5]) {
                        jVar.m(i3);
                    }
                }
            }
        }
        int i6 = jVar.i();
        for (int i7 = 1; i7 <= i6; i7++) {
            jVar.m(8);
        }
    }

    public static int L(byte[] bArr, int i2) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                try {
                    i4 = g(bArr, i4, i2);
                    if (i4 < i2) {
                        int[] iArr = d;
                        if (iArr.length <= i5) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i5] = i4;
                        i4 += 3;
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return i2 - ((i3 == 1 ? 2 : 1) * (i4 + i5));
    }

    private static int b(int i2, int i3, int i4, int i5) {
        int i6 = 2;
        if (i3 != 1 && i3 != 2) {
            i6 = 1;
        }
        return i2 - (i6 * (i4 + i5));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(ax.T0.j jVar) {
        jVar.m(4);
        int f2 = jVar.f(3);
        jVar.l();
        c q = q(jVar, true, f2, null);
        return C0976i.h(q.a, q.b, q.c, q.d, q.e, q.f);
    }

    public static int e(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        C0968a.g(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            c(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            c(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            c(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    c(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    private static AbstractC2991z<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        AbstractC2991z.a r = AbstractC2991z.r();
        int i2 = 0;
        while (i2 < bArr.length) {
            int e2 = e(bArr, i2, bArr.length, zArr);
            if (e2 != bArr.length) {
                r.a(Integer.valueOf(e2));
            }
            i2 = e2 + 3;
        }
        return r.k();
    }

    private static int g(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String h(List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                AbstractC2991z<Integer> f2 = f(bArr);
                for (int i3 = 0; i3 < f2.size(); i3++) {
                    if (f2.get(i3).intValue() + 3 < length) {
                        ax.T0.j jVar = new ax.T0.j(bArr, f2.get(i3).intValue() + 3, length);
                        b p = p(jVar);
                        if (p.a == 33 && p.b == 0) {
                            return d(jVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static boolean k(byte[] bArr, int i2, int i3, C0912v c0912v) {
        if (Objects.equals(c0912v.o, "video/avc")) {
            return l(bArr[i2]);
        }
        if (Objects.equals(c0912v.o, "video/hevc")) {
            return m(bArr, i2, i3, c0912v);
        }
        return true;
    }

    public static boolean l(byte b2) {
        if (((b2 & 96) >> 5) != 0) {
            return true;
        }
        int i2 = b2 & 31;
        return (i2 == 1 || i2 == 9 || i2 == 14) ? false : true;
    }

    private static boolean m(byte[] bArr, int i2, int i3, C0912v c0912v) {
        b p = p(new ax.T0.j(bArr, i2, i3 + i2));
        int i4 = p.a;
        if (i4 == 35) {
            return false;
        }
        return (i4 <= 14 && i4 % 2 == 0 && p.c == c0912v.F - 1) ? false : true;
    }

    public static boolean n(C0912v c0912v, byte b2) {
        return ((Objects.equals(c0912v.o, "video/avc") || D.b(c0912v.k, "video/avc")) && (b2 & 31) == 6) || ((Objects.equals(c0912v.o, "video/hevc") || D.b(c0912v.k, "video/hevc")) && ((b2 & 126) >> 1) == 39);
    }

    public static int o(C0912v c0912v) {
        if (Objects.equals(c0912v.o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c0912v.o, "video/hevc") || D.b(c0912v.k, "video/hevc")) ? 2 : 0;
    }

    private static b p(ax.T0.j jVar) {
        jVar.l();
        return new b(jVar.f(6), jVar.f(6), jVar.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.T0.h.c q(ax.T0.j r19, boolean r20, int r21, ax.T0.h.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r0.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = 0
            r11 = 0
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = 0
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L57:
            int r18 = r0.f(r6)
            r2 = 0
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.m(r2)
            if (r1 <= 0) goto L7c
            int r6 = r6 - r1
            int r6 = r6 * 2
            r0.m(r6)
        L7c:
            ax.T0.h$c r12 = new ax.T0.h$c
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T0.h.q(ax.T0.j, boolean, int, ax.T0.h$c):ax.T0.h$c");
    }

    private static e r(ax.T0.j jVar) {
        int i2;
        int i3;
        int i4;
        int f2 = jVar.f(16);
        int f3 = jVar.f(16);
        if (jVar.e()) {
            int f4 = jVar.f(2);
            if (f4 == 3) {
                jVar.l();
            }
            int f5 = jVar.f(4);
            i4 = jVar.f(4);
            i3 = f5;
            i2 = f4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (jVar.e()) {
            int i5 = jVar.i();
            int i6 = jVar.i();
            int i7 = jVar.i();
            int i8 = jVar.i();
            f2 = b(f2, i2, i5, i6);
            f3 = a(f3, i2, i7, i8);
        }
        return new e(i2, i3, i4, f2, f3);
    }

    private static f s(ax.T0.j jVar, int i2) {
        int i3 = jVar.i();
        int i4 = i3 + 1;
        AbstractC2991z.a s = AbstractC2991z.s(i4);
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i4; i5++) {
            s.a(r(jVar));
        }
        int i6 = 1;
        if (i4 <= 1 || !jVar.e()) {
            while (i6 < i2) {
                iArr[i6] = Math.min(i6, i3);
                i6++;
            }
        } else {
            int d2 = C3104a.d(i4, RoundingMode.CEILING);
            while (i6 < i2) {
                iArr[i6] = jVar.f(d2);
                i6++;
            }
        }
        return new f(s.k(), iArr);
    }

    public static g t(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        int i5 = i3 - 1;
        while (true) {
            b2 = bArr[i5];
            if (b2 != 0 || i5 <= i4) {
                break;
            }
            i5--;
        }
        if (b2 != 0 && i5 > i4) {
            ax.T0.j jVar = new ax.T0.j(bArr, i4, i5 + 1);
            while (jVar.c(16)) {
                int f2 = jVar.f(8);
                int i6 = 0;
                while (f2 == 255) {
                    i6 += 255;
                    f2 = jVar.f(8);
                }
                int i7 = i6 + f2;
                int f3 = jVar.f(8);
                int i8 = 0;
                while (f3 == 255) {
                    i8 += 255;
                    f3 = jVar.f(8);
                }
                int i9 = i8 + f3;
                if (i9 == 0 || !jVar.c(i9)) {
                    break;
                }
                if (i7 == 176) {
                    int i10 = jVar.i();
                    boolean e2 = jVar.e();
                    int i11 = e2 ? jVar.i() : 0;
                    int i12 = jVar.i();
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = -1;
                    int i16 = -1;
                    int i17 = -1;
                    int i18 = -1;
                    for (int i19 = 0; i19 <= i12; i19++) {
                        i13 = jVar.i();
                        i14 = jVar.i();
                        i15 = jVar.f(6);
                        if (i15 == 63) {
                            return null;
                        }
                        i16 = jVar.f(i15 == 0 ? Math.max(0, i10 - 30) : Math.max(0, (i15 + i10) - 31));
                        if (e2) {
                            int f4 = jVar.f(6);
                            if (f4 == 63) {
                                return null;
                            }
                            i17 = f4;
                            i18 = jVar.f(f4 == 0 ? Math.max(0, i11 - 30) : Math.max(0, (f4 + i11) - 31));
                        }
                        if (jVar.e()) {
                            jVar.m(10);
                        }
                    }
                    return new g(i10, i11, i12 + 1, i13, i14, i15, i16, i17, i18);
                }
                jVar.m(i9 * 8);
            }
        }
        return null;
    }

    public static C0193h u(byte[] bArr, int i2, int i3, k kVar) {
        return v(bArr, i2 + 2, i3, p(new ax.T0.j(bArr, i2, i3)), kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.T0.h.C0193h v(byte[] r20, int r21, int r22, ax.T0.h.b r23, ax.T0.h.k r24) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T0.h.v(byte[], int, int, ax.T0.h$b, ax.T0.h$k):ax.T0.h$h");
    }

    private static i w(ax.T0.j jVar) {
        jVar.m(3);
        int i2 = jVar.e() ? 1 : 2;
        int k2 = C0901j.k(jVar.f(8));
        int l2 = C0901j.l(jVar.f(8));
        jVar.m(8);
        return new i(k2, i2, l2);
    }

    private static j x(ax.T0.j jVar, int i2, int i3, int[] iArr) {
        if (!jVar.e() ? jVar.e() : true) {
            jVar.l();
        }
        boolean e2 = jVar.e();
        boolean e3 = jVar.e();
        if (e2 || e3) {
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < iArr[i4]; i5++) {
                    boolean e4 = e2 ? jVar.e() : false;
                    boolean e5 = e3 ? jVar.e() : false;
                    if (e4) {
                        jVar.m(32);
                    }
                    if (e5) {
                        jVar.m(18);
                    }
                }
            }
        }
        boolean e6 = jVar.e();
        int f2 = e6 ? jVar.f(4) + 1 : i2;
        AbstractC2991z.a s = AbstractC2991z.s(f2);
        int[] iArr2 = new int[i2];
        for (int i6 = 0; i6 < f2; i6++) {
            s.a(w(jVar));
        }
        if (e6 && f2 > 1) {
            for (int i7 = 0; i7 < i2; i7++) {
                iArr2[i7] = jVar.f(4);
            }
        }
        return new j(s.k(), iArr2);
    }

    public static k y(byte[] bArr, int i2, int i3) {
        ax.T0.j jVar = new ax.T0.j(bArr, i2, i3);
        return z(jVar, p(jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k z(ax.T0.j jVar, b bVar) {
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        j jVar2;
        int i4;
        int i5;
        int[] iArr3;
        AbstractC2991z abstractC2991z;
        int i6;
        boolean[][] zArr;
        int[] iArr4;
        int i7;
        int i8;
        jVar.m(4);
        boolean e2 = jVar.e();
        boolean e3 = jVar.e();
        int f2 = jVar.f(6);
        int i9 = f2 + 1;
        int f3 = jVar.f(3);
        jVar.m(17);
        c q = q(jVar, true, f3, null);
        boolean z = false;
        for (int i10 = jVar.e() ? 0 : f3; i10 <= f3; i10++) {
            jVar.i();
            jVar.i();
            jVar.i();
        }
        int f4 = jVar.f(6);
        int i11 = jVar.i() + 1;
        d dVar = new d(AbstractC2991z.A(q), new int[1]);
        boolean z2 = i9 >= 2 && i11 >= 2;
        boolean z3 = e2 && e3;
        int i12 = f4 + 1;
        boolean z4 = i12 >= i9;
        if (!z2 || !z3 || !z4) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, i11, i12);
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i13 = 1; i13 < i11; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 <= f4; i15++) {
                if (jVar.e()) {
                    iArr5[i13][i14] = i15;
                    iArr7[i13] = i15;
                    i14++;
                }
                iArr6[i13] = i14;
            }
        }
        if (jVar.e()) {
            jVar.m(64);
            if (jVar.e()) {
                jVar.i();
            }
            int i16 = jVar.i();
            int i17 = 0;
            while (i17 < i16) {
                jVar.i();
                if (i17 == 0 || jVar.e()) {
                    z = true;
                }
                F(jVar, z, f3);
                i17++;
                z = false;
            }
        }
        if (!jVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        jVar.b();
        c q2 = q(jVar, false, f3, q);
        boolean e4 = jVar.e();
        boolean[] zArr2 = new boolean[16];
        int i18 = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            boolean e5 = jVar.e();
            zArr2[i19] = e5;
            if (e5) {
                i18++;
            }
        }
        if (i18 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr8 = new int[i18];
        for (int i20 = 0; i20 < i18 - (e4 ? 1 : 0); i20++) {
            iArr8[i20] = jVar.f(3);
        }
        int[] iArr9 = new int[i18 + 1];
        if (e4) {
            int i21 = 1;
            while (i21 < i18) {
                int[] iArr10 = iArr9;
                for (int i22 = 0; i22 < i21; i22++) {
                    iArr10[i21] = iArr10[i21] + iArr8[i22] + 1;
                }
                i21++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i18] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i9, i18);
        int[] iArr12 = new int[i9];
        iArr12[0] = 0;
        boolean e6 = jVar.e();
        int i23 = 1;
        while (i23 < i9) {
            if (e6) {
                i8 = i23;
                iArr12[i8] = jVar.f(6);
            } else {
                i8 = i23;
                iArr12[i8] = i8;
            }
            if (e4) {
                for (int i24 = 0; i24 < i18; i24++) {
                    iArr11[i8][i24] = (iArr12[i8] & ((1 << iArr[r33]) - 1)) >> iArr[i24];
                }
            } else {
                int i25 = 0;
                while (i25 < i18) {
                    int i26 = i25;
                    iArr11[i8][i26] = jVar.f(iArr8[i25] + 1);
                    i25 = i26 + 1;
                }
            }
            i23 = i8 + 1;
        }
        int[] iArr13 = new int[i12];
        int i27 = 1;
        int i28 = 0;
        while (i28 < i9) {
            iArr13[iArr12[i28]] = -1;
            int[] iArr14 = iArr13;
            int i29 = 0;
            for (int i30 = 0; i30 < 16; i30++) {
                if (zArr2[i30]) {
                    if (i30 == 1) {
                        iArr14[iArr12[i28]] = iArr11[i28][i29];
                    }
                    i29++;
                }
            }
            if (i28 > 0) {
                int i31 = 0;
                while (true) {
                    if (i31 >= i28) {
                        i27++;
                        break;
                    }
                    int i32 = i31;
                    if (iArr14[iArr12[i28]] == iArr14[iArr12[i31]]) {
                        break;
                    }
                    i31 = i32 + 1;
                }
            }
            i28++;
            iArr13 = iArr14;
        }
        int[] iArr15 = iArr13;
        int f5 = jVar.f(4);
        if (i27 < 2 || f5 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr16 = new int[i27];
        for (int i33 = 0; i33 < i27; i33++) {
            iArr16[i33] = jVar.f(f5);
        }
        int[] iArr17 = new int[i12];
        int i34 = 0;
        while (i34 < i9) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i34], f4)] = i34;
            i34++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        AbstractC2991z.a r = AbstractC2991z.r();
        int i35 = 0;
        while (i35 <= f4) {
            int i36 = i27;
            int[] iArr20 = iArr7;
            int min = Math.min(iArr15[i35], i36 - 1);
            r.a(new a(iArr19[i35], min >= 0 ? iArr16[min] : -1));
            i35++;
            i27 = i36;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        AbstractC2991z k2 = r.k();
        if (((a) k2.get(0)).b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i37 = 1;
        while (true) {
            if (i37 > f4) {
                i2 = -1;
                i3 = -1;
                break;
            }
            i2 = -1;
            if (((a) k2.get(i37)).b != -1) {
                i3 = i37;
                break;
            }
            i37++;
        }
        if (i3 == i2) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i9, i9);
        int i38 = 1;
        while (i38 < i9) {
            boolean[][] zArr5 = zArr4;
            for (int i39 = 0; i39 < i38; i39++) {
                boolean[] zArr6 = zArr3[i38];
                boolean[] zArr7 = zArr5[i38];
                boolean e7 = jVar.e();
                zArr7[i39] = e7;
                zArr6[i39] = e7;
            }
            i38++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i40 = 1; i40 < i9; i40++) {
            int i41 = 0;
            while (i41 < f2) {
                int[] iArr22 = iArr12;
                int i42 = 0;
                while (true) {
                    if (i42 < i40) {
                        boolean[] zArr9 = zArr8[i40];
                        if (zArr9[i42] && zArr8[i42][i41]) {
                            zArr9[i41] = true;
                            break;
                        }
                        i42++;
                    }
                }
                i41++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i12];
        for (int i43 = 0; i43 < i9; i43++) {
            int i44 = 0;
            for (int i45 = 0; i45 < i43; i45++) {
                i44 += zArr3[i43][i45] ? 1 : 0;
            }
            iArr24[iArr23[i43]] = i44;
        }
        int i46 = 0;
        for (int i47 = 0; i47 < i9; i47++) {
            if (iArr24[iArr23[i47]] == 0) {
                i46++;
            }
        }
        if (i46 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr25 = new int[i9];
        int[] iArr26 = new int[i11];
        if (jVar.e()) {
            iArr2 = iArr24;
            int i48 = 0;
            while (i48 < i9) {
                int i49 = i48;
                iArr25[i49] = jVar.f(3);
                i48 = i49 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i9, f3);
        }
        int i50 = 0;
        while (i50 < i11) {
            int i51 = i50;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int i52 = 0;
            for (int i53 = 0; i53 < iArr6[i51]; i53++) {
                i52 = Math.max(i52, iArr27[((a) k2.get(iArr5[i51][i53])).a]);
            }
            iArr26[i51] = i52 + 1;
            i50 = i51 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (jVar.e()) {
            int i54 = 0;
            while (i54 < f2) {
                int i55 = i54 + 1;
                int i56 = i55;
                while (i56 < i9) {
                    if (zArr11[i56][i54]) {
                        i7 = i54;
                        jVar.m(3);
                    } else {
                        i7 = i54;
                    }
                    i56++;
                    i54 = i7;
                }
                i54 = i55;
            }
        }
        jVar.l();
        int i57 = jVar.i() + 1;
        AbstractC2991z.a r2 = AbstractC2991z.r();
        r2.a(q);
        if (i57 > 1) {
            r2.a(q2);
            for (int i58 = 2; i58 < i57; i58++) {
                q2 = q(jVar, jVar.e(), f3, q2);
                r2.a(q2);
            }
        }
        AbstractC2991z k3 = r2.k();
        int i59 = jVar.i() + i11;
        if (i59 > i11) {
            return new k(bVar, null, dVar, null, null);
        }
        int f6 = jVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i59, i12);
        int[] iArr28 = new int[i59];
        int i60 = 0;
        int[] iArr29 = new int[i59];
        int i61 = 0;
        while (i61 < i11) {
            iArr28[i61] = i60;
            iArr29[i61] = iArr21[i61];
            if (f6 == 0) {
                i6 = i61;
                zArr = zArr12;
                abstractC2991z = k3;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i6], 0, iArr6[i6], true);
                iArr4[i6] = iArr6[i6];
            } else {
                abstractC2991z = k3;
                i6 = i61;
                zArr = zArr12;
                iArr4 = iArr28;
                if (f6 == 1) {
                    int i62 = iArr21[i6];
                    for (int i63 = 0; i63 < iArr6[i6]; i63++) {
                        zArr[i6][i63] = iArr5[i6][i63] == i62;
                    }
                    iArr4[i6] = 1;
                } else {
                    i60 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i61 = i6 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    k3 = abstractC2991z;
                }
            }
            i60 = 0;
            i61 = i6 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            k3 = abstractC2991z;
        }
        AbstractC2991z abstractC2991z2 = k3;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i12];
        int i64 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i12;
        iArr32[i60] = i59;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i65 = 1;
        int i66 = 0;
        while (i65 < i59) {
            if (f6 == i64) {
                for (int i67 = 0; i67 < iArr6[i65]; i67++) {
                    zArr13[i65][i67] = jVar.e();
                    int i68 = iArr30[i65];
                    boolean z5 = zArr13[i65][i67];
                    iArr30[i65] = i68 + (z5 ? 1 : 0);
                    if (z5) {
                        iArr29[i65] = iArr5[i65][i67];
                    }
                }
            }
            if (i66 == 0 && iArr5[i65][0] == 0 && zArr13[i65][0]) {
                for (int i69 = 1; i69 < iArr6[i65]; i69++) {
                    if (iArr5[i65][i69] == i3 && zArr13[i65][i3]) {
                        i66 = i65;
                    }
                }
            }
            int i70 = 0;
            while (i70 < iArr6[i65]) {
                if (i57 > 1) {
                    zArr14[i65][i70] = zArr13[i65][i70];
                    i5 = i3;
                    iArr3 = iArr31;
                    i4 = i57;
                    int d2 = C3104a.d(i57, RoundingMode.CEILING);
                    if (!zArr14[i65][i70]) {
                        int i71 = ((a) k2.get(iArr5[i65][i70])).a;
                        int i72 = 0;
                        while (true) {
                            if (i72 >= i70) {
                                break;
                            }
                            int i73 = i71;
                            if (zArr8[i73][((a) k2.get(iArr5[i65][i72])).a]) {
                                zArr14[i65][i70] = true;
                                break;
                            }
                            i72++;
                            i71 = i73;
                        }
                    }
                    if (zArr14[i65][i70]) {
                        if (i66 <= 0 || i65 != i66) {
                            jVar.m(d2);
                        } else {
                            iArr3[i70] = jVar.f(d2);
                        }
                    }
                } else {
                    i4 = i57;
                    i5 = i3;
                    iArr3 = iArr31;
                }
                i70++;
                i3 = i5;
                iArr31 = iArr3;
                i57 = i4;
            }
            int i74 = i57;
            int i75 = i3;
            int[] iArr33 = iArr31;
            if (iArr30[i65] == 1 && iArr2[iArr29[i65]] > 0) {
                jVar.l();
            }
            i65++;
            i3 = i75;
            iArr31 = iArr33;
            i57 = i74;
            i64 = 2;
        }
        int[] iArr34 = iArr31;
        if (i66 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        f s = s(jVar, i9);
        jVar.m(2);
        for (int i76 = 1; i76 < i9; i76++) {
            if (iArr2[iArr23[i76]] == 0) {
                jVar.l();
            }
        }
        E(jVar, i59, iArr26, iArr6, zArr14);
        K(jVar, i9, zArr11);
        if (jVar.e()) {
            jVar.b();
            jVar2 = x(jVar, i9, i11, iArr26);
        } else {
            jVar2 = null;
        }
        return new k(bVar, k2, new d(abstractC2991z2, iArr34), s, jVar2);
    }
}
