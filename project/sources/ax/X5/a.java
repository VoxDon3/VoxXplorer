package ax.X5;

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

    protected final Parcel r() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }

    protected final void w(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
