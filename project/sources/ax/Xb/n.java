package ax.Xb;

import ax.Gb.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class n {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<h> a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.c0.b() == 1) {
            e.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, hVar);
        c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || hVar.c0.b() != 1) {
            return;
        }
        e.decrementAndGet(this);
    }

    private final int d() {
        return c.get(this) - d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i = i();
        if (i == null) {
            return false;
        }
        dVar.a(i);
        return true;
    }

    private final h k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.c0.b() == 1) == z) {
                }
            }
            int i = d.get(this);
            int i2 = c.get(this);
            while (i != i2) {
                if (z && e.get(this) == 0) {
                    return null;
                }
                i2--;
                h m = m(i2, z);
                if (m != null) {
                    return m;
                }
            }
            return null;
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i) {
        int i2 = d.get(this);
        int i3 = c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            h m = m(i2, z);
            if (m != null) {
                return m;
            }
            i2 = i4;
        }
        return null;
    }

    private final h m(int i, boolean z) {
        int i2 = i & 127;
        h hVar = this.a.get(i2);
        if (hVar != null) {
            if ((hVar.c0.b() == 1) == z && ax.Sb.g.a(this.a, i2, hVar, null)) {
                if (z) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ax.Xb.h, java.lang.Object] */
    private final long o(int i, v<h> vVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = b;
            r1 = (h) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.c0.b() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long a = l.f.a() - r1.q;
            long j = l.b;
            if (a < j) {
                return j - a;
            }
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, r1, null));
        vVar.q = r1;
        return -1L;
    }

    public final h a(h hVar, boolean z) {
        if (z) {
            return b(hVar);
        }
        h hVar2 = (h) b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i, v<h> vVar) {
        T i2 = i == 3 ? i() : l(i);
        if (i2 == 0) {
            return o(i, vVar);
        }
        vVar.q = i2;
        return -1L;
    }
}
