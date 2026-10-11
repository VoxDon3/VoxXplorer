package ax.p5;

import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.v5.InterfaceC3282e;
import ax.w5.C3364r;
import ax.w5.C3368v;
import ax.z5.InterfaceC3550a;

/* loaded from: classes.dex */
public final class w implements InterfaceC2958b<u> {
    private final InterfaceC2296a<InterfaceC3550a> a;
    private final InterfaceC2296a<InterfaceC3550a> b;
    private final InterfaceC2296a<InterfaceC3282e> c;
    private final InterfaceC2296a<C3364r> d;
    private final InterfaceC2296a<C3368v> e;

    public w(InterfaceC2296a<InterfaceC3550a> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<InterfaceC3282e> interfaceC2296a3, InterfaceC2296a<C3364r> interfaceC2296a4, InterfaceC2296a<C3368v> interfaceC2296a5) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
        this.e = interfaceC2296a5;
    }

    public static w a(InterfaceC2296a<InterfaceC3550a> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<InterfaceC3282e> interfaceC2296a3, InterfaceC2296a<C3364r> interfaceC2296a4, InterfaceC2296a<C3368v> interfaceC2296a5) {
        return new w(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4, interfaceC2296a5);
    }

    public static u c(InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, InterfaceC3282e interfaceC3282e, C3364r c3364r, C3368v c3368v) {
        return new u(interfaceC3550a, interfaceC3550a2, interfaceC3282e, c3364r, c3368v);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
