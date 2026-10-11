package ax.md;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1121q;
import ax.Wc.C1123r0;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.J;
import ax.ld.InterfaceC2505a;
import ax.rd.C3031a;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class c extends AbstractC1126t {
    public static final C3031a f0;
    public static final C3031a g0;
    public static final C1121q h0;
    public static final C1121q i0;
    private C3031a c0;
    private C1121q d0;
    private C1121q e0;
    private C3031a q;

    static {
        C3031a c3031a = new C3031a(InterfaceC2505a.i, C1123r0.c0);
        f0 = c3031a;
        g0 = new C3031a(InterfaceC2554a.i, c3031a);
        h0 = new C1121q(20L);
        i0 = new C1121q(1L);
    }

    public c() {
        this.q = f0;
        this.c0 = g0;
        this.d0 = h0;
        this.e0 = i0;
    }

    public static c s(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(4);
        if (!this.q.equals(f0)) {
            c1103h.a(new A0(true, 0, this.q));
        }
        if (!this.c0.equals(g0)) {
            c1103h.a(new A0(true, 1, this.c0));
        }
        if (!this.d0.y(h0)) {
            c1103h.a(new A0(true, 2, this.d0));
        }
        if (!this.e0.y(i0)) {
            c1103h.a(new A0(true, 3, this.e0));
        }
        return new C1135x0(c1103h);
    }

    public C3031a r() {
        return this.q;
    }

    public C3031a t() {
        return this.c0;
    }

    public BigInteger u() {
        return this.d0.G();
    }

    private c(D d) {
        this.q = f0;
        this.c0 = g0;
        this.d0 = h0;
        this.e0 = i0;
        for (int i = 0; i != d.size(); i++) {
            J j = (J) d.I(i);
            int M = j.M();
            if (M == 0) {
                this.q = C3031a.s(j, true);
            } else if (M == 1) {
                this.c0 = C3031a.s(j, true);
            } else if (M == 2) {
                this.d0 = C1121q.D(j, true);
            } else {
                if (M != 3) {
                    throw new IllegalArgumentException("unknown tag");
                }
                this.e0 = C1121q.D(j, true);
            }
        }
    }

    public c(C3031a c3031a, C3031a c3031a2, C1121q c1121q, C1121q c1121q2) {
        this.q = c3031a;
        this.c0 = c3031a2;
        this.d0 = c1121q;
        this.e0 = c1121q2;
    }
}
