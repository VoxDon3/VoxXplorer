/*
 * Decompiled with CFR 0.152.
 */
package ax.Q9;

public final class c
extends Enum<c> {
    public static final /* enum */ c c0;
    private static final c[] d0;
    public static final /* enum */ c q;

    static {
        q = new c();
        c0 = new c();
        d0 = c.d();
    }

    private static /* synthetic */ c[] d() {
        return new c[]{q, c0};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])d0.clone();
    }
}

