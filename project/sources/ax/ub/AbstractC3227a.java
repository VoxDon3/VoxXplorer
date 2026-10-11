package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3130f;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ax.ub.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3227a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC3130f<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    public final boolean g(E e) {
        l.f(e, "element");
        return i(e);
    }

    public abstract boolean i(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean k(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return k((Map.Entry) obj);
        }
        return false;
    }
}
