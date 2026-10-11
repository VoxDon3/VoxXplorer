package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class Q0 extends BinderC1514b0 implements N0 {
    public Q0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // ax.b6.BinderC1514b0
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            C1505a0.f(parcel);
            g1(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int a = a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
