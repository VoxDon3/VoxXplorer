package ax.rd;

import ax.Wc.AbstractC1132w;
import ax.Wc.C1103h;
import ax.Wc.C1127t0;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.C1138z;
import ax.Wc.D;
import ax.Wc.InterfaceC1101g;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

/* loaded from: classes3.dex */
public class g {
    private static final Set c;
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(e.i0);
        hashSet.add(e.j0);
        hashSet.add(e.e0);
        hashSet.add(e.r0);
        c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(C1130v c1130v, boolean z, InterfaceC1101g interfaceC1101g) throws IOException {
        b(c1130v, z, interfaceC1101g.g().q("DER"));
    }

    public void b(C1130v c1130v, boolean z, byte[] bArr) {
        if (!this.a.containsKey(c1130v)) {
            this.b.addElement(c1130v);
            this.a.put(c1130v, new e(c1130v, z, new C1127t0(bArr)));
            return;
        }
        if (!c.contains(c1130v)) {
            throw new IllegalArgumentException("extension " + c1130v + " already added");
        }
        D G = D.G(AbstractC1132w.E(((e) this.a.get(c1130v)).s()).G());
        D G2 = D.G(bArr);
        C1103h c1103h = new C1103h(G.size() + G2.size());
        Enumeration J = G.J();
        while (J.hasMoreElements()) {
            c1103h.a((InterfaceC1101g) J.nextElement());
        }
        Enumeration J2 = G2.J();
        while (J2.hasMoreElements()) {
            c1103h.a((InterfaceC1101g) J2.nextElement());
        }
        try {
            this.a.put(c1130v, new e(c1130v, z, new C1135x0(c1103h).p()));
        } catch (IOException e) {
            throw new C1138z(e.getMessage(), e);
        }
    }

    public f c() {
        e[] eVarArr = new e[this.b.size()];
        for (int i = 0; i != this.b.size(); i++) {
            eVarArr[i] = (e) this.a.get(this.b.elementAt(i));
        }
        return new f(eVarArr);
    }

    public boolean d() {
        return this.b.isEmpty();
    }
}
