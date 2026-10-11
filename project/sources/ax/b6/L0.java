package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class L0 extends BinderC1514b0 implements M0 {
    public L0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // ax.b6.BinderC1514b0
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
        C1505a0.f(parcel);
        n(bundle);
        parcel2.writeNoException();
        return true;
    }
}
