/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.IInterface;
import ax.M5.W;
import ax.M5.Y;
import ax.Z5.b;

public abstract class X
extends b
implements Y {
    public static Y w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (iInterface instanceof Y) {
            return (Y)iInterface;
        }
        return new W(iBinder);
    }
}

