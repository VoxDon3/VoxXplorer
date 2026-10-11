/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.L5.d;
import ax.W5.a;
import ax.W5.g;
import ax.W5.j;
import ax.W5.q2;

public final class r2
extends a
implements IInterface {
    r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void a2(d d8, g g8) throws RemoteException {
        Parcel parcel = this.r();
        j.d(parcel, d8);
        j.c(parcel, g8);
        this.B(2, parcel);
    }

    public final void b2(q2 q22, Account account, String string, Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        j.d(parcel, q22);
        j.c(parcel, (Parcelable)account);
        parcel.writeString(string);
        j.c(parcel, (Parcelable)bundle);
        this.B(1, parcel);
    }
}

