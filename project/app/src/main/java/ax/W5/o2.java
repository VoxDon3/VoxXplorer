/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import ax.J5.e;
import ax.L5.c;
import ax.L5.i;
import ax.M5.d;
import ax.M5.g;
import ax.W5.r2;

final class o2
extends g {
    o2(Context context, Looper looper, d d8, c c8, i i8) {
        super(context, looper, 224, d8, c8, i8);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override
    protected final boolean I() {
        return true;
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final void e(String string) {
        Log.w((String)"GoogleAuthSvcClientImpl", (String)"GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(string)));
        super.e(string);
    }

    @Override
    public final int k() {
        return 17895000;
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        if (iInterface instanceof r2) {
            return (r2)iInterface;
        }
        return new r2(iBinder);
    }

    @Override
    public final e[] v() {
        return new e[]{ax.D5.e.l, ax.D5.e.k, ax.D5.e.a};
    }
}

