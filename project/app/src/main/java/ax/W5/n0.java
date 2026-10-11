/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.os.IBinder;
import android.os.IInterface;
import ax.W5.L;
import ax.W5.N0;
import ax.W5.c;

public abstract class n0
extends c
implements N0 {
    public static N0 w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (iInterface instanceof N0) {
            return (N0)iInterface;
        }
        return new L(iBinder);
    }
}

