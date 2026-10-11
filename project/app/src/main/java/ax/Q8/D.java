/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class D
extends Enum<D>
implements c<D> {
    public static final /* enum */ D e0 = new D(1L, "AES/CCM/NoPadding", 11);
    public static final /* enum */ D f0 = new D(2L, "AES/GCM/NoPadding", 12);
    private static final D[] g0 = D.d();
    private String c0;
    private int d0;
    private long q;

    private D(long l8, String string2, int n9) {
        this.q = l8;
        this.c0 = string2;
        this.d0 = n9;
    }

    private static /* synthetic */ D[] d() {
        return new D[]{e0, f0};
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    public static D[] values() {
        return (D[])g0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }

    public String h() {
        return this.c0;
    }

    public int j() {
        return this.d0;
    }
}

