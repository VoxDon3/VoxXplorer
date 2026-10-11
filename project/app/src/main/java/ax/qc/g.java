/*
 * Decompiled with CFR 0.152.
 */
package ax.qc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class g
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private long c0 = 0L;
    private byte[] d0 = new byte[1];
    private long e0;
    private InputStream q;

    public g(InputStream inputStream, long l8) {
        this.q = inputStream;
        this.e0 = l8;
    }

    private int b(byte[] byArray, int n8) throws IOException {
        int n9 = byArray.length - n8;
        int n10 = 0;
        int n11 = 0;
        int n12 = n8;
        for (n8 = n11; n12 < byArray.length && n10 != -1 && n8 < 15; ++n8) {
            int n13 = n10 + this.q.read(byArray, n12, n9);
            n10 = n9;
            n11 = n12;
            if (n13 > 0) {
                n11 = n12 + n13;
                n10 = n9 - n13;
            }
            n9 = n10;
            n10 = n13;
            n12 = n11;
        }
        return n12;
    }

    public int a(byte[] byArray) throws IOException {
        int n8 = this.q.read(byArray);
        if (n8 != -1) {
            if (n8 != byArray.length) {
                if ((n8 = this.b(byArray, n8)) == byArray.length) {
                    return n8;
                }
                throw new IOException("Cannot read fully into byte buffer");
            }
            return n8;
        }
        throw new IOException("Unexpected EOF reached when trying to read stream");
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.d0) == -1) {
            return -1;
        }
        return this.d0[0];
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        long l8 = this.e0;
        int n10 = n9;
        if (l8 != -1L) {
            long l9 = this.c0;
            if (l9 >= l8) {
                return -1;
            }
            n10 = n9;
            if ((long)n9 > l8 - l9) {
                n10 = (int)(l8 - l9);
            }
        }
        if ((n8 = this.q.read(byArray, n8, n10)) > 0) {
            this.c0 += (long)n8;
        }
        return n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

