/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.q1.N;
import ax.q1.O;

public final class Q
implements N {
    private final long a;
    private final long b;

    public Q(long l8) {
        this(l8, 0L);
    }

    public Q(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public N.a l(long l8) {
        return new N.a(new O(l8, this.b));
    }

    @Override
    public long n() {
        return this.a;
    }
}

