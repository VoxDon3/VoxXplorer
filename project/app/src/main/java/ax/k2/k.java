/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.k2.j;

public interface k
extends IInterface {
    public int E(j var1, String var2) throws RemoteException;

    public void N1(int var1, String[] var2) throws RemoteException;

    public void b1(j var1, int var2) throws RemoteException;

    public static abstract class ax.k2.k$a
    extends Binder
    implements k {
        public ax.k2.k$a() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (iInterface != null && iInterface instanceof k) {
                return (k)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (n8 != 1598968902) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return super.onTransact(n8, parcel, parcel2, n9);
                        }
                        this.N1(parcel.readInt(), parcel.createStringArray());
                    } else {
                        this.b1(j.a.r(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    n8 = this.E(j.a.r(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n8);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }

        private static class a
        implements k {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public int E(j j8, String string) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel.writeStrongInterface((IInterface)j8);
                    parcel.writeString(string);
                    this.e.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    int n8 = parcel2.readInt();
                    return n8;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void N1(int n8, String[] stringArray) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel.writeInt(n8);
                    parcel.writeStringArray(stringArray);
                    this.e.transact(3, parcel, null, 1);
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
}

