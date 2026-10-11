package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.AbstractC1132w;
import ax.Wc.C1097e;
import ax.Wc.C1103h;
import ax.Wc.C1127t0;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.D;
import ax.Wc.InterfaceC1101g;

/* loaded from: classes3.dex */
public class e extends AbstractC1126t {
    private boolean c0;
    private AbstractC1132w d0;
    private C1130v q;
    public static final C1130v e0 = new C1130v("2.5.29.9").K();
    public static final C1130v f0 = new C1130v("2.5.29.14").K();
    public static final C1130v g0 = new C1130v("2.5.29.15").K();
    public static final C1130v h0 = new C1130v("2.5.29.16").K();
    public static final C1130v i0 = new C1130v("2.5.29.17").K();
    public static final C1130v j0 = new C1130v("2.5.29.18").K();
    public static final C1130v k0 = new C1130v("2.5.29.19").K();
    public static final C1130v l0 = new C1130v("2.5.29.20").K();
    public static final C1130v m0 = new C1130v("2.5.29.21").K();
    public static final C1130v n0 = new C1130v("2.5.29.23").K();
    public static final C1130v o0 = new C1130v("2.5.29.24").K();
    public static final C1130v p0 = new C1130v("2.5.29.27").K();
    public static final C1130v q0 = new C1130v("2.5.29.28").K();
    public static final C1130v r0 = new C1130v("2.5.29.29").K();
    public static final C1130v s0 = new C1130v("2.5.29.30").K();
    public static final C1130v t0 = new C1130v("2.5.29.31").K();
    public static final C1130v u0 = new C1130v("2.5.29.32").K();
    public static final C1130v v0 = new C1130v("2.5.29.33").K();
    public static final C1130v w0 = new C1130v("2.5.29.35").K();
    public static final C1130v x0 = new C1130v("2.5.29.36").K();
    public static final C1130v y0 = new C1130v("2.5.29.37").K();
    public static final C1130v z0 = new C1130v("2.5.29.46").K();
    public static final C1130v A0 = new C1130v("2.5.29.54").K();
    public static final C1130v B0 = new C1130v("1.3.6.1.5.5.7.1.1").K();
    public static final C1130v C0 = new C1130v("1.3.6.1.5.5.7.1.11").K();
    public static final C1130v D0 = new C1130v("1.3.6.1.5.5.7.1.12").K();
    public static final C1130v E0 = new C1130v("1.3.6.1.5.5.7.1.2").K();
    public static final C1130v F0 = new C1130v("1.3.6.1.5.5.7.1.3").K();
    public static final C1130v G0 = new C1130v("1.3.6.1.5.5.7.1.4").K();
    public static final C1130v H0 = new C1130v("2.5.29.56").K();
    public static final C1130v I0 = new C1130v("2.5.29.55").K();
    public static final C1130v J0 = new C1130v("2.5.29.60").K();

    public e(C1130v c1130v, boolean z, AbstractC1132w abstractC1132w) {
        this.q = c1130v;
        this.c0 = z;
        this.d0 = abstractC1132w;
    }

    public static e t(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(D.G(obj));
        }
        return null;
    }

    @Override // ax.Wc.AbstractC1126t
    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.r().y(r()) && eVar.s().y(s()) && eVar.u() == u();
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        C1103h c1103h = new C1103h(3);
        c1103h.a(this.q);
        if (this.c0) {
            c1103h.a(C1097e.E(true));
        }
        c1103h.a(this.d0);
        return new C1135x0(c1103h);
    }

    @Override // ax.Wc.AbstractC1126t
    public int hashCode() {
        return u() ? s().hashCode() ^ r().hashCode() : ~(s().hashCode() ^ r().hashCode());
    }

    public C1130v r() {
        return this.q;
    }

    public AbstractC1132w s() {
        return this.d0;
    }

    public boolean u() {
        return this.c0;
    }

    public e(C1130v c1130v, boolean z, byte[] bArr) {
        this(c1130v, z, new C1127t0(bArr));
    }

    private e(D d) {
        InterfaceC1101g I;
        if (d.size() == 2) {
            this.q = C1130v.J(d.I(0));
            this.c0 = false;
            I = d.I(1);
        } else {
            if (d.size() != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + d.size());
            }
            this.q = C1130v.J(d.I(0));
            this.c0 = C1097e.D(d.I(1)).G();
            I = d.I(2);
        }
        this.d0 = AbstractC1132w.E(I);
    }
}
