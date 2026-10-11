/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

public final class y
extends Enum<y> {
    public static final /* enum */ y c0 = new y(1);
    public static final /* enum */ y d0 = new y(2);
    public static final /* enum */ y e0 = new y(3);
    public static final /* enum */ y f0 = new y(4);
    private static final y[] g0 = y.d();
    private final int q;

    private y(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ y[] d() {
        return new y[]{c0, d0, e0, f0};
    }

    public static y h(String string) {
        if (string != null) {
            return f0;
        }
        return c0;
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    public static y[] values() {
        return (y[])g0.clone();
    }

    public int j() {
        return this.q;
    }

    public String toString() {
        return Integer.toString(this.q);
    }
}

