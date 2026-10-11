/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.B2.i;
import ax.Gb.l;
import ax.I2.d;
import ax.I2.e;

public final class c
extends e<Boolean> {
    public c(Context context, ax.N2.c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        super(context, c8);
    }

    @Override
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override
    public void k(Intent object) {
        l.f(object, "intent");
        if (object.getAction() != null) {
            i i8 = i.e();
            String string = d.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Received ");
            stringBuilder.append(object.getAction());
            i8.a(string, stringBuilder.toString());
            object = object.getAction();
            if (object != null) {
                int n8 = ((String)object).hashCode();
                if (n8 != -1980154005) {
                    if (n8 == 490310653 && ((String)object).equals("android.intent.action.BATTERY_LOW")) {
                        this.g(Boolean.FALSE);
                        return;
                    }
                } else if (((String)object).equals("android.intent.action.BATTERY_OKAY")) {
                    this.g(Boolean.TRUE);
                }
            }
        }
    }

    public Boolean l() {
        boolean bl;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        intentFilter = this.d().registerReceiver(null, intentFilter);
        if (intentFilter == null) {
            i.e().c(d.a(), "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int n8 = intentFilter.getIntExtra("status", -1);
        int n9 = intentFilter.getIntExtra("level", -1);
        int n10 = intentFilter.getIntExtra("scale", -1);
        float f8 = (float)n9 / (float)n10;
        boolean bl2 = bl = true;
        if (n8 != 1) {
            bl2 = f8 > 0.15f ? bl : false;
        }
        return bl2;
    }
}

