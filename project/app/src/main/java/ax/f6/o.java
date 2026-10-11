/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

public final class o
extends Enum<o> {
    public static final /* enum */ o c0;
    public static final /* enum */ o d0;
    public static final /* enum */ o e0;
    public static final /* enum */ o f0;
    private static final o[] g0;
    private final String q;

    static {
        o o8;
        o o9;
        o o10;
        o o11;
        c0 = o11 = new o("uninitialized");
        d0 = o10 = new o("eu_consent_policy");
        e0 = o9 = new o("denied");
        f0 = o8 = new o("granted");
        g0 = new o[]{o11, o10, o9, o8};
    }

    private o(String string2) {
        this.q = string2;
    }

    public static o[] values() {
        return (o[])g0.clone();
    }

    public final String toString() {
        return this.q;
    }
}

