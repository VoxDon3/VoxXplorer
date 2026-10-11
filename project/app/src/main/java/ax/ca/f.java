/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

public final class f
extends Enum<f> {
    public static final /* enum */ f c0;
    public static final /* enum */ f d0;
    private static final f[] e0;
    public static final /* enum */ f q;

    static {
        q = new f();
        c0 = new f();
        d0 = new f();
        e0 = f.d();
    }

    private static /* synthetic */ f[] d() {
        return new f[]{q, c0, d0};
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])e0.clone();
    }
}

