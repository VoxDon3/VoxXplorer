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
import ax.C2.InterfaceC0656e;
import ax.C2.v;
import ax.C2.w;
import ax.K2.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0656e {
    private static final String d = i.i("SystemJobService");
    private D a;
    private final Map<m, JobParameters> b = new HashMap();
    private final w c = new w();

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

    private static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(m mVar, boolean z) {
        JobParameters remove;
        i.e().a(d, mVar.b() + " executed on JobScheduler");
        synchronized (this.b) {
            remove = this.b.remove(mVar);
        }
        this.c.b(mVar);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            D j = D.j(getApplicationContext());
            this.a = j;
            j.l().g(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            i.e().k(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        D d2 = this.a;
        if (d2 != null) {
            d2.l().l(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.a == null) {
            i.e().a(d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        m a2 = a(jobParameters);
        if (a2 == null) {
            i.e().c(d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(a2)) {
                    i.e().a(d, "Job is already being executed by SystemJobService: " + a2);
                    return false;
                }
                i.e().a(d, "onStartJob for " + a2);
                this.b.put(a2, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar = new WorkerParameters.a();
                    if (a.b(jobParameters) != null) {
                        aVar.b = Arrays.asList(a.b(jobParameters));
                    }
                    if (a.a(jobParameters) != null) {
                        aVar.a = Arrays.asList(a.a(jobParameters));
                    }
                    if (i >= 28) {
                        aVar.c = b.a(jobParameters);
                    }
                } else {
                    aVar = null;
                }
                this.a.v(this.c.d(a2), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.a == null) {
            i.e().a(d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m a2 = a(jobParameters);
        if (a2 == null) {
            i.e().c(d, "WorkSpec id not found!");
            return false;
        }
        i.e().a(d, "onStopJob for " + a2);
        synchronized (this.b) {
            this.b.remove(a2);
        }
        v b2 = this.c.b(a2);
        if (b2 != null) {
            this.a.x(b2);
        }
        return !this.a.l().j(a2.b());
    }
}
