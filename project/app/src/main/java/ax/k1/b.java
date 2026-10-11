/*
 * Decompiled with CFR 0.152.
 */
package ax.k1;

import ax.N1.j;
import ax.N1.k;
import ax.N1.t;

final class b
extends j {
    private final t p;

    public b(String string, t t8) {
        super(string);
        this.p = t8;
    }

    @Override
    protected k C(byte[] byArray, int n8, boolean bl) {
        if (bl) {
            this.p.a();
        }
        return this.p.b(byArray, 0, n8);
    }
}

