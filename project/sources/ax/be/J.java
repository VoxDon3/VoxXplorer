package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class J extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final C1735c c0;
    private final int d0;
    private final ax.de.b e0;
    private final ax.ce.c f0;
    private final boolean g0;
    private C1739g h0;
    private final ax.fe.b i0;
    private boolean j0;
    private IOException k0;
    private final byte[] l0;
    private InputStream q;

    public J(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, true);
    }

    private static byte[] b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        return bArr;
    }

    private void c() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.q).readFully(bArr);
        ax.de.b d = ax.de.a.d(bArr);
        if (!ax.de.a.b(this.e0, d) || this.i0.c() != d.b) {
            throw new C1741i("XZ Stream Footer does not match Stream Header");
        }
    }

    public void a(boolean z) throws IOException {
        if (this.q != null) {
            C1739g c1739g = this.h0;
            if (c1739g != null) {
                c1739g.close();
                this.h0 = null;
            }
            if (z) {
                try {
                    this.q.close();
                } finally {
                    this.q = null;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.q == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.k0;
        if (iOException != null) {
            throw iOException;
        }
        C1739g c1739g = this.h0;
        if (c1739g == null) {
            return 0;
        }
        return c1739g.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.l0, 0, 1) == -1) {
            return -1;
        }
        return this.l0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public J(InputStream inputStream, int i, boolean z) throws IOException {
        this(inputStream, i, z, C1735c.b());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
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
        if (this.j0) {
            return -1;
        }
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        while (i5 > 0) {
            try {
                if (this.h0 == null) {
                    try {
                        this.h0 = new C1739g(this.q, this.f0, this.g0, this.d0, -1L, -1L, this.c0);
                    } catch (v unused) {
                        this.i0.f(this.q);
                        c();
                        this.j0 = true;
                        if (i6 > 0) {
                            return i6;
                        }
                        return -1;
                    }
                }
                int read = this.h0.read(bArr, i4, i5);
                if (read > 0) {
                    i6 += read;
                    i4 += read;
                    i5 -= read;
                } else if (read == -1) {
                    this.i0.a(this.h0.b(), this.h0.a());
                    this.h0 = null;
                }
            } catch (IOException e) {
                this.k0 = e;
                if (i6 == 0) {
                    throw e;
                }
            }
        }
        return i6;
    }

    public J(InputStream inputStream, int i, boolean z, C1735c c1735c) throws IOException {
        this(inputStream, i, z, b(inputStream), c1735c);
    }

    J(InputStream inputStream, int i, boolean z, byte[] bArr, C1735c c1735c) throws IOException {
        this.h0 = null;
        this.i0 = new ax.fe.b();
        this.j0 = false;
        this.k0 = null;
        this.l0 = new byte[1];
        this.c0 = c1735c;
        this.q = inputStream;
        this.d0 = i;
        this.g0 = z;
        ax.de.b e = ax.de.a.e(bArr);
        this.e0 = e;
        this.f0 = ax.ce.c.b(e.a);
    }
}
