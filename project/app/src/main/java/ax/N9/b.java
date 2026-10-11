/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

public final class b
extends Enum<b> {
    public static final /* enum */ b c0;
    public static final /* enum */ b d0;
    private static final b[] e0;
    public static final /* enum */ b q;

    static {
        q = new b();
        c0 = new b();
        d0 = new b();
        e0 = b.d();
    }

    private static /* synthetic */ b[] d() {
        return new b[]{q, c0, d0};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])e0.clone();
    }
}

