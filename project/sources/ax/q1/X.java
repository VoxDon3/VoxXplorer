package ax.q1;

import android.util.Base64;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class X {

    public static final class a {
        public final String a;
        public final String[] b;
        public final int c;

        public a(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public b(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int[] a(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long c(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static ax.P0.C d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] y1 = d0.y1(str, "=");
            if (y1.length != 2) {
                C0987u.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (y1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ax.C1.a.d(new ax.S0.G(Base64.decode(y1[1], 0))));
                } catch (RuntimeException e) {
                    C0987u.i("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ax.H1.a(y1[0], y1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ax.P0.C(arrayList);
    }

    public static AbstractC2991z<byte[]> e(byte[] bArr) {
        ax.S0.G g = new ax.S0.G(bArr);
        g.c0(1);
        int i = 0;
        while (g.a() > 0 && g.n() == 255) {
            i += 255;
            g.c0(1);
        }
        int M = i + g.M();
        int i2 = 0;
        while (g.a() > 0 && g.n() == 255) {
            i2 += 255;
            g.c0(1);
        }
        int M2 = i2 + g.M();
        byte[] bArr2 = new byte[M];
        int g2 = g.g();
        System.arraycopy(bArr, g2, bArr2, 0, M);
        int i3 = g2 + M + M2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return AbstractC2991z.B(bArr2, bArr3);
    }

    private static void f(W w) throws ax.P0.E {
        int d = w.d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = w.d(16);
            if (d2 == 0) {
                w.e(8);
                w.e(16);
                w.e(16);
                w.e(6);
                w.e(8);
                int d3 = w.d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    w.e(8);
                }
            } else {
                if (d2 != 1) {
                    throw ax.P0.E.a("floor type greater than 1 not decodable: " + d2, null);
                }
                int d4 = w.d(5);
                int[] iArr = new int[d4];
                int i3 = -1;
                for (int i4 = 0; i4 < d4; i4++) {
                    int d5 = w.d(4);
                    iArr[i4] = d5;
                    if (d5 > i3) {
                        i3 = d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = w.d(3) + 1;
                    int d6 = w.d(2);
                    if (d6 > 0) {
                        w.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        w.e(8);
                    }
                }
                w.e(2);
                int d7 = w.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        w.e(d7);
                        i9++;
                    }
                }
            }
        }
    }

    private static void g(int i, W w) throws ax.P0.E {
        int d = w.d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = w.d(16);
            if (d2 != 0) {
                C0987u.c("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                int d3 = w.c() ? w.d(4) + 1 : 1;
                if (w.c()) {
                    int d4 = w.d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        w.e(b(i4));
                        w.e(b(i4));
                    }
                }
                if (w.d(2) != 0) {
                    throw ax.P0.E.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        w.e(4);
                    }
                }
                for (int i6 = 0; i6 < d3; i6++) {
                    w.e(8);
                    w.e(8);
                    w.e(8);
                }
            }
        }
    }

    private static b[] h(W w) {
        int d = w.d(6) + 1;
        b[] bVarArr = new b[d];
        for (int i = 0; i < d; i++) {
            bVarArr[i] = new b(w.c(), w.d(16), w.d(16), w.d(8));
        }
        return bVarArr;
    }

    private static void i(W w) throws ax.P0.E {
        int d = w.d(6) + 1;
        for (int i = 0; i < d; i++) {
            if (w.d(16) > 2) {
                throw ax.P0.E.a("residueType greater than 2 is not decodable", null);
            }
            w.e(24);
            w.e(24);
            w.e(24);
            int d2 = w.d(6) + 1;
            w.e(8);
            int[] iArr = new int[d2];
            for (int i2 = 0; i2 < d2; i2++) {
                iArr[i2] = ((w.c() ? w.d(5) : 0) * 8) + w.d(3);
            }
            for (int i3 = 0; i3 < d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        w.e(8);
                    }
                }
            }
        }
    }

    public static a j(ax.S0.G g) throws ax.P0.E {
        return k(g, true, true);
    }

    public static a k(ax.S0.G g, boolean z, boolean z2) throws ax.P0.E {
        if (z) {
            o(3, g, false);
        }
        String J = g.J((int) g.C());
        int length = J.length();
        long C = g.C();
        String[] strArr = new String[(int) C];
        int i = length + 15;
        for (int i2 = 0; i2 < C; i2++) {
            String J2 = g.J((int) g.C());
            strArr[i2] = J2;
            i = i + 4 + J2.length();
        }
        if (z2 && (g.M() & 1) == 0) {
            throw ax.P0.E.a("framing bit expected to be set", null);
        }
        return new a(J, strArr, i + 1);
    }

    public static c l(ax.S0.G g) throws ax.P0.E {
        o(1, g, false);
        int D = g.D();
        int M = g.M();
        int D2 = g.D();
        int z = g.z();
        if (z <= 0) {
            z = -1;
        }
        int z2 = g.z();
        if (z2 <= 0) {
            z2 = -1;
        }
        int z3 = g.z();
        if (z3 <= 0) {
            z3 = -1;
        }
        int M2 = g.M();
        return new c(D, M, D2, z, z2, z3, (int) Math.pow(2.0d, M2 & 15), (int) Math.pow(2.0d, (M2 & 240) >> 4), (g.M() & 1) > 0, Arrays.copyOf(g.f(), g.j()));
    }

    public static b[] m(ax.S0.G g, int i) throws ax.P0.E {
        o(5, g, false);
        int M = g.M() + 1;
        W w = new W(g.f());
        w.e(g.g() * 8);
        for (int i2 = 0; i2 < M; i2++) {
            n(w);
        }
        int d = w.d(6) + 1;
        for (int i3 = 0; i3 < d; i3++) {
            if (w.d(16) != 0) {
                throw ax.P0.E.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(w);
        i(w);
        g(i, w);
        b[] h = h(w);
        if (w.c()) {
            return h;
        }
        throw ax.P0.E.a("framing bit after modes not set as expected", null);
    }

    private static void n(W w) throws ax.P0.E {
        if (w.d(24) != 5653314) {
            throw ax.P0.E.a("expected code book to start with [0x56, 0x43, 0x42] at " + w.b(), null);
        }
        int d = w.d(16);
        int d2 = w.d(24);
        int i = 0;
        if (w.c()) {
            w.e(5);
            while (i < d2) {
                i += w.d(b(d2 - i));
            }
        } else {
            boolean c2 = w.c();
            while (i < d2) {
                if (!c2) {
                    w.e(5);
                } else if (w.c()) {
                    w.e(5);
                }
                i++;
            }
        }
        int d3 = w.d(4);
        if (d3 > 2) {
            throw ax.P0.E.a("lookup type greater than 2 not decodable: " + d3, null);
        }
        if (d3 == 1 || d3 == 2) {
            w.e(32);
            w.e(32);
            int d4 = w.d(4) + 1;
            w.e(1);
            w.e((int) ((d3 == 1 ? d != 0 ? c(d2, d) : 0L : d * d2) * d4));
        }
    }

    public static boolean o(int i, ax.S0.G g, boolean z) throws ax.P0.E {
        if (g.a() < 7) {
            if (z) {
                return false;
            }
            throw ax.P0.E.a("too short header: " + g.a(), null);
        }
        if (g.M() != i) {
            if (z) {
                return false;
            }
            throw ax.P0.E.a("expected header type " + Integer.toHexString(i), null);
        }
        if (g.M() == 118 && g.M() == 111 && g.M() == 114 && g.M() == 98 && g.M() == 105 && g.M() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ax.P0.E.a("expected characters 'vorbis'", null);
    }
}
