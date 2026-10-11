package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Z2 implements Runnable {
    private final /* synthetic */ E5 c0;
    private final /* synthetic */ I2 d0;
    private final /* synthetic */ D q;

    Z2(I2 i2, D d, E5 e5) {
        this.q = d;
        this.c0 = e5;
        this.d0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d0.f2(this.d0.c2(this.q, this.c0), this.c0);
    }
}
