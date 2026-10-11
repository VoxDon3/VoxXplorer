/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.P0.D;
import ax.P0.P;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.U0.g;
import ax.U0.j;
import ax.U0.k;
import ax.U0.z;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.Z;
import ax.i1.B;
import ax.i1.C;
import ax.i1.N;
import ax.i1.e0;
import ax.i1.q0;
import ax.i1.y;
import ax.m1.m;
import ax.m1.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

final class i0
implements C,
o.b<c> {
    private final g.a c0;
    private final z d0;
    private final m e0;
    private final N.a f0;
    private final q0 g0;
    private final ArrayList<b> h0;
    private final long i0;
    final o j0;
    final v k0;
    final boolean l0;
    boolean m0;
    byte[] n0;
    int o0;
    private final k q;

    public i0(k object, g.a a8, z z8, v v8, long l8, m m8, N.a a9, boolean bl, ax.n1.c c8) {
        this.q = object;
        this.c0 = a8;
        this.d0 = z8;
        this.k0 = v8;
        this.i0 = l8;
        this.e0 = m8;
        this.f0 = a9;
        this.l0 = bl;
        this.g0 = new q0(new P(v8));
        this.h0 = new ArrayList();
        object = c8 != null ? new o(c8) : new o("SingleSampleMediaPeriod");
        this.j0 = object;
    }

    @Override
    public boolean a(p0 object) {
        if (!(this.m0 || this.j0.i() || this.j0.h())) {
            object = this.c0.a();
            z z8 = this.d0;
            if (z8 != null) {
                object.d(z8);
            }
            object = new c(this.q, (g)object);
            this.j0.n(object, this, this.e0.c(1));
            return true;
        }
        return false;
    }

    @Override
    public long b() {
        if (!this.m0 && !this.j0.i()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean c() {
        return this.j0.i();
    }

    @Override
    public long d() {
        if (this.m0) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public void e(long l8) {
    }

    @Override
    public long g(ax.l1.D[] dArray, boolean[] blArray, e0[] e0Array, boolean[] blArray2, long l8) {
        for (int i8 = 0; i8 < dArray.length; ++i8) {
            e0 e02 = e0Array[i8];
            if (!(e02 == null || dArray[i8] != null && blArray[i8])) {
                this.h0.remove(e02);
                e0Array[i8] = null;
            }
            if (e0Array[i8] != null || dArray[i8] == null) continue;
            e02 = new b(this);
            this.h0.add((b)e02);
            e0Array[i8] = e02;
            blArray2[i8] = true;
        }
        return l8;
    }

    public void h(c c8, long l8, long l9, boolean bl) {
        Object object = c8.c;
        object = new y(c8.a, c8.b, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        this.e0.a(c8.a);
        this.f0.m((y)object, 1, -1, null, 0, null, 0L, this.i0);
    }

    public void i(c c8, long l8, long l9) {
        this.o0 = (int)c8.c.q();
        this.n0 = a.e(c8.d);
        this.m0 = true;
        Object object = c8.c;
        object = new y(c8.a, c8.b, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, this.o0);
        this.e0.a(c8.a);
        this.f0.p((y)object, 1, -1, this.k0, 0, null, 0L, this.i0);
    }

    @Override
    public void l() {
    }

    @Override
    public long m(long l8) {
        for (int i8 = 0; i8 < this.h0.size(); ++i8) {
            this.h0.get(i8).e();
        }
        return l8;
    }

    @Override
    public void n(C.a a8, long l8) {
        a8.f(this);
    }

    public o.c o(c c8, long l8, long l9, IOException iOException, int n8) {
        Object object = c8.c;
        y y8 = new y(c8.a, c8.b, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        l8 = this.e0.b(new m.c(y8, (B)(object = new B(1, -1, this.k0, 0, null, 0L, ax.S0.d0.E1(this.i0))), iOException, n8));
        long l10 = l8 - -9223372036854775807L;
        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
        n8 = l11 != false && n8 < this.e0.c(1) ? 0 : 1;
        if (this.l0 && n8 != 0) {
            u.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.m0 = true;
            object = o.f;
        } else {
            object = l11 != false ? o.g(false, l8) : o.g;
        }
        boolean bl = ((o.c)object).c();
        this.f0.r(y8, 1, -1, this.k0, 0, null, 0L, this.i0, iOException, bl ^ true);
        if (!bl) {
            this.e0.a(c8.a);
        }
        return object;
    }

    @Override
    public long q(long l8, Z z8) {
        return l8;
    }

    @Override
    public long s() {
        return -9223372036854775807L;
    }

    @Override
    public q0 t() {
        return this.g0;
    }

    public void u(c object, long l8, long l9, int n8) {
        ax.U0.y y8 = ((c)object).c;
        object = n8 == 0 ? new y(((c)object).a, ((c)object).b, l8) : new y(((c)object).a, ((c)object).b, y8.r(), y8.s(), l8, l9, y8.q());
        this.f0.v((y)object, 1, -1, this.k0, 0, null, 0L, this.i0, n8);
    }

    @Override
    public void v(long l8, boolean bl) {
    }

    public void w() {
        this.j0.l();
    }

    private final class b
    implements e0 {
        private int a;
        private boolean b;
        final i0 c;

        private b(i0 i02) {
            this.c = i02;
        }

        private void d() {
            if (!this.b) {
                this.c.f0.j(D.k(this.c.k0.o), this.c.k0, 0, null, 0L);
                this.b = true;
            }
        }

        @Override
        public int a(O object, i object2, int n8) {
            int n9;
            this.d();
            i0 i02 = this.c;
            boolean bl = i02.m0;
            if (bl && i02.n0 == null) {
                this.a = 2;
            }
            if ((n9 = this.a) == 2) {
                ((ax.V0.a)object2).n(4);
                return -4;
            }
            if ((n8 & 2) == 0 && n9 != 0) {
                if (!bl) {
                    return -3;
                }
                ax.S0.a.e(i02.n0);
                ((ax.V0.a)object2).n(1);
                ((i)object2).g0 = 0L;
                if ((n8 & 4) == 0) {
                    ((i)object2).C(this.c.o0);
                    object = ((i)object2).e0;
                    object2 = this.c;
                    ((ByteBuffer)object).put(((i0)object2).n0, 0, ((i0)object2).o0);
                }
                if ((n8 & 1) == 0) {
                    this.a = 2;
                }
                return -4;
            }
            ((O)object).b = i02.k0;
            this.a = 1;
            return -5;
        }

        @Override
        public void b() throws IOException {
            i0 i02 = this.c;
            if (!i02.l0) {
                i02.j0.j();
            }
        }

        @Override
        public int c(long l8) {
            this.d();
            if (l8 > 0L && this.a != 2) {
                this.a = 2;
                return 1;
            }
            return 0;
        }

        public void e() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override
        public boolean isReady() {
            return this.c.m0;
        }
    }

    static final class c
    implements o.e {
        public final long a = y.a();
        public final k b;
        private final ax.U0.y c;
        private byte[] d;

        public c(k k8, g g8) {
            this.b = k8;
            this.c = new ax.U0.y(g8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a() throws IOException {
            int n8;
            block6: {
                this.c.t();
                try {
                    this.c.f(this.b);
                    n8 = 0;
                    break block6;
                }
                catch (Throwable throwable) {}
                j.a(this.c);
                throw throwable;
            }
            while (n8 != -1) {
                n8 = (int)this.c.q();
                Object object = this.d;
                if (object == null) {
                    this.d = new byte[1024];
                } else if (n8 == ((byte[])object).length) {
                    this.d = Arrays.copyOf(object, ((byte[])object).length * 2);
                }
                object = this.c;
                byte[] byArray = this.d;
                n8 = object.c(byArray, n8, byArray.length - n8);
            }
            j.a(this.c);
        }

        @Override
        public void c() {
        }
    }
}

