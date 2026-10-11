/*
 * Decompiled with CFR 0.152.
 */
package ax.f2;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import java.util.concurrent.Executor;

public final class f {
    public static /* bridge */ /* synthetic */ void a(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executor, outcomeReceiver);
    }
}

