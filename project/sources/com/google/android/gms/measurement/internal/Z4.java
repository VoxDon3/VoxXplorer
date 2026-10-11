package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes3.dex */
final class Z4 {
    private Y4 a;
    final /* synthetic */ V4 b;

    Z4(V4 v4) {
        this.b = v4;
    }

    final void a() {
        Handler handler;
        this.b.n();
        if (this.a != null) {
            handler = this.b.c;
            handler.removeCallbacks(this.a);
        }
        this.b.h().u.a(false);
        this.b.D(false);
    }

    final void b(long j) {
        Handler handler;
        this.a = new Y4(this, this.b.b().a(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }
}
