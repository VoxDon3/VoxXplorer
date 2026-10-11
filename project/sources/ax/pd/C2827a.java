package ax.pd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.InterfaceC1101g;

/* renamed from: ax.pd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2827a extends AbstractC1126t {
    private InterfaceC1101g c0;
    private C1130v q;

    public C2827a(C1130v c1130v, InterfaceC1101g interfaceC1101g) {
        this.q = c1130v;
        this.c0 = interfaceC1101g;
    }

    public static C2827a r(Object obj) {
        if (obj instanceof C2827a) {
            return (C2827a) obj;
        }
        if (obj != null) {
            return new C2827a(D.G(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(2);
        c1103h.a(this.q);
        c1103h.a(this.c0);
        return new C1135x0(c1103h);
    }

    public C1130v s() {
        return this.q;
    }

    public InterfaceC1101g t() {
        return this.c0;
    }

    private C2827a(D d) {
        this.q = (C1130v) d.I(0);
        this.c0 = d.I(1);
    }
}
