package com.voxdon.xplorer.shizuku;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.p3.C2761a;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.voxdon.xplorer.shizuku.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0528a extends Binder implements a {

        /* renamed from: com.voxdon.xplorer.shizuku.a$a$a, reason: collision with other inner class name */
        private static class C0529a implements a {
            private IBinder e;

            C0529a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public ParcelFileDescriptor G1(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.e.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelFileDescriptor) b.d(obtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public int K1(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.e.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public C2761a L0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return (C2761a) b.d(obtain2, C2761a.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public boolean W1(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public boolean X0(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.e.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public List<C2761a> d1(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(C2761a.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public boolean h(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public boolean l0(String str, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.e.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public ParcelFileDescriptor w0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelFileDescriptor) b.d(obtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public boolean x1(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public C2761a z(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return (C2761a) b.d(obtain2, C2761a.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.voxdon.xplorer.shizuku.a
            public ParcelFileDescriptor z0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.voxdon.xplorer.shizuku.IShizukuUserService");
                    obtain.writeString(str);
                    this.e.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelFileDescriptor) b.d(obtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0528a() {
            attachInterface(this, "com.voxdon.xplorer.shizuku.IShizukuUserService");
        }

        public static a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.voxdon.xplorer.shizuku.IShizukuUserService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0529a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.voxdon.xplorer.shizuku.IShizukuUserService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.voxdon.xplorer.shizuku.IShizukuUserService");
                return true;
            }
            if (i == 3) {
                List<String> A0 = A0(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeStringList(A0);
            } else if (i == 23) {
                ParcelFileDescriptor w0 = w0(parcel.readString());
                parcel2.writeNoException();
                b.f(parcel2, w0, 1);
            } else if (i != 16777115) {
                switch (i) {
                    case 11:
                        List<C2761a> d1 = d1(parcel.readString());
                        parcel2.writeNoException();
                        b.e(parcel2, d1, 1);
                        break;
                    case 12:
                        C2761a z = z(parcel.readString());
                        parcel2.writeNoException();
                        b.f(parcel2, z, 1);
                        break;
                    case 13:
                        C2761a L0 = L0(parcel.readString());
                        parcel2.writeNoException();
                        b.f(parcel2, L0, 1);
                        break;
                    case 14:
                        int K1 = K1(parcel.readString(), parcel.readInt() != 0);
                        parcel2.writeNoException();
                        parcel2.writeInt(K1);
                        break;
                    case 15:
                        boolean x1 = x1(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(x1 ? 1 : 0);
                        break;
                    case 16:
                        boolean W1 = W1(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(W1 ? 1 : 0);
                        break;
                    case 17:
                        boolean h = h(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(h ? 1 : 0);
                        break;
                    case 18:
                        boolean l0 = l0(parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(l0 ? 1 : 0);
                        break;
                    case 19:
                        boolean X0 = X0(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(X0 ? 1 : 0);
                        break;
                    case 20:
                        ParcelFileDescriptor G1 = G1(parcel.readString(), parcel.readInt() != 0);
                        parcel2.writeNoException();
                        b.f(parcel2, G1, 1);
                        break;
                    case 21:
                        ParcelFileDescriptor z0 = z0(parcel.readString());
                        parcel2.writeNoException();
                        b.f(parcel2, z0, 1);
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                destroy();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    List<String> A0(String str, long j) throws RemoteException;

    ParcelFileDescriptor G1(String str, boolean z) throws RemoteException;

    int K1(String str, boolean z) throws RemoteException;

    C2761a L0(String str) throws RemoteException;

    boolean W1(String str) throws RemoteException;

    boolean X0(String str, String str2) throws RemoteException;

    List<C2761a> d1(String str) throws RemoteException;

    void destroy() throws RemoteException;

    boolean h(String str) throws RemoteException;

    boolean l0(String str, long j) throws RemoteException;

    ParcelFileDescriptor w0(String str) throws RemoteException;

    boolean x1(String str) throws RemoteException;

    C2761a z(String str) throws RemoteException;

    ParcelFileDescriptor z0(String str) throws RemoteException;
}
