/*
 * Decompiled with CFR 0.152.
 */
package ax.sc;

import ax.oc.a;

public final class b
extends Enum<b> {
    public static final /* enum */ b c0;
    public static final /* enum */ b d0;
    private static final b[] e0;
    private int q;

    static {
        b b8;
        b b9;
        c0 = b9 = new b(1);
        d0 = b8 = new b(2);
        e0 = new b[]{b9, b8};
    }

    private b(int n9) {
        this.q = n9;
    }

    public static b d(int n8) throws a {
        for (b b8 : b.values()) {
            if (b8.q != n8) continue;
            return b8;
        }
        throw new a("Unsupported Aes version");
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])e0.clone();
    }
}

