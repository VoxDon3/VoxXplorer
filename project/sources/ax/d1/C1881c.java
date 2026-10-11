package ax.d1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.U0.k;
import ax.U0.u;
import ax.d1.C1881c;
import ax.d1.f;
import ax.d1.i;
import ax.d1.k;
import ax.d1.m;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.N;
import ax.m1.m;
import ax.m1.o;
import ax.m1.p;
import ax.r7.F;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ax.d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881c implements m, o.b<p<j>> {
    public static final m.a q0 = new m.a() { // from class: ax.d1.b
        @Override // ax.d1.m.a
        public final m a(ax.c1.d dVar, ax.m1.m mVar, l lVar, ax.m1.f fVar) {
            return new C1881c(dVar, mVar, lVar, fVar);
        }
    };
    private final l c0;
    private final ax.m1.m d0;
    private final HashMap<Uri, C0274c> e0;
    private final CopyOnWriteArrayList<m.b> f0;
    private final double g0;
    private N.a h0;
    private o i0;
    private Handler j0;
    private m.e k0;
    private i l0;
    private Uri m0;
    private f n0;
    private boolean o0;
    private long p0;
    private final ax.c1.d q;

    /* renamed from: ax.d1.c$b */
    private class b implements m.b {
        private b() {
        }

        @Override // ax.d1.m.b
        public void f() {
            C1881c.this.f0.remove(this);
        }

        @Override // ax.d1.m.b
        public boolean h(Uri uri, m.c cVar, boolean z) {
            C0274c c0274c;
            if (C1881c.this.n0 == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<i.b> list = ((i) d0.i(C1881c.this.l0)).e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C0274c c0274c2 = (C0274c) C1881c.this.e0.get(list.get(i2).a);
                    if (c0274c2 != null && elapsedRealtime < c0274c2.i0) {
                        i++;
                    }
                }
                m.b d = C1881c.this.d0.d(new m.a(1, 0, C1881c.this.l0.e.size(), i), cVar);
                if (d != null && d.a == 2 && (c0274c = (C0274c) C1881c.this.e0.get(uri)) != null) {
                    c0274c.h(d.b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.d1.c$c, reason: collision with other inner class name */
    final class C0274c implements o.b<p<j>> {
        private final o c0 = new o("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final ax.U0.g d0;
        private f e0;
        private long f0;
        private long g0;
        private long h0;
        private long i0;
        private boolean j0;
        private IOException k0;
        private boolean l0;
        private final Uri q;

        public C0274c(Uri uri) {
            this.q = uri;
            this.d0 = C1881c.this.q.a(4);
        }

        public static /* synthetic */ void a(C0274c c0274c, Uri uri) {
            c0274c.j0 = false;
            c0274c.q(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j) {
            this.i0 = SystemClock.elapsedRealtime() + j;
            return this.q.equals(C1881c.this.m0) && !C1881c.this.P();
        }

        private Uri i() {
            f fVar = this.e0;
            if (fVar != null) {
                f.h hVar = fVar.v;
                if (hVar.a != -9223372036854775807L || hVar.e) {
                    Uri.Builder buildUpon = this.q.buildUpon();
                    f fVar2 = this.e0;
                    if (fVar2.v.e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.k + fVar2.r.size()));
                        f fVar3 = this.e0;
                        if (fVar3.n != -9223372036854775807L) {
                            List<f.d> list = fVar3.s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) F.e(list)).n0) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.e0.v;
                    if (hVar2.a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", hVar2.b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.q;
        }

        private void q(Uri uri) {
            p.a<j> a = C1881c.this.c0.a(C1881c.this.l0, this.e0);
            ax.U0.k a2 = new k.b().i(uri).b(1).a();
            C1881c.v(C1881c.this);
            p pVar = new p(this.d0, a2, 4, a);
            this.c0.n(pVar, this, C1881c.this.d0.c(pVar.c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(final Uri uri) {
            this.i0 = 0L;
            if (this.j0 || this.c0.i() || this.c0.h()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.h0) {
                q(uri);
            } else {
                this.j0 = true;
                C1881c.this.j0.postDelayed(new Runnable() { // from class: ax.d1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1881c.C0274c.a(C1881c.C0274c.this, uri);
                    }
                }, this.h0 - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(f fVar, C2234y c2234y) {
            boolean z;
            long j;
            f fVar2 = this.e0;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f0 = elapsedRealtime;
            f J = C1881c.this.J(fVar2, fVar);
            this.e0 = J;
            IOException iOException = null;
            if (J != fVar2) {
                this.k0 = null;
                this.g0 = elapsedRealtime;
                C1881c.this.W(this.q, J);
            } else if (!J.o) {
                if (fVar.k + fVar.r.size() < this.e0.k) {
                    iOException = new m.c(this.q);
                    z = true;
                } else {
                    double d = elapsedRealtime - this.g0;
                    double E1 = d0.E1(r12.m) * C1881c.this.g0;
                    z = false;
                    if (d > E1) {
                        iOException = new m.d(this.q);
                    }
                }
                if (iOException != null) {
                    this.k0 = iOException;
                    C1881c.this.R(this.q, new m.c(c2234y, new C2205B(4), iOException, 1), z);
                }
            }
            f fVar3 = this.e0;
            if (!fVar3.v.e) {
                j = fVar3 != fVar2 ? fVar3.m : fVar3.m / 2;
            } else if (fVar3 == fVar2) {
                long j2 = fVar3.n;
                j = j2 != -9223372036854775807L ? j2 / 2 : fVar3.m / 2;
            } else {
                j = 0;
            }
            this.h0 = (elapsedRealtime + d0.E1(j)) - c2234y.f;
            if (this.e0.o) {
                return;
            }
            if (this.q.equals(C1881c.this.m0) || this.l0) {
                s(i());
            }
        }

        public void A(boolean z) {
            this.l0 = z;
        }

        public f l() {
            return this.e0;
        }

        public boolean m() {
            return this.l0;
        }

        public boolean n() {
            int i;
            if (this.e0 == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, d0.E1(this.e0.u));
            f fVar = this.e0;
            return fVar.o || (i = fVar.d) == 2 || i == 1 || this.f0 + max > elapsedRealtime;
        }

        public void o(boolean z) {
            s(z ? i() : this.q);
        }

        public void t() throws IOException {
            this.c0.j();
            IOException iOException = this.k0;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // ax.m1.o.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void p(p<j> pVar, long j, long j2, boolean z) {
            C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
            C1881c.this.d0.a(pVar.a);
            C1881c.this.h0.l(c2234y, 4);
        }

        @Override // ax.m1.o.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void r(p<j> pVar, long j, long j2) {
            j e = pVar.e();
            C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
            if (e instanceof f) {
                y((f) e, c2234y);
                C1881c.this.h0.o(c2234y, 4);
            } else {
                this.k0 = E.c("Loaded playlist has unexpected type.", null);
                C1881c.this.h0.s(c2234y, 4, this.k0, true);
            }
            C1881c.this.d0.a(pVar.a);
        }

        @Override // ax.m1.o.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public o.c j(p<j> pVar, long j, long j2, IOException iOException, int i) {
            o.c cVar;
            C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
            boolean z = iOException instanceof k.a;
            if ((pVar.f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof u ? ((u) iOException).e0 : SubsamplingScaleImageView.TILE_SIZE_AUTO;
                if (z || i2 == 400 || i2 == 503) {
                    this.h0 = SystemClock.elapsedRealtime();
                    o(false);
                    ((N.a) d0.i(C1881c.this.h0)).s(c2234y, pVar.c, iOException, true);
                    return o.f;
                }
            }
            m.c cVar2 = new m.c(c2234y, new C2205B(pVar.c), iOException, i);
            if (C1881c.this.R(this.q, cVar2, false)) {
                long b = C1881c.this.d0.b(cVar2);
                cVar = b != -9223372036854775807L ? o.g(false, b) : o.g;
            } else {
                cVar = o.f;
            }
            boolean c = cVar.c();
            C1881c.this.h0.s(c2234y, pVar.c, iOException, !c);
            if (!c) {
                C1881c.this.d0.a(pVar.a);
            }
            return cVar;
        }

        @Override // ax.m1.o.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void k(p<j> pVar, long j, long j2, int i) {
            C1881c.this.h0.u(i == 0 ? new C2234y(pVar.a, pVar.b, j) : new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b()), pVar.c, i);
        }

        public void z() {
            this.c0.l();
        }
    }

    public C1881c(ax.c1.d dVar, ax.m1.m mVar, l lVar, ax.m1.f fVar) {
        this(dVar, mVar, lVar, fVar, 3.5d);
    }

    private void H(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.e0.put(uri, new C0274c(uri));
        }
    }

    private static f.C0275f I(f fVar, f fVar2) {
        int i = (int) (fVar2.k - fVar.k);
        List<f.C0275f> list = fVar.r;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f J(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.o ? fVar.d() : fVar : fVar2.c(L(fVar, fVar2), K(fVar, fVar2));
    }

    private int K(f fVar, f fVar2) {
        f.C0275f I;
        if (fVar2.i) {
            return fVar2.j;
        }
        f fVar3 = this.n0;
        return (fVar == null || (I = I(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.j : 0 : (fVar.j + I.e0) - fVar2.r.get(0).e0;
    }

    private long L(f fVar, f fVar2) {
        if (fVar2.p) {
            return fVar2.h;
        }
        f fVar3 = this.n0;
        long j = fVar3 != null ? fVar3.h : 0L;
        if (fVar != null) {
            int size = fVar.r.size();
            f.C0275f I = I(fVar, fVar2);
            if (I != null) {
                return fVar.h + I.f0;
            }
            if (size == fVar2.k - fVar.k) {
                return fVar.e();
            }
        }
        return j;
    }

    private Uri M(Uri uri) {
        f.e eVar;
        f fVar = this.n0;
        if (fVar == null || !fVar.v.e || (eVar = fVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.b));
        int i = eVar.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    private boolean N(Uri uri) {
        List<i.b> list = this.l0.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).a)) {
                return true;
            }
        }
        return false;
    }

    private void O(Uri uri) {
        C0274c c0274c = this.e0.get(uri);
        f l = c0274c.l();
        if (c0274c.m()) {
            return;
        }
        c0274c.A(true);
        if (l == null || l.o) {
            return;
        }
        c0274c.o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        List<i.b> list = this.l0.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0274c c0274c = (C0274c) C0968a.e(this.e0.get(list.get(i).a));
            if (elapsedRealtime > c0274c.i0) {
                Uri uri = c0274c.q;
                this.m0 = uri;
                c0274c.s(M(uri));
                return true;
            }
        }
        return false;
    }

    private void Q(Uri uri) {
        if (uri.equals(this.m0) || !N(uri)) {
            return;
        }
        f fVar = this.n0;
        if (fVar == null || !fVar.o) {
            this.m0 = uri;
            C0274c c0274c = this.e0.get(uri);
            f fVar2 = c0274c.e0;
            if (fVar2 == null || !fVar2.o) {
                c0274c.s(M(uri));
            } else {
                this.n0 = fVar2;
                this.k0.f(fVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(Uri uri, m.c cVar, boolean z) {
        Iterator<m.b> it = this.f0.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().h(uri, cVar, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Uri uri, f fVar) {
        if (uri.equals(this.m0)) {
            if (this.n0 == null) {
                this.o0 = !fVar.o;
                this.p0 = fVar.h;
            }
            this.n0 = fVar;
            this.k0.f(fVar);
        }
        Iterator<m.b> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    static /* synthetic */ ax.m1.f v(C1881c c1881c) {
        c1881c.getClass();
        return null;
    }

    @Override // ax.m1.o.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void p(p<j> pVar, long j, long j2, boolean z) {
        C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
        this.d0.a(pVar.a);
        this.h0.l(c2234y, 4);
    }

    @Override // ax.m1.o.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void r(p<j> pVar, long j, long j2) {
        j e = pVar.e();
        boolean z = e instanceof f;
        i e2 = z ? i.e(e.a) : (i) e;
        this.l0 = e2;
        this.m0 = e2.e.get(0).a;
        this.f0.add(new b());
        H(e2.d);
        C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
        C0274c c0274c = this.e0.get(this.m0);
        if (z) {
            c0274c.y((f) e, c2234y);
        } else {
            c0274c.o(false);
        }
        this.d0.a(pVar.a);
        this.h0.o(c2234y, 4);
    }

    @Override // ax.m1.o.b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public o.c j(p<j> pVar, long j, long j2, IOException iOException, int i) {
        C2234y c2234y = new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b());
        long b2 = this.d0.b(new m.c(c2234y, new C2205B(pVar.c), iOException, i));
        boolean z = b2 == -9223372036854775807L;
        this.h0.s(c2234y, pVar.c, iOException, z);
        if (z) {
            this.d0.a(pVar.a);
        }
        return z ? o.g : o.g(false, b2);
    }

    @Override // ax.m1.o.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void k(p<j> pVar, long j, long j2, int i) {
        this.h0.u(i == 0 ? new C2234y(pVar.a, pVar.b, j) : new C2234y(pVar.a, pVar.b, pVar.f(), pVar.d(), j, j2, pVar.b()), pVar.c, i);
    }

    @Override // ax.d1.m
    public boolean a(Uri uri) {
        return this.e0.get(uri).n();
    }

    @Override // ax.d1.m
    public void b(Uri uri) {
        C0274c c0274c = this.e0.get(uri);
        if (c0274c != null) {
            c0274c.A(false);
        }
    }

    @Override // ax.d1.m
    public void c(Uri uri) throws IOException {
        this.e0.get(uri).t();
    }

    @Override // ax.d1.m
    public void d(Uri uri, N.a aVar, m.e eVar) {
        this.j0 = d0.A();
        this.h0 = aVar;
        this.k0 = eVar;
        p pVar = new p(this.q.a(4), new k.b().i(uri).b(1).a(), 4, this.c0.b());
        C0968a.g(this.i0 == null);
        o oVar = new o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.i0 = oVar;
        oVar.n(pVar, this, this.d0.c(pVar.c));
    }

    @Override // ax.d1.m
    public long e() {
        return this.p0;
    }

    @Override // ax.d1.m
    public void f(m.b bVar) {
        this.f0.remove(bVar);
    }

    @Override // ax.d1.m
    public boolean g() {
        return this.o0;
    }

    @Override // ax.d1.m
    public i h() {
        return this.l0;
    }

    @Override // ax.d1.m
    public boolean i(Uri uri, long j) {
        if (this.e0.get(uri) != null) {
            return !r2.h(j);
        }
        return false;
    }

    @Override // ax.d1.m
    public void l() throws IOException {
        o oVar = this.i0;
        if (oVar != null) {
            oVar.j();
        }
        Uri uri = this.m0;
        if (uri != null) {
            c(uri);
        }
    }

    @Override // ax.d1.m
    public void m(Uri uri) {
        this.e0.get(uri).o(true);
    }

    @Override // ax.d1.m
    public f n(Uri uri, boolean z) {
        f l = this.e0.get(uri).l();
        if (l != null && z) {
            Q(uri);
            O(uri);
        }
        return l;
    }

    @Override // ax.d1.m
    public void o(m.b bVar) {
        C0968a.e(bVar);
        this.f0.add(bVar);
    }

    @Override // ax.d1.m
    public void stop() {
        this.m0 = null;
        this.n0 = null;
        this.l0 = null;
        this.p0 = -9223372036854775807L;
        this.i0.l();
        this.i0 = null;
        Iterator<C0274c> it = this.e0.values().iterator();
        while (it.hasNext()) {
            it.next().z();
        }
        this.j0.removeCallbacksAndMessages(null);
        this.j0 = null;
        this.e0.clear();
    }

    public C1881c(ax.c1.d dVar, ax.m1.m mVar, l lVar, ax.m1.f fVar, double d) {
        this.q = dVar;
        this.c0 = lVar;
        this.d0 = mVar;
        this.g0 = d;
        this.f0 = new CopyOnWriteArrayList<>();
        this.e0 = new HashMap<>();
        this.p0 = -9223372036854775807L;
    }
}
