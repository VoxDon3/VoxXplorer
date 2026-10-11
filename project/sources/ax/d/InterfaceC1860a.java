package ax.d;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: ax.d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1860a extends IInterface {
    public static final String a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: ax.d.a$b */
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

    void I1(String str, Bundle bundle) throws RemoteException;

    void K0(Bundle bundle) throws RemoteException;

    void P0(Bundle bundle) throws RemoteException;

    void Q1(Bundle bundle) throws RemoteException;

    void S1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    void W0(int i, int i2, Bundle bundle) throws RemoteException;

    void Y(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException;

    void j1(String str, Bundle bundle) throws RemoteException;

    void n1(Bundle bundle) throws RemoteException;

    Bundle r0(String str, Bundle bundle) throws RemoteException;

    void t1(int i, Bundle bundle) throws RemoteException;

    /* renamed from: ax.d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0271a extends Binder implements InterfaceC1860a {
        public AbstractBinderC0271a() {
            attachInterface(this, InterfaceC1860a.a);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC1860a.a;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    t1(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    j1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    Q1((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    I1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    S1(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle r0 = r0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, r0, 1);
                    return true;
                case 8:
                    W0(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    n1((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    Y(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    K0((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    P0((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
