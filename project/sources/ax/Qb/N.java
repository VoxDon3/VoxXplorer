package ax.Qb;

import ax.Vb.C1003j;
import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes3.dex */
public final class N {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(ax.wb.e<?> eVar) {
        Object a;
        if (eVar instanceof C1003j) {
            return eVar.toString();
        }
        try {
            C3082n.a aVar = C3082n.q;
            a = C3082n.a(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            C3082n.a aVar2 = C3082n.q;
            a = C3082n.a(C3083o.a(th));
        }
        if (C3082n.b(a) != null) {
            a = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) a;
    }
}
