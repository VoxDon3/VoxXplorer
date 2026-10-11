package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.C0618p0;
import androidx.media3.exoplayer.hls.c;
import androidx.media3.exoplayer.hls.l;
import ax.P0.C;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.D;
import ax.P0.E;
import ax.P0.InterfaceC0902k;
import ax.P0.P;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.U0.u;
import ax.Y0.O;
import ax.Y0.Z;
import ax.b1.InterfaceC1471u;
import ax.b1.w;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.N;
import ax.i1.d0;
import ax.i1.e0;
import ax.i1.f0;
import ax.i1.q0;
import ax.j1.AbstractC2304b;
import ax.l1.C2450I;
import ax.m1.m;
import ax.m1.o;
import ax.q1.C2855o;
import ax.q1.InterfaceC2859t;
import ax.q1.T;
import ax.q1.U;
import ax.r7.AbstractC2991z;
import ax.r7.F;
import ax.u7.C3218f;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements o.b<AbstractC2304b>, o.f, f0, InterfaceC2859t, d0.d {
    private static final Set<Integer> Z0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private U A0;
    private int B0;
    private int C0;
    private boolean D0;
    private boolean E0;
    private int F0;
    private C0912v G0;
    private C0912v H0;
    private boolean I0;
    private q0 J0;
    private Set<P> K0;
    private int[] L0;
    private int M0;
    private boolean N0;
    private boolean[] O0;
    private boolean[] P0;
    private long Q0;
    private long R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private long W0;
    private C0906o X0;
    private e Y0;
    private final int c0;
    private final b d0;
    private final androidx.media3.exoplayer.hls.c e0;
    private final ax.m1.b f0;
    private final C0912v g0;
    private final w h0;
    private final InterfaceC1471u.a i0;
    private final m j0;
    private final N.a l0;
    private final int m0;
    private final ArrayList<e> o0;
    private final List<e> p0;
    private final String q;
    private final Runnable q0;
    private final Runnable r0;
    private final Handler s0;
    private final ArrayList<h> t0;
    private final Map<String, C0906o> u0;
    private AbstractC2304b v0;
    private d[] w0;
    private Set<Integer> y0;
    private SparseIntArray z0;
    private final o k0 = new o("Loader:HlsSampleStreamWrapper");
    private final c.b n0 = new c.b();
    private int[] x0 = new int[0];

    public interface b extends f0.a<l> {
        void h();

        void k(Uri uri);
    }

    private static class c implements U {
        private static final C0912v g = new C0912v.b().y0("application/id3").P();
        private static final C0912v h = new C0912v.b().y0("application/x-emsg").P();
        private final ax.B1.b a = new ax.B1.b();
        private final U b;
        private final C0912v c;
        private C0912v d;
        private byte[] e;
        private int f;

        public c(U u, int i) {
            this.b = u;
            if (i == 1) {
                this.c = g;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
                this.c = h;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        private boolean h(ax.B1.a aVar) {
            C0912v a = aVar.a();
            return a != null && Objects.equals(this.c.o, a.o);
        }

        private void i(int i) {
            byte[] bArr = this.e;
            if (bArr.length < i) {
                this.e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        private G j(int i, int i2) {
            int i3 = this.f - i2;
            G g2 = new G(Arrays.copyOfRange(this.e, i3 - i, i3));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f = i2;
            return g2;
        }

        @Override // ax.q1.U
        public /* synthetic */ int a(InterfaceC0902k interfaceC0902k, int i, boolean z) {
            return T.b(this, interfaceC0902k, i, z);
        }

        @Override // ax.q1.U
        public void b(G g2, int i, int i2) {
            i(this.f + i);
            g2.q(this.e, this.f, i);
            this.f += i;
        }

        @Override // ax.q1.U
        public int c(InterfaceC0902k interfaceC0902k, int i, boolean z, int i2) throws IOException {
            i(this.f + i);
            int c = interfaceC0902k.c(this.e, this.f, i);
            if (c != -1) {
                this.f += c;
                return c;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // ax.q1.U
        public /* synthetic */ void d(long j) {
            T.a(this, j);
        }

        @Override // ax.q1.U
        public void e(C0912v c0912v) {
            this.d = c0912v;
            this.b.e(this.c);
        }

        @Override // ax.q1.U
        public void f(long j, int i, int i2, int i3, U.a aVar) {
            C0968a.e(this.d);
            G j2 = j(i2, i3);
            if (!Objects.equals(this.d.o, this.c.o)) {
                if (!"application/x-emsg".equals(this.d.o)) {
                    C0987u.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.d.o);
                    return;
                }
                ax.B1.a c = this.a.c(j2);
                if (!h(c)) {
                    C0987u.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.o, c.a()));
                    return;
                }
                j2 = new G((byte[]) C0968a.e(c.c()));
            }
            int a = j2.a();
            this.b.g(j2, a);
            this.b.f(j, i, a, 0, aVar);
        }

        @Override // ax.q1.U
        public /* synthetic */ void g(G g2, int i) {
            T.c(this, g2, i);
        }
    }

    private static final class d extends d0 {
        private final Map<String, C0906o> H;
        private C0906o I;

        private C e0(C c) {
            if (c == null) {
                return null;
            }
            int e = c.e();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= e) {
                    i2 = -1;
                    break;
                }
                C.a d = c.d(i2);
                if ((d instanceof ax.E1.m) && "com.apple.streaming.transportStreamTimestamp".equals(((ax.E1.m) d).b)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return c;
            }
            if (e == 1) {
                return null;
            }
            C.a[] aVarArr = new C.a[e - 1];
            while (i < e) {
                if (i != i2) {
                    aVarArr[i < i2 ? i : i - 1] = c.d(i);
                }
                i++;
            }
            return new C(aVarArr);
        }

        @Override // ax.i1.d0, ax.q1.U
        public void f(long j, int i, int i2, int i3, U.a aVar) {
            super.f(j, i, i2, i3, aVar);
        }

        public void f0(C0906o c0906o) {
            this.I = c0906o;
            G();
        }

        public void g0(e eVar) {
            c0(eVar.k);
        }

        @Override // ax.i1.d0
        public C0912v v(C0912v c0912v) {
            C0906o c0906o;
            C0906o c0906o2 = this.I;
            if (c0906o2 == null) {
                c0906o2 = c0912v.s;
            }
            if (c0906o2 != null && (c0906o = this.H.get(c0906o2.d0)) != null) {
                c0906o2 = c0906o;
            }
            C e0 = e0(c0912v.l);
            if (c0906o2 != c0912v.s || e0 != c0912v.l) {
                c0912v = c0912v.b().c0(c0906o2).r0(e0).P();
            }
            return super.v(c0912v);
        }

        private d(ax.m1.b bVar, w wVar, InterfaceC1471u.a aVar, Map<String, C0906o> map) {
            super(bVar, wVar, aVar);
            this.H = map;
        }
    }

    public l(String str, int i, b bVar, androidx.media3.exoplayer.hls.c cVar, Map<String, C0906o> map, ax.m1.b bVar2, long j, C0912v c0912v, w wVar, InterfaceC1471u.a aVar, m mVar, N.a aVar2, int i2) {
        this.q = str;
        this.c0 = i;
        this.d0 = bVar;
        this.e0 = cVar;
        this.u0 = map;
        this.f0 = bVar2;
        this.g0 = c0912v;
        this.h0 = wVar;
        this.i0 = aVar;
        this.j0 = mVar;
        this.l0 = aVar2;
        this.m0 = i2;
        Set<Integer> set = Z0;
        this.y0 = new HashSet(set.size());
        this.z0 = new SparseIntArray(set.size());
        this.w0 = new d[0];
        this.P0 = new boolean[0];
        this.O0 = new boolean[0];
        ArrayList<e> arrayList = new ArrayList<>();
        this.o0 = arrayList;
        this.p0 = DesugarCollections.unmodifiableList(arrayList);
        this.t0 = new ArrayList<>();
        this.q0 = new Runnable() { // from class: androidx.media3.exoplayer.hls.j
            @Override // java.lang.Runnable
            public final void run() {
                l.this.W();
            }
        };
        this.r0 = new Runnable() { // from class: androidx.media3.exoplayer.hls.k
            @Override // java.lang.Runnable
            public final void run() {
                l.this.g0();
            }
        };
        this.s0 = ax.S0.d0.A();
        this.Q0 = j;
        this.R0 = j;
    }

    private void B() {
        C0912v c0912v;
        int length = this.w0.length;
        int i = 0;
        int i2 = -2;
        int i3 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = ((C0912v) C0968a.i(this.w0[i].D())).o;
            int i4 = D.s(str) ? 2 : D.o(str) ? 1 : D.r(str) ? 3 : -2;
            if (O(i4) > O(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        P l = this.e0.l();
        int i5 = l.a;
        this.M0 = -1;
        this.L0 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.L0[i6] = i6;
        }
        P[] pArr = new P[length];
        int i7 = 0;
        while (i7 < length) {
            C0912v c0912v2 = (C0912v) C0968a.i(this.w0[i7].D());
            if (i7 == i3) {
                C0912v[] c0912vArr = new C0912v[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C0912v b2 = l.b(i8);
                    if (i2 == 1 && (c0912v = this.g0) != null) {
                        b2 = b2.m(c0912v);
                    }
                    c0912vArr[i8] = i5 == 1 ? c0912v2.m(b2) : H(b2, c0912v2, true);
                }
                pArr[i7] = new P(this.q, c0912vArr);
                this.M0 = i7;
            } else {
                C0912v c0912v3 = (i2 == 2 && D.o(c0912v2.o)) ? this.g0 : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.q);
                sb.append(":muxed:");
                sb.append(i7 < i3 ? i7 : i7 - 1);
                pArr[i7] = new P(sb.toString(), H(c0912v3, c0912v2, false));
            }
            i7++;
        }
        this.J0 = G(pArr);
        C0968a.g(this.K0 == null);
        this.K0 = Collections.EMPTY_SET;
    }

    private boolean C(int i) {
        for (int i2 = i; i2 < this.o0.size(); i2++) {
            if (this.o0.get(i2).x()) {
                return false;
            }
        }
        e eVar = this.o0.get(i);
        for (int i3 = 0; i3 < this.w0.length; i3++) {
            if (this.w0[i3].A() > eVar.m(i3)) {
                return false;
            }
        }
        return true;
    }

    private static C2855o E(int i, int i2) {
        C0987u.h("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C2855o();
    }

    private d0 F(int i, int i2) {
        int length = this.w0.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        d dVar = new d(this.f0, this.h0, this.i0, this.u0);
        dVar.Y(this.Q0);
        if (z) {
            dVar.f0(this.X0);
        }
        dVar.X(this.W0);
        e eVar = this.Y0;
        if (eVar != null) {
            dVar.g0(eVar);
        }
        dVar.a0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.x0, i3);
        this.x0 = copyOf;
        copyOf[length] = i;
        this.w0 = (d[]) ax.S0.d0.e1(this.w0, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.P0, i3);
        this.P0 = copyOf2;
        copyOf2[length] = z;
        this.N0 |= z;
        this.y0.add(Integer.valueOf(i2));
        this.z0.append(i2, length);
        if (O(i2) > O(this.B0)) {
            this.C0 = length;
            this.B0 = i2;
        }
        this.O0 = Arrays.copyOf(this.O0, i3);
        return dVar;
    }

    private q0 G(P[] pArr) {
        for (int i = 0; i < pArr.length; i++) {
            P p = pArr[i];
            C0912v[] c0912vArr = new C0912v[p.a];
            for (int i2 = 0; i2 < p.a; i2++) {
                C0912v b2 = p.b(i2);
                c0912vArr[i2] = b2.c(this.h0.a(b2));
            }
            pArr[i] = new P(p.b, c0912vArr);
        }
        return new q0(pArr);
    }

    private static C0912v H(C0912v c0912v, C0912v c0912v2, boolean z) {
        String d2;
        String str;
        if (c0912v == null) {
            return c0912v2;
        }
        int k = D.k(c0912v2.o);
        if (ax.S0.d0.R(c0912v.k, k) == 1) {
            d2 = ax.S0.d0.S(c0912v.k, k);
            str = D.g(d2);
        } else {
            d2 = D.d(c0912v.k, c0912v2.o);
            str = c0912v2.o;
        }
        C0912v.b U = c0912v2.b().j0(c0912v.a).l0(c0912v.b).m0(c0912v.c).n0(c0912v.d).A0(c0912v.e).w0(c0912v.f).S(z ? c0912v.h : -1).t0(z ? c0912v.i : -1).U(d2);
        if (k == 2) {
            U.F0(c0912v.v).h0(c0912v.w).f0(c0912v.z);
        }
        if (str != null) {
            U.y0(str);
        }
        int i = c0912v.G;
        if (i != -1 && k == 1) {
            U.T(i);
        }
        C c2 = c0912v.l;
        if (c2 != null) {
            C c3 = c0912v2.l;
            if (c3 != null) {
                c2 = c3.b(c2);
            }
            U.r0(c2);
        }
        return U.P();
    }

    private void I(int i) {
        C0968a.g(!this.k0.i());
        while (true) {
            if (i >= this.o0.size()) {
                i = -1;
                break;
            } else if (C(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = M().h;
        e J = J(i);
        if (this.o0.isEmpty()) {
            this.R0 = this.Q0;
        } else {
            ((e) F.e(this.o0)).p();
        }
        this.U0 = false;
        this.l0.y(this.B0, J.g, j);
    }

    private e J(int i) {
        e eVar = this.o0.get(i);
        ArrayList<e> arrayList = this.o0;
        ax.S0.d0.l1(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.w0.length; i2++) {
            this.w0[i2].s(eVar.m(i2));
        }
        return eVar;
    }

    private boolean K(e eVar) {
        int i = eVar.k;
        int length = this.w0.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.O0[i2] && this.w0[i2].N() == i) {
                return false;
            }
        }
        return true;
    }

    private static boolean L(C0912v c0912v, C0912v c0912v2) {
        String str = c0912v.o;
        String str2 = c0912v2.o;
        int k = D.k(str);
        if (k != 3) {
            return k == D.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c0912v.L == c0912v2.L;
        }
        return false;
    }

    private e M() {
        return this.o0.get(r0.size() - 1);
    }

    private U N(int i, int i2) {
        C0968a.a(Z0.contains(Integer.valueOf(i2)));
        int i3 = this.z0.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.y0.add(Integer.valueOf(i2))) {
            this.x0[i3] = i;
        }
        return this.x0[i3] == i ? this.w0[i3] : E(i, i2);
    }

    private static int O(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private void P(e eVar) {
        this.Y0 = eVar;
        this.G0 = eVar.d;
        this.R0 = -9223372036854775807L;
        this.o0.add(eVar);
        AbstractC2991z.a r = AbstractC2991z.r();
        for (d dVar : this.w0) {
            r.a(Integer.valueOf(dVar.E()));
        }
        eVar.o(this, r.k());
        for (d dVar2 : this.w0) {
            dVar2.g0(eVar);
            if (eVar.x()) {
                dVar2.d0();
            }
        }
    }

    private static boolean Q(AbstractC2304b abstractC2304b) {
        return abstractC2304b instanceof e;
    }

    private boolean R() {
        return this.R0 != -9223372036854775807L;
    }

    private void U() {
        int i = this.J0.a;
        int[] iArr = new int[i];
        this.L0 = iArr;
        Arrays.fill(iArr, -1);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                d[] dVarArr = this.w0;
                if (i4 >= dVarArr.length) {
                    break;
                }
                if (L((C0912v) C0968a.i(dVarArr[i4].D()), this.J0.c(i3).b(0))) {
                    this.L0[i3] = i4;
                    break;
                }
                i4++;
            }
        }
        ArrayList<h> arrayList = this.t0;
        int size = arrayList.size();
        while (i2 < size) {
            h hVar = arrayList.get(i2);
            i2++;
            hVar.d();
        }
    }

    private void V(e eVar) {
        if (this.o0.isEmpty()) {
            return;
        }
        if (!M().r()) {
            I(this.o0.size() - 1);
        }
        if (eVar.n && eVar.x()) {
            for (int size = this.o0.size() - 1; size >= 0; size--) {
                long j = this.o0.get(size).g;
                long j2 = eVar.g;
                if (j < j2) {
                    return;
                }
                if (j == j2 && C(size)) {
                    I(size);
                    eVar.i();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (!this.I0 && this.L0 == null && this.D0) {
            for (d dVar : this.w0) {
                if (dVar.D() == null) {
                    return;
                }
            }
            if (this.J0 != null) {
                U();
                return;
            }
            B();
            p0();
            this.d0.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.D0 = true;
        W();
    }

    private void k0() {
        for (d dVar : this.w0) {
            dVar.T(this.S0);
        }
        this.S0 = false;
    }

    private boolean l0(long j, e eVar) {
        int i;
        boolean W;
        int length = this.w0.length;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            d dVar = this.w0[i];
            if (eVar != null) {
                W = dVar.V(eVar.m(i));
            } else {
                long b2 = b();
                if (b2 != Long.MIN_VALUE && j >= b2) {
                    z = false;
                }
                W = dVar.W(j, z);
            }
            i = (W || (!this.P0[i] && this.N0)) ? i + 1 : 0;
        }
        return false;
    }

    private void p0() {
        this.E0 = true;
    }

    private void u0(e0[] e0VarArr) {
        this.t0.clear();
        for (e0 e0Var : e0VarArr) {
            if (e0Var != null) {
                this.t0.add((h) e0Var);
            }
        }
    }

    private void z() {
        C0968a.g(this.E0);
        C0968a.e(this.J0);
        C0968a.e(this.K0);
    }

    public int A(int i) {
        z();
        C0968a.e(this.L0);
        int i2 = this.L0[i];
        if (i2 == -1) {
            return this.K0.contains(this.J0.c(i)) ? -3 : -2;
        }
        boolean[] zArr = this.O0;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public void D() {
        if (this.E0) {
            return;
        }
        a(new C0618p0.b().f(this.Q0).d());
    }

    public boolean S(int i) {
        return !R() && this.w0[i].I(this.U0);
    }

    public boolean T() {
        return this.B0 == 2;
    }

    public void X() throws IOException {
        this.k0.j();
        this.e0.r();
    }

    public void Y(int i) throws IOException {
        X();
        this.w0[i].K();
    }

    @Override // ax.m1.o.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void p(AbstractC2304b abstractC2304b, long j, long j2, boolean z) {
        this.v0 = null;
        C2234y c2234y = new C2234y(abstractC2304b.a, abstractC2304b.b, abstractC2304b.f(), abstractC2304b.e(), j, j2, abstractC2304b.b());
        this.j0.a(abstractC2304b.a);
        this.l0.m(c2234y, abstractC2304b.c, this.c0, abstractC2304b.d, abstractC2304b.e, abstractC2304b.f, abstractC2304b.g, abstractC2304b.h);
        if (z) {
            return;
        }
        if (R() || this.F0 == 0) {
            k0();
        }
        if (this.F0 > 0) {
            this.d0.i(this);
        }
    }

    @Override // ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        List<e> list;
        long j;
        long j2;
        if (this.U0 || this.k0.i() || this.k0.h()) {
            return false;
        }
        if (R()) {
            List<e> list2 = Collections.EMPTY_LIST;
            long j3 = this.R0;
            for (d dVar : this.w0) {
                dVar.Y(this.R0);
            }
            list = list2;
            j = j3;
            j2 = j;
        } else {
            List<e> list3 = this.p0;
            e M = M();
            long n = (M.q() && M.r()) ? M.n() : Math.max(this.Q0, M.g);
            long j4 = this.Q0;
            if (this.D0) {
                for (d dVar2 : this.w0) {
                    j4 = Math.max(j4, dVar2.y());
                }
            }
            list = list3;
            j = n;
            j2 = j4;
        }
        this.n0.a();
        this.e0.f(c0618p0, j, j2, list, this.E0 || !list.isEmpty(), this.n0);
        c.b bVar = this.n0;
        boolean z = bVar.b;
        AbstractC2304b abstractC2304b = bVar.a;
        Uri uri = bVar.c;
        if (z) {
            this.R0 = -9223372036854775807L;
            this.U0 = true;
            return true;
        }
        if (abstractC2304b == null) {
            if (uri != null) {
                this.d0.k(uri);
            }
            return false;
        }
        if (Q(abstractC2304b)) {
            e eVar = (e) abstractC2304b;
            V(eVar);
            P(eVar);
        }
        this.v0 = abstractC2304b;
        this.k0.n(abstractC2304b, this, this.j0.c(abstractC2304b.c));
        return true;
    }

    @Override // ax.m1.o.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void r(AbstractC2304b abstractC2304b, long j, long j2) {
        this.v0 = null;
        this.e0.t(abstractC2304b);
        C2234y c2234y = new C2234y(abstractC2304b.a, abstractC2304b.b, abstractC2304b.f(), abstractC2304b.e(), j, j2, abstractC2304b.b());
        this.j0.a(abstractC2304b.a);
        this.l0.p(c2234y, abstractC2304b.c, this.c0, abstractC2304b.d, abstractC2304b.e, abstractC2304b.f, abstractC2304b.g, abstractC2304b.h);
        if (this.E0) {
            this.d0.i(this);
        } else {
            a(new C0618p0.b().f(this.Q0).d());
        }
    }

    @Override // ax.i1.f0
    public long b() {
        if (R()) {
            return this.R0;
        }
        if (this.U0) {
            return Long.MIN_VALUE;
        }
        return M().h;
    }

    @Override // ax.m1.o.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public o.c j(AbstractC2304b abstractC2304b, long j, long j2, IOException iOException, int i) {
        o.c g;
        int i2;
        boolean Q = Q(abstractC2304b);
        if (Q && !((e) abstractC2304b).r() && (iOException instanceof u) && ((i2 = ((u) iOException).e0) == 410 || i2 == 404)) {
            return o.d;
        }
        long b2 = abstractC2304b.b();
        C2234y c2234y = new C2234y(abstractC2304b.a, abstractC2304b.b, abstractC2304b.f(), abstractC2304b.e(), j, j2, b2);
        m.c cVar = new m.c(c2234y, new C2205B(abstractC2304b.c, this.c0, abstractC2304b.d, abstractC2304b.e, abstractC2304b.f, ax.S0.d0.E1(abstractC2304b.g), ax.S0.d0.E1(abstractC2304b.h)), iOException, i);
        m.b d2 = this.j0.d(C2450I.c(this.e0.m()), cVar);
        boolean q = (d2 == null || d2.a != 2) ? false : this.e0.q(abstractC2304b, d2.b);
        if (q) {
            if (Q && b2 == 0) {
                ArrayList<e> arrayList = this.o0;
                C0968a.g(arrayList.remove(arrayList.size() - 1) == abstractC2304b);
                if (this.o0.isEmpty()) {
                    this.R0 = this.Q0;
                } else {
                    ((e) F.e(this.o0)).p();
                }
            }
            g = o.f;
        } else {
            long b3 = this.j0.b(cVar);
            g = b3 != -9223372036854775807L ? o.g(false, b3) : o.g;
        }
        o.c cVar2 = g;
        boolean c2 = cVar2.c();
        this.l0.r(c2234y, abstractC2304b.c, this.c0, abstractC2304b.d, abstractC2304b.e, abstractC2304b.f, abstractC2304b.g, abstractC2304b.h, iOException, !c2);
        if (!c2) {
            this.v0 = null;
            this.j0.a(abstractC2304b.a);
        }
        if (q) {
            if (!this.E0) {
                a(new C0618p0.b().f(this.Q0).d());
                return cVar2;
            }
            this.d0.i(this);
        }
        return cVar2;
    }

    @Override // ax.i1.f0
    public boolean c() {
        return this.k0.i();
    }

    @Override // ax.m1.o.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void k(AbstractC2304b abstractC2304b, long j, long j2, int i) {
        this.l0.v(i == 0 ? new C2234y(abstractC2304b.a, abstractC2304b.b, j) : new C2234y(abstractC2304b.a, abstractC2304b.b, abstractC2304b.f(), abstractC2304b.e(), j, j2, abstractC2304b.b()), abstractC2304b.c, this.c0, abstractC2304b.d, abstractC2304b.e, abstractC2304b.f, abstractC2304b.g, abstractC2304b.h, i);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // ax.i1.f0
    public long d() {
        /*
            r7 = this;
            boolean r0 = r7.U0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.R()
            if (r0 == 0) goto L10
            long r0 = r7.R0
            return r0
        L10:
            long r0 = r7.Q0
            androidx.media3.exoplayer.hls.e r2 = r7.M()
            boolean r3 = r2.q()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<androidx.media3.exoplayer.hls.e> r2 = r7.o0
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<androidx.media3.exoplayer.hls.e> r2 = r7.o0
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            androidx.media3.exoplayer.hls.e r2 = (androidx.media3.exoplayer.hls.e) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.D0
            if (r2 == 0) goto L55
            androidx.media3.exoplayer.hls.l$d[] r2 = r7.w0
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.x()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.l.d():long");
    }

    public void d0() {
        this.y0.clear();
    }

    @Override // ax.i1.f0
    public void e(long j) {
        if (this.k0.h() || R()) {
            return;
        }
        if (this.k0.i()) {
            C0968a.e(this.v0);
            if (this.e0.z(j, this.v0, this.p0)) {
                this.k0.e();
                return;
            }
            return;
        }
        int size = this.p0.size();
        while (size > 0 && this.e0.d(this.p0.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.p0.size()) {
            I(size);
        }
        int i = this.e0.i(j, this.p0);
        if (i < this.o0.size()) {
            I(i);
        }
    }

    public boolean e0(Uri uri, m.c cVar, boolean z) {
        m.b d2;
        if (this.e0.s(uri)) {
            return this.e0.u(uri, (z || (d2 = this.j0.d(C2450I.c(this.e0.m()), cVar)) == null || d2.a != 2) ? -9223372036854775807L : d2.b);
        }
        return true;
    }

    @Override // ax.m1.o.f
    public void f() {
        for (d dVar : this.w0) {
            dVar.Q();
        }
    }

    public void f0() {
        if (this.o0.isEmpty()) {
            return;
        }
        final e eVar = (e) F.e(this.o0);
        int d2 = this.e0.d(eVar);
        if (d2 == 1) {
            if (eVar.r()) {
                return;
            }
            eVar.w(this.e0.j(eVar));
        } else if (d2 == 0) {
            this.s0.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.i
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.d0.k(eVar.m);
                }
            });
        } else if (d2 == 2 && !this.U0 && this.k0.i()) {
            this.k0.e();
        }
    }

    public void h0(P[] pArr, int i, int... iArr) {
        this.J0 = G(pArr);
        this.K0 = new HashSet();
        for (int i2 : iArr) {
            this.K0.add(this.J0.c(i2));
        }
        this.M0 = i;
        Handler handler = this.s0;
        final b bVar = this.d0;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: ax.c1.g
            @Override // java.lang.Runnable
            public final void run() {
                l.b.this.h();
            }
        });
        p0();
    }

    @Override // ax.i1.d0.d
    public void i(C0912v c0912v) {
        this.s0.post(this.q0);
    }

    public int i0(int i, O o, ax.V0.i iVar, int i2) {
        if (R()) {
            return -3;
        }
        int i3 = 0;
        if (!this.o0.isEmpty()) {
            int i4 = 0;
            while (i4 < this.o0.size() - 1 && K(this.o0.get(i4))) {
                i4++;
            }
            ax.S0.d0.l1(this.o0, 0, i4);
            e eVar = this.o0.get(0);
            C0912v c0912v = eVar.d;
            if (!c0912v.equals(this.H0)) {
                this.l0.j(this.c0, c0912v, eVar.e, eVar.f, eVar.g);
            }
            this.H0 = c0912v;
        }
        if (!this.o0.isEmpty() && !this.o0.get(0).r()) {
            return -3;
        }
        int P = this.w0[i].P(o, iVar, i2, this.U0);
        if (P == -5) {
            C0912v c0912v2 = (C0912v) C0968a.e(o.b);
            if (i == this.C0) {
                int e = C3218f.e(this.w0[i].N());
                while (i3 < this.o0.size() && this.o0.get(i3).k != e) {
                    i3++;
                }
                c0912v2 = c0912v2.m(i3 < this.o0.size() ? this.o0.get(i3).d : (C0912v) C0968a.e(this.G0));
            }
            o.b = c0912v2;
        }
        return P;
    }

    public void j0() {
        if (this.E0) {
            for (d dVar : this.w0) {
                dVar.O();
            }
        }
        this.e0.v();
        this.k0.m(this);
        this.s0.removeCallbacksAndMessages(null);
        this.I0 = true;
        this.t0.clear();
    }

    public void l() throws IOException {
        X();
        if (this.U0 && !this.E0) {
            throw E.a("Loading finished before preparation is complete.", null);
        }
    }

    public boolean m0(long j, boolean z) {
        e eVar;
        this.Q0 = j;
        if (R()) {
            this.R0 = j;
            return true;
        }
        if (this.e0.n()) {
            for (int i = 0; i < this.o0.size(); i++) {
                eVar = this.o0.get(i);
                if (eVar.g == j) {
                    break;
                }
            }
        }
        eVar = null;
        if (this.D0 && !z && !this.o0.isEmpty() && l0(j, eVar)) {
            return false;
        }
        this.R0 = j;
        this.U0 = false;
        this.o0.clear();
        if (this.k0.i()) {
            if (this.D0) {
                for (d dVar : this.w0) {
                    dVar.q();
                }
            }
            this.k0.e();
        } else {
            this.k0.f();
            k0();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        if (r1.l() != r13.e0.l().c(r14.d)) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(ax.l1.InterfaceC2445D[] r14, boolean[] r15, ax.i1.e0[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.l.n0(ax.l1.D[], boolean[], ax.i1.e0[], boolean[], long, boolean):boolean");
    }

    @Override // ax.q1.InterfaceC2859t
    public void o() {
        this.V0 = true;
        this.s0.post(this.r0);
    }

    public void o0(C0906o c0906o) {
        if (Objects.equals(this.X0, c0906o)) {
            return;
        }
        this.X0 = c0906o;
        int i = 0;
        while (true) {
            d[] dVarArr = this.w0;
            if (i >= dVarArr.length) {
                return;
            }
            if (this.P0[i]) {
                dVarArr[i].f0(c0906o);
            }
            i++;
        }
    }

    public long q(long j, Z z) {
        return this.e0.c(j, z);
    }

    public void q0(boolean z) {
        this.e0.x(z);
    }

    public void r0(long j) {
        if (this.W0 != j) {
            this.W0 = j;
            for (d dVar : this.w0) {
                dVar.X(j);
            }
        }
    }

    public int s0(int i, long j) {
        if (R()) {
            return 0;
        }
        d dVar = this.w0[i];
        int C = dVar.C(j, this.U0);
        e eVar = (e) F.f(this.o0, null);
        if (eVar != null && !eVar.r()) {
            C = Math.min(C, eVar.m(i) - dVar.A());
        }
        dVar.b0(C);
        return C;
    }

    public q0 t() {
        z();
        return this.J0;
    }

    public void t0(int i) {
        z();
        C0968a.e(this.L0);
        int i2 = this.L0[i];
        C0968a.g(this.O0[i2]);
        this.O0[i2] = false;
    }

    @Override // ax.q1.InterfaceC2859t
    public U u(int i, int i2) {
        U u;
        if (!Z0.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                U[] uArr = this.w0;
                if (i3 >= uArr.length) {
                    u = null;
                    break;
                }
                if (this.x0[i3] == i) {
                    u = uArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            u = N(i, i2);
        }
        if (u == null) {
            if (this.V0) {
                return E(i, i2);
            }
            u = F(i, i2);
        }
        if (i2 != 5) {
            return u;
        }
        if (this.A0 == null) {
            this.A0 = new c(u, this.m0);
        }
        return this.A0;
    }

    public void v(long j, boolean z) {
        if (!this.D0 || R()) {
            return;
        }
        int length = this.w0.length;
        for (int i = 0; i < length; i++) {
            this.w0[i].p(j, z, this.O0[i]);
        }
    }

    @Override // ax.q1.InterfaceC2859t
    public void h(ax.q1.N n) {
    }
}
