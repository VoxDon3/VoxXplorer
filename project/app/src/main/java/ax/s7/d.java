/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class d
extends FilterOutputStream
implements AutoCloseable {
    private long q;

    public d(OutputStream outputStream) {
        super(n.n(outputStream));
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    @Override
    public void write(int n8) throws IOException {
        this.out.write(n8);
        ++this.q;
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
        this.q += (long)n9;
    }
}

