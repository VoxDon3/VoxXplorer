package ax.wb;

import ax.Fb.l;
import ax.wb.i;
import ax.wb.i.b;

/* renamed from: ax.wb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3381b<B extends i.b, E extends B> implements i.c<E> {
    private final i.c<?> c0;
    private final l<i.b, E> q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ax.wb.i$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ax.Fb.l<? super ax.wb.i$b, ? extends E extends B>, ax.Fb.l<ax.wb.i$b, E extends B>, java.lang.Object] */
    public AbstractC3381b(i.c<B> cVar, l<? super i.b, ? extends E> lVar) {
        ax.Gb.l.f(cVar, "baseKey");
        ax.Gb.l.f(lVar, "safeCast");
        this.q = lVar;
        this.c0 = cVar instanceof AbstractC3381b ? (i.c<B>) ((AbstractC3381b) cVar).c0 : cVar;
    }

    public final boolean a(i.c<?> cVar) {
        ax.Gb.l.f(cVar, "key");
        return cVar == this || this.c0 == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lax/wb/i$b;)TE; */
    public final i.b b(i.b bVar) {
        ax.Gb.l.f(bVar, "element");
        return (i.b) this.q.invoke(bVar);
    }
}
