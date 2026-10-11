/*
 * Decompiled with CFR 0.152.
 */
package ax.Y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class h {
    public static /* bridge */ /* synthetic */ Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n8) {
        return context.registerReceiver(broadcastReceiver, intentFilter, n8);
    }
}

