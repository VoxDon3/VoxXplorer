package ax.pd;

import ax.Wc.C1130v;
import ax.Wc.InterfaceC1101g;
import java.util.Vector;

/* loaded from: classes3.dex */
public class d {
    private e a;
    private Vector b = new Vector();

    public d(e eVar) {
        this.a = eVar;
    }

    public d a(C1130v[] c1130vArr, InterfaceC1101g[] interfaceC1101gArr) {
        C2827a[] c2827aArr = new C2827a[c1130vArr.length];
        for (int i = 0; i != c1130vArr.length; i++) {
            c2827aArr[i] = new C2827a(c1130vArr[i], interfaceC1101gArr[i]);
        }
        return c(c2827aArr);
    }

    public d b(C1130v[] c1130vArr, String[] strArr) {
        int length = strArr.length;
        InterfaceC1101g[] interfaceC1101gArr = new InterfaceC1101g[length];
        for (int i = 0; i != length; i++) {
            interfaceC1101gArr[i] = this.a.a(c1130vArr[i], strArr[i]);
        }
        return a(c1130vArr, interfaceC1101gArr);
    }

    public d c(C2827a[] c2827aArr) {
        this.b.addElement(new C2828b(c2827aArr));
        return this;
    }

    public d d(C1130v c1130v, InterfaceC1101g interfaceC1101g) {
        this.b.addElement(new C2828b(c1130v, interfaceC1101g));
        return this;
    }

    public d e(C1130v c1130v, String str) {
        d(c1130v, this.a.a(c1130v, str));
        return this;
    }

    public c f() {
        int size = this.b.size();
        C2828b[] c2828bArr = new C2828b[size];
        for (int i = 0; i != size; i++) {
            c2828bArr[i] = (C2828b) this.b.elementAt(i);
        }
        return new c(this.a, c2828bArr);
    }
}
