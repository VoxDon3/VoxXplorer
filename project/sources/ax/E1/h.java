package ax.E1;

import ax.P0.C;
import ax.P0.D;
import ax.S0.C0987u;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.q7.C2876c;
import ax.r7.AbstractC2991z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h extends ax.z1.c {
    public static final a b = new a() { // from class: ax.E1.g
        @Override // ax.E1.h.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return h.c(i, i2, i3, i4, i5);
        }
    };
    private final a a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static final class b {
        private final int a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public h() {
        this(null);
    }

    private static int A(G g, int i) {
        byte[] f = g.f();
        int g2 = g.g();
        int i2 = g2;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= g2 + i) {
                return i;
            }
            if ((f[i2] & 255) == 255 && f[i3] == 0) {
                System.arraycopy(f, i2 + 2, f, i3, (i - (i2 - g2)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean B(ax.S0.G r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.g()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.v()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.O()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.U()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb0
        L25:
            int r7 = r1.P()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.P()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = 0
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.b0(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4e
            r1.b0(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = 1
            goto L77
        L76:
            r3 = 0
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8b
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L8b
            goto L8c
        L8a:
            r3 = 0
        L8b:
            r4 = 0
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.b0(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.b0(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.c0(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lac:
            r1.b0(r2)
            return r4
        Lb0:
            r1.b0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.E1.h.B(ax.S0.G, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i, int i2) {
        return i2 <= i ? d0.f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static ax.E1.a f(G g, int i, int i2) {
        int z;
        String str;
        int M = g.M();
        Charset w = w(M);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        g.q(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + C2876c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z = 2;
        } else {
            z = z(bArr, 0);
            String e = C2876c.e(new String(bArr, 0, z, StandardCharsets.ISO_8859_1));
            if (e.indexOf(47) == -1) {
                str = "image/" + e;
            } else {
                str = e;
            }
        }
        int i4 = bArr[z + 1] & 255;
        int i5 = z + 2;
        int y = y(bArr, i5, M);
        return new ax.E1.a(str, new String(bArr, i5, y - i5, w), i4, d(bArr, y + v(M), i3));
    }

    private static ax.E1.b g(G g, int i, String str) {
        byte[] bArr = new byte[i];
        g.q(bArr, 0, i);
        return new ax.E1.b(str, bArr);
    }

    private static c h(G g, int i, int i2, boolean z, int i3, a aVar) {
        int g2 = g.g();
        int z2 = z(g.f(), g2);
        String str = new String(g.f(), g2, z2 - g2, StandardCharsets.ISO_8859_1);
        g.b0(z2 + 1);
        int v = g.v();
        int v2 = g.v();
        long O = g.O();
        if (O == 4294967295L) {
            O = -1;
        }
        long O2 = g.O();
        long j = O2 == 4294967295L ? -1L : O2;
        ArrayList arrayList = new ArrayList();
        int i4 = g2 + i;
        while (g.g() < i4) {
            i k = k(i2, g, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new c(str, v, v2, O, j, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(G g, int i, int i2, boolean z, int i3, a aVar) {
        int g2 = g.g();
        int z2 = z(g.f(), g2);
        String str = new String(g.f(), g2, z2 - g2, StandardCharsets.ISO_8859_1);
        g.b0(z2 + 1);
        int M = g.M();
        boolean z3 = (M & 2) != 0;
        boolean z4 = (M & 1) != 0;
        int M2 = g.M();
        String[] strArr = new String[M2];
        for (int i4 = 0; i4 < M2; i4++) {
            int g3 = g.g();
            int z5 = z(g.f(), g3);
            strArr[i4] = new String(g.f(), g3, z5 - g3, StandardCharsets.ISO_8859_1);
            g.b0(z5 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = g2 + i;
        while (g.g() < i5) {
            i k = k(i2, g, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new d(str, z3, z4, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(G g, int i) {
        if (i < 4) {
            return null;
        }
        int M = g.M();
        Charset w = w(M);
        byte[] bArr = new byte[3];
        g.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        g.q(bArr2, 0, i2);
        int y = y(bArr2, 0, M);
        String str2 = new String(bArr2, 0, y, w);
        int v = y + v(M);
        return new e(str, str2, p(bArr2, v, y(bArr2, v, M), w));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ax.E1.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [ax.S0.G] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.E1.i k(int r19, ax.S0.G r20, boolean r21, int r22, ax.E1.h.a r23) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.E1.h.k(int, ax.S0.G, boolean, int, ax.E1.h$a):ax.E1.i");
    }

    private static f l(G g, int i) {
        int M = g.M();
        Charset w = w(M);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g.q(bArr, 0, i2);
        int z = z(bArr, 0);
        String t = D.t(new String(bArr, 0, z, StandardCharsets.ISO_8859_1));
        int i3 = z + 1;
        int y = y(bArr, i3, M);
        String p = p(bArr, i3, y, w);
        int v = y + v(M);
        int y2 = y(bArr, v, M);
        return new f(t, p, p(bArr, v, y2, w), d(bArr, y2 + v(M), i2));
    }

    private static b m(G g) {
        boolean z = false;
        if (g.a() < 10) {
            C0987u.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int P = g.P();
        if (P != 4801587) {
            C0987u.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(P)));
            return null;
        }
        int M = g.M();
        g.c0(1);
        int M2 = g.M();
        int L = g.L();
        if (M == 2) {
            if ((M2 & 64) != 0) {
                C0987u.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (M == 3) {
            if ((M2 & 64) != 0) {
                int v = g.v();
                g.c0(v);
                L -= v + 4;
            }
        } else {
            if (M != 4) {
                C0987u.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + M);
                return null;
            }
            if ((M2 & 64) != 0) {
                int L2 = g.L();
                g.c0(L2 - 4);
                L -= L2;
            }
            if ((M2 & 16) != 0) {
                L -= 10;
            }
        }
        if (M < 4 && (M2 & 128) != 0) {
            z = true;
        }
        return new b(M, z, L);
    }

    private static l n(G g, int i) {
        int U = g.U();
        int P = g.P();
        int P2 = g.P();
        int M = g.M();
        int M2 = g.M();
        F f = new F();
        f.m(g);
        int i2 = ((i - 10) * 8) / (M + M2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = f.h(M);
            int h2 = f.h(M2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new l(U, P, P2, iArr, iArr2);
    }

    private static m o(G g, int i) {
        byte[] bArr = new byte[i];
        g.q(bArr, 0, i);
        int z = z(bArr, 0);
        return new m(new String(bArr, 0, z, StandardCharsets.ISO_8859_1), d(bArr, z + 1, i));
    }

    private static String p(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? HttpUrl.FRAGMENT_ENCODE_SET : new String(bArr, i, i2 - i, charset);
    }

    private static n q(G g, int i, String str) {
        if (i < 1) {
            return null;
        }
        int M = g.M();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g.q(bArr, 0, i2);
        return new n(str, null, r(bArr, M, 0));
    }

    private static AbstractC2991z<String> r(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return AbstractC2991z.A(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        AbstractC2991z.a r = AbstractC2991z.r();
        int y = y(bArr, i2, i);
        while (i2 < y) {
            r.a(new String(bArr, i2, y - i2, w(i)));
            i2 = v(i) + y;
            y = y(bArr, i2, i);
        }
        AbstractC2991z<String> k = r.k();
        return k.isEmpty() ? AbstractC2991z.A(HttpUrl.FRAGMENT_ENCODE_SET) : k;
    }

    private static n s(G g, int i) {
        if (i < 1) {
            return null;
        }
        int M = g.M();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g.q(bArr, 0, i2);
        int y = y(bArr, 0, M);
        return new n("TXXX", new String(bArr, 0, y, w(M)), r(bArr, M, y + v(M)));
    }

    private static o t(G g, int i, String str) {
        byte[] bArr = new byte[i];
        g.q(bArr, 0, i);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(G g, int i) {
        if (i < 1) {
            return null;
        }
        int M = g.M();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        g.q(bArr, 0, i2);
        int y = y(bArr, 0, M);
        String str = new String(bArr, 0, y, w(M));
        int v = y + v(M);
        return new o("WXXX", str, p(bArr, v, z(bArr, v), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static Charset w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int y(byte[] bArr, int i, int i2) {
        int z = z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return z;
        }
        while (z < bArr.length - 1) {
            if ((z - i) % 2 == 0 && bArr[z + 1] == 0) {
                return z;
            }
            z = z(bArr, z + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // ax.z1.c
    protected C b(ax.z1.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public C e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        G g = new G(bArr, i);
        b m = m(g);
        if (m == null) {
            return null;
        }
        int g2 = g.g();
        int i2 = m.a == 2 ? 6 : 10;
        int i3 = m.c;
        if (m.b) {
            i3 = A(g, m.c);
        }
        g.a0(g2 + i3);
        boolean z = false;
        if (!B(g, m.a, i2, false)) {
            if (m.a != 4 || !B(g, 4, i2, true)) {
                C0987u.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m.a);
                return null;
            }
            z = true;
        }
        while (g.a() >= i2) {
            i k = k(m.a, g, z, i2, this.a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C(arrayList);
    }

    public h(a aVar) {
        this.a = aVar;
    }
}
