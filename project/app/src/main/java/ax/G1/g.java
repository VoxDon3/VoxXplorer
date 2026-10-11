/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.G1.b;
import ax.S0.G;
import ax.S0.M;

public final class g
extends b {
    public final long a;
    public final long b;

    private g(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    static g d(G g8, long l8, M m8) {
        l8 = g.e(g8, l8);
        return new g(l8, m8.b(l8));
    }

    static long e(G g8, long l8) {
        long l9 = g8.M();
        if ((0x80L & l9) != 0L) {
            return 0x1FFFFFFFFL & ((l9 & 1L) << 32 | g8.O()) + l8;
        }
        return -9223372036854775807L;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 TimeSignalCommand { ptsTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", playbackPositionUs= ");
        stringBuilder.append(this.b);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

