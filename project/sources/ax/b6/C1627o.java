package ax.b6;

import java.util.Iterator;

/* renamed from: ax.b6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1627o implements Iterator<InterfaceC1658s> {
    private final /* synthetic */ Iterator q;

    C1627o(Iterator it) {
        this.q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1658s next() {
        return new C1674u((String) this.q.next());
    }
}
