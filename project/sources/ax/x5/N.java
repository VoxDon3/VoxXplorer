package ax.x5;

import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.z5.InterfaceC3550a;

/* loaded from: classes.dex */
public final class N implements InterfaceC2958b<M> {
    private final InterfaceC2296a<InterfaceC3550a> a;
    private final InterfaceC2296a<InterfaceC3550a> b;
    private final InterfaceC2296a<AbstractC3445e> c;
    private final InterfaceC2296a<W> d;
    private final InterfaceC2296a<String> e;

    public N(InterfaceC2296a<InterfaceC3550a> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<AbstractC3445e> interfaceC2296a3, InterfaceC2296a<W> interfaceC2296a4, InterfaceC2296a<String> interfaceC2296a5) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
        this.e = interfaceC2296a5;
    }

    public static N a(InterfaceC2296a<InterfaceC3550a> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<AbstractC3445e> interfaceC2296a3, InterfaceC2296a<W> interfaceC2296a4, InterfaceC2296a<String> interfaceC2296a5) {
        return new N(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4, interfaceC2296a5);
    }

    public static M c(InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, Object obj, Object obj2, InterfaceC2296a<String> interfaceC2296a) {
        return new M(interfaceC3550a, interfaceC3550a2, (AbstractC3445e) obj, (W) obj2, interfaceC2296a);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
