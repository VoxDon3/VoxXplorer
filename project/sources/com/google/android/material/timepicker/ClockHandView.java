package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ax.F6.z;
import ax.H6.i;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.l;
import ax.k6.m;
import ax.l6.C2472a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class ClockHandView extends View {
    private final int a;
    private final TimeInterpolator b;
    private final ValueAnimator c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private final int h;
    private boolean i;
    private final List<b> j;
    private final int k;
    private final float l;
    private final Paint m;
    private final RectF n;
    private final int o;
    private float p;
    private boolean q;
    private double r;
    private int s;
    private int t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.y);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f, float f2) {
        this.t = ax.G6.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) h(2)) + z.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float h = h(this.t);
        float cos = (((float) Math.cos(this.r)) * h) + f;
        float f2 = height;
        float sin = (h * ((float) Math.sin(this.r))) + f2;
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.k, this.m);
        double sin2 = Math.sin(this.r);
        double cos2 = Math.cos(this.r);
        this.m.setStrokeWidth(this.o);
        canvas.drawLine(f, f2, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.m);
        canvas.drawCircle(f, f2, this.l, this.m);
    }

    private int f(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    private int h(int i) {
        return i == 2 ? Math.round(this.s * 0.66f) : this.s;
    }

    private Pair<Float, Float> j(float f) {
        float g = g();
        if (Math.abs(g - f) > 180.0f) {
            if (g > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (g < 180.0f && f > 180.0f) {
                g += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(g), Float.valueOf(f));
    }

    private boolean k(float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = f(f, f2);
        boolean z4 = false;
        boolean z5 = g() != f3;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.d) {
            z4 = true;
        }
        o(f3, z4);
        return true;
    }

    private void l() {
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(ClockHandView.this, valueAnimator);
            }
        });
        this.c.addListener(new a());
    }

    private void p(float f, boolean z) {
        float f2 = f % 360.0f;
        this.p = f2;
        this.r = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h = h(this.t);
        float cos = width + (((float) Math.cos(this.r)) * h);
        float sin = height + (h * ((float) Math.sin(this.r)));
        RectF rectF = this.n;
        int i = this.k;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        Iterator<b> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().a(f2, z);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.j.add(bVar);
    }

    public RectF e() {
        return this.n;
    }

    public float g() {
        return this.p;
    }

    public int i() {
        return this.k;
    }

    public void m(int i) {
        this.s = i;
        invalidate();
    }

    public void n(float f) {
        o(f, false);
    }

    public void o(float f, boolean z) {
        this.c.cancel();
        if (!z) {
            p(f, false);
            return;
        }
        Pair<Float, Float> j = j(f);
        this.c.setFloatValues(((Float) j.first).floatValue(), ((Float) j.second).floatValue());
        this.c.setDuration(this.a);
        this.c.setInterpolator(this.b);
        this.c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.e = x;
            this.f = y;
            this.g = true;
            this.q = false;
            z = false;
            z2 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.e);
                int i2 = (int) (y - this.f);
                this.g = (i * i) + (i2 * i2) > this.h;
                z = this.q;
                boolean z4 = actionMasked == 1;
                if (this.i) {
                    c(x, y);
                }
                z3 = z4;
                z2 = false;
                this.q |= k(x, y, z, z2, z3);
                return true;
            }
            z = false;
            z2 = false;
        }
        z3 = false;
        this.q |= k(x, y, z, z2, z3);
        return true;
    }

    void q(boolean z) {
        if (this.i && !z) {
            this.t = 1;
        }
        this.i = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.n = new RectF();
        this.t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.C1, i, l.F);
        this.a = i.f(context, C2402c.D, 200);
        this.b = i.g(context, C2402c.M, C2472a.b);
        this.s = obtainStyledAttributes.getDimensionPixelSize(m.E1, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(m.F1, 0);
        this.o = getResources().getDimensionPixelSize(C2404e.D);
        this.l = r7.getDimensionPixelSize(C2404e.B);
        int color = obtainStyledAttributes.getColor(m.D1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        l();
    }
}
