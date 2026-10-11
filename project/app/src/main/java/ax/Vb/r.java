/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.D.b;
import ax.Vb.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class r<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean bl) {
        this._cur = new s(8, bl);
    }

    public final boolean a(E e8) {
        s s8;
        int n8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while ((n8 = (s8 = (s)atomicReferenceFieldUpdater.get(this)).a(e8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) continue;
                return false;
            }
            b.a(a, this, s8, s8.i());
        }
        return true;
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        s s8;
        while (!(s8 = (s)atomicReferenceFieldUpdater.get(this)).d()) {
            b.a(a, this, s8, s8.i());
        }
        return;
    }

    public final int c() {
        return ((s)a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        s s8;
        Object object;
        while ((object = (s8 = (s)atomicReferenceFieldUpdater.get(this)).j()) == s.h) {
            b.a(a, this, s8, s8.i());
        }
        return (E)object;
    }
}

