package ax.Q0;

import ax.Q0.o;
import ax.S0.C0968a;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class s implements o {
    private final boolean b;
    private int c;
    private float d;
    private float e;
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

    private boolean h() {
        return Math.abs(this.d - 1.0f) < 1.0E-4f && Math.abs(this.e - 1.0f) < 1.0E-4f && this.g.a == this.f.a;
    }

    @Override // ax.Q0.o
    public void a() {
        this.d = 1.0f;
        this.e = 1.0f;
        o.a aVar = o.a.e;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        ByteBuffer byteBuffer = o.a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }

    @Override // ax.Q0.o
    public ByteBuffer b() {
        int k;
        r rVar = this.k;
        if (rVar != null && (k = rVar.k()) > 0) {
            if (this.l.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.l = order;
                this.m = order.asShortBuffer();
            } else {
                this.l.clear();
                this.m.clear();
            }
            rVar.j(this.m);
            this.p += k;
            this.l.limit(k);
            this.n = this.l;
        }
        ByteBuffer byteBuffer = this.n;
        this.n = o.a;
        return byteBuffer;
    }

    @Override // ax.Q0.o
    public boolean c() {
        if (!this.q) {
            return false;
        }
        r rVar = this.k;
        return rVar == null || rVar.k() == 0;
    }

    @Override // ax.Q0.o
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = (r) C0968a.e(this.k);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.o += remaining;
            rVar.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // ax.Q0.o
    public boolean e() {
        if (this.g.a != -1) {
            return this.b || !h();
        }
        return false;
    }

    @Override // ax.Q0.o
    public void f() {
        r rVar = this.k;
        if (rVar != null) {
            rVar.s();
        }
        this.q = true;
    }

    @Override // ax.Q0.o
    public void flush() {
        if (e()) {
            o.a aVar = this.f;
            this.h = aVar;
            o.a aVar2 = this.g;
            this.i = aVar2;
            if (this.j) {
                this.k = new r(aVar.a, aVar.b, this.d, this.e, aVar2.a);
            } else {
                r rVar = this.k;
                if (rVar != null) {
                    rVar.i();
                }
            }
        }
        this.n = o.a;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
    }

    @Override // ax.Q0.o
    public o.a g(o.a aVar) throws o.b {
        if (aVar.c != 2) {
            throw new o.b(aVar);
        }
        int i = this.c;
        if (i == -1) {
            i = aVar.a;
        }
        this.f = aVar;
        o.a aVar2 = new o.a(i, aVar.b, 2);
        this.g = aVar2;
        this.j = true;
        return aVar2;
    }

    public long i(long j) {
        if (this.p < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.d * j);
        }
        long l = this.o - ((r) C0968a.e(this.k)).l();
        int i = this.i.a;
        int i2 = this.h.a;
        return i == i2 ? d0.p1(j, l, this.p) : d0.p1(j, l * i, this.p * i2);
    }

    public void j(float f) {
        C0968a.a(f > 0.0f);
        if (this.e != f) {
            this.e = f;
            this.j = true;
        }
    }

    public void k(float f) {
        C0968a.a(f > 0.0f);
        if (this.d != f) {
            this.d = f;
            this.j = true;
        }
    }

    s(boolean z) {
        this.d = 1.0f;
        this.e = 1.0f;
        o.a aVar = o.a.e;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        ByteBuffer byteBuffer = o.a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = byteBuffer;
        this.c = -1;
        this.b = z;
    }
}
