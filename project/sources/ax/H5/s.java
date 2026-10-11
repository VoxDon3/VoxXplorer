package ax.H5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class s extends ax.X5.c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // ax.X5.c
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ax.X5.d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) ax.X5.d.a(parcel, Status.CREATOR);
                ax.X5.d.b(parcel);
                Q0(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) ax.X5.d.a(parcel, Status.CREATOR);
                ax.X5.d.b(parcel);
                e1(status2);
                break;
            case 103:
                Status status3 = (Status) ax.X5.d.a(parcel, Status.CREATOR);
                ax.X5.d.b(parcel);
                O0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
