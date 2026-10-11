/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import ax.B.k;
import ax.u0.a;
import ax.u0.g;
import ax.u0.j;
import java.util.ArrayList;

public class c {
    private static final ThreadLocal<c> j = new ThreadLocal();
    private final k<c, Long> a = new k();
    final ArrayList<c> b = new ArrayList();
    private final b c = new b(this);
    private final Runnable d = new ax.u0.b(this);
    private j e;
    long f = 0L;
    private boolean g = false;
    public float h = 1.0f;
    public e i;

    public c(j j8) {
        this.e = j8;
    }

    public static /* synthetic */ void a(c c8) {
        c8.c.a();
    }

    private void e() {
        if (this.g) {
            for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
                if (this.b.get(i8) != null) continue;
                this.b.remove(i8);
            }
            if (this.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.i.b();
            }
            this.g = false;
        }
    }

    static c h() {
        ThreadLocal<c> threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new f()));
        }
        return threadLocal.get();
    }

    private boolean i(c c8, long l8) {
        Long l9 = this.a.get(c8);
        if (l9 == null) {
            return true;
        }
        if (l9 < l8) {
            this.a.remove(c8);
            return true;
        }
        return false;
    }

    void d(c c8, long l8) {
        if (this.b.size() == 0) {
            this.e.a(this.d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.h = ax.u0.a.a();
                if (this.i == null) {
                    this.i = new d(this);
                }
                this.i.a();
            }
        }
        if (!this.b.contains(c8)) {
            this.b.add(c8);
        }
        if (l8 > 0L) {
            this.a.put(c8, SystemClock.uptimeMillis() + l8);
        }
    }

    void f(long l8) {
        long l9 = SystemClock.uptimeMillis();
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            c c8 = this.b.get(i8);
            if (c8 == null || !this.i(c8, l9)) continue;
            c8.a(l8);
        }
        this.e();
    }

    public float g() {
        return this.h;
    }

    boolean j() {
        return this.e.b();
    }

    void k(c c8) {
        this.a.remove(c8);
        int n8 = this.b.indexOf(c8);
        if (n8 >= 0) {
            this.b.set(n8, null);
            this.g = true;
        }
    }

    private class b {
        final c a;

        private b(c c8) {
            this.a = c8;
        }

        void a() {
            this.a.f = SystemClock.uptimeMillis();
            c c8 = this.a;
            c8.f(c8.f);
            if (this.a.b.size() > 0) {
                this.a.e.a(this.a.d);
            }
        }
    }

    static interface c {
        public boolean a(long var1);
    }

    public class d
    implements e {
        ValueAnimator.DurationScaleChangeListener a;
        final c b;

        public d(c c8) {
            this.b = c8;
        }

        public static /* synthetic */ void c(d d8, float f8) {
            d8.b.h = f8;
        }

        @Override
        public boolean a() {
            if (this.a == null) {
                ax.u0.f f8 = new ax.u0.f(this);
                this.a = f8;
                return ax.u0.e.a(f8);
            }
            return true;
        }

        @Override
        public boolean b() {
            boolean bl = ax.u0.d.a(this.a);
            this.a = null;
            return bl;
        }
    }

    public static interface e {
        public boolean a();

        public boolean b();
    }

    static final class f
    implements j {
        private final Choreographer a = Choreographer.getInstance();
        private final Looper b = Looper.myLooper();

        f() {
        }

        public static /* synthetic */ void c(Runnable runnable2, long l8) {
            runnable2.run();
        }

        @Override
        public void a(Runnable runnable2) {
            this.a.postFrameCallback((Choreographer.FrameCallback)new g(runnable2));
        }

        @Override
        public boolean b() {
            return Thread.currentThread() == this.b.getThread();
        }
    }
}

