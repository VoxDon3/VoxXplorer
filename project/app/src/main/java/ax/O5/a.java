/*
 * Decompiled with CFR 0.152.
 */
package ax.O5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.t;
import ax.Y5.c;

public final class a
extends ax.Y5.a
implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a2(t t8) throws RemoteException {
        Parcel parcel = this.r();
        c.c(parcel, t8);
        this.B(1, parcel);
    }
}

