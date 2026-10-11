/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

public final class c0
extends Enum<c0> {
    public static final /* enum */ c0 c0;
    private static final c0[] d0;
    public static final /* enum */ c0 q;

    static {
        c0 c02;
        c0 c03;
        q = c03 = new c0();
        c0 = c02 = new c0();
        d0 = new c0[]{c03, c02};
    }

    public static c0 valueOf(String string) {
        return Enum.valueOf(c0.class, string);
    }

    public static c0[] values() {
        return (c0[])d0.clone();
    }
}

