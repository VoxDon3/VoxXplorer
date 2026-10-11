package ax.Vb;

import ax.Qb.G0;
import ax.Vb.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public abstract class C<S extends C<S>> extends AbstractC0998e<S> implements G0 {
    private static final AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long d0;

    public C(long j, S s, int i) {
        super(s);
        this.d0 = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // ax.Vb.AbstractC0998e
    public boolean h() {
        return e0.get(this) == n() && !i();
    }

    public final boolean m() {
        return e0.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i, Throwable th, ax.wb.i iVar);

    public final void p() {
        if (e0.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
