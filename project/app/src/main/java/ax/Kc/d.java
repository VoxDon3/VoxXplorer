/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class d
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private long c0;
    private final InputStream q;

    public d(InputStream inputStream, long l8) {
        this.q = inputStream;
        this.c0 = l8;
    }

    public long a() {
        return this.c0;
    }

    @Override
    public void close() {
    }

    @Override
    public int read() throws IOException {
        long l8 = this.c0;
        if (l8 > 0L) {
            this.c0 = l8 - 1L;
            return this.q.read();
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        long l8 = this.c0;
        if (l8 == 0L) {
            return -1;
        }
        int n10 = n9;
        if ((long)n9 > l8) {
            n10 = (int)l8;
        }
        if ((n8 = this.q.read(byArray, n8, n10)) >= 0) {
            this.c0 -= (long)n8;
        }
        return n8;
    }

    @Override
    public long skip(long l8) throws IOException {
        l8 = Math.min(this.c0, l8);
        l8 = this.q.skip(l8);
        this.c0 -= l8;
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

