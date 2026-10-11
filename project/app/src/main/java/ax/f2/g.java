/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public final class g {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, WebSourceRegistrationRequest webSourceRegistrationRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerWebSource(webSourceRegistrationRequest, executor, outcomeReceiver);
    }
}

