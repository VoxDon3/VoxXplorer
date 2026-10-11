/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.W;
import ax.W5.Y;

final class Z
implements W {
    private static final W d0 = Y.q;
    private Object c0;
    private volatile W q;

    Z(W w8) {
        this.q = w8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        Object object = this.q;
        W w8 = d0;
        if (object == w8) return this.c0;
        synchronized (this) {
            try {
                if (this.q == w8) return this.c0;
                this.c0 = object = this.q.a();
                this.q = w8;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String toString() {
        Object object;
        Object object2 = object = this.q;
        if (object == d0) {
            object2 = String.valueOf(this.c0);
            object = new StringBuilder();
            ((StringBuilder)object).append("<supplier that returned ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(">");
            object2 = ((StringBuilder)object).toString();
        }
        object2 = String.valueOf(object2);
        object = new StringBuilder();
        ((StringBuilder)object).append("Suppliers.memoize(");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

