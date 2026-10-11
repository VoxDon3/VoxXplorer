package ax.P3;

import android.util.Log;
import ax.N3.b;
import ax.P3.d;
import ax.U3.m;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class w implements d, b.a<Object>, d.a {
    private final d.a c0;
    private int d0;
    private a e0;
    private Object f0;
    private volatile m.a<?> g0;
    private b h0;
    private final e<?> q;

    public w(e<?> eVar, d.a aVar) {
        this.q = eVar;
        this.c0 = aVar;
    }

    private void b(Object obj) {
        long b = ax.k4.d.b();
        try {
            ax.M3.d<X> n = this.q.n(obj);
            c cVar = new c(n, obj, this.q.i());
            this.h0 = new b(this.g0.a, this.q.m());
            this.q.c().a(this.h0, cVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.h0 + ", data: " + obj + ", encoder: " + n + ", duration: " + ax.k4.d.a(b));
            }
            this.g0.c.b();
            this.e0 = new a(Collections.singletonList(this.g0.a), this.q, this);
        } catch (Throwable th) {
            this.g0.c.b();
            throw th;
        }
    }

    private boolean e() {
        return this.d0 < this.q.f().size();
    }

    @Override // ax.P3.d
    public boolean a() {
        Object obj = this.f0;
        if (obj != null) {
            this.f0 = null;
            b(obj);
        }
        a aVar = this.e0;
        if (aVar != null && aVar.a()) {
            return true;
        }
        this.e0 = null;
        this.g0 = null;
        boolean z = false;
        while (!z && e()) {
            List<m.a<?>> f = this.q.f();
            int i = this.d0;
            this.d0 = i + 1;
            this.g0 = f.get(i);
            if (this.g0 != null && (this.q.d().c(this.g0.c.d()) || this.q.q(this.g0.c.a()))) {
                this.g0.c.e(this.q.j(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // ax.N3.b.a
    public void c(Exception exc) {
        this.c0.j(this.h0, exc, this.g0.c, this.g0.c.d());
    }

    @Override // ax.P3.d
    public void cancel() {
        m.a<?> aVar = this.g0;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // ax.P3.d.a
    public void d(ax.M3.h hVar, Object obj, ax.N3.b<?> bVar, ax.M3.a aVar, ax.M3.h hVar2) {
        this.c0.d(hVar, obj, bVar, this.g0.c.d(), hVar);
    }

    @Override // ax.N3.b.a
    public void f(Object obj) {
        h d = this.q.d();
        if (obj == null || !d.c(this.g0.c.d())) {
            this.c0.d(this.g0.a, obj, this.g0.c, this.g0.c.d(), this.h0);
        } else {
            this.f0 = obj;
            this.c0.h();
        }
    }

    @Override // ax.P3.d.a
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override // ax.P3.d.a
    public void j(ax.M3.h hVar, Exception exc, ax.N3.b<?> bVar, ax.M3.a aVar) {
        this.c0.j(hVar, exc, bVar, this.g0.c.d());
    }
}
