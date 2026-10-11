package ax.Vb;

import ax.Qb.D0;
import ax.sb.C3072d;
import java.util.List;

/* loaded from: classes3.dex */
public final class v {
    private static final w a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new C3072d();
    }

    static /* synthetic */ w b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(D0 d0) {
        return d0.Z0() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final D0 e(t tVar, List<? extends t> list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
