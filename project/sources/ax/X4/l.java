package ax.X4;

import java.math.BigInteger;

/* loaded from: classes.dex */
class l {
    public static final double a = Math.cos(0.7853981633974483d);
    public static final double b = Math.sin(0.7853981633974483d);
    private static volatile a[] c = new a[20];
    private static volatile a[] d = new a[20];

    static final class b {
        double a;
        double b;

        b() {
        }

        void a(a aVar, int i) {
            this.a += aVar.s(i);
            this.b += aVar.h(i);
        }

        void b(b bVar) {
            this.a += bVar.a;
            this.b += bVar.b;
        }

        void c(b bVar, b bVar2) {
            bVar2.a = this.a + bVar.a;
            bVar2.b = this.b + bVar.b;
        }

        void d(a aVar, int i) {
            this.a -= aVar.h(i);
            this.b += aVar.s(i);
        }

        void e(b bVar) {
            this.a -= bVar.b;
            this.b += bVar.a;
        }

        void f(b bVar, b bVar2) {
            bVar2.a = this.a - bVar.b;
            bVar2.b = this.b + bVar.a;
        }

        void g(a aVar, int i) {
            aVar.t(i, this.a);
            aVar.i(i, this.b);
        }

        void h(b bVar) {
            double d = this.a;
            this.a = i.a(d, bVar.a, (-this.b) * bVar.b);
            this.b = i.a(d, bVar.b, this.b * bVar.a);
        }

        void i(b bVar) {
            double d = this.a;
            this.a = i.a(d, bVar.a, this.b * bVar.b);
            this.b = i.a(-d, bVar.b, this.b * bVar.a);
        }

        void j(a aVar, int i) {
            this.a = aVar.s(i);
            this.b = aVar.h(i);
        }

        void k(b bVar) {
            double d = this.a;
            double d2 = this.b;
            bVar.a = i.a(d, d, (-d2) * d2);
            bVar.b = this.a * 2.0d * this.b;
        }

        void l(a aVar, int i) {
            this.a -= aVar.s(i);
            this.b -= aVar.h(i);
        }

        void m(b bVar) {
            this.a -= bVar.a;
            this.b -= bVar.b;
        }

        void n(b bVar, a aVar, int i) {
            aVar.t(i, this.a - bVar.a);
            aVar.i(i, this.b - bVar.b);
        }

        void o(b bVar, b bVar2) {
            bVar2.a = this.a - bVar.a;
            bVar2.b = this.b - bVar.b;
        }

        void p(a aVar, int i) {
            this.a += aVar.h(i);
            this.b -= aVar.s(i);
        }

        void q(b bVar) {
            this.a += bVar.b;
            this.b -= bVar.a;
        }

        void r(b bVar, b bVar2) {
            bVar2.a = this.a + bVar.b;
            bVar2.b = this.b - bVar.a;
        }
    }

    static int a(int i) {
        if (i <= 9728) {
            return 19;
        }
        if (i <= 18432) {
            return 18;
        }
        if (i <= 69632) {
            return 17;
        }
        if (i <= 262144) {
            return 16;
        }
        if (i <= 983040) {
            return 15;
        }
        if (i <= 3670016) {
            return 14;
        }
        if (i <= 13631488) {
            return 13;
        }
        if (i <= 25165824) {
            return 12;
        }
        if (i <= 92274688) {
            return 11;
        }
        if (i <= 335544320) {
            return 10;
        }
        return i <= 1207959552 ? 9 : 8;
    }

    private static a b(int i) {
        if (i == 1) {
            a aVar = new a(1);
            aVar.t(0, 1.0d);
            aVar.i(0, 0.0d);
            return aVar;
        }
        a aVar2 = new a(i);
        aVar2.v(0, 1.0d, 0.0d);
        int i2 = i / 2;
        aVar2.v(i2, a, b);
        double d2 = 1.5707963267948966d / i;
        int i3 = 1;
        while (i3 < i2) {
            double d3 = i3 * d2;
            double cos = Math.cos(d3);
            double sin = Math.sin(d3);
            aVar2.v(i3, cos, sin);
            int i4 = i3;
            aVar2.v(i - i4, sin, cos);
            i3 = i4 + 1;
        }
        return aVar2;
    }

    private static void c(a aVar, a[] aVarArr) {
        int i = aVar.b;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        b bVar5 = new b();
        b bVar6 = new b();
        while (numberOfLeadingZeros >= 2) {
            a aVar2 = aVarArr[numberOfLeadingZeros - 2];
            int i2 = 1 << numberOfLeadingZeros;
            for (int i3 = 0; i3 < i; i3 += i2) {
                int i4 = 0;
                while (true) {
                    int i5 = i2 / 4;
                    if (i4 < i5) {
                        bVar5.j(aVar2, i4);
                        bVar5.k(bVar6);
                        int i6 = i3 + i4;
                        int i7 = i5 + i6;
                        int i8 = i6 + (i2 / 2);
                        int i9 = numberOfLeadingZeros;
                        int i10 = i6 + ((i2 * 3) / 4);
                        aVar.c(i6, aVar, i7, bVar);
                        bVar.a(aVar, i8);
                        bVar.a(aVar, i10);
                        aVar.y(i6, aVar, i7, bVar2);
                        bVar2.l(aVar, i8);
                        bVar2.d(aVar, i10);
                        bVar2.i(bVar5);
                        aVar.x(i6, aVar, i7, bVar3);
                        bVar3.a(aVar, i8);
                        bVar3.l(aVar, i10);
                        bVar3.i(bVar6);
                        aVar.d(i6, aVar, i7, bVar4);
                        bVar4.l(aVar, i8);
                        bVar4.p(aVar, i10);
                        bVar4.h(bVar5);
                        bVar.g(aVar, i6);
                        bVar2.g(aVar, i7);
                        bVar3.g(aVar, i8);
                        bVar4.g(aVar, i10);
                        i4++;
                        numberOfLeadingZeros = i9;
                    }
                }
            }
            numberOfLeadingZeros -= 2;
        }
        if (numberOfLeadingZeros > 0) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                aVar.g(i11, bVar);
                int i12 = i11 + 1;
                aVar.g(i12, bVar2);
                aVar.b(i11, bVar2);
                bVar.n(bVar2, aVar, i12);
            }
        }
    }

    private static void d(a aVar, a aVar2, a aVar3, int i, double d2) {
        double sqrt = i * (-0.5d) * Math.sqrt(3.0d);
        for (int i2 = 0; i2 < aVar.b; i2++) {
            double s = aVar.s(i2) + aVar2.s(i2) + aVar3.s(i2);
            double h = aVar.h(i2) + aVar2.h(i2) + aVar3.h(i2);
            double h2 = (aVar3.h(i2) - aVar2.h(i2)) * sqrt;
            double s2 = (aVar2.s(i2) - aVar3.s(i2)) * sqrt;
            double s3 = (aVar2.s(i2) + aVar3.s(i2)) * 0.5d;
            double h3 = (aVar2.h(i2) + aVar3.h(i2)) * 0.5d;
            double s4 = (aVar.s(i2) - s3) + h2;
            double h4 = (aVar.h(i2) + s2) - h3;
            double s5 = (aVar.s(i2) - s3) - h2;
            double h5 = (aVar.h(i2) - s2) - h3;
            aVar.t(i2, s * d2);
            aVar.i(i2, h * d2);
            aVar2.t(i2, s4 * d2);
            aVar2.i(i2, h4 * d2);
            aVar3.t(i2, s5 * d2);
            aVar3.i(i2, h5 * d2);
        }
    }

    private static void e(a aVar, a[] aVarArr, a aVar2) {
        int i = aVar.b / 3;
        a aVar3 = new a(aVar, 0, i);
        int i2 = i * 2;
        a aVar4 = new a(aVar, i, i2);
        a aVar5 = new a(aVar, i2, aVar.b);
        d(aVar3, aVar4, aVar5, 1, 1.0d);
        b bVar = new b();
        for (int i3 = 0; i3 < aVar.b / 4; i3++) {
            bVar.j(aVar2, i3);
            aVar4.m(i3, bVar);
            aVar5.m(i3, bVar);
            aVar5.m(i3, bVar);
        }
        for (int i4 = aVar.b / 4; i4 < i; i4++) {
            bVar.j(aVar2, i4 - (aVar.b / 4));
            aVar4.o(i4, bVar);
            aVar5.o(i4, bVar);
            aVar5.o(i4, bVar);
        }
        c(aVar3, aVarArr);
        c(aVar4, aVarArr);
        c(aVar5, aVarArr);
    }

    static BigInteger f(a aVar, int i, int i2) {
        int i3 = i2;
        long j = i3;
        int min = (int) Math.min(aVar.b, (2147483648L / j) + 1);
        int i4 = (int) ((((min * j) + 31) * 8) / 32);
        byte[] bArr = new byte[i4];
        int i5 = 1;
        int i6 = (1 << i3) - 1;
        int i7 = 32 - i3;
        int i8 = (i4 * 8) - i3;
        int i9 = 0;
        int i10 = i4 - 4;
        int min2 = Math.min(Math.max(0, i8 >> 3), i10);
        long j2 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= i5) {
            int i13 = 0;
            while (i13 < min) {
                long round = Math.round(aVar.r(i13, i11)) + j2;
                long j3 = round >> i3;
                int min3 = Math.min(Math.max(i9, i8 >> 3), i10);
                i12 = (int) (((round & i6) << ((i7 - i8) + (min3 << 3))) | (i12 >>> ((min2 - min3) << 3)));
                i.n(bArr, min3, i12);
                i8 -= i2;
                i13++;
                i3 = i2;
                min2 = min3;
                j2 = j3;
                i10 = i10;
                i9 = 0;
            }
            i11++;
            i3 = i2;
            i5 = 1;
            i9 = 0;
        }
        return new BigInteger(i, bArr);
    }

    private static a[] g(int i) {
        a[] aVarArr = new a[i + 1];
        while (i >= 0) {
            if (i < 20) {
                if (c[i] == null) {
                    c[i] = b(1 << i);
                }
                aVarArr[i] = c[i];
            } else {
                aVarArr[i] = b(1 << i);
            }
            i -= 2;
        }
        return aVarArr;
    }

    private static a h(int i) {
        if (i >= 20) {
            return b(3 << i);
        }
        if (d[i] == null) {
            d[i] = b(3 << i);
        }
        return d[i];
    }

    private static void i(a aVar, a[] aVarArr) {
        int i;
        int i2;
        int i3 = aVar.b;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i3);
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        b bVar5 = new b();
        b bVar6 = new b();
        b bVar7 = new b();
        b bVar8 = new b();
        int i4 = 1;
        if (numberOfLeadingZeros % 2 != 0) {
            for (int i5 = 0; i5 < i3; i5 += 2) {
                int i6 = i5 + 1;
                aVar.g(i6, bVar3);
                aVar.g(i5, bVar);
                aVar.b(i5, bVar3);
                bVar.n(bVar3, aVar, i6);
            }
            i = 2;
        } else {
            i = 1;
        }
        b bVar9 = new b();
        b bVar10 = new b();
        while (i <= numberOfLeadingZeros) {
            a aVar2 = aVarArr[i - 1];
            int i7 = i4 << (i + 1);
            int i8 = 0;
            while (i8 < i3) {
                int i9 = i;
                int i10 = 0;
                while (true) {
                    i2 = i8;
                    int i11 = i7 / 4;
                    if (i10 < i11) {
                        bVar9.j(aVar2, i10);
                        bVar9.k(bVar10);
                        int i12 = i10;
                        int i13 = i2 + i12;
                        int i14 = i11 + i13;
                        a aVar3 = aVar2;
                        int i15 = i13 + (i7 / 2);
                        int i16 = numberOfLeadingZeros;
                        int i17 = i13 + ((i7 * 3) / 4);
                        aVar.g(i13, bVar);
                        aVar.p(i14, bVar9, bVar2);
                        aVar.p(i15, bVar10, bVar3);
                        aVar.n(i17, bVar9, bVar4);
                        bVar.c(bVar2, bVar5);
                        bVar5.b(bVar3);
                        bVar5.b(bVar4);
                        bVar.f(bVar2, bVar6);
                        bVar6.m(bVar3);
                        bVar6.q(bVar4);
                        bVar.o(bVar2, bVar7);
                        bVar7.b(bVar3);
                        bVar7.m(bVar4);
                        bVar.r(bVar2, bVar8);
                        bVar8.m(bVar3);
                        bVar8.e(bVar4);
                        bVar5.g(aVar, i13);
                        bVar6.g(aVar, i14);
                        bVar7.g(aVar, i15);
                        bVar8.g(aVar, i17);
                        i10 = i12 + 1;
                        i8 = i2;
                        aVar2 = aVar3;
                        numberOfLeadingZeros = i16;
                    }
                }
                i8 = i2 + i7;
                i = i9;
            }
            i += 2;
            i4 = 1;
        }
        int i18 = numberOfLeadingZeros;
        for (int i19 = 0; i19 < i3; i19++) {
            aVar.z(i19, -i18);
        }
    }

    private static void j(a aVar, a[] aVarArr, a aVar2) {
        int i = aVar.b / 3;
        a aVar3 = new a(aVar, 0, i);
        int i2 = i * 2;
        a aVar4 = new a(aVar, i, i2);
        a aVar5 = new a(aVar, i2, aVar.b);
        i(aVar3, aVarArr);
        i(aVar4, aVarArr);
        i(aVar5, aVarArr);
        b bVar = new b();
        for (int i3 = 0; i3 < aVar.b / 4; i3++) {
            bVar.j(aVar2, i3);
            aVar4.k(i3, bVar);
            aVar5.k(i3, bVar);
            aVar5.k(i3, bVar);
        }
        for (int i4 = aVar.b / 4; i4 < i; i4++) {
            bVar.j(aVar2, i4 - (aVar.b / 4));
            aVar4.l(i4, bVar);
            aVar5.l(i4, bVar);
            aVar5.l(i4, bVar);
        }
        d(aVar3, aVar4, aVar5, -1, 0.3333333333333333d);
    }

    static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            return m(bigInteger2);
        }
        int bitLength = bigInteger.bitLength();
        int bitLength2 = bigInteger2.bitLength();
        if (bitLength + bitLength2 <= 2147483648L) {
            return (bitLength <= 1920 || bitLength2 <= 1920 || (bitLength <= 33220 && bitLength2 <= 33220)) ? bigInteger.multiply(bigInteger2) : l(bigInteger, bigInteger2);
        }
        throw new ArithmeticException("BigInteger would overflow supported range");
    }

    static BigInteger l(BigInteger bigInteger, BigInteger bigInteger2) {
        int signum = bigInteger.signum() * bigInteger2.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray2 = bigInteger2.toByteArray();
        int max = Math.max(byteArray.length, byteArray2.length) * 8;
        int a2 = a(max);
        int i = ((max + a2) - 1) / a2;
        int i2 = i + 1;
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = 1 << i3;
        int i5 = (i4 * 3) / 4;
        if (i2 >= i5 || i3 <= 3) {
            a[] g = g(i3);
            a o = o(byteArray, i4, a2);
            o.f(g[i3]);
            c(o, g);
            a o2 = o(byteArray2, i4, a2);
            o2.f(g[i3]);
            c(o2, g);
            o.q(o2);
            i(o, g);
            o.e(g[i3]);
            return f(o, signum, a2);
        }
        int i6 = 30 - numberOfLeadingZeros;
        a[] g2 = g(i6);
        a h = h(i6);
        a h2 = h(28 - numberOfLeadingZeros);
        a o3 = o(byteArray, i5, a2);
        o3.f(h);
        e(o3, g2, h2);
        a o4 = o(byteArray2, i5, a2);
        o4.f(h);
        e(o4, g2, h2);
        o3.q(o4);
        j(o3, g2, h2);
        o3.e(h);
        return f(o3, signum, a2);
    }

    static BigInteger m(BigInteger bigInteger) {
        return bigInteger.signum() == 0 ? BigInteger.ZERO : bigInteger.bitLength() < 33220 ? bigInteger.multiply(bigInteger) : n(bigInteger);
    }

    static BigInteger n(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length * 8;
        int a2 = a(length);
        int i = ((length + a2) - 1) / a2;
        int i2 = i + 1;
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = 1 << i3;
        int i5 = (i4 * 3) / 4;
        if (i2 >= i5) {
            a o = o(byteArray, i4, a2);
            a[] g = g(i3);
            o.f(g[i3]);
            c(o, g);
            o.w();
            i(o, g);
            o.e(g[i3]);
            return f(o, 1, a2);
        }
        a o2 = o(byteArray, i5, a2);
        int i6 = 30 - numberOfLeadingZeros;
        a[] g2 = g(i6);
        a h = h(i6);
        a h2 = h(28 - numberOfLeadingZeros);
        o2.f(h);
        e(o2, g2, h2);
        o2.w();
        j(o2, g2, h2);
        o2.e(h);
        return f(o2, 1, a2);
    }

    static a o(byte[] bArr, int i, int i2) {
        a aVar = new a(i);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i3 = 1 << i2;
        int i4 = i3 / 2;
        int i5 = i3 - 1;
        int i6 = 32 - i2;
        int length = (bArr.length * 8) - i2;
        int i7 = 0;
        int i8 = 0;
        while (length > (-i2)) {
            int min = Math.min(Math.max(0, length >> 3), bArr.length - 4);
            i7 = (i4 - (((i.e(bArr, min) >>> ((i6 - length) + (min << 3))) & i5) + i7)) >>> 31;
            aVar.t(i8, r9 - ((-i7) & i3));
            i8++;
            length -= i2;
        }
        if (i7 > 0) {
            aVar.t(i8, i7);
        }
        return aVar;
    }

    static final class a {
        private final double[] a;
        private final int b;
        private final int c;

        a(int i) {
            this.a = new double[i << 1];
            this.b = i;
            this.c = 0;
        }

        private int j(int i) {
            return (i << 1) + this.c + 1;
        }

        private int u(int i) {
            return (i << 1) + this.c;
        }

        void b(int i, b bVar) {
            double[] dArr = this.a;
            int u = u(i);
            dArr[u] = dArr[u] + bVar.a;
            double[] dArr2 = this.a;
            int j = j(i);
            dArr2[j] = dArr2[j] + bVar.b;
        }

        void c(int i, a aVar, int i2, b bVar) {
            bVar.a = this.a[u(i)] + aVar.s(i2);
            bVar.b = this.a[j(i)] + aVar.h(i2);
        }

        void d(int i, a aVar, int i2, b bVar) {
            bVar.a = this.a[u(i)] - aVar.h(i2);
            bVar.b = this.a[j(i)] + aVar.s(i2);
        }

        void e(a aVar) {
            int i = this.c;
            int i2 = aVar.c;
            double[] dArr = aVar.a;
            for (int i3 = 0; i3 < this.b; i3++) {
                double[] dArr2 = this.a;
                double d = dArr2[i];
                int i4 = i + 1;
                double d2 = dArr2[i4];
                int i5 = i2 + 1;
                dArr2[i] = i.a(d, dArr[i2], dArr[i5] * d2);
                this.a[i4] = i.a(-d, dArr[i5], d2 * dArr[i2]);
                i += 2;
                i2 += 2;
            }
        }

        void f(a aVar) {
            int i = aVar.c;
            double[] dArr = aVar.a;
            int i2 = this.c;
            int i3 = (this.b + i2) << 1;
            while (i2 < i3) {
                double[] dArr2 = this.a;
                double d = dArr2[i2];
                dArr2[i2] = dArr[i] * d;
                dArr2[i2 + 1] = d * dArr[i + 1];
                i += 2;
                i2 += 2;
            }
        }

        void g(int i, b bVar) {
            bVar.a = this.a[u(i)];
            bVar.b = this.a[j(i)];
        }

        double h(int i) {
            return this.a[(i << 1) + this.c + 1];
        }

        void i(int i, double d) {
            this.a[(i << 1) + this.c + 1] = d;
        }

        void k(int i, b bVar) {
            int u = u(i);
            int j = j(i);
            double[] dArr = this.a;
            double d = dArr[u];
            double d2 = dArr[j];
            dArr[u] = i.a(d, bVar.a, (-d2) * bVar.b);
            this.a[j] = i.a(d, bVar.b, bVar.a * d2);
        }

        void l(int i, b bVar) {
            int u = u(i);
            int j = j(i);
            double[] dArr = this.a;
            double d = dArr[u];
            double d2 = -dArr[j];
            dArr[u] = i.a(-d, bVar.b, bVar.a * d2);
            this.a[j] = i.a(d, bVar.a, d2 * bVar.b);
        }

        void m(int i, b bVar) {
            int u = u(i);
            int j = j(i);
            double[] dArr = this.a;
            double d = dArr[u];
            double d2 = dArr[j];
            dArr[u] = i.a(d, bVar.a, bVar.b * d2);
            this.a[j] = i.a(-d, bVar.b, d2 * bVar.a);
        }

        void n(int i, b bVar, b bVar2) {
            double d = this.a[u(i)];
            double d2 = this.a[j(i)];
            bVar2.a = i.a(d, bVar.a, d2 * bVar.b);
            bVar2.b = i.a(-d, bVar.b, d2 * bVar.a);
        }

        void o(int i, b bVar) {
            int u = u(i);
            int j = j(i);
            double[] dArr = this.a;
            double d = dArr[u];
            double d2 = dArr[j];
            double d3 = -d;
            dArr[u] = i.a(d3, bVar.b, d2 * bVar.a);
            this.a[j] = i.a(d3, bVar.a, (-d2) * bVar.b);
        }

        void p(int i, b bVar, b bVar2) {
            double d = this.a[u(i)];
            double d2 = this.a[j(i)];
            bVar2.a = i.a(d, bVar.a, bVar.b * (-d2));
            bVar2.b = i.a(d, bVar.b, d2 * bVar.a);
        }

        void q(a aVar) {
            int i = aVar.c;
            double[] dArr = aVar.a;
            int i2 = this.c;
            int i3 = (this.b + i2) << 1;
            while (i2 < i3) {
                double[] dArr2 = this.a;
                double d = dArr2[i2];
                int i4 = i2 + 1;
                double d2 = dArr2[i4];
                double d3 = dArr[i];
                double d4 = dArr[i + 1];
                dArr2[i2] = i.a(d, d3, (-d2) * d4);
                this.a[i4] = i.a(d, d4, d2 * d3);
                i += 2;
                i2 += 2;
            }
        }

        double r(int i, int i2) {
            return this.a[(i << 1) + i2];
        }

        double s(int i) {
            return this.a[(i << 1) + this.c];
        }

        void t(int i, double d) {
            this.a[(i << 1) + this.c] = d;
        }

        void v(int i, double d, double d2) {
            int u = u(i);
            double[] dArr = this.a;
            dArr[u] = d;
            dArr[u + 1] = d2;
        }

        void w() {
            int i = this.c;
            int i2 = (this.b + i) << 1;
            while (i < i2) {
                double[] dArr = this.a;
                double d = dArr[i];
                int i3 = i + 1;
                double d2 = dArr[i3];
                dArr[i] = i.a(d, d, (-d2) * d2);
                this.a[i3] = d * 2.0d * d2;
                i += 2;
            }
        }

        void x(int i, a aVar, int i2, b bVar) {
            bVar.a = this.a[u(i)] - aVar.s(i2);
            bVar.b = this.a[j(i)] - aVar.h(i2);
        }

        void y(int i, a aVar, int i2, b bVar) {
            bVar.a = this.a[u(i)] + aVar.h(i2);
            bVar.b = this.a[j(i)] - aVar.s(i2);
        }

        void z(int i, int i2) {
            int u = u(i);
            int j = j(i);
            double[] dArr = this.a;
            double d = dArr[u];
            double d2 = dArr[j];
            dArr[u] = Math.scalb(d, i2);
            this.a[j] = Math.scalb(d2, i2);
        }

        a(a aVar, int i, int i2) {
            this.b = i2 - i;
            this.a = aVar.a;
            this.c = i << 1;
        }
    }
}
