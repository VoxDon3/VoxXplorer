/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

class b {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int a(j.Duration duration) {
        long l8 = duration.toMillis();
        if (l8 > 0L) {
            l8 = Math.min(l8, Integer.MAX_VALUE);
            return (int)l8;
        }
        l8 = Math.max(l8, Integer.MIN_VALUE);
        return (int)l8;
    }
}

