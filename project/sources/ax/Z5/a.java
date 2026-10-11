package ax.Z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class a implements IInterface {
    private final IBinder e;
    private final String f;

    protected a(IBinder iBinder, String str) {
        this.e = iBinder;
        this.f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    protected final Parcel r(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.e.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel w() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }
}
