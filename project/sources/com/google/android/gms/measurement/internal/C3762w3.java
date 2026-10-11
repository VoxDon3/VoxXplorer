package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import ax.v7.InterfaceC3289b;

/* renamed from: com.google.android.gms.measurement.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3762w3 implements InterfaceC3289b<Object> {
    private final /* synthetic */ C3669h5 a;
    private final /* synthetic */ C3688k3 b;

    C3762w3(C3688k3 c3688k3, C3669h5 c3669h5) {
        this.a = c3669h5;
        this.b = c3688k3;
    }

    @Override // ax.v7.InterfaceC3289b
    public final void a(Object obj) {
        this.b.n();
        if (!this.b.d().t(F.G0)) {
            this.b.i = false;
            this.b.F0();
            this.b.k().F().b("registerTriggerAsync ran. uri", this.a.q);
            return;
        }
        SparseArray<Long> K = this.b.h().K();
        C3669h5 c3669h5 = this.a;
        K.put(c3669h5.d0, Long.valueOf(c3669h5.c0));
        this.b.h().v(K);
        this.b.i = false;
        this.b.j = 1;
        this.b.k().F().b("Successfully registered trigger URI", this.a.q);
        this.b.F0();
    }

    @Override // ax.v7.InterfaceC3289b
    public final void b(Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        this.b.n();
        this.b.i = false;
        if (!this.b.d().t(F.G0)) {
            this.b.F0();
            this.b.k().G().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        this.b.z0().add(this.a);
        i = this.b.j;
        if (i > 64) {
            this.b.j = 1;
            this.b.k().L().c("registerTriggerAsync failed. May try later. App ID, throwable", V1.v(this.b.p().F()), V1.v(th.toString()));
            return;
        }
        X1 L = this.b.k().L();
        Object v = V1.v(this.b.p().F());
        i2 = this.b.j;
        L.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", v, V1.v(String.valueOf(i2)), V1.v(th.toString()));
        C3688k3 c3688k3 = this.b;
        i3 = c3688k3.j;
        C3688k3.N0(c3688k3, i3);
        C3688k3 c3688k32 = this.b;
        i4 = c3688k32.j;
        c3688k32.j = i4 << 1;
    }
}
