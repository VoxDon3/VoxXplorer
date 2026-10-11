/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.W7.f;

public final class u
extends Enum<u>
implements f {
    public static final /* enum */ u c0 = new u(0);
    public static final /* enum */ u d0 = new u(1);
    public static final /* enum */ u e0 = new u(2);
    public static final /* enum */ u f0 = new u(3);
    private static final u[] g0 = u.d();
    private final int q;

    private u(int n9) {
        this.q = n9;
    }

    private static final /* synthetic */ u[] d() {
        return new u[]{c0, d0, e0, f0};
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    public static u[] values() {
        return (u[])g0.clone();
    }

    @Override
    public int g() {
        return this.q;
    }
}

