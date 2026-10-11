/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import ax.B2.i;
import ax.C2.D;
import ax.C2.e;
import ax.C2.v;
import ax.C2.w;
import ax.K2.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService
extends JobService
implements e {
    private static final String d = i.i("SystemJobService");
    private D a;
    private final Map<m, JobParameters> b = new HashMap<m, JobParameters>();
    private final w c = new w();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static m a(JobParameters object) {
        PersistableBundle persistableBundle;
        try {
            persistableBundle = object.getExtras();
            if (persistableBundle == null) return null;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
        if (!persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) return null;
        return new m(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e(m m8, boolean bl) {
        i i8 = i.e();
        Object object = d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m8.b());
        stringBuilder.append(" executed on JobScheduler");
        i8.a((String)object, stringBuilder.toString());
        object = this.b;
        synchronized (object) {
            stringBuilder = this.b.remove(m8);
        }
        this.c.b(m8);
        if (stringBuilder != null) {
            this.jobFinished((JobParameters)stringBuilder, bl);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            D d8;
            this.a = d8 = D.j(this.getApplicationContext());
            d8.l().g(this);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            if (Application.class.equals(this.getApplication().getClass())) {
                i.e().k(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        D d8 = this.a;
        if (d8 != null) {
            d8.l().l(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean onStartJob(JobParameters object) {
        if (this.a == null) {
            i.e().a(d, "WorkManager is not initialized; requesting retry.");
            this.jobFinished((JobParameters)object, true);
            return false;
        }
        m m8 = SystemJobService.a((JobParameters)object);
        if (m8 == null) {
            i.e().c(d, "WorkSpec id not found!");
            return false;
        }
        Object object2 = this.b;
        // MONITORENTER : object2
        if (this.b.containsKey(m8)) {
            object = i.e();
            String string = d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Job is already being executed by SystemJobService: ");
            stringBuilder.append(m8);
            ((i)object).a(string, stringBuilder.toString());
            // MONITOREXIT : object2
            return false;
        }
        i i8 = i.e();
        Object object3 = d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onStartJob for ");
        stringBuilder.append(m8);
        i8.a((String)object3, stringBuilder.toString());
        this.b.put(m8, (JobParameters)object);
        // MONITOREXIT : object2
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            object3 = new WorkerParameters.a();
            if (androidx.work.impl.background.systemjob.SystemJobService$a.b((JobParameters)object) != null) {
                ((WorkerParameters.a)object3).b = Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService$a.b((JobParameters)object));
            }
            if (androidx.work.impl.background.systemjob.SystemJobService$a.a((JobParameters)object) != null) {
                ((WorkerParameters.a)object3).a = Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService$a.a((JobParameters)object));
            }
            object2 = object3;
            if (n8 >= 28) {
                ((WorkerParameters.a)object3).c = androidx.work.impl.background.systemjob.SystemJobService$b.a((JobParameters)object);
                object2 = object3;
            }
        } else {
            object2 = null;
        }
        this.a.v(this.c.d(m8), (WorkerParameters.a)object2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onStopJob(JobParameters object) {
        if (this.a == null) {
            i.e().a(d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        if ((object = SystemJobService.a((JobParameters)object)) == null) {
            i.e().c(d, "WorkSpec id not found!");
            return false;
        }
        Object object2 = i.e();
        String string = d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onStopJob for ");
        stringBuilder.append(object);
        ((i)object2).a(string, stringBuilder.toString());
        object2 = this.b;
        synchronized (object2) {
            this.b.remove(object);
        }
        object2 = this.c.b((m)object);
        if (object2 != null) {
            this.a.x((v)object2);
        }
        return this.a.l().j(((m)object).b()) ^ true;
    }

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }
}

