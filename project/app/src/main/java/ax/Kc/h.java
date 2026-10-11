/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;

public class h
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private long c0;
    private final long d0;
    private final Checksum e0;
    private final InputStream q;

    public h(Checksum checksum, InputStream inputStream, long l8, long l9) {
        this.e0 = checksum;
        this.q = inputStream;
        this.d0 = l9;
        this.c0 = l8;
    }

    public long a() {
        return this.c0;
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public int read() throws IOException {
        if (this.c0 <= 0L) {
            return -1;
        }
        int n8 = this.q.read();
        if (n8 >= 0) {
            this.e0.update(n8);
            --this.c0;
        }
        if (this.c0 == 0L && this.d0 != this.e0.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        if ((n9 = this.q.read(byArray, n8, n9)) >= 0) {
            this.e0.update(byArray, n8, n9);
            this.c0 -= (long)n9;
        }
        if (this.c0 <= 0L && this.d0 != this.e0.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n9;
    }

    @Override
    public long skip(long l8) throws IOException {
        if (this.read() >= 0) {
            return 1L;
        }
        return 0L;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

