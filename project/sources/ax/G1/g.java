package ax.G1;

import ax.S0.G;
import ax.S0.M;

/* loaded from: classes.dex */
public final class g extends b {
    public final long a;
    public final long b;

    private g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static g d(G g, long j, M m) {
        long e = e(g, j);
        return new g(e, m.b(e));
    }

    static long e(G g, long j) {
        long M = g.M();
        if ((128 & M) != 0) {
            return 8589934591L & ((((M & 1) << 32) | g.O()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // ax.G1.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }
}
