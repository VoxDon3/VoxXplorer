package ax.i6;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class e extends ax.Y5.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // ax.Y5.b
    protected final boolean a2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ax.Y5.c.b(parcel);
                break;
            case 4:
                ax.Y5.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                ax.Y5.c.b(parcel);
                break;
            case 7:
                ax.Y5.c.b(parcel);
                break;
            case 8:
                l lVar = (l) ax.Y5.c.a(parcel, l.CREATOR);
                ax.Y5.c.b(parcel);
                t0(lVar);
                break;
            case 9:
                ax.Y5.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
