/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import ax.p5.p;
import ax.t5.a;
import ax.w5.f;
import ax.w5.x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class d
implements x {
    private final Context a;
    private final ax.x5.d b;
    private final f c;

    public d(Context context, ax.x5.d d8, f f8) {
        this.a = context;
        this.b = d8;
        this.c = f8;
    }

    private boolean d(JobScheduler jobScheduler2, int n8, int n9) {
        for (JobScheduler jobScheduler2 : jobScheduler2.getAllPendingJobs()) {
            int n10 = jobScheduler2.getExtras().getInt("attemptNumber");
            if (jobScheduler2.getId() != n8) continue;
            if (n10 < n9) break;
            return true;
        }
        return false;
    }

    @Override
    public void a(p p8, int n8) {
        this.b(p8, n8, false);
    }

    @Override
    public void b(p p8, int n8, boolean bl) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        int n9 = this.c(p8);
        if (!bl && this.d(jobScheduler, n9, n8)) {
            ax.t5.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", p8);
            return;
        }
        long l8 = this.b.K0(p8);
        JobInfo.Builder builder = this.c.c(new JobInfo.Builder(n9, componentName), p8.d(), l8, n8);
        componentName = new PersistableBundle();
        componentName.putInt("attemptNumber", n8);
        componentName.putString("backendName", p8.b());
        componentName.putInt("priority", ax.A5.a.a(p8.d()));
        if (p8.c() != null) {
            componentName.putString("extras", Base64.encodeToString((byte[])p8.c(), (int)0));
        }
        builder.setExtras((PersistableBundle)componentName);
        ax.t5.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", p8, n9, this.c.g(p8.d(), l8, n8), l8, n8);
        jobScheduler.schedule(builder.build());
    }

    int c(p p8) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(p8.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ax.A5.a.a(p8.d())).array());
        if (p8.c() != null) {
            adler32.update(p8.c());
        }
        return (int)adler32.getValue();
    }
}

