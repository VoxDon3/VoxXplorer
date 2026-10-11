package ax.r7;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface L<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k);

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
