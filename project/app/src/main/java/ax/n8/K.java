/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.n8.J;

public final class K
implements J {
    public static final K a = new K();

    private K() {
    }

    @Override
    public long a() {
        return System.currentTimeMillis() * 1000L;
    }
}

