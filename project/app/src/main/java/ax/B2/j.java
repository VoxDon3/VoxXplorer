/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

public final class j
extends Enum<j> {
    public static final /* enum */ j c0;
    public static final /* enum */ j d0;
    public static final /* enum */ j e0;
    public static final /* enum */ j f0;
    public static final /* enum */ j g0;
    private static final j[] h0;
    public static final /* enum */ j q;

    static {
        q = new j();
        c0 = new j();
        d0 = new j();
        e0 = new j();
        f0 = new j();
        g0 = new j();
        h0 = j.d();
    }

    private static final /* synthetic */ j[] d() {
        return new j[]{q, c0, d0, e0, f0, g0};
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])h0.clone();
    }
}

