/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.IBinder;
import android.os.IInterface;
import ax.b6.b0;
import ax.b6.d0;
import ax.b6.f0;

public abstract class c0
extends b0
implements d0 {
    public static d0 w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (iInterface instanceof d0) {
            return (d0)iInterface;
        }
        return new f0(iBinder);
    }
}

