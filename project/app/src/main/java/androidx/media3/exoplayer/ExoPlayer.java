/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.X0;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.o0;
import ax.P0.H;
import ax.P0.J;
import ax.S0.d0;
import ax.S0.h;
import ax.Y0.D;
import ax.Y0.E;
import ax.Y0.F;
import ax.Y0.G;
import ax.Y0.I;
import ax.Y0.K;
import ax.Y0.L;
import ax.Y0.P;
import ax.Y0.T;
import ax.Y0.Y;
import ax.Y0.Z;
import ax.i1.F;
import ax.i1.r;
import ax.l1.n;
import ax.m1.e;
import ax.m1.j;
import ax.q1.x;
import ax.q7.f;
import ax.q7.u;

public interface ExoPlayer
extends H {
    public void a(int var1);

    public int b();

    public void c(Z var1);

    public void d();

    public boolean isScrubbingModeEnabled();

    public void r0(ax.Z0.c var1);

    public void setImageOutput(ImageOutput var1);

    public void setScrubbingModeEnabled(boolean var1);

    public static interface a {
        public void D(boolean var1);

        public void G(boolean var1);
    }

    public static final class b {
        P A;
        long B;
        long C;
        boolean D;
        boolean E;
        T F;
        boolean G;
        boolean H;
        String I;
        boolean J;
        X0 K;
        final Context a;
        h b;
        long c;
        u<ax.Y0.X> d;
        u<F.a> e;
        u<ax.l1.J> f;
        u<o0> g;
        u<e> h;
        f<h, ax.Z0.a> i;
        Looper j;
        int k;
        J l;
        ax.P0.c m;
        boolean n;
        int o;
        boolean p;
        boolean q;
        boolean r;
        int s;
        int t;
        boolean u;
        Z v;
        Y w;
        long x;
        long y;
        long z;

        public b(Context context, ax.Y0.X x8) {
            this(context, new G(x8), new ax.Y0.H(context));
            ax.S0.a.e(x8);
        }

        private b(Context context, u<ax.Y0.X> u8, u<F.a> u9) {
            this(context, u8, u9, new I(context), new ax.Y0.J(), new K(context), new L());
        }

        private b(Context context, u<ax.Y0.X> u8, u<F.a> u9, u<ax.l1.J> u10, u<o0> u11, u<e> u12, f<h, ax.Z0.a> f8) {
            this.a = ax.S0.a.e(context);
            this.d = u8;
            this.e = u9;
            this.f = u10;
            this.g = u11;
            this.h = u12;
            this.i = f8;
            this.j = d0.X();
            this.m = ax.P0.c.h;
            this.o = 0;
            this.s = 1;
            this.t = 0;
            this.u = true;
            this.v = Z.g;
            this.x = 5000L;
            this.y = 15000L;
            this.z = 3000L;
            this.w = Y.i;
            this.A = new i.b().a();
            this.b = ax.S0.h.a;
            this.B = 500L;
            this.C = 2000L;
            this.E = true;
            this.I = "";
            this.k = -1000;
            this.K = new l();
        }

        public static /* synthetic */ F.a a(Context context) {
            return new r(context, (x)new ax.q1.n());
        }

        public static /* synthetic */ o0 b(o0 o02) {
            return o02;
        }

        public static /* synthetic */ F.a c(F.a a8) {
            return a8;
        }

        public static /* synthetic */ e d(Context context) {
            return ax.m1.j.n(context);
        }

        public static /* synthetic */ ax.l1.J e(ax.l1.J j8) {
            return j8;
        }

        public static /* synthetic */ ax.Y0.X f(ax.Y0.X x8) {
            return x8;
        }

        public static /* synthetic */ ax.l1.J g(Context context) {
            return new n(context);
        }

        public ExoPlayer h() {
            ax.S0.a.g(this.G ^ true);
            this.G = true;
            return new X(this, null);
        }

        public b i(o0 o02) {
            ax.S0.a.g(this.G ^ true);
            ax.S0.a.e(o02);
            this.g = new D(o02);
            return this;
        }

        public b j(F.a a8) {
            ax.S0.a.g(this.G ^ true);
            ax.S0.a.e(a8);
            this.e = new F(a8);
            return this;
        }

        public b k(long l8) {
            boolean bl = l8 > 0L;
            ax.S0.a.a(bl);
            ax.S0.a.g(this.G ^ true);
            this.x = l8;
            return this;
        }

        public b l(long l8) {
            boolean bl = l8 > 0L;
            ax.S0.a.a(bl);
            ax.S0.a.g(this.G ^ true);
            this.y = l8;
            return this;
        }

        public b m(ax.l1.J j8) {
            ax.S0.a.g(this.G ^ true);
            ax.S0.a.e(j8);
            this.f = new E(j8);
            return this;
        }
    }

    public static class c {
        public static final c b = new c(-9223372036854775807L);
        public final long a;

        public c(long l8) {
            this.a = l8;
        }
    }
}

