package ax.u7;

import ax.q7.n;

/* loaded from: classes3.dex */
public final class i {
    public static byte a(long j) {
        n.i((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int b(byte b) {
        return b & 255;
    }
}
