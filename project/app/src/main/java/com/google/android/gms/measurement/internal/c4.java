/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.Z3;
import java.util.Map;

public final class c4
implements Runnable {
    private int c0;
    private Exception d0;
    private byte[] e0;
    private Map f0;
    private Z3 q;

    public /* synthetic */ c4(Z3 z32, int n8, Exception exception, byte[] byArray, Map map) {
        this.q = z32;
        this.c0 = n8;
        this.d0 = exception;
        this.e0 = byArray;
        this.f0 = map;
    }

    @Override
    public final void run() {
        this.q.a(this.c0, this.d0, this.e0, this.f0);
    }
}

