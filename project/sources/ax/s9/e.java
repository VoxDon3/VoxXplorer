package ax.s9;

import ax.Q8.F;
import ax.R8.s;
import ax.i9.InterfaceC2290b;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class e extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private static int q0 = 1;
    private static final ax.Xd.d r0 = ax.Xd.f.k(e.class);
    private C3067d c0;
    private long d0;
    private byte[] f0;
    private boolean g0;
    private boolean h0;
    private int i0;
    private long j0;
    private boolean k0;
    private long m0;
    private int n0;
    private int o0;
    private int p0;
    private final long q;
    private int e0 = 0;
    private final Queue<b> l0 = new ArrayDeque();

    private static class b {
        private final long a;
        private final int b;
        private final Future<s> c;

        private b(long j, int i, Future<s> future) {
            this.a = j;
            this.b = i;
            this.c = future;
        }
    }

    e(C3067d c3067d, int i, long j, long j2, InterfaceC2290b interfaceC2290b, long j3) {
        this.d0 = 0L;
        this.c0 = c3067d;
        this.i0 = Integer.highestOneBit(i);
        this.q = j;
        this.d0 = j2;
        this.m0 = j2;
        this.j0 = j3;
        if (Runtime.getRuntime().freeMemory() >= 35651584) {
            this.n0 = 8;
        } else {
            this.n0 = 2;
        }
        this.o0 = q0;
    }

    private boolean a() {
        long j = this.j0;
        if (j == -1 || this.k0 || this.m0 < j) {
            return true;
        }
        return this.l0.isEmpty();
    }

    private void b() {
        Iterator<b> it = this.l0.iterator();
        while (it.hasNext()) {
            it.next().c.cancel(true);
        }
        this.l0.clear();
    }

    private void c() {
        while (!this.g0 && !this.h0 && this.l0.size() < this.o0 && a()) {
            long j = this.m0;
            int i = this.i0;
            this.l0.add(new b(j, i, this.c0.M0(j, i)));
            this.m0 += this.i0;
        }
    }

    private void d() {
        int i = this.o0;
        if (i < this.n0) {
            int i2 = this.p0 + 1;
            this.p0 = i2;
            if (i2 >= i) {
                this.o0 = i + 1;
                this.p0 = 0;
            }
        }
    }

    private void e() throws IOException {
        if (this.g0 || this.h0) {
            return;
        }
        c();
        b poll = this.l0.poll();
        if (poll == null) {
            this.h0 = true;
            return;
        }
        s sVar = (s) ax.a9.d.a(poll.c, this.q, TimeUnit.MILLISECONDS, ax.c9.e.q);
        if (sVar == null) {
            throw new IOException("Read failed: server returned null response");
        }
        int o = sVar.o();
        long m = sVar.c().m();
        ax.K8.a aVar = ax.K8.a.STATUS_SUCCESS;
        if (m == aVar.getValue()) {
            byte[] n = sVar.n();
            int length = n != null ? n.length : 0;
            this.f0 = n;
            this.e0 = 0;
            this.d0 = poll.a + length;
            if (this.j0 != -1 && poll.a >= this.j0 && length > 0) {
                this.k0 = true;
            }
            if (length <= 0 || length >= poll.b) {
                d();
            } else {
                this.m0 = this.d0;
                b();
                f();
            }
            o = length;
        }
        if (sVar.c().m() == ax.K8.a.STATUS_END_OF_FILE.getValue() || o == 0) {
            r0.s("EOF, {} bytes read", Long.valueOf(this.d0));
            this.h0 = true;
            this.f0 = null;
            b();
            return;
        }
        if (sVar.c().m() == aVar.getValue()) {
            c();
            return;
        }
        throw new F(sVar.c(), "Read failed for " + this);
    }

    private void f() {
        this.o0 = q0;
        this.p0 = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g0 = true;
        this.c0 = null;
        this.f0 = null;
        b();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f0;
        if (bArr == null || this.e0 >= bArr.length) {
            e();
        }
        if (this.g0 || this.h0) {
            return -1;
        }
        byte[] bArr2 = this.f0;
        int i = this.e0;
        this.e0 = i + 1;
        return bArr2[i] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (this.g0 || this.h0 || j <= 0) {
            return 0L;
        }
        if (this.f0 == null) {
            this.d0 += j;
        } else {
            int i = this.e0;
            if (i + j < r0.length) {
                this.e0 = (int) (i + j);
                return j;
            }
            this.d0 += (i + j) - r0.length;
            this.f0 = null;
        }
        this.m0 = this.d0;
        b();
        f();
        return j;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f0;
        if (bArr2 == null || this.e0 >= bArr2.length) {
            e();
        }
        if (this.g0 || this.h0) {
            return -1;
        }
        int min = Math.min(i2, this.f0.length - this.e0);
        System.arraycopy(this.f0, this.e0, bArr, i, min);
        this.e0 += min;
        return min;
    }
}
