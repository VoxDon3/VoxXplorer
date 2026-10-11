/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Fb.l;
import ax.Gb.w;
import ax.Qb.R0;
import ax.Sb.a;
import ax.Sb.b;
import ax.Sb.c;
import ax.Sb.f;
import ax.Sb.h;
import ax.Vb.C;
import ax.Vb.F;
import ax.Vb.e;
import ax.Vb.x;
import ax.sb.t;

public class k<E>
extends b<E> {
    private final int n;
    private final a o;

    public k(int n8, a object, l<? super E, t> l8) {
        super(n8, l8);
        this.n = n8;
        this.o = object;
        if (object != a.q) {
            if (n8 >= 1) {
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Buffered channel capacity must be at least 1, but ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" was specified");
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("This implementation does not support suspension for senders, use ");
        ((StringBuilder)object).append(w.b(b.class).a());
        ((StringBuilder)object).append(" instead");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    private final Object x0(E object, boolean bl) {
        l l8 = super.d(object);
        if (!f.i(l8) && !f.h(l8)) {
            if (bl && (l8 = this.c) != null && (object = x.d(l8, object, null, 2, null)) != null) {
                throw object;
            }
            return f.b.c(t.a);
        }
        return l8;
    }

    private final Object y0(E object) {
        block6: {
            block7: {
                int n8;
                int n9;
                boolean bl;
                Object object2;
                F f8;
                block8: {
                    block9: {
                        long l8;
                        f8 = ax.Sb.c.d;
                        h h8 = (h)b.i().get(this);
                        object2 = object;
                        object = h8;
                        while (true) {
                            long l9 = b.j().getAndIncrement(this);
                            l8 = 0xFFFFFFFFFFFFFFFL & l9;
                            bl = b.k(this, l9);
                            n9 = ax.Sb.c.b;
                            l9 = l8 / (long)n9;
                            n8 = (int)(l8 % (long)n9);
                            if (((C)object).d0 != l9) {
                                h8 = b.f(this, l9, object);
                                if (h8 == null) {
                                    if (!bl) continue;
                                    return f.b.a(this.G());
                                }
                                object = h8;
                            }
                            int n10 = b.p(this, object, n8, object2, l8, f8, bl);
                            if (n10 == 0) break block6;
                            if (n10 == 1) break block7;
                            if (n10 == 2) break block8;
                            if (n10 == 3) break block9;
                            if (n10 == 4) break;
                            if (n10 != 5) continue;
                            ((e)object).b();
                        }
                        if (l8 < this.F()) {
                            ((e)object).b();
                        }
                        return f.b.a(this.G());
                    }
                    throw new IllegalStateException("unexpected");
                }
                if (bl) {
                    ((C)object).p();
                    return f.b.a(this.G());
                }
                object2 = f8 instanceof R0 ? (R0)((Object)f8) : null;
                if (object2 != null) {
                    b.n(this, object2, (h)object, n8);
                }
                this.x(((C)object).d0 * (long)n9 + (long)n8);
                return f.b.c(t.a);
            }
            return f.b.c(t.a);
        }
        ((e)object).b();
        return f.b.c(t.a);
    }

    private final Object z0(E e8, boolean bl) {
        if (this.o == a.d0) {
            return this.x0(e8, bl);
        }
        return this.y0(e8);
    }

    @Override
    protected boolean S() {
        return this.o == a.c0;
    }

    @Override
    public Object d(E e8) {
        return this.z0(e8, false);
    }
}

