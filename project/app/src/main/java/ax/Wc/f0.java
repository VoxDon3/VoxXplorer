/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.U0;
import ax.Wc.g;
import ax.Wc.z;
import java.io.IOException;

public class f0
implements g,
U0 {
    final int c0;
    final F d0;
    final int q;

    f0(int n8, int n9, F f8) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = f8;
    }

    @Override
    public A g() {
        try {
            A a8 = this.l();
            return a8;
        }
        catch (IOException iOException) {
            throw new z(iOException.getMessage());
        }
    }

    @Override
    public A l() throws IOException {
        return this.d0.c(this.q, this.c0);
    }
}

