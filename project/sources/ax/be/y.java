package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class y extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private DataInputStream c0;
    private ax.ge.e d0;
    private ax.ie.c e0;
    private ax.he.b f0;
    private int g0;
    private boolean h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private IOException l0;
    private final byte[] m0;
    private final C1735c q;

    public y(InputStream inputStream, int i) {
        this(inputStream, i, null);
    }

    private void a() throws IOException {
        int readUnsignedByte = this.c0.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.k0 = true;
            e();
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.j0 = true;
            this.i0 = false;
            this.d0.k();
        } else if (this.i0) {
            throw new C1741i();
        }
        if (readUnsignedByte < 128) {
            if (readUnsignedByte > 2) {
                throw new C1741i();
            }
            this.h0 = false;
            this.g0 = this.c0.readUnsignedShort() + 1;
            return;
        }
        this.h0 = true;
        int i = (readUnsignedByte & 31) << 16;
        this.g0 = i;
        this.g0 = i + this.c0.readUnsignedShort() + 1;
        int readUnsignedShort = this.c0.readUnsignedShort() + 1;
        if (readUnsignedByte >= 192) {
            this.j0 = false;
            b();
        } else {
            if (this.j0) {
                throw new C1741i();
            }
            if (readUnsignedByte >= 160) {
                this.f0.b();
            }
        }
        this.e0.h(this.c0, readUnsignedShort);
    }

    private void b() throws IOException {
        int readUnsignedByte = this.c0.readUnsignedByte();
        if (readUnsignedByte > 224) {
            throw new C1741i();
        }
        int i = readUnsignedByte / 45;
        int i2 = readUnsignedByte - (i * 45);
        int i3 = i2 / 9;
        int i4 = i2 - (i3 * 9);
        if (i4 + i3 > 4) {
            throw new C1741i();
        }
        this.f0 = new ax.he.b(this.d0, this.e0, i4, i3, i);
    }

    private static int c(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & (-16);
        }
        throw new IllegalArgumentException("Unsupported dictionary size " + i);
    }

    public static int d(int i) {
        return (c(i) / 1024) + 104;
    }

    private void e() {
        ax.ge.e eVar = this.d0;
        if (eVar != null) {
            eVar.g(this.q);
            this.d0 = null;
            this.e0.i(this.q);
            this.e0 = null;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        DataInputStream dataInputStream = this.c0;
        if (dataInputStream == null) {
            throw new P("Stream closed");
        }
        IOException iOException = this.l0;
        if (iOException == null) {
            return this.h0 ? this.g0 : Math.min(this.g0, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c0 != null) {
            e();
            try {
                this.c0.close();
            } finally {
                this.c0 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.m0, 0, 1) == -1) {
            return -1;
        }
        return this.m0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public y(InputStream inputStream, int i, byte[] bArr) {
        this(inputStream, i, bArr, C1735c.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
    
        throw new ax.be.C1741i();
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            if (r7 < 0) goto L7f
            if (r8 < 0) goto L7f
            int r0 = r7 + r8
            if (r0 < 0) goto L7f
            int r1 = r6.length
            if (r0 > r1) goto L7f
            r0 = 0
            if (r8 != 0) goto Lf
            return r0
        Lf:
            java.io.DataInputStream r1 = r5.c0
            if (r1 == 0) goto L77
            java.io.IOException r1 = r5.l0
            if (r1 != 0) goto L76
            boolean r1 = r5.k0
            r2 = -1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            if (r8 <= 0) goto L75
            int r1 = r5.g0     // Catch: java.io.IOException -> L2d
            if (r1 != 0) goto L2f
            r5.a()     // Catch: java.io.IOException -> L2d
            boolean r1 = r5.k0     // Catch: java.io.IOException -> L2d
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L75
            return r2
        L2d:
            r6 = move-exception
            goto L72
        L2f:
            int r1 = r5.g0     // Catch: java.io.IOException -> L2d
            int r1 = java.lang.Math.min(r1, r8)     // Catch: java.io.IOException -> L2d
            boolean r3 = r5.h0     // Catch: java.io.IOException -> L2d
            if (r3 != 0) goto L41
            ax.ge.e r3 = r5.d0     // Catch: java.io.IOException -> L2d
            java.io.DataInputStream r4 = r5.c0     // Catch: java.io.IOException -> L2d
            r3.a(r4, r1)     // Catch: java.io.IOException -> L2d
            goto L4b
        L41:
            ax.ge.e r3 = r5.d0     // Catch: java.io.IOException -> L2d
            r3.l(r1)     // Catch: java.io.IOException -> L2d
            ax.he.b r1 = r5.f0     // Catch: java.io.IOException -> L2d
            r1.e()     // Catch: java.io.IOException -> L2d
        L4b:
            ax.ge.e r1 = r5.d0     // Catch: java.io.IOException -> L2d
            int r1 = r1.b(r6, r7)     // Catch: java.io.IOException -> L2d
            int r7 = r7 + r1
            int r8 = r8 - r1
            int r0 = r0 + r1
            int r3 = r5.g0     // Catch: java.io.IOException -> L2d
            int r3 = r3 - r1
            r5.g0 = r3     // Catch: java.io.IOException -> L2d
            if (r3 != 0) goto L1d
            ax.ie.c r1 = r5.e0     // Catch: java.io.IOException -> L2d
            boolean r1 = r1.g()     // Catch: java.io.IOException -> L2d
            if (r1 == 0) goto L6c
            ax.ge.e r1 = r5.d0     // Catch: java.io.IOException -> L2d
            boolean r1 = r1.e()     // Catch: java.io.IOException -> L2d
            if (r1 != 0) goto L6c
            goto L1d
        L6c:
            ax.be.i r6 = new ax.be.i     // Catch: java.io.IOException -> L2d
            r6.<init>()     // Catch: java.io.IOException -> L2d
            throw r6     // Catch: java.io.IOException -> L2d
        L72:
            r5.l0 = r6
            throw r6
        L75:
            return r0
        L76:
            throw r1
        L77:
            ax.be.P r6 = new ax.be.P
            java.lang.String r7 = "Stream closed"
            r6.<init>(r7)
            throw r6
        L7f:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.be.y.read(byte[], int, int):int");
    }

    y(InputStream inputStream, int i, byte[] bArr, C1735c c1735c) {
        this.g0 = 0;
        this.h0 = false;
        this.i0 = true;
        this.j0 = true;
        this.k0 = false;
        this.l0 = null;
        this.m0 = new byte[1];
        inputStream.getClass();
        this.q = c1735c;
        this.c0 = new DataInputStream(inputStream);
        this.e0 = new ax.ie.c(65536, c1735c);
        this.d0 = new ax.ge.e(c(i), bArr, c1735c);
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.i0 = false;
    }
}
