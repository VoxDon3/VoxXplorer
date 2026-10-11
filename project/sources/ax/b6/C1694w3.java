package ax.b6;

import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1694w3 {
    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(r(bArr, i));
    }

    static int b(int i, byte[] bArr, int i2, int i3, C1686v3 c1686v3) throws C1663s4 {
        if ((i >>> 3) == 0) {
            throw C1663s4.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return q(bArr, i2, c1686v3);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return p(bArr, i2, c1686v3) + c1686v3.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw C1663s4.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = p(bArr, i2, c1686v3);
            i6 = c1686v3.a;
            if (i6 == i5) {
                break;
            }
            i2 = b(i6, bArr, i2, i3, c1686v3);
        }
        if (i2 > i3 || i6 != i5) {
            throw C1663s4.e();
        }
        return i2;
    }

    static int c(int i, byte[] bArr, int i2, int i3, InterfaceC1671t4<?> interfaceC1671t4, C1686v3 c1686v3) {
        C1624n4 c1624n4 = (C1624n4) interfaceC1671t4;
        int p = p(bArr, i2, c1686v3);
        c1624n4.i(c1686v3.a);
        while (p < i3) {
            int p2 = p(bArr, p, c1686v3);
            if (i != c1686v3.a) {
                break;
            }
            p = p(bArr, p2, c1686v3);
            c1624n4.i(c1686v3.a);
        }
        return p;
    }

    static int d(int i, byte[] bArr, int i2, int i3, F5 f5, C1686v3 c1686v3) throws C1663s4 {
        if ((i >>> 3) == 0) {
            throw C1663s4.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int q = q(bArr, i2, c1686v3);
            f5.e(i, Long.valueOf(c1686v3.b));
            return q;
        }
        if (i4 == 1) {
            f5.e(i, Long.valueOf(r(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int p = p(bArr, i2, c1686v3);
            int i5 = c1686v3.a;
            if (i5 < 0) {
                throw C1663s4.d();
            }
            if (i5 > bArr.length - p) {
                throw C1663s4.f();
            }
            if (i5 == 0) {
                f5.e(i, B3.c0);
            } else {
                f5.e(i, B3.p(bArr, p, i5));
            }
            return p + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C1663s4.b();
            }
            f5.e(i, Integer.valueOf(o(bArr, i2)));
            return i2 + 4;
        }
        F5 l = F5.l();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int p2 = p(bArr, i2, c1686v3);
            i7 = c1686v3.a;
            if (i7 == i6) {
                i2 = p2;
                break;
            }
            i2 = d(i7, bArr, p2, i3, l, c1686v3);
        }
        if (i2 > i3 || i7 != i6) {
            throw C1663s4.e();
        }
        f5.e(i, l);
        return i2;
    }

    static int e(int i, byte[] bArr, int i2, C1686v3 c1686v3) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c1686v3.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1686v3.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1686v3.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1686v3.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1686v3.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int f(InterfaceC1609l5<?> interfaceC1609l5, int i, byte[] bArr, int i2, int i3, InterfaceC1671t4<?> interfaceC1671t4, C1686v3 c1686v3) throws IOException {
        int h = h(interfaceC1609l5, bArr, i2, i3, c1686v3);
        interfaceC1671t4.add(c1686v3.c);
        while (h < i3) {
            int p = p(bArr, h, c1686v3);
            if (i != c1686v3.a) {
                break;
            }
            h = h(interfaceC1609l5, bArr, p, i3, c1686v3);
            interfaceC1671t4.add(c1686v3.c);
        }
        return h;
    }

    static int g(InterfaceC1609l5 interfaceC1609l5, byte[] bArr, int i, int i2, int i3, C1686v3 c1686v3) throws IOException {
        Object a = interfaceC1609l5.a();
        int i4 = i(a, interfaceC1609l5, bArr, i, i2, i3, c1686v3);
        interfaceC1609l5.e(a);
        c1686v3.c = a;
        return i4;
    }

    static int h(InterfaceC1609l5 interfaceC1609l5, byte[] bArr, int i, int i2, C1686v3 c1686v3) throws IOException {
        Object a = interfaceC1609l5.a();
        int j = j(a, interfaceC1609l5, bArr, i, i2, c1686v3);
        interfaceC1609l5.e(a);
        c1686v3.c = a;
        return j;
    }

    static int i(Object obj, InterfaceC1609l5 interfaceC1609l5, byte[] bArr, int i, int i2, int i3, C1686v3 c1686v3) throws IOException {
        int m = ((X4) interfaceC1609l5).m(obj, bArr, i, i2, i3, c1686v3);
        c1686v3.c = obj;
        return m;
    }

    static int j(Object obj, InterfaceC1609l5 interfaceC1609l5, byte[] bArr, int i, int i2, C1686v3 c1686v3) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = e(i4, bArr, i3, c1686v3);
            i4 = c1686v3.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C1663s4.f();
        }
        int i6 = i5 + i4;
        interfaceC1609l5.h(obj, bArr, i5, i6, c1686v3);
        c1686v3.c = obj;
        return i6;
    }

    static int k(byte[] bArr, int i, C1686v3 c1686v3) throws C1663s4 {
        int p = p(bArr, i, c1686v3);
        int i2 = c1686v3.a;
        if (i2 < 0) {
            throw C1663s4.d();
        }
        if (i2 > bArr.length - p) {
            throw C1663s4.f();
        }
        if (i2 == 0) {
            c1686v3.c = B3.c0;
            return p;
        }
        c1686v3.c = B3.p(bArr, p, i2);
        return p + i2;
    }

    static int l(byte[] bArr, int i, InterfaceC1671t4<?> interfaceC1671t4, C1686v3 c1686v3) throws IOException {
        C1624n4 c1624n4 = (C1624n4) interfaceC1671t4;
        int p = p(bArr, i, c1686v3);
        int i2 = c1686v3.a + p;
        while (p < i2) {
            p = p(bArr, p, c1686v3);
            c1624n4.i(c1686v3.a);
        }
        if (p == i2) {
            return p;
        }
        throw C1663s4.f();
    }

    static float m(byte[] bArr, int i) {
        return Float.intBitsToFloat(o(bArr, i));
    }

    static int n(byte[] bArr, int i, C1686v3 c1686v3) throws C1663s4 {
        int p = p(bArr, i, c1686v3);
        int i2 = c1686v3.a;
        if (i2 < 0) {
            throw C1663s4.d();
        }
        if (i2 == 0) {
            c1686v3.c = HttpUrl.FRAGMENT_ENCODE_SET;
            return p;
        }
        c1686v3.c = L5.d(bArr, p, i2);
        return p + i2;
    }

    static int o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int p(byte[] bArr, int i, C1686v3 c1686v3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return e(b, bArr, i2, c1686v3);
        }
        c1686v3.a = b;
        return i2;
    }

    static int q(byte[] bArr, int i, C1686v3 c1686v3) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c1686v3.b = j;
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
        c1686v3.b = j2;
        return i3;
    }

    static long r(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
