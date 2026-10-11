/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class h {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, DeletionRequest deletionRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.deleteRegistrations(deletionRequest, executor, outcomeReceiver);
    }
}

