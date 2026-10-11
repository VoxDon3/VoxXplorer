/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.I1;
import java.util.Map;

final class C1
implements Map.Entry,
Comparable {
    private Object c0;
    final I1 d0;
    private final Comparable q;

    C1(I1 i12, Comparable comparable, Object object) {
        this.d0 = i12;
        this.q = comparable;
        this.c0 = object;
    }

    private static final boolean h(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public final Comparable d() {
        return this.q;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return C1.h(this.q, (object = (Map.Entry)object).getKey()) && C1.h(this.c0, object.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.q;
    }

    public final Object getValue() {
        return this.c0;
    }

    @Override
    public final int hashCode() {
        Object object = this.q;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.c0;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 ^ n8;
    }

    public final Object setValue(Object object) {
        I1.j(this.d0);
        Object object2 = this.c0;
        this.c0 = object;
        return object2;
    }

    public final String toString() {
        String string = String.valueOf(this.q);
        String string2 = String.valueOf(this.c0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

