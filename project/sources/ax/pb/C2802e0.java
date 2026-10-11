package ax.pb;

import ax.qb.C2897e;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.pb.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2802e0 extends OutputStream implements AutoCloseable {
    private boolean c0;
    private boolean d0;
    private int e0;
    private int f0;
    private int g0;
    private long h0;
    private byte[] i0;
    private W j0;
    private X k0;
    private V l0;
    private Y m0;
    private C2796b0 q;

    public C2802e0(C2796b0 c2796b0) throws C2794a0, MalformedURLException, UnknownHostException {
        this(c2796b0, false);
    }

    public static C2802e0 a(C2796b0 c2796b0) throws C2794a0, MalformedURLException, UnknownHostException {
        return new C2802e0(c2796b0, false, 50);
    }

    public static C2802e0 b(C2796b0 c2796b0) throws C2794a0, MalformedURLException, UnknownHostException {
        return new C2802e0(c2796b0, false, 82);
    }

    void c() throws IOException {
        if (this.q.I()) {
            return;
        }
        this.q.Q(this.e0, this.f0 | 2, 128, 0);
        if (this.c0) {
            this.h0 = this.q.L();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.d();
        this.i0 = null;
    }

    public int d() {
        return this.g0;
    }

    public void e(byte[] bArr, int i, int i2, int i3) throws IOException {
        byte[] bArr2;
        int i4;
        int i5;
        if (i2 <= 0) {
            return;
        }
        if (this.i0 == null) {
            throw new IOException("Bad file descriptor");
        }
        c();
        C2799d c2799d = C2796b0.D0;
        if (C2897e.c0 >= 4) {
            C2796b0.A0.println("write: fid=" + this.q.q0 + ",off=" + i + ",len=" + i2);
        }
        int i6 = i;
        while (true) {
            int i7 = this.g0;
            int i8 = i2 > i7 ? i7 : i2;
            if (this.d0) {
                bArr2 = bArr;
                this.j0.H(this.q.q0, this.h0, i2 - i8, bArr2, i6, i8);
                if ((i3 & 1) != 0) {
                    this.j0.H(this.q.q0, this.h0, i2, bArr2, i6, i8);
                    this.j0.N0 = 8;
                } else {
                    this.j0.N0 = 0;
                }
                this.q.Y(this.j0, this.k0);
                long j = this.h0;
                long j2 = this.k0.F0;
                this.h0 = j + j2;
                i4 = (int) (i2 - j2);
                i5 = (int) (i6 + j2);
            } else {
                bArr2 = bArr;
                this.l0.E(this.q.q0, this.h0, i2 - i8, bArr2, i6, i8);
                long j3 = this.h0;
                Y y = this.m0;
                long j4 = y.C0;
                this.h0 = j3 + j4;
                i4 = (int) (i2 - j4);
                i5 = (int) (i6 + j4);
                this.q.Y(this.l0, y);
            }
            i6 = i5;
            i2 = i4;
            if (i2 <= 0) {
                return;
            } else {
                bArr = bArr2;
            }
        }
    }

    public boolean isOpen() {
        return this.q.I();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.i0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public C2802e0(C2796b0 c2796b0, boolean z) throws C2794a0, MalformedURLException, UnknownHostException {
        this(c2796b0, z, z ? 22 : 82);
    }

    C2802e0(C2796b0 c2796b0, boolean z, int i) throws C2794a0, MalformedURLException, UnknownHostException {
        this.i0 = new byte[1];
        this.q = c2796b0;
        this.c0 = z;
        this.e0 = i;
        this.f0 = (i >>> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (z) {
            try {
                this.h0 = c2796b0.L();
            } catch (C2820u e) {
                throw e;
            } catch (C2794a0 unused) {
                this.h0 = 0L;
            }
        }
        if ((c2796b0 instanceof C2806g0) && c2796b0.p0.startsWith("\\pipe\\")) {
            c2796b0.p0 = c2796b0.p0.substring(5);
            c2796b0.Y(new D0("\\pipe" + c2796b0.p0), new E0());
        }
        c2796b0.Q(i, this.f0 | 2, 128, 0);
        this.e0 &= -81;
        k0 k0Var = c2796b0.o0.f.h;
        this.g0 = k0Var.z0 - 70;
        boolean u = k0Var.u(16);
        this.d0 = u;
        if (u) {
            this.j0 = new W();
            this.k0 = new X();
        } else {
            this.l0 = new V();
            this.m0 = new Y();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.q.I()) {
            C2796b0 c2796b0 = this.q;
            if (c2796b0 instanceof C2806g0) {
                c2796b0.Y(new D0("\\pipe" + this.q.p0), new E0());
            }
        }
        e(bArr, i, i2, 0);
    }
}
