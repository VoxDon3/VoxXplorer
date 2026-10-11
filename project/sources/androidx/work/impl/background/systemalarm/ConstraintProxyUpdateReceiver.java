package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import ax.B2.i;
import ax.C2.D;
import ax.L2.r;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a = i.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {
        final /* synthetic */ Context c0;
        final /* synthetic */ BroadcastReceiver.PendingResult d0;
        final /* synthetic */ Intent q;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.q = intent;
            this.c0 = context;
            this.d0 = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.q.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.q.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.q.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.q.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.e().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                r.a(this.c0, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                r.a(this.c0, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                r.a(this.c0, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                r.a(this.c0, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.d0.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            D.j(context).p().c(new a(intent, context, goAsync()));
            return;
        }
        i.e().a(a, "Ignoring unknown action " + action);
    }
}
