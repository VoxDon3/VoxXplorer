/*
 * Decompiled with CFR 0.152.
 */
package ax.qa;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0 = new a(1);
    public static final /* enum */ a d0 = new a(2);
    public static final /* enum */ a e0 = new a(4);
    public static final /* enum */ a f0 = new a(8);
    private static final a[] g0 = a.d();
    private final byte q;

    private a(byte by) {
        this.q = (byte)(by - 1);
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])g0.clone();
    }

    public byte h() {
        return this.q;
    }
}

