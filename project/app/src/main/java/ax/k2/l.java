/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

public final class l
extends Enum<l> {
    public static final /* enum */ l c0;
    private static final l[] d0;
    public static final /* enum */ l q;

    static {
        q = new l();
        c0 = new l();
        d0 = l.d();
    }

    private static final /* synthetic */ l[] d() {
        return new l[]{q, c0};
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static l[] values() {
        return (l[])d0.clone();
    }
}

