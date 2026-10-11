/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.f;
import ax.M5.k;
import ax.M5.l;
import ax.M5.l0;

final class V
implements l {
    private final IBinder e;

    V(IBinder iBinder) {
        this.e = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void L1(k k8, f f8) throws RemoteException {
        Throwable throwable2;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                parcel2.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                k8 = k8 != null ? k8.asBinder() : null;
            }
            catch (Throwable throwable2) {
                break block4;
            }
            parcel2.writeStrongBinder((IBinder)k8);
            if (f8 != null) {
                parcel2.writeInt(1);
                l0.a(f8, parcel2, 0);
            } else {
                parcel2.writeInt(0);
            }
            this.e.transact(46, parcel2, parcel, 0);
            parcel.readException();
            parcel.recycle();
            parcel2.recycle();
            return;
        }
        parcel.recycle();
        parcel2.recycle();
        throw throwable2;
    }

    public final IBinder asBinder() {
        return this.e;
    }
}

