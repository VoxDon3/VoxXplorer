/*
 * Decompiled with CFR 0.152.
 */
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
import ax.S0.d0;
import ax.S0.u;
import ax.o1.C;
import ax.o1.i;

public final class D {
    private final i a = new i();
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

    public D(Context object) {
        object = this.f((Context)object);
        this.b = object;
        object = object != null ? ax.o1.D$c.d() : null;
        this.c = object;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    private static boolean c(long l8, long l9) {
        return Math.abs(l8 - l9) <= 20000000L;
    }

    private void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            ax.o1.D$a.a(surface, 0.0f);
        }
    }

    private static long e(long l8, long l9, long l10) {
        long l11 = l9 + (l8 - l9) / l10 * l10;
        if (l8 <= l11) {
            l9 = l11 - l10;
        } else {
            l9 = l11;
            l11 = l10 + l11;
        }
        if (l11 - l8 < l8 - l9) {
            return l11;
        }
        return l9;
    }

    private b f(Context object) {
        Object var2_2 = null;
        if (object == null) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager)object.getSystemService("display");
        object = var2_2;
        if (displayManager != null) {
            object = new b(this, displayManager);
        }
        return object;
    }

    private void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    private void p(Display display) {
        if (display != null) {
            long l8;
            this.k = l8 = (long)(1.0E9 / (double)display.getRefreshRate());
            this.l = l8 * 80L / 100L;
            return;
        }
        u.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }

    private void q() {
        block5: {
            float f8;
            block7: {
                float f9;
                block6: {
                    float f10;
                    if (Build.VERSION.SDK_INT < 30 || this.e == null || (f8 = this.a.e() ? this.a.b() : this.f) == (f10 = this.g)) break block5;
                    float f11 = f8 - -1.0f;
                    f9 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (f9 == false || f10 == -1.0f) break block6;
                    f10 = this.a.e() && this.a.d() >= 5000000000L ? 0.02f : 1.0f;
                    if (!(Math.abs(f8 - this.g) >= f10)) {
                        return;
                    }
                    break block7;
                }
                if (f9 == false && this.a.c() < 30) break block5;
            }
            this.g = f8;
            this.r(false);
        }
    }

    private void r(boolean bl) {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            float f8;
            f8 = this.d && (f8 = this.g) != -1.0f ? (f8 *= this.i) : 0.0f;
            if (bl || this.h != f8) {
                this.h = f8;
                ax.o1.D$a.a(surface, f8);
            }
        }
    }

    public long b(long l8) {
        long l9;
        if (this.p != -1L && this.a.e()) {
            l9 = this.a.a();
            if (D.c(l8, l9 = this.q + (long)((float)(l9 * (this.m - this.p)) / this.i))) {
                l8 = l9;
            } else {
                this.n();
            }
        }
        this.n = this.m;
        this.o = l8;
        c c8 = this.c;
        if (c8 != null && this.k != -9223372036854775807L && (l9 = c8.q) != -9223372036854775807L) {
            return D.e(l8, l9, this.k) - this.l;
        }
        return l8;
    }

    public void g(float f8) {
        this.f = f8;
        this.a.g();
        this.q();
    }

    public void h(long l8) {
        long l9 = this.n;
        if (l9 != -1L) {
            this.p = l9;
            this.q = this.o;
        }
        ++this.m;
        this.a.f(l8 * 1000L);
        this.q();
    }

    public void i(float f8) {
        this.i = f8;
        this.n();
        this.r(false);
    }

    public void j() {
        this.n();
    }

    public void k() {
        this.d = true;
        this.n();
        if (this.b != null) {
            ax.S0.a.e(this.c).a();
            this.b.b();
        }
        this.r(false);
    }

    public void l() {
        this.d = false;
        b b8 = this.b;
        if (b8 != null) {
            b8.c();
            ax.S0.a.e(this.c).e();
        }
        this.d();
    }

    public void m(Surface surface) {
        if (this.e == surface) {
            return;
        }
        this.d();
        this.e = surface;
        this.r(true);
    }

    public void o(int n8) {
        if (this.j == n8) {
            return;
        }
        this.j = n8;
        this.r(true);
    }

    private static final class a {
        public static void a(Surface surface, float f8) {
            int n8 = f8 == 0.0f ? 0 : 1;
            try {
                C.a(surface, f8, n8);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", illegalStateException);
                return;
            }
        }
    }

    private final class b
    implements DisplayManager.DisplayListener {
        private final DisplayManager a;
        final D b;

        public b(D d8, DisplayManager displayManager) {
            this.b = d8;
            this.a = displayManager;
        }

        private Display a() {
            return this.a.getDisplay(0);
        }

        public void b() {
            this.a.registerDisplayListener((DisplayManager.DisplayListener)this, d0.A());
            this.b.p(this.a());
        }

        public void c() {
            this.a.unregisterDisplayListener((DisplayManager.DisplayListener)this);
        }

        public void onDisplayAdded(int n8) {
        }

        public void onDisplayChanged(int n8) {
            if (n8 == 0) {
                this.b.p(this.a());
            }
        }

        public void onDisplayRemoved(int n8) {
        }
    }

    private static final class c
    implements Choreographer.FrameCallback,
    Handler.Callback {
        private static final c g0 = new c();
        private final Handler c0;
        private final HandlerThread d0;
        private Choreographer e0;
        private int f0;
        public volatile long q = -9223372036854775807L;

        private c() {
            HandlerThread handlerThread;
            this.d0 = handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            handlerThread = ax.S0.d0.z(handlerThread.getLooper(), this);
            this.c0 = handlerThread;
            handlerThread.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int n8;
                this.f0 = n8 = this.f0 + 1;
                if (n8 == 1) {
                    choreographer.postFrameCallback((Choreographer.FrameCallback)this);
                }
            }
        }

        private void c() {
            try {
                this.e0 = Choreographer.getInstance();
                return;
            }
            catch (RuntimeException runtimeException) {
                u.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", runtimeException);
                return;
            }
        }

        public static c d() {
            return g0;
        }

        private void f() {
            Choreographer choreographer = this.e0;
            if (choreographer != null) {
                int n8;
                this.f0 = n8 = this.f0 - 1;
                if (n8 == 0) {
                    choreographer.removeFrameCallback((Choreographer.FrameCallback)this);
                    this.q = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.c0.sendEmptyMessage(2);
        }

        public void doFrame(long l8) {
            this.q = l8;
            ax.S0.a.e(this.e0).postFrameCallbackDelayed((Choreographer.FrameCallback)this, 500L);
        }

        public void e() {
            this.c0.sendEmptyMessage(3);
        }

        public boolean handleMessage(Message message) {
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return false;
                    }
                    this.f();
                    return true;
                }
                this.b();
                return true;
            }
            this.c();
            return true;
        }
    }
}

