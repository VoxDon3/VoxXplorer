/*
 * Decompiled with CFR 0.152.
 */
package ax.Gc;

import ax.Gc.b;
import ax.Kc.n;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;

public class a
extends ax.Ec.a
implements o {
    private InputStream c0;
    private b d0;
    private long e0;
    private final byte[] f0 = new byte[1];

    a(b b8) {
        this.d0 = b8;
    }

    public a(InputStream inputStream) {
        this(new b(inputStream));
        this.c0 = inputStream;
    }

    private void d() {
        n.a(this.d0);
        this.d0 = null;
    }

    @Override
    public long a() {
        return this.e0;
    }

    @Override
    public int available() throws IOException {
        b b8 = this.d0;
        if (b8 != null) {
            return b8.m();
        }
        return 0;
    }

    @Override
    public void close() throws IOException {
        block3: {
            InputStream inputStream;
            try {
                this.d();
                inputStream = this.c0;
                if (inputStream == null) break block3;
            }
            catch (Throwable throwable) {
                if (this.c0 != null) {
                    this.c0.close();
                    this.c0 = null;
                }
                throw throwable;
            }
            inputStream.close();
            this.c0 = null;
        }
    }

    @Override
    public int read() throws IOException {
        int n8;
        while ((n8 = this.read(this.f0)) != -1) {
            if (n8 == 0) continue;
            if (n8 == 1) {
                return this.f0[0] & 0xFF;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid return value from read: ");
            stringBuilder.append(n8);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        b b8 = this.d0;
        if (b8 != null) {
            try {
                n8 = b8.p(byArray, n8, n9);
            }
            catch (RuntimeException runtimeException) {
                throw new IOException("Invalid Deflate64 input", runtimeException);
            }
            this.e0 = this.d0.q();
            this.b(n8);
            if (n8 == -1) {
                this.d();
            }
            return n8;
        }
        return -1;
    }
}

