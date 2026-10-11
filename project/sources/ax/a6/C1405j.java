package ax.a6;

/* renamed from: ax.a6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1405j implements InterfaceC1423w {
    private final C1399g a;
    final B0 b;
    final B0 c;
    final B0 d;
    final B0 e;
    final B0 f;

    C1405j(C1399g c1399g, C1379I c1379i) {
        this.a = c1399g;
        B0 b = x0.b(new Q(c1399g.c));
        this.b = b;
        y0 b2 = z0.b(c1379i);
        this.c = b2;
        w0 w0Var = new w0();
        this.d = w0Var;
        B0 b0 = c1399g.c;
        C1419s c1419s = r.a;
        C1421u c1421u = C1420t.a;
        B0 b02 = c1399g.i;
        B0 b03 = c1399g.l;
        B0 b04 = c1399g.d;
        W w = new W(b0, b, c1419s, c1421u, b02, b03, w0Var, b04);
        this.e = w;
        C1385O c1385o = new C1385O(b, c1419s, w);
        this.f = c1385o;
        w0.b(w0Var, x0.b(new C1374D(b0, c1399g.e, b, b04, b2, c1385o)));
    }

    @Override // ax.a6.InterfaceC1423w
    public final C1373C a() {
        return (C1373C) this.d.a();
    }
}
