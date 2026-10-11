package ax.W5;

import java.io.IOException;

/* renamed from: ax.W5.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1034h0 {
    static int a(byte[] bArr, int i, C1031g0 c1031g0) throws P0 {
        int h = h(bArr, i, c1031g0);
        int i2 = c1031g0.a;
        if (i2 < 0) {
            throw P0.c();
        }
        if (i2 > bArr.length - h) {
            throw P0.f();
        }
        if (i2 == 0) {
            c1031g0.c = AbstractC1069t0.c0;
            return h;
        }
        c1031g0.c = AbstractC1069t0.r(bArr, h, i2);
        return h + i2;
    }

    static int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int c(InterfaceC1076v1 interfaceC1076v1, byte[] bArr, int i, int i2, int i3, C1031g0 c1031g0) throws IOException {
        Object e = interfaceC1076v1.e();
        int l = l(e, interfaceC1076v1, bArr, i, i2, i3, c1031g0);
        interfaceC1076v1.c(e);
        c1031g0.c = e;
        return l;
    }

    static int d(InterfaceC1076v1 interfaceC1076v1, byte[] bArr, int i, int i2, C1031g0 c1031g0) throws IOException {
        Object e = interfaceC1076v1.e();
        int m = m(e, interfaceC1076v1, bArr, i, i2, c1031g0);
        interfaceC1076v1.c(e);
        c1031g0.c = e;
        return m;
    }

    static int e(InterfaceC1076v1 interfaceC1076v1, int i, byte[] bArr, int i2, int i3, M0 m0, C1031g0 c1031g0) throws IOException {
        int d = d(interfaceC1076v1, bArr, i2, i3, c1031g0);
        m0.add(c1031g0.c);
        while (d < i3) {
            int h = h(bArr, d, c1031g0);
            if (i != c1031g0.a) {
                break;
            }
            d = d(interfaceC1076v1, bArr, h, i3, c1031g0);
            m0.add(c1031g0.c);
        }
        return d;
    }

    static int f(byte[] bArr, int i, M0 m0, C1031g0 c1031g0) throws IOException {
        K0 k0 = (K0) m0;
        int h = h(bArr, i, c1031g0);
        int i2 = c1031g0.a + h;
        while (h < i2) {
            h = h(bArr, h, c1031g0);
            k0.g(c1031g0.a);
        }
        if (h == i2) {
            return h;
        }
        throw P0.f();
    }

    static int g(int i, byte[] bArr, int i2, int i3, O1 o1, C1031g0 c1031g0) throws P0 {
        if ((i >>> 3) == 0) {
            throw P0.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int k = k(bArr, i2, c1031g0);
            o1.h(i, Long.valueOf(c1031g0.b));
            return k;
        }
        if (i4 == 1) {
            o1.h(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int h = h(bArr, i2, c1031g0);
            int i5 = c1031g0.a;
            if (i5 < 0) {
                throw P0.c();
            }
            if (i5 > bArr.length - h) {
                throw P0.f();
            }
            if (i5 == 0) {
                o1.h(i, AbstractC1069t0.c0);
            } else {
                o1.h(i, AbstractC1069t0.r(bArr, h, i5));
            }
            return h + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw P0.a();
            }
            o1.h(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        O1 d = O1.d();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int h2 = h(bArr, i2, c1031g0);
            i7 = c1031g0.a;
            if (i7 == i6) {
                i2 = h2;
                break;
            }
            i2 = g(i7, bArr, h2, i3, d, c1031g0);
        }
        if (i2 > i3 || i7 != i6) {
            throw P0.d();
        }
        o1.h(i, d);
        return i2;
    }

    static int h(byte[] bArr, int i, C1031g0 c1031g0) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return i(b, bArr, i2, c1031g0);
        }
        c1031g0.a = b;
        return i2;
    }

    static int i(int i, byte[] bArr, int i2, C1031g0 c1031g0) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c1031g0.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c1031g0.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1031g0.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1031g0.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1031g0.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int j(int i, byte[] bArr, int i2, int i3, M0 m0, C1031g0 c1031g0) {
        K0 k0 = (K0) m0;
        int h = h(bArr, i2, c1031g0);
        k0.g(c1031g0.a);
        while (h < i3) {
            int h2 = h(bArr, h, c1031g0);
            if (i != c1031g0.a) {
                break;
            }
            h = h(bArr, h2, c1031g0);
            k0.g(c1031g0.a);
        }
        return h;
    }

    static int k(byte[] bArr, int i, C1031g0 c1031g0) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c1031g0.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c1031g0.b = j2;
        return i3;
    }

    static int l(Object obj, InterfaceC1076v1 interfaceC1076v1, byte[] bArr, int i, int i2, int i3, C1031g0 c1031g0) throws IOException {
        int q = ((C1053n1) interfaceC1076v1).q(obj, bArr, i, i2, i3, c1031g0);
        c1031g0.c = obj;
        return q;
    }

    static int m(Object obj, InterfaceC1076v1 interfaceC1076v1, byte[] bArr, int i, int i2, C1031g0 c1031g0) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, c1031g0);
            i4 = c1031g0.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw P0.f();
        }
        int i6 = i5 + i4;
        interfaceC1076v1.d(obj, bArr, i5, i6, c1031g0);
        c1031g0.c = obj;
        return i6;
    }

    static long n(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
