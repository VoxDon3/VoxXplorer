/*
 * Decompiled with CFR 0.152.
 */
package ax.bc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a
extends IInterface {
    public void D(int var1, int var2, String var3, int var4) throws RemoteException;

    public void Q(int var1, Bundle var2) throws RemoteException;

    public void e0(Bundle var1) throws RemoteException;

    public static abstract class a
    extends Binder
    implements a {
        public a() {
            this.attachInterface(this, "moe.shizuku.server.IShizukuApplication");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            Object var6_5 = null;
            Object var5_6 = null;
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 10001) {
                        if (n8 != 1598968902) {
                            return super.onTransact(n8, parcel, parcel2, n9);
                        }
                        parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                        return true;
                    }
                    parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
                    this.D(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
                n8 = parcel.readInt();
                parcel2 = var5_6;
                if (parcel.readInt() != 0) {
                    parcel2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.Q(n8, (Bundle)parcel2);
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            parcel2 = var6_5;
            if (parcel.readInt() != 0) {
                parcel2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            this.e0((Bundle)parcel2);
            return true;
        }
    }
}

