/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.w4;
import ax.b6.x4;
import java.util.Iterator;
import java.util.Map;

final class y4<K>
implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> q;

    public y4(Iterator<Map.Entry<K, Object>> iterator) {
        this.q = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> entry = this.q.next();
        if (entry.getValue() instanceof x4) {
            return new w4(entry, null);
        }
        return entry;
    }

    @Override
    public final void remove() {
        this.q.remove();
    }
}

