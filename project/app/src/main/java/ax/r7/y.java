/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.e;
import java.io.Serializable;

class y<K, V>
extends e<K, V>
implements Serializable {
    final V c0;
    final K q;

    y(K k8, V v8) {
        this.q = k8;
        this.c0 = v8;
    }

    @Override
    public final K getKey() {
        return this.q;
    }

    @Override
    public final V getValue() {
        return this.c0;
    }

    @Override
    public final V setValue(V v8) {
        throw new UnsupportedOperationException();
    }
}

