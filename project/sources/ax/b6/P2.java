package ax.b6;

import android.os.Binder;

/* loaded from: classes3.dex */
public final /* synthetic */ class P2 {
    public static <V> V a(O2<V> o2) {
        try {
            return o2.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return o2.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
