/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.X0.d;
import ax.X0.j;
import ax.q1.M;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.u7.f;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public final class e
implements r,
N {
    private final ArrayList<j> a = new ArrayList();
    private final PriorityQueue<j> b = new PriorityQueue();
    private final G c = new G(512);
    private int d = 0;
    private int e;
    private int f;
    private long g;
    private long h;
    private b i;

    public static /* synthetic */ void o(e e8, int n8, long l8) {
        e8.q(n8, l8);
    }

    private static boolean p(G g8) {
        return g8.v() == 1297377380;
    }

    private void q(int n8, long l8) {
        ArrayList<j> arrayList = this.a;
        int n9 = arrayList.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            j j8 = arrayList.get(i8);
            j8.d(n8, l8);
        }
    }

    private void r() {
        ax.S0.a.i(this.i).f(this.g, 0, 0, 0, null);
    }

    private int s() throws E {
        if (this.c.a() >= 8) {
            if (this.c.v() == 1297379947) {
                int n8 = this.c.v();
                if (n8 > 0) {
                    return n8;
                }
                throw E.a(null, null);
            }
            throw E.a(null, null);
        }
        throw E.a(null, null);
    }

    private void t() throws E {
        if (this.c.a() >= 14) {
            if (ax.X0.e.p(this.c)) {
                this.c.c0(4);
                short s8 = this.c.I();
                int n8 = this.c.I();
                if (n8 > 0) {
                    this.f = this.c.I();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        int n9 = this.s();
                        Object object = new byte[n9];
                        if (this.c.a() >= n9) {
                            this.c.q((byte[])object, 0, n9);
                            object = new G((byte[])object);
                            object = new j(s8, this.f, (G)object, new d(this));
                            this.a.add((j)object);
                            continue;
                        }
                        throw E.a(null, null);
                    }
                    return;
                }
                throw E.a(null, null);
            }
            throw E.a(null, null);
        }
        throw E.a(null, null);
    }

    private void u(long l8) throws E {
        while (!this.b.isEmpty()) {
            j j8 = ax.S0.a.e(this.b.poll());
            long l9 = j8.p();
            if (l9 == -9223372036854775807L || l9 >= l8) continue;
            j8.n(ax.S0.a.i(this.i), true);
            j8.q();
            this.b.add(j8);
        }
        ((AbstractCollection)this.b).addAll(this.a);
    }

    @Override
    public void a(t t8) {
        if (this.d == 0) {
            b b8;
            this.i = b8 = new b(t8.u(0, 1));
            b8.e(new v.b().U("audio/midi").W("audio/midi").y0("audio/x-exoplayer-midi").P());
            t8.o();
            t8.h(this);
            this.d = 1;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public void b(long l8, long l9) {
        boolean bl = this.d != 4;
        ax.S0.a.g(bl);
        this.h = l9;
        b b8 = this.i;
        if (b8 != null) {
            b8.h();
        }
        if (this.d == 1) {
            this.c.b0(0);
            this.e = 0;
            return;
        }
        this.d = 2;
    }

    @Override
    public boolean c(s s8) throws IOException {
        G g8 = new G(4);
        s8.p(g8.f(), 0, 4);
        return ax.X0.e.p(g8);
    }

    @Override
    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.Y(d0.f);
        this.d = 4;
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s object, M object2) throws IOException {
        int n8 = this.d;
        int n9 = -1;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    object = ax.S0.a.e(this.b.poll());
                    long l8 = ((j)object).p();
                    if (l8 != -9223372036854775807L) {
                        long l9 = this.g;
                        if (l9 + 100000L < l8) {
                            this.g = l9 + 100000L;
                            this.r();
                        } else {
                            this.g = l8;
                            ((j)object).n(ax.S0.a.i(this.i), false);
                            ((j)object).q();
                        }
                        n9 = 0;
                    }
                    this.b.add((j)object);
                    return n9;
                }
                throw new IllegalStateException();
            }
            this.b.clear();
            object = this.a;
            n8 = ((ArrayList)object).size();
            for (n9 = 0; n9 < n8; ++n9) {
                object2 = ((ArrayList)object).get(n9);
                object2 = (j)object2;
                ((j)object2).r();
                ((j)object2).q();
            }
            ((AbstractCollection)this.b).addAll(this.a);
            this.u(this.h);
            this.g = this.h;
            if (ax.S0.a.e(this.b.peek()).p() > this.g) {
                this.r();
            }
            this.d = 3;
            return 0;
        }
        n8 = ax.u7.f.e(object.getLength());
        n9 = this.c.f().length;
        if (this.e == n9) {
            object2 = this.c;
            if (n8 != -1) {
                n9 = n8;
            }
            ((G)object2).d(n9 * 3 / 2);
        }
        if ((n9 = object.c(this.c.f(), this.e, this.c.b() - this.e)) != -1) {
            this.e = n9 = this.e + n9;
            if (n8 == -1 || n9 != n8) {
                return 0;
            }
        }
        this.c.a0(this.e);
        this.t();
        this.d = 2;
        return 0;
    }

    @Override
    public boolean i() {
        return true;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }

    @Override
    public N.a l(long l8) {
        int n8 = this.d;
        if (n8 != 2 && n8 != 3) {
            return new N.a(O.c);
        }
        return new N.a(new O(l8, 14L));
    }

    @Override
    public long n() {
        return -9223372036854775807L;
    }

    private static final class b
    extends ax.q1.E {
        private int b;

        private b(U u8) {
            super(u8);
        }

        @Override
        public void f(long l8, int n8, int n9, int n10, U.a a8) {
            boolean bl = (n8 & 1) == 0;
            ax.S0.a.g(bl);
            int n11 = n8;
            if (this.b == 0) {
                n11 = n8 | 1;
            }
            super.f(l8, n11, n9, n10, a8);
            ++this.b;
        }

        public void h() {
            this.b = 0;
        }
    }
}

