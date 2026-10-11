/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.MeasurementManager;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class k {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.getMeasurementApiStatus(executor, outcomeReceiver);
    }
}

