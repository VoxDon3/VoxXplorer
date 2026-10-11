/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.T0.h;
import ax.X1.L;
import ax.X1.O;
import ax.X1.m;
import ax.X1.w;
import ax.q1.U;
import ax.q1.t;
import java.util.Arrays;
import java.util.Collections;

public final class o
implements m {
    private static final float[] m = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final O a;
    private final String b;
    private final G c;
    private final boolean[] d;
    private final a e;
    private final w f;
    private b g;
    private long h;
    private String i;
    private U j;
    private boolean k;
    private long l;

    o(O o8, String string) {
        this.a = o8;
        this.b = string;
        this.d = new boolean[4];
        this.e = new a(128);
        this.l = -9223372036854775807L;
        if (o8 != null) {
            this.f = new w(178, 128);
            this.c = new G();
            return;
        }
        this.f = null;
        this.c = null;
    }

    private static v a(a object, int n8, String string, String string2) {
        int n9;
        object = Arrays.copyOf(((a)object).e, ((a)object).c);
        F f8 = new F((byte[])object);
        f8.s(n8);
        f8.s(4);
        f8.q();
        f8.r(8);
        if (f8.g()) {
            f8.r(4);
            f8.r(3);
        }
        n8 = f8.h(4);
        float f9 = 1.0f;
        if (n8 == 15) {
            n8 = f8.h(8);
            n9 = f8.h(8);
            if (n9 == 0) {
                u.h("H263Reader", "Invalid aspect ratio");
            } else {
                f9 = (float)n8 / (float)n9;
            }
        } else {
            float[] fArray = m;
            if (n8 < fArray.length) {
                f9 = fArray[n8];
            } else {
                u.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (f8.g()) {
            f8.r(2);
            f8.r(1);
            if (f8.g()) {
                f8.r(15);
                f8.q();
                f8.r(15);
                f8.q();
                f8.r(15);
                f8.q();
                f8.r(3);
                f8.r(11);
                f8.q();
                f8.r(15);
                f8.q();
            }
        }
        if (f8.h(2) != 0) {
            u.h("H263Reader", "Unhandled video object layer shape");
        }
        f8.q();
        n8 = f8.h(16);
        f8.q();
        if (f8.g()) {
            if (n8 == 0) {
                u.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                --n8;
                n9 = 0;
                while (n8 > 0) {
                    ++n9;
                    n8 >>= 1;
                }
                f8.r(n9);
            }
        }
        f8.q();
        n9 = f8.h(13);
        f8.q();
        n8 = f8.h(13);
        f8.q();
        f8.q();
        return new v.b().j0(string).W(string2).y0("video/mp4v-es").F0(n9).h0(n8).u0(f9).k0(Collections.singletonList(object)).P();
    }

    @Override
    public void b() {
        ax.T0.h.c(this.d);
        this.e.c();
        Object object = this.g;
        if (object != null) {
            ((b)object).d();
        }
        if ((object = this.f) != null) {
            ((w)object).d();
        }
        this.h = 0L;
        this.l = -9223372036854775807L;
    }

    @Override
    public void c(G object) {
        ax.S0.a.i(this.g);
        ax.S0.a.i(this.j);
        int n8 = ((G)object).g();
        int n9 = ((G)object).j();
        byte[] byArray = ((G)object).f();
        this.h += (long)((G)object).a();
        this.j.g((G)object, ((G)object).a());
        while (true) {
            int n10;
            if ((n10 = ax.T0.h.e(byArray, n8, n9, this.d)) == n9) {
                if (!this.k) {
                    this.e.a(byArray, n8, n9);
                }
                this.g.a(byArray, n8, n9);
                object = this.f;
                if (object != null) {
                    ((w)object).a(byArray, n8, n9);
                }
                return;
            }
            Object object2 = ((G)object).f();
            int n11 = n10 + 3;
            int n12 = object2[n11] & 0xFF;
            int n13 = n10 - n8;
            boolean bl = this.k;
            int n14 = 0;
            if (!bl) {
                int n15;
                if (n13 > 0) {
                    this.e.a(byArray, n8, n10);
                }
                if (this.e.b(n12, n15 = n13 < 0 ? -n13 : 0)) {
                    U u8 = this.j;
                    object2 = this.e;
                    u8.e(o.a((a)object2, object2.d, ax.S0.a.e(this.i), this.b));
                    this.k = true;
                }
            }
            this.g.a(byArray, n8, n10);
            object2 = this.f;
            if (object2 != null) {
                if (n13 > 0) {
                    object2.a(byArray, n8, n10);
                    n8 = n14;
                } else {
                    n8 = -n13;
                }
                if (this.f.b(n8)) {
                    object2 = this.f;
                    n8 = ax.T0.h.L(object2.d, object2.e);
                    d0.i(this.c).Z(this.f.d, n8);
                    d0.i(this.a).b(this.l, this.c);
                }
                if (n12 == 178 && ((G)object).f()[n10 + 2] == 1) {
                    this.f.e(n12);
                }
            }
            n8 = n9 - n10;
            long l8 = this.h;
            long l9 = n8;
            this.g.b(l8 - l9, n8, this.k);
            this.g.c(n12, this.l);
            n8 = n11;
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        d8.a();
        this.i = d8.b();
        Object object = t8.u(d8.c(), 2);
        this.j = object;
        this.g = new b((U)object);
        object = this.a;
        if (object != null) {
            ((O)object).c(t8, d8);
        }
    }

    @Override
    public void e(boolean bl) {
        ax.S0.a.i(this.g);
        if (bl) {
            this.g.b(this.h, 0, this.k);
            this.g.d();
        }
    }

    @Override
    public void f(long l8, int n8) {
        this.l = l8;
    }

    private static final class a {
        private static final byte[] f = new byte[]{0, 0, 1};
        private boolean a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int n8) {
            this.e = new byte[n8];
        }

        public void a(byte[] byArray, int n8, int n9) {
            if (!this.a) {
                return;
            }
            byte[] byArray2 = this.e;
            n9 = byArray2.length;
            int n10 = this.c;
            int n11 = n9 - n8;
            if (n9 < n10 + n11) {
                this.e = Arrays.copyOf(byArray2, (n10 + n11) * 2);
            }
            System.arraycopy(byArray, n8, this.e, this.c, n11);
            this.c += n11;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean b(int n8, int n9) {
            int n10 = this.b;
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) throw new IllegalStateException();
                            if (n8 == 179 || n8 == 181) {
                                this.c -= n9;
                                this.a = false;
                                return true;
                            }
                        } else if ((n8 & 0xF0) != 32) {
                            u.h("H263Reader", "Unexpected start code value");
                            this.c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (n8 > 31) {
                        u.h("H263Reader", "Unexpected start code value");
                        this.c();
                    } else {
                        this.b = 3;
                    }
                } else if (n8 != 181) {
                    u.h("H263Reader", "Unexpected start code value");
                    this.c();
                } else {
                    this.b = 2;
                }
            } else if (n8 == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] byArray = f;
            this.a(byArray, 0, byArray.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    private static final class b {
        private final U a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(U u8) {
            this.a = u8;
        }

        public void a(byte[] byArray, int n8, int n9) {
            if (this.c) {
                int n10 = this.f;
                int n11 = n8 + 1 - n10;
                if (n11 < n9) {
                    boolean bl = (byArray[n11] & 0xC0) >> 6 == 0;
                    this.d = bl;
                    this.c = false;
                    return;
                }
                this.f = n10 + (n9 - n8);
            }
        }

        public void b(long l8, int n8, boolean bl) {
            boolean bl2 = this.h != -9223372036854775807L;
            ax.S0.a.g(bl2);
            if (this.e == 182 && bl && this.b) {
                int n9 = (int)(l8 - this.g);
                int n10 = this.d;
                this.a.f(this.h, n10, n9, n8, null);
            }
            if (this.e != 179) {
                this.g = l8;
            }
        }

        public void c(int n8, long l8) {
            this.e = n8;
            this.d = false;
            boolean bl = true;
            boolean bl2 = n8 == 182 || n8 == 179;
            this.b = bl2;
            bl2 = n8 == 182 ? bl : false;
            this.c = bl2;
            this.f = 0;
            this.h = l8;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }
}

