/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import ax.B2.i;
import ax.Gb.l;
import ax.I2.b;
import ax.I2.e;
import ax.N2.c;

public final class a
extends e<Boolean> {
    public a(Context context, c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        super(context, c8);
    }

    private final boolean m(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int n8 = intent.getIntExtra("status", -1);
            return n8 == 2 || n8 == 5;
            {
            }
        }
        return intent.getIntExtra("plugged", 0) != 0;
    }

    @Override
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
            return intentFilter;
        }
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        return intentFilter;
    }

    @Override
    public void k(Intent object) {
        block7: {
            block6: {
                l.f(object, "intent");
                String string = object.getAction();
                if (string == null) break block6;
                object = i.e();
                String string2 = b.a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received ");
                stringBuilder.append(string);
                ((i)object).a(string2, stringBuilder.toString());
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 1019184907: {
                        if (!string.equals("android.intent.action.ACTION_POWER_CONNECTED")) break;
                        this.g(Boolean.TRUE);
                        return;
                    }
                    case 948344062: {
                        if (!string.equals("android.os.action.CHARGING")) break;
                        this.g(Boolean.TRUE);
                        return;
                    }
                    case -54942926: {
                        if (!string.equals("android.os.action.DISCHARGING")) break;
                        this.g(Boolean.FALSE);
                        return;
                    }
                    case -1886648615: {
                        if (string.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) break block7;
                    }
                }
            }
            return;
        }
        this.g(Boolean.FALSE);
    }

    public Boolean l() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        intentFilter = this.d().registerReceiver(null, intentFilter);
        if (intentFilter == null) {
            i.e().c(b.a(), "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        return this.m((Intent)intentFilter);
    }
}

