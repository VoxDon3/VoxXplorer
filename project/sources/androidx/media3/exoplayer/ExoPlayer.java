package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.C0603i;
import androidx.media3.exoplayer.C0605j;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.InterfaceC0616o0;
import androidx.media3.exoplayer.image.ImageOutput;
import ax.P0.C0894c;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;
import ax.Z0.C1249u0;
import ax.Z0.InterfaceC1200a;
import ax.Z0.InterfaceC1206c;
import ax.i1.InterfaceC2209F;
import ax.l1.AbstractC2451J;
import ax.q1.C2854n;
import ax.q7.InterfaceC2879f;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public interface ExoPlayer extends ax.P0.H {

    public interface a {
        void D(boolean z);

        void G(boolean z);
    }

    public static class c {
        public static final c b = new c(-9223372036854775807L);
        public final long a;

        public c(long j) {
            this.a = j;
        }
    }

    void a(int i);

    int b();

    void c(ax.Y0.Z z);

    void d();

    boolean isScrubbingModeEnabled();

    void r0(InterfaceC1206c interfaceC1206c);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    public static final class b {
        ax.Y0.P A;
        long B;
        long C;
        boolean D;
        boolean E;
        ax.Y0.T F;
        boolean G;
        boolean H;
        String I;
        boolean J;
        X0 K;
        final Context a;
        InterfaceC0975h b;
        long c;
        ax.q7.u<ax.Y0.X> d;
        ax.q7.u<InterfaceC2209F.a> e;
        ax.q7.u<AbstractC2451J> f;
        ax.q7.u<InterfaceC0616o0> g;
        ax.q7.u<ax.m1.e> h;
        InterfaceC2879f<InterfaceC0975h, InterfaceC1200a> i;
        Looper j;
        int k;
        ax.P0.J l;
        C0894c m;
        boolean n;
        int o;
        boolean p;
        boolean q;
        boolean r;
        int s;
        int t;
        boolean u;
        ax.Y0.Z v;
        ax.Y0.Y w;
        long x;
        long y;
        long z;

        public b(final Context context, final ax.Y0.X x) {
            this(context, new ax.q7.u() { // from class: ax.Y0.G
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.f(X.this);
                }
            }, new ax.q7.u() { // from class: ax.Y0.H
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            });
            C0968a.e(x);
        }

        public static /* synthetic */ InterfaceC2209F.a a(Context context) {
            return new ax.i1.r(context, new C2854n());
        }

        public static /* synthetic */ InterfaceC0616o0 b(InterfaceC0616o0 interfaceC0616o0) {
            return interfaceC0616o0;
        }

        public static /* synthetic */ InterfaceC2209F.a c(InterfaceC2209F.a aVar) {
            return aVar;
        }

        public static /* synthetic */ AbstractC2451J e(AbstractC2451J abstractC2451J) {
            return abstractC2451J;
        }

        public static /* synthetic */ ax.Y0.X f(ax.Y0.X x) {
            return x;
        }

        public static /* synthetic */ AbstractC2451J g(Context context) {
            return new ax.l1.n(context);
        }

        public ExoPlayer h() {
            C0968a.g(!this.G);
            this.G = true;
            return new X(this, null);
        }

        public b i(final InterfaceC0616o0 interfaceC0616o0) {
            C0968a.g(!this.G);
            C0968a.e(interfaceC0616o0);
            this.g = new ax.q7.u() { // from class: ax.Y0.D
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.b(InterfaceC0616o0.this);
                }
            };
            return this;
        }

        public b j(final InterfaceC2209F.a aVar) {
            C0968a.g(!this.G);
            C0968a.e(aVar);
            this.e = new ax.q7.u() { // from class: ax.Y0.F
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.c(InterfaceC2209F.a.this);
                }
            };
            return this;
        }

        public b k(long j) {
            C0968a.a(j > 0);
            C0968a.g(!this.G);
            this.x = j;
            return this;
        }

        public b l(long j) {
            C0968a.a(j > 0);
            C0968a.g(!this.G);
            this.y = j;
            return this;
        }

        public b m(final AbstractC2451J abstractC2451J) {
            C0968a.g(!this.G);
            C0968a.e(abstractC2451J);
            this.f = new ax.q7.u() { // from class: ax.Y0.E
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.e(AbstractC2451J.this);
                }
            };
            return this;
        }

        private b(final Context context, ax.q7.u<ax.Y0.X> uVar, ax.q7.u<InterfaceC2209F.a> uVar2) {
            this(context, uVar, uVar2, new ax.q7.u() { // from class: ax.Y0.I
                @Override // ax.q7.u
                public final Object get() {
                    return ExoPlayer.b.g(context);
                }
            }, new ax.q7.u() { // from class: ax.Y0.J
                @Override // ax.q7.u
                public final Object get() {
                    return new C0605j();
                }
            }, new ax.q7.u() { // from class: ax.Y0.K
                @Override // ax.q7.u
                public final Object get() {
                    ax.m1.e n;
                    n = ax.m1.j.n(context);
                    return n;
                }
            }, new InterfaceC2879f() { // from class: ax.Y0.L
                @Override // ax.q7.InterfaceC2879f
                public final Object apply(Object obj) {
                    return new C1249u0((InterfaceC0975h) obj);
                }
            });
        }

        private b(Context context, ax.q7.u<ax.Y0.X> uVar, ax.q7.u<InterfaceC2209F.a> uVar2, ax.q7.u<AbstractC2451J> uVar3, ax.q7.u<InterfaceC0616o0> uVar4, ax.q7.u<ax.m1.e> uVar5, InterfaceC2879f<InterfaceC0975h, InterfaceC1200a> interfaceC2879f) {
            this.a = (Context) C0968a.e(context);
            this.d = uVar;
            this.e = uVar2;
            this.f = uVar3;
            this.g = uVar4;
            this.h = uVar5;
            this.i = interfaceC2879f;
            this.j = ax.S0.d0.X();
            this.m = C0894c.h;
            this.o = 0;
            this.s = 1;
            this.t = 0;
            this.u = true;
            this.v = ax.Y0.Z.g;
            this.x = 5000L;
            this.y = 15000L;
            this.z = 3000L;
            this.w = ax.Y0.Y.i;
            this.A = new C0603i.b().a();
            this.b = InterfaceC0975h.a;
            this.B = 500L;
            this.C = 2000L;
            this.E = true;
            this.I = HttpUrl.FRAGMENT_ENCODE_SET;
            this.k = -1000;
            this.K = new C0609l();
        }
    }
}
