package ax.a1;

import android.media.AudioTrack;
import android.os.Build;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class F {
    private long A;
    private long B;
    private long C;
    boolean D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private InterfaceC0975h I;
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

    public interface a {
        void a(long j);

        void b(int i, long j);

        void c(long j);

        void d(long j, long j2, long j3, long j4);

        void e(long j, long j2, long j3, long j4);
    }

    public F(a aVar) {
        this.a = (a) C0968a.e(aVar);
        try {
            this.o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = InterfaceC0975h.a;
    }

    private boolean b() {
        return this.g && ((AudioTrack) C0968a.e(this.c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.z != -9223372036854775807L) {
            return Math.min(this.C, g());
        }
        long b = this.I.b();
        if (b - this.t >= 5) {
            y(b);
            this.t = b;
        }
        return this.u + this.H + (this.v << 32);
    }

    private long e(long j) {
        long max = Math.max(0L, (this.y == 0 ? this.z != -9223372036854775807L ? ax.S0.d0.o1(g(), this.f) : f() : ax.S0.d0.h0(j + this.m, this.i)) - this.p);
        return this.z != -9223372036854775807L ? Math.min(ax.S0.d0.o1(this.C, this.f), max) : max;
    }

    private long f() {
        return ax.S0.d0.o1(d(), this.f);
    }

    private long g() {
        if (((AudioTrack) C0968a.e(this.c)).getPlayState() == 2) {
            return this.B;
        }
        return this.B + ax.S0.d0.F(ax.S0.d0.h0(ax.S0.d0.a1(this.I.b()) - this.z, this.i), this.f);
    }

    private boolean i() {
        int underrunCount;
        underrunCount = ((AudioTrack) C0968a.e(this.c)).getUnderrunCount();
        boolean z = underrunCount > this.l;
        this.l = underrunCount;
        return z;
    }

    private void n() {
        long nanoTime = this.I.nanoTime() / 1000;
        if (nanoTime - this.n >= 30000) {
            long f = f();
            if (f != 0) {
                this.b[this.x] = ax.S0.d0.n0(f, this.i) - nanoTime;
                this.x = (this.x + 1) % 10;
                int i = this.y;
                if (i < 10) {
                    this.y = i + 1;
                }
                this.n = nanoTime;
                this.m = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.y;
                    if (i2 >= i3) {
                        break;
                    }
                    this.m += this.b[i2] / i3;
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.g) {
            return;
        }
        p(nanoTime);
        ((D) C0968a.e(this.e)).i(nanoTime, this.i, e(nanoTime));
    }

    private void o(long j) {
        if (this.D) {
            long j2 = this.k;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long a2 = this.I.a() - ax.S0.d0.E1(ax.S0.d0.n0(j - j2, this.i));
            this.k = -9223372036854775807L;
            this.a.a(a2);
        }
    }

    private void p(long j) {
        Method method;
        if (!this.r || (method = this.o) == null || j - this.s < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) ax.S0.d0.i((Integer) method.invoke(C0968a.e(this.c), null))).intValue() * 1000) - this.h;
            this.p = intValue;
            long max = Math.max(intValue, 0L);
            this.p = max;
            if (max > 5000000) {
                this.a.c(max);
                this.p = 0L;
            }
        } catch (Exception unused) {
            this.o = null;
        }
        this.s = j;
    }

    private static boolean q(int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return i == 5 || i == 6;
        }
        return false;
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

    private void y(long j) {
        int playState = ((AudioTrack) C0968a.e(this.c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.w = this.u;
            }
            playbackHeadPosition += this.w;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.u > 0 && playState == 3) {
                if (this.A == -9223372036854775807L) {
                    this.A = j;
                    return;
                }
                return;
            }
            this.A = -9223372036854775807L;
        }
        long j2 = this.u;
        if (j2 > playbackHeadPosition) {
            if (this.G) {
                this.H += j2;
                this.G = false;
            } else {
                this.v++;
            }
        }
        this.u = playbackHeadPosition;
    }

    public void a() {
        this.G = true;
        D d = this.e;
        if (d != null) {
            d.d();
        }
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) C0968a.e(this.c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long nanoTime = this.I.nanoTime() / 1000;
        D d = (D) C0968a.e(this.e);
        boolean f = d.f();
        long e = f ? d.e(nanoTime, this.i) : e(nanoTime);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(e);
            }
            return e;
        }
        if (f || !d.h()) {
            o(e);
        }
        long j = this.F;
        if (j != -9223372036854775807L) {
            long j2 = e - this.E;
            long h0 = ax.S0.d0.h0(nanoTime - j, this.i);
            long j3 = this.E + h0;
            long abs = Math.abs(j3 - e);
            if (j2 != 0 && abs < 1000000) {
                long j4 = (h0 * 10) / 100;
                e = ax.S0.d0.q(e, j3 - j4, j3 + j4);
            }
        }
        if (!this.D && !this.j) {
            long j5 = this.E;
            if (j5 != -9223372036854775807L && e > j5) {
                this.j = true;
                this.a.a(this.I.a() - ax.S0.d0.E1(ax.S0.d0.n0(ax.S0.d0.E1(e - j5), this.i)));
            }
        }
        this.F = nanoTime;
        this.E = e;
        return e;
    }

    public void h(long j) {
        this.B = d();
        this.z = ax.S0.d0.a1(this.I.b());
        this.C = j;
    }

    public boolean j(long j) {
        return j > ax.S0.d0.F(c(), this.f) || b();
    }

    public boolean k() {
        return ((AudioTrack) C0968a.e(this.c)).getPlayState() == 3;
    }

    public boolean l(long j) {
        return this.A != -9223372036854775807L && j > 0 && this.I.b() - this.A >= 200;
    }

    public boolean m(long j) {
        boolean z;
        int playState = ((AudioTrack) C0968a.e(this.c)).getPlayState();
        boolean z2 = false;
        if (this.g) {
            if (playState == 2) {
                this.q = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z = i();
        } else {
            boolean z3 = this.q;
            boolean j2 = j(j);
            this.q = j2;
            if (z3 && !j2 && playState != 1) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            this.a.b(this.d, ax.S0.d0.E1(this.h));
        }
        return true;
    }

    public void r() {
        t();
        if (this.z == -9223372036854775807L) {
            ((D) C0968a.e(this.e)).j();
        }
        this.B = d();
    }

    public void s() {
        t();
        this.c = null;
        this.e = null;
    }

    public void u(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.c = audioTrack;
        this.d = i3;
        this.e = new D(audioTrack, this.a);
        this.f = audioTrack.getSampleRate();
        this.g = z && q(i);
        boolean L0 = ax.S0.d0.L0(i);
        this.r = L0;
        this.h = L0 ? ax.S0.d0.o1(i3 / i2, this.f) : -9223372036854775807L;
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
        this.D = z2;
    }

    public void v(float f) {
        this.i = f;
        D d = this.e;
        if (d != null) {
            d.j();
        }
        t();
    }

    public void w(InterfaceC0975h interfaceC0975h) {
        this.I = interfaceC0975h;
    }

    public void x() {
        if (this.z != -9223372036854775807L) {
            this.z = ax.S0.d0.a1(this.I.b());
        }
        this.k = f();
        ((D) C0968a.e(this.e)).j();
    }
}
