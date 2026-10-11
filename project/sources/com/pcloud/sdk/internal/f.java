package com.pcloud.sdk.internal;

import ax.xc.C3487e;
import ax.xc.InterfaceC3482A;
import java.io.IOException;

/* loaded from: classes3.dex */
final class f extends ax.xc.j {
    private final long c0;
    private final ax.la.r d0;
    private long e0;
    private final long f0;
    private long q;

    f(InterfaceC3482A interfaceC3482A, long j, ax.la.r rVar, long j2) {
        super(interfaceC3482A);
        this.f0 = j;
        this.c0 = j2;
        this.d0 = rVar;
    }

    @Override // ax.xc.j, ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) throws IOException {
        super.write(c3487e, j);
        long j2 = this.e0 + j;
        this.e0 = j2;
        if (j2 - this.q >= this.c0) {
            this.d0.a(j2, this.f0);
            this.q = this.e0;
        }
    }
}
