/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.content.Context;
import android.content.Intent;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.V1;

public final class k {
    private final a a;

    public k(a a8) {
        p.l(a8);
        this.a = a8;
    }

    public final void a(Context context, Intent object) {
        V1 v12 = E2.c(context, null, null).k();
        if (object == null) {
            v12.L().a("Receiver called with null intent");
            return;
        }
        object = object.getAction();
        v12.K().b("Local receiver got", object);
        if ("com.google.android.gms.measurement.UPLOAD".equals(object)) {
            object = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            object.setAction("com.google.android.gms.measurement.UPLOAD");
            v12.K().a("Starting wakeful intent.");
            this.a.a(context, (Intent)object);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(object)) {
            v12.L().a("Install Referrer Broadcasts are deprecated");
        }
    }

    public static interface a {
        public void a(Context var1, Intent var2);
    }
}

