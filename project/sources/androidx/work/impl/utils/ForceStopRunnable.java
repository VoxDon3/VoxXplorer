package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import ax.B2.i;
import ax.C2.A;
import ax.C2.D;
import ax.C2.u;
import ax.F2.l;
import ax.K2.r;
import ax.K2.v;
import ax.K2.w;
import ax.L2.f;
import ax.L2.s;
import ax.L2.t;
import ax.b0.InterfaceC1440a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    private static final String f0 = i.i("ForceStopRunnable");
    private static final long g0 = TimeUnit.DAYS.toMillis(3650);
    private final D c0;
    private final s d0;
    private int e0 = 0;
    private final Context q;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = i.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            i.e().j(a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, D d) {
        this.q = context.getApplicationContext();
        this.c0 = d;
        this.d0 = d.k();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + g0;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    public boolean a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? l.i(this.q, this.c0) : false;
        WorkDatabase o = this.c0.o();
        w I = o.I();
        r H = o.H();
        o.e();
        try {
            List<v> i2 = I.i();
            boolean z = (i2 == null || i2.isEmpty()) ? false : true;
            if (z) {
                for (v vVar : i2) {
                    I.j(ax.B2.r.ENQUEUED, vVar.a);
                    I.b(vVar.a, -1L);
                }
            }
            H.a();
            o.A();
            o.i();
            return z || i;
        } catch (Throwable th) {
            o.i();
            throw th;
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            i.e().a(f0, "Rescheduling Workers.");
            this.c0.s();
            this.c0.k().e(false);
        } else if (e()) {
            i.e().a(f0, "Application was force-stopped, rescheduling.");
            this.c0.s();
            this.d0.d(System.currentTimeMillis());
        } else if (a) {
            i.e().a(f0, "Found unfinished work, scheduling it.");
            u.b(this.c0.h(), this.c0.o(), this.c0.m());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i = Build.VERSION.SDK_INT;
            PendingIntent d = d(this.q, i >= 31 ? 570425344 : 536870912);
            if (i >= 30) {
                if (d != null) {
                    d.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.q.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a = this.d0.a();
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo a2 = f.a(historicalProcessExitReasons.get(i2));
                        reason = a2.getReason();
                        if (reason == 10) {
                            timestamp = a2.getTimestamp();
                            if (timestamp >= a) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d == null) {
                g(this.q);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            i.e().l(f0, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            i.e().l(f0, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a h = this.c0.h();
        if (TextUtils.isEmpty(h.c())) {
            i.e().a(f0, "The default process name was not specified.");
            return true;
        }
        boolean b = t.b(this.q, h);
        i.e().a(f0, "Is default app process = " + b);
        return b;
    }

    public boolean h() {
        return this.c0.k().b();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (f()) {
                while (true) {
                    try {
                        A.d(this.q);
                        i.e().a(f0, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                            i = this.e0 + 1;
                            this.e0 = i;
                            if (i >= 3) {
                                i e2 = i.e();
                                String str = f0;
                                e2.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                InterfaceC1440a<Throwable> e3 = this.c0.h().e();
                                if (e3 == null) {
                                    throw illegalStateException;
                                }
                                i.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                e3.accept(illegalStateException);
                            } else {
                                i.e().b(f0, "Retrying after " + (i * 300), e);
                                i(((long) this.e0) * 300);
                            }
                        }
                        i.e().b(f0, "Retrying after " + (i * 300), e);
                        i(((long) this.e0) * 300);
                    } catch (SQLiteException e4) {
                        i.e().c(f0, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
                        InterfaceC1440a<Throwable> e5 = this.c0.h().e();
                        if (e5 == null) {
                            throw illegalStateException2;
                        }
                        e5.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.c0.r();
        }
    }
}
