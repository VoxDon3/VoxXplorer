package ax.r7;

import ax.q7.C2883j;
import java.util.Map;

/* renamed from: ax.r7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2971e<K, V> implements Map.Entry<K, V> {
    AbstractC2971e() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C2883j.a(getKey(), entry.getKey()) && C2883j.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
