package ax.T1;

import ax.N1.k;
import ax.S0.d0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h implements k {
    private final long[] c0;
    private final Map<String, g> d0;
    private final Map<String, e> e0;
    private final Map<String, String> f0;
    private final c q;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.q = cVar;
        this.e0 = map2;
        this.f0 = map3;
        this.d0 = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.c0 = cVar.j();
    }

    @Override // ax.N1.k
    public int d(long j) {
        int d = d0.d(this.c0, j, false, false);
        if (d < this.c0.length) {
            return d;
        }
        return -1;
    }

    @Override // ax.N1.k
    public long h(int i) {
        return this.c0[i];
    }

    @Override // ax.N1.k
    public List<ax.R0.a> j(long j) {
        return this.q.h(j, this.d0, this.e0, this.f0);
    }

    @Override // ax.N1.k
    public int l() {
        return this.c0.length;
    }
}
