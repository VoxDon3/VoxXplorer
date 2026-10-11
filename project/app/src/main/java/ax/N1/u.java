/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import android.util.SparseArray;
import ax.N1.t;
import ax.N1.w;
import ax.q1.N;
import ax.q1.U;
import ax.q1.t;

public final class u
implements t {
    private final t.a c0;
    private final SparseArray<w> d0;
    private boolean e0;
    private final t q;

    public u(t t8, t.a a8) {
        this.q = t8;
        this.c0 = a8;
        this.d0 = new SparseArray();
    }

    @Override
    public void h(N n8) {
        this.q.h(n8);
    }

    @Override
    public void o() {
        this.q.o();
        if (this.e0) {
            for (int i8 = 0; i8 < this.d0.size(); ++i8) {
                ((w)this.d0.valueAt(i8)).k(true);
            }
        }
    }

    @Override
    public U u(int n8, int n9) {
        if (n9 != 3) {
            this.e0 = true;
            return this.q.u(n8, n9);
        }
        w w8 = (w)this.d0.get(n8);
        if (w8 != null) {
            return w8;
        }
        w8 = new w(this.q.u(n8, n9), this.c0);
        this.d0.put(n8, (Object)w8);
        return w8;
    }
}

