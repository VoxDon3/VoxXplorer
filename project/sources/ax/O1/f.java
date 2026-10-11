package ax.O1;

import ax.N1.k;
import ax.S0.C0968a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class f implements k {
    private final List<ax.R0.a> q;

    public f(List<ax.R0.a> list) {
        this.q = list;
    }

    @Override // ax.N1.k
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // ax.N1.k
    public long h(int i) {
        C0968a.a(i == 0);
        return 0L;
    }

    @Override // ax.N1.k
    public List<ax.R0.a> j(long j) {
        return j >= 0 ? this.q : Collections.EMPTY_LIST;
    }

    @Override // ax.N1.k
    public int l() {
        return 1;
    }
}
