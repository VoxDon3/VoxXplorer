package ax.U8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class i extends b<ax.J8.b> {
    i() {
        super(a.MsvAvTimestamp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U8.b
    public void c(ax.Z8.a<?> aVar) {
        aVar.s((int) this.a.getValue());
        aVar.s(8);
        ax.J8.c.a((ax.J8.b) this.b, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ax.J8.b] */
    public b<ax.J8.b> d(ax.Z8.a<?> aVar) throws a.b {
        aVar.J();
        this.b = ax.J8.c.c(aVar);
        return this;
    }
}
