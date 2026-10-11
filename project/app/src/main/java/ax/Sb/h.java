/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Gb.l;
import ax.Qb.R0;
import ax.Sb.b;
import ax.Sb.c;
import ax.Sb.g;
import ax.Sb.o;
import ax.Vb.C;
import ax.Vb.x;
import ax.wb.i;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class h<E>
extends C<h<E>> {
    private final b<E> f0;
    private final AtomicReferenceArray g0;

    public h(long l8, h<E> h8, b<E> b8, int n8) {
        super(l8, h8, n8);
        this.f0 = b8;
        this.g0 = new AtomicReferenceArray(c.b * 2);
    }

    private final void z(int n8, Object object) {
        this.g0.lazySet(n8 * 2, object);
    }

    public final void A(int n8, Object object) {
        this.g0.set(n8 * 2 + 1, object);
    }

    public final void B(int n8, E e8) {
        this.z(n8, e8);
    }

    @Override
    public int n() {
        return c.b;
    }

    @Override
    public void o(int n8, Throwable object, i i8) {
        block8: {
            int n9 = c.b;
            boolean bl = n8 >= n9;
            int n10 = n8;
            if (bl) {
                n10 = n8 - n9;
            }
            E e8 = this.v(n10);
            while (true) {
                Object object2;
                if (!((object2 = this.w(n10)) instanceof R0) && !(object2 instanceof o)) {
                    if (object2 != c.j() && object2 != c.i()) {
                        if (object2 == c.o() || object2 == c.p()) continue;
                        if (object2 != c.f() && object2 != c.d && object2 != c.y()) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("unexpected state: ");
                            ((StringBuilder)object).append(object2);
                            throw new IllegalStateException(((StringBuilder)object).toString().toString());
                        }
                    } else {
                        this.s(n10);
                        if (bl && (object = this.u().c) != null) {
                            x.b(object, e8, i8);
                            return;
                        }
                    }
                    break block8;
                }
                object = bl ? c.j() : c.i();
                if (this.r(n10, object2, object)) break;
            }
            this.s(n10);
            this.x(n10, bl ^ true);
            if (bl && (object = this.u().c) != null) {
                x.b(object, e8, i8);
            }
        }
    }

    public final boolean r(int n8, Object object, Object object2) {
        return g.a(this.g0, n8 * 2 + 1, object, object2);
    }

    public final void s(int n8) {
        this.z(n8, null);
    }

    public final Object t(int n8, Object object) {
        return this.g0.getAndSet(n8 * 2 + 1, object);
    }

    public final b<E> u() {
        b<E> b8 = this.f0;
        l.c(b8);
        return b8;
    }

    public final E v(int n8) {
        return this.g0.get(n8 * 2);
    }

    public final Object w(int n8) {
        return this.g0.get(n8 * 2 + 1);
    }

    public final void x(int n8, boolean bl) {
        if (bl) {
            this.u().w0(this.d0 * (long)c.b + (long)n8);
        }
        this.p();
    }

    public final E y(int n8) {
        E e8 = this.v(n8);
        this.s(n8);
        return e8;
    }
}

