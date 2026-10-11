/*
 * Decompiled with CFR 0.152.
 */
package ax.F2;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

public final class j {
    public static /* bridge */ /* synthetic */ JobInfo.Builder a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        return builder.setRequiredNetwork(networkRequest);
    }
}

