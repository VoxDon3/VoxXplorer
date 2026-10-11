/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.H5.u;
import ax.K5.g;
import ax.M5.d;
import ax.M5.g;
import ax.X5.b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;

public final class i
extends g {
    private final GoogleSignInOptions J0;

    public i(Context object, Looper object2, d d8, GoogleSignInOptions googleSignInOptions, g.a a8, g.b b8) {
        super((Context)object, (Looper)object2, 91, d8, a8, b8);
        object = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        ((GoogleSignInOptions.a)object).e(b.a());
        if (!d8.d().isEmpty()) {
            object2 = d8.d().iterator();
            while (object2.hasNext()) {
                ((GoogleSignInOptions.a)object).d((Scope)object2.next(), new Scope[0]);
            }
        }
        this.J0 = ((GoogleSignInOptions.a)object).a();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override
    public final int k() {
        return 12451000;
    }

    public final GoogleSignInOptions m0() {
        return this.J0;
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (iInterface instanceof u) {
            return (u)iInterface;
        }
        return new u(iBinder);
    }
}

