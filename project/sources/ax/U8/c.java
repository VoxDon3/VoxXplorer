package ax.U8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class c extends b<byte[]> {
    c() {
        super(a.MsvAvChannelBindings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U8.b
    public void c(ax.Z8.a<?> aVar) {
        aVar.s((int) this.a.getValue());
        aVar.s(((byte[]) this.b).length);
        aVar.o((byte[]) this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, byte[]] */
    public b<byte[]> d(ax.Z8.a<?> aVar) throws a.b {
        this.b = aVar.G(aVar.J());
        return this;
    }
}
