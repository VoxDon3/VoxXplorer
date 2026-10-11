/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final class e
implements Runnable {
    public final JobParameters c0;
    public final JobInfoSchedulerService q;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.q = jobInfoSchedulerService;
        this.c0 = jobParameters;
    }

    @Override
    public final void run() {
        JobInfoSchedulerService.a(this.q, this.c0);
    }
}

