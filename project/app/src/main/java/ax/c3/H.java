/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class H
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    InputStream q;

    public H(InputStream inputStream) {
        if (inputStream != null) {
            this.q = inputStream;
            return;
        }
        throw new IllegalArgumentException("InputStream is null");
    }

    protected void a(InputStream inputStream) {
        this.q = inputStream;
    }

    @Override
    public int available() throws IOException {
        try {
            int n8 = this.q.available();
            return n8;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            this.q.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
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
        try {
            int n8 = this.q.read();
            return n8;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        try {
            int n8 = this.q.read(byArray);
            return n8;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        try {
            n8 = this.q.read(byArray, n8, n9);
            return n8;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            try {
                try {
                    this.q.reset();
                    return;
                }
                catch (RuntimeException runtimeException) {
                    IOException iOException = new IOException(runtimeException);
                    throw iOException;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        try {
            l8 = this.q.skip(l8);
            return l8;
        }
        catch (RuntimeException runtimeException) {
            throw new IOException(runtimeException);
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

