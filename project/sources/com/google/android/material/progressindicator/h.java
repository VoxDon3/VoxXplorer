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
import ax.l6.C2472a;
import ax.w2.AbstractC3330b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
abstract class h extends Drawable implements Animatable {
    private static final Property<h, Float> q = new c(Float.class, "growFraction");
    final Context a;
    final com.google.android.material.progressindicator.b b;
    private ValueAnimator d;
    private ValueAnimator e;
    private boolean f;
    private boolean g;
    private float h;
    private List<AbstractC3330b> j;
    private AbstractC3330b k;
    private boolean l;
    private float m;
    private int o;
    private float i = -1.0f;
    final Paint n = new Paint();
    Rect p = new Rect();
    ax.I6.a c = new ax.I6.a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            h.this.f();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h.super.setVisible(false, false);
            h.this.e();
        }
    }

    class c extends Property<h, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(h hVar) {
            return Float.valueOf(hVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(h hVar, Float f) {
            hVar.p(f.floatValue());
        }
    }

    h(Context context, com.google.android.material.progressindicator.b bVar) {
        this.a = context;
        this.b = bVar;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        AbstractC3330b abstractC3330b = this.k;
        if (abstractC3330b != null) {
            abstractC3330b.b(this);
        }
        List<AbstractC3330b> list = this.j;
        if (list == null || this.l) {
            return;
        }
        Iterator<AbstractC3330b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        AbstractC3330b abstractC3330b = this.k;
        if (abstractC3330b != null) {
            abstractC3330b.c(this);
        }
        List<AbstractC3330b> list = this.j;
        if (list == null || this.l) {
            return;
        }
        Iterator<AbstractC3330b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.l = z;
    }

    private boolean k() {
        return this instanceof g;
    }

    private void n() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, q, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(500L);
            this.d.setInterpolator(C2472a.b);
            r(this.d);
        }
        if (this.e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, q, 1.0f, 0.0f);
            this.e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.e.setInterpolator(C2472a.b);
            q(this.e);
        }
    }

    private void q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.b.d() || this.b.c()) {
            return (this.g || this.f) ? this.h : this.m;
        }
        return 1.0f;
    }

    float i() {
        float f = this.i;
        if (f > 0.0f) {
            return f;
        }
        if (this.b.b(k()) && this.b.m != 0) {
            float a2 = this.c.a(this.a.getContentResolver());
            if (a2 > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((k() ? this.b.j : this.b.k) * 1000.0f) / this.b.m) * a2));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return m() || l();
    }

    public boolean j() {
        return s(false, false, false);
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.g;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f;
    }

    public void o(AbstractC3330b abstractC3330b) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (this.j.contains(abstractC3330b)) {
            return;
        }
        this.j.add(abstractC3330b);
    }

    void p(float f) {
        if (this.m != f) {
            this.m = f;
            invalidateSelf();
        }
    }

    public boolean s(boolean z, boolean z2, boolean z3) {
        return t(z, z2, z3 && this.c.a(this.a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return s(z, z2, true);
    }

    public void start() {
        t(true, true, false);
    }

    public void stop() {
        t(false, true, false);
    }

    boolean t(boolean z, boolean z2, boolean z3) {
        n();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.d : this.e;
        ValueAnimator valueAnimator2 = z ? this.e : this.d;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.b.d() : this.b.c())) {
            g(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z4;
        }
        valueAnimator.resume();
        return z4;
    }

    public boolean u(AbstractC3330b abstractC3330b) {
        List<AbstractC3330b> list = this.j;
        if (list == null || !list.contains(abstractC3330b)) {
            return false;
        }
        this.j.remove(abstractC3330b);
        if (!this.j.isEmpty()) {
            return true;
        }
        this.j = null;
        return true;
    }
}
