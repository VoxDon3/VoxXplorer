package ax.o1;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import ax.P0.C0901j;
import ax.P0.C0912v;
import ax.P0.InterfaceC0904m;
import ax.P0.W;
import ax.P0.Y;
import ax.P0.Z;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.C0983p;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;
import ax.S0.d0;
import ax.o1.C2679s;
import ax.o1.S;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: ax.o1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2679s implements Z.b {
    private static final Executor B = new Executor() { // from class: ax.o1.q
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2679s.a(runnable);
        }
    };
    private int A;
    private final Context a;
    private final Z.a b;
    private final SparseArray<d> c;
    private final boolean d;
    private final S e;
    private final S.b f;
    private final InterfaceC0975h g;
    private final CopyOnWriteArraySet<e> h;
    private ax.S0.L<h> i;
    private C0912v j;
    private W k;
    private AbstractC2991z<Object> l;
    private InterfaceC0984q m;
    private Z n;
    private z o;
    private boolean p;
    private boolean q;
    private long r;
    private int s;
    private Pair<Surface, ax.S0.I> t;
    private int u;
    private int v;
    private long w;
    private long x;
    private boolean y;
    private int z;

    /* renamed from: ax.o1.s$a */
    class a implements S.b {
        a() {
        }

        @Override // ax.o1.S.b
        public void a(long j) {
            ((Z) C0968a.i(C2679s.this.n)).n(j);
        }

        @Override // ax.o1.S.b
        public void b() {
            ((Z) C0968a.i(C2679s.this.n)).n(-2L);
        }
    }

    /* renamed from: ax.o1.s$b */
    public static final class b {
        private final Context a;
        private final C2656A b;
        private Z.a c;
        private boolean d;
        private InterfaceC0975h e = InterfaceC0975h.a;
        private boolean f;
        private boolean g;

        public b(Context context, C2656A c2656a) {
            this.a = context.getApplicationContext();
            this.b = c2656a;
        }

        public C2679s f() {
            C0968a.g(!this.f);
            if (this.c == null) {
                this.c = new g(this.g);
            }
            C2679s c2679s = new C2679s(this, null);
            this.f = true;
            return c2679s;
        }

        public b g(InterfaceC0975h interfaceC0975h) {
            this.e = interfaceC0975h;
            return this;
        }

        public b h(boolean z) {
            this.d = z;
            return this;
        }
    }

    /* renamed from: ax.o1.s$c */
    private final class c implements S.a {
        private c() {
        }

        @Override // ax.o1.S.a
        public void a(a0 a0Var) {
            Iterator it = C2679s.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a0Var);
            }
        }

        @Override // ax.o1.S.a
        public /* synthetic */ void b() {
            Q.b(this);
        }

        @Override // ax.o1.S.a
        public void e() {
            Iterator it = C2679s.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).e();
            }
        }

        @Override // ax.o1.S.a
        public void f() {
            Iterator it = C2679s.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).f();
            }
        }

        /* synthetic */ c(C2679s c2679s, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.o1.s$d */
    final class d implements S, e {
        private final int a;
        private final int b;
        private C0912v d;
        private int e;
        private long f;
        private boolean j;
        private boolean k;
        private AbstractC2991z<Object> c = AbstractC2991z.z();
        private long g = -9223372036854775807L;
        private S.a h = S.a.a;
        private Executor i = C2679s.B;

        public d(Context context, int i) {
            this.b = i;
            this.a = d0.g0(context);
        }

        private void C(C0912v c0912v) {
            ((Z) C0968a.e(C2679s.this.n)).p(this.b, this.e == 1 ? 1 : 2, c0912v.b().V(C2679s.this.E(c0912v.E)).P(), this.c, 0L);
        }

        @Override // ax.o1.S
        public void A() {
            if (C2679s.this.i.l() == 0) {
                C2679s.this.B();
                return;
            }
            ax.S0.L l = new ax.S0.L();
            boolean z = true;
            while (C2679s.this.i.l() > 0) {
                h hVar = (h) C0968a.e((h) C2679s.this.i.i());
                if (z) {
                    int i = hVar.b;
                    if (i == 0 || i == 1) {
                        hVar = new h(hVar.a, 0, hVar.c);
                    } else {
                        C2679s.this.B();
                    }
                    z = false;
                }
                l.a(hVar.c, hVar);
            }
            C2679s.this.i = l;
        }

        @Override // ax.o1.C2679s.e
        public void a(final a0 a0Var) {
            final S.a aVar = this.h;
            this.i.execute(new Runnable() { // from class: ax.o1.v
                @Override // java.lang.Runnable
                public final void run() {
                    S.a.this.a(a0Var);
                }
            });
        }

        @Override // ax.o1.S
        public boolean b() {
            return this.k;
        }

        @Override // ax.o1.S
        public boolean c() {
            return b() && C2679s.this.G();
        }

        @Override // ax.o1.S
        public void d() {
            C2679s.this.N();
        }

        @Override // ax.o1.C2679s.e
        public void e() {
            final S.a aVar = this.h;
            Executor executor = this.i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: ax.o1.u
                @Override // java.lang.Runnable
                public final void run() {
                    S.a.this.e();
                }
            });
        }

        @Override // ax.o1.C2679s.e
        public void f() {
            final S.a aVar = this.h;
            Executor executor = this.i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: ax.o1.t
                @Override // java.lang.Runnable
                public final void run() {
                    S.a.this.f();
                }
            });
        }

        @Override // ax.o1.S
        public void g(float f) {
            if (this.b == 0) {
                C2679s.this.R(f);
            }
        }

        @Override // ax.o1.S
        public void h() {
            if (b()) {
                boolean z = this.j;
                long j = C2679s.this.w;
                C2679s.this.D(false);
                ((Z) C0968a.e(C2679s.this.n)).h();
                C2679s.this.w = j;
                if (z) {
                    q();
                }
            }
        }

        @Override // ax.o1.S
        public void i(long j, long j2) throws S.c {
            C2679s.this.O(j + this.f, j2);
        }

        @Override // ax.o1.S
        public Surface j() {
            C0968a.g(b());
            return ((Z) C0968a.e(C2679s.this.n)).m(this.b);
        }

        @Override // ax.o1.S
        public boolean k(long j, S.b bVar) {
            C0968a.g(b());
            if (!C2679s.this.U() || ((Z) C0968a.e(C2679s.this.n)).j(this.b) >= this.a || !((Z) C0968a.e(C2679s.this.n)).i(this.b)) {
                return false;
            }
            long j2 = j + this.f;
            this.g = j2;
            bVar.a(j2 * 1000);
            return true;
        }

        @Override // ax.o1.S
        public void l() {
            if (C2679s.this.d) {
                C2679s.this.X();
            }
        }

        @Override // ax.o1.S
        public void m(S.a aVar, Executor executor) {
            this.h = aVar;
            this.i = executor;
        }

        @Override // ax.o1.S
        public void n() {
            if (C2679s.this.d) {
                C2679s.this.W();
            }
        }

        @Override // ax.o1.S
        public void o(long j) {
            this.f = j;
        }

        @Override // ax.o1.S
        public void p(z zVar) {
            if (this.b == 0) {
                C2679s.this.T(zVar);
            }
        }

        @Override // ax.o1.S
        public void q() {
            C2679s.this.x = this.g;
            if (C2679s.this.w >= C2679s.this.x) {
                C2679s.this.V();
            }
        }

        @Override // ax.o1.S
        public void r(int i, C0912v c0912v, long j, int i2, List<Object> list) {
            C0968a.g(b());
            this.c = AbstractC2991z.u(list);
            this.e = i;
            this.d = c0912v;
            C2679s.this.x = -9223372036854775807L;
            C2679s.this.y = false;
            C(c0912v);
            boolean z = this.g == -9223372036854775807L;
            if (C2679s.this.d || (this.b == 0 && z)) {
                long j2 = z ? -4611686018427387904L : this.g + 1;
                C2679s.this.i.a(j2, new h(this.f + j, i2, j2));
            }
        }

        @Override // ax.o1.S
        public void s(int i) {
            if (this.b == 0) {
                C2679s.this.P(i);
            }
        }

        @Override // ax.o1.S
        public void t(Surface surface, ax.S0.I i) {
            C2679s.this.Q(surface, i);
        }

        @Override // ax.o1.S
        public void u() {
            C2679s.this.C();
        }

        @Override // ax.o1.S
        public void v(boolean z) {
            if (b()) {
                ((Z) C0968a.e(C2679s.this.n)).flush();
            }
            this.g = -9223372036854775807L;
            C2679s.this.D(z);
            this.j = false;
        }

        @Override // ax.o1.S
        public void w(List<Object> list) {
            if (this.c.equals(list)) {
                return;
            }
            this.c = AbstractC2991z.u(list);
            C0912v c0912v = this.d;
            if (c0912v != null) {
                C(c0912v);
            }
        }

        @Override // ax.o1.S
        public void x(boolean z) {
            if (C2679s.this.d) {
                C2679s.this.J(z);
            }
        }

        @Override // ax.o1.S
        public boolean y(boolean z) {
            return C2679s.this.I(z && b());
        }

        @Override // ax.o1.S
        public boolean z(C0912v c0912v) throws S.c {
            C0968a.g(!b());
            boolean M = C2679s.this.M(c0912v, this.b);
            this.k = M;
            return M;
        }
    }

    /* renamed from: ax.o1.s$e */
    public interface e {
        void a(a0 a0Var);

        void e();

        void f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.o1.s$f */
    static final class f implements Y.b {
        private static final ax.q7.u<Class<?>> b = ax.q7.v.a(new ax.q7.u() { // from class: ax.o1.w
            @Override // ax.q7.u
            public final Object get() {
                return C2679s.f.a();
            }
        });
        private final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: ax.o1.s$g */
    private static final class g implements Z.a {
        private final Y.b a;

        public g(boolean z) {
            this.a = new f(z);
        }

        @Override // ax.P0.Z.a
        public Z a(Context context, C0901j c0901j, InterfaceC0904m interfaceC0904m, Z.b bVar, Executor executor, long j, boolean z) {
            try {
                return ((Z.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(Y.b.class).newInstance(this.a)).a(context, c0901j, interfaceC0904m, bVar, executor, j, z);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: ax.o1.s$h */
    private static final class h {
        public final long a;
        public final int b;
        public final long c;

        public h(long j, int i, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    /* synthetic */ C2679s(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.e.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z) {
        if (H()) {
            this.u++;
            this.e.v(z);
            while (this.i.l() > 1) {
                this.i.i();
            }
            if (this.i.l() == 1) {
                h hVar = (h) C0968a.e(this.i.i());
                this.r = hVar.a;
                this.s = hVar.b;
                L();
            }
            this.w = -9223372036854775807L;
            this.x = -9223372036854775807L;
            this.y = false;
            ((InterfaceC0984q) C0968a.i(this.m)).c(new Runnable() { // from class: ax.o1.p
                @Override // java.lang.Runnable
                public final void run() {
                    C2679s.b(C2679s.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0901j E(C0901j c0901j) {
        return (c0901j == null || !c0901j.h() || this.q) ? C0901j.h : c0901j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        return this.u == 0 && this.y && this.e.c();
    }

    private boolean H() {
        return this.v == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I(boolean z) {
        return this.e.y(z && this.u == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z) {
        this.e.x(z);
    }

    private void K(Surface surface, int i, int i2) {
        Z z = this.n;
        if (z == null) {
            return;
        }
        if (surface != null) {
            z.o(new ax.P0.M(surface, i, i2));
            this.e.t(surface, new ax.S0.I(i, i2));
        } else {
            z.o(null);
            this.e.u();
        }
    }

    private void L() {
        this.e.r(1, this.j, this.r, this.s, AbstractC2991z.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(C0912v c0912v, int i) throws S.c {
        C2679s c2679s;
        C0983p.a aVar;
        if (i == 0) {
            C0968a.g(this.v == 0);
            C0901j E = E(c0912v.E);
            try {
            } catch (C0983p.a e2) {
                aVar = e2;
            }
            try {
                if (this.p) {
                    E = C0901j.h;
                } else if (E.c == 7 && Build.VERSION.SDK_INT < 34 && C0983p.j()) {
                    E = E.a().e(6).a();
                } else if (!C0983p.k(E.c) && Build.VERSION.SDK_INT >= 29) {
                    C0987u.h("PlaybackVidGraphWrapper", d0.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(E.c)));
                    E = C0901j.h;
                }
                C0901j c0901j = E;
                a aVar2 = null;
                final InterfaceC0984q d2 = this.g.d((Looper) C0968a.i(Looper.myLooper()), null);
                this.m = d2;
                Z.a aVar3 = this.b;
                Context context = this.a;
                InterfaceC0904m interfaceC0904m = InterfaceC0904m.a;
                Objects.requireNonNull(d2);
                c2679s = this;
                Z a2 = aVar3.a(context, c0901j, interfaceC0904m, c2679s, new Executor() { // from class: ax.o1.r
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        InterfaceC0984q.this.c(runnable);
                    }
                }, 0L, false);
                c2679s.n = a2;
                a2.k(c2679s.l);
                c2679s.n.q(c2679s.k);
                c2679s.n.a();
                Pair<Surface, ax.S0.I> pair = c2679s.t;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    ax.S0.I i2 = (ax.S0.I) pair.second;
                    K(surface, i2.b(), i2.a());
                }
                c2679s.e.z(c0912v);
                S s = c2679s.e;
                c cVar = new c(this, aVar2);
                final InterfaceC0984q interfaceC0984q = c2679s.m;
                Objects.requireNonNull(interfaceC0984q);
                s.m(cVar, new Executor() { // from class: ax.o1.r
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        InterfaceC0984q.this.c(runnable);
                    }
                });
                c2679s.v = 1;
            } catch (C0983p.a e3) {
                aVar = e3;
                throw new S.c(aVar, c0912v);
            }
        } else {
            c2679s = this;
            if (!H()) {
                return false;
            }
        }
        ((Z) C0968a.e(c2679s.n)).l(i);
        c2679s.A++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(long j, long j2) throws S.c {
        this.e.i(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(int i) {
        this.e.s(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(float f2) {
        this.e.g(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(z zVar) {
        this.o = zVar;
        this.e.p(zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        int i = this.z;
        return i != -1 && i == this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.e.q();
        this.y = true;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(C2679s c2679s) {
        c2679s.u--;
    }

    public void A(e eVar) {
        this.h.add(eVar);
    }

    public void C() {
        ax.S0.I i = ax.S0.I.c;
        K(null, i.b(), i.a());
        this.t = null;
    }

    public S F(int i) {
        if (d0.r(this.c, i)) {
            return this.c.get(i);
        }
        d dVar = new d(this.a, i);
        if (i == 0) {
            A(dVar);
        }
        this.c.put(i, dVar);
        return dVar;
    }

    public void N() {
        if (this.v == 2) {
            return;
        }
        InterfaceC0984q interfaceC0984q = this.m;
        if (interfaceC0984q != null) {
            interfaceC0984q.k(null);
        }
        Z z = this.n;
        if (z != null) {
            z.d();
        }
        this.t = null;
        this.v = 2;
    }

    public void Q(Surface surface, ax.S0.I i) {
        Pair<Surface, ax.S0.I> pair = this.t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((ax.S0.I) this.t.second).equals(i)) {
            return;
        }
        this.t = Pair.create(surface, i);
        K(surface, i.b(), i.a());
    }

    public void S(int i) {
        this.z = i;
    }

    public void W() {
        this.e.n();
    }

    public void X() {
        this.e.l();
    }

    private C2679s(b bVar) {
        this.a = bVar.a;
        this.i = new ax.S0.L<>();
        this.b = (Z.a) C0968a.i(bVar.c);
        this.c = new SparseArray<>();
        this.l = AbstractC2991z.z();
        this.k = W.a;
        this.d = bVar.d;
        InterfaceC0975h interfaceC0975h = bVar.e;
        this.g = interfaceC0975h;
        this.e = new C2666e(bVar.b, interfaceC0975h);
        this.f = new a();
        this.h = new CopyOnWriteArraySet<>();
        this.j = new C0912v.b().P();
        this.r = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -1;
        this.v = 0;
    }
}
