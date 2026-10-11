/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.O0;
import ax.G4.T0;
import ax.G4.f;
import ax.G4.t;
import ax.G4.t0;
import ax.G4.v0;
import ax.G4.w0;
import ax.p4.j;
import ax.x4.e;
import java.util.Date;

public class u0
extends e<t, v0, w0> {
    private final f a;
    private final t0.a b;

    u0(f f8, t0.a a8) {
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

    public O0 d() throws w0, j {
        t0 t02 = this.b.e();
        return this.a.u(t02);
    }

    public u0 e(Boolean bl) {
        this.b.f(bl);
        return this;
    }

    public u0 f(Date date) {
        this.b.g(date);
        return this;
    }

    public u0 g(T0 t02) {
        this.b.h(t02);
        return this;
    }
}

