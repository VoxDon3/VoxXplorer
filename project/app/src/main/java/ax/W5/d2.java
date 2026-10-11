/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.t0;

public final class d2
extends Enum {
    public static final /* enum */ d2 c0;
    public static final /* enum */ d2 d0;
    public static final /* enum */ d2 e0;
    public static final /* enum */ d2 f0;
    public static final /* enum */ d2 g0;
    public static final /* enum */ d2 h0;
    public static final /* enum */ d2 i0;
    public static final /* enum */ d2 j0;
    public static final /* enum */ d2 k0;
    private static final d2[] l0;
    private final Object q;

    static {
        d2 d22;
        d2 d23;
        d2 d24;
        d2 d25;
        d2 d26;
        d2 d27;
        d2 d28;
        d2 d29;
        d2 d210;
        c0 = d210 = new d2("INT", 0, (Object)0);
        d0 = d29 = new d2("LONG", 1, (Object)0L);
        e0 = d28 = new d2("FLOAT", 2, (Object)Float.valueOf(0.0f));
        f0 = d27 = new d2("DOUBLE", 3, (Object)0.0);
        g0 = d26 = new d2("BOOLEAN", 4, (Object)Boolean.FALSE);
        h0 = d25 = new d2("STRING", 5, (Object)"");
        i0 = d24 = new d2("BYTE_STRING", 6, (Object)t0.c0);
        j0 = d23 = new d2("ENUM", 7, null);
        k0 = d22 = new d2("MESSAGE", 8, null);
        l0 = new d2[]{d210, d29, d28, d27, d26, d25, d24, d23, d22};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d2() {
        Object var3_1;
        void var2_-1;
        void var1_-1;
        this.q = var3_1;
    }

    public static d2[] values() {
        return (d2[])l0.clone();
    }
}

