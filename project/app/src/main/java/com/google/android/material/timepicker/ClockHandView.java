/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
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
import ax.k6.c;
import ax.k6.e;
import ax.k6.l;
import ax.k6.m;
import com.google.android.material.timepicker.a;
import java.util.ArrayList;
import java.util.List;

class ClockHandView
extends View {
    private final int a;
    private final TimeInterpolator b;
    private final ValueAnimator c = new ValueAnimator();
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private final int h;
    private boolean i;
    private final List<b> j = new ArrayList<b>();
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

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.y);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        Paint paint;
        this.m = paint = new Paint();
        this.n = new RectF();
        this.t = 1;
        attributeSet = context.obtainStyledAttributes(attributeSet, ax.k6.m.C1, n8, ax.k6.l.F);
        this.a = ax.H6.i.f(context, ax.k6.c.D, 200);
        this.b = ax.H6.i.g(context, ax.k6.c.M, ax.l6.a.b);
        this.s = attributeSet.getDimensionPixelSize(ax.k6.m.E1, 0);
        this.k = attributeSet.getDimensionPixelSize(ax.k6.m.F1, 0);
        Resources resources = this.getResources();
        this.o = resources.getDimensionPixelSize(ax.k6.e.D);
        this.l = resources.getDimensionPixelSize(ax.k6.e.B);
        n8 = attributeSet.getColor(ax.k6.m.D1, 0);
        paint.setAntiAlias(true);
        paint.setColor(n8);
        this.n(0.0f);
        this.h = ViewConfiguration.get((Context)context).getScaledTouchSlop();
        this.setImportantForAccessibility(2);
        attributeSet.recycle();
        this.l();
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        ((Object)((Object)clockHandView)).getClass();
        clockHandView.p(((Float)valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f8, float f9) {
        int n8 = this.getWidth();
        int n9 = 2;
        int n10 = n8 / 2;
        n8 = this.getHeight() / 2;
        if (!((f8 = ax.G6.a.b(n10, n8, f8, f9)) <= (float)(n8 = this.h(2)) + (f9 = z.c(this.getContext(), 12)))) {
            n9 = 1;
        }
        this.t = n9;
    }

    private void d(Canvas canvas) {
        int n8 = this.getHeight() / 2;
        int n9 = this.getWidth() / 2;
        int n10 = this.h(this.t);
        float f8 = n9;
        float f9 = n10;
        float f10 = (float)Math.cos(this.r);
        float f11 = n8;
        float f12 = (float)Math.sin(this.r);
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle(f10 * f9 + f8, f9 * f12 + f11, (float)this.k, this.m);
        double d8 = Math.sin(this.r);
        double d9 = Math.cos(this.r);
        double d10 = n10 - this.k;
        f9 = n9 + (int)(d9 * d10);
        f12 = n8 + (int)(d10 * d8);
        this.m.setStrokeWidth((float)this.o);
        canvas.drawLine(f8, f11, f9, f12, this.m);
        canvas.drawCircle(f8, f11, this.l, this.m);
    }

    private int f(float f8, float f9) {
        int n8 = this.getWidth() / 2;
        int n9 = this.getHeight() / 2;
        double d8 = f8 - (float)n8;
        if ((n8 = (n9 = (int)Math.toDegrees(Math.atan2(f9 - (float)n9, d8))) + 90) < 0) {
            return n9 + 450;
        }
        return n8;
    }

    private int h(int n8) {
        if (n8 == 2) {
            return Math.round((float)this.s * 0.66f);
        }
        return this.s;
    }

    private Pair<Float, Float> j(float f8) {
        float f9;
        float f10 = f9 = this.g();
        float f11 = f8;
        if (Math.abs(f9 - f8) > 180.0f) {
            float f12 = f8;
            if (f9 > 180.0f) {
                f12 = f8;
                if (f8 < 180.0f) {
                    f12 = f8 + 360.0f;
                }
            }
            f10 = f9;
            f11 = f12;
            if (f9 < 180.0f) {
                f10 = f9;
                f11 = f12;
                if (f12 > 180.0f) {
                    f10 = f9 + 360.0f;
                    f11 = f12;
                }
            }
        }
        return new Pair((Object)Float.valueOf(f10), (Object)Float.valueOf(f11));
    }

    private boolean k(float f8, float f9, boolean bl, boolean bl2, boolean bl3) {
        int n8 = this.f(f8, f9);
        f8 = this.g();
        f9 = n8;
        boolean bl4 = false;
        n8 = f8 != f9 ? 1 : 0;
        if (bl2 && n8 != 0) {
            return true;
        }
        if (n8 == 0 && !bl) {
            return false;
        }
        bl = bl4;
        if (bl3) {
            bl = bl4;
            if (this.d) {
                bl = true;
            }
        }
        this.o(f9, bl);
        return true;
    }

    private void l() {
        this.c.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new a(this));
        this.c.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final ClockHandView a;
            {
                this.a = clockHandView;
            }

            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    private void p(float f8, boolean bl) {
        this.p = f8 %= 360.0f;
        this.r = Math.toRadians(f8 - 90.0f);
        int n8 = this.getHeight() / 2;
        int n9 = this.getWidth() / 2;
        int n10 = this.h(this.t);
        float f9 = n9;
        float f10 = n10;
        f9 += (float)Math.cos(this.r) * f10;
        f10 = (float)n8 + f10 * (float)Math.sin(this.r);
        Object object = this.n;
        n9 = this.k;
        object.set(f9 - (float)n9, f10 - (float)n9, f9 + (float)n9, f10 + (float)n9);
        object = this.j.iterator();
        while (object.hasNext()) {
            ((b)object.next()).a(f8, bl);
        }
        this.invalidate();
    }

    public void b(b b8) {
        this.j.add(b8);
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

    public void m(int n8) {
        this.s = n8;
        this.invalidate();
    }

    public void n(float f8) {
        this.o(f8, false);
    }

    public void o(float f8, boolean bl) {
        this.c.cancel();
        if (!bl) {
            this.p(f8, false);
            return;
        }
        Pair<Float, Float> pair = this.j(f8);
        this.c.setFloatValues(new float[]{((Float)pair.first).floatValue(), ((Float)pair.second).floatValue()});
        this.c.setDuration((long)this.a);
        this.c.setInterpolator(this.b);
        this.c.start();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d(canvas);
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (!this.c.isRunning()) {
            this.n(this.g());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @SuppressLint(value={"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        float f8;
        float f9;
        block4: {
            block3: {
                block1: {
                    int n8;
                    block2: {
                        n8 = motionEvent.getActionMasked();
                        f9 = motionEvent.getX();
                        f8 = motionEvent.getY();
                        if (n8 == 0) break block1;
                        if (n8 == 1 || n8 == 2) break block2;
                        bl3 = false;
                        break block3;
                    }
                    int n9 = (int)(f9 - this.e);
                    int n10 = (int)(f8 - this.f);
                    bl3 = n9 * n9 + n10 * n10 > this.h;
                    this.g = bl3;
                    bl2 = this.q;
                    bl3 = n8 == 1;
                    if (this.i) {
                        this.c(f9, f8);
                    }
                    bl = bl3;
                    bl3 = false;
                    break block4;
                }
                this.e = f9;
                this.f = f8;
                this.g = true;
                this.q = false;
                bl3 = true;
            }
            bl2 = false;
            bl = false;
        }
        this.q |= this.k(f9, f8, bl2, bl3, bl);
        return true;
    }

    void q(boolean bl) {
        if (this.i && !bl) {
            this.t = 1;
        }
        this.i = bl;
        this.invalidate();
    }

    public static interface b {
        public void a(float var1, boolean var2);
    }
}

