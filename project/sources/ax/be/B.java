package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class B extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private C1735c c0;
    private ax.ge.e d0;
    private ax.ie.d e0;
    private ax.he.b f0;
    private long j0;
    private InputStream q;
    private boolean g0 = false;
    private boolean h0 = false;
    private final byte[] i0 = new byte[1];
    private IOException k0 = null;

    public B(InputStream inputStream, long j, byte b, int i) throws IOException {
        d(inputStream, j, b, i, null, C1735c.b());
    }

    private static int a(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    public static int b(int i, byte b) throws L, C1741i {
        if (i < 0 || i > 2147483632) {
            throw new L("LZMA dictionary is too big for this implementation");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C1741i("Invalid LZMA properties byte");
        }
        int i3 = i2 % 45;
        int i4 = i3 / 9;
        return c(i, i3 - (i4 * 9), i4);
    }

    public static int c(int i, int i2, int i3) {
        if (i2 < 0 || i2 > 8 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException("Invalid lc or lp");
        }
        return (a(i) / 1024) + 10 + ((1536 << (i2 + i3)) / 1024);
    }

    private void d(InputStream inputStream, long j, byte b, int i, byte[] bArr, C1735c c1735c) throws IOException {
        if (j < -1) {
            throw new L("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new C1741i("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new L("LZMA dictionary is too big for this implementation");
        }
        e(inputStream, j, i6, i5, i3, i, bArr, c1735c);
    }

    private void e(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr, C1735c c1735c) throws IOException {
        if (j < -1 || i < 0 || i > 8 || i2 < 0 || i2 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.q = inputStream;
        this.c0 = c1735c;
        int a = a(i4);
        if (j >= 0 && a > j) {
            a = a((int) j);
        }
        this.d0 = new ax.ge.e(a(a), bArr, c1735c);
        ax.ie.d dVar = new ax.ie.d(inputStream);
        this.e0 = dVar;
        this.f0 = new ax.he.b(this.d0, dVar, i, i2, i3);
        this.j0 = j;
    }

    private void f() {
        ax.ge.e eVar = this.d0;
        if (eVar != null) {
            eVar.g(this.c0);
            this.d0 = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q != null) {
            f();
            try {
                this.q.close();
            } finally {
                this.q = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.q == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.k0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.g0) {
            return -1;
        }
        while (i2 > 0) {
            try {
                long j = this.j0;
                this.d0.l((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                try {
                    this.f0.e();
                } catch (C1741i e) {
                    if (this.j0 != -1 || !this.f0.h()) {
                        throw e;
                    }
                    this.g0 = true;
                    this.e0.f();
                }
                int b = this.d0.b(bArr, i);
                i += b;
                i2 -= b;
                i4 += b;
                long j2 = this.j0;
                if (j2 >= 0) {
                    long j3 = j2 - b;
                    this.j0 = j3;
                    if (j3 == 0) {
                        this.g0 = true;
                    }
                }
                if (this.g0) {
                    if (this.d0.e() || !(this.h0 || this.e0.g())) {
                        throw new C1741i();
                    }
                    f();
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
            } catch (IOException e2) {
                this.k0 = e2;
                throw e2;
            }
        }
        return i4;
    }
}
