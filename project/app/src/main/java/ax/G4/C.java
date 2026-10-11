/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.f;
import ax.G4.n0;
import ax.G4.p0;
import ax.G4.q0;
import ax.G4.s0;
import ax.G4.t;
import ax.p4.i;
import ax.p4.j;
import ax.x4.c;

public class C
extends c<t> {
    private final f c;
    private final n0.a d;

    C(f f8, n0.a a8) {
        if (f8 != null) {
            this.c = f8;
            if (a8 != null) {
                this.d = a8;
                return;
            }
            throw new NullPointerException("_builder");
        }
        throw new NullPointerException("_client");
    }

    public i<t> c() throws p0, j {
        n0 n02 = this.d.a();
        return this.c.k(n02, this.a());
    }

    public C d(q0 q02) {
        this.d.b(q02);
        return this;
    }

    public C e(s0 s02) {
        this.d.c(s02);
        return this;
    }
}

