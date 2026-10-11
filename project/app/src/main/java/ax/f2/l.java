/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class l {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executor, outcomeReceiver);
    }
}

