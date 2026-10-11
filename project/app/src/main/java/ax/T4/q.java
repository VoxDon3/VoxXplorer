/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.b5.g;

public final class q
extends Enum<q>
implements g {
    public static final /* enum */ q d0;
    public static final /* enum */ q e0;
    public static final /* enum */ q f0;
    public static final /* enum */ q g0;
    private static final q[] h0;
    private final int c0;
    private final boolean q;

    static {
        q q8;
        q q9;
        q q10;
        q q11;
        d0 = q11 = new q(false);
        e0 = q10 = new q(false);
        f0 = q9 = new q(false);
        g0 = q8 = new q(false);
        h0 = new q[]{q11, q10, q9, q8};
    }

    private q(boolean bl) {
        this.q = bl;
        this.c0 = 1 << this.ordinal();
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public static q[] values() {
        return (q[])h0.clone();
    }

    @Override
    public boolean d() {
        return this.q;
    }

    @Override
    public int h() {
        return this.c0;
    }
}

