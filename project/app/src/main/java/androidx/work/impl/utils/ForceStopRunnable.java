/*
 * Decompiled with CFR 0.152.
 */
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
import ax.B2.r;
import ax.C2.A;
import ax.C2.D;
import ax.C2.u;
import ax.F2.l;
import ax.K2.v;
import ax.K2.w;
import ax.L2.e;
import ax.L2.f;
import ax.L2.g;
import ax.L2.h;
import ax.L2.s;
import ax.L2.t;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable
implements Runnable {
    private static final String f0 = i.i("ForceStopRunnable");
    private static final long g0 = TimeUnit.DAYS.toMillis(3650L);
    private final D c0;
    private final s d0;
    private int e0;
    private final Context q;

    public ForceStopRunnable(Context context, D d8) {
        this.q = context.getApplicationContext();
        this.c0 = d8;
        this.d0 = d8.k();
        this.e0 = 0;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int n8) {
        return PendingIntent.getBroadcast((Context)context, (int)-1, (Intent)ForceStopRunnable.c(context), (int)n8);
    }

    @SuppressLint(value={"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n8 = Build.VERSION.SDK_INT >= 31 ? 0xA000000 : 0x8000000;
        context = ForceStopRunnable.d(context, n8);
        long l8 = System.currentTimeMillis();
        long l9 = g0;
        if (alarmManager != null) {
            alarmManager.setExact(0, l8 + l9, (PendingIntent)context);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        Throwable throwable2;
        WorkDatabase workDatabase;
        block4: {
            boolean bl;
            Object object;
            boolean bl2 = Build.VERSION.SDK_INT >= 23 ? l.i(this.q, this.c0) : false;
            workDatabase = this.c0.o();
            w w8 = workDatabase.I();
            ax.K2.r r8 = workDatabase.H();
            workDatabase.e();
            try {
                object = w8.i();
                bl = object != null && !object.isEmpty();
            }
            catch (Throwable throwable2) {
                break block4;
            }
            if (bl) {
                object = object.iterator();
                while (object.hasNext()) {
                    v v8 = (v)object.next();
                    w8.j(r.q, v8.a);
                    w8.b(v8.a, -1L);
                }
            }
            r8.a();
            workDatabase.A();
            workDatabase.i();
            if (bl) return true;
            if (!bl2) return false;
            return true;
        }
        workDatabase.i();
        throw throwable2;
    }

    public void b() {
        boolean bl = this.a();
        if (this.h()) {
            i.e().a(f0, "Rescheduling Workers.");
            this.c0.s();
            this.c0.k().e(false);
            return;
        }
        if (this.e()) {
            i.e().a(f0, "Application was force-stopped, rescheduling.");
            this.c0.s();
            this.d0.d(System.currentTimeMillis());
            return;
        }
        if (bl) {
            i.e().a(f0, "Found unfinished work, scheduling it.");
            u.b(this.c0.h(), this.c0.o(), this.c0.m());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"ClassVerificationFailure"})
    public boolean e() {
        Throwable var5_6;
        block9: {
            PendingIntent pendingIntent;
            block7: {
                List list;
                int n8;
                block8: {
                    try {
                        int n9 = Build.VERSION.SDK_INT;
                        n8 = n9 >= 31 ? 0x22000000 : 0x20000000;
                        pendingIntent = ForceStopRunnable.d(this.q, n8);
                        if (n9 < 30) break block7;
                        if (pendingIntent == null) break block8;
                        pendingIntent.cancel();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        break block9;
                    }
                    catch (SecurityException securityException) {
                        break block9;
                    }
                }
                if ((list = e.a((ActivityManager)this.q.getSystemService("activity"), null, 0, 0)) == null || list.isEmpty()) return false;
                long l8 = this.d0.a();
                for (n8 = 0; n8 < list.size(); ++n8) {
                    pendingIntent = f.a(list.get(n8));
                    if (g.a((ApplicationExitInfo)pendingIntent) != 10 || h.a((ApplicationExitInfo)pendingIntent) < l8) continue;
                    return true;
                }
                return false;
            }
            if (pendingIntent != null) return false;
            ForceStopRunnable.g(this.q);
            return true;
        }
        i.e().l(f0, "Ignoring exception", (Throwable)var5_6);
        return true;
    }

    public boolean f() {
        Object object = this.c0.h();
        if (TextUtils.isEmpty((CharSequence)((a)object).c())) {
            i.e().a(f0, "The default process name was not specified.");
            return true;
        }
        boolean bl = t.b(this.q, (a)object);
        i i8 = i.e();
        object = f0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Is default app process = ");
        stringBuilder.append(bl);
        i8.a((String)object, stringBuilder.toString());
        return bl;
    }

    public boolean h() {
        return this.c0.k().b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void i(long l8) {
        try {
            Thread.sleep(l8);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Throwable throwable2;
        block19: {
            try {
                boolean bl = this.f();
                if (!bl) {
                    this.c0.r();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block19;
            }
            while (true) {
                CharSequence charSequence;
                Object object;
                int n8;
                Object object2;
                try {
                    A.d(this.q);
                    i.e().a(f0, "Performing cleanup operations.");
                }
                catch (SQLiteException sQLiteException) {
                    i.e().c(f0, "Unexpected SQLite exception during migrations");
                    object2 = new IllegalStateException("Unexpected SQLite exception during migrations", sQLiteException);
                    ax.b0.a<Throwable> a8 = this.c0.h().e();
                    if (a8 == null) throw object2;
                    a8.accept((Throwable)object2);
                    break;
                }
                try {
                    this.b();
                    break;
                }
                catch (SQLiteAccessPermException sQLiteAccessPermException) {
                }
                catch (SQLiteConstraintException sQLiteConstraintException) {
                }
                catch (SQLiteTableLockedException sQLiteTableLockedException) {
                }
                catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                }
                catch (SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException) {
                }
                catch (SQLiteDiskIOException sQLiteDiskIOException) {
                }
                catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
                    // empty catch block
                }
                this.e0 = n8 = this.e0 + 1;
                if (n8 >= 3) {
                    object = i.e();
                    charSequence = f0;
                    ((i)object).d((String)charSequence, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)object2);
                    object = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", (Throwable)object2);
                    object2 = this.c0.h().e();
                    if (object2 == null) {
                        throw object;
                    }
                    i.e().b((String)charSequence, "Routing exception to the specified exception handler", (Throwable)object);
                    object2.accept(object);
                    break;
                }
                long l8 = n8;
                i i8 = i.e();
                object = f0;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Retrying after ");
                ((StringBuilder)charSequence).append(l8 * 300L);
                i8.b((String)object, ((StringBuilder)charSequence).toString(), (Throwable)object2);
                this.i((long)this.e0 * 300L);
            }
            this.c0.r();
            return;
        }
        this.c0.r();
        throw throwable2;
    }

    public static class BroadcastReceiver
    extends android.content.BroadcastReceiver {
        private static final String a = i.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                i.e().j(a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }
}

