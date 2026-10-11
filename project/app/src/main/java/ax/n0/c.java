/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.n0.n;

final class c<T>
extends n<T> {
    private final T a;
    private final int b;

    public c(T t8, int n8) {
        super(null);
        this.a = t8;
        this.b = n8;
    }

    public final void a() {
        T t8 = this.a;
        boolean bl = false;
        int n8 = t8 != null ? t8.hashCode() : 0;
        if (n8 == this.b) {
            bl = true;
        }
        if (bl) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    }

    public final T b() {
        return this.a;
    }
}

