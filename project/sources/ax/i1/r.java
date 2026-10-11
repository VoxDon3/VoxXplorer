package ax.i1;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.U0.g;
import ax.U0.l;
import ax.i1.C2216f;
import ax.i1.C2231v;
import ax.i1.InterfaceC2209F;
import ax.i1.Z;
import ax.i1.j0;
import ax.i1.r;
import ax.m1.f;
import ax.q1.C2854n;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import ax.r7.AbstractC2991z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements O {
    private final a a;
    private g.a b;
    private t.a c;
    private InterfaceC2209F.a d;
    private InterfaceC2229t e;
    private ax.m1.m f;
    private long g;
    private long h;
    private long i;
    private float j;
    private float k;
    private boolean l;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final InterfaceC2863x a;
        private g.a d;
        private t.a f;
        private int g;
        private f.a h;
        private ax.b1.z i;
        private ax.m1.m j;
        private final Map<Integer, ax.q7.u<InterfaceC2209F.a>> b = new HashMap();
        private final Map<Integer, InterfaceC2209F.a> c = new HashMap();
        private boolean e = true;

        public a(InterfaceC2863x interfaceC2863x, t.a aVar) {
            this.a = interfaceC2863x;
            this.f = aVar;
        }

        public static /* synthetic */ InterfaceC2209F.a c(a aVar, g.a aVar2) {
            return new Z.b(aVar2, aVar.a);
        }

        private ax.q7.u<InterfaceC2209F.a> g(int i) throws ClassNotFoundException {
            ax.q7.u<InterfaceC2209F.a> uVar;
            ax.q7.u<InterfaceC2209F.a> uVar2;
            ax.q7.u<InterfaceC2209F.a> uVar3 = this.b.get(Integer.valueOf(i));
            if (uVar3 != null) {
                return uVar3;
            }
            final g.a aVar = (g.a) C0968a.e(this.d);
            if (i == 0) {
                final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC2209F.a.class);
                uVar = new ax.q7.u() { // from class: ax.i1.m
                    @Override // ax.q7.u
                    public final Object get() {
                        InterfaceC2209F.a p;
                        p = r.p(asSubclass, aVar);
                        return p;
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC2209F.a.class);
                uVar = new ax.q7.u() { // from class: ax.i1.n
                    @Override // ax.q7.u
                    public final Object get() {
                        InterfaceC2209F.a p;
                        p = r.p(asSubclass2, aVar);
                        return p;
                    }
                };
            } else {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC2209F.a.class);
                        uVar2 = new ax.q7.u() { // from class: ax.i1.p
                            @Override // ax.q7.u
                            public final Object get() {
                                InterfaceC2209F.a o;
                                o = r.o(asSubclass3);
                                return o;
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i);
                        }
                        uVar2 = new ax.q7.u() { // from class: ax.i1.q
                            @Override // ax.q7.u
                            public final Object get() {
                                return r.a.c(r.a.this, aVar);
                            }
                        };
                    }
                    this.b.put(Integer.valueOf(i), uVar2);
                    return uVar2;
                }
                final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(InterfaceC2209F.a.class);
                uVar = new ax.q7.u() { // from class: ax.i1.o
                    @Override // ax.q7.u
                    public final Object get() {
                        InterfaceC2209F.a p;
                        p = r.p(asSubclass4, aVar);
                        return p;
                    }
                };
            }
            uVar2 = uVar;
            this.b.put(Integer.valueOf(i), uVar2);
            return uVar2;
        }

        public InterfaceC2209F.a f(int i) throws ClassNotFoundException {
            InterfaceC2209F.a aVar = this.c.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC2209F.a aVar2 = g(i).get();
            f.a aVar3 = this.h;
            if (aVar3 != null) {
                aVar2.d(aVar3);
            }
            ax.b1.z zVar = this.i;
            if (zVar != null) {
                aVar2.f(zVar);
            }
            ax.m1.m mVar = this.j;
            if (mVar != null) {
                aVar2.g(mVar);
            }
            aVar2.a(this.f);
            aVar2.c(this.e);
            aVar2.b(this.g);
            this.c.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        public void h(f.a aVar) {
            this.h = aVar;
            Iterator<InterfaceC2209F.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        public void i(int i) {
            this.g = i;
            this.a.b(i);
        }

        public void j(g.a aVar) {
            if (aVar != this.d) {
                this.d = aVar;
                this.b.clear();
                this.c.clear();
            }
        }

        public void k(ax.b1.z zVar) {
            this.i = zVar;
            Iterator<InterfaceC2209F.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().f(zVar);
            }
        }

        public void l(int i) {
            InterfaceC2863x interfaceC2863x = this.a;
            if (interfaceC2863x instanceof C2854n) {
                ((C2854n) interfaceC2863x).n(i);
            }
        }

        public void m(ax.m1.m mVar) {
            this.j = mVar;
            Iterator<InterfaceC2209F.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().g(mVar);
            }
        }

        public void n(boolean z) {
            this.e = z;
            this.a.d(z);
            Iterator<InterfaceC2209F.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().c(z);
            }
        }

        public void o(t.a aVar) {
            this.f = aVar;
            this.a.a(aVar);
            Iterator<InterfaceC2209F.a> it = this.c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public r(Context context, InterfaceC2863x interfaceC2863x) {
        this(new l.a(context), interfaceC2863x);
    }

    public static /* synthetic */ ax.q1.r[] h(r rVar, C0912v c0912v) {
        return new ax.q1.r[]{rVar.c.b(c0912v) ? new ax.N1.o(rVar.c.c(c0912v), null) : new b(c0912v)};
    }

    private static InterfaceC2209F m(C0915y c0915y, InterfaceC2209F interfaceC2209F) {
        C0915y.d dVar = c0915y.f;
        return (dVar.b == 0 && dVar.d == Long.MIN_VALUE && !dVar.f) ? interfaceC2209F : new C2216f.b(interfaceC2209F).n(c0915y.f.b).l(c0915y.f.d).k(!c0915y.f.g).i(c0915y.f.e).m(c0915y.f.f).j(c0915y.f.h).h();
    }

    private InterfaceC2209F n(C0915y c0915y, InterfaceC2209F interfaceC2209F) {
        C0968a.e(c0915y.b);
        c0915y.b.getClass();
        return interfaceC2209F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2209F.a o(Class<? extends InterfaceC2209F.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2209F.a p(Class<? extends InterfaceC2209F.a> cls, g.a aVar) {
        try {
            return cls.getConstructor(g.a.class).newInstance(aVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // ax.i1.InterfaceC2209F.a
    public InterfaceC2209F e(C0915y c0915y) {
        C0968a.e(c0915y.b);
        String scheme = c0915y.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC2209F.a) C0968a.e(this.d)).e(c0915y);
        }
        if (Objects.equals(c0915y.b.b, "application/x-image-uri")) {
            return new C2231v.b(ax.S0.d0.a1(c0915y.b.i), (InterfaceC2229t) C0968a.e(this.e)).e(c0915y);
        }
        C0915y.h hVar = c0915y.b;
        int E0 = ax.S0.d0.E0(hVar.a, hVar.b);
        if (c0915y.b.i != -9223372036854775807L) {
            this.a.l(1);
        }
        try {
            InterfaceC2209F.a f = this.a.f(E0);
            C0915y.g.a a2 = c0915y.d.a();
            if (c0915y.d.a == -9223372036854775807L) {
                a2.k(this.g);
            }
            if (c0915y.d.d == -3.4028235E38f) {
                a2.j(this.j);
            }
            if (c0915y.d.e == -3.4028235E38f) {
                a2.h(this.k);
            }
            if (c0915y.d.b == -9223372036854775807L) {
                a2.i(this.h);
            }
            if (c0915y.d.c == -9223372036854775807L) {
                a2.g(this.i);
            }
            C0915y.g f2 = a2.f();
            if (!f2.equals(c0915y.d)) {
                c0915y = c0915y.a().b(f2).a();
            }
            InterfaceC2209F e = f.e(c0915y);
            AbstractC2991z<C0915y.k> abstractC2991z = ((C0915y.h) ax.S0.d0.i(c0915y.b)).f;
            if (!abstractC2991z.isEmpty()) {
                InterfaceC2209F[] interfaceC2209FArr = new InterfaceC2209F[abstractC2991z.size() + 1];
                interfaceC2209FArr[0] = e;
                for (int i = 0; i < abstractC2991z.size(); i++) {
                    if (this.l) {
                        final C0912v P = new C0912v.b().y0(abstractC2991z.get(i).b).n0(abstractC2991z.get(i).c).A0(abstractC2991z.get(i).d).w0(abstractC2991z.get(i).e).l0(abstractC2991z.get(i).f).j0(abstractC2991z.get(i).g).P();
                        Z.b bVar = new Z.b(this.b, new InterfaceC2863x() { // from class: ax.i1.l
                            @Override // ax.q1.InterfaceC2863x
                            public /* synthetic */ InterfaceC2863x a(t.a aVar) {
                                return C2862w.d(this, aVar);
                            }

                            @Override // ax.q1.InterfaceC2863x
                            public /* synthetic */ InterfaceC2863x b(int i2) {
                                return C2862w.b(this, i2);
                            }

                            @Override // ax.q1.InterfaceC2863x
                            public final ax.q1.r[] c() {
                                return r.h(r.this, P);
                            }

                            @Override // ax.q1.InterfaceC2863x
                            public /* synthetic */ InterfaceC2863x d(boolean z) {
                                return C2862w.c(this, z);
                            }

                            @Override // ax.q1.InterfaceC2863x
                            public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
                                return C2862w.a(this, uri, map);
                            }
                        });
                        if (this.c.b(P)) {
                            P = P.b().y0("application/x-media3-cues").U(P.o).Y(this.c.a(P)).P();
                        }
                        Z.b j = bVar.j(0, P);
                        ax.m1.m mVar = this.f;
                        if (mVar != null) {
                            j.g(mVar);
                        }
                        interfaceC2209FArr[i + 1] = j.e(C0915y.c(abstractC2991z.get(i).a.toString()));
                    } else {
                        j0.b bVar2 = new j0.b(this.b);
                        ax.m1.m mVar2 = this.f;
                        if (mVar2 != null) {
                            bVar2.b(mVar2);
                        }
                        interfaceC2209FArr[i + 1] = bVar2.a(abstractC2991z.get(i), -9223372036854775807L);
                    }
                }
                e = new S(interfaceC2209FArr);
            }
            return n(c0915y, m(c0915y, e));
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // ax.i1.InterfaceC2209F.a
    @Deprecated
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public r c(boolean z) {
        this.l = z;
        this.a.n(z);
        return this;
    }

    @Override // ax.i1.InterfaceC2209F.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public r b(int i) {
        this.a.i(i);
        return this;
    }

    @Override // ax.i1.InterfaceC2209F.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public r d(f.a aVar) {
        this.a.h((f.a) C0968a.e(aVar));
        return this;
    }

    @Override // ax.i1.InterfaceC2209F.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public r f(ax.b1.z zVar) {
        this.a.k((ax.b1.z) C0968a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // ax.i1.InterfaceC2209F.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public r g(ax.m1.m mVar) {
        this.f = (ax.m1.m) C0968a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.a.m(mVar);
        return this;
    }

    @Override // ax.i1.InterfaceC2209F.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public r a(t.a aVar) {
        this.c = (t.a) C0968a.e(aVar);
        this.a.o(aVar);
        return this;
    }

    public r(g.a aVar, InterfaceC2863x interfaceC2863x) {
        this.b = aVar;
        ax.N1.h hVar = new ax.N1.h();
        this.c = hVar;
        a aVar2 = new a(interfaceC2863x, hVar);
        this.a = aVar2;
        aVar2.j(aVar);
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.j = -3.4028235E38f;
        this.k = -3.4028235E38f;
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements ax.q1.r {
        private final C0912v a;

        public b(C0912v c0912v) {
            this.a = c0912v;
        }

        @Override // ax.q1.r
        public void a(InterfaceC2859t interfaceC2859t) {
            ax.q1.U u = interfaceC2859t.u(0, 3);
            interfaceC2859t.h(new N.b(-9223372036854775807L));
            interfaceC2859t.o();
            u.e(this.a.b().y0("text/x-unknown").U(this.a.o).P());
        }

        @Override // ax.q1.r
        public boolean c(InterfaceC2858s interfaceC2858s) {
            return true;
        }

        @Override // ax.q1.r
        public /* synthetic */ ax.q1.r e() {
            return C2857q.b(this);
        }

        @Override // ax.q1.r
        public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
            return interfaceC2858s.a(SubsamplingScaleImageView.TILE_SIZE_AUTO) == -1 ? -1 : 0;
        }

        @Override // ax.q1.r
        public /* synthetic */ List k() {
            return C2857q.a(this);
        }

        @Override // ax.q1.r
        public void d() {
        }

        @Override // ax.q1.r
        public void b(long j, long j2) {
        }
    }
}
