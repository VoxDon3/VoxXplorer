package ax.U8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class f extends b<Long> {
    f() {
        super(a.MsvAvFlags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U8.b
    public void c(ax.Z8.a<?> aVar) {
        aVar.s((int) this.a.getValue());
        aVar.s(4);
        aVar.u(((Long) this.b).longValue());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Long] */
    public b<Long> d(ax.Z8.a<?> aVar) throws a.b {
        aVar.J();
        this.b = Long.valueOf(aVar.N());
        return this;
    }

    public f(long j) {
        super(a.MsvAvFlags, Long.valueOf(j));
    }
}
