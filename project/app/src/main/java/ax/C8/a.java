/*
 * Decompiled with CFR 0.152.
 */
package ax.C8;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    private static final a[] e0;
    private int q;

    static {
        a a8;
        a a9;
        c0 = a9 = new a(0);
        d0 = a8 = new a(32);
        e0 = new a[]{a9, a8};
    }

    private a(int n9) {
        this.q = n9;
    }

    public static a h(byte by) {
        if ((by & 0x20) == 0) {
            return c0;
        }
        return d0;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])e0.clone();
    }

    public int d() {
        return this.q;
    }
}

