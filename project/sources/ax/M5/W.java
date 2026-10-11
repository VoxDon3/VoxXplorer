package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class W extends ax.Z5.a implements Y {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // ax.M5.Y
    public final ax.J5.H C(ax.J5.F f) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.c(w, f);
        Parcel r = r(8, w);
        ax.J5.H h = (ax.J5.H) ax.Z5.c.a(r, ax.J5.H.CREATOR);
        r.recycle();
        return h;
    }

    @Override // ax.M5.Y
    public final ax.J5.H X(ax.J5.F f) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.c(w, f);
        Parcel r = r(6, w);
        ax.J5.H h = (ax.J5.H) ax.Z5.c.a(r, ax.J5.H.CREATOR);
        r.recycle();
        return h;
    }

    @Override // ax.M5.Y
    public final boolean Y1(ax.J5.J j, ax.T5.a aVar) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.c(w, j);
        ax.Z5.c.d(w, aVar);
        Parcel r = r(5, w);
        boolean e = ax.Z5.c.e(r);
        r.recycle();
        return e;
    }

    @Override // ax.M5.Y
    public final boolean d() throws RemoteException {
        Parcel r = r(7, w());
        boolean e = ax.Z5.c.e(r);
        r.recycle();
        return e;
    }
}
