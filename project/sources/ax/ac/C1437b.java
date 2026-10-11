package ax.ac;

import ax.Qb.C0947m;
import ax.Qb.InterfaceC0945l;
import ax.j6.AbstractC2327j;
import ax.j6.C2318a;
import ax.j6.InterfaceC2322e;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.wb.e;
import ax.xb.C3479b;
import ax.yb.h;
import java.util.concurrent.CancellationException;

/* renamed from: ax.ac.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1437b {

    /* renamed from: ax.ac.b$a */
    static final class a<TResult> implements InterfaceC2322e {
        final /* synthetic */ InterfaceC0945l<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC0945l<? super T> interfaceC0945l) {
            this.a = interfaceC0945l;
        }

        @Override // ax.j6.InterfaceC2322e
        public final void a(AbstractC2327j<T> abstractC2327j) {
            Exception i = abstractC2327j.i();
            if (i != null) {
                e eVar = this.a;
                C3082n.a aVar = C3082n.q;
                eVar.f(C3082n.a(C3083o.a(i)));
            } else {
                if (abstractC2327j.k()) {
                    InterfaceC0945l.a.a(this.a, null, 1, null);
                    return;
                }
                e eVar2 = this.a;
                C3082n.a aVar2 = C3082n.q;
                eVar2.f(C3082n.a(abstractC2327j.j()));
            }
        }
    }

    public static final <T> Object a(AbstractC2327j<T> abstractC2327j, e<? super T> eVar) {
        return b(abstractC2327j, null, eVar);
    }

    private static final <T> Object b(AbstractC2327j<T> abstractC2327j, C2318a c2318a, e<? super T> eVar) {
        if (!abstractC2327j.l()) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            abstractC2327j.c(ExecutorC1436a.q, new a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                h.c(eVar);
            }
            return z;
        }
        Exception i = abstractC2327j.i();
        if (i != null) {
            throw i;
        }
        if (!abstractC2327j.k()) {
            return abstractC2327j.j();
        }
        throw new CancellationException("Task " + abstractC2327j + " was cancelled normally.");
    }
}
