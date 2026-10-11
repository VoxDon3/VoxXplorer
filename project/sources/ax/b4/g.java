package ax.b4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.J3.j;
import ax.M3.m;
import ax.g4.C2117f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
class g {
    private final ax.L3.a a;
    private final Handler b;
    private final List<b> c;
    final j d;
    private final ax.Q3.d e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ax.J3.i<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private m<Bitmap> n;

    static class a extends ax.h4.c<Bitmap> {
        private final Handler e0;
        final int f0;
        private final long g0;
        private Bitmap h0;

        a(Handler handler, int i, long j) {
            this.e0 = handler;
            this.f0 = i;
            this.g0 = j;
        }

        Bitmap h() {
            return this.h0;
        }

        @Override // ax.h4.e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void c(Bitmap bitmap, ax.i4.b<? super Bitmap> bVar) {
            this.h0 = bitmap;
            this.e0.sendMessageAtTime(this.e0.obtainMessage(1, this), this.g0);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                g.this.n((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            g.this.d.o((a) message.obj);
            return false;
        }
    }

    static class d implements ax.M3.h {
        private final UUID b;

        public d() {
            this(UUID.randomUUID());
        }

        @Override // ax.M3.h
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // ax.M3.h
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return ((d) obj).b.equals(this.b);
            }
            return false;
        }

        @Override // ax.M3.h
        public int hashCode() {
            return this.b.hashCode();
        }

        d(UUID uuid) {
            this.b = uuid;
        }
    }

    public g(ax.J3.c cVar, ax.L3.a aVar, int i, int i2, m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.f(), ax.J3.c.r(cVar.h()), aVar, null, j(ax.J3.c.r(cVar.h()), i, i2), mVar, bitmap);
    }

    private int g() {
        return ax.k4.i.f(c().getWidth(), c().getHeight(), c().getConfig());
    }

    private static ax.J3.i<Bitmap> j(j jVar, int i, int i2) {
        return jVar.m().b(C2117f.j(ax.P3.h.b).X(true).Q(i, i2));
    }

    private void m() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            this.a.g();
            this.h = false;
        }
        this.g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.f();
        this.a.d();
        this.l = new a(this.b, this.a.h(), uptimeMillis);
        this.i.clone().b(C2117f.U(new d())).l(this.a).j(this.l);
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
        m();
    }

    private void r() {
        this.f = false;
    }

    void a() {
        this.c.clear();
        o();
        r();
        a aVar = this.j;
        if (aVar != null) {
            this.d.o(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.o(aVar2);
            this.l = null;
        }
        this.a.clear();
        this.k = true;
    }

    ByteBuffer b() {
        return this.a.b().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.h() : this.m;
    }

    int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.f0;
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
        return c().getHeight();
    }

    int i() {
        return this.a.j();
    }

    int k() {
        return this.a.i() + g();
    }

    int l() {
        return c().getWidth();
    }

    void n(a aVar) {
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (aVar.h() != null) {
            o();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size).a();
            }
            if (aVar2 != null) {
                this.b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        this.g = false;
        m();
    }

    void p(m<Bitmap> mVar, Bitmap bitmap) {
        this.n = (m) ax.k4.h.d(mVar);
        this.m = (Bitmap) ax.k4.h.d(bitmap);
        this.i = this.i.b(new C2117f().Y(mVar));
    }

    void s(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        boolean isEmpty = this.c.isEmpty();
        if (this.c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        this.c.add(bVar);
        if (isEmpty) {
            q();
        }
    }

    void t(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            r();
        }
    }

    g(ax.Q3.d dVar, j jVar, ax.L3.a aVar, Handler handler, ax.J3.i<Bitmap> iVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.h = false;
        this.d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = dVar;
        this.b = handler;
        this.i = iVar;
        this.a = aVar;
        p(mVar, bitmap);
    }
}
