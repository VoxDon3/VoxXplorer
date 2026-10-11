/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.G;
import ax.Qb.V;
import ax.tb.h;

public abstract class c0
extends G {
    private long d0;
    private boolean e0;
    private h<V<?>> f0;

    public static /* synthetic */ void a1(c0 c02, boolean bl, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                bl = false;
            }
            c02.Z0(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long b1(boolean bl) {
        if (bl) {
            return 0x100000000L;
        }
        return 1L;
    }

    public static /* synthetic */ void f1(c0 c02, boolean bl, int n8, Object object) {
        if (object == null) {
            if ((n8 & 1) != 0) {
                bl = false;
            }
            c02.e1(bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void Z0(boolean bl) {
        long l8;
        this.d0 = l8 = this.d0 - this.b1(bl);
        if (l8 <= 0L && this.e0) {
            this.shutdown();
        }
    }

    public final void c1(V<?> v8) {
        h<V<?>> h8;
        h<V<Object>> h9 = h8 = this.f0;
        if (h8 == null) {
            h9 = new h();
            this.f0 = h9;
        }
        h9.addLast(v8);
    }

    protected long d1() {
        h<V<?>> h8 = this.f0;
        if (h8 == null) {
            return Long.MAX_VALUE;
        }
        if (h8.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void e1(boolean bl) {
        this.d0 += this.b1(bl);
        if (!bl) {
            this.e0 = true;
        }
    }

    public final boolean g1() {
        return this.d0 >= this.b1(true);
    }

    public final boolean h1() {
        h<V<?>> h8 = this.f0;
        if (h8 != null) {
            return h8.isEmpty();
        }
        return true;
    }

    public long i1() {
        if (!this.j1()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean j1() {
        h<V<?>> h8 = this.f0;
        if (h8 == null) {
            return false;
        }
        if ((h8 = h8.u()) == null) {
            return false;
        }
        ((V)((Object)h8)).run();
        return true;
    }

    public boolean k1() {
        return false;
    }

    public void shutdown() {
    }
}

