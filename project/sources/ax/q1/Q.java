package ax.q1;

import ax.q1.N;

/* loaded from: classes.dex */
public final class Q implements N {
    private final long a;
    private final long b;

    public Q(long j) {
        this(j, 0L);
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        return new N.a(new O(j, this.b));
    }

    @Override // ax.q1.N
    public long n() {
        return this.a;
    }

    public Q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
