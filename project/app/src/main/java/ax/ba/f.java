/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import ax.ba.a;
import ax.ba.e;
import ax.ba.h;
import ax.ba.i;
import ax.ga.b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

class f {
    final e a;
    private Executor b;
    private Executor c;
    private Executor d;
    private final Map<Integer, String> e = java.util.DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, ReentrantLock> f = new WeakHashMap<String, ReentrantLock>();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Object j = new Object();

    f(e e8) {
        this.a = e8;
        this.b = e8.f;
        this.c = e8.g;
        this.d = ax.ba.a.i();
    }

    private Executor f() {
        e e8 = this.a;
        return ax.ba.a.c(e8.j, e8.k, e8.l);
    }

    private void l() {
        if (!this.a.h && ((ExecutorService)this.b).isShutdown()) {
            this.b = this.f();
        }
        if (!this.a.i && ((ExecutorService)this.c).isShutdown()) {
            this.c = this.f();
        }
    }

    private boolean m(String object) {
        return (object = b.a.l(object)) == b.a.h0 || object == b.a.f0 || object == b.a.i0;
        {
        }
    }

    void e(ax.ha.a a8) {
        this.e.remove(a8.a());
    }

    void g(Runnable runnable2) {
        this.d.execute(runnable2);
    }

    String h(ax.ha.a a8) {
        return this.e.get(a8.a());
    }

    ReentrantLock i(String string) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2 = reentrantLock = this.f.get(string);
        if (reentrantLock == null) {
            reentrantLock2 = new ReentrantLock();
            this.f.put(string, reentrantLock2);
        }
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

    void p(ax.ha.a a8, String string) {
        this.e.put(a8.a(), string);
    }

    void q() {
        if (!this.a.h) {
            ((ExecutorService)this.b).shutdownNow();
        }
        if (!this.a.i) {
            ((ExecutorService)this.c).shutdownNow();
        }
        this.e.clear();
        this.f.clear();
    }

    void r(h h8) {
        this.d.execute(new Runnable(){
            final f c0;
            final h q;
            {
                this.c0 = f8;
                this.q = h8;
            }

            @Override
            public void run() {
                File file = this.c0.a.n.i(this.q.n());
                boolean bl = file != null && file.exists() || this.c0.m(this.q.n());
                this.c0.l();
                if (bl) {
                    this.c0.c.execute(this.q);
                    return;
                }
                this.c0.b.execute(this.q);
            }
        });
    }

    void s(i i8) {
        this.l();
        this.c.execute(i8);
    }
}

