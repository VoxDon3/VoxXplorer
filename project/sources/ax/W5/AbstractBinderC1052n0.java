package ax.W5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ax.W5.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1052n0 extends BinderC1018c implements N0 {
    public static N0 w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof N0 ? (N0) queryLocalInterface : new L(iBinder);
    }
}
