package ax.be;

import java.io.IOException;

/* loaded from: classes3.dex */
class A extends s {
    private s c0;
    private ax.ge.f d0;
    private ax.ie.f e0;
    private ax.he.c f0;
    private final int g0;
    private boolean h0;
    private boolean i0 = true;
    private boolean j0 = true;
    private int k0 = 0;
    private boolean l0 = false;
    private IOException m0 = null;
    private final byte[] n0 = new byte[6];
    private final byte[] o0 = new byte[1];
    private final C1735c q;

    A(s sVar, z zVar, C1735c c1735c) {
        this.h0 = true;
        sVar.getClass();
        this.q = c1735c;
        this.c0 = sVar;
        this.e0 = new ax.ie.f(65536, c1735c);
        int i = zVar.i();
        ax.he.c n = ax.he.c.n(this.e0, zVar.j(), zVar.k(), zVar.o(), zVar.m(), i, a(i), zVar.n(), zVar.l(), zVar.h(), c1735c);
        this.f0 = n;
        this.d0 = n.o();
        byte[] r = zVar.r();
        if (r != null && r.length > 0) {
            this.d0.u(i, r);
            this.h0 = false;
        }
        this.g0 = (((zVar.o() * 5) + zVar.k()) * 9) + zVar.j();
    }

    private static int a(int i) {
        if (65536 > i) {
            return 65536 - i;
        }
        return 0;
    }

    private void b() throws IOException {
        int f = this.e0.f();
        int w = this.f0.w();
        if (f + 2 < w) {
            d(w, f);
        } else {
            this.f0.b();
            w = this.f0.w();
            e(w);
        }
        this.k0 -= w;
        this.f0.y();
        this.e0.l();
    }

    private void c() throws IOException {
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
        this.d0.s();
        while (this.k0 > 0) {
            try {
                this.f0.e();
                b();
            } catch (IOException e) {
                this.m0 = e;
                throw e;
            }
        }
        this.c0.write(0);
        this.l0 = true;
        this.f0.x(this.q);
        this.f0 = null;
        this.d0 = null;
        this.e0.o(this.q);
        this.e0 = null;
    }

    private void d(int i, int i2) throws IOException {
        boolean z = this.j0;
        int i3 = z ? this.h0 ? 224 : 192 : this.i0 ? 160 : 128;
        int i4 = i - 1;
        byte[] bArr = this.n0;
        bArr[0] = (byte) (i3 | (i4 >>> 16));
        bArr[1] = (byte) (i4 >>> 8);
        bArr[2] = (byte) i4;
        int i5 = i2 - 1;
        bArr[3] = (byte) (i5 >>> 8);
        bArr[4] = (byte) i5;
        if (z) {
            bArr[5] = (byte) this.g0;
            this.c0.write(bArr, 0, 6);
        } else {
            this.c0.write(bArr, 0, 5);
        }
        this.e0.p(this.c0);
        this.j0 = false;
        this.i0 = false;
        this.h0 = false;
    }

    private void e(int i) throws IOException {
        while (i > 0) {
            int min = Math.min(i, 65536);
            byte[] bArr = this.n0;
            bArr[0] = (byte) (this.h0 ? 1 : 2);
            int i2 = min - 1;
            bArr[1] = (byte) (i2 >>> 8);
            bArr[2] = (byte) i2;
            this.c0.write(bArr, 0, 3);
            this.d0.a(this.c0, i, min);
            i -= min;
            this.h0 = false;
        }
        this.i0 = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c0 != null) {
            if (!this.l0) {
                try {
                    c();
                } catch (IOException unused) {
                }
            }
            try {
                this.c0.close();
            } catch (IOException e) {
                if (this.m0 == null) {
                    this.m0 = e;
                }
            }
            this.c0 = null;
        }
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.l0) {
            throw new P("Stream finished or closed");
        }
        try {
            this.d0.t();
            while (this.k0 > 0) {
                this.f0.e();
                b();
            }
            this.c0.flush();
        } catch (IOException e) {
            this.m0 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.o0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.m0;
        if (iOException != null) {
            throw iOException;
        }
        if (this.l0) {
            throw new P("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int b = this.d0.b(bArr, i, i2);
                i += b;
                i2 -= b;
                this.k0 += b;
                if (this.f0.e()) {
                    b();
                }
            } catch (IOException e) {
                this.m0 = e;
                throw e;
            }
        }
    }
}
