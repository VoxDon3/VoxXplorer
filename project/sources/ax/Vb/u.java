package ax.Vb;

import ax.Qb.D0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public final class u {
    public static final u a;
    public static final D0 b;

    static {
        u uVar = new u();
        a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        b = uVar.a();
    }

    private u() {
    }

    private final D0 a() {
        Object next;
        D0 e;
        try {
            List m = ax.Nb.h.m(ax.Nb.h.d(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = m.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int c2 = ((t) next2).c();
                        if (c < c2) {
                            next = next2;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (e = v.e(tVar, m)) != null) {
                return e;
            }
            v.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            v.b(th, null, 2, null);
            return null;
        }
    }
}
