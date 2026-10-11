/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import ax.M5.c;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.o;

final class n
implements c.e {
    final o a;

    n(o o8) {
        this.a = o8;
    }

    @Override
    public final void a() {
        c.o(this.a.q).post((Runnable)new m(this));
    }
}

