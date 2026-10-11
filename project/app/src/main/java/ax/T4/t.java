/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.b5.g;

public final class t
extends Enum<t>
implements g {
    public static final /* enum */ t d0;
    public static final /* enum */ t e0;
    private static final t[] f0;
    private final int c0;
    private final boolean q;

    static {
        t t8;
        t t9;
        d0 = t9 = new t(false);
        e0 = t8 = new t(false);
        f0 = new t[]{t9, t8};
    }

    private t(boolean bl) {
        this.q = bl;
        this.c0 = 1 << this.ordinal();
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    public static t[] values() {
        return (t[])f0.clone();
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

