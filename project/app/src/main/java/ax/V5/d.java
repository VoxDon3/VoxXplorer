/*
 * Decompiled with CFR 0.152.
 */
package ax.V5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.V5.a;
import ax.V5.c;
import ax.V5.f;

public final class d
extends a
implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override
    public final String c() throws RemoteException {
        Parcel parcel = this.w(1, this.r());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    @Override
    public final boolean d0(boolean bl) throws RemoteException {
        Parcel parcel = this.r();
        c.a(parcel, true);
        parcel = this.w(2, parcel);
        bl = c.b(parcel);
        parcel.recycle();
        return bl;
    }
}

