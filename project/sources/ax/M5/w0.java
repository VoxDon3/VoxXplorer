package ax.M5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class w0 extends ax.Z5.b implements T {
    public w0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static T w(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof T ? (T) queryLocalInterface : new v0(iBinder);
    }

    @Override // ax.Z5.b
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ax.T5.a e = e();
            parcel2.writeNoException();
            ax.Z5.c.d(parcel2, e);
        } else {
            if (i != 2) {
                return false;
            }
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
