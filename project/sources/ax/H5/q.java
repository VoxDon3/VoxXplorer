package ax.H5;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class q extends ax.X5.c implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // ax.X5.c
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            i0();
        } else {
            if (i != 2) {
                return false;
            }
            L();
        }
        return true;
    }
}
