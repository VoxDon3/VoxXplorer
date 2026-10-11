/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m5;
import ax.b6.u5;
import java.util.Iterator;
import java.util.Map;

final class v5
implements Iterator {
    private boolean c0;
    private Iterator d0;
    private final m5 e0;
    private int q;

    private v5(m5 m52) {
        this.e0 = m52;
        this.q = -1;
    }

    /* synthetic */ v5(m5 m52, u5 u52) {
        this(m52);
    }

    private final Iterator b() {
        if (this.d0 == null) {
            this.d0 = m5.j(this.e0).entrySet().iterator();
        }
        return this.d0;
    }

    @Override
    public final boolean hasNext() {
        return this.q + 1 < m5.e(this.e0).size() || !m5.j(this.e0).isEmpty() && this.b().hasNext();
        {
        }
    }

    public final /* synthetic */ Object next() {
        int n8;
        this.c0 = true;
        this.q = n8 = this.q + 1;
        if (n8 < m5.e(this.e0).size()) {
            return (Map.Entry)m5.e(this.e0).get(this.q);
        }
        return (Map.Entry)this.b().next();
    }

    @Override
    public final void remove() {
        if (this.c0) {
            this.c0 = false;
            m5.n(this.e0);
            if (this.q < m5.e(this.e0).size()) {
                m5 m52 = this.e0;
                int n8 = this.q;
                this.q = n8 - 1;
                m5.c(m52, n8);
                return;
            }
            this.b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

