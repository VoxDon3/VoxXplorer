/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.s;
import java.io.IOException;
import java.io.OutputStream;

public class t
extends s {
    protected OutputStream q;

    public t(OutputStream outputStream) {
        this.q = outputStream;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public void flush() throws IOException {
        this.q.flush();
    }

    @Override
    public void write(int n8) throws IOException {
        this.q.write(n8);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.q.write(byArray);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.q.write(byArray, n8, n9);
    }
}

