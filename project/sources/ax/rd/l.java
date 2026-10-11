package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1093c;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1110k0;
import ax.Wc.C1135x0;
import ax.Wc.D;
import java.util.Enumeration;

/* loaded from: classes3.dex */
public class l extends AbstractC1126t {
    private AbstractC1093c c0;
    private C3031a q;

    public l(D d) {
        if (d.size() == 2) {
            Enumeration J = d.J();
            this.q = C3031a.t(J.nextElement());
            this.c0 = C1110k0.O(J.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + d.size());
        }
    }

    public static l r(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(2);
        c1103h.a(this.q);
        c1103h.a(this.c0);
        return new C1135x0(c1103h);
    }
}
