package ax.P3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.P3.f;
import ax.b0.InterfaceC1443d;
import ax.g4.InterfaceC2118g;
import ax.l4.AbstractC2469b;
import ax.l4.C2468a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class j<R> implements f.b<R>, C2468a.f {
    private static final a v0 = new a();
    private static final Handler w0 = new Handler(Looper.getMainLooper(), new b());
    private final AbstractC2469b c0;
    private final InterfaceC1443d<j<?>> d0;
    private final a e0;
    private final k f0;
    private final ax.S3.a g0;
    private final ax.S3.a h0;
    private final ax.S3.a i0;
    private ax.M3.h j0;
    private boolean k0;
    private boolean l0;
    private s<?> m0;
    private ax.M3.a n0;
    private boolean o0;
    private o p0;
    private final List<InterfaceC2118g> q;
    private boolean q0;
    private List<InterfaceC2118g> r0;
    private n<?> s0;
    private f<R> t0;
    private volatile boolean u0;

    static class a {
        a() {
        }

        public <R> n<R> a(s<R> sVar, boolean z) {
            return new n<>(sVar, z);
        }
    }

    private static class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            j jVar = (j) message.obj;
            int i = message.what;
            if (i == 1) {
                jVar.j();
            } else if (i == 2) {
                jVar.i();
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unrecognized message: " + message.what);
                }
                jVar.h();
            }
            return true;
        }
    }

    j(ax.S3.a aVar, ax.S3.a aVar2, ax.S3.a aVar3, k kVar, InterfaceC1443d<j<?>> interfaceC1443d) {
        this(aVar, aVar2, aVar3, kVar, interfaceC1443d, v0);
    }

    private void e(InterfaceC2118g interfaceC2118g) {
        if (this.r0 == null) {
            this.r0 = new ArrayList(2);
        }
        if (this.r0.contains(interfaceC2118g)) {
            return;
        }
        this.r0.add(interfaceC2118g);
    }

    private ax.S3.a g() {
        return this.l0 ? this.i0 : this.h0;
    }

    private boolean m(InterfaceC2118g interfaceC2118g) {
        List<InterfaceC2118g> list = this.r0;
        return list != null && list.contains(interfaceC2118g);
    }

    private void n(boolean z) {
        ax.k4.i.b();
        this.q.clear();
        this.j0 = null;
        this.s0 = null;
        this.m0 = null;
        List<InterfaceC2118g> list = this.r0;
        if (list != null) {
            list.clear();
        }
        this.q0 = false;
        this.u0 = false;
        this.o0 = false;
        this.t0.J(z);
        this.t0 = null;
        this.p0 = null;
        this.n0 = null;
        this.d0.a(this);
    }

    @Override // ax.P3.f.b
    public void a(o oVar) {
        this.p0 = oVar;
        w0.obtainMessage(2, this).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.P3.f.b
    public void b(s<R> sVar, ax.M3.a aVar) {
        this.m0 = sVar;
        this.n0 = aVar;
        w0.obtainMessage(1, this).sendToTarget();
    }

    @Override // ax.P3.f.b
    public void c(f<?> fVar) {
        g().execute(fVar);
    }

    public void d(InterfaceC2118g interfaceC2118g) {
        ax.k4.i.b();
        this.c0.c();
        if (this.o0) {
            interfaceC2118g.b(this.s0, this.n0);
        } else if (this.q0) {
            interfaceC2118g.a(this.p0);
        } else {
            this.q.add(interfaceC2118g);
        }
    }

    void f() {
        if (this.q0 || this.o0 || this.u0) {
            return;
        }
        this.u0 = true;
        this.t0.p();
        this.f0.d(this, this.j0);
    }

    void h() {
        this.c0.c();
        if (!this.u0) {
            throw new IllegalStateException("Not cancelled");
        }
        this.f0.d(this, this.j0);
        n(false);
    }

    void i() {
        this.c0.c();
        if (this.u0) {
            n(false);
            return;
        }
        if (this.q.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        if (this.q0) {
            throw new IllegalStateException("Already failed once");
        }
        this.q0 = true;
        this.f0.a(this.j0, null);
        for (InterfaceC2118g interfaceC2118g : this.q) {
            if (!m(interfaceC2118g)) {
                interfaceC2118g.a(this.p0);
            }
        }
        n(false);
    }

    void j() {
        this.c0.c();
        if (this.u0) {
            this.m0.recycle();
            n(false);
            return;
        }
        if (this.q.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        if (this.o0) {
            throw new IllegalStateException("Already have resource");
        }
        n<?> a2 = this.e0.a(this.m0, this.k0);
        this.s0 = a2;
        this.o0 = true;
        a2.a();
        this.f0.a(this.j0, this.s0);
        for (InterfaceC2118g interfaceC2118g : this.q) {
            if (!m(interfaceC2118g)) {
                this.s0.a();
                interfaceC2118g.b(this.s0, this.n0);
            }
        }
        this.s0.d();
        n(false);
    }

    j<R> k(ax.M3.h hVar, boolean z, boolean z2) {
        this.j0 = hVar;
        this.k0 = z;
        this.l0 = z2;
        return this;
    }

    @Override // ax.l4.C2468a.f
    public AbstractC2469b l() {
        return this.c0;
    }

    public void o(InterfaceC2118g interfaceC2118g) {
        ax.k4.i.b();
        this.c0.c();
        if (this.o0 || this.q0) {
            e(interfaceC2118g);
            return;
        }
        this.q.remove(interfaceC2118g);
        if (this.q.isEmpty()) {
            f();
        }
    }

    public void p(f<R> fVar) {
        this.t0 = fVar;
        (fVar.P() ? this.g0 : g()).execute(fVar);
    }

    j(ax.S3.a aVar, ax.S3.a aVar2, ax.S3.a aVar3, k kVar, InterfaceC1443d<j<?>> interfaceC1443d, a aVar4) {
        this.q = new ArrayList(2);
        this.c0 = AbstractC2469b.a();
        this.g0 = aVar;
        this.h0 = aVar2;
        this.i0 = aVar3;
        this.f0 = kVar;
        this.d0 = interfaceC1443d;
        this.e0 = aVar4;
    }
}
