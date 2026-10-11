package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1093c;
import ax.Wc.AbstractC1126t;
import ax.Wc.D;

/* renamed from: ax.rd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3033c extends AbstractC1126t {
    m c0;
    C3031a d0;
    AbstractC1093c e0;
    D q;

    private C3033c(D d) {
        this.q = d;
        if (d.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.c0 = m.s(d.I(0));
        this.d0 = C3031a.t(d.I(1));
        this.e0 = AbstractC1093c.I(d.I(2));
    }

    public static C3033c r(Object obj) {
        if (obj instanceof C3033c) {
            return (C3033c) obj;
        }
        if (obj != null) {
            return new C3033c(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return this.q;
    }

    public m s() {
        return this.c0;
    }
}
