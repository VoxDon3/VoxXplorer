/*
 * Decompiled with CFR 0.152.
 */
package ax.H3;

import ax.F3.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class e
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final b c0;
    private long d0;
    private long e0;
    private final InputStream q;

    public e(InputStream inputStream, b b8, long l8) {
        this.q = inputStream;
        this.c0 = b8;
        this.d0 = l8;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public int read() throws IOException {
        long l8;
        int n8 = this.q.read();
        this.e0 = l8 = this.e0 + 1L;
        this.c0.a(l8, this.d0);
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        long l8;
        n8 = this.q.read(byArray, n8, n9);
        this.e0 = l8 = this.e0 + (long)n8;
        this.c0.a(l8, this.d0);
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

