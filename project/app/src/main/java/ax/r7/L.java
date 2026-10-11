/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import java.util.Collection;
import java.util.Map;

public interface L<K, V> {
    public Collection<Map.Entry<K, V>> a();

    public Map<K, Collection<V>> b();

    public boolean c(Object var1, Object var2);

    public void clear();

    public Collection<V> get(K var1);

    public boolean put(K var1, V var2);

    public boolean remove(Object var1, Object var2);

    public int size();

    public Collection<V> values();
}

