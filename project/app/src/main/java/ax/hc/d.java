/*
 * Decompiled with CFR 0.152.
 */
package ax.hc;

import ax.hc.b;
import ax.hc.g;

public final class d
extends b {
    private final ax.jc.d[] c;

    public d(g g8) {
        super(g8);
        this.c = g8.b().a().c();
    }

    private boolean e(Object object) {
        ax.jc.d[] dArray = this.c;
        if (dArray == null) {
            return true;
        }
        int n8 = dArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (dArray[i8].a(object, this.b())) continue;
            return false;
        }
        return true;
    }

    @Override
    public void a(ax.cc.d d8, Object object, Iterable iterable) {
        if (this.e(object)) {
            this.d().a(d8, object, iterable);
        }
    }
}

