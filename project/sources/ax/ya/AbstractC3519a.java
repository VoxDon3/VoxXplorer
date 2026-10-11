package ax.ya;

import ax.oa.f;
import ax.ra.AbstractC3020d;
import ax.ra.AbstractC3021e;
import ax.sa.EnumC3068a;
import ax.xa.AbstractC3477a;
import ax.za.AbstractC3560a;
import java.io.IOException;

/* renamed from: ax.ya.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3519a {
    private final AbstractC3560a a;

    protected AbstractC3519a(AbstractC3560a abstractC3560a) {
        if (abstractC3560a == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.a = abstractC3560a;
    }

    protected <R extends AbstractC3021e> R a(AbstractC3020d<R> abstractC3020d) throws IOException {
        return (R) this.a.d(abstractC3020d);
    }

    protected <R extends AbstractC3021e> R b(AbstractC3020d<R> abstractC3020d, String str, EnumC3068a... enumC3068aArr) throws IOException {
        R r = (R) a(abstractC3020d);
        if (enumC3068aArr == null) {
            return r;
        }
        int b = r.b();
        for (EnumC3068a enumC3068a : enumC3068aArr) {
            if (enumC3068a != null && enumC3068a.l(b)) {
                return r;
            }
        }
        throw new f(str, b);
    }

    protected String c(AbstractC3477a abstractC3477a) {
        return d(abstractC3477a, true);
    }

    protected String d(AbstractC3477a abstractC3477a, boolean z) {
        if (abstractC3477a == null && z) {
            return null;
        }
        return abstractC3477a.d();
    }
}
