package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1128u extends A {
    static final O c0 = new a(C1128u.class, 7);
    private final AbstractC1115n q;

    /* renamed from: ax.Wc.u$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return new C1128u((AbstractC1115n) AbstractC1115n.c0.c(d));
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return new C1128u((AbstractC1115n) AbstractC1115n.c0.d(c1127t0));
        }
    }

    public C1128u(AbstractC1115n abstractC1115n) {
        if (abstractC1115n == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.q = abstractC1115n;
    }

    static C1128u C(byte[] bArr) {
        return new C1128u(AbstractC1115n.C(bArr));
    }

    @Override // ax.Wc.A
    A A() {
        AbstractC1115n abstractC1115n = (AbstractC1115n) this.q.A();
        return abstractC1115n == this.q ? this : new C1128u(abstractC1115n);
    }

    @Override // ax.Wc.A
    A B() {
        AbstractC1115n abstractC1115n = (AbstractC1115n) this.q.B();
        return abstractC1115n == this.q ? this : new C1128u(abstractC1115n);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ~this.q.hashCode();
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof C1128u) {
            return this.q.r(((C1128u) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.s(z, 7);
        this.q.s(c1136y, false);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return this.q.w(z);
    }
}
