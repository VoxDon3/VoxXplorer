/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import ax.l6.a;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.g;
import java.util.ArrayList;
import java.util.List;

abstract class h
extends Drawable
implements Animatable {
    private static final Property<h, Float> q = new Property<h, Float>(Float.class, "growFraction"){

        public Float a(h h8) {
            return Float.valueOf(h8.h());
        }

        public void b(h h8, Float f8) {
            h8.p(f8.floatValue());
        }
    };
    final Context a;
    final b b;
    ax.I6.a c;
    private ValueAnimator d;
    private ValueAnimator e;
    private boolean f;
    private boolean g;
    private float h;
    private float i = -1.0f;
    private List<ax.w2.b> j;
    private ax.w2.b k;
    private boolean l;
    private float m;
    final Paint n = new Paint();
    private int o;
    Rect p;

    h(Context context, b b8) {
        this.a = context;
        this.b = b8;
        this.p = new Rect();
        this.c = new ax.I6.a();
        this.setAlpha(255);
    }

    private void d(ValueAnimator ... valueAnimatorArray) {
        boolean bl = this.l;
        this.l = true;
        int n8 = valueAnimatorArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            valueAnimatorArray[i8].cancel();
        }
        this.l = bl;
    }

    private void e() {
        Object object = this.k;
        if (object != null) {
            ((ax.w2.b)object).b(this);
        }
        if ((object = this.j) != null && !this.l) {
            object = object.iterator();
            while (object.hasNext()) {
                ((ax.w2.b)object.next()).b(this);
            }
        }
    }

    private void f() {
        Object object = this.k;
        if (object != null) {
            ((ax.w2.b)object).c(this);
        }
        if ((object = this.j) != null && !this.l) {
            object = object.iterator();
            while (object.hasNext()) {
                ((ax.w2.b)object.next()).c(this);
            }
        }
    }

    private void g(ValueAnimator ... valueAnimatorArray) {
        boolean bl = this.l;
        this.l = true;
        int n8 = valueAnimatorArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            valueAnimatorArray[i8].end();
        }
        this.l = bl;
    }

    private boolean k() {
        return this instanceof g;
    }

    private void n() {
        ObjectAnimator objectAnimator;
        if (this.d == null) {
            objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), q, (float[])new float[]{0.0f, 1.0f});
            this.d = objectAnimator;
            objectAnimator.setDuration(500L);
            this.d.setInterpolator(ax.l6.a.b);
            this.r(this.d);
        }
        if (this.e == null) {
            objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), q, (float[])new float[]{1.0f, 0.0f});
            this.e = objectAnimator;
            objectAnimator.setDuration(500L);
            this.e.setInterpolator(ax.l6.a.b);
            this.q(this.e);
        }
    }

    private void q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.e = valueAnimator;
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final h a;
            {
                this.a = h8;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                h.super.setVisible(false, false);
                this.a.e();
            }
        });
    }

    private void r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.d = valueAnimator;
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final h a;
            {
                this.a = h8;
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.a.f();
            }
        });
    }

    public int getAlpha() {
        return this.o;
    }

    public int getOpacity() {
        return -3;
    }

    float h() {
        if (!this.b.d() && !this.b.c()) {
            return 1.0f;
        }
        if (!this.g && !this.f) {
            return this.m;
        }
        return this.h;
    }

    float i() {
        float f8 = this.i;
        if (f8 > 0.0f) {
            return f8;
        }
        if (this.b.b(this.k()) && this.b.m != 0 && (f8 = this.c.a(this.a.getContentResolver())) > 0.0f) {
            float f9;
            int n8 = this.k() ? this.b.j : this.b.k;
            n8 = (int)((float)n8 * 1000.0f / (float)this.b.m * f8);
            f8 = f9 = (float)(SystemClock.uptimeMillis() % (long)n8) / (float)n8;
            if (f9 < 0.0f) {
                f8 = f9 % 1.0f + 1.0f;
            }
            return f8;
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return this.m() || this.l();
        {
        }
    }

    public boolean j() {
        return this.s(false, false, false);
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.e;
        return valueAnimator != null && valueAnimator.isRunning() || this.g;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.d;
        return valueAnimator != null && valueAnimator.isRunning() || this.f;
    }

    public void o(ax.w2.b b8) {
        if (this.j == null) {
            this.j = new ArrayList<ax.w2.b>();
        }
        if (!this.j.contains(b8)) {
            this.j.add(b8);
        }
    }

    void p(float f8) {
        if (this.m != f8) {
            this.m = f8;
            this.invalidateSelf();
        }
    }

    public boolean s(boolean bl, boolean bl2, boolean bl3) {
        float f8 = this.c.a(this.a.getContentResolver());
        bl3 = bl3 && f8 > 0.0f;
        return this.t(bl, bl2, bl3);
    }

    public void setAlpha(int n8) {
        this.o = n8;
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return this.s(bl, bl2, true);
    }

    public void start() {
        this.t(true, true, false);
    }

    public void stop() {
        this.t(false, true, false);
    }

    boolean t(boolean bl, boolean bl2, boolean bl3) {
        this.n();
        if (!this.isVisible() && !bl) {
            return false;
        }
        ValueAnimator valueAnimator = bl ? this.d : this.e;
        ValueAnimator valueAnimator2 = bl ? this.e : this.d;
        if (!bl3) {
            if (valueAnimator2.isRunning()) {
                this.d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                this.g(valueAnimator);
            }
            return super.setVisible(bl, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        bl3 = !bl || super.setVisible(bl, false);
        bl = bl ? this.b.d() : this.b.c();
        if (!bl) {
            this.g(valueAnimator);
            return bl3;
        }
        if (!bl2 && valueAnimator.isPaused()) {
            valueAnimator.resume();
            return bl3;
        }
        valueAnimator.start();
        return bl3;
    }

    public boolean u(ax.w2.b b8) {
        List<ax.w2.b> list = this.j;
        if (list != null && list.contains(b8)) {
            this.j.remove(b8);
            if (this.j.isEmpty()) {
                this.j = null;
            }
            return true;
        }
        return false;
    }
}

