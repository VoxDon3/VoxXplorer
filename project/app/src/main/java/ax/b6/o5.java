/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m5;
import ax.b6.r5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class o5
implements Iterator {
    private Iterator c0;
    private final m5 d0;
    private int q;

    private o5(m5 m52) {
        this.d0 = m52;
        this.q = m5.e(m52).size();
    }

    /* synthetic */ o5(m5 m52, r5 r52) {
        this(m52);
    }

    private final Iterator b() {
        if (this.c0 == null) {
            this.c0 = m5.k(this.d0).entrySet().iterator();
        }
        return this.c0;
    }

    @Override
    public final boolean hasNext() {
        int n8 = this.q;
        return n8 > 0 && n8 <= m5.e(this.d0).size() || this.b().hasNext();
    }

    public final /* synthetic */ Object next() {
        int n8;
        if (this.b().hasNext()) {
            return (Map.Entry)this.b().next();
        }
        List list = m5.e(this.d0);
        this.q = n8 = this.q - 1;
        return (Map.Entry)list.get(n8);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

