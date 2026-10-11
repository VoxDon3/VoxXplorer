/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class l
extends Enum<l>
implements c<l> {
    public static final /* enum */ l c0 = new l(0L);
    public static final /* enum */ l d0 = new l(1L);
    public static final /* enum */ l e0 = new l(2L);
    public static final /* enum */ l f0 = new l(3L);
    private static final l[] g0 = l.d();
    private long q;

    private l(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ l[] d() {
        return new l[]{c0, d0, e0, f0};
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static l[] values() {
        return (l[])g0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

