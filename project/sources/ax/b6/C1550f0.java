package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ax.b6.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1550f0 extends Y implements InterfaceC1532d0 {
    C1550f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // ax.b6.InterfaceC1532d0
    public final Bundle n(Bundle bundle) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, bundle);
        Parcel w = w(1, r);
        Bundle bundle2 = (Bundle) C1505a0.a(w, Bundle.CREATOR);
        w.recycle();
        return bundle2;
    }
}
