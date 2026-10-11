/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.D;
import ax.Qb.a;
import ax.Vb.k;
import ax.wb.i;
import ax.xb.b;
import ax.yb.e;

public class B<T>
extends a<T>
implements e {
    public final ax.wb.e<T> e0;

    public B(i i8, ax.wb.e<? super T> e8) {
        super(i8, true, true);
        this.e0 = e8;
    }

    @Override
    protected void I0(Object object) {
        ax.wb.e<T> e8 = this.e0;
        e8.f(D.a(object, e8));
    }

    @Override
    protected final boolean b0() {
        return true;
    }

    @Override
    public final e d() {
        ax.wb.e<T> e8 = this.e0;
        if (e8 instanceof e) {
            return (e)((Object)e8);
        }
        return null;
    }

    @Override
    protected void w(Object object) {
        k.c(b.b(this.e0), D.a(object, this.e0), null, 2, null);
    }
}

