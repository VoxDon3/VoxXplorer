package ax.Sb;

import ax.Vb.C;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class h<E> extends C<h<E>> {
    private final b<E> f0;
    private final AtomicReferenceArray g0;

    public h(long j, h<E> hVar, b<E> bVar, int i) {
        super(j, hVar, i);
        this.f0 = bVar;
        this.g0 = new AtomicReferenceArray(c.b * 2);
    }

    private final void z(int i, Object obj) {
        this.g0.lazySet(i * 2, obj);
    }

    public final void A(int i, Object obj) {
        this.g0.set((i * 2) + 1, obj);
    }

    public final void B(int i, E e) {
        z(i, e);
    }

    @Override // ax.Vb.C
    public int n() {
        return c.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = u().c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        ax.Vb.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // ax.Vb.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, ax.wb.i r6) {
        /*
            r3 = this;
            int r5 = ax.Sb.c.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof ax.Qb.R0
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof ax.Sb.o
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            ax.Vb.F r2 = ax.Sb.c.j()
            if (r1 == r2) goto L62
            ax.Vb.F r2 = ax.Sb.c.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            ax.Vb.F r2 = ax.Sb.c.o()
            if (r1 == r2) goto Le
            ax.Vb.F r2 = ax.Sb.c.p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            ax.Vb.F r4 = ax.Sb.c.f()
            if (r1 == r4) goto L99
            ax.Vb.F r4 = ax.Sb.c.d
            if (r1 != r4) goto L40
            goto L99
        L40:
            ax.Vb.F r4 = ax.Sb.c.y()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.s(r4)
            if (r0 == 0) goto L99
            ax.Sb.b r4 = r3.u()
            ax.Fb.l<E, ax.sb.t> r4 = r4.c
            if (r4 == 0) goto L99
            ax.Vb.x.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            ax.Vb.F r2 = ax.Sb.c.j()
            goto L7e
        L7a:
            ax.Vb.F r2 = ax.Sb.c.i()
        L7e:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L99
            ax.Sb.b r4 = r3.u()
            ax.Fb.l<E, ax.sb.t> r4 = r4.c
            if (r4 == 0) goto L99
            ax.Vb.x.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Sb.h.o(int, java.lang.Throwable, ax.wb.i):void");
    }

    public final boolean r(int i, Object obj, Object obj2) {
        return g.a(this.g0, (i * 2) + 1, obj, obj2);
    }

    public final void s(int i) {
        z(i, null);
    }

    public final Object t(int i, Object obj) {
        return this.g0.getAndSet((i * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f0;
        ax.Gb.l.c(bVar);
        return bVar;
    }

    public final E v(int i) {
        return (E) this.g0.get(i * 2);
    }

    public final Object w(int i) {
        return this.g0.get((i * 2) + 1);
    }

    public final void x(int i, boolean z) {
        if (z) {
            u().w0((this.d0 * c.b) + i);
        }
        p();
    }

    public final E y(int i) {
        E v = v(i);
        s(i);
        return v;
    }
}
