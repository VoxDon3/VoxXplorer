package ax.P3;

import android.os.Build;
import android.util.Log;
import ax.J3.h;
import ax.P3.d;
import ax.P3.g;
import ax.b0.InterfaceC1443d;
import ax.l4.AbstractC2469b;
import ax.l4.C2468a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
class f<R> implements d.a, Runnable, Comparable<f<?>>, C2468a.f {
    private ax.M3.a A0;
    private ax.N3.b<?> B0;
    private volatile ax.P3.d C0;
    private volatile boolean D0;
    private volatile boolean E0;
    private final e e0;
    private final InterfaceC1443d<f<?>> f0;
    private ax.J3.e i0;
    ax.M3.h j0;
    private ax.J3.g k0;
    private l l0;
    int m0;
    int n0;
    ax.P3.h o0;
    ax.M3.j p0;
    private b<R> q0;
    private int r0;
    private h s0;
    private g t0;
    private long u0;
    private boolean v0;
    private Thread w0;
    ax.M3.h x0;
    private ax.M3.h y0;
    private Object z0;
    final ax.P3.e<R> q = new ax.P3.e<>();
    private final List<Exception> c0 = new ArrayList();
    private final AbstractC2469b d0 = AbstractC2469b.a();
    final d<?> g0 = new d<>();
    private final C0168f h0 = new C0168f();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[h.values().length];
            b = iArr;
            try {
                iArr[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[g.values().length];
            a = iArr2;
            try {
                iArr2[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    interface b<R> {
        void a(o oVar);

        void b(s<R> sVar, ax.M3.a aVar);

        void c(f<?> fVar);
    }

    private final class c<Z> implements g.a<Z> {
        private final ax.M3.a a;

        c(ax.M3.a aVar) {
            this.a = aVar;
        }

        private Class<Z> b(s<Z> sVar) {
            return (Class<Z>) sVar.get().getClass();
        }

        @Override // ax.P3.g.a
        public s<Z> a(s<Z> sVar) {
            s<Z> sVar2;
            ax.M3.m<Z> mVar;
            ax.M3.c cVar;
            ax.M3.h uVar;
            Class<Z> b = b(sVar);
            ax.M3.l<Z> lVar = null;
            if (this.a != ax.M3.a.RESOURCE_DISK_CACHE) {
                ax.M3.m<Z> o = f.this.q.o(b);
                ax.J3.e eVar = f.this.i0;
                f fVar = f.this;
                mVar = o;
                sVar2 = o.b(eVar, sVar, fVar.m0, fVar.n0);
            } else {
                sVar2 = sVar;
                mVar = null;
            }
            if (!sVar.equals(sVar2)) {
                sVar.recycle();
            }
            if (f.this.q.s(sVar2)) {
                lVar = f.this.q.l(sVar2);
                cVar = lVar.b(f.this.p0);
            } else {
                cVar = ax.M3.c.NONE;
            }
            ax.M3.l lVar2 = lVar;
            f fVar2 = f.this;
            if (!f.this.o0.d(!fVar2.q.u(fVar2.x0), this.a, cVar)) {
                return sVar2;
            }
            if (lVar2 == null) {
                throw new h.d(sVar2.get().getClass());
            }
            if (cVar == ax.M3.c.SOURCE) {
                f fVar3 = f.this;
                uVar = new ax.P3.b(fVar3.x0, fVar3.j0);
            } else {
                if (cVar != ax.M3.c.TRANSFORMED) {
                    throw new IllegalArgumentException("Unknown strategy: " + cVar);
                }
                f fVar4 = f.this;
                uVar = new u(fVar4.x0, fVar4.j0, fVar4.m0, fVar4.n0, mVar, b, fVar4.p0);
            }
            r c = r.c(sVar2);
            f.this.g0.d(uVar, lVar2, c);
            return c;
        }
    }

    private static class d<Z> {
        private ax.M3.h a;
        private ax.M3.l<Z> b;
        private r<Z> c;

        d() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void b(e eVar, ax.M3.j jVar) {
            ax.Y.u.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new ax.P3.c(this.b, this.c, jVar));
            } finally {
                this.c.e();
                ax.Y.u.b();
            }
        }

        boolean c() {
            return this.c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(ax.M3.h hVar, ax.M3.l<X> lVar, r<X> rVar) {
            this.a = hVar;
            this.b = lVar;
            this.c = rVar;
        }
    }

    interface e {
        ax.R3.a a();
    }

    /* renamed from: ax.P3.f$f, reason: collision with other inner class name */
    private static class C0168f {
        private boolean a;
        private boolean b;
        private boolean c;

        C0168f() {
        }

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    f(e eVar, InterfaceC1443d<f<?>> interfaceC1443d) {
        this.e0 = eVar;
        this.f0 = interfaceC1443d;
    }

    private int A() {
        return this.k0.ordinal();
    }

    private void C(String str, long j) {
        D(str, j, null);
    }

    private void D(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(ax.k4.d.a(j));
        sb.append(", load key: ");
        sb.append(this.l0);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void E(s<R> sVar, ax.M3.a aVar) {
        O();
        this.q0.b(sVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F(s<R> sVar, ax.M3.a aVar) {
        r rVar;
        if (sVar instanceof p) {
            ((p) sVar).a();
        }
        if (this.g0.c()) {
            sVar = r.c(sVar);
            rVar = sVar;
        } else {
            rVar = 0;
        }
        E(sVar, aVar);
        this.s0 = h.ENCODE;
        try {
            if (this.g0.c()) {
                this.g0.b(this.e0, this.p0);
            }
        } finally {
            if (rVar != 0) {
                rVar.e();
            }
            H();
        }
    }

    private void G() {
        O();
        this.q0.a(new o("Failed to load resource", new ArrayList(this.c0)));
        I();
    }

    private void H() {
        if (this.h0.b()) {
            K();
        }
    }

    private void I() {
        if (this.h0.c()) {
            K();
        }
    }

    private void K() {
        this.h0.e();
        this.g0.a();
        this.q.a();
        this.D0 = false;
        this.i0 = null;
        this.j0 = null;
        this.p0 = null;
        this.k0 = null;
        this.l0 = null;
        this.q0 = null;
        this.s0 = null;
        this.C0 = null;
        this.w0 = null;
        this.x0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.u0 = 0L;
        this.E0 = false;
        this.c0.clear();
        this.f0.a(this);
    }

    private void L() {
        this.w0 = Thread.currentThread();
        this.u0 = ax.k4.d.b();
        boolean z = false;
        while (!this.E0 && this.C0 != null && !(z = this.C0.a())) {
            this.s0 = w(this.s0);
            this.C0 = u();
            if (this.s0 == h.SOURCE) {
                h();
                return;
            }
        }
        if ((this.s0 == h.FINISHED || this.E0) && !z) {
            G();
        }
    }

    private <Data, ResourceType> s<R> M(Data data, ax.M3.a aVar, q<Data, ResourceType, R> qVar) throws o {
        ax.M3.j x = x(aVar);
        ax.N3.c<Data> i = this.i0.f().i(data);
        try {
            return qVar.a(i, x, this.m0, this.n0, new c(aVar));
        } finally {
            i.b();
        }
    }

    private void N() {
        int i = a.a[this.t0.ordinal()];
        if (i == 1) {
            this.s0 = w(h.INITIALIZE);
            this.C0 = u();
            L();
        } else if (i == 2) {
            L();
        } else {
            if (i == 3) {
                t();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.t0);
        }
    }

    private void O() {
        this.d0.c();
        if (this.D0) {
            throw new IllegalStateException("Already notified");
        }
        this.D0 = true;
    }

    private <Data> s<R> r(ax.N3.b<?> bVar, Data data, ax.M3.a aVar) throws o {
        if (data == null) {
            bVar.b();
            return null;
        }
        try {
            long b2 = ax.k4.d.b();
            s<R> s = s(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                C("Decoded result " + s, b2);
            }
            return s;
        } finally {
            bVar.b();
        }
    }

    private <Data> s<R> s(Data data, ax.M3.a aVar) throws o {
        return M(data, aVar, this.q.g(data.getClass()));
    }

    private void t() {
        s<R> sVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            D("Retrieved data", this.u0, "data: " + this.z0 + ", cache key: " + this.x0 + ", fetcher: " + this.B0);
        }
        try {
            sVar = r(this.B0, this.z0, this.A0);
        } catch (o e2) {
            e2.i(this.y0, this.A0);
            this.c0.add(e2);
            sVar = null;
        }
        if (sVar != null) {
            F(sVar, this.A0);
        } else {
            L();
        }
    }

    private ax.P3.d u() {
        int i = a.b[this.s0.ordinal()];
        if (i == 1) {
            return new t(this.q, this);
        }
        if (i == 2) {
            return new ax.P3.a(this.q, this);
        }
        if (i == 3) {
            return new w(this.q, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.s0);
    }

    private h w(h hVar) {
        int i = a.b[hVar.ordinal()];
        if (i == 1) {
            return this.o0.a() ? h.DATA_CACHE : w(h.DATA_CACHE);
        }
        if (i == 2) {
            return this.v0 ? h.FINISHED : h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return h.FINISHED;
        }
        if (i == 5) {
            return this.o0.b() ? h.RESOURCE_CACHE : w(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    private ax.M3.j x(ax.M3.a aVar) {
        ax.M3.j jVar = this.p0;
        if (Build.VERSION.SDK_INT < 26) {
            return jVar;
        }
        ax.M3.i<Boolean> iVar = ax.X3.i.i;
        if (jVar.c(iVar) != null || (aVar != ax.M3.a.RESOURCE_DISK_CACHE && !this.q.t())) {
            return jVar;
        }
        ax.M3.j jVar2 = new ax.M3.j();
        jVar2.d(this.p0);
        jVar2.e(iVar, Boolean.TRUE);
        return jVar2;
    }

    f<R> B(ax.J3.e eVar, Object obj, l lVar, ax.M3.h hVar, int i, int i2, Class<?> cls, Class<R> cls2, ax.J3.g gVar, ax.P3.h hVar2, Map<Class<?>, ax.M3.m<?>> map, boolean z, boolean z2, boolean z3, ax.M3.j jVar, b<R> bVar, int i3) {
        this.q.r(eVar, obj, hVar, i, i2, hVar2, cls, cls2, gVar, jVar, map, z, z2, this.e0);
        this.i0 = eVar;
        this.j0 = hVar;
        this.k0 = gVar;
        this.l0 = lVar;
        this.m0 = i;
        this.n0 = i2;
        this.o0 = hVar2;
        this.v0 = z3;
        this.p0 = jVar;
        this.q0 = bVar;
        this.r0 = i3;
        this.t0 = g.INITIALIZE;
        return this;
    }

    void J(boolean z) {
        if (this.h0.d(z)) {
            K();
        }
    }

    boolean P() {
        h w = w(h.INITIALIZE);
        return w == h.RESOURCE_CACHE || w == h.DATA_CACHE;
    }

    @Override // ax.P3.d.a
    public void d(ax.M3.h hVar, Object obj, ax.N3.b<?> bVar, ax.M3.a aVar, ax.M3.h hVar2) {
        this.x0 = hVar;
        this.z0 = obj;
        this.B0 = bVar;
        this.A0 = aVar;
        this.y0 = hVar2;
        if (Thread.currentThread() != this.w0) {
            this.t0 = g.DECODE_DATA;
            this.q0.c(this);
        } else {
            ax.Y.u.a("DecodeJob.decodeFromRetrievedData");
            try {
                t();
            } finally {
                ax.Y.u.b();
            }
        }
    }

    @Override // ax.P3.d.a
    public void h() {
        this.t0 = g.SWITCH_TO_SOURCE_SERVICE;
        this.q0.c(this);
    }

    @Override // ax.P3.d.a
    public void j(ax.M3.h hVar, Exception exc, ax.N3.b<?> bVar, ax.M3.a aVar) {
        bVar.b();
        o oVar = new o("Fetching data failed", exc);
        oVar.j(hVar, aVar, bVar.a());
        this.c0.add(oVar);
        if (Thread.currentThread() == this.w0) {
            L();
        } else {
            this.t0 = g.SWITCH_TO_SOURCE_SERVICE;
            this.q0.c(this);
        }
    }

    @Override // ax.l4.C2468a.f
    public AbstractC2469b l() {
        return this.d0;
    }

    public void p() {
        this.E0 = true;
        ax.P3.d dVar = this.C0;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(f<?> fVar) {
        int A = A() - fVar.A();
        return A == 0 ? this.r0 - fVar.r0 : A;
    }

    @Override // java.lang.Runnable
    public void run() {
        ax.Y.u.a("DecodeJob#run");
        try {
            try {
                if (this.E0) {
                    G();
                    ax.N3.b<?> bVar = this.B0;
                    if (bVar != null) {
                        bVar.b();
                    }
                    ax.Y.u.b();
                    return;
                }
                N();
                ax.N3.b<?> bVar2 = this.B0;
                if (bVar2 != null) {
                    bVar2.b();
                }
                ax.Y.u.b();
            } catch (RuntimeException e2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E0 + ", stage: " + this.s0, e2);
                }
                if (this.s0 != h.ENCODE) {
                    G();
                }
                if (!this.E0) {
                    throw e2;
                }
                ax.N3.b<?> bVar3 = this.B0;
                if (bVar3 != null) {
                    bVar3.b();
                }
                ax.Y.u.b();
            }
        } catch (Throwable th) {
            ax.N3.b<?> bVar4 = this.B0;
            if (bVar4 != null) {
                bVar4.b();
            }
            ax.Y.u.b();
            throw th;
        }
    }
}
