/*
 * Decompiled with CFR 0.152.
 */
package ax.V5;

import android.os.IBinder;
import android.os.IInterface;
import ax.V5.b;
import ax.V5.d;
import ax.V5.f;

public abstract class e
extends b
implements f {
    public static f r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iInterface instanceof f) {
            return (f)iInterface;
        }
        return new d(iBinder);
    }
}

