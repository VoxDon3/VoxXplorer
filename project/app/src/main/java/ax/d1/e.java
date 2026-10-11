/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import ax.P0.L;
import ax.d1.f;
import ax.d1.i;
import ax.d1.j;
import ax.d1.l;
import ax.h1.b;
import ax.m1.p;
import java.util.List;

public final class e
implements l {
    private final l a;
    private final List<L> b;

    public e(l l8, List<L> list) {
        this.a = l8;
        this.b = list;
    }

    @Override
    public p.a<j> a(i i8, f f8) {
        return new b<j>(this.a.a(i8, f8), this.b);
    }

    @Override
    public p.a<j> b() {
        return new b<j>(this.a.b(), this.b);
    }
}

