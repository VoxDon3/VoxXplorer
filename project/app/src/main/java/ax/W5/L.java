/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.W5.N0;
import ax.W5.a;
import ax.W5.j;

public final class L
extends a
implements N0 {
    L(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override
    public final Bundle R(Account account, String string, Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        j.c(parcel, (Parcelable)account);
        parcel.writeString(string);
        j.c(parcel, (Parcelable)bundle);
        account = this.w(5, parcel);
        string = (Bundle)j.a((Parcel)account, Bundle.CREATOR);
        account.recycle();
        return string;
    }

    @Override
    public final Bundle p1(String string, Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        j.c(parcel, (Parcelable)bundle);
        bundle = this.w(2, parcel);
        string = (Bundle)j.a((Parcel)bundle, Bundle.CREATOR);
        bundle.recycle();
        return string;
    }
}

