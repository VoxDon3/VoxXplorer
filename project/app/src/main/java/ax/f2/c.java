/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class c {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerWebTrigger(webTriggerRegistrationRequest, executor, outcomeReceiver);
    }
}

