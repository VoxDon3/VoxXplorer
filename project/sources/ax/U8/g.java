package ax.U8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class g extends b<byte[]> {
    private byte[] c;

    g() {
        super(a.MsvAvSingleHost);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U8.b
    public void c(ax.Z8.a<?> aVar) {
        aVar.s((int) this.a.getValue());
        aVar.s(48);
        aVar.u(48L);
        aVar.u(0L);
        aVar.o((byte[]) this.b);
        aVar.o(this.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, byte[]] */
    public g d(ax.Z8.a<?> aVar) throws a.b {
        aVar.J();
        aVar.N();
        aVar.U(4);
        this.b = aVar.G(8);
        this.c = aVar.G(32);
        return this;
    }
}
