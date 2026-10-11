/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.Y5.a;
import ax.Y5.c;
import ax.i6.f;
import ax.i6.j;

public final class g
extends a
implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a2(j j8, f f8) throws RemoteException {
        Parcel parcel = this.r();
        c.c(parcel, j8);
        c.d(parcel, f8);
        this.w(12, parcel);
    }
}

