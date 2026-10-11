/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import ax.b6.s0;
import ax.b6.t0;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.i5;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.s;

public final class j5
extends k5 {
    private final AlarmManager d = (AlarmManager)((f3)this).a().getSystemService("alarm");
    private s e;
    private Integer f;

    protected j5(q5 q52) {
        super(q52);
    }

    private final int A() {
        if (this.f == null) {
            String string = ((f3)this).a().getPackageName();
            StringBuilder stringBuilder = new StringBuilder("measurement");
            stringBuilder.append(string);
            this.f = stringBuilder.toString().hashCode();
        }
        return this.f;
    }

    private final PendingIntent B() {
        Context context = ((f3)this).a();
        return t0.a(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), t0.a);
    }

    private final s C() {
        if (this.e == null) {
            this.e = new i5(this, this.b.o0());
        }
        return this.e;
    }

    @TargetApi(value=24)
    private final void D() {
        JobScheduler jobScheduler = (JobScheduler)((f3)this).a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(this.A());
        }
    }

    @Override
    protected final boolean x() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.B());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.D();
        }
        return false;
    }

    public final void y(long l8) {
        this.u();
        Context context = ((f3)this).a();
        if (!B5.d0(context)) {
            ((f3)this).k().F().a("Receiver not registered/enabled");
        }
        if (!B5.e0(context, false)) {
            ((f3)this).k().F().a("Service not registered/enabled");
        }
        this.z();
        ((f3)this).k().K().b("Scheduling upload, millis", l8);
        long l9 = ((f3)this).b().b();
        if (l8 < Math.max(0L, (Long)F.y.a(null)) && !this.C().e()) {
            this.C().b(l8);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            context = ((f3)this).a();
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int n8 = this.A();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            s0.c(context, new JobInfo.Builder(n8, componentName).setMinimumLatency(l8).setOverrideDeadline(l8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        context = this.d;
        if (context != null) {
            context.setInexactRepeating(2, l9 + l8, Math.max((Long)F.t.a(null), l8), this.B());
        }
    }

    public final void z() {
        this.u();
        ((f3)this).k().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(this.B());
        }
        this.C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            this.D();
        }
    }
}

