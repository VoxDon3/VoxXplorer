/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.D1;
import ax.W5.I1;
import java.util.Iterator;

final class E1
implements Iterator {
    private boolean c0;
    private Iterator d0;
    final I1 e0;
    private int q;

    /* synthetic */ E1(I1 i12, D1 d12) {
        this.e0 = i12;
        this.q = -1;
    }

    private final Iterator b() {
        if (this.d0 == null) {
            this.d0 = I1.i(this.e0).entrySet().iterator();
        }
        return this.d0;
    }

    @Override
    public final boolean hasNext() {
        if (this.q + 1 >= I1.f(this.e0).size()) {
            return !I1.i(this.e0).isEmpty() && this.b().hasNext();
        }
        return true;
    }

    @Override
    public final void remove() {
        if (this.c0) {
            this.c0 = false;
            I1.j(this.e0);
            if (this.q < I1.f(this.e0).size()) {
                I1 i12 = this.e0;
                int n8 = this.q;
                this.q = n8 - 1;
                I1.d(i12, n8);
                return;
            }
            this.b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

