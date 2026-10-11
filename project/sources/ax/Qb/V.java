package ax.Qb;

import ax.Vb.C1003j;
import ax.sb.C3069a;
import ax.sb.C3082n;
import ax.sb.C3083o;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class V<T> extends ax.Xb.h {
    public int d0;

    public V(int i) {
        this.d0 = i;
    }

    public abstract ax.wb.e<T> e();

    public Throwable g(Object obj) {
        C0966z c0966z = obj instanceof C0966z ? (C0966z) obj : null;
        if (c0966z != null) {
            return c0966z.a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C3069a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ax.Gb.l.c(th);
        I.a(e().b(), new M("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        Object a2;
        ax.Xb.i iVar = this.c0;
        try {
            ax.wb.e<T> e = e();
            ax.Gb.l.d(e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1003j c1003j = (C1003j) e;
            ax.wb.e<T> eVar = c1003j.f0;
            Object obj = c1003j.h0;
            ax.wb.i b = eVar.b();
            Object c = ax.Vb.J.c(b, obj);
            P0<?> g = c != ax.Vb.J.a ? F.g(eVar, b, c) : null;
            try {
                ax.wb.i b2 = eVar.b();
                Object j = j();
                Throwable g2 = g(j);
                InterfaceC0959s0 interfaceC0959s0 = (g2 == null && W.b(this.d0)) ? (InterfaceC0959s0) b2.a(InterfaceC0959s0.c) : null;
                if (interfaceC0959s0 != null && !interfaceC0959s0.e()) {
                    CancellationException o = interfaceC0959s0.o();
                    c(j, o);
                    C3082n.a aVar = C3082n.q;
                    eVar.f(C3082n.a(C3083o.a(o)));
                } else if (g2 != null) {
                    C3082n.a aVar2 = C3082n.q;
                    eVar.f(C3082n.a(C3083o.a(g2)));
                } else {
                    C3082n.a aVar3 = C3082n.q;
                    eVar.f(C3082n.a(h(j)));
                }
                ax.sb.t tVar = ax.sb.t.a;
                if (g == null || g.O0()) {
                    ax.Vb.J.a(b, c);
                }
                try {
                    iVar.a();
                    a2 = C3082n.a(ax.sb.t.a);
                } catch (Throwable th) {
                    C3082n.a aVar4 = C3082n.q;
                    a2 = C3082n.a(C3083o.a(th));
                }
                i(null, C3082n.b(a2));
            } catch (Throwable th2) {
                if (g == null || g.O0()) {
                    ax.Vb.J.a(b, c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C3082n.a aVar5 = C3082n.q;
                iVar.a();
                a = C3082n.a(ax.sb.t.a);
            } catch (Throwable th4) {
                C3082n.a aVar6 = C3082n.q;
                a = C3082n.a(C3083o.a(th4));
            }
            i(th3, C3082n.b(a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public void c(Object obj, Throwable th) {
    }
}
