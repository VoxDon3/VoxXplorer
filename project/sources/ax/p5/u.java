package ax.p5;

import android.content.Context;
import ax.n5.C2580b;
import ax.p5.i;
import ax.v5.InterfaceC3282e;
import ax.w5.C3364r;
import ax.w5.C3368v;
import ax.z5.InterfaceC3550a;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class u implements t {
    private static volatile v e;
    private final InterfaceC3550a a;
    private final InterfaceC3550a b;
    private final InterfaceC3282e c;
    private final C3364r d;

    u(InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, InterfaceC3282e interfaceC3282e, C3364r c3364r, C3368v c3368v) {
        this.a = interfaceC3550a;
        this.b = interfaceC3550a2;
        this.c = interfaceC3282e;
        this.d = c3364r;
        c3368v.c();
    }

    private i b(o oVar) {
        i.a g = i.a().i(this.a.a()).o(this.b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        oVar.c().e();
        oVar.c().b();
        return g.d();
    }

    public static u c() {
        v vVar = e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<C2580b> d(f fVar) {
        return fVar instanceof g ? DesugarCollections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C2580b.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (u.class) {
                try {
                    if (e == null) {
                        e = e.a().a(context).g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // ax.p5.t
    public void a(o oVar, ax.n5.j jVar) {
        this.c.a(oVar.f().f(oVar.c().d()), b(oVar), jVar);
    }

    public C3364r e() {
        return this.d;
    }

    public ax.n5.i g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
