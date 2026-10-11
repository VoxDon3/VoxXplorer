package ax.d;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* renamed from: ax.d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1861b extends IInterface {
    public static final String b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: ax.d.b$a */
    public static abstract class a extends Binder implements InterfaceC1861b {

        /* renamed from: ax.d.b$a$a, reason: collision with other inner class name */
        private static class C0272a implements InterfaceC1861b {
            private IBinder e;

            C0272a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // ax.d.InterfaceC1861b
            public boolean D0(InterfaceC1860a interfaceC1860a, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1861b.b);
                    obtain.writeStrongInterface(interfaceC1860a);
                    C0273b.d(obtain, bundle, 0);
                    this.e.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.d.InterfaceC1861b
            public boolean H0(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1861b.b);
                    obtain.writeLong(j);
                    this.e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ax.d.InterfaceC1861b
            public boolean O1(InterfaceC1860a interfaceC1860a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1861b.b);
                    obtain.writeStrongInterface(interfaceC1860a);
                    this.e.transact(3, obtain, obtain2, 0);
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

            @Override // ax.d.InterfaceC1861b
            public boolean z1(InterfaceC1860a interfaceC1860a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1861b.b);
                    obtain.writeStrongInterface(interfaceC1860a);
                    C0273b.d(obtain, uri, 0);
                    C0273b.d(obtain, bundle, 0);
                    C0273b.c(obtain, list, 0);
                    this.e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC1861b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1861b.b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1861b)) ? new C0272a(iBinder) : (InterfaceC1861b) queryLocalInterface;
        }
    }

    /* renamed from: ax.d.b$b, reason: collision with other inner class name */
    public static class C0273b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean D0(InterfaceC1860a interfaceC1860a, Bundle bundle) throws RemoteException;

    boolean H0(long j) throws RemoteException;

    boolean O1(InterfaceC1860a interfaceC1860a) throws RemoteException;

    boolean z1(InterfaceC1860a interfaceC1860a, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;
}
