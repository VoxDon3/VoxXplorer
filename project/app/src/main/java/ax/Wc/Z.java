/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Pd.a;
import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.Y;
import ax.Wc.h0;
import ax.Wc.x;
import ax.Wc.z;
import java.io.IOException;
import java.io.InputStream;

public class Z
implements x {
    private F q;

    Z(F f8) {
        this.q = f8;
    }

    static Y a(F f8) throws IOException {
        return new Y(a.c(new h0(f8)));
    }

    @Override
    public InputStream e() {
        return new h0(this.q);
    }

    @Override
    public A g() {
        try {
            A a8 = this.l();
            return a8;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IOException converting stream to byte array: ");
            stringBuilder.append(iOException.getMessage());
            throw new z(stringBuilder.toString(), iOException);
        }
    }

    @Override
    public A l() throws IOException {
        return Z.a(this.q);
    }
}

