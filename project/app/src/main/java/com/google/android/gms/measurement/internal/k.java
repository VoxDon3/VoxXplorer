/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

final class k
extends Enum<k> {
    public static final /* enum */ k c0;
    public static final /* enum */ k d0;
    public static final /* enum */ k e0;
    public static final /* enum */ k f0;
    public static final /* enum */ k g0;
    public static final /* enum */ k h0;
    public static final /* enum */ k i0;
    public static final /* enum */ k j0;
    public static final /* enum */ k k0;
    public static final /* enum */ k l0;
    private static final k[] m0;
    private final char q;

    static {
        k k8;
        k k9;
        k k10;
        k k11;
        k k12;
        k k13;
        k k14;
        k k15;
        k k16;
        k k17;
        c0 = k17 = new k('0');
        d0 = k16 = new k('1');
        e0 = k15 = new k('2');
        f0 = k14 = new k('3');
        g0 = k13 = new k('4');
        h0 = k12 = new k('5');
        i0 = k11 = new k('6');
        j0 = k10 = new k('7');
        k0 = k9 = new k('8');
        l0 = k8 = new k('9');
        m0 = new k[]{k17, k16, k15, k14, k13, k12, k11, k10, k9, k8};
    }

    private k(char c8) {
        this.q = c8;
    }

    static /* bridge */ /* synthetic */ char d(k k8) {
        return k8.q;
    }

    public static k h(char c8) {
        for (k k8 : k.values()) {
            if (k8.q != c8) continue;
            return k8;
        }
        return c0;
    }

    public static k[] values() {
        return (k[])m0.clone();
    }
}

