package ax.Wb;

import ax.Fb.p;
import ax.Gb.z;
import ax.Qb.A0;
import ax.Qb.C0966z;
import ax.Vb.B;
import ax.Vb.J;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.wb.e;
import ax.wb.i;
import ax.xb.C3479b;
import ax.yb.h;

/* loaded from: classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r, e<? super T> eVar) {
        e a = h.a(eVar);
        try {
            i b = eVar.b();
            Object c = J.c(b, null);
            try {
                Object j = ((p) z.c(pVar, 2)).j(r, a);
                if (j != C3479b.c()) {
                    a.f(C3082n.a(j));
                }
            } finally {
                J.a(b, c);
            }
        } catch (Throwable th) {
            C3082n.a aVar = C3082n.q;
            a.f(C3082n.a(C3083o.a(th)));
        }
    }

    public static final <T, R> Object b(B<? super T> b, R r, p<? super R, ? super e<? super T>, ? extends Object> pVar) {
        Object c0966z;
        try {
            c0966z = ((p) z.c(pVar, 2)).j(r, b);
        } catch (Throwable th) {
            c0966z = new C0966z(th, false, 2, null);
        }
        if (c0966z == C3479b.c()) {
            return C3479b.c();
        }
        Object f0 = b.f0(c0966z);
        if (f0 == A0.b) {
            return C3479b.c();
        }
        if (f0 instanceof C0966z) {
            throw ((C0966z) f0).a;
        }
        return A0.h(f0);
    }
}
