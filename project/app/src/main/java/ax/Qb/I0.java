/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.A0;
import ax.Qb.m;
import ax.Qb.y0;
import ax.Qb.z;
import ax.sb.n;
import ax.sb.o;

final class I0<T>
extends y0 {
    private final m<T> f0;

    public I0(m<? super T> m8) {
        this.f0 = m8;
    }

    @Override
    public void x(Throwable object) {
        object = this.y().W();
        if (object instanceof z) {
            m<T> m8 = this.f0;
            n.a a8 = n.q;
            m8.f(n.a(o.a(((z)object).a)));
            return;
        }
        m<T> m9 = this.f0;
        n.a a9 = n.q;
        m9.f(n.a(A0.h(object)));
    }
}

