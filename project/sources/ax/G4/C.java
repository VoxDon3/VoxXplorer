package ax.G4;

import ax.G4.C0720n0;
import ax.p4.C2772i;
import ax.p4.C2773j;
import ax.x4.AbstractC3432c;

/* loaded from: classes.dex */
public class C extends AbstractC3432c<C0730t> {
    private final C0703f c;
    private final C0720n0.a d;

    C(C0703f c0703f, C0720n0.a aVar) {
        if (c0703f == null) {
            throw new NullPointerException("_client");
        }
        this.c = c0703f;
        if (aVar == null) {
            throw new NullPointerException("_builder");
        }
        this.d = aVar;
    }

    public C2772i<C0730t> c() throws C0724p0, C2773j {
        return this.c.k(this.d.a(), a());
    }

    public C d(EnumC0726q0 enumC0726q0) {
        this.d.b(enumC0726q0);
        return this;
    }

    public C e(EnumC0729s0 enumC0729s0) {
        this.d.c(enumC0729s0);
        return this;
    }
}
