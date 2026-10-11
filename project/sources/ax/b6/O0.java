package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class O0 extends Y implements M0 {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // ax.b6.M0
    public final void n(Bundle bundle) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, bundle);
        B(1, r);
    }
}
