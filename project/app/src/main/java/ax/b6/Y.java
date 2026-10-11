/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class Y
implements IInterface {
    private final IBinder e;
    private final String f;

    protected Y(IBinder iBinder, String string) {
        this.e = iBinder;
        this.f = string;
    }

    protected final void B(int n8, Parcel parcel) throws RemoteException {
        Parcel parcel2 = Parcel.obtain();
        try {
            this.e.transact(n8, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.e;
    }

    protected final Parcel r() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.f);
        return parcel;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Parcel w(int n8, Parcel parcel) throws RemoteException {
        Throwable throwable2222222;
        block4: {
            Parcel parcel2 = Parcel.obtain();
            this.e.transact(n8, parcel, parcel2, 0);
            parcel2.readException();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (RuntimeException runtimeException) {}
                {
                    parcel2.recycle();
                    throw runtimeException;
                }
            }
            parcel.recycle();
            return parcel2;
        }
        parcel.recycle();
        throw throwable2222222;
    }
}

