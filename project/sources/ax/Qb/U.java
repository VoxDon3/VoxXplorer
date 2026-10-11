package ax.Qb;

import ax.Vb.C1004k;
import ax.xb.C3479b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class U<T> extends ax.Vb.B<T> {
    private static final AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(U.class, "_decision");
    private volatile int _decision;

    public U(ax.wb.i iVar, ax.wb.e<? super T> eVar) {
        super(iVar, eVar);
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f0;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f0.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Q0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f0;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f0.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // ax.Vb.B, ax.Qb.AbstractC0923a
    protected void I0(Object obj) {
        if (P0()) {
            return;
        }
        C1004k.c(C3479b.b(this.e0), D.a(obj, this.e0), null, 2, null);
    }

    public final Object O0() {
        if (Q0()) {
            return C3479b.c();
        }
        Object h = A0.h(W());
        if (h instanceof C0966z) {
            throw ((C0966z) h).a;
        }
        return h;
    }

    @Override // ax.Vb.B, ax.Qb.z0
    protected void w(Object obj) {
        I0(obj);
    }
}
