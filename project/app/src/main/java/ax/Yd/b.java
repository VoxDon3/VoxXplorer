/*
 * Decompiled with CFR 0.152.
 */
package ax.Yd;

public final class b
extends Enum<b> {
    public static final /* enum */ b d0 = new b(40, "ERROR");
    public static final /* enum */ b e0 = new b(30, "WARN");
    public static final /* enum */ b f0 = new b(20, "INFO");
    public static final /* enum */ b g0 = new b(10, "DEBUG");
    public static final /* enum */ b h0 = new b(0, "TRACE");
    private static final b[] i0 = b.d();
    private final String c0;
    private final int q;

    private b(int n9, String string2) {
        this.q = n9;
        this.c0 = string2;
    }

    private static /* synthetic */ b[] d() {
        return new b[]{d0, e0, f0, g0, h0};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])i0.clone();
    }

    public int h() {
        return this.q;
    }

    public String toString() {
        return this.c0;
    }
}

