/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.j;
import java.util.Map;

abstract class e<K, V>
implements Map.Entry<K, V> {
    e() {
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            object = (Map.Entry)object;
            if (j.a(this.getKey(), object.getKey()) && j.a(this.getValue(), object.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    @Override
    public int hashCode() {
        K k8 = this.getKey();
        V v8 = this.getValue();
        int n8 = 0;
        int n9 = k8 == null ? 0 : k8.hashCode();
        if (v8 != null) {
            n8 = v8.hashCode();
        }
        return n9 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append("=");
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}

