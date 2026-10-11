/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ax.b6.N0;
import ax.b6.a0;
import ax.b6.b0;

public abstract class Q0
extends b0
implements N0 {
    public Q0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            n8 = this.a();
            parcel2.writeNoException();
            parcel2.writeInt(n8);
        } else {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
            long l8 = parcel.readLong();
            a0.f(parcel);
            this.g1(string, string2, bundle, l8);
            parcel2.writeNoException();
        }
        return true;
    }
}

