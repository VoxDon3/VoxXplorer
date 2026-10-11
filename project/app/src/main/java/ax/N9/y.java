/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class y
extends Enum<y> {
    public static final /* enum */ y c0;
    public static final /* enum */ y d0;
    public static final /* enum */ y e0;
    private static final y[] f0;
    public static final /* enum */ y q;

    static {
        q = new y();
        c0 = new y();
        d0 = new y();
        e0 = new y();
        f0 = y.d();
    }

    private static /* synthetic */ y[] d() {
        return new y[]{q, c0, d0, e0};
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    public static y[] values() {
        return (y[])f0.clone();
    }
}

