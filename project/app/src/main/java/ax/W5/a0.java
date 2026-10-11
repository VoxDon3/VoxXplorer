/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.W;
import java.io.Serializable;
import java.util.Arrays;

final class a0
implements Serializable,
W {
    final Object q;

    a0(Object object) {
        this.q = object;
    }

    @Override
    public final Object a() {
        return this.q;
    }

    public final boolean equals(Object object) {
        if (object instanceof a0) {
            Object object2 = (a0)object;
            object = this.q;
            object2 = ((a0)object2).q;
            return object == object2 || object.equals(object2);
            {
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.q});
    }

    public final String toString() {
        String string = this.q.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Suppliers.ofInstance(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

