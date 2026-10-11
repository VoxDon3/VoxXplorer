package ax.Sb;

import ax.Gb.w;
import ax.Qb.R0;
import ax.Vb.O;
import ax.Vb.x;
import ax.sb.t;

/* loaded from: classes3.dex */
public class k<E> extends b<E> {
    private final int n;
    private final a o;

    public k(int i, a aVar, ax.Fb.l<? super E, t> lVar) {
        super(i, lVar);
        this.n = i;
        this.o = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + w.b(b.class).a() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    private final Object x0(E e, boolean z) {
        ax.Fb.l<E, t> lVar;
        O d;
        Object d2 = super.d(e);
        if (f.i(d2) || f.h(d2)) {
            return d2;
        }
        if (!z || (lVar = this.c) == null || (d = x.d(lVar, e, null, 2, null)) == null) {
            return f.b.c(t.a);
        }
        throw d;
    }

    private final Object y0(E e) {
        h hVar;
        int i;
        k<E> kVar;
        Object obj = c.d;
        h hVar2 = (h) b.i.get(this);
        while (true) {
            long andIncrement = b.e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean R = R(andIncrement);
            int i2 = c.b;
            long j2 = j / i2;
            int i3 = (int) (j % i2);
            if (hVar2.d0 != j2) {
                hVar = B(j2, hVar2);
                if (hVar != null) {
                    kVar = this;
                    i = i3;
                } else if (R) {
                    return f.b.a(G());
                }
            } else {
                hVar = hVar2;
                i = i3;
                kVar = this;
            }
            E e2 = e;
            int s0 = kVar.s0(hVar, i, e2, j, obj, R);
            hVar2 = hVar;
            if (s0 == 0) {
                hVar2.b();
                return f.b.c(t.a);
            }
            if (s0 == 1) {
                return f.b.c(t.a);
            }
            if (s0 == 2) {
                if (R) {
                    hVar2.p();
                    return f.b.a(G());
                }
                R0 r0 = obj instanceof R0 ? (R0) obj : null;
                if (r0 != null) {
                    e0(r0, hVar2, i);
                }
                x((hVar2.d0 * i2) + i);
                return f.b.c(t.a);
            }
            if (s0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (s0 == 4) {
                if (j < F()) {
                    hVar2.b();
                }
                return f.b.a(G());
            }
            if (s0 == 5) {
                hVar2.b();
            }
            e = e2;
        }
    }

    private final Object z0(E e, boolean z) {
        return this.o == a.DROP_LATEST ? x0(e, z) : y0(e);
    }

    @Override // ax.Sb.b
    protected boolean S() {
        return this.o == a.DROP_OLDEST;
    }

    @Override // ax.Sb.b, ax.Sb.n
    public Object d(E e) {
        return z0(e, false);
    }
}
