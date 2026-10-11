/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.j;
import com.pcloud.sdk.internal.E;

public final class D
implements Runnable {
    public final j c0;
    public final Object d0;
    public final E.a q;

    public /* synthetic */ D(E.a a8, j j8, Object object) {
        this.q = a8;
        this.c0 = j8;
        this.d0 = object;
    }

    @Override
    public final void run() {
        E.a.c(this.q, this.c0, this.d0);
    }
}

