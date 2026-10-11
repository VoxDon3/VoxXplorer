/*
 * Decompiled with CFR 0.152.
 */
package ax.Y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a
implements IInterface {
    private final IBinder e;
    private final String f;

    protected a(IBinder iBinder, String string) {
        this.e = iBinder;
        this.f = string;
    }

    protected final void B(int n8, Parcel parcel) throws RemoteException {
        try {
            this.e.transact(1, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.e;
    }

    protected final Parcel r() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.f);
        return parcel;
    }

    protected final void w(int n8, Parcel parcel) throws RemoteException {
        Parcel parcel2 = Parcel.obtain();
        try {
            this.e.transact(n8, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }
}

