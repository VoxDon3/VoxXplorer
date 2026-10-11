/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

public final class A {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, Executor executor, TelephonyCallback telephonyCallback) {
        telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
    }
}

