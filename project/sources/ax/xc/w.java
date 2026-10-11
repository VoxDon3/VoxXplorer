package ax.xc;

import ax.yc.C3524a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class w implements g, AutoCloseable {
    public final C3487e c0;
    public boolean d0;
    public final C q;

    public w(C c) {
        ax.Gb.l.f(c, "source");
        this.q = c;
        this.c0 = new C3487e();
    }

    @Override // ax.xc.g
    public h B(long j) {
        P0(j);
        return this.c0.B(j);
    }

    @Override // ax.xc.g
    public long J0(InterfaceC3482A interfaceC3482A) {
        ax.Gb.l.f(interfaceC3482A, "sink");
        long j = 0;
        while (this.q.read(this.c0, 8192L) != -1) {
            long d = this.c0.d();
            if (d > 0) {
                j += d;
                interfaceC3482A.write(this.c0, d);
            }
        }
        if (this.c0.size() <= 0) {
            return j;
        }
        long size = j + this.c0.size();
        C3487e c3487e = this.c0;
        interfaceC3482A.write(c3487e, c3487e.size());
        return size;
    }

    @Override // ax.xc.g
    public byte[] O() {
        this.c0.M(this.q);
        return this.c0.O();
    }

    @Override // ax.xc.g
    public int O0(s sVar) {
        ax.Gb.l.f(sVar, "options");
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        do {
            int e = C3524a.e(this.c0, sVar, true);
            if (e != -2) {
                if (e == -1) {
                    return -1;
                }
                this.c0.skip(sVar.n()[e].G());
                return e;
            }
        } while (this.q.read(this.c0, 8192L) != -1);
        return -1;
    }

    @Override // ax.xc.g
    public boolean P() {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        return this.c0.P() && this.q.read(this.c0, 8192L) == -1;
    }

    @Override // ax.xc.g
    public void P0(long j) {
        if (!r0(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, ax.Ob.a.a(ax.Ob.a.a(16)));
        ax.Gb.l.e(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // ax.xc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long S() {
        /*
            r10 = this;
            r0 = 1
            r10.P0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.r0(r6)
            if (r8 == 0) goto L56
            ax.xc.e r8 = r10.c0
            byte r8 = r8.v(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L29
            r4 = 45
            if (r8 == r4) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r9 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = ax.Ob.a.a(r2)
            int r2 = ax.Ob.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            ax.Gb.l.e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            ax.xc.e r0 = r10.c0
            long r0 = r0.S()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.xc.w.S():long");
    }

    @Override // ax.xc.g
    public void T(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "sink");
        try {
            P0(j);
            this.c0.T(c3487e, j);
        } catch (EOFException e) {
            c3487e.M(this.c0);
            throw e;
        }
    }

    @Override // ax.xc.g
    public String U(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long b = b((byte) 10, 0L, j2);
        if (b != -1) {
            return C3524a.d(this.c0, b);
        }
        if (j2 < Long.MAX_VALUE && r0(j2) && this.c0.v(j2 - 1) == 13 && r0(1 + j2) && this.c0.v(j2) == 10) {
            return C3524a.d(this.c0, j2);
        }
        C3487e c3487e = new C3487e();
        C3487e c3487e2 = this.c0;
        c3487e2.j(c3487e, 0L, Math.min(32, c3487e2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.c0.size(), j) + " content=" + c3487e.m0().t() + (char) 8230);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, ax.Ob.a.a(ax.Ob.a.a(16)));
        ax.Gb.l.e(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // ax.xc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long U0() {
        /*
            r5 = this;
            r0 = 1
            r5.P0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.r0(r2)
            if (r2 == 0) goto L5e
            ax.xc.e r2 = r5.c0
            long r3 = (long) r0
            byte r2 = r2.v(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = ax.Ob.a.a(r3)
            int r3 = ax.Ob.a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            ax.Gb.l.e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            ax.xc.e r0 = r5.c0
            long r0 = r0.U0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.xc.w.U0():long");
    }

    @Override // ax.xc.g
    public InputStream V0() {
        return new a();
    }

    public long a(byte b) {
        return b(b, 0L, Long.MAX_VALUE);
    }

    public long b(byte b, long j, long j2) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j3 = j;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long F = this.c0.F(b2, j3, j4);
            if (F == -1) {
                long size = this.c0.size();
                if (size >= j4 || this.q.read(this.c0, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, size);
                b = b2;
                j2 = j4;
            } else {
                return F;
            }
        }
        return -1L;
    }

    public boolean c(long j, h hVar, int i, int i2) {
        ax.Gb.l.f(hVar, "bytes");
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || hVar.G() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!r0(1 + j2) || this.c0.v(j2) != hVar.n(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.q.close();
        this.c0.b();
    }

    public int d() {
        P0(4L);
        return this.c0.M0();
    }

    public short e() {
        P0(2L);
        return this.c0.T0();
    }

    @Override // ax.xc.g
    public String i0(Charset charset) {
        ax.Gb.l.f(charset, "charset");
        this.c0.M(this.q);
        return this.c0.i0(charset);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.d0;
    }

    @Override // ax.xc.g, ax.xc.InterfaceC3488f
    public C3487e k() {
        return this.c0;
    }

    @Override // ax.xc.g
    public h m0() {
        this.c0.M(this.q);
        return this.c0.m0();
    }

    @Override // ax.xc.g
    public g peek() {
        return p.d(new u(this));
    }

    @Override // ax.xc.g
    public boolean r0(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        while (this.c0.size() < j) {
            if (this.q.read(this.c0, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        if (this.c0.size() == 0 && this.q.read(this.c0, 8192L) == -1) {
            return -1L;
        }
        return this.c0.read(c3487e, Math.min(j, this.c0.size()));
    }

    @Override // ax.xc.g
    public byte readByte() {
        P0(1L);
        return this.c0.readByte();
    }

    @Override // ax.xc.g
    public void readFully(byte[] bArr) {
        ax.Gb.l.f(bArr, "sink");
        try {
            P0(bArr.length);
            this.c0.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.c0.size() > 0) {
                C3487e c3487e = this.c0;
                int D0 = c3487e.D0(bArr, i, (int) c3487e.size());
                if (D0 == -1) {
                    throw new AssertionError();
                }
                i += D0;
            }
            throw e;
        }
    }

    @Override // ax.xc.g
    public int readInt() {
        P0(4L);
        return this.c0.readInt();
    }

    @Override // ax.xc.g
    public long readLong() {
        P0(8L);
        return this.c0.readLong();
    }

    @Override // ax.xc.g
    public short readShort() {
        P0(2L);
        return this.c0.readShort();
    }

    @Override // ax.xc.g
    public void skip(long j) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.c0.size() == 0 && this.q.read(this.c0, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.c0.size());
            this.c0.skip(min);
            j -= min;
        }
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        return "buffer(" + this.q + ')';
    }

    @Override // ax.xc.g
    public String v0() {
        return U(Long.MAX_VALUE);
    }

    @Override // ax.xc.g
    public boolean x0(long j, h hVar) {
        ax.Gb.l.f(hVar, "bytes");
        return c(j, hVar, 0, hVar.G());
    }

    @Override // ax.xc.g
    public byte[] y0(long j) {
        P0(j);
        return this.c0.y0(j);
    }

    public static final class a extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            w wVar = w.this;
            if (wVar.d0) {
                throw new IOException("closed");
            }
            return (int) Math.min(wVar.c0.size(), SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            w.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            w wVar = w.this;
            if (wVar.d0) {
                throw new IOException("closed");
            }
            if (wVar.c0.size() == 0) {
                w wVar2 = w.this;
                if (wVar2.q.read(wVar2.c0, 8192L) == -1) {
                    return -1;
                }
            }
            return w.this.c0.readByte() & 255;
        }

        public String toString() {
            return w.this + ".inputStream()";
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            ax.Gb.l.f(bArr, "data");
            if (!w.this.d0) {
                C3484b.b(bArr.length, i, i2);
                if (w.this.c0.size() == 0) {
                    w wVar = w.this;
                    if (wVar.q.read(wVar.c0, 8192L) == -1) {
                        return -1;
                    }
                }
                return w.this.c0.D0(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        ax.Gb.l.f(byteBuffer, "sink");
        if (this.c0.size() == 0 && this.q.read(this.c0, 8192L) == -1) {
            return -1;
        }
        return this.c0.read(byteBuffer);
    }
}
