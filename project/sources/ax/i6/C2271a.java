package ax.i6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ax.J5.C0742c;
import ax.J5.C0752m;
import ax.K5.g;
import ax.M5.AbstractC0808c;
import ax.M5.AbstractC0812g;
import ax.M5.C0809d;
import ax.M5.C0821p;
import ax.M5.N;
import ax.h6.InterfaceC2162f;

/* renamed from: ax.i6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2271a extends AbstractC0812g<g> implements InterfaceC2162f {
    public static final /* synthetic */ int N0 = 0;
    private final boolean J0;
    private final C0809d K0;
    private final Bundle L0;
    private final Integer M0;

    public C2271a(Context context, Looper looper, boolean z, C0809d c0809d, Bundle bundle, g.a aVar, g.b bVar) {
        super(context, looper, 44, c0809d, aVar, bVar);
        this.J0 = true;
        this.K0 = c0809d;
        this.L0 = bundle;
        this.M0 = c0809d.i();
    }

    public static Bundle m0(C0809d c0809d) {
        c0809d.h();
        Integer i = c0809d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0809d.a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // ax.M5.AbstractC0808c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.K0.f())) {
            this.L0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.K0.f());
        }
        return this.L0;
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return C0752m.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.h6.InterfaceC2162f
    public final void n(f fVar) {
        C0821p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.K0.c();
            ((g) D()).a2(new j(1, new N(c, ((Integer) C0821p.l(this.M0)).intValue(), "<<default account>>".equals(c.name) ? ax.H5.c.b(y()).c() : null)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.t0(new l(1, new C0742c(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final boolean o() {
        return this.J0;
    }

    @Override // ax.h6.InterfaceC2162f
    public final void p() {
        h(new AbstractC0808c.d());
    }

    @Override // ax.M5.AbstractC0808c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
