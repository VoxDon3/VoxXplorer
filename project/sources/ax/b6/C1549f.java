package ax.b6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.b6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1549f implements Iterator<InterfaceC1658s> {
    private final /* synthetic */ Iterator c0;
    private final /* synthetic */ Iterator q;

    C1549f(C1558g c1558g, Iterator it, Iterator it2) {
        this.q = it;
        this.c0 = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.q.hasNext()) {
            return true;
        }
        return this.c0.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1658s next() {
        if (this.q.hasNext()) {
            return new C1674u(((Integer) this.q.next()).toString());
        }
        if (this.c0.hasNext()) {
            return new C1674u((String) this.c0.next());
        }
        throw new NoSuchElementException();
    }
}
