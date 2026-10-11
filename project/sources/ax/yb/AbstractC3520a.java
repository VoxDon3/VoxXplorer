package ax.yb;

import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import java.io.Serializable;

/* renamed from: ax.yb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3520a implements ax.wb.e<Object>, e, Serializable {
    private final ax.wb.e<Object> q;

    public AbstractC3520a(ax.wb.e<Object> eVar) {
        this.q = eVar;
    }

    public ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
        ax.Gb.l.f(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public e d() {
        ax.wb.e<Object> eVar = this.q;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.wb.e
    public final void f(Object obj) {
        Object p;
        ax.wb.e eVar = this;
        while (true) {
            h.b(eVar);
            AbstractC3520a abstractC3520a = (AbstractC3520a) eVar;
            ax.wb.e eVar2 = abstractC3520a.q;
            ax.Gb.l.c(eVar2);
            try {
                p = abstractC3520a.p(obj);
            } catch (Throwable th) {
                C3082n.a aVar = C3082n.q;
                obj = C3082n.a(C3083o.a(th));
            }
            if (p == C3479b.c()) {
                return;
            }
            obj = C3082n.a(p);
            abstractC3520a.q();
            if (!(eVar2 instanceof AbstractC3520a)) {
                eVar2.f(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public final ax.wb.e<Object> h() {
        return this.q;
    }

    public StackTraceElement o() {
        return g.d(this);
    }

    protected abstract Object p(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object o = o();
        if (o == null) {
            o = getClass().getName();
        }
        sb.append(o);
        return sb.toString();
    }

    protected void q() {
    }
}
