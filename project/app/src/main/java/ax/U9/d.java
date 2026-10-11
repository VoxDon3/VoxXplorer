/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import ax.U9.l;

abstract class d
extends Enum<d> {
    public static final /* enum */ d c0;
    private static final d[] d0;
    public static final /* enum */ d q;

    static {
        q = new d(){

            @Override
            public l h() {
                return l.q;
            }
        };
        c0 = new d(){

            @Override
            public l h() {
                return l.c0;
            }
        };
        d0 = d.d();
    }

    private static /* synthetic */ d[] d() {
        return new d[]{q, c0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])d0.clone();
    }

    public abstract l h();
}

