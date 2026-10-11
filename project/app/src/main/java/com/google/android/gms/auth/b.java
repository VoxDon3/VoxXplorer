/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth;

final class b
extends Enum {
    public static final /* enum */ b c0;
    public static final /* enum */ b d0;
    private static final b[] e0;
    public static final /* enum */ b q;

    static {
        b b8;
        b b9;
        b b10;
        q = b10 = new b("LEGACY", 0);
        c0 = b9 = new b("AUTH_INSTANTIATION", 1);
        d0 = b8 = new b("CALLER_INSTANTIATION", 2);
        e0 = new b[]{b10, b9, b8};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b() {
        void var2_-1;
        void var1_-1;
    }

    public static b[] values() {
        return (b[])e0.clone();
    }
}

