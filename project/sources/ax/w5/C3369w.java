package ax.w5;

import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.x5.InterfaceC3444d;
import ax.y5.InterfaceC3507b;
import java.util.concurrent.Executor;

/* renamed from: ax.w5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3369w implements InterfaceC2958b<C3368v> {
    private final InterfaceC2296a<Executor> a;
    private final InterfaceC2296a<InterfaceC3444d> b;
    private final InterfaceC2296a<InterfaceC3370x> c;
    private final InterfaceC2296a<InterfaceC3507b> d;

    public C3369w(InterfaceC2296a<Executor> interfaceC2296a, InterfaceC2296a<InterfaceC3444d> interfaceC2296a2, InterfaceC2296a<InterfaceC3370x> interfaceC2296a3, InterfaceC2296a<InterfaceC3507b> interfaceC2296a4) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
    }

    public static C3369w a(InterfaceC2296a<Executor> interfaceC2296a, InterfaceC2296a<InterfaceC3444d> interfaceC2296a2, InterfaceC2296a<InterfaceC3370x> interfaceC2296a3, InterfaceC2296a<InterfaceC3507b> interfaceC2296a4) {
        return new C3369w(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4);
    }

    public static C3368v c(Executor executor, InterfaceC3444d interfaceC3444d, InterfaceC3370x interfaceC3370x, InterfaceC3507b interfaceC3507b) {
        return new C3368v(executor, interfaceC3444d, interfaceC3370x, interfaceC3507b);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3368v get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
