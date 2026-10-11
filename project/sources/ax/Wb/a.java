package ax.Wb;

import ax.Fb.l;
import ax.Fb.p;
import ax.Vb.C1004k;
import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.sb.t;
import ax.wb.e;
import ax.xb.C3479b;

/* loaded from: classes3.dex */
public final class a {
    private static final void a(e<?> eVar, Throwable th) {
        C3082n.a aVar = C3082n.q;
        eVar.f(C3082n.a(C3083o.a(th)));
        throw th;
    }

    public static final <R, T> void b(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r, e<? super T> eVar, l<? super Throwable, t> lVar) {
        try {
            e b = C3479b.b(C3479b.a(pVar, r, eVar));
            C3082n.a aVar = C3082n.q;
            C1004k.b(b, C3082n.a(t.a), lVar);
        } catch (Throwable th) {
            a(eVar, th);
        }
    }

    public static final void c(e<? super t> eVar, e<?> eVar2) {
        try {
            e b = C3479b.b(eVar);
            C3082n.a aVar = C3082n.q;
            C1004k.c(b, C3082n.a(t.a), null, 2, null);
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, e eVar, l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, eVar, lVar);
    }
}
