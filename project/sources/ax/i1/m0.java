package ax.i1;

import ax.P0.C0915y;
import ax.P0.N;

/* loaded from: classes.dex */
public final class m0 extends AbstractC2232w {
    private final C0915y f;

    public m0(ax.P0.N n, C0915y c0915y) {
        super(n);
        this.f = c0915y;
    }

    @Override // ax.i1.AbstractC2232w, ax.P0.N
    public N.c o(int i, N.c cVar, long j) {
        super.o(i, cVar, j);
        C0915y c0915y = this.f;
        cVar.c = c0915y;
        C0915y.h hVar = c0915y.b;
        cVar.b = hVar != null ? hVar.h : null;
        return cVar;
    }
}
