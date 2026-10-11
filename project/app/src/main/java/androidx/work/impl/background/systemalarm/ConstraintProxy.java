/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.b;
import ax.B2.i;
import ax.B2.j;
import ax.K2.v;
import java.util.Iterator;
import java.util.List;

abstract class ConstraintProxy
extends BroadcastReceiver {
    private static final String a = i.i("ConstraintProxy");

    ConstraintProxy() {
    }

    static void a(Context context, List<v> object) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Iterator<v> iterator = object.iterator();
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        while (true) {
            bl4 = bl5;
            bl3 = bl6;
            bl2 = bl7;
            bl = bl8;
            if (!iterator.hasNext()) break;
            object = iterator.next().j;
            bl4 = bl5 | ((ax.B2.b)object).f();
            bl3 = bl6 | ((ax.B2.b)object).g();
            bl2 = bl7 | ((ax.B2.b)object).i();
            boolean bl9 = ((ax.B2.b)object).d() != j.q;
            bl = bl8 | bl9;
            bl5 = bl4;
            bl6 = bl3;
            bl7 = bl2;
            bl8 = bl;
            if (!bl4) continue;
            bl5 = bl4;
            bl6 = bl3;
            bl7 = bl2;
            bl8 = bl;
            if (!bl3) continue;
            bl5 = bl4;
            bl6 = bl3;
            bl7 = bl2;
            bl8 = bl;
            if (!bl2) continue;
            bl5 = bl4;
            bl6 = bl3;
            bl7 = bl2;
            bl8 = bl;
            if (bl) break;
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, bl4, bl3, bl2, bl));
    }

    public void onReceive(Context context, Intent intent) {
        i i8 = i.e();
        String string = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onReceive : ");
        stringBuilder.append(intent);
        i8.a(string, stringBuilder.toString());
        context.startService(b.a(context));
    }

    public static class BatteryChargingProxy
    extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy
    extends ConstraintProxy {
    }

    public static class NetworkStateProxy
    extends ConstraintProxy {
    }

    public static class StorageNotLowProxy
    extends ConstraintProxy {
    }
}

