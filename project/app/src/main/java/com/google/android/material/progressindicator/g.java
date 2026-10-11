/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ax.W.a;
import ax.u0.k;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.c;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.h;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.l;
import com.google.android.material.progressindicator.o;

public final class g<S extends b>
extends h {
    private static final ax.u0.i<g<?>> C = new ax.u0.i<g<?>>("indicatorLevel"){

        public float c(g<?> g8) {
            return ((g)g8).E() * 10000.0f;
        }

        public void d(g<?> g8, float f8) {
            ((g)g8).K(f8 / 10000.0f);
            ((g)g8).G((int)f8);
        }
    };
    private TimeInterpolator A;
    private TimeInterpolator B;
    private i<S> r;
    private final ax.u0.l s;
    private final k t;
    private final i.a u;
    private float v;
    private boolean w = false;
    private final ValueAnimator x;
    private ValueAnimator y;
    private TimeInterpolator z;

    g(Context object, b b8, i<S> object2) {
        super((Context)object, b8);
        this.I((i<S>)object2);
        object = new i.a();
        this.u = object;
        ((i.a)object).h = true;
        this.s = object2 = new ax.u0.l();
        ((ax.u0.l)object2).f(1.0f);
        ((ax.u0.l)object2).h(50.0f);
        object = new k(this, C);
        this.t = object;
        ((k)object).q((ax.u0.l)object2);
        object = new ValueAnimator();
        this.x = object;
        object.setDuration(1000L);
        object.setFloatValues(new float[]{0.0f, 1.0f});
        object.setRepeatCount(-1);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new ax.I6.b(this, b8));
        if (b8.b(true) && b8.m != 0) {
            object.start();
        }
        this.p(1.0f);
    }

    static g<f> A(Context context, f f8, c c8) {
        return new g<f>(context, f8, c8);
    }

    static g<o> B(Context context, o o8, l l8) {
        return new g<o>(context, o8, l8);
    }

    private float C(int n8) {
        float f8 = n8;
        if (f8 >= 1000.0f && f8 <= 9000.0f) {
            return 1.0f;
        }
        return 0.0f;
    }

    private float E() {
        return this.u.b;
    }

    private void F() {
        if (this.y != null) {
            return;
        }
        Context context = this.a;
        int n8 = ax.k6.c.O;
        TimeInterpolator timeInterpolator = ax.l6.a.a;
        this.A = ax.H6.i.g(context, n8, timeInterpolator);
        this.B = ax.H6.i.g(this.a, ax.k6.c.K, timeInterpolator);
        context = new ValueAnimator();
        this.y = context;
        context.setDuration(500L);
        this.y.setFloatValues(new float[]{0.0f, 1.0f});
        this.y.setInterpolator(null);
        this.y.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new ax.I6.c(this));
    }

    private void G(int n8) {
        if (this.b.b(true)) {
            this.F();
            float f8 = this.C(n8);
            if (f8 != this.v) {
                if (this.y.isRunning()) {
                    this.y.cancel();
                }
                this.v = f8;
                if (f8 == 1.0f) {
                    this.z = this.A;
                    this.y.start();
                    return;
                }
                this.z = this.B;
                this.y.reverse();
                return;
            }
            if (!this.y.isRunning()) {
                this.H(f8);
            }
        }
    }

    private void H(float f8) {
        this.u.e = f8;
        this.invalidateSelf();
    }

    private void K(float f8) {
        this.u.b = f8;
        this.invalidateSelf();
    }

    public static /* synthetic */ void v(g g8, b b8, ValueAnimator valueAnimator) {
        ((Object)((Object)g8)).getClass();
        if (b8.b(true) && b8.m != 0 && g8.isVisible()) {
            g8.invalidateSelf();
        }
    }

    public static /* synthetic */ void w(g g8, ValueAnimator valueAnimator) {
        g8.u.e = g8.z.getInterpolation(g8.y.getAnimatedFraction());
    }

    i<S> D() {
        return this.r;
    }

    void I(i<S> i8) {
        this.r = i8;
    }

    void J(boolean bl) {
        if (bl && !this.x.isRunning()) {
            this.x.start();
            return;
        }
        if (!bl && this.x.isRunning()) {
            this.x.cancel();
        }
    }

    void L(float f8) {
        this.setLevel((int)(f8 * 10000.0f));
    }

    public void draw(Canvas canvas) {
        if (!this.getBounds().isEmpty() && this.isVisible() && canvas.getClipBounds(this.p)) {
            canvas.save();
            this.r.h(canvas, this.getBounds(), this.h(), this.m(), this.l());
            this.u.f = this.i();
            this.n.setStyle(Paint.Style.FILL);
            this.n.setAntiAlias(true);
            i.a a8 = this.u;
            b b8 = this.b;
            a8.c = b8.e[0];
            int n8 = b8.i;
            if (n8 > 0) {
                if (!(this.r instanceof l)) {
                    n8 = (int)((float)n8 * ax.W.a.a(this.E(), 0.0f, 0.01f) / 0.01f);
                }
                this.r.d(canvas, this.n, this.E(), 1.0f, this.b.f, this.getAlpha(), n8);
            } else {
                this.r.d(canvas, this.n, 0.0f, 1.0f, b8.f, this.getAlpha(), 0);
            }
            this.r.c(canvas, this.n, this.u, this.getAlpha());
            this.r.b(canvas, this.n, this.b.e[0], this.getAlpha());
            canvas.restore();
        }
    }

    public int getIntrinsicHeight() {
        return this.r.e();
    }

    public int getIntrinsicWidth() {
        return this.r.f();
    }

    public void jumpToCurrentState() {
        this.t.r();
        this.K((float)this.getLevel() / 10000.0f);
    }

    protected boolean onLevelChange(int n8) {
        float f8 = this.C(n8);
        if (this.w) {
            this.t.r();
            this.K((float)n8 / 10000.0f);
            this.H(f8);
        } else {
            this.t.i(this.E() * 10000.0f);
            this.t.m(n8);
        }
        return true;
    }

    @Override
    boolean t(boolean bl, boolean bl2, boolean bl3) {
        bl = super.t(bl, bl2, bl3);
        float f8 = this.c.a(this.a.getContentResolver());
        if (f8 == 0.0f) {
            this.w = true;
            return bl;
        }
        this.w = false;
        this.s.h(50.0f / f8);
        return bl;
    }
}

