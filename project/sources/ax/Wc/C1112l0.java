package ax.Wc;

/* renamed from: ax.Wc.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1112l0 extends AbstractC1109k {
    public C1112l0(C1130v c1130v, C1121q c1121q, A a, int i, A a2) {
        super(c1130v, c1121q, a, i, a2);
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
            c1103h.a(a.A());
        }
        int i = this.e0;
        c1103h.a(new A0(i == 0, i, this.f0));
        return new C1135x0(c1103h);
    }

    public C1112l0(C1135x0 c1135x0) {
        super(c1135x0);
    }

    @Override // ax.Wc.AbstractC1109k, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.AbstractC1109k, ax.Wc.A
    A B() {
        return this;
    }
}
