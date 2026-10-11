package ax.V5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // ax.V5.f
    public final String c() throws RemoteException {
        Parcel w = w(1, r());
        String readString = w.readString();
        w.recycle();
        return readString;
    }

    @Override // ax.V5.f
    public final boolean d0(boolean z) throws RemoteException {
        Parcel r = r();
        c.a(r, true);
        Parcel w = w(2, r);
        boolean b = c.b(w);
        w.recycle();
        return b;
    }
}
