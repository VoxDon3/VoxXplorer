/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

public final class f
extends Enum<f> {
    public static final /* enum */ f c0;
    public static final /* enum */ f d0;
    public static final /* enum */ f e0;
    private static final f[] f0;
    private float q;

    static {
        f f8;
        f f9;
        f f10;
        c0 = f10 = new f(0.5f);
        d0 = f9 = new f(1.0f);
        e0 = f8 = new f(1.5f);
        f0 = new f[]{f10, f9, f8};
    }

    private f(float f8) {
        this.q = f8;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static f[] values() {
        return (f[])f0.clone();
    }
}

