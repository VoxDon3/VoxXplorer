package ax.bc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ax.bc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1731c extends IInterface {
    void M1(IBinder iBinder) throws RemoteException;

    void T() throws RemoteException;

    /* renamed from: ax.bc.c$a */
    public static abstract class a extends Binder implements InterfaceC1731c {
        public a() {
            attachInterface(this, "moe.shizuku.server.IShizukuServiceConnection");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
                M1(parcel.readStrongBinder());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
                T();
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("moe.shizuku.server.IShizukuServiceConnection");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
