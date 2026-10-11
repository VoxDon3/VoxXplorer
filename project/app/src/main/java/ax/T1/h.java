/*
 * Decompiled with CFR 0.152.
 */
package ax.T1;

import ax.N1.k;
import ax.R0.a;
import ax.S0.d0;
import ax.T1.c;
import ax.T1.e;
import ax.T1.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class h
implements k {
    private final long[] c0;
    private final Map<String, g> d0;
    private final Map<String, e> e0;
    private final Map<String, String> f0;
    private final c q;

    public h(c c8, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.q = c8;
        this.e0 = map2;
        this.f0 = map3;
        map = map != null ? java.util.DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.d0 = map;
        this.c0 = c8.j();
    }

    @Override
    public int d(long l8) {
        int n8 = ax.S0.d0.d(this.c0, l8, false, false);
        if (n8 < this.c0.length) {
            return n8;
        }
        return -1;
    }

    @Override
    public long h(int n8) {
        return this.c0[n8];
    }

    @Override
    public List<a> j(long l8) {
        return this.q.h(l8, this.d0, this.e0, this.f0);
    }

    @Override
    public int l() {
        return this.c0.length;
    }
}

