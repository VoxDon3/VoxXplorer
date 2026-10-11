/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

public final class e
extends Enum<e> {
    public static final /* enum */ e c0;
    private static final e[] d0;
    public static final /* enum */ e q;

    static {
        e e8;
        e e9;
        q = e9 = new e();
        c0 = e8 = new e();
        d0 = new e[]{e9, e8};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])d0.clone();
    }
}

