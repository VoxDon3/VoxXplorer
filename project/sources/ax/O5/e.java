package ax.O5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.J5.C0744e;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;
import ax.M5.C0827w;
import ax.Y5.f;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public final class e extends AbstractC0812g {
    private final C0827w J0;

    public e(Context context, Looper looper, C0809d c0809d, C0827w c0827w, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, c0809d, interfaceC0791c, interfaceC0797i);
        this.J0 = c0827w;
    }

    @Override // ax.M5.AbstractC0808c
    protected final Bundle A() {
        return this.J0.b();
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // ax.M5.AbstractC0808c
    protected final boolean I() {
        return true;
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return 203400000;
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // ax.M5.AbstractC0808c
    public final C0744e[] v() {
        return f.b;
    }
}
