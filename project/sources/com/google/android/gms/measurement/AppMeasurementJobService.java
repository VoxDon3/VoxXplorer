package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import ax.f6.InterfaceC2047A;
import com.google.android.gms.measurement.internal.S4;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC2047A {
    private S4<AppMeasurementJobService> a;

    private final S4<AppMeasurementJobService> c() {
        if (this.a == null) {
            this.a = new S4<>(this);
        }
        return this.a;
    }

    @Override // ax.f6.InterfaceC2047A
    public final void a(Intent intent) {
    }

    @Override // ax.f6.InterfaceC2047A
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // ax.f6.InterfaceC2047A
    public final boolean d(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
