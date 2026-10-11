package ax.Nb;

import ax.sb.t;
import ax.xb.C3479b;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class g<T> {
    public abstract Object c(T t, ax.wb.e<? super t> eVar);

    public final Object e(e<? extends T> eVar, ax.wb.e<? super t> eVar2) {
        Object g = g(eVar.iterator(), eVar2);
        return g == C3479b.c() ? g : t.a;
    }

    public abstract Object g(Iterator<? extends T> it, ax.wb.e<? super t> eVar);
}
