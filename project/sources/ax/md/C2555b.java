package ax.md;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.AbstractC1093c;
import ax.Wc.AbstractC1126t;
import ax.Wc.AbstractC1132w;
import ax.Wc.C1103h;
import ax.Wc.C1110k0;
import ax.Wc.C1121q;
import ax.Wc.C1127t0;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.E;
import ax.Wc.InterfaceC1101g;
import ax.Wc.J;
import ax.rd.C3031a;
import java.io.IOException;
import java.util.Enumeration;

/* renamed from: ax.md.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2555b extends AbstractC1126t {
    private C3031a c0;
    private AbstractC1132w d0;
    private E e0;
    private AbstractC1093c f0;
    private C1121q q;

    private C2555b(D d) {
        Enumeration J = d.J();
        C1121q E = C1121q.E(J.nextElement());
        this.q = E;
        int s = s(E);
        this.c0 = C3031a.t(J.nextElement());
        this.d0 = AbstractC1132w.E(J.nextElement());
        int i = -1;
        while (J.hasMoreElements()) {
            J j = (J) J.nextElement();
            int M = j.M();
            if (M <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (M == 0) {
                this.e0 = E.D(j, false);
            } else {
                if (M != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (s < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f0 = C1110k0.N(j, false);
            }
            i = M;
        }
    }

    public static C2555b r(Object obj) {
        if (obj instanceof C2555b) {
            return (C2555b) obj;
        }
        if (obj != null) {
            return new C2555b(D.G(obj));
        }
        return null;
    }

    private static int s(C1121q c1121q) {
        int K = c1121q.K();
        if (K < 0 || K > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return K;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(5);
        c1103h.a(this.q);
        c1103h.a(this.c0);
        c1103h.a(this.d0);
        E e = this.e0;
        if (e != null) {
            c1103h.a(new A0(false, 0, e));
        }
        AbstractC1093c abstractC1093c = this.f0;
        if (abstractC1093c != null) {
            c1103h.a(new A0(false, 1, abstractC1093c));
        }
        return new C1135x0(c1103h);
    }

    public C2555b(C3031a c3031a, InterfaceC1101g interfaceC1101g) throws IOException {
        this(c3031a, interfaceC1101g, null, null);
    }

    public C2555b(C3031a c3031a, InterfaceC1101g interfaceC1101g, E e, byte[] bArr) throws IOException {
        this.q = new C1121q(bArr != null ? ax.Nd.b.b : ax.Nd.b.a);
        this.c0 = c3031a;
        this.d0 = new C1127t0(interfaceC1101g);
        this.e0 = e;
        this.f0 = bArr == null ? null : new C1110k0(bArr);
    }
}
