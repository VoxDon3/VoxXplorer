package ax.w5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import ax.t5.C3102a;
import ax.x5.InterfaceC3444d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* renamed from: ax.w5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3350d implements InterfaceC3370x {
    private final Context a;
    private final InterfaceC3444d b;
    private final AbstractC3352f c;

    public C3350d(Context context, InterfaceC3444d interfaceC3444d, AbstractC3352f abstractC3352f) {
        this.a = context;
        this.b = interfaceC3444d;
        this.c = abstractC3352f;
    }

    private boolean d(JobScheduler jobScheduler, int i, int i2) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.w5.InterfaceC3370x
    public void a(ax.p5.p pVar, int i) {
        b(pVar, i, false);
    }

    @Override // ax.w5.InterfaceC3370x
    public void b(ax.p5.p pVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(pVar);
        if (!z && d(jobScheduler, c, i)) {
            C3102a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long K0 = this.b.K0(pVar);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), pVar.d(), K0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", ax.A5.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c2.setExtras(persistableBundle);
        C3102a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c), Long.valueOf(this.c.g(pVar.d(), K0, i)), Long.valueOf(K0), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    int c(ax.p5.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ax.A5.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
