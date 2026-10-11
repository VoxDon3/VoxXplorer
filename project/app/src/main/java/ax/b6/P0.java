/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.b6.N0;
import ax.b6.Y;
import ax.b6.a0;

public final class P0
extends Y
implements N0 {
    P0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override
    public final int a() throws RemoteException {
        Parcel parcel = this.w(2, this.r());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }

    @Override
    public final void g1(String string, String string2, Bundle bundle, long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.B(1, parcel);
    }
}

