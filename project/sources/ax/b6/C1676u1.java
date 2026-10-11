package ax.b6;

import java.util.concurrent.Callable;

/* renamed from: ax.b6.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1676u1 {
    private final E a;
    final Z2 b;
    final Z2 c;
    private final C1510a5 d;

    public C1676u1() {
        E e = new E();
        this.a = e;
        Z2 z2 = new Z2(null, e);
        this.c = z2;
        this.b = z2.d();
        C1510a5 c1510a5 = new C1510a5();
        this.d = c1510a5;
        z2.h("require", new K7(c1510a5));
        c1510a5.b("internal.platform", new Callable() { // from class: ax.b6.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new J7();
            }
        });
        z2.h("runtime.counter", new C1594k(Double.valueOf(0.0d)));
    }

    public final InterfaceC1658s a(Z2 z2, C1653r2... c1653r2Arr) {
        InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
        for (C1653r2 c1653r2 : c1653r2Arr) {
            interfaceC1658s = Z3.a(c1653r2);
            C1709y2.b(this.c);
            if ((interfaceC1658s instanceof C1682v) || (interfaceC1658s instanceof C1666t)) {
                interfaceC1658s = this.a.a(z2, interfaceC1658s);
            }
        }
        return interfaceC1658s;
    }

    public final void b(String str, Callable<? extends AbstractC1619n> callable) {
        this.d.b(str, callable);
    }
}
