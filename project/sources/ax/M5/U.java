package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class U extends ax.Z5.b implements InterfaceC0816k {
    public U() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // ax.Z5.b
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ax.Z5.c.a(parcel, Bundle.CREATOR);
            ax.Z5.c.b(parcel);
            R0(readInt, readStrongBinder, bundle);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) ax.Z5.c.a(parcel, Bundle.CREATOR);
            ax.Z5.c.b(parcel);
            q0(readInt2, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            i0 i0Var = (i0) ax.Z5.c.a(parcel, i0.CREATOR);
            ax.Z5.c.b(parcel);
            c1(readInt3, readStrongBinder2, i0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
