/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import ax.c0.d0;

public abstract class a
implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    final a a = new a();
    private final Interpolator b = new AccelerateInterpolator();
    final View c;
    private Runnable d;
    private float[] e = new float[]{0.0f, 0.0f};
    private float[] f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int g;
    private int h;
    private float[] i = new float[]{0.0f, 0.0f};
    private float[] j = new float[]{0.0f, 0.0f};
    private float[] k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean l;
    boolean m;
    boolean n;
    boolean o;
    private boolean p;
    private boolean q;

    public a(View view) {
        this.c = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        int n8 = (int)(1575.0f * f8 + 0.5f);
        int n9 = (int)(f8 * 315.0f + 0.5f);
        f8 = n8;
        this.o(f8, f8);
        f8 = n9;
        this.p(f8, f8);
        this.l(1);
        this.n(Float.MAX_VALUE, Float.MAX_VALUE);
        this.s(0.2f, 0.2f);
        this.t(1.0f, 1.0f);
        this.k(r);
        this.r(500);
        this.q(500);
    }

    private float d(int n8, float f8, float f9, float f10) {
        float f11 = this.h(this.e[n8], f9, this.f[n8], f8);
        float f12 = f11 - 0.0f;
        float f13 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f13 == false) {
            return 0.0f;
        }
        float f14 = this.i[n8];
        f8 = this.j[n8];
        f9 = this.k[n8];
        f10 = f14 * f10;
        if (f13 > 0) {
            return ax.h0.a.e(f11 * f10, f8, f9);
        }
        return -ax.h0.a.e(-f11 * f10, f8, f9);
    }

    static float e(float f8, float f9, float f10) {
        if (f8 > f10) {
            return f10;
        }
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    static int f(int n8, int n9, int n10) {
        if (n8 > n10) {
            return n10;
        }
        if (n8 < n9) {
            return n9;
        }
        return n8;
    }

    private float g(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int n8 = this.g;
        if (n8 != 0 && n8 != 1) {
            if (n8 == 2 && f8 < 0.0f) {
                return f8 / -f9;
            }
        } else if (f8 < f9) {
            if (f8 >= 0.0f) {
                return 1.0f - f8 / f9;
            }
            if (this.o && n8 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private float h(float f8, float f9, float f10, float f11) {
        block4: {
            block3: {
                block2: {
                    f10 = ax.h0.a.e(f8 * f9, 0.0f, f10);
                    f8 = this.g(f11, f10);
                    f8 = this.g(f9 - f11, f10) - f8;
                    if (!(f8 < 0.0f)) break block2;
                    f8 = -this.b.getInterpolation(-f8);
                    break block3;
                }
                if (!(f8 > 0.0f)) break block4;
                f8 = this.b.getInterpolation(f8);
            }
            return ax.h0.a.e(f8, -1.0f, 1.0f);
        }
        return 0.0f;
    }

    private void i() {
        if (this.m) {
            this.o = false;
            return;
        }
        this.a.i();
    }

    private void v() {
        int n8;
        if (this.d == null) {
            this.d = new b(this);
        }
        this.o = true;
        this.m = true;
        if (!this.l && (n8 = this.h) > 0) {
            d0.e0(this.c, this.d, n8);
        } else {
            this.d.run();
        }
        this.l = true;
    }

    public abstract boolean a(int var1);

    public abstract boolean b(int var1);

    void c() {
        long l8 = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
        this.c.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    public abstract void j(int var1, int var2);

    public a k(int n8) {
        this.h = n8;
        return this;
    }

    public a l(int n8) {
        this.g = n8;
        return this;
    }

    public a m(boolean bl) {
        if (this.p && !bl) {
            this.i();
        }
        this.p = bl;
        return this;
    }

    public a n(float f8, float f9) {
        float[] fArray = this.f;
        fArray[0] = f8;
        fArray[1] = f9;
        return this;
    }

    public a o(float f8, float f9) {
        float[] fArray = this.k;
        fArray[0] = f8 / 1000.0f;
        fArray[1] = f9 / 1000.0f;
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        block7: {
            block6: {
                block4: {
                    block5: {
                        if (!this.p) {
                            return false;
                        }
                        int n8 = motionEvent.getActionMasked();
                        if (n8 == 0) break block4;
                        if (n8 == 1) break block5;
                        if (n8 == 2) break block6;
                        if (n8 != 3) break block7;
                    }
                    this.i();
                    break block7;
                }
                this.n = true;
                this.l = false;
            }
            float f8 = this.d(0, motionEvent.getX(), view.getWidth(), this.c.getWidth());
            float f9 = this.d(1, motionEvent.getY(), view.getHeight(), this.c.getHeight());
            this.a.l(f8, f9);
            if (!this.o && this.u()) {
                this.v();
            }
        }
        return this.q && this.o;
    }

    public a p(float f8, float f9) {
        float[] fArray = this.j;
        fArray[0] = f8 / 1000.0f;
        fArray[1] = f9 / 1000.0f;
        return this;
    }

    public a q(int n8) {
        this.a.j(n8);
        return this;
    }

    public a r(int n8) {
        this.a.k(n8);
        return this;
    }

    public a s(float f8, float f9) {
        float[] fArray = this.e;
        fArray[0] = f8;
        fArray[1] = f9;
        return this;
    }

    public a t(float f8, float f9) {
        float[] fArray = this.i;
        fArray[0] = f8 / 1000.0f;
        fArray[1] = f9 / 1000.0f;
        return this;
    }

    boolean u() {
        a a8 = this.a;
        int n8 = a8.f();
        int n9 = a8.d();
        return n8 != 0 && this.b(n8) || n9 != 0 && this.a(n9);
    }

    private static class a {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e = Long.MIN_VALUE;
        private long f = 0L;
        private int g = 0;
        private int h = 0;
        private long i = -1L;
        private float j;
        private int k;

        a() {
        }

        private float e(long l8) {
            long l9 = this.e;
            if (l8 < l9) {
                return 0.0f;
            }
            long l10 = this.i;
            if (l10 >= 0L && l8 >= l10) {
                float f8 = this.j;
                return 1.0f - f8 + f8 * ax.h0.a.e((float)(l8 - l10) / (float)this.k, 0.0f, 1.0f);
            }
            return ax.h0.a.e((float)(l8 - l9) / (float)this.a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f8) {
            return -4.0f * f8 * f8 + f8 * 4.0f;
        }

        public void a() {
            if (this.f != 0L) {
                long l8 = AnimationUtils.currentAnimationTimeMillis();
                float f8 = this.g(this.e(l8));
                long l9 = this.f;
                this.f = l8;
                f8 = (float)(l8 - l9) * f8;
                this.g = (int)(this.c * f8);
                this.h = (int)(f8 * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f8 = this.c;
            return (int)(f8 / Math.abs(f8));
        }

        public int f() {
            float f8 = this.d;
            return (int)(f8 / Math.abs(f8));
        }

        public boolean h() {
            return this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + (long)this.k;
        }

        public void i() {
            long l8 = AnimationUtils.currentAnimationTimeMillis();
            this.k = ax.h0.a.f((int)(l8 - this.e), 0, this.b);
            this.j = this.e(l8);
            this.i = l8;
        }

        public void j(int n8) {
            this.b = n8;
        }

        public void k(int n8) {
            this.a = n8;
        }

        public void l(float f8, float f9) {
            this.c = f8;
            this.d = f9;
        }

        public void m() {
            long l8;
            this.e = l8 = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1L;
            this.f = l8;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    private class b
    implements Runnable {
        final a q;

        b(a a8) {
            this.q = a8;
        }

        @Override
        public void run() {
            a a8;
            a a9 = this.q;
            if (!a9.o) {
                return;
            }
            if (a9.m) {
                a9.m = false;
                a9.a.m();
            }
            if (!(a8 = this.q.a).h() && this.q.u()) {
                a9 = this.q;
                if (a9.n) {
                    a9.n = false;
                    a9.c();
                }
                a8.a();
                int n8 = a8.b();
                int n9 = a8.c();
                this.q.j(n8, n9);
                d0.d0(this.q.c, this);
                return;
            }
            this.q.o = false;
        }
    }
}

