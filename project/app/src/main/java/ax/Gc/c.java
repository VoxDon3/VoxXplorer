/*
 * Decompiled with CFR 0.152.
 */
package ax.Gc;

final class c
extends Enum<c> {
    public static final /* enum */ c c0;
    public static final /* enum */ c d0;
    public static final /* enum */ c e0;
    private static final c[] f0;
    public static final /* enum */ c q;

    static {
        c c8;
        c c9;
        c c10;
        c c11;
        q = c11 = new c();
        c0 = c10 = new c();
        d0 = c9 = new c();
        e0 = c8 = new c();
        f0 = new c[]{c11, c10, c9, c8};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])f0.clone();
    }
}

