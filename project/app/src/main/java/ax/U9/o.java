/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public final class o
extends Enum<o> {
    public static final /* enum */ o c0;
    private static final o[] d0;
    public static final /* enum */ o q;

    static {
        q = new o();
        c0 = new o();
        d0 = o.d();
    }

    private static /* synthetic */ o[] d() {
        return new o[]{q, c0};
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public static o[] values() {
        return (o[])d0.clone();
    }
}

