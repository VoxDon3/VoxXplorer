package ax.M5;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class X extends ax.Z5.b implements Y {
    public static Y w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof Y ? (Y) queryLocalInterface : new W(iBinder);
    }
}
