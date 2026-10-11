/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class b0
extends Binder
implements IInterface {
    protected b0(String string) {
        this.attachInterface(this, string);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        boolean bl;
        if (n8 > 0xFFFFFF) {
            bl = super.onTransact(n8, parcel, parcel2, n9);
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            bl = false;
        }
        if (bl) {
            return true;
        }
        return this.r(n8, parcel, parcel2, n9);
    }

    protected boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        throw null;
    }
}

