/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.T;
import ax.T5.a;
import ax.Z5.a;

public final class v0
extends a
implements T {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final int c() throws RemoteException {
        Parcel parcel = this.r(2, this.w());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }

    @Override
    public final ax.T5.a e() throws RemoteException {
        Parcel parcel = this.r(1, this.w());
        ax.T5.a a8 = a.a.w(parcel.readStrongBinder());
        parcel.recycle();
        return a8;
    }
}

