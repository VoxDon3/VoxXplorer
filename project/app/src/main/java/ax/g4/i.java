/*
 * Decompiled with CFR 0.152.
 */
package ax.g4;

import ax.g4.b;
import ax.g4.c;

public class i
implements c,
b {
    private b c0;
    private c d0;
    private boolean e0;
    private b q;

    public i() {
        this(null);
    }

    public i(c c8) {
        this.d0 = c8;
    }

    private boolean j() {
        c c8 = this.d0;
        return c8 == null || c8.b(this);
        {
        }
    }

    private boolean k() {
        c c8 = this.d0;
        return c8 == null || c8.g(this);
        {
        }
    }

    private boolean l() {
        c c8 = this.d0;
        return c8 != null && c8.a();
    }

    @Override
    public boolean a() {
        return this.l() || this.c();
        {
        }
    }

    @Override
    public boolean b(b b8) {
        return this.j() && b8.equals(this.q) && !this.a();
    }

    @Override
    public boolean c() {
        return this.q.c() || this.c0.c();
        {
        }
    }

    @Override
    public void clear() {
        this.e0 = false;
        this.c0.clear();
        this.q.clear();
    }

    @Override
    public boolean d(b b8) {
        if (b8 instanceof i) {
            b8 = (i)b8;
            b b9 = this.q;
            if (b9 == null ? ((i)b8).q == null : b9.d(((i)b8).q)) {
                b9 = this.c0;
                b8 = ((i)b8).c0;
                if (b9 == null ? b8 == null : b9.d(b8)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void e(b object) {
        if (!object.equals(this.c0)) {
            object = this.d0;
            if (object != null) {
                object.e(this);
            }
            if (!this.c0.i()) {
                this.c0.clear();
            }
        }
    }

    @Override
    public void f() {
        this.e0 = false;
        this.q.f();
        this.c0.f();
    }

    @Override
    public boolean g(b b8) {
        return this.k() && (b8.equals(this.q) || !this.q.c());
    }

    @Override
    public void h() {
        this.e0 = true;
        if (!this.c0.isRunning()) {
            this.c0.h();
        }
        if (this.e0 && !this.q.isRunning()) {
            this.q.h();
        }
    }

    @Override
    public boolean i() {
        return this.q.i() || this.c0.i();
        {
        }
    }

    @Override
    public boolean isCancelled() {
        return this.q.isCancelled();
    }

    @Override
    public boolean isRunning() {
        return this.q.isRunning();
    }

    public void m(b b8, b b9) {
        this.q = b8;
        this.c0 = b9;
    }

    @Override
    public void recycle() {
        this.q.recycle();
        this.c0.recycle();
    }
}

