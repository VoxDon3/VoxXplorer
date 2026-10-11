/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.Q0.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class q
implements o {
    protected o.a b;
    protected o.a c;
    private o.a d;
    private o.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public q() {
        Object object = o.a;
        this.f = object;
        this.g = object;
        this.d = object = o.a.e;
        this.e = object;
        this.b = object;
        this.c = object;
    }

    @Override
    public final void a() {
        Object object = o.a;
        this.g = object;
        this.h = false;
        this.f = object;
        this.d = object = o.a.e;
        this.e = object;
        this.b = object;
        this.c = object;
        this.l();
    }

    @Override
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = o.a;
        return byteBuffer;
    }

    @Override
    public boolean c() {
        return this.h && this.g == o.a;
    }

    @Override
    public boolean e() {
        return this.e != o.a.e;
    }

    @Override
    public final void f() {
        this.h = true;
        this.k();
    }

    @Override
    public final void flush() {
        this.g = o.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.j();
    }

    @Override
    public final o.a g(o.a a8) throws o.b {
        this.d = a8;
        this.e = this.i(a8);
        if (this.e()) {
            return this.e;
        }
        return o.a.e;
    }

    protected final boolean h() {
        return this.g.hasRemaining();
    }

    protected abstract o.a i(o.a var1) throws o.b;

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    protected final ByteBuffer m(int n8) {
        ByteBuffer byteBuffer;
        if (this.f.capacity() < n8) {
            this.f = ByteBuffer.allocateDirect(n8).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        this.g = byteBuffer = this.f;
        return byteBuffer;
    }
}

