/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.j;
import com.pcloud.sdk.internal.E;

public final class C
implements Runnable {
    public final j c0;
    public final Throwable d0;
    public final E.a q;

    public /* synthetic */ C(E.a a8, j j8, Throwable throwable) {
        this.q = a8;
        this.c0 = j8;
        this.d0 = throwable;
    }

    @Override
    public final void run() {
        E.a.d(this.q, this.c0, this.d0);
    }
}

