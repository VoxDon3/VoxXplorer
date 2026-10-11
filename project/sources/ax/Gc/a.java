package ax.Gc;

import ax.Kc.n;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class a extends ax.Ec.a implements o {
    private InputStream c0;
    private b d0;
    private long e0;
    private final byte[] f0;

    public a(InputStream inputStream) {
        this(new b(inputStream));
        this.c0 = inputStream;
    }

    private void d() {
        n.a(this.d0);
        this.d0 = null;
    }

    @Override // ax.Kc.o
    public long a() {
        return this.e0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        b bVar = this.d0;
        if (bVar != null) {
            return bVar.m();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            d();
            InputStream inputStream = this.c0;
            if (inputStream != null) {
                inputStream.close();
                this.c0 = null;
            }
        } catch (Throwable th) {
            if (this.c0 != null) {
                this.c0.close();
                this.c0 = null;
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read;
        do {
            read = read(this.f0);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return this.f0[0] & 255;
        }
        throw new IllegalStateException("Invalid return value from read: " + read);
    }

    a(b bVar) {
        this.f0 = new byte[1];
        this.d0 = bVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        b bVar = this.d0;
        if (bVar == null) {
            return -1;
        }
        try {
            int p = bVar.p(bArr, i, i2);
            this.e0 = this.d0.q();
            b(p);
            if (p == -1) {
                d();
            }
            return p;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
        }
    }
}
