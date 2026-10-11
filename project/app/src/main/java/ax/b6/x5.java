/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m5;
import ax.b6.v5;
import ax.b6.w5;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class x5
extends AbstractSet {
    private final m5 q;

    private x5(m5 m52) {
        this.q = m52;
    }

    /* synthetic */ x5(m5 m52, w5 w52) {
        this(m52);
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        if (!this.contains(object = (Map.Entry)object)) {
            this.q.d((Comparable)object.getKey(), object.getValue());
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    @Override
    public boolean contains(Object object) {
        Map.Entry entry = (Map.Entry)object;
        object = this.q.get(entry.getKey());
        return object == (entry = entry.getValue()) || object != null && object.equals(entry);
        {
        }
    }

    @Override
    public Iterator iterator() {
        return new v5(this.q, null);
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.q.remove(object.getKey());
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.q.size();
    }
}

