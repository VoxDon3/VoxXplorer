/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ax.H5.c;
import ax.K5.g;
import ax.M5.N;
import ax.M5.c;
import ax.M5.d;
import ax.M5.p;
import ax.i6.f;
import ax.i6.g;
import ax.i6.j;
import ax.i6.l;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class a
extends ax.M5.g<g>
implements ax.h6.f {
    public static final int N0 = 0;
    private final boolean J0;
    private final d K0;
    private final Bundle L0;
    private final Integer M0;

    public a(Context context, Looper looper, boolean bl, d d8, Bundle bundle, g.a a8, g.b b8) {
        super(context, looper, 44, d8, a8, b8);
        this.J0 = true;
        this.K0 = d8;
        this.L0 = bundle;
        this.M0 = d8.i();
    }

    public static Bundle m0(d d8) {
        d8.h();
        Integer n8 = d8.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)d8.a());
        if (n8 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", n8.intValue());
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

    @Override
    protected final Bundle A() {
        String string = this.K0.f();
        if (!this.y().getPackageName().equals(string)) {
            this.L0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.K0.f());
        }
        return this.L0;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final int k() {
        return 12451000;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(f f8) {
        RemoteException remoteException2;
        block4: {
            ax.N5.a a8;
            Object object;
            p.m(f8, "Expecting a valid ISignInCallbacks");
            try {
                object = this.K0.c();
                a8 = "<<default account>>".equals(((Account)object).name) ? c.b(this.y()).c() : null;
            }
            catch (RemoteException remoteException2) {
                break block4;
            }
            N n8 = new N((Account)object, p.l(this.M0), (GoogleSignInAccount)a8);
            object = (g)this.D();
            a8 = new j(1, n8);
            ((g)object).a2((j)a8, f8);
            return;
        }
        Log.w((String)"SignInClientImpl", (String)"Remote service probably died when signIn is called");
        try {
            ax.J5.c c8 = new ax.J5.c(8, null);
            l l8 = new l(1, c8, null);
            f8.t0(l8);
            return;
        }
        catch (RemoteException remoteException3) {
            Log.wtf((String)"SignInClientImpl", (String)"ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException2);
            return;
        }
    }

    @Override
    public final boolean o() {
        return this.J0;
    }

    @Override
    public final void p() {
        this.h(new c.d(this));
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterface instanceof g) {
            return (g)iInterface;
        }
        return new g(iBinder);
    }
}

