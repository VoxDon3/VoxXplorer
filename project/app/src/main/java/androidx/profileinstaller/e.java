/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

final class e
extends Enum<e> {
    public static final /* enum */ e c0 = new e(0L);
    public static final /* enum */ e d0 = new e(1L);
    public static final /* enum */ e e0 = new e(2L);
    public static final /* enum */ e f0 = new e(3L);
    public static final /* enum */ e g0 = new e(4L);
    private static final e[] h0 = e.d();
    private final long q;

    private e(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ e[] d() {
        return new e[]{c0, d0, e0, f0, g0};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])h0.clone();
    }

    public long h() {
        return this.q;
    }
}

