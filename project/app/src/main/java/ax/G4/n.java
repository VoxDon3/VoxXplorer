/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.f;
import ax.G4.m;
import ax.G4.p;
import ax.G4.t;
import ax.p4.i;
import ax.p4.j;
import ax.x4.c;

public class n
extends c<t> {
    private final f c;
    private final String d;
    private String e;

    n(f f8, String string) {
        if (f8 != null) {
            this.c = f8;
            this.d = string;
            this.e = null;
            return;
        }
        throw new NullPointerException("_client");
    }

    public i<t> c() throws p, j {
        m m8 = new m(this.d, this.e);
        return this.c.g(m8, this.a());
    }
}

