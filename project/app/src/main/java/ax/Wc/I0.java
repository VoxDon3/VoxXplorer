/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.T0;
import ax.Wc.c;
import ax.Wc.d;
import ax.Wc.z;
import java.io.IOException;
import java.io.InputStream;

public class I0
implements d {
    private int c0 = 0;
    private final T0 q;

    I0(T0 t02) {
        this.q = t02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private InputStream a(boolean bl) throws IOException {
        int n8;
        int n9 = this.q.c();
        if (n9 < 1) throw new IllegalStateException("content octets cannot be empty");
        this.c0 = n8 = this.q.read();
        if (n8 <= 0) return this.q;
        if (n9 < 2) throw new IllegalStateException("zero length data with non-zero pad bits");
        if (n8 > 7) throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
        if (!bl) return this.q;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected octet-aligned bitstring, but found padBits: ");
        stringBuilder.append(this.c0);
        throw new IOException(stringBuilder.toString());
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
        return this.a(false);
    }

    @Override
    public int k() {
        return this.c0;
    }

    @Override
    public A l() throws IOException {
        return c.C(this.q.e());
    }
}

