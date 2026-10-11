package ax.w5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.x5.InterfaceC3443c;
import ax.x5.InterfaceC3444d;
import ax.y5.InterfaceC3507b;
import ax.z5.InterfaceC3550a;
import java.util.concurrent.Executor;

/* renamed from: ax.w5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3365s implements InterfaceC2958b<C3364r> {
    private final InterfaceC2296a<Context> a;
    private final InterfaceC2296a<ax.q5.e> b;
    private final InterfaceC2296a<InterfaceC3444d> c;
    private final InterfaceC2296a<InterfaceC3370x> d;
    private final InterfaceC2296a<Executor> e;
    private final InterfaceC2296a<InterfaceC3507b> f;
    private final InterfaceC2296a<InterfaceC3550a> g;
    private final InterfaceC2296a<InterfaceC3550a> h;
    private final InterfaceC2296a<InterfaceC3443c> i;

    public C3365s(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<ax.q5.e> interfaceC2296a2, InterfaceC2296a<InterfaceC3444d> interfaceC2296a3, InterfaceC2296a<InterfaceC3370x> interfaceC2296a4, InterfaceC2296a<Executor> interfaceC2296a5, InterfaceC2296a<InterfaceC3507b> interfaceC2296a6, InterfaceC2296a<InterfaceC3550a> interfaceC2296a7, InterfaceC2296a<InterfaceC3550a> interfaceC2296a8, InterfaceC2296a<InterfaceC3443c> interfaceC2296a9) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
        this.e = interfaceC2296a5;
        this.f = interfaceC2296a6;
        this.g = interfaceC2296a7;
        this.h = interfaceC2296a8;
        this.i = interfaceC2296a9;
    }

    public static C3365s a(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<ax.q5.e> interfaceC2296a2, InterfaceC2296a<InterfaceC3444d> interfaceC2296a3, InterfaceC2296a<InterfaceC3370x> interfaceC2296a4, InterfaceC2296a<Executor> interfaceC2296a5, InterfaceC2296a<InterfaceC3507b> interfaceC2296a6, InterfaceC2296a<InterfaceC3550a> interfaceC2296a7, InterfaceC2296a<InterfaceC3550a> interfaceC2296a8, InterfaceC2296a<InterfaceC3443c> interfaceC2296a9) {
        return new C3365s(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4, interfaceC2296a5, interfaceC2296a6, interfaceC2296a7, interfaceC2296a8, interfaceC2296a9);
    }

    public static C3364r c(Context context, ax.q5.e eVar, InterfaceC3444d interfaceC3444d, InterfaceC3370x interfaceC3370x, Executor executor, InterfaceC3507b interfaceC3507b, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, InterfaceC3443c interfaceC3443c) {
        return new C3364r(context, eVar, interfaceC3444d, interfaceC3370x, executor, interfaceC3507b, interfaceC3550a, interfaceC3550a2, interfaceC3443c);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3364r get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
