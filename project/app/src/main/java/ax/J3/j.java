/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import ax.J3.g;
import ax.J3.i;
import ax.J3.k;
import ax.d4.c;
import ax.d4.d;
import ax.d4.h;
import ax.d4.m;
import ax.d4.n;
import ax.d4.p;
import ax.g4.b;
import ax.g4.f;
import ax.h4.e;
import java.util.Iterator;

public class j
implements ax.d4.i {
    private static final f k0 = f.h(Bitmap.class).N();
    private static final f l0 = f.h(ax.b4.c.class).N();
    private static final f m0 = f.j(ax.P3.h.c).R(g.e0).X(true);
    final h c0;
    private final n d0;
    private final m e0;
    private final p f0 = new p();
    private final Runnable g0;
    private final Handler h0;
    private final ax.d4.c i0;
    private f j0;
    protected final ax.J3.c q;

    public j(ax.J3.c c8, h h8, m m8) {
        this(c8, h8, m8, new n(), c8.g());
    }

    j(ax.J3.c c8, h h8, m object, n n8, d d8) {
        Handler handler;
        Runnable runnable2;
        this.g0 = runnable2 = new Runnable(this){
            final j q;
            {
                this.q = j8;
            }

            @Override
            public void run() {
                j j8 = this.q;
                j8.c0.b(j8);
            }
        };
        this.h0 = handler = new Handler(Looper.getMainLooper());
        this.q = c8;
        this.c0 = h8;
        this.e0 = object;
        this.d0 = n8;
        this.i0 = object = d8.a(c8.i().getBaseContext(), new c(n8));
        if (ax.k4.i.o()) {
            handler.post(runnable2);
        } else {
            h8.b(this);
        }
        h8.b((ax.d4.i)object);
        this.t(c8.i().a());
        c8.n(this);
    }

    private void w(e<?> e8) {
        if (!this.v(e8)) {
            this.q.o(e8);
        }
    }

    @Override
    public void a() {
        this.r();
        this.f0.a();
    }

    @Override
    public void b() {
        this.s();
        this.f0.b();
    }

    @Override
    public void f() {
        this.f0.f();
        Iterator<e<?>> iterator = this.f0.m().iterator();
        while (iterator.hasNext()) {
            this.o(iterator.next());
        }
        this.f0.h();
        this.d0.b();
        this.c0.a(this);
        this.c0.a(this.i0);
        this.h0.removeCallbacks(this.g0);
        this.q.q(this);
    }

    public <ResourceType> i<ResourceType> h(Class<ResourceType> clazz) {
        return new i<ResourceType>(this.q, this, clazz);
    }

    public i<Bitmap> m() {
        return this.h(Bitmap.class).b(k0);
    }

    public i<ax.b4.c> n() {
        return this.h(ax.b4.c.class).b(l0);
    }

    public void o(e<?> e8) {
        if (e8 == null) {
            return;
        }
        if (ax.k4.i.p()) {
            this.w(e8);
            return;
        }
        this.h0.post(new Runnable(this, e8){
            final j c0;
            final e q;
            {
                this.c0 = j8;
                this.q = e8;
            }

            @Override
            public void run() {
                this.c0.o(this.q);
            }
        });
    }

    f p() {
        return this.j0;
    }

    <T> k<?, T> q(Class<T> clazz) {
        return this.q.i().b(clazz);
    }

    public void r() {
        ax.k4.i.b();
        this.d0.c();
    }

    public void s() {
        ax.k4.i.b();
        this.d0.e();
    }

    protected void t(f f8) {
        this.j0 = f8.d().c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{tracker=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(this.e0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    void u(e<?> e8, b b8) {
        this.f0.n(e8);
        this.d0.f(b8);
    }

    boolean v(e<?> e8) {
        b b8 = e8.k();
        if (b8 == null) {
            return true;
        }
        if (this.d0.a(b8)) {
            this.f0.o(e8);
            e8.e(null);
            return true;
        }
        return false;
    }

    private static class c
    implements c.a {
        private final n a;

        public c(n n8) {
            this.a = n8;
        }

        @Override
        public void a(boolean bl) {
            if (bl) {
                this.a.d();
            }
        }
    }
}

