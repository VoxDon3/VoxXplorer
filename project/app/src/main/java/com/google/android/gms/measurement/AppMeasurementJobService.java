/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import ax.f6.A;
import com.google.android.gms.measurement.internal.S4;

@TargetApi(value=24)
public final class AppMeasurementJobService
extends JobService
implements A {
    private S4<AppMeasurementJobService> a;

    private final S4<AppMeasurementJobService> c() {
        if (this.a == null) {
            this.a = new S4<AppMeasurementJobService>(this);
        }
        return this.a;
    }

    @Override
    public final void a(Intent intent) {
    }

    @Override
    @TargetApi(value=24)
    public final void b(JobParameters jobParameters, boolean bl) {
        this.jobFinished(jobParameters, false);
    }

    @Override
    public final boolean d(int n8) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return this.c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return this.c().k(intent);
    }
}

