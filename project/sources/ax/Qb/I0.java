package ax.Qb;

import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes3.dex */
final class I0<T> extends y0 {
    private final C0947m<T> f0;

    /* JADX WARN: Multi-variable type inference failed */
    public I0(C0947m<? super T> c0947m) {
        this.f0 = c0947m;
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
        x(th);
        return ax.sb.t.a;
    }

    @Override // ax.Qb.B
    public void x(Throwable th) {
        Object W = y().W();
        if (W instanceof C0966z) {
            C0947m<T> c0947m = this.f0;
            C3082n.a aVar = C3082n.q;
            c0947m.f(C3082n.a(C3083o.a(((C0966z) W).a)));
        } else {
            C0947m<T> c0947m2 = this.f0;
            C3082n.a aVar2 = C3082n.q;
            c0947m2.f(C3082n.a(A0.h(W)));
        }
    }
}
