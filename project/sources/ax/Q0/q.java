package ax.Q0;

import ax.Q0.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class q implements o {
    protected o.a b;
    protected o.a c;
    private o.a d;
    private o.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public q() {
        ByteBuffer byteBuffer = o.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        o.a aVar = o.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // ax.Q0.o
    public final void a() {
        ByteBuffer byteBuffer = o.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        o.a aVar = o.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        l();
    }

    @Override // ax.Q0.o
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = o.a;
        return byteBuffer;
    }

    @Override // ax.Q0.o
    public boolean c() {
        return this.h && this.g == o.a;
    }

    @Override // ax.Q0.o
    public boolean e() {
        return this.e != o.a.e;
    }

    @Override // ax.Q0.o
    public final void f() {
        this.h = true;
        k();
    }

    @Override // ax.Q0.o
    public final void flush() {
        this.g = o.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        j();
    }

    @Override // ax.Q0.o
    public final o.a g(o.a aVar) throws o.b {
        this.d = aVar;
        this.e = i(aVar);
        return e() ? this.e : o.a.e;
    }

    protected final boolean h() {
        return this.g.hasRemaining();
    }

    protected abstract o.a i(o.a aVar) throws o.b;

    protected final ByteBuffer m(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }
}
