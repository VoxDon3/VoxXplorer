/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.f;
import ax.N9.U;
import ax.N9.a0;
import ax.N9.p;
import ax.N9.u;
import ax.O9.E;
import ax.S9.c;
import java.util.List;

public class n
extends ax.P9.c
implements E {
    public n(String string, f f8, List<c> list) {
        super(string, f8, list);
    }

    @Override
    public a0 a() {
        return this.q(this.o());
    }

    @Override
    public U g() {
        return new p(this.p("root"), this.i(), null);
    }

    @Override
    public U n(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.p("items"));
        stringBuilder.append("/");
        stringBuilder.append(string);
        return new p(stringBuilder.toString(), this.i(), null);
    }

    public a0 q(List<c> list) {
        return new u(this.d(), this.i(), list);
    }
}

