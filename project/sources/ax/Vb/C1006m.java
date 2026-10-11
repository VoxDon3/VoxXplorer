package ax.Vb;

import ax.Qb.P;
import ax.Qb.T;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ax.Vb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1006m extends ax.Qb.G implements T {
    private static final AtomicIntegerFieldUpdater i0 = AtomicIntegerFieldUpdater.newUpdater(C1006m.class, "runningWorkers");
    private final ax.Qb.G d0;
    private final int e0;
    private final /* synthetic */ T f0;
    private final r<Runnable> g0;
    private final Object h0;
    private volatile int runningWorkers;

    /* renamed from: ax.Vb.m$a */
    private final class a implements Runnable {
        private Runnable q;

        public a(Runnable runnable) {
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.q.run();
                } catch (Throwable th) {
                    ax.Qb.I.a(ax.wb.j.q, th);
                }
                Runnable b1 = C1006m.this.b1();
                if (b1 == null) {
                    return;
                }
                this.q = b1;
                i++;
                if (i >= 16 && C1006m.this.d0.f(C1006m.this)) {
                    C1006m.this.d0.b(C1006m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1006m(ax.Qb.G g, int i) {
        this.d0 = g;
        this.e0 = i;
        T t = g instanceof T ? (T) g : null;
        this.f0 = t == null ? P.a() : t;
        this.g0 = new r<>(false);
        this.h0 = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable b1() {
        while (true) {
            Runnable d = this.g0.d();
            if (d != null) {
                return d;
            }
            synchronized (this.h0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g0.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean c1() {
        synchronized (this.h0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0;
            if (atomicIntegerFieldUpdater.get(this) >= this.e0) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // ax.Qb.G
    public void b(ax.wb.i iVar, Runnable runnable) {
        Runnable b1;
        this.g0.a(runnable);
        if (i0.get(this) >= this.e0 || !c1() || (b1 = b1()) == null) {
            return;
        }
        this.d0.b(this, new a(b1));
    }
}
