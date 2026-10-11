package ax.Za;

import ax.Za.b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class d extends b.g {
    private static final Logger a = Logger.getLogger(d.class.getName());
    static final ThreadLocal<b> b = new ThreadLocal<>();

    d() {
    }

    @Override // ax.Za.b.g
    public b b() {
        b bVar = b.get();
        return bVar == null ? b.i0 : bVar;
    }

    @Override // ax.Za.b.g
    public void c(b bVar, b bVar2) {
        if (b() != bVar) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (bVar2 != b.i0) {
            b.set(bVar2);
        } else {
            b.set(null);
        }
    }

    @Override // ax.Za.b.g
    public b d(b bVar) {
        b b2 = b();
        b.set(bVar);
        return b2;
    }
}
