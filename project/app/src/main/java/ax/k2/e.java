/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.l;
import ax.k2.c;
import ax.k2.d;
import ax.o2.h;

public final class e
implements h.c {
    private final h.c a;
    private final c b;

    public e(h.c c8, c c9) {
        l.f(c8, "delegate");
        l.f(c9, "autoCloser");
        this.a = c8;
        this.b = c9;
    }

    public d b(h.b b8) {
        l.f(b8, "configuration");
        return new d(this.a.a(b8), this.b);
    }
}

