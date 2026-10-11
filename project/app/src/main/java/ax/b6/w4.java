/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.U4;
import ax.b6.x4;
import ax.b6.z4;
import java.util.Map;

final class w4<K>
implements Map.Entry<K, Object> {
    private Map.Entry<K, x4> q;

    private w4(Map.Entry<K, x4> entry) {
        this.q = entry;
    }

    /* synthetic */ w4(Map.Entry entry, z4 z42) {
        this(entry);
    }

    public final x4 a() {
        return this.q.getValue();
    }

    @Override
    public final K getKey() {
        return this.q.getKey();
    }

    @Override
    public final Object getValue() {
        if (this.q.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override
    public final Object setValue(Object object) {
        if (object instanceof U4) {
            return this.q.getValue().b((U4)object);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

