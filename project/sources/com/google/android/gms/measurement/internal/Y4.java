package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Y4 implements Runnable {
    long c0;
    final /* synthetic */ Z4 d0;
    long q;

    Y4(Z4 z4, long j, long j2) {
        this.d0 = z4;
        this.q = j;
        this.c0 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d0.b.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.b5
            @Override // java.lang.Runnable
            public final void run() {
                Y4 y4 = Y4.this;
                Z4 z4 = y4.d0;
                long j = y4.q;
                long j2 = y4.c0;
                z4.b.n();
                z4.b.k().F().a("Application going to the background");
                z4.b.h().u.a(true);
                z4.b.D(true);
                if (!z4.b.d().T()) {
                    if (z4.b.d().t(F.I0)) {
                        z4.b.E(false, false, j2);
                        z4.b.f.e(j2);
                    } else {
                        z4.b.f.e(j2);
                        z4.b.E(false, false, j2);
                    }
                }
                z4.b.k().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
            }
        });
    }
}
