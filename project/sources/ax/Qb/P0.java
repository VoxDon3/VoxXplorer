package ax.Qb;

import ax.sb.C3081m;

/* loaded from: classes3.dex */
public final class P0<T> extends ax.Vb.B<T> {
    private final ThreadLocal<C3081m<ax.wb.i, Object>> f0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P0(ax.wb.i r3, ax.wb.e<? super T> r4) {
        /*
            r2 = this;
            ax.Qb.Q0 r0 = ax.Qb.Q0.q
            ax.wb.i$b r1 = r3.a(r0)
            if (r1 != 0) goto Ld
            ax.wb.i r0 = r3.p(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f0 = r0
            ax.wb.i r4 = r4.b()
            ax.wb.f$b r0 = ax.wb.f.b0
            ax.wb.i$b r4 = r4.a(r0)
            boolean r4 = r4 instanceof ax.Qb.G
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = ax.Vb.J.c(r3, r4)
            ax.Vb.J.a(r3, r4)
            r2.P0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Qb.P0.<init>(ax.wb.i, ax.wb.e):void");
    }

    @Override // ax.Vb.B, ax.Qb.AbstractC0923a
    protected void I0(Object obj) {
        if (this.threadLocalIsSet) {
            C3081m<ax.wb.i, Object> c3081m = this.f0.get();
            if (c3081m != null) {
                ax.Vb.J.a(c3081m.a(), c3081m.b());
            }
            this.f0.remove();
        }
        Object a = D.a(obj, this.e0);
        ax.wb.e<T> eVar = this.e0;
        ax.wb.i b = eVar.b();
        Object c = ax.Vb.J.c(b, null);
        P0<?> g = c != ax.Vb.J.a ? F.g(eVar, b, c) : null;
        try {
            this.e0.f(a);
            ax.sb.t tVar = ax.sb.t.a;
            if (g == null || g.O0()) {
                ax.Vb.J.a(b, c);
            }
        } catch (Throwable th) {
            if (g == null || g.O0()) {
                ax.Vb.J.a(b, c);
            }
            throw th;
        }
    }

    public final boolean O0() {
        boolean z = this.threadLocalIsSet && this.f0.get() == null;
        this.f0.remove();
        return !z;
    }

    public final void P0(ax.wb.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f0.set(ax.sb.q.a(iVar, obj));
    }
}
