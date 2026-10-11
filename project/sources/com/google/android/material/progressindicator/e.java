package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import ax.k6.C2402c;
import ax.l6.C2472a;
import ax.w2.AbstractC3330b;
import com.google.android.material.progressindicator.i;

/* loaded from: classes3.dex */
final class e extends j<ObjectAnimator> {
    private static final TimeInterpolator k = C2472a.b;
    private static final int[] l = {0, 1500, 3000, 4500};
    private static final float[] m = {0.1f, 0.87f};
    private static final Property<e, Float> n = new c(Float.class, "animationFraction");
    private static final Property<e, Float> o = new d(Float.class, "completeEndFraction");
    private ObjectAnimator c;
    private ObjectAnimator d;
    private final TimeInterpolator e;
    private final com.google.android.material.progressindicator.b f;
    private int g;
    private float h;
    private float i;
    AbstractC3330b j;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.g = (eVar.g + e.l.length) % e.this.f.e.length;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            AbstractC3330b abstractC3330b = eVar.j;
            if (abstractC3330b != null) {
                abstractC3330b.b(eVar.a);
            }
        }
    }

    class c extends Property<e, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f) {
            eVar.u(f.floatValue());
        }
    }

    class d extends Property<e, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.q());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f) {
            eVar.v(f.floatValue());
        }
    }

    public e(Context context, f fVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = fVar;
        this.e = ax.H6.i.g(context, C2402c.O, k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q() {
        return this.i;
    }

    private void r() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (this.f.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (this.f.n * 500.0f));
            this.d.addListener(new b());
        }
    }

    private void s(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = l;
            if (i2 >= iArr.length) {
                return;
            }
            float b2 = b(i, iArr[i2], 100);
            if (b2 >= 0.0f && b2 <= 1.0f) {
                int i3 = i2 + this.g;
                int[] iArr2 = this.f.e;
                int length = i3 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i4 = iArr2[length];
                int i5 = iArr2[length2];
                float interpolation = this.e.getInterpolation(b2);
                this.b.get(0).c = ax.l6.c.b().evaluate(interpolation, Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(float f) {
        this.i = f;
    }

    private void w() {
        r();
        this.c.setDuration((long) (this.f.n * 6000.0f));
        this.d.setDuration((long) (this.f.n * 500.0f));
    }

    private void x(int i) {
        i.a aVar = this.b.get(0);
        float f = this.h * 1080.0f;
        float f2 = 0.0f;
        for (int i2 : l) {
            f2 += this.e.getInterpolation(b(i, i2, 500)) * 90.0f;
        }
        aVar.g = f + f2;
        float interpolation = this.e.getInterpolation(b(i, 0, 3000)) - this.e.getInterpolation(b(i, 3000, 3000));
        aVar.a = 0.0f;
        float[] fArr = m;
        float d2 = ax.G6.a.d(fArr[0], fArr[1], interpolation);
        aVar.b = d2;
        float f3 = this.i;
        if (f3 > 0.0f) {
            aVar.b = d2 * (1.0f - f3);
        }
    }

    @Override // com.google.android.material.progressindicator.j
    void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    public void c() {
        w();
        t();
    }

    @Override // com.google.android.material.progressindicator.j
    public void d(AbstractC3330b abstractC3330b) {
        this.j = abstractC3330b;
    }

    @Override // com.google.android.material.progressindicator.j
    void f() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.a.isVisible()) {
            this.d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.j
    void g() {
        r();
        t();
        this.c.start();
    }

    @Override // com.google.android.material.progressindicator.j
    public void h() {
        this.j = null;
    }

    void t() {
        this.g = 0;
        this.b.get(0).c = this.f.e[0];
        this.i = 0.0f;
    }

    void u(float f) {
        this.h = f;
        int i = (int) (f * 6000.0f);
        x(i);
        s(i);
        this.a.invalidateSelf();
    }
}
