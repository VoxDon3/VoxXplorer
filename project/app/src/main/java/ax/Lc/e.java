/*
 * Decompiled with CFR 0.152.
 */
package ax.Lc;

public final class e
extends Enum<e> {
    public static final /* enum */ e c0 = new e("\r");
    public static final /* enum */ e d0 = new e("\r\n");
    public static final /* enum */ e e0 = new e("\n");
    private static final e[] f0 = e.d();
    private final String q;

    private e(String string2) {
        j.Objects.requireNonNull((Object)string2, (String)"lineSeparator");
        this.q = string2;
    }

    private static /* synthetic */ e[] d() {
        return new e[]{c0, d0, e0};
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])f0.clone();
    }

    public String h() {
        return this.q;
    }
}

