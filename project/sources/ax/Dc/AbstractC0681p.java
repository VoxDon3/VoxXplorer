package ax.Dc;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: ax.Dc.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0681p implements Closeable, AutoCloseable {
    private long d0;
    private long e0;
    private long f0;
    private final Deflater q;
    private final CRC32 c0 = new CRC32();
    private final byte[] g0 = new byte[4096];
    private final byte[] h0 = new byte[4096];

    /* renamed from: ax.Dc.p$a */
    private static final class a extends AbstractC0681p {
        private final OutputStream i0;

        public a(Deflater deflater, OutputStream outputStream) {
            super(deflater);
            this.i0 = outputStream;
        }

        @Override // ax.Dc.AbstractC0681p
        protected void u(byte[] bArr, int i, int i2) throws IOException {
            this.i0.write(bArr, i, i2);
        }
    }

    AbstractC0681p(Deflater deflater) {
        this.q = deflater;
    }

    static AbstractC0681p a(OutputStream outputStream, Deflater deflater) {
        return new a(deflater, outputStream);
    }

    private void c() throws IOException {
        while (!this.q.needsInput()) {
            b();
        }
    }

    private void q(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0 || this.q.finished()) {
            return;
        }
        if (i2 <= 8192) {
            this.q.setInput(bArr, i, i2);
            c();
            return;
        }
        int i3 = i2 / 8192;
        for (int i4 = 0; i4 < i3; i4++) {
            this.q.setInput(bArr, (i4 * 8192) + i, 8192);
            c();
        }
        int i5 = i3 * 8192;
        if (i5 < i2) {
            this.q.setInput(bArr, i + i5, i2 - i5);
            c();
        }
    }

    void b() throws IOException {
        Deflater deflater = this.q;
        byte[] bArr = this.g0;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            p(this.g0, 0, deflate);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.end();
    }

    void d() throws IOException {
        this.q.finish();
        while (!this.q.finished()) {
            b();
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

    long m(byte[] bArr, int i, int i2, int i3) throws IOException {
        long j = this.d0;
        this.c0.update(bArr, i, i2);
        if (i3 == 8) {
            q(bArr, i, i2);
        } else {
            p(bArr, i, i2);
        }
        this.e0 += i2;
        return this.d0 - j;
    }

    public void o(byte[] bArr) throws IOException {
        p(bArr, 0, bArr.length);
    }

    public void p(byte[] bArr, int i, int i2) throws IOException {
        u(bArr, i, i2);
        long j = i2;
        this.d0 += j;
        this.f0 += j;
    }

    protected abstract void u(byte[] bArr, int i, int i2) throws IOException;
}
