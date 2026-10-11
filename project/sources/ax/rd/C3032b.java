package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1097e;
import ax.Wc.C1103h;
import ax.Wc.C1121q;
import ax.Wc.C1135x0;

/* renamed from: ax.rd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3032b extends AbstractC1126t {
    C1121q c0;
    C1097e q;

    public C3032b(boolean z) {
        this.q = C1097e.E(false);
        this.c0 = null;
        if (z) {
            this.q = C1097e.E(true);
        } else {
            this.q = null;
        }
        this.c0 = null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(2);
        C1097e c1097e = this.q;
        if (c1097e != null) {
            c1103h.a(c1097e);
        }
        C1121q c1121q = this.c0;
        if (c1121q != null) {
            c1103h.a(c1121q);
        }
        return new C1135x0(c1103h);
    }

    public boolean r() {
        C1097e c1097e = this.q;
        return c1097e != null && c1097e.G();
    }

    public String toString() {
        StringBuilder sb;
        if (this.c0 == null) {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(r());
            sb.append(")");
        } else {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(r());
            sb.append("), pathLenConstraint = ");
            sb.append(this.c0.G());
        }
        return sb.toString();
    }
}
