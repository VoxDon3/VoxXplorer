/*
 * Decompiled with CFR 0.152.
 */
package ax.Y1;

import android.util.Pair;
import ax.P0.E;
import ax.P0.k;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.Y1.d;
import ax.Y1.e;
import ax.q1.M;
import ax.q1.U;
import ax.q1.Y;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.IOException;
import java.util.List;

public final class b
implements r {
    public static final x h = new ax.Y1.a();
    private t a;
    private U b;
    private int c = 0;
    private long d = -1L;
    private b e;
    private int f = -1;
    private long g = -1L;

    public static /* synthetic */ r[] g() {
        return new r[]{new b()};
    }

    private void h() {
        ax.S0.a.i(this.b);
        d0.i(this.a);
    }

    private void i(s s8) throws IOException {
        boolean bl = s8.getPosition() == 0L;
        ax.S0.a.g(bl);
        int n8 = this.f;
        if (n8 != -1) {
            s8.n(n8);
            this.c = 4;
            return;
        }
        if (ax.Y1.d.a(s8)) {
            s8.n((int)(s8.i() - s8.getPosition()));
            this.c = 1;
            return;
        }
        throw E.a("Unsupported or unrecognized wav file type.", null);
    }

    private void j(s object) throws IOException {
        block6: {
            block3: {
                int n8;
                block5: {
                    block4: {
                        block2: {
                            object = ax.Y1.d.b((s)object);
                            n8 = ((ax.Y1.c)object).a;
                            if (n8 != 17) break block2;
                            this.e = new a(this.a, this.b, (ax.Y1.c)object);
                            break block3;
                        }
                        if (n8 != 6) break block4;
                        this.e = new c(this.a, this.b, (ax.Y1.c)object, "audio/g711-alaw", -1);
                        break block3;
                    }
                    if (n8 != 7) break block5;
                    this.e = new c(this.a, this.b, (ax.Y1.c)object, "audio/g711-mlaw", -1);
                    break block3;
                }
                if ((n8 = Y.a(n8, ((ax.Y1.c)object).f)) == 0) break block6;
                this.e = new c(this.a, this.b, (ax.Y1.c)object, "audio/raw", n8);
            }
            this.c = 3;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported WAV format type: ");
        stringBuilder.append(((ax.Y1.c)object).a);
        throw E.d(stringBuilder.toString());
    }

    private void l(s s8) throws IOException {
        this.d = ax.Y1.d.c(s8);
        this.c = 2;
    }

    private int m(s s8) throws IOException {
        boolean bl = this.g != -1L;
        ax.S0.a.g(bl);
        long l8 = this.g;
        long l9 = s8.getPosition();
        if (ax.S0.a.e(this.e).d(s8, l8 - l9)) {
            return -1;
        }
        return 0;
    }

    private void n(s object) throws IOException {
        Pair<Long, Long> pair = ax.Y1.d.e((s)object);
        this.f = ((Long)pair.first).intValue();
        long l8 = (Long)pair.second;
        long l9 = this.d;
        long l10 = l8;
        if (l9 != -1L) {
            l10 = l8;
            if (l8 == 0xFFFFFFFFL) {
                l10 = l9;
            }
        }
        this.g = (long)this.f + l10;
        l10 = object.getLength();
        if (l10 != -1L && this.g > l10) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Data exceeds input length: ");
            ((StringBuilder)object).append(this.g);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(l10);
            u.h("WavExtractor", ((StringBuilder)object).toString());
            this.g = l10;
        }
        ax.S0.a.e(this.e).e(this.f, this.g);
        this.c = 4;
    }

    @Override
    public void a(t t8) {
        this.a = t8;
        this.b = t8.u(0, 1);
        t8.o();
    }

    @Override
    public void b(long l8, long l9) {
        int n8 = l8 == 0L ? 0 : 4;
        this.c = n8;
        b b8 = this.e;
        if (b8 != null) {
            b8.c(l9);
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        return ax.Y1.d.a(s8);
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        this.h();
        int n8 = this.c;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return this.m(s8);
                        }
                        throw new IllegalStateException();
                    }
                    this.n(s8);
                    return 0;
                }
                this.j(s8);
                return 0;
            }
            this.l(s8);
            return 0;
        }
        this.i(s8);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }

    private static final class a
    implements b {
        private static final int[] m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Short.MAX_VALUE};
        private final t a;
        private final U b;
        private final ax.Y1.c c;
        private final int d;
        private final byte[] e;
        private final G f;
        private final int g;
        private final v h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(t object, U u8, ax.Y1.c c8) throws E {
            int n8;
            int n9;
            this.a = object;
            this.b = u8;
            this.c = c8;
            this.g = n9 = Math.max(1, c8.c / 10);
            object = new G(c8.g);
            ((G)object).E();
            this.d = n8 = ((G)object).E();
            int n10 = c8.b;
            int n11 = (c8.e - n10 * 4) * 8 / (c8.f * n10) + 1;
            if (n8 == n11) {
                n11 = d0.k(n9, n8);
                this.e = new byte[c8.e * n11];
                this.f = new G(n11 * ax.Y1.b$a.h(n8, n10));
                n8 = c8.c * c8.e * 8 / n8;
                this.h = new v.b().y0("audio/raw").S(n8).t0(n8).o0(ax.Y1.b$a.h(n9, n10)).T(c8.b).z0(c8.c).s0(2).P();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected frames per block: ");
            ((StringBuilder)object).append(n11);
            ((StringBuilder)object).append("; got: ");
            ((StringBuilder)object).append(n8);
            throw E.a(((StringBuilder)object).toString(), null);
        }

        private void a(byte[] byArray, int n8, G g8) {
            for (int i8 = 0; i8 < n8; ++i8) {
                for (int i9 = 0; i9 < this.c.b; ++i9) {
                    this.b(byArray, i8, i9, g8.f());
                }
            }
            n8 = this.g(this.d * n8);
            g8.b0(0);
            g8.a0(n8);
        }

        private void b(byte[] byArray, int n8, int n9, byte[] byArray2) {
            Object object = this.c;
            int n10 = ((ax.Y1.c)object).e;
            int n11 = ((ax.Y1.c)object).b;
            int n12 = n8 * n10 + n9 * 4;
            int n13 = n10 / n11;
            int n14 = (byArray[n12 + 1] & 0xFF) << 8 | byArray[n12] & 0xFF;
            n10 = Math.min(byArray[n12 + 2] & 0xFF, 88);
            Object object2 = n[n10];
            n9 = (n8 * this.d * n11 + n9) * 2;
            byArray2[n9] = (byte)(n14 & 0xFF);
            byArray2[n9 + 1] = (byte)(n14 >> 8);
            for (n8 = 0; n8 < (n13 - 4) * 2; ++n8) {
                int n15;
                int n16 = byArray[n8 / 8 * n11 * 4 + (n11 * 4 + n12) + n8 / 2 % 4];
                n16 = n8 % 2 == 0 ? (n16 &= 0xF) : (n16 & 0xFF) >> 4;
                object2 = n15 = ((n16 & 7) * 2 + 1) * object2 >> 3;
                if ((n16 & 8) != 0) {
                    object2 = -n15;
                }
                n14 = d0.p(n14 + object2, Short.MIN_VALUE, Short.MAX_VALUE);
                byArray2[n9 += n11 * 2] = (byte)(n14 & 0xFF);
                byArray2[n9 + 1] = (byte)(n14 >> 8);
                object2 = m[n16];
                object = n;
                n10 = d0.p(n10 + object2, 0, ((Object)object).length - 1);
                object2 = object[n10];
            }
        }

        private int f(int n8) {
            return n8 / (this.c.b * 2);
        }

        private int g(int n8) {
            return ax.Y1.b$a.h(n8, this.c.b);
        }

        private static int h(int n8, int n9) {
            return n8 * 2 * n9;
        }

        private void i(int n8) {
            long l8 = this.j;
            long l9 = d0.p1(this.l, 1000000L, this.c.c);
            int n9 = this.g(n8);
            int n10 = this.k;
            this.b.f(l8 + l9, 1, n9, n10 - n9, null);
            this.l += (long)n8;
            this.k -= n9;
        }

        @Override
        public void c(long l8) {
            this.i = 0;
            this.j = l8;
            this.k = 0;
            this.l = 0L;
        }

        /*
         * Unable to fully structure code
         */
        @Override
        public boolean d(s var1_1, long var2_2) throws IOException {
            var4_3 = d0.k(this.g - this.f(this.k), this.d) * this.c.e;
            if (var2_2 == 0L) {
                while (true) {
                    var6_5 = true;
                    break;
                }
            } else {
                var6_5 = false;
            }
            while (!var6_5 && (var5_4 = this.i) < var4_3) {
                var5_4 = (int)Math.min((long)(var4_3 - var5_4), var2_2);
                if ((var5_4 = var1_1.c(this.e, this.i, var5_4)) == -1) ** continue;
                this.i += var5_4;
            }
            var4_3 = this.i / this.c.e;
            if (var4_3 > 0) {
                this.a(this.e, var4_3, this.f);
                this.i -= var4_3 * this.c.e;
                var4_3 = this.f.j();
                this.b.g(this.f, var4_3);
                this.k = var4_3 = this.k + var4_3;
                var5_4 = this.f(var4_3);
                var4_3 = this.g;
                if (var5_4 >= var4_3) {
                    this.i(var4_3);
                }
            }
            if (var6_5 && (var4_3 = this.f(this.k)) > 0) {
                this.i(var4_3);
            }
            return var6_5;
        }

        @Override
        public void e(int n8, long l8) {
            e e8 = new e(this.c, this.d, n8, l8);
            this.a.h(e8);
            this.b.e(this.h);
            this.b.d(e8.n());
        }
    }

    private static interface b {
        public void c(long var1);

        public boolean d(s var1, long var2) throws IOException;

        public void e(int var1, long var2) throws E;
    }

    private static final class c
    implements b {
        private final t a;
        private final U b;
        private final ax.Y1.c c;
        private final v d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(t object, U u8, ax.Y1.c c8, String string, int n8) throws E {
            this.a = object;
            this.b = u8;
            this.c = c8;
            int n9 = c8.b * c8.f / 8;
            if (c8.e == n9) {
                int n10 = c8.c;
                int n11 = n10 * n9 * 8;
                this.e = n9 = Math.max(n9, n10 * n9 / 10);
                this.d = new v.b().W("audio/wav").y0(string).S(n11).t0(n11).o0(n9).T(c8.b).z0(c8.c).s0(n8).P();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected block size: ");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append("; got: ");
            ((StringBuilder)object).append(c8.e);
            throw E.a(((StringBuilder)object).toString(), null);
        }

        @Override
        public void c(long l8) {
            this.f = l8;
            this.g = 0;
            this.h = 0L;
        }

        @Override
        public boolean d(s object, long l8) throws IOException {
            int n8;
            int n9;
            long l9;
            long l10;
            while ((l10 = (l9 = l8 - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1)) > 0 && (n9 = this.g) < (n8 = this.e)) {
                l10 = (int)Math.min((long)(n8 - n9), l8);
                if ((l10 = (long)this.b.a((k)object, (int)l10, true)) == -1) {
                    l8 = 0L;
                    continue;
                }
                this.g += l10;
                l8 -= (long)l10;
            }
            object = this.c;
            n9 = ((ax.Y1.c)object).e;
            n8 = this.g / n9;
            if (n8 > 0) {
                long l11 = this.f;
                l8 = d0.p1(this.h, 1000000L, ((ax.Y1.c)object).c);
                int n10 = n8 * n9;
                n9 = this.g - n10;
                this.b.f(l11 + l8, 1, n10, n9, null);
                this.h += (long)n8;
                this.g = n9;
            }
            return l10 <= 0;
        }

        @Override
        public void e(int n8, long l8) {
            e e8 = new e(this.c, 1, n8, l8);
            this.a.h(e8);
            this.b.e(this.d);
            this.b.d(e8.n());
        }
    }
}

