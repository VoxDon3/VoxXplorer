package ax.rd;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.AbstractC1093c;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1121q;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.InterfaceC1101g;

/* loaded from: classes3.dex */
public class m extends AbstractC1126t {
    C1121q c0;
    C1121q d0;
    C3031a e0;
    ax.pd.c f0;
    n g0;
    n h0;
    ax.pd.c i0;
    l j0;
    AbstractC1093c k0;
    AbstractC1093c l0;
    f m0;
    D q;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private m(ax.Wc.D r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.rd.m.<init>(ax.Wc.D):void");
    }

    public static m s(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        if (ax.Nd.i.a("org.bouncycastle.x509.allow_non-der_tbscert") == null) {
            return this.q;
        }
        if (ax.Nd.i.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return this.q;
        }
        C1103h c1103h = new C1103h();
        if (!this.c0.I(0)) {
            c1103h.a(new A0(true, 0, this.c0));
        }
        c1103h.a(this.d0);
        c1103h.a(this.e0);
        c1103h.a(this.f0);
        C1103h c1103h2 = new C1103h(2);
        c1103h2.a(this.g0);
        c1103h2.a(this.h0);
        c1103h.a(new C1135x0(c1103h2));
        InterfaceC1101g interfaceC1101g = this.i0;
        if (interfaceC1101g == null) {
            interfaceC1101g = new C1135x0();
        }
        c1103h.a(interfaceC1101g);
        c1103h.a(this.j0);
        AbstractC1093c abstractC1093c = this.k0;
        if (abstractC1093c != null) {
            c1103h.a(new A0(false, 1, abstractC1093c));
        }
        AbstractC1093c abstractC1093c2 = this.l0;
        if (abstractC1093c2 != null) {
            c1103h.a(new A0(false, 2, abstractC1093c2));
        }
        f fVar = this.m0;
        if (fVar != null) {
            c1103h.a(new A0(true, 3, fVar));
        }
        return new C1135x0(c1103h);
    }

    public f r() {
        return this.m0;
    }
}
