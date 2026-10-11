package ax.bc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ax.bc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1730b extends IInterface {

    /* renamed from: ax.bc.b$a */
    public static abstract class a extends Binder implements InterfaceC1730b {

        /* renamed from: ax.bc.b$a$a, reason: collision with other inner class name */
        private static class C0263a implements InterfaceC1730b {
            public static InterfaceC1730b f;
            private IBinder e;

            C0263a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // ax.bc.InterfaceC1730b
            public boolean H1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (!this.e.transact(16, obtain, obtain2, 0) && a.w() != null) {
                        return a.w().H1();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.bc.InterfaceC1730b
            public boolean N0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (!this.e.transact(17, obtain, obtain2, 0) && a.w() != null) {
                        return a.w().N0();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.bc.InterfaceC1730b
            public int P1() throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (this.e.transact(3, obtain, obtain2, 0) || a.w() == null) {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    } else {
                        readInt = a.w().P1();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // ax.bc.InterfaceC1730b
            public void i1(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    obtain.writeInt(i);
                    if (this.e.transact(15, obtain, obtain2, 0) || a.w() == null) {
                        obtain2.readException();
                    } else {
                        a.w().i1(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.bc.InterfaceC1730b
            public int q() throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (this.e.transact(4, obtain, obtain2, 0) || a.w() == null) {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    } else {
                        readInt = a.w().q();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.bc.InterfaceC1730b
            public int q1(InterfaceC1731c interfaceC1731c, Bundle bundle) throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    obtain.writeStrongBinder(interfaceC1731c != null ? interfaceC1731c.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.e.transact(12, obtain, obtain2, 0) || a.w() == null) {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    } else {
                        readInt = a.w().q1(interfaceC1731c, bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // ax.bc.InterfaceC1730b
            public int r1(InterfaceC1731c interfaceC1731c, Bundle bundle) throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    obtain.writeStrongBinder(interfaceC1731c != null ? interfaceC1731c.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.e.transact(13, obtain, obtain2, 0) || a.w() == null) {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    } else {
                        readInt = a.w().r1(interfaceC1731c, bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public static InterfaceC1730b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("moe.shizuku.server.IShizukuService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1730b)) ? new C0263a(iBinder) : (InterfaceC1730b) queryLocalInterface;
        }

        public static InterfaceC1730b w() {
            return C0263a.f;
        }
    }

    boolean H1() throws RemoteException;

    boolean N0() throws RemoteException;

    int P1() throws RemoteException;

    void i1(int i) throws RemoteException;

    int q() throws RemoteException;

    int q1(InterfaceC1731c interfaceC1731c, Bundle bundle) throws RemoteException;

    int r1(InterfaceC1731c interfaceC1731c, Bundle bundle) throws RemoteException;
}
