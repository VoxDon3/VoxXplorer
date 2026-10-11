/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.Gb.v;
import ax.Qb.E;
import ax.Qb.J;
import ax.Qb.P0;
import ax.Qb.Q0;
import ax.Qb.U;
import ax.Qb.Y;
import ax.wb.f;
import ax.wb.i;
import ax.wb.j;
import ax.yb.e;

public final class F {
    private static final i a(i i8, i i9, boolean bl) {
        boolean bl2 = F.c(i8);
        boolean bl3 = F.c(i9);
        if (!bl2 && !bl3) {
            return i8.p(i9);
        }
        v<i> v8 = new v<i>();
        v8.q = i9;
        i9 = j.q;
        i8 = i8.v(i9, new p<i, i.b, i>(v8, bl){
            final boolean c0;
            final v<i> q;
            {
                this.q = v8;
                this.c0 = bl;
                super(2);
            }

            public final i a(i i8, i.b e8) {
                if (!(e8 instanceof E)) {
                    return i8.p(e8);
                }
                Object obj = ((i)this.q.q).a(e8.getKey());
                if (obj == null) {
                    boolean bl = this.c0;
                    E e9 = e8;
                    e8 = e9;
                    if (bl) {
                        e8 = e9.H();
                    }
                    return i8.p(e8);
                }
                v<i> v8 = this.q;
                v8.q = ((i)v8.q).m(e8.getKey());
                return i8.p(e8.g((i.b)obj));
            }
        });
        if (bl3) {
            v8.q = ((i)v8.q).v(i9, a.q);
        }
        return i8.p((i)v8.q);
    }

    public static final String b(i i8) {
        return null;
    }

    private static final boolean c(i i8) {
        return i8.v(Boolean.FALSE, c.q);
    }

    public static final i d(J object, i i8) {
        i8 = F.a(object.h(), i8, true);
        object = i8;
        if (i8 != Y.a()) {
            object = i8;
            if (i8.a(f.b0) == null) {
                object = i8.p(Y.a());
            }
        }
        return object;
    }

    public static final i e(i i8, i i9) {
        if (!F.c(i9)) {
            return i8.p(i9);
        }
        return F.a(i8, i9, false);
    }

    public static final P0<?> f(e e8) {
        e e9;
        do {
            if (e8 instanceof U) {
                return null;
            }
            e9 = e8.d();
            if (e9 == null) {
                return null;
            }
            e8 = e9;
        } while (!(e9 instanceof P0));
        return (P0)e9;
    }

    public static final P0<?> g(ax.wb.e<?> e8, i i8, Object object) {
        if (!(e8 instanceof e)) {
            return null;
        }
        if (i8.a(Q0.q) != null) {
            if ((e8 = F.f((e)((Object)e8))) != null) {
                ((P0)e8).P0(i8, object);
            }
            return e8;
        }
        return null;
    }
}

