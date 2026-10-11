package ax.M5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: ax.M5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0815j extends IInterface {

    /* renamed from: ax.M5.j$a */
    public static abstract class a extends ax.Z5.b implements InterfaceC0815j {
        public static InterfaceC0815j w(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC0815j ? (InterfaceC0815j) queryLocalInterface : new u0(iBinder);
        }
    }

    Account b() throws RemoteException;
}
