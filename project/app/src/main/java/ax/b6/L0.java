/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ax.b6.M0;
import ax.b6.a0;
import ax.b6.b0;

public abstract class L0
extends b0
implements M0 {
    public L0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        if (n8 == 1) {
            Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
            a0.f(parcel);
            this.n(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

