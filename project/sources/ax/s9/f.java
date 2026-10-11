package ax.s9;

import ax.i9.InterfaceC2290b;
import ax.o9.AbstractC2736c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class f extends OutputStream implements AutoCloseable {
    private static final ax.Xd.d l0 = ax.Xd.f.k(f.class);
    private boolean c0 = false;
    private b d0;
    private Future<Long>[] e0;
    private long[] f0;
    private int g0;
    private long h0;
    private long i0;
    private boolean j0;
    private int k0;
    private l q;

    private static class b extends AbstractC2736c {
        private k e0;

        /* JADX INFO: Access modifiers changed from: private */
        public void u() {
            this.e0 = null;
        }

        public void A(int i) {
            this.e0.h(i);
        }

        public void F(byte[] bArr, int i, int i2) {
            this.e0.i(bArr, i, i2);
        }

        @Override // ax.o9.AbstractC2736c
        public int a() {
            return this.e0.g();
        }

        @Override // ax.o9.AbstractC2736c
        protected int b(byte[] bArr) {
            return this.e0.e(bArr);
        }

        @Override // ax.o9.AbstractC2736c
        public boolean e() {
            k kVar = this.e0;
            return (kVar == null || kVar.a()) ? false : true;
        }

        public boolean o() {
            return this.e0.b();
        }

        public boolean p(int i) {
            return this.e0.c(i);
        }

        public int q() {
            return this.e0.d();
        }

        public void v(long j) {
            this.q = j;
        }

        private b(int i, long j) {
            this.e0 = new k(i);
            this.q = j;
        }

        @Override // ax.o9.AbstractC2736c
        public void f(int i) {
        }
    }

    f(l lVar, int i, long j, long j2, boolean z, int i2, InterfaceC2290b interfaceC2290b) {
        this.q = lVar;
        this.j0 = z;
        int highestOneBit = Integer.highestOneBit(i);
        if (!z) {
            this.d0 = new b(highestOneBit, j);
            return;
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        if (i2 >= 256 && freeMemory >= 41943040) {
            this.k0 = 32;
        } else if (i2 < 128 || freeMemory < 37748736) {
            this.k0 = 2;
        } else {
            this.k0 = 16;
        }
        int i3 = this.k0;
        this.e0 = new Future[i3];
        this.f0 = new long[i3];
        this.g0 = 0;
        this.d0 = new b(highestOneBit, j);
        this.h0 = j2;
        this.i0 = j;
    }

    private void a(boolean z) throws IOException {
        while (this.d0.e()) {
            b();
        }
        if (z && this.j0) {
            d();
        }
    }

    private void b() throws IOException {
        if (!this.j0) {
            this.q.b(this.d0, null);
            return;
        }
        long d = this.d0.d() + this.d0.a();
        this.e0[this.g0] = this.q.d(this.d0);
        long[] jArr = this.f0;
        int i = this.g0;
        jArr[i] = d;
        int i2 = (i + 1) % this.k0;
        this.g0 = i2;
        if (this.e0[i2] != null) {
            f(i2);
        }
        this.d0.v(this.i0);
    }

    private void c() throws IOException {
        if (this.c0) {
            throw new IOException("Stream is closed");
        }
    }

    private void d() throws IOException {
        int i = 0;
        while (true) {
            Future<Long>[] futureArr = this.e0;
            if (i >= futureArr.length) {
                return;
            }
            int length = (this.g0 + i) % futureArr.length;
            if (futureArr[length] != null) {
                f(length);
            }
            i++;
        }
    }

    private Long e(Future<Long> future) throws IOException {
        long j = this.h0;
        return j > 0 ? (Long) ax.a9.d.a(future, j, TimeUnit.MILLISECONDS, ax.c9.e.q) : (Long) ax.a9.d.b(future, ax.c9.e.q);
    }

    private void f(int i) throws IOException {
        e(this.e0[i]);
        this.e0[i] = null;
        this.f0[i] = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(true);
        if (this.j0) {
            this.d0.u();
        } else {
            this.d0.u();
        }
        this.c0 = true;
        this.q = null;
        l0.s("EOF, {} bytes written", Long.valueOf(this.d0.d()));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c();
        a(true);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        c();
        if (this.j0) {
            write(new byte[]{(byte) i});
            return;
        }
        if (this.d0.o()) {
            a(false);
        }
        if (this.d0.o()) {
            return;
        }
        this.d0.A(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        c();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        do {
            int min = Math.min(i2, this.d0.q());
            while (this.d0.p(min)) {
                a(false);
            }
            if (!this.d0.o()) {
                this.d0.F(bArr, i, min);
            }
            i += min;
            i2 -= min;
            this.i0 += min;
        } while (i2 > 0);
    }
}
