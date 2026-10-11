/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import ax.M5.j;

public class a
extends j.a {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Account B(j j8) {
        Throwable throwable2222222;
        long l8;
        block5: {
            if (j8 == null) {
                return null;
            }
            l8 = Binder.clearCallingIdentity();
            j8 = j8.b();
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (RemoteException remoteException) {}
                {
                    Log.w((String)"AccountAccessor", (String)"Remote account accessor probably died");
                }
                Binder.restoreCallingIdentity((long)l8);
                return null;
            }
            Binder.restoreCallingIdentity((long)l8);
            return j8;
        }
        Binder.restoreCallingIdentity((long)l8);
        throw throwable2222222;
    }
}

