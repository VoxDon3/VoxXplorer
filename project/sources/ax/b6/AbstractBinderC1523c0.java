package ax.b6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ax.b6.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1523c0 extends BinderC1514b0 implements InterfaceC1532d0 {
    public static InterfaceC1532d0 w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC1532d0 ? (InterfaceC1532d0) queryLocalInterface : new C1550f0(iBinder);
    }
}
