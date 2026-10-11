/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.E1;
import ax.W5.F1;
import ax.W5.I1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class G1
extends AbstractSet {
    final I1 q;

    /* synthetic */ G1(I1 i12, F1 f12) {
        this.q = i12;
    }

    @Override
    public final void clear() {
        this.q.clear();
    }

    @Override
    public final boolean contains(Object object) {
        Map.Entry entry = (Map.Entry)object;
        object = this.q.get(entry.getKey());
        if (object != (entry = entry.getValue())) {
            return object != null && object.equals(entry);
        }
        return true;
    }

    @Override
    public final Iterator iterator() {
        return new E1(this.q, null);
    }

    @Override
    public final boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.q.remove(object.getKey());
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.q.size();
    }
}

