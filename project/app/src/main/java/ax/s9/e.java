/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.K8.a;
import ax.Q8.F;
import ax.Q8.t;
import ax.R8.s;
import ax.Xd.f;
import ax.s9.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class e
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private static int q0 = 1;
    private static final ax.Xd.d r0 = f.k(e.class);
    private d c0;
    private long d0 = 0L;
    private int e0 = 0;
    private byte[] f0;
    private boolean g0;
    private boolean h0;
    private int i0;
    private long j0;
    private boolean k0;
    private final Queue<b> l0 = new ArrayDeque<b>();
    private long m0;
    private int n0;
    private int o0;
    private int p0;
    private final long q;

    e(d d8, int n8, long l8, long l9, ax.i9.b b8, long l10) {
        this.c0 = d8;
        this.i0 = Integer.highestOneBit(n8);
        this.q = l8;
        this.d0 = l9;
        this.m0 = l9;
        this.j0 = l10;
        this.n0 = Runtime.getRuntime().freeMemory() >= 0x2200000L ? 8 : 2;
        this.o0 = q0;
    }

    private boolean a() {
        long l8 = this.j0;
        if (l8 != -1L && !this.k0) {
            if (this.m0 < l8) {
                return true;
            }
            return this.l0.isEmpty();
        }
        return true;
    }

    private void b() {
        Iterator iterator = this.l0.iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).c.cancel(true);
        }
        this.l0.clear();
    }

    private void c() {
        while (!this.g0 && !this.h0 && this.l0.size() < this.o0 && this.a()) {
            long l8 = this.m0;
            int n8 = this.i0;
            b b8 = new b(l8, n8, this.c0.M0(l8, n8));
            this.l0.add(b8);
            this.m0 += (long)this.i0;
        }
    }

    private void d() {
        int n8 = this.o0;
        if (n8 < this.n0) {
            int n9;
            this.p0 = n9 = this.p0 + 1;
            if (n9 >= n8) {
                this.o0 = n8 + 1;
                this.p0 = 0;
            }
        }
    }

    private void e() throws IOException {
        if (!this.g0 && !this.h0) {
            this.c();
            b b8 = this.l0.poll();
            if (b8 == null) {
                this.h0 = true;
                return;
            }
            Object object = (s)ax.a9.d.a(b8.c, this.q, TimeUnit.MILLISECONDS, ax.c9.e.q);
            if (object != null) {
                Object object2;
                int n8 = ((s)object).o();
                long l8 = ((t)((ax.h9.d)object).c()).m();
                if (l8 == ((a)(object2 = a.c0)).getValue()) {
                    byte[] byArray = ((s)object).n();
                    n8 = byArray != null ? byArray.length : 0;
                    this.f0 = byArray;
                    this.e0 = 0;
                    this.d0 = b8.a + (long)n8;
                    if (this.j0 != -1L && b8.a >= this.j0 && n8 > 0) {
                        this.k0 = true;
                    }
                    if (n8 > 0 && n8 < b8.b) {
                        this.m0 = this.d0;
                        this.b();
                        this.f();
                    } else {
                        this.d();
                    }
                }
                if (((t)((ax.h9.d)object).c()).m() != a.q0.getValue() && n8 != 0) {
                    if (((t)((ax.h9.d)object).c()).m() == ((a)object2).getValue()) {
                        this.c();
                        return;
                    }
                    object2 = (t)((ax.h9.d)object).c();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Read failed for ");
                    ((StringBuilder)object).append(this);
                    throw new F((t)object2, ((StringBuilder)object).toString());
                }
                r0.s("EOF, {} bytes read", this.d0);
                this.h0 = true;
                this.f0 = null;
                this.b();
                return;
            }
            throw new IOException("Read failed: server returned null response");
        }
    }

    private void f() {
        this.o0 = q0;
        this.p0 = 0;
    }

    @Override
    public int available() {
        return 0;
    }

    @Override
    public void close() {
        this.g0 = true;
        this.c0 = null;
        this.f0 = null;
        this.b();
    }

    @Override
    public int read() throws IOException {
        byte[] byArray = this.f0;
        if (byArray == null || this.e0 >= byArray.length) {
            this.e();
        }
        if (!this.g0 && !this.h0) {
            byArray = this.f0;
            int n8 = this.e0;
            this.e0 = n8 + 1;
            return byArray[n8] & 0xFF;
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        byArray.getClass();
        if (n8 >= 0 && n9 >= 0 && n9 <= byArray.length - n8) {
            if (n9 == 0) {
                return 0;
            }
            byte[] byArray2 = this.f0;
            if (byArray2 == null || this.e0 >= byArray2.length) {
                this.e();
            }
            if (!this.g0 && !this.h0) {
                n9 = Math.min(n9, this.f0.length - this.e0);
                System.arraycopy(this.f0, this.e0, byArray, n8, n9);
                this.e0 += n9;
                return n9;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long skip(long l8) {
        if (!this.g0 && !this.h0 && l8 > 0L) {
            byte[] byArray = this.f0;
            if (byArray == null) {
                this.d0 += l8;
            } else {
                int n8 = this.e0;
                if ((long)n8 + l8 < (long)byArray.length) {
                    this.e0 = (int)((long)n8 + l8);
                    return l8;
                }
                this.d0 += (long)n8 + l8 - (long)byArray.length;
                this.f0 = null;
            }
            this.m0 = this.d0;
            this.b();
            this.f();
            return l8;
        }
        return 0L;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }

    private static class b {
        private final long a;
        private final int b;
        private final Future<s> c;

        private b(long l8, int n8, Future<s> future) {
            this.a = l8;
            this.b = n8;
            this.c = future;
        }
    }
}

