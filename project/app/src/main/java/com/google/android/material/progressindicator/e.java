/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import ax.H6.i;
import ax.l6.a;
import ax.l6.c;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.j;

final class e
extends j<ObjectAnimator> {
    private static final TimeInterpolator k = ax.l6.a.b;
    private static final int[] l = new int[]{0, 1500, 3000, 4500};
    private static final float[] m = new float[]{0.1f, 0.87f};
    private static final Property<e, Float> n = new Property<e, Float>(Float.class, "animationFraction"){

        public Float a(e e8) {
            return Float.valueOf(e8.p());
        }

        public void b(e e8, Float f8) {
            e8.u(f8.floatValue());
        }
    };
    private static final Property<e, Float> o = new Property<e, Float>(Float.class, "completeEndFraction"){

        public Float a(e e8) {
            return Float.valueOf(e8.q());
        }

        public void b(e e8, Float f8) {
            e8.v(f8.floatValue());
        }
    };
    private ObjectAnimator c;
    private ObjectAnimator d;
    private final TimeInterpolator e;
    private final b f;
    private int g = 0;
    private float h;
    private float i;
    ax.w2.b j = null;

    public e(Context context, f f8) {
        super(1);
        this.f = f8;
        this.e = ax.H6.i.g(context, ax.k6.c.O, k);
    }

    static /* synthetic */ int j(e e8, int n8) {
        e8.g = n8;
        return n8;
    }

    private float p() {
        return this.h;
    }

    private float q() {
        return this.i;
    }

    private void r() {
        ObjectAnimator objectAnimator;
        if (this.c == null) {
            this.c = objectAnimator = ObjectAnimator.ofFloat((Object)this, n, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.f.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final e a;
                {
                    this.a = e8;
                }

                public void onAnimationRepeat(Animator object) {
                    super.onAnimationRepeat(object);
                    object = this.a;
                    com.google.android.material.progressindicator.e.j((e)object, (((e)object).g + l.length) % ((e)this.a).f.e.length);
                }
            });
        }
        if (this.d == null) {
            this.d = objectAnimator = ObjectAnimator.ofFloat((Object)this, o, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.f.n * 500.0f));
            this.d.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final e a;
                {
                    this.a = e8;
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

    private void s(int n8) {
        int[] nArray;
        for (int i8 = 0; i8 < (nArray = l).length; ++i8) {
            float f8 = this.b(n8, nArray[i8], 100);
            if (!(f8 >= 0.0f) || !(f8 <= 1.0f)) continue;
            n8 = this.g;
            nArray = this.f.e;
            int n9 = (i8 + n8) % nArray.length;
            i8 = nArray.length;
            n8 = nArray[n9];
            i8 = nArray[(n9 + 1) % i8];
            f8 = this.e.getInterpolation(f8);
            this.b.get((int)0).c = ax.l6.c.b().a(f8, n8, i8);
            return;
        }
    }

    private void v(float f8) {
        this.i = f8;
    }

    private void w() {
        this.r();
        this.c.setDuration((long)(this.f.n * 6000.0f));
        this.d.setDuration((long)(this.f.n * 500.0f));
    }

    private void x(int n8) {
        i.a a8 = this.b.get(0);
        float f8 = this.h;
        Object[] objectArray = l;
        int n9 = objectArray.length;
        float f9 = 0.0f;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = objectArray[i8];
            f9 += this.e.getInterpolation(this.b(n8, n10, 500)) * 90.0f;
        }
        a8.g = f8 * 1080.0f + f9;
        f9 = this.e.getInterpolation(this.b(n8, 0, 3000));
        f8 = this.e.getInterpolation(this.b(n8, 3000, 3000));
        a8.a = 0.0f;
        objectArray = m;
        a8.b = f9 = ax.G6.a.d(objectArray[0], objectArray[1], f9 - f8);
        f8 = this.i;
        if (f8 > 0.0f) {
            a8.b = f9 * (1.0f - f8);
        }
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
        this.w();
        this.t();
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
        this.r();
        this.t();
        this.c.start();
    }

    @Override
    public void h() {
        this.j = null;
    }

    void t() {
        this.g = 0;
        this.b.get((int)0).c = this.f.e[0];
        this.i = 0.0f;
    }

    void u(float f8) {
        this.h = f8;
        int n8 = (int)(f8 * 6000.0f);
        this.x(n8);
        this.s(n8);
        this.a.invalidateSelf();
    }
}

