package ax.b6;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ax.b6.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1503C {
    private final C1676u1 a;
    private Z2 b;
    C1531d c;
    private final C1513b d;

    public C1503C() {
        this(new C1676u1());
    }

    public final C1531d a() {
        return this.c;
    }

    public final void b(C1646q2 c1646q2) throws C1541e0 {
        AbstractC1619n abstractC1619n;
        try {
            this.b = this.a.b.d();
            if (this.a.a(this.b, (C1653r2[]) c1646q2.K().toArray(new C1653r2[0])) instanceof C1603l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C1638p2 c1638p2 : c1646q2.I().K()) {
                List<C1653r2> K = c1638p2.K();
                String J = c1638p2.J();
                Iterator<C1653r2> it = K.iterator();
                while (it.hasNext()) {
                    InterfaceC1658s a = this.a.a(this.b, it.next());
                    if (!(a instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Z2 z2 = this.b;
                    if (z2.g(J)) {
                        InterfaceC1658s c = z2.c(J);
                        if (!(c instanceof AbstractC1619n)) {
                            throw new IllegalStateException("Invalid function name: " + J);
                        }
                        abstractC1619n = (AbstractC1619n) c;
                    } else {
                        abstractC1619n = null;
                    }
                    if (abstractC1619n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + J);
                    }
                    abstractC1619n.a(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new C1541e0(th);
        }
    }

    public final void c(String str, Callable<? extends AbstractC1619n> callable) {
        this.a.b(str, callable);
    }

    public final boolean d(C1540e c1540e) throws C1541e0 {
        try {
            this.c.b(c1540e);
            this.a.c.h("runtime.counter", new C1594k(Double.valueOf(0.0d)));
            this.d.b(this.b.d(), this.c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C1541e0(th);
        }
    }

    final /* synthetic */ AbstractC1619n e() throws Exception {
        return new H7(this.d);
    }

    public final boolean f() {
        return !this.c.f().isEmpty();
    }

    public final boolean g() {
        return !this.c.d().equals(this.c.a());
    }

    private C1503C(C1676u1 c1676u1) {
        this.a = c1676u1;
        this.b = c1676u1.b.d();
        this.c = new C1531d();
        this.d = new C1513b();
        c1676u1.b("internal.registerCallback", new Callable() { // from class: ax.b6.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1503C.this.e();
            }
        });
        c1676u1.b("internal.eventLogger", new Callable() { // from class: ax.b6.F0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new A4(C1503C.this.c);
            }
        });
    }
}
