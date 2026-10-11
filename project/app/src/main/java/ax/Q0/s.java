/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.Q0.o;
import ax.Q0.r;
import ax.S0.a;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class s
implements o {
    private final boolean b;
    private int c;
    private float d = 1.0f;
    private float e = 1.0f;
    private o.a f;
    private o.a g;
    private o.a h;
    private o.a i;
    private boolean j;
    private r k;
    private ByteBuffer l;
    private ShortBuffer m;
    private ByteBuffer n;
    private long o;
    private long p;
    private boolean q;

    public s() {
        this(false);
    }

    s(boolean bl) {
        Object object = o.a.e;
        this.f = object;
        this.g = object;
        this.h = object;
        this.i = object;
        this.l = object = ax.Q0.o.a;
        this.m = ((ByteBuffer)object).asShortBuffer();
        this.n = object;
        this.c = -1;
        this.b = bl;
    }

    private boolean h() {
        return Math.abs(this.d - 1.0f) < 1.0E-4f && Math.abs(this.e - 1.0f) < 1.0E-4f && this.g.a == this.f.a;
    }

    @Override
    public void a() {
        this.d = 1.0f;
        this.e = 1.0f;
        Object object = o.a.e;
        this.f = object;
        this.g = object;
        this.h = object;
        this.i = object;
        this.l = object = ax.Q0.o.a;
        this.m = ((ByteBuffer)object).asShortBuffer();
        this.n = object;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer;
        int n8;
        r r8 = this.k;
        if (r8 != null && (n8 = r8.k()) > 0) {
            if (this.l.capacity() < n8) {
                this.l = byteBuffer = ByteBuffer.allocateDirect(n8).order(ByteOrder.nativeOrder());
                this.m = byteBuffer.asShortBuffer();
            } else {
                this.l.clear();
                this.m.clear();
            }
            r8.j(this.m);
            this.p += (long)n8;
            this.l.limit(n8);
            this.n = this.l;
        }
        byteBuffer = this.n;
        this.n = ax.Q0.o.a;
        return byteBuffer;
    }

    @Override
    public boolean c() {
        r r8;
        return this.q && ((r8 = this.k) == null || r8.k() == 0);
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r r8 = a.e(this.k);
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        int n8 = byteBuffer.remaining();
        this.o += (long)n8;
        r8.t(shortBuffer);
        byteBuffer.position(byteBuffer.position() + n8);
    }

    @Override
    public boolean e() {
        return this.g.a != -1 && (this.b || !this.h());
    }

    @Override
    public void f() {
        r r8 = this.k;
        if (r8 != null) {
            r8.s();
        }
        this.q = true;
    }

    @Override
    public void flush() {
        if (this.e()) {
            o.a a8;
            this.h = a8 = this.f;
            Object object = this.g;
            this.i = object;
            if (this.j) {
                this.k = new r(a8.a, a8.b, this.d, this.e, ((o.a)object).a);
            } else {
                object = this.k;
                if (object != null) {
                    ((r)object).i();
                }
            }
        }
        this.n = ax.Q0.o.a;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }

    @Override
    public o.a g(o.a a8) throws o.b {
        if (a8.c == 2) {
            int n8;
            int n9 = n8 = this.c;
            if (n8 == -1) {
                n9 = a8.a;
            }
            this.f = a8;
            this.g = a8 = new o.a(n9, a8.b, 2);
            this.j = true;
            return a8;
        }
        throw new o.b(a8);
    }

    public long i(long l8) {
        if (this.p >= 1024L) {
            long l9 = this.o - (long)a.e(this.k).l();
            int n8 = this.i.a;
            int n9 = this.h.a;
            if (n8 == n9) {
                return d0.p1(l8, l9, this.p);
            }
            return d0.p1(l8, l9 * (long)n8, this.p * (long)n9);
        }
        return (long)((double)this.d * (double)l8);
    }

    public void j(float f8) {
        boolean bl = f8 > 0.0f;
        a.a(bl);
        if (this.e != f8) {
            this.e = f8;
            this.j = true;
        }
    }

    public void k(float f8) {
        boolean bl = f8 > 0.0f;
        a.a(bl);
        if (this.d != f8) {
            this.d = f8;
            this.j = true;
        }
    }
}

