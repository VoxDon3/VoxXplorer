package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import ax.k6.C2402c;
import ax.l6.C2472a;
import ax.u0.AbstractC3171i;
import ax.u0.C3173k;
import ax.u0.C3174l;
import ax.w2.AbstractC3330b;
import com.google.android.material.progressindicator.b;
import com.google.android.material.progressindicator.g;
import com.google.android.material.progressindicator.i;

/* loaded from: classes3.dex */
public final class g<S extends b> extends h {
    private static final AbstractC3171i<g<?>> C = new a("indicatorLevel");
    private TimeInterpolator A;
    private TimeInterpolator B;
    private i<S> r;
    private final C3174l s;
    private final C3173k t;
    private final i.a u;
    private float v;
    private boolean w;
    private final ValueAnimator x;
    private ValueAnimator y;
    private TimeInterpolator z;

    class a extends AbstractC3171i<g<?>> {
        a(String str) {
            super(str);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(g<?> gVar) {
            return gVar.E() * 10000.0f;
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(g<?> gVar, float f) {
            gVar.K(f / 10000.0f);
            gVar.G((int) f);
        }
    }

    g(Context context, final b bVar, i<S> iVar) {
        super(context, bVar);
        this.w = false;
        I(iVar);
        i.a aVar = new i.a();
        this.u = aVar;
        aVar.h = true;
        C3174l c3174l = new C3174l();
        this.s = c3174l;
        c3174l.f(1.0f);
        c3174l.h(50.0f);
        C3173k c3173k = new C3173k(this, C);
        this.t = c3173k;
        c3173k.q(c3174l);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.x = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ax.I6.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g.v(g.this, bVar, valueAnimator2);
            }
        });
        if (bVar.b(true) && bVar.m != 0) {
            valueAnimator.start();
        }
        p(1.0f);
    }

    static g<f> A(Context context, f fVar, c cVar) {
        return new g<>(context, fVar, cVar);
    }

    static g<o> B(Context context, o oVar, l lVar) {
        return new g<>(context, oVar, lVar);
    }

    private float C(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float E() {
        return this.u.b;
    }

    private void F() {
        if (this.y != null) {
            return;
        }
        Context context = this.a;
        int i = C2402c.O;
        TimeInterpolator timeInterpolator = C2472a.a;
        this.A = ax.H6.i.g(context, i, timeInterpolator);
        this.B = ax.H6.i.g(this.a, C2402c.K, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.y = valueAnimator;
        valueAnimator.setDuration(500L);
        this.y.setFloatValues(0.0f, 1.0f);
        this.y.setInterpolator(null);
        this.y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ax.I6.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g.this.u.e = r0.z.getInterpolation(r0.y.getAnimatedFraction());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i) {
        if (this.b.b(true)) {
            F();
            float C2 = C(i);
            if (C2 == this.v) {
                if (this.y.isRunning()) {
                    return;
                }
                H(C2);
                return;
            }
            if (this.y.isRunning()) {
                this.y.cancel();
            }
            this.v = C2;
            if (C2 == 1.0f) {
                this.z = this.A;
                this.y.start();
            } else {
                this.z = this.B;
                this.y.reverse();
            }
        }
    }

    private void H(float f) {
        this.u.e = f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(float f) {
        this.u.b = f;
        invalidateSelf();
    }

    public static /* synthetic */ void v(g gVar, b bVar, ValueAnimator valueAnimator) {
        gVar.getClass();
        if (bVar.b(true) && bVar.m != 0 && gVar.isVisible()) {
            gVar.invalidateSelf();
        }
    }

    i<S> D() {
        return this.r;
    }

    void I(i<S> iVar) {
        this.r = iVar;
    }

    void J(boolean z) {
        if (z && !this.x.isRunning()) {
            this.x.start();
        } else {
            if (z || !this.x.isRunning()) {
                return;
            }
            this.x.cancel();
        }
    }

    void L(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.p)) {
            canvas.save();
            this.r.h(canvas, getBounds(), h(), m(), l());
            this.u.f = i();
            this.n.setStyle(Paint.Style.FILL);
            this.n.setAntiAlias(true);
            i.a aVar = this.u;
            b bVar = this.b;
            aVar.c = bVar.e[0];
            int i = bVar.i;
            if (i > 0) {
                if (!(this.r instanceof l)) {
                    i = (int) ((i * ax.W.a.a(E(), 0.0f, 0.01f)) / 0.01f);
                }
                this.r.d(canvas, this.n, E(), 1.0f, this.b.f, getAlpha(), i);
            } else {
                this.r.d(canvas, this.n, 0.0f, 1.0f, bVar.f, getAlpha(), 0);
            }
            this.r.c(canvas, this.n, this.u, getAlpha());
            this.r.b(canvas, this.n, this.b.e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r.f();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.t.r();
        K(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ void o(AbstractC3330b abstractC3330b) {
        super.o(abstractC3330b);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        float C2 = C(i);
        if (!this.w) {
            this.t.i(E() * 10000.0f);
            this.t.m(i);
            return true;
        }
        this.t.r();
        K(i / 10000.0f);
        H(C2);
        return true;
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean s(boolean z, boolean z2, boolean z3) {
        return super.s(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.h
    boolean t(boolean z, boolean z2, boolean z3) {
        boolean t = super.t(z, z2, z3);
        float a2 = this.c.a(this.a.getContentResolver());
        if (a2 == 0.0f) {
            this.w = true;
            return t;
        }
        this.w = false;
        this.s.h(50.0f / a2);
        return t;
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean u(AbstractC3330b abstractC3330b) {
        return super.u(abstractC3330b);
    }
}
