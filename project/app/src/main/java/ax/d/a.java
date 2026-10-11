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

public interface a
extends IInterface {
    public static final String a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public void I1(String var1, Bundle var2) throws RemoteException;

    public void K0(Bundle var1) throws RemoteException;

    public void P0(Bundle var1) throws RemoteException;

    public void Q1(Bundle var1) throws RemoteException;

    public void S1(int var1, Uri var2, boolean var3, Bundle var4) throws RemoteException;

    public void W0(int var1, int var2, Bundle var3) throws RemoteException;

    public void Y(int var1, int var2, int var3, int var4, int var5, Bundle var6) throws RemoteException;

    public void j1(String var1, Bundle var2) throws RemoteException;

    public void n1(Bundle var1) throws RemoteException;

    public Bundle r0(String var1, Bundle var2) throws RemoteException;

    public void t1(int var1, Bundle var2) throws RemoteException;

    public static abstract class a
    extends Binder
    implements a {
        public a() {
            this.attachInterface(this, a);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            String string = a;
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                parcel.enforceInterface(string);
            }
            if (n8 == 1598968902) {
                parcel2.writeString(string);
                return true;
            }
            switch (n8) {
                default: {
                    return super.onTransact(n8, parcel, parcel2, n9);
                }
                case 12: {
                    this.P0((Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 11: {
                    this.K0((Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 10: {
                    this.Y(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 9: {
                    this.n1((Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 8: {
                    this.W0(parcel.readInt(), parcel.readInt(), (Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 7: {
                    parcel = this.r0(parcel.readString(), (Bundle)b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, (Parcelable)parcel, 1);
                    break;
                }
                case 6: {
                    n8 = parcel.readInt();
                    parcel2 = (Uri)b.c(parcel, Uri.CREATOR);
                    boolean bl = parcel.readInt() != 0;
                    this.S1(n8, (Uri)parcel2, bl, (Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 5: {
                    this.I1(parcel.readString(), (Bundle)b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                }
                case 4: {
                    this.Q1((Bundle)b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                }
                case 3: {
                    this.j1(parcel.readString(), (Bundle)b.c(parcel, Bundle.CREATOR));
                    break;
                }
                case 2: {
                    this.t1(parcel.readInt(), (Bundle)b.c(parcel, Bundle.CREATOR));
                }
            }
            return true;
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

