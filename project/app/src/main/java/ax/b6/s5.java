/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m5;
import java.util.Map;

final class s5
implements Comparable,
Map.Entry {
    private Object c0;
    private final m5 d0;
    private final Comparable q;

    s5(m5 m52, Comparable comparable, Object object) {
        this.d0 = m52;
        this.q = comparable;
        this.c0 = object;
    }

    s5(m5 m52, Map.Entry entry) {
        this(m52, (Comparable)entry.getKey(), entry.getValue());
    }

    private static boolean d(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (s5)object;
        return ((Comparable)this.getKey()).compareTo((Comparable)((s5)object).getKey());
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return s5.d(this.q, (object = (Map.Entry)object).getKey()) && s5.d(this.c0, object.getValue());
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
        m5.n(this.d0);
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

