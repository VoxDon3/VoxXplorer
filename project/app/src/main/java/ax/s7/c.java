/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private long c0 = -1L;
    private long q;

    public c(InputStream inputStream) {
        super(n.n(inputStream));
    }

    public long a() {
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mark(int n8) {
        synchronized (this) {
            this.in.mark(n8);
            this.c0 = this.q;
            return;
        }
    }

    @Override
    public int read() throws IOException {
        int n8 = this.in.read();
        if (n8 != -1) {
            ++this.q;
        }
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if ((n8 = this.in.read(byArray, n8, n9)) != -1) {
            this.q += (long)n8;
        }
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (!this.in.markSupported()) {
                        IOException iOException = new IOException("Mark not supported");
                        throw iOException;
                    }
                    if (this.c0 != -1L) {
                        this.in.reset();
                        this.q = this.c0;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                IOException iOException = new IOException("Mark not set");
                throw iOException;
            }
            throw throwable2;
        }
    }

    @Override
    public long skip(long l8) throws IOException {
        l8 = this.in.skip(l8);
        this.q += l8;
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

