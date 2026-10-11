/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

public final class l
extends Enum<l> {
    public static final /* enum */ l c0;
    public static final /* enum */ l d0;
    private static final l[] e0;
    public static final /* enum */ l q;

    static {
        q = new l();
        c0 = new l();
        d0 = new l();
        e0 = l.d();
    }

    private static /* synthetic */ l[] d() {
        return new l[]{q, c0, d0};
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static l[] values() {
        return (l[])e0.clone();
    }
}

