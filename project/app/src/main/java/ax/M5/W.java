/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.J5.F;
import ax.J5.H;
import ax.J5.J;
import ax.M5.Y;
import ax.Z5.a;
import ax.Z5.c;

public final class W
extends a
implements Y {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override
    public final H C(F a8) throws RemoteException {
        Parcel parcel = this.w();
        c.c(parcel, a8);
        parcel = this.r(8, parcel);
        a8 = (H)c.a(parcel, H.CREATOR);
        parcel.recycle();
        return a8;
    }

    @Override
    public final H X(F a8) throws RemoteException {
        Parcel parcel = this.w();
        c.c(parcel, a8);
        parcel = this.r(6, parcel);
        a8 = (H)c.a(parcel, H.CREATOR);
        parcel.recycle();
        return a8;
    }

    @Override
    public final boolean Y1(J j8, ax.T5.a a8) throws RemoteException {
        Parcel parcel = this.w();
        c.c(parcel, j8);
        c.d(parcel, a8);
        j8 = this.r(5, parcel);
        boolean bl = c.e((Parcel)j8);
        j8.recycle();
        return bl;
    }

    @Override
    public final boolean d() throws RemoteException {
        Parcel parcel = this.r(7, this.w());
        boolean bl = c.e(parcel);
        parcel.recycle();
        return bl;
    }
}

