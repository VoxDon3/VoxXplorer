package ax.Qb;

import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes3.dex */
public final class D {
    public static final <T> Object a(Object obj, ax.wb.e<? super T> eVar) {
        if (!(obj instanceof C0966z)) {
            return C3082n.a(obj);
        }
        C3082n.a aVar = C3082n.q;
        return C3082n.a(C3083o.a(((C0966z) obj).a));
    }

    public static final <T> Object b(Object obj, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        Throwable b = C3082n.b(obj);
        return b == null ? lVar != null ? new A(obj, lVar) : obj : new C0966z(b, false, 2, null);
    }

    public static final <T> Object c(Object obj, InterfaceC0945l<?> interfaceC0945l) {
        Throwable b = C3082n.b(obj);
        return b == null ? obj : new C0966z(b, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, ax.Fb.l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
