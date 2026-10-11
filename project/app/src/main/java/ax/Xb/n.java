/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.D.b;
import ax.Gb.v;
import ax.Sb.g;
import ax.Xb.d;
import ax.Xb.h;
import ax.Xb.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<h> a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h h8) {
        if (this.d() == 127) {
            return h8;
        }
        if (h8.c0.b() == 1) {
            e.incrementAndGet(this);
        }
        int n8 = c.get(this) & 0x7F;
        while (this.a.get(n8) != null) {
            Thread.yield();
        }
        this.a.lazySet(n8, h8);
        c.incrementAndGet(this);
        return null;
    }

    private final void c(h h8) {
        if (h8 != null && h8.c0.b() == 1) {
            e.decrementAndGet(this);
        }
    }

    private final int d() {
        return c.get(this) - d.get(this);
    }

    private final h i() {
        int n8;
        Object object;
        do {
            if ((n8 = ((AtomicIntegerFieldUpdater)(object = d)).get(this)) - c.get(this) != 0) continue;
            return null;
        } while (!((AtomicIntegerFieldUpdater)object).compareAndSet(this, n8, n8 + 1) || (object = (h)this.a.getAndSet(n8 & 0x7F, null)) == null);
        this.c((h)object);
        return object;
    }

    private final boolean j(d d8) {
        h h8 = this.i();
        if (h8 == null) {
            return false;
        }
        d8.a(h8);
        return true;
    }

    private final h k(boolean bl) {
        int n8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h h8;
        while ((h8 = (h)(atomicReferenceFieldUpdater = b).get(this)) != null) {
            n8 = h8.c0.b();
            boolean bl2 = true;
            if (n8 != 1) {
                bl2 = false;
            }
            if (bl2 != bl) break;
            if (!ax.D.b.a(atomicReferenceFieldUpdater, this, h8, null)) continue;
            return h8;
        }
        int n9 = d.get(this);
        n8 = c.get(this);
        while (n9 != n8) {
            if (bl && e.get(this) == 0) {
                return null;
            }
            if ((h8 = this.m(--n8, bl)) == null) continue;
            return h8;
        }
        return null;
    }

    private final h l(int n8) {
        int n9 = d.get(this);
        int n10 = c.get(this);
        boolean bl = true;
        if (n8 == 1) {
            n8 = n9;
        } else {
            bl = false;
            n8 = n9;
        }
        while (n8 != n10) {
            if (bl && e.get(this) == 0) {
                return null;
            }
            h h8 = this.m(n8, bl);
            if (h8 == null) {
                ++n8;
                continue;
            }
            return h8;
        }
        return null;
    }

    private final h m(int n8, boolean bl) {
        int n9 = n8 & 0x7F;
        h h8 = this.a.get(n9);
        if (h8 != null) {
            n8 = h8.c0.b();
            boolean bl2 = true;
            if (n8 != 1) {
                bl2 = false;
            }
            if (bl2 == bl && g.a(this.a, n9, h8, null)) {
                if (bl) {
                    e.decrementAndGet(this);
                }
                return h8;
            }
        }
        return null;
    }

    private final long o(int n8, v<h> v8) {
        h h8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            long l8;
            if ((h8 = (h)(atomicReferenceFieldUpdater = b).get(this)) == null) {
                return -2L;
            }
            int n9 = h8.c0.b();
            int n10 = 1;
            if (n9 != 1) {
                n10 = 2;
            }
            if ((n10 & n8) == 0) {
                return -2L;
            }
            long l9 = l.f.a() - h8.q;
            if (l9 >= (l8 = l.b)) continue;
            return l8 - l9;
        } while (!ax.D.b.a(atomicReferenceFieldUpdater, this, h8, null));
        v8.q = h8;
        return -1L;
    }

    public final h a(h h8, boolean bl) {
        if (bl) {
            return this.b(h8);
        }
        if ((h8 = b.getAndSet(this, h8)) == null) {
            return null;
        }
        return this.b(h8);
    }

    public final int e() {
        if (b.get(this) != null) {
            return this.d() + 1;
        }
        return this.d();
    }

    public final void f(d d8) {
        h h8 = b.getAndSet(this, null);
        if (h8 != null) {
            d8.a(h8);
        }
        while (this.j(d8)) {
        }
    }

    public final h g() {
        h h8;
        h h9 = h8 = (h)b.getAndSet(this, null);
        if (h8 == null) {
            h9 = this.i();
        }
        return h9;
    }

    public final h h() {
        return this.k(true);
    }

    public final long n(int n8, v<h> v8) {
        h h8 = n8 == 3 ? this.i() : this.l(n8);
        if (h8 != null) {
            v8.q = h8;
            return -1L;
        }
        return this.o(n8, v8);
    }
}

