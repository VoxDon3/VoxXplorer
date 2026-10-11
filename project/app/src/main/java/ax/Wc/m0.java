/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.J0;
import ax.Wc.U0;
import ax.Wc.g;
import ax.Wc.j;
import ax.Wc.z;
import java.io.IOException;

public class m0
implements g,
U0 {
    private F q;

    public m0(F f8) {
        this.q = f8;
    }

    static J0 a(F object) throws IOException {
        try {
            object = new J0(((F)object).h());
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new j(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    @Override
    public A g() {
        try {
            A a8 = this.l();
            return a8;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new z("unable to get DER object", illegalArgumentException);
        }
        catch (IOException iOException) {
            throw new z("unable to get DER object", iOException);
        }
    }

    @Override
    public A l() throws IOException {
        return m0.a(this.q);
    }
}

