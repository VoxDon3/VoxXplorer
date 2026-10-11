/*
 * Decompiled with CFR 0.152.
 */
package ax.xb;

import ax.zb.b;

public final class a
extends Enum<a> {
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    private static final a[] e0;
    private static final ax.zb.a f0;
    public static final /* enum */ a q;

    static {
        q = new a();
        c0 = new a();
        d0 = new a();
        Enum[] enumArray = a.d();
        e0 = enumArray;
        f0 = b.a((Enum[])enumArray);
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{q, c0, d0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])e0.clone();
    }
}

