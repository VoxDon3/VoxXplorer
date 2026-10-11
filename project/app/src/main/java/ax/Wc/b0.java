/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.U0;
import ax.Wc.a0;
import ax.Wc.g;
import java.io.IOException;

public class b0
implements g,
U0 {
    private F q;

    b0(F f8) {
        this.q = f8;
    }

    static a0 a(F f8) throws IOException {
        return new a0(f8.h());
    }

    @Override
    public A g() {
        try {
            A a8 = this.l();
            return a8;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException.getMessage());
        }
    }

    @Override
    public A l() throws IOException {
        return b0.a(this.q);
    }
}

