/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import ax.W.a;
import ax.w2.f;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.j;
import com.google.android.material.progressindicator.o;
import java.util.Iterator;

final class n
extends j<ObjectAnimator> {
    private static final int[] k = new int[]{533, 567, 850, 750};
    private static final int[] l = new int[]{1267, 1000, 333, 0};
    private static final Property<n, Float> m = new Property<n, Float>(Float.class, "animationFraction"){

        public Float a(n n8) {
            return Float.valueOf(n8.n());
        }

        public void b(n n8, Float f8) {
            n8.r(f8.floatValue());
        }
    };
    private ObjectAnimator c;
    private ObjectAnimator d;
    private final Interpolator[] e;
    private final b f;
    private int g = 0;
    private boolean h;
    private float i;
    ax.w2.b j = null;

    public n(Context context, o o8) {
        super(2);
        this.f = o8;
        this.e = new Interpolator[]{ax.w2.f.a(context, ax.k6.a.a), ax.w2.f.a(context, ax.k6.a.b), ax.w2.f.a(context, ax.k6.a.c), ax.w2.f.a(context, ax.k6.a.d)};
    }

    static /* synthetic */ int j(n n8, int n9) {
        n8.g = n9;
        return n9;
    }

    static /* synthetic */ boolean l(n n8, boolean bl) {
        n8.h = bl;
        return bl;
    }

    private float n() {
        return this.i;
    }

    private void o() {
        ObjectAnimator objectAnimator;
        if (this.c == null) {
            this.c = objectAnimator = ObjectAnimator.ofFloat((Object)this, m, (float[])new float[]{0.0f, 1.0f});
            objectAnimator.setDuration((long)(this.f.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final n a;
                {
                    this.a = n8;
                }

                public void onAnimationRepeat(Animator object) {
                    super.onAnimationRepeat(object);
                    object = this.a;
                    n.j((n)object, (((n)object).g + 1) % ((n)this.a).f.e.length);
                    n.l(this.a, true);
                }
            });
        }
        if (this.d == null) {
            this.d = objectAnimator = ObjectAnimator.ofFloat((Object)this, m, (float[])new float[]{1.0f});
            objectAnimator.setDuration((long)(this.f.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
                final n a;
                {
                    this.a = n8;
                }

                public void onAnimationEnd(Animator object) {
                    super.onAnimationEnd((Animator)object);
                    this.a.a();
                    n n8 = this.a;
                    object = n8.j;
                    if (object != null) {
                        ((ax.w2.b)object).b(n8.a);
                    }
                }
            });
        }
    }

    private void p() {
        if (this.h) {
            Iterator<i.a> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().c = this.f.e[this.g];
            }
            this.h = false;
        }
    }

    private void s() {
        this.o();
        this.c.setDuration((long)(this.f.n * 1800.0f));
        this.d.setDuration((long)(this.f.n * 1800.0f));
    }

    private void t(int n8) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            i.a a8 = this.b.get(i8);
            int[] nArray = l;
            int n9 = i8 * 2;
            int n10 = nArray[n9];
            int[] nArray2 = k;
            float f8 = this.b(n8, n10, nArray2[n9]);
            a8.a = ax.W.a.a(this.e[n9].getInterpolation(f8), 0.0f, 1.0f);
            n10 = n9 + 1;
            f8 = this.b(n8, nArray[n10], nArray2[n10]);
            a8.b = ax.W.a.a(this.e[n10].getInterpolation(f8), 0.0f, 1.0f);
        }
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
        this.j = b8;
    }

    @Override
    public void f() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            this.a();
            if (this.a.isVisible()) {
                this.d.setFloatValues(new float[]{this.i, 1.0f});
                this.d.setDuration((long)((1.0f - this.i) * 1800.0f));
                this.d.start();
            }
        }
    }

    @Override
    public void g() {
        this.o();
        this.q();
        this.c.start();
    }

    @Override
    public void h() {
        this.j = null;
    }

    void q() {
        this.g = 0;
        Iterator<i.a> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().c = this.f.e[0];
        }
    }

    void r(float f8) {
        this.i = f8;
        this.t((int)(f8 * 1800.0f));
        this.p();
        this.a.invalidateSelf();
    }
}

