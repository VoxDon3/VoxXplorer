/*
 * Decompiled with CFR 0.152.
 */
package ax.Da;

import ax.Ea.b;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0 = new a(-1);
    public static final /* enum */ a d0 = new a(0);
    public static final /* enum */ a e0 = new a(1);
    public static final /* enum */ a f0 = new a(2);
    private static final a[] g0 = a.d();
    public final int q;

    private a(int n9) {
        this.q = n9;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0};
    }

    public static a h(int n8) throws b {
        for (a object2 : a.values()) {
            if (object2.q != n8) continue;
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized LicenseState code: ");
        stringBuilder.append(n8);
        throw new b(stringBuilder.toString());
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])g0.clone();
    }
}

