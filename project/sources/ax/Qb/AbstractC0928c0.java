package ax.Qb;

import ax.tb.C3132h;

/* renamed from: ax.Qb.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0928c0 extends G {
    private long d0;
    private boolean e0;
    private C3132h<V<?>> f0;

    public static /* synthetic */ void a1(AbstractC0928c0 abstractC0928c0, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC0928c0.Z0(z);
    }

    private final long b1(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void f1(AbstractC0928c0 abstractC0928c0, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC0928c0.e1(z);
    }

    public final void Z0(boolean z) {
        long b1 = this.d0 - b1(z);
        this.d0 = b1;
        if (b1 <= 0 && this.e0) {
            shutdown();
        }
    }

    public final void c1(V<?> v) {
        C3132h<V<?>> c3132h = this.f0;
        if (c3132h == null) {
            c3132h = new C3132h<>();
            this.f0 = c3132h;
        }
        c3132h.addLast(v);
    }

    protected long d1() {
        C3132h<V<?>> c3132h = this.f0;
        return (c3132h == null || c3132h.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void e1(boolean z) {
        this.d0 += b1(z);
        if (z) {
            return;
        }
        this.e0 = true;
    }

    public final boolean g1() {
        return this.d0 >= b1(true);
    }

    public final boolean h1() {
        C3132h<V<?>> c3132h = this.f0;
        if (c3132h != null) {
            return c3132h.isEmpty();
        }
        return true;
    }

    public long i1() {
        return !j1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean j1() {
        V<?> u;
        C3132h<V<?>> c3132h = this.f0;
        if (c3132h == null || (u = c3132h.u()) == null) {
            return false;
        }
        u.run();
        return true;
    }

    public boolean k1() {
        return false;
    }

    public void shutdown() {
    }
}
