package ax.k2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.k2.InterfaceC2379j;

/* renamed from: ax.k2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2380k extends IInterface {
    int E(InterfaceC2379j interfaceC2379j, String str) throws RemoteException;

    void N1(int i, String[] strArr) throws RemoteException;

    void b1(InterfaceC2379j interfaceC2379j, int i) throws RemoteException;

    /* renamed from: ax.k2.k$a */
    public static abstract class a extends Binder implements InterfaceC2380k {

        /* renamed from: ax.k2.k$a$a, reason: collision with other inner class name */
        private static class C0351a implements InterfaceC2380k {
            private IBinder e;

            C0351a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // ax.k2.InterfaceC2380k
            public int E(InterfaceC2379j interfaceC2379j, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(interfaceC2379j);
                    obtain.writeString(str);
                    this.e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.k2.InterfaceC2380k
            public void N1(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.e.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static InterfaceC2380k r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2380k)) ? new C0351a(iBinder) : (InterfaceC2380k) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i == 1) {
                int E = E(InterfaceC2379j.a.r(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(E);
            } else if (i == 2) {
                b1(InterfaceC2379j.a.r(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                N1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
