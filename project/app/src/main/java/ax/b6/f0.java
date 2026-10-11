/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.b6.Y;
import ax.b6.a0;
import ax.b6.d0;

public final class f0
extends Y
implements d0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override
    public final Bundle n(Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)bundle);
        parcel = this.w(1, parcel);
        bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }
}

