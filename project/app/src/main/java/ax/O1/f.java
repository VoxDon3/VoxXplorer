/*
 * Decompiled with CFR 0.152.
 */
package ax.O1;

import ax.N1.k;
import ax.S0.a;
import java.util.Collections;
import java.util.List;

final class f
implements k {
    private final List<ax.R0.a> q;

    public f(List<ax.R0.a> list) {
        this.q = list;
    }

    @Override
    public int d(long l8) {
        if (l8 < 0L) {
            return 0;
        }
        return -1;
    }

    @Override
    public long h(int n8) {
        boolean bl = n8 == 0;
        a.a(bl);
        return 0L;
    }

    @Override
    public List<ax.R0.a> j(long l8) {
        if (l8 >= 0L) {
            return this.q;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public int l() {
        return 1;
    }
}

