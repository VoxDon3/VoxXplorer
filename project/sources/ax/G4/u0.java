package ax.G4;

import ax.G4.C0731t0;
import ax.p4.C2773j;
import ax.x4.AbstractC3434e;
import java.util.Date;

/* loaded from: classes.dex */
public class u0 extends AbstractC3434e<C0730t, v0, w0> {
    private final C0703f a;
    private final C0731t0.a b;

    u0(C0703f c0703f, C0731t0.a aVar) {
        if (c0703f == null) {
            throw new NullPointerException("_client");
        }
        this.a = c0703f;
        if (aVar == null) {
            throw new NullPointerException("_builder");
        }
        this.b = aVar;
    }

    @Override // ax.x4.AbstractC3434e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public O0 a() throws w0, C2773j {
        return this.a.u(this.b.a());
    }

    public u0 e(Boolean bool) {
        this.b.b(bool);
        return this;
    }

    public u0 f(Date date) {
        this.b.c(date);
        return this;
    }

    public u0 g(T0 t0) {
        this.b.d(t0);
        return this;
    }
}
