/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.e;
import ax.Wc.h;
import ax.Wc.q;
import ax.Wc.t;
import ax.Wc.x0;

public class b
extends t {
    q c0 = null;
    e q = e.E(false);

    public b(boolean bl) {
        this.q = bl ? e.E(true) : null;
        this.c0 = null;
    }

    @Override
    public A g() {
        h h8 = new h(2);
        A a8 = this.q;
        if (a8 != null) {
            h8.a(a8);
        }
        if ((a8 = this.c0) != null) {
            h8.a(a8);
        }
        return new x0(h8);
    }

    public boolean r() {
        e e8 = this.q;
        return e8 != null && e8.G();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        StringBuilder stringBuilder;
        if (this.c0 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("BasicConstraints: isCa(");
            stringBuilder.append(this.r());
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("BasicConstraints: isCa(");
        stringBuilder.append(this.r());
        stringBuilder.append("), pathLenConstraint = ");
        stringBuilder.append(this.c0.G());
        return stringBuilder.toString();
    }
}

