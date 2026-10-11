/*
 * Decompiled with CFR 0.152.
 */
package ax.d1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import ax.P0.E;
import ax.S0.a;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.k;
import ax.U0.u;
import ax.d1.d;
import ax.d1.f;
import ax.d1.i;
import ax.d1.j;
import ax.d1.k;
import ax.d1.l;
import ax.d1.m;
import ax.i1.B;
import ax.i1.N;
import ax.i1.y;
import ax.m1.m;
import ax.m1.o;
import ax.m1.p;
import ax.r7.F;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c
implements m,
o.b<p<j>> {
    public static final m.a q0 = new ax.d1.b();
    private final l c0;
    private final ax.m1.m d0;
    private final HashMap<Uri, c> e0;
    private final CopyOnWriteArrayList<m.b> f0;
    private final double g0;
    private N.a h0;
    private o i0;
    private Handler j0;
    private m.e k0;
    private i l0;
    private Uri m0;
    private f n0;
    private boolean o0;
    private long p0;
    private final ax.c1.d q;

    public c(ax.c1.d d8, ax.m1.m m8, l l8, ax.m1.f f8) {
        this(d8, m8, l8, f8, 3.5);
    }

    public c(ax.c1.d d8, ax.m1.m m8, l l8, ax.m1.f f8, double d9) {
        this.q = d8;
        this.c0 = l8;
        this.d0 = m8;
        this.g0 = d9;
        this.f0 = new CopyOnWriteArrayList();
        this.e0 = new HashMap();
        this.p0 = -9223372036854775807L;
    }

    private void H(List<Uri> list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Uri uri = list.get(i8);
            c c8 = new c(this, uri);
            this.e0.put(uri, c8);
        }
    }

    private static f.f I(f list, f f8) {
        int n8 = (int)(f8.k - ((f)((Object)list)).k);
        list = ((f)((Object)list)).r;
        if (n8 < list.size()) {
            return (f.f)list.get(n8);
        }
        return null;
    }

    private f J(f f8, f f9) {
        if (!f9.f(f8)) {
            f f10 = f8;
            if (f9.o) {
                f10 = f8.d();
            }
            return f10;
        }
        return f9.c(this.L(f8, f9), this.K(f8, f9));
    }

    private int K(f f8, f f9) {
        if (f9.i) {
            return f9.j;
        }
        Object object = this.n0;
        int n8 = object != null ? ((f)object).j : 0;
        if (f8 != null && (object = c.I(f8, f9)) != null) {
            return f8.j + ((f.g)object).e0 - f9.r.get((int)0).e0;
        }
        return n8;
    }

    private long L(f f8, f f9) {
        if (f9.p) {
            return f9.h;
        }
        Object object = this.n0;
        long l8 = object != null ? ((f)object).h : 0L;
        if (f8 != null) {
            int n8 = f8.r.size();
            object = c.I(f8, f9);
            if (object != null) {
                return f8.h + ((f.g)object).f0;
            }
            if ((long)n8 == f9.k - f8.k) {
                return f8.e();
            }
        }
        return l8;
    }

    private Uri M(Uri uri) {
        Object object = this.n0;
        Uri uri2 = uri;
        if (object != null) {
            uri2 = uri;
            if (((f)object).v.e) {
                object = ((f)object).t.get(uri);
                uri2 = uri;
                if (object != null) {
                    uri = uri.buildUpon();
                    uri.appendQueryParameter("_HLS_msn", String.valueOf(((f.e)object).b));
                    int n8 = ((f.e)object).c;
                    if (n8 != -1) {
                        uri.appendQueryParameter("_HLS_part", String.valueOf(n8));
                    }
                    uri2 = uri.build();
                }
            }
        }
        return uri2;
    }

    private boolean N(Uri uri) {
        List<i.b> list = this.l0.e;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (!uri.equals((Object)list.get((int)i8).a)) continue;
            return true;
        }
        return false;
    }

    private void O(Uri object) {
        c c8 = this.e0.get(object);
        object = c8.l();
        if (!c8.m()) {
            c8.A(true);
            if (object != null && !object.o) {
                c8.o(true);
            }
        }
    }

    private boolean P() {
        Uri uri = this.l0.e;
        int n8 = uri.size();
        long l8 = SystemClock.elapsedRealtime();
        for (int i8 = 0; i8 < n8; ++i8) {
            c c8 = a.e(this.e0.get(uri.get((int)i8).a));
            if (l8 <= c8.i0) continue;
            this.m0 = uri = c8.q;
            c8.s(this.M(uri));
            return true;
        }
        return false;
    }

    private void Q(Uri uri) {
        Object object;
        if (!(uri.equals((Object)this.m0) || !this.N(uri) || (object = this.n0) != null && ((f)object).o)) {
            this.m0 = uri;
            object = this.e0.get(uri);
            f f8 = ((c)object).e0;
            if (f8 != null && f8.o) {
                this.n0 = f8;
                this.k0.f(f8);
                return;
            }
            ((c)object).s(this.M(uri));
        }
    }

    private boolean R(Uri uri, m.c c8, boolean bl) {
        Iterator<m.b> iterator = this.f0.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= iterator.next().h(uri, c8, bl) ^ true;
        }
        return bl2;
    }

    private void W(Uri object, f f8) {
        if (object.equals((Object)this.m0)) {
            if (this.n0 == null) {
                this.o0 = f8.o ^ true;
                this.p0 = f8.h;
            }
            this.n0 = f8;
            this.k0.f(f8);
        }
        object = this.f0.iterator();
        while (object.hasNext()) {
            ((m.b)object.next()).f();
        }
    }

    static /* synthetic */ ax.m1.f v(c c8) {
        c8.getClass();
        return null;
    }

    public void S(p<j> p8, long l8, long l9, boolean bl) {
        y y8 = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
        this.d0.a(p8.a);
        this.h0.l(y8, 4);
    }

    public void T(p<j> p8, long l8, long l9) {
        j j8 = p8.e();
        boolean bl = j8 instanceof f;
        Object object = bl ? i.e(j8.a) : (i)j8;
        this.l0 = object;
        this.m0 = ((i)object).e.get((int)0).a;
        this.f0.add(new b(this));
        this.H(((i)object).d);
        object = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
        c c8 = this.e0.get(this.m0);
        if (bl) {
            c8.y((f)j8, (y)object);
        } else {
            c8.o(false);
        }
        this.d0.a(p8.a);
        this.h0.o((y)object, 4);
    }

    public o.c U(p<j> p8, long l8, long l9, IOException iOException, int n8) {
        B b8;
        y y8 = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
        l8 = this.d0.b(new m.c(y8, b8 = new B(p8.c), iOException, n8));
        boolean bl = l8 == -9223372036854775807L;
        this.h0.s(y8, p8.c, iOException, bl);
        if (bl) {
            this.d0.a(p8.a);
        }
        if (bl) {
            return o.g;
        }
        return o.g(false, l8);
    }

    public void V(p<j> p8, long l8, long l9, int n8) {
        y y8 = n8 == 0 ? new y(p8.a, p8.b, l8) : new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
        this.h0.u(y8, p8.c, n8);
    }

    @Override
    public boolean a(Uri uri) {
        return this.e0.get(uri).n();
    }

    @Override
    public void b(Uri object) {
        if ((object = this.e0.get(object)) != null) {
            ((c)object).A(false);
        }
    }

    @Override
    public void c(Uri uri) throws IOException {
        this.e0.get(uri).t();
    }

    @Override
    public void d(Uri object, N.a object2, m.e e8) {
        this.j0 = ax.S0.d0.A();
        this.h0 = object2;
        this.k0 = e8;
        object = new k.b().i((Uri)object);
        boolean bl = true;
        object = ((k.b)object).b(1).a();
        object = new p<j>(this.q.a(4), (k)object, 4, this.c0.b());
        if (this.i0 != null) {
            bl = false;
        }
        a.g(bl);
        this.i0 = object2 = new o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        ((o)object2).n(object, this, this.d0.c(((p)object).c));
    }

    @Override
    public long e() {
        return this.p0;
    }

    @Override
    public void f(m.b b8) {
        this.f0.remove(b8);
    }

    @Override
    public boolean g() {
        return this.o0;
    }

    @Override
    public i h() {
        return this.l0;
    }

    @Override
    public boolean i(Uri object, long l8) {
        if ((object = this.e0.get(object)) != null) {
            return ((c)object).h(l8) ^ true;
        }
        return false;
    }

    @Override
    public void l() throws IOException {
        o o8 = this.i0;
        if (o8 != null) {
            o8.j();
        }
        if ((o8 = this.m0) != null) {
            this.c((Uri)o8);
        }
    }

    @Override
    public void m(Uri uri) {
        this.e0.get(uri).o(true);
    }

    @Override
    public f n(Uri uri, boolean bl) {
        f f8 = this.e0.get(uri).l();
        if (f8 != null && bl) {
            this.Q(uri);
            this.O(uri);
        }
        return f8;
    }

    @Override
    public void o(m.b b8) {
        a.e(b8);
        this.f0.add(b8);
    }

    @Override
    public void stop() {
        this.m0 = null;
        this.n0 = null;
        this.l0 = null;
        this.p0 = -9223372036854775807L;
        this.i0.l();
        this.i0 = null;
        Iterator<c> iterator = this.e0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().z();
        }
        this.j0.removeCallbacksAndMessages(null);
        this.j0 = null;
        this.e0.clear();
    }

    private class b
    implements m.b {
        final c q;

        private b(c c8) {
            this.q = c8;
        }

        @Override
        public void f() {
            this.q.f0.remove(this);
        }

        @Override
        public boolean h(Uri object, m.c object2, boolean bl) {
            if (this.q.n0 == null) {
                long l8 = SystemClock.elapsedRealtime();
                Object object3 = ax.S0.d0.i(((c)this.q).l0).e;
                int n8 = 0;
                for (int i8 = 0; i8 < object3.size(); ++i8) {
                    c c8 = (c)this.q.e0.get(object3.get((int)i8).a);
                    int n9 = n8;
                    if (c8 != null) {
                        n9 = n8;
                        if (l8 < c8.i0) {
                            n9 = n8 + 1;
                        }
                    }
                    n8 = n9;
                }
                object3 = new m.a(1, 0, ((c)this.q).l0.e.size(), n8);
                object2 = this.q.d0.d((m.a)object3, (m.c)object2);
                if (object2 != null && ((m.b)object2).a == 2 && (object = (c)this.q.e0.get(object)) != null) {
                    ((c)object).h(((m.b)object2).b);
                }
            }
            return false;
        }
    }

    private final class c
    implements o.b<p<j>> {
        private final o c0;
        private final g d0;
        private f e0;
        private long f0;
        private long g0;
        private long h0;
        private long i0;
        private boolean j0;
        private IOException k0;
        private boolean l0;
        final c m0;
        private final Uri q;

        public c(c c8, Uri uri) {
            this.m0 = c8;
            this.q = uri;
            this.c0 = new o("DefaultHlsPlaylistTracker:MediaPlaylist");
            this.d0 = c8.q.a(4);
        }

        public static /* synthetic */ void a(c c8, Uri uri) {
            c8.j0 = false;
            c8.q(uri);
        }

        private boolean h(long l8) {
            this.i0 = SystemClock.elapsedRealtime() + l8;
            return this.q.equals((Object)this.m0.m0) && !this.m0.P();
        }

        private Uri i() {
            Object object = this.e0;
            if (object != null) {
                object = ((f)object).v;
                if (((f.h)object).a != -9223372036854775807L || ((f.h)object).e) {
                    Uri.Builder builder = this.q.buildUpon();
                    object = this.e0;
                    if (((f)object).v.e) {
                        builder.appendQueryParameter("_HLS_msn", String.valueOf(((f)object).k + (long)((f)object).r.size()));
                        object = this.e0;
                        if (((f)object).n != -9223372036854775807L) {
                            int n8;
                            object = ((f)object).s;
                            int n9 = n8 = object.size();
                            if (!object.isEmpty()) {
                                n9 = n8;
                                if (F.e(object).n0) {
                                    n9 = n8 - 1;
                                }
                            }
                            builder.appendQueryParameter("_HLS_part", String.valueOf(n9));
                        }
                    }
                    object = this.e0.v;
                    if (((f.h)object).a != -9223372036854775807L) {
                        object = ((f.h)object).b ? "v2" : "YES";
                        builder.appendQueryParameter("_HLS_skip", (String)object);
                    }
                    return builder.build();
                }
            }
            return this.q;
        }

        private void q(Uri object) {
            p.a<j> a8 = this.m0.c0.a(this.m0.l0, this.e0);
            object = new k.b().i((Uri)object).b(1).a();
            c.v(this.m0);
            object = new p<j>(this.d0, (k)object, 4, a8);
            this.c0.n(object, this, this.m0.d0.c(object.c));
        }

        private void s(Uri uri) {
            this.i0 = 0L;
            if (!(this.j0 || this.c0.i() || this.c0.h())) {
                long l8 = SystemClock.elapsedRealtime();
                if (l8 < this.h0) {
                    this.j0 = true;
                    this.m0.j0.postDelayed((Runnable)new d(this, uri), this.h0 - l8);
                    return;
                }
                this.q(uri);
            }
        }

        private void y(f object, y y8) {
            long l8;
            f f8;
            long l9;
            f f9 = this.e0;
            this.f0 = l9 = SystemClock.elapsedRealtime();
            this.e0 = f8 = this.m0.J(f9, (f)object);
            Object var17_6 = null;
            if (f8 != f9) {
                this.k0 = null;
                this.g0 = l9;
                this.m0.W(this.q, f8);
            } else if (!f8.o) {
                boolean bl;
                long l10 = ((f)object).k;
                l8 = ((f)object).r.size();
                object = this.e0;
                if (l10 + l8 < ((f)object).k) {
                    object = new m.c(this.q);
                    bl = true;
                } else {
                    double d8 = l9 - this.g0;
                    double d9 = ax.S0.d0.E1(((f)object).m);
                    double d10 = this.m0.g0;
                    boolean bl2 = false;
                    object = var17_6;
                    bl = bl2;
                    if (d8 > d9 * d10) {
                        object = new m.d(this.q);
                        bl = bl2;
                    }
                }
                if (object != null) {
                    this.k0 = object;
                    this.m0.R(this.q, new m.c(y8, new B(4), (IOException)object, 1), bl);
                }
            }
            object = this.e0;
            l8 = !((f)object).v.e ? (object != f9 ? ((f)object).m : ((f)object).m / 2L) : (object == f9 ? ((l8 = ((f)object).n) != -9223372036854775807L ? (l8 /= 2L) : ((f)object).m / 2L) : 0L);
            this.h0 = l9 + ax.S0.d0.E1(l8) - y8.f;
            if (!this.e0.o && (this.q.equals((Object)this.m0.m0) || this.l0)) {
                this.s(this.i());
            }
        }

        public void A(boolean bl) {
            this.l0 = bl;
        }

        public f l() {
            return this.e0;
        }

        public boolean m() {
            return this.l0;
        }

        public boolean n() {
            int n8;
            if (this.e0 == null) {
                return false;
            }
            long l8 = SystemClock.elapsedRealtime();
            long l9 = Math.max(30000L, ax.S0.d0.E1(this.e0.u));
            f f8 = this.e0;
            return f8.o || (n8 = f8.d) == 2 || n8 == 1 || this.f0 + l9 > l8;
            {
            }
        }

        public void o(boolean bl) {
            Uri uri = bl ? this.i() : this.q;
            this.s(uri);
        }

        public void t() throws IOException {
            this.c0.j();
            IOException iOException = this.k0;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        public void u(p<j> p8, long l8, long l9, boolean bl) {
            y y8 = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
            this.m0.d0.a(p8.a);
            this.m0.h0.l(y8, 4);
        }

        public void v(p<j> p8, long l8, long l9) {
            j j8 = p8.e();
            y y8 = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
            if (j8 instanceof f) {
                this.y((f)j8, y8);
                this.m0.h0.o(y8, 4);
            } else {
                this.k0 = E.c("Loaded playlist has unexpected type.", null);
                this.m0.h0.s(y8, 4, this.k0, true);
            }
            this.m0.d0.a(p8.a);
        }

        public o.c w(p<j> p8, long l8, long l9, IOException iOException, int n8) {
            y y8;
            block5: {
                Object object;
                boolean bl;
                block4: {
                    y8 = new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
                    int n9 = p8.f().getQueryParameter("_HLS_msn") != null ? 1 : 0;
                    bl = iOException instanceof k.a;
                    if (n9 == 0 && !bl) break block4;
                    n9 = iOException instanceof u ? ((u)iOException).e0 : Integer.MAX_VALUE;
                    if (bl || n9 == 400 || n9 == 503) break block5;
                }
                object = this.m0.R(this.q, (m.c)(object = new m.c(y8, new B(p8.c), iOException, n8)), false) ? ((l8 = this.m0.d0.b((m.c)object)) != -9223372036854775807L ? o.g(false, l8) : o.g) : o.f;
                bl = ((o.c)object).c();
                this.m0.h0.s(y8, p8.c, iOException, bl ^ true);
                if (!bl) {
                    this.m0.d0.a(p8.a);
                }
                return object;
            }
            this.h0 = SystemClock.elapsedRealtime();
            this.o(false);
            ax.S0.d0.i(this.m0.h0).s(y8, p8.c, iOException, true);
            return o.f;
        }

        public void x(p<j> p8, long l8, long l9, int n8) {
            y y8 = n8 == 0 ? new y(p8.a, p8.b, l8) : new y(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.b());
            this.m0.h0.u(y8, p8.c, n8);
        }

        public void z() {
            this.c0.l();
        }
    }
}

