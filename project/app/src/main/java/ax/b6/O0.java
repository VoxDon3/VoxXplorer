/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.b6.M0;
import ax.b6.Y;
import ax.b6.a0;

public final class O0
extends Y
implements M0 {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    public final void n(Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)bundle);
        this.B(1, parcel);
    }
}

