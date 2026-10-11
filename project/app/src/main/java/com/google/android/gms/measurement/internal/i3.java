/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.h3;

public final class i3
extends Enum<i3> {
    public static final /* enum */ i3 c0;
    public static final /* enum */ i3 d0;
    private static final i3[] e0;
    private final h3.a[] q;

    static {
        i3 i32;
        i3 i33;
        c0 = i33 = new i3(h3.a.c0, h3.a.d0);
        d0 = i32 = new i3(h3.a.e0);
        e0 = new i3[]{i33, i32};
    }

    private i3(h3.a ... aArray) {
        this.q = aArray;
    }

    static /* bridge */ /* synthetic */ h3.a[] h(i3 i32) {
        return i32.q;
    }

    public static i3[] values() {
        return (i3[])e0.clone();
    }

    public final h3.a[] d() {
        return this.q;
    }
}

