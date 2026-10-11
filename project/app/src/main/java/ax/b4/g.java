/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.J3.j;
import ax.M3.h;
import ax.M3.m;
import ax.g4.f;
import ax.h4.e;
import ax.k4.i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class g {
    private final ax.L3.a a;
    private final Handler b;
    private final List<b> c = new ArrayList<b>();
    final j d;
    private final ax.Q3.d e;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private ax.J3.i<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private m<Bitmap> n;

    public g(ax.J3.c c8, ax.L3.a a8, int n8, int n9, m<Bitmap> m8, Bitmap bitmap) {
        this(c8.f(), ax.J3.c.r(c8.h()), a8, null, ax.b4.g.j(ax.J3.c.r(c8.h()), n8, n9), m8, bitmap);
    }

    g(ax.Q3.d d8, j j8, ax.L3.a a8, Handler handler, ax.J3.i<Bitmap> i8, m<Bitmap> m8, Bitmap bitmap) {
        this.d = j8;
        j8 = handler;
        if (handler == null) {
            j8 = new Handler(Looper.getMainLooper(), (Handler.Callback)new c(this));
        }
        this.e = d8;
        this.b = j8;
        this.i = i8;
        this.a = a8;
        this.p(m8, bitmap);
    }

    private int g() {
        return ax.k4.i.f(this.c().getWidth(), this.c().getHeight(), this.c().getConfig());
    }

    private static ax.J3.i<Bitmap> j(j j8, int n8, int n9) {
        return j8.m().b(ax.g4.f.j(ax.P3.h.b).X(true).Q(n8, n9));
    }

    private void m() {
        if (this.f && !this.g) {
            if (this.h) {
                this.a.g();
                this.h = false;
            }
            this.g = true;
            int n8 = this.a.f();
            long l8 = SystemClock.uptimeMillis();
            long l9 = n8;
            this.a.d();
            this.l = new a(this.b, this.a.h(), l8 + l9);
            this.i.f().b(ax.g4.f.U(new d())).l(this.a).j(this.l);
        }
    }

    private void o() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.c(bitmap);
            this.m = null;
        }
    }

    private void q() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        this.m();
    }

    private void r() {
        this.f = false;
    }

    void a() {
        this.c.clear();
        this.o();
        this.r();
        a a8 = this.j;
        if (a8 != null) {
            this.d.o(a8);
            this.j = null;
        }
        if ((a8 = this.l) != null) {
            this.d.o(a8);
            this.l = null;
        }
        this.a.clear();
        this.k = true;
    }

    ByteBuffer b() {
        return this.a.b().asReadOnlyBuffer();
    }

    Bitmap c() {
        a a8 = this.j;
        if (a8 != null) {
            return a8.h();
        }
        return this.m;
    }

    int d() {
        a a8 = this.j;
        if (a8 != null) {
            return a8.f0;
        }
        return -1;
    }

    Bitmap e() {
        return this.m;
    }

    int f() {
        return this.a.e();
    }

    int h() {
        return this.c().getHeight();
    }

    int i() {
        return this.a.j();
    }

    int k() {
        return this.a.i() + this.g();
    }

    int l() {
        return this.c().getWidth();
    }

    void n(a a8) {
        if (this.k) {
            this.b.obtainMessage(2, (Object)a8).sendToTarget();
            return;
        }
        if (a8.h() != null) {
            this.o();
            a a9 = this.j;
            this.j = a8;
            for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
                this.c.get(i8).a();
            }
            if (a9 != null) {
                this.b.obtainMessage(2, (Object)a9).sendToTarget();
            }
        }
        this.g = false;
        this.m();
    }

    void p(m<Bitmap> m8, Bitmap bitmap) {
        this.n = ax.k4.h.d(m8);
        this.m = ax.k4.h.d(bitmap);
        this.i = this.i.b(new f().Y(m8));
    }

    void s(b b8) {
        if (!this.k) {
            boolean bl = this.c.isEmpty();
            if (!this.c.contains(b8)) {
                this.c.add(b8);
                if (bl) {
                    this.q();
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    void t(b b8) {
        this.c.remove(b8);
        if (this.c.isEmpty()) {
            this.r();
        }
    }

    static class a
    extends ax.h4.c<Bitmap> {
        private final Handler e0;
        final int f0;
        private final long g0;
        private Bitmap h0;

        a(Handler handler, int n8, long l8) {
            this.e0 = handler;
            this.f0 = n8;
            this.g0 = l8;
        }

        Bitmap h() {
            return this.h0;
        }

        public void m(Bitmap bitmap, ax.i4.b<? super Bitmap> b8) {
            this.h0 = bitmap;
            bitmap = this.e0.obtainMessage(1, (Object)this);
            this.e0.sendMessageAtTime((Message)bitmap, this.g0);
        }
    }

    public static interface b {
        public void a();
    }

    private class c
    implements Handler.Callback {
        final g q;

        c(g g8) {
            this.q = g8;
        }

        public boolean handleMessage(Message object) {
            int n8 = object.what;
            if (n8 == 1) {
                object = (a)object.obj;
                this.q.n((a)object);
                return true;
            }
            if (n8 == 2) {
                object = (a)object.obj;
                this.q.d.o((e<?>)object);
            }
            return false;
        }
    }

    static class d
    implements h {
        private final UUID b;

        public d() {
            this(UUID.randomUUID());
        }

        d(UUID uUID) {
            this.b = uUID;
        }

        @Override
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof d) {
                return ((d)object).b.equals(this.b);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }
    }
}

