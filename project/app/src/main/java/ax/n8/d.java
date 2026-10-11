/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.W7.f;

public final class d
extends Enum<d>
implements f {
    public static final /* enum */ d c0 = new d(0);
    public static final /* enum */ d d0 = new d(1);
    public static final /* enum */ d e0 = new d(2);
    public static final /* enum */ d f0 = new d(3);
    public static final /* enum */ d g0 = new d(4);
    public static final /* enum */ d h0 = new d(5);
    private static final d[] i0 = d.d();
    private final int q;

    private d(int n9) {
        this.q = n9;
    }

    private static final /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])i0.clone();
    }

    @Override
    public int g() {
        return this.q;
    }
}

