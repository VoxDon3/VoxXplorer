/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.f6.i;
import com.google.android.gms.measurement.internal.c2;
import java.util.List;
import java.util.Map;

final class b2
implements Runnable {
    private final int c0;
    private final Throwable d0;
    private final byte[] e0;
    private final String f0;
    private final Map<String, List<String>> g0;
    private final c2 q;

    private b2(String string, c2 c22, int n8, Throwable throwable, byte[] byArray, Map<String, List<String>> map) {
        p.l(c22);
        this.q = c22;
        this.c0 = n8;
        this.d0 = throwable;
        this.e0 = byArray;
        this.f0 = string;
        this.g0 = map;
    }

    /* synthetic */ b2(String string, c2 c22, int n8, Throwable throwable, byte[] byArray, Map map, i i8) {
        this(string, c22, n8, throwable, byArray, map);
    }

    @Override
    public final void run() {
        this.q.a(this.f0, this.c0, this.d0, this.e0, this.g0);
    }
}

