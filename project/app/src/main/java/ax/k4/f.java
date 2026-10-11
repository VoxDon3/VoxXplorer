/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class f
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private int q = Integer.MIN_VALUE;

    public f(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long l8) {
        int n8 = this.q;
        if (n8 == 0) {
            return -1L;
        }
        long l9 = l8;
        if (n8 != Integer.MIN_VALUE) {
            l9 = l8;
            if (l8 > (long)n8) {
                l9 = n8;
            }
        }
        return l9;
    }

    private void b(long l8) {
        int n8 = this.q;
        if (n8 != Integer.MIN_VALUE && l8 != -1L) {
            this.q = (int)((long)n8 - l8);
        }
    }

    @Override
    public int available() throws IOException {
        int n8 = this.q;
        if (n8 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(n8, super.available());
    }

    @Override
    public void mark(int n8) {
        super.mark(n8);
        this.q = n8;
    }

    @Override
    public int read() throws IOException {
        if (this.a(1L) == -1L) {
            return -1;
        }
        int n8 = super.read();
        this.b(1L);
        return n8;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if ((n9 = (int)this.a(n9)) == -1) {
            return -1;
        }
        n8 = super.read(byArray, n8, n9);
        this.b(n8);
        return n8;
    }

    @Override
    public void reset() throws IOException {
        super.reset();
        this.q = Integer.MIN_VALUE;
    }

    @Override
    public long skip(long l8) throws IOException {
        if ((l8 = this.a(l8)) == -1L) {
            return -1L;
        }
        l8 = super.skip(l8);
        this.b(l8);
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

