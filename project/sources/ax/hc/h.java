package ax.hc;

import ax.cc.C1857d;
import ax.kc.C2419a;
import ax.kc.C2424f;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class h extends C2419a implements g {
    private final f b;

    public h(C2424f c2424f, f fVar) {
        super(c2424f);
        this.b = fVar;
    }

    @Override // ax.hc.g
    public void a(C1857d c1857d, Object obj, Iterable iterable) {
        c1857d.d();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d().c(it.next(), obj, c1857d);
        }
    }

    public f d() {
        return this.b;
    }
}
