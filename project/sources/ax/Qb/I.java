package ax.Qb;

import ax.Vb.C1001h;
import ax.sb.C3069a;

/* loaded from: classes3.dex */
public final class I {
    public static final void a(ax.wb.i iVar, Throwable th) {
        try {
            H h = (H) iVar.a(H.b);
            if (h != null) {
                h.d0(iVar, th);
            } else {
                C1001h.a(iVar, th);
            }
        } catch (Throwable th2) {
            C1001h.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3069a.a(runtimeException, th);
        return runtimeException;
    }
}
