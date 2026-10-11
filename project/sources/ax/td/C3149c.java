package ax.td;

import ax.Wc.AbstractC1126t;
import ax.Wc.C1103h;
import ax.Wc.C1110k0;
import ax.Wc.C1121q;
import ax.Wc.C1130v;
import ax.Wc.C1135x0;
import ax.Wc.InterfaceC1101g;
import ax.rd.C3031a;
import ax.rd.C3033c;
import ax.rd.g;
import ax.rd.l;
import ax.rd.m;
import ax.rd.n;
import ax.rd.o;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

/* renamed from: ax.td.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3149c {
    private o a;
    private g b;

    public C3149c(ax.pd.c cVar, BigInteger bigInteger, n nVar, n nVar2, ax.pd.c cVar2, l lVar) {
        o oVar = new o();
        this.a = oVar;
        oVar.e(new C1121q(bigInteger));
        this.a.d(cVar);
        this.a.g(nVar);
        this.a.b(nVar2);
        this.a.h(cVar2);
        this.a.i(lVar);
        this.b = new g();
    }

    private static byte[] c(ax.Ld.a aVar, AbstractC1126t abstractC1126t) throws IOException {
        OutputStream b = aVar.b();
        abstractC1126t.n(b, "DER");
        b.close();
        return aVar.c();
    }

    private static C3033c d(m mVar, C3031a c3031a, byte[] bArr) {
        C1103h c1103h = new C1103h();
        c1103h.a(mVar);
        c1103h.a(c3031a);
        c1103h.a(new C1110k0(bArr));
        return C3033c.r(new C1135x0(c1103h));
    }

    public C3149c a(C1130v c1130v, boolean z, InterfaceC1101g interfaceC1101g) throws C3147a {
        try {
            this.b.a(c1130v, z, interfaceC1101g);
            return this;
        } catch (IOException e) {
            throw new C3147a("cannot encode extension: " + e.getMessage(), e);
        }
    }

    public C3148b b(ax.Ld.a aVar) {
        this.a.f(aVar.d());
        if (!this.b.d()) {
            this.a.c(this.b.c());
        }
        try {
            m a = this.a.a();
            return new C3148b(d(a, aVar.d(), c(aVar, a)));
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot produce certificate signature");
        }
    }

    public C3149c(ax.pd.c cVar, BigInteger bigInteger, Date date, Date date2, ax.pd.c cVar2, l lVar) {
        this(cVar, bigInteger, new n(date), new n(date2), cVar2, lVar);
    }
}
