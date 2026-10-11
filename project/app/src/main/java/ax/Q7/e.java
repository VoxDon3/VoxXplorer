/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

final class e
extends Enum<e> {
    public static final /* enum */ e c0;
    public static final /* enum */ e d0;
    private static final e[] e0;
    public static final /* enum */ e q;

    static {
        q = new e();
        c0 = new e();
        d0 = new e();
        e0 = e.d();
    }

    private static /* synthetic */ e[] d() {
        return new e[]{q, c0, d0};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])e0.clone();
    }
}

