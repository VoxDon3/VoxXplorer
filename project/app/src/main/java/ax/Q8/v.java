/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class v
extends Enum<v>
implements c<v> {
    public static final /* enum */ v c0 = new v(8L);
    public static final /* enum */ v d0 = new v(16L);
    public static final /* enum */ v e0 = new v(32L);
    public static final /* enum */ v f0 = new v(64L);
    public static final /* enum */ v g0 = new v(128L);
    private static final v[] h0 = v.d();
    private long q;

    private v(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ v[] d() {
        return new v[]{c0, d0, e0, f0, g0};
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    public static v[] values() {
        return (v[])h0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

