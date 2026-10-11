/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import ax.w4.c;
import java.io.IOException;
import java.io.OutputStream;

public class e
extends OutputStream
implements AutoCloseable {
    private OutputStream c0;
    private long q;

    public e(OutputStream outputStream) {
        this.c0 = outputStream;
        this.q = 0L;
    }

    private void b(int n8) {
        this.q += (long)n8;
    }

    public void a(c.d d8) {
    }

    @Override
    public void close() throws IOException {
        this.c0.close();
    }

    @Override
    public void flush() throws IOException {
        this.c0.flush();
    }

    @Override
    public void write(int n8) throws IOException {
        this.c0.write(n8);
        this.b(1);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.c0.write(byArray);
        this.b(byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.c0.write(byArray, n8, n9);
        this.b(n9);
    }
}

