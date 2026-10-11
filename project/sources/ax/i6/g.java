package ax.i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class g extends ax.Y5.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a2(j jVar, f fVar) throws RemoteException {
        Parcel r = r();
        ax.Y5.c.c(r, jVar);
        ax.Y5.c.d(r, fVar);
        w(12, r);
    }
}
