package ax.b1;

import android.net.Uri;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.U0.g;
import ax.U0.n;
import ax.b1.C1459h;
import ax.r7.j0;
import ax.u7.C3218f;
import java.util.Map;

/* renamed from: ax.b1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463l implements z {
    private final Object a = new Object();
    private C0915y.f b;
    private w c;
    private g.a d;
    private String e;
    private ax.m1.m f;

    private w b(C0915y.f fVar) {
        g.a aVar = this.d;
        if (aVar == null) {
            aVar = new n.b().c(this.e);
        }
        Uri uri = fVar.c;
        P p = new P(uri == null ? null : uri.toString(), fVar.h, aVar);
        j0<Map.Entry<String, String>> it = fVar.e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            p.c(next.getKey(), next.getValue());
        }
        C1459h.b e = new C1459h.b().f(fVar.a, O.d).c(fVar.f).d(fVar.g).e(C3218f.o(fVar.j));
        ax.m1.m mVar = this.f;
        if (mVar != null) {
            e.b(mVar);
        }
        C1459h a = e.a(p);
        a.G(0, fVar.c());
        return a;
    }

    @Override // ax.b1.z
    public w a(C0915y c0915y) {
        w wVar;
        C0968a.e(c0915y.b);
        C0915y.f fVar = c0915y.b.c;
        if (fVar == null) {
            return w.a;
        }
        synchronized (this.a) {
            try {
                if (!fVar.equals(this.b)) {
                    this.b = fVar;
                    this.c = b(fVar);
                }
                wVar = (w) C0968a.e(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }
}
