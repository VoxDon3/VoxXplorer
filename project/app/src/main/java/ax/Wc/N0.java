/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.K0;
import ax.Wc.U0;
import ax.Wc.g;
import java.io.IOException;

public class N0
implements g,
U0 {
    private F q;

    N0(F f8) {
        this.q = f8;
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
        return K0.a(this.q.h());
    }
}

