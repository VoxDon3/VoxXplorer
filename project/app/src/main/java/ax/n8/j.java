/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.W7.f;

public final class j
extends Enum<j>
implements f {
    public static final /* enum */ j c0 = new j(0);
    public static final /* enum */ j d0 = new j(1);
    private static final j[] e0 = j.d();
    private final int q;

    private j(int n9) {
        this.q = n9;
    }

    private static final /* synthetic */ j[] d() {
        return new j[]{c0, d0};
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])e0.clone();
    }

    @Override
    public int g() {
        return this.q;
    }
}

