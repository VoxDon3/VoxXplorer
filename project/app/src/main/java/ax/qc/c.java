/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import ax.qc.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

abstract class c
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    protected byte[] c0 = new byte[1];
    private b<?> q;

    public c(b<?> b8) {
        this.q = b8;
    }

    public void a(InputStream inputStream, int n8) throws IOException {
        this.q.b(inputStream, n8);
    }

    protected byte[] b() {
        return this.q.d();
    }

    public int c(PushbackInputStream pushbackInputStream) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.c0) == -1) {
            return -1;
        }
        return this.c0[0];
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        return this.q.read(byArray, n8, n9);
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

