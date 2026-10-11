/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;

public final class B {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, TelephonyCallback telephonyCallback) {
        telephonyManager.unregisterTelephonyCallback(telephonyCallback);
    }
}

