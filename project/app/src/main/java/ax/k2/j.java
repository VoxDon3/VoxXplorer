/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface j
extends IInterface {
    public void b0(String[] var1) throws RemoteException;

    public static abstract class ax.k2.j$a
    extends Binder
    implements j {
        public ax.k2.j$a() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterface != null && iInterface instanceof j) {
                return (j)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (n8 != 1598968902) {
                if (n8 != 1) {
                    return super.onTransact(n8, parcel, parcel2, n9);
                }
                this.b0(parcel.createStringArray());
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        private static class a
        implements j {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            public IBinder asBinder() {
                return this.e;
            }

            @Override
            public void b0(String[] stringArray) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcel.writeStringArray(stringArray);
                    this.e.transact(1, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }
        }
    }
}

