/*
 * Decompiled with CFR 0.152.
 */
package ax.n5;

public final class e
extends Enum<e> {
    public static final /* enum */ e c0;
    public static final /* enum */ e d0;
    private static final e[] e0;
    public static final /* enum */ e q;

    static {
        e e8;
        e e9;
        e e10;
        q = e10 = new e();
        c0 = e9 = new e();
        d0 = e8 = new e();
        e0 = new e[]{e10, e9, e8};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])e0.clone();
    }
}

