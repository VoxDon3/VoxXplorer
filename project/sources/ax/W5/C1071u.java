package ax.W5;

import android.os.Binder;

/* renamed from: ax.W5.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1071u {
    public static Object a(InterfaceC1074v interfaceC1074v) {
        try {
            return interfaceC1074v.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1074v.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
