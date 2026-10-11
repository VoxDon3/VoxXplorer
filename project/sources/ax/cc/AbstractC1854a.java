package ax.cc;

import ax.cc.C1857d;
import ax.dc.C1961a;
import ax.dc.InterfaceC1963c;
import ax.ec.C1997b;
import ax.ec.InterfaceC1998c;
import ax.fc.C2093d;
import ax.fc.InterfaceC2090a;
import ax.kc.C2423e;
import ax.kc.C2426h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: ax.cc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1854a<T> implements InterfaceC1963c<T> {
    private final List<InterfaceC2090a> a;
    private final C1857d.a b;
    private final C2426h c;
    private final C1855b d;

    public AbstractC1854a(ax.ec.d dVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(dVar.b());
        if (arrayList.isEmpty()) {
            arrayList.add(new InterfaceC2090a.C0312a());
            System.out.println("INFO: No error handler has been configured to handle exceptions during publication.\nPublication error handlers can be added by IBusConfiguration.addPublicationErrorHandler()\nFalling back to console logger.");
        }
        C1855b a = new C1855b(this).a("bus.handlers.error", dVar.b()).a("bus.id", dVar.c("bus.id", UUID.randomUUID().toString()));
        this.d = a;
        InterfaceC1998c.a aVar = (InterfaceC1998c.a) dVar.a(InterfaceC1998c.a.class);
        if (aVar == null) {
            throw C1997b.a(InterfaceC1998c.a.class);
        }
        this.c = aVar.e().a(aVar.b(), aVar.d(), a);
        this.b = aVar.c();
    }

    @Override // ax.dc.InterfaceC1963c
    public void b(Object obj) {
        this.c.c(obj);
    }

    protected C1857d c(T t) {
        Collection<C2423e> e = e(t.getClass());
        if ((e != null && !e.isEmpty()) || t.getClass().equals(C1961a.class)) {
            return d().a(this.d, e, t);
        }
        return d().a(this.d, e(C1961a.class), new C1961a(t));
    }

    protected C1857d.a d() {
        return this.b;
    }

    protected Collection<C2423e> e(Class cls) {
        return this.c.b(cls);
    }

    protected void f(C2093d c2093d) {
        Iterator<InterfaceC2090a> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(c2093d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.d.c("bus.id") + ")";
    }
}
