/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;

public final class i {
    public static byte a(long l8) {
        boolean bl = l8 >> 8 == 0L;
        n.i(bl, "out of range: %s", l8);
        return (byte)l8;
    }

    public static int b(byte by) {
        return by & 0xFF;
    }
}

