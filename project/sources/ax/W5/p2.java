package ax.W5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class p2 extends BinderC1018c implements q2 {
    public p2() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // ax.W5.BinderC1018c
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Status status = (Status) C1039j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) C1039j.a(parcel, Bundle.CREATOR);
        C1039j.b(parcel);
        C1(status, bundle);
        return true;
    }
}
