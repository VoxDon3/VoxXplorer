package ax.M5;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import ax.M5.InterfaceC0815j;

/* renamed from: ax.M5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class BinderC0806a extends InterfaceC0815j.a {
    public static Account B(InterfaceC0815j interfaceC0815j) {
        if (interfaceC0815j == null) {
            return null;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC0815j.b();
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
