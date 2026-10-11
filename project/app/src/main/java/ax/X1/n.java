/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.Pair;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.h;
import ax.X1.L;
import ax.X1.O;
import ax.X1.m;
import ax.X1.w;
import ax.q1.U;
import ax.q1.t;
import java.util.Arrays;
import java.util.Collections;

public final class n
implements m {
    private static final double[] r = new double[]{23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0};
    private String a;
    private U b;
    private final O c;
    private final String d;
    private final G e;
    private final w f;
    private final boolean[] g;
    private final a h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    n(O o8, String string) {
        this.c = o8;
        this.d = string;
        this.g = new boolean[4];
        this.h = new a(128);
        if (o8 != null) {
            this.f = new w(178, 128);
            this.e = new G();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public n(String string) {
        this(null, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Pair<v, Long> a(a a8, String object, String object2) {
        long l8;
        float f8;
        int n8;
        int n9;
        int n10;
        byte[] byArray;
        block5: {
            block6: {
                block2: {
                    block3: {
                        block4: {
                            byArray = Arrays.copyOf(a8.d, a8.b);
                            n10 = byArray[4];
                            n9 = byArray[5];
                            n8 = byArray[6];
                            n10 = (n10 & 0xFF) << 4 | (n9 & 0xFF) >> 4;
                            n8 = (n9 & 0xF) << 8 | n8 & 0xFF;
                            n9 = (byArray[7] & 0xF0) >> 4;
                            if (n9 == 2) break block2;
                            if (n9 == 3) break block3;
                            if (n9 == 4) break block4;
                            f8 = 1.0f;
                            break block5;
                        }
                        f8 = n8 * 121;
                        n9 = n10 * 100;
                        break block6;
                    }
                    f8 = n8 * 16;
                    n9 = n10 * 9;
                    break block6;
                }
                f8 = n8 * 4;
                n9 = n10 * 3;
            }
            f8 /= (float)n9;
        }
        object = new v.b().j0((String)object).W((String)object2).y0("video/mpeg2").F0(n10).h0(n8).u0(f8).k0(Collections.singletonList(byArray)).P();
        n9 = (byArray[7] & 0xF) - 1;
        if (n9 >= 0 && n9 < ((Object)(object2 = (Object)r)).length) {
            reference var5_8 = object2[n9];
            n10 = byArray[a8.c + 9];
            n9 = (n10 & 0x60) >> 5;
            reference var3_9 = var5_8;
            if (n9 != (n10 &= 0x1F)) {
                var3_9 = var5_8 * (((double)n9 + 1.0) / (double)(n10 + 1));
            }
            l8 = (long)(1000000.0 / var3_9);
            return Pair.create((Object)object, (Object)l8);
        }
        l8 = 0L;
        return Pair.create((Object)object, (Object)l8);
    }

    @Override
    public void b() {
        ax.T0.h.c(this.g);
        this.h.c();
        w w8 = this.f;
        if (w8 != null) {
            w8.d();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override
    public void c(G object) {
        ax.S0.a.i(this.b);
        int n8 = ((G)object).g();
        int n9 = ((G)object).j();
        byte[] byArray = ((G)object).f();
        this.i += (long)((G)object).a();
        this.b.g((G)object, ((G)object).a());
        while (true) {
            int n10;
            int n11;
            if ((n11 = ax.T0.h.e(byArray, n8, n9, this.g)) == n9) {
                if (!this.k) {
                    this.h.a(byArray, n8, n9);
                }
                if ((object = this.f) != null) {
                    ((w)object).a(byArray, n8, n9);
                }
                return;
            }
            Object object2 = ((G)object).f();
            int n12 = n11 + 3;
            int n13 = object2[n12] & 0xFF;
            int n14 = n11 - n8;
            boolean bl = this.k;
            boolean bl2 = false;
            if (!bl) {
                if (n14 > 0) {
                    this.h.a(byArray, n8, n11);
                }
                if (this.h.b(n13, n10 = n14 < 0 ? -n14 : 0)) {
                    object2 = ax.X1.n.a(this.h, ax.S0.a.e(this.a), this.d);
                    this.b.e((v)((Pair)object2).first);
                    this.l = (Long)((Pair)object2).second;
                    this.k = true;
                }
            }
            if ((object2 = (Object)this.f) != null) {
                if (n14 > 0) {
                    ((w)object2).a(byArray, n8, n11);
                    n8 = 0;
                } else {
                    n8 = -n14;
                }
                if (this.f.b(n8)) {
                    object2 = this.f;
                    n8 = ax.T0.h.L(((w)object2).d, ((w)object2).e);
                    d0.i(this.e).Z(this.f.d, n8);
                    d0.i(this.c).b(this.o, this.e);
                }
                if (n13 == 178 && ((G)object).f()[n11 + 2] == 1) {
                    this.f.e(n13);
                }
            }
            if (n13 != 0 && n13 != 179) {
                if (n13 == 184) {
                    this.p = true;
                }
            } else {
                long l8;
                n11 = n9 - n11;
                if (this.q && this.k && (l8 = this.o) != -9223372036854775807L) {
                    n8 = this.p ? 1 : 0;
                    n10 = (int)(this.i - this.n);
                    this.b.f(l8, n8, n10 - n11, n11, null);
                }
                if (!this.j || this.q) {
                    this.n = this.i - (long)n11;
                    l8 = this.m;
                    if (l8 == -9223372036854775807L) {
                        l8 = this.o;
                        l8 = l8 != -9223372036854775807L ? (l8 += this.l) : -9223372036854775807L;
                    }
                    this.o = l8;
                    this.p = false;
                    this.m = -9223372036854775807L;
                    this.j = true;
                }
                if (n13 == 0) {
                    bl2 = true;
                }
                this.q = bl2;
            }
            n8 = n12;
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        d8.a();
        this.a = d8.b();
        this.b = t8.u(d8.c(), 2);
        O o8 = this.c;
        if (o8 != null) {
            o8.c(t8, d8);
        }
    }

    @Override
    public void e(boolean bl) {
        ax.S0.a.i(this.b);
        if (bl) {
            int n8 = this.p;
            int n9 = (int)(this.i - this.n);
            this.b.f(this.o, n8, n9, 0, null);
        }
    }

    @Override
    public void f(long l8, int n8) {
        this.m = l8;
    }

    private static final class a {
        private static final byte[] e = new byte[]{0, 0, 1};
        private boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int n8) {
            this.d = new byte[n8];
        }

        public void a(byte[] byArray, int n8, int n9) {
            if (!this.a) {
                return;
            }
            byte[] byArray2 = this.d;
            int n10 = byArray2.length;
            n9 = this.b;
            int n11 = n9 - n8;
            if (n10 < n9 + n11) {
                this.d = Arrays.copyOf(byArray2, (n9 + n11) * 2);
            }
            System.arraycopy(byArray, n8, this.d, this.b, n11);
            this.b += n11;
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean b(int n8, int n9) {
            block4: {
                if (this.a) {
                    this.b = n9 = this.b - n9;
                    if (this.c == 0 && n8 == 181) {
                        this.c = n9;
                        break block4;
                    } else {
                        this.a = false;
                        return true;
                    }
                }
                if (n8 == 179) {
                    this.a = true;
                }
            }
            byte[] byArray = e;
            this.a(byArray, 0, byArray.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }
}

