package ax.b6;

import java.util.Map;

/* renamed from: ax.b6.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1695w4<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, C1703x4> q;

    public final C1703x4 a() {
        return this.q.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.q.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.q.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof U4) {
            return this.q.getValue().b((U4) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private C1695w4(Map.Entry<K, C1703x4> entry) {
        this.q = entry;
    }
}
