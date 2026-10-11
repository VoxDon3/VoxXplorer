package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: ax.be.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1739g extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final C1742j c0;
    private InputStream d0;
    private final ax.ce.c e0;
    private final boolean f0;
    private long g0;
    private long h0;
    private long i0;
    private final int j0;
    private long k0 = 0;
    private boolean l0 = false;
    private final byte[] m0 = new byte[1];
    private final DataInputStream q;

    public C1739g(InputStream inputStream, ax.ce.c cVar, boolean z, int i, long j, long j2, C1735c c1735c) throws IOException, v {
        long[] jArr;
        this.g0 = -1L;
        this.h0 = -1L;
        this.e0 = cVar;
        this.f0 = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.q = dataInputStream;
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte == 0) {
            throw new v();
        }
        int i2 = (readUnsignedByte + 1) * 4;
        this.j0 = i2;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) readUnsignedByte;
        dataInputStream.readFully(bArr, 1, i2 - 1);
        if (!ax.de.a.g(bArr, 0, i2 - 4, i2 - 4)) {
            throw new C1741i("XZ Block Header is corrupt");
        }
        int i3 = bArr[1];
        if ((i3 & 60) != 0) {
            throw new L("Unsupported options in XZ Block Header");
        }
        int i4 = i3 & 3;
        int i5 = i4 + 1;
        long[] jArr2 = new long[i5];
        byte[][] bArr2 = new byte[i5][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
        try {
            this.i0 = (9223372036854775804L - i2) - cVar.d();
            if ((bArr[1] & 64) != 0) {
                long f = ax.de.a.f(byteArrayInputStream);
                this.h0 = f;
                if (f != 0) {
                    jArr = jArr2;
                    if (f <= this.i0) {
                        this.i0 = f;
                    }
                }
                throw new C1741i();
            }
            jArr = jArr2;
            if ((bArr[1] & 128) != 0) {
                this.g0 = ax.de.a.f(byteArrayInputStream);
            }
            int i6 = 0;
            while (i6 < i5) {
                jArr[i6] = ax.de.a.f(byteArrayInputStream);
                long f2 = ax.de.a.f(byteArrayInputStream);
                int i7 = i6;
                if (f2 > byteArrayInputStream.available()) {
                    throw new C1741i();
                }
                byte[] bArr3 = new byte[(int) f2];
                bArr2[i7] = bArr3;
                byteArrayInputStream.read(bArr3);
                i6 = i7 + 1;
            }
            for (int available = byteArrayInputStream.available(); available > 0; available--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new L("Unsupported options in XZ Block Header");
                }
            }
            if (j != -1) {
                long d = this.j0 + cVar.d();
                if (d >= j) {
                    throw new C1741i("XZ Index does not match a Block Header");
                }
                long j3 = j - d;
                if (j3 <= this.i0) {
                    long j4 = this.h0;
                    if (j4 == -1 || j4 == j3) {
                        long j5 = this.g0;
                        if (j5 != -1 && j5 != j2) {
                            throw new C1741i("XZ Index does not match a Block Header");
                        }
                        this.i0 = j3;
                        this.h0 = j3;
                        this.g0 = j2;
                    }
                }
                throw new C1741i("XZ Index does not match a Block Header");
            }
            InterfaceC1749q[] interfaceC1749qArr = new InterfaceC1749q[i5];
            for (int i8 = 0; i8 < i5; i8++) {
                long j6 = jArr[i8];
                if (j6 == 33) {
                    interfaceC1749qArr[i8] = new x(bArr2[i8]);
                } else if (j6 == 3) {
                    interfaceC1749qArr[i8] = new C1744l(bArr2[i8]);
                } else {
                    if (!AbstractC1736d.f(j6)) {
                        throw new L("Unknown Filter ID " + jArr[i8]);
                    }
                    interfaceC1749qArr[i8] = new C1737e(jArr[i8], bArr2[i8]);
                }
            }
            F.a(interfaceC1749qArr);
            if (i >= 0) {
                int i9 = 0;
                for (int i10 = 0; i10 < i5; i10++) {
                    i9 += interfaceC1749qArr[i10].d();
                }
                if (i9 > i) {
                    throw new D(i9, i);
                }
            }
            C1742j c1742j = new C1742j(inputStream);
            this.c0 = c1742j;
            this.d0 = c1742j;
            for (int i11 = i4; i11 >= 0; i11--) {
                this.d0 = interfaceC1749qArr[i11].b(this.d0, c1735c);
            }
        } catch (IOException unused) {
            throw new C1741i("XZ Block Header is corrupt");
        }
    }

    private void c() throws IOException {
        long a = this.c0.a();
        long j = this.h0;
        if (j == -1 || j == a) {
            long j2 = this.g0;
            if (j2 == -1 || j2 == this.k0) {
                while (true) {
                    long j3 = 1 + a;
                    if ((a & 3) == 0) {
                        byte[] bArr = new byte[this.e0.d()];
                        this.q.readFully(bArr);
                        if (!this.f0 || Arrays.equals(this.e0.a(), bArr)) {
                            return;
                        }
                        throw new C1741i("Integrity check (" + this.e0.c() + ") does not match");
                    }
                    if (this.q.readUnsignedByte() != 0) {
                        throw new C1741i();
                    }
                    a = j3;
                }
            }
        }
        throw new C1741i();
    }

    public long a() {
        return this.k0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.d0.available();
    }

    public long b() {
        return this.j0 + this.c0.a() + this.e0.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.d0.close();
        } catch (IOException unused) {
        }
        this.d0 = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r0 == (-1)) goto L25;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.l0
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.io.InputStream r0 = r8.d0
            int r0 = r0.read(r9, r10, r11)
            r2 = 1
            if (r0 <= 0) goto L62
            boolean r3 = r8.f0
            if (r3 == 0) goto L18
            ax.ce.c r3 = r8.e0
            r3.f(r9, r10, r0)
        L18:
            long r9 = r8.k0
            long r3 = (long) r0
            long r9 = r9 + r3
            r8.k0 = r9
            ax.be.j r9 = r8.c0
            long r9 = r9.a()
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            long r5 = r8.i0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L5c
            long r9 = r8.k0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            long r3 = r8.g0
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L42
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L5c
        L42:
            if (r0 < r11) goto L48
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L65
        L48:
            java.io.InputStream r9 = r8.d0
            int r9 = r9.read()
            if (r9 != r1) goto L56
        L50:
            r8.c()
            r8.l0 = r2
            return r0
        L56:
            ax.be.i r9 = new ax.be.i
            r9.<init>()
            throw r9
        L5c:
            ax.be.i r9 = new ax.be.i
            r9.<init>()
            throw r9
        L62:
            if (r0 != r1) goto L65
            goto L50
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.be.C1739g.read(byte[], int, int):int");
    }
}
