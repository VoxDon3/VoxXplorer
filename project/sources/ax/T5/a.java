package ax.T5;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: ax.T5.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0196a extends ax.Z5.b implements a {
        public AbstractBinderC0196a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a w(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
