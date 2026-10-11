/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Pd.a;
import ax.Wc.A;
import ax.Wc.F;
import ax.Wc.V;
import ax.Wc.d;
import ax.Wc.g0;
import ax.Wc.z;
import java.io.IOException;
import java.io.InputStream;

public class W
implements d {
    private g0 c0;
    private F q;

    W(F f8) {
        this.q = f8;
    }

    static V a(F object) throws IOException {
        object = new g0((F)object, false);
        return new V(a.c((InputStream)object), ((g0)object).b());
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
    public InputStream i() throws IOException {
        g0 g02;
        this.c0 = g02 = new g0(this.q, false);
        return g02;
    }

    @Override
    public int k() {
        return this.c0.b();
    }

    @Override
    public A l() throws IOException {
        return W.a(this.q);
    }
}

