package ax.u7;

import ax.q7.n;

/* loaded from: classes3.dex */
public final class j {
    public static int a(long j) {
        n.i((j >> 32) == 0, "out of range: %s", j);
        return (int) j;
    }
}
