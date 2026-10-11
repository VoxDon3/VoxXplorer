/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.D;
import ax.Qb.F;
import ax.Qb.G;
import ax.Qb.Q0;
import ax.Vb.B;
import ax.Vb.J;
import ax.sb.m;
import ax.sb.q;
import ax.sb.t;
import ax.wb.e;
import ax.wb.f;
import ax.wb.i;

public final class P0<T>
extends B<T> {
    private final ThreadLocal<m<i, Object>> f0;
    private volatile boolean threadLocalIsSet;

    public P0(i i8, e<? super T> object) {
        i i9 = Q0.q;
        i9 = i8.a(i9) == null ? i8.p(i9) : i8;
        super(i9, object);
        this.f0 = new ThreadLocal();
        if (!(object.b().a(f.b0) instanceof G)) {
            object = J.c(i8, null);
            J.a(i8, object);
            this.P0(i8, object);
        }
    }

    @Override
    protected void I0(Object p02) {
        i i8;
        Object object;
        block6: {
            if (this.threadLocalIsSet) {
                object = this.f0.get();
                if (object != null) {
                    J.a(((m)object).a(), ((m)object).b());
                }
                this.f0.remove();
            }
            Object object2 = D.a(p02, this.e0);
            e e8 = this.e0;
            i8 = e8.b();
            p02 = null;
            object = J.c(i8, null);
            if (object != J.a) {
                p02 = F.g(e8, i8, object);
            }
            try {
                this.e0.f(object2);
                object2 = t.a;
                if (p02 == null || p02.O0()) break block6;
                return;
            }
            catch (Throwable throwable) {
                if (p02 == null || p02.O0()) {
                    J.a(i8, object);
                }
                throw throwable;
            }
        }
        J.a(i8, object);
    }

    public final boolean O0() {
        boolean bl = this.threadLocalIsSet && this.f0.get() == null;
        this.f0.remove();
        return bl ^ true;
    }

    public final void P0(i i8, Object object) {
        this.threadLocalIsSet = true;
        this.f0.set(q.a(i8, object));
    }
}

