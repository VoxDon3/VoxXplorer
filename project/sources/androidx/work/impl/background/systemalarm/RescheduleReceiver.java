package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ax.B2.i;
import ax.C2.D;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = i.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e().a(a, "Received intent " + intent);
        if (Build.VERSION.SDK_INT < 23) {
            context.startService(b.d(context));
            return;
        }
        try {
            D.j(context).t(goAsync());
        } catch (IllegalStateException e) {
            i.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
