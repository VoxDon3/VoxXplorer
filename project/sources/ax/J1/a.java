package ax.J1;

import ax.q1.C2850j;
import ax.q1.J;

/* loaded from: classes.dex */
final class a extends C2850j implements g {
    private final long h;
    private final int i;
    private final int j;
    private final boolean k;
    private final long l;

    public a(long j, long j2, J.a aVar, boolean z) {
        this(j, j2, aVar.f, aVar.c, z);
    }

    public a d(long j) {
        return new a(j, this.h, this.i, this.j, this.k);
    }

    @Override // ax.J1.g
    public long g() {
        return this.l;
    }

    @Override // ax.J1.g
    public long h() {
        return this.h;
    }

    @Override // ax.J1.g
    public long j(long j) {
        return b(j);
    }

    @Override // ax.J1.g
    public int m() {
        return this.i;
    }

    public a(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        long j3 = j;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j3 == -1 ? -1L : j3;
    }
}
