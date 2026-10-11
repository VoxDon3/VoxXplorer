/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Fb.p;
import ax.Tb.a;
import ax.Tb.c;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;

final class l<T>
extends a<T> {
    private final p<c<? super T>, e<? super t>, Object> q;

    public l(p<? super c<? super T>, ? super e<? super t>, ? extends Object> p8) {
        this.q = p8;
    }

    @Override
    public Object b(c<? super T> object, e<? super t> e8) {
        if ((object = this.q.j((c<T>)object, (e<t>)e8)) == b.c()) {
            return object;
        }
        return t.a;
    }
}

