/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.W;
import java.io.Serializable;

final class X
implements Serializable,
W {
    volatile transient boolean c0;
    transient Object d0;
    final W q;

    X(W w8) {
        this.q = w8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        if (this.c0) return this.d0;
        synchronized (this) {
            try {
                Object object;
                if (this.c0) return this.d0;
                this.d0 = object = this.q.a();
                this.c0 = true;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder;
        Object object;
        if (this.c0) {
            object = String.valueOf(this.d0);
            stringBuilder = new StringBuilder();
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append((String)object);
            stringBuilder.append(">");
            object = stringBuilder.toString();
        } else {
            object = this.q;
        }
        object = object.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

