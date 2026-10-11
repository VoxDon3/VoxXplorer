package ax.o1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;

/* renamed from: ax.o1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2659D {
    private final C2670i a = new C2670i();
    private final b b;
    private final c c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    /* renamed from: ax.o1.D$a */
    private static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                C0987u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: ax.o1.D$c */
    private static final class c implements Choreographer.FrameCallback, Handler.Callback {
        private static final c g0 = new c();
        private final Handler c0;
        private final HandlerThread d0;
        private Choreographer e0;
        private int f0;
        public volatile long q = -9223372036854775807L;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.d0 = handlerThread;
            handlerThread.start();
            Handler z = d0.z(handlerThread.getLooper(), this);
            this.c0 = z;
            z.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int i = this.f0 + 1;
                this.f0 = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.e0 = Choreographer.getInstance();
            } catch (RuntimeException e) {
                C0987u.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public static c d() {
            return g0;
        }

        private void f() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int i = this.f0 - 1;
                this.f0 = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.q = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.c0.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.q = j;
            ((Choreographer) C0968a.e(this.e0)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.c0.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                c();
                return true;
            }
            if (i == 2) {
                b();
                return true;
            }
            if (i != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public C2659D(Context context) {
        b f = f(context);
        this.b = f;
        this.c = f != null ? c.d() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    private static boolean c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            C0987u.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    private void q() {
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        float b2 = this.a.e() ? this.a.b() : this.f;
        float f = this.g;
        if (b2 == f) {
            return;
        }
        if (b2 != -1.0f && f != -1.0f) {
            if (Math.abs(b2 - this.g) < ((!this.a.e() || this.a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b2 == -1.0f && this.a.c() < 30) {
            return;
        }
        this.g = b2;
        r(false);
    }

    private void r(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                a.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        a.a(surface, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L30
            ax.o1.i r0 = r10.a
            boolean r0 = r0.e()
            if (r0 == 0) goto L30
            ax.o1.i r0 = r10.a
            long r0 = r0.a()
            long r2 = r10.q
            long r4 = r10.m
            long r6 = r10.p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L2d
            r4 = r2
            goto L31
        L2d:
            r10.n()
        L30:
            r4 = r11
        L31:
            long r11 = r10.m
            r10.n = r11
            r10.o = r4
            ax.o1.D$c r11 = r10.c
            if (r11 == 0) goto L58
            long r0 = r10.k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            goto L58
        L47:
            long r6 = r11.q
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L4e
            goto L58
        L4e:
            long r8 = r10.k
            long r11 = e(r4, r6, r8)
            long r0 = r10.l
            long r11 = r11 - r0
            return r11
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o1.C2659D.b(long):long");
    }

    public void g(float f) {
        this.f = f;
        this.a.g();
        q();
    }

    public void h(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.f(j * 1000);
        q();
    }

    public void i(float f) {
        this.i = f;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.d = true;
        n();
        if (this.b != null) {
            ((c) C0968a.e(this.c)).a();
            this.b.b();
        }
        r(false);
    }

    public void l() {
        this.d = false;
        b bVar = this.b;
        if (bVar != null) {
            bVar.c();
            ((c) C0968a.e(this.c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.e == surface) {
            return;
        }
        d();
        this.e = surface;
        r(true);
    }

    public void o(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        r(true);
    }

    /* renamed from: ax.o1.D$b */
    private final class b implements DisplayManager.DisplayListener {
        private final DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        private Display a() {
            return this.a.getDisplay(0);
        }

        public void b() {
            this.a.registerDisplayListener(this, d0.A());
            C2659D.this.p(a());
        }

        public void c() {
            this.a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                C2659D.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
