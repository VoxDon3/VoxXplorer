package ax.v5;

import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.w5.InterfaceC3370x;
import ax.x5.InterfaceC3444d;
import ax.y5.InterfaceC3507b;
import java.util.concurrent.Executor;

/* renamed from: ax.v5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3281d implements InterfaceC2958b<C3280c> {
    private final InterfaceC2296a<Executor> a;
    private final InterfaceC2296a<ax.q5.e> b;
    private final InterfaceC2296a<InterfaceC3370x> c;
    private final InterfaceC2296a<InterfaceC3444d> d;
    private final InterfaceC2296a<InterfaceC3507b> e;

    public C3281d(InterfaceC2296a<Executor> interfaceC2296a, InterfaceC2296a<ax.q5.e> interfaceC2296a2, InterfaceC2296a<InterfaceC3370x> interfaceC2296a3, InterfaceC2296a<InterfaceC3444d> interfaceC2296a4, InterfaceC2296a<InterfaceC3507b> interfaceC2296a5) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
        this.e = interfaceC2296a5;
    }

    public static C3281d a(InterfaceC2296a<Executor> interfaceC2296a, InterfaceC2296a<ax.q5.e> interfaceC2296a2, InterfaceC2296a<InterfaceC3370x> interfaceC2296a3, InterfaceC2296a<InterfaceC3444d> interfaceC2296a4, InterfaceC2296a<InterfaceC3507b> interfaceC2296a5) {
        return new C3281d(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4, interfaceC2296a5);
    }

    public static C3280c c(Executor executor, ax.q5.e eVar, InterfaceC3370x interfaceC3370x, InterfaceC3444d interfaceC3444d, InterfaceC3507b interfaceC3507b) {
        return new C3280c(executor, eVar, interfaceC3370x, interfaceC3444d, interfaceC3507b);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3280c get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
