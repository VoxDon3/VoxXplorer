package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class P0 extends Y implements N0 {
    P0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // ax.b6.N0
    public final int a() throws RemoteException {
        Parcel w = w(2, r());
        int readInt = w.readInt();
        w.recycle();
        return readInt;
    }

    @Override // ax.b6.N0
    public final void g1(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.d(r, bundle);
        r.writeLong(j);
        B(1, r);
    }
}
