package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class V implements InterfaceC0817l {
    private final IBinder e;

    V(IBinder iBinder) {
        this.e = iBinder;
    }

    @Override // ax.M5.InterfaceC0817l
    public final void L1(InterfaceC0816k interfaceC0816k, C0811f c0811f) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC0816k != null ? interfaceC0816k.asBinder() : null);
            if (c0811f != null) {
                obtain.writeInt(1);
                l0.a(c0811f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }
}
