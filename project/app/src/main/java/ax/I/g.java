/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.I.d;
import ax.I.f;
import ax.I.l;
import ax.I.p;

class g
extends f {
    public int m;

    public g(p p8) {
        super(p8);
        if (p8 instanceof l) {
            this.e = f.a.c0;
            return;
        }
        this.e = f.a.d0;
    }

    @Override
    public void d(int n8) {
        if (!this.j) {
            this.j = true;
            this.g = n8;
            for (d d8 : this.k) {
                d8.a(d8);
            }
        }
    }
}

