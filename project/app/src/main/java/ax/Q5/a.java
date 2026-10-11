/*
 * Decompiled with CFR 0.152.
 */
package ax.Q5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

public final class a {
    public static /* bridge */ /* synthetic */ boolean a(Context context, Intent intent, int n8, Executor executor, ServiceConnection serviceConnection) {
        return context.bindService(intent, n8, executor, serviceConnection);
    }
}

