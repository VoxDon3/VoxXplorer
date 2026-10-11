/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.N;
import ax.P0.y;
import ax.S0.a;
import ax.U0.z;
import ax.i1.C;
import ax.i1.F;
import ax.i1.Q;
import ax.i1.e;
import ax.i1.h;
import ax.i1.j;
import ax.i1.k;
import ax.i1.w;
import ax.r7.L;
import ax.r7.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class S
extends h<Integer> {
    private static final y w = new y.c().c("MergingMediaSource").a();
    private final boolean k;
    private final boolean l;
    private final F[] m;
    private final List<List<d>> n;
    private final N[] o;
    private final ArrayList<F> p;
    private final j q;
    private final Map<Object, Long> r;
    private final L<Object, e> s;
    private int t;
    private long[][] u;
    private c v;

    public S(boolean bl, boolean bl2, j j8, F ... fArray) {
        this.k = bl;
        this.l = bl2;
        this.m = fArray;
        this.q = j8;
        this.p = new ArrayList<F>(Arrays.asList(fArray));
        this.t = -1;
        this.n = new ArrayList<List<d>>(fArray.length);
        for (int i8 = 0; i8 < fArray.length; ++i8) {
            this.n.add(new ArrayList());
        }
        this.o = new N[fArray.length];
        this.u = new long[0][];
        this.r = new HashMap<Object, Long>();
        this.s = M.a().a().e();
    }

    public S(boolean bl, boolean bl2, F ... fArray) {
        this(bl, bl2, new k(), fArray);
    }

    public S(boolean bl, F ... fArray) {
        this(bl, false, fArray);
    }

    public S(F ... fArray) {
        this(false, fArray);
    }

    private void J() {
        N.b b8 = new N.b();
        for (int i8 = 0; i8 < this.t; ++i8) {
            N[] nArray;
            long l8 = -this.o[0].f(i8, b8).o();
            for (int i9 = 1; i9 < (nArray = this.o).length; ++i9) {
                long l9 = -nArray[i9].f(i8, b8).o();
                this.u[i8][i9] = l8 - l9;
            }
        }
    }

    private void M() {
        N.b b8 = new N.b();
        for (int i8 = 0; i8 < this.t; ++i8) {
            Object object;
            long l8 = Long.MIN_VALUE;
            for (int i9 = 0; i9 < ((N[])(object = this.o)).length; ++i9) {
                long l9;
                block6: {
                    long l10;
                    block7: {
                        block5: {
                            l9 = object[i9].f(i8, b8).k();
                            if (l9 != -9223372036854775807L) break block5;
                            l9 = l8;
                            break block6;
                        }
                        l10 = l9 + this.u[i8][i9];
                        if (l8 == Long.MIN_VALUE) break block7;
                        l9 = l8;
                        if (l10 >= l8) break block6;
                    }
                    l9 = l10;
                }
                l8 = l9;
            }
            object = object[0].m(i8);
            this.r.put(object, l8);
            object = this.s.get(object).iterator();
            while (object.hasNext()) {
                ((e)object.next()).x(0L, l8);
            }
        }
    }

    @Override
    protected void A(z z8) {
        super.A(z8);
        for (int i8 = 0; i8 < this.m.length; ++i8) {
            this.I(i8, this.m[i8]);
        }
    }

    @Override
    protected void C() {
        super.C();
        Arrays.fill(this.o, null);
        this.t = -1;
        this.v = null;
        this.p.clear();
        Collections.addAll(this.p, this.m);
    }

    protected F.b K(Integer object, F.b b8) {
        object = this.n.get((Integer)object);
        for (int i8 = 0; i8 < object.size(); ++i8) {
            if (!((d)object.get(i8)).a.equals(b8)) continue;
            return this.n.get(0).get(i8).a;
        }
        return null;
    }

    protected void L(Integer object, F object2, N n8) {
        if (this.v == null) {
            if (this.t == -1) {
                this.t = n8.i();
            } else if (n8.i() != this.t) {
                this.v = new c(0);
                return;
            }
            if (this.u.length == 0) {
                int n9 = this.t;
                int n10 = this.o.length;
                this.u = new long[n9][n10];
            }
            this.p.remove(object2);
            this.o[((Integer)object).intValue()] = n8;
            if (this.p.isEmpty()) {
                if (this.k) {
                    this.J();
                }
                object = object2 = this.o[0];
                if (this.l) {
                    this.M();
                    object = new b((N)object2, this.r);
                }
                this.B((N)object);
            }
        }
    }

    @Override
    public void a(y y8) {
        this.m[0].a(y8);
    }

    @Override
    public void e(C list) {
        Object c8 = list;
        if (this.l) {
            c8 = (e)((Object)list);
            for (Map.Entry object : this.s.a()) {
                if (!((e)object.getValue()).equals(c8)) continue;
                this.s.remove(object.getKey(), object.getValue());
                break;
            }
            c8 = ((e)c8).q;
        }
        c8 = (Q)c8;
        for (int i8 = 0; i8 < this.m.length; ++i8) {
            list = this.n.get(i8);
            C c9 = ((Q)c8).o(i8);
            for (int i9 = 0; i9 < list.size(); ++i9) {
                if (!list.get(i9).b.equals(c9)) continue;
                list.remove(i9);
                break;
            }
            this.m[i8].e(((Q)c8).o(i8));
        }
    }

    @Override
    public C i(F.b b8, ax.m1.b object, long l8) {
        int n8 = this.m.length;
        C[] cArray = new C[n8];
        Object object2 = this.o;
        int n9 = object2[0].b(b8.a);
        for (int i8 = 0; i8 < n8; ++i8) {
            object2 = b8.a(this.o[i8].m(n9));
            cArray[i8] = this.m[i8].i((F.b)object2, (ax.m1.b)object, l8 - this.u[n9][i8]);
            this.n.get(i8).add(new d((F.b)object2, cArray[i8]));
        }
        object = new Q(this.q, this.u[n9], cArray);
        if (this.l) {
            object = new e((C)object, false, 0L, a.e(this.r.get(b8.a)));
            this.s.put(b8.a, (e)object);
            return object;
        }
        return object;
    }

    @Override
    public y j() {
        F[] fArray = this.m;
        if (fArray.length > 0) {
            return fArray[0].j();
        }
        return w;
    }

    @Override
    public void k() throws IOException {
        c c8 = this.v;
        if (c8 == null) {
            super.k();
            return;
        }
        throw c8;
    }

    private static final class b
    extends w {
        private final long[] f;
        private final long[] g;

        public b(N n8, Map<Object, Long> map) {
            super(n8);
            int n9;
            int n10 = n8.p();
            this.g = new long[n8.p()];
            Object object = new N.c();
            int n11 = 0;
            for (n9 = 0; n9 < n10; ++n9) {
                this.g[n9] = n8.n((int)n9, (N.c)object).m;
            }
            n10 = n8.i();
            this.f = new long[n10];
            object = new N.b();
            for (n9 = n11; n9 < n10; ++n9) {
                n8.g(n9, (N.b)object, true);
                long l8 = a.e(map.get(((N.b)object).b));
                long[] lArray = this.f;
                if (l8 == Long.MIN_VALUE) {
                    l8 = ((N.b)object).d;
                }
                lArray[n9] = l8;
                long l9 = ((N.b)object).d;
                if (l9 == -9223372036854775807L) continue;
                lArray = this.g;
                n11 = ((N.b)object).c;
                lArray[n11] = lArray[n11] - (l9 - l8);
            }
        }

        @Override
        public N.b g(int n8, N.b b8, boolean bl) {
            super.g(n8, b8, bl);
            b8.d = this.f[n8];
            return b8;
        }

        @Override
        public N.c o(int n8, N.c c8, long l8) {
            long l9;
            super.o(n8, c8, l8);
            c8.m = l8 = this.g[n8];
            l8 = l8 != -9223372036854775807L && (l9 = c8.l) != -9223372036854775807L ? Math.min(l9, l8) : c8.l;
            c8.l = l8;
            return c8;
        }
    }

    public static final class c
    extends IOException {
        public final int q;

        public c(int n8) {
            this.q = n8;
        }
    }

    private static final class d {
        private final F.b a;
        private final C b;

        private d(F.b b8, C c8) {
            this.a = b8;
            this.b = c8;
        }
    }
}

