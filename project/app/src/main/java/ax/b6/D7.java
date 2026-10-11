/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

public final class D7
extends Enum<D7> {
    public static final /* enum */ D7 c0;
    public static final /* enum */ D7 d0;
    public static final /* enum */ D7 e0;
    public static final /* enum */ D7 f0;
    private static final D7[] g0;
    public static final /* enum */ D7 q;

    static {
        D7 d72;
        D7 d73;
        D7 d74;
        D7 d75;
        D7 d76;
        q = d76 = new D7(3);
        c0 = d75 = new D7(6);
        d0 = d74 = new D7(4);
        e0 = d73 = new D7(2);
        f0 = d72 = new D7(5);
        g0 = new D7[]{d76, d75, d74, d73, d72};
    }

    private D7(int n9) {
    }

    public static D7 d(int n8) {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 5) {
                    if (n8 != 6) {
                        return d0;
                    }
                    return c0;
                }
                return f0;
            }
            return q;
        }
        return e0;
    }

    public static D7[] values() {
        return (D7[])g0.clone();
    }
}

