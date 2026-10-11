package ax.d1;

import ax.P0.L;
import ax.m1.p;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements l {
    private final l a;
    private final List<L> b;

    public e(l lVar, List<L> list) {
        this.a = lVar;
        this.b = list;
    }

    @Override // ax.d1.l
    public p.a<j> a(i iVar, f fVar) {
        return new ax.h1.b(this.a.a(iVar, fVar), this.b);
    }

    @Override // ax.d1.l
    public p.a<j> b() {
        return new ax.h1.b(this.a.b(), this.b);
    }
}
