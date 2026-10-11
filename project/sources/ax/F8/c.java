package ax.F8;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class c<T> extends ax.C8.b<T> implements Iterable {
    protected byte[] c0;

    public c(ax.C8.c<?> cVar, byte[] bArr) {
        super(cVar);
        this.c0 = bArr;
    }

    @Override // java.lang.Iterable
    public Iterator<ax.C8.b> iterator() {
        if (this.q.f() != ax.C8.a.CONSTRUCTED) {
            return Collections.singletonList(this).iterator();
        }
        ax.C8.c<ax.D8.a> cVar = ax.C8.c.n;
        return cVar.j(new ax.A8.a()).a(cVar, this.c0).iterator();
    }
}
