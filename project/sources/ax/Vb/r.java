package ax.Vb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class r<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z) {
        this._cur = new s(8, z);
    }

    public final boolean a(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a2 = sVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                ax.D.b.a(a, this, sVar, sVar.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                ax.D.b.a(a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            E e = (E) sVar.j();
            if (e != s.h) {
                return e;
            }
            ax.D.b.a(a, this, sVar, sVar.i());
        }
    }
}
