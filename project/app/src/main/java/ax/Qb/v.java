/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.s0;
import ax.Qb.u;
import ax.Qb.z;
import ax.Qb.z0;
import ax.wb.e;
import ax.xb.b;

final class v<T>
extends z0
implements u<T> {
    public v(s0 s02) {
        super(true);
        this.Z(s02);
    }

    @Override
    public boolean T() {
        return true;
    }

    @Override
    public Object T0(e<? super T> object) {
        object = this.x((e<Object>)object);
        b.c();
        return object;
    }

    @Override
    public T c() {
        return (T)this.P();
    }

    @Override
    public boolean o0(Throwable throwable) {
        return this.e0(new z(throwable, false, 2, null));
    }

    @Override
    public boolean u0(T t8) {
        return this.e0(t8);
    }
}

