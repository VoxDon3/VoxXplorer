/*
 * Decompiled with CFR 0.152.
 */
package ax.H3;

import ax.F3.b;
import java.io.IOException;
import java.io.OutputStream;

public class f
extends OutputStream
implements AutoCloseable {
    private final b c0;
    private long d0;
    private long e0;
    private final OutputStream q;

    public f(OutputStream outputStream, b b8, long l8) {
        this.q = outputStream;
        this.c0 = b8;
        this.d0 = l8;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
        super.close();
    }

    @Override
    public void flush() throws IOException {
        this.q.flush();
        super.flush();
    }

    @Override
    public void write(int n8) throws IOException {
        long l8;
        this.q.write(n8);
        this.e0 = l8 = this.e0 + 1L;
        this.c0.a(l8, this.d0);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        long l8;
        this.q.write(byArray);
        this.e0 = l8 = this.e0 + (long)byArray.length;
        this.c0.a(l8, this.d0);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.q.write(byArray, n8, n9);
        this.e0 = n9 < byArray.length ? (this.e0 += (long)n9) : (this.e0 += (long)byArray.length);
        this.c0.a(this.e0, this.d0);
    }
}

