/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.Parcel;
import android.os.RemoteException;
import ax.H5.t;
import ax.X5.c;
import ax.X5.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class s
extends c
implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        switch (n8) {
            default: {
                return false;
            }
            case 103: {
                Status status = (Status)d.a(parcel, Status.CREATOR);
                d.b(parcel);
                this.O0(status);
                break;
            }
            case 102: {
                Status status = (Status)d.a(parcel, Status.CREATOR);
                d.b(parcel);
                this.e1(status);
                break;
            }
            case 101: {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status)d.a(parcel, Status.CREATOR);
                d.b(parcel);
                this.Q0(googleSignInAccount, status);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

