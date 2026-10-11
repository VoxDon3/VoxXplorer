/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;

public final class j {
    public static int a(long l8) {
        boolean bl = l8 >> 32 == 0L;
        n.i(bl, "out of range: %s", l8);
        return (int)l8;
    }
}

