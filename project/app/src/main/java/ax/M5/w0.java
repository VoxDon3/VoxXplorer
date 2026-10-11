/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.T;
import ax.M5.v0;
import ax.Z5.b;
import ax.Z5.c;

public abstract class w0
extends b
implements T {
    public w0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static T w(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (iInterface instanceof T) {
            return (T)iInterface;
        }
        return new v0(iBinder);
    }

    @Override
    protected final boolean r(int n8, Parcel object, Parcel parcel, int n9) throws RemoteException {
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            n8 = this.c();
            parcel.writeNoException();
            parcel.writeInt(n8);
        } else {
            object = this.e();
            parcel.writeNoException();
            c.d(parcel, (IInterface)object);
        }
        return true;
    }
}

