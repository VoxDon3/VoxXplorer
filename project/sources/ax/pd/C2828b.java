package ax.pd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.C1137y0;
import ax.Wc.E;
import ax.Wc.InterfaceC1101g;

/* renamed from: ax.pd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2828b extends AbstractC1126t {
    private E q;

    public C2828b(C1130v c1130v, InterfaceC1101g interfaceC1101g) {
        C1103h c1103h = new C1103h(2);
        c1103h.a(c1130v);
        c1103h.a(interfaceC1101g);
        this.q = new C1137y0(new C1135x0(c1103h));
    }

    public static C2828b s(Object obj) {
        if (obj instanceof C2828b) {
            return (C2828b) obj;
        }
        if (obj != null) {
            return new C2828b(E.E(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return this.q;
    }

    public C2827a r() {
        if (this.q.size() == 0) {
            return null;
        }
        return C2827a.r(this.q.G(0));
    }

    public int size() {
        return this.q.size();
    }

    public C2827a[] t() {
        int size = this.q.size();
        C2827a[] c2827aArr = new C2827a[size];
        for (int i = 0; i != size; i++) {
            c2827aArr[i] = C2827a.r(this.q.G(i));
        }
        return c2827aArr;
    }

    public boolean u() {
        return this.q.size() > 1;
    }

    private C2828b(E e) {
        this.q = e;
    }

    public C2828b(C2827a[] c2827aArr) {
        this.q = new C1137y0(c2827aArr);
    }
}
