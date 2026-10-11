/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.l;
import ax.Qb.N;
import ax.Qb.j;
import ax.sb.t;

final class p0
extends j {
    private final l<Throwable, t> q;

    public p0(l<? super Throwable, t> l8) {
        this.q = l8;
    }

    @Override
    public void f(Throwable throwable) {
        this.q.invoke(throwable);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InvokeOnCancel[");
        stringBuilder.append(N.a(this.q));
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

