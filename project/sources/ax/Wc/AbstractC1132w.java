package ax.Wc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.Wc.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1132w extends A implements InterfaceC1134x {
    static final O c0 = new a(AbstractC1132w.class, 4);
    static final byte[] d0 = new byte[0];
    byte[] q;

    public AbstractC1132w(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.q = bArr;
    }

    static AbstractC1132w C(byte[] bArr) {
        return new C1127t0(bArr);
    }

    public static AbstractC1132w D(J j, boolean z) {
        return (AbstractC1132w) c0.e(j, z);
    }

    public static AbstractC1132w E(Object obj) {
        if (obj == null || (obj instanceof AbstractC1132w)) {
            return (AbstractC1132w) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof AbstractC1132w) {
                return (AbstractC1132w) g;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1132w) c0.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // ax.Wc.A
    A A() {
        return new C1127t0(this.q);
    }

    @Override // ax.Wc.A
    A B() {
        return new C1127t0(this.q);
    }

    public byte[] G() {
        return this.q;
    }

    @Override // ax.Wc.InterfaceC1134x
    public InputStream e() {
        return new ByteArrayInputStream(this.q);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ax.Nd.a.l(G());
    }

    @Override // ax.Wc.U0
    public A l() {
        return g();
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof AbstractC1132w) {
            return ax.Nd.a.b(this.q, ((AbstractC1132w) a2).q);
        }
        return false;
    }

    public String toString() {
        return "#" + ax.Nd.j.b(ax.Od.c.b(this.q));
    }

    /* renamed from: ax.Wc.w$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return d.N();
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return c1127t0;
        }
    }
}
