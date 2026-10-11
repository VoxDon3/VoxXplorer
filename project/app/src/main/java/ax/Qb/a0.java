/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.Z;
import ax.Qb.j;

final class a0
extends j {
    private final Z q;

    public a0(Z z8) {
        this.q = z8;
    }

    @Override
    public void f(Throwable throwable) {
        this.q.d();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DisposeOnCancel[");
        stringBuilder.append(this.q);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

