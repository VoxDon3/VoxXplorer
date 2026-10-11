/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.K0;
import ax.Wc.U0;
import ax.Wc.g;
import ax.Wc.z;
import java.io.IOException;

public class P0
implements g,
U0 {
    private F q;

    P0(F f8) {
        this.q = f8;
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
        return K0.b(this.q.h());
    }
}

