/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import ax.B2.i;
import ax.C2.D;
import ax.L2.r;

public class ConstraintProxyUpdateReceiver
extends BroadcastReceiver {
    static final String a = i.i("ConstrntProxyUpdtRecvr");

    public static Intent a(Context context, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", bl).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", bl2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", bl3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", bl4);
        return intent;
    }

    public void onReceive(Context object, Intent object2) {
        String string = object2 != null ? object2.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(string)) {
            object2 = i.e();
            String string2 = a;
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring unknown action ");
            ((StringBuilder)object).append(string);
            ((i)object2).a(string2, ((StringBuilder)object).toString());
            return;
        }
        string = this.goAsync();
        D.j((Context)object).p().c(new Runnable(){
            final Context c0;
            final BroadcastReceiver.PendingResult d0;
            final ConstraintProxyUpdateReceiver e0;
            final Intent q;
            {
                this.e0 = constraintProxyUpdateReceiver;
                this.q = intent;
                this.c0 = context;
                this.d0 = pendingResult;
            }

            @Override
            public void run() {
                try {
                    boolean bl = this.q.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean bl2 = this.q.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean bl3 = this.q.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean bl4 = this.q.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append("Updating proxies: (BatteryNotLowProxy (");
                    charSequence.append(bl);
                    charSequence.append("), BatteryChargingProxy (");
                    charSequence.append(bl2);
                    charSequence.append("), StorageNotLowProxy (");
                    charSequence.append(bl3);
                    charSequence.append("), NetworkStateProxy (");
                    charSequence.append(bl4);
                    charSequence.append("), ");
                    charSequence = charSequence.toString();
                    i.e().a(a, (String)charSequence);
                    r.a(this.c0, ConstraintProxy.BatteryNotLowProxy.class, bl);
                    r.a(this.c0, ConstraintProxy.BatteryChargingProxy.class, bl2);
                    r.a(this.c0, ConstraintProxy.StorageNotLowProxy.class, bl3);
                    r.a(this.c0, ConstraintProxy.NetworkStateProxy.class, bl4);
                    return;
                }
                finally {
                    this.d0.finish();
                }
            }
        });
    }
}

