package ax.W5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import ax.J5.C0744e;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;

/* loaded from: classes3.dex */
final class o2 extends AbstractC0812g {
    o2(Context context, Looper looper, C0809d c0809d, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
        super(context, looper, 224, c0809d, interfaceC0791c, interfaceC0797i);
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // ax.M5.AbstractC0808c
    protected final boolean I() {
        return true;
    }

    @Override // ax.M5.AbstractC0808c
    public final boolean S() {
        return true;
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final void e(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.e(str);
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return 17895000;
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof r2 ? (r2) queryLocalInterface : new r2(iBinder);
    }

    @Override // ax.M5.AbstractC0808c
    public final C0744e[] v() {
        return new C0744e[]{ax.D5.e.l, ax.D5.e.k, ax.D5.e.a};
    }
}
