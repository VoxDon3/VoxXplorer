package ax.C2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import ax.K2.InterfaceC0782b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class G implements Runnable {
    static final String t0 = ax.B2.i.i("WorkerWrapper");
    private final String c0;
    private List<t> d0;
    private WorkerParameters.a e0;
    ax.K2.v f0;
    androidx.work.c g0;
    ax.N2.c h0;
    private androidx.work.a j0;
    private ax.J2.a k0;
    private WorkDatabase l0;
    private ax.K2.w m0;
    private InterfaceC0782b n0;
    private List<String> o0;
    private String p0;
    Context q;
    private volatile boolean s0;
    c.a i0 = c.a.a();
    ax.M2.c<Boolean> q0 = ax.M2.c.t();
    final ax.M2.c<c.a> r0 = ax.M2.c.t();

    class a implements Runnable {
        final /* synthetic */ ax.v7.e q;

        a(ax.v7.e eVar) {
            this.q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (G.this.r0.isCancelled()) {
                return;
            }
            try {
                this.q.get();
                ax.B2.i.e().a(G.t0, "Starting work for " + G.this.f0.c);
                G g = G.this;
                g.r0.r(g.g0.m());
            } catch (Throwable th) {
                G.this.r0.q(th);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ String q;

        b(String str) {
            this.q = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    c.a aVar = G.this.r0.get();
                    if (aVar == null) {
                        ax.B2.i.e().c(G.t0, G.this.f0.c + " returned a null result. Treating it as a failure.");
                    } else {
                        ax.B2.i.e().a(G.t0, G.this.f0.c + " returned a " + aVar + ".");
                        G.this.i0 = aVar;
                    }
                    G.this.i();
                } catch (InterruptedException e) {
                    e = e;
                    ax.B2.i.e().d(G.t0, this.q + " failed because it threw an exception/error", e);
                    G.this.i();
                } catch (CancellationException e2) {
                    ax.B2.i.e().g(G.t0, this.q + " was cancelled", e2);
                    G.this.i();
                } catch (ExecutionException e3) {
                    e = e3;
                    ax.B2.i.e().d(G.t0, this.q + " failed because it threw an exception/error", e);
                    G.this.i();
                }
            } catch (Throwable th) {
                G.this.i();
                throw th;
            }
        }
    }

    public static class c {
        Context a;
        androidx.work.c b;
        ax.J2.a c;
        ax.N2.c d;
        androidx.work.a e;
        WorkDatabase f;
        ax.K2.v g;
        List<t> h;
        private final List<String> i;
        WorkerParameters.a j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, ax.N2.c cVar, ax.J2.a aVar2, WorkDatabase workDatabase, ax.K2.v vVar, List<String> list) {
            this.a = context.getApplicationContext();
            this.d = cVar;
            this.c = aVar2;
            this.e = aVar;
            this.f = workDatabase;
            this.g = vVar;
            this.i = list;
        }

        public G b() {
            return new G(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.j = aVar;
            }
            return this;
        }

        public c d(List<t> list) {
            this.h = list;
            return this;
        }
    }

    G(c cVar) {
        this.q = cVar.a;
        this.h0 = cVar.d;
        this.k0 = cVar.c;
        ax.K2.v vVar = cVar.g;
        this.f0 = vVar;
        this.c0 = vVar.a;
        this.d0 = cVar.h;
        this.e0 = cVar.j;
        this.g0 = cVar.b;
        this.j0 = cVar.e;
        WorkDatabase workDatabase = cVar.f;
        this.l0 = workDatabase;
        this.m0 = workDatabase.I();
        this.n0 = this.l0.D();
        this.o0 = cVar.i;
    }

    public static /* synthetic */ void a(G g, ax.v7.e eVar) {
        if (g.r0.isCancelled()) {
            eVar.cancel(true);
        }
    }

    private String b(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.c0);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0047c) {
            ax.B2.i.e().f(t0, "Worker result SUCCESS for " + this.p0);
            if (this.f0.h()) {
                k();
                return;
            } else {
                p();
                return;
            }
        }
        if (aVar instanceof c.a.b) {
            ax.B2.i.e().f(t0, "Worker result RETRY for " + this.p0);
            j();
            return;
        }
        ax.B2.i.e().f(t0, "Worker result FAILURE for " + this.p0);
        if (this.f0.h()) {
            k();
        } else {
            o();
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.m0.m(str2) != ax.B2.r.CANCELLED) {
                this.m0.j(ax.B2.r.FAILED, str2);
            }
            linkedList.addAll(this.n0.a(str2));
        }
    }

    private void j() {
        this.l0.e();
        try {
            this.m0.j(ax.B2.r.ENQUEUED, this.c0);
            this.m0.q(this.c0, System.currentTimeMillis());
            this.m0.b(this.c0, -1L);
            this.l0.A();
        } finally {
            this.l0.i();
            l(true);
        }
    }

    private void k() {
        this.l0.e();
        try {
            this.m0.q(this.c0, System.currentTimeMillis());
            this.m0.j(ax.B2.r.ENQUEUED, this.c0);
            this.m0.o(this.c0);
            this.m0.a(this.c0);
            this.m0.b(this.c0, -1L);
            this.l0.A();
        } finally {
            this.l0.i();
            l(false);
        }
    }

    private void l(boolean z) {
        this.l0.e();
        try {
            if (!this.l0.I().k()) {
                ax.L2.r.a(this.q, RescheduleReceiver.class, false);
            }
            if (z) {
                this.m0.j(ax.B2.r.ENQUEUED, this.c0);
                this.m0.b(this.c0, -1L);
            }
            if (this.f0 != null && this.g0 != null && this.k0.b(this.c0)) {
                this.k0.a(this.c0);
            }
            this.l0.A();
            this.l0.i();
            this.q0.p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.l0.i();
            throw th;
        }
    }

    private void m() {
        ax.B2.r m = this.m0.m(this.c0);
        if (m == ax.B2.r.RUNNING) {
            ax.B2.i.e().a(t0, "Status for " + this.c0 + " is RUNNING; not doing any work and rescheduling for later execution");
            l(true);
            return;
        }
        ax.B2.i.e().a(t0, "Status for " + this.c0 + " is " + m + " ; not doing any work");
        l(false);
    }

    private void n() {
        androidx.work.b b2;
        if (q()) {
            return;
        }
        this.l0.e();
        try {
            ax.K2.v vVar = this.f0;
            if (vVar.b != ax.B2.r.ENQUEUED) {
                m();
                this.l0.A();
                ax.B2.i.e().a(t0, this.f0.c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((vVar.h() || this.f0.g()) && System.currentTimeMillis() < this.f0.a()) {
                ax.B2.i.e().a(t0, String.format("Delaying execution for %s because it is being executed before schedule.", this.f0.c));
                l(true);
                this.l0.A();
                return;
            }
            this.l0.A();
            this.l0.i();
            if (this.f0.h()) {
                b2 = this.f0.e;
            } else {
                ax.B2.g b3 = this.j0.f().b(this.f0.d);
                if (b3 == null) {
                    ax.B2.i.e().c(t0, "Could not create Input Merger " + this.f0.d);
                    o();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f0.e);
                arrayList.addAll(this.m0.r(this.c0));
                b2 = b3.b(arrayList);
            }
            androidx.work.b bVar = b2;
            UUID fromString = UUID.fromString(this.c0);
            List<String> list = this.o0;
            WorkerParameters.a aVar = this.e0;
            ax.K2.v vVar2 = this.f0;
            WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, vVar2.k, vVar2.d(), this.j0.d(), this.h0, this.j0.n(), new ax.L2.D(this.l0, this.h0), new ax.L2.C(this.l0, this.k0, this.h0));
            if (this.g0 == null) {
                this.g0 = this.j0.n().b(this.q, this.f0.c, workerParameters);
            }
            androidx.work.c cVar = this.g0;
            if (cVar == null) {
                ax.B2.i.e().c(t0, "Could not create Worker " + this.f0.c);
                o();
                return;
            }
            if (cVar.j()) {
                ax.B2.i.e().c(t0, "Received an already-used Worker " + this.f0.c + "; Worker Factory should return new instances");
                o();
                return;
            }
            this.g0.l();
            if (!r()) {
                m();
                return;
            }
            if (q()) {
                return;
            }
            ax.L2.B b4 = new ax.L2.B(this.q, this.f0, this.g0, workerParameters.b(), this.h0);
            this.h0.a().execute(b4);
            final ax.v7.e<Void> b5 = b4.b();
            this.r0.h(new Runnable() { // from class: ax.C2.F
                @Override // java.lang.Runnable
                public final void run() {
                    G.a(G.this, b5);
                }
            }, new ax.L2.x());
            b5.h(new a(b5), this.h0.a());
            this.r0.h(new b(this.p0), this.h0.b());
        } finally {
            this.l0.i();
        }
    }

    private void p() {
        this.l0.e();
        try {
            this.m0.j(ax.B2.r.SUCCEEDED, this.c0);
            this.m0.g(this.c0, ((c.a.C0047c) this.i0).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.n0.a(this.c0)) {
                if (this.m0.m(str) == ax.B2.r.BLOCKED && this.n0.c(str)) {
                    ax.B2.i.e().f(t0, "Setting status to enqueued for " + str);
                    this.m0.j(ax.B2.r.ENQUEUED, str);
                    this.m0.q(str, currentTimeMillis);
                }
            }
            this.l0.A();
            this.l0.i();
            l(false);
        } catch (Throwable th) {
            this.l0.i();
            l(false);
            throw th;
        }
    }

    private boolean q() {
        if (!this.s0) {
            return false;
        }
        ax.B2.i.e().a(t0, "Work interrupted for " + this.p0);
        if (this.m0.m(this.c0) == null) {
            l(false);
        } else {
            l(!r0.h());
        }
        return true;
    }

    private boolean r() {
        boolean z;
        this.l0.e();
        try {
            if (this.m0.m(this.c0) == ax.B2.r.ENQUEUED) {
                this.m0.j(ax.B2.r.RUNNING, this.c0);
                this.m0.s(this.c0);
                z = true;
            } else {
                z = false;
            }
            this.l0.A();
            this.l0.i();
            return z;
        } catch (Throwable th) {
            this.l0.i();
            throw th;
        }
    }

    public ax.v7.e<Boolean> c() {
        return this.q0;
    }

    public ax.K2.m d() {
        return ax.K2.y.a(this.f0);
    }

    public ax.K2.v e() {
        return this.f0;
    }

    public void g() {
        this.s0 = true;
        q();
        this.r0.cancel(true);
        if (this.g0 != null && this.r0.isCancelled()) {
            this.g0.n();
            return;
        }
        ax.B2.i.e().a(t0, "WorkSpec " + this.f0 + " is already done. Not interrupting.");
    }

    void i() {
        if (!q()) {
            this.l0.e();
            try {
                ax.B2.r m = this.m0.m(this.c0);
                this.l0.H().h(this.c0);
                if (m == null) {
                    l(false);
                } else if (m == ax.B2.r.RUNNING) {
                    f(this.i0);
                } else if (!m.h()) {
                    j();
                }
                this.l0.A();
                this.l0.i();
            } catch (Throwable th) {
                this.l0.i();
                throw th;
            }
        }
        List<t> list = this.d0;
        if (list != null) {
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                it.next().d(this.c0);
            }
            u.b(this.j0, this.l0, this.d0);
        }
    }

    void o() {
        this.l0.e();
        try {
            h(this.c0);
            this.m0.g(this.c0, ((c.a.C0046a) this.i0).e());
            this.l0.A();
        } finally {
            this.l0.i();
            l(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.p0 = b(this.o0);
        n();
    }
}
