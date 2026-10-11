package ax.Ub;

import ax.Fb.p;
import ax.Fb.q;
import ax.Gb.l;
import ax.Gb.m;
import ax.Qb.w0;
import ax.sb.C3082n;
import ax.sb.t;
import ax.wb.i;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;

/* loaded from: classes3.dex */
public final class i<T> extends AbstractC3523d implements ax.Tb.c<T>, ax.yb.e {
    public final ax.Tb.c<T> e0;
    public final ax.wb.i f0;
    public final int g0;
    private ax.wb.i h0;
    private ax.wb.e<? super t> i0;

    static final class a extends m implements p<Integer, i.b, Integer> {
        public static final a q = new a();

        a() {
            super(2);
        }

        public final Integer a(int i, i.b bVar) {
            return Integer.valueOf(i + 1);
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ Integer j(Integer num, i.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(ax.Tb.c<? super T> cVar, ax.wb.i iVar) {
        super(g.q, ax.wb.j.q);
        this.e0 = cVar;
        this.f0 = iVar;
        this.g0 = ((Number) iVar.v(0, a.q)).intValue();
    }

    private final void u(ax.wb.i iVar, ax.wb.i iVar2, T t) {
        if (iVar2 instanceof e) {
            w((e) iVar2, t);
        }
        k.a(this, iVar);
    }

    private final Object v(ax.wb.e<? super t> eVar, T t) {
        q qVar;
        ax.wb.i b = eVar.b();
        w0.f(b);
        ax.wb.i iVar = this.h0;
        if (iVar != b) {
            u(b, iVar, t);
            this.h0 = b;
        }
        this.i0 = eVar;
        qVar = j.a;
        ax.Tb.c<T> cVar = this.e0;
        l.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object c = qVar.c(cVar, t, this);
        if (!l.a(c, C3479b.c())) {
            this.i0 = null;
        }
        return c;
    }

    private final void w(e eVar, Object obj) {
        throw new IllegalStateException(ax.Ob.h.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.q + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // ax.yb.AbstractC3523d, ax.wb.e
    public ax.wb.i b() {
        ax.wb.i iVar = this.h0;
        return iVar == null ? ax.wb.j.q : iVar;
    }

    @Override // ax.yb.AbstractC3520a, ax.yb.e
    public ax.yb.e d() {
        ax.wb.e<? super t> eVar = this.i0;
        if (eVar instanceof ax.yb.e) {
            return (ax.yb.e) eVar;
        }
        return null;
    }

    @Override // ax.Tb.c
    public Object e(T t, ax.wb.e<? super t> eVar) {
        try {
            Object v = v(eVar, t);
            if (v == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return v == C3479b.c() ? v : t.a;
        } catch (Throwable th) {
            this.h0 = new e(th, eVar.b());
            throw th;
        }
    }

    @Override // ax.yb.AbstractC3520a
    public StackTraceElement o() {
        return null;
    }

    @Override // ax.yb.AbstractC3520a
    public Object p(Object obj) {
        Throwable b = C3082n.b(obj);
        if (b != null) {
            this.h0 = new e(b, b());
        }
        ax.wb.e<? super t> eVar = this.i0;
        if (eVar != null) {
            eVar.f(obj);
        }
        return C3479b.c();
    }

    @Override // ax.yb.AbstractC3523d, ax.yb.AbstractC3520a
    public void q() {
        super.q();
    }
}
