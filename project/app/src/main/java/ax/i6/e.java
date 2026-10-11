/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.os.Parcel;
import android.os.RemoteException;
import ax.N5.a;
import ax.Y5.c;
import ax.i6.b;
import ax.i6.f;
import ax.i6.h;
import ax.i6.l;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class e
extends ax.Y5.b
implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override
    protected final boolean a2(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        switch (n8) {
            default: {
                return false;
            }
            case 9: {
                h h8 = (h)c.a(parcel, h.CREATOR);
                c.b(parcel);
                break;
            }
            case 8: {
                l l8 = (l)c.a(parcel, l.CREATOR);
                c.b(parcel);
                this.t0(l8);
                break;
            }
            case 7: {
                a a8 = (Status)c.a(parcel, Status.CREATOR);
                a8 = (GoogleSignInAccount)c.a(parcel, GoogleSignInAccount.CREATOR);
                c.b(parcel);
                break;
            }
            case 6: {
                Status status = (Status)c.a(parcel, Status.CREATOR);
                c.b(parcel);
                break;
            }
            case 4: {
                Status status = (Status)c.a(parcel, Status.CREATOR);
                c.b(parcel);
                break;
            }
            case 3: {
                a a9 = (ax.J5.c)c.a(parcel, ax.J5.c.CREATOR);
                a9 = (b)c.a(parcel, b.CREATOR);
                c.b(parcel);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

