package ax.j1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.U0.g;
import ax.U0.k;

/* renamed from: ax.j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2306d extends AbstractC2304b {
    public final long j;

    public AbstractC2306d(g gVar, k kVar, C0912v c0912v, int i, Object obj, long j, long j2, long j3) {
        super(gVar, kVar, 1, c0912v, i, obj, j, j2);
        C0968a.e(c0912v);
        this.j = j3;
    }

    public long g() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }
}
