/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import android.util.SparseArray;
import ax.S0.M;

public final class j {
    private final SparseArray<M> a = new SparseArray();

    public M a(int n8) {
        M m8;
        M m9 = m8 = (M)this.a.get(n8);
        if (m8 == null) {
            m9 = new M(0x7FFFFFFFFFFFFFFEL);
            this.a.put(n8, (Object)m9);
        }
        return m9;
    }

    public void b() {
        this.a.clear();
    }
}

