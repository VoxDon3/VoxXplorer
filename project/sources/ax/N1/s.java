package ax.N1;

import ax.N1.t;
import ax.S0.InterfaceC0979l;
import ax.r7.AbstractC2991z;
import j$.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class s {
    public static k a(t tVar, byte[] bArr, int i, int i2) {
        t.b bVar;
        final AbstractC2991z.a r = AbstractC2991z.r();
        bVar = t.b.c;
        Objects.requireNonNull(r);
        tVar.c(bArr, i, i2, bVar, new InterfaceC0979l() { // from class: ax.N1.r
            @Override // ax.S0.InterfaceC0979l
            public final void accept(Object obj) {
                AbstractC2991z.a.this.a((e) obj);
            }
        });
        return new g(r.k());
    }

    public static void b(t tVar) {
    }
}
