package ax.f6;

import android.content.Context;
import android.content.Intent;
import ax.M5.C0821p;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.V1;

/* renamed from: ax.f6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2063k {
    private final a a;

    /* renamed from: ax.f6.k$a */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C2063k(a aVar) {
        C0821p.l(aVar);
        this.a = aVar;
    }

    public final void a(Context context, Intent intent) {
        V1 k = E2.c(context, null, null).k();
        if (intent == null) {
            k.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k.K().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                k.L().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k.K().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}
