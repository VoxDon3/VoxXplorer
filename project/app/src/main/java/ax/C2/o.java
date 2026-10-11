/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.B2.l;
import ax.G0.l;
import ax.M2.c;

public class o
implements ax.B2.l {
    private final l<l.b> c = new l();
    private final c<l.b.c> d = ax.M2.c.t();

    public o() {
        this.a(ax.B2.l.b);
    }

    public void a(l.b b8) {
        this.c.l(b8);
        if (b8 instanceof l.b.c) {
            this.d.p((l.b.c)b8);
            return;
        }
        if (b8 instanceof l.b.a) {
            b8 = (l.b.a)b8;
            this.d.q(((l.b.a)b8).a());
        }
    }
}

