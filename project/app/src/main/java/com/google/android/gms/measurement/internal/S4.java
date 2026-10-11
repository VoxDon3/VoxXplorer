/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ax.M5.p;
import ax.f6.A;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.R4;
import com.google.android.gms.measurement.internal.T4;
import com.google.android.gms.measurement.internal.U4;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.q5;

public final class S4<T extends Context> {
    private final T a;

    public S4(T t8) {
        p.l(t8);
        this.a = t8;
    }

    private final void f(Runnable runnable2) {
        q5 q52 = q5.m(this.a);
        q52.l().D(new T4(this, q52, runnable2));
    }

    private final V1 j() {
        return E2.c(this.a, null, null).k();
    }

    public final int a(Intent intent, int n8, int n9) {
        V1 v12 = E2.c(this.a, null, null).k();
        if (intent == null) {
            v12.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String string = intent.getAction();
        v12.K().c("Local AppMeasurementService called. startId, action", n9, string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            this.f(new U4(this, n9, v12, intent));
        }
        return 2;
    }

    public final IBinder b(Intent object) {
        if (object == null) {
            this.j().G().a("onBind called with null intent");
            return null;
        }
        if ("com.google.android.gms.measurement.START".equals(object = object.getAction())) {
            return new I2(q5.m(this.a));
        }
        this.j().L().b("onBind received unknown action", object);
        return null;
    }

    public final void c() {
        E2.c(this.a, null, null).k().K().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int n8, V1 v12, Intent intent) {
        if (((A)this.a).d(n8)) {
            v12.K().b("Local AppMeasurementService processed last upload request. StartId", n8);
            this.j().K().a("Completed wakeful intent.");
            ((A)this.a).a(intent);
        }
    }

    final /* synthetic */ void e(V1 v12, JobParameters jobParameters) {
        v12.K().a("AppMeasurementJobService processed last upload request.");
        ((A)this.a).b(jobParameters, false);
    }

    @TargetApi(value=24)
    public final boolean g(JobParameters jobParameters) {
        V1 v12 = E2.c(this.a, null, null).k();
        String string = jobParameters.getExtras().getString("action");
        v12.K().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            this.f(new R4(this, v12, jobParameters));
        }
        return true;
    }

    public final void h() {
        E2.c(this.a, null, null).k().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent object) {
        if (object == null) {
            this.j().G().a("onRebind called with null intent");
            return;
        }
        object = object.getAction();
        this.j().K().b("onRebind called. action", object);
    }

    public final boolean k(Intent object) {
        if (object == null) {
            this.j().G().a("onUnbind called with null intent");
            return true;
        }
        object = object.getAction();
        this.j().K().b("onUnbind called for intent. action", object);
        return true;
    }
}

