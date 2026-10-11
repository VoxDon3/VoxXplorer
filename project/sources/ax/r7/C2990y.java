package ax.r7;

import java.io.Serializable;

/* renamed from: ax.r7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2990y<K, V> extends AbstractC2971e<K, V> implements Serializable {
    final V c0;
    final K q;

    C2990y(K k, V v) {
        this.q = k;
        this.c0 = v;
    }

    @Override // ax.r7.AbstractC2971e, java.util.Map.Entry
    public final K getKey() {
        return this.q;
    }

    @Override // ax.r7.AbstractC2971e, java.util.Map.Entry
    public final V getValue() {
        return this.c0;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
