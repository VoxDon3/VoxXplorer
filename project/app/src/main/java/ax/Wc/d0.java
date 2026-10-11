/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.U0;
import ax.Wc.c0;
import ax.Wc.g;
import ax.Wc.z;
import java.io.IOException;

public class d0
implements g,
U0 {
    private F q;

    d0(F f8) {
        this.q = f8;
    }

    static c0 a(F f8) throws IOException {
        return new c0(f8.h());
    }

    @Override
    public A g() {
        try {
            A a8 = this.l();
            return a8;
        }
        catch (IOException iOException) {
            throw new z(iOException.getMessage(), iOException);
        }
    }

    @Override
    public A l() throws IOException {
        return d0.a(this.q);
    }
}

