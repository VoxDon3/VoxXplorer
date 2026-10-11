/*
 * Decompiled with CFR 0.152.
 */
package ax.Pd;

import java.io.IOException;
import java.io.OutputStream;

public class b
extends OutputStream
implements AutoCloseable {
    private OutputStream c0;
    private OutputStream q;

    public b(OutputStream outputStream, OutputStream outputStream2) {
        this.q = outputStream;
        this.c0 = outputStream2;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
        this.c0.close();
    }

    @Override
    public void flush() throws IOException {
        this.q.flush();
        this.c0.flush();
    }

    @Override
    public void write(int n8) throws IOException {
        this.q.write(n8);
        this.c0.write(n8);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.q.write(byArray);
        this.c0.write(byArray);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.q.write(byArray, n8, n9);
        this.c0.write(byArray, n8, n9);
    }
}

