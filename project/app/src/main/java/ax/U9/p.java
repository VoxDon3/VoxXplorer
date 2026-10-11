/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public final class p
extends Enum<p> {
    private static final p[] c0;
    public static final /* enum */ p q;

    static {
        q = new p();
        c0 = p.d();
    }

    private static /* synthetic */ p[] d() {
        return new p[]{q};
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    public static p[] values() {
        return (p[])c0.clone();
    }
}

