package ax.hc;

import ax.cc.C1857d;
import ax.kc.C2419a;

/* loaded from: classes3.dex */
public class j extends C2419a implements f<Object, Object> {
    private f b;

    public j(f fVar) {
        super(fVar.b());
        this.b = fVar;
    }

    @Override // ax.hc.f
    public void c(Object obj, Object obj2, C1857d c1857d) {
        synchronized (obj) {
            this.b.c(obj, obj2, c1857d);
        }
    }
}
