package ax.pb;

import ax.qb.C2897e;
import ax.rb.C3025d;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.pb.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2800d0 extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private int c0;
    private int d0;
    private int e0;
    private byte[] f0;
    C2796b0 g0;
    private long q;

    public C2800d0(String str) throws C2794a0, MalformedURLException, UnknownHostException {
        this(new C2796b0(str));
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        long j;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.q;
        if (this.f0 == null) {
            throw new IOException("Bad file descriptor");
        }
        this.g0.Q(this.d0, this.e0, 128, 0);
        C2799d c2799d = C2796b0.D0;
        if (C2897e.c0 >= 4) {
            C2796b0.A0.println("read: fid=" + this.g0.q0 + ",off=" + i + ",len=" + i2);
        }
        L l = new L(bArr, i);
        if (this.g0.r0 == 16) {
            l.t0 = 0L;
        }
        do {
            int i5 = this.c0;
            i3 = i2 > i5 ? i5 : i2;
            C2799d c2799d2 = C2796b0.D0;
            if (C2897e.c0 >= 4) {
                C2796b0.A0.println("read: len=" + i2 + ",r=" + i3 + ",fp=" + this.q);
            }
            try {
                K k = new K(this.g0.q0, this.q, i3, null);
                C2796b0 c2796b0 = this.g0;
                if (c2796b0.r0 == 16) {
                    k.K0 = 1024;
                    k.I0 = 1024;
                    k.J0 = 1024;
                }
                c2796b0.Y(k, l);
                i4 = l.I0;
                if (i4 > 0) {
                    j = this.q + i4;
                    this.q = j;
                    i2 -= i4;
                    l.G0 += i4;
                    if (i2 <= 0) {
                        break;
                    }
                } else {
                    long j3 = this.q;
                    return (int) (j3 - j2 > 0 ? j3 - j2 : -1L);
                }
            } catch (C2794a0 e) {
                if (this.g0.r0 == 16 && e.c() == -1073741493) {
                    return -1;
                }
                throw b(e);
            }
        } while (i4 == i3);
        return (int) (j - j2);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        C2796b0 c2796b0 = this.g0;
        if (c2796b0.r0 != 16) {
            return 0;
        }
        try {
            C2806g0 c2806g0 = (C2806g0) c2796b0;
            c2796b0.Q(32, c2806g0.G0 & 16711680, 128, 0);
            C2796b0 c2796b02 = this.g0;
            z0 z0Var = new z0(c2796b02.p0, c2796b02.q0);
            A0 a0 = new A0(c2806g0);
            c2806g0.Y(z0Var, a0);
            int i = a0.a1;
            if (i != 1 && i != 4) {
                return a0.b1;
            }
            this.g0.s0 = false;
            return 0;
        } catch (C2794a0 e) {
            throw b(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected IOException b(C2794a0 c2794a0) {
        Throwable d = c2794a0.d();
        C2794a0 c2794a02 = c2794a0;
        if (d instanceof C3025d) {
            C3025d c3025d = (C3025d) d;
            d = c3025d.a();
            c2794a02 = c3025d;
        }
        if (!(d instanceof InterruptedException)) {
            return c2794a02;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(d.getMessage());
        interruptedIOException.initCause(d);
        return interruptedIOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.g0.d();
            this.f0 = null;
        } catch (C2794a0 e) {
            throw b(e);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f0, 0, 1) == -1) {
            return -1;
        }
        return this.f0[0] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        this.q += j;
        return j;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public C2800d0(C2796b0 c2796b0) throws C2794a0, MalformedURLException, UnknownHostException {
        this(c2796b0, 1);
    }

    C2800d0(C2796b0 c2796b0, int i) throws C2794a0, MalformedURLException, UnknownHostException {
        this.f0 = new byte[1];
        this.g0 = c2796b0;
        this.d0 = i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i2 = 65535 & (i >>> 16);
        this.e0 = i2;
        if (c2796b0.r0 != 16) {
            c2796b0.Q(i, i2, 128, 0);
            this.d0 &= -81;
        } else {
            c2796b0.g();
        }
        k0 k0Var = c2796b0.o0.f.h;
        this.c0 = Math.min(k0Var.A0 - 70, k0Var.w0.b - 70);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return a(bArr, i, i2);
    }
}
