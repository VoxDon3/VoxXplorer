/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.N;
import ax.S0.a;
import ax.S0.d0;
import ax.i1.C;
import ax.i1.F;
import ax.i1.e;
import ax.i1.s0;
import ax.i1.w;
import java.io.IOException;
import java.util.ArrayList;

public final class f
extends s0 {
    private final long m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final ArrayList<e> s;
    private final N.c t;
    private c u;
    private d v;
    private long w;
    private long x;

    private f(b b8) {
        super(b8.a);
        this.m = b8.b;
        this.n = b8.c;
        this.o = b8.d;
        this.p = b8.e;
        this.q = b8.f;
        this.r = b8.g;
        this.s = new ArrayList();
        this.t = new N.c();
    }

    private void T(N n8) {
        int n9;
        long l8;
        long l9;
        Object object = this.t;
        int n10 = 0;
        n8.n(0, (N.c)object);
        long l10 = this.t.e();
        object = this.u;
        long l11 = Long.MIN_VALUE;
        if (object != null && !this.s.isEmpty() && !this.p) {
            l9 = this.w - l10;
            l8 = this.n == Long.MIN_VALUE ? l11 : this.x - l10;
        } else {
            long l12 = this.m;
            long l13 = this.n;
            l9 = l12;
            l8 = l13;
            if (this.q) {
                l8 = this.t.c();
                l9 = l12 + l8;
                l8 = l13 + l8;
            }
            this.w = l10 + l9;
            if (this.n != Long.MIN_VALUE) {
                l11 = l10 + l8;
            }
            this.x = l11;
            int n11 = this.s.size();
            for (n9 = 0; n9 < n11; ++n9) {
                this.s.get(n9).x(this.w, this.x);
            }
        }
        try {
            this.u = object = new c(n8, l9, l8, this.r);
            this.B((N)object);
            return;
        }
        catch (d d8) {
            this.v = d8;
            for (n9 = n10; n9 < this.s.size(); ++n9) {
                this.s.get(n9).u(this.v);
            }
            return;
        }
    }

    @Override
    protected void C() {
        super.C();
        this.v = null;
        this.u = null;
    }

    @Override
    protected void P(N n8) {
        if (this.v != null) {
            return;
        }
        this.T(n8);
    }

    @Override
    public void e(C c8) {
        a.g(this.s.remove(c8));
        this.k.e(((e)c8).q);
        if (this.s.isEmpty() && !this.p) {
            this.T(a.e(this.u).e);
        }
    }

    @Override
    public C i(F.b object, ax.m1.b b8, long l8) {
        object = new e(this.k.i((F.b)object, b8, l8), this.o, this.w, this.x);
        this.s.add((e)object);
        return object;
    }

    @Override
    public void k() throws IOException {
        d d8 = this.v;
        if (d8 == null) {
            super.k();
            return;
        }
        throw d8;
    }

    public static final class b {
        private final F a;
        private long b;
        private long c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;

        public b(F f8) {
            this.a = ax.S0.a.e(f8);
            this.d = true;
            this.c = Long.MIN_VALUE;
        }

        public f h() {
            this.h = true;
            return new f(this);
        }

        public b i(boolean bl) {
            ax.S0.a.g(this.h ^ true);
            this.e = bl;
            return this;
        }

        public b j(boolean bl) {
            ax.S0.a.g(this.h ^ true);
            this.g = bl;
            return this;
        }

        public b k(boolean bl) {
            ax.S0.a.g(this.h ^ true);
            this.d = bl;
            return this;
        }

        public b l(long l8) {
            ax.S0.a.g(this.h ^ true);
            this.c = l8;
            return this;
        }

        public b m(boolean bl) {
            ax.S0.a.g(this.h ^ true);
            this.f = bl;
            return this;
        }

        public b n(long l8) {
            boolean bl = l8 >= 0L;
            ax.S0.a.a(bl);
            ax.S0.a.g(this.h ^ true);
            this.b = l8;
            return this;
        }
    }

    private static final class c
    extends w {
        private final long f;
        private final long g;
        private final long h;
        private final boolean i;

        public c(N object, long l8, long l9, boolean bl) throws d {
            block8: {
                block9: {
                    block10: {
                        super((N)object);
                        long l10 = l9 - Long.MIN_VALUE;
                        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                        if (l11 != false && l9 < l8) {
                            throw new d(2, l8, l9);
                        }
                        int n8 = ((N)object).i();
                        boolean bl2 = false;
                        if (n8 != 1) break block8;
                        object = ((N)object).n(0, new N.c());
                        long l12 = Math.max(0L, l8);
                        if (!(bl || ((N.c)object).k || l12 == 0L || ((N.c)object).h)) {
                            throw new d(1);
                        }
                        l9 = l11 == false ? ((N.c)object).m : Math.max(0L, l9);
                        long l13 = ((N.c)object).m;
                        long l14 = l9;
                        long l15 = l12;
                        if (l13 != -9223372036854775807L) {
                            l8 = l9;
                            if (l9 > l13) {
                                l8 = l13;
                            }
                            l14 = l8;
                            l15 = l12;
                            if (l12 > l8) {
                                l15 = l8;
                                l14 = l8;
                            }
                        }
                        this.f = l15;
                        this.g = l14;
                        long l16 = l14 - -9223372036854775807L;
                        n8 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        l8 = n8 == 0 ? -9223372036854775807L : l14 - l15;
                        this.h = l8;
                        bl = bl2;
                        if (!((N.c)object).i) break block9;
                        if (n8 == 0) break block10;
                        bl = bl2;
                        if (l13 == -9223372036854775807L) break block9;
                        bl = bl2;
                        if (l14 != l13) break block9;
                    }
                    bl = true;
                }
                this.i = bl;
                return;
            }
            throw new d(0);
        }

        @Override
        public N.b g(int n8, N.b b8, boolean bl) {
            long l8;
            long l9;
            block0: {
                this.e.g(0, b8, bl);
                l9 = b8.o() - this.f;
                long l10 = this.h;
                l8 = -9223372036854775807L;
                if (l10 == -9223372036854775807L) break block0;
                l8 = l10 - l9;
            }
            return b8.t(b8.a, b8.b, 0, l8, l9);
        }

        @Override
        public N.c o(int n8, N.c c8, long l8) {
            this.e.o(0, c8, 0L);
            long l9 = c8.p;
            l8 = this.f;
            c8.p = l9 + l8;
            c8.m = this.h;
            c8.i = this.i;
            l9 = c8.l;
            if (l9 != -9223372036854775807L) {
                c8.l = l8 = Math.max(l9, l8);
                l9 = this.g;
                if (l9 != -9223372036854775807L) {
                    l8 = Math.min(l8, l9);
                }
                c8.l = l8 - this.f;
            }
            l8 = d0.E1(this.f);
            l9 = c8.e;
            if (l9 != -9223372036854775807L) {
                c8.e = l9 + l8;
            }
            if ((l9 = c8.f) != -9223372036854775807L) {
                c8.f = l9 + l8;
            }
            return c8;
        }
    }

    public static final class d
    extends IOException {
        public final int q;

        public d(int n8) {
            this(n8, -9223372036854775807L, -9223372036854775807L);
        }

        public d(int n8, long l8, long l9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal clipping: ");
            stringBuilder.append(d.a(n8, l8, l9));
            super(stringBuilder.toString());
            this.q = n8;
        }

        private static String a(int n8, long l8, long l9) {
            if (n8 != 0) {
                boolean bl = true;
                if (n8 != 1) {
                    if (n8 != 2) {
                        return "unknown";
                    }
                    if (l8 == -9223372036854775807L || l9 == -9223372036854775807L) {
                        bl = false;
                    }
                    a.g(bl);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("start exceeds end. Start time: ");
                    stringBuilder.append(l8);
                    stringBuilder.append(", End time: ");
                    stringBuilder.append(l9);
                    return stringBuilder.toString();
                }
                return "not seekable to start";
            }
            return "invalid period count";
        }
    }
}

