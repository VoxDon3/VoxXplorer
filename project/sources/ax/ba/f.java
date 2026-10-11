package ax.ba;

import ax.ga.InterfaceC2133b;
import ax.ha.InterfaceC2175a;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
class f {
    final e a;
    private Executor b;
    private Executor c;
    private final Map<Integer, String> e = DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, ReentrantLock> f = new WeakHashMap();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Object j = new Object();
    private Executor d = C1726a.i();

    class a implements Runnable {
        final /* synthetic */ h q;

        a(h hVar) {
            this.q = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            File i = f.this.a.n.i(this.q.n());
            boolean z = (i != null && i.exists()) || f.this.m(this.q.n());
            f.this.l();
            if (z) {
                f.this.c.execute(this.q);
            } else {
                f.this.b.execute(this.q);
            }
        }
    }

    f(e eVar) {
        this.a = eVar;
        this.b = eVar.f;
        this.c = eVar.g;
    }

    private Executor f() {
        e eVar = this.a;
        return C1726a.c(eVar.j, eVar.k, eVar.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!this.a.h && ((ExecutorService) this.b).isShutdown()) {
            this.b = f();
        }
        if (this.a.i || !((ExecutorService) this.c).isShutdown()) {
            return;
        }
        this.c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        InterfaceC2133b.a l = InterfaceC2133b.a.l(str);
        return l == InterfaceC2133b.a.ASSETS || l == InterfaceC2133b.a.FILE || l == InterfaceC2133b.a.DRAWABLE;
    }

    void e(InterfaceC2175a interfaceC2175a) {
        this.e.remove(Integer.valueOf(interfaceC2175a.a()));
    }

    void g(Runnable runnable) {
        this.d.execute(runnable);
    }

    String h(InterfaceC2175a interfaceC2175a) {
        return this.e.get(Integer.valueOf(interfaceC2175a.a()));
    }

    ReentrantLock i(String str) {
        ReentrantLock reentrantLock = this.f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f.put(str, reentrantLock2);
        return reentrantLock2;
    }

    AtomicBoolean j() {
        return this.g;
    }

    Object k() {
        return this.j;
    }

    boolean n() {
        return this.h.get();
    }

    boolean o() {
        return this.i.get();
    }

    void p(InterfaceC2175a interfaceC2175a, String str) {
        this.e.put(Integer.valueOf(interfaceC2175a.a()), str);
    }

    void q() {
        if (!this.a.h) {
            ((ExecutorService) this.b).shutdownNow();
        }
        if (!this.a.i) {
            ((ExecutorService) this.c).shutdownNow();
        }
        this.e.clear();
        this.f.clear();
    }

    void r(h hVar) {
        this.d.execute(new a(hVar));
    }

    void s(i iVar) {
        l();
        this.c.execute(iVar);
    }
}
