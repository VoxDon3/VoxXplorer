/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public abstract class p
implements Closeable,
AutoCloseable {
    private final CRC32 c0 = new CRC32();
    private long d0;
    private long e0;
    private long f0;
    private final byte[] g0 = new byte[4096];
    private final byte[] h0 = new byte[4096];
    private final Deflater q;

    p(Deflater deflater) {
        this.q = deflater;
    }

    static p a(OutputStream outputStream, Deflater deflater) {
        return new a(deflater, outputStream);
    }

    private void c() throws IOException {
        while (!this.q.needsInput()) {
            this.b();
        }
    }

    private void q(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 > 0 && !this.q.finished()) {
            int n10;
            if (n9 <= 8192) {
                this.q.setInput(byArray, n8, n9);
                this.c();
                return;
            }
            int n11 = n9 / 8192;
            for (n10 = 0; n10 < n11; ++n10) {
                this.q.setInput(byArray, n10 * 8192 + n8, 8192);
                this.c();
            }
            n10 = n11 * 8192;
            if (n10 < n9) {
                this.q.setInput(byArray, n8 + n10, n9 - n10);
                this.c();
            }
        }
    }

    void b() throws IOException {
        Deflater deflater = this.q;
        byte[] byArray = this.g0;
        int n8 = deflater.deflate(byArray, 0, byArray.length);
        if (n8 > 0) {
            this.p(this.g0, 0, n8);
        }
    }

    @Override
    public void close() throws IOException {
        this.q.end();
    }

    void d() throws IOException {
        this.q.finish();
        while (!this.q.finished()) {
            this.b();
        }
    }

    public long e() {
        return this.e0;
    }

    public long f() {
        return this.c0.getValue();
    }

    public long g() {
        return this.f0;
    }

    void j() {
        this.c0.reset();
        this.q.reset();
        this.e0 = 0L;
        this.d0 = 0L;
    }

    long m(byte[] byArray, int n8, int n9, int n10) throws IOException {
        long l8 = this.d0;
        this.c0.update(byArray, n8, n9);
        if (n10 == 8) {
            this.q(byArray, n8, n9);
        } else {
            this.p(byArray, n8, n9);
        }
        this.e0 += (long)n9;
        return this.d0 - l8;
    }

    public void o(byte[] byArray) throws IOException {
        this.p(byArray, 0, byArray.length);
    }

    public void p(byte[] byArray, int n8, int n9) throws IOException {
        this.u(byArray, n8, n9);
        long l8 = this.d0;
        long l9 = n9;
        this.d0 = l8 + l9;
        this.f0 += l9;
    }

    protected abstract void u(byte[] var1, int var2, int var3) throws IOException;

    private static final class a
    extends p {
        private final OutputStream i0;

        public a(Deflater deflater, OutputStream outputStream) {
            super(deflater);
            this.i0 = outputStream;
        }

        @Override
        protected void u(byte[] byArray, int n8, int n9) throws IOException {
            this.i0.write(byArray, n8, n9);
        }
    }
}

