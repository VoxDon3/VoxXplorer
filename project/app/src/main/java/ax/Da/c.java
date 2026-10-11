/*
 * Decompiled with CFR 0.152.
 */
package ax.Da;

public final class c
extends Enum<c> {
    public static final /* enum */ c c0 = new c("inapp");
    public static final /* enum */ c d0 = new c("subs");
    private static final c[] e0 = c.d();
    public final String q;

    private c(String string2) {
        this.q = string2;
    }

    private static /* synthetic */ c[] d() {
        return new c[]{c0, d0};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])e0.clone();
    }
}

