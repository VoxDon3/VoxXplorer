package ax.b6;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ax.b6.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1711y4<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> q;

    public C1711y4(Iterator<Map.Entry<K, Object>> it) {
        this.q = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.q.next();
        return next.getValue() instanceof C1703x4 ? new C1695w4(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.q.remove();
    }
}
