package ax.W5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class L extends C1012a implements N0 {
    L(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // ax.W5.N0
    public final Bundle R(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel r = r();
        C1039j.c(r, account);
        r.writeString(str);
        C1039j.c(r, bundle);
        Parcel w = w(5, r);
        Bundle bundle2 = (Bundle) C1039j.a(w, Bundle.CREATOR);
        w.recycle();
        return bundle2;
    }

    @Override // ax.W5.N0
    public final Bundle p1(String str, Bundle bundle) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        C1039j.c(r, bundle);
        Parcel w = w(2, r);
        Bundle bundle2 = (Bundle) C1039j.a(w, Bundle.CREATOR);
        w.recycle();
        return bundle2;
    }
}
