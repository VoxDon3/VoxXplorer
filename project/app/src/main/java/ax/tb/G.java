/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.tb.E;
import java.util.Map;
import java.util.NoSuchElementException;

class G {
    public static final <K, V> V a(Map<K, ? extends V> object, K k8) {
        l.f(object, "<this>");
        if (object instanceof E) {
            return ((E)object).h(k8);
        }
        V v8 = object.get(k8);
        if (v8 == null && !object.containsKey(k8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Key ");
            ((StringBuilder)object).append(k8);
            ((StringBuilder)object).append(" is missing in the map.");
            throw new NoSuchElementException(((StringBuilder)object).toString());
        }
        return v8;
    }
}

