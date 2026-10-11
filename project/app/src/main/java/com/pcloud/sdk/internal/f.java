/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.r;
import ax.xc.A;
import ax.xc.e;
import ax.xc.j;
import java.io.IOException;

final class f
extends j {
    private final long c0;
    private final r d0;
    private long e0;
    private final long f0;
    private long q;

    f(A a8, long l8, r r8, long l9) {
        super(a8);
        this.f0 = l8;
        this.c0 = l9;
        this.d0 = r8;
    }

    @Override
    public void write(e e8, long l8) throws IOException {
        super.write(e8, l8);
        this.e0 = l8 = this.e0 + l8;
        if (l8 - this.q >= this.c0) {
            this.d0.a(l8, this.f0);
            this.q = this.e0;
        }
    }
}

