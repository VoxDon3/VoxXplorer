/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.background.systemalarm.b;
import ax.B2.i;
import ax.C2.D;

public class RescheduleReceiver
extends BroadcastReceiver {
    private static final String a = i.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i i8 = i.e();
        String string = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received intent ");
        stringBuilder.append(intent);
        i8.a(string, stringBuilder.toString());
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                D.j(context).t(this.goAsync());
                return;
            }
            catch (IllegalStateException illegalStateException) {
                i.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException);
                return;
            }
        }
        context.startService(b.d(context));
    }
}

