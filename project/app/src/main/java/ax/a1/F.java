/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;
import android.os.Build;
import ax.S0.d0;
import ax.S0.h;
import ax.a1.D;
import ax.a1.E;
import java.lang.reflect.Method;

final class F {
    private long A;
    private long B;
    private long C;
    boolean D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private h I;
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private D e;
    private int f;
    private boolean g;
    private long h;
    private float i;
    private boolean j;
    private long k;
    private int l;
    private long m;
    private long n;
    private Method o;
    private long p;
    private boolean q;
    private boolean r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private int x;
    private int y;
    private long z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public F(a a8) {
        this.a = ax.S0.a.e(a8);
        try {
            this.o = AudioTrack.class.getMethod("getLatency", null);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        this.b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = ax.S0.h.a;
    }

    private boolean b() {
        return this.g && ax.S0.a.e(this.c).getPlayState() == 2 && this.d() == 0L;
    }

    private long d() {
        if (this.z != -9223372036854775807L) {
            long l8 = this.g();
            return Math.min(this.C, l8);
        }
        long l9 = this.I.b();
        if (l9 - this.t >= 5L) {
            this.y(l9);
            this.t = l9;
        }
        return this.u + this.H + (this.v << 32);
    }

    private long e(long l8) {
        long l9;
        l8 = this.y == 0 ? (this.z != -9223372036854775807L ? d0.o1(this.g(), this.f) : this.f()) : d0.h0(l8 + this.m, this.i);
        l8 = l9 = Math.max(0L, l8 - this.p);
        if (this.z != -9223372036854775807L) {
            l8 = Math.min(d0.o1(this.C, this.f), l9);
        }
        return l8;
    }

    private long f() {
        return d0.o1(this.d(), this.f);
    }

    private long g() {
        if (ax.S0.a.e(this.c).getPlayState() == 2) {
            return this.B;
        }
        long l8 = d0.F(d0.h0(d0.a1(this.I.b()) - this.z, this.i), this.f);
        return this.B + l8;
    }

    private boolean i() {
        int n8 = ax.a1.E.a(ax.S0.a.e(this.c));
        boolean bl = n8 > this.l;
        this.l = n8;
        return bl;
    }

    private void n() {
        long l8;
        block9: {
            block8: {
                block7: {
                    l8 = this.I.nanoTime() / 1000L;
                    if (l8 - this.n < 30000L) break block7;
                    long l9 = this.f();
                    if (l9 != 0L) {
                        int n8;
                        this.b[this.x] = d0.n0(l9, this.i) - l8;
                        this.x = (this.x + 1) % 10;
                        int n9 = this.y;
                        if (n9 < 10) {
                            this.y = n9 + 1;
                        }
                        this.n = l8;
                        this.m = 0L;
                        for (n9 = 0; n9 < (n8 = this.y); ++n9) {
                            this.m += this.b[n9] / (long)n8;
                        }
                    }
                    break block8;
                }
                if (!this.g) break block9;
            }
            return;
        }
        this.p(l8);
        ax.S0.a.e(this.e).i(l8, this.i, this.e(l8));
    }

    private void o(long l8) {
        long l9;
        if (this.D && (l9 = this.k) != -9223372036854775807L && l8 >= l9) {
            l9 = d0.n0(l8 - l9, this.i);
            l8 = this.I.a();
            l9 = d0.E1(l9);
            this.k = -9223372036854775807L;
            this.a.a(l8 - l9);
        }
    }

    private void p(long l8) {
        Method method;
        if (this.r && (method = this.o) != null && l8 - this.s >= 500000L) {
            block4: {
                long l9;
                this.p = l9 = (long)d0.i((Integer)method.invoke(ax.S0.a.e(this.c), null)).intValue() * 1000L - this.h;
                this.p = l9 = Math.max(l9, 0L);
                if (l9 <= 5000000L) break block4;
                try {
                    this.a.c(l9);
                    this.p = 0L;
                }
                catch (Exception exception) {
                    this.o = null;
                }
            }
            this.s = l8;
        }
    }

    private static boolean q(int n8) {
        return Build.VERSION.SDK_INT < 23 && (n8 == 5 || n8 == 6);
    }

    private void t() {
        this.m = 0L;
        this.y = 0;
        this.x = 0;
        this.n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.j = false;
    }

    private void y(long l8) {
        long l9;
        block10: {
            block11: {
                block9: {
                    long l10;
                    AudioTrack audioTrack = ax.S0.a.e(this.c);
                    int n8 = audioTrack.getPlayState();
                    if (n8 == 1) break block9;
                    l9 = l10 = (long)audioTrack.getPlaybackHeadPosition() & 0xFFFFFFFFL;
                    if (this.g) {
                        if (n8 == 2 && l10 == 0L) {
                            this.w = this.u;
                        }
                        l9 = l10 + this.w;
                    }
                    if (Build.VERSION.SDK_INT > 29) break block10;
                    if (l9 != 0L || this.u <= 0L || n8 != 3) break block11;
                    if (this.A == -9223372036854775807L) {
                        this.A = l8;
                    }
                }
                return;
            }
            this.A = -9223372036854775807L;
        }
        if ((l8 = this.u) > l9) {
            if (this.G) {
                this.H += l8;
                this.G = false;
            } else {
                ++this.v;
            }
        }
        this.u = l9;
    }

    public void a() {
        this.G = true;
        D d8 = this.e;
        if (d8 != null) {
            d8.d();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public long c() {
        AudioTrack audioTrack = ax.S0.a.e(this.c);
        if (audioTrack.getPlayState() == 3) {
            this.n();
        }
        long l8 = this.I.nanoTime() / 1000L;
        D d8 = ax.S0.a.e(this.e);
        boolean bl = d8.f();
        long l9 = bl ? d8.e(l8, this.i) : this.e(l8);
        long l10 = l9;
        int n8 = audioTrack.getPlayState();
        if (n8 == 3) {
            long l11;
            if (bl || !d8.h()) {
                this.o(l10);
            }
            long l12 = this.F;
            l9 = l10;
            if (l12 != -9223372036854775807L) {
                l11 = this.E;
                long l13 = d0.h0(l8 - l12, this.i);
                l12 = this.E + l13;
                long l14 = Math.abs(l12 - l10);
                l9 = l10;
                if (l10 - l11 != 0L) {
                    l9 = l10;
                    if (l14 < 1000000L) {
                        l9 = l13 * 10L / 100L;
                        l9 = d0.q(l10, l12 - l9, l12 + l9);
                    }
                }
            }
            if (!this.D && !this.j && (l10 = this.E) != -9223372036854775807L && l9 > l10) {
                this.j = true;
                l11 = d0.n0(d0.E1(l9 - l10), this.i);
                l10 = this.I.a();
                l11 = d0.E1(l11);
                this.a.a(l10 - l11);
            }
            this.F = l8;
            this.E = l9;
            return l9;
        }
        if (n8 == 1) {
            this.o(l10);
        }
        return l10;
    }

    public void h(long l8) {
        this.B = this.d();
        this.z = d0.a1(this.I.b());
        this.C = l8;
    }

    public boolean j(long l8) {
        return l8 > d0.F(this.c(), this.f) || this.b();
        {
        }
    }

    public boolean k() {
        return ax.S0.a.e(this.c).getPlayState() == 3;
    }

    public boolean l(long l8) {
        return this.A != -9223372036854775807L && l8 > 0L && this.I.b() - this.A >= 200L;
    }

    public boolean m(long l8) {
        int n8 = ax.S0.a.e(this.c).getPlayState();
        boolean bl = this.g;
        boolean bl2 = false;
        if (bl) {
            if (n8 == 2) {
                this.q = false;
                return false;
            }
            if (n8 == 1 && this.d() == 0L) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            bl = this.i();
        } else {
            boolean bl3;
            boolean bl4 = this.q;
            this.q = bl3 = this.j(l8);
            bl = bl2;
            if (bl4) {
                bl = bl2;
                if (!bl3) {
                    bl = bl2;
                    if (n8 != 1) {
                        bl = true;
                    }
                }
            }
        }
        if (bl) {
            this.a.b(this.d, d0.E1(this.h));
        }
        return true;
    }

    public void r() {
        this.t();
        if (this.z == -9223372036854775807L) {
            ax.S0.a.e(this.e).j();
        }
        this.B = this.d();
    }

    public void s() {
        this.t();
        this.c = null;
        this.e = null;
    }

    public void u(AudioTrack audioTrack, boolean bl, int n8, int n9, int n10, boolean bl2) {
        this.c = audioTrack;
        this.d = n10;
        this.e = new D(audioTrack, this.a);
        this.f = audioTrack.getSampleRate();
        bl = bl && ax.a1.F.q(n8);
        this.g = bl;
        this.r = bl = d0.L0(n8);
        long l8 = bl ? d0.o1(n10 / n9, this.f) : -9223372036854775807L;
        this.h = l8;
        this.u = 0L;
        this.v = 0L;
        this.G = false;
        this.H = 0L;
        this.w = 0L;
        this.q = false;
        this.z = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.s = 0L;
        this.p = 0L;
        this.i = 1.0f;
        this.l = 0;
        this.k = -9223372036854775807L;
        this.D = bl2;
    }

    public void v(float f8) {
        this.i = f8;
        D d8 = this.e;
        if (d8 != null) {
            d8.j();
        }
        this.t();
    }

    public void w(h h8) {
        this.I = h8;
    }

    public void x() {
        if (this.z != -9223372036854775807L) {
            this.z = d0.a1(this.I.b());
        }
        this.k = this.f();
        ax.S0.a.e(this.e).j();
    }

    public static interface a {
        public void a(long var1);

        public void b(int var1, long var2);

        public void c(long var1);

        public void d(long var1, long var3, long var5, long var7);

        public void e(long var1, long var3, long var5, long var7);
    }
}

