package ax.M5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class u0 extends ax.Z5.a implements InterfaceC0815j {
    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // ax.M5.InterfaceC0815j
    public final Account b() throws RemoteException {
        Parcel r = r(2, w());
        Account account = (Account) ax.Z5.c.a(r, Account.CREATOR);
        r.recycle();
        return account;
    }
}
