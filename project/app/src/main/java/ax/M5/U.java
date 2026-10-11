/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.i0;
import ax.M5.k;
import ax.Z5.b;
import ax.Z5.c;

public abstract class U
extends b
implements k {
    public U() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return false;
                }
                n8 = parcel.readInt();
                IBinder iBinder = parcel.readStrongBinder();
                i0 i02 = (i0)c.a(parcel, i0.CREATOR);
                c.b(parcel);
                this.c1(n8, iBinder, i02);
            } else {
                n8 = parcel.readInt();
                Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                this.q0(n8, bundle);
            }
        } else {
            n8 = parcel.readInt();
            IBinder iBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            this.R0(n8, iBinder, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}

