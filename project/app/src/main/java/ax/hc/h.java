/*
 * Decompiled with CFR 0.152.
 */
package ax.hc;

import ax.cc.d;
import ax.hc.f;
import ax.hc.g;
import ax.kc.a;

public class h
extends a
implements g {
    private final f b;

    public h(ax.kc.f f8, f f9) {
        super(f8);
        this.b = f9;
    }

    @Override
    public void a(d d8, Object object, Iterable iterable2) {
        d8.d();
        for (Iterable iterable2 : iterable2) {
            this.d().c(iterable2, object, d8);
        }
    }

    public f d() {
        return this.b;
    }
}

