package ax.U8;

import ax.Z8.a;

/* loaded from: classes3.dex */
public class h extends b<String> {
    h(a aVar) {
        super(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U8.b
    public void c(ax.Z8.a<?> aVar) {
        aVar.s((int) this.a.getValue());
        aVar.s(((String) this.b).length() * 2);
        aVar.q((String) this.b, ax.Y8.b.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public h d(ax.Z8.a<?> aVar) throws a.b {
        this.b = aVar.H(ax.Y8.b.c, aVar.J() / 2);
        return this;
    }

    public h(a aVar, String str) {
        super(aVar, str);
    }
}
