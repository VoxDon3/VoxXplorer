package ax.Vb;

import ax.sb.C3069a;
import java.util.Iterator;

/* renamed from: ax.Vb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1001h {
    public static final void a(ax.wb.i iVar, Throwable th) {
        Iterator<ax.Qb.H> it = C1000g.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().d0(iVar, th);
            } catch (Throwable th2) {
                C1000g.b(ax.Qb.I.b(th, th2));
            }
        }
        try {
            C3069a.a(th, new C1002i(iVar));
        } catch (Throwable unused) {
        }
        C1000g.b(th);
    }
}
