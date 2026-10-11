/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.H5.t;
import ax.X5.a;
import ax.X5.d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class u
extends a
implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void B(t t8, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcel = this.r();
        d.d(parcel, t8);
        d.c(parcel, googleSignInOptions);
        this.w(103, parcel);
    }

    public final void a2(t t8, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcel = this.r();
        d.d(parcel, t8);
        d.c(parcel, googleSignInOptions);
        this.w(102, parcel);
    }
}

