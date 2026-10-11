/*
 * Decompiled with CFR 0.152.
 */
package ax.oa;

import ax.Y8.c;

public final class e
extends Enum<e>
implements c<e> {
    public static final /* enum */ e c0 = new e(1);
    public static final /* enum */ e d0 = new e(2);
    public static final /* enum */ e e0 = new e(4);
    public static final /* enum */ e f0 = new e(16);
    public static final /* enum */ e g0 = new e(32);
    public static final /* enum */ e h0 = new e(64);
    public static final /* enum */ e i0 = new e(128);
    private static final e[] j0 = e.d();
    private final int q;

    private e(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ e[] d() {
        return new e[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])j0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

