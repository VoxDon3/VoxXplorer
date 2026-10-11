package ax.xc;

/* loaded from: classes3.dex */
public final class u implements C, AutoCloseable {
    private final C3487e c0;
    private x d0;
    private int e0;
    private boolean f0;
    private long g0;
    private final g q;

    public u(g gVar) {
        ax.Gb.l.f(gVar, "upstream");
        this.q = gVar;
        C3487e k = gVar.k();
        this.c0 = k;
        x xVar = k.q;
        this.d0 = xVar;
        this.e0 = xVar != null ? xVar.b : -1;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r4.b) goto L15;
     */
    @Override // ax.xc.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(ax.xc.C3487e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            ax.Gb.l.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f0
            if (r3 != 0) goto L6c
            ax.xc.x r3 = r8.d0
            if (r3 == 0) goto L2b
            ax.xc.e r4 = r8.c0
            ax.xc.x r4 = r4.q
            if (r3 != r4) goto L23
            int r3 = r8.e0
            ax.Gb.l.c(r4)
            int r4 = r4.b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            ax.xc.g r0 = r8.q
            long r1 = r8.g0
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.r0(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            ax.xc.x r0 = r8.d0
            if (r0 != 0) goto L51
            ax.xc.e r0 = r8.c0
            ax.xc.x r0 = r0.q
            if (r0 == 0) goto L51
            r8.d0 = r0
            ax.Gb.l.c(r0)
            int r0 = r0.b
            r8.e0 = r0
        L51:
            ax.xc.e r0 = r8.c0
            long r0 = r0.size()
            long r2 = r8.g0
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            ax.xc.e r2 = r8.c0
            long r4 = r8.g0
            r3 = r9
            r2.j(r3, r4, r6)
            long r9 = r8.g0
            long r9 = r9 + r6
            r8.g0 = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.xc.u.read(ax.xc.e, long):long");
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.q.timeout();
    }
}
