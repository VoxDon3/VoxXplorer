/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.j;
import com.google.android.material.progressindicator.o;

final class m
extends j<ObjectAnimator> {
    private static final Property<m, Float> i = new Property<m, Float>(Float.class, "animationFraction"){

        public Float a(m m8) {
            return Float.valueOf(m8.n());
        }

        public void b(m m8, Float f8) {
            m8.r(f8.floatValue());
        }
    };
    private ObjectAnimator c;
    private ax.D0.b d;
    private final b e;
    private int f = 1;
    private boolean g;
    private float h;

    public m(o o8) {
        super(3);
        this.e = o8;
        this.d = new ax.D0.b();
    }

    static /* synthetic */ int j(m m8, int n8) {
        m8.f = n8;
        return n8;
    }

    static /* synthetic */ boolean l(m m8, boolean bl) {
        m8.g = bl;
        return bl;
    }

    private float n() {
        return this.h;
    }

    private void o() {
        if (this.c == null) {
            ObjectAnimator objectAnimator;
            this.c = objectAnimator = ObjectAnimator.ofFloat((Object)this, i, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final m a;
                {
                    this.a = m8;
                }

                public void onAnimationRepeat(Animator object) {
                    super.onAnimationRepeat(object);
                    object = this.a;
                    m.j((m)object, (((m)object).f + 1) % ((m)this.a).e.e.length);
                    m.l(this.a, true);
                }
            });
        }
    }

    private void p() {
        if (this.g && this.b.get((int)1).b < 1.0f) {
            this.b.get((int)2).c = this.b.get((int)1).c;
            this.b.get((int)1).c = this.b.get((int)0).c;
            this.b.get((int)0).c = this.e.e[this.f];
            this.g = false;
        }
    }

    private void s() {
        this.o();
        this.c.setDuration((long)(this.e.n * 333.0f));
    }

    private void t(int n8) {
        float f8;
        this.b.get((int)0).a = 0.0f;
        float f9 = this.b(n8, 0, 667);
        i.a a8 = this.b.get(0);
        i.a a9 = this.b.get(1);
        a9.a = f8 = this.d.getInterpolation(f9);
        a8.b = f8;
        a9 = this.b.get(1);
        a8 = this.b.get(2);
        a8.a = f8 = this.d.getInterpolation(f9 + 0.49925038f);
        a9.b = f8;
        this.b.get((int)2).b = 1.0f;
    }

    @Override
    public void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override
    public void c() {
        this.s();
        this.q();
    }

    @Override
    public void d(ax.w2.b b8) {
    }

    @Override
    public void f() {
    }

    @Override
    public void g() {
        this.o();
        this.q();
        this.c.start();
    }

    @Override
    public void h() {
    }

    void q() {
        this.g = true;
        this.f = 1;
        for (i.a a8 : this.b) {
            b b8 = this.e;
            a8.c = b8.e[0];
            a8.d = b8.i / 2;
        }
    }

    void r(float f8) {
        this.h = f8;
        this.t((int)(f8 * 333.0f));
        this.p();
        this.a.invalidateSelf();
    }
}

