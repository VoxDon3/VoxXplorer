package ax.K1;

import android.util.Pair;
import ax.P0.C;
import ax.P0.C0901j;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.D;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.e;
import ax.T0.h;
import ax.q1.C2844d;
import ax.q1.C2860u;
import ax.q1.F;
import ax.q7.C2880g;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b {
    private static final byte[] a = d0.x0("OpusHead");

    private static final class a {
        private final long a;
        private final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* renamed from: ax.K1.b$b, reason: collision with other inner class name */
    private static final class C0104b {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final G f;
        private final G g;
        private int h;
        private int i;

        public C0104b(G g, G g2, boolean z) throws E {
            this.g = g;
            this.f = g2;
            this.e = z;
            g2.b0(12);
            this.a = g2.Q();
            g.b0(12);
            this.i = g.Q();
            C2860u.a(g.v() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.T() : this.f.O();
            if (this.b == this.h) {
                this.c = this.g.Q();
                this.g.c0(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.Q() - 1 : -1;
            }
            return true;
        }
    }

    private static final class c {
        private final String a;
        private final byte[] b;
        private final long c;
        private final long d;

        public c(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    private static final class d {
        private final g a;

        public d(g gVar) {
            this.a = gVar;
        }
    }

    private static final class e {
        private final long a;
        private final long b;
        private final String c;

        public e(long j, long j2, String str) {
            this.a = j;
            this.b = j2;
            this.c = str;
        }
    }

    private interface f {
        int a();

        int b();

        int c();
    }

    private static final class g {
        private final boolean a;
        private final boolean b;
        private final boolean c;

        public g(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    private static final class h {
        public final u[] a;
        public C0912v b;
        public int c;
        public int d = 0;

        public h(int i) {
            this.a = new u[i];
        }
    }

    static final class i implements f {
        private final int a;
        private final int b;
        private final G c;

        public i(e.c cVar, C0912v c0912v) {
            G g = cVar.b;
            this.c = g;
            g.b0(12);
            int Q = g.Q();
            if ("audio/raw".equals(c0912v.o)) {
                int m0 = d0.m0(c0912v.I, c0912v.G);
                if (Q == 0 || Q % m0 != 0) {
                    C0987u.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + m0 + ", stsz sample size: " + Q);
                    Q = m0;
                }
            }
            this.a = Q == 0 ? -1 : Q;
            this.b = g.Q();
        }

        @Override // ax.K1.b.f
        public int a() {
            return this.a;
        }

        @Override // ax.K1.b.f
        public int b() {
            return this.b;
        }

        @Override // ax.K1.b.f
        public int c() {
            int i = this.a;
            return i == -1 ? this.c.Q() : i;
        }
    }

    static final class j implements f {
        private final G a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public j(e.c cVar) {
            G g = cVar.b;
            this.a = g;
            g.b0(12);
            this.c = g.Q() & 255;
            this.b = g.Q();
        }

        @Override // ax.K1.b.f
        public int a() {
            return -1;
        }

        @Override // ax.K1.b.f
        public int b() {
            return this.b;
        }

        @Override // ax.K1.b.f
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.a.M();
            }
            if (i == 16) {
                return this.a.U();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int M = this.a.M();
            this.e = M;
            return (M & 240) >> 4;
        }
    }

    private static final class k {
        private final int a;
        private final long b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;

        public k(int i, long j, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = j;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    static final class l {
        private final d a;

        public l(d dVar) {
            this.a = dVar;
        }

        public boolean b() {
            d dVar = this.a;
            return dVar != null && dVar.a.a && this.a.a.b;
        }
    }

    private static u A(G g2, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            g2.b0(i6);
            int v = g2.v();
            if (g2.v() == 1952804451) {
                int q = q(g2.v());
                g2.c0(1);
                if (q == 0) {
                    g2.c0(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int M = g2.M();
                    i4 = M & 15;
                    i5 = (M & 240) >> 4;
                }
                boolean z = g2.M() == 1;
                int M2 = g2.M();
                byte[] bArr2 = new byte[16];
                g2.q(bArr2, 0, 16);
                if (z && M2 == 0) {
                    int M3 = g2.M();
                    bArr = new byte[M3];
                    g2.q(bArr, 0, M3);
                }
                return new u(z, str, M2, bArr2, i5, i4, bArr);
            }
            i6 += v;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.K1.w B(ax.K1.t r36, ax.T0.e.b r37, ax.q1.F r38) throws ax.P0.E {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K1.b.B(ax.K1.t, ax.T0.e$b, ax.q1.F):ax.K1.w");
    }

    private static d C(G g2, int i2, int i3) throws E {
        g2.b0(i2 + 8);
        int g3 = g2.g();
        while (g3 - i2 < i3) {
            g2.b0(g3);
            int v = g2.v();
            C2860u.a(v > 0, "childAtomSize must be positive");
            if (g2.v() == 1937011305) {
                g2.c0(4);
                int M = g2.M();
                return new d(new g((M & 1) == 1, (M & 2) == 2, (M & 8) == 8));
            }
            g3 += v;
        }
        return null;
    }

    private static h D(G g2, k kVar, String str, C0906o c0906o, boolean z) throws E {
        g2.b0(12);
        int v = g2.v();
        h hVar = new h(v);
        for (int i2 = 0; i2 < v; i2++) {
            int g3 = g2.g();
            int v2 = g2.v();
            C2860u.a(v2 > 0, "childAtomSize must be positive");
            int v3 = g2.v();
            if (v3 == 1635148593 || v3 == 1635148595 || v3 == 1701733238 || v3 == 1831958048 || v3 == 1836070006 || v3 == 1752589105 || v3 == 1751479857 || v3 == 1932670515 || v3 == 1211250227 || v3 == 1748121139 || v3 == 1987063864 || v3 == 1987063865 || v3 == 1635135537 || v3 == 1685479798 || v3 == 1685479729 || v3 == 1685481573 || v3 == 1685481521 || v3 == 1634760241) {
                L(g2, v3, g3, v2, kVar.a, str, kVar.d, c0906o, hVar, i2);
            } else if (v3 == 1836069985 || v3 == 1701733217 || v3 == 1633889587 || v3 == 1700998451 || v3 == 1633889588 || v3 == 1835823201 || v3 == 1685353315 || v3 == 1685353317 || v3 == 1685353320 || v3 == 1685353324 || v3 == 1685353336 || v3 == 1935764850 || v3 == 1935767394 || v3 == 1819304813 || v3 == 1936684916 || v3 == 1953984371 || v3 == 778924082 || v3 == 778924083 || v3 == 1835557169 || v3 == 1835560241 || v3 == 1634492771 || v3 == 1634492791 || v3 == 1970037111 || v3 == 1332770163 || v3 == 1716281667 || v3 == 1767992678 || v3 == 1768973165 || v3 == 1718641517) {
                i(g2, v3, g3, v2, kVar.a, str, z, c0906o, hVar, i2);
            } else if (v3 == 1414810956 || v3 == 1954034535 || v3 == 2004251764 || v3 == 1937010800 || v3 == 1664495672 || v3 == 1836070003) {
                h hVar2 = hVar;
                E(g2, v3, g3, v2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (v3 == 1835365492) {
                v(g2, v3, g3, kVar.a, hVar);
            } else if (v3 == 1667329389) {
                hVar.b = new C0912v.b().i0(kVar.a).y0("application/x-camera-motion").P();
            }
            g2.b0(g3 + v2);
        }
        return hVar;
    }

    private static void E(G g2, int i2, int i3, int i4, k kVar, String str, h hVar) {
        g2.b0(i3 + 16);
        String str2 = "application/ttml+xml";
        AbstractC2991z abstractC2991z = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i5 = i4 - 16;
                byte[] bArr = new byte[i5];
                g2.q(bArr, 0, i5);
                abstractC2991z = AbstractC2991z.A(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else if (i2 == 1664495672) {
                hVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i2 != 1836070003) {
                    throw new IllegalStateException();
                }
                int g3 = g2.g();
                g2.c0(4);
                if (g2.v() == 1702061171) {
                    c n = n(g2, g3);
                    if (n.b == null || n.b.length != 64) {
                        return;
                    }
                    abstractC2991z = AbstractC2991z.A(d0.x0(d(n.b, kVar.e, kVar.f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.b = new C0912v.b().i0(kVar.a).y0(str2).n0(str).C0(j2).k0(abstractC2991z).P();
        }
    }

    private static k F(G g2) {
        long j2;
        g2.b0(8);
        int q = q(g2.v());
        g2.c0(q == 0 ? 8 : 16);
        int v = g2.v();
        g2.c0(4);
        int g3 = g2.g();
        int i2 = q == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i3 >= i2) {
                g2.c0(i2);
                break;
            }
            if (g2.f()[g3 + i3] != -1) {
                long O = q == 0 ? g2.O() : g2.T();
                if (O != 0) {
                    j2 = O;
                }
            } else {
                i3++;
            }
        }
        g2.c0(10);
        long j3 = j2;
        int U = g2.U();
        g2.c0(4);
        int v2 = g2.v();
        int v3 = g2.v();
        g2.c0(4);
        int v4 = g2.v();
        int v5 = g2.v();
        int i4 = (v2 == 0 && v3 == 65536 && (v4 == -65536 || v4 == 65536) && v5 == 0) ? 90 : (v2 == 0 && v3 == -65536 && (v4 == 65536 || v4 == -65536) && v5 == 0) ? SubsamplingScaleImageView.ORIENTATION_270 : ((v2 == -65536 || v2 == 65536) && v3 == 0 && v4 == 0 && v5 == -65536) ? SubsamplingScaleImageView.ORIENTATION_180 : 0;
        g2.c0(16);
        short I = g2.I();
        g2.c0(2);
        return new k(v, j3, U, i4, I, g2.I());
    }

    public static t G(e.b bVar, e.c cVar, long j2, C0906o c0906o, boolean z, boolean z2) throws E {
        long[] jArr;
        long[] jArr2;
        C0912v c0912v;
        e.b d2;
        Pair<long[], long[]> m;
        e.b bVar2 = (e.b) C0968a.e(bVar.d(1835297121));
        int f2 = f(r(((e.c) C0968a.e(bVar2.e(1751411826))).b));
        if (f2 == -1) {
            return null;
        }
        k F = F(((e.c) C0968a.e(bVar.e(1953196132))).b);
        long j3 = j2 == -9223372036854775807L ? F.b : j2;
        long j4 = w(cVar.b).c;
        long p1 = j3 != -9223372036854775807L ? d0.p1(j3, 1000000L, j4) : -9223372036854775807L;
        e.b bVar3 = (e.b) C0968a.e(((e.b) C0968a.e(bVar2.d(1835626086))).d(1937007212));
        e t = t(((e.c) C0968a.e(bVar2.e(1835296868))).b);
        e.c e2 = bVar3.e(1937011556);
        if (e2 == null) {
            throw E.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h D = D(e2.b, F, t.c, c0906o, z2);
        if (z || (d2 = bVar.d(1701082227)) == null || (m = m(d2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) m.first;
            jArr2 = (long[]) m.second;
            jArr = jArr3;
        }
        if (D.b == null) {
            return null;
        }
        if (F.c != 0) {
            ax.T0.d dVar = new ax.T0.d(F.c);
            C0912v.b b = D.b.b();
            C c2 = D.b.l;
            c0912v = b.r0(c2 != null ? c2.a(dVar) : new C(dVar)).P();
        } else {
            c0912v = D.b;
        }
        return new t(F.a, f2, t.a, j4, p1, t.b, c0912v, D.d, D.a, D.c, jArr, jArr2);
    }

    public static List<w> H(e.b bVar, F f2, long j2, C0906o c0906o, boolean z, boolean z2, InterfaceC2879f<t, t> interfaceC2879f) throws E {
        t apply;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < bVar.d.size(); i2++) {
            e.b bVar2 = bVar.d.get(i2);
            if (bVar2.a == 1953653099 && (apply = interfaceC2879f.apply(G(bVar2, (e.c) C0968a.e(bVar.e(1836476516)), j2, c0906o, z, z2))) != null) {
                arrayList.add(B(apply, (e.b) C0968a.e(((e.b) C0968a.e(((e.b) C0968a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), f2));
            }
        }
        return arrayList;
    }

    public static C I(e.c cVar) {
        G g2 = cVar.b;
        g2.b0(8);
        C c2 = new C(new C.a[0]);
        while (g2.a() >= 8) {
            int g3 = g2.g();
            int v = g2.v();
            int v2 = g2.v();
            if (v2 == 1835365473) {
                g2.b0(g3);
                c2 = c2.b(J(g2, g3 + v));
            } else if (v2 == 1936553057) {
                g2.b0(g3);
                c2 = c2.b(r.b(g2, g3 + v));
            } else if (v2 == -1451722374) {
                c2 = c2.b(M(g2));
            }
            g2.b0(g3 + v);
        }
        return c2;
    }

    private static C J(G g2, int i2) {
        g2.c0(8);
        g(g2);
        while (g2.g() < i2) {
            int g3 = g2.g();
            int v = g2.v();
            if (g2.v() == 1768715124) {
                g2.b0(g3);
                return s(g2, g3 + v);
            }
            g2.b0(g3 + v);
        }
        return null;
    }

    static l K(G g2, int i2, int i3) throws E {
        g2.b0(i2 + 8);
        int g3 = g2.g();
        d dVar = null;
        while (g3 - i2 < i3) {
            g2.b0(g3);
            int v = g2.v();
            C2860u.a(v > 0, "childAtomSize must be positive");
            if (g2.v() == 1702454643) {
                dVar = C(g2, g3, v);
            }
            g3 += v;
        }
        if (dVar == null) {
            return null;
        }
        return new l(dVar);
    }

    private static void L(G g2, int i2, int i3, int i4, int i5, String str, int i6, C0906o c0906o, h hVar, int i7) throws E {
        int i8;
        String str2;
        int i9;
        int i10;
        C0906o c0906o2;
        int i11;
        int i12;
        int i13;
        int i14;
        h.k kVar;
        int i15;
        int i16;
        int i17;
        int i18 = i3;
        int i19 = i4;
        C0906o c0906o3 = c0906o;
        h hVar2 = hVar;
        g2.b0(i18 + 16);
        g2.c0(16);
        int U = g2.U();
        int U2 = g2.U();
        g2.c0(50);
        int g3 = g2.g();
        int i20 = i2;
        if (i20 == 1701733238) {
            Pair<Integer, u> z = z(g2, i18, i19);
            if (z != null) {
                i20 = ((Integer) z.first).intValue();
                c0906o3 = c0906o3 == null ? null : c0906o3.c(((u) z.second).b);
                hVar2.a[i7] = (u) z.second;
            }
            g2.b0(g3);
        }
        String str3 = "video/3gpp";
        String str4 = i20 == 1831958048 ? "video/mpeg" : i20 == 1211250227 ? "video/3gpp" : null;
        float f2 = 1.0f;
        int i21 = 8;
        int i22 = 8;
        ByteBuffer byteBuffer = null;
        List<byte[]> list = null;
        String str5 = null;
        byte[] bArr = null;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        a aVar = null;
        c cVar = null;
        h.k kVar2 = null;
        boolean z2 = false;
        while (g3 - i18 < i19) {
            g2.b0(g3);
            int g4 = g2.g();
            int v = g2.v();
            if (v == 0 && g2.g() - i3 == i19) {
                break;
            }
            C2860u.a(v > 0, "childAtomSize must be positive");
            int v2 = g2.v();
            if (v2 == 1635148611) {
                C2860u.a(str4 == null, null);
                g2.b0(g4 + 8);
                C2844d b = C2844d.b(g2);
                List<byte[]> list2 = b.a;
                hVar2.c = b.b;
                if (!z2) {
                    f2 = b.k;
                }
                String str6 = b.l;
                int i31 = b.j;
                int i32 = b.g;
                int i33 = b.h;
                list = list2;
                int i34 = b.i;
                int i35 = b.e;
                h.k kVar3 = kVar2;
                c0906o2 = c0906o3;
                kVar = kVar3;
                i13 = b.f;
                i8 = g3;
                i11 = i20;
                str2 = str3;
                i9 = i32;
                i10 = i33;
                i30 = i34;
                i21 = i35;
                str5 = str6;
                str4 = "video/avc";
                i24 = i31;
            } else {
                i8 = g3;
                if (v2 == 1752589123) {
                    C2860u.a(str4 == null, null);
                    g2.b0(g4 + 8);
                    ax.q1.G a2 = ax.q1.G.a(g2);
                    List<byte[]> list3 = a2.a;
                    hVar2.c = a2.b;
                    if (!z2) {
                        f2 = a2.n;
                    }
                    int i36 = a2.o;
                    int i37 = a2.c;
                    String str7 = a2.p;
                    int i38 = a2.m;
                    list = list3;
                    if (i38 != -1) {
                        i23 = i38;
                    }
                    int i39 = a2.f;
                    int i40 = a2.g;
                    int i41 = a2.j;
                    int i42 = a2.k;
                    int i43 = a2.l;
                    i27 = i40;
                    i21 = a2.h;
                    i13 = a2.i;
                    c0906o2 = c0906o3;
                    i11 = i20;
                    str2 = str3;
                    i9 = i41;
                    i10 = i42;
                    i30 = i43;
                    kVar = a2.q;
                    i24 = i36;
                    i25 = i37;
                    i26 = i39;
                    str4 = "video/hevc";
                    str5 = str7;
                } else {
                    str2 = str3;
                    if (v2 == 1818785347) {
                        C2860u.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        h.k kVar4 = kVar2;
                        C2860u.a(kVar4 != null && kVar4.b.size() >= 2, "must have at least two layers");
                        g2.b0(g4 + 8);
                        ax.q1.G c2 = ax.q1.G.c(g2, (h.k) C0968a.e(kVar4));
                        C2860u.a(hVar2.c == c2.b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i44 = c2.j;
                        int i45 = i28;
                        if (i44 != -1) {
                            C2860u.a(i45 == i44, "colorSpace must be the same for both views");
                        }
                        int i46 = c2.k;
                        int i47 = i29;
                        if (i46 != -1) {
                            C2860u.a(i47 == i46, "colorRange must be the same for both views");
                        }
                        int i48 = c2.l;
                        if (i48 != -1) {
                            int i49 = i30;
                            i16 = i49;
                            C2860u.a(i49 == i48, "colorTransfer must be the same for both views");
                        } else {
                            i16 = i30;
                        }
                        C2860u.a(i21 == c2.h, "bitdepthLuma must be the same for both views");
                        C2860u.a(i22 == c2.i, "bitdepthChroma must be the same for both views");
                        List<byte[]> list4 = list;
                        if (list4 != null) {
                            list4 = AbstractC2991z.r().j(list4).j(c2.a).k();
                            i17 = i45;
                        } else {
                            i17 = i45;
                            C2860u.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        c0906o2 = c0906o3;
                        i11 = i20;
                        i10 = i47;
                        i13 = i22;
                        i9 = i17;
                        i30 = i16;
                        str5 = c2.p;
                        kVar = kVar4;
                        list = list4;
                    } else {
                        List<byte[]> list5 = list;
                        i9 = i28;
                        i10 = i29;
                        int i50 = i30;
                        h.k kVar5 = kVar2;
                        if (v2 == 1986361461) {
                            l K = K(g2, g4, v);
                            if (K != null && K.a != null) {
                                if (kVar5 == null || kVar5.b.size() < 2) {
                                    i15 = i23;
                                    if (i15 == -1) {
                                        i23 = K.a.a.c ? 5 : 4;
                                        c0906o2 = c0906o3;
                                        list = list5;
                                        i11 = i20;
                                        i13 = i22;
                                        i30 = i50;
                                        kVar = kVar5;
                                    }
                                    i23 = i15;
                                    c0906o2 = c0906o3;
                                    list = list5;
                                    i11 = i20;
                                    i13 = i22;
                                    i30 = i50;
                                    kVar = kVar5;
                                } else {
                                    C2860u.a(K.b(), "both eye views must be marked as available");
                                    C2860u.a(!K.a.a.c, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i15 = i23;
                            i23 = i15;
                            c0906o2 = c0906o3;
                            list = list5;
                            i11 = i20;
                            i13 = i22;
                            i30 = i50;
                            kVar = kVar5;
                        } else {
                            int i51 = i23;
                            if (v2 == 1685480259 || v2 == 1685485123 || v2 == 1685485379) {
                                c0906o2 = c0906o3;
                                i11 = i20;
                                i12 = i51;
                                i13 = i22;
                                float f3 = f2;
                                int i52 = i21;
                                i14 = i50;
                                int i53 = v - 8;
                                byte[] bArr2 = new byte[i53];
                                g2.q(bArr2, 0, i53);
                                if (list5 != null) {
                                    list = AbstractC2991z.r().j(list5).a(bArr2).k();
                                } else {
                                    C2860u.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    list = list5;
                                }
                                g2.b0(g4 + 8);
                                ax.T0.a a3 = ax.T0.a.a(g2);
                                if (a3 != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = a3.c;
                                }
                                i9 = i9;
                                i21 = i52;
                                f2 = f3;
                            } else if (v2 == 1987076931) {
                                C2860u.a(str4 == null, null);
                                String str8 = i20 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                g2.b0(g4 + 12);
                                byte M = (byte) g2.M();
                                byte M2 = (byte) g2.M();
                                int M3 = g2.M();
                                i21 = M3 >> 4;
                                i11 = i20;
                                byte b2 = (byte) ((M3 >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    list5 = C0976i.k(M, M2, (byte) i21, b2);
                                }
                                boolean z3 = (M3 & 1) != 0;
                                int M4 = g2.M();
                                int M5 = g2.M();
                                int k2 = C0901j.k(M4);
                                int i54 = z3 ? 1 : 2;
                                i30 = C0901j.l(M5);
                                str4 = str8;
                                c0906o2 = c0906o3;
                                i10 = i54;
                                kVar = kVar5;
                                i9 = k2;
                                list = list5;
                                i23 = i51;
                                i13 = i21;
                            } else {
                                i11 = i20;
                                if (v2 == 1635135811) {
                                    int i55 = v - 8;
                                    byte[] bArr3 = new byte[i55];
                                    g2.q(bArr3, 0, i55);
                                    list = AbstractC2991z.A(bArr3);
                                    g2.b0(g4 + 8);
                                    C0901j j2 = j(g2);
                                    int i56 = j2.e;
                                    int i57 = j2.f;
                                    int i58 = j2.a;
                                    int i59 = j2.b;
                                    i30 = j2.c;
                                    i21 = i56;
                                    c0906o2 = c0906o3;
                                    i13 = i57;
                                    i9 = i58;
                                    i10 = i59;
                                    str4 = "video/av01";
                                    kVar = kVar5;
                                } else if (v2 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(g2.I());
                                    byteBuffer2.putShort(g2.I());
                                    byteBuffer = byteBuffer2;
                                    c0906o2 = c0906o3;
                                    list = list5;
                                    i13 = i22;
                                    kVar = kVar5;
                                    i30 = i50;
                                } else if (v2 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short I = g2.I();
                                    short I2 = g2.I();
                                    short I3 = g2.I();
                                    short I4 = g2.I();
                                    i13 = i22;
                                    short I5 = g2.I();
                                    int i60 = i21;
                                    short I6 = g2.I();
                                    c0906o2 = c0906o3;
                                    short I7 = g2.I();
                                    short I8 = g2.I();
                                    long O = g2.O();
                                    long O2 = g2.O();
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(I5);
                                    byteBuffer3.putShort(I6);
                                    byteBuffer3.putShort(I);
                                    byteBuffer3.putShort(I2);
                                    byteBuffer3.putShort(I3);
                                    byteBuffer3.putShort(I4);
                                    byteBuffer3.putShort(I7);
                                    byteBuffer3.putShort(I8);
                                    byteBuffer3.putShort((short) (O / 10000));
                                    byteBuffer3.putShort((short) (O2 / 10000));
                                    byteBuffer = byteBuffer3;
                                    list = list5;
                                    kVar = kVar5;
                                    i21 = i60;
                                    i30 = i50;
                                    i23 = i51;
                                    f2 = f2;
                                } else {
                                    c0906o2 = c0906o3;
                                    i12 = i51;
                                    i13 = i22;
                                    float f4 = f2;
                                    int i61 = i21;
                                    if (v2 == 1681012275) {
                                        C2860u.a(str4 == null, null);
                                        list = list5;
                                        kVar = kVar5;
                                        i21 = i61;
                                        str4 = str2;
                                    } else {
                                        if (v2 == 1702061171) {
                                            C2860u.a(str4 == null, null);
                                            cVar = n(g2, g4);
                                            String str9 = cVar.a;
                                            byte[] bArr4 = cVar.b;
                                            list = bArr4 != null ? AbstractC2991z.A(bArr4) : list5;
                                            str4 = str9;
                                        } else {
                                            if (v2 == 1651798644) {
                                                aVar = k(g2, g4);
                                            } else if (v2 == 1885434736) {
                                                f2 = x(g2, g4);
                                                list = list5;
                                                kVar = kVar5;
                                                i21 = i61;
                                                i30 = i50;
                                                i23 = i12;
                                                z2 = true;
                                            } else if (v2 == 1937126244) {
                                                bArr = y(g2, g4, v);
                                            } else if (v2 == 1936995172) {
                                                int M6 = g2.M();
                                                g2.c0(3);
                                                if (M6 == 0) {
                                                    int M7 = g2.M();
                                                    if (M7 == 0) {
                                                        i12 = 0;
                                                    } else if (M7 == 1) {
                                                        i12 = 1;
                                                    } else if (M7 == 2) {
                                                        i12 = 2;
                                                    } else if (M7 == 3) {
                                                        i12 = 3;
                                                    }
                                                }
                                            } else if (v2 == 1634760259) {
                                                int i62 = v - 12;
                                                byte[] bArr5 = new byte[i62];
                                                g2.b0(g4 + 12);
                                                g2.q(bArr5, 0, i62);
                                                list = AbstractC2991z.A(bArr5);
                                                C0901j h2 = h(new G(bArr5));
                                                int i63 = h2.e;
                                                int i64 = h2.f;
                                                int i65 = h2.a;
                                                int i66 = h2.b;
                                                i30 = h2.c;
                                                i21 = i63;
                                                i13 = i64;
                                                i9 = i65;
                                                i10 = i66;
                                                str4 = "video/apv";
                                                kVar = kVar5;
                                                i23 = i12;
                                                f2 = f4;
                                            } else {
                                                if (v2 == 1668246642) {
                                                    i14 = i50;
                                                    if (i9 == -1 && i14 == -1) {
                                                        int v3 = g2.v();
                                                        if (v3 == 1852009592 || v3 == 1852009571) {
                                                            int U3 = g2.U();
                                                            int U4 = g2.U();
                                                            g2.c0(2);
                                                            boolean z4 = v == 19 && (g2.M() & 128) != 0;
                                                            i9 = C0901j.k(U3);
                                                            list = list5;
                                                            i10 = z4 ? 1 : 2;
                                                            kVar = kVar5;
                                                            i21 = i61;
                                                            i23 = i12;
                                                            f2 = f4;
                                                            i30 = C0901j.l(U4);
                                                        } else {
                                                            C0987u.h("BoxParsers", "Unsupported color type: " + ax.T0.e.a(v3));
                                                        }
                                                    }
                                                } else {
                                                    i14 = i50;
                                                }
                                                list = list5;
                                                i9 = i9;
                                                i21 = i61;
                                                f2 = f4;
                                            }
                                            list = list5;
                                        }
                                        kVar = kVar5;
                                        i21 = i61;
                                    }
                                    i30 = i50;
                                    i23 = i12;
                                    f2 = f4;
                                }
                                i23 = i51;
                            }
                            i30 = i14;
                            kVar = kVar5;
                            i23 = i12;
                        }
                    }
                }
            }
            g3 = i8 + v;
            C0906o c0906o4 = c0906o2;
            kVar2 = kVar;
            c0906o3 = c0906o4;
            i18 = i3;
            i19 = i4;
            hVar2 = hVar;
            i22 = i13;
            i20 = i11;
            str3 = str2;
            i28 = i9;
            i29 = i10;
        }
        C0906o c0906o5 = c0906o3;
        float f5 = f2;
        List<byte[]> list6 = list;
        int i67 = i23;
        int i68 = i28;
        int i69 = i29;
        int i70 = i30;
        int i71 = i22;
        int i72 = i21;
        if (str4 == null) {
            return;
        }
        C0912v.b V = new C0912v.b().i0(i5).y0(str4).U(str5).F0(U).h0(U2).b0(i26).a0(i27).u0(f5).x0(i6).v0(bArr).B0(i67).k0(list6).p0(i24).q0(i25).c0(c0906o5).n0(str).V(new C0901j.b().d(i68).c(i69).e(i70).f(byteBuffer != null ? byteBuffer.array() : null).g(i72).b(i71).a());
        if (aVar != null) {
            V.S(C3218f.n(aVar.a)).t0(C3218f.n(aVar.b));
        } else if (cVar != null) {
            V.S(C3218f.n(cVar.c)).t0(C3218f.n(cVar.d));
        }
        hVar.b = V.P();
    }

    private static C M(G g2) {
        short I = g2.I();
        g2.c0(2);
        String J = g2.J(I);
        int max = Math.max(J.lastIndexOf(43), J.lastIndexOf(45));
        try {
            return new C(new ax.T0.f(Float.parseFloat(J.substring(0, max)), Float.parseFloat(J.substring(max, J.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int N(int i2) {
        int i3 = (i2 >> 16) & 255;
        int i4 = ((i2 >> 8) & 255) - 128;
        int i5 = (i2 & 255) - 128;
        return d0.p(i3 + ((i5 * 17790) / 10000), 0, 255) | (d0.p(((i4 * 14075) / 10000) + i3, 0, 255) << 16) | (d0.p((i3 - ((i5 * 3455) / 10000)) - ((i4 * 7169) / 10000), 0, 255) << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[d0.p(4, 0, length)] && jArr[d0.p(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    private static int c(G g2, int i2, int i3, int i4) throws E {
        int g3 = g2.g();
        C2860u.a(g3 >= i3, null);
        while (g3 - i3 < i4) {
            g2.b0(g3);
            int v = g2.v();
            C2860u.a(v > 0, "childAtomSize must be positive");
            if (g2.v() == i2) {
                return g3;
            }
            g3 += v;
        }
        return -1;
    }

    private static String d(byte[] bArr, int i2, int i3) {
        C0968a.g(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i4 = 0; i4 < bArr.length - 3; i4 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(C3218f.i(bArr[i4], bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3])))));
        }
        return "size: " + i2 + "x" + i3 + "\npalette: " + C2880g.g(", ").d(arrayList) + "\n";
    }

    private static String e(int i2) {
        char[] cArr = {(char) (((i2 >> 10) & 31) + 96), (char) (((i2 >> 5) & 31) + 96), (char) ((i2 & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c2 = cArr[i3];
            if (c2 < 'a' || c2 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int f(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728 || i2 == 1937072752) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static void g(G g2) {
        int g3 = g2.g();
        g2.c0(4);
        if (g2.v() != 1751411826) {
            g3 += 4;
        }
        g2.b0(g3);
    }

    private static C0901j h(G g2) {
        C0901j.b bVar = new C0901j.b();
        ax.S0.F f2 = new ax.S0.F(g2.f());
        f2.p(g2.g() * 8);
        f2.s(1);
        int h2 = f2.h(8);
        for (int i2 = 0; i2 < h2; i2++) {
            f2.s(1);
            int h3 = f2.h(8);
            for (int i3 = 0; i3 < h3; i3++) {
                f2.r(6);
                boolean g3 = f2.g();
                f2.q();
                f2.s(11);
                f2.r(4);
                int h4 = f2.h(4) + 8;
                bVar.g(h4);
                bVar.b(h4);
                f2.s(1);
                if (g3) {
                    int h5 = f2.h(8);
                    int h6 = f2.h(8);
                    f2.s(1);
                    bVar.d(C0901j.k(h5)).c(f2.g() ? 1 : 2).e(C0901j.l(h6));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(ax.S0.G r27, int r28, int r29, int r30, int r31, java.lang.String r32, boolean r33, ax.P0.C0906o r34, ax.K1.b.h r35, int r36) throws ax.P0.E {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K1.b.i(ax.S0.G, int, int, int, int, java.lang.String, boolean, ax.P0.o, ax.K1.b$h, int):void");
    }

    private static C0901j j(G g2) {
        C0901j.b bVar = new C0901j.b();
        ax.S0.F f2 = new ax.S0.F(g2.f());
        f2.p(g2.g() * 8);
        f2.s(1);
        int h2 = f2.h(3);
        f2.r(6);
        boolean g3 = f2.g();
        boolean g4 = f2.g();
        if (h2 == 2 && g3) {
            bVar.g(g4 ? 12 : 10);
            bVar.b(g4 ? 12 : 10);
        } else if (h2 <= 2) {
            bVar.g(g3 ? 10 : 8);
            bVar.b(g3 ? 10 : 8);
        }
        f2.r(13);
        f2.q();
        int h3 = f2.h(4);
        if (h3 != 1) {
            C0987u.f("BoxParsers", "Unsupported obu_type: " + h3);
            return bVar.a();
        }
        if (f2.g()) {
            C0987u.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean g5 = f2.g();
        f2.q();
        if (g5 && f2.h(8) > 127) {
            C0987u.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int h4 = f2.h(3);
        f2.q();
        if (f2.g()) {
            C0987u.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (f2.g()) {
            C0987u.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (f2.g()) {
            C0987u.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int h5 = f2.h(5);
        boolean z = false;
        for (int i2 = 0; i2 <= h5; i2++) {
            f2.r(12);
            if (f2.h(5) > 7) {
                f2.q();
            }
        }
        int h6 = f2.h(4);
        int h7 = f2.h(4);
        f2.r(h6 + 1);
        f2.r(h7 + 1);
        if (f2.g()) {
            f2.r(7);
        }
        f2.r(7);
        boolean g6 = f2.g();
        if (g6) {
            f2.r(2);
        }
        if ((f2.g() ? 2 : f2.h(1)) > 0 && !f2.g()) {
            f2.r(1);
        }
        if (g6) {
            f2.r(3);
        }
        f2.r(3);
        boolean g7 = f2.g();
        if (h4 == 2 && g7) {
            f2.q();
        }
        if (h4 != 1 && f2.g()) {
            z = true;
        }
        if (f2.g()) {
            int h8 = f2.h(8);
            int h9 = f2.h(8);
            bVar.d(C0901j.k(h8)).c(((z || h8 != 1 || h9 != 13 || f2.h(8) != 0) ? f2.h(1) : 1) != 1 ? 2 : 1).e(C0901j.l(h9));
        }
        return bVar.a();
    }

    private static a k(G g2, int i2) {
        g2.b0(i2 + 8);
        g2.c0(4);
        return new a(g2.O(), g2.O());
    }

    static Pair<Integer, u> l(G g2, int i2, int i3) throws E {
        int i4 = i2 + 8;
        String str = null;
        Integer num = null;
        int i5 = -1;
        int i6 = 0;
        while (i4 - i2 < i3) {
            g2.b0(i4);
            int v = g2.v();
            int v2 = g2.v();
            if (v2 == 1718775137) {
                num = Integer.valueOf(g2.v());
            } else if (v2 == 1935894637) {
                g2.c0(4);
                str = g2.J(4);
            } else if (v2 == 1935894633) {
                i5 = i4;
                i6 = v;
            }
            i4 += v;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C2860u.a(num != null, "frma atom is mandatory");
        C2860u.a(i5 != -1, "schi atom is mandatory");
        u A = A(g2, i5, i6, str);
        C2860u.a(A != null, "tenc atom is mandatory");
        return Pair.create(num, (u) d0.i(A));
    }

    private static Pair<long[], long[]> m(e.b bVar) {
        e.c e2 = bVar.e(1701606260);
        if (e2 == null) {
            return null;
        }
        G g2 = e2.b;
        g2.b0(8);
        int q = q(g2.v());
        int Q = g2.Q();
        long[] jArr = new long[Q];
        long[] jArr2 = new long[Q];
        for (int i2 = 0; i2 < Q; i2++) {
            jArr[i2] = q == 1 ? g2.T() : g2.O();
            jArr2[i2] = q == 1 ? g2.F() : g2.v();
            if (g2.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            g2.c0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c n(G g2, int i2) {
        g2.b0(i2 + 12);
        g2.c0(1);
        o(g2);
        g2.c0(2);
        int M = g2.M();
        if ((M & 128) != 0) {
            g2.c0(2);
        }
        if ((M & 64) != 0) {
            g2.c0(g2.M());
        }
        if ((M & 32) != 0) {
            g2.c0(2);
        }
        g2.c0(1);
        o(g2);
        String h2 = D.h(g2.M());
        if ("audio/mpeg".equals(h2) || "audio/vnd.dts".equals(h2) || "audio/vnd.dts.hd".equals(h2)) {
            return new c(h2, null, -1L, -1L);
        }
        g2.c0(4);
        long O = g2.O();
        long O2 = g2.O();
        g2.c0(1);
        int o = o(g2);
        long j2 = O2;
        byte[] bArr = new byte[o];
        g2.q(bArr, 0, o);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new c(h2, bArr, j2, O > 0 ? O : -1L);
    }

    private static int o(G g2) {
        int M = g2.M();
        int i2 = M & 127;
        while ((M & 128) == 128) {
            M = g2.M();
            i2 = (i2 << 7) | (M & 127);
        }
        return i2;
    }

    public static int p(int i2) {
        return i2 & 16777215;
    }

    public static int q(int i2) {
        return (i2 >> 24) & 255;
    }

    private static int r(G g2) {
        g2.b0(16);
        return g2.v();
    }

    private static C s(G g2, int i2) {
        g2.c0(8);
        ArrayList arrayList = new ArrayList();
        while (g2.g() < i2) {
            C.a d2 = ax.K1.j.d(g2);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C(arrayList);
    }

    private static e t(G g2) {
        long j2;
        g2.b0(8);
        int q = q(g2.v());
        g2.c0(q == 0 ? 8 : 16);
        long O = g2.O();
        int g3 = g2.g();
        int i2 = q == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i3 >= i2) {
                g2.c0(i2);
                break;
            }
            if (g2.f()[g3 + i3] != -1) {
                long O2 = q == 0 ? g2.O() : g2.T();
                if (O2 != 0) {
                    long p1 = d0.p1(O2, 1000000L, O);
                    O = O;
                    j2 = p1;
                }
            } else {
                i3++;
            }
        }
        return new e(O, j2, e(g2.U()));
    }

    public static C u(e.b bVar) {
        e.c e2 = bVar.e(1751411826);
        e.c e3 = bVar.e(1801812339);
        e.c e4 = bVar.e(1768715124);
        if (e2 == null || e3 == null || e4 == null || r(e2.b) != 1835299937) {
            return null;
        }
        G g2 = e3.b;
        g2.b0(12);
        int v = g2.v();
        String[] strArr = new String[v];
        for (int i2 = 0; i2 < v; i2++) {
            int v2 = g2.v();
            g2.c0(4);
            strArr[i2] = g2.J(v2 - 8);
        }
        G g3 = e4.b;
        g3.b0(8);
        ArrayList arrayList = new ArrayList();
        while (g3.a() > 8) {
            int g4 = g3.g();
            int v3 = g3.v();
            int v4 = g3.v() - 1;
            if (v4 < 0 || v4 >= v) {
                C0987u.h("BoxParsers", "Skipped metadata with unknown key index: " + v4);
            } else {
                ax.T0.c i3 = ax.K1.j.i(g3, g4 + v3, strArr[v4]);
                if (i3 != null) {
                    arrayList.add(i3);
                }
            }
            g3.b0(g4 + v3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C(arrayList);
    }

    private static void v(G g2, int i2, int i3, int i4, h hVar) {
        g2.b0(i3 + 16);
        if (i2 == 1835365492) {
            g2.G();
            String G = g2.G();
            if (G != null) {
                hVar.b = new C0912v.b().i0(i4).y0(G).P();
            }
        }
    }

    public static ax.T0.g w(G g2) {
        long F;
        long F2;
        g2.b0(8);
        if (q(g2.v()) == 0) {
            F = g2.O();
            F2 = g2.O();
        } else {
            F = g2.F();
            F2 = g2.F();
        }
        return new ax.T0.g(F, F2, g2.O());
    }

    private static float x(G g2, int i2) {
        g2.b0(i2 + 8);
        return g2.Q() / g2.Q();
    }

    private static byte[] y(G g2, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            g2.b0(i4);
            int v = g2.v();
            if (g2.v() == 1886547818) {
                return Arrays.copyOfRange(g2.f(), i4, v + i4);
            }
            i4 += v;
        }
        return null;
    }

    private static Pair<Integer, u> z(G g2, int i2, int i3) throws E {
        Pair<Integer, u> l2;
        int g3 = g2.g();
        while (g3 - i2 < i3) {
            g2.b0(g3);
            int v = g2.v();
            C2860u.a(v > 0, "childAtomSize must be positive");
            if (g2.v() == 1936289382 && (l2 = l(g2, g3, v)) != null) {
                return l2;
            }
            g3 += v;
        }
        return null;
    }
}
