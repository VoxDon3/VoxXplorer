/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.f;
import ax.N9.D0;
import ax.N9.b0;
import ax.N9.b1;
import ax.N9.v;
import ax.O9.H;
import ax.S9.c;
import java.util.List;

public class q
extends ax.P9.c
implements H {
    public q(String string, f f8, List<c> list) {
        super(string, f8, list);
    }

    @Override
    public D0 a() {
        return this.q(this.o());
    }

    @Override
    public b0 l() {
        return new v(this.p("drive"), this.i(), null);
    }

    public D0 q(List<c> list) {
        return new b1(this.d(), this.i(), list);
    }
}

