/*
 * Decompiled with CFR 0.152.
 */
package ax.bc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface c
extends IInterface {
    public void M1(IBinder var1) throws RemoteException;

    public void T() throws RemoteException;

    public static abstract class a
    extends Binder
    implements c {
        public a() {
            this.attachInterface(this, "moe.shizuku.server.IShizukuServiceConnection");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 1598968902) {
                        return super.onTransact(n8, parcel, parcel2, n9);
                    }
                    parcel2.writeString("moe.shizuku.server.IShizukuServiceConnection");
                    return true;
                }
                parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
                this.T();
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            this.M1(parcel.readStrongBinder());
            return true;
        }
    }
}

