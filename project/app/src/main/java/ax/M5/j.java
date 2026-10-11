/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import ax.M5.u0;
import ax.Z5.b;

public interface j
extends IInterface {
    public Account b() throws RemoteException;

    public static abstract class a
    extends b
    implements j {
        public static j w(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterface instanceof j) {
                return (j)iInterface;
            }
            return new u0(iBinder);
        }
    }
}

