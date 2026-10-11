package ax.H5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class u extends ax.X5.a implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void B(t tVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel r = r();
        ax.X5.d.d(r, tVar);
        ax.X5.d.c(r, googleSignInOptions);
        w(103, r);
    }

    public final void a2(t tVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel r = r();
        ax.X5.d.d(r, tVar);
        ax.X5.d.c(r, googleSignInOptions);
        w(102, r);
    }
}
