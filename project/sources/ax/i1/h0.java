package ax.i1;

import android.net.Uri;
import ax.P0.C0915y;
import ax.P0.N;
import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class h0 extends ax.P0.N {
    private static final Object r = new Object();
    private static final C0915y s = new C0915y.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Object o;
    private final C0915y p;
    private final C0915y.g q;

    public h0(long j, boolean z, boolean z2, boolean z3, Object obj, C0915y c0915y) {
        this(j, j, 0L, 0L, z, z2, z3, obj, c0915y);
    }

    @Override // ax.P0.N
    public int b(Object obj) {
        return r.equals(obj) ? 0 : -1;
    }

    @Override // ax.P0.N
    public N.b g(int i, N.b bVar, boolean z) {
        C0968a.c(i, 0, 1);
        return bVar.t(null, z ? r : null, 0, this.h, -this.j);
    }

    @Override // ax.P0.N
    public int i() {
        return 1;
    }

    @Override // ax.P0.N
    public Object m(int i) {
        C0968a.c(i, 0, 1);
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // ax.P0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.P0.N.c o(int r25, ax.P0.N.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            ax.S0.C0968a.c(r3, r1, r2)
            long r1 = r0.k
            boolean r14 = r0.m
            if (r14 == 0) goto L2e
            boolean r3 = r0.n
            if (r3 != 0) goto L2e
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = ax.P0.N.c.q
            ax.P0.y r5 = r0.p
            java.lang.Object r6 = r0.o
            long r7 = r0.e
            long r9 = r0.f
            long r11 = r0.g
            boolean r13 = r0.l
            ax.P0.y$g r15 = r0.q
            long r1 = r0.i
            r21 = 0
            r18 = r1
            long r1 = r0.j
            r20 = 0
            r3 = r26
            r22 = r1
            ax.P0.N$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i1.h0.o(int, ax.P0.N$c, long):ax.P0.N$c");
    }

    @Override // ax.P0.N
    public int p() {
        return 1;
    }

    public h0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C0915y c0915y) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c0915y, z3 ? c0915y.d : null);
    }

    public h0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C0915y c0915y, C0915y.g gVar) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = j7;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = obj;
        this.p = (C0915y) C0968a.e(c0915y);
        this.q = gVar;
    }
}
