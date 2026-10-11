/*
 * Decompiled with CFR 0.152.
 */
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

public interface b
extends IInterface {
    public static final String b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public boolean D0(ax.d.a var1, Bundle var2) throws RemoteException;

    public boolean H0(long var1) throws RemoteException;

    public boolean O1(ax.d.a var1) throws RemoteException;

    public boolean z1(ax.d.a var1, Uri var2, Bundle var3, List<Bundle> var4) throws RemoteException;

    public static abstract class ax.d.b$a
    extends Binder
    implements b {
        public static b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface(b);
            if (iInterface != null && iInterface instanceof b) {
                return (b)iInterface;
            }
            return new a(iBinder);
        }

        private static class a
        implements b {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public boolean D0(ax.d.a a8, Bundle bundle) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken(b);
                        parcel2.writeStrongInterface((IInterface)a8);
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    ax.d.b$b.d(parcel2, (Parcelable)bundle, 0);
                    this.e.transact(10, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public boolean H0(long l8) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    IBinder iBinder;
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken(b);
                        parcel2.writeLong(l8);
                        iBinder = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    iBinder.transact(2, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public boolean O1(ax.d.a a8) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken(b);
                        parcel2.writeStrongInterface((IInterface)a8);
                        a8 = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    a8.transact(3, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            public IBinder asBinder() {
                return this.e;
            }

            @Override
            public boolean z1(ax.d.a a8, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken(b);
                        parcel2.writeStrongInterface((IInterface)a8);
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    ax.d.b$b.d(parcel2, (Parcelable)uri, 0);
                    ax.d.b$b.d(parcel2, (Parcelable)bundle, 0);
                    ax.d.b$b.c(parcel2, list, 0);
                    this.e.transact(4, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }
        }
    }

    public static class b {
        private static <T extends Parcelable> void c(Parcel parcel, List<T> list, int n8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int n9 = list.size();
            parcel.writeInt(n9);
            for (int i8 = 0; i8 < n9; ++i8) {
                ax.d.b$b.d(parcel, (Parcelable)list.get(i8), n8);
            }
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

