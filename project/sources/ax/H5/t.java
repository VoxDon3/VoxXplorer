package ax.H5;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public interface t extends IInterface {
    void O0(Status status) throws RemoteException;

    void Q0(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    void e1(Status status) throws RemoteException;
}
