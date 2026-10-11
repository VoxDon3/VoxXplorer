/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public final class j
extends Enum<j> {
    public static final /* enum */ j c0;
    public static final /* enum */ j d0;
    private static final j[] e0;
    public static final /* enum */ j q;

    static {
        q = new j();
        c0 = new j();
        d0 = new j();
        e0 = j.d();
    }

    private static /* synthetic */ j[] d() {
        return new j[]{q, c0, d0};
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])e0.clone();
    }
}

