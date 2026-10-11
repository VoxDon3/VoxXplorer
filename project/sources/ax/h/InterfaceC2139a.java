package ax.h;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: ax.h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2139a extends IInterface {
    public static final String d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: ax.h.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void X1(int i, Bundle bundle) throws RemoteException;

    /* renamed from: ax.h.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0320a extends Binder implements InterfaceC2139a {

        /* renamed from: ax.h.a$a$a, reason: collision with other inner class name */
        private static class C0321a implements InterfaceC2139a {
            private IBinder e;

            C0321a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // ax.h.InterfaceC2139a
            public void X1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC2139a.d);
                    obtain.writeInt(i);
                    b.d(obtain, bundle, 0);
                    this.e.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }
        }

        public AbstractBinderC0320a() {
            attachInterface(this, InterfaceC2139a.d);
        }

        public static InterfaceC2139a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC2139a.d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2139a)) ? new C0321a(iBinder) : (InterfaceC2139a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC2139a.d;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            X1(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
