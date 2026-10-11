package ax.J3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import ax.d4.c;
import ax.d4.m;
import ax.d4.n;
import ax.d4.p;
import ax.g4.C2117f;
import ax.g4.InterfaceC2113b;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j implements ax.d4.i {
    private static final C2117f k0 = C2117f.h(Bitmap.class).N();
    private static final C2117f l0 = C2117f.h(ax.b4.c.class).N();
    private static final C2117f m0 = C2117f.j(ax.P3.h.c).R(g.LOW).X(true);
    final ax.d4.h c0;
    private final n d0;
    private final m e0;
    private final p f0;
    private final Runnable g0;
    private final Handler h0;
    private final ax.d4.c i0;
    private C2117f j0;
    protected final ax.J3.c q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.c0.b(jVar);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ax.h4.e q;

        b(ax.h4.e eVar) {
            this.q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.o(this.q);
        }
    }

    private static class c implements c.a {
        private final n a;

        public c(n nVar) {
            this.a = nVar;
        }

        @Override // ax.d4.c.a
        public void a(boolean z) {
            if (z) {
                this.a.d();
            }
        }
    }

    public j(ax.J3.c cVar, ax.d4.h hVar, m mVar) {
        this(cVar, hVar, mVar, new n(), cVar.g());
    }

    private void w(ax.h4.e<?> eVar) {
        if (v(eVar)) {
            return;
        }
        this.q.o(eVar);
    }

    @Override // ax.d4.i
    public void a() {
        r();
        this.f0.a();
    }

    @Override // ax.d4.i
    public void b() {
        s();
        this.f0.b();
    }

    @Override // ax.d4.i
    public void f() {
        this.f0.f();
        Iterator<ax.h4.e<?>> it = this.f0.m().iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        this.f0.h();
        this.d0.b();
        this.c0.a(this);
        this.c0.a(this.i0);
        this.h0.removeCallbacks(this.g0);
        this.q.q(this);
    }

    public <ResourceType> i<ResourceType> h(Class<ResourceType> cls) {
        return new i<>(this.q, this, cls);
    }

    public i<Bitmap> m() {
        return h(Bitmap.class).b(k0);
    }

    public i<ax.b4.c> n() {
        return h(ax.b4.c.class).b(l0);
    }

    public void o(ax.h4.e<?> eVar) {
        if (eVar == null) {
            return;
        }
        if (ax.k4.i.p()) {
            w(eVar);
        } else {
            this.h0.post(new b(eVar));
        }
    }

    C2117f p() {
        return this.j0;
    }

    <T> k<?, T> q(Class<T> cls) {
        return this.q.i().b(cls);
    }

    public void r() {
        ax.k4.i.b();
        this.d0.c();
    }

    public void s() {
        ax.k4.i.b();
        this.d0.e();
    }

    protected void t(C2117f c2117f) {
        this.j0 = c2117f.clone().c();
    }

    public String toString() {
        return super.toString() + "{tracker=" + this.d0 + ", treeNode=" + this.e0 + "}";
    }

    void u(ax.h4.e<?> eVar, InterfaceC2113b interfaceC2113b) {
        this.f0.n(eVar);
        this.d0.f(interfaceC2113b);
    }

    boolean v(ax.h4.e<?> eVar) {
        InterfaceC2113b k = eVar.k();
        if (k == null) {
            return true;
        }
        if (!this.d0.a(k)) {
            return false;
        }
        this.f0.o(eVar);
        eVar.e(null);
        return true;
    }

    j(ax.J3.c cVar, ax.d4.h hVar, m mVar, n nVar, ax.d4.d dVar) {
        this.f0 = new p();
        a aVar = new a();
        this.g0 = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.h0 = handler;
        this.q = cVar;
        this.c0 = hVar;
        this.e0 = mVar;
        this.d0 = nVar;
        ax.d4.c a2 = dVar.a(cVar.i().getBaseContext(), new c(nVar));
        this.i0 = a2;
        if (ax.k4.i.o()) {
            handler.post(aVar);
        } else {
            hVar.b(this);
        }
        hVar.b(a2);
        t(cVar.i().a());
        cVar.n(this);
    }
}
