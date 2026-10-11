package ax.W5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.L5.InterfaceC0792d;

/* loaded from: classes3.dex */
public final class r2 extends C1012a implements IInterface {
    r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void a2(InterfaceC0792d interfaceC0792d, C1030g c1030g) throws RemoteException {
        Parcel r = r();
        C1039j.d(r, interfaceC0792d);
        C1039j.c(r, c1030g);
        B(2, r);
    }

    public final void b2(q2 q2Var, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel r = r();
        C1039j.d(r, q2Var);
        C1039j.c(r, account);
        r.writeString(str);
        C1039j.c(r, bundle);
        B(1, r);
    }
}
