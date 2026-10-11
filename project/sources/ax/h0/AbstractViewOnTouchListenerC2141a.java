package ax.h0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import ax.c0.C1760d0;

/* renamed from: ax.h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2141a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    final View c;
    private Runnable d;
    private int g;
    private int h;
    private boolean l;
    boolean m;
    boolean n;
    boolean o;
    private boolean p;
    private boolean q;
    final C0323a a = new C0323a();
    private final Interpolator b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: ax.h0.a$a, reason: collision with other inner class name */
    private static class C0323a {
        private int a;
        private int b;
        private float c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        C0323a() {
        }

        private float e(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC2141a.e((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC2141a.e((j - j2) / this.k, 0.0f, 1.0f));
        }

        private float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g = g(e(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f;
            this.f = currentAnimationTimeMillis;
            float f = j * g;
            this.g = (int) (this.c * f);
            this.h = (int) (f * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = AbstractViewOnTouchListenerC2141a.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* renamed from: ax.h0.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC2141a abstractViewOnTouchListenerC2141a = AbstractViewOnTouchListenerC2141a.this;
            if (abstractViewOnTouchListenerC2141a.o) {
                if (abstractViewOnTouchListenerC2141a.m) {
                    abstractViewOnTouchListenerC2141a.m = false;
                    abstractViewOnTouchListenerC2141a.a.m();
                }
                C0323a c0323a = AbstractViewOnTouchListenerC2141a.this.a;
                if (c0323a.h() || !AbstractViewOnTouchListenerC2141a.this.u()) {
                    AbstractViewOnTouchListenerC2141a.this.o = false;
                    return;
                }
                AbstractViewOnTouchListenerC2141a abstractViewOnTouchListenerC2141a2 = AbstractViewOnTouchListenerC2141a.this;
                if (abstractViewOnTouchListenerC2141a2.n) {
                    abstractViewOnTouchListenerC2141a2.n = false;
                    abstractViewOnTouchListenerC2141a2.c();
                }
                c0323a.a();
                AbstractViewOnTouchListenerC2141a.this.j(c0323a.b(), c0323a.c());
                C1760d0.d0(AbstractViewOnTouchListenerC2141a.this.c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC2141a(View view) {
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(r);
        r(500);
        q(500);
    }

    private float d(int i, float f, float f2, float f3) {
        float h = h(this.e[i], f2, this.f[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.i[i];
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = f4 * f3;
        return h > 0.0f ? e(h * f7, f5, f6) : -e((-h) * f7, f5, f6);
    }

    static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    static int f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float e = e(f * f2, 0.0f, f3);
        float g = g(f2 - f4, e) - g(f4, e);
        if (g < 0.0f) {
            interpolation = -this.b.getInterpolation(-g);
        } else {
            if (g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(g);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.m) {
            this.o = false;
        } else {
            this.a.i();
        }
    }

    private void v() {
        int i;
        if (this.d == null) {
            this.d = new b();
        }
        this.o = true;
        this.m = true;
        if (this.l || (i = this.h) <= 0) {
            this.d.run();
        } else {
            C1760d0.e0(this.c, this.d, i);
        }
        this.l = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i, int i2);

    public AbstractViewOnTouchListenerC2141a k(int i) {
        this.h = i;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a l(int i) {
        this.g = i;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a m(boolean z) {
        if (this.p && !z) {
            i();
        }
        this.p = z;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a n(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a o(float f, float f2) {
        float[] fArr = this.k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.n = r2
            r5.l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            ax.h0.a$a r7 = r5.a
            r7.l(r0, r6)
            boolean r6 = r5.o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.q
            if (r6 == 0) goto L61
            boolean r6 = r5.o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.h0.AbstractViewOnTouchListenerC2141a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractViewOnTouchListenerC2141a p(float f, float f2) {
        float[] fArr = this.j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a q(int i) {
        this.a.j(i);
        return this;
    }

    public AbstractViewOnTouchListenerC2141a r(int i) {
        this.a.k(i);
        return this;
    }

    public AbstractViewOnTouchListenerC2141a s(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractViewOnTouchListenerC2141a t(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    boolean u() {
        C0323a c0323a = this.a;
        int f = c0323a.f();
        int d = c0323a.d();
        if (f == 0 || !b(f)) {
            return d != 0 && a(d);
        }
        return true;
    }
}
