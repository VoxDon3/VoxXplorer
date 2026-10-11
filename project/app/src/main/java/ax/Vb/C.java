/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.G0;
import ax.Vb.e;
import ax.wb.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class C<S extends C<S>>
extends e<S>
implements G0 {
    private static final AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long d0;

    public C(long l8, S s8, int n8) {
        super(s8);
        this.d0 = l8;
        this.cleanedAndPointers = n8 << 16;
    }

    @Override
    public boolean h() {
        return e0.get(this) == this.n() && !this.i();
    }

    public final boolean m() {
        return e0.addAndGet(this, -65536) == this.n() && !this.i();
    }

    public abstract int n();

    public abstract void o(int var1, Throwable var2, i var3);

    public final void p() {
        if (e0.incrementAndGet(this) == this.n()) {
            this.k();
        }
    }

    public final boolean q() {
        int n8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0;
        do {
            if ((n8 = atomicIntegerFieldUpdater.get(this)) != this.n() || this.i()) continue;
            return false;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, n8, 65536 + n8));
        return true;
    }
}

