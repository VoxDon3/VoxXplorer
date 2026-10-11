/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import ax.E0.a;
import ax.f6.A;
import com.google.android.gms.measurement.internal.S4;

public final class AppMeasurementService
extends Service
implements A {
    private S4<AppMeasurementService> a;

    private final S4<AppMeasurementService> c() {
        if (this.a == null) {
            this.a = new S4<AppMeasurementService>(this);
        }
        return this.a;
    }

    @Override
    public final void a(Intent intent) {
        ax.E0.a.b(intent);
    }

    @Override
    public final void b(JobParameters jobParameters, boolean bl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean d(int n8) {
        return this.stopSelfResult(n8);
    }

    public final IBinder onBind(Intent intent) {
        return this.c().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        this.c().c();
    }

    public final void onDestroy() {
        this.c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        this.c().i(intent);
    }

    public final int onStartCommand(Intent intent, int n8, int n9) {
        return this.c().a(intent, n8, n9);
    }

    public final boolean onUnbind(Intent intent) {
        return this.c().k(intent);
    }
}

