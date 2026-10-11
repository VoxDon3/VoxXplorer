/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.content.Context;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import ax.N1.h;
import ax.N1.t;
import ax.P0.v;
import ax.P0.y;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.l;
import ax.b1.z;
import ax.i1.F;
import ax.i1.O;
import ax.i1.S;
import ax.i1.Z;
import ax.i1.f;
import ax.i1.j0;
import ax.i1.l;
import ax.i1.m;
import ax.i1.n;
import ax.i1.o;
import ax.i1.p;
import ax.i1.q;
import ax.i1.t;
import ax.i1.v;
import ax.m1.f;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.s;
import ax.q1.x;
import ax.q7.u;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r
implements O {
    private final a a;
    private g.a b;
    private t.a c;
    private F.a d;
    private t e;
    private ax.m1.m f;
    private long g;
    private long h;
    private long i;
    private float j;
    private float k;
    private boolean l;

    public r(Context context, x x8) {
        this(new l.a(context), x8);
    }

    public r(g.a a8, x object) {
        this.b = a8;
        h h8 = new h();
        this.c = h8;
        this.a = object = new a((x)object, h8);
        ((a)object).j(a8);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
        this.l = true;
    }

    public static /* synthetic */ ax.q1.r[] h(r object, v v8) {
        object = ((r)object).c.b(v8) ? new ax.N1.o(((r)object).c.c(v8), null) : new b(v8);
        return new ax.q1.r[]{object};
    }

    private static F m(y y8, F f8) {
        y.d d8 = y8.f;
        if (d8.b == 0L && d8.d == Long.MIN_VALUE && !d8.f) {
            return f8;
        }
        return new f.b(f8).n(y8.f.b).l(y8.f.d).k(y8.f.g ^ true).i(y8.f.e).m(y8.f.f).j(y8.f.h).h();
    }

    private F n(y y8, F f8) {
        ax.S0.a.e(y8.b);
        y8.b.getClass();
        return f8;
    }

    private static F.a o(Class<? extends F.a> object) {
        try {
            object = ((Class)object).getConstructor(null).newInstance(null);
            return object;
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
    }

    private static F.a p(Class<? extends F.a> object, g.a a8) {
        try {
            object = ((Class)object).getConstructor(g.a.class).newInstance(a8);
            return object;
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
    }

    @Override
    public F e(y object) {
        Object object2;
        int n8;
        Object object3;
        block16: {
            ax.S0.a.e(((y)object).b);
            object3 = ((y)object).b.a.getScheme();
            if (object3 != null && ((String)object3).equals("ssai")) {
                return ax.S0.a.e(this.d).e((y)object);
            }
            if (j.Objects.equals((Object)((y)object).b.b, (Object)"application/x-image-uri")) {
                return new v.b(d0.a1(((y)object).b.i), ax.S0.a.e(this.e)).h((y)object);
            }
            object3 = ((y)object).b;
            n8 = d0.E0(((y.h)object3).a, ((y.h)object3).b);
            if (((y)object).b.i != -9223372036854775807L) {
                this.a.l(1);
            }
            try {
                object2 = this.a.f(n8);
                object3 = ((y)object).d.a();
                if (((y)object).d.a != -9223372036854775807L) break block16;
                ((y.g.a)object3).k(this.g);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException(classNotFoundException);
            }
        }
        if (((y)object).d.d == -3.4028235E38f) {
            ((y.g.a)object3).j(this.j);
        }
        if (((y)object).d.e == -3.4028235E38f) {
            ((y.g.a)object3).h(this.k);
        }
        if (((y)object).d.b == -9223372036854775807L) {
            ((y.g.a)object3).i(this.h);
        }
        if (((y)object).d.c == -9223372036854775807L) {
            ((y.g.a)object3).g(this.i);
        }
        Object object4 = ((y.g.a)object3).f();
        object3 = object;
        if (!((y.g)object4).equals(((y)object).d)) {
            object3 = ((y)object).a().b((y.g)object4).a();
        }
        object2 = object2.e((y)object3);
        object4 = d0.i(((y)object3).b).f;
        object = object2;
        if (!object4.isEmpty()) {
            F[] fArray = new F[object4.size() + 1];
            fArray[0] = object2;
            for (n8 = 0; n8 < object4.size(); ++n8) {
                if (this.l) {
                    object2 = new v.b().y0(((y.k)object4.get((int)n8)).b).n0(((y.k)object4.get((int)n8)).c).A0(((y.k)object4.get((int)n8)).d).w0(((y.k)object4.get((int)n8)).e).l0(((y.k)object4.get((int)n8)).f).j0(((y.k)object4.get((int)n8)).g).P();
                    object = new l(this, (v)object2);
                    Z.b b8 = new Z.b(this.b, (x)object);
                    object = object2;
                    if (this.c.b((v)object2)) {
                        object = ((v)object2).b().y0("application/x-media3-cues").U(((v)object2).o).Y(this.c.a((v)object2)).P();
                    }
                    object2 = b8.j(0, (v)object);
                    object = this.f;
                    if (object != null) {
                        ((Z.b)object2).l((ax.m1.m)object);
                    }
                    fArray[n8 + 1] = ((Z.b)object2).i(y.c(((y.k)object4.get((int)n8)).a.toString()));
                    continue;
                }
                object = new j0.b(this.b);
                object2 = this.f;
                if (object2 != null) {
                    ((j0.b)object).b((ax.m1.m)object2);
                }
                fArray[n8 + 1] = ((j0.b)object).a((y.k)object4.get(n8), -9223372036854775807L);
            }
            object = new S(fArray);
        }
        return this.n((y)object3, r.m((y)object3, (F)object));
    }

    @Deprecated
    public r k(boolean bl) {
        this.l = bl;
        this.a.n(bl);
        return this;
    }

    public r l(int n8) {
        this.a.i(n8);
        return this;
    }

    public r q(f.a a8) {
        this.a.h(ax.S0.a.e(a8));
        return this;
    }

    public r r(z z8) {
        this.a.k(ax.S0.a.f(z8, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    public r s(ax.m1.m m8) {
        this.f = ax.S0.a.f(m8, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.a.m(m8);
        return this;
    }

    public r t(t.a a8) {
        this.c = ax.S0.a.e(a8);
        this.a.o(a8);
        return this;
    }

    private static final class a {
        private final x a;
        private final Map<Integer, u<F.a>> b;
        private final Map<Integer, F.a> c;
        private g.a d;
        private boolean e;
        private t.a f;
        private int g;
        private f.a h;
        private z i;
        private ax.m1.m j;

        public a(x x8, t.a a8) {
            this.a = x8;
            this.f = a8;
            this.b = new HashMap<Integer, u<F.a>>();
            this.c = new HashMap<Integer, F.a>();
            this.e = true;
        }

        public static /* synthetic */ F.a a(Class clazz, g.a a8) {
            return r.p(clazz, a8);
        }

        public static /* synthetic */ F.a b(Class clazz) {
            return r.o(clazz);
        }

        public static /* synthetic */ F.a c(a a8, g.a a9) {
            return new Z.b(a9, a8.a);
        }

        public static /* synthetic */ F.a d(Class clazz, g.a a8) {
            return r.p(clazz, a8);
        }

        public static /* synthetic */ F.a e(Class clazz, g.a a8) {
            return r.p(clazz, a8);
        }

        /*
         * Enabled aggressive block sorting
         */
        private u<F.a> g(int n8) throws ClassNotFoundException {
            u<F.a> u8;
            block6: {
                block7: {
                    block8: {
                        u8 = this.b.get(n8);
                        if (u8 != null) {
                            return u8;
                        }
                        u8 = ax.S0.a.e(this.d);
                        if (n8 == 0) break block7;
                        if (n8 == 1) break block8;
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    u8 = new StringBuilder();
                                    ((StringBuilder)((Object)u8)).append("Unrecognized contentType: ");
                                    ((StringBuilder)((Object)u8)).append(n8);
                                    throw new IllegalArgumentException(((StringBuilder)((Object)u8)).toString());
                                }
                                u8 = new q(this, (g.a)((Object)u8));
                                break block6;
                            } else {
                                u8 = new p(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(F.a.class));
                            }
                            break block6;
                        } else {
                            u8 = new o(HlsMediaSource.Factory.class.asSubclass(F.a.class), (g.a)((Object)u8));
                        }
                        break block6;
                    }
                    u8 = new n(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(F.a.class), (g.a)((Object)u8));
                    break block6;
                }
                u8 = new m(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(F.a.class), (g.a)((Object)u8));
            }
            this.b.put(n8, u8);
            return u8;
        }

        public F.a f(int n8) throws ClassNotFoundException {
            F.a a8 = this.c.get(n8);
            if (a8 != null) {
                return a8;
            }
            a8 = this.g(n8).get();
            Object object = this.h;
            if (object != null) {
                a8.d((f.a)object);
            }
            if ((object = this.i) != null) {
                a8.f((z)object);
            }
            if ((object = this.j) != null) {
                a8.g((ax.m1.m)object);
            }
            a8.a(this.f);
            a8.c(this.e);
            a8.b(this.g);
            this.c.put(n8, a8);
            return a8;
        }

        public void h(f.a a8) {
            this.h = a8;
            Iterator<F.a> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().d(a8);
            }
        }

        public void i(int n8) {
            this.g = n8;
            this.a.b(n8);
        }

        public void j(g.a a8) {
            if (a8 != this.d) {
                this.d = a8;
                this.b.clear();
                this.c.clear();
            }
        }

        public void k(z z8) {
            this.i = z8;
            Iterator<F.a> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().f(z8);
            }
        }

        public void l(int n8) {
            x x8 = this.a;
            if (x8 instanceof ax.q1.n) {
                ((ax.q1.n)x8).n(n8);
            }
        }

        public void m(ax.m1.m m8) {
            this.j = m8;
            Iterator<F.a> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().g(m8);
            }
        }

        public void n(boolean bl) {
            this.e = bl;
            this.a.d(bl);
            Iterator<F.a> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().c(bl);
            }
        }

        public void o(t.a a8) {
            this.f = a8;
            this.a.a(a8);
            Iterator<F.a> iterator = this.c.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().a(a8);
            }
        }
    }

    private static final class b
    implements ax.q1.r {
        private final v a;

        public b(v v8) {
            this.a = v8;
        }

        @Override
        public void a(ax.q1.t t8) {
            U u8 = t8.u(0, 3);
            t8.h(new N.b(-9223372036854775807L));
            t8.o();
            u8.e(this.a.b().y0("text/x-unknown").U(this.a.o).P());
        }

        @Override
        public void b(long l8, long l9) {
        }

        @Override
        public boolean c(s s8) {
            return true;
        }

        @Override
        public void d() {
        }

        @Override
        public /* synthetic */ ax.q1.r e() {
            return ax.q1.q.b(this);
        }

        @Override
        public int f(s s8, M m8) throws IOException {
            if (s8.a(Integer.MAX_VALUE) == -1) {
                return -1;
            }
            return 0;
        }

        public /* synthetic */ List k() {
            return ax.q1.q.a(this);
        }
    }
}

