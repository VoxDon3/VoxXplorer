/*
 * Decompiled with CFR 0.152.
 */
package ax.Y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.Q.b;
import ax.Y5.g;
import ax.Y5.h;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class i
extends b {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (g.a()) {
            int n8 = true != g.a() ? 0 : 2;
            return h.a(context, broadcastReceiver, intentFilter, n8);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}

