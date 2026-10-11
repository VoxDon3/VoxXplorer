/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.os.SystemClock;
import ax.P0.y;
import ax.S0.d0;
import ax.Y0.P;
import ax.u7.h;

public final class i
implements P {
    private final float a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    private i(float f8, float f9, long l8, float f10, long l9, long l10, float f11) {
        this.a = f8;
        this.b = f9;
        this.c = l8;
        this.d = f10;
        this.e = l9;
        this.f = l10;
        this.g = f11;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f8;
        this.n = f9;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }

    private void f(long l8) {
        long l9 = this.r + this.s * 3L;
        if (this.m > l9) {
            l8 = d0.a1(this.c);
            float f8 = this.p;
            float f9 = l8;
            l8 = (long)((f8 - 1.0f) * f9);
            long l10 = (long)((this.n - 1.0f) * f9);
            this.m = ax.u7.h.j(l9, this.j, this.m - (l8 + l10));
            return;
        }
        this.m = l8 = d0.q(l8 - (long)(Math.max(0.0f, this.p - 1.0f) / this.d), this.m, l9);
        l9 = this.l;
        if (l9 != -9223372036854775807L && l8 > l9) {
            this.m = l9;
        }
    }

    private void g() {
        long l8;
        long l9 = this.h;
        if (l9 != -9223372036854775807L) {
            l8 = this.i;
            if (l8 == -9223372036854775807L) {
                long l10 = this.k;
                l8 = l9;
                if (l10 != -9223372036854775807L) {
                    l8 = l9;
                    if (l9 < l10) {
                        l8 = l10;
                    }
                }
                if ((l9 = this.l) != -9223372036854775807L && l8 > l9) {
                    l8 = l9;
                }
            }
        } else {
            l8 = -9223372036854775807L;
        }
        if (this.j == l8) {
            return;
        }
        this.j = l8;
        this.m = l8;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    private static long h(long l8, long l9, float f8) {
        return (long)((float)l8 * f8 + (1.0f - f8) * (float)l9);
    }

    private void i(long l8, long l9) {
        l8 -= l9;
        l9 = this.r;
        if (l9 == -9223372036854775807L) {
            this.r = l8;
            this.s = 0L;
            return;
        }
        this.r = l9 = Math.max(l8, androidx.media3.exoplayer.i.h(l9, l8, this.g));
        l8 = Math.abs(l8 - l9);
        this.s = androidx.media3.exoplayer.i.h(this.s, l8, this.g);
    }

    @Override
    public float a(long l8, long l9) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        this.i(l8, l9);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        this.f(l8);
        this.p = Math.abs(l8 -= this.m) < this.e ? 1.0f : d0.o(this.d * (float)l8 + 1.0f, this.o, this.n);
        return this.p;
    }

    @Override
    public long b() {
        return this.m;
    }

    @Override
    public void c() {
        long l8 = this.m;
        if (l8 == -9223372036854775807L) {
            return;
        }
        this.m = l8 += this.f;
        long l9 = this.l;
        if (l9 != -9223372036854775807L && l8 > l9) {
            this.m = l9;
        }
        this.q = -9223372036854775807L;
    }

    @Override
    public void d(y.g g8) {
        this.h = d0.a1(g8.a);
        this.k = d0.a1(g8.b);
        this.l = d0.a1(g8.c);
        float f8 = g8.d;
        if (f8 == -3.4028235E38f) {
            f8 = this.a;
        }
        this.o = f8;
        float f9 = g8.e;
        if (f9 == -3.4028235E38f) {
            f9 = this.b;
        }
        this.n = f9;
        if (f8 == 1.0f && f9 == 1.0f) {
            this.h = -9223372036854775807L;
        }
        this.g();
    }

    @Override
    public void e(long l8) {
        this.i = l8;
        this.g();
    }

    public static final class b {
        private float a = 0.97f;
        private float b = 1.03f;
        private long c = 1000L;
        private float d = 1.0E-7f;
        private long e = d0.a1(20L);
        private long f = d0.a1(500L);
        private float g = 0.999f;

        public i a() {
            return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}

