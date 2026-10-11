package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.D;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes3.dex */
public class f extends AbstractC1126t {
    private Hashtable q = new Hashtable();
    private Vector c0 = new Vector();

    private f(D d) {
        Enumeration J = d.J();
        while (J.hasMoreElements()) {
            e t = e.t(J.nextElement());
            if (this.q.containsKey(t.r())) {
                throw new IllegalArgumentException("repeated extension found: " + t.r());
            }
            this.q.put(t.r(), t);
            this.c0.addElement(t.r());
        }
    }

    public static f s(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(this.c0.size());
        Enumeration elements = this.c0.elements();
        while (elements.hasMoreElements()) {
            c1103h.a((e) this.q.get((C1130v) elements.nextElement()));
        }
        return new C1135x0(c1103h);
    }

    public e r(C1130v c1130v) {
        return (e) this.q.get(c1130v);
    }

    public f(e[] eVarArr) {
        for (int i = 0; i != eVarArr.length; i++) {
            e eVar = eVarArr[i];
            this.c0.addElement(eVar.r());
            this.q.put(eVar.r(), eVar);
        }
    }
}
