package ax.e;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: ax.e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1966a extends IInterface {
    public static final String c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: ax.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0291a extends Binder implements InterfaceC1966a {

        /* renamed from: ax.e.a$a$a, reason: collision with other inner class name */
        private static class C0292a implements InterfaceC1966a {
            private IBinder e;

            C0292a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // ax.e.InterfaceC1966a
            public void R1(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC1966a.c);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
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

        public static InterfaceC1966a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC1966a.c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1966a)) ? new C0292a(iBinder) : (InterfaceC1966a) queryLocalInterface;
        }
    }

    /* renamed from: ax.e.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void R1(String str, int i, String str2, Notification notification) throws RemoteException;
}
