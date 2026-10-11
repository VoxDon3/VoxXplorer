/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import ax.l6.c;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.j;

final class d
extends j<ObjectAnimator> {
    private static final int[] k = new int[]{0, 1350, 2700, 4050};
    private static final int[] l = new int[]{667, 2017, 3367, 4717};
    private static final int[] m = new int[]{1000, 2350, 3700, 5050};
    private static final Property<d, Float> n = new Property<d, Float>(Float.class, "animationFraction"){

        public Float a(d d8) {
            return Float.valueOf(d8.o());
        }

        public void b(d d8, Float f8) {
            d8.t(f8.floatValue());
        }
    };
    private static final Property<d, Float> o = new Property<d, Float>(Float.class, "completeEndFraction"){

        public Float a(d d8) {
            return Float.valueOf(d8.p());
        }

        public void b(d d8, Float f8) {
            d8.u(f8.floatValue());
        }
    };
    private ObjectAnimator c;
    private ObjectAnimator d;
    private final ax.D0.b e;
    private final b f;
    private int g = 0;
    private float h;
    private float i;
    ax.w2.b j = null;

    public d(f f8) {
        super(1);
        this.f = f8;
        this.e = new ax.D0.b();
    }

    static /* synthetic */ int j(d d8, int n8) {
        d8.g = n8;
        return n8;
    }

    private float o() {
        return this.h;
    }

    private float p() {
        return this.i;
    }

    private void q() {
        ObjectAnimator objectAnimator;
        if (this.c == null) {
            this.c = objectAnimator = ObjectAnimator.ofFloat((Object)this, n, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.f.n * 5400.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final d a;
                {
                    this.a = d8;
                }

                public void onAnimationRepeat(Animator object) {
                    super.onAnimationRepeat(object);
                    object = this.a;
                    com.google.android.material.progressindicator.d.j((d)object, (((d)object).g + 4) % ((d)this.a).f.e.length);
                }
            });
        }
        if (this.d == null) {
            this.d = objectAnimator = ObjectAnimator.ofFloat((Object)this, o, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.f.n * 333.0f));
            this.d.setInterpolator((TimeInterpolator)this.e);
            this.d.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final d a;
                {
                    this.a = d8;
                }

                public void onAnimationEnd(Animator object) {
                    super.onAnimationEnd(object);
                    this.a.a();
                    object = this.a;
                    ax.w2.b b8 = object.j;
                    if (b8 != null) {
                        b8.b(object.a);
                    }
                }
            });
        }
    }

    private void r(int n8) {
        for (int i8 = 0; i8 < 4; ++i8) {
            float f8 = this.b(n8, m[i8], 333);
            if (!(f8 > 0.0f) || !(f8 < 1.0f)) continue;
            n8 = this.g;
            int[] nArray = this.f.e;
            int n9 = (i8 + n8) % nArray.length;
            i8 = nArray.length;
            n8 = nArray[n9];
            i8 = nArray[(n9 + 1) % i8];
            f8 = this.e.getInterpolation(f8);
            this.b.get((int)0).c = ax.l6.c.b().a(f8, n8, i8);
            return;
        }
    }

    private void u(float f8) {
        this.i = f8;
    }

    private void v() {
        this.q();
        this.c.setDuration((long)(this.f.n * 5400.0f));
        this.d.setDuration((long)(this.f.n * 333.0f));
    }

    private void w(int n8) {
        Object object = this.b;
        object = object.get(0);
        float f8 = this.h;
        ((i.a)object).a = f8 * 1520.0f - 20.0f;
        ((i.a)object).b = f8 * 1520.0f;
        for (int i8 = 0; i8 < 4; ++i8) {
            f8 = this.b(n8, k[i8], 667);
            ((i.a)object).b += this.e.getInterpolation(f8) * 250.0f;
            f8 = this.b(n8, l[i8], 667);
            ((i.a)object).a += this.e.getInterpolation(f8) * 250.0f;
        }
        f8 = ((i.a)object).a;
        float f9 = ((i.a)object).b;
        ((i.a)object).a = (f8 + (f9 - f8) * this.i) / 360.0f;
        ((i.a)object).b = f9 / 360.0f;
    }

    @Override
    void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override
    public void c() {
        this.v();
        this.s();
    }

    @Override
    public void d(ax.w2.b b8) {
        this.j = b8;
    }

    @Override
    void f() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.a.isVisible()) {
                this.d.start();
                return;
            }
            this.a();
        }
    }

    @Override
    void g() {
        this.q();
        this.s();
        this.c.start();
    }

    @Override
    public void h() {
        this.j = null;
    }

    void s() {
        this.g = 0;
        this.b.get((int)0).c = this.f.e[0];
        this.i = 0.0f;
    }

    void t(float f8) {
        this.h = f8;
        int n8 = (int)(f8 * 5400.0f);
        this.w(n8);
        this.r(n8);
        this.a.invalidateSelf();
    }
}

