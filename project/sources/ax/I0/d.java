package ax.I0;

import ax.Gb.g;
import ax.Gb.l;
import ax.I0.a;

/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // ax.I0.a
    public <T> T a(a.b<T> bVar) {
        l.f(bVar, "key");
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> bVar, T t) {
        l.f(bVar, "key");
        b().put(bVar, t);
    }

    public d(a aVar) {
        l.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i, g gVar) {
        this((i & 1) != 0 ? a.C0090a.b : aVar);
    }
}
