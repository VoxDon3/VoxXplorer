package ax.bc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ax.bc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1729a extends IInterface {
    void D(int i, int i2, String str, int i3) throws RemoteException;

    void Q(int i, Bundle bundle) throws RemoteException;

    void e0(Bundle bundle) throws RemoteException;

    /* renamed from: ax.bc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0262a extends Binder implements InterfaceC1729a {
        public AbstractBinderC0262a() {
            attachInterface(this, "moe.shizuku.server.IShizukuApplication");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
                e0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
                Q(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 10001) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            D(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
