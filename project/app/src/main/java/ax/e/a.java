/*
 * Decompiled with CFR 0.152.
 */
package ax.e;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface a
extends IInterface {
    public static final String c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public void R1(String var1, int var2, String var3, Notification var4) throws RemoteException;

    public static abstract class ax.e.a$a
    extends Binder
    implements ax.e.a {
        public static ax.e.a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface(c);
            if (iInterface != null && iInterface instanceof ax.e.a) {
                return (ax.e.a)iInterface;
            }
            return new a(iBinder);
        }

        private static class a
        implements ax.e.a {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public void R1(String string, int n8, String string2, Notification notification) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken(c);
                    parcel.writeString(string);
                    parcel.writeInt(n8);
                    parcel.writeString(string2);
                    b.b(parcel, (Parcelable)notification, 0);
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
        private static <T extends Parcelable> void b(Parcel parcel, T t8, int n8) {
            if (t8 != null) {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }
}

