/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.Xd.d;
import ax.c9.e;
import ax.o9.c;
import ax.s9.k;
import ax.s9.l;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class f
extends OutputStream
implements AutoCloseable {
    private static final d l0 = ax.Xd.f.k(f.class);
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

    f(l l8, int n8, long l9, long l10, boolean bl, int n9, ax.i9.b b8) {
        this.q = l8;
        this.j0 = bl;
        n8 = Integer.highestOneBit(n8);
        if (bl) {
            long l11 = Runtime.getRuntime().freeMemory();
            this.k0 = n9 >= 256 && l11 >= 0x2800000L ? 32 : (n9 >= 128 && l11 >= 0x2400000L ? 16 : 2);
            n9 = this.k0;
            this.e0 = new Future[n9];
            this.f0 = new long[n9];
            this.g0 = 0;
            this.d0 = new b(n8, l9);
            this.h0 = l10;
            this.i0 = l9;
            return;
        }
        this.d0 = new b(n8, l9);
    }

    private void a(boolean bl) throws IOException {
        while (this.d0.e()) {
            this.b();
        }
        if (bl && this.j0) {
            this.d();
        }
    }

    private void b() throws IOException {
        if (this.j0) {
            long l8 = this.d0.d();
            long l9 = this.d0.a();
            this.e0[this.g0] = this.q.d(this.d0);
            long[] lArray = this.f0;
            int n8 = this.g0;
            lArray[n8] = l8 + l9;
            this.g0 = n8 = (n8 + 1) % this.k0;
            if (this.e0[n8] != null) {
                this.f(n8);
            }
            this.d0.v(this.i0);
            return;
        }
        this.q.b(this.d0, null);
    }

    private void c() throws IOException {
        if (!this.c0) {
            return;
        }
        throw new IOException("Stream is closed");
    }

    private void d() throws IOException {
        Future<Long>[] futureArray;
        for (int i8 = 0; i8 < (futureArray = this.e0).length; ++i8) {
            int n8 = (this.g0 + i8) % futureArray.length;
            if (futureArray[n8] == null) continue;
            this.f(n8);
        }
    }

    private Long e(Future<Long> future) throws IOException {
        long l8 = this.h0;
        if (l8 > 0L) {
            return ax.a9.d.a(future, l8, TimeUnit.MILLISECONDS, e.q);
        }
        return ax.a9.d.b(future, e.q);
    }

    private void f(int n8) throws IOException {
        this.e(this.e0[n8]);
        this.e0[n8] = null;
        this.f0[n8] = 0L;
    }

    @Override
    public void close() throws IOException {
        this.a(true);
        if (this.j0) {
            this.d0.u();
        } else {
            this.d0.u();
        }
        this.c0 = true;
        this.q = null;
        l0.s("EOF, {} bytes written", this.d0.d());
    }

    @Override
    public void flush() throws IOException {
        this.c();
        this.a(true);
    }

    @Override
    public void write(int n8) throws IOException {
        this.c();
        if (this.j0) {
            this.write(new byte[]{(byte)n8});
            return;
        }
        if (this.d0.o()) {
            this.a(false);
        }
        if (!this.d0.o()) {
            this.d0.A(n8);
        }
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.c();
        byArray.getClass();
        if (n8 >= 0 && n9 >= 0 && n9 <= byArray.length - n8) {
            int n10 = n8;
            n8 = n9;
            if (n9 != 0) {
                do {
                    int n11 = Math.min(n8, this.d0.q());
                    while (this.d0.p(n11)) {
                        this.a(false);
                    }
                    if (!this.d0.o()) {
                        this.d0.F(byArray, n10, n11);
                    }
                    n10 += n11;
                    n9 = n8 - n11;
                    this.i0 += (long)n11;
                    n8 = n9;
                } while (n9 > 0);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    private static class b
    extends c {
        private k e0;

        private b(int n8, long l8) {
            this.e0 = new k(n8);
            this.q = l8;
        }

        private void u() {
            this.e0 = null;
        }

        public void A(int n8) {
            this.e0.h(n8);
        }

        public void F(byte[] byArray, int n8, int n9) {
            this.e0.i(byArray, n8, n9);
        }

        @Override
        public int a() {
            return this.e0.g();
        }

        @Override
        protected int b(byte[] byArray) {
            return this.e0.e(byArray);
        }

        @Override
        public boolean e() {
            k k8 = this.e0;
            return k8 != null && !k8.a();
        }

        @Override
        public void f(int n8) {
        }

        public boolean o() {
            return this.e0.b();
        }

        public boolean p(int n8) {
            return this.e0.c(n8);
        }

        public int q() {
            return this.e0.d();
        }

        public void v(long l8) {
            this.q = l8;
        }
    }
}

