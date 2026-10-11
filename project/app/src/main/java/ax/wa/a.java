/*
 * Decompiled with CFR 0.152.
 */
package ax.wa;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0 = new a(0);
    public static final /* enum */ a d0 = new a(1);
    public static final /* enum */ a e0 = new a(2);
    public static final /* enum */ a f0 = new a(501);
    public static final /* enum */ a g0 = new a(502);
    public static final /* enum */ a h0 = new a(503);
    private static final a[] i0 = a.d();
    private final int q;

    private a(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0, g0, h0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])i0.clone();
    }

    public int h() {
        return this.q;
    }
}

