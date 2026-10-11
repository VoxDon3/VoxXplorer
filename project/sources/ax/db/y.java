package ax.db;

import ax.ab.InterfaceC1434a;
import ax.db.r;

/* loaded from: classes3.dex */
public abstract class y {
    private static final b a = new b();

    private static final class b extends y {
        @Override // ax.db.y
        public r c(String str, q qVar) {
            return r.a.c(str, qVar);
        }

        private b() {
        }
    }

    protected y() {
    }

    static y a() {
        return a;
    }

    public final r b(String str) {
        return c(str, m.a());
    }

    public abstract r c(String str, q qVar);

    public final InterfaceC1434a d(q qVar) {
        return m.b((q) ax.cb.b.b(qVar, "span"), false);
    }
}
