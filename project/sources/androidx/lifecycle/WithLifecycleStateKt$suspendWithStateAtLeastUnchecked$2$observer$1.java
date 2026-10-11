package androidx.lifecycle;

import androidx.lifecycle.d;
import ax.Qb.InterfaceC0945l;
import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements f {
    final /* synthetic */ d c0;
    final /* synthetic */ InterfaceC0945l<Object> d0;
    final /* synthetic */ ax.Fb.a<Object> e0;
    final /* synthetic */ d.b q;

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        Object a;
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        if (aVar != d.a.Companion.c(this.q)) {
            if (aVar == d.a.ON_DESTROY) {
                this.c0.c(this);
                InterfaceC0945l<Object> interfaceC0945l = this.d0;
                C3082n.a aVar2 = C3082n.q;
                interfaceC0945l.f(C3082n.a(C3083o.a(new ax.G0.f())));
                return;
            }
            return;
        }
        this.c0.c(this);
        InterfaceC0945l<Object> interfaceC0945l2 = this.d0;
        ax.Fb.a<Object> aVar3 = this.e0;
        try {
            C3082n.a aVar4 = C3082n.q;
            a = C3082n.a(aVar3.invoke());
        } catch (Throwable th) {
            C3082n.a aVar5 = C3082n.q;
            a = C3082n.a(C3083o.a(th));
        }
        interfaceC0945l2.f(a);
    }
}
