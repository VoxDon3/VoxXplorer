package ax.f6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ax.b6.C1602k7;
import com.google.android.gms.measurement.internal.E2;
import j$.util.Objects;

/* renamed from: ax.f6.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2050D extends BroadcastReceiver {
    private final E2 a;

    public C2050D(E2 e2) {
        this.a = e2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.a.k().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.a.k().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.k().L().a("App receiver called with unknown action");
            return;
        }
        final E2 e2 = this.a;
        if (C1602k7.a() && e2.z().G(null, com.google.android.gms.measurement.internal.F.B0)) {
            e2.k().K().a("App receiver notified triggers are available");
            e2.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.H5
                @Override // java.lang.Runnable
                public final void run() {
                    E2 e22 = E2.this;
                    if (!e22.L().X0()) {
                        e22.k().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C3688k3 H = e22.H();
                    Objects.requireNonNull(H);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.F5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3688k3.this.C0();
                        }
                    }).start();
                }
            });
        }
    }
}
