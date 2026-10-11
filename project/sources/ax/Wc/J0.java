package ax.Wc;

/* loaded from: classes3.dex */
public class J0 extends AbstractC1109k {
    public J0(C1103h c1103h) {
        this(K0.a(c1103h));
    }

    @Override // ax.Wc.AbstractC1109k
    D C() {
        C1103h c1103h = new C1103h(4);
        C1130v c1130v = this.q;
        if (c1130v != null) {
            c1103h.a(c1130v);
        }
        C1121q c1121q = this.c0;
        if (c1121q != null) {
            c1103h.a(c1121q);
        }
        A a = this.d0;
        if (a != null) {
            c1103h.a(a.B());
        }
        int i = this.e0;
        c1103h.a(new Q0(i == 0, i, this.f0));
        return new M0(c1103h);
    }

    public J0(C1130v c1130v, C1121q c1121q, A a, int i, A a2) {
        super(c1130v, c1121q, a, i, a2);
    }

    public J0(M0 m0) {
        super(m0);
    }

    @Override // ax.Wc.AbstractC1109k, ax.Wc.A
    A B() {
        return this;
    }
}
