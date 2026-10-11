package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;

/* loaded from: classes3.dex */
public final class v0 extends ax.Z5.a implements T {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // ax.M5.T
    public final int c() throws RemoteException {
        Parcel r = r(2, w());
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    @Override // ax.M5.T
    public final ax.T5.a e() throws RemoteException {
        Parcel r = r(1, w());
        ax.T5.a w = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w;
    }
}
