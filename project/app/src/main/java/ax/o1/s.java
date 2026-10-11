/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import ax.P0.M;
import ax.P0.W;
import ax.P0.Y;
import ax.P0.Z;
import ax.P0.a0;
import ax.P0.j;
import ax.P0.m;
import ax.P0.v;
import ax.S0.I;
import ax.S0.L;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.p;
import ax.o1.A;
import ax.o1.Q;
import ax.o1.S;
import ax.o1.p;
import ax.o1.q;
import ax.o1.r;
import ax.o1.t;
import ax.o1.u;
import ax.o1.v;
import ax.o1.w;
import ax.o1.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

public final class s
implements Z.b {
    private static final Executor B = new q();
    private int A;
    private final Context a;
    private final Z.a b;
    private final SparseArray<d> c;
    private final boolean d;
    private final S e;
    private final S.b f;
    private final ax.S0.h g;
    private final CopyOnWriteArraySet<e> h;
    private L<h> i;
    private ax.P0.v j;
    private W k;
    private ax.r7.z<Object> l;
    private ax.S0.q m;
    private Z n;
    private z o;
    private boolean p;
    private boolean q;
    private long r;
    private int s;
    private Pair<Surface, I> t;
    private int u;
    private int v;
    private long w;
    private long x;
    private boolean y;
    private int z;

    private s(b b8) {
        ax.S0.h h8;
        this.a = b8.a;
        this.i = new L();
        this.b = ax.S0.a.i(b8.c);
        this.c = new SparseArray();
        this.l = ax.r7.z.z();
        this.k = W.a;
        this.d = b8.d;
        this.g = h8 = b8.e;
        this.e = new ax.o1.e(b8.b, h8);
        this.f = new S.b(this){
            final s a;
            {
                this.a = s8;
            }

            @Override
            public void a(long l8) {
                ax.S0.a.i(this.a.n).n(l8);
            }

            @Override
            public void b() {
                ax.S0.a.i(this.a.n).n(-2L);
            }
        };
        this.h = new CopyOnWriteArraySet();
        this.j = new v.b().P();
        this.r = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -1;
        this.v = 0;
    }

    private void B() {
        this.e.A();
    }

    private void D(boolean bl) {
        if (!this.H()) {
            return;
        }
        ++this.u;
        this.e.v(bl);
        while (this.i.l() > 1) {
            this.i.i();
        }
        if (this.i.l() == 1) {
            h h8 = ax.S0.a.e(this.i.i());
            this.r = h8.a;
            this.s = h8.b;
            this.L();
        }
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.y = false;
        ax.S0.a.i(this.m).c(new p(this));
    }

    private j E(j j8) {
        if (j8 != null && j8.h() && !this.q) {
            return j8;
        }
        return ax.P0.j.h;
    }

    private boolean G() {
        return this.u == 0 && this.y && this.e.c();
    }

    private boolean H() {
        return this.v == 1;
    }

    private boolean I(boolean bl) {
        S s8 = this.e;
        bl = bl && this.u == 0;
        return s8.y(bl);
    }

    private void J(boolean bl) {
        this.e.x(bl);
    }

    private void K(Surface surface, int n8, int n9) {
        Z z8 = this.n;
        if (z8 == null) {
            return;
        }
        if (surface != null) {
            z8.o(new M(surface, n8, n9));
            this.e.t(surface, new I(n8, n9));
            return;
        }
        z8.o(null);
        this.e.u();
    }

    private void L() {
        this.e.r(1, this.j, this.r, this.s, ax.r7.z.<Object>z());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean M(ax.P0.v object, int n8) throws S.c {
        block15: {
            block14: {
                m m8;
                Z.a a8;
                Object object2;
                Throwable var5_8;
                Object object3;
                if (n8 != 0) break block14;
                boolean bl = this.v == 0;
                ax.S0.a.g(bl);
                Object object4 = this.E(((ax.P0.v)object).E);
                try {
                    block13: {
                        block12: {
                            bl = this.p;
                            if (bl) {
                                object3 = ax.P0.j.h;
                            }
                            int n9 = ((j)object4).c;
                            if (n9 == 7) {
                                if (Build.VERSION.SDK_INT >= 34 || !ax.S0.p.j()) break block12;
                                object3 = ((j)object4).a().e(6).a();
                            }
                        }
                        bl = ax.S0.p.k(((j)object4).c);
                        object3 = object4;
                        if (bl) break block13;
                        object3 = object4;
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                ax.S0.u.h("PlaybackVidGraphWrapper", d0.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", ((j)object4).c));
                                object3 = ax.P0.j.h;
                            }
                        }
                        catch (p.a a9) {
                            throw new S.c((Throwable)var5_8, (ax.P0.v)object);
                        }
                    }
                    object2 = this.g.d(ax.S0.a.i(Looper.myLooper()), null);
                    this.m = object2;
                    a8 = this.b;
                    object4 = this.a;
                    m8 = ax.P0.m.a;
                }
                catch (p.a a10) {
                    // empty catch block
                }
                j.Objects.requireNonNull((Object)object2);
                object2 = new r((ax.S0.q)object2);
                this.n = object3 = a8.a((Context)object4, (j)object3, m8, this, (Executor)object2, 0L, false);
                object3.k(this.l);
                this.n.q(this.k);
                this.n.a();
                object4 = this.t;
                if (object4 != null) {
                    object3 = (Surface)((Pair)object4).first;
                    object4 = (I)((Pair)object4).second;
                    this.K((Surface)object3, ((I)object4).b(), ((I)object4).a());
                }
                this.e.z((ax.P0.v)object);
                object3 = this.e;
                object = new c(this);
                object4 = this.m;
                j.Objects.requireNonNull((Object)object4);
                object3.m((S.a)object, new r((ax.S0.q)object4));
                this.v = 1;
                break block15;
                throw new S.c((Throwable)var5_8, (ax.P0.v)object);
            }
            if (!this.H()) {
                return false;
            }
        }
        ax.S0.a.e(this.n).l(n8);
        ++this.A;
        return true;
    }

    private void O(long l8, long l9) throws S.c {
        this.e.i(l8, l9);
    }

    private void P(int n8) {
        this.e.s(n8);
    }

    private void R(float f8) {
        this.e.g(f8);
    }

    private void T(z z8) {
        this.o = z8;
        this.e.p(z8);
    }

    private boolean U() {
        int n8 = this.z;
        return n8 != -1 && n8 == this.A;
    }

    private void V() {
        this.e.q();
        this.y = true;
    }

    public static /* synthetic */ void a(Runnable runnable2) {
    }

    public static /* synthetic */ void b(s s8) {
        --s8.u;
    }

    static /* synthetic */ long e(s s8, long l8) {
        s8.w = l8;
        return l8;
    }

    static /* synthetic */ long i(s s8, long l8) {
        s8.x = l8;
        return l8;
    }

    static /* synthetic */ boolean l(s s8, boolean bl) {
        s8.y = bl;
        return bl;
    }

    static /* synthetic */ L n(s s8, L l8) {
        s8.i = l8;
        return l8;
    }

    public void A(e e8) {
        this.h.add(e8);
    }

    public void C() {
        I i8 = I.c;
        this.K(null, i8.b(), i8.a());
        this.t = null;
    }

    public S F(int n8) {
        if (d0.r(this.c, n8)) {
            return (S)this.c.get(n8);
        }
        d d8 = new d(this, this.a, n8);
        if (n8 == 0) {
            this.A(d8);
        }
        this.c.put(n8, (Object)d8);
        return d8;
    }

    public void N() {
        if (this.v == 2) {
            return;
        }
        Object object = this.m;
        if (object != null) {
            object.k(null);
        }
        if ((object = this.n) != null) {
            object.d();
        }
        this.t = null;
        this.v = 2;
    }

    public void Q(Surface surface, I i8) {
        Pair<Surface, I> pair = this.t;
        if (pair != null && ((Surface)pair.first).equals(surface) && ((I)this.t.second).equals(i8)) {
            return;
        }
        this.t = Pair.create((Object)surface, (Object)i8);
        this.K(surface, i8.b(), i8.a());
    }

    public void S(int n8) {
        this.z = n8;
    }

    public void W() {
        this.e.n();
    }

    public void X() {
        this.e.l();
    }

    public static final class b {
        private final Context a;
        private final A b;
        private Z.a c;
        private boolean d;
        private ax.S0.h e;
        private boolean f;
        private boolean g;

        public b(Context context, A a8) {
            this.a = context.getApplicationContext();
            this.b = a8;
            this.e = ax.S0.h.a;
        }

        public s f() {
            ax.S0.a.g(this.f ^ true);
            if (this.c == null) {
                this.c = new g(this.g);
            }
            s s8 = new s(this);
            this.f = true;
            return s8;
        }

        public b g(ax.S0.h h8) {
            this.e = h8;
            return this;
        }

        public b h(boolean bl) {
            this.d = bl;
            return this;
        }
    }

    private final class c
    implements S.a {
        final s b;

        private c(s s8) {
            this.b = s8;
        }

        @Override
        public void a(a0 a02) {
            Iterator iterator = this.b.h.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a(a02);
            }
        }

        @Override
        public /* synthetic */ void b() {
            Q.b(this);
        }

        @Override
        public void e() {
            Iterator iterator = this.b.h.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).e();
            }
        }

        @Override
        public void f() {
            Iterator iterator = this.b.h.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).f();
            }
        }
    }

    private final class d
    implements S,
    e {
        private final int a;
        private final int b;
        private ax.r7.z<Object> c;
        private ax.P0.v d;
        private int e;
        private long f;
        private long g;
        private S.a h;
        private Executor i;
        private boolean j;
        private boolean k;
        final s l;

        public d(s s8, Context context, int n8) {
            this.l = s8;
            this.b = n8;
            this.a = d0.g0(context);
            this.c = ax.r7.z.z();
            this.g = -9223372036854775807L;
            this.h = S.a.a;
            this.i = B;
        }

        public static /* synthetic */ void B(S.a a8, a0 a02) {
            a8.a(a02);
        }

        private void C(ax.P0.v v8) {
            v8 = v8.b().V(this.l.E(v8.E)).P();
            int n8 = this.e == 1 ? 1 : 2;
            ax.S0.a.e(this.l.n).p(this.b, n8, v8, this.c, 0L);
        }

        @Override
        public void A() {
            if (this.l.i.l() == 0) {
                this.l.B();
                return;
            }
            L<h> l8 = new L<h>();
            int n8 = 1;
            while (this.l.i.l() > 0) {
                h h8 = ax.S0.a.e((h)this.l.i.i());
                int n9 = n8;
                h h9 = h8;
                if (n8 != 0) {
                    n9 = h8.b;
                    if (n9 != 0 && n9 != 1) {
                        this.l.B();
                        h9 = h8;
                    } else {
                        h9 = new h(h8.a, 0, h8.c);
                    }
                    n9 = 0;
                }
                l8.a(h9.c, h9);
                n8 = n9;
            }
            ax.o1.s.n(this.l, l8);
        }

        @Override
        public void a(a0 a02) {
            S.a a8 = this.h;
            this.i.execute(new v(a8, a02));
        }

        @Override
        public boolean b() {
            return this.k;
        }

        @Override
        public boolean c() {
            return this.b() && this.l.G();
        }

        @Override
        public void d() {
            this.l.N();
        }

        @Override
        public void e() {
            S.a a8 = this.h;
            Executor executor = this.i;
            j.Objects.requireNonNull((Object)a8);
            executor.execute(new u(a8));
        }

        @Override
        public void f() {
            S.a a8 = this.h;
            Executor executor = this.i;
            j.Objects.requireNonNull((Object)a8);
            executor.execute(new t(a8));
        }

        @Override
        public void g(float f8) {
            if (this.b == 0) {
                this.l.R(f8);
            }
        }

        @Override
        public void h() {
            if (this.b()) {
                boolean bl = this.j;
                long l8 = this.l.w;
                this.l.D(false);
                ax.S0.a.e(this.l.n).h();
                ax.o1.s.e(this.l, l8);
                if (bl) {
                    this.q();
                }
            }
        }

        @Override
        public void i(long l8, long l9) throws S.c {
            this.l.O(l8 + this.f, l9);
        }

        @Override
        public Surface j() {
            ax.S0.a.g(this.b());
            return ax.S0.a.e(this.l.n).m(this.b);
        }

        @Override
        public boolean k(long l8, S.b b8) {
            ax.S0.a.g(this.b());
            if (!this.l.U()) {
                return false;
            }
            if (ax.S0.a.e(this.l.n).j(this.b) >= this.a) {
                return false;
            }
            if (!ax.S0.a.e(this.l.n).i(this.b)) {
                return false;
            }
            this.g = l8 += this.f;
            b8.a(l8 * 1000L);
            return true;
        }

        @Override
        public void l() {
            if (this.l.d) {
                this.l.X();
            }
        }

        @Override
        public void m(S.a a8, Executor executor) {
            this.h = a8;
            this.i = executor;
        }

        @Override
        public void n() {
            if (this.l.d) {
                this.l.W();
            }
        }

        @Override
        public void o(long l8) {
            this.f = l8;
        }

        @Override
        public void p(z z8) {
            if (this.b == 0) {
                this.l.T(z8);
            }
        }

        @Override
        public void q() {
            ax.o1.s.i(this.l, this.g);
            if (this.l.w >= this.l.x) {
                this.l.V();
            }
        }

        @Override
        public void r(int n8, ax.P0.v v8, long l8, int n9, List<Object> object) {
            ax.S0.a.g(this.b());
            this.c = ax.r7.z.u(object);
            this.e = n8;
            this.d = v8;
            ax.o1.s.i(this.l, -9223372036854775807L);
            object = this.l;
            n8 = 0;
            ax.o1.s.l((s)object, false);
            this.C(v8);
            if (this.g == -9223372036854775807L) {
                n8 = 1;
            }
            if (!(this.l.d || this.b == 0 && n8 != 0)) {
                return;
            }
            long l9 = n8 != 0 ? -4611686018427387904L : this.g + 1L;
            this.l.i.a(l9, new h(this.f + l8, n9, l9));
        }

        @Override
        public void s(int n8) {
            if (this.b == 0) {
                this.l.P(n8);
            }
        }

        @Override
        public void t(Surface surface, I i8) {
            this.l.Q(surface, i8);
        }

        @Override
        public void u() {
            this.l.C();
        }

        @Override
        public void v(boolean bl) {
            if (this.b()) {
                ax.S0.a.e(this.l.n).flush();
            }
            this.g = -9223372036854775807L;
            this.l.D(bl);
            this.j = false;
        }

        @Override
        public void w(List<Object> object) {
            if (!this.c.equals(object)) {
                this.c = ax.r7.z.u(object);
                object = this.d;
                if (object != null) {
                    this.C((ax.P0.v)object);
                }
            }
        }

        @Override
        public void x(boolean bl) {
            if (this.l.d) {
                this.l.J(bl);
            }
        }

        @Override
        public boolean y(boolean bl) {
            s s8 = this.l;
            bl = bl && this.b();
            return s8.I(bl);
        }

        @Override
        public boolean z(ax.P0.v v8) throws S.c {
            boolean bl;
            ax.S0.a.g(this.b() ^ true);
            this.k = bl = this.l.M(v8, this.b);
            return bl;
        }
    }

    public static interface e {
        public void a(a0 var1);

        public void e();

        public void f();
    }

    private static final class f
    implements Y.b {
        private static final ax.q7.u<Class<?>> b = ax.q7.v.a(new w());
        private final boolean a;

        public f(boolean bl) {
            this.a = bl;
        }

        public static /* synthetic */ Class a() {
            try {
                Class<?> clazz = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return clazz;
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
        }
    }

    private static final class g
    implements Z.a {
        private final Y.b a;

        public g(boolean bl) {
            this.a = new f(bl);
        }

        @Override
        public Z a(Context context, j j8, m m8, Z.b b8, Executor executor, long l8, boolean bl) {
            try {
                Z.a a8 = (Z.a)Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(Y.b.class).newInstance(this.a);
                return a8.a(context, j8, m8, b8, executor, l8, bl);
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception);
            }
        }
    }

    private static final class h {
        public final long a;
        public final int b;
        public final long c;

        public h(long l8, int n8, long l9) {
            this.a = l8;
            this.b = n8;
            this.c = l9;
        }
    }
}

