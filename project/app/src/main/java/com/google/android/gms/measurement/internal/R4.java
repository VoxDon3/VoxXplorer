/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import com.google.android.gms.measurement.internal.S4;
import com.google.android.gms.measurement.internal.V1;

public final class R4
implements Runnable {
    private V1 c0;
    private JobParameters d0;
    private S4 q;

    public /* synthetic */ R4(S4 s42, V1 v12, JobParameters jobParameters) {
        this.q = s42;
        this.c0 = v12;
        this.d0 = jobParameters;
    }

    @Override
    public final void run() {
        this.q.e(this.c0, this.d0);
    }
}

