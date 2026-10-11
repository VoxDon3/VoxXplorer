/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.M3.h;
import ax.P3.f;
import ax.P3.k;
import ax.P3.n;
import ax.P3.o;
import ax.P3.s;
import ax.b0.d;
import ax.g4.g;
import ax.k4.i;
import ax.l4.a;
import java.util.ArrayList;
import java.util.List;

class j<R>
implements f.b<R>,
a.f {
    private static final a v0 = new a();
    private static final Handler w0 = new Handler(Looper.getMainLooper(), (Handler.Callback)new b());
    private final ax.l4.b c0;
    private final d<j<?>> d0;
    private final a e0;
    private final k f0;
    private final ax.S3.a g0;
    private final ax.S3.a h0;
    private final ax.S3.a i0;
    private h j0;
    private boolean k0;
    private boolean l0;
    private s<?> m0;
    private ax.M3.a n0;
    private boolean o0;
    private o p0;
    private final List<g> q = new ArrayList<g>(2);
    private boolean q0;
    private List<g> r0;
    private n<?> s0;
    private f<R> t0;
    private volatile boolean u0;

    j(ax.S3.a a8, ax.S3.a a9, ax.S3.a a10, k k8, d<j<?>> d8) {
        this(a8, a9, a10, k8, d8, v0);
    }

    j(ax.S3.a a8, ax.S3.a a9, ax.S3.a a10, k k8, d<j<?>> d8, a a11) {
        this.c0 = ax.l4.b.a();
        this.g0 = a8;
        this.h0 = a9;
        this.i0 = a10;
        this.f0 = k8;
        this.d0 = d8;
        this.e0 = a11;
    }

    private void e(g g8) {
        if (this.r0 == null) {
            this.r0 = new ArrayList<g>(2);
        }
        if (!this.r0.contains(g8)) {
            this.r0.add(g8);
        }
    }

    private ax.S3.a g() {
        if (this.l0) {
            return this.i0;
        }
        return this.h0;
    }

    private boolean m(g g8) {
        List<g> list = this.r0;
        return list != null && list.contains(g8);
    }

    private void n(boolean bl) {
        i.b();
        this.q.clear();
        this.j0 = null;
        this.s0 = null;
        this.m0 = null;
        List<g> list = this.r0;
        if (list != null) {
            list.clear();
        }
        this.q0 = false;
        this.u0 = false;
        this.o0 = false;
        this.t0.J(bl);
        this.t0 = null;
        this.p0 = null;
        this.n0 = null;
        this.d0.a(this);
    }

    @Override
    public void a(o o8) {
        this.p0 = o8;
        w0.obtainMessage(2, (Object)this).sendToTarget();
    }

    @Override
    public void b(s<R> s8, ax.M3.a a8) {
        this.m0 = s8;
        this.n0 = a8;
        w0.obtainMessage(1, (Object)this).sendToTarget();
    }

    @Override
    public void c(f<?> f8) {
        this.g().execute(f8);
    }

    public void d(g g8) {
        i.b();
        this.c0.c();
        if (this.o0) {
            g8.b(this.s0, this.n0);
            return;
        }
        if (this.q0) {
            g8.a(this.p0);
            return;
        }
        this.q.add(g8);
    }

    void f() {
        if (!(this.q0 || this.o0 || this.u0)) {
            this.u0 = true;
            this.t0.p();
            this.f0.d(this, this.j0);
        }
    }

    void h() {
        this.c0.c();
        if (this.u0) {
            this.f0.d(this, this.j0);
            this.n(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    void i() {
        this.c0.c();
        if (this.u0) {
            this.n(false);
            return;
        }
        if (!this.q.isEmpty()) {
            if (!this.q0) {
                this.q0 = true;
                this.f0.a(this.j0, null);
                for (g g8 : this.q) {
                    if (this.m(g8)) continue;
                    g8.a(this.p0);
                }
                this.n(false);
                return;
            }
            throw new IllegalStateException("Already failed once");
        }
        throw new IllegalStateException("Received an exception without any callbacks to notify");
    }

    void j() {
        this.c0.c();
        if (this.u0) {
            this.m0.recycle();
            this.n(false);
            return;
        }
        if (!this.q.isEmpty()) {
            if (!this.o0) {
                n<?> object2 = this.e0.a(this.m0, this.k0);
                this.s0 = object2;
                this.o0 = true;
                object2.a();
                this.f0.a(this.j0, this.s0);
                for (g g8 : this.q) {
                    if (this.m(g8)) continue;
                    this.s0.a();
                    g8.b(this.s0, this.n0);
                }
                this.s0.d();
                this.n(false);
                return;
            }
            throw new IllegalStateException("Already have resource");
        }
        throw new IllegalStateException("Received a resource without any callbacks to notify");
    }

    j<R> k(h h8, boolean bl, boolean bl2) {
        this.j0 = h8;
        this.k0 = bl;
        this.l0 = bl2;
        return this;
    }

    @Override
    public ax.l4.b l() {
        return this.c0;
    }

    public void o(g g8) {
        i.b();
        this.c0.c();
        if (!this.o0 && !this.q0) {
            this.q.remove(g8);
            if (this.q.isEmpty()) {
                this.f();
            }
            return;
        }
        this.e(g8);
    }

    public void p(f<R> f8) {
        this.t0 = f8;
        ax.S3.a a8 = f8.P() ? this.g0 : this.g();
        a8.execute(f8);
    }

    static class a {
        a() {
        }

        public <R> n<R> a(s<R> s8, boolean bl) {
            return new n<R>(s8, bl);
        }
    }

    private static class b
    implements Handler.Callback {
        b() {
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean handleMessage(Message message) {
            Object object = (j)message.obj;
            int n8 = message.what;
            if (n8 == 1) {
                ((j)object).j();
                return true;
            }
            if (n8 == 2) {
                ((j)object).i();
                return true;
            }
            if (n8 == 3) {
                ((j)object).h();
                return true;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unrecognized message: ");
            ((StringBuilder)object).append(message.what);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
    }
}

