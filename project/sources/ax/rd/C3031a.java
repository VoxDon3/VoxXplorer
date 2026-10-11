package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.InterfaceC1101g;
import ax.Wc.J;

/* renamed from: ax.rd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3031a extends AbstractC1126t {
    private InterfaceC1101g c0;
    private C1130v q;

    public C3031a(C1130v c1130v) {
        this.q = c1130v;
    }

    public static C3031a s(J j, boolean z) {
        return t(D.E(j, z));
    }

    public static C3031a t(Object obj) {
        if (obj instanceof C3031a) {
            return (C3031a) obj;
        }
        if (obj != null) {
            return new C3031a(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(2);
        c1103h.a(this.q);
        InterfaceC1101g interfaceC1101g = this.c0;
        if (interfaceC1101g != null) {
            c1103h.a(interfaceC1101g);
        }
        return new C1135x0(c1103h);
    }

    public C1130v r() {
        return this.q;
    }

    public InterfaceC1101g u() {
        return this.c0;
    }

    public C3031a(C1130v c1130v, InterfaceC1101g interfaceC1101g) {
        this.q = c1130v;
        this.c0 = interfaceC1101g;
    }

    private C3031a(D d) {
        if (d.size() >= 1 && d.size() <= 2) {
            this.q = C1130v.J(d.I(0));
            this.c0 = d.size() == 2 ? d.I(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + d.size());
        }
    }
}
