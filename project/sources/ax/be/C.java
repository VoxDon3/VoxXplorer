package ax.be;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class C extends s {
    private final C1735c c0;
    private ax.ge.f d0;
    private final ax.ie.g e0;
    private ax.he.c f0;
    private final int g0;
    private final boolean h0;
    private final long i0;
    private long j0;
    private boolean k0;
    private IOException l0;
    private final byte[] m0;
    private OutputStream q;

    public C(OutputStream outputStream, z zVar, boolean z) throws IOException {
        this(outputStream, zVar, z, C1735c.b());
    }

    public void a() throws IOException {
        if (this.k0) {
            return;
        }
        IOException iOException = this.l0;
        if (iOException != null) {
            throw iOException;
        }
        try {
            long j = this.i0;
            if (j != -1 && j != this.j0) {
                throw new P("Expected uncompressed size (" + this.i0 + ") doesn't equal the number of bytes written to the stream (" + this.j0 + ")");
            }
            this.d0.s();
            this.f0.d();
            if (this.h0) {
                this.f0.g();
            }
            this.e0.f();
            this.k0 = true;
            this.f0.x(this.c0);
            this.f0 = null;
            this.d0 = null;
        } catch (IOException e) {
            this.l0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q != null) {
            try {
                a();
            } catch (IOException unused) {
            }
            try {
                this.q.close();
            } catch (IOException e) {
                if (this.l0 == null) {
                    this.l0 = e;
                }
            }
            this.q = null;
        }
        IOException iOException = this.l0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw new P("LZMAOutputStream does not support flushing");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.m0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public C(OutputStream outputStream, z zVar, boolean z, C1735c c1735c) throws IOException {
        this(outputStream, zVar, false, z, -1L, c1735c);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.l0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.k0) {
            throw new P("Stream finished or closed");
        }
        long j = this.i0;
        if (j != -1 && j - this.j0 < i2) {
            throw new P("Expected uncompressed input size (" + this.i0 + " bytes) was exceeded");
        }
        this.j0 += i2;
        while (i2 > 0) {
            try {
                int b = this.d0.b(bArr, i, i2);
                i += b;
                i2 -= b;
                this.f0.d();
            } catch (IOException e) {
                this.l0 = e;
                throw e;
            }
        }
    }

    private C(OutputStream outputStream, z zVar, boolean z, boolean z2, long j, C1735c c1735c) throws IOException {
        this.j0 = 0L;
        this.k0 = false;
        this.l0 = null;
        this.m0 = new byte[1];
        outputStream.getClass();
        if (j < -1) {
            throw new IllegalArgumentException("Invalid expected input size (less than -1)");
        }
        this.h0 = z2;
        this.i0 = j;
        this.c0 = c1735c;
        this.q = outputStream;
        ax.ie.g gVar = new ax.ie.g(outputStream);
        this.e0 = gVar;
        int i = zVar.i();
        ax.he.c n = ax.he.c.n(gVar, zVar.j(), zVar.k(), zVar.o(), zVar.m(), i, 0, zVar.n(), zVar.l(), zVar.h(), c1735c);
        this.f0 = n;
        this.d0 = n.o();
        byte[] r = zVar.r();
        if (r != null && r.length > 0) {
            if (z) {
                throw new L("Preset dictionary cannot be used in .lzma files (try a raw LZMA stream instead)");
            }
            this.d0.u(i, r);
        }
        int o = (((zVar.o() * 5) + zVar.k()) * 9) + zVar.j();
        this.g0 = o;
        if (z) {
            outputStream.write(o);
            for (int i2 = 0; i2 < 4; i2++) {
                outputStream.write(i & 255);
                i >>>= 8;
            }
            for (int i3 = 0; i3 < 8; i3++) {
                outputStream.write(((int) (j >>> (i3 * 8))) & 255);
            }
        }
    }
}
