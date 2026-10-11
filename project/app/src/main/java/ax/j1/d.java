/*
 * Decompiled with CFR 0.152.
 */
package ax.j1;

import ax.P0.v;
import ax.S0.a;
import ax.U0.g;
import ax.U0.k;
import ax.j1.b;

public abstract class d
extends b {
    public final long j;

    public d(g g8, k k8, v v8, int n8, Object object, long l8, long l9, long l10) {
        super(g8, k8, 1, v8, n8, object, l8, l9);
        ax.S0.a.e(v8);
        this.j = l10;
    }

    public long g() {
        long l8 = this.j;
        if (l8 != -1L) {
            return l8 + 1L;
        }
        return -1L;
    }
}

