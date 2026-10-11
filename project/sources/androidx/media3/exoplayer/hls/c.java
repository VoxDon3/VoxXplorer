package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.P0.P;
import ax.S0.C0968a;
import ax.S0.O;
import ax.S0.d0;
import ax.U0.k;
import ax.U0.z;
import ax.Y0.Z;
import ax.Z0.I1;
import ax.d1.f;
import ax.d1.m;
import ax.i1.C2212b;
import ax.j1.AbstractC2303a;
import ax.j1.AbstractC2304b;
import ax.j1.AbstractC2305c;
import ax.j1.AbstractC2306d;
import ax.j1.InterfaceC2307e;
import ax.l1.AbstractC2454c;
import ax.l1.InterfaceC2445D;
import ax.m1.g;
import ax.r7.AbstractC2991z;
import ax.r7.F;
import ax.u7.C3218f;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
class c {
    private final ax.c1.e a;
    private final ax.U0.g b;
    private final ax.U0.g c;
    private final ax.c1.j d;
    private final Uri[] e;
    private final C0912v[] f;
    private final m g;
    private final P h;
    private final List<C0912v> i;
    private final I1 k;
    private final long l;
    private boolean m;
    private IOException o;
    private Uri p;
    private Uri q;
    private boolean r;
    private InterfaceC2445D s;
    private long u = -9223372036854775807L;
    private final androidx.media3.exoplayer.hls.b j = new androidx.media3.exoplayer.hls.b(4);
    private byte[] n = d0.f;
    private long t = -9223372036854775807L;

    private static final class a extends AbstractC2305c {
        private byte[] l;

        public a(ax.U0.g gVar, ax.U0.k kVar, C0912v c0912v, int i, Object obj, byte[] bArr) {
            super(gVar, kVar, 3, c0912v, i, obj, bArr);
        }

        @Override // ax.j1.AbstractC2305c
        protected void g(byte[] bArr, int i) {
            this.l = Arrays.copyOf(bArr, i);
        }

        public byte[] j() {
            return this.l;
        }
    }

    public static final class b {
        public AbstractC2304b a;
        public boolean b;
        public Uri c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* renamed from: androidx.media3.exoplayer.hls.c$c, reason: collision with other inner class name */
    static final class C0028c extends AbstractC2303a {
        private final List<f.g> e;
        private final long f;
        private final String g;

        public C0028c(String str, long j, List<f.g> list) {
            super(0L, list.size() - 1);
            this.g = str;
            this.f = j;
            this.e = list;
        }

        @Override // ax.j1.InterfaceC2307e
        public long a() {
            c();
            return this.f + this.e.get((int) d()).f0;
        }

        @Override // ax.j1.InterfaceC2307e
        public long b() {
            c();
            f.g gVar = this.e.get((int) d());
            return this.f + gVar.f0 + gVar.d0;
        }
    }

    private static final class d extends AbstractC2454c {
        private int i;

        public d(P p, int[] iArr) {
            super(p, iArr);
            this.i = v(p.b(iArr[0]));
        }

        @Override // ax.l1.InterfaceC2445D
        public void c(long j, long j2, long j3, List<? extends AbstractC2306d> list, InterfaceC2307e[] interfaceC2307eArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.i, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!a(i, elapsedRealtime)) {
                        this.i = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // ax.l1.InterfaceC2445D
        public int d() {
            return this.i;
        }

        @Override // ax.l1.InterfaceC2445D
        public int n() {
            return 0;
        }

        @Override // ax.l1.InterfaceC2445D
        public Object q() {
            return null;
        }
    }

    static final class e {
        public final f.g a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(f.g gVar, long j, int i) {
            this.a = gVar;
            this.b = j;
            this.c = i;
            this.d = (gVar instanceof f.d) && ((f.d) gVar).n0;
        }
    }

    public c(ax.c1.e eVar, m mVar, Uri[] uriArr, C0912v[] c0912vArr, ax.c1.d dVar, z zVar, ax.c1.j jVar, long j, List<C0912v> list, I1 i1, ax.m1.f fVar) {
        this.a = eVar;
        this.g = mVar;
        this.e = uriArr;
        this.f = c0912vArr;
        this.d = jVar;
        this.l = j;
        this.i = list;
        this.k = i1;
        ax.U0.g a2 = dVar.a(1);
        this.b = a2;
        if (zVar != null) {
            a2.d(zVar);
        }
        this.c = dVar.a(3);
        this.h = new P(c0912vArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c0912vArr[i].f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.s = new d(this.h, C3218f.o(arrayList));
    }

    private static boolean A(boolean z, ax.d1.f fVar, long j, int i, androidx.media3.exoplayer.hls.e eVar, long j2, long j3) {
        if (!z || eVar == null) {
            return false;
        }
        if (j < fVar.k) {
            return true;
        }
        e h = h(fVar, j, i);
        return h != null && j2 + h.a.f0 < j3;
    }

    private void B(ax.d1.f fVar) {
        this.t = fVar.o ? -9223372036854775807L : fVar.e() - this.g.e();
    }

    private void b() {
        this.g.b(this.e[this.s.l()]);
    }

    private static Uri e(ax.d1.f fVar, f.g gVar) {
        String str;
        if (gVar == null || (str = gVar.h0) == null) {
            return null;
        }
        return O.d(fVar.a, str);
    }

    private Pair<Long, Integer> g(androidx.media3.exoplayer.hls.e eVar, boolean z, ax.d1.f fVar, long j, long j2) {
        if (eVar != null && !z) {
            if (!eVar.q()) {
                return new Pair<>(Long.valueOf(eVar.j), Integer.valueOf(eVar.o));
            }
            Long valueOf = Long.valueOf(eVar.o == -1 ? eVar.g() : eVar.j);
            int i = eVar.o;
            return new Pair<>(valueOf, Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = fVar.u + j;
        if (eVar != null && !this.r) {
            j2 = eVar.g;
        }
        if (!fVar.o && j2 >= j3) {
            return new Pair<>(Long.valueOf(fVar.k + fVar.r.size()), -1);
        }
        long j4 = j2 - j;
        int i2 = 0;
        int f = d0.f(fVar.r, Long.valueOf(j4), true, !this.g.g() || eVar == null);
        long j5 = f + fVar.k;
        if (f >= 0) {
            f.C0275f c0275f = fVar.r.get(f);
            List<f.d> list = j4 < c0275f.f0 + c0275f.d0 ? c0275f.n0 : fVar.s;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                f.d dVar = list.get(i2);
                if (j4 >= dVar.f0 + dVar.d0) {
                    i2++;
                } else if (dVar.m0) {
                    j5 += list == fVar.s ? 1L : 0L;
                    r1 = i2;
                }
            }
        }
        return new Pair<>(Long.valueOf(j5), Integer.valueOf(r1));
    }

    private static e h(ax.d1.f fVar, long j, int i) {
        int i2 = (int) (j - fVar.k);
        if (i2 == fVar.r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < fVar.s.size()) {
                return new e(fVar.s.get(i), j, i);
            }
            return null;
        }
        f.C0275f c0275f = fVar.r.get(i2);
        if (i == -1) {
            return new e(c0275f, j, -1);
        }
        if (i < c0275f.n0.size()) {
            return new e(c0275f.n0.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < fVar.r.size()) {
            return new e(fVar.r.get(i3), j + 1, -1);
        }
        if (fVar.s.isEmpty()) {
            return null;
        }
        return new e(fVar.s.get(0), j + 1, 0);
    }

    static List<f.g> k(ax.d1.f fVar, long j, int i) {
        int i2 = (int) (j - fVar.k);
        if (i2 < 0 || fVar.r.size() < i2) {
            return AbstractC2991z.z();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < fVar.r.size()) {
            if (i != -1) {
                f.C0275f c0275f = fVar.r.get(i2);
                if (i == 0) {
                    arrayList.add(c0275f);
                } else if (i < c0275f.n0.size()) {
                    List<f.d> list = c0275f.n0;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<f.C0275f> list2 = fVar.r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (fVar.n != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < fVar.s.size()) {
                List<f.d> list3 = fVar.s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static boolean o(e eVar, ax.d1.f fVar) {
        f.g gVar = eVar.a;
        if (!(gVar instanceof f.d)) {
            return fVar.c;
        }
        if (((f.d) gVar).m0) {
            return true;
        }
        return eVar.c == 0 && fVar.c;
    }

    private AbstractC2304b p(Uri uri, int i, boolean z, g.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] c = this.j.c(uri);
        if (c != null) {
            this.j.b(uri, c);
            return null;
        }
        return new a(this.c, new k.b().i(uri).b(1).a(), this.f[i], this.s.n(), this.s.q(), this.n);
    }

    private long w(long j) {
        long j2 = this.t;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public InterfaceC2307e[] a(androidx.media3.exoplayer.hls.e eVar, long j) {
        int c = eVar == null ? -1 : this.h.c(eVar.d);
        int length = this.s.length();
        InterfaceC2307e[] interfaceC2307eArr = new InterfaceC2307e[length];
        for (int i = 0; i < length; i++) {
            int j2 = this.s.j(i);
            Uri uri = this.e[j2];
            if (this.g.a(uri)) {
                ax.d1.f n = this.g.n(uri, false);
                C0968a.e(n);
                long e2 = n.h - this.g.e();
                Pair<Long, Integer> g = g(eVar, j2 != c, n, e2, j);
                interfaceC2307eArr[i] = new C0028c(n.a, e2, k(n, ((Long) g.first).longValue(), ((Integer) g.second).intValue()));
            } else {
                interfaceC2307eArr[i] = InterfaceC2307e.a;
            }
        }
        return interfaceC2307eArr;
    }

    public long c(long j, Z z) {
        int d2 = this.s.d();
        Uri[] uriArr = this.e;
        ax.d1.f n = (d2 >= uriArr.length || d2 == -1) ? null : this.g.n(uriArr[this.s.l()], true);
        if (n == null || n.r.isEmpty()) {
            return j;
        }
        long e2 = n.h - this.g.e();
        long j2 = j - e2;
        int f = d0.f(n.r, Long.valueOf(j2), true, true);
        long j3 = n.r.get(f).f0;
        return z.a(j2, j3, (!n.c || f == n.r.size() - 1) ? j3 : n.r.get(f + 1).f0) + e2;
    }

    public int d(androidx.media3.exoplayer.hls.e eVar) {
        if (eVar.o == -1) {
            return 1;
        }
        ax.d1.f fVar = (ax.d1.f) C0968a.e(this.g.n(this.e[this.h.c(eVar.d)], false));
        int i = (int) (eVar.j - fVar.k);
        if (i < 0) {
            return 1;
        }
        List<f.d> list = i < fVar.r.size() ? fVar.r.get(i).n0 : fVar.s;
        if (eVar.o >= list.size()) {
            return 2;
        }
        f.d dVar = list.get(eVar.o);
        if (dVar.n0) {
            return 0;
        }
        return Objects.equals(Uri.parse(O.c(fVar.a, dVar.q)), eVar.b.a) ? 1 : 2;
    }

    public void f(C0618p0 c0618p0, long j, long j2, List<androidx.media3.exoplayer.hls.e> list, boolean z, b bVar) {
        int i;
        int i2;
        long j3;
        boolean z2;
        e eVar;
        Uri uri;
        androidx.media3.exoplayer.hls.e eVar2 = list.isEmpty() ? null : (androidx.media3.exoplayer.hls.e) F.e(list);
        int c = eVar2 == null ? -1 : this.h.c(eVar2.d);
        long j4 = c0618p0.a;
        long j5 = j - j4;
        long w = w(j4);
        if (eVar2 != null && !this.r) {
            long d2 = eVar2.d();
            j5 = Math.max(0L, j5 - d2);
            if (w != -9223372036854775807L) {
                w = Math.max(0L, w - d2);
            }
        }
        this.s.c(j4, j5, w, list, a(eVar2, j));
        int l = this.s.l();
        boolean z3 = c != l;
        Uri uri2 = this.e[l];
        if (!this.g.a(uri2)) {
            bVar.c = uri2;
            this.q = uri2;
            return;
        }
        ax.d1.f n = this.g.n(uri2, true);
        C0968a.e(n);
        this.r = n.c;
        B(n);
        long e2 = n.h - this.g.e();
        Pair<Long, Integer> g = g(eVar2, z3, n, e2, j);
        long longValue = ((Long) g.first).longValue();
        int intValue = ((Integer) g.second).intValue();
        androidx.media3.exoplayer.hls.e eVar3 = eVar2;
        boolean z4 = z3;
        int i3 = c;
        Uri uri3 = uri2;
        ax.d1.f fVar = n;
        long j6 = longValue;
        if (A(z4, fVar, j6, intValue, eVar3, e2, j2)) {
            Uri uri4 = this.e[i3];
            ax.d1.f n2 = this.g.n(uri4, true);
            C0968a.e(n2);
            long e3 = n2.h - this.g.e();
            i = i3;
            i2 = -1;
            Pair<Long, Integer> g2 = g(eVar3, false, n2, e3, j);
            long longValue2 = ((Long) g2.first).longValue();
            intValue = ((Integer) g2.second).intValue();
            fVar = n2;
            uri3 = uri4;
            l = i;
            j6 = longValue2;
            j3 = e3;
        } else {
            i = i3;
            i2 = -1;
            j3 = e2;
        }
        if (l != i && i != i2) {
            this.g.b(this.e[i]);
        }
        if (j6 < fVar.k) {
            this.o = new C2212b();
            return;
        }
        e h = h(fVar, j6, intValue);
        if (h != null) {
            z2 = true;
            eVar = h;
            uri = null;
        } else if (!fVar.o) {
            bVar.c = uri3;
            this.q = uri3;
            return;
        } else if (z || fVar.r.isEmpty()) {
            bVar.b = true;
            return;
        } else {
            eVar = new e((f.g) F.e(fVar.r), (fVar.k + fVar.r.size()) - 1, i2);
            uri = null;
            z2 = true;
        }
        this.q = uri;
        this.u = SystemClock.elapsedRealtime();
        Uri e4 = e(fVar, eVar.a.c0);
        AbstractC2304b p = p(e4, l, z2, null);
        bVar.a = p;
        if (p == null) {
            Uri e5 = e(fVar, eVar.a);
            AbstractC2304b p2 = p(e5, l, false, null);
            bVar.a = p2;
            if (p2 == null) {
                boolean o = o(eVar, fVar);
                Uri uri5 = uri3;
                boolean y = androidx.media3.exoplayer.hls.e.y(eVar3, j, uri5, o, eVar, j3);
                if (y && eVar.d) {
                    return;
                }
                bVar.a = androidx.media3.exoplayer.hls.e.j(this.a, this.b, this.f[l], j3, fVar, eVar, uri5, this.i, this.s.n(), this.s.q(), this.m, this.d, this.l, eVar3, this.j.a(e5), this.j.a(e4), y, o, this.k, null);
            }
        }
    }

    public int i(long j, List<? extends AbstractC2306d> list) {
        return (this.o != null || this.s.length() < 2) ? list.size() : this.s.k(j, list);
    }

    public long j(androidx.media3.exoplayer.hls.e eVar) {
        C0968a.g(eVar.o != -1);
        ax.d1.f fVar = (ax.d1.f) C0968a.e(this.g.n(this.e[this.h.c(eVar.d)], false));
        int i = (int) (eVar.j - fVar.k);
        if (i < 0) {
            return 0L;
        }
        return (i < fVar.r.size() ? fVar.r.get(i).n0 : fVar.s).get(eVar.o).d0;
    }

    public P l() {
        return this.h;
    }

    public InterfaceC2445D m() {
        return this.s;
    }

    public boolean n() {
        return this.r;
    }

    public boolean q(AbstractC2304b abstractC2304b, long j) {
        InterfaceC2445D interfaceC2445D = this.s;
        return interfaceC2445D.o(interfaceC2445D.t(this.h.c(abstractC2304b.d)), j);
    }

    public void r() throws IOException {
        IOException iOException = this.o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.p;
        if (uri == null || !uri.equals(this.q)) {
            return;
        }
        this.g.c(this.p);
    }

    public boolean s(Uri uri) {
        return d0.s(this.e, uri);
    }

    public void t(AbstractC2304b abstractC2304b) {
        if (abstractC2304b instanceof a) {
            a aVar = (a) abstractC2304b;
            this.n = aVar.h();
            this.j.b(aVar.b.a, (byte[]) C0968a.e(aVar.j()));
        }
    }

    public boolean u(Uri uri, long j) {
        int t;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (t = this.s.t(i)) == -1) {
            return true;
        }
        this.p = uri;
        return j != -9223372036854775807L && this.s.o(t, j) && this.g.i(uri, j);
    }

    public void v() {
        b();
        this.o = null;
    }

    public void x(boolean z) {
        this.m = z;
    }

    public void y(InterfaceC2445D interfaceC2445D) {
        b();
        this.s = interfaceC2445D;
    }

    public boolean z(long j, AbstractC2304b abstractC2304b, List<? extends AbstractC2306d> list) {
        if (this.o != null) {
            return false;
        }
        return this.s.e(j, abstractC2304b, list);
    }
}
