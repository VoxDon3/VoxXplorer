/*
 * Decompiled with CFR 0.152.
 */
package ax.Y5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class b
extends Binder
implements IInterface {
    protected b(String string) {
        this.attachInterface(this, string);
    }

    protected boolean a2(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        if (n8 > 0xFFFFFF) {
            if (super.onTransact(n8, parcel, parcel2, n9)) {
                return true;
            }
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.a2(n8, parcel, parcel2, n9);
    }
}

