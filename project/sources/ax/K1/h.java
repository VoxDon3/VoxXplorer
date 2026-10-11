package ax.K1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import ax.N1.t;
import ax.P0.C;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.M;
import ax.S0.d0;
import ax.T0.e;
import ax.T0.k;
import ax.q1.C2847g;
import ax.q1.C2848h;
import ax.q1.C2849i;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.F;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import ax.q1.S;
import ax.q1.U;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class h implements ax.q1.r {

    @Deprecated
    public static final InterfaceC2863x P = new InterfaceC2863x() { // from class: ax.K1.f
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final ax.q1.r[] c() {
            return h.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private static final byte[] Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final C0912v R = new C0912v.b().y0("application/x-emsg").P();
    private long A;
    private long B;
    private long C;
    private b D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private InterfaceC2859t J;
    private U[] K;
    private U[] L;
    private boolean M;
    private boolean N;
    private long O;
    private final t.a a;
    private final int b;
    private final t c;
    private final List<C0912v> d;
    private final SparseArray<b> e;
    private final G f;
    private final G g;
    private final G h;
    private final byte[] i;
    private final G j;
    private final M k;
    private final ax.B1.c l;
    private final G m;
    private final ArrayDeque<e.b> n;
    private final ArrayDeque<a> o;
    private final ax.T0.k p;
    private final U q;
    private final C2849i r;
    private AbstractC2991z<S> s;
    private int t;
    private int u;
    private long v;
    private int w;
    private G x;
    private long y;
    private int z;

    private static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(long j, boolean z, int i) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    private static final class b {
        public final U a;
        public w d;
        public c e;
        public int f;
        public int g;
        public int h;
        public int i;
        private final C0912v j;
        private boolean m;
        public final v b = new v();
        public final G c = new G();
        private final G k = new G(1);
        private final G l = new G();

        public b(U u, w wVar, c cVar, C0912v c0912v) {
            this.a = u;
            this.d = wVar;
            this.e = cVar;
            this.j = c0912v;
            j(wVar, cVar);
        }

        public int c() {
            int i = !this.m ? this.d.g[this.f] : this.b.k[this.f] ? 1 : 0;
            return g() != null ? i | 1073741824 : i;
        }

        public long d() {
            return !this.m ? this.d.c[this.f] : this.b.g[this.h];
        }

        public long e() {
            return !this.m ? this.d.f[this.f] : this.b.c(this.f);
        }

        public int f() {
            return !this.m ? this.d.d[this.f] : this.b.i[this.f];
        }

        public u g() {
            if (!this.m) {
                return null;
            }
            int i = ((c) d0.i(this.b.a)).a;
            u uVar = this.b.n;
            if (uVar == null) {
                uVar = this.d.a.b(i);
            }
            if (uVar == null || !uVar.a) {
                return null;
            }
            return uVar;
        }

        public boolean h() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int i, int i2) {
            G g;
            u g2 = g();
            if (g2 == null) {
                return 0;
            }
            int i3 = g2.d;
            if (i3 != 0) {
                g = this.b.o;
            } else {
                byte[] bArr = (byte[]) d0.i(g2.e);
                this.l.Z(bArr, bArr.length);
                G g3 = this.l;
                i3 = bArr.length;
                g = g3;
            }
            boolean g4 = this.b.g(this.f);
            boolean z = g4 || i2 != 0;
            this.k.f()[0] = (byte) ((z ? 128 : 0) | i3);
            this.k.b0(0);
            this.a.b(this.k, 1, 1);
            this.a.b(g, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g4) {
                this.c.X(8);
                byte[] f = this.c.f();
                f[0] = 0;
                f[1] = 1;
                f[2] = (byte) ((i2 >> 8) & 255);
                f[3] = (byte) (i2 & 255);
                f[4] = (byte) ((i >> 24) & 255);
                f[5] = (byte) ((i >> 16) & 255);
                f[6] = (byte) ((i >> 8) & 255);
                f[7] = (byte) (i & 255);
                this.a.b(this.c, 8, 1);
                return i3 + 9;
            }
            G g5 = this.b.o;
            int U = g5.U();
            g5.c0(-2);
            int i4 = (U * 6) + 2;
            if (i2 != 0) {
                this.c.X(i4);
                byte[] f2 = this.c.f();
                g5.q(f2, 0, i4);
                int i5 = (((f2[2] & 255) << 8) | (f2[3] & 255)) + i2;
                f2[2] = (byte) ((i5 >> 8) & 255);
                f2[3] = (byte) (i5 & 255);
                g5 = this.c;
            }
            this.a.b(g5, i4, 1);
            return i3 + 1 + i4;
        }

        public void j(w wVar, c cVar) {
            this.d = wVar;
            this.e = cVar;
            this.a.e(this.j);
            k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }

        public void l(long j) {
            int i = this.f;
            while (true) {
                v vVar = this.b;
                if (i >= vVar.f || vVar.c(i) > j) {
                    return;
                }
                if (this.b.k[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void m() {
            u g = g();
            if (g == null) {
                return;
            }
            G g2 = this.b.o;
            int i = g.d;
            if (i != 0) {
                g2.c0(i);
            }
            if (this.b.g(this.f)) {
                g2.c0(g2.U() * 6);
            }
        }

        public void n(C0906o c0906o) {
            u b = this.d.a.b(((c) d0.i(this.b.a)).a);
            this.a.e(this.j.b().c0(c0906o.c(b != null ? b.b : null)).P());
        }
    }

    public h(t.a aVar, int i) {
        this(aVar, i, null, null, AbstractC2991z.z(), null);
    }

    private void A(long j) {
        while (!this.o.isEmpty()) {
            a removeFirst = this.o.removeFirst();
            this.z -= removeFirst.c;
            long j2 = removeFirst.a;
            if (removeFirst.b) {
                j2 += j;
            }
            M m = this.k;
            if (m != null) {
                j2 = m.a(j2);
            }
            long j3 = j2;
            for (U u : this.K) {
                u.f(j3, 1, removeFirst.c, this.z, null);
            }
        }
    }

    private static long B(G g) {
        g.b0(8);
        return ax.K1.b.q(g.v()) == 0 ? g.O() : g.T();
    }

    private static void C(e.b bVar, SparseArray<b> sparseArray, boolean z, int i, byte[] bArr) throws E {
        int size = bVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            e.b bVar2 = bVar.d.get(i2);
            if (bVar2.a == 1953653094) {
                L(bVar2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void D(G g, v vVar) throws E {
        g.b0(8);
        int v = g.v();
        if ((ax.K1.b.p(v) & 1) == 1) {
            g.c0(8);
        }
        int Q2 = g.Q();
        if (Q2 == 1) {
            vVar.d += ax.K1.b.q(v) == 0 ? g.O() : g.T();
        } else {
            throw E.a("Unexpected saio entry count: " + Q2, null);
        }
    }

    private static void E(u uVar, G g, v vVar) throws E {
        int i;
        int i2 = uVar.d;
        g.b0(8);
        if ((ax.K1.b.p(g.v()) & 1) == 1) {
            g.c0(8);
        }
        int M = g.M();
        int Q2 = g.Q();
        if (Q2 > vVar.f) {
            throw E.a("Saiz sample count " + Q2 + " is greater than fragment sample count" + vVar.f, null);
        }
        if (M == 0) {
            boolean[] zArr = vVar.m;
            i = 0;
            for (int i3 = 0; i3 < Q2; i3++) {
                int M2 = g.M();
                i += M2;
                zArr[i3] = M2 > i2;
            }
        } else {
            i = M * Q2;
            Arrays.fill(vVar.m, 0, Q2, M > i2);
        }
        Arrays.fill(vVar.m, Q2, vVar.f, false);
        if (i > 0) {
            vVar.d(i);
        }
    }

    private static void F(e.b bVar, String str, v vVar) throws E {
        byte[] bArr = null;
        G g = null;
        G g2 = null;
        for (int i = 0; i < bVar.c.size(); i++) {
            e.c cVar = bVar.c.get(i);
            G g3 = cVar.b;
            int i2 = cVar.a;
            if (i2 == 1935828848) {
                g3.b0(12);
                if (g3.v() == 1936025959) {
                    g = g3;
                }
            } else if (i2 == 1936158820) {
                g3.b0(12);
                if (g3.v() == 1936025959) {
                    g2 = g3;
                }
            }
        }
        if (g == null || g2 == null) {
            return;
        }
        g.b0(8);
        int q = ax.K1.b.q(g.v());
        g.c0(4);
        if (q == 1) {
            g.c0(4);
        }
        if (g.v() != 1) {
            throw E.d("Entry count in sbgp != 1 (unsupported).");
        }
        g2.b0(8);
        int q2 = ax.K1.b.q(g2.v());
        g2.c0(4);
        if (q2 == 1) {
            if (g2.O() == 0) {
                throw E.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (q2 >= 2) {
            g2.c0(4);
        }
        if (g2.O() != 1) {
            throw E.d("Entry count in sgpd != 1 (unsupported).");
        }
        g2.c0(1);
        int M = g2.M();
        int i3 = (M & 240) >> 4;
        int i4 = M & 15;
        boolean z = g2.M() == 1;
        if (z) {
            int M2 = g2.M();
            byte[] bArr2 = new byte[16];
            g2.q(bArr2, 0, 16);
            if (M2 == 0) {
                int M3 = g2.M();
                bArr = new byte[M3];
                g2.q(bArr, 0, M3);
            }
            vVar.l = true;
            vVar.n = new u(z, str, M2, bArr2, i3, i4, bArr);
        }
    }

    private static void G(G g, int i, v vVar) throws E {
        g.b0(i + 8);
        int p = ax.K1.b.p(g.v());
        if ((p & 1) != 0) {
            throw E.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (p & 2) != 0;
        int Q2 = g.Q();
        if (Q2 == 0) {
            Arrays.fill(vVar.m, 0, vVar.f, false);
            return;
        }
        if (Q2 == vVar.f) {
            Arrays.fill(vVar.m, 0, Q2, z);
            vVar.d(g.a());
            vVar.a(g);
        } else {
            throw E.a("Senc sample count " + Q2 + " is different from fragment sample count" + vVar.f, null);
        }
    }

    private static void H(G g, v vVar) throws E {
        G(g, 0, vVar);
    }

    private static Pair<Long, C2848h> I(G g, long j) throws E {
        long T;
        long T2;
        g.b0(8);
        int q = ax.K1.b.q(g.v());
        g.c0(4);
        long O = g.O();
        if (q == 0) {
            T = g.O();
            T2 = g.O();
        } else {
            T = g.T();
            T2 = g.T();
        }
        long j2 = j + T2;
        long p1 = d0.p1(T, 1000000L, O);
        g.c0(2);
        int U = g.U();
        int[] iArr = new int[U];
        long[] jArr = new long[U];
        long[] jArr2 = new long[U];
        long[] jArr3 = new long[U];
        long j3 = j2;
        long j4 = p1;
        int i = 0;
        while (i < U) {
            int v = g.v();
            if ((Integer.MIN_VALUE & v) != 0) {
                throw E.a("Unhandled indirect reference", null);
            }
            long O2 = g.O();
            iArr[i] = v & SubsamplingScaleImageView.TILE_SIZE_AUTO;
            jArr[i] = j3;
            jArr3[i] = j4;
            T += O2;
            long[] jArr4 = jArr3;
            j4 = d0.p1(T, 1000000L, O);
            jArr2[i] = j4 - jArr4[i];
            g.c0(4);
            j3 += iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(p1), new C2848h(iArr, jArr, jArr2, jArr3));
    }

    private static long J(G g) {
        g.b0(8);
        return ax.K1.b.q(g.v()) == 1 ? g.T() : g.O();
    }

    private static b K(G g, SparseArray<b> sparseArray, boolean z) {
        g.b0(8);
        int p = ax.K1.b.p(g.v());
        b valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(g.v());
        if (valueAt == null) {
            return null;
        }
        if ((p & 1) != 0) {
            long T = g.T();
            v vVar = valueAt.b;
            vVar.c = T;
            vVar.d = T;
        }
        c cVar = valueAt.e;
        valueAt.b.a = new c((p & 2) != 0 ? g.v() - 1 : cVar.a, (p & 8) != 0 ? g.v() : cVar.b, (p & 16) != 0 ? g.v() : cVar.c, (p & 32) != 0 ? g.v() : cVar.d);
        return valueAt;
    }

    private static void L(e.b bVar, SparseArray<b> sparseArray, boolean z, int i, byte[] bArr) throws E {
        b K = K(((e.c) C0968a.e(bVar.e(1952868452))).b, sparseArray, z);
        if (K == null) {
            return;
        }
        v vVar = K.b;
        long j = vVar.q;
        boolean z2 = vVar.r;
        K.k();
        K.m = true;
        e.c e = bVar.e(1952867444);
        if (e == null || (i & 2) != 0) {
            vVar.q = j;
            vVar.r = z2;
        } else {
            vVar.q = J(e.b);
            vVar.r = true;
        }
        O(bVar, K, i);
        u b2 = K.d.a.b(((c) C0968a.e(vVar.a)).a);
        e.c e2 = bVar.e(1935763834);
        if (e2 != null) {
            E((u) C0968a.e(b2), e2.b, vVar);
        }
        e.c e3 = bVar.e(1935763823);
        if (e3 != null) {
            D(e3.b, vVar);
        }
        e.c e4 = bVar.e(1936027235);
        if (e4 != null) {
            H(e4.b, vVar);
        }
        F(bVar, b2 != null ? b2.b : null, vVar);
        int size = bVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            e.c cVar = bVar.c.get(i2);
            if (cVar.a == 1970628964) {
                P(cVar.b, vVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> M(G g) {
        g.b0(12);
        return Pair.create(Integer.valueOf(g.v()), new c(g.v() - 1, g.v(), g.v(), g.v()));
    }

    private static int N(b bVar, int i, int i2, G g, int i3) throws E {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        g.b0(8);
        int p = ax.K1.b.p(g.v());
        t tVar = bVar.d.a;
        v vVar = bVar.b;
        c cVar = (c) d0.i(vVar.a);
        vVar.h[i] = g.Q();
        long[] jArr = vVar.g;
        long j = vVar.c;
        jArr[i] = j;
        if ((p & 1) != 0) {
            jArr[i] = j + g.v();
        }
        boolean z2 = (p & 4) != 0;
        int i11 = cVar.d;
        if (z2) {
            i11 = g.v();
        }
        boolean z3 = (p & 256) != 0;
        boolean z4 = (p & 512) != 0;
        boolean z5 = (p & 1024) != 0;
        boolean z6 = (p & 2048) != 0;
        long j2 = s(tVar) ? ((long[]) d0.i(tVar.j))[0] : 0L;
        int[] iArr = vVar.i;
        long[] jArr2 = vVar.j;
        boolean[] zArr = vVar.k;
        boolean z7 = z6;
        boolean z8 = tVar.b == 2 && (i2 & 1) != 0;
        int i12 = i3 + vVar.h[i];
        boolean z9 = z2;
        long j3 = tVar.c;
        long j4 = vVar.q;
        int i13 = i3;
        while (i13 < i12) {
            if (z3) {
                i4 = g.v();
                z = z8;
            } else {
                z = z8;
                i4 = cVar.b;
            }
            int j5 = j(i4);
            if (z4) {
                i6 = g.v();
                i5 = i12;
            } else {
                i5 = i12;
                i6 = cVar.c;
            }
            int j6 = j(i6);
            if (z5) {
                i7 = j6;
                i8 = g.v();
            } else if (i13 == 0 && z9) {
                i7 = j6;
                i8 = i11;
            } else {
                i7 = j6;
                i8 = cVar.d;
            }
            if (z7) {
                i9 = i8;
                i10 = g.v();
            } else {
                i9 = i8;
                i10 = 0;
            }
            int i14 = i13;
            long p1 = d0.p1((i10 + j4) - j2, 1000000L, j3);
            jArr2[i14] = p1;
            if (!vVar.r) {
                jArr2[i14] = p1 + bVar.d.h;
            }
            iArr[i14] = i7;
            zArr[i14] = ((i9 >> 16) & 1) == 0 && (!z || i14 == 0);
            j4 += j5;
            i13 = i14 + 1;
            i12 = i5;
            z8 = z;
        }
        int i15 = i12;
        vVar.q = j4;
        return i15;
    }

    private static void O(e.b bVar, b bVar2, int i) throws E {
        List<e.c> list = bVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            e.c cVar = list.get(i4);
            if (cVar.a == 1953658222) {
                G g = cVar.b;
                g.b0(12);
                int Q2 = g.Q();
                if (Q2 > 0) {
                    i3 += Q2;
                    i2++;
                }
            }
        }
        bVar2.h = 0;
        bVar2.g = 0;
        bVar2.f = 0;
        bVar2.b.e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            e.c cVar2 = list.get(i7);
            if (cVar2.a == 1953658222) {
                i6 = N(bVar2, i5, i, cVar2.b, i6);
                i5++;
            }
        }
    }

    private static void P(G g, v vVar, byte[] bArr) throws E {
        g.b0(8);
        g.q(bArr, 0, 16);
        if (Arrays.equals(bArr, Q)) {
            G(g, 16, vVar);
        }
    }

    private void Q(long j) throws E {
        while (!this.n.isEmpty() && this.n.peek().b == j) {
            v(this.n.pop());
        }
        m();
    }

    private boolean R(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.w == 0) {
            if (!interfaceC2858s.e(this.m.f(), 0, 8, true)) {
                return false;
            }
            this.w = 8;
            this.m.b0(0);
            this.v = this.m.O();
            this.u = this.m.v();
        }
        long j = this.v;
        if (j == 1) {
            interfaceC2858s.readFully(this.m.f(), 8, 8);
            this.w += 8;
            this.v = this.m.T();
        } else if (j == 0) {
            long length = interfaceC2858s.getLength();
            if (length == -1 && !this.n.isEmpty()) {
                length = this.n.peek().b;
            }
            if (length != -1) {
                this.v = (length - interfaceC2858s.getPosition()) + this.w;
            }
        }
        long j2 = this.v;
        int i = this.w;
        if (j2 < i) {
            throw E.d("Atom size less than header length (unsupported).");
        }
        if (this.O != -1) {
            if (this.u == 1936286840) {
                this.j.X((int) j2);
                System.arraycopy(this.m.f(), 0, this.j.f(), 0, 8);
                interfaceC2858s.readFully(this.j.f(), 8, (int) (this.v - this.w));
                this.r.a((C2848h) I(new e.c(1936286840, this.j).b, interfaceC2858s.i()).second);
            } else {
                interfaceC2858s.g((int) (j2 - i), true);
            }
            m();
            return true;
        }
        long position = interfaceC2858s.getPosition() - this.w;
        int i2 = this.u;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.M) {
            this.J.h(new N.b(this.B, position));
            this.M = true;
        }
        if (this.u == 1836019558) {
            int size = this.e.size();
            for (int i3 = 0; i3 < size; i3++) {
                v vVar = this.e.valueAt(i3).b;
                vVar.b = position;
                vVar.d = position;
                vVar.c = position;
            }
        }
        int i4 = this.u;
        if (i4 == 1835295092) {
            this.D = null;
            this.y = position + this.v;
            this.t = 2;
            return true;
        }
        if (V(i4)) {
            long position2 = interfaceC2858s.getPosition();
            long j3 = this.v;
            long j4 = (position2 + j3) - 8;
            if (j3 != this.w && this.u == 1835365473) {
                t(interfaceC2858s);
            }
            this.n.push(new e.b(this.u, j4));
            if (this.v == this.w) {
                Q(j4);
            } else {
                m();
            }
        } else if (W(this.u)) {
            if (this.w != 8) {
                throw E.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.v > 2147483647L) {
                throw E.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            G g = new G((int) this.v);
            System.arraycopy(this.m.f(), 0, g.f(), 0, 8);
            this.x = g;
            this.t = 1;
        } else {
            if (this.v > 2147483647L) {
                throw E.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.x = null;
            this.t = 1;
        }
        return true;
    }

    private void S(InterfaceC2858s interfaceC2858s) throws IOException {
        int i = (int) (this.v - this.w);
        G g = this.x;
        if (g != null) {
            interfaceC2858s.readFully(g.f(), 8, i);
            x(new e.c(this.u, g), interfaceC2858s);
        } else {
            interfaceC2858s.n(i);
        }
        Q(interfaceC2858s.getPosition());
    }

    private void T(InterfaceC2858s interfaceC2858s) throws IOException {
        int size = this.e.size();
        long j = Long.MAX_VALUE;
        b bVar = null;
        for (int i = 0; i < size; i++) {
            v vVar = this.e.valueAt(i).b;
            if (vVar.p) {
                long j2 = vVar.d;
                if (j2 < j) {
                    bVar = this.e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.t = 3;
            return;
        }
        int position = (int) (j - interfaceC2858s.getPosition());
        if (position < 0) {
            throw E.a("Offset to encryption data was negative.", null);
        }
        interfaceC2858s.n(position);
        bVar.b.b(interfaceC2858s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0110, code lost:
    
        if ((r5.k + r14) <= (r16.E - r16.F)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean U(ax.q1.InterfaceC2858s r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K1.h.U(ax.q1.s):boolean");
    }

    private static boolean V(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227 || i == 1835365473;
    }

    private static boolean W(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new h(t.a.a, 32)};
    }

    private boolean i(C0912v c0912v) {
        return Objects.equals(c0912v.o, "video/avc") ? (this.b & 64) != 0 : Objects.equals(c0912v.o, "video/hevc") && (this.b & 128) != 0;
    }

    private static int j(int i) throws E {
        if (i >= 0) {
            return i;
        }
        throw E.a("Unexpected negative value: " + i, null);
    }

    public static int l(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void m() {
        this.t = 0;
        this.w = 0;
    }

    private c n(SparseArray<c> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) C0968a.e(sparseArray.get(i));
    }

    private static C0906o o(List<e.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            e.c cVar = list.get(i);
            if (cVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] f = cVar.b.f();
                UUID f2 = p.f(f);
                if (f2 == null) {
                    C0987u.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C0906o.b(f2, "video/mp4", f));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C0906o(arrayList);
    }

    private static b p(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b valueAt = sparseArray.valueAt(i);
            if ((valueAt.m || valueAt.f != valueAt.d.b) && (!valueAt.m || valueAt.h != valueAt.b.e)) {
                long d = valueAt.d();
                if (d < j) {
                    bVar = valueAt;
                    j = d;
                }
            }
        }
        return bVar;
    }

    private void r() {
        int i;
        U[] uArr = new U[2];
        this.K = uArr;
        U u = this.q;
        int i2 = 0;
        if (u != null) {
            uArr[0] = u;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.b & 4) != 0) {
            uArr[i] = this.J.u(100, 5);
            i3 = 101;
            i++;
        }
        U[] uArr2 = (U[]) d0.g1(this.K, i);
        this.K = uArr2;
        for (U u2 : uArr2) {
            u2.e(R);
        }
        this.L = new U[this.d.size()];
        while (i2 < this.L.length) {
            U u3 = this.J.u(i3, 3);
            u3.e(this.d.get(i2));
            this.L[i2] = u3;
            i2++;
            i3++;
        }
    }

    private static boolean s(t tVar) {
        long[] jArr = tVar.i;
        if (jArr != null && jArr.length == 1 && tVar.j != null) {
            long j = jArr[0];
            if (j == 0 || d0.p1(j, 1000000L, tVar.d) + d0.p1(tVar.j[0], 1000000L, tVar.c) >= tVar.e) {
                return true;
            }
        }
        return false;
    }

    private void t(InterfaceC2858s interfaceC2858s) throws IOException {
        this.j.X(8);
        interfaceC2858s.p(this.j.f(), 0, 8);
        ax.K1.b.g(this.j);
        interfaceC2858s.n(this.j.g());
        interfaceC2858s.m();
    }

    private void v(e.b bVar) throws E {
        int i = bVar.a;
        if (i == 1836019574) {
            z(bVar);
        } else if (i == 1836019558) {
            y(bVar);
        } else {
            if (this.n.isEmpty()) {
                return;
            }
            this.n.peek().b(bVar);
        }
    }

    private void w(G g) {
        String str;
        String str2;
        long p1;
        long p12;
        long O;
        long j;
        if (this.K.length == 0) {
            return;
        }
        g.b0(8);
        int q = ax.K1.b.q(g.v());
        if (q == 0) {
            str = (String) C0968a.e(g.G());
            str2 = (String) C0968a.e(g.G());
            long O2 = g.O();
            p1 = d0.p1(g.O(), 1000000L, O2);
            long j2 = this.C;
            long j3 = j2 != -9223372036854775807L ? j2 + p1 : -9223372036854775807L;
            p12 = d0.p1(g.O(), 1000L, O2);
            O = g.O();
            j = j3;
        } else {
            if (q != 1) {
                C0987u.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + q);
                return;
            }
            long O3 = g.O();
            j = d0.p1(g.T(), 1000000L, O3);
            long p13 = d0.p1(g.O(), 1000L, O3);
            long O4 = g.O();
            str = (String) C0968a.e(g.G());
            str2 = (String) C0968a.e(g.G());
            p12 = p13;
            O = O4;
            p1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[g.a()];
        g.q(bArr, 0, g.a());
        G g2 = new G(this.l.a(new ax.B1.a(str3, str4, p12, O, bArr)));
        int a2 = g2.a();
        for (U u : this.K) {
            g2.b0(0);
            u.g(g2, a2);
        }
        if (j == -9223372036854775807L) {
            this.o.addLast(new a(p1, true, a2));
            this.z += a2;
            return;
        }
        if (!this.o.isEmpty()) {
            this.o.addLast(new a(j, false, a2));
            this.z += a2;
            return;
        }
        M m = this.k;
        if (m != null && !m.g()) {
            this.o.addLast(new a(j, false, a2));
            this.z += a2;
            return;
        }
        M m2 = this.k;
        if (m2 != null) {
            j = m2.a(j);
        }
        long j4 = j;
        for (U u2 : this.K) {
            u2.f(j4, 1, a2, 0, null);
        }
    }

    private void x(e.c cVar, InterfaceC2858s interfaceC2858s) throws IOException {
        if (!this.n.isEmpty()) {
            this.n.peek().c(cVar);
            return;
        }
        int i = cVar.a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                w(cVar.b);
                return;
            }
            return;
        }
        Pair<Long, C2848h> I = I(cVar.b, interfaceC2858s.getPosition());
        this.r.a((C2848h) I.second);
        if (!this.M) {
            this.C = ((Long) I.first).longValue();
            this.J.h((N) I.second);
            this.M = true;
        } else {
            if ((this.b & 256) == 0 || this.N || this.r.c() <= 1) {
                return;
            }
            this.O = interfaceC2858s.getPosition();
        }
    }

    private void y(e.b bVar) throws E {
        C(bVar, this.e, this.c != null, this.b, this.i);
        C0906o o = o(bVar.c);
        if (o != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                this.e.valueAt(i).n(o);
            }
        }
        if (this.A != -9223372036854775807L) {
            int size2 = this.e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.valueAt(i2).l(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private void z(e.b bVar) throws E {
        long j;
        boolean z;
        C0968a.h(this.c == null, "Unexpected moov box.");
        C0906o o = o(bVar.c);
        e.b bVar2 = (e.b) C0968a.e(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.c.size();
        long j2 = -9223372036854775807L;
        for (int i = 0; i < size; i++) {
            e.c cVar = bVar2.c.get(i);
            int i2 = cVar.a;
            if (i2 == 1953654136) {
                Pair<Integer, c> M = M(cVar.b);
                sparseArray.put(((Integer) M.first).intValue(), (c) M.second);
            } else if (i2 == 1835362404) {
                j2 = B(cVar.b);
            }
        }
        e.b d = bVar.d(1835365473);
        C c = null;
        C u = d != null ? ax.K1.b.u(d) : null;
        F f = new F();
        e.c e = bVar.e(1969517665);
        if (e != null) {
            c = ax.K1.b.I(e);
            f.c(c);
        }
        C c2 = c;
        C c3 = new C(ax.K1.b.w(((e.c) C0968a.e(bVar.e(1836476516))).b));
        if ((this.b & 16) != 0) {
            j = j2;
            z = true;
        } else {
            j = j2;
            z = false;
        }
        List<w> H = ax.K1.b.H(bVar, f, j, o, z, false, new InterfaceC2879f() { // from class: ax.K1.e
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return h.this.u((t) obj);
            }
        });
        int size2 = H.size();
        if (this.e.size() != 0) {
            C0968a.g(this.e.size() == size2);
            for (int i3 = 0; i3 < size2; i3++) {
                w wVar = H.get(i3);
                t tVar = wVar.a;
                this.e.get(tVar.a).j(wVar, n(sparseArray, tVar.a));
            }
            return;
        }
        String b2 = k.b(H);
        int i4 = 0;
        while (i4 < size2) {
            w wVar2 = H.get(i4);
            t tVar2 = wVar2.a;
            U u2 = this.J.u(i4, tVar2.b);
            u2.d(tVar2.e);
            C0912v.b b3 = tVar2.g.b();
            b3.W(b2);
            j.l(tVar2.b, f, b3);
            j.m(tVar2.b, u, b3, tVar2.g.l, c2, c3);
            this.e.put(tVar2.a, new b(u2, wVar2, n(sparseArray, tVar2.a), b3.P()));
            this.B = Math.max(this.B, tVar2.e);
            i4++;
            f = f;
        }
        this.J.o();
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        if ((this.b & 32) == 0) {
            interfaceC2859t = new ax.N1.u(interfaceC2859t, this.a);
        }
        this.J = interfaceC2859t;
        m();
        r();
        t tVar = this.c;
        if (tVar != null) {
            C0912v.b b2 = tVar.g.b();
            b2.W(k.a(this.c.g));
            this.e.put(0, new b(this.J.u(0, this.c.b), new w(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), b2.P()));
            this.J.o();
        }
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.valueAt(i).k();
        }
        this.o.clear();
        this.z = 0;
        this.p.b();
        this.A = j2;
        this.n.clear();
        m();
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        S b2 = s.b(interfaceC2858s);
        this.s = b2 != null ? AbstractC2991z.A(b2) : AbstractC2991z.z();
        return b2 == null;
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        while (true) {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    S(interfaceC2858s);
                } else if (i == 2) {
                    T(interfaceC2858s);
                } else if (U(interfaceC2858s)) {
                    return 0;
                }
            } else if (!R(interfaceC2858s)) {
                long j = this.O;
                if (j == -1) {
                    this.p.d();
                    return -1;
                }
                m.a = j;
                this.O = -1L;
                this.J.h(this.r.b());
                this.N = true;
                return 1;
            }
        }
    }

    @Override // ax.q1.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC2991z<S> k() {
        return this.s;
    }

    public h(t.a aVar, int i, M m, t tVar, List<C0912v> list, U u) {
        this.a = aVar;
        this.b = i;
        this.k = m;
        this.c = tVar;
        this.d = DesugarCollections.unmodifiableList(list);
        this.q = u;
        this.l = new ax.B1.c();
        this.m = new G(16);
        this.f = new G(ax.T0.h.a);
        this.g = new G(6);
        this.h = new G();
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new G(bArr);
        this.n = new ArrayDeque<>();
        this.o = new ArrayDeque<>();
        this.e = new SparseArray<>();
        this.s = AbstractC2991z.z();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = InterfaceC2859t.a0;
        this.K = new U[0];
        this.L = new U[0];
        this.p = new ax.T0.k(new k.b() { // from class: ax.K1.g
            @Override // ax.T0.k.b
            public final void a(long j, G g) {
                C2847g.a(j, g, h.this.L);
            }
        });
        this.r = new C2849i();
        this.O = -1L;
    }

    @Override // ax.q1.r
    public void d() {
    }

    protected t u(t tVar) {
        return tVar;
    }
}
