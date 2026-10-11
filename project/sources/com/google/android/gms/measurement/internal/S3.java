package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class S3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ C3746u q;

    S3(C3688k3 c3688k3, C3746u c3746u) {
        this.q = c3746u;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c0.h().A(this.q)) {
            this.c0.k().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.q.a()));
            return;
        }
        this.c0.k().K().b("Setting DMA consent(FE)", this.q);
        if (this.c0.t().i0()) {
            this.c0.t().d0();
        } else {
            this.c0.t().U(false);
        }
    }
}
