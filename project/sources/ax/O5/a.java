package ax.O5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.M5.C0824t;

/* loaded from: classes3.dex */
public final class a extends ax.Y5.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a2(C0824t c0824t) throws RemoteException {
        Parcel r = r();
        ax.Y5.c.c(r, c0824t);
        B(1, r);
    }
}
