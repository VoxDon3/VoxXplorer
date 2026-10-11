package ax.a6;

import android.app.Application;

/* renamed from: ax.a6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1399g extends AbstractC1387a {
    private final C1399g b = this;
    final B0 c;
    final B0 d;
    final B0 e;
    final B0 f;
    final B0 g;
    final B0 h;
    final B0 i;
    final B0 j;
    final B0 k;
    final B0 l;
    final B0 m;
    final B0 n;
    final B0 o;

    C1399g(Application application) {
        y0 b = z0.b(application);
        this.c = b;
        B0 b2 = x0.b(new C1418q(b));
        this.d = b2;
        B0 b3 = x0.b(C1393d.a);
        this.e = b3;
        C1397f c1397f = new C1397f(this);
        this.f = c1397f;
        C1421u c1421u = C1420t.a;
        B0 b4 = x0.b(new C1378H(c1397f, c1421u));
        this.g = b4;
        L0 l0 = new L0(b, b2);
        this.h = l0;
        B0 b5 = x0.b(new E0(c1421u));
        this.i = b5;
        B0 b6 = x0.b(new C1411m(b));
        this.j = b6;
        B0 b7 = x0.b(new J0(b, b6));
        this.k = b7;
        C1415o c1415o = new C1415o(b, b2, b7, c1421u);
        this.l = c1415o;
        C1389b c1389b = new C1389b(b5, c1415o, b2);
        this.m = c1389b;
        N0 n0 = new N0(b, b3, r.a, c1421u, b2, b4, l0, c1389b, b5);
        this.n = n0;
        this.o = x0.b(new H0(b2, n0, b4));
    }

    @Override // ax.a6.AbstractC1387a
    public final G0 b() {
        return (G0) this.o.a();
    }

    @Override // ax.a6.AbstractC1387a
    public final C1377G c() {
        return (C1377G) this.g.a();
    }
}
