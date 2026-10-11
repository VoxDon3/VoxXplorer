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
import ax.b6.C1659s0;
import ax.b6.C1667t0;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3683j5 extends AbstractC3690k5 {
    private final AlarmManager d;
    private AbstractC3734s e;
    private Integer f;

    protected C3683j5(q5 q5Var) {
        super(q5Var);
        this.d = (AlarmManager) a().getSystemService("alarm");
    }

    private final int A() {
        if (this.f == null) {
            this.f = Integer.valueOf(("measurement" + a().getPackageName()).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent B() {
        Context a = a();
        return C1667t0.a(a, 0, new Intent().setClassName(a, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C1667t0.a);
    }

    private final AbstractC3734s C() {
        if (this.e == null) {
            this.e = new C3676i5(this, this.b.o0());
        }
        return this.e;
    }

    @TargetApi(24)
    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ x5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ J5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3691l q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3726q2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ Q4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ o5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3690k5
    protected final boolean x() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        D();
        return false;
    }

    public final void y(long j) {
        u();
        Context a = a();
        if (!B5.d0(a)) {
            k().F().a("Receiver not registered/enabled");
        }
        if (!B5.e0(a, false)) {
            k().F().a("Service not registered/enabled");
        }
        z();
        k().K().b("Scheduling upload, millis", Long.valueOf(j));
        long b = b().b() + j;
        if (j < Math.max(0L, F.y.a(null).longValue()) && !C().e()) {
            C().b(j);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, b, Math.max(F.t.a(null).longValue(), j), B());
                return;
            }
            return;
        }
        Context a2 = a();
        ComponentName componentName = new ComponentName(a2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int A = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C1659s0.c(a2, new JobInfo.Builder(A, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        k().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}
