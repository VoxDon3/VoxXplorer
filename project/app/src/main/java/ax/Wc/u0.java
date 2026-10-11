/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.T0;
import ax.Wc.t0;
import ax.Wc.x;
import ax.Wc.z;
import java.io.IOException;
import java.io.InputStream;

public class u0
implements x {
    private T0 q;

    u0(T0 t02) {
        this.q = t02;
    }

    @Override
    public InputStream e() {
        return this.q;
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
        return new t0(this.q.e());
    }
}

