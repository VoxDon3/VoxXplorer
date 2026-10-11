/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.A0;
import ax.Qb.D;
import ax.Qb.z;
import ax.Vb.B;
import ax.Vb.k;
import ax.wb.e;
import ax.wb.i;
import ax.xb.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class U<T>
extends B<T> {
    private static final AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(U.class, "_decision");
    private volatile int _decision;

    public U(i i8, e<? super T> e8) {
        super(i8, e8);
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f0;
        do {
            int n8;
            if ((n8 = atomicIntegerFieldUpdater.get(this)) == 0) continue;
            if (n8 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed");
        } while (!f0.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Q0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f0;
        do {
            int n8;
            if ((n8 = atomicIntegerFieldUpdater.get(this)) == 0) continue;
            if (n8 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended");
        } while (!f0.compareAndSet(this, 0, 1));
        return true;
    }

    @Override
    protected void I0(Object object) {
        if (this.P0()) {
            return;
        }
        k.c(b.b(this.e0), D.a(object, this.e0), null, 2, null);
    }

    public final Object O0() {
        if (this.Q0()) {
            return b.c();
        }
        Object object = A0.h(this.W());
        if (!(object instanceof z)) {
            return object;
        }
        throw ((z)object).a;
    }

    @Override
    protected void w(Object object) {
        this.I0(object);
    }
}

