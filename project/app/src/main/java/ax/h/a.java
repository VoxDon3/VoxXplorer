/*
 * Decompiled with CFR 0.152.
 */
package ax.h;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface a
extends IInterface {
    public static final String d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public void X1(int var1, Bundle var2) throws RemoteException;

    public static abstract class ax.h.a$a
    extends Binder
    implements ax.h.a {
        public ax.h.a$a() {
            this.attachInterface(this, d);
        }

        public static ax.h.a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface(d);
            if (iInterface != null && iInterface instanceof ax.h.a) {
                return (ax.h.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            String string = d;
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                parcel.enforceInterface(string);
            }
            if (n8 == 1598968902) {
                parcel2.writeString(string);
                return true;
            }
            if (n8 != 1) {
                return super.onTransact(n8, parcel, parcel2, n9);
            }
            this.X1(parcel.readInt(), (Bundle)b.c(parcel, Bundle.CREATOR));
            return true;
        }

        private static class a
        implements ax.h.a {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public void X1(int n8, Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken(d);
                    parcel.writeInt(n8);
                    b.d(parcel, (Parcelable)bundle, 0);
                    this.e.transact(1, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            public IBinder asBinder() {
                return this.e;
            }
        }
    }

    public static class b {
        private static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return (T)creator.createFromParcel(parcel);
            }
            return null;
        }

        private static <T extends Parcelable> void d(Parcel parcel, T t8, int n8) {
            if (t8 != null) {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }
}

