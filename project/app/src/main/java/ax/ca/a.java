/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class a
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final int c0;
    private final InputStream q;

    public a(InputStream inputStream, int n8) {
        this.q = inputStream;
        this.c0 = n8;
    }

    @Override
    public int available() {
        return this.c0;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public void mark(int n8) {
        this.q.mark(n8);
    }

    @Override
    public boolean markSupported() {
        return this.q.markSupported();
    }

    @Override
    public int read() throws IOException {
        return this.q.read();
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.q.read(byArray);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        return this.q.read(byArray, n8, n9);
    }

    @Override
    public void reset() throws IOException {
        this.q.reset();
    }

    @Override
    public long skip(long l8) throws IOException {
        return this.q.skip(l8);
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

