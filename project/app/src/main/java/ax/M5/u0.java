/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.j;
import ax.Z5.a;
import ax.Z5.c;

public final class u0
extends a
implements j {
    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override
    public final Account b() throws RemoteException {
        Parcel parcel = this.r(2, this.w());
        Account account = (Account)c.a(parcel, Account.CREATOR);
        parcel.recycle();
        return account;
    }
}

