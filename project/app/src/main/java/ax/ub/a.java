/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import ax.tb.f;
import java.util.Map;

public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V>
extends f<E> {
    public final boolean g(E e8) {
        l.f(e8, "element");
        return this.i((Map.Entry<? extends K, ? extends V>)e8);
    }

    public abstract boolean i(Map.Entry<? extends K, ? extends V> var1);
}

