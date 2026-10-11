package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3752v implements Runnable {
    private final /* synthetic */ AbstractC3734s c0;
    private final /* synthetic */ InterfaceC3660g3 q;

    RunnableC3752v(AbstractC3734s abstractC3734s, InterfaceC3660g3 interfaceC3660g3) {
        this.q = interfaceC3660g3;
        this.c0 = abstractC3734s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.e();
        if (C3628c.a()) {
            this.q.l().D(this);
            return;
        }
        boolean e = this.c0.e();
        this.c0.c = 0L;
        if (e) {
            this.c0.d();
        }
    }
}
