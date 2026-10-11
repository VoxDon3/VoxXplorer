package ax.N8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class B {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    B(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        long j6 = j4 * j5;
        this.f = j * j6;
        this.g = j2 * j6;
        this.h = j3 * j6;
    }

    public static B c(a.c cVar) throws a.b {
        return new B(cVar.A(), cVar.A(), cVar.A(), cVar.N(), cVar.N());
    }

    public long a() {
        return this.h;
    }

    public long b() {
        return this.f;
    }
}
