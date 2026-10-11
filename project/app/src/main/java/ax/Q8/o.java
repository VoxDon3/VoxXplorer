/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class o
extends Enum<o>
implements c<o> {
    public static final /* enum */ o c0 = new o(1L);
    public static final /* enum */ o d0 = new o(2L);
    public static final /* enum */ o e0 = new o(4L);
    public static final /* enum */ o f0 = new o(8L);
    public static final /* enum */ o g0 = new o(112L);
    public static final /* enum */ o h0 = new o(0x10000000L);
    public static final /* enum */ o i0 = new o(0x20000000L);
    private static final o[] j0 = o.d();
    private long q;

    private o(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ o[] d() {
        return new o[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public static o[] values() {
        return (o[])j0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

