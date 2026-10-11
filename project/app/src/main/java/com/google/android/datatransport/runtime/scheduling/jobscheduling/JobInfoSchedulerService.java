/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import ax.A5.a;
import ax.p5.p;
import ax.p5.u;
import ax.w5.e;

public class JobInfoSchedulerService
extends JobService {
    public static /* synthetic */ void a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Object object = jobParameters.getExtras().getString("backendName");
        String string = jobParameters.getExtras().getString("extras");
        int n8 = jobParameters.getExtras().getInt("priority");
        int n9 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(this.getApplicationContext());
        object = p.a().b((String)object).d(a.b(n8));
        if (string != null) {
            ((p.a)object).c(Base64.decode((String)string, (int)0));
        }
        u.c().e().m(((p.a)object).a(), n9, new e(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

