package ax.xc;

import ax.tb.C3133i;
import ax.yc.C3524a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;

/* renamed from: ax.xc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3487e implements g, InterfaceC3488f, Cloneable, ByteChannel, AutoCloseable {
    private long c0;
    public x q;

    /* renamed from: ax.xc.e$a */
    public static final class a implements Closeable, AutoCloseable {
        public boolean c0;
        private x d0;
        public byte[] f0;
        public C3487e q;
        public long e0 = -1;
        public int g0 = -1;
        public int h0 = -1;

        public final x a() {
            return this.d0;
        }

        public final int b() {
            long j = this.e0;
            C3487e c3487e = this.q;
            ax.Gb.l.c(c3487e);
            if (j == c3487e.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j2 = this.e0;
            return d(j2 == -1 ? 0L : j2 + (this.h0 - this.g0));
        }

        public final long c(long j) {
            C3487e c3487e = this.q;
            if (c3487e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.c0) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c3487e.size();
            if (j <= size) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = size - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    x xVar = c3487e.q;
                    ax.Gb.l.c(xVar);
                    x xVar2 = xVar.g;
                    ax.Gb.l.c(xVar2);
                    int i = xVar2.c;
                    long j3 = i - xVar2.b;
                    if (j3 > j2) {
                        xVar2.c = i - ((int) j2);
                        break;
                    }
                    c3487e.q = xVar2.b();
                    y.b(xVar2);
                    j2 -= j3;
                }
                e(null);
                this.e0 = j;
                this.f0 = null;
                this.g0 = -1;
                this.h0 = -1;
            } else if (j > size) {
                long j4 = j - size;
                boolean z = true;
                for (long j5 = 0; j4 > j5; j5 = 0) {
                    x e1 = c3487e.e1(1);
                    int min = (int) Math.min(j4, 8192 - e1.c);
                    e1.c += min;
                    j4 -= min;
                    if (z) {
                        e(e1);
                        this.e0 = size;
                        this.f0 = e1.a;
                        int i2 = e1.c;
                        this.g0 = i2 - min;
                        this.h0 = i2;
                        z = false;
                    }
                }
            }
            c3487e.b1(j);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.q == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.q = null;
            e(null);
            this.e0 = -1L;
            this.f0 = null;
            this.g0 = -1;
            this.h0 = -1;
        }

        public final int d(long j) {
            x xVar;
            C3487e c3487e = this.q;
            if (c3487e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > c3487e.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c3487e.size());
            }
            if (j == -1 || j == c3487e.size()) {
                e(null);
                this.e0 = j;
                this.f0 = null;
                this.g0 = -1;
                this.h0 = -1;
                return -1;
            }
            long size = c3487e.size();
            x xVar2 = c3487e.q;
            long j2 = 0;
            if (a() != null) {
                long j3 = this.e0;
                int i = this.g0;
                ax.Gb.l.c(a());
                long j4 = j3 - (i - r9.b);
                if (j4 > j) {
                    xVar = xVar2;
                    xVar2 = a();
                    size = j4;
                } else {
                    xVar = a();
                    j2 = j4;
                }
            } else {
                xVar = xVar2;
            }
            if (size - j > j - j2) {
                while (true) {
                    ax.Gb.l.c(xVar);
                    int i2 = xVar.c;
                    int i3 = xVar.b;
                    if (j < (i2 - i3) + j2) {
                        break;
                    }
                    j2 += i2 - i3;
                    xVar = xVar.f;
                }
            } else {
                while (size > j) {
                    ax.Gb.l.c(xVar2);
                    xVar2 = xVar2.g;
                    ax.Gb.l.c(xVar2);
                    size -= xVar2.c - xVar2.b;
                }
                j2 = size;
                xVar = xVar2;
            }
            if (this.c0) {
                ax.Gb.l.c(xVar);
                if (xVar.d) {
                    x f = xVar.f();
                    if (c3487e.q == xVar) {
                        c3487e.q = f;
                    }
                    xVar = xVar.c(f);
                    x xVar3 = xVar.g;
                    ax.Gb.l.c(xVar3);
                    xVar3.b();
                }
            }
            e(xVar);
            this.e0 = j;
            ax.Gb.l.c(xVar);
            this.f0 = xVar.a;
            int i4 = xVar.b + ((int) (j - j2));
            this.g0 = i4;
            int i5 = xVar.c;
            this.h0 = i5;
            return i5 - i4;
        }

        public final void e(x xVar) {
            this.d0 = xVar;
        }
    }

    /* renamed from: ax.xc.e$c */
    public static final class c extends OutputStream implements AutoCloseable {
        c() {
        }

        public String toString() {
            return C3487e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C3487e.this.writeByte(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            ax.Gb.l.f(bArr, "data");
            C3487e.this.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a L0(C3487e c3487e, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C3484b.d();
        }
        return c3487e.G0(aVar);
    }

    public OutputStream A0() {
        return new c();
    }

    @Override // ax.xc.g
    public h B(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new h(y0(j));
        }
        h d1 = d1((int) j);
        skip(j);
        return d1;
    }

    public boolean C0(long j, h hVar, int i, int i2) {
        ax.Gb.l.f(hVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || hVar.G() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (v(i3 + j) != hVar.n(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public int D0(byte[] bArr, int i, int i2) {
        ax.Gb.l.f(bArr, "sink");
        C3484b.b(bArr.length, i, i2);
        x xVar = this.q;
        if (xVar == null) {
            return -1;
        }
        int min = Math.min(i2, xVar.c - xVar.b);
        byte[] bArr2 = xVar.a;
        int i3 = xVar.b;
        C3133i.d(bArr2, bArr, i, i3, i3 + min);
        xVar.b += min;
        b1(size() - min);
        if (xVar.b == xVar.c) {
            this.q = xVar.b();
            y.b(xVar);
        }
        return min;
    }

    public long F(byte b2, long j, long j2) {
        x xVar;
        int i;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > size()) {
            j2 = size();
        }
        if (j == j2 || (xVar = this.q) == null) {
            return -1L;
        }
        if (size() - j < j) {
            j3 = size();
            while (j3 > j) {
                xVar = xVar.g;
                ax.Gb.l.c(xVar);
                j3 -= xVar.c - xVar.b;
            }
            while (j3 < j2) {
                byte[] bArr = xVar.a;
                int min = (int) Math.min(xVar.c, (xVar.b + j2) - j3);
                i = (int) ((xVar.b + j) - j3);
                while (i < min) {
                    if (bArr[i] != b2) {
                        i++;
                    }
                }
                j3 += xVar.c - xVar.b;
                xVar = xVar.f;
                ax.Gb.l.c(xVar);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (xVar.c - xVar.b) + j3;
            if (j4 > j) {
                break;
            }
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = xVar.a;
            int min2 = (int) Math.min(xVar.c, (xVar.b + j2) - j3);
            i = (int) ((xVar.b + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b2) {
                    i++;
                }
            }
            j3 += xVar.c - xVar.b;
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j = j3;
        }
        return -1L;
        return (i - xVar.b) + j3;
    }

    public final a G0(a aVar) {
        ax.Gb.l.f(aVar, "unsafeCursor");
        return C3524a.a(this, aVar);
    }

    public long H(h hVar) throws IOException {
        ax.Gb.l.f(hVar, "bytes");
        return L(hVar, 0L);
    }

    @Override // ax.xc.g
    public long J0(InterfaceC3482A interfaceC3482A) throws IOException {
        ax.Gb.l.f(interfaceC3482A, "sink");
        long size = size();
        if (size > 0) {
            interfaceC3482A.write(this, size);
        }
        return size;
    }

    public long L(h hVar, long j) throws IOException {
        int i;
        long j2 = j;
        ax.Gb.l.f(hVar, "bytes");
        if (hVar.G() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        x xVar = this.q;
        if (xVar == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j3 = size();
            while (j3 > j2) {
                xVar = xVar.g;
                ax.Gb.l.c(xVar);
                j3 -= xVar.c - xVar.b;
            }
            byte[] u = hVar.u();
            byte b2 = u[0];
            int G = hVar.G();
            long size = (size() - G) + 1;
            while (j3 < size) {
                byte[] bArr = xVar.a;
                long j4 = size;
                int min = (int) Math.min(xVar.c, (xVar.b + size) - j3);
                i = (int) ((xVar.b + j2) - j3);
                while (i < min) {
                    if (bArr[i] != b2 || !C3524a.c(xVar, i + 1, u, 1, G)) {
                        i++;
                    }
                }
                j3 += xVar.c - xVar.b;
                xVar = xVar.f;
                ax.Gb.l.c(xVar);
                j2 = j3;
                size = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (xVar.c - xVar.b) + j3;
            if (j5 > j2) {
                break;
            }
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j3 = j5;
        }
        byte[] u2 = hVar.u();
        byte b3 = u2[0];
        int G2 = hVar.G();
        long size2 = (size() - G2) + 1;
        while (j3 < size2) {
            byte[] bArr2 = xVar.a;
            int min2 = (int) Math.min(xVar.c, (xVar.b + size2) - j3);
            i = (int) ((xVar.b + j2) - j3);
            while (i < min2) {
                if (bArr2[i] == b3 && C3524a.c(xVar, i + 1, u2, 1, G2)) {
                }
                i++;
            }
            j3 += xVar.c - xVar.b;
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j2 = j3;
        }
        return -1L;
        return (i - xVar.b) + j3;
    }

    @Override // ax.xc.InterfaceC3488f
    public long M(C c2) throws IOException {
        ax.Gb.l.f(c2, "source");
        long j = 0;
        while (true) {
            long read = c2.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public int M0() throws EOFException {
        return C3484b.h(readInt());
    }

    @Override // ax.xc.g
    public byte[] O() {
        return y0(size());
    }

    @Override // ax.xc.g
    public int O0(s sVar) {
        ax.Gb.l.f(sVar, "options");
        int f = C3524a.f(this, sVar, false, 2, null);
        if (f == -1) {
            return -1;
        }
        skip(sVar.n()[f].G());
        return f;
    }

    @Override // ax.xc.g
    public boolean P() {
        return this.c0 == 0;
    }

    @Override // ax.xc.g
    public void P0(long j) throws EOFException {
        if (this.c0 < j) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        b1(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (size() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + ax.xc.C3484b.j(v(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
    
        r14 = 1;
     */
    @Override // ax.xc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long S() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.xc.C3487e.S():long");
    }

    @Override // ax.xc.g
    public void T(C3487e c3487e, long j) throws EOFException {
        ax.Gb.l.f(c3487e, "sink");
        if (size() >= j) {
            c3487e.write(this, j);
        } else {
            c3487e.write(this, size());
            throw new EOFException();
        }
    }

    public short T0() throws EOFException {
        return C3484b.i(readShort());
    }

    @Override // ax.xc.g
    public String U(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long F = F((byte) 10, 0L, j2);
        if (F != -1) {
            return C3524a.d(this, F);
        }
        if (j2 < size() && v(j2 - 1) == 13 && v(j2) == 10) {
            return C3524a.d(this, j2);
        }
        C3487e c3487e = new C3487e();
        j(c3487e, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c3487e.m0().t() + (char) 8230);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // ax.xc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long U0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb1
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            ax.xc.x r6 = r15.q
            ax.Gb.l.c(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            ax.xc.e r0 = new ax.xc.e
            r0.<init>()
            ax.xc.e r0 = r0.l0(r4)
            ax.xc.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.Z0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = ax.xc.C3484b.j(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            ax.xc.x r7 = r6.b()
            r15.q = r7
            ax.xc.y.b(r6)
            goto La1
        L9f:
            r6.b = r8
        La1:
            if (r1 != 0) goto La7
            ax.xc.x r6 = r15.q
            if (r6 != 0) goto Ld
        La7:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.b1(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.xc.C3487e.U0():long");
    }

    @Override // ax.xc.g
    public InputStream V0() {
        return new b();
    }

    public String Y0(long j, Charset charset) throws EOFException {
        ax.Gb.l.f(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.c0 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        int i = xVar.b;
        if (i + j > xVar.c) {
            return new String(y0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(xVar.a, i, i2, charset);
        int i3 = xVar.b + i2;
        xVar.b = i3;
        this.c0 -= j;
        if (i3 == xVar.c) {
            this.q = xVar.b();
            y.b(xVar);
        }
        return str;
    }

    public String Z0() {
        return Y0(this.c0, ax.Ob.d.b);
    }

    public String a1(long j) throws EOFException {
        return Y0(j, ax.Ob.d.b);
    }

    public final void b() {
        skip(size());
    }

    public final void b1(long j) {
        this.c0 = j;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3487e clone() {
        return f();
    }

    public final h c1() {
        if (size() <= 2147483647L) {
            return d1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final long d() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        x xVar2 = xVar.g;
        ax.Gb.l.c(xVar2);
        return (xVar2.c >= 8192 || !xVar2.e) ? size : size - (r3 - xVar2.b);
    }

    public long d0(h hVar) {
        ax.Gb.l.f(hVar, "targetBytes");
        return s0(hVar, 0L);
    }

    public final h d1(int i) {
        if (i == 0) {
            return h.f0;
        }
        C3484b.b(size(), 0L, i);
        x xVar = this.q;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ax.Gb.l.c(xVar);
            int i5 = xVar.c;
            int i6 = xVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            xVar = xVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        x xVar2 = this.q;
        int i7 = 0;
        while (i2 < i) {
            ax.Gb.l.c(xVar2);
            bArr[i7] = xVar2.a;
            i2 += xVar2.c - xVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = xVar2.b;
            xVar2.d = true;
            i7++;
            xVar2 = xVar2.f;
        }
        return new z(bArr, iArr);
    }

    public final x e1(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        x xVar = this.q;
        if (xVar != null) {
            ax.Gb.l.c(xVar);
            x xVar2 = xVar.g;
            ax.Gb.l.c(xVar2);
            return (xVar2.c + i > 8192 || !xVar2.e) ? xVar2.c(y.c()) : xVar2;
        }
        x c2 = y.c();
        this.q = c2;
        c2.g = c2;
        c2.f = c2;
        return c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3487e)) {
            return false;
        }
        C3487e c3487e = (C3487e) obj;
        if (size() != c3487e.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        x xVar2 = c3487e.q;
        ax.Gb.l.c(xVar2);
        int i = xVar.b;
        int i2 = xVar2.b;
        long j = 0;
        while (j < size()) {
            long min = Math.min(xVar.c - i, xVar2.c - i2);
            long j2 = 0;
            while (j2 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (xVar.a[i] != xVar2.a[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == xVar.c) {
                xVar = xVar.f;
                ax.Gb.l.c(xVar);
                i = xVar.b;
            }
            if (i2 == xVar2.c) {
                xVar2 = xVar2.f;
                ax.Gb.l.c(xVar2);
                i2 = xVar2.b;
            }
            j += min;
        }
        return true;
    }

    public final C3487e f() {
        C3487e c3487e = new C3487e();
        if (size() == 0) {
            return c3487e;
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        x d = xVar.d();
        c3487e.q = d;
        d.g = d;
        d.f = d;
        for (x xVar2 = xVar.f; xVar2 != xVar; xVar2 = xVar2.f) {
            x xVar3 = d.g;
            ax.Gb.l.c(xVar3);
            ax.Gb.l.c(xVar2);
            xVar3.c(xVar2.d());
        }
        c3487e.b1(size());
        return c3487e;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C3487e I0(h hVar) {
        ax.Gb.l.f(hVar, "byteString");
        hVar.L(this, 0, hVar.G());
        return this;
    }

    public C3487e g1(C c2, long j) throws IOException {
        ax.Gb.l.f(c2, "source");
        while (j > 0) {
            long read = c2.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C3487e write(byte[] bArr) {
        ax.Gb.l.f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public int hashCode() {
        x xVar = this.q;
        if (xVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = xVar.c;
            for (int i3 = xVar.b; i3 < i2; i3++) {
                i = (i * 31) + xVar.a[i3];
            }
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
        } while (xVar != this.q);
        return i;
    }

    @Override // ax.xc.g
    public String i0(Charset charset) {
        ax.Gb.l.f(charset, "charset");
        return Y0(this.c0, charset);
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C3487e write(byte[] bArr, int i, int i2) {
        ax.Gb.l.f(bArr, "source");
        long j = i2;
        C3484b.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            x e1 = e1(1);
            int min = Math.min(i3 - i, 8192 - e1.c);
            int i4 = i + min;
            C3133i.d(bArr, e1.a, e1.c, i, i4);
            e1.c += min;
            i = i4;
        }
        b1(size() + j);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final C3487e j(C3487e c3487e, long j, long j2) {
        ax.Gb.l.f(c3487e, "out");
        long j3 = j;
        C3484b.b(size(), j3, j2);
        if (j2 != 0) {
            c3487e.b1(c3487e.size() + j2);
            x xVar = this.q;
            while (true) {
                ax.Gb.l.c(xVar);
                int i = xVar.c;
                int i2 = xVar.b;
                if (j3 < i - i2) {
                    break;
                }
                j3 -= i - i2;
                xVar = xVar.f;
            }
            x xVar2 = xVar;
            long j4 = j2;
            while (j4 > 0) {
                ax.Gb.l.c(xVar2);
                x d = xVar2.d();
                int i3 = d.b + ((int) j3);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j4), d.c);
                x xVar3 = c3487e.q;
                if (xVar3 == null) {
                    d.g = d;
                    d.f = d;
                    c3487e.q = d;
                } else {
                    ax.Gb.l.c(xVar3);
                    x xVar4 = xVar3.g;
                    ax.Gb.l.c(xVar4);
                    xVar4.c(d);
                }
                j4 -= d.c - d.b;
                xVar2 = xVar2.f;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C3487e writeByte(int i) {
        x e1 = e1(1);
        byte[] bArr = e1.a;
        int i2 = e1.c;
        e1.c = i2 + 1;
        bArr[i2] = (byte) i;
        b1(size() + 1);
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C3487e Q0(long j) {
        boolean z;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return f0("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        x e1 = e1(i);
        byte[] bArr = e1.a;
        int i2 = e1.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = C3524a.b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        e1.c += i;
        b1(size() + i);
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C3487e l0(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        x e1 = e1(i);
        byte[] bArr = e1.a;
        int i2 = e1.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C3524a.b()[(int) (15 & j)];
            j >>>= 4;
        }
        e1.c += i;
        b1(size() + i);
        return this;
    }

    @Override // ax.xc.g
    public h m0() {
        return B(size());
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C3487e writeInt(int i) {
        x e1 = e1(4);
        byte[] bArr = e1.a;
        int i2 = e1.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        e1.c = i2 + 4;
        b1(size() + 4);
        return this;
    }

    public C3487e n1(long j) {
        x e1 = e1(8);
        byte[] bArr = e1.a;
        int i = e1.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        e1.c = i + 8;
        b1(size() + 8);
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C3487e writeShort(int i) {
        x e1 = e1(2);
        byte[] bArr = e1.a;
        int i2 = e1.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        e1.c = i2 + 2;
        b1(size() + 2);
        return this;
    }

    public C3487e p1(String str, int i, int i2, Charset charset) {
        ax.Gb.l.f(str, "string");
        ax.Gb.l.f(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        if (ax.Gb.l.a(charset, ax.Ob.d.b)) {
            return s1(str, i, i2);
        }
        String substring = str.substring(i, i2);
        ax.Gb.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        ax.Gb.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // ax.xc.g
    public g peek() {
        return p.d(new u(this));
    }

    public C3487e q1(String str, Charset charset) {
        ax.Gb.l.f(str, "string");
        ax.Gb.l.f(charset, "charset");
        return p1(str, 0, str.length(), charset);
    }

    @Override // ax.xc.g
    public boolean r0(long j) {
        return this.c0 >= j;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C3487e f0(String str) {
        ax.Gb.l.f(str, "string");
        return s1(str, 0, str.length());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        ax.Gb.l.f(byteBuffer, "sink");
        x xVar = this.q;
        if (xVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), xVar.c - xVar.b);
        byteBuffer.put(xVar.a, xVar.b, min);
        int i = xVar.b + min;
        xVar.b = i;
        this.c0 -= min;
        if (i == xVar.c) {
            this.q = xVar.b();
            y.b(xVar);
        }
        return min;
    }

    @Override // ax.xc.g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        int i = xVar.b;
        int i2 = xVar.c;
        int i3 = i + 1;
        byte b2 = xVar.a[i];
        b1(size() - 1);
        if (i3 != i2) {
            xVar.b = i3;
            return b2;
        }
        this.q = xVar.b();
        y.b(xVar);
        return b2;
    }

    @Override // ax.xc.g
    public void readFully(byte[] bArr) throws EOFException {
        ax.Gb.l.f(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int D0 = D0(bArr, i, bArr.length - i);
            if (D0 == -1) {
                throw new EOFException();
            }
            i += D0;
        }
    }

    @Override // ax.xc.g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        int i = xVar.b;
        int i2 = xVar.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = xVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        b1(size() - 4);
        if (i5 != i2) {
            xVar.b = i5;
            return i6;
        }
        this.q = xVar.b();
        y.b(xVar);
        return i6;
    }

    @Override // ax.xc.g
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        int i = xVar.b;
        int i2 = xVar.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = xVar.a;
        int i3 = i + 7;
        long j = ((bArr[i + 3] & 255) << 32) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        b1(size() - 8);
        if (i4 != i2) {
            xVar.b = i4;
            return j2;
        }
        this.q = xVar.b();
        y.b(xVar);
        return j2;
    }

    @Override // ax.xc.g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        x xVar = this.q;
        ax.Gb.l.c(xVar);
        int i = xVar.b;
        int i2 = xVar.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = xVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        b1(size() - 2);
        if (i5 == i2) {
            this.q = xVar.b();
            y.b(xVar);
        } else {
            xVar.b = i5;
        }
        return (short) i6;
    }

    public long s0(h hVar, long j) {
        int i;
        int i2;
        ax.Gb.l.f(hVar, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        x xVar = this.q;
        if (xVar == null) {
            return -1L;
        }
        if (size() - j < j) {
            j2 = size();
            while (j2 > j) {
                xVar = xVar.g;
                ax.Gb.l.c(xVar);
                j2 -= xVar.c - xVar.b;
            }
            if (hVar.G() == 2) {
                byte n = hVar.n(0);
                byte n2 = hVar.n(1);
                while (j2 < size()) {
                    byte[] bArr = xVar.a;
                    i = (int) ((xVar.b + j) - j2);
                    int i3 = xVar.c;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 != n && b2 != n2) {
                            i++;
                        }
                        i2 = xVar.b;
                    }
                    j2 += xVar.c - xVar.b;
                    xVar = xVar.f;
                    ax.Gb.l.c(xVar);
                    j = j2;
                }
            } else {
                byte[] u = hVar.u();
                while (j2 < size()) {
                    byte[] bArr2 = xVar.a;
                    i = (int) ((xVar.b + j) - j2);
                    int i4 = xVar.c;
                    while (i < i4) {
                        byte b3 = bArr2[i];
                        for (byte b4 : u) {
                            if (b3 == b4) {
                                i2 = xVar.b;
                            }
                        }
                        i++;
                    }
                    j2 += xVar.c - xVar.b;
                    xVar = xVar.f;
                    ax.Gb.l.c(xVar);
                    j = j2;
                }
            }
            return -1L;
        }
        while (true) {
            long j3 = (xVar.c - xVar.b) + j2;
            if (j3 > j) {
                break;
            }
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j2 = j3;
        }
        if (hVar.G() == 2) {
            byte n3 = hVar.n(0);
            byte n4 = hVar.n(1);
            while (j2 < size()) {
                byte[] bArr3 = xVar.a;
                i = (int) ((xVar.b + j) - j2);
                int i5 = xVar.c;
                while (i < i5) {
                    byte b5 = bArr3[i];
                    if (b5 != n3 && b5 != n4) {
                        i++;
                    }
                    i2 = xVar.b;
                }
                j2 += xVar.c - xVar.b;
                xVar = xVar.f;
                ax.Gb.l.c(xVar);
                j = j2;
            }
        } else {
            byte[] u2 = hVar.u();
            while (j2 < size()) {
                byte[] bArr4 = xVar.a;
                i = (int) ((xVar.b + j) - j2);
                int i6 = xVar.c;
                while (i < i6) {
                    byte b6 = bArr4[i];
                    for (byte b7 : u2) {
                        if (b6 == b7) {
                            i2 = xVar.b;
                        }
                    }
                    i++;
                }
                j2 += xVar.c - xVar.b;
                xVar = xVar.f;
                ax.Gb.l.c(xVar);
                j = j2;
            }
        }
        return -1L;
        return (i - i2) + j2;
    }

    public C3487e s1(String str, int i, int i2) {
        char charAt;
        ax.Gb.l.f(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                x e1 = e1(1);
                byte[] bArr = e1.a;
                int i3 = e1.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = e1.c;
                int i6 = (i3 + i) - i5;
                e1.c = i5 + i6;
                b1(size() + i6);
            } else {
                if (charAt2 < 2048) {
                    x e12 = e1(2);
                    byte[] bArr2 = e12.a;
                    int i7 = e12.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    e12.c = i7 + 2;
                    b1(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    x e13 = e1(3);
                    byte[] bArr3 = e13.a;
                    int i8 = e13.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    e13.c = i8 + 3;
                    b1(size() + 3);
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        x e14 = e1(4);
                        byte[] bArr4 = e14.a;
                        int i11 = e14.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        e14.c = i11 + 4;
                        b1(size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public final long size() {
        return this.c0;
    }

    @Override // ax.xc.g
    public void skip(long j) throws EOFException {
        while (j > 0) {
            x xVar = this.q;
            if (xVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, xVar.c - xVar.b);
            long j2 = min;
            b1(size() - j2);
            j -= j2;
            int i = xVar.b + min;
            xVar.b = i;
            if (i == xVar.c) {
                this.q = xVar.b();
                y.b(xVar);
            }
        }
    }

    public C3487e t1(int i) {
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            x e1 = e1(2);
            byte[] bArr = e1.a;
            int i2 = e1.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            e1.c = i2 + 2;
            b1(size() + 2);
            return this;
        }
        if (55296 <= i && i < 57344) {
            writeByte(63);
            return this;
        }
        if (i < 65536) {
            x e12 = e1(3);
            byte[] bArr2 = e12.a;
            int i3 = e12.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            e12.c = i3 + 3;
            b1(size() + 3);
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C3484b.k(i));
        }
        x e13 = e1(4);
        byte[] bArr3 = e13.a;
        int i4 = e13.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        e13.c = i4 + 4;
        b1(size() + 4);
        return this;
    }

    @Override // ax.xc.C
    public D timeout() {
        return D.NONE;
    }

    public String toString() {
        return c1().toString();
    }

    public final byte v(long j) {
        C3484b.b(size(), j, 1L);
        x xVar = this.q;
        if (xVar == null) {
            ax.Gb.l.c(null);
            throw null;
        }
        if (size() - j < j) {
            long size = size();
            while (size > j) {
                xVar = xVar.g;
                ax.Gb.l.c(xVar);
                size -= xVar.c - xVar.b;
            }
            ax.Gb.l.c(xVar);
            return xVar.a[(int) ((xVar.b + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (xVar.c - xVar.b) + j2;
            if (j3 > j) {
                ax.Gb.l.c(xVar);
                return xVar.a[(int) ((xVar.b + j) - j2)];
            }
            xVar = xVar.f;
            ax.Gb.l.c(xVar);
            j2 = j3;
        }
    }

    @Override // ax.xc.g
    public String v0() throws EOFException {
        return U(Long.MAX_VALUE);
    }

    @Override // ax.xc.g
    public boolean x0(long j, h hVar) {
        ax.Gb.l.f(hVar, "bytes");
        return C0(j, hVar, 0, hVar.G());
    }

    @Override // ax.xc.g
    public byte[] y0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* renamed from: ax.xc.e$b */
    public static final class b extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C3487e.this.size(), SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C3487e.this.size() > 0) {
                return C3487e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C3487e.this + ".inputStream()";
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            ax.Gb.l.f(bArr, "sink");
            return C3487e.this.D0(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        ax.Gb.l.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            x e1 = e1(1);
            int min = Math.min(i, 8192 - e1.c);
            byteBuffer.get(e1.a, e1.c, min);
            i -= min;
            e1.c += min;
        }
        this.c0 += remaining;
        return remaining;
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j > size()) {
            j = size();
        }
        c3487e.write(this, j);
        return j;
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) {
        x xVar;
        ax.Gb.l.f(c3487e, "source");
        if (c3487e != this) {
            C3484b.b(c3487e.size(), 0L, j);
            while (j > 0) {
                x xVar2 = c3487e.q;
                ax.Gb.l.c(xVar2);
                int i = xVar2.c;
                ax.Gb.l.c(c3487e.q);
                if (j < i - r1.b) {
                    x xVar3 = this.q;
                    if (xVar3 != null) {
                        ax.Gb.l.c(xVar3);
                        xVar = xVar3.g;
                    } else {
                        xVar = null;
                    }
                    if (xVar != null && xVar.e) {
                        if ((xVar.c + j) - (xVar.d ? 0 : xVar.b) <= 8192) {
                            x xVar4 = c3487e.q;
                            ax.Gb.l.c(xVar4);
                            xVar4.g(xVar, (int) j);
                            c3487e.b1(c3487e.size() - j);
                            b1(size() + j);
                            return;
                        }
                    }
                    x xVar5 = c3487e.q;
                    ax.Gb.l.c(xVar5);
                    c3487e.q = xVar5.e((int) j);
                }
                x xVar6 = c3487e.q;
                ax.Gb.l.c(xVar6);
                long j2 = xVar6.c - xVar6.b;
                c3487e.q = xVar6.b();
                x xVar7 = this.q;
                if (xVar7 == null) {
                    this.q = xVar6;
                    xVar6.g = xVar6;
                    xVar6.f = xVar6;
                } else {
                    ax.Gb.l.c(xVar7);
                    x xVar8 = xVar7.g;
                    ax.Gb.l.c(xVar8);
                    xVar8.c(xVar6).a();
                }
                c3487e.b1(c3487e.size() - j2);
                b1(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ax.xc.InterfaceC3488f, ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() {
    }

    @Override // ax.xc.g, ax.xc.InterfaceC3488f
    public C3487e k() {
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3487e G() {
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3487e R() {
        return this;
    }
}
