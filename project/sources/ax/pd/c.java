package ax.pd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.InterfaceC1099f;
import ax.Wc.InterfaceC1101g;
import java.util.Enumeration;

/* loaded from: classes3.dex */
public class c extends AbstractC1126t implements InterfaceC1099f {
    private static e g0 = ax.qd.b.Q;
    private int c0;
    private e d0;
    private C2828b[] e0;
    private C1135x0 f0;
    private boolean q;

    private c(D d) {
        this(g0, d);
    }

    public static c r(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) && !(obj instanceof D)) {
            return false;
        }
        if (g().y(((InterfaceC1101g) obj).g())) {
            return true;
        }
        try {
            return this.d0.e(this, new c(D.G(((InterfaceC1101g) obj).g())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return this.f0;
    }

    @Override // ax.Wc.AbstractC1126t
    public int hashCode() {
        if (this.q) {
            return this.c0;
        }
        this.q = true;
        int b = this.d0.b(this);
        this.c0 = b;
        return b;
    }

    public C2828b[] s() {
        return (C2828b[]) this.e0.clone();
    }

    public String toString() {
        return this.d0.f(this);
    }

    private c(e eVar, D d) {
        this.d0 = eVar;
        this.e0 = new C2828b[d.size()];
        Enumeration J = d.J();
        boolean z = true;
        int i = 0;
        while (J.hasMoreElements()) {
            Object nextElement = J.nextElement();
            C2828b s = C2828b.s(nextElement);
            z &= s == nextElement;
            this.e0[i] = s;
            i++;
        }
        this.f0 = z ? C1135x0.Q(d) : new C1135x0(this.e0);
    }

    public c(e eVar, String str) {
        this(eVar.c(str));
        this.d0 = eVar;
    }

    public c(e eVar, C2828b[] c2828bArr) {
        this.d0 = eVar;
        this.e0 = (C2828b[]) c2828bArr.clone();
        this.f0 = new C1135x0(this.e0);
    }

    public c(String str) {
        this(g0, str);
    }

    public c(C2828b[] c2828bArr) {
        this(g0, c2828bArr);
    }
}
