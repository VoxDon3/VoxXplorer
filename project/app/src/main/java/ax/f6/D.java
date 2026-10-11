/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.b6.k7;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.H5;

public final class D
extends BroadcastReceiver {
    private final E2 a;

    public D(E2 e22) {
        this.a = e22;
    }

    public final void onReceive(Context object, Intent intent) {
        if (intent == null) {
            this.a.k().L().a("App receiver called with null intent");
            return;
        }
        object = intent.getAction();
        if (object == null) {
            this.a.k().L().a("App receiver called with null action");
            return;
        }
        if (!((String)object).equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.k().L().a("App receiver called with unknown action");
            return;
        }
        object = this.a;
        if (k7.a() && ((E2)object).z().G(null, F.B0)) {
            ((E2)object).k().K().a("App receiver notified triggers are available");
            ((E2)object).l().D(new H5((E2)object));
        }
    }
}

