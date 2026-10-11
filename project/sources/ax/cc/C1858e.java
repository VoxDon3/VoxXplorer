package ax.cc;

import ax.dc.InterfaceC1963c;
import ax.ec.C1996a;
import ax.ec.InterfaceC1998c;
import ax.fc.C2093d;
import ax.fc.InterfaceC2090a;

/* renamed from: ax.cc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1858e<T> extends AbstractC1854a<T> implements InterfaceC1963c<T> {
    public C1858e() {
        super(new C1996a().e(InterfaceC1998c.a.a()));
    }

    @Override // ax.dc.InterfaceC1963c
    public InterfaceC1856c a(T t) {
        C1857d c = c(t);
        try {
            c.execute();
            return c;
        } catch (Throwable th) {
            try {
                f(new C2093d().d("Error during publication of message").c(th).e(c));
            } catch (Throwable unused) {
            }
            return c;
        }
    }

    public C1858e(InterfaceC2090a interfaceC2090a) {
        super(new C1996a().e(InterfaceC1998c.a.a()).d(interfaceC2090a));
    }

    public C1858e(ax.ec.d dVar) {
        super(dVar);
    }
}
