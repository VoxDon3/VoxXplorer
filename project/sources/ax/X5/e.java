package ax.X5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.E5.g;
import ax.K5.g;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;

/* loaded from: classes3.dex */
public final class e extends AbstractC0812g {
    private final g J0;

    public e(Context context, Looper looper, C0809d c0809d, g gVar, g.a aVar, g.b bVar) {
        super(context, looper, 68, c0809d, aVar, bVar);
        ax.E5.f fVar = new ax.E5.f(gVar == null ? ax.E5.g.e0 : gVar);
        fVar.a(b.a());
        this.J0 = new ax.E5.g(fVar);
    }

    @Override // ax.M5.AbstractC0808c
    protected final Bundle A() {
        return this.J0.a();
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return 12800000;
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }
}
