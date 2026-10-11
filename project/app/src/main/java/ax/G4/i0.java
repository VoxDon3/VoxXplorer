/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.b0;
import ax.G4.f;
import ax.G4.f0;
import ax.G4.h0;
import ax.G4.j0;
import ax.p4.j;

public class i0 {
    private final f a;
    private final h0.a b;

    i0(f f8, h0.a a8) {
        if (f8 != null) {
            this.a = f8;
            if (a8 != null) {
                this.b = a8;
                return;
            }
            throw new NullPointerException("_builder");
        }
        throw new NullPointerException("_client");
    }

    public j0 a() throws b0, j {
        h0 h02 = this.b.a();
        return this.a.s(h02);
    }

    public i0 b(f0 f02) {
        this.b.b(f02);
        return this;
    }
}

