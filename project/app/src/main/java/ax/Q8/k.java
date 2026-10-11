/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class k
extends Enum<k>
implements c<k> {
    public static final /* enum */ k c0 = new k(1L);
    public static final /* enum */ k d0 = new k(2L);
    public static final /* enum */ k e0 = new k(4L);
    public static final /* enum */ k f0 = new k(8L);
    public static final /* enum */ k g0 = new k(16L);
    public static final /* enum */ k h0 = new k(32L);
    public static final /* enum */ k i0 = new k(64L);
    private static final k[] j0 = k.d();
    private long q;

    private k(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ k[] d() {
        return new k[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public static k[] values() {
        return (k[])j0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

