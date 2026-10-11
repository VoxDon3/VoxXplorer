/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.U;

final class V
extends U {
    private final Object q;

    V(Object object) {
        this.q = object;
    }

    @Override
    public final Object a() {
        return this.q;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object object) {
        if (object instanceof V) {
            object = (V)object;
            return this.q.equals(((V)object).q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.q.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Optional.of(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

